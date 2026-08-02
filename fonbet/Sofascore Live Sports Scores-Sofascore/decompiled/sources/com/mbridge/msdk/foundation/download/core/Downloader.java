package com.mbridge.msdk.foundation.download.core;

import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResponse;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import defpackage.dmi;
import defpackage.fc6;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class Downloader implements Runnable {
    private static final String TAG = "DownloadTask";
    private IDatabaseHelper databaseHelper;
    private volatile DownloadMessage downloadMessage;
    public final DownloadPriority downloadPriority;
    public volatile DownloadRequest downloadRequest;
    public final int sequence;

    public Downloader(DownloadRequest downloadRequest) {
        this.downloadRequest = downloadRequest;
        this.downloadPriority = downloadRequest.getDownloadPriority();
        this.sequence = downloadRequest.getSequence();
    }

    @Override // java.lang.Runnable
    public void run() {
        GlobalComponent.getInstance().getLogger().log("DownloadTask", "开始下载任务");
        if (this.downloadRequest.getStatus() != DownloadStatus.RETRY) {
            this.downloadRequest.handlerStartEvent(this.downloadRequest.getDownloadMessage());
        }
        this.downloadRequest.setStatus(DownloadStatus.RUNNING);
        GlobalComponent.getInstance().getLogger().log("DownloadTask", "任务 " + this.downloadRequest.getDownloadId() + " 修改状态为 RUNNING");
        this.downloadMessage = this.downloadRequest.getDownloadMessage();
        this.databaseHelper = GlobalComponent.getInstance().getDatabaseHelper();
        SynchronizeAvailableDirectorPath.create(this.downloadRequest).run();
        String cacheDirectoryPath = this.downloadRequest.getCacheDirectoryPath();
        int cacheDirectorPathType = this.downloadRequest.getCacheDirectorPathType();
        DownloadMessage downloadMessage = this.downloadMessage;
        StringBuilder q = fc6.q(cacheDirectoryPath);
        q.append(this.downloadMessage.getSaveFileName());
        downloadMessage.setSaveFilePath(q.toString());
        GlobalComponent.getInstance().getLogger().log("DownloadTask", dmi.l(cacheDirectorPathType, "cacheDirectoryPath： ", cacheDirectoryPath, " cacheDirectorPathType： "));
        DownloadResponse run = DownloadTask.create(this.downloadRequest, this.downloadMessage, this.databaseHelper).run();
        if (run.isSuccessful()) {
            if (run.getFrom() == 1) {
                this.downloadMessage.setFrom(1);
            }
            this.downloadRequest.handlerSuccessEvent(this.downloadMessage);
        } else if (run.getError() != null) {
            this.downloadRequest.handlerErrorEvent(this.downloadMessage, run.getError());
        } else if (run.isCancelled()) {
            this.downloadRequest.handlerCancelEvent(this.downloadMessage);
        }
    }
}

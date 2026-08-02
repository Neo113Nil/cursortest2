package com.mbridge.msdk.foundation.download.core;

import com.mbridge.msdk.foundation.download.DownloadPriority;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class DownloadFutureTask extends FutureTask<Downloader> implements Comparable<DownloadFutureTask> {
    private final Downloader downloader;

    public DownloadFutureTask(Downloader downloader) {
        super(downloader, null);
        this.downloader = downloader;
    }

    @Override // java.lang.Comparable
    public int compareTo(DownloadFutureTask downloadFutureTask) {
        int ordinal;
        int ordinal2;
        Downloader downloader = this.downloader;
        DownloadPriority downloadPriority = downloader.downloadPriority;
        Downloader downloader2 = downloadFutureTask.downloader;
        DownloadPriority downloadPriority2 = downloader2.downloadPriority;
        if (downloadPriority == downloadPriority2) {
            ordinal = downloader.sequence;
            ordinal2 = downloader2.sequence;
        } else {
            ordinal = downloadPriority2.ordinal();
            ordinal2 = downloadPriority.ordinal();
        }
        return ordinal - ordinal2;
    }
}

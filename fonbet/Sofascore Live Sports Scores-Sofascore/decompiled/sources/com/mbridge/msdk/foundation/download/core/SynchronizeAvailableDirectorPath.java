package com.mbridge.msdk.foundation.download.core;

import android.os.Build;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.DownloadResponse;
import defpackage.cp4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
class SynchronizeAvailableDirectorPath implements IDownloadTask {
    private int cacheDirectorPathType;
    private String cacheDirectoryPath;
    private String cacheDirectoryPathExternal;
    private String cacheDirectoryPathInternal;
    private DownloadRequest downloadRequest;

    public SynchronizeAvailableDirectorPath(DownloadRequest downloadRequest) {
        this.downloadRequest = downloadRequest;
    }

    public static IDownloadTask create(DownloadRequest downloadRequest) {
        return new SynchronizeAvailableDirectorPath(downloadRequest);
    }

    @Override // com.mbridge.msdk.foundation.download.core.IDownloadTask
    public DownloadResponse run() {
        String str;
        this.cacheDirectoryPathExternal = this.downloadRequest.getDirectoryPathExternal();
        String directoryPathInternal = this.downloadRequest.getDirectoryPathInternal();
        this.cacheDirectoryPathInternal = directoryPathInternal;
        if (TextUtils.isEmpty(directoryPathInternal)) {
            cp4.h("必须指定 cacheDirectoryPathInternal");
            return null;
        }
        try {
            try {
                if (TextUtils.isEmpty(this.cacheDirectoryPathExternal)) {
                    str = this.cacheDirectoryPathInternal;
                    this.cacheDirectoryPath = str;
                    this.cacheDirectorPathType = 0;
                } else if (Build.VERSION.SDK_INT > 28) {
                    str = this.cacheDirectoryPathInternal;
                    this.cacheDirectoryPath = str;
                    this.cacheDirectorPathType = 0;
                } else {
                    GlobalComponent.getInstance().getContext();
                    str = this.cacheDirectoryPathInternal;
                    this.cacheDirectoryPath = str;
                    this.cacheDirectorPathType = 0;
                }
                this.downloadRequest.setCacheDirectoryPath(str);
                this.downloadRequest.setCacheDirectorPathType(this.cacheDirectorPathType);
                return null;
            } catch (Exception unused) {
                String str2 = this.cacheDirectoryPathInternal;
                this.cacheDirectoryPath = str2;
                this.cacheDirectorPathType = 0;
                this.downloadRequest.setCacheDirectoryPath(str2);
                this.downloadRequest.setCacheDirectorPathType(this.cacheDirectorPathType);
                return null;
            }
        } catch (Throwable th) {
            this.downloadRequest.setCacheDirectoryPath(this.cacheDirectoryPath);
            this.downloadRequest.setCacheDirectorPathType(this.cacheDirectorPathType);
            throw th;
        }
    }
}

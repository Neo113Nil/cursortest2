package com.mbridge.msdk.foundation.download;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public enum DownloadResourceType {
    DOWNLOAD_RESOURCE_TYPE_VIDEO(0),
    DOWNLOAD_RESOURCE_TYPE_ZIP(1),
    DOWNLOAD_RESOURCE_TYPE_IMAGE(2),
    DOWNLOAD_RESOURCE_TYPE_HTML(3),
    DOWNLOAD_RESOURCE_TYPE_OTHER(4),
    DOWNLOAD_RESOURCE_TYPE_APK(5);

    public int resourceType;

    DownloadResourceType(int i) {
        this.resourceType = i;
    }

    public static DownloadResourceType getDownloadResourceType(int i) {
        if (i == 0) {
            return DOWNLOAD_RESOURCE_TYPE_VIDEO;
        }
        if (i == 1) {
            return DOWNLOAD_RESOURCE_TYPE_ZIP;
        }
        if (i == 2) {
            return DOWNLOAD_RESOURCE_TYPE_IMAGE;
        }
        if (i == 3) {
            return DOWNLOAD_RESOURCE_TYPE_HTML;
        }
        if (i == 4) {
            return DOWNLOAD_RESOURCE_TYPE_OTHER;
        }
        if (i != 5) {
            return null;
        }
        return DOWNLOAD_RESOURCE_TYPE_APK;
    }
}

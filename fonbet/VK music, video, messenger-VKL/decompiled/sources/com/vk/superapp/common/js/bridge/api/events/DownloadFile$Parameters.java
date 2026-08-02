package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: DownloadFile.kt */
/* loaded from: classes6.dex */
public final class DownloadFile$Parameters implements ad6 {

    @pmi0("filename")
    private final String filename;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("url")
    private final String url;

    public DownloadFile$Parameters(String str, String str2, String str3) {
        this.url = str;
        this.filename = str2;
        this.requestId = str3;
    }

    public static final DownloadFile$Parameters a(DownloadFile$Parameters downloadFile$Parameters) {
        return downloadFile$Parameters.requestId == null ? new DownloadFile$Parameters(downloadFile$Parameters.url, downloadFile$Parameters.filename, "default_request_id") : downloadFile$Parameters;
    }

    public static final void b(DownloadFile$Parameters downloadFile$Parameters) {
        if (downloadFile$Parameters.url == null) {
            throw new IllegalArgumentException("Value of non-nullable member url cannot be\n                        null");
        }
        if (downloadFile$Parameters.filename == null) {
            throw new IllegalArgumentException("Value of non-nullable member filename cannot be\n                        null");
        }
        if (downloadFile$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadFile$Parameters)) {
            return false;
        }
        DownloadFile$Parameters downloadFile$Parameters = (DownloadFile$Parameters) obj;
        return epx.f(this.url, downloadFile$Parameters.url) && epx.f(this.filename, downloadFile$Parameters.filename) && epx.f(this.requestId, downloadFile$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + urd0.a(this.url.hashCode() * 31, 31, this.filename);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(url=");
        sb.append(this.url);
        sb.append(", filename=");
        sb.append(this.filename);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}

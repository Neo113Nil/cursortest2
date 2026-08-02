package com.vk.superapp.vkclient.js.bridge.api.events;

import com.mbridge.msdk.foundation.download.database.DownloadModel;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: GetClientLogs.kt */
/* loaded from: classes6.dex */
public final class GetClientLogs$Parameters implements ad6 {

    @pmi0("field_name")
    private final String fieldName;

    @pmi0(DownloadModel.FILE_NAME)
    private final String fileName;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0(ApiProtocol.KEY_UPLOAD_URL)
    private final String uploadUrl;

    public GetClientLogs$Parameters(String str, String str2, String str3, String str4) {
        this.uploadUrl = str;
        this.fieldName = str2;
        this.fileName = str3;
        this.requestId = str4;
    }

    public static final GetClientLogs$Parameters a(GetClientLogs$Parameters getClientLogs$Parameters) {
        return getClientLogs$Parameters.requestId == null ? new GetClientLogs$Parameters(getClientLogs$Parameters.uploadUrl, getClientLogs$Parameters.fieldName, getClientLogs$Parameters.fileName, "default_request_id") : getClientLogs$Parameters;
    }

    public static final void b(GetClientLogs$Parameters getClientLogs$Parameters) {
        if (getClientLogs$Parameters.uploadUrl == null) {
            throw new IllegalArgumentException("Value of non-nullable member uploadUrl cannot be\n                        null");
        }
        if (getClientLogs$Parameters.fieldName == null) {
            throw new IllegalArgumentException("Value of non-nullable member fieldName cannot be\n                        null");
        }
        if (getClientLogs$Parameters.fileName == null) {
            throw new IllegalArgumentException("Value of non-nullable member fileName cannot be\n                        null");
        }
        if (getClientLogs$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetClientLogs$Parameters)) {
            return false;
        }
        GetClientLogs$Parameters getClientLogs$Parameters = (GetClientLogs$Parameters) obj;
        return epx.f(this.uploadUrl, getClientLogs$Parameters.uploadUrl) && epx.f(this.fieldName, getClientLogs$Parameters.fieldName) && epx.f(this.fileName, getClientLogs$Parameters.fileName) && epx.f(this.requestId, getClientLogs$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + urd0.a(urd0.a(this.uploadUrl.hashCode() * 31, 31, this.fieldName), 31, this.fileName);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(uploadUrl=");
        sb.append(this.uploadUrl);
        sb.append(", fieldName=");
        sb.append(this.fieldName);
        sb.append(", fileName=");
        sb.append(this.fileName);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}

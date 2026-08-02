package Sd;

import Cg.c;
import com.zoho.livechat.android.modules.calls.data.model.MediaResponse;
import kotlin.jvm.internal.Intrinsics;
import sd.d;

/* loaded from: classes4.dex */
public abstract class b {
    public static final c a(MediaResponse mediaResponse, String attenderName, String appName, String packageName) {
        Intrinsics.checkNotNullParameter(mediaResponse, "<this>");
        Intrinsics.checkNotNullParameter(attenderName, "attenderName");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        MediaResponse.RTCPCredential rtcpCredential = mediaResponse.getRtcpCredential();
        String clientOtp = rtcpCredential != null ? rtcpCredential.getClientOtp() : null;
        MediaResponse.RTCPCredential rtcpCredential2 = mediaResponse.getRtcpCredential();
        String conferenceKey = rtcpCredential2 != null ? rtcpCredential2.getConferenceKey() : null;
        MediaResponse.RTCPCredential rtcpCredential3 = mediaResponse.getRtcpCredential();
        String userId = rtcpCredential3 != null ? rtcpCredential3.getUserId() : null;
        String mediaId = mediaResponse.getMediaId();
        String conversationId = mediaResponse.getConversationId();
        String recordingType = mediaResponse.getRecordingType();
        String d10 = d.d();
        Intrinsics.checkNotNull(d10);
        return new c(attenderName, appName, packageName, clientOtp, conferenceKey, userId, conversationId, mediaId, "", recordingType, false, d10, 1024, null);
    }
}

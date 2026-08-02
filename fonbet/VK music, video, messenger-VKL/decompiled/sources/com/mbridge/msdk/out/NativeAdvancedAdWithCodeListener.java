package com.mbridge.msdk.out;

import com.mbridge.msdk.util.a;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;

/* loaded from: classes13.dex */
public abstract class NativeAdvancedAdWithCodeListener implements NativeAdvancedAdListener {
    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public void onLoadFailed(MBridgeIds mBridgeIds, String str) {
        onLoadFailedWithCode(mBridgeIds, a.a(RtpSenderHelper.AUDIO_BITRATE_MIN, str), str);
    }

    public abstract void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i, String str);
}

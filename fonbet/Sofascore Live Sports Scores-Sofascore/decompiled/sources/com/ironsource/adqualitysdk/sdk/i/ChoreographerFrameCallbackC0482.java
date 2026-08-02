package com.ironsource.adqualitysdk.sdk.i;

import android.view.Choreographer;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ٱ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ChoreographerFrameCallbackC0482 implements Choreographer.FrameCallback {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0481 f1550;

    public ChoreographerFrameCallbackC0482(C0481 c0481) {
        this.f1550 = c0481;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        try {
            AbstractC1008.m614(this.f1550);
        } catch (Throwable th) {
            String decrypt = StringFog.decrypt("J+xWFFYFnEQf20Mq\n", "ZogHYTdp9TA=\n");
            AbstractC0420.m252(decrypt, decrypt, StringFog.decrypt("aWwvrQ8VQGxgSzSgBBQ=\n", "Dw1GwWpxYAg=\n"), th, null, false);
        }
    }
}

package defpackage;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class mh9 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ mh9(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        WebViewEvent sendFocusChange$lambda$16;
        WebViewEvent sendVisibilityChange$lambda$15;
        WebViewEvent sendMuteChange$lambda$14;
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(z);
            case 1:
                sendFocusChange$lambda$16 = WebViewAdPlayer.sendFocusChange$lambda$16(z);
                return sendFocusChange$lambda$16;
            case 2:
                sendVisibilityChange$lambda$15 = WebViewAdPlayer.sendVisibilityChange$lambda$15(z);
                return sendVisibilityChange$lambda$15;
            case 3:
                sendMuteChange$lambda$14 = WebViewAdPlayer.sendMuteChange$lambda$14(z);
                return sendMuteChange$lambda$14;
            default:
                if (!z) {
                    o.c();
                }
                return Unit.a;
        }
    }
}

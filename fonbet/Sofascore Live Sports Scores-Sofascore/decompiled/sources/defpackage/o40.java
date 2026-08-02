package defpackage;

import com.inmobi.media.GestureDetectorOnGestureListenerC3889xi;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.domain.adquality.AndroidUpdateAdQualitySessionToken;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class o40 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ o40(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String invoke$lambda$0;
        WebViewEvent onBroadcastEvent$lambda$21;
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                invoke$lambda$0 = AndroidUpdateAdQualitySessionToken.invoke$lambda$0(str);
                return invoke$lambda$0;
            case 1:
                return new p6d(str, null, null);
            case 2:
                return str;
            case 3:
                onBroadcastEvent$lambda$21 = WebViewAdPlayer.onBroadcastEvent$lambda$21(str);
                return onBroadcastEvent$lambda$21;
            default:
                return Short.valueOf(GestureDetectorOnGestureListenerC3889xi.m(str));
        }
    }
}

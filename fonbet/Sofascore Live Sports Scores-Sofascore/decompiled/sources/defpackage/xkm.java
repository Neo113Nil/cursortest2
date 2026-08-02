package defpackage;

import android.view.View;
import com.blaze.blazesdk.analytics.enums.SeekDirection;
import com.blaze.blazesdk.analytics.enums.SeekType;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.ironsource.Ua;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class xkm implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dlm b;

    public /* synthetic */ xkm(dlm dlmVar, int i) {
        this.a = i;
        this.b = dlmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        dlm dlmVar = this.b;
        switch (i) {
            case 0:
                int i2 = dlm.o;
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 14, null);
                sqm sqmVar = (sqm) ((syl) dlmVar.c).getViewModel();
                long G = sqmVar.G();
                sqmVar.y(Ua.s);
                sqmVar.B(true);
                ysm.f(sqmVar, SeekType.SEEK_BUTTON, SeekDirection.BACKWARD, G, Math.max(G - Ua.s, 0L));
                break;
            case 1:
                int i3 = dlm.o;
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 14, null);
                sqm sqmVar2 = (sqm) ((syl) dlmVar.c).getViewModel();
                long G2 = sqmVar2.G();
                long G3 = sqmVar2.G();
                long E = sqmVar2.E();
                sqmVar2.A(Ua.s);
                long min = Math.min(G3 + Ua.s, E);
                if (E > 0 && min < E) {
                    sqmVar2.B(true);
                }
                ysm.f(sqmVar2, SeekType.SEEK_BUTTON, SeekDirection.FORWARD, G2, G2 + Ua.s);
                break;
            default:
                int i4 = dlm.o;
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                syl sylVar = (syl) dlmVar.c;
                sylVar.getClass();
                try {
                    ((sqm) sylVar.getViewModel()).h0();
                    break;
                } catch (Throwable th) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                }
        }
    }
}

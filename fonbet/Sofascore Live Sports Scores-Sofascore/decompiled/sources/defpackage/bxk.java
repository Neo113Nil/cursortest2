package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class bxk implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ bxk(String str, boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = this.a;
        boolean z = this.d;
        boolean z2 = this.c;
        switch (i3) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(1 & intValue, (intValue & 3) != 2)) {
                    xtc f0 = l98.f0(utc.a, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z2 ? 6.0f : 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                    yf8 yf8Var = xth.a;
                    dfj j = xth.j();
                    if (z) {
                        i = 445736464;
                        i2 = R.color.on_color_primary;
                    } else {
                        i = 445737106;
                        i2 = R.color.on_color_secondary;
                    }
                    udj.c(this.b, f0, ljg.f(av8Var, i, i2, av8Var, false), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, j, av8Var, 0, 0, 131064);
                } else {
                    av8Var.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                b0a.r(this.b, z2, z, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ bxk(String str, boolean z, boolean z2, int i) {
        this.b = str;
        this.c = z;
        this.d = z2;
    }
}

package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class b82 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ b82(xtc xtcVar, Function0 function0, boolean z, String str) {
        this.c = xtcVar;
        this.e = function0;
        this.d = z;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                int i = 0;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(1 & intValue, (intValue & 3) != 2)) {
                    xtc g = bkh.g(this.c, 36.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    v72 b = q72.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
                    n7g a = o7g.a(4.0f);
                    t3e t3eVar = new t3e(16.0f, 10.0f, 16.0f, 10.0f);
                    p72 a2 = q72.a(lz.D(R.color.primary_default, av8Var), lz.D(R.color.surface_1, av8Var), lz.D(R.color.neutral_default, av8Var), lz.D(R.color.surface_1, av8Var), av8Var, 0);
                    Function0 function0 = this.e;
                    boolean g2 = av8Var.g(function0);
                    Object O = av8Var.O();
                    if (g2 || O == nf3.a) {
                        O = new v61(4, function0);
                        av8Var.n0(O);
                    }
                    iz8.e((Function0) O, g, this.d, a, a2, b, null, t3eVar, null, yqo.H(978009024, av8Var, new d82(this.b, i)), av8Var, 805306368, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                qx9.l(aba.K(49), (of3) obj, this.c, this.b, this.e, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                gz8.n(aba.K(1), (of3) obj, this.c, this.b, this.e, this.d);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ b82(String str, xtc xtcVar, boolean z, Function0 function0, int i) {
        this.b = str;
        this.c = xtcVar;
        this.d = z;
        this.e = function0;
    }

    public /* synthetic */ b82(String str, boolean z, Function0 function0, xtc xtcVar, int i) {
        this.b = str;
        this.d = z;
        this.e = function0;
        this.c = xtcVar;
    }
}

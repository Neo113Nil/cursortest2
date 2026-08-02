package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class e30 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e30(xtc xtcVar, long j, Function0 function0, boolean z, String str) {
        this.b = xtcVar;
        this.c = j;
        this.e = function0;
        this.d = z;
        this.f = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        int i2 = 1;
        switch (i) {
            case 0:
                hsk hskVar = (hsk) obj4;
                pnd pndVar = (pnd) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    tol.b(dh3.t.a(hskVar), yqo.H(1260045569, av8Var, new g30(this.c, this.d, this.b, pndVar)), av8Var, 56);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                Function0 function0 = (Function0) obj4;
                String str = (String) obj3;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    iz8.e(function0, bkh.g(this.b, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), this.d, o7g.a(16.0f), q72.a(this.c, lz.D(R.color.surface_1, av8Var2), lz.D(R.color.neutral_default, av8Var2), lz.D(R.color.surface_1, av8Var2), av8Var2, 0), q72.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30), null, new t3e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), null, yqo.H(-558343084, av8Var2, new d82(str, i2)), av8Var2, 817889280, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                hda.b(this.b, this.d, this.c, (Function0) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                euj.e((Integer) obj4, (gv9) obj3, this.c, this.d, this.b, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ e30(xtc xtcVar, boolean z, long j, Function0 function0, Function0 function02, int i) {
        this.b = xtcVar;
        this.d = z;
        this.c = j;
        this.e = function0;
        this.f = function02;
    }

    public /* synthetic */ e30(hsk hskVar, long j, boolean z, xtc xtcVar, pnd pndVar) {
        this.e = hskVar;
        this.c = j;
        this.d = z;
        this.b = xtcVar;
        this.f = pndVar;
    }

    public /* synthetic */ e30(Integer num, gv9 gv9Var, long j, boolean z, xtc xtcVar, int i) {
        this.e = num;
        this.f = gv9Var;
        this.c = j;
        this.d = z;
        this.b = xtcVar;
    }
}

package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class g82 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ g82(uv3 uv3Var, boolean z, long j, long j2, r13 r13Var, Function1 function1, int i) {
        this.e = uv3Var;
        this.b = z;
        this.c = j;
        this.d = j2;
        this.f = r13Var;
        this.g = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                xtc xtcVar = (xtc) obj5;
                Function0 function0 = (Function0) obj4;
                String str = (String) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = 2;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(1 & intValue, (intValue & 3) != 2)) {
                    xtc g = bkh.g(xtcVar, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    v72 b = q72.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
                    n7g a = o7g.a(20.0f);
                    t3e t3eVar = new t3e(16.0f, 8.0f, 16.0f, 8.0f);
                    long D = lz.D(R.color.neutral_default, av8Var);
                    long j = this.c;
                    long j2 = this.d;
                    iz8.e(function0, g, this.b, a, q72.a(j, j2, D, j2, av8Var, 0), b, null, t3eVar, null, yqo.H(1839494778, av8Var, new d82(str, i2)), av8Var, 805306368, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE);
                } else {
                    av8Var.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                un0.c((uv3) obj5, this.b, this.c, this.d, (r13) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ g82(xtc xtcVar, long j, long j2, Function0 function0, boolean z, String str) {
        this.e = xtcVar;
        this.c = j;
        this.d = j2;
        this.f = function0;
        this.b = z;
        this.g = str;
    }
}

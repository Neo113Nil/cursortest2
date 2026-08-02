package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ms9 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ms9(int i, xtc xtcVar, boolean z, int i2) {
        this.b = i;
        this.d = z;
        this.e = xtcVar;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        boolean z = this.d;
        int i3 = this.b;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                td4.s(i3, aba.K(i2 | 1), (of3) obj, (xtc) obj3, z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                q5a.m((gv9) obj3, this.b, this.c, this.d, (of3) obj, aba.K(3073));
                break;
            default:
                dt9 dt9Var = (dt9) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    c5n.n(dt9Var, nq8.K(16.0f), 0, null, av8Var, 48, 24);
                    c5n.n(new v20(i3), nq8.K(z ? 6.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 0, new t13(new fjj(new h1g(i2))), av8Var, 32816, 8);
                } else {
                    av8Var.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ms9(dt9 dt9Var, int i, boolean z, int i2) {
        this.e = dt9Var;
        this.b = i;
        this.d = z;
        this.c = i2;
    }

    public /* synthetic */ ms9(gv9 gv9Var, int i, int i2, boolean z, int i3) {
        this.e = gv9Var;
        this.b = i;
        this.c = i2;
        this.d = z;
    }
}

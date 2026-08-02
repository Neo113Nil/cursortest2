package defpackage;

import com.ironsource.W3;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class tqk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qo0 b;

    public /* synthetic */ tqk(qo0 qo0Var, int i, long j) {
        this.a = 0;
        this.b = qo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 2;
        qo0 qo0Var = this.b;
        switch (i) {
            case 0:
                lg6 lg6Var = qo0Var.b;
                int i3 = lik.a;
                bn4 bn4Var = lg6Var.a.r;
                bn4Var.z(bn4Var.u((rcc) bn4Var.d.f), 1018, new eg4(i2));
                break;
            case 1:
                lg6 lg6Var2 = qo0Var.b;
                int i4 = lik.a;
                bn4 bn4Var2 = lg6Var2.a.r;
                bn4Var2.z(bn4Var2.y(), 1019, new eg4(i2));
                break;
            case 2:
                lg6 lg6Var3 = qo0Var.b;
                int i5 = lik.a;
                bn4 bn4Var3 = lg6Var3.a.r;
                bn4Var3.z(bn4Var3.y(), IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, new eg4(i2));
                break;
            case 3:
                lg6 lg6Var4 = qo0Var.b;
                int i6 = lik.a;
                bn4 bn4Var4 = lg6Var4.a.r;
                bn4Var4.z(bn4Var4.y(), W3.l, new eg4(i2));
                break;
            case 4:
                lg6 lg6Var5 = qo0Var.b;
                int i7 = lik.a;
                bn4 bn4Var5 = lg6Var5.a.r;
                bn4Var5.z(bn4Var5.y(), 1015, new eg4(i2));
                break;
            case 5:
                lg6 lg6Var6 = qo0Var.b;
                int i8 = lik.a;
                bn4 bn4Var6 = lg6Var6.a.r;
                bn4Var6.z(bn4Var6.y(), 1017, new eg4(i2));
                break;
            default:
                lg6 lg6Var7 = qo0Var.b;
                int i9 = lik.a;
                bn4 bn4Var7 = lg6Var7.a.r;
                bn4Var7.z(bn4Var7.u((rcc) bn4Var7.d.f), IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, new eg4(i2));
                break;
        }
    }

    public /* synthetic */ tqk(qo0 qo0Var, long j, int i) {
        this.a = 6;
        this.b = qo0Var;
    }

    public /* synthetic */ tqk(qo0 qo0Var, sm8 sm8Var, km4 km4Var) {
        this.a = 5;
        this.b = qo0Var;
    }

    public /* synthetic */ tqk(qo0 qo0Var, Object obj, int i) {
        this.a = i;
        this.b = qo0Var;
    }

    public /* synthetic */ tqk(qo0 qo0Var, String str, long j, long j2) {
        this.a = 3;
        this.b = qo0Var;
    }
}

package defpackage;

import androidx.media3.common.b;
import com.ironsource.W3;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class sqk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ro0 b;

    public /* synthetic */ sqk(ro0 ro0Var, int i, long j) {
        this.a = 3;
        this.b = ro0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ro0 ro0Var = this.b;
        switch (i) {
            case 0:
                mg6 mg6Var = ro0Var.b;
                String str = nik.a;
                cn4 cn4Var = mg6Var.a.s;
                cn4Var.q(cn4Var.p(), W3.l, new eg4(22));
                break;
            case 1:
                mg6 mg6Var2 = ro0Var.b;
                String str2 = nik.a;
                cn4 cn4Var2 = mg6Var2.a.s;
                cn4Var2.q(cn4Var2.p(), IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, new eg4(4));
                break;
            case 2:
                mg6 mg6Var3 = ro0Var.b;
                String str3 = nik.a;
                cn4 cn4Var3 = mg6Var3.a.s;
                cn4Var3.q(cn4Var3.p(), 1019, new eg4(10));
                break;
            case 3:
                mg6 mg6Var4 = ro0Var.b;
                String str4 = nik.a;
                cn4 cn4Var4 = mg6Var4.a.s;
                cn4Var4.q(cn4Var4.m((scc) cn4Var4.d.e), 1018, new eg4(29));
                break;
            case 4:
                mg6 mg6Var5 = ro0Var.b;
                String str5 = nik.a;
                cn4 cn4Var5 = mg6Var5.a.s;
                cn4Var5.q(cn4Var5.m((scc) cn4Var5.d.e), IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, new ym4(0));
                break;
            case 5:
                mg6 mg6Var6 = ro0Var.b;
                String str6 = nik.a;
                cn4 cn4Var6 = mg6Var6.a.s;
                cn4Var6.q(cn4Var6.p(), 1015, new ym4(12));
                break;
            default:
                mg6 mg6Var7 = ro0Var.b;
                String str7 = nik.a;
                cn4 cn4Var7 = mg6Var7.a.s;
                cn4Var7.q(cn4Var7.p(), 1017, new ym4(6));
                break;
        }
    }

    public /* synthetic */ sqk(ro0 ro0Var, long j, int i) {
        this.a = 4;
        this.b = ro0Var;
    }

    public /* synthetic */ sqk(ro0 ro0Var, b bVar, lm4 lm4Var) {
        this.a = 6;
        this.b = ro0Var;
    }

    public /* synthetic */ sqk(ro0 ro0Var, Object obj, int i) {
        this.a = i;
        this.b = ro0Var;
    }

    public /* synthetic */ sqk(ro0 ro0Var, String str, long j, long j2) {
        this.a = 0;
        this.b = ro0Var;
    }
}

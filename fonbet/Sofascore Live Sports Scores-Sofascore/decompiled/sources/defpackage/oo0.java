package defpackage;

import androidx.media3.common.b;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.W3;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class oo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ro0 b;

    public /* synthetic */ oo0(ro0 ro0Var, b bVar, lm4 lm4Var) {
        this.a = 9;
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
                cn4Var.q(cn4Var.p(), IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, new eg4(21));
                break;
            case 1:
                mg6 mg6Var2 = ro0Var.b;
                String str2 = nik.a;
                cn4 cn4Var2 = mg6Var2.a.s;
                cn4Var2.q(cn4Var2.p(), 1011, new ym4(19));
                break;
            case 2:
                mg6 mg6Var3 = ro0Var.b;
                String str3 = nik.a;
                cn4 cn4Var3 = mg6Var3.a.s;
                cn4Var3.q(cn4Var3.p(), 1010, new ym4(20));
                break;
            case 3:
                mg6 mg6Var4 = ro0Var.b;
                String str4 = nik.a;
                cn4 cn4Var4 = mg6Var4.a.s;
                cn4Var4.q(cn4Var4.p(), IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, new ym4(23));
                break;
            case 4:
                mg6 mg6Var5 = ro0Var.b;
                String str5 = nik.a;
                cn4 cn4Var5 = mg6Var5.a.s;
                cn4Var5.q(cn4Var5.p(), 1008, new eg4(8));
                break;
            case 5:
                mg6 mg6Var6 = ro0Var.b;
                String str6 = nik.a;
                cn4 cn4Var6 = mg6Var6.a.s;
                cn4Var6.q(cn4Var6.p(), TTAdConstant.IMAGE_MODE_1012, new ym4(18));
                break;
            case 6:
                mg6 mg6Var7 = ro0Var.b;
                String str7 = nik.a;
                cn4 cn4Var7 = mg6Var7.a.s;
                cn4Var7.q(cn4Var7.p(), 1007, new eg4(27));
                break;
            case 7:
                mg6 mg6Var8 = ro0Var.b;
                String str8 = nik.a;
                cn4 cn4Var8 = mg6Var8.a.s;
                cn4Var8.q(cn4Var8.p(), IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID, new ym4(7));
                break;
            case 8:
                mg6 mg6Var9 = ro0Var.b;
                String str9 = nik.a;
                cn4 cn4Var9 = mg6Var9.a.s;
                cn4Var9.q(cn4Var9.p(), W3.j, new ym4(15));
                break;
            default:
                mg6 mg6Var10 = ro0Var.b;
                String str10 = nik.a;
                cn4 cn4Var10 = mg6Var10.a.s;
                cn4Var10.q(cn4Var10.p(), 1009, new ym4(11));
                break;
        }
    }

    public /* synthetic */ oo0(ro0 ro0Var, long j) {
        this.a = 2;
        this.b = ro0Var;
    }

    public /* synthetic */ oo0(ro0 ro0Var, int i, long j, long j2) {
        this.a = 1;
        this.b = ro0Var;
    }

    public /* synthetic */ oo0(ro0 ro0Var, Object obj, int i) {
        this.a = i;
        this.b = ro0Var;
    }

    public /* synthetic */ oo0(ro0 ro0Var, String str, long j, long j2) {
        this.a = 4;
        this.b = ro0Var;
    }
}

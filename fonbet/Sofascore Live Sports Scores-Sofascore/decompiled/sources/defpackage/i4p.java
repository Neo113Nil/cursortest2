package defpackage;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzpv;
import com.google.android.gms.internal.ads.zzry;
import com.ironsource.W3;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class i4p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzry b;

    public /* synthetic */ i4p(zzry zzryVar, int i, long j, long j2) {
        this.a = 3;
        this.b = zzryVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 27;
        int i3 = 26;
        int i4 = 25;
        zzry zzryVar = this.b;
        switch (i) {
            case 0:
                String str = zzfm.a;
                zzpv zzpvVar = zzryVar.b.a.q;
                zzpvVar.n(zzpvVar.r(), 1008, new wkf(i3));
                break;
            case 1:
                String str2 = zzfm.a;
                zzpv zzpvVar2 = zzryVar.b.a.q;
                zzpvVar2.n(zzpvVar2.r(), IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, new u8f(i4));
                break;
            case 2:
                String str3 = zzfm.a;
                zzpv zzpvVar3 = zzryVar.b.a.q;
                zzpvVar3.n(zzpvVar3.r(), 1010, new anf(i3));
                break;
            case 3:
                String str4 = zzfm.a;
                zzpv zzpvVar4 = zzryVar.b.a.q;
                zzpvVar4.n(zzpvVar4.r(), 1011, new wje(i2));
                break;
            case 4:
                String str5 = zzfm.a;
                zzpv zzpvVar5 = zzryVar.b.a.q;
                zzpvVar5.n(zzpvVar5.r(), TTAdConstant.IMAGE_MODE_1012, new jle(i2));
                break;
            case 5:
                String str6 = zzfm.a;
                zzpv zzpvVar6 = zzryVar.b.a.q;
                zzpvVar6.n(zzpvVar6.r(), W3.j, new e2f(i4));
                break;
            case 6:
                String str7 = zzfm.a;
                zzpv zzpvVar7 = zzryVar.b.a.q;
                zzpvVar7.n(zzpvVar7.r(), IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, new n2f(i4));
                break;
            case 7:
                String str8 = zzfm.a;
                zzpv zzpvVar8 = zzryVar.b.a.q;
                zzpvVar8.n(zzpvVar8.r(), IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID, new x3f(25));
                break;
            default:
                String str9 = zzfm.a;
                zzpv zzpvVar9 = zzryVar.b.a.q;
                zzpvVar9.n(zzpvVar9.r(), 1007, new y9f(i3));
                break;
        }
    }

    public /* synthetic */ i4p(zzry zzryVar, long j) {
        this.a = 2;
        this.b = zzryVar;
    }

    public /* synthetic */ i4p(zzry zzryVar, Object obj, int i) {
        this.a = i;
        this.b = zzryVar;
    }

    public /* synthetic */ i4p(zzry zzryVar, String str, long j, long j2) {
        this.a = 0;
        this.b = zzryVar;
    }
}

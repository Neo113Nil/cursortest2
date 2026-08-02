package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import xsna.wp;

/* renamed from: com.ironsource.ge, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4337ge extends AbstractC4415l3 {
    private static C4337ge R;
    private String P;
    private final M8 Q = Kb.Y().s();

    private C4337ge() {
        this.H = "outcome";
        this.G = 3;
        this.I = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized C4337ge i() {
        C4337ge c4337ge;
        synchronized (C4337ge.class) {
            try {
                if (R == null) {
                    C4337ge c4337ge2 = new C4337ge();
                    R = c4337ge2;
                    c4337ge2.e();
                }
                c4337ge = R;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4337ge;
    }

    @Override // com.ironsource.AbstractC4415l3
    public int c(C4632x5 c4632x5) {
        return this.Q.a(IronSource.a.REWARDED_VIDEO);
    }

    @Override // com.ironsource.AbstractC4415l3
    public boolean d(C4632x5 c4632x5) {
        int c = c4632x5.c();
        return c == EnumC4650y5.FIRST_INSTANCE.b() || c == EnumC4650y5.INIT_COMPLETE.b() || c == EnumC4650y5.SDK_INIT_FAILED.b() || c == EnumC4650y5.SDK_INIT_SUCCESS.b() || c == EnumC4650y5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.b() || c == EnumC4650y5.RV_BUSINESS_INSTANCE_OPENED.b() || c == EnumC4650y5.RV_INSTANCE_CLOSED.b() || c == EnumC4650y5.RV_BUSINESS_INSTANCE_REWARDED.b() || c == EnumC4650y5.RV_AUCTION_FAILED.b() || c == EnumC4650y5.RV_AUCTION_SUCCESS.b();
    }

    @Override // com.ironsource.AbstractC4415l3
    public String e(int i) {
        return (i == 15 || (i >= 300 && i < 400)) ? this.P : "";
    }

    @Override // com.ironsource.AbstractC4415l3
    public void f(C4632x5 c4632x5) {
        if (c4632x5.c() == 15 || (c4632x5.c() >= 300 && c4632x5.c() < 400)) {
            this.P = c4632x5.b().optString("placement");
        }
    }

    @Override // com.ironsource.AbstractC4415l3
    public boolean j(C4632x5 c4632x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4415l3
    public void d() {
        wp.f(EnumC4650y5.RV_BUSINESS_MEDIATION_LOAD, this.J);
        wp.f(EnumC4650y5.RV_BUSINESS_INSTANCE_LOAD, this.J);
        wp.f(EnumC4650y5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS, this.J);
        wp.f(EnumC4650y5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, this.J);
        wp.f(EnumC4650y5.RV_INSTANCE_LOAD_FAILED, this.J);
        wp.f(EnumC4650y5.RV_INSTANCE_SHOW_CHANCE, this.J);
        wp.f(EnumC4650y5.RV_INSTANCE_READY_TRUE, this.J);
        wp.f(EnumC4650y5.RV_INSTANCE_READY_FALSE, this.J);
        wp.f(EnumC4650y5.RV_INSTANCE_LOAD_FAILED_REASON, this.J);
        wp.f(EnumC4650y5.RV_INSTANCE_LOAD_NO_FILL, this.J);
        wp.f(EnumC4650y5.RV_MEDIATION_LOAD_ERROR, this.J);
    }
}

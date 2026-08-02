package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ironsource.ge, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2441ge extends AbstractC2519l3 {
    private static C2441ge R;
    private String P;
    private final L8 Q = Jb.Y().s();

    private C2441ge() {
        this.H = "outcome";
        this.G = 3;
        this.I = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized C2441ge i() {
        C2441ge c2441ge;
        synchronized (C2441ge.class) {
            if (R == null) {
                C2441ge c2441ge2 = new C2441ge();
                R = c2441ge2;
                c2441ge2.e();
            }
            c2441ge = R;
        }
        return c2441ge;
    }

    @Override // com.ironsource.AbstractC2519l3
    protected int c(C2736x5 c2736x5) {
        return this.Q.a(IronSource.a.REWARDED_VIDEO);
    }

    @Override // com.ironsource.AbstractC2519l3
    protected boolean d(C2736x5 c2736x5) {
        int c = c2736x5.c();
        return c == EnumC2754y5.FIRST_INSTANCE.b() || c == EnumC2754y5.INIT_COMPLETE.b() || c == EnumC2754y5.SDK_INIT_FAILED.b() || c == EnumC2754y5.SDK_INIT_SUCCESS.b() || c == EnumC2754y5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.b() || c == EnumC2754y5.RV_BUSINESS_INSTANCE_OPENED.b() || c == EnumC2754y5.RV_INSTANCE_CLOSED.b() || c == EnumC2754y5.RV_BUSINESS_INSTANCE_REWARDED.b() || c == EnumC2754y5.RV_AUCTION_FAILED.b() || c == EnumC2754y5.RV_AUCTION_SUCCESS.b();
    }

    @Override // com.ironsource.AbstractC2519l3
    protected String e(int i) {
        return (i == 15 || (i >= 300 && i < 400)) ? this.P : "";
    }

    @Override // com.ironsource.AbstractC2519l3
    protected void f(C2736x5 c2736x5) {
        if (c2736x5.c() == 15 || (c2736x5.c() >= 300 && c2736x5.c() < 400)) {
            this.P = c2736x5.b().optString("placement");
        }
    }

    @Override // com.ironsource.AbstractC2519l3
    protected boolean j(C2736x5 c2736x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC2519l3
    protected void d() {
        this.J.add(Integer.valueOf(EnumC2754y5.RV_BUSINESS_MEDIATION_LOAD.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.RV_BUSINESS_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.RV_INSTANCE_LOAD_FAILED.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.RV_INSTANCE_SHOW_CHANCE.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.RV_INSTANCE_READY_TRUE.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.RV_INSTANCE_READY_FALSE.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.RV_INSTANCE_LOAD_FAILED_REASON.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.RV_INSTANCE_LOAD_NO_FILL.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.RV_MEDIATION_LOAD_ERROR.b()));
    }
}

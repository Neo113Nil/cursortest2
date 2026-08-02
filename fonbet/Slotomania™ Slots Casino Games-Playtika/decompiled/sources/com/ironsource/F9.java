package com.ironsource;

import com.ironsource.AbstractC2519l3;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes4.dex */
public class F9 extends AbstractC2519l3 {
    private static F9 R;
    private String P;
    private final L8 Q = Jb.Y().s();

    private F9() {
        this.H = "ironbeast";
        this.G = 2;
        this.I = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized F9 i() {
        F9 f9;
        synchronized (F9.class) {
            if (R == null) {
                F9 f92 = new F9();
                R = f92;
                f92.e();
            }
            f9 = R;
        }
        return f9;
    }

    @Override // com.ironsource.AbstractC2519l3
    protected int c(C2736x5 c2736x5) {
        int f = f(c2736x5.c());
        return f == AbstractC2519l3.e.BANNER.b() ? this.Q.a(IronSource.a.BANNER) : f == AbstractC2519l3.e.NATIVE_AD.b() ? this.Q.a(IronSource.a.NATIVE_AD) : this.Q.a(IronSource.a.INTERSTITIAL);
    }

    @Override // com.ironsource.AbstractC2519l3
    protected boolean d(C2736x5 c2736x5) {
        int c = c2736x5.c();
        return c == EnumC2754y5.IS_CALLBACK_LOAD_SUCCESS.b() || c == EnumC2754y5.IS_INSTANCE_OPENED.b() || c == EnumC2754y5.IS_INSTANCE_CLOSED.b() || c == EnumC2754y5.IS_AUCTION_SUCCESS.b() || c == EnumC2754y5.IS_AUCTION_FAILED.b() || c == EnumC2754y5.BN_INSTANCE_SHOW.b() || c == EnumC2754y5.BN_AUCTION_SUCCESS.b() || c == EnumC2754y5.BN_AUCTION_FAILED.b() || c == EnumC2754y5.NT_INSTANCE_LOAD_SUCCESS.b() || c == EnumC2754y5.NT_INSTANCE_SHOW.b() || c == EnumC2754y5.NT_AUCTION_SUCCESS.b() || c == EnumC2754y5.NT_AUCTION_FAILED.b();
    }

    @Override // com.ironsource.AbstractC2519l3
    protected String e(int i) {
        return this.P;
    }

    @Override // com.ironsource.AbstractC2519l3
    protected void f(C2736x5 c2736x5) {
        this.P = c2736x5.b().optString("placement");
    }

    @Override // com.ironsource.AbstractC2519l3
    protected boolean j(C2736x5 c2736x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC2519l3
    protected void d() {
        this.J.add(Integer.valueOf(EnumC2754y5.IS_LOAD_CALLED.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.IS_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.IS_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.IS_CALLBACK_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.IS_INSTANCE_LOAD_FAILED.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.IS_INSTANCE_LOAD_NO_FILL.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.IS_INSTANCE_READY_TRUE.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.IS_INSTANCE_READY_FALSE.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.BN_LOAD.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.BN_CALLBACK_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.BN_RELOAD.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.BN_CALLBACK_RELOAD_ERROR.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.BN_CALLBACK_RELOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.BN_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.BN_INSTANCE_RELOAD.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.BN_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.BN_INSTANCE_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.BN_INSTANCE_RELOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.BN_INSTANCE_RELOAD_ERROR.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.BN_INSTANCE_SHOW.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.NT_LOAD.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.NT_CALLBACK_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.NT_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.NT_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.NT_INSTANCE_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(EnumC2754y5.NT_INSTANCE_SHOW.b()));
    }
}

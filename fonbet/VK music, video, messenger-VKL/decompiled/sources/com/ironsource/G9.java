package com.ironsource;

import com.ironsource.AbstractC4415l3;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import xsna.wp;

/* loaded from: classes13.dex */
public class G9 extends AbstractC4415l3 {
    private static G9 R;
    private String P;
    private final M8 Q = Kb.Y().s();

    private G9() {
        this.H = "ironbeast";
        this.G = 2;
        this.I = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized G9 i() {
        G9 g9;
        synchronized (G9.class) {
            try {
                if (R == null) {
                    G9 g92 = new G9();
                    R = g92;
                    g92.e();
                }
                g9 = R;
            } catch (Throwable th) {
                throw th;
            }
        }
        return g9;
    }

    @Override // com.ironsource.AbstractC4415l3
    public int c(C4632x5 c4632x5) {
        int f = f(c4632x5.c());
        return f == AbstractC4415l3.e.BANNER.b() ? this.Q.a(IronSource.a.BANNER) : f == AbstractC4415l3.e.NATIVE_AD.b() ? this.Q.a(IronSource.a.NATIVE_AD) : this.Q.a(IronSource.a.INTERSTITIAL);
    }

    @Override // com.ironsource.AbstractC4415l3
    public boolean d(C4632x5 c4632x5) {
        int c = c4632x5.c();
        return c == EnumC4650y5.IS_CALLBACK_LOAD_SUCCESS.b() || c == EnumC4650y5.IS_INSTANCE_OPENED.b() || c == EnumC4650y5.IS_INSTANCE_CLOSED.b() || c == EnumC4650y5.IS_AUCTION_SUCCESS.b() || c == EnumC4650y5.IS_AUCTION_FAILED.b() || c == EnumC4650y5.BN_INSTANCE_SHOW.b() || c == EnumC4650y5.BN_AUCTION_SUCCESS.b() || c == EnumC4650y5.BN_AUCTION_FAILED.b() || c == EnumC4650y5.NT_INSTANCE_LOAD_SUCCESS.b() || c == EnumC4650y5.NT_INSTANCE_SHOW.b() || c == EnumC4650y5.NT_AUCTION_SUCCESS.b() || c == EnumC4650y5.NT_AUCTION_FAILED.b();
    }

    @Override // com.ironsource.AbstractC4415l3
    public String e(int i) {
        return this.P;
    }

    @Override // com.ironsource.AbstractC4415l3
    public void f(C4632x5 c4632x5) {
        this.P = c4632x5.b().optString("placement");
    }

    @Override // com.ironsource.AbstractC4415l3
    public boolean j(C4632x5 c4632x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4415l3
    public void d() {
        wp.f(EnumC4650y5.IS_LOAD_CALLED, this.J);
        wp.f(EnumC4650y5.IS_INSTANCE_LOAD, this.J);
        wp.f(EnumC4650y5.IS_INSTANCE_LOAD_SUCCESS, this.J);
        wp.f(EnumC4650y5.IS_CALLBACK_LOAD_SUCCESS, this.J);
        wp.f(EnumC4650y5.IS_INSTANCE_LOAD_FAILED, this.J);
        wp.f(EnumC4650y5.IS_INSTANCE_LOAD_NO_FILL, this.J);
        wp.f(EnumC4650y5.IS_INSTANCE_READY_TRUE, this.J);
        wp.f(EnumC4650y5.IS_INSTANCE_READY_FALSE, this.J);
        wp.f(EnumC4650y5.BN_LOAD, this.J);
        wp.f(EnumC4650y5.BN_CALLBACK_LOAD_ERROR, this.J);
        wp.f(EnumC4650y5.BN_RELOAD, this.J);
        wp.f(EnumC4650y5.BN_CALLBACK_RELOAD_ERROR, this.J);
        wp.f(EnumC4650y5.BN_CALLBACK_RELOAD_SUCCESS, this.J);
        wp.f(EnumC4650y5.BN_INSTANCE_LOAD, this.J);
        wp.f(EnumC4650y5.BN_INSTANCE_RELOAD, this.J);
        wp.f(EnumC4650y5.BN_INSTANCE_LOAD_SUCCESS, this.J);
        wp.f(EnumC4650y5.BN_INSTANCE_LOAD_ERROR, this.J);
        wp.f(EnumC4650y5.BN_INSTANCE_RELOAD_SUCCESS, this.J);
        wp.f(EnumC4650y5.BN_INSTANCE_RELOAD_ERROR, this.J);
        wp.f(EnumC4650y5.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, this.J);
        wp.f(EnumC4650y5.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS, this.J);
        wp.f(EnumC4650y5.BN_INSTANCE_SHOW, this.J);
        wp.f(EnumC4650y5.NT_LOAD, this.J);
        wp.f(EnumC4650y5.NT_CALLBACK_LOAD_ERROR, this.J);
        wp.f(EnumC4650y5.NT_INSTANCE_LOAD, this.J);
        wp.f(EnumC4650y5.NT_INSTANCE_LOAD_SUCCESS, this.J);
        wp.f(EnumC4650y5.NT_INSTANCE_LOAD_ERROR, this.J);
        wp.f(EnumC4650y5.NT_INSTANCE_SHOW, this.J);
    }
}

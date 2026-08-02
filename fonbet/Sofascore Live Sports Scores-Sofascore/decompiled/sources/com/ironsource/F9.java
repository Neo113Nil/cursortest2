package com.ironsource;

import com.ironsource.AbstractC4121i3;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.fc6;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class F9 extends AbstractC4121i3 {
    private static F9 R;
    private String P;
    private final J8 Q = Ib.a0().s();

    private F9() {
        this.H = "ironbeast";
        this.G = 2;
        this.I = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized F9 i() {
        F9 f9;
        synchronized (F9.class) {
            try {
                if (R == null) {
                    F9 f92 = new F9();
                    R = f92;
                    f92.e();
                }
                f9 = R;
            } catch (Throwable th) {
                throw th;
            }
        }
        return f9;
    }

    @Override // com.ironsource.AbstractC4121i3
    public int c(C4355v5 c4355v5) {
        int f = f(c4355v5.c());
        if (f == AbstractC4121i3.e.BANNER.b()) {
            return this.Q.a(IronSource.a.BANNER);
        }
        int b = AbstractC4121i3.e.NATIVE_AD.b();
        J8 j8 = this.Q;
        return f == b ? j8.a(IronSource.a.NATIVE_AD) : j8.a(IronSource.a.INTERSTITIAL);
    }

    @Override // com.ironsource.AbstractC4121i3
    public void d() {
        fc6.z(EnumC4373w5.IS_LOAD_CALLED, this.J);
        fc6.z(EnumC4373w5.IS_INSTANCE_LOAD, this.J);
        fc6.z(EnumC4373w5.IS_INSTANCE_LOAD_SUCCESS, this.J);
        fc6.z(EnumC4373w5.IS_CALLBACK_LOAD_SUCCESS, this.J);
        fc6.z(EnumC4373w5.IS_INSTANCE_LOAD_FAILED, this.J);
        fc6.z(EnumC4373w5.IS_INSTANCE_LOAD_NO_FILL, this.J);
        fc6.z(EnumC4373w5.IS_INSTANCE_READY_TRUE, this.J);
        fc6.z(EnumC4373w5.IS_INSTANCE_READY_FALSE, this.J);
        fc6.z(EnumC4373w5.BN_LOAD, this.J);
        fc6.z(EnumC4373w5.BN_CALLBACK_LOAD_ERROR, this.J);
        fc6.z(EnumC4373w5.BN_RELOAD, this.J);
        fc6.z(EnumC4373w5.BN_CALLBACK_RELOAD_ERROR, this.J);
        fc6.z(EnumC4373w5.BN_CALLBACK_RELOAD_SUCCESS, this.J);
        fc6.z(EnumC4373w5.BN_INSTANCE_LOAD, this.J);
        fc6.z(EnumC4373w5.BN_INSTANCE_RELOAD, this.J);
        fc6.z(EnumC4373w5.BN_INSTANCE_LOAD_SUCCESS, this.J);
        fc6.z(EnumC4373w5.BN_INSTANCE_LOAD_ERROR, this.J);
        fc6.z(EnumC4373w5.BN_INSTANCE_RELOAD_SUCCESS, this.J);
        fc6.z(EnumC4373w5.BN_INSTANCE_RELOAD_ERROR, this.J);
        fc6.z(EnumC4373w5.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, this.J);
        fc6.z(EnumC4373w5.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS, this.J);
        fc6.z(EnumC4373w5.BN_INSTANCE_SHOW, this.J);
        fc6.z(EnumC4373w5.NT_LOAD, this.J);
        fc6.z(EnumC4373w5.NT_CALLBACK_LOAD_ERROR, this.J);
        fc6.z(EnumC4373w5.NT_INSTANCE_LOAD, this.J);
        fc6.z(EnumC4373w5.NT_INSTANCE_LOAD_SUCCESS, this.J);
        fc6.z(EnumC4373w5.NT_INSTANCE_LOAD_ERROR, this.J);
        fc6.z(EnumC4373w5.NT_INSTANCE_SHOW, this.J);
    }

    @Override // com.ironsource.AbstractC4121i3
    public String e(int i) {
        return this.P;
    }

    @Override // com.ironsource.AbstractC4121i3
    public void f(C4355v5 c4355v5) {
        this.P = c4355v5.b().optString("placement");
    }

    @Override // com.ironsource.AbstractC4121i3
    public boolean j(C4355v5 c4355v5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4121i3
    public boolean d(C4355v5 c4355v5) {
        int c = c4355v5.c();
        return c == EnumC4373w5.IS_CALLBACK_LOAD_SUCCESS.b() || c == EnumC4373w5.IS_INSTANCE_OPENED.b() || c == EnumC4373w5.IS_INSTANCE_CLOSED.b() || c == EnumC4373w5.IS_AUCTION_SUCCESS.b() || c == EnumC4373w5.IS_AUCTION_FAILED.b() || c == EnumC4373w5.BN_INSTANCE_SHOW.b() || c == EnumC4373w5.BN_AUCTION_SUCCESS.b() || c == EnumC4373w5.BN_AUCTION_FAILED.b() || c == EnumC4373w5.NT_INSTANCE_LOAD_SUCCESS.b() || c == EnumC4373w5.NT_INSTANCE_SHOW.b() || c == EnumC4373w5.NT_AUCTION_SUCCESS.b() || c == EnumC4373w5.NT_AUCTION_FAILED.b();
    }
}

package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.fc6;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.fe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4078fe extends AbstractC4121i3 {
    private static C4078fe R;
    private String P;
    private final J8 Q = Ib.a0().s();

    private C4078fe() {
        this.H = "outcome";
        this.G = 3;
        this.I = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized C4078fe i() {
        C4078fe c4078fe;
        synchronized (C4078fe.class) {
            try {
                if (R == null) {
                    C4078fe c4078fe2 = new C4078fe();
                    R = c4078fe2;
                    c4078fe2.e();
                }
                c4078fe = R;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4078fe;
    }

    @Override // com.ironsource.AbstractC4121i3
    public int c(C4355v5 c4355v5) {
        return this.Q.a(IronSource.a.REWARDED_VIDEO);
    }

    @Override // com.ironsource.AbstractC4121i3
    public boolean d(C4355v5 c4355v5) {
        int c = c4355v5.c();
        return c == EnumC4373w5.FIRST_INSTANCE.b() || c == EnumC4373w5.INIT_COMPLETE.b() || c == EnumC4373w5.SDK_INIT_FAILED.b() || c == EnumC4373w5.SDK_INIT_SUCCESS.b() || c == EnumC4373w5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.b() || c == EnumC4373w5.RV_BUSINESS_INSTANCE_OPENED.b() || c == EnumC4373w5.RV_INSTANCE_CLOSED.b() || c == EnumC4373w5.RV_BUSINESS_INSTANCE_REWARDED.b() || c == EnumC4373w5.RV_AUCTION_FAILED.b() || c == EnumC4373w5.RV_AUCTION_SUCCESS.b();
    }

    @Override // com.ironsource.AbstractC4121i3
    public String e(int i) {
        return (i == 15 || (i >= 300 && i < 400)) ? this.P : "";
    }

    @Override // com.ironsource.AbstractC4121i3
    public void f(C4355v5 c4355v5) {
        if (c4355v5.c() == 15 || (c4355v5.c() >= 300 && c4355v5.c() < 400)) {
            this.P = c4355v5.b().optString("placement");
        }
    }

    @Override // com.ironsource.AbstractC4121i3
    public boolean j(C4355v5 c4355v5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4121i3
    public void d() {
        fc6.z(EnumC4373w5.RV_BUSINESS_MEDIATION_LOAD, this.J);
        fc6.z(EnumC4373w5.RV_BUSINESS_INSTANCE_LOAD, this.J);
        fc6.z(EnumC4373w5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS, this.J);
        fc6.z(EnumC4373w5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, this.J);
        fc6.z(EnumC4373w5.RV_INSTANCE_LOAD_FAILED, this.J);
        fc6.z(EnumC4373w5.RV_INSTANCE_SHOW_CHANCE, this.J);
        fc6.z(EnumC4373w5.RV_INSTANCE_READY_TRUE, this.J);
        fc6.z(EnumC4373w5.RV_INSTANCE_READY_FALSE, this.J);
        fc6.z(EnumC4373w5.RV_INSTANCE_LOAD_FAILED_REASON, this.J);
        fc6.z(EnumC4373w5.RV_INSTANCE_LOAD_NO_FILL, this.J);
        fc6.z(EnumC4373w5.RV_MEDIATION_LOAD_ERROR, this.J);
    }
}

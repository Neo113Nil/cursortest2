package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import xsna.go9;

/* renamed from: com.ironsource.b0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4233b0 implements InterfaceC4215a0 {
    private final InterfaceC4585uc a;

    /* renamed from: com.ironsource.b0$a */
    public static final class a {
        public static final a a = new a();
        public static final int b = 1000;

        private a() {
        }
    }

    public C4233b0(InterfaceC4585uc interfaceC4585uc) {
        this.a = interfaceC4585uc;
    }

    @Override // com.ironsource.InterfaceC4215a0
    public String a() {
        return this.a.a();
    }

    @Override // com.ironsource.InterfaceC4215a0
    public void a(K9 k9, Map<String, String> map) {
        try {
            this.a.a(k9, new C4621wc(null, false, 3, null));
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.ADAPTER_API.verbose("load ad with identifier: " + k9.e() + " failed. error: " + e.getMessage());
            String b = go9.b("1000: loadAd failed: ", e.getMessage());
            Hc b2 = k9.b();
            if (b2 instanceof C4239b6) {
                ((C4239b6) k9.b()).onInterstitialLoadFailed(b);
            } else if (b2 instanceof Jc) {
                ((Jc) k9.b()).onBannerLoadFail(b);
            }
        }
    }
}

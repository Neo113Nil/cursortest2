package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.dmi;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3992b0 implements InterfaceC3949a0 {

    @NotNull
    private final InterfaceC4326tc a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.b0$a */
    public static final class a {

        @NotNull
        public static final a a = new a();
        public static final int b = 1000;

        private a() {
        }
    }

    public C3992b0(@NotNull InterfaceC4326tc interfaceC4326tc) {
        interfaceC4326tc.getClass();
        this.a = interfaceC4326tc;
    }

    @Override // com.ironsource.InterfaceC3949a0
    public void a(@NotNull J9 j9, @NotNull Map<String, String> map) {
        j9.getClass();
        map.getClass();
        try {
            this.a.a(j9, new C4362vc(null, false, 3, null));
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.ADAPTER_API.verbose("load ad with identifier: " + j9.e() + " failed. error: " + e.getMessage());
            String q = dmi.q("1000: loadAd failed: ", e.getMessage());
            Gc b = j9.b();
            if (b instanceof Y5) {
                Gc b2 = j9.b();
                b2.getClass();
                ((Y5) b2).onInterstitialLoadFailed(q);
            } else if (b instanceof Ic) {
                Gc b3 = j9.b();
                b3.getClass();
                ((Ic) b3).onBannerLoadFail(q);
            }
        }
    }

    @Override // com.ironsource.InterfaceC3949a0
    @NotNull
    public String a() {
        return this.a.a();
    }
}

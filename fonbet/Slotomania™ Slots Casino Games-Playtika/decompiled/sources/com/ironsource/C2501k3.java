package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.k3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2501k3 implements InterfaceC2428g1 {
    private final N3 a;
    private final Ld b;
    private final IronSource.a c;

    /* renamed from: com.ironsource.k3$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public C2501k3(N3 adFormatConfigurations, Ld ld, IronSource.a adFormat) {
        Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.a = adFormatConfigurations;
        this.b = ld;
        this.c = adFormat;
    }

    @Override // com.ironsource.InterfaceC2428g1
    public InterfaceC2525l9 a(Ed providerName) {
        NetworkSettings b;
        C2405ee f;
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Ld ld = this.b;
        if (ld == null || (b = ld.b(providerName.value())) == null) {
            return null;
        }
        int i = a.a[this.c.ordinal()];
        if (i == 1) {
            U2 c = this.a.c();
            if (c != null) {
                return new Z2(new C2392e1(b, b.getBannerSettings(), this.c), c);
            }
            return null;
        }
        if (i != 2) {
            if (i == 3 && (f = this.a.f()) != null) {
                return new Vd(new C2392e1(b, b.getRewardedVideoSettings(), this.c), f);
            }
            return null;
        }
        D9 d = this.a.d();
        if (d != null) {
            return new G9(new C2392e1(b, b.getInterstitialSettings(), this.c), d);
        }
        return null;
    }
}

package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.h3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4103h3 implements InterfaceC4047e1 {

    @NotNull
    private final K3 a;

    @Nullable
    private final Kd b;

    @NotNull
    private final IronSource.a c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.h3$a */
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

    public C4103h3(@NotNull K3 k3, @Nullable Kd kd, @NotNull IronSource.a aVar) {
        k3.getClass();
        aVar.getClass();
        this.a = k3;
        this.b = kd;
        this.c = aVar;
    }

    @Override // com.ironsource.InterfaceC4047e1
    @Nullable
    public InterfaceC4198m9 a(@NotNull Dd dd) {
        NetworkSettings b;
        C4042de f;
        dd.getClass();
        Kd kd = this.b;
        if (kd == null || (b = kd.b(dd.value())) == null) {
            return null;
        }
        int i = a.a[this.c.ordinal()];
        if (i == 1) {
            S2 c = this.a.c();
            if (c != null) {
                return new X2(new C4011c1(b, b.getBannerSettings(), this.c), c);
            }
            return null;
        }
        if (i != 2) {
            if (i == 3 && (f = this.a.f()) != null) {
                return new Ud(new C4011c1(b, b.getRewardedVideoSettings(), this.c), f);
            }
            return null;
        }
        D9 d = this.a.d();
        if (d != null) {
            return new G9(new C4011c1(b, b.getInterstitialSettings(), this.c), d);
        }
        return null;
    }
}

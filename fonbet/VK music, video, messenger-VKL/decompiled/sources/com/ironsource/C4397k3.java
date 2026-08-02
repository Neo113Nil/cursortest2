package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;

/* renamed from: com.ironsource.k3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4397k3 implements InterfaceC4324g1 {
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

    public C4397k3(N3 n3, Ld ld, IronSource.a aVar) {
        this.a = n3;
        this.b = ld;
        this.c = aVar;
    }

    @Override // com.ironsource.InterfaceC4324g1
    public InterfaceC4439m9 a(Ed ed) {
        NetworkSettings b;
        C4301ee f;
        Ld ld = this.b;
        if (ld == null || (b = ld.b(ed.value())) == null) {
            return null;
        }
        int i = a.a[this.c.ordinal()];
        if (i == 1) {
            U2 c = this.a.c();
            if (c != null) {
                return new Z2(new C4288e1(b, b.getBannerSettings(), this.c), c);
            }
            return null;
        }
        if (i != 2) {
            if (i == 3 && (f = this.a.f()) != null) {
                return new Vd(new C4288e1(b, b.getRewardedVideoSettings(), this.c), f);
            }
            return null;
        }
        E9 d = this.a.d();
        if (d != null) {
            return new H9(new C4288e1(b, b.getInterstitialSettings(), this.c), d);
        }
        return null;
    }
}

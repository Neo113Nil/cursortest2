package com.ironsource;

import com.ironsource.mediationsdk.IronSource;

/* renamed from: com.ironsource.q1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4503q1 implements InterfaceC4520r1 {
    private final IronSource.a a;

    /* renamed from: com.ironsource.q1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public C4503q1(IronSource.a aVar) {
        this.a = aVar;
    }

    @Override // com.ironsource.InterfaceC4520r1
    public InterfaceC4538s1 a(InterfaceC4449n1 interfaceC4449n1) {
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            return new D9(interfaceC4449n1);
        }
        if (i == 2) {
            return new C4283de(interfaceC4449n1);
        }
        if (i == 3) {
            return new R2(interfaceC4449n1);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + this.a);
    }
}

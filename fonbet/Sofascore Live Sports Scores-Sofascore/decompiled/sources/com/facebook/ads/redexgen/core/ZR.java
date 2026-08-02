package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class ZR implements TA {
    public static ZR A07;
    public static byte[] A08;
    public InterfaceC1882Lx A00;
    public T1 A01;
    public T9 A02;
    public TP A03;
    public U7 A04;
    public VM A05;
    public CY A06;

    static {
        A07();
    }

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{44, 62, 76, 76, 66, 72, 71, -7, 61, 58, 77, 58, -7, 66, 71, 66, 77, 66, 58, 69, 66, 83, 62, 61, 28, -13, -19, 32, 27, -15, 28, 15, 26, 25, 28, 30, -3, 15, 29, 29, 19, 25, 24, -18, 11, 30, 11, -13, 24, 19, 30, 19, 11, 22, 19, 36, 15, 14};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C2648ge c2648ge) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c2648ge);
        this.A06 = A05(c2648ge, this.A03, A03(c2648ge));
        A09(c2648ge, A00(c2648ge, this.A06));
        A0A(c2648ge, this.A06);
        A0B(c2648ge, this.A06);
        if (this.A06 != null) {
            this.A06.A6d();
        }
    }

    public static SR A00(C2648ge c2648ge, CY cy) {
        if (!C2102Up.A1r(c2648ge) || cy == null) {
            return null;
        }
        return SS.A00().A00(cy);
    }

    public static TP A01(C2648ge c2648ge) {
        return TQ.A00().A00(c2648ge, new C2351bp());
    }

    public static synchronized ZR A02() {
        ZR zr;
        synchronized (ZR.class) {
            if (A07 == null) {
                A07 = new ZR();
            }
            zr = A07;
        }
        return zr;
    }

    public static InterfaceC2603fv A03(C2648ge c2648ge) {
        if (!C2102Up.A1n(c2648ge)) {
            return null;
        }
        return C2621gD.A01(c2648ge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.TA
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized CY A9F() {
        return this.A06;
    }

    public static CY A05(C2648ge c2648ge, TP tp, InterfaceC2603fv interfaceC2603fv) {
        if (!C2102Up.A2m(c2648ge) || interfaceC2603fv == null || ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return AbstractC2644ga.A00().A00(c2648ge, tp, interfaceC2603fv, WI.A04(c2648ge), new ZW(new WA(c2648ge, A06(0, 0, 9), null, EnumC2127Vq.A08, 0, new C2131Vu(), AbstractC2179Xt.A01(C2102Up.A0N(c2648ge)), null, null, new C2771ij()), c2648ge), C2642gY.A00().A00());
    }

    public static void A08() {
        AbstractC2135Vy.A05(A06(30, 28, 52), A06(0, 24, 99), A06(24, 6, 68));
    }

    public static void A09(C2648ge c2648ge, SR sr) {
        if (!C2102Up.A1r(c2648ge) || sr == null) {
            return;
        }
        SP.A00().A00(sr, c2648ge);
    }

    public static void A0A(C2648ge c2648ge, CY cy) {
        if (!C2102Up.A0m(c2648ge) || cy == null) {
            return;
        }
        new C2047Sm(c2648ge, cy, new C2048Sn(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C2648ge c2648ge, CY cy) {
        if (cy == null) {
            return;
        }
        AbstractC2106Ut.A00(c2648ge, cy);
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final VA A6n(C2648ge c2648ge) {
        return WW.A01(c2648ge);
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized T9 A74(T8 t8) {
        if (this.A02 == null) {
            this.A02 = new C2218Zg(this);
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized T1 A7G() {
        if (this.A01 == null) {
            this.A01 = new C2653gj();
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized TP A7l(T8 t8) {
        if (this.A03 == null) {
            this.A03 = A01(t8.A02());
        }
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized InterfaceC2063Tc A7n(T8 t8) {
        return new C2546f0(t8);
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized TB A7x(final T8 t8) {
        return new AbstractC2350bo(t8) { // from class: com.facebook.ads.redexgen.X.72
            @Override // com.facebook.ads.redexgen.core.TB
            public final boolean A9m() {
                return TextureViewSurfaceTextureListenerC1652Cz.A09();
            }

            @Override // com.facebook.ads.redexgen.core.TB
            public final void ACP() {
                U2.A06(C2025Rp.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.core.TB
            public final void ACn() {
                U2.A07(C2025Rp.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.core.TB
            public final void ADI(C2648ge c2648ge) {
                OP.A01(c2648ge);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized InterfaceC1882Lx A8C(T8 t8) {
        if (!C2102Up.A13(t8)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = AbstractC1883Ly.A00().A00(new C2314bE(t8));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized TD A8y(T8 t8) {
        return new C2288ao(t8);
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final C2648ge A8z(Context context) {
        C2648ge sdkContext = T7.A00();
        if (sdkContext == null) {
            C2648ge sdkContext2 = new C2648ge(context, this);
            T7.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized VM A90(C2648ge c2648ge) {
        if (this.A05 == null) {
            this.A05 = new XP(c2648ge);
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized U7 A96() {
        if (this.A04 == null) {
            this.A04 = new U7();
            A08();
        }
        return this.A04;
    }
}

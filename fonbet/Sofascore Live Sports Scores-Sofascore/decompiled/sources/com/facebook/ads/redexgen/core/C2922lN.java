package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.lN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2922lN implements InterfaceC1854Kv {
    public static byte[] A06;
    public int A00;
    public int A01;
    public long A02 = C.TIME_UNSET;
    public boolean A03;
    public final List<LC> A04;
    public final InterfaceC1759Hd[] A05;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 49);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{1, 16, 16, 12, 9, 3, 1, 20, 9, 15, 14, -49, 4, 22, 2, 19, 21, 2, 19};
    }

    public C2922lN(List<LC> list) {
        this.A04 = list;
        this.A05 = new InterfaceC1759Hd[list.size()];
    }

    private boolean A02(C14594v c14594v, int i) {
        if (c14594v.A07() == 0) {
            return false;
        }
        if (c14594v.A0I() != i) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1854Kv
    public final void A5A(C14594v c14594v) {
        if (this.A03) {
            if (this.A00 == 2 && !A02(c14594v, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(c14594v, 0)) {
                return;
            }
            int A09 = c14594v.A09();
            int A07 = c14594v.A07();
            for (InterfaceC1759Hd interfaceC1759Hd : this.A05) {
                c14594v.A0f(A09);
                interfaceC1759Hd.AIr(c14594v, A07);
            }
            int dataPosition = this.A01;
            this.A01 = dataPosition + A07;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1854Kv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A5c(HA ha, LG lg) {
        for (int i = 0; i < i; i++) {
            LC lc = this.A04.get(i);
            lg.A05();
            InterfaceC1759Hd AKS = ha.AKS(lg.A03(), 3);
            AKS.A6e(new C14032p().A0y(lg.A04()).A11(A00(0, 19, 111)).A12(Collections.singletonList(lc.A02)).A10(lc.A01).A14());
            this.A05[i] = AKS;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1854Kv
    public final void AGp() {
        if (this.A03) {
            if (this.A02 != C.TIME_UNSET) {
                for (InterfaceC1759Hd interfaceC1759Hd : this.A05) {
                    interfaceC1759Hd.AIu(this.A02, 1, this.A01, 0, null);
                }
            }
            this.A03 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1854Kv
    public final void AGq(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.A03 = true;
        if (j != C.TIME_UNSET) {
            this.A02 = j;
        }
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1854Kv
    public final void AJ5() {
        this.A03 = false;
        this.A02 = C.TIME_UNSET;
    }
}

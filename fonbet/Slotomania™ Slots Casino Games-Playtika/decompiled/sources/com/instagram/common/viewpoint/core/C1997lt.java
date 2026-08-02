package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.facebook.ads.redexgen.X.lt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1997lt extends AbstractC0851Jb {
    public static byte[] A05;
    public static String[] A06 = {"uV3egKqPt", "vbtXlOI", "gip2ILD7nBGTUOP5yb7zSULibNYEk", "ypzju5tbq0Qdtgd67o3qNaulkzBfCJSX", "gCa1Tkio4U0hXnRqOcWVPONwWAtrpMS5", "m", "OXoEHzgO5FTzqO33f", "i"};
    public int A00;
    public C0806Hh A01;
    public C0808Hj A02;
    public C0852Jc A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C0852Jc A02(C05024v c05024v) throws IOException {
        if (this.A02 == null) {
            this.A02 = AbstractC0809Hk.A06(c05024v);
            return null;
        }
        if (this.A01 == null) {
            this.A01 = AbstractC0809Hk.A04(c05024v);
            return null;
        }
        C0808Hj c0808Hj = this.A02;
        C0806Hh c0806Hh = this.A01;
        byte[] bArr = new byte[c05024v.A0A()];
        System.arraycopy(c05024v.A0l(), 0, bArr, 0, c05024v.A0A());
        return new C0852Jc(c0808Hj, c0806Hh, bArr, AbstractC0809Hk.A0D(c05024v, c0808Hj.A05), AbstractC0809Hk.A00(r6.length - 1));
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 29);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-108, -88, -105, -100, -94, 98, -87, -94, -91, -107, -100, -90};
    }

    static {
        A04();
    }

    public static int A00(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static int A01(byte b, C0852Jc c0852Jc) {
        if (!c0852Jc.A04[A00(b, c0852Jc.A00, 1)].A03) {
            int modeNumber = c0852Jc.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = c0852Jc.A02.A04;
        return modeNumber2;
    }

    public static void A05(C05024v c05024v, long j) {
        if (c05024v.A08() < c05024v.A0A() + 4) {
            c05024v.A0i(Arrays.copyOf(c05024v.A0l(), c05024v.A0A() + 4));
        } else {
            c05024v.A0e(c05024v.A0A() + 4);
        }
        byte[] A0l = c05024v.A0l();
        A0l[c05024v.A0A() - 4] = (byte) (j & 255);
        A0l[c05024v.A0A() - 3] = (byte) ((j >>> 8) & 255);
        A0l[c05024v.A0A() - 2] = (byte) ((j >>> 16) & 255);
        A0l[c05024v.A0A() - 1] = (byte) (255 & (j >>> 24));
    }

    public static boolean A06(C05024v c05024v) {
        try {
            return AbstractC0809Hk.A0C(1, c05024v, true);
        } catch (C3K unused) {
            return false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0851Jb
    public final long A09(C05024v c05024v) {
        int i = 0;
        if ((c05024v.A0l()[0] & 1) == 1) {
            return -1L;
        }
        byte b = c05024v.A0l()[0];
        if (A06[4].charAt(1) != 'C') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[0] = "17tCp0Qcd";
        strArr[6] = "uqZ30DdcDRhFwj0kQ";
        int samplesInPacket = A01(b, (C0852Jc) AbstractC04793y.A02(this.A03));
        if (this.A04) {
            int packetBlockSize = this.A00;
            i = (packetBlockSize + samplesInPacket) / 4;
        }
        A05(c05024v, i);
        this.A04 = true;
        this.A00 = samplesInPacket;
        return i;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0851Jb
    public final void A0A(long j) {
        super.A0A(j);
        this.A04 = j != 0;
        this.A00 = this.A02 != null ? this.A02.A03 : 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0851Jb
    public final void A0B(boolean z) {
        super.A0B(z);
        if (z) {
            this.A03 = null;
            this.A02 = null;
            this.A01 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0851Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(C05024v c05024v, long j, C0850Ja c0850Ja) throws IOException {
        if (this.A03 != null) {
            AbstractC04793y.A01(c0850Ja.A00);
            return false;
        }
        this.A03 = A02(c05024v);
        if (this.A03 == null) {
            return true;
        }
        C0852Jc c0852Jc = this.A03;
        C0808Hj c0808Hj = c0852Jc.A02;
        ArrayList<byte[]> codecInitializationData = new ArrayList<>();
        codecInitializationData.add(c0808Hj.A09);
        codecInitializationData.add(c0852Jc.A03);
        c0850Ja.A00 = new C04462p().A11(A03(0, 12, 22)).A0a(c0808Hj.A02).A0j(c0808Hj.A00).A0b(c0808Hj.A05).A0m(c0808Hj.A06).A12(codecInitializationData).A0v(AbstractC0809Hk.A02(MetaExoPlayerCustomizedCollections.A02(c0852Jc.A01.A02))).A14();
        return true;
    }
}

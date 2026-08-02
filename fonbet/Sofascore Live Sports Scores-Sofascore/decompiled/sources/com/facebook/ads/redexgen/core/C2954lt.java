package com.facebook.ads.redexgen.core;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.setting.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.facebook.ads.redexgen.X.lt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2954lt extends AbstractC1808Jb {
    public static byte[] A05;
    public static String[] A06 = {"uV3egKqPt", "vbtXlOI", "gip2ILD7nBGTUOP5yb7zSULibNYEk", "ypzju5tbq0Qdtgd67o3qNaulkzBfCJSX", "gCa1Tkio4U0hXnRqOcWVPONwWAtrpMS5", InneractiveMediationDefs.GENDER_MALE, "OXoEHzgO5FTzqO33f", i.a};
    public int A00;
    public C1763Hh A01;
    public C1765Hj A02;
    public C1809Jc A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C1809Jc A02(C14594v c14594v) throws IOException {
        if (this.A02 == null) {
            this.A02 = AbstractC1766Hk.A06(c14594v);
            return null;
        }
        if (this.A01 == null) {
            this.A01 = AbstractC1766Hk.A04(c14594v);
            return null;
        }
        C1765Hj c1765Hj = this.A02;
        C1763Hh c1763Hh = this.A01;
        byte[] bArr = new byte[c14594v.A0A()];
        System.arraycopy(c14594v.A0l(), 0, bArr, 0, c14594v.A0A());
        return new C1809Jc(c1765Hj, c1763Hh, bArr, AbstractC1766Hk.A0D(c14594v, c1765Hj.A05), AbstractC1766Hk.A00(r6.length - 1));
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

    public static int A01(byte b, C1809Jc c1809Jc) {
        if (!c1809Jc.A04[A00(b, c1809Jc.A00, 1)].A03) {
            int modeNumber = c1809Jc.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = c1809Jc.A02.A04;
        return modeNumber2;
    }

    public static void A05(C14594v c14594v, long j) {
        if (c14594v.A08() < c14594v.A0A() + 4) {
            c14594v.A0i(Arrays.copyOf(c14594v.A0l(), c14594v.A0A() + 4));
        } else {
            c14594v.A0e(c14594v.A0A() + 4);
        }
        byte[] A0l = c14594v.A0l();
        A0l[c14594v.A0A() - 4] = (byte) (j & 255);
        A0l[c14594v.A0A() - 3] = (byte) ((j >>> 8) & 255);
        A0l[c14594v.A0A() - 2] = (byte) ((j >>> 16) & 255);
        A0l[c14594v.A0A() - 1] = (byte) (255 & (j >>> 24));
    }

    public static boolean A06(C14594v c14594v) {
        try {
            return AbstractC1766Hk.A0C(1, c14594v, true);
        } catch (C3K unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1808Jb
    public final long A09(C14594v c14594v) {
        int i = 0;
        if ((c14594v.A0l()[0] & 1) == 1) {
            return -1L;
        }
        byte b = c14594v.A0l()[0];
        if (A06[4].charAt(1) != 'C') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[0] = "17tCp0Qcd";
        strArr[6] = "uqZ30DdcDRhFwj0kQ";
        int samplesInPacket = A01(b, (C1809Jc) AbstractC14363y.A02(this.A03));
        if (this.A04) {
            int packetBlockSize = this.A00;
            i = (packetBlockSize + samplesInPacket) / 4;
        }
        A05(c14594v, i);
        this.A04 = true;
        this.A00 = samplesInPacket;
        return i;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1808Jb
    public final void A0A(long j) {
        super.A0A(j);
        this.A04 = j != 0;
        this.A00 = this.A02 != null ? this.A02.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1808Jb
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

    @Override // com.facebook.ads.redexgen.core.AbstractC1808Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(C14594v c14594v, long j, C1807Ja c1807Ja) throws IOException {
        if (this.A03 != null) {
            AbstractC14363y.A01(c1807Ja.A00);
            return false;
        }
        this.A03 = A02(c14594v);
        if (this.A03 == null) {
            return true;
        }
        C1809Jc c1809Jc = this.A03;
        C1765Hj c1765Hj = c1809Jc.A02;
        ArrayList<byte[]> codecInitializationData = new ArrayList<>();
        codecInitializationData.add(c1765Hj.A09);
        codecInitializationData.add(c1809Jc.A03);
        c1807Ja.A00 = new C14032p().A11(A03(0, 12, 22)).A0a(c1765Hj.A02).A0j(c1765Hj.A00).A0b(c1765Hj.A05).A0m(c1765Hj.A06).A12(codecInitializationData).A0v(AbstractC1766Hk.A02(MetaExoPlayerCustomizedCollections.A02(c1809Jc.A01.A02))).A14();
        return true;
    }
}

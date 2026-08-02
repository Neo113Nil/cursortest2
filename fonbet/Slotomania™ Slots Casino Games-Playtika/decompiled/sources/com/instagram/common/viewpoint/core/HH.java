package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
/* loaded from: assets/audience_network/classes2.dex */
public abstract class HH {
    public static byte[] A00;
    public static String[] A01 = {"jaTfwC0cI533jMSLFdbnMioREeamNCq8", "oxYS1uYBjADPdRUL4vsR12VppXrr4BxP", "o9bG5hJtiKIeIPN2CaXw8mH6vllsT8Pg", "8s8MZLb5TSIkvuwEDH", "W6kvFYauQlSyWCDb8CQhWvVbWb1Alqwq", "aw37R0CiGakhFrBRrvipxmkRXRxeCTzI", "Y2zfIeYjiYIsjSkQMxD0jwTDeetOAull", "DaiobFePrAznnRWN86LDTmrCW9O2HPvR"};

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{5, 34, 42, 47, 38, 39, 99, 55, 44, 99, 49, 38, 34, 39, 99, 5, Ascii.SI, 2, 0, 99, 48, 55, 49, 38, 34, 46, 99, 46, 34, 49, 40, 38, 49, 109, 125, 82, 73, 72, 79, Ascii.ESC, 93, 73, 90, 86, 94, Ascii.ESC, 95, 84, 94, 72, Ascii.ESC, 85, 84, 79, Ascii.ESC, 72, 79, 90, 73, 79, Ascii.ESC, 76, 82, 79, 83, Ascii.ESC, 72, 66, 85, 88, Ascii.ESC, 88, 84, 95, 94, Ascii.NAK};
    }

    static {
        A08();
    }

    public static int A00(InterfaceC2046ms interfaceC2046ms) throws IOException {
        interfaceC2046ms.AIl();
        C05024v c05024v = new C05024v(2);
        interfaceC2046ms.AGt(c05024v.A0l(), 0, 2);
        int syncCode = c05024v.A0M();
        int frameStartMarker = syncCode >> 2;
        if (frameStartMarker == 16382) {
            interfaceC2046ms.AIl();
            return syncCode;
        }
        interfaceC2046ms.AIl();
        throw C3K.A01(A06(34, 42, 75), null);
    }

    public static Metadata A01(InterfaceC2046ms interfaceC2046ms, boolean z) throws IOException {
        IE id3FramePredicate;
        if (z) {
            id3FramePredicate = null;
        } else {
            id3FramePredicate = C9U.A03;
        }
        Metadata A002 = new HM().A00(interfaceC2046ms, id3FramePredicate);
        if (A002 == null || A002.A02() == 0) {
            return null;
        }
        return A002;
    }

    public static Metadata A02(InterfaceC2046ms interfaceC2046ms, boolean z) throws IOException {
        interfaceC2046ms.AIl();
        long A8i = interfaceC2046ms.A8i();
        Metadata A012 = A01(interfaceC2046ms, z);
        interfaceC2046ms.AK3((int) (interfaceC2046ms.A8i() - A8i));
        return A012;
    }

    public static HI A03(C05024v c05024v) {
        c05024v.A0g(1);
        int A0K = c05024v.A0K();
        int length = c05024v.A09();
        long j = length + A0K;
        int i = A0K / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long A0P = c05024v.A0P();
            if (A0P == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = A0P;
            jArr2[i2] = c05024v.A0P();
            c05024v.A0g(2);
            i2++;
        }
        int length2 = c05024v.A09();
        c05024v.A0g((int) (j - length2));
        return new HI(jArr, jArr2);
    }

    public static HI A04(InterfaceC2046ms interfaceC2046ms, int i) throws IOException {
        C05024v c05024v = new C05024v(i);
        interfaceC2046ms.readFully(c05024v.A0l(), 0, i);
        return A03(c05024v);
    }

    public static HJ A05(InterfaceC2046ms interfaceC2046ms) throws IOException {
        byte[] bArr = new byte[38];
        interfaceC2046ms.readFully(bArr, 0, 38);
        return new HJ(bArr, 4);
    }

    public static List<String> A07(InterfaceC2046ms interfaceC2046ms, int i) throws IOException {
        C05024v c05024v = new C05024v(i);
        interfaceC2046ms.readFully(c05024v.A0l(), 0, i);
        c05024v.A0g(4);
        return Arrays.asList(AbstractC0809Hk.A05(c05024v, false, false).A02);
    }

    public static void A09(InterfaceC2046ms interfaceC2046ms) throws IOException {
        C05024v c05024v = new C05024v(4);
        interfaceC2046ms.readFully(c05024v.A0l(), 0, 4);
        if (c05024v.A0Q() == 1716281667) {
        } else {
            throw C3K.A01(A06(0, 34, 51), null);
        }
    }

    public static boolean A0A(InterfaceC2046ms interfaceC2046ms) throws IOException {
        C05024v c05024v = new C05024v(4);
        interfaceC2046ms.AGt(c05024v.A0l(), 0, 4);
        return c05024v.A0Q() == 1716281667;
    }

    public static boolean A0B(InterfaceC2046ms interfaceC2046ms, HG hg) throws IOException {
        interfaceC2046ms.AIl();
        C05014u c05014u = new C05014u(new byte[4]);
        interfaceC2046ms.AGt(c05014u.A00, 0, 4);
        boolean A0H = c05014u.A0H();
        int A04 = c05014u.A04(7);
        int A042 = c05014u.A04(24) + 4;
        if (A04 == 0) {
            HJ A05 = A05(interfaceC2046ms);
            String[] strArr = A01;
            if (strArr[1].charAt(0) != strArr[2].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "oF2KQg39ZEK5V6OHUZM6u4PkuH0D3J87";
            strArr2[2] = "opWNo3Pnwj2PHBTvqD8r5OWylRW508kK";
            hg.A00 = A05;
        } else {
            HJ hj = hg.A00;
            if (hj != null) {
                if (A04 != 3) {
                    if (A04 == 4) {
                        hg.A00 = hj.A0B(A07(interfaceC2046ms, A042));
                    } else if (A04 == 6) {
                        C05024v c05024v = new C05024v(A042);
                        interfaceC2046ms.readFully(c05024v.A0l(), 0, A042);
                        c05024v.A0g(4);
                        PictureFrame pictureFrame = PictureFrame.A00(c05024v);
                        hg.A00 = hj.A0A(MetaExoPlayerCustomizedCollections.A03(pictureFrame));
                    } else {
                        interfaceC2046ms.AK3(A042);
                    }
                } else {
                    hg.A00 = hj.A09(A04(interfaceC2046ms, A042));
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
        return A0H;
    }
}

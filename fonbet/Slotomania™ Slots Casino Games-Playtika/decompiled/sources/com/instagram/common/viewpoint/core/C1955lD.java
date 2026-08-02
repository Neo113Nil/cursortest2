package com.instagram.common.viewpoint.core;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.lD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1955lD implements H1 {
    public static String[] A02 = {"icMuAGNUwG3qooMsLkIelsXOgqR", "wZwGdqwzUfLFhHeDnVqZXfrekI2t19Nm", "6NjHclQwJEhKen4shQzzT38fKShvFJl3", "cwvHChui6ScrilPVLNLxDwwq1RZibmTM", "KGSyfhH5I6lVnEy0NkdKQy5Ija", "JgLMaajFBM7mBqcCk", "W9ygPHkeZ", ""};
    public final C05024v A00;
    public final AnonymousClass53 A01;

    public C1955lD(AnonymousClass53 anonymousClass53) {
        this.A01 = anonymousClass53;
        this.A00 = new C05024v();
    }

    private C0798Gz A00(C05024v c05024v, long scrValue, long scrTimeUs) {
        int A00;
        int i = -1;
        int i2 = -1;
        long j = C.TIME_UNSET;
        while (c05024v.A07() >= 4) {
            A00 = C1954lC.A00(c05024v.A0l(), c05024v.A09());
            if (A00 != 442) {
                c05024v.A0g(1);
            } else {
                c05024v.A0g(4);
                long A06 = L6.A06(c05024v);
                if (A06 != C.TIME_UNSET) {
                    long A062 = this.A01.A06(A06);
                    if (A062 > scrValue) {
                        if (j == C.TIME_UNSET) {
                            return C0798Gz.A04(A062, scrTimeUs);
                        }
                        return C0798Gz.A03(i + scrTimeUs);
                    }
                    int startOfLastPacketPosition = A02[1].charAt(26);
                    if (startOfLastPacketPosition == 113) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A02;
                    strArr[3] = "JRu5yfiOOmZm3e1j9KGmxzziCqUEhgmX";
                    strArr[2] = "rPvZuTIICj36zhJU166yjphfEhohU7nm";
                    long lastScrTimeUsInRange = 100000 + A062;
                    if (lastScrTimeUsInRange > scrValue) {
                        return C0798Gz.A03(c05024v.A09() + scrTimeUs);
                    }
                    j = A062;
                    i = c05024v.A09();
                }
                A01(c05024v);
                i2 = c05024v.A09();
            }
        }
        if (j != C.TIME_UNSET) {
            return C0798Gz.A05(j, i2 + scrTimeUs);
        }
        return C0798Gz.A03;
    }

    /* JADX WARN: Incorrect condition in loop: B:23:0x005b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A01(C05024v c05024v) {
        int packStuffingLength;
        int packStuffingLength2;
        int systemHeaderLength = c05024v.A0A();
        if (c05024v.A07() < 10) {
            c05024v.A0f(systemHeaderLength);
            return;
        }
        c05024v.A0g(9);
        int limit = c05024v.A0I();
        int packStuffingLength3 = limit & 7;
        int limit2 = c05024v.A07();
        if (limit2 < packStuffingLength3) {
            c05024v.A0f(systemHeaderLength);
            return;
        }
        c05024v.A0g(packStuffingLength3);
        int limit3 = c05024v.A07();
        if (limit3 < 4) {
            c05024v.A0f(systemHeaderLength);
            return;
        }
        byte[] A0l = c05024v.A0l();
        int limit4 = c05024v.A09();
        packStuffingLength = C1954lC.A00(A0l, limit4);
        if (packStuffingLength == 443) {
            c05024v.A0g(4);
            int packStuffingLength4 = c05024v.A0M();
            int limit5 = c05024v.A07();
            if (limit5 < packStuffingLength4) {
                c05024v.A0f(systemHeaderLength);
                return;
            }
            c05024v.A0g(packStuffingLength4);
        }
        while (limit >= 4) {
            byte[] A0l2 = c05024v.A0l();
            int limit6 = c05024v.A09();
            packStuffingLength2 = C1954lC.A00(A0l2, limit6);
            if (packStuffingLength2 == 442 || packStuffingLength2 == 441 || (packStuffingLength2 >>> 8) != 1) {
                return;
            }
            c05024v.A0g(4);
            if (c05024v.A07() < 2) {
                c05024v.A0f(systemHeaderLength);
                return;
            }
            int nextStartCode = c05024v.A0M();
            int packStuffingLength5 = c05024v.A0A();
            int limit7 = c05024v.A09();
            c05024v.A0f(Math.min(packStuffingLength5, limit7 + nextStartCode));
        }
    }

    @Override // com.instagram.common.viewpoint.core.H1
    public final void AFs() {
        this.A00.A0i(C5C.A07);
    }

    @Override // com.instagram.common.viewpoint.core.H1
    public final C0798Gz AIw(InterfaceC2046ms interfaceC2046ms, long j) throws IOException {
        long A8n = interfaceC2046ms.A8n();
        int min = (int) Math.min(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, interfaceC2046ms.A8O() - A8n);
        this.A00.A0d(min);
        interfaceC2046ms.AGt(this.A00.A0l(), 0, min);
        return A00(this.A00, j, A8n);
    }
}

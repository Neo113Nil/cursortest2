package com.bytedance.sdk.openadsdk.of;

import com.bytedance.sdk.openadsdk.of.gpj;
import com.bytedance.sdk.openadsdk.of.hc;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import defpackage.bf3;
import defpackage.lnb;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qf {
    private static final int[] sf = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    static final Charset pcc = StandardCharsets.ISO_8859_1;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.of.qf$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pcc;

        static {
            int[] iArr = new int[gbb.values().length];
            pcc = iArr;
            try {
                iArr[gbb.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pcc[gbb.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                pcc[gbb.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                pcc[gbb.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class pcc {
        private final byte[] pcc;
        private final byte[] sf;

        public pcc(byte[] bArr, byte[] bArr2) {
            this.pcc = bArr;
            this.sf = bArr2;
        }

        public byte[] pcc() {
            return this.pcc;
        }

        public byte[] sf() {
            return this.sf;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0130, code lost:
    
        if (com.bytedance.sdk.openadsdk.of.jr.pcc(r8) != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jr pcc(String str, kj kjVar, Map<wh, ?> map) throws lo {
        boolean z;
        boolean z2;
        gpj pcc2;
        gpj gpjVar;
        com.bytedance.sdk.openadsdk.of.pcc pccVar;
        oo pcc3;
        int i;
        boolean z3 = false;
        if (map != null) {
            wh whVar = wh.GS1_FORMAT;
            if (map.containsKey(whVar) && Boolean.parseBoolean(map.get(whVar).toString())) {
                z = true;
                if (map != null) {
                    wh whVar2 = wh.QR_COMPACT;
                    if (map.containsKey(whVar2) && Boolean.parseBoolean(map.get(whVar2).toString())) {
                        z2 = true;
                        Charset charset = pcc;
                        if (map != null && map.containsKey(wh.CHARACTER_SET)) {
                            z3 = true;
                        }
                        if (z3) {
                            try {
                                charset = Charset.forName(map.get(wh.CHARACTER_SET).toString());
                            } catch (UnsupportedCharsetException unused) {
                            }
                        }
                        if (z2) {
                            gbb gbbVar = gbb.NUMERIC;
                            if (charset.equals(pcc)) {
                                charset = null;
                            }
                            hc.sf pcc4 = hc.pcc(str, null, charset, z, kjVar);
                            pccVar = new com.bytedance.sdk.openadsdk.of.pcc();
                            pcc4.pcc(pccVar);
                            gpjVar = pcc4.sf();
                        } else {
                            gbb pcc5 = pcc(str, charset);
                            com.bytedance.sdk.openadsdk.of.pcc pccVar2 = new com.bytedance.sdk.openadsdk.of.pcc();
                            gbb gbbVar2 = gbb.BYTE;
                            if (pcc5 == gbbVar2 && z3 && (pcc3 = oo.pcc(charset)) != null) {
                                pcc(pcc3, pccVar2);
                            }
                            if (z) {
                                pcc(gbb.FNC1_FIRST_POSITION, pccVar2);
                            }
                            pcc(pcc5, pccVar2);
                            com.bytedance.sdk.openadsdk.of.pcc pccVar3 = new com.bytedance.sdk.openadsdk.of.pcc();
                            pcc(str, pcc5, pccVar3, charset);
                            if (map != null) {
                                wh whVar3 = wh.QR_VERSION;
                                if (map.containsKey(whVar3)) {
                                    pcc2 = gpj.pcc(Integer.parseInt(map.get(whVar3).toString()));
                                    if (!pcc(pcc(pcc5, pccVar2, pccVar3, pcc2), pcc2, kjVar)) {
                                        throw new lo("Data too big for requested version");
                                    }
                                    com.bytedance.sdk.openadsdk.of.pcc pccVar4 = new com.bytedance.sdk.openadsdk.of.pcc();
                                    pccVar4.pcc(pccVar2);
                                    pcc(pcc5 != gbbVar2 ? pccVar3.sf() : str.length(), pcc2, pcc5, pccVar4);
                                    pccVar4.pcc(pccVar3);
                                    gpjVar = pcc2;
                                    pccVar = pccVar4;
                                }
                            }
                            pcc2 = pcc(kjVar, pcc5, pccVar2, pccVar3);
                            com.bytedance.sdk.openadsdk.of.pcc pccVar42 = new com.bytedance.sdk.openadsdk.of.pcc();
                            pccVar42.pcc(pccVar2);
                            pcc(pcc5 != gbbVar2 ? pccVar3.sf() : str.length(), pcc2, pcc5, pccVar42);
                            pccVar42.pcc(pccVar3);
                            gpjVar = pcc2;
                            pccVar = pccVar42;
                        }
                        gpj.sf pcc6 = gpjVar.pcc(kjVar);
                        int sf2 = gpjVar.sf() - pcc6.gm();
                        pcc(sf2, pccVar);
                        com.bytedance.sdk.openadsdk.of.pcc pcc7 = pcc(pccVar, gpjVar.sf(), sf2, pcc6.sf());
                        jr jrVar = new jr();
                        int gm = gpjVar.gm();
                        gm gmVar = new gm(gm, gm);
                        if (map != null) {
                            wh whVar4 = wh.QR_MASK_PATTERN;
                            if (map.containsKey(whVar4)) {
                                i = Integer.parseInt(map.get(whVar4).toString());
                            }
                        }
                        i = -1;
                        if (i == -1) {
                            i = pcc(pcc7, kjVar, gpjVar, gmVar);
                        }
                        tmg.pcc(pcc7, kjVar, gpjVar, i, gmVar);
                        jrVar.pcc(gmVar);
                        return jrVar;
                    }
                }
                z2 = false;
                Charset charset2 = pcc;
                if (map != null) {
                    z3 = true;
                }
                if (z3) {
                }
                if (z2) {
                }
                gpj.sf pcc62 = gpjVar.pcc(kjVar);
                int sf22 = gpjVar.sf() - pcc62.gm();
                pcc(sf22, pccVar);
                com.bytedance.sdk.openadsdk.of.pcc pcc72 = pcc(pccVar, gpjVar.sf(), sf22, pcc62.sf());
                jr jrVar2 = new jr();
                int gm2 = gpjVar.gm();
                gm gmVar2 = new gm(gm2, gm2);
                if (map != null) {
                }
                i = -1;
                if (i == -1) {
                }
                tmg.pcc(pcc72, kjVar, gpjVar, i, gmVar2);
                jrVar2.pcc(gmVar2);
                return jrVar2;
            }
        }
        z = false;
        if (map != null) {
        }
        z2 = false;
        Charset charset22 = pcc;
        if (map != null) {
        }
        if (z3) {
        }
        if (z2) {
        }
        gpj.sf pcc622 = gpjVar.pcc(kjVar);
        int sf222 = gpjVar.sf() - pcc622.gm();
        pcc(sf222, pccVar);
        com.bytedance.sdk.openadsdk.of.pcc pcc722 = pcc(pccVar, gpjVar.sf(), sf222, pcc622.sf());
        jr jrVar22 = new jr();
        int gm22 = gpjVar.gm();
        gm gmVar22 = new gm(gm22, gm22);
        if (map != null) {
        }
        i = -1;
        if (i == -1) {
        }
        tmg.pcc(pcc722, kjVar, gpjVar, i, gmVar22);
        jrVar22.pcc(gmVar22);
        return jrVar22;
    }

    public static void sf(CharSequence charSequence, com.bytedance.sdk.openadsdk.of.pcc pccVar) throws lo {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int pcc2 = pcc(charSequence.charAt(i));
            if (pcc2 == -1) {
                throw new lo();
            }
            int i2 = i + 1;
            if (i2 < length) {
                int pcc3 = pcc(charSequence.charAt(i2));
                if (pcc3 == -1) {
                    throw new lo();
                }
                pccVar.pcc((pcc2 * 45) + pcc3, 11);
                i += 2;
            } else {
                pccVar.pcc(pcc2, 6);
                i = i2;
            }
        }
    }

    private static int pcc(gm gmVar) {
        return vh.pcc(gmVar) + vh.sf(gmVar) + vh.gm(gmVar) + vh.oo(gmVar);
    }

    private static gpj pcc(kj kjVar, gbb gbbVar, com.bytedance.sdk.openadsdk.of.pcc pccVar, com.bytedance.sdk.openadsdk.of.pcc pccVar2) throws lo {
        return pcc(pcc(gbbVar, pccVar, pccVar2, pcc(pcc(gbbVar, pccVar, pccVar2, gpj.pcc(1)), kjVar)), kjVar);
    }

    private static int pcc(gbb gbbVar, com.bytedance.sdk.openadsdk.of.pcc pccVar, com.bytedance.sdk.openadsdk.of.pcc pccVar2, gpj gpjVar) {
        return pccVar2.pcc() + gbbVar.pcc(gpjVar) + pccVar.pcc();
    }

    public static int pcc(int i) {
        int[] iArr = sf;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    private static gbb pcc(String str, Charset charset) {
        Charset charset2 = lu.pcc;
        if (charset2 != null && charset2.equals(charset) && pcc(str)) {
            return gbb.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else {
                if (pcc(charAt) == -1) {
                    return gbb.BYTE;
                }
                z = true;
            }
        }
        if (z) {
            return gbb.ALPHANUMERIC;
        }
        if (z2) {
            return gbb.NUMERIC;
        }
        return gbb.BYTE;
    }

    public static boolean pcc(String str) {
        byte[] bytes = str.getBytes(lu.pcc);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < length; i += 2) {
            int i2 = bytes[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                return false;
            }
        }
        return true;
    }

    private static int pcc(com.bytedance.sdk.openadsdk.of.pcc pccVar, kj kjVar, gpj gpjVar, gm gmVar) throws lo {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            tmg.pcc(pccVar, kjVar, gpjVar, i3, gmVar);
            int pcc2 = pcc(gmVar);
            if (pcc2 < i) {
                i2 = i3;
                i = pcc2;
            }
        }
        return i2;
    }

    private static gpj pcc(int i, kj kjVar) throws lo {
        for (int i2 = 1; i2 <= 40; i2++) {
            gpj pcc2 = gpj.pcc(i2);
            if (pcc(i, pcc2, kjVar)) {
                return pcc2;
            }
        }
        throw new lo("Data too big");
    }

    public static boolean pcc(int i, gpj gpjVar, kj kjVar) {
        return gpjVar.sf() - gpjVar.pcc(kjVar).gm() >= (i + 7) / 8;
    }

    public static void pcc(int i, com.bytedance.sdk.openadsdk.of.pcc pccVar) throws lo {
        int i2 = i * 8;
        if (pccVar.pcc() <= i2) {
            for (int i3 = 0; i3 < 4 && pccVar.pcc() < i2; i3++) {
                pccVar.pcc(false);
            }
            int pcc2 = pccVar.pcc() & 7;
            if (pcc2 > 0) {
                while (pcc2 < 8) {
                    pccVar.pcc(false);
                    pcc2++;
                }
            }
            int sf2 = i - pccVar.sf();
            for (int i4 = 0; i4 < sf2; i4++) {
                pccVar.pcc((i4 & 1) == 0 ? 236 : 17, 8);
            }
            if (pccVar.pcc() != i2) {
                throw new lo("Bits size does not equal capacity");
            }
            return;
        }
        throw new lo("data bits cannot fit in the QR Code" + pccVar.pcc() + " > " + i2);
    }

    public static void pcc(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws lo {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = i9 + 1;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 != i12) {
                throw new lo("EC bytes mismatch");
            }
            if (i3 != i6 + i5) {
                throw new lo("RS blocks mismatch");
            }
            if (i != ((i10 + i12) * i5) + ((i9 + i11) * i6)) {
                throw new lo("Total bytes mismatch");
            }
            if (i4 < i6) {
                iArr[0] = i9;
                iArr2[0] = i11;
                return;
            } else {
                iArr[0] = i10;
                iArr2[0] = i12;
                return;
            }
        }
        throw new lo("Block ID too large");
    }

    public static com.bytedance.sdk.openadsdk.of.pcc pcc(com.bytedance.sdk.openadsdk.of.pcc pccVar, int i, int i2, int i3) throws lo {
        if (pccVar.sf() == i2) {
            ArrayList arrayList = new ArrayList(i3);
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i4 < i3) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                int i8 = i;
                int i9 = i2;
                int i10 = i3;
                pcc(i8, i9, i10, i4, iArr, iArr2);
                int i11 = iArr[0];
                byte[] bArr = new byte[i11];
                pccVar.pcc(i5 * 8, bArr, 0, i11);
                byte[] pcc2 = pcc(bArr, iArr2[0]);
                arrayList.add(new pcc(bArr, pcc2));
                i6 = Math.max(i6, i11);
                i7 = Math.max(i7, pcc2.length);
                i5 += iArr[0];
                i4++;
                i = i8;
                i2 = i9;
                i3 = i10;
            }
            int i12 = i;
            if (i2 == i5) {
                com.bytedance.sdk.openadsdk.of.pcc pccVar2 = new com.bytedance.sdk.openadsdk.of.pcc();
                for (int i13 = 0; i13 < i6; i13++) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        byte[] pcc3 = ((pcc) it.next()).pcc();
                        if (i13 < pcc3.length) {
                            pccVar2.pcc(pcc3[i13], 8);
                        }
                    }
                }
                for (int i14 = 0; i14 < i7; i14++) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        byte[] sf2 = ((pcc) it2.next()).sf();
                        if (i14 < sf2.length) {
                            pccVar2.pcc(sf2[i14], 8);
                        }
                    }
                }
                if (i12 == pccVar2.sf()) {
                    return pccVar2;
                }
                StringBuilder t = lnb.t(i12, "Interleaving error: ", " and ");
                t.append(pccVar2.sf());
                t.append(" differ.");
                throw new lo(t.toString());
            }
            throw new lo("Data bytes does not match offset");
        }
        throw new lo("Number of bits and data bytes does not match");
    }

    public static byte[] pcc(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
        new nac(vy.pcc).pcc(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    public static void pcc(gbb gbbVar, com.bytedance.sdk.openadsdk.of.pcc pccVar) {
        pccVar.pcc(gbbVar.pcc(), 4);
    }

    public static void pcc(int i, gpj gpjVar, gbb gbbVar, com.bytedance.sdk.openadsdk.of.pcc pccVar) throws lo {
        int pcc2 = gbbVar.pcc(gpjVar);
        int i2 = 1 << pcc2;
        if (i < i2) {
            pccVar.pcc(i, pcc2);
            return;
        }
        throw new lo(i + " is bigger than " + (i2 - 1));
    }

    public static void pcc(String str, gbb gbbVar, com.bytedance.sdk.openadsdk.of.pcc pccVar, Charset charset) throws lo {
        int i = AnonymousClass1.pcc[gbbVar.ordinal()];
        if (i == 1) {
            pcc((CharSequence) str, pccVar);
            return;
        }
        if (i == 2) {
            sf(str, pccVar);
        } else if (i == 3) {
            pcc(str, pccVar, charset);
        } else {
            if (i == 4) {
                pcc(str, pccVar);
                return;
            }
            throw new lo("Invalid mode: ".concat(String.valueOf(gbbVar)));
        }
    }

    public static void pcc(CharSequence charSequence, com.bytedance.sdk.openadsdk.of.pcc pccVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                pccVar.pcc(bf3.c(charSequence.charAt(i + 1) - '0', 10, charAt * 100, charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    pccVar.pcc((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    pccVar.pcc(charAt, 4);
                }
            }
        }
    }

    public static void pcc(String str, com.bytedance.sdk.openadsdk.of.pcc pccVar, Charset charset) {
        for (byte b : str.getBytes(charset)) {
            pccVar.pcc(b, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e A[LOOP:0: B:6:0x0011->B:13:0x003e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void pcc(String str, com.bytedance.sdk.openadsdk.of.pcc pccVar) throws lo {
        int i;
        Charset charset = lu.pcc;
        if (charset != null) {
            byte[] bytes = str.getBytes(charset);
            if (bytes.length % 2 == 0) {
                int length = bytes.length - 1;
                for (int i2 = 0; i2 < length; i2 += 2) {
                    int i3 = ((bytes[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bytes[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    int i4 = 33088;
                    if (i3 < 33088 || i3 > 40956) {
                        if (i3 < 57408 || i3 > 60351) {
                            i = -1;
                            if (i == -1) {
                                pccVar.pcc(((i >> 8) * PsExtractor.AUDIO_STREAM) + (i & 255), 13);
                            } else {
                                throw new lo("Invalid byte sequence");
                            }
                        } else {
                            i4 = 49472;
                        }
                    }
                    i = i3 - i4;
                    if (i == -1) {
                    }
                }
                return;
            }
            throw new lo("Kanji byte size not even");
        }
        throw new lo("SJIS Charset not supported on this platform");
    }

    private static void pcc(oo ooVar, com.bytedance.sdk.openadsdk.of.pcc pccVar) {
        pccVar.pcc(gbb.ECI.pcc(), 4);
        pccVar.pcc(ooVar.pcc(), 8);
    }
}

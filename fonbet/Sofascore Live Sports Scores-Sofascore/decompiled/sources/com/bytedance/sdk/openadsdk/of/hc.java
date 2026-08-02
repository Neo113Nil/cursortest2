package com.bytedance.sdk.openadsdk.of;

import defpackage.a70;
import defpackage.lnb;
import defpackage.mz1;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class hc {
    private final vj gm;
    private final kj oo;
    private final String pcc;
    private final boolean sf;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.of.hc$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pcc;
        static final /* synthetic */ int[] sf;

        static {
            int[] iArr = new int[gbb.values().length];
            sf = iArr;
            try {
                iArr[gbb.KANJI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                sf[gbb.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                sf[gbb.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                sf[gbb.BYTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                sf[gbb.ECI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[gm.values().length];
            pcc = iArr2;
            try {
                iArr2[gm.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                pcc[gm.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                pcc[gm.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum gm {
        SMALL("version 1-9"),
        MEDIUM("version 10-26"),
        LARGE("version 27-40");

        gm(String str) {
        }
    }

    public hc(String str, Charset charset, boolean z, kj kjVar) {
        this.pcc = str;
        this.sf = z;
        this.gm = new vj(str, charset, -1);
        this.oo = kjVar;
    }

    public static gm sf(gpj gpjVar) {
        return gpjVar.pcc() <= 9 ? gm.SMALL : gpjVar.pcc() <= 26 ? gm.MEDIUM : gm.LARGE;
    }

    public sf gm(gpj gpjVar) throws lo {
        int length = this.pcc.length();
        pcc[][][] pccVarArr = (pcc[][][]) Array.newInstance((Class<?>) pcc.class, length + 1, this.gm.pcc(), 4);
        pcc(gpjVar, pccVarArr, 0, null);
        for (int i = 1; i <= length; i++) {
            for (int i2 = 0; i2 < this.gm.pcc(); i2++) {
                for (int i3 = 0; i3 < 4; i3++) {
                    pcc pccVar = pccVarArr[i][i2][i3];
                    if (pccVar != null && i < length) {
                        pcc(gpjVar, pccVarArr, i, pccVar);
                    }
                }
            }
        }
        int i4 = -1;
        int i5 = Integer.MAX_VALUE;
        int i6 = -1;
        for (int i7 = 0; i7 < this.gm.pcc(); i7++) {
            for (int i8 = 0; i8 < 4; i8++) {
                pcc pccVar2 = pccVarArr[length][i7][i8];
                if (pccVar2 != null && pccVar2.qf < i5) {
                    i5 = pccVar2.qf;
                    i4 = i7;
                    i6 = i8;
                }
            }
        }
        if (i4 >= 0) {
            return new sf(gpjVar, pccVarArr[length][i4][i6]);
        }
        throw new lo(mz1.o(new StringBuilder("Internal error: failed to encode \""), this.pcc, "\""));
    }

    public void pcc(gpj gpjVar, pcc[][][] pccVarArr, int i, pcc pccVar) {
        int i2;
        int pcc2 = this.gm.pcc();
        int sf2 = this.gm.sf();
        if (sf2 < 0 || !this.gm.pcc(this.pcc.charAt(i), sf2)) {
            sf2 = 0;
        } else {
            pcc2 = sf2 + 1;
        }
        int i3 = pcc2;
        for (int i4 = sf2; i4 < i3; i4++) {
            if (this.gm.pcc(this.pcc.charAt(i), i4)) {
                pcc(pccVarArr, i, new pcc(this, gbb.BYTE, i, i4, 1, pccVar, gpjVar, null));
            }
        }
        gbb gbbVar = gbb.KANJI;
        if (pcc(gbbVar, this.pcc.charAt(i))) {
            pcc(pccVarArr, i, new pcc(this, gbbVar, i, 0, 1, pccVar, gpjVar, null));
        }
        int length = this.pcc.length();
        gbb gbbVar2 = gbb.ALPHANUMERIC;
        int i5 = 2;
        if (pcc(gbbVar2, this.pcc.charAt(i))) {
            int i6 = i + 1;
            pcc(pccVarArr, i, new pcc(this, gbbVar2, i, 0, (i6 >= length || !pcc(gbbVar2, this.pcc.charAt(i6))) ? 1 : 2, pccVar, gpjVar, null));
        }
        gbb gbbVar3 = gbb.NUMERIC;
        if (pcc(gbbVar3, this.pcc.charAt(i))) {
            int i7 = i + 1;
            if (i7 >= length || !pcc(gbbVar3, this.pcc.charAt(i7))) {
                i2 = 1;
            } else {
                int i8 = i + 2;
                if (i8 < length && pcc(gbbVar3, this.pcc.charAt(i8))) {
                    i5 = 3;
                }
                i2 = i5;
            }
            pcc(pccVarArr, i, new pcc(this, gbbVar3, i, 0, i2, pccVar, gpjVar, null));
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class sf {
        private final gpj gm;
        private final List<pcc> sf = new ArrayList();

        public sf(gpj gpjVar, pcc pccVar) {
            int i;
            int i2;
            int i3;
            pcc pccVar2 = pccVar;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (pccVar2 == null) {
                    break;
                }
                int i6 = i4 + pccVar2.vj;
                pcc pccVar3 = pccVar2.wh;
                boolean z = (pccVar2.sf == gbb.BYTE && pccVar3 == null && pccVar2.oo != 0) || !(pccVar3 == null || pccVar2.oo == pccVar3.oo);
                i = z ? 1 : i5;
                if (pccVar3 == null || pccVar3.sf != pccVar2.sf || z) {
                    this.sf.add(0, new pcc(pccVar2.sf, pccVar2.gm, pccVar2.oo, i6));
                    i3 = 0;
                } else {
                    i3 = i6;
                }
                if (z) {
                    this.sf.add(0, new pcc(gbb.ECI, pccVar2.gm, pccVar2.oo, 0));
                }
                i5 = i;
                pccVar2 = pccVar3;
                i4 = i3;
            }
            if (hc.this.sf) {
                pcc pccVar4 = this.sf.get(0);
                if (pccVar4 != null) {
                    gbb gbbVar = pccVar4.sf;
                    int i7 = i5;
                    gbb gbbVar2 = gbb.ECI;
                    if (gbbVar != gbbVar2 && i7 != 0) {
                        this.sf.add(0, new pcc(gbbVar2, 0, 0, 0));
                    }
                }
                this.sf.add(this.sf.get(0).sf == gbb.ECI ? 1 : 0, new pcc(gbb.FNC1_FIRST_POSITION, 0, 0, 0));
            }
            int pcc2 = gpjVar.pcc();
            int i8 = AnonymousClass1.pcc[hc.sf(gpjVar).ordinal()];
            if (i8 == 1) {
                i2 = 9;
            } else if (i8 != 2) {
                i = 27;
                i2 = 40;
            } else {
                i = 10;
                i2 = 26;
            }
            int pcc3 = pcc(gpjVar);
            while (pcc2 < i2 && !qf.pcc(pcc3, gpj.pcc(pcc2), hc.this.oo)) {
                pcc2++;
            }
            while (pcc2 > i && qf.pcc(pcc3, gpj.pcc(pcc2 - 1), hc.this.oo)) {
                pcc2--;
            }
            this.gm = gpj.pcc(pcc2);
        }

        private int pcc(gpj gpjVar) {
            Iterator<pcc> it = this.sf.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += it.next().pcc(gpjVar);
            }
            return i;
        }

        public gpj sf() {
            return this.gm;
        }

        public int pcc() {
            return pcc(this.gm);
        }

        public void pcc(com.bytedance.sdk.openadsdk.of.pcc pccVar) throws lo {
            Iterator<pcc> it = this.sf.iterator();
            while (it.hasNext()) {
                it.next().pcc(pccVar);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public final class pcc {
            private final int gm;
            private final int oo;
            private final gbb sf;
            private final int vj;

            public pcc(gbb gbbVar, int i, int i2, int i3) {
                this.sf = gbbVar;
                this.gm = i;
                this.oo = i2;
                this.vj = i3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void pcc(com.bytedance.sdk.openadsdk.of.pcc pccVar) throws lo {
                pccVar.pcc(this.sf.pcc(), 4);
                if (this.vj > 0) {
                    pccVar.pcc(pcc(), this.sf.pcc(sf.this.gm));
                }
                if (this.sf == gbb.ECI) {
                    pccVar.pcc(hc.this.gm.sf(this.oo), 8);
                } else if (this.vj > 0) {
                    String str = hc.this.pcc;
                    int i = this.gm;
                    qf.pcc(str.substring(i, this.vj + i), this.sf, pccVar, hc.this.gm.pcc(this.oo));
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public int pcc(gpj gpjVar) {
                int i;
                int pcc = this.sf.pcc(gpjVar);
                int i2 = pcc + 4;
                int i3 = AnonymousClass1.sf[this.sf.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = this.vj;
                        return lnb.d(i4, 2, 11, i2) + (i4 % 2 == 1 ? 6 : 0);
                    }
                    if (i3 == 3) {
                        int i5 = this.vj;
                        int d = lnb.d(i5, 3, 10, i2);
                        int i6 = i5 % 3;
                        if (i6 == 1) {
                            r3 = 4;
                        } else if (i6 == 2) {
                            r3 = 7;
                        }
                        return d + r3;
                    }
                    if (i3 != 4) {
                        return i3 != 5 ? i2 : pcc + 12;
                    }
                    i = pcc() * 8;
                } else {
                    i = this.vj * 13;
                }
                return i + i2;
            }

            private int pcc() {
                if (this.sf != gbb.BYTE) {
                    return this.vj;
                }
                vj vjVar = hc.this.gm;
                String str = hc.this.pcc;
                int i = this.gm;
                return vjVar.pcc(str.substring(i, this.vj + i), this.oo).length;
            }
        }
    }

    public static boolean sf(char c) {
        return qf.pcc(String.valueOf(c));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class pcc {
        private final int gm;
        private final int oo;
        private final int qf;
        private final gbb sf;
        private final int vj;
        private final pcc wh;

        private pcc(gbb gbbVar, int i, int i2, int i3, pcc pccVar, gpj gpjVar) {
            this.sf = gbbVar;
            this.gm = i;
            gbb gbbVar2 = gbb.BYTE;
            int i4 = (gbbVar == gbbVar2 || pccVar == null) ? i2 : pccVar.oo;
            this.oo = i4;
            this.vj = i3;
            this.wh = pccVar;
            boolean z = false;
            int i5 = pccVar != null ? pccVar.qf : 0;
            if ((gbbVar == gbbVar2 && pccVar == null && i4 != 0) || (pccVar != null && i4 != pccVar.oo)) {
                z = true;
            }
            i5 = (pccVar == null || gbbVar != pccVar.sf || z) ? i5 + gbbVar.pcc(gpjVar) + 4 : i5;
            int i6 = AnonymousClass1.sf[gbbVar.ordinal()];
            if (i6 == 1) {
                i5 += 13;
            } else if (i6 == 2) {
                i5 += i3 == 1 ? 6 : 11;
            } else if (i6 == 3) {
                i5 += i3 != 1 ? i3 == 2 ? 7 : 10 : 4;
            } else if (i6 == 4) {
                i5 += hc.this.gm.pcc(hc.this.pcc.substring(i, i3 + i), i2).length * 8;
                if (z) {
                    i5 += 12;
                }
            }
            this.qf = i5;
        }

        public /* synthetic */ pcc(hc hcVar, gbb gbbVar, int i, int i2, int i3, pcc pccVar, gpj gpjVar, AnonymousClass1 anonymousClass1) {
            this(gbbVar, i, i2, i3, pccVar, gpjVar);
        }
    }

    public static boolean gm(char c) {
        return qf.pcc(c) != -1;
    }

    public static sf pcc(String str, gpj gpjVar, Charset charset, boolean z, kj kjVar) throws lo {
        return new hc(str, charset, z, kjVar).pcc(gpjVar);
    }

    public sf pcc(gpj gpjVar) throws lo {
        if (gpjVar == null) {
            gpj[] gpjVarArr = {pcc(gm.SMALL), pcc(gm.MEDIUM), pcc(gm.LARGE)};
            sf[] sfVarArr = {gm(gpjVarArr[0]), gm(gpjVarArr[1]), gm(gpjVarArr[2])};
            int i = Integer.MAX_VALUE;
            int i2 = -1;
            for (int i3 = 0; i3 < 3; i3++) {
                int pcc2 = sfVarArr[i3].pcc();
                if (qf.pcc(pcc2, gpjVarArr[i3], this.oo) && pcc2 < i) {
                    i2 = i3;
                    i = pcc2;
                }
            }
            if (i2 >= 0) {
                return sfVarArr[i2];
            }
            throw new lo("Data too big for any version");
        }
        sf gm2 = gm(gpjVar);
        if (qf.pcc(gm2.pcc(), pcc(sf(gm2.sf())), this.oo)) {
            return gm2;
        }
        throw new lo("Data too big for version".concat(String.valueOf(gpjVar)));
    }

    public static gpj pcc(gm gmVar) {
        int i = AnonymousClass1.pcc[gmVar.ordinal()];
        if (i == 1) {
            return gpj.pcc(9);
        }
        if (i != 2) {
            return gpj.pcc(40);
        }
        return gpj.pcc(26);
    }

    public boolean pcc(gbb gbbVar, char c) {
        int i = AnonymousClass1.sf[gbbVar.ordinal()];
        if (i == 1) {
            return sf(c);
        }
        if (i == 2) {
            return gm(c);
        }
        if (i != 3) {
            return i == 4;
        }
        return pcc(c);
    }

    public static int pcc(gbb gbbVar) {
        int i;
        if (gbbVar == null || (i = AnonymousClass1.sf[gbbVar.ordinal()]) == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        a70.r("Illegal mode ".concat(String.valueOf(gbbVar)));
        return 0;
    }

    public void pcc(pcc[][][] pccVarArr, int i, pcc pccVar) {
        pcc[] pccVarArr2 = pccVarArr[i + pccVar.vj][pccVar.oo];
        int pcc2 = pcc(pccVar.sf);
        pcc pccVar2 = pccVarArr2[pcc2];
        if (pccVar2 == null || pccVar2.qf > pccVar.qf) {
            pccVarArr2[pcc2] = pccVar;
        }
    }

    public static boolean pcc(char c) {
        return c >= '0' && c <= '9';
    }
}

package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.i.hy;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public class hz extends hy {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private int f2444;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private boolean f2445;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private final List<Class> f2446;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Class f2447;

    public hz() {
        ArrayList arrayList = new ArrayList();
        this.f2446 = arrayList;
        super.mo7879();
        this.f2447 = null;
        this.f2444 = 0;
        this.f2445 = true;
        arrayList.clear();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hy
    /* renamed from: ﾇ */
    protected final void mo7879() {
        super.mo7879();
        this.f2447 = null;
        this.f2444 = 0;
        this.f2445 = true;
        this.f2446.clear();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m7889(Class cls) {
        this.f2447 = cls;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final Class m7888() {
        return this.f2447;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final int m7885() {
        return this.f2444;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final boolean m7886() {
        return this.f2445;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final List<Class> m7887() {
        return this.f2446;
    }

    public static class d extends hy.e implements ch {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f2448 = 0;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f2449 = {'#', 'Z', 'a', '\\', 'j', 't', 'f', GMTDateParser.DAY_OF_MONTH, 'l', 'l', 'k', 'i', 'k', '#', AbstractJsonLexerKt.BEGIN_LIST, 'l', 'j', 'o', GMTDateParser.SECONDS, 'k', GMTDateParser.HOURS, GMTDateParser.HOURS, 'g', '0', 'b', GMTDateParser.DAY_OF_MONTH, 'X', '^', 'i', 'f', 'g', 'g', 'g', 'k', 'r', 'c', 'a', '\\', AbstractJsonLexerKt.BEGIN_LIST, GMTDateParser.HOURS, 'g', 'p', 'l', GMTDateParser.DAY_OF_MONTH, 'K', 142, 137, '|', Ascii.MAX, 132, 136, 150, 142, 143, 142, 139, 138, 142, 151, 151, 144, 135, '2', 'c', 'k', 'o', 'j', '#', 'W', 'g', GMTDateParser.HOURS, GMTDateParser.HOURS, 'T', 'T', 'e', 'g', 'k', 'k', 'n', 'n', 'l', 'n', '4', 'k', 'k', 'n', 'n', 'l', 'n', 'G', 'G', 'g', 'j', 'n', 'o', GMTDateParser.MINUTES, 'B', 'F', 'i', 'l', 'n', 'k', 'i', 'B', '#', '6', AbstractJsonLexerKt.BEGIN_LIST, 'r', 'p', 'p', 'I', 'K', 'o', GMTDateParser.HOURS, 'j', GMTDateParser.HOURS, 'B', 'B', 'n', 'n', GMTDateParser.DAY_OF_MONTH, 'l', 't', 'n', 'k', 'j', 'C', '3', 'W', 'g', GMTDateParser.HOURS, GMTDateParser.HOURS, 'T', 'T', 'e', 19};

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int[] f2450 = {612602539, 1761701510, 601469592, -1810414679, 1993131598, -486571713, 1896110929, -1512174107, -1665874470, -1760473536, 1775118849, -1409008439, 734614981, -363799126, -1739301268, -1965992856, 1048739070, 1085830734};

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f2451 = 1;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private hz f2452 = new hz();

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final d m7897(Class cls) {
            int i = 2 % 2;
            int i2 = f2448 + 17;
            f2451 = i2 % 128;
            int i3 = i2 % 2;
            this.f2452.f2447 = cls;
            int i4 = f2448 + 39;
            f2451 = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private d m7894(int i) {
            int i2 = 2 % 2;
            int i3 = f2451 + 113;
            f2448 = i3 % 128;
            if (i3 % 2 == 0) {
                this.f2452.f2444 = i;
                int i4 = f2448 + 71;
                f2451 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 21 / 0;
                }
                return this;
            }
            this.f2452.f2444 = i;
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private d m7895(boolean z) {
            int i = 2 % 2;
            int i2 = f2451 + 63;
            f2448 = i2 % 128;
            int i3 = i2 % 2;
            this.f2452.f2445 = z;
            int i4 = f2451 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f2448 = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final d m7898(int i) {
            int i2 = 2 % 2;
            int i3 = f2451 + 109;
            f2448 = i3 % 128;
            int i4 = i3 % 2;
            hz hzVar = this.f2452;
            hzVar.f2443 = i | hzVar.f2443;
            int i5 = f2451 + 113;
            f2448 = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final d m7899(int i) {
            int i2 = 2 % 2;
            int i3 = f2451 + 19;
            f2448 = i3 % 128;
            int i4 = i3 % 2;
            hz hzVar = this.f2452;
            hzVar.f2442 = i | hzVar.f2442;
            int i5 = f2448 + 81;
            f2451 = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private d m7890(boolean z, int i) {
            int i2 = 2 % 2;
            int i3 = f2451 + 57;
            f2448 = i3 % 128;
            if (i3 % 2 == 0) {
                this.f2452.f2441 = z;
                this.f2452.f2440 = i;
                return this;
            }
            this.f2452.f2441 = z;
            this.f2452.f2440 = i;
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private d m7893(Class cls) {
            int i = 2 % 2;
            int i2 = f2448 + 7;
            f2451 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f2452.f2446.add(cls);
                int i3 = f2451 + 73;
                f2448 = i3 % 128;
                int i4 = i3 % 2;
                return this;
            }
            this.f2452.f2446.add(cls);
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private d m7892() {
            int i = 2 % 2;
            int i2 = f2448 + 113;
            f2451 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f2452.mo7879();
                return this;
            }
            this.f2452.mo7879();
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final hz m7900() {
            int i = 2 % 2;
            int i2 = f2451 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            int i3 = i2 % 128;
            f2448 = i3;
            int i4 = i2 % 2;
            hz hzVar = this.f2452;
            int i5 = i3 + 15;
            f2451 = i5 % 128;
            int i6 = i5 % 2;
            return hzVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0121, code lost:
        
            if (r18.equals(m7896("\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001", new int[]{0, 13, 0, 10}, true).intern()) != false) goto L36;
         */
        @Override // com.ironsource.adqualitysdk.sdk.i.ch
        /* renamed from: ﻛ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo6381(cl clVar, String str, List<Object> list, ck ckVar, ee eeVar) {
            cl clVar2;
            char c = 2;
            int i = 2 % 2;
            try {
                switch (str.hashCode()) {
                    case -1347544616:
                        if (str.equals(m7891(new int[]{-168963793, 744954533, -1169613120, -1488802159, 1758020809, 1084100311, -1730674449, 322704113, -1657080263, 806865087}, 19 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                            break;
                        }
                        c = 65535;
                        break;
                    case -923635536:
                        break;
                    case -216533736:
                        if (str.equals(m7896("\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000", new int[]{13, 10, 0, 5}, true).intern())) {
                            int i2 = f2451 + 71;
                            f2448 = i2 % 128;
                            if (i2 % 2 == 0) {
                                c = 1;
                                break;
                            }
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 94094958:
                        if (str.equals(m7896("\u0000\u0000\u0001\u0000\u0001", new int[]{62, 5, 0, 1}, false).intern())) {
                            int i3 = f2448 + 7;
                            f2451 = i3 % 128;
                            int i4 = i3 % 2;
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 108404047:
                        if (!(!str.equals(m7891(new int[]{342775418, 637992865, -976101883, -1059381323}, 5 - Color.alpha(0)).intern()))) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 387034026:
                        if (str.equals(m7896("\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000", new int[]{44, 18, 36, 15}, false).intern())) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 391966482:
                        if (str.equals(m7896("\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{23, 21, 0, 0}, false).intern())) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1067445448:
                        if (str.equals(m7891(new int[]{1130721379, 1078220809, 289410601, 1087888267, -1657319901, 435454244, 802322023, -901285114}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15).intern())) {
                            int i5 = f2448 + 53;
                            f2451 = i5 % 128;
                            if (i5 % 2 != 0) {
                                c = 6;
                                break;
                            } else {
                                c = '+';
                                break;
                            }
                        }
                        c = 65535;
                        break;
                    case 1423210564:
                        if (str.equals(m7891(new int[]{-1319195344, 2070583741, -912056268, -670389985, -8919721, -1000428002, -658567375, 1626940787, -1389296846, 107690368, -1365819259, 432686635}, AndroidCharacter.getMirror('0') - 27).intern())) {
                            c = 4;
                            break;
                        } else {
                            c = 65535;
                            break;
                        }
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        return m7897((Class) m7365(list, 0, Class.class));
                    case 1:
                        return m7894(((Integer) m7365(list, 0, Integer.class)).intValue());
                    case 2:
                        return m7895(((Boolean) m7365(list, 0, Boolean.class)).booleanValue());
                    case 3:
                        return m7898(((Integer) m7365(list, 0, Integer.class)).intValue());
                    case 4:
                        return m7899(((Integer) m7365(list, 0, Integer.class)).intValue());
                    case 5:
                        return m7890(((Boolean) m7365(list, 0, Boolean.class)).booleanValue(), list.size() > 1 ? ((Integer) m7365(list, 1, Integer.class)).intValue() : -1);
                    case 6:
                        return m7893((Class) m7365(list, 0, Class.class));
                    case 7:
                        return m7892();
                    case '\b':
                        return m7900();
                    default:
                        clVar2 = clVar;
                        try {
                            new ds(clVar2, eeVar, m7896("\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001", new int[]{67, 15, 0, 0}, false).intern(), str).m7593(clVar2.m7203());
                            return null;
                        } catch (Exception e) {
                            e = e;
                            break;
                        }
                }
            } catch (Exception e2) {
                e = e2;
                clVar2 = clVar;
            }
            cn.m7268(clVar2.m7203(), new StringBuilder().append(m7896("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001", new int[]{82, 53, 0, 23}, false).intern()).append(str).append(m7896("\u0001", new int[]{135, 1, 0, 0}, true).intern()).toString(), e);
            return null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static String m7896(String str, int[] iArr, boolean z) {
            String str2;
            byte[] bArr = str;
            if (str != null) {
                bArr = str.getBytes(C.ISO88591_NAME);
            }
            byte[] bArr2 = bArr;
            synchronized (h.f2286) {
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = iArr[2];
                int i4 = iArr[3];
                char[] cArr = new char[i2];
                System.arraycopy(f2449, i, cArr, 0, i2);
                if (bArr2 != null) {
                    char[] cArr2 = new char[i2];
                    h.f2287 = 0;
                    char c = 0;
                    while (h.f2287 < i2) {
                        if (bArr2[h.f2287] == 1) {
                            cArr2[h.f2287] = (char) (((cArr[h.f2287] << 1) + 1) - c);
                        } else {
                            cArr2[h.f2287] = (char) ((cArr[h.f2287] << 1) - c);
                        }
                        c = cArr2[h.f2287];
                        h.f2287++;
                    }
                    cArr = cArr2;
                }
                if (i4 > 0) {
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr, 0, cArr3, 0, i2);
                    int i5 = i2 - i4;
                    System.arraycopy(cArr3, 0, cArr, i5, i4);
                    System.arraycopy(cArr3, i4, cArr, 0, i5);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    h.f2287 = 0;
                    while (h.f2287 < i2) {
                        cArr4[h.f2287] = cArr[(i2 - h.f2287) - 1];
                        h.f2287++;
                    }
                    cArr = cArr4;
                }
                if (i3 > 0) {
                    h.f2287 = 0;
                    while (h.f2287 < i2) {
                        cArr[h.f2287] = (char) (cArr[h.f2287] - iArr[2]);
                        h.f2287++;
                    }
                }
                str2 = new String(cArr);
            }
            return str2;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static String m7891(int[] iArr, int i) {
            String str;
            synchronized (a.f86) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2450.clone();
                a.f83 = 0;
                while (a.f83 < iArr.length) {
                    cArr[0] = (char) (iArr[a.f83] >> 16);
                    cArr[1] = (char) iArr[a.f83];
                    cArr[2] = (char) (iArr[a.f83 + 1] >> 16);
                    cArr[3] = (char) iArr[a.f83 + 1];
                    a.f84 = (cArr[0] << 16) + cArr[1];
                    a.f85 = (cArr[2] << 16) + cArr[3];
                    a.m5773(iArr2);
                    for (int i2 = 0; i2 < 16; i2++) {
                        int i3 = a.f84 ^ iArr2[i2];
                        a.f84 = i3;
                        a.f85 = a.m5774(i3) ^ a.f85;
                        int i4 = a.f84;
                        a.f84 = a.f85;
                        a.f85 = i4;
                    }
                    int i5 = a.f84;
                    a.f84 = a.f85;
                    a.f85 = i5;
                    a.f85 = i5 ^ iArr2[16];
                    a.f84 ^= iArr2[17];
                    int i6 = a.f84;
                    int i7 = a.f85;
                    cArr[0] = (char) (a.f84 >>> 16);
                    cArr[1] = (char) a.f84;
                    cArr[2] = (char) (a.f85 >>> 16);
                    cArr[3] = (char) a.f85;
                    a.m5773(iArr2);
                    cArr2[a.f83 << 1] = cArr[0];
                    cArr2[(a.f83 << 1) + 1] = cArr[1];
                    cArr2[(a.f83 << 1) + 2] = cArr[2];
                    cArr2[(a.f83 << 1) + 3] = cArr[3];
                    a.f83 += 2;
                }
                str = new String(cArr2, 0, i);
            }
            return str;
        }
    }
}

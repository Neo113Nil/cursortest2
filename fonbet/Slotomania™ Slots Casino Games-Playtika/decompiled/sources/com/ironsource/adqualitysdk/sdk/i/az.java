package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;

/* loaded from: classes3.dex */
public final class az {

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f616 = 1;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f617;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int[] f618 = {455223294, -736123933, -1603527667, -1128342658, -1596813003, -1827028241, -664626200, 1704613885, 1503993505, -322766345, -1852325636, 672285885, -470105997, 1430502983, 900694578, -668460477, 2078601704, -1545452048};

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static long f619 = -4924610577456800240L;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private String f620;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private a f621 = a.f643;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private b f622 = b.f650;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f623;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f624;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f625;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f626;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f627;

    public enum a {
        f643,
        f642,
        f641,
        f639,
        f640,
        f634;


        /* renamed from: ﭖ, reason: contains not printable characters */
        private static int f630 = 1;

        /* renamed from: ﭴ, reason: contains not printable characters */
        private static byte[] f631;

        /* renamed from: ﮉ, reason: contains not printable characters */
        private static short[] f632;

        /* renamed from: ﮌ, reason: contains not printable characters */
        private static int f633;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f635;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int f636;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static int f637;

        /* renamed from: ﻛ, reason: contains not printable characters */
        static void m6263() {
            f637 = -1966716893;
            f636 = 8;
            f635 = 1283333153;
            f631 = new byte[]{-5, -55, -84, 0, -21, 63, 67, 63, -39, 57, -23, 4, 122, 6, 108, Ascii.DC2, 126, 8, 121, 118, 8, 120, 6, -6, Ascii.FF, 0, -70, -68, -115, -124, -87, -115, Byte.MIN_VALUE, -3, -101, -63, -98, -111};
        }

        public static a valueOf(String str) {
            int i = 2 % 2;
            int i2 = f630 + 85;
            f633 = i2 % 128;
            int i3 = i2 % 2;
            a aVar = (a) Enum.valueOf(a.class, str);
            if (i3 != 0) {
                int i4 = 24 / 0;
            }
            int i5 = f630 + 13;
            f633 = i5 % 128;
            int i6 = i5 % 2;
            return aVar;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            int i = 2 % 2;
            int i2 = f633 + 13;
            f630 = i2 % 128;
            int i3 = i2 % 2;
            a[] aVarArr = (a[]) values().clone();
            int i4 = f630 + 41;
            f633 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 94 / 0;
            }
            return aVarArr;
        }

        static {
            m6263();
            int i = f630 + 13;
            f633 = i % 128;
            int i2 = i % 2;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static String m6262(short s, int i, int i2, int i3, byte b) {
            String obj;
            synchronized (n.f3088) {
                StringBuilder sb = new StringBuilder();
                int i4 = f636;
                int i5 = i2 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f631;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f637 + i3] + i4);
                    } else {
                        i5 = (short) (f632[f637 + i3] + i4);
                    }
                }
                if (i5 > 0) {
                    n.f3090 = ((i3 + i5) - 2) + f637 + i6;
                    n.f3091 = b;
                    n.f3092 = (char) (i + f635);
                    sb.append(n.f3092);
                    n.f3093 = n.f3092;
                    n.f3089 = 1;
                    while (n.f3089 < i5) {
                        byte[] bArr2 = f631;
                        if (bArr2 != null) {
                            int i7 = n.f3090;
                            n.f3090 = i7 - 1;
                            n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                        } else {
                            short[] sArr = f632;
                            int i8 = n.f3090;
                            n.f3090 = i8 - 1;
                            n.f3092 = (char) (n.f3093 + (((short) (sArr[i8] + s)) ^ n.f3091));
                        }
                        sb.append(n.f3092);
                        n.f3093 = n.f3092;
                        n.f3089++;
                    }
                }
                obj = sb.toString();
            }
            return obj;
        }
    }

    public enum b {
        f650,
        f652,
        f649,
        f651,
        f653,
        f648;


        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f644 = 0;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static char[] f645 = null;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static int f647 = 1;

        /* renamed from: ﾒ, reason: contains not printable characters */
        static void m6265() {
            f645 = new char[]{'X', 181, 186, 186, 129, 268, 268, 263, 263, 258, 265, 267, 269, 273, 265, 265, 278, 279, 271, 263, 260, 258, 270, 278, 'a', 195, 193, 195, 199, 192, 194, 207, 202, 188, 192, 206, 198, 185, 193, 200, 197, 196, 197, 199, 201, 197, 198, '\"', 'D', 'H', 'J', 'E', 'C', 'R', 'V', 'N', 'L', 'N', 'J', GMTDateParser.MONTH, 'Q', 'J', 'F', 'E', 'N', 'N', 'K', 'K', '#', 'C', 'E', 'J', 'H', 'D', 'Q', GMTDateParser.YEAR, 'Q', 'W', 'Q', 'J', 'K', 'C', 'J', 'L', 'R', 'Q', 'I', 'N', 'N', 'I', 'D', 'K', 'Q', 'P', '\'', 'N', 'L', 'L', 'Q', 'Q', 'R'};
        }

        public static b valueOf(String str) {
            int i = 2 % 2;
            int i2 = f644 + 13;
            f647 = i2 % 128;
            int i3 = i2 % 2;
            b bVar = (b) Enum.valueOf(b.class, str);
            if (i3 == 0) {
                int i4 = 68 / 0;
            }
            return bVar;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            int i = 2 % 2;
            int i2 = f644 + 69;
            f647 = i2 % 128;
            int i3 = i2 % 2;
            b[] bVarArr = (b[]) values().clone();
            int i4 = f647 + 97;
            f644 = i4 % 128;
            if (i4 % 2 == 0) {
                return bVarArr;
            }
            throw null;
        }

        static {
            m6265();
            int i = f647 + 55;
            f644 = i % 128;
            int i2 = i % 2;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static String m6264(String str, int[] iArr, boolean z) {
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
                System.arraycopy(f645, i, cArr, 0, i2);
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
    }

    az(String str) {
        this.f623 = str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    final void m6260(cp cpVar) {
        int i = 2 % 2;
        cpVar.m7302();
        this.f623 = cpVar.m7303();
        this.f626 = cpVar.m7298();
        this.f625 = cpVar.m7293();
        if (!m6252(new int[]{-521863514, 381937645, -571024264, 2114789544}, TextUtils.indexOf((CharSequence) "", '0') + 8).intern().equals(this.f625)) {
            int i2 = f616 + 65;
            f617 = i2 % 128;
            if (i2 % 2 == 0) {
            }
            this.f627 = cpVar.m7294();
            this.f624 = cpVar.m7295();
            this.f620 = cpVar.m7297();
        }
        this.f625 = m6252(new int[]{688880972, 1338191211}, 3 - View.getDefaultSize(0, 0)).intern();
        int i3 = f617 + 103;
        f616 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 4 / 5;
        }
        this.f627 = cpVar.m7294();
        this.f624 = cpVar.m7295();
        this.f620 = cpVar.m7297();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    final void m6261(a aVar) {
        int i = 2 % 2;
        int i2 = f616 + 21;
        f617 = i2 % 128;
        int i3 = i2 % 2;
        this.f621 = aVar;
        if (aVar != a.f634) {
            int i4 = f616 + 83;
            f617 = i4 % 128;
            int i5 = i4 % 2;
            this.f622 = b.f650;
        }
        int i6 = AnonymousClass5.f629[this.f621.ordinal()];
        if (i6 == 1) {
            int i7 = f616 + 67;
            f617 = i7 % 128;
            int i8 = i7 % 2;
        } else if (i6 == 3 || i6 == 4 || i6 == 5) {
            m6253();
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    final void m6258(b bVar) {
        int i = 2 % 2;
        int i2 = f616 + 45;
        f617 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f622 = bVar;
            m6261(a.f634);
            int i3 = 66 / 0;
        } else {
            this.f622 = bVar;
            m6261(a.f634);
        }
        int i4 = f616 + 105;
        f617 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m6253() {
        String m6249;
        int i = 2 % 2;
        if (this.f623.equals(m6251("䀆챉쉔㚴䁑鈼縖Ⳓ㠯᩼\uf643", View.resolveSizeAndState(0, 0, 0)).intern())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(new StringBuilder().append(m6254()).append(m6252(new int[]{-446017547, -1509863197}, View.combineMeasuredStates(0, 0) + 1).intern()).toString());
        String m6256 = m6256();
        if (m6256 != null) {
            sb.append(new StringBuilder().append(m6256).append(m6252(new int[]{-446017547, -1509863197}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern()).toString());
        }
        String m6250 = m6250();
        if (m6250 != null) {
            sb.append(new StringBuilder().append(m6250).append(m6252(new int[]{-446017547, -1509863197}, Drawable.resolveOpacity(0, 0) + 1).intern()).toString());
        }
        StringBuilder append = new StringBuilder().append(m6252(new int[]{-1497888288, -2009197094, 2066887034, -458036270}, ExpandableListView.getPackedPositionGroup(0L) + 8).intern());
        if (this.f621 == a.f634) {
            int i2 = f617 + 103;
            f616 = i2 % 128;
            int i3 = i2 % 2;
            m6249 = m6252(new int[]{-1224987667, 1006438990, 972705399, 1094576115}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7).intern();
        } else {
            m6249 = m6249();
        }
        sb.append(append.append(m6249).append(m6252(new int[]{-446017547, -1509863197}, KeyEvent.getDeadChar(0, 0) + 1).intern()).toString());
        if (this.f621 == a.f639 || this.f621 == a.f640) {
            m.m8538(m6252(new int[]{962724271, 2070611166, 1657831648, 1195001043, 951186923, 599890710}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12).intern(), sb.toString());
            return;
        }
        String m6255 = m6255(this.f622);
        if (m6255 != null) {
            sb.append(new StringBuilder().append(m6251("眘뺔殪岠睕\ue0e1ퟹ䛣༹梣徯컪螸", ViewConfiguration.getScrollDefaultDelay() >> 16).intern()).append(m6255).toString());
            int i4 = f616 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f617 = i4 % 128;
            int i5 = i4 % 2;
        }
        m.m8533(m6252(new int[]{962724271, 2070611166, 1657831648, 1195001043, 951186923, 599890710}, 12 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), sb.toString());
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String m6254() {
        int i = 2 % 2;
        String obj = new StringBuilder().append(m6252(new int[]{-1147569661, -272628229, -1147569661, -272628229, -1147569661, -272628229, 263022688, -536448294}, TextUtils.getOffsetAfter("", 0) + 15).intern()).append(this.f623).append(m6252(new int[]{-1208171018, 654264981, -976882580, -661812587, 850339439, 1229713186}, 10 - ExpandableListView.getPackedPositionChild(0L)).intern()).toString();
        if (this.f626 != null) {
            obj = new StringBuilder().append(obj).append(this.f626).append(m6251("ᢅ䯦㚌℔ᢥ", ViewConfiguration.getTouchSlop() >> 8).intern()).toString();
        }
        String obj2 = new StringBuilder().append(obj).append(m6252(new int[]{-1147569661, -272628229, -1147569661, -272628229, -1147569661, -272628229, -1208868695, 1002682254}, (Process.myTid() >> 22) + 14).intern()).toString();
        int i2 = f617 + 29;
        f616 = i2 % 128;
        int i3 = i2 % 2;
        return obj2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String m6256() {
        String str;
        int i = 2 % 2;
        if (this.f623 == null || (str = this.f625) == null) {
            int i2 = f617 + 95;
            f616 = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = f617 + 67;
        f616 = i4 % 128;
        int i5 = i4 % 2;
        if (!(!str.equals(m6252(new int[]{688880972, 1338191211}, 2 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern()))) {
            int i6 = f617 + 53;
            f616 = i6 % 128;
            int i7 = i6 % 2;
            if (this.f621 != a.f640) {
                str = m6252(new int[]{-1529157247, -1067184197, -263964391, -646454502, 1639657939, -490349525}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10).intern();
            }
        }
        return new StringBuilder().append(this.f623).append(m6252(new int[]{-1271509155, -129331995, -1964958635, -1987323259, -1078380847, 1454938374, -882754763, -1294458365}, 14 - TextUtils.getTrimmedLength("")).intern()).append(str).toString();
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private String m6250() {
        int i = 2 % 2;
        int i2 = f617 + 115;
        int i3 = i2 % 128;
        f616 = i3;
        int i4 = i2 % 2;
        if (this.f627 == null) {
            return null;
        }
        int i5 = i3 + 111;
        f617 = i5 % 128;
        int i6 = i5 % 2;
        if (this.f624 == null) {
            return null;
        }
        String obj = new StringBuilder().append(m6251("㗈墮酨䊛㖛ۺⴃ墋䷞躛ꕺ킘씡ᙑ㶦䡘崨鸍뗽쀛풸柑\u0c3a맟泭\uef9a萲㇋", (-1) - Process.getGidForName("")).intern()).append(this.f627).append(m6252(new int[]{511269803, -1762551066}, 3 - (ViewConfiguration.getEdgeSlop() >> 16)).intern()).append(this.f624).toString();
        int i7 = f616 + 1;
        f617 = i7 % 128;
        int i8 = i7 % 2;
        return obj;
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.az$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* renamed from: ﻐ, reason: contains not printable characters */
        static final /* synthetic */ int[] f628;

        /* renamed from: ｋ, reason: contains not printable characters */
        static final /* synthetic */ int[] f629;

        static {
            int[] iArr = new int[b.valuesCustom().length];
            f628 = iArr;
            try {
                iArr[b.f648.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f628[b.f652.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f628[b.f649.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f628[b.f651.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f628[b.f653.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[a.valuesCustom().length];
            f629 = iArr2;
            try {
                iArr2[a.f642.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f629[a.f641.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f629[a.f639.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f629[a.f634.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f629[a.f640.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String m6255(b bVar) {
        int i = 2 % 2;
        int i2 = f616 + 69;
        f617 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (bVar != null) {
            int i4 = AnonymousClass5.f628[bVar.ordinal()];
            if (i4 == 1) {
                return m6251("Ɥꅤ뺩뤈Ꟙ：ˢꍖ\udfa2睃誧⭘坨\uef86ቻ돗켿枔騦㮛䛮鸁⏻䉊ﺨᙐ", AndroidCharacter.getMirror('0') - '0').intern();
            }
            if (i4 == 2) {
                return String.format(m6252(new int[]{1774830178, 648022803, -284275693, -2134552186, 1060154556, 150556639, 1240608641, -1725962027, 2113813124, -254135115, -1388419528, 1592604023, -330292194, -59596372, -249453407, 345835048, 1779849888, 425726122, 1503434012, -541059464, -1766708416, 1067678654, 1060154556, 150556639, 1240608641, -1725962027, -1706620635, -912435250, -1702450320, 853370110, -313028479, 1652580358}, TextUtils.indexOf("", "", 0, 0) + 62).intern(), this.f623, this.f625, this.f620);
            }
            if (i4 == 3) {
                String format = String.format(m6252(new int[]{685639142, -1802374468, -1766708416, 1067678654, 1060154556, 150556639, 1240608641, -1725962027, -1385407742, -1262659844, -1571258135, 963451361, 183471044, -1556790898, -192086299, -1192071881, -1513517395, 1880817318, 56532696, -1357181167, 1125960264, -370688110, -666104877, -1241789415, 1267391027, 2102840719, 968610096, 123799223}, 55 - TextUtils.indexOf("", "")).intern(), this.f623, this.f625);
                int i5 = f616 + 93;
                f617 = i5 % 128;
                if (i5 % 2 == 0) {
                    return format;
                }
                throw null;
            }
            if (i4 == 4) {
                String intern = m6251("恩퍲淊엉怯贃톃\udf95ᡌՆ妊埍邆鷂섃켗ࣀᗖ䥃䝘脅\uec0b\uf090㺜㤉摁磅뛗놇ﲇ\ue009⸍⧆瓐", ViewConfiguration.getKeyRepeatTimeout() >> 16).intern();
                int i6 = f616 + 1;
                f617 = i6 % 128;
                if (i6 % 2 == 0) {
                    return intern;
                }
                super.hashCode();
                throw null;
            }
            if (i4 == 5) {
                return m6252(new int[]{-1752147785, -858007144, -1763914835, 8443484, 1313639681, -1221362853, 1233157180, -1211735629, -1208171018, 654264981, -976882580, -661812587, 414971468, 1704189267}, 26 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern();
            }
        }
        int i7 = f616 + 47;
        f617 = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private String m6249() {
        int i = 2 % 2;
        int i2 = f616 + 25;
        f617 = i2 % 128;
        int i3 = i2 % 2;
        String name = this.f621.name();
        int i4 = f617 + 115;
        f616 = i4 % 128;
        int i5 = i4 % 2;
        return name;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    final String m6257() {
        String m6255;
        int i = 2 % 2;
        int i2 = f617 + 69;
        f616 = i2 % 128;
        if (i2 % 2 == 0) {
            m6255 = m6255(this.f622);
            int i3 = 75 / 0;
        } else {
            m6255 = m6255(this.f622);
        }
        int i4 = f617 + 57;
        f616 = i4 % 128;
        int i5 = i4 % 2;
        return m6255;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    final a m6259() {
        int i = 2 % 2;
        int i2 = f616;
        int i3 = i2 + 43;
        f617 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        a aVar = this.f621;
        int i4 = i2 + 15;
        f617 = i4 % 128;
        if (i4 % 2 == 0) {
            return aVar;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6252(int[] iArr, int i) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f618.clone();
            com.ironsource.adqualitysdk.sdk.i.a.f83 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.a.f83 < iArr.length) {
                cArr[0] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.a.f83] >> 16);
                cArr[1] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.a.f83];
                cArr[2] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.a.f83 + 1] >> 16);
                cArr[3] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.a.f83 + 1];
                com.ironsource.adqualitysdk.sdk.i.a.f84 = (cArr[0] << 16) + cArr[1];
                com.ironsource.adqualitysdk.sdk.i.a.f85 = (cArr[2] << 16) + cArr[3];
                com.ironsource.adqualitysdk.sdk.i.a.m5773(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = com.ironsource.adqualitysdk.sdk.i.a.f84 ^ iArr2[i2];
                    com.ironsource.adqualitysdk.sdk.i.a.f84 = i3;
                    com.ironsource.adqualitysdk.sdk.i.a.f85 = com.ironsource.adqualitysdk.sdk.i.a.m5774(i3) ^ com.ironsource.adqualitysdk.sdk.i.a.f85;
                    int i4 = com.ironsource.adqualitysdk.sdk.i.a.f84;
                    com.ironsource.adqualitysdk.sdk.i.a.f84 = com.ironsource.adqualitysdk.sdk.i.a.f85;
                    com.ironsource.adqualitysdk.sdk.i.a.f85 = i4;
                }
                int i5 = com.ironsource.adqualitysdk.sdk.i.a.f84;
                com.ironsource.adqualitysdk.sdk.i.a.f84 = com.ironsource.adqualitysdk.sdk.i.a.f85;
                com.ironsource.adqualitysdk.sdk.i.a.f85 = i5;
                com.ironsource.adqualitysdk.sdk.i.a.f85 = i5 ^ iArr2[16];
                com.ironsource.adqualitysdk.sdk.i.a.f84 ^= iArr2[17];
                int i6 = com.ironsource.adqualitysdk.sdk.i.a.f84;
                int i7 = com.ironsource.adqualitysdk.sdk.i.a.f85;
                cArr[0] = (char) (com.ironsource.adqualitysdk.sdk.i.a.f84 >>> 16);
                cArr[1] = (char) com.ironsource.adqualitysdk.sdk.i.a.f84;
                cArr[2] = (char) (com.ironsource.adqualitysdk.sdk.i.a.f85 >>> 16);
                cArr[3] = (char) com.ironsource.adqualitysdk.sdk.i.a.f85;
                com.ironsource.adqualitysdk.sdk.i.a.m5773(iArr2);
                cArr2[com.ironsource.adqualitysdk.sdk.i.a.f83 << 1] = cArr[0];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f83 << 1) + 1] = cArr[1];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f83 << 1) + 2] = cArr[2];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f83 << 1) + 3] = cArr[3];
                com.ironsource.adqualitysdk.sdk.i.a.f83 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m6251(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (g.f2155) {
            char[] m7785 = g.m7785(f619, cArr2, i);
            g.f2157 = 4;
            while (g.f2157 < m7785.length) {
                g.f2156 = g.f2157 - 4;
                m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f619));
                g.f2157++;
            }
            str2 = new String(m7785, 4, m7785.length - 4);
        }
        return str2;
    }
}

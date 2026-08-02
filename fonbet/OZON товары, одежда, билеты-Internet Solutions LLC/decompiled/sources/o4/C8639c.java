package o4;

import Am.C2438a;
import J0.C3354v2;
import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m3.N;
import m3.s;

/* renamed from: o4.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8639c {

    /* renamed from: a, reason: collision with root package name */
    public final String f77644a;

    /* renamed from: b, reason: collision with root package name */
    public final int f77645b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f77646c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f77647d;

    /* renamed from: e, reason: collision with root package name */
    public final float f77648e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f77649f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f77650g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f77651h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f77652i;

    /* renamed from: j, reason: collision with root package name */
    public final int f77653j;

    /* renamed from: o4.c$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f77654a;

        /* renamed from: b, reason: collision with root package name */
        public final int f77655b;

        /* renamed from: c, reason: collision with root package name */
        public final int f77656c;

        /* renamed from: d, reason: collision with root package name */
        public final int f77657d;

        /* renamed from: e, reason: collision with root package name */
        public final int f77658e;

        /* renamed from: f, reason: collision with root package name */
        public final int f77659f;

        /* renamed from: g, reason: collision with root package name */
        public final int f77660g;

        /* renamed from: h, reason: collision with root package name */
        public final int f77661h;

        /* renamed from: i, reason: collision with root package name */
        public final int f77662i;

        /* renamed from: j, reason: collision with root package name */
        public final int f77663j;

        /* renamed from: k, reason: collision with root package name */
        public final int f77664k;

        private a(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22) {
            this.f77654a = i11;
            this.f77655b = i12;
            this.f77656c = i13;
            this.f77657d = i14;
            this.f77658e = i15;
            this.f77659f = i16;
            this.f77660g = i17;
            this.f77661h = i18;
            this.f77662i = i19;
            this.f77663j = i21;
            this.f77664k = i22;
        }

        public static a a(String str) {
            char c11;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i21 = -1;
            for (int i22 = 0; i22 < split.length; i22++) {
                String b11 = O7.b.b(split[i22].trim());
                b11.getClass();
                switch (b11.hashCode()) {
                    case -1178781136:
                        if (b11.equals("italic")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1026963764:
                        if (b11.equals("underline")) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -192095652:
                        if (b11.equals("strikeout")) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -70925746:
                        if (b11.equals("primarycolour")) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3029637:
                        if (b11.equals("bold")) {
                            c11 = 4;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3373707:
                        if (b11.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                            c11 = 5;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 366554320:
                        if (b11.equals("fontsize")) {
                            c11 = 6;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 767321349:
                        if (b11.equals("borderstyle")) {
                            c11 = 7;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1767875043:
                        if (b11.equals("alignment")) {
                            c11 = '\b';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1988365454:
                        if (b11.equals("outlinecolour")) {
                            c11 = '\t';
                            break;
                        }
                        c11 = 65535;
                        break;
                    default:
                        c11 = 65535;
                        break;
                }
                switch (c11) {
                    case 0:
                        i17 = i22;
                        break;
                    case 1:
                        i18 = i22;
                        break;
                    case 2:
                        i19 = i22;
                        break;
                    case 3:
                        i13 = i22;
                        break;
                    case 4:
                        i16 = i22;
                        break;
                    case 5:
                        i11 = i22;
                        break;
                    case 6:
                        i15 = i22;
                        break;
                    case 7:
                        i21 = i22;
                        break;
                    case '\b':
                        i12 = i22;
                        break;
                    case '\t':
                        i14 = i22;
                        break;
                }
            }
            if (i11 != -1) {
                return new a(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, split.length);
            }
            return null;
        }
    }

    /* renamed from: o4.c$b */
    static final class b {

        /* renamed from: c, reason: collision with root package name */
        private static final Pattern f77665c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f77666d;

        /* renamed from: e, reason: collision with root package name */
        private static final Pattern f77667e;

        /* renamed from: f, reason: collision with root package name */
        private static final Pattern f77668f;

        /* renamed from: a, reason: collision with root package name */
        public final int f77669a;

        /* renamed from: b, reason: collision with root package name */
        public final PointF f77670b;

        static {
            int i11 = N.f74289a;
            Locale locale = Locale.US;
            f77666d = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f77667e = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f77668f = Pattern.compile("\\\\an(\\d+)");
        }

        private b(int i11, PointF pointF) {
            this.f77669a = i11;
            this.f77670b = pointF;
        }

        public static b a(String str) {
            int i11;
            Matcher matcher = f77665c.matcher(str);
            PointF pointF = null;
            int i12 = -1;
            while (matcher.find()) {
                String group = matcher.group(1);
                group.getClass();
                try {
                    PointF b11 = b(group);
                    if (b11 != null) {
                        pointF = b11;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    Matcher matcher2 = f77668f.matcher(group);
                    if (matcher2.find()) {
                        String group2 = matcher2.group(1);
                        group2.getClass();
                        i11 = C8639c.c(group2);
                    } else {
                        i11 = -1;
                    }
                    if (i11 != -1) {
                        i12 = i11;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i12, pointF);
        }

        private static PointF b(String str) {
            String group;
            String group2;
            Matcher matcher = f77666d.matcher(str);
            Matcher matcher2 = f77667e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    s.e("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else {
                if (!find2) {
                    return null;
                }
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            group.getClass();
            float parseFloat = Float.parseFloat(group.trim());
            group2.getClass();
            return new PointF(parseFloat, Float.parseFloat(group2.trim()));
        }

        public static String c(String str) {
            return f77665c.matcher(str).replaceAll("");
        }
    }

    private C8639c(String str, int i11, Integer num, Integer num2, float f7, boolean z11, boolean z12, boolean z13, boolean z14, int i12) {
        this.f77644a = str;
        this.f77645b = i11;
        this.f77646c = num;
        this.f77647d = num2;
        this.f77648e = f7;
        this.f77649f = z11;
        this.f77650g = z12;
        this.f77651h = z13;
        this.f77652i = z14;
        this.f77653j = i12;
    }

    public static C8639c b(String str, a aVar) {
        C8639c c8639c;
        G10.a.c(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i11 = aVar.f77664k;
        if (length != i11) {
            int length2 = split.length;
            int i12 = N.f74289a;
            Locale locale = Locale.US;
            StringBuilder a11 = C2438a.a("Skipping malformed 'Style:' line (expected ", i11, " values, found ", "): '", length2);
            a11.append(str);
            a11.append("'");
            s.f("SsaStyle", a11.toString());
            return null;
        }
        try {
            String trim = split[aVar.f77654a].trim();
            int i13 = aVar.f77655b;
            int i14 = -1;
            int c11 = i13 != -1 ? c(split[i13].trim()) : -1;
            int i15 = aVar.f77656c;
            Integer e11 = i15 != -1 ? e(split[i15].trim()) : null;
            int i16 = aVar.f77657d;
            Integer e12 = i16 != -1 ? e(split[i16].trim()) : null;
            int i17 = aVar.f77658e;
            float f7 = -3.4028235E38f;
            try {
                if (i17 != -1) {
                    String trim2 = split[i17].trim();
                    try {
                        f7 = Float.parseFloat(trim2);
                    } catch (NumberFormatException e13) {
                        c8639c = null;
                        s.g("SsaStyle", "Failed to parse font size: '" + trim2 + "'", e13);
                    }
                }
                c8639c = null;
                int i18 = aVar.f77659f;
                boolean z11 = i18 != -1 && d(split[i18].trim());
                int i19 = aVar.f77660g;
                boolean z12 = i19 != -1 && d(split[i19].trim());
                int i21 = aVar.f77661h;
                boolean z13 = i21 != -1 && d(split[i21].trim());
                int i22 = aVar.f77662i;
                boolean z14 = i22 != -1 && d(split[i22].trim());
                int i23 = aVar.f77663j;
                if (i23 != -1) {
                    String trim3 = split[i23].trim();
                    try {
                        int parseInt = Integer.parseInt(trim3.trim());
                        if (parseInt == 1 || parseInt == 3) {
                            i14 = parseInt;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    s.f("SsaStyle", "Ignoring unknown BorderStyle: " + trim3);
                }
                return new C8639c(trim, c11, e11, e12, f7, z11, z12, z13, z14, i14);
            } catch (RuntimeException e14) {
                e = e14;
                s.g("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
                return c8639c;
            }
        } catch (RuntimeException e15) {
            e = e15;
            c8639c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(String str) {
        boolean z11;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z11 = true;
                    break;
                default:
                    z11 = false;
                    break;
            }
            if (z11) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        C3354v2.f("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    private static boolean d(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e11) {
            s.g("SsaStyle", "Failed to parse boolean value: '" + str + "'", e11);
            return false;
        }
    }

    public static Integer e(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            G10.a.c(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(com.google.common.primitives.b.c(((parseLong >> 24) & 255) ^ 255), com.google.common.primitives.b.c(parseLong & 255), com.google.common.primitives.b.c((parseLong >> 8) & 255), com.google.common.primitives.b.c((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e11) {
            s.g("SsaStyle", "Failed to parse color expression: '" + str + "'", e11);
            return null;
        }
    }
}

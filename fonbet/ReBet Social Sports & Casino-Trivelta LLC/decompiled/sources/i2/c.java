package i2;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.google.common.primitives.f;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.Z;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f48029a;

    /* renamed from: b, reason: collision with root package name */
    public final int f48030b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f48031c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f48032d;

    /* renamed from: e, reason: collision with root package name */
    public final float f48033e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f48034f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f48035g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f48036h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f48037i;

    /* renamed from: j, reason: collision with root package name */
    public final int f48038j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f48039a;

        /* renamed from: b, reason: collision with root package name */
        public final int f48040b;

        /* renamed from: c, reason: collision with root package name */
        public final int f48041c;

        /* renamed from: d, reason: collision with root package name */
        public final int f48042d;

        /* renamed from: e, reason: collision with root package name */
        public final int f48043e;

        /* renamed from: f, reason: collision with root package name */
        public final int f48044f;

        /* renamed from: g, reason: collision with root package name */
        public final int f48045g;

        /* renamed from: h, reason: collision with root package name */
        public final int f48046h;

        /* renamed from: i, reason: collision with root package name */
        public final int f48047i;

        /* renamed from: j, reason: collision with root package name */
        public final int f48048j;

        /* renamed from: k, reason: collision with root package name */
        public final int f48049k;

        public a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f48039a = i10;
            this.f48040b = i11;
            this.f48041c = i12;
            this.f48042d = i13;
            this.f48043e = i14;
            this.f48044f = i15;
            this.f48045g = i16;
            this.f48046h = i17;
            this.f48047i = i18;
            this.f48048j = i19;
            this.f48049k = i20;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static a a(String str) {
            char c10;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            for (int i20 = 0; i20 < split.length; i20++) {
                String e10 = Ra.c.e(split[i20].trim());
                e10.getClass();
                switch (e10.hashCode()) {
                    case -1178781136:
                        if (e10.equals("italic")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1026963764:
                        if (e10.equals("underline")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -192095652:
                        if (e10.equals("strikeout")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -70925746:
                        if (e10.equals("primarycolour")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3029637:
                        if (e10.equals("bold")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3373707:
                        if (e10.equals("name")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 366554320:
                        if (e10.equals("fontsize")) {
                            c10 = 6;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 767321349:
                        if (e10.equals("borderstyle")) {
                            c10 = 7;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1767875043:
                        if (e10.equals("alignment")) {
                            c10 = '\b';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1988365454:
                        if (e10.equals("outlinecolour")) {
                            c10 = '\t';
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                switch (c10) {
                    case 0:
                        i16 = i20;
                        break;
                    case 1:
                        i17 = i20;
                        break;
                    case 2:
                        i18 = i20;
                        break;
                    case 3:
                        i12 = i20;
                        break;
                    case 4:
                        i15 = i20;
                        break;
                    case 5:
                        i10 = i20;
                        break;
                    case 6:
                        i14 = i20;
                        break;
                    case 7:
                        i19 = i20;
                        break;
                    case '\b':
                        i11 = i20;
                        break;
                    case '\t':
                        i13 = i20;
                        break;
                }
            }
            if (i10 != -1) {
                return new a(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, split.length);
            }
            return null;
        }
    }

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final Pattern f48050c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d, reason: collision with root package name */
        public static final Pattern f48051d = Pattern.compile(Z.G("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e, reason: collision with root package name */
        public static final Pattern f48052e = Pattern.compile(Z.G("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f, reason: collision with root package name */
        public static final Pattern f48053f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a, reason: collision with root package name */
        public final int f48054a;

        /* renamed from: b, reason: collision with root package name */
        public final PointF f48055b;

        public b(int i10, PointF pointF) {
            this.f48054a = i10;
            this.f48055b = pointF;
        }

        public static int a(String str) {
            Matcher matcher = f48053f.matcher(str);
            if (matcher.find()) {
                return c.e((String) AbstractC4134a.e(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f48050c.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) AbstractC4134a.e(matcher.group(1));
                try {
                    PointF c10 = c(str2);
                    if (c10 != null) {
                        pointF = c10;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int a10 = a(str2);
                    if (a10 != -1) {
                        i10 = a10;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i10, pointF);
        }

        public static PointF c(String str) {
            String group;
            String group2;
            Matcher matcher = f48051d.matcher(str);
            Matcher matcher2 = f48052e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    AbstractC4156x.g("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
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
            return new PointF(Float.parseFloat(((String) AbstractC4134a.e(group)).trim()), Float.parseFloat(((String) AbstractC4134a.e(group2)).trim()));
        }

        public static String d(String str) {
            return f48050c.matcher(str).replaceAll("");
        }
    }

    public c(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f48029a = str;
        this.f48030b = i10;
        this.f48031c = num;
        this.f48032d = num2;
        this.f48033e = f10;
        this.f48034f = z10;
        this.f48035g = z11;
        this.f48036h = z12;
        this.f48037i = z13;
        this.f48038j = i11;
    }

    public static c b(String str, a aVar) {
        boolean z10;
        boolean z11;
        AbstractC4134a.a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i10 = aVar.f48049k;
        if (length != i10) {
            AbstractC4156x.i("SsaStyle", Z.G("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[aVar.f48039a].trim();
            int i11 = aVar.f48040b;
            int e10 = i11 != -1 ? e(split[i11].trim()) : -1;
            int i12 = aVar.f48041c;
            Integer h10 = i12 != -1 ? h(split[i12].trim()) : null;
            int i13 = aVar.f48042d;
            Integer h11 = i13 != -1 ? h(split[i13].trim()) : null;
            int i14 = aVar.f48043e;
            float i15 = i14 != -1 ? i(split[i14].trim()) : -3.4028235E38f;
            int i16 = aVar.f48044f;
            boolean z12 = false;
            boolean z13 = true;
            if (i16 == -1 || !f(split[i16].trim())) {
                z10 = false;
            } else {
                z10 = false;
                z12 = true;
            }
            int i17 = aVar.f48045g;
            if (i17 == -1 || !f(split[i17].trim())) {
                z11 = true;
                z13 = z10;
            } else {
                z11 = true;
            }
            int i18 = aVar.f48046h;
            if (i18 == -1 || !f(split[i18].trim())) {
                z11 = false;
            }
            int i19 = aVar.f48047i;
            boolean z14 = i19 != -1 && f(split[i19].trim());
            int i20 = aVar.f48048j;
            return new c(trim, e10, h10, h11, i15, z12, z13, z11, z14, i20 != -1 ? g(split[i20].trim()) : -1);
        } catch (RuntimeException e11) {
            AbstractC4156x.j("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e11);
            return null;
        }
    }

    public static boolean c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public static boolean d(int i10) {
        return i10 == 1 || i10 == 3;
    }

    public static int e(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC4156x.i("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    public static boolean f(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e10) {
            AbstractC4156x.j("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static int g(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (d(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC4156x.i("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer h(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC4134a.a(parseLong <= BodyPartID.bodyIdMax);
            return Integer.valueOf(Color.argb(f.e(((parseLong >> 24) & 255) ^ 255), f.e(parseLong & 255), f.e((parseLong >> 8) & 255), f.e((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            AbstractC4156x.j("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    public static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            AbstractC4156x.j("SsaStyle", "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }
}

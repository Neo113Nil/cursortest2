package w0;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import kotlin.text.Typography;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6695a {

    /* renamed from: d, reason: collision with root package name */
    public static final o f67219d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f67220e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f67221f;

    /* renamed from: g, reason: collision with root package name */
    public static final C6695a f67222g;

    /* renamed from: h, reason: collision with root package name */
    public static final C6695a f67223h;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f67224a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67225b;

    /* renamed from: c, reason: collision with root package name */
    public final o f67226c;

    /* renamed from: w0.a$a, reason: collision with other inner class name */
    public static final class C0947a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f67227a;

        /* renamed from: b, reason: collision with root package name */
        public int f67228b;

        /* renamed from: c, reason: collision with root package name */
        public o f67229c;

        public C0947a() {
            c(C6695a.e(Locale.getDefault()));
        }

        public static C6695a b(boolean z10) {
            return z10 ? C6695a.f67223h : C6695a.f67222g;
        }

        public C6695a a() {
            return (this.f67228b == 2 && this.f67229c == C6695a.f67219d) ? b(this.f67227a) : new C6695a(this.f67227a, this.f67228b, this.f67229c);
        }

        public final void c(boolean z10) {
            this.f67227a = z10;
            this.f67229c = C6695a.f67219d;
            this.f67228b = 2;
        }
    }

    /* renamed from: w0.a$b */
    public static class b {
        private static final byte[] DIR_TYPE_CACHE = new byte[1792];

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f67230a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f67231b;

        /* renamed from: c, reason: collision with root package name */
        public final int f67232c;

        /* renamed from: d, reason: collision with root package name */
        public int f67233d;

        /* renamed from: e, reason: collision with root package name */
        public char f67234e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                DIR_TYPE_CACHE[i10] = Character.getDirectionality(i10);
            }
        }

        public b(CharSequence charSequence, boolean z10) {
            this.f67230a = charSequence;
            this.f67231b = z10;
            this.f67232c = charSequence.length();
        }

        public static byte c(char c10) {
            return c10 < 1792 ? DIR_TYPE_CACHE[c10] : Character.getDirectionality(c10);
        }

        public byte a() {
            char charAt = this.f67230a.charAt(this.f67233d - 1);
            this.f67234e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f67230a, this.f67233d);
                this.f67233d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f67233d--;
            byte c10 = c(this.f67234e);
            if (!this.f67231b) {
                return c10;
            }
            char c11 = this.f67234e;
            return c11 == '>' ? h() : c11 == ';' ? f() : c10;
        }

        public byte b() {
            char charAt = this.f67230a.charAt(this.f67233d);
            this.f67234e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f67230a, this.f67233d);
                this.f67233d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f67233d++;
            byte c10 = c(this.f67234e);
            if (!this.f67231b) {
                return c10;
            }
            char c11 = this.f67234e;
            return c11 == '<' ? i() : c11 == '&' ? g() : c10;
        }

        public int d() {
            this.f67233d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f67233d < this.f67232c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f67233d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        public int e() {
            this.f67233d = this.f67232c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f67233d > 0) {
                    byte a10 = a();
                    if (a10 != 0) {
                        if (a10 == 1 || a10 == 2) {
                            if (i10 == 0) {
                                return 1;
                            }
                            if (i11 == 0) {
                                break;
                            }
                        } else if (a10 != 9) {
                            switch (a10) {
                                case 14:
                                case 15:
                                    if (i11 == i10) {
                                        return -1;
                                    }
                                    i10--;
                                    break;
                                case 16:
                                case 17:
                                    if (i11 == i10) {
                                        return 1;
                                    }
                                    i10--;
                                    break;
                                case 18:
                                    i10++;
                                    break;
                                default:
                                    if (i11 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (i10 == 0) {
                            return -1;
                        }
                        if (i11 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }

        public final byte f() {
            char charAt;
            int i10 = this.f67233d;
            do {
                int i11 = this.f67233d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f67230a;
                int i12 = i11 - 1;
                this.f67233d = i12;
                charAt = charSequence.charAt(i12);
                this.f67234e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f67233d = i10;
            this.f67234e = ';';
            return (byte) 13;
        }

        public final byte g() {
            char charAt;
            do {
                int i10 = this.f67233d;
                if (i10 >= this.f67232c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f67230a;
                this.f67233d = i10 + 1;
                charAt = charSequence.charAt(i10);
                this.f67234e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        public final byte h() {
            char charAt;
            int i10 = this.f67233d;
            while (true) {
                int i11 = this.f67233d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f67230a;
                int i12 = i11 - 1;
                this.f67233d = i12;
                char charAt2 = charSequence.charAt(i12);
                this.f67234e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i13 = this.f67233d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f67230a;
                            int i14 = i13 - 1;
                            this.f67233d = i14;
                            charAt = charSequence2.charAt(i14);
                            this.f67234e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f67233d = i10;
            this.f67234e = Typography.greater;
            return (byte) 13;
        }

        public final byte i() {
            char charAt;
            int i10 = this.f67233d;
            while (true) {
                int i11 = this.f67233d;
                if (i11 >= this.f67232c) {
                    this.f67233d = i10;
                    this.f67234e = Typography.less;
                    return (byte) 13;
                }
                CharSequence charSequence = this.f67230a;
                this.f67233d = i11 + 1;
                char charAt2 = charSequence.charAt(i11);
                this.f67234e = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i12 = this.f67233d;
                        if (i12 < this.f67232c) {
                            CharSequence charSequence2 = this.f67230a;
                            this.f67233d = i12 + 1;
                            charAt = charSequence2.charAt(i12);
                            this.f67234e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
        }
    }

    static {
        o oVar = p.f67246c;
        f67219d = oVar;
        f67220e = Character.toString((char) 8206);
        f67221f = Character.toString((char) 8207);
        f67222g = new C6695a(false, 2, oVar);
        f67223h = new C6695a(true, 2, oVar);
    }

    public C6695a(boolean z10, int i10, o oVar) {
        this.f67224a = z10;
        this.f67225b = i10;
        this.f67226c = oVar;
    }

    public static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    public static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static C6695a c() {
        return new C0947a().a();
    }

    public static boolean e(Locale locale) {
        return q.a(locale) == 1;
    }

    public boolean d() {
        return (this.f67225b & 2) != 0;
    }

    public final String f(CharSequence charSequence, o oVar) {
        boolean isRtl = oVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f67224a || !(isRtl || b(charSequence) == 1)) ? this.f67224a ? (!isRtl || b(charSequence) == -1) ? f67221f : "" : "" : f67220e;
    }

    public final String g(CharSequence charSequence, o oVar) {
        boolean isRtl = oVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f67224a || !(isRtl || a(charSequence) == 1)) ? this.f67224a ? (!isRtl || a(charSequence) == -1) ? f67221f : "" : "" : f67220e;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f67226c, true);
    }

    public CharSequence i(CharSequence charSequence, o oVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean isRtl = oVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append((CharSequence) g(charSequence, isRtl ? p.f67245b : p.f67244a));
        }
        if (isRtl != this.f67224a) {
            spannableStringBuilder.append(isRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) f(charSequence, isRtl ? p.f67245b : p.f67244a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f67226c, true);
    }

    public String k(String str, o oVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return i(str, oVar, z10).toString();
    }
}

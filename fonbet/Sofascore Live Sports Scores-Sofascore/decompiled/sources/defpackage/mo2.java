package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mo2 implements CharSequence {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public CharSequence d;
    public Object e;

    public mo2(oo2 oo2Var, int i, int i2) {
        this.e = oo2Var;
        this.b = i;
        this.c = i2;
    }

    public void a(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (i > i2) {
            u3a.a("start=" + i + " > end=" + i2);
        }
        if (i3 > i4) {
            u3a.a("textStart=" + i3 + " > textEnd=" + i4);
        }
        if (i < 0) {
            u3a.a("start must be non-negative, but was " + i);
        }
        if (i3 < 0) {
            u3a.a("textStart must be non-negative, but was " + i3);
        }
        wu8 wu8Var = (wu8) this.e;
        int i5 = i4 - i3;
        if (wu8Var == null) {
            int max = Math.max(255, i5 + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(this.d.length() - i2, 64);
            int i6 = i - min;
            kda.R(this.d, cArr, 0, i6, i);
            int i7 = max - min2;
            int i8 = min2 + i2;
            kda.R(this.d, cArr, i7, i2, i8);
            kda.R(charSequence, cArr, min, i3, i4);
            wu8 wu8Var2 = new wu8(1);
            wu8Var2.b = max;
            wu8Var2.c = cArr;
            wu8Var2.d = min + i5;
            wu8Var2.e = i7;
            this.e = wu8Var2;
            this.b = i6;
            this.c = i8;
            return;
        }
        int i9 = this.b;
        int i10 = i - i9;
        int i11 = i2 - i9;
        if (i10 < 0 || i11 > wu8Var.b - wu8Var.a()) {
            this.d = toString();
            this.e = null;
            this.b = -1;
            this.c = -1;
            a(i, i2, charSequence, i3, i4);
            return;
        }
        int i12 = i5 - (i11 - i10);
        if (i12 > wu8Var.a()) {
            int a = i12 - wu8Var.a();
            int i13 = wu8Var.b;
            do {
                i13 *= 2;
            } while (i13 - wu8Var.b < a);
            char[] cArr2 = new char[i13];
            mh0.g(wu8Var.c, cArr2, 0, 0, wu8Var.d);
            int i14 = wu8Var.b;
            int i15 = wu8Var.e;
            int i16 = i14 - i15;
            int i17 = i13 - i16;
            mh0.g(wu8Var.c, cArr2, i17, i15, i16 + i15);
            wu8Var.c = cArr2;
            wu8Var.b = i13;
            wu8Var.e = i17;
        }
        int i18 = wu8Var.d;
        if (i10 < i18 && i11 <= i18) {
            int i19 = i18 - i11;
            char[] cArr3 = wu8Var.c;
            mh0.g(cArr3, cArr3, wu8Var.e - i19, i11, i18);
            wu8Var.d = i10;
            wu8Var.e -= i19;
        } else if (i10 >= i18 || i11 < i18) {
            int a2 = wu8Var.a() + i10;
            int a3 = wu8Var.a() + i11;
            int i20 = wu8Var.e;
            char[] cArr4 = wu8Var.c;
            mh0.g(cArr4, cArr4, wu8Var.d, i20, a2);
            i10 = wu8Var.d + (a2 - i20);
            wu8Var.d = i10;
            wu8Var.e = a3;
        } else {
            wu8Var.e = wu8Var.a() + i11;
            wu8Var.d = i10;
        }
        kda.R(charSequence, wu8Var.c, i10, i3, i4);
        wu8Var.d += i5;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        switch (this.a) {
            case 0:
                int i2 = this.b + i;
                if (i < 0) {
                    ogj.h(ljg.j(i, "index is negative: "));
                    return (char) 0;
                }
                if (i2 < this.c) {
                    return ((oo2) this.e).c(i2);
                }
                StringBuilder t = lnb.t(i, "index (", ") should be less than length (");
                t.append(length());
                t.append(')');
                throw new IllegalArgumentException(t.toString().toString());
            default:
                wu8 wu8Var = (wu8) this.e;
                if (wu8Var == null) {
                    return this.d.charAt(i);
                }
                if (i < this.b) {
                    return this.d.charAt(i);
                }
                int a = wu8Var.b - wu8Var.a();
                int i3 = this.b;
                if (i >= a + i3) {
                    return this.d.charAt(i - ((a - this.c) + i3));
                }
                int i4 = i - i3;
                int i5 = wu8Var.d;
                char[] cArr = wu8Var.c;
                return i4 < i5 ? cArr[i4] : cArr[(i4 - i5) + wu8Var.e];
        }
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof CharSequence)) {
                    return false;
                }
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence.length() != length()) {
                    return false;
                }
                oo2 oo2Var = (oo2) this.e;
                int i = this.b;
                int length = length();
                for (int i2 = 0; i2 < length; i2++) {
                    if (oo2Var.c(i + i2) != charSequence.charAt(i2)) {
                        return false;
                    }
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.a) {
            case 0:
                String str = (String) this.d;
                if (str != null) {
                    return str.hashCode();
                }
                oo2 oo2Var = (oo2) this.e;
                int i = this.c;
                int i2 = 0;
                for (int i3 = this.b; i3 < i; i3++) {
                    i2 = (i2 * 31) + oo2Var.c(i3);
                }
                return i2;
            default:
                return super.hashCode();
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        switch (this.a) {
            case 0:
                return this.c - this.b;
            default:
                wu8 wu8Var = (wu8) this.e;
                CharSequence charSequence = this.d;
                if (wu8Var == null) {
                    return charSequence.length();
                }
                return (wu8Var.b - wu8Var.a()) + (charSequence.length() - (this.c - this.b));
        }
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        switch (this.a) {
            case 0:
                if (i < 0) {
                    ogj.h(ljg.j(i, "start is negative: "));
                    return null;
                }
                if (i > i2) {
                    ogj.j(") should be less or equal to end (", "start (", i, i2);
                    return null;
                }
                int i3 = this.c;
                int i4 = this.b;
                if (i2 <= i3 - i4) {
                    return i == i2 ? "" : new mo2((oo2) this.e, i + i4, i4 + i2);
                }
                throw new IllegalArgumentException(("end should be less than length (" + length() + ')').toString());
            default:
                return toString().subSequence(i, i2);
        }
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        switch (this.a) {
            case 0:
                String str = (String) this.d;
                if (str != null) {
                    return str;
                }
                String obj = ((oo2) this.e).b(this.b, this.c).toString();
                this.d = obj;
                return obj;
            default:
                wu8 wu8Var = (wu8) this.e;
                CharSequence charSequence = this.d;
                if (wu8Var == null) {
                    return charSequence.toString();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(charSequence, 0, this.b);
                sb.append(wu8Var.c, 0, wu8Var.d);
                char[] cArr = wu8Var.c;
                int i = wu8Var.e;
                sb.append(cArr, i, wu8Var.b - i);
                CharSequence charSequence2 = this.d;
                sb.append(charSequence2, this.c, charSequence2.length());
                return sb.toString();
        }
    }

    public /* synthetic */ mo2() {
    }
}

package Ra;

/* loaded from: classes3.dex */
public abstract class d implements o {

    public static abstract class a extends d {
        @Override // Ra.o
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.b((Character) obj);
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final char f10133a;

        public b(char c10) {
            this.f10133a = c10;
        }

        @Override // Ra.d
        public boolean e(char c10) {
            return c10 == this.f10133a;
        }

        public String toString() {
            return "CharMatcher.is('" + d.g(this.f10133a) + "')";
        }
    }

    public static abstract class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f10134a;

        public c(String str) {
            this.f10134a = (String) n.k(str);
        }

        public final String toString() {
            return this.f10134a;
        }
    }

    /* renamed from: Ra.d$d, reason: collision with other inner class name */
    public static final class C0195d extends c {

        /* renamed from: b, reason: collision with root package name */
        public static final d f10135b = new C0195d();

        public C0195d() {
            super("CharMatcher.none()");
        }

        @Override // Ra.d
        public int c(CharSequence charSequence, int i10) {
            n.m(i10, charSequence.length());
            return -1;
        }

        @Override // Ra.d
        public boolean e(char c10) {
            return false;
        }
    }

    public static d d(char c10) {
        return new b(c10);
    }

    public static d f() {
        return C0195d.f10135b;
    }

    public static String g(char c10) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public boolean b(Character ch2) {
        return e(ch2.charValue());
    }

    public int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        n.m(i10, length);
        while (i10 < length) {
            if (e(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean e(char c10);
}

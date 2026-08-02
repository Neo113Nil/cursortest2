package w0;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final o f67244a = new e(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final o f67245b = new e(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final o f67246c;

    /* renamed from: d, reason: collision with root package name */
    public static final o f67247d;

    /* renamed from: e, reason: collision with root package name */
    public static final o f67248e;

    /* renamed from: f, reason: collision with root package name */
    public static final o f67249f;

    public static class a implements c {

        /* renamed from: b, reason: collision with root package name */
        public static final a f67250b = new a(true);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f67251a;

        public a(boolean z10) {
            this.f67251a = z10;
        }

        @Override // w0.p.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int a10 = p.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (a10 != 0) {
                    if (a10 != 1) {
                        continue;
                        i10++;
                        z10 = z10;
                    } else if (!this.f67251a) {
                        return 1;
                    }
                } else if (this.f67251a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f67251a ? 1 : 0;
            }
            return 2;
        }
    }

    public static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f67252a = new b();

        @Override // w0.p.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int i13 = 2;
            while (i10 < i12 && i13 == 2) {
                i13 = p.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return i13;
        }
    }

    public interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    public static abstract class d implements o {

        /* renamed from: a, reason: collision with root package name */
        public final c f67253a;

        public d(c cVar) {
            this.f67253a = cVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i10, int i11) {
            int a10 = this.f67253a.a(charSequence, i10, i11);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                return a();
            }
            return false;
        }

        @Override // w0.o
        public boolean isRtl(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f67253a == null ? a() : b(charSequence, i10, i11);
        }
    }

    public static class e extends d {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f67254b;

        public e(c cVar, boolean z10) {
            super(cVar);
            this.f67254b = z10;
        }

        @Override // w0.p.d
        public boolean a() {
            return this.f67254b;
        }
    }

    public static class f extends d {

        /* renamed from: b, reason: collision with root package name */
        public static final f f67255b = new f();

        public f() {
            super(null);
        }

        @Override // w0.p.d
        public boolean a() {
            return q.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f67252a;
        f67246c = new e(bVar, false);
        f67247d = new e(bVar, true);
        f67248e = new e(a.f67250b, false);
        f67249f = f.f67255b;
    }

    public static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}

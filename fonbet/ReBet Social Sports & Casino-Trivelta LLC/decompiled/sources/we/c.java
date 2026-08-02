package we;

/* loaded from: classes4.dex */
public abstract class c extends d {

    /* renamed from: h0, reason: collision with root package name */
    public final int f67614h0;

    /* renamed from: i0, reason: collision with root package name */
    public final String f67615i0;

    public static final class a extends c {

        /* renamed from: j0, reason: collision with root package name */
        public final String f67616j0;

        public a(String str) {
            super(5201, str);
            this.f67616j0 = str;
        }

        @Override // we.d
        public String b() {
            return this.f67616j0;
        }
    }

    public static final class b extends c {

        /* renamed from: j0, reason: collision with root package name */
        public final String f67617j0;

        public b(String str) {
            super(5203, str);
            this.f67617j0 = str;
        }

        @Override // we.d
        public String b() {
            return this.f67617j0;
        }
    }

    /* renamed from: we.c$c, reason: collision with other inner class name */
    public static final class C0962c extends c {

        /* renamed from: j0, reason: collision with root package name */
        public final String f67618j0;

        public C0962c(String str) {
            super(5202, str);
            this.f67618j0 = str;
        }

        @Override // we.d
        public String b() {
            return this.f67618j0;
        }
    }

    public c(int i10, String str) {
        super(i10, str);
        this.f67614h0 = i10;
        this.f67615i0 = str;
    }

    @Override // we.d
    public int a() {
        return this.f67614h0;
    }
}

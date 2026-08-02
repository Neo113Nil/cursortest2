package we;

/* renamed from: we.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6744a extends d {

    /* renamed from: h0, reason: collision with root package name */
    public final int f67604h0;

    /* renamed from: i0, reason: collision with root package name */
    public final String f67605i0;

    /* renamed from: we.a$a, reason: collision with other inner class name */
    public static final class C0960a extends AbstractC6744a {

        /* renamed from: j0, reason: collision with root package name */
        public final String f67606j0;

        public C0960a(String str) {
            super(5100, str);
            this.f67606j0 = str;
        }

        @Override // we.d
        public String b() {
            return this.f67606j0;
        }
    }

    public AbstractC6744a(int i10, String str) {
        super(i10, str);
        this.f67604h0 = i10;
        this.f67605i0 = str;
    }

    @Override // we.d
    public int a() {
        return this.f67604h0;
    }
}

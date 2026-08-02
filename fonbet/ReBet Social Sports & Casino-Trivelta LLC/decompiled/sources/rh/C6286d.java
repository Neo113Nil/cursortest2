package rh;

/* renamed from: rh.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6286d implements InterfaceC6300r {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC6300r f64392a = new C6286d();

    /* renamed from: rh.d$a */
    public static final class a implements InterfaceC6291i {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC6292j f64393a;

        public static a b() {
            return new a();
        }

        @Override // rh.InterfaceC6291i
        public InterfaceC6290h a() {
            if (this.f64393a == null) {
                this.f64393a = InterfaceC6290h.current().a();
            }
            return InterfaceC6290h.i(this.f64393a);
        }
    }

    public static InterfaceC6300r b() {
        return f64392a;
    }

    @Override // rh.InterfaceC6300r
    public InterfaceC6291i a(String str) {
        return a.b();
    }
}

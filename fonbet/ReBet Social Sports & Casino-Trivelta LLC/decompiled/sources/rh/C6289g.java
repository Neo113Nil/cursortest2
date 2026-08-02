package rh;

/* renamed from: rh.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6289g implements InterfaceC6290h {

    /* renamed from: b, reason: collision with root package name */
    public static final C6289g f64399b = new C6289g(InterfaceC6292j.e());

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6292j f64400a;

    public C6289g(InterfaceC6292j interfaceC6292j) {
        this.f64400a = interfaceC6292j;
    }

    public static InterfaceC6290h c(InterfaceC6292j interfaceC6292j) {
        return new C6289g(interfaceC6292j);
    }

    @Override // rh.InterfaceC6290h, Bh.l
    public InterfaceC6292j a() {
        return this.f64400a;
    }

    public String toString() {
        return "PropagatedSpan{" + this.f64400a + '}';
    }

    @Override // rh.InterfaceC6290h
    public void end() {
    }

    @Override // rh.InterfaceC6290h
    public InterfaceC6290h g(oh.e eVar, Object obj) {
        return this;
    }

    @Override // rh.InterfaceC6290h
    public InterfaceC6290h h(String str, String str2) {
        return this;
    }

    @Override // rh.InterfaceC6290h
    public InterfaceC6290h j(String str, boolean z10) {
        return this;
    }

    @Override // rh.InterfaceC6290h
    public InterfaceC6290h k(String str, long j10) {
        return this;
    }
}

package j$.util.stream;

/* loaded from: classes2.dex */
public final class x4 extends y4 {
    @Override // j$.util.stream.t4, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f18164b);
    }

    @Override // j$.util.stream.s4
    public final void j(s4 s4Var) {
        this.f18164b += ((y4) s4Var).f18164b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f18164b++;
    }
}

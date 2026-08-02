package xe;

/* loaded from: classes.dex */
public class D0 extends H0 implements InterfaceC10756x {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f105377c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(B0 b02) {
        super(true);
        boolean z11 = true;
        Y(b02);
        InterfaceC10746s T11 = T();
        C10748t c10748t = T11 instanceof C10748t ? (C10748t) T11 : null;
        if (c10748t != null) {
            H0 m11 = c10748t.m();
            while (!m11.N()) {
                InterfaceC10746s T12 = m11.T();
                C10748t c10748t2 = T12 instanceof C10748t ? (C10748t) T12 : null;
                if (c10748t2 != null) {
                    m11 = c10748t2.m();
                }
            }
            this.f105377c = z11;
        }
        z11 = false;
        this.f105377c = z11;
    }

    @Override // xe.H0
    public final boolean N() {
        return this.f105377c;
    }

    @Override // xe.H0
    public final boolean P() {
        return true;
    }
}

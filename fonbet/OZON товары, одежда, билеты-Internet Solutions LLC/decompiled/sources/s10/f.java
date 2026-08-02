package s10;

import si.C9699b;

/* loaded from: classes7.dex */
public final class f implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98135a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f98136b;

    public /* synthetic */ f(Object obj, int i11) {
        this.f98135a = i11;
        this.f98136b = obj;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f98135a) {
            case 0:
                ((d) this.f98136b).getClass();
                return new jk0.h();
            default:
                return new C9699b((Oi.b) ((Pc.a) this.f98136b).get());
        }
    }
}

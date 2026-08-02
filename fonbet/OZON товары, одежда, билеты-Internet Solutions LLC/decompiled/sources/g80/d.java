package g80;

import b40.InterfaceC5539a;
import x70.C10675b;

/* loaded from: classes3.dex */
public final class d implements Jb.e<c> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f64088a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.f f64089b;

    public d(Jb.f fVar, Jb.f fVar2) {
        this.f64088a = fVar;
        this.f64089b = fVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new c((C10675b) this.f64088a.get(), (InterfaceC5539a) this.f64089b.get());
    }
}

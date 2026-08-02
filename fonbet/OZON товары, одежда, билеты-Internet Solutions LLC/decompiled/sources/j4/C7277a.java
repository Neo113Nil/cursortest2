package j4;

import N3.G;
import N3.InterfaceC3665p;
import N3.J;
import N3.q;
import N3.r;
import java.io.IOException;

/* renamed from: j4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7277a implements InterfaceC3665p {

    /* renamed from: a, reason: collision with root package name */
    private final J f69428a = new J(35152, 2, "image/png");

    @Override // N3.InterfaceC3665p
    public final void a(long j11, long j12) {
        this.f69428a.a(j11, j12);
    }

    @Override // N3.InterfaceC3665p
    public final void b(r rVar) {
        this.f69428a.b(rVar);
    }

    @Override // N3.InterfaceC3665p
    public final boolean d(q qVar) throws IOException {
        return this.f69428a.d(qVar);
    }

    @Override // N3.InterfaceC3665p
    public final int f(q qVar, G g10) throws IOException {
        return this.f69428a.f(qVar, g10);
    }

    @Override // N3.InterfaceC3665p
    public final void release() {
    }
}

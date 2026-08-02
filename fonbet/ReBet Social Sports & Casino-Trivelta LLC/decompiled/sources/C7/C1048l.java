package C7;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import x6.g;

/* renamed from: C7.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1048l implements InterfaceC1053q {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1049m f1292a;

    public C1048l(InterfaceC1049m interfaceC1049m) {
        this.f1292a = interfaceC1049m;
    }

    public static x6.g b(x6.d dVar, x6.f fVar) {
        return c(dVar, fVar, Executors.newSingleThreadExecutor());
    }

    public static x6.g c(x6.d dVar, x6.f fVar, Executor executor) {
        return new x6.g(fVar, dVar.h(), new g.c(dVar.k(), dVar.j(), dVar.f()), dVar.e(), dVar.d(), dVar.g(), executor, dVar.i());
    }

    @Override // C7.InterfaceC1053q
    public x6.k a(x6.d dVar) {
        return b(dVar, this.f1292a.a(dVar));
    }
}

package l0;

import fd.InterfaceC6511n;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: l0.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7761e extends AbstractC7737t implements InterfaceC6511n<B1.Y, B1.U, Z1.b, B1.W> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ N f72084b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7761e(N n11) {
        super(3);
        this.f72084b = n11;
    }

    @Override // fd.InterfaceC6511n
    public final B1.W invoke(B1.Y y11, B1.U u11, Z1.b bVar) {
        B1.W z02;
        B1.m0 a02 = u11.a0(bVar.p());
        z02 = y11.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new C7760d(a02, this.f72084b));
        return z02;
    }
}

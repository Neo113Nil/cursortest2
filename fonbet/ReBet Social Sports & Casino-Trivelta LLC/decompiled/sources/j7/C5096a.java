package j7;

import d7.InterfaceC4015d;
import kotlin.jvm.internal.Intrinsics;
import v7.InterfaceC6646a;

/* renamed from: j7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5096a implements InterfaceC4015d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6646a f53809a;

    public C5096a(InterfaceC6646a animatedDrawableBackend) {
        Intrinsics.checkNotNullParameter(animatedDrawableBackend, "animatedDrawableBackend");
        this.f53809a = animatedDrawableBackend;
    }

    @Override // d7.InterfaceC4015d
    public int a() {
        return this.f53809a.a();
    }

    @Override // d7.InterfaceC4015d
    public int b() {
        return this.f53809a.b();
    }

    @Override // d7.InterfaceC4015d
    public int c() {
        return this.f53809a.d();
    }

    @Override // d7.InterfaceC4015d
    public int h() {
        return this.f53809a.getHeight();
    }

    @Override // d7.InterfaceC4015d
    public int l(int i10) {
        return this.f53809a.g(i10);
    }

    @Override // d7.InterfaceC4015d
    public int n() {
        return this.f53809a.getWidth();
    }
}

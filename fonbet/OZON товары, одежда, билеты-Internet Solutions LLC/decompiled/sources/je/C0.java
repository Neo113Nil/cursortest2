package je;

import kotlin.jvm.internal.Intrinsics;
import ud.InterfaceC10030h;

/* loaded from: classes10.dex */
public final class C0 extends B0 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B0 f69826b;

    C0(B0 b02) {
        this.f69826b = b02;
    }

    @Override // je.B0
    public final InterfaceC10030h d(InterfaceC10030h annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return this.f69826b.d(annotations);
    }

    @Override // je.B0
    public final y0 e(N key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f69826b.e(key);
    }

    @Override // je.B0
    public final boolean f() {
        return this.f69826b.f();
    }

    @Override // je.B0
    public final N g(N topLevelType, L0 position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return this.f69826b.g(topLevelType, position);
    }
}

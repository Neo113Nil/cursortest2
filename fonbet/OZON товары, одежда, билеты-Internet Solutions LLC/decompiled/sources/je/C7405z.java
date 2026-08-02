package je;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ud.InterfaceC10030h;

/* renamed from: je.z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7405z extends B0 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final B0 f69941b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final B0 f69942c;

    public C7405z(B0 b02, B0 b03) {
        this.f69941b = b02;
        this.f69942c = b03;
    }

    @NotNull
    public static final B0 h(@NotNull B0 first, @NotNull B0 second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return first.f() ? second : second.f() ? first : new C7405z(first, second);
    }

    @Override // je.B0
    public final boolean a() {
        return this.f69941b.a() || this.f69942c.a();
    }

    @Override // je.B0
    public final boolean b() {
        return this.f69941b.b() || this.f69942c.b();
    }

    @Override // je.B0
    @NotNull
    public final InterfaceC10030h d(@NotNull InterfaceC10030h annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return this.f69942c.d(this.f69941b.d(annotations));
    }

    @Override // je.B0
    public final y0 e(@NotNull N key) {
        Intrinsics.checkNotNullParameter(key, "key");
        y0 e11 = this.f69941b.e(key);
        return e11 == null ? this.f69942c.e(key) : e11;
    }

    @Override // je.B0
    @NotNull
    public final N g(@NotNull N topLevelType, @NotNull L0 position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return this.f69942c.g(this.f69941b.g(topLevelType, position), position);
    }
}

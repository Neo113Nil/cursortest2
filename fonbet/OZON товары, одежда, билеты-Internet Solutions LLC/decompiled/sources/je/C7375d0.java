package je;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: je.d0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7375d0 extends z0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Y f69874a;

    public C7375d0(@NotNull qd.m kotlinBuiltIns) {
        Intrinsics.checkNotNullParameter(kotlinBuiltIns, "kotlinBuiltIns");
        Y C11 = kotlinBuiltIns.C();
        Intrinsics.checkNotNullExpressionValue(C11, "getNullableAnyType(...)");
        this.f69874a = C11;
    }

    @Override // je.y0
    public final boolean a() {
        return true;
    }

    @Override // je.y0
    @NotNull
    public final L0 b() {
        return L0.OUT_VARIANCE;
    }

    @Override // je.y0
    @NotNull
    public final y0 c(@NotNull ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // je.y0
    @NotNull
    public final N getType() {
        return this.f69874a;
    }
}

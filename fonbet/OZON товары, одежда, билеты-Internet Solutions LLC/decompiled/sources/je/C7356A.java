package je;

import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;

/* renamed from: je.A, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7356A extends AbstractC7360E {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final o0 f69822d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C7356A(@NotNull qd.m builtIns, @NotNull o0 attributes) {
        super(r0, r3);
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Y B11 = builtIns.B();
        Intrinsics.checkNotNullExpressionValue(B11, "getNothingType(...)");
        Y C11 = builtIns.C();
        Intrinsics.checkNotNullExpressionValue(C11, "getNullableAnyType(...)");
        this.f69822d = attributes;
    }

    @Override // je.AbstractC7360E, je.N
    @NotNull
    public final o0 G0() {
        return this.f69822d;
    }

    @Override // je.AbstractC7360E, je.N
    public final boolean I0() {
        return false;
    }

    @Override // je.N
    public final N J0(ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // je.K0
    public final K0 L0(boolean z11) {
        return this;
    }

    @Override // je.K0
    public final K0 M0(ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // je.K0
    public final K0 N0(o0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new C7356A(C8701c.h(Q0()), newAttributes);
    }

    @Override // je.AbstractC7360E
    @NotNull
    public final Y O0() {
        return Q0();
    }

    @Override // je.AbstractC7360E
    @NotNull
    public final String R0(@NotNull Ud.u renderer, @NotNull Ud.u options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        return "dynamic";
    }
}

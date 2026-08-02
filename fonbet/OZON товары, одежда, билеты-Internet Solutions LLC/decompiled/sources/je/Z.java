package je;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class Z extends Y {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final s0 f69864b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<y0> f69865c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f69866d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ce.l f69867e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function1<ke.h, Y> f69868f;

    /* JADX WARN: Multi-variable type inference failed */
    public Z(@NotNull s0 constructor, @NotNull List<? extends y0> arguments, boolean z11, @NotNull ce.l memberScope, @NotNull Function1<? super ke.h, ? extends Y> refinedTypeFactory) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(refinedTypeFactory, "refinedTypeFactory");
        this.f69864b = constructor;
        this.f69865c = arguments;
        this.f69866d = z11;
        this.f69867e = memberScope;
        this.f69868f = refinedTypeFactory;
        if (!(memberScope instanceof le.g) || (memberScope instanceof le.m)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + memberScope + '\n' + constructor);
    }

    @Override // je.N
    @NotNull
    public final List<y0> F0() {
        return this.f69865c;
    }

    @Override // je.N
    @NotNull
    public final o0 G0() {
        o0.f69907b.getClass();
        return o0.f69908c;
    }

    @Override // je.N
    @NotNull
    public final s0 H0() {
        return this.f69864b;
    }

    @Override // je.N
    public final boolean I0() {
        return this.f69866d;
    }

    @Override // je.N
    /* renamed from: J0 */
    public final N M0(ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        Y invoke = this.f69868f.invoke(kotlinTypeRefiner);
        return invoke == null ? this : invoke;
    }

    @Override // je.K0
    public final K0 M0(ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        Y invoke = this.f69868f.invoke(kotlinTypeRefiner);
        return invoke == null ? this : invoke;
    }

    @Override // je.Y
    @NotNull
    /* renamed from: O0 */
    public final Y L0(boolean z11) {
        return z11 == this.f69866d ? this : z11 ? new X(this) : new V(this);
    }

    @Override // je.Y
    @NotNull
    /* renamed from: P0 */
    public final Y N0(@NotNull o0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new C7369a0(this, newAttributes);
    }

    @Override // je.N
    @NotNull
    public final ce.l p() {
        return this.f69867e;
    }
}

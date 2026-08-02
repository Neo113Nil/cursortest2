package je;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: je.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7376e extends Y {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ke.s f69875b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f69876c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final le.g f69877d;

    public AbstractC7376e(@NotNull ke.s originalTypeVariable, boolean z11) {
        Intrinsics.checkNotNullParameter(originalTypeVariable, "originalTypeVariable");
        this.f69875b = originalTypeVariable;
        this.f69876c = z11;
        this.f69877d = le.l.b(le.h.STUB_TYPE_SCOPE, originalTypeVariable.toString());
    }

    @Override // je.N
    @NotNull
    public final List<y0> F0() {
        return kotlin.collections.K.f71697a;
    }

    @Override // je.N
    @NotNull
    public final o0 G0() {
        o0.f69907b.getClass();
        return o0.f69908c;
    }

    @Override // je.N
    public final boolean I0() {
        return this.f69876c;
    }

    @Override // je.N
    /* renamed from: J0 */
    public final N M0(ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // je.K0
    public final K0 M0(ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // je.Y, je.K0
    public final K0 N0(o0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return this;
    }

    @Override // je.Y
    @NotNull
    /* renamed from: O0 */
    public final Y L0(boolean z11) {
        return z11 == this.f69876c ? this : R0(z11);
    }

    @Override // je.Y
    @NotNull
    /* renamed from: P0 */
    public final Y N0(@NotNull o0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return this;
    }

    @NotNull
    public final ke.s Q0() {
        return this.f69875b;
    }

    @NotNull
    public abstract C7385i0 R0(boolean z11);

    @Override // je.N
    @NotNull
    public ce.l p() {
        return this.f69877d;
    }
}

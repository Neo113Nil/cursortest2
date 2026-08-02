package je;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: je.x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC7403x extends AbstractC7402w {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Y f69935b;

    public AbstractC7403x(@NotNull Y delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f69935b = delegate;
    }

    @Override // je.Y
    @NotNull
    /* renamed from: O0 */
    public final Y L0(boolean z11) {
        return z11 == I0() ? this : this.f69935b.L0(z11).N0(G0());
    }

    @Override // je.Y
    @NotNull
    /* renamed from: P0 */
    public final Y N0(@NotNull o0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return newAttributes != G0() ? new C7369a0(this, newAttributes) : this;
    }

    @Override // je.AbstractC7402w
    @NotNull
    protected final Y Q0() {
        return this.f69935b;
    }
}

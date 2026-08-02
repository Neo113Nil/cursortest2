package je;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: je.a0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C7369a0 extends AbstractC7403x {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final o0 f69871c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7369a0(@NotNull Y delegate, @NotNull o0 attributes) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f69871c = attributes;
    }

    @Override // je.AbstractC7402w, je.N
    @NotNull
    public final o0 G0() {
        return this.f69871c;
    }

    @Override // je.AbstractC7402w
    public final AbstractC7402w S0(Y delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new C7369a0(delegate, this.f69871c);
    }
}

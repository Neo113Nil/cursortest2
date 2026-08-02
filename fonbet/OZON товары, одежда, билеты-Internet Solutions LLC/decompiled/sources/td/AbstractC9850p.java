package td;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: td.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9850p extends AbstractC9853s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final s0 f99398a;

    public AbstractC9850p(@NotNull s0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f99398a = delegate;
    }

    @Override // td.AbstractC9853s
    @NotNull
    public final s0 a() {
        return this.f99398a;
    }

    @Override // td.AbstractC9853s
    @NotNull
    public final String b() {
        return this.f99398a.b();
    }

    @Override // td.AbstractC9853s
    @NotNull
    public final AbstractC9853s d() {
        AbstractC9853s j11 = C9852r.j(this.f99398a.d());
        Intrinsics.checkNotNullExpressionValue(j11, "toDescriptorVisibility(...)");
        return j11;
    }
}

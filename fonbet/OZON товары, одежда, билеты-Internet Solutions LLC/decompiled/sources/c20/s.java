package c20;

import Sc.InterfaceC3999a;
import androidx.lifecycle.AbstractC5434v;
import d20.AbstractC6065b;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* loaded from: classes7.dex */
public abstract class s<S, I extends l20.c> extends r<S, I> implements InterfaceC5736d {
    protected void afterChange(@NotNull l10.i container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }

    public void beforeChange(@NotNull l10.i container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }

    @Override // c20.r
    @NotNull
    public final AbstractC6065b<I> createHolder(@NotNull l10.i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        throw new IllegalStateException("Unsupported operation on old OverlayWidgetApi");
    }

    @Override // c20.InterfaceC5736d
    public void onRefresh(@NotNull l10.i container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }

    public abstract void removeItem(@NotNull l10.i iVar, @NotNull ru.ozon.composer.ui.widget.l lVar);

    public final void safeAfterChange$composer_recycler_ui_release(@NotNull l10.i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (container.Q().g().getLifecycle().b() == AbstractC5434v.b.DESTROYED) {
            return;
        }
        afterChange(container);
    }

    public abstract void setItem(@NotNull l10.i iVar, @NotNull ru.ozon.composer.ui.widget.l lVar);
}

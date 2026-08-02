package ru.ozon.composer.ui.loader.snapshot;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import z10.c;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/composer/ui/loader/snapshot/FullComposerSnapshotHolderCoordinatorLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Lz10/c;", "composer-recycler-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FullComposerSnapshotHolderCoordinatorLayout extends CoordinatorLayout implements c {

    /* renamed from: a, reason: collision with root package name */
    private boolean f94827a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullComposerSnapshotHolderCoordinatorLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // z10.c
    public final void a(boolean z11) {
        this.f94827a = z11;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        this.f94827a = false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup
    protected final boolean drawChild(@NotNull Canvas canvas, View view, long j11) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!this.f94827a) {
            return super.drawChild(canvas, view, j11);
        }
        Object tag = view != null ? view.getTag(R.id.tag_skip_draw_in_composer_snapshot) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null ? bool.booleanValue() : false) {
            return false;
        }
        return super.drawChild(canvas, view, j11);
    }
}

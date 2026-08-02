package ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.presentation.controllers;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/controllers/ToolbarLayoutController;", "", "collapsingToolbarLayout", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "<init>", "(Lcom/google/android/material/appbar/CollapsingToolbarLayout;)V", "configToolbarLayout", "", "backgroundView", "Landroid/view/View;", "contentPlaceholderView", "restoreToolbarLayout", "updateToolbarLayoutHeight", "newHeight", "", "bindBottomRadius", "radius", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ToolbarLayoutController {

    @NotNull
    private final CollapsingToolbarLayout collapsingToolbarLayout;

    public ToolbarLayoutController(@NotNull CollapsingToolbarLayout collapsingToolbarLayout) {
        Intrinsics.checkNotNullParameter(collapsingToolbarLayout, "collapsingToolbarLayout");
        this.collapsingToolbarLayout = collapsingToolbarLayout;
    }

    public final void bindBottomRadius(final float radius) {
        this.collapsingToolbarLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.presentation.controllers.ToolbarLayoutController$bindBottomRadius$backgroundOutlineProvider$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                Intrinsics.checkNotNullParameter(view, "view");
                if (outline != null) {
                    outline.setRoundRect(0, -((int) radius), view.getWidth(), view.getHeight(), radius);
                }
            }
        });
        this.collapsingToolbarLayout.setClipToOutline(true);
    }

    public final void configToolbarLayout(@NotNull View backgroundView, @NotNull View contentPlaceholderView) {
        Intrinsics.checkNotNullParameter(backgroundView, "backgroundView");
        Intrinsics.checkNotNullParameter(contentPlaceholderView, "contentPlaceholderView");
        CollapsingToolbarLayout collapsingToolbarLayout = this.collapsingToolbarLayout;
        ViewGroup.LayoutParams layoutParams = collapsingToolbarLayout.getLayoutParams();
        AppBarLayout.d dVar = layoutParams instanceof AppBarLayout.d ? (AppBarLayout.d) layoutParams : null;
        if (dVar != null) {
            dVar.b(3);
        }
        collapsingToolbarLayout.addView(backgroundView, 0);
        collapsingToolbarLayout.addView(contentPlaceholderView, 1);
        ViewExtKt.show(collapsingToolbarLayout);
    }

    public final void restoreToolbarLayout(@NotNull View backgroundView, @NotNull View contentPlaceholderView) {
        Intrinsics.checkNotNullParameter(backgroundView, "backgroundView");
        Intrinsics.checkNotNullParameter(contentPlaceholderView, "contentPlaceholderView");
        CollapsingToolbarLayout collapsingToolbarLayout = this.collapsingToolbarLayout;
        collapsingToolbarLayout.removeView(contentPlaceholderView);
        collapsingToolbarLayout.removeView(backgroundView);
        collapsingToolbarLayout.setOutlineProvider(null);
        collapsingToolbarLayout.setClipToOutline(false);
        ViewExtKt.gone(collapsingToolbarLayout);
    }

    public final void updateToolbarLayoutHeight(int newHeight) {
        if (newHeight == this.collapsingToolbarLayout.getHeight()) {
            return;
        }
        CollapsingToolbarLayout collapsingToolbarLayout = this.collapsingToolbarLayout;
        ViewGroup.LayoutParams layoutParams = collapsingToolbarLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = newHeight;
        collapsingToolbarLayout.setLayoutParams(layoutParams);
    }
}

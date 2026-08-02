package ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.presentation.controllers;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C5316f0;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/controllers/ToolbarController;", "", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "<init>", "(Landroidx/appcompat/widget/Toolbar;)V", "toolbarPaddings", "", "toolbarChildren", "", "Landroid/view/View;", "configToolbar", "", "fixedPlaceholderView", "restoreToolbar", "updateTopPadding", "topPadding", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ToolbarController {

    @NotNull
    private final Toolbar toolbar;

    @NotNull
    private List<View> toolbarChildren;
    private int[] toolbarPaddings;

    public ToolbarController(@NotNull Toolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        this.toolbar = toolbar;
        this.toolbarChildren = new ArrayList();
    }

    public final void configToolbar(@NotNull View fixedPlaceholderView) {
        Intrinsics.checkNotNullParameter(fixedPlaceholderView, "fixedPlaceholderView");
        Toolbar toolbar = this.toolbar;
        this.toolbarChildren.clear();
        C7714v.q(this.toolbarChildren, C5316f0.b(toolbar));
        toolbar.removeAllViews();
        this.toolbarPaddings = new int[]{toolbar.getPaddingLeft(), toolbar.getPaddingTop(), toolbar.getPaddingRight(), toolbar.getPaddingBottom()};
        toolbar.setPadding(0, 0, 0, 0);
        ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams");
        }
        CollapsingToolbarLayout.a aVar = (CollapsingToolbarLayout.a) layoutParams;
        ((FrameLayout.LayoutParams) aVar).height = -2;
        aVar.a(1);
        toolbar.setLayoutParams(aVar);
        toolbar.setBackgroundColor(0);
        toolbar.addView(fixedPlaceholderView, 0);
        ViewExtKt.show(toolbar);
    }

    public final void restoreToolbar() {
        Toolbar toolbar = this.toolbar;
        int[] iArr = this.toolbarPaddings;
        if (iArr != null) {
            toolbar.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        this.toolbarPaddings = null;
        toolbar.removeAllViews();
        Iterator<T> it = this.toolbarChildren.iterator();
        while (it.hasNext()) {
            toolbar.addView((View) it.next());
        }
        this.toolbarChildren.clear();
        ViewExtKt.gone(toolbar);
    }

    public final void updateTopPadding(int topPadding) {
        this.toolbar.setPadding(0, topPadding, 0, 0);
    }
}

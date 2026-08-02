package ru.ozon.app.android.travel.utils.toolbar;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/utils/toolbar/TransparentToolbarController;", "Lru/ozon/app/android/travel/utils/toolbar/ToolbarController;", "<init>", "()V", "toolbarPaddings", "", "toolbarChildren", "", "Landroid/view/View;", "originalToolbarColor", "", "Ljava/lang/Integer;", "configToolbar", "", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "content", "restoreToolbar", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TransparentToolbarController implements ToolbarController {
    private Integer originalToolbarColor;

    @NotNull
    private List<View> toolbarChildren = new ArrayList();
    private int[] toolbarPaddings;

    @Override // ru.ozon.app.android.travel.utils.toolbar.ToolbarController
    public void configToolbar(@NotNull Toolbar toolbar, @NotNull View content) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(content, "content");
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
        toolbar.setLayoutParams(aVar);
        Drawable background = toolbar.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        this.originalToolbarColor = colorDrawable != null ? Integer.valueOf(colorDrawable.getColor()) : null;
        toolbar.setBackgroundColor(0);
        toolbar.addView(content);
        Object parent = toolbar.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            ViewExtKt.show(view);
        }
        ViewExtKt.show(toolbar);
    }

    @Override // ru.ozon.app.android.travel.utils.toolbar.ToolbarController
    public void restoreToolbar(@NotNull Toolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
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
        Integer num = this.originalToolbarColor;
        if (num != null) {
            toolbar.setBackgroundColor(num.intValue());
        }
        Object parent = toolbar.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            ViewExtKt.gone(view);
        }
        ViewExtKt.gone(toolbar);
    }
}

package ru.ozon.app.android.travel.molecules.extensions;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "<unused var>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ViewExtensionsKt$centerInToolbar$1$listener$1 implements View.OnLayoutChangeListener {
    final /* synthetic */ View $this_centerInToolbar;

    ViewExtensionsKt$centerInToolbar$1$listener$1(View view) {
        this.$this_centerInToolbar = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int left;
        int width;
        ViewParent parent = this.$this_centerInToolbar.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        ViewParent parent2 = viewGroup.getParent();
        ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup2 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null || (left = viewGroup.getLeft()) == (width = viewGroup2.getWidth() - viewGroup.getRight())) {
            return;
        }
        int i19 = (left - marginLayoutParams.leftMargin) - (width - marginLayoutParams.rightMargin);
        marginLayoutParams.leftMargin = 0;
        marginLayoutParams.rightMargin = 0;
        if (i19 < 0) {
            marginLayoutParams.leftMargin = -i19;
        } else if (i19 > 0) {
            marginLayoutParams.rightMargin = i19;
        }
        viewGroup.setLayoutParams(marginLayoutParams);
    }
}

package ru.ozon.app.android.travel.utils.extensions;

import CU.a;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\u0011\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0013\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0015\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0012\u001a#\u0010\u0016\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0014\u001a+\u0010\u0017\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0012\u001a+\u0010\u0018\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0012\u001a+\u0010\u0019\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u0012\u001a#\u0010\u001a\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0014\u001a+\u0010\u001b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u0012\u001a#\u0010\u001c\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u0014\u001a+\u0010\u001d\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u0012\u001a+\u0010\u001e\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u0012\u001a!\u0010\u0011\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u001f\u001a\u0019\u0010\u0013\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\f\u001a!\u0010\u0015\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u001f\u001a\u0019\u0010\u0016\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\f\u001a!\u0010\u0017\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u001f\u001a!\u0010\u0018\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u001f\u001a!\u0010\u0019\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001f\u001a\u0019\u0010\u001a\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\f\u001a!\u0010\u001b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001f\u001a\u0019\u0010\u001c\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\f\u001a!\u0010\u001d\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001f\u001a!\u0010\u001e\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001f\u001a!\u0010 \u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function1;", "Landroidx/constraintlayout/widget/d;", "", "block", "applyConstraint", "(Landroidx/constraintlayout/widget/ConstraintLayout;Lkotlin/jvm/functions/Function1;)V", "clearConstraints", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "Landroid/view/View;", "view", "clear", "(Landroidx/constraintlayout/widget/d;Landroid/view/View;)V", "view1", "view2", "", "margin", "topToTop", "(Landroidx/constraintlayout/widget/d;Landroid/view/View;Landroid/view/View;I)V", "topToParent", "(Landroidx/constraintlayout/widget/d;Landroid/view/View;I)V", "bottomToBottom", "bottomToParent", "topToBottom", "bottomToTop", "startToStart", "startToParent", "endToEnd", "endToParent", "startToEnd", "endToStart", "(Landroidx/constraintlayout/widget/d;Landroid/view/View;Landroid/view/View;)V", "baselineToBaseline", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConstraintLayoutExtensionsKt {
    public static final void applyConstraint(@NotNull ConstraintLayout constraintLayout, @NotNull Function1<? super d, Unit> block) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        d dVar = new d();
        dVar.p(constraintLayout);
        block.invoke(dVar);
        dVar.f(constraintLayout);
    }

    public static final void baselineToBaseline(@NotNull d dVar, @NotNull View view, @NotNull View view2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(a.a(view, "view1", view2, "view2"), 5, view2.getId(), 5);
    }

    public static final void bottomToBottom(@NotNull d dVar, @NotNull View view, @NotNull View view2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(a.a(view, "view1", view2, "view2"), 4, view2.getId(), 4);
    }

    public static final void bottomToParent(@NotNull d dVar, @NotNull View view1, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(view1, "view1");
        dVar.t(view1.getId(), 4, 0, 4, i11);
    }

    public static final void bottomToTop(@NotNull d dVar, @NotNull View view, @NotNull View view2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(a.a(view, "view1", view2, "view2"), 4, view2.getId(), 3);
    }

    public static final void clear(@NotNull d dVar, @NotNull View view) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        dVar.o(view.getId(), 3);
        dVar.o(view.getId(), 4);
        dVar.o(view.getId(), 7);
        dVar.o(view.getId(), 6);
        dVar.o(view.getId(), 1);
        dVar.o(view.getId(), 2);
        dVar.o(view.getId(), 5);
    }

    public static final void clearConstraints(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            if (childAt == null) {
                return;
            }
            childAt.setLayoutParams(new ConstraintLayout.b(childAt.getLayoutParams().width, childAt.getLayoutParams().height));
        }
    }

    public static final void endToEnd(@NotNull d dVar, @NotNull View view, @NotNull View view2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(a.a(view, "view1", view2, "view2"), 7, view2.getId(), 7);
    }

    public static final void endToParent(@NotNull d dVar, @NotNull View view1, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(view1, "view1");
        dVar.t(view1.getId(), 7, 0, 7, i11);
    }

    public static final void endToStart(@NotNull d dVar, @NotNull View view, @NotNull View view2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(a.a(view, "view1", view2, "view2"), 7, view2.getId(), 6);
    }

    public static final void startToEnd(@NotNull d dVar, @NotNull View view, @NotNull View view2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(a.a(view, "view1", view2, "view2"), 6, view2.getId(), 7);
    }

    public static final void startToParent(@NotNull d dVar, @NotNull View view1, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(view1, "view1");
        dVar.t(view1.getId(), 6, 0, 6, i11);
    }

    public static final void startToStart(@NotNull d dVar, @NotNull View view, @NotNull View view2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(a.a(view, "view1", view2, "view2"), 6, view2.getId(), 6);
    }

    public static final void topToBottom(@NotNull d dVar, @NotNull View view, @NotNull View view2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(a.a(view, "view1", view2, "view2"), 3, view2.getId(), 4);
    }

    public static final void topToParent(@NotNull d dVar, @NotNull View view1, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(view1, "view1");
        dVar.t(view1.getId(), 3, 0, 3, i11);
    }

    public static final void topToTop(@NotNull d dVar, @NotNull View view, @NotNull View view2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(a.a(view, "view1", view2, "view2"), 3, view2.getId(), 3);
    }

    public static final void bottomToParent(@NotNull d dVar, @NotNull View view1) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(view1, "view1");
        dVar.s(view1.getId(), 4, 0, 4);
    }

    public static final void endToParent(@NotNull d dVar, @NotNull View view1) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(view1, "view1");
        dVar.s(view1.getId(), 7, 0, 7);
    }

    public static final void startToParent(@NotNull d dVar, @NotNull View view1) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(view1, "view1");
        dVar.s(view1.getId(), 6, 0, 6);
    }

    public static final void topToParent(@NotNull d dVar, @NotNull View view1) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(view1, "view1");
        dVar.s(view1.getId(), 3, 0, 3);
    }

    public static final void bottomToBottom(@NotNull d dVar, @NotNull View view, @NotNull View view2, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(a.a(view, "view1", view2, "view2"), 4, view2.getId(), 4, i11);
    }

    public static final void bottomToTop(@NotNull d dVar, @NotNull View view, @NotNull View view2, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(a.a(view, "view1", view2, "view2"), 4, view2.getId(), 3, i11);
    }

    public static final void endToEnd(@NotNull d dVar, @NotNull View view, @NotNull View view2, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(a.a(view, "view1", view2, "view2"), 7, view2.getId(), 7, i11);
    }

    public static final void endToStart(@NotNull d dVar, @NotNull View view, @NotNull View view2, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(a.a(view, "view1", view2, "view2"), 7, view2.getId(), 6, i11);
    }

    public static final void startToEnd(@NotNull d dVar, @NotNull View view, @NotNull View view2, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(a.a(view, "view1", view2, "view2"), 6, view2.getId(), 7, i11);
    }

    public static final void startToStart(@NotNull d dVar, @NotNull View view, @NotNull View view2, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(a.a(view, "view1", view2, "view2"), 6, view2.getId(), 6, i11);
    }

    public static final void topToBottom(@NotNull d dVar, @NotNull View view, @NotNull View view2, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(a.a(view, "view1", view2, "view2"), 3, view2.getId(), 4, i11);
    }

    public static final void topToTop(@NotNull d dVar, @NotNull View view, @NotNull View view2, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(a.a(view, "view1", view2, "view2"), 3, view2.getId(), 3, i11);
    }
}

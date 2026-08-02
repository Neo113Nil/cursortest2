package ru.ozon.uni.android.uikitsdk.ext;

import CU.a;
import android.view.View;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\u001a!\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\n\u001a!\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\n\u001a!\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\u0006\u001a!\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\n\u001a!\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u0006\u001a!\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\n\u001a)\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000f\u001a!\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0006\u001a!\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0006\u001a!\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\n\u001a!\u0010\u0012\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0006\u001a!\u0010\u0012\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\n\u001a!\u0010\u0013\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0006\u001a!\u0010\u0013\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\n\u001a\u0019\u0010\u0014\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0014\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0016\u001a\u0019\u0010\u0017\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0015\u001a!\u0010\u0017\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\n\u001a\u0019\u0010\u0017\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u0019\u0010\u0018\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0015\u001a\u0019\u0010\u0018\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u0019\u0010\u0019\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u0015\u001a\u0019\u0010\u0019\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u0016\u001a\u0019\u0010\u001a\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u0015\u001a!\u0010\u001d\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\n\u001a\u0019\u0010\u001a\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u0016\u001a#\u0010\u001e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010\u001e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\n\u001a-\u0010\"\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010\u000f¨\u0006#"}, d2 = {"Landroidx/constraintlayout/widget/d;", "Landroid/view/View;", "view", "anchorView", "", "layoutConstraintStartToStartOf", "(Landroidx/constraintlayout/widget/d;Landroid/view/View;Landroid/view/View;)V", "", "viewId", "anchorViewId", "(Landroidx/constraintlayout/widget/d;II)V", "layoutConstraintStartToEndOf", "layoutConstraintTopToTopOf", "layoutConstraintTopToBottomOf", "margin", "(Landroidx/constraintlayout/widget/d;III)V", "layoutConstraintEndToEndOf", "layoutConstraintEndToStartOf", "layoutConstraintBottomToBottomOf", "layoutConstraintBottomToTopOf", "layoutConstraintStartToStartOfParent", "(Landroidx/constraintlayout/widget/d;Landroid/view/View;)V", "(Landroidx/constraintlayout/widget/d;I)V", "layoutConstraintTopToTopOfParent", "layoutConstraintEndToEndOfParent", "layoutConstraintBottomToBottomOfParent", "centerInParent", "viewid", "toViewId", "constraintVerticallyRelativeTo", "setHorizontalMargin", "(Landroidx/constraintlayout/widget/d;Landroid/view/View;I)V", "leftId", "rightId", "addToPackedHorizontalChain", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConstraintSetExtKt {
    public static final void addToPackedHorizontalChain(@NotNull d dVar, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.c(i11, i12, i13);
        dVar.d0(i11, 2);
    }

    public static /* synthetic */ void addToPackedHorizontalChain$default(d dVar, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        addToPackedHorizontalChain(dVar, i11, i12, i13);
    }

    public static final void centerInParent(@NotNull d dVar, @NotNull View view) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        dVar.l(view.getId());
        dVar.m(view.getId());
    }

    public static final void constraintVerticallyRelativeTo(@NotNull d dVar, int i11, int i12) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        layoutConstraintTopToTopOf(dVar, i11, i12);
        layoutConstraintBottomToBottomOf(dVar, i11, i12);
    }

    public static final void layoutConstraintBottomToBottomOf(@NotNull d dVar, @NotNull View view, @NotNull View view2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(a.a(view, "view", view2, "anchorView"), 4, view2.getId(), 4);
    }

    public static final void layoutConstraintBottomToBottomOfParent(@NotNull d dVar, @NotNull View view) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        dVar.s(view.getId(), 4, 0, 4);
    }

    public static final void layoutConstraintBottomToTopOf(@NotNull d dVar, @NotNull View view, @NotNull View view2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(a.a(view, "view", view2, "anchorView"), 4, view2.getId(), 3);
    }

    public static final void layoutConstraintEndToEndOf(@NotNull d dVar, @NotNull View view, @NotNull View view2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(a.a(view, "view", view2, "anchorView"), 7, view2.getId(), 7);
    }

    public static final void layoutConstraintEndToEndOfParent(@NotNull d dVar, @NotNull View view) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        dVar.s(view.getId(), 7, 0, 7);
    }

    public static final void layoutConstraintEndToStartOf(@NotNull d dVar, @NotNull View view, @NotNull View view2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(a.a(view, "view", view2, "anchorView"), 7, view2.getId(), 6);
    }

    public static final void layoutConstraintStartToEndOf(@NotNull d dVar, @NotNull View view, @NotNull View view2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(a.a(view, "view", view2, "anchorView"), 6, view2.getId(), 7);
    }

    public static final void layoutConstraintStartToStartOf(@NotNull d dVar, @NotNull View view, @NotNull View view2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(a.a(view, "view", view2, "anchorView"), 6, view2.getId(), 6);
    }

    public static final void layoutConstraintStartToStartOfParent(@NotNull d dVar, @NotNull View view) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        dVar.s(view.getId(), 6, 0, 6);
    }

    public static final void layoutConstraintTopToBottomOf(@NotNull d dVar, @NotNull View view, @NotNull View view2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(a.a(view, "view", view2, "anchorView"), 3, view2.getId(), 4);
    }

    public static final void layoutConstraintTopToTopOf(@NotNull d dVar, @NotNull View view, @NotNull View view2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(a.a(view, "view", view2, "anchorView"), 3, view2.getId(), 3);
    }

    public static final void layoutConstraintTopToTopOfParent(@NotNull d dVar, @NotNull View view) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        dVar.s(view.getId(), 3, 0, 3);
    }

    public static final void setHorizontalMargin(@NotNull d dVar, @NotNull View view, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        setHorizontalMargin(dVar, view.getId(), i11);
    }

    public static final void layoutConstraintBottomToBottomOfParent(@NotNull d dVar, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(i11, 4, 0, 4);
    }

    public static final void layoutConstraintEndToEndOfParent(@NotNull d dVar, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(i11, 7, 0, 7);
    }

    public static final void layoutConstraintStartToStartOfParent(@NotNull d dVar, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(i11, 6, 0, 6);
    }

    public static final void layoutConstraintTopToTopOfParent(@NotNull d dVar, int i11, int i12) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(i11, 3, 0, 3, i12);
    }

    public static final void setHorizontalMargin(@NotNull d dVar, int i11, int i12) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.e0(i11, 6, i12);
        dVar.e0(i11, 7, i12);
    }

    public static final void centerInParent(@NotNull d dVar, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.l(i11);
        dVar.m(i11);
    }

    public static final void layoutConstraintTopToTopOfParent(@NotNull d dVar, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(i11, 3, 0, 3);
    }

    public static final void layoutConstraintBottomToBottomOf(@NotNull d dVar, int i11, int i12) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(i11, 4, i12, 4);
    }

    public static final void layoutConstraintBottomToTopOf(@NotNull d dVar, int i11, int i12) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(i11, 4, i12, 3);
    }

    public static final void layoutConstraintEndToStartOf(@NotNull d dVar, int i11, int i12) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(i11, 7, i12, 6);
    }

    public static final void layoutConstraintStartToEndOf(@NotNull d dVar, int i11, int i12) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(i11, 6, i12, 7);
    }

    public static final void layoutConstraintStartToStartOf(@NotNull d dVar, int i11, int i12) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(i11, 6, i12, 6);
    }

    public static final void layoutConstraintTopToBottomOf(@NotNull d dVar, int i11, int i12) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(i11, 3, i12, 4);
    }

    public static final void layoutConstraintTopToTopOf(@NotNull d dVar, int i11, int i12) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.s(i11, 3, i12, 3);
    }

    public static final void layoutConstraintTopToBottomOf(@NotNull d dVar, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(i11, 3, i12, 4, i13);
    }
}

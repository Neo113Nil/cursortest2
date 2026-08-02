package ru.ozon.app.android.orderdetails.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.orderdetails.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes13.dex */
public final class WidgetOrderTotalStickyLayoutBinding implements a {

    @NonNull
    public final Guideline guideline;

    @NonNull
    public final SingleAtom orderBtn;

    @NonNull
    public final ConstraintLayout orderTotalStickyCl;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView stickySubtitleTv;

    @NonNull
    public final SingleAtom stickyTitleTv;

    private WidgetOrderTotalStickyLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull SingleAtom singleAtom, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomView textAtomView, @NonNull SingleAtom singleAtom2) {
        this.rootView = constraintLayout;
        this.guideline = guideline;
        this.orderBtn = singleAtom;
        this.orderTotalStickyCl = constraintLayout2;
        this.stickySubtitleTv = textAtomView;
        this.stickyTitleTv = singleAtom2;
    }

    @NonNull
    public static WidgetOrderTotalStickyLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.guideline;
        Guideline guideline = (Guideline) C2548q.d(i11, view);
        if (guideline != null) {
            i11 = R$id.orderBtn;
            SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
            if (singleAtom != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.stickySubtitleTv;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    i11 = R$id.stickyTitleTv;
                    SingleAtom singleAtom2 = (SingleAtom) C2548q.d(i11, view);
                    if (singleAtom2 != null) {
                        return new WidgetOrderTotalStickyLayoutBinding(constraintLayout, guideline, singleAtom, constraintLayout, textAtomView, singleAtom2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}

package ru.ozon.app.android.storefront.filterWidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.storefront.filterWidgets.R$id;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes2.dex */
public final class WidgetFiltersColorFilterBinding implements a {

    @NonNull
    public final View anchor;

    @NonNull
    public final Barrier barrier;

    @NonNull
    public final View clickableArea;

    @NonNull
    public final RecyclerView colorsRv;

    @NonNull
    public final ImageView iconIv;

    @NonNull
    public final SingleAtom rightButton;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View separator;

    @NonNull
    public final View titleAnchor;

    @NonNull
    public final AppCompatTextView titleTv;

    private WidgetFiltersColorFilterBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull Barrier barrier, @NonNull View view2, @NonNull RecyclerView recyclerView, @NonNull ImageView imageView, @NonNull SingleAtom singleAtom, @NonNull View view3, @NonNull View view4, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.anchor = view;
        this.barrier = barrier;
        this.clickableArea = view2;
        this.colorsRv = recyclerView;
        this.iconIv = imageView;
        this.rightButton = singleAtom;
        this.separator = view3;
        this.titleAnchor = view4;
        this.titleTv = appCompatTextView;
    }

    @NonNull
    public static WidgetFiltersColorFilterBinding bind(@NonNull View view) {
        View d11;
        View d12;
        View d13;
        int i11 = R$id.anchor;
        View d14 = C2548q.d(i11, view);
        if (d14 != null) {
            i11 = R$id.barrier;
            Barrier barrier = (Barrier) C2548q.d(i11, view);
            if (barrier != null && (d11 = C2548q.d((i11 = R$id.clickableArea), view)) != null) {
                i11 = R$id.colorsRv;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    i11 = R$id.iconIv;
                    ImageView imageView = (ImageView) C2548q.d(i11, view);
                    if (imageView != null) {
                        i11 = R$id.rightButton;
                        SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
                        if (singleAtom != null && (d12 = C2548q.d((i11 = R$id.separator), view)) != null && (d13 = C2548q.d((i11 = R$id.titleAnchor), view)) != null) {
                            i11 = R$id.titleTv;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                            if (appCompatTextView != null) {
                                return new WidgetFiltersColorFilterBinding((ConstraintLayout) view, d14, barrier, d11, recyclerView, imageView, singleAtom, d12, d13, appCompatTextView);
                            }
                        }
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

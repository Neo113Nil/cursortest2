package ru.ozon.app.android.storefront.filterWidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.storefront.filterWidgets.R$id;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes2.dex */
public final class WidgetFiltersTagFilterBinding implements a {

    @NonNull
    public final View clickableArea;

    @NonNull
    public final ImageView iconIv;

    @NonNull
    public final SingleAtom rightBtn;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View separator;

    @NonNull
    public final RecyclerView tagsRv;

    @NonNull
    public final AppCompatTextView titleTv;

    private WidgetFiltersTagFilterBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull SingleAtom singleAtom, @NonNull View view2, @NonNull RecyclerView recyclerView, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.clickableArea = view;
        this.iconIv = imageView;
        this.rightBtn = singleAtom;
        this.separator = view2;
        this.tagsRv = recyclerView;
        this.titleTv = appCompatTextView;
    }

    @NonNull
    public static WidgetFiltersTagFilterBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.clickableArea;
        View d12 = C2548q.d(i11, view);
        if (d12 != null) {
            i11 = R$id.iconIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.rightBtn;
                SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
                if (singleAtom != null && (d11 = C2548q.d((i11 = R$id.separator), view)) != null) {
                    i11 = R$id.tagsRv;
                    RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                    if (recyclerView != null) {
                        i11 = R$id.titleTv;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                        if (appCompatTextView != null) {
                            return new WidgetFiltersTagFilterBinding((ConstraintLayout) view, d12, imageView, singleAtom, d11, recyclerView, appCompatTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

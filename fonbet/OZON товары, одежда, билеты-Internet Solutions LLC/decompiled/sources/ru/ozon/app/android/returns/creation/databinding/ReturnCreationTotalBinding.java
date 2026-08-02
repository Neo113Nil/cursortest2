package ru.ozon.app.android.returns.creation.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.returns.creation.R$id;
import ru.ozon.app.android.returns.creation.R$layout;
import ru.ozon.app.android.returns.ui.databinding.ReturnBalanceTotalRowBinding;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes13.dex */
public final class ReturnCreationTotalBinding implements a {

    @NonNull
    public final ButtonV3View buttonBv;

    @NonNull
    public final TextAtomV2View descriptionTav;

    @NonNull
    public final ReturnBalanceTotalRowBinding expandRowsItem;

    @NonNull
    public final LinearLayout headerContainerLl;

    @NonNull
    public final LinearLayout refundDetailsGroupLl;

    @NonNull
    public final RecyclerView refundDetailsRowsRv;

    @NonNull
    public final TextAtomV2View refundDetailsTitleTav;

    @NonNull
    public final LinearLayout returnCreationTotalLl;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rowsRv;

    @NonNull
    public final ReturnBalanceTotalRowBinding totalRow;

    private ReturnCreationTotalBinding(@NonNull LinearLayout linearLayout, @NonNull ButtonV3View buttonV3View, @NonNull TextAtomV2View textAtomV2View, @NonNull ReturnBalanceTotalRowBinding returnBalanceTotalRowBinding, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull RecyclerView recyclerView, @NonNull TextAtomV2View textAtomV2View2, @NonNull LinearLayout linearLayout4, @NonNull RecyclerView recyclerView2, @NonNull ReturnBalanceTotalRowBinding returnBalanceTotalRowBinding2) {
        this.rootView = linearLayout;
        this.buttonBv = buttonV3View;
        this.descriptionTav = textAtomV2View;
        this.expandRowsItem = returnBalanceTotalRowBinding;
        this.headerContainerLl = linearLayout2;
        this.refundDetailsGroupLl = linearLayout3;
        this.refundDetailsRowsRv = recyclerView;
        this.refundDetailsTitleTav = textAtomV2View2;
        this.returnCreationTotalLl = linearLayout4;
        this.rowsRv = recyclerView2;
        this.totalRow = returnBalanceTotalRowBinding2;
    }

    @NonNull
    public static ReturnCreationTotalBinding bind(@NonNull View view) {
        View d11;
        View d12;
        int i11 = R$id.buttonBv;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
        if (buttonV3View != null) {
            i11 = R$id.descriptionTav;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null && (d11 = C2548q.d((i11 = R$id.expandRowsItem), view)) != null) {
                ReturnBalanceTotalRowBinding bind = ReturnBalanceTotalRowBinding.bind(d11);
                i11 = R$id.headerContainerLl;
                LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                if (linearLayout != null) {
                    i11 = R$id.refundDetailsGroupLl;
                    LinearLayout linearLayout2 = (LinearLayout) C2548q.d(i11, view);
                    if (linearLayout2 != null) {
                        i11 = R$id.refundDetailsRowsRv;
                        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                        if (recyclerView != null) {
                            i11 = R$id.refundDetailsTitleTav;
                            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View2 != null) {
                                LinearLayout linearLayout3 = (LinearLayout) view;
                                i11 = R$id.rowsRv;
                                RecyclerView recyclerView2 = (RecyclerView) C2548q.d(i11, view);
                                if (recyclerView2 != null && (d12 = C2548q.d((i11 = R$id.totalRow), view)) != null) {
                                    return new ReturnCreationTotalBinding(linearLayout3, buttonV3View, textAtomV2View, bind, linearLayout, linearLayout2, recyclerView, textAtomV2View2, linearLayout3, recyclerView2, ReturnBalanceTotalRowBinding.bind(d12));
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ReturnCreationTotalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ReturnCreationTotalBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.return_creation_total, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}

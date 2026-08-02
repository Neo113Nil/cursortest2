package ru.ozon.app.android.storefront.filterWidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.storefront.filterWidgets.R$id;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes2.dex */
public final class FilterHeaderUniversalRightBinding implements a {

    @NonNull
    public final AppCompatTextView headerTv;

    @NonNull
    public final SingleAtom rightAtomContainer;

    @NonNull
    private final LinearLayout rootView;

    private FilterHeaderUniversalRightBinding(@NonNull LinearLayout linearLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull SingleAtom singleAtom) {
        this.rootView = linearLayout;
        this.headerTv = appCompatTextView;
        this.rightAtomContainer = singleAtom;
    }

    @NonNull
    public static FilterHeaderUniversalRightBinding bind(@NonNull View view) {
        int i11 = R$id.headerTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
        if (appCompatTextView != null) {
            i11 = R$id.rightAtomContainer;
            SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
            if (singleAtom != null) {
                return new FilterHeaderUniversalRightBinding((LinearLayout) view, appCompatTextView, singleAtom);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}

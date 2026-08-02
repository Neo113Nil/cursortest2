package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.app.android.cs_orders.R$layout;
import ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout;

/* loaded from: classes11.dex */
public final class ItemDescribeProblemBinding implements a {

    @NonNull
    public final AppCompatEditText describeProblemEt;

    @NonNull
    public final MobilizationTextInputLayout describeProblemTil;

    @NonNull
    private final MobilizationTextInputLayout rootView;

    private ItemDescribeProblemBinding(@NonNull MobilizationTextInputLayout mobilizationTextInputLayout, @NonNull AppCompatEditText appCompatEditText, @NonNull MobilizationTextInputLayout mobilizationTextInputLayout2) {
        this.rootView = mobilizationTextInputLayout;
        this.describeProblemEt = appCompatEditText;
        this.describeProblemTil = mobilizationTextInputLayout2;
    }

    @NonNull
    public static ItemDescribeProblemBinding bind(@NonNull View view) {
        int i11 = R$id.describeProblemEt;
        AppCompatEditText appCompatEditText = (AppCompatEditText) C2548q.d(i11, view);
        if (appCompatEditText == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        MobilizationTextInputLayout mobilizationTextInputLayout = (MobilizationTextInputLayout) view;
        return new ItemDescribeProblemBinding(mobilizationTextInputLayout, appCompatEditText, mobilizationTextInputLayout);
    }

    @NonNull
    public static ItemDescribeProblemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_describe_problem, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public MobilizationTextInputLayout getConstraintLayout() {
        return this.rootView;
    }
}

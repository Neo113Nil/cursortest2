package ru.ozon.app.android.partpayment.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.partpayment.R$id;

/* loaded from: classes13.dex */
public final class ItemDynamicFormFieldCheckerBaseBinding implements a {

    @NonNull
    public final RecyclerView checkerRv;

    @NonNull
    public final TextView descriptionTv;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemDynamicFormFieldCheckerBaseBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.checkerRv = recyclerView;
        this.descriptionTv = textView;
    }

    @NonNull
    public static ItemDynamicFormFieldCheckerBaseBinding bind(@NonNull View view) {
        int i11 = R$id.checkerRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.descriptionTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new ItemDynamicFormFieldCheckerBaseBinding((ConstraintLayout) view, recyclerView, textView);
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

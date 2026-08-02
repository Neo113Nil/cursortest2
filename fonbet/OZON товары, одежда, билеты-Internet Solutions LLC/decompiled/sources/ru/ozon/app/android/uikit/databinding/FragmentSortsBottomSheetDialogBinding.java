package ru.ozon.app.android.uikit.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.uikit.R$id;

/* loaded from: classes2.dex */
public final class FragmentSortsBottomSheetDialogBinding implements a {

    @NonNull
    public final RecyclerView itemsRv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View sheetHandle;

    @NonNull
    public final TextView titleTv;

    private FragmentSortsBottomSheetDialogBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull View view, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.itemsRv = recyclerView;
        this.sheetHandle = view;
        this.titleTv = textView;
    }

    @NonNull
    public static FragmentSortsBottomSheetDialogBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.itemsRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null && (d11 = C2548q.d((i11 = R$id.sheetHandle), view)) != null) {
            i11 = R$id.titleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new FragmentSortsBottomSheetDialogBinding((ConstraintLayout) view, recyclerView, d11, textView);
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

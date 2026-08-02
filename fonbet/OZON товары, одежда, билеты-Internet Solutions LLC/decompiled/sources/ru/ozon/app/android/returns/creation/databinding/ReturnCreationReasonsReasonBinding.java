package ru.ozon.app.android.returns.creation.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.returns.creation.R$id;
import ru.ozon.uni.android.cell.CellView;

/* loaded from: classes13.dex */
public final class ReturnCreationReasonsReasonBinding implements a {

    @NonNull
    public final ReturnCreationReasonsNestedBinding nestedReasonsContainer;

    @NonNull
    public final CellView reasonCell;

    @NonNull
    private final LinearLayout rootView;

    private ReturnCreationReasonsReasonBinding(@NonNull LinearLayout linearLayout, @NonNull ReturnCreationReasonsNestedBinding returnCreationReasonsNestedBinding, @NonNull CellView cellView) {
        this.rootView = linearLayout;
        this.nestedReasonsContainer = returnCreationReasonsNestedBinding;
        this.reasonCell = cellView;
    }

    @NonNull
    public static ReturnCreationReasonsReasonBinding bind(@NonNull View view) {
        int i11 = R$id.nestedReasonsContainer;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            ReturnCreationReasonsNestedBinding bind = ReturnCreationReasonsNestedBinding.bind(d11);
            int i12 = R$id.reasonCell;
            CellView cellView = (CellView) C2548q.d(i12, view);
            if (cellView != null) {
                return new ReturnCreationReasonsReasonBinding((LinearLayout) view, bind, cellView);
            }
            i11 = i12;
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

package ru.ozon.app.android.returns.creation.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.returns.creation.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class ReturnCreationReasonsNestedBinding implements a {

    @NonNull
    public final LinearLayout nestedReasonsContainer;

    @NonNull
    public final RecyclerView nestedReasonsRv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAtomV2View validationTav;

    private ReturnCreationReasonsNestedBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = linearLayout;
        this.nestedReasonsContainer = linearLayout2;
        this.nestedReasonsRv = recyclerView;
        this.validationTav = textAtomV2View;
    }

    @NonNull
    public static ReturnCreationReasonsNestedBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.nestedReasonsRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.validationTav;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                return new ReturnCreationReasonsNestedBinding(linearLayout, linearLayout, recyclerView, textAtomV2View);
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

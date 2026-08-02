package ru.ozon.app.android.travel.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.b2b.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class WidgetAccountBalanceInfoBinding implements a {

    @NonNull
    public final LargeButtonView accountBalanceInfoButton;

    @NonNull
    public final RecyclerView accountBalanceInfoRecyclerView;

    @NonNull
    public final TextAtomView accountBalanceInfoTitleTextView;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetAccountBalanceInfoBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LargeButtonView largeButtonView, @NonNull RecyclerView recyclerView, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.accountBalanceInfoButton = largeButtonView;
        this.accountBalanceInfoRecyclerView = recyclerView;
        this.accountBalanceInfoTitleTextView = textAtomView;
    }

    @NonNull
    public static WidgetAccountBalanceInfoBinding bind(@NonNull View view) {
        int i11 = R$id.accountBalanceInfoButton;
        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
        if (largeButtonView != null) {
            i11 = R$id.accountBalanceInfoRecyclerView;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.accountBalanceInfoTitleTextView;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    return new WidgetAccountBalanceInfoBinding((ConstraintLayout) view, largeButtonView, recyclerView, textAtomView);
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

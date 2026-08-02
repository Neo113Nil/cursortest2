package ru.ozon.app.android.bank.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.bank.R$id;
import ru.ozon.app.android.uikit.view.atoms.disclosure.DisclosureView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class WidgetInstallmentAboutBinding implements a {

    @NonNull
    public final RecyclerView itemsRv;

    @NonNull
    public final DisclosureView moreDv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView subTitleTv;

    @NonNull
    public final TextAtomView titleTv;

    private WidgetInstallmentAboutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull DisclosureView disclosureView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.itemsRv = recyclerView;
        this.moreDv = disclosureView;
        this.subTitleTv = textAtomView;
        this.titleTv = textAtomView2;
    }

    @NonNull
    public static WidgetInstallmentAboutBinding bind(@NonNull View view) {
        int i11 = R$id.itemsRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.moreDv;
            DisclosureView disclosureView = (DisclosureView) C2548q.d(i11, view);
            if (disclosureView != null) {
                i11 = R$id.subTitleTv;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    i11 = R$id.titleTv;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView2 != null) {
                        return new WidgetInstallmentAboutBinding((ConstraintLayout) view, recyclerView, disclosureView, textAtomView, textAtomView2);
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

package ru.ozon.app.android.checkout.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.atoms.v3.containers.VerticalRecyclerContainer;

/* loaded from: classes11.dex */
public final class WidgetPopularBankListBinding implements a {

    @NonNull
    public final VerticalRecyclerContainer banksVerticalRecyclerContainer;

    @NonNull
    private final VerticalRecyclerContainer rootView;

    private WidgetPopularBankListBinding(@NonNull VerticalRecyclerContainer verticalRecyclerContainer, @NonNull VerticalRecyclerContainer verticalRecyclerContainer2) {
        this.rootView = verticalRecyclerContainer;
        this.banksVerticalRecyclerContainer = verticalRecyclerContainer2;
    }

    @NonNull
    public static WidgetPopularBankListBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        VerticalRecyclerContainer verticalRecyclerContainer = (VerticalRecyclerContainer) view;
        return new WidgetPopularBankListBinding(verticalRecyclerContainer, verticalRecyclerContainer);
    }

    @Override // X4.a
    @NonNull
    public VerticalRecyclerContainer getRoot() {
        return this.rootView;
    }
}

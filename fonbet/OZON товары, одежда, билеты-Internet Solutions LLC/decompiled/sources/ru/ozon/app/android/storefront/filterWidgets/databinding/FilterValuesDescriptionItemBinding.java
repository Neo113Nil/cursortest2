package ru.ozon.app.android.storefront.filterWidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class FilterValuesDescriptionItemBinding implements a {

    @NonNull
    public final TextAtomView filterValuesDescription;

    @NonNull
    private final TextAtomView rootView;

    private FilterValuesDescriptionItemBinding(@NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = textAtomView;
        this.filterValuesDescription = textAtomView2;
    }

    @NonNull
    public static FilterValuesDescriptionItemBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextAtomView textAtomView = (TextAtomView) view;
        return new FilterValuesDescriptionItemBinding(textAtomView, textAtomView);
    }

    @Override // X4.a
    @NonNull
    public TextAtomView getRoot() {
        return this.rootView;
    }
}

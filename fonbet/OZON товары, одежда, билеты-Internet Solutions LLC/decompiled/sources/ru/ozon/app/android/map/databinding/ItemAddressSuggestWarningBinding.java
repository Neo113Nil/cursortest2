package ru.ozon.app.android.map.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.map.R$layout;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes12.dex */
public final class ItemAddressSuggestWarningBinding implements a {

    @NonNull
    private final VerticalAtomsLayout rootView;

    @NonNull
    public final VerticalAtomsLayout titleVAL;

    private ItemAddressSuggestWarningBinding(@NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout2) {
        this.rootView = verticalAtomsLayout;
        this.titleVAL = verticalAtomsLayout2;
    }

    @NonNull
    public static ItemAddressSuggestWarningBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) view;
        return new ItemAddressSuggestWarningBinding(verticalAtomsLayout, verticalAtomsLayout);
    }

    @NonNull
    public static ItemAddressSuggestWarningBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_address_suggest_warning, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public VerticalAtomsLayout getRoot() {
        return this.rootView;
    }
}

package ru.ozon.app.android.messenger.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class MDisclaimerModalDescriptionItemBinding implements a {

    @NonNull
    public final TextAtomV2View disclaimerModalItemDescription;

    @NonNull
    private final TextAtomV2View rootView;

    private MDisclaimerModalDescriptionItemBinding(@NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = textAtomV2View;
        this.disclaimerModalItemDescription = textAtomV2View2;
    }

    @NonNull
    public static MDisclaimerModalDescriptionItemBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextAtomV2View textAtomV2View = (TextAtomV2View) view;
        return new MDisclaimerModalDescriptionItemBinding(textAtomV2View, textAtomV2View);
    }

    @NonNull
    public static MDisclaimerModalDescriptionItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_disclaimer_modal_description_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public TextAtomV2View getRoot() {
        return this.rootView;
    }
}

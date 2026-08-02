package ru.ozon.app.android.storefrontcommonwidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;

/* loaded from: classes2.dex */
public final class ProductItemSmallIconAtomBinding implements a {

    @NonNull
    private final SmallIconButtonView rootView;

    @NonNull
    public final SmallIconButtonView trSmallIconButton;

    private ProductItemSmallIconAtomBinding(@NonNull SmallIconButtonView smallIconButtonView, @NonNull SmallIconButtonView smallIconButtonView2) {
        this.rootView = smallIconButtonView;
        this.trSmallIconButton = smallIconButtonView2;
    }

    @NonNull
    public static ProductItemSmallIconAtomBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) view;
        return new ProductItemSmallIconAtomBinding(smallIconButtonView, smallIconButtonView);
    }

    @Override // X4.a
    @NonNull
    public SmallIconButtonView getRoot() {
        return this.rootView;
    }
}

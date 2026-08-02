package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;

/* loaded from: classes12.dex */
public final class ProductFavoriteExpressButtonBinding implements a {

    @NonNull
    public final SmallIconButtonView favIcon;

    @NonNull
    private final View rootView;

    @NonNull
    public final SmallIconButtonView unFavIcon;

    private ProductFavoriteExpressButtonBinding(@NonNull View view, @NonNull SmallIconButtonView smallIconButtonView, @NonNull SmallIconButtonView smallIconButtonView2) {
        this.rootView = view;
        this.favIcon = smallIconButtonView;
        this.unFavIcon = smallIconButtonView2;
    }

    @NonNull
    public static ProductFavoriteExpressButtonBinding bind(@NonNull View view) {
        int i11 = R$id.favIcon;
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
        if (smallIconButtonView != null) {
            i11 = R$id.unFavIcon;
            SmallIconButtonView smallIconButtonView2 = (SmallIconButtonView) C2548q.d(i11, view);
            if (smallIconButtonView2 != null) {
                return new ProductFavoriteExpressButtonBinding(view, smallIconButtonView, smallIconButtonView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ProductFavoriteExpressButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.product_favorite_express_button, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

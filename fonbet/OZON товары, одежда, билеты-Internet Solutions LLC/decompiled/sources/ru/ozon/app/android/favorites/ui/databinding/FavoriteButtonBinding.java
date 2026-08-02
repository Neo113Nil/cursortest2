package ru.ozon.app.android.favorites.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.favorites.ui.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;

/* loaded from: classes12.dex */
public final class FavoriteButtonBinding implements a {

    @NonNull
    public final SmallIconButtonView favIcon;

    @NonNull
    private final View rootView;

    private FavoriteButtonBinding(@NonNull View view, @NonNull SmallIconButtonView smallIconButtonView) {
        this.rootView = view;
        this.favIcon = smallIconButtonView;
    }

    @NonNull
    public static FavoriteButtonBinding bind(@NonNull View view) {
        int i11 = R$id.favIcon;
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
        if (smallIconButtonView != null) {
            return new FavoriteButtonBinding(view, smallIconButtonView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

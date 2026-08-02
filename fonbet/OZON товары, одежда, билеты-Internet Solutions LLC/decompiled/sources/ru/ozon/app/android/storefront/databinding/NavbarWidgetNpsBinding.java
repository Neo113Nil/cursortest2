package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class NavbarWidgetNpsBinding implements a {

    @NonNull
    public final SmallIconButtonView navbarBack;

    @NonNull
    public final SmallIconButtonView navbarClose;

    @NonNull
    public final TextAtomView navbarTitle;

    @NonNull
    private final ConstraintLayout rootView;

    private NavbarWidgetNpsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallIconButtonView smallIconButtonView, @NonNull SmallIconButtonView smallIconButtonView2, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.navbarBack = smallIconButtonView;
        this.navbarClose = smallIconButtonView2;
        this.navbarTitle = textAtomView;
    }

    @NonNull
    public static NavbarWidgetNpsBinding bind(@NonNull View view) {
        int i11 = R$id.navbarBack;
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
        if (smallIconButtonView != null) {
            i11 = R$id.navbarClose;
            SmallIconButtonView smallIconButtonView2 = (SmallIconButtonView) C2548q.d(i11, view);
            if (smallIconButtonView2 != null) {
                i11 = R$id.navbarTitle;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    return new NavbarWidgetNpsBinding((ConstraintLayout) view, smallIconButtonView, smallIconButtonView2, textAtomView);
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

package ru.ozon.app.android.storefront.core.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.storefront.core.atoms.R$id;
import ru.ozon.app.android.storefront.core.atoms.R$layout;
import ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomView;

/* loaded from: classes2.dex */
public final class RightPanelItemBinding implements a {

    @NonNull
    public final ImageView itemImage;

    @NonNull
    public final SocialTextAtomView itemText;

    @NonNull
    public final LinearLayout panelItem;

    @NonNull
    private final LinearLayout rootView;

    private RightPanelItemBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull SocialTextAtomView socialTextAtomView, @NonNull LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.itemImage = imageView;
        this.itemText = socialTextAtomView;
        this.panelItem = linearLayout2;
    }

    @NonNull
    public static RightPanelItemBinding bind(@NonNull View view) {
        int i11 = R$id.itemImage;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.itemText;
            SocialTextAtomView socialTextAtomView = (SocialTextAtomView) C2548q.d(i11, view);
            if (socialTextAtomView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new RightPanelItemBinding(linearLayout, imageView, socialTextAtomView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static RightPanelItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.right_panel_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}

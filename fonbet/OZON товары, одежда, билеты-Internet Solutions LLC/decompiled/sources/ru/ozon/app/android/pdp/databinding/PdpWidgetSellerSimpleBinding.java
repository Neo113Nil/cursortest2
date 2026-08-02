package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.avatar.AvatarView;

/* loaded from: classes13.dex */
public final class PdpWidgetSellerSimpleBinding implements a {

    @NonNull
    public final TextAtomV2View dateTav;

    @NonNull
    public final ConstraintLayout rootCl;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View sellerNameTav;

    @NonNull
    public final TextAtomV2View sellerTypeTav;

    @NonNull
    public final AvatarView userAv;

    private PdpWidgetSellerSimpleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomV2View textAtomV2View2, @NonNull TextAtomV2View textAtomV2View3, @NonNull AvatarView avatarView) {
        this.rootView = constraintLayout;
        this.dateTav = textAtomV2View;
        this.rootCl = constraintLayout2;
        this.sellerNameTav = textAtomV2View2;
        this.sellerTypeTav = textAtomV2View3;
        this.userAv = avatarView;
    }

    @NonNull
    public static PdpWidgetSellerSimpleBinding bind(@NonNull View view) {
        int i11 = R$id.dateTav;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.sellerNameTav;
            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View2 != null) {
                i11 = R$id.sellerTypeTav;
                TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View3 != null) {
                    i11 = R$id.userAv;
                    AvatarView avatarView = (AvatarView) C2548q.d(i11, view);
                    if (avatarView != null) {
                        return new PdpWidgetSellerSimpleBinding(constraintLayout, textAtomV2View, constraintLayout, textAtomV2View2, textAtomV2View3, avatarView);
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

package ru.ozon.app.android.product.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.product.R$id;
import ru.ozon.uni.android.uikit.view.atoms.avatar.AvatarView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes13.dex */
public final class ItemProductRichHeaderBinding implements a {

    @NonNull
    public final ImageView backgroundRichHeaderImage;

    @NonNull
    public final AvatarView richHeaderAvatar;

    @NonNull
    public final ConstraintLayout richHeaderContainer;

    @NonNull
    public final TextAtomView richHeaderSubTitle;

    @NonNull
    public final TextAtomView richHeaderTitle;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemProductRichHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull AvatarView avatarView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.backgroundRichHeaderImage = imageView;
        this.richHeaderAvatar = avatarView;
        this.richHeaderContainer = constraintLayout2;
        this.richHeaderSubTitle = textAtomView;
        this.richHeaderTitle = textAtomView2;
    }

    @NonNull
    public static ItemProductRichHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.backgroundRichHeaderImage;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.richHeaderAvatar;
            AvatarView avatarView = (AvatarView) C2548q.d(i11, view);
            if (avatarView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.richHeaderSubTitle;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    i11 = R$id.richHeaderTitle;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView2 != null) {
                        return new ItemProductRichHeaderBinding(constraintLayout, imageView, avatarView, constraintLayout, textAtomView, textAtomView2);
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

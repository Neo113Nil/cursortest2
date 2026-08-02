package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.session.R$id;
import ru.ozon.uni.android.uikit.view.atoms.avatar.AvatarView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class WidgetUserSocialsMobileItemBinding implements a {

    @NonNull
    public final AvatarView avatarView;

    @NonNull
    public final TextAtomView descriptionTav;

    @NonNull
    public final Guideline horizontalGuideline;

    @NonNull
    public final ConstraintLayout rootCl;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView titleTav;

    @NonNull
    public final LargeBorderlessButtonView unbindButtonView;

    private WidgetUserSocialsMobileItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AvatarView avatarView, @NonNull TextAtomView textAtomView, @NonNull Guideline guideline, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomView textAtomView2, @NonNull LargeBorderlessButtonView largeBorderlessButtonView) {
        this.rootView = constraintLayout;
        this.avatarView = avatarView;
        this.descriptionTav = textAtomView;
        this.horizontalGuideline = guideline;
        this.rootCl = constraintLayout2;
        this.titleTav = textAtomView2;
        this.unbindButtonView = largeBorderlessButtonView;
    }

    @NonNull
    public static WidgetUserSocialsMobileItemBinding bind(@NonNull View view) {
        int i11 = R$id.avatarView;
        AvatarView avatarView = (AvatarView) C2548q.d(i11, view);
        if (avatarView != null) {
            i11 = R$id.descriptionTav;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.horizontalGuideline;
                Guideline guideline = (Guideline) C2548q.d(i11, view);
                if (guideline != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i11 = R$id.titleTav;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView2 != null) {
                        i11 = R$id.unbindButtonView;
                        LargeBorderlessButtonView largeBorderlessButtonView = (LargeBorderlessButtonView) C2548q.d(i11, view);
                        if (largeBorderlessButtonView != null) {
                            return new WidgetUserSocialsMobileItemBinding(constraintLayout, avatarView, textAtomView, guideline, constraintLayout, textAtomView2, largeBorderlessButtonView);
                        }
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

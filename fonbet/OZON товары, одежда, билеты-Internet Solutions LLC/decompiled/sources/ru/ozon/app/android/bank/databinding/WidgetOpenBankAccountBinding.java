package ru.ozon.app.android.bank.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.bank.R$id;
import ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class WidgetOpenBankAccountBinding implements a {

    @NonNull
    public final ConstraintLayout cardContainerCl;

    @NonNull
    public final Guideline guideline;

    @NonNull
    public final FrameLayout imageContainer;

    @NonNull
    public final ImageView rightIv;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextAtomView subTitleTv;

    @NonNull
    public final SocialTextAtomView titleTv;

    private WidgetOpenBankAccountBinding(@NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull TextAtomView textAtomView, @NonNull SocialTextAtomView socialTextAtomView) {
        this.rootView = frameLayout;
        this.cardContainerCl = constraintLayout;
        this.guideline = guideline;
        this.imageContainer = frameLayout2;
        this.rightIv = imageView;
        this.subTitleTv = textAtomView;
        this.titleTv = socialTextAtomView;
    }

    @NonNull
    public static WidgetOpenBankAccountBinding bind(@NonNull View view) {
        int i11 = R$id.cardContainerCl;
        ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
        if (constraintLayout != null) {
            i11 = R$id.guideline;
            Guideline guideline = (Guideline) C2548q.d(i11, view);
            if (guideline != null) {
                i11 = R$id.imageContainer;
                FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                if (frameLayout != null) {
                    i11 = R$id.rightIv;
                    ImageView imageView = (ImageView) C2548q.d(i11, view);
                    if (imageView != null) {
                        i11 = R$id.subTitleTv;
                        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView != null) {
                            i11 = R$id.titleTv;
                            SocialTextAtomView socialTextAtomView = (SocialTextAtomView) C2548q.d(i11, view);
                            if (socialTextAtomView != null) {
                                return new WidgetOpenBankAccountBinding((FrameLayout) view, constraintLayout, guideline, frameLayout, imageView, textAtomView, socialTextAtomView);
                            }
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
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}

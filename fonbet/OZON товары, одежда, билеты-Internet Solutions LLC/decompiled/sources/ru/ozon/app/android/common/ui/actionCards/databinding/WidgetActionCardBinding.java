package ru.ozon.app.android.common.ui.actionCards.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.common.ui.actionCards.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class WidgetActionCardBinding implements a {

    @NonNull
    public final SmallButtonView buttonSbv;

    @NonNull
    public final ConstraintLayout cardContainerCl;

    @NonNull
    public final ImageView imageIv;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextAtomView subtitleTav;

    @NonNull
    public final TextAtomView titleTav;

    private WidgetActionCardBinding(@NonNull FrameLayout frameLayout, @NonNull SmallButtonView smallButtonView, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = frameLayout;
        this.buttonSbv = smallButtonView;
        this.cardContainerCl = constraintLayout;
        this.imageIv = imageView;
        this.subtitleTav = textAtomView;
        this.titleTav = textAtomView2;
    }

    @NonNull
    public static WidgetActionCardBinding bind(@NonNull View view) {
        int i11 = R$id.buttonSbv;
        SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
        if (smallButtonView != null) {
            i11 = R$id.cardContainerCl;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
            if (constraintLayout != null) {
                i11 = R$id.imageIv;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    i11 = R$id.subtitleTav;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.titleTav;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView2 != null) {
                            return new WidgetActionCardBinding((FrameLayout) view, smallButtonView, constraintLayout, imageView, textAtomView, textAtomView2);
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

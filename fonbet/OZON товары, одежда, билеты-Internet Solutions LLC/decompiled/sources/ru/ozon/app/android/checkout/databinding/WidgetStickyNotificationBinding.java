package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class WidgetStickyNotificationBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final SmallButtonView stickyNotificationBtn;

    @NonNull
    public final AppCompatImageView stickyNotificationIV;

    @NonNull
    public final TextAtomView stickyNotificationSubtitleTAV;

    @NonNull
    public final TextAtomView stickyNotificationTitleTAV;

    private WidgetStickyNotificationBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallButtonView smallButtonView, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.stickyNotificationBtn = smallButtonView;
        this.stickyNotificationIV = appCompatImageView;
        this.stickyNotificationSubtitleTAV = textAtomView;
        this.stickyNotificationTitleTAV = textAtomView2;
    }

    @NonNull
    public static WidgetStickyNotificationBinding bind(@NonNull View view) {
        int i11 = R$id.stickyNotificationBtn;
        SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
        if (smallButtonView != null) {
            i11 = R$id.stickyNotificationIV;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.stickyNotificationSubtitleTAV;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    i11 = R$id.stickyNotificationTitleTAV;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView2 != null) {
                        return new WidgetStickyNotificationBinding((ConstraintLayout) view, smallButtonView, appCompatImageView, textAtomView, textAtomView2);
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

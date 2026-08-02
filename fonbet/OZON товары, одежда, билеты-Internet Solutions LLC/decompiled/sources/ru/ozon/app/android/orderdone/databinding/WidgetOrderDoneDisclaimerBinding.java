package ru.ozon.app.android.orderdone.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.orderdone.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

/* loaded from: classes13.dex */
public final class WidgetOrderDoneDisclaimerBinding implements a {

    @NonNull
    public final HorizontalFlexAtomsLayout buttonsHfal;

    @NonNull
    public final ConstraintLayout disclaimerV;

    @NonNull
    public final AppCompatImageView iconIv;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextAtomView subtitleTav;

    @NonNull
    public final AppCompatTextView timerTv;

    @NonNull
    public final TextAtomView titleTav;

    private WidgetOrderDoneDisclaimerBinding(@NonNull FrameLayout frameLayout, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, @NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView, @NonNull AppCompatTextView appCompatTextView, @NonNull TextAtomView textAtomView2) {
        this.rootView = frameLayout;
        this.buttonsHfal = horizontalFlexAtomsLayout;
        this.disclaimerV = constraintLayout;
        this.iconIv = appCompatImageView;
        this.subtitleTav = textAtomView;
        this.timerTv = appCompatTextView;
        this.titleTav = textAtomView2;
    }

    @NonNull
    public static WidgetOrderDoneDisclaimerBinding bind(@NonNull View view) {
        int i11 = R$id.buttonsHfal;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) C2548q.d(i11, view);
        if (horizontalFlexAtomsLayout != null) {
            i11 = R$id.disclaimerV;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
            if (constraintLayout != null) {
                i11 = R$id.iconIv;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                if (appCompatImageView != null) {
                    i11 = R$id.subtitleTav;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.timerTv;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                        if (appCompatTextView != null) {
                            i11 = R$id.titleTav;
                            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView2 != null) {
                                return new WidgetOrderDoneDisclaimerBinding((FrameLayout) view, horizontalFlexAtomsLayout, constraintLayout, appCompatImageView, textAtomView, appCompatTextView, textAtomView2);
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

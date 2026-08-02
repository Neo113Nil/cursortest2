package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import ru.ozon.android.messenger.blocks.snackbar.view.TimerView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;

/* loaded from: classes12.dex */
public final class MSnackbarViewBinding implements a {

    @NonNull
    public final SmallButtonView button;

    @NonNull
    public final AppCompatTextView descriptionTv;

    @NonNull
    public final ImageView leftIconIv;

    @NonNull
    public final ImageView rightIconIv;

    @NonNull
    private final View rootView;

    @NonNull
    public final Barrier timerBarrier;

    @NonNull
    public final TimerView timerView;

    @NonNull
    public final AppCompatTextView titleTv;

    private MSnackbarViewBinding(@NonNull View view, @NonNull SmallButtonView smallButtonView, @NonNull AppCompatTextView appCompatTextView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull Barrier barrier, @NonNull TimerView timerView, @NonNull AppCompatTextView appCompatTextView2) {
        this.rootView = view;
        this.button = smallButtonView;
        this.descriptionTv = appCompatTextView;
        this.leftIconIv = imageView;
        this.rightIconIv = imageView2;
        this.timerBarrier = barrier;
        this.timerView = timerView;
        this.titleTv = appCompatTextView2;
    }

    @NonNull
    public static MSnackbarViewBinding bind(@NonNull View view) {
        int i11 = R$id.button;
        SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
        if (smallButtonView != null) {
            i11 = R$id.descriptionTv;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                i11 = R$id.leftIconIv;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    i11 = R$id.rightIconIv;
                    ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                    if (imageView2 != null) {
                        i11 = R$id.timerBarrier;
                        Barrier barrier = (Barrier) C2548q.d(i11, view);
                        if (barrier != null) {
                            i11 = R$id.timerView;
                            TimerView timerView = (TimerView) C2548q.d(i11, view);
                            if (timerView != null) {
                                i11 = R$id.titleTv;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                                if (appCompatTextView2 != null) {
                                    return new MSnackbarViewBinding(view, smallButtonView, appCompatTextView, imageView, imageView2, barrier, timerView, appCompatTextView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MSnackbarViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.m_snackbar_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}

package ru.ozon.uni.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import ru.ozon.uni.R$id;
import ru.ozon.uni.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.GetButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.progress.OzProgressBar;

/* loaded from: classes4.dex */
public final class ViewFlashbarUniBinding implements a {

    @NonNull
    public final Barrier actionBarrier;

    @NonNull
    public final Barrier barrier;

    @NonNull
    public final FrameLayout fbActionButtonContainer;

    @NonNull
    public final GetButtonView fbGetButton;

    @NonNull
    public final ImageView fbIcon;

    @NonNull
    public final TextView fbMessage;

    @NonNull
    public final TextView fbPositiveActionTextView;

    @NonNull
    public final SmallBorderlessButtonView fbSmallBorderlessButton;

    @NonNull
    public final TextView fbTitle;

    @NonNull
    public final OzProgressBar progressBar;

    @NonNull
    private final View rootView;

    private ViewFlashbarUniBinding(@NonNull View view, @NonNull Barrier barrier, @NonNull Barrier barrier2, @NonNull FrameLayout frameLayout, @NonNull GetButtonView getButtonView, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SmallBorderlessButtonView smallBorderlessButtonView, @NonNull TextView textView3, @NonNull OzProgressBar ozProgressBar) {
        this.rootView = view;
        this.actionBarrier = barrier;
        this.barrier = barrier2;
        this.fbActionButtonContainer = frameLayout;
        this.fbGetButton = getButtonView;
        this.fbIcon = imageView;
        this.fbMessage = textView;
        this.fbPositiveActionTextView = textView2;
        this.fbSmallBorderlessButton = smallBorderlessButtonView;
        this.fbTitle = textView3;
        this.progressBar = ozProgressBar;
    }

    @NonNull
    public static ViewFlashbarUniBinding bind(@NonNull View view) {
        int i11 = R$id.actionBarrier;
        Barrier barrier = (Barrier) C2548q.d(i11, view);
        if (barrier != null) {
            i11 = R$id.barrier;
            Barrier barrier2 = (Barrier) C2548q.d(i11, view);
            if (barrier2 != null) {
                i11 = R$id.fbActionButtonContainer;
                FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                if (frameLayout != null) {
                    i11 = R$id.fbGetButton;
                    GetButtonView getButtonView = (GetButtonView) C2548q.d(i11, view);
                    if (getButtonView != null) {
                        i11 = R$id.fbIcon;
                        ImageView imageView = (ImageView) C2548q.d(i11, view);
                        if (imageView != null) {
                            i11 = R$id.fbMessage;
                            TextView textView = (TextView) C2548q.d(i11, view);
                            if (textView != null) {
                                i11 = R$id.fbPositiveActionTextView;
                                TextView textView2 = (TextView) C2548q.d(i11, view);
                                if (textView2 != null) {
                                    i11 = R$id.fbSmallBorderlessButton;
                                    SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) C2548q.d(i11, view);
                                    if (smallBorderlessButtonView != null) {
                                        i11 = R$id.fbTitle;
                                        TextView textView3 = (TextView) C2548q.d(i11, view);
                                        if (textView3 != null) {
                                            i11 = R$id.progressBar;
                                            OzProgressBar ozProgressBar = (OzProgressBar) C2548q.d(i11, view);
                                            if (ozProgressBar != null) {
                                                return new ViewFlashbarUniBinding(view, barrier, barrier2, frameLayout, getButtonView, imageView, textView, textView2, smallBorderlessButtonView, textView3, ozProgressBar);
                                            }
                                        }
                                    }
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
    public static ViewFlashbarUniBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_flashbar_uni, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}

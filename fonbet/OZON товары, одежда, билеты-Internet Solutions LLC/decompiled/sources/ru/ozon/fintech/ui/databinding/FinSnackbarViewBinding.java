package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperView;
import ru.ozon.fintech.ui.progress.circle.CircleProgressWithNumberView;
import ru.ozon.fintech.ui.progress.horizontal.HorizontalProgressView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes3.dex */
public final class FinSnackbarViewBinding implements a {

    @NonNull
    public final ButtonAtomWrapperView finButton;

    @NonNull
    public final ImageView finChevronImageView;

    @NonNull
    public final CircleProgressWithNumberView finCirceProgress;

    @NonNull
    public final HorizontalProgressView finHorizontal;

    @NonNull
    public final FrameLayout finIconFrame;

    @NonNull
    public final ImageView finImageView;

    @NonNull
    public final FrameLayout finRightItemsFrame;

    @NonNull
    public final TextAtomView finSubtitle;

    @NonNull
    public final TextAtomView finTitle;

    @NonNull
    private final View rootView;

    private FinSnackbarViewBinding(@NonNull View view, @NonNull ButtonAtomWrapperView buttonAtomWrapperView, @NonNull ImageView imageView, @NonNull CircleProgressWithNumberView circleProgressWithNumberView, @NonNull HorizontalProgressView horizontalProgressView, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView2, @NonNull FrameLayout frameLayout2, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = view;
        this.finButton = buttonAtomWrapperView;
        this.finChevronImageView = imageView;
        this.finCirceProgress = circleProgressWithNumberView;
        this.finHorizontal = horizontalProgressView;
        this.finIconFrame = frameLayout;
        this.finImageView = imageView2;
        this.finRightItemsFrame = frameLayout2;
        this.finSubtitle = textAtomView;
        this.finTitle = textAtomView2;
    }

    @NonNull
    public static FinSnackbarViewBinding bind(@NonNull View view) {
        int i11 = R.id.fin_button;
        ButtonAtomWrapperView buttonAtomWrapperView = (ButtonAtomWrapperView) C2548q.d(R.id.fin_button, view);
        if (buttonAtomWrapperView != null) {
            i11 = R.id.fin_chevron_image_view;
            ImageView imageView = (ImageView) C2548q.d(R.id.fin_chevron_image_view, view);
            if (imageView != null) {
                i11 = R.id.fin_circe_progress;
                CircleProgressWithNumberView circleProgressWithNumberView = (CircleProgressWithNumberView) C2548q.d(R.id.fin_circe_progress, view);
                if (circleProgressWithNumberView != null) {
                    i11 = R.id.fin_horizontal;
                    HorizontalProgressView horizontalProgressView = (HorizontalProgressView) C2548q.d(R.id.fin_horizontal, view);
                    if (horizontalProgressView != null) {
                        i11 = R.id.fin_icon_frame;
                        FrameLayout frameLayout = (FrameLayout) C2548q.d(R.id.fin_icon_frame, view);
                        if (frameLayout != null) {
                            i11 = R.id.fin_image_view;
                            ImageView imageView2 = (ImageView) C2548q.d(R.id.fin_image_view, view);
                            if (imageView2 != null) {
                                i11 = R.id.fin_right_items_frame;
                                FrameLayout frameLayout2 = (FrameLayout) C2548q.d(R.id.fin_right_items_frame, view);
                                if (frameLayout2 != null) {
                                    i11 = R.id.fin_subtitle;
                                    TextAtomView textAtomView = (TextAtomView) C2548q.d(R.id.fin_subtitle, view);
                                    if (textAtomView != null) {
                                        i11 = R.id.fin_title;
                                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(R.id.fin_title, view);
                                        if (textAtomView2 != null) {
                                            return new FinSnackbarViewBinding(view, buttonAtomWrapperView, imageView, circleProgressWithNumberView, horizontalProgressView, frameLayout, imageView2, frameLayout2, textAtomView, textAtomView2);
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
    public static FinSnackbarViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.fin_snackbar_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}

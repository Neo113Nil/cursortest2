package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.button.large.FinLargeButtonView;

/* loaded from: classes3.dex */
public final class ScreenStateV2ViewBinding implements a {

    @NonNull
    public final ImageView closeScreenBtn;

    @NonNull
    private final View rootView;

    @NonNull
    public final FinLargeButtonView screenStateButt;

    @NonNull
    public final AppCompatTextView screenStateDescription;

    @NonNull
    public final ImageView screenStateImage;

    @NonNull
    public final ProgressBar screenStateProgress;

    @NonNull
    public final ProgressBar screenStateProgressButton;

    @NonNull
    public final TextView screenStateTitle;

    private ScreenStateV2ViewBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull FinLargeButtonView finLargeButtonView, @NonNull AppCompatTextView appCompatTextView, @NonNull ImageView imageView2, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull TextView textView) {
        this.rootView = view;
        this.closeScreenBtn = imageView;
        this.screenStateButt = finLargeButtonView;
        this.screenStateDescription = appCompatTextView;
        this.screenStateImage = imageView2;
        this.screenStateProgress = progressBar;
        this.screenStateProgressButton = progressBar2;
        this.screenStateTitle = textView;
    }

    @NonNull
    public static ScreenStateV2ViewBinding bind(@NonNull View view) {
        int i11 = R.id.close_screen_btn;
        ImageView imageView = (ImageView) C2548q.d(R.id.close_screen_btn, view);
        if (imageView != null) {
            i11 = R.id.screen_state_butt;
            FinLargeButtonView finLargeButtonView = (FinLargeButtonView) C2548q.d(R.id.screen_state_butt, view);
            if (finLargeButtonView != null) {
                i11 = R.id.screen_state_description;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(R.id.screen_state_description, view);
                if (appCompatTextView != null) {
                    i11 = R.id.screen_state_image;
                    ImageView imageView2 = (ImageView) C2548q.d(R.id.screen_state_image, view);
                    if (imageView2 != null) {
                        i11 = R.id.screen_state_progress;
                        ProgressBar progressBar = (ProgressBar) C2548q.d(R.id.screen_state_progress, view);
                        if (progressBar != null) {
                            i11 = R.id.screen_state_progress_button;
                            ProgressBar progressBar2 = (ProgressBar) C2548q.d(R.id.screen_state_progress_button, view);
                            if (progressBar2 != null) {
                                i11 = R.id.screen_state_title;
                                TextView textView = (TextView) C2548q.d(R.id.screen_state_title, view);
                                if (textView != null) {
                                    return new ScreenStateV2ViewBinding(view, imageView, finLargeButtonView, appCompatTextView, imageView2, progressBar, progressBar2, textView);
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
    public static ScreenStateV2ViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.screen_state_v2_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}

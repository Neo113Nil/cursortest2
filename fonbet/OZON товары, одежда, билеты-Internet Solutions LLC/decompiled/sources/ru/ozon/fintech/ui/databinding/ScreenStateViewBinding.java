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
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.button.small.FinSmallButtonView;

/* loaded from: classes3.dex */
public final class ScreenStateViewBinding implements a {

    @NonNull
    public final ImageView closeScreenBtn;

    @NonNull
    private final View rootView;

    @NonNull
    public final FinSmallButtonView screenStateButt;

    @NonNull
    public final TextView screenStateDescription;

    @NonNull
    public final ImageView screenStateImage;

    @NonNull
    public final ProgressBar screenStateProgress;

    @NonNull
    public final TextView screenStateTitle;

    private ScreenStateViewBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull FinSmallButtonView finSmallButtonView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull ProgressBar progressBar, @NonNull TextView textView2) {
        this.rootView = view;
        this.closeScreenBtn = imageView;
        this.screenStateButt = finSmallButtonView;
        this.screenStateDescription = textView;
        this.screenStateImage = imageView2;
        this.screenStateProgress = progressBar;
        this.screenStateTitle = textView2;
    }

    @NonNull
    public static ScreenStateViewBinding bind(@NonNull View view) {
        int i11 = R.id.close_screen_btn;
        ImageView imageView = (ImageView) C2548q.d(R.id.close_screen_btn, view);
        if (imageView != null) {
            i11 = R.id.screen_state_butt;
            FinSmallButtonView finSmallButtonView = (FinSmallButtonView) C2548q.d(R.id.screen_state_butt, view);
            if (finSmallButtonView != null) {
                i11 = R.id.screen_state_description;
                TextView textView = (TextView) C2548q.d(R.id.screen_state_description, view);
                if (textView != null) {
                    i11 = R.id.screen_state_image;
                    ImageView imageView2 = (ImageView) C2548q.d(R.id.screen_state_image, view);
                    if (imageView2 != null) {
                        i11 = R.id.screen_state_progress;
                        ProgressBar progressBar = (ProgressBar) C2548q.d(R.id.screen_state_progress, view);
                        if (progressBar != null) {
                            i11 = R.id.screen_state_title;
                            TextView textView2 = (TextView) C2548q.d(R.id.screen_state_title, view);
                            if (textView2 != null) {
                                return new ScreenStateViewBinding(view, imageView, finSmallButtonView, textView, imageView2, progressBar, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ScreenStateViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.screen_state_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

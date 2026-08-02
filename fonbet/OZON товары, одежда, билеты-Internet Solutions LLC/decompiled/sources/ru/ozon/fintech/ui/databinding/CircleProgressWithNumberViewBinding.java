package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.progress.circle.ProgressCircleView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes3.dex */
public final class CircleProgressWithNumberViewBinding implements a {

    @NonNull
    public final ProgressCircleView circleProgress;

    @NonNull
    public final TextAtomView digit;

    @NonNull
    private final View rootView;

    private CircleProgressWithNumberViewBinding(@NonNull View view, @NonNull ProgressCircleView progressCircleView, @NonNull TextAtomView textAtomView) {
        this.rootView = view;
        this.circleProgress = progressCircleView;
        this.digit = textAtomView;
    }

    @NonNull
    public static CircleProgressWithNumberViewBinding bind(@NonNull View view) {
        int i11 = R.id.circle_progress;
        ProgressCircleView progressCircleView = (ProgressCircleView) C2548q.d(R.id.circle_progress, view);
        if (progressCircleView != null) {
            i11 = R.id.digit;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(R.id.digit, view);
            if (textAtomView != null) {
                return new CircleProgressWithNumberViewBinding(view, progressCircleView, textAtomView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static CircleProgressWithNumberViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.circle_progress_with_number_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

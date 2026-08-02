package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.search.R$id;

/* loaded from: classes13.dex */
public final class FeedbackSpacerBinding implements a {

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final View view;

    private FeedbackSpacerBinding(@NonNull FrameLayout frameLayout, @NonNull View view) {
        this.rootView = frameLayout;
        this.view = view;
    }

    @NonNull
    public static FeedbackSpacerBinding bind(@NonNull View view) {
        int i11 = R$id.view;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            return new FeedbackSpacerBinding((FrameLayout) view, d11);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

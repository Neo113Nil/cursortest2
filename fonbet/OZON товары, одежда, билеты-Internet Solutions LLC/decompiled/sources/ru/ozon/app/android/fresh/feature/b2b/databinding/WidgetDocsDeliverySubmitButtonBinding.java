package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

/* loaded from: classes12.dex */
public final class WidgetDocsDeliverySubmitButtonBinding implements a {

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final LargeButtonView submitBtn;

    private WidgetDocsDeliverySubmitButtonBinding(@NonNull FrameLayout frameLayout, @NonNull LargeButtonView largeButtonView) {
        this.rootView = frameLayout;
        this.submitBtn = largeButtonView;
    }

    @NonNull
    public static WidgetDocsDeliverySubmitButtonBinding bind(@NonNull View view) {
        int i11 = R$id.submitBtn;
        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
        if (largeButtonView != null) {
            return new WidgetDocsDeliverySubmitButtonBinding((FrameLayout) view, largeButtonView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

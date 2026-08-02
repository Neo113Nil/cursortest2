package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

/* loaded from: classes13.dex */
public final class WidgetAspectsFullApplyButtonLayoutBinding implements a {

    @NonNull
    public final FrameLayout largeButtonGroup;

    @NonNull
    public final LargeButtonView largeButtonView;

    @NonNull
    private final FrameLayout rootView;

    private WidgetAspectsFullApplyButtonLayoutBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull LargeButtonView largeButtonView) {
        this.rootView = frameLayout;
        this.largeButtonGroup = frameLayout2;
        this.largeButtonView = largeButtonView;
    }

    @NonNull
    public static WidgetAspectsFullApplyButtonLayoutBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = R$id.largeButtonView;
        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
        if (largeButtonView != null) {
            return new WidgetAspectsFullApplyButtonLayoutBinding(frameLayout, frameLayout, largeButtonView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

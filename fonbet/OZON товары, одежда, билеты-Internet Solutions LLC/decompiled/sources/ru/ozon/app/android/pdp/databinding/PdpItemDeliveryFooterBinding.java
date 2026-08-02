package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;

/* loaded from: classes13.dex */
public final class PdpItemDeliveryFooterBinding implements a {

    @NonNull
    public final SmallBorderlessButtonView moreInfoBtn;

    @NonNull
    public final FrameLayout rootVg;

    @NonNull
    private final FrameLayout rootView;

    private PdpItemDeliveryFooterBinding(@NonNull FrameLayout frameLayout, @NonNull SmallBorderlessButtonView smallBorderlessButtonView, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.moreInfoBtn = smallBorderlessButtonView;
        this.rootVg = frameLayout2;
    }

    @NonNull
    public static PdpItemDeliveryFooterBinding bind(@NonNull View view) {
        int i11 = R$id.moreInfoBtn;
        SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) C2548q.d(i11, view);
        if (smallBorderlessButtonView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new PdpItemDeliveryFooterBinding(frameLayout, smallBorderlessButtonView, frameLayout);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

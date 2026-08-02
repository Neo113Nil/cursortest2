package ru.ozon.app.android.pdp.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.atoms.af.layout.FrameAtomsLayout;

/* loaded from: classes13.dex */
public final class WidgetOtherSellersFooterBinding implements a {

    @NonNull
    public final FrameAtomsLayout itemsFAL;

    @NonNull
    private final FrameAtomsLayout rootView;

    private WidgetOtherSellersFooterBinding(@NonNull FrameAtomsLayout frameAtomsLayout, @NonNull FrameAtomsLayout frameAtomsLayout2) {
        this.rootView = frameAtomsLayout;
        this.itemsFAL = frameAtomsLayout2;
    }

    @NonNull
    public static WidgetOtherSellersFooterBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameAtomsLayout frameAtomsLayout = (FrameAtomsLayout) view;
        return new WidgetOtherSellersFooterBinding(frameAtomsLayout, frameAtomsLayout);
    }

    @Override // X4.a
    @NonNull
    public FrameAtomsLayout getRoot() {
        return this.rootView;
    }
}

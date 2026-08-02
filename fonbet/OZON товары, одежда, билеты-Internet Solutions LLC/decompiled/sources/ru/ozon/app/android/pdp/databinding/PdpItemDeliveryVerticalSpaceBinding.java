package ru.ozon.app.android.pdp.databinding;

import X4.a;
import android.view.View;
import android.widget.Space;
import androidx.annotation.NonNull;

/* loaded from: classes13.dex */
public final class PdpItemDeliveryVerticalSpaceBinding implements a {

    @NonNull
    private final Space rootView;

    @NonNull
    public final Space verticalSpace;

    private PdpItemDeliveryVerticalSpaceBinding(@NonNull Space space, @NonNull Space space2) {
        this.rootView = space;
        this.verticalSpace = space2;
    }

    @NonNull
    public static PdpItemDeliveryVerticalSpaceBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        Space space = (Space) view;
        return new PdpItemDeliveryVerticalSpaceBinding(space, space);
    }

    @Override // X4.a
    @NonNull
    public Space getRoot() {
        return this.rootView;
    }
}

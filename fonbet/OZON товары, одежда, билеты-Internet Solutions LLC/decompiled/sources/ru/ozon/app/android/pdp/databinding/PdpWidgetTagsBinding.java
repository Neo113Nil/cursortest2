package ru.ozon.app.android.pdp.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

/* loaded from: classes13.dex */
public final class PdpWidgetTagsBinding implements a {

    @NonNull
    private final HorizontalFlexAtomsLayout rootView;

    @NonNull
    public final HorizontalFlexAtomsLayout tagsFal;

    private PdpWidgetTagsBinding(@NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout2) {
        this.rootView = horizontalFlexAtomsLayout;
        this.tagsFal = horizontalFlexAtomsLayout2;
    }

    @NonNull
    public static PdpWidgetTagsBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) view;
        return new PdpWidgetTagsBinding(horizontalFlexAtomsLayout, horizontalFlexAtomsLayout);
    }

    @Override // X4.a
    @NonNull
    public HorizontalFlexAtomsLayout getRoot() {
        return this.rootView;
    }
}

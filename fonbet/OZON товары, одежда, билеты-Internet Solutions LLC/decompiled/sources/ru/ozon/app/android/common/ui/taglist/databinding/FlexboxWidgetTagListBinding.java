package ru.ozon.app.android.common.ui.taglist.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

/* loaded from: classes11.dex */
public final class FlexboxWidgetTagListBinding implements a {

    @NonNull
    public final HorizontalFlexAtomsLayout flexboxTagsAtomLayout;

    @NonNull
    private final HorizontalFlexAtomsLayout rootView;

    private FlexboxWidgetTagListBinding(@NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout2) {
        this.rootView = horizontalFlexAtomsLayout;
        this.flexboxTagsAtomLayout = horizontalFlexAtomsLayout2;
    }

    @NonNull
    public static FlexboxWidgetTagListBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) view;
        return new FlexboxWidgetTagListBinding(horizontalFlexAtomsLayout, horizontalFlexAtomsLayout);
    }

    @Override // X4.a
    @NonNull
    public HorizontalFlexAtomsLayout getRoot() {
        return this.rootView;
    }
}

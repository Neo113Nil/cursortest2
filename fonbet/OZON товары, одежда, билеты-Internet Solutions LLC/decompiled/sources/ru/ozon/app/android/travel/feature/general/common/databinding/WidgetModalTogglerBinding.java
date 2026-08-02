package ru.ozon.app.android.travel.feature.general.common.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.atoms.v3.containers.VerticalRecyclerContainer;

/* loaded from: classes3.dex */
public final class WidgetModalTogglerBinding implements a {

    @NonNull
    public final VerticalRecyclerContainer modalTogglerVal;

    @NonNull
    private final VerticalRecyclerContainer rootView;

    private WidgetModalTogglerBinding(@NonNull VerticalRecyclerContainer verticalRecyclerContainer, @NonNull VerticalRecyclerContainer verticalRecyclerContainer2) {
        this.rootView = verticalRecyclerContainer;
        this.modalTogglerVal = verticalRecyclerContainer2;
    }

    @NonNull
    public static WidgetModalTogglerBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        VerticalRecyclerContainer verticalRecyclerContainer = (VerticalRecyclerContainer) view;
        return new WidgetModalTogglerBinding(verticalRecyclerContainer, verticalRecyclerContainer);
    }

    @Override // X4.a
    @NonNull
    public VerticalRecyclerContainer getRoot() {
        return this.rootView;
    }
}

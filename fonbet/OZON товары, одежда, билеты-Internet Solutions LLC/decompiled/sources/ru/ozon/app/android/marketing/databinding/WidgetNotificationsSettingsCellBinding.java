package ru.ozon.app.android.marketing.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes12.dex */
public final class WidgetNotificationsSettingsCellBinding implements a {

    @NonNull
    public final VerticalAtomsLayout atomsVAL;

    @NonNull
    private final VerticalAtomsLayout rootView;

    private WidgetNotificationsSettingsCellBinding(@NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout2) {
        this.rootView = verticalAtomsLayout;
        this.atomsVAL = verticalAtomsLayout2;
    }

    @NonNull
    public static WidgetNotificationsSettingsCellBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) view;
        return new WidgetNotificationsSettingsCellBinding(verticalAtomsLayout, verticalAtomsLayout);
    }

    @Override // X4.a
    @NonNull
    public VerticalAtomsLayout getRoot() {
        return this.rootView;
    }
}

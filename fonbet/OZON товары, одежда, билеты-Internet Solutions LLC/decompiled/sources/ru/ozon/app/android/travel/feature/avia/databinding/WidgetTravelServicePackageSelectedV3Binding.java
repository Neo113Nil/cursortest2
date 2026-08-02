package ru.ozon.app.android.travel.feature.avia.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.molecules.view.serviceBlock.v3.ServiceBlockV3View;

/* loaded from: classes8.dex */
public final class WidgetTravelServicePackageSelectedV3Binding implements a {

    @NonNull
    private final ServiceBlockV3View rootView;

    @NonNull
    public final ServiceBlockV3View travelServicePackageSelectedV3ServiceBlockView;

    private WidgetTravelServicePackageSelectedV3Binding(@NonNull ServiceBlockV3View serviceBlockV3View, @NonNull ServiceBlockV3View serviceBlockV3View2) {
        this.rootView = serviceBlockV3View;
        this.travelServicePackageSelectedV3ServiceBlockView = serviceBlockV3View2;
    }

    @NonNull
    public static WidgetTravelServicePackageSelectedV3Binding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ServiceBlockV3View serviceBlockV3View = (ServiceBlockV3View) view;
        return new WidgetTravelServicePackageSelectedV3Binding(serviceBlockV3View, serviceBlockV3View);
    }

    @Override // X4.a
    @NonNull
    public ServiceBlockV3View getRoot() {
        return this.rootView;
    }
}

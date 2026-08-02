package ru.ozon.app.android.travel.feature.general.services.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.general.services.R$id;
import ru.ozon.app.android.travel.molecules.view.serviceBlock.v4.ServiceBlockV4View;

/* loaded from: classes4.dex */
public final class WidgetServiceBlockBinding implements a {

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final FrameLayout serviceBlockFrame;

    @NonNull
    public final ServiceBlockV4View serviceBlockView;

    private WidgetServiceBlockBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ServiceBlockV4View serviceBlockV4View) {
        this.rootView = frameLayout;
        this.serviceBlockFrame = frameLayout2;
        this.serviceBlockView = serviceBlockV4View;
    }

    @NonNull
    public static WidgetServiceBlockBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = R$id.serviceBlockView;
        ServiceBlockV4View serviceBlockV4View = (ServiceBlockV4View) C2548q.d(i11, view);
        if (serviceBlockV4View != null) {
            return new WidgetServiceBlockBinding(frameLayout, frameLayout, serviceBlockV4View);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}

package ru.ozon.app.android.ads.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.view.AdvVideoBannerV2ViewNew;

/* loaded from: classes6.dex */
public final class WidgetAdvVideoBannerV2NewBinding implements a {

    @NonNull
    public final AdvVideoBannerV2ViewNew advVideoBannerContainerNew;

    @NonNull
    private final AdvVideoBannerV2ViewNew rootView;

    private WidgetAdvVideoBannerV2NewBinding(@NonNull AdvVideoBannerV2ViewNew advVideoBannerV2ViewNew, @NonNull AdvVideoBannerV2ViewNew advVideoBannerV2ViewNew2) {
        this.rootView = advVideoBannerV2ViewNew;
        this.advVideoBannerContainerNew = advVideoBannerV2ViewNew2;
    }

    @NonNull
    public static WidgetAdvVideoBannerV2NewBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AdvVideoBannerV2ViewNew advVideoBannerV2ViewNew = (AdvVideoBannerV2ViewNew) view;
        return new WidgetAdvVideoBannerV2NewBinding(advVideoBannerV2ViewNew, advVideoBannerV2ViewNew);
    }

    @Override // X4.a
    @NonNull
    public AdvVideoBannerV2ViewNew getRoot() {
        return this.rootView;
    }
}

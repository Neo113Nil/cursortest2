package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.pixel;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.ads.data.pixel.PixelApiRepository;

/* loaded from: classes2.dex */
public final class PixelAnalyticsViewModel_Factory implements e<PixelAnalyticsViewModel> {
    private final a<PixelApiRepository> pixelApiRepositoryProvider;

    public PixelAnalyticsViewModel_Factory(a<PixelApiRepository> aVar) {
        this.pixelApiRepositoryProvider = aVar;
    }

    public static PixelAnalyticsViewModel_Factory create(a<PixelApiRepository> aVar) {
        return new PixelAnalyticsViewModel_Factory(aVar);
    }

    public static PixelAnalyticsViewModel newInstance(PixelApiRepository pixelApiRepository) {
        return new PixelAnalyticsViewModel(pixelApiRepository);
    }

    @Override // Pc.a
    public PixelAnalyticsViewModel get() {
        return newInstance(this.pixelApiRepositoryProvider.get());
    }
}

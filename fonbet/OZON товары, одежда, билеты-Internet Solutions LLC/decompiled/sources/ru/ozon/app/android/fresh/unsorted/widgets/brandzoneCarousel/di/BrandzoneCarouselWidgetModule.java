package ru.ozon.app.android.fresh.unsorted.widgets.brandzoneCarousel.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.brandzoneCarousel.data.BrandzoneCarouselConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.brandzoneCarousel.presentation.BrandzoneCarouselViewMapper;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/brandzoneCarousel/di/BrandzoneCarouselWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "brandzoneCarouselConfig", "Lru/ozon/app/android/fresh/unsorted/widgets/brandzoneCarousel/data/BrandzoneCarouselConfig;", "brandzoneCarouselViewMapper", "Lru/ozon/app/android/fresh/unsorted/widgets/brandzoneCarousel/presentation/BrandzoneCarouselViewMapper;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BrandzoneCarouselWidgetModule {
    @NotNull
    public final Widget2 provideWidget(@NotNull BrandzoneCarouselConfig brandzoneCarouselConfig, @NotNull BrandzoneCarouselViewMapper brandzoneCarouselViewMapper) {
        Intrinsics.checkNotNullParameter(brandzoneCarouselConfig, "brandzoneCarouselConfig");
        Intrinsics.checkNotNullParameter(brandzoneCarouselViewMapper, "brandzoneCarouselViewMapper");
        return new Widget2("express", "brandzoneCarousel", brandzoneCarouselConfig, new ViewMapper2[]{brandzoneCarouselViewMapper});
    }
}

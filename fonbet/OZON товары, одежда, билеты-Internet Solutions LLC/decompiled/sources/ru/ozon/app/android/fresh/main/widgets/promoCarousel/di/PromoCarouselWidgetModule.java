package ru.ozon.app.android.fresh.main.widgets.promoCarousel.di;

import android.content.Context;
import com.squareup.moshi.Moshi;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.common.flags.FreshPerfPromoCarousel;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.data.PromoCarouselConfig;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.data.PromoCarouselDefaultParser;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.data.PromoCarouselParser;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.data.PromoCarouselWidgetParser;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation.PromoCarouselViewMapper;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012H\u0007¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/promoCarousel/di/PromoCarouselWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "promoCarouselConfig", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselConfig;", "promoCarouselViewMapper", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselViewMapper;", "provideParser", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselWidgetParser;", "context", "Landroid/content/Context;", "moshi", "Lcom/squareup/moshi/Moshi;", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PromoCarouselWidgetModule {
    @NotNull
    public final PromoCarouselWidgetParser provideParser(@NotNull Context context, @NotNull Moshi moshi, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        return ((NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class)).getFeatureChecker().isEnabled(FreshPerfPromoCarousel.INSTANCE) ? new PromoCarouselParser(moshi) : new PromoCarouselDefaultParser(jsonDeserializer);
    }

    @NotNull
    public final Widget2 provideWidget(@NotNull PromoCarouselConfig promoCarouselConfig, @NotNull PromoCarouselViewMapper promoCarouselViewMapper) {
        Intrinsics.checkNotNullParameter(promoCarouselConfig, "promoCarouselConfig");
        Intrinsics.checkNotNullParameter(promoCarouselViewMapper, "promoCarouselViewMapper");
        return new Widget2(promoCarouselConfig.getVertical(), "promoCarousel", promoCarouselConfig, new ViewMapper2[]{promoCarouselViewMapper});
    }
}

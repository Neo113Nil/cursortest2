package ru.ozon.app.android.fresh.main.widgets.promoCarousel.di;

import Jb.e;
import Jb.j;
import android.content.Context;
import com.squareup.moshi.Moshi;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.data.PromoCarouselWidgetParser;

/* loaded from: classes6.dex */
public final class PromoCarouselWidgetModule_ProvideParserFactory implements e<PromoCarouselWidgetParser> {
    public static PromoCarouselWidgetParser provideParser(PromoCarouselWidgetModule promoCarouselWidgetModule, Context context, Moshi moshi, JsonParser jsonParser) {
        PromoCarouselWidgetParser provideParser = promoCarouselWidgetModule.provideParser(context, moshi, jsonParser);
        j.d(provideParser);
        return provideParser;
    }
}

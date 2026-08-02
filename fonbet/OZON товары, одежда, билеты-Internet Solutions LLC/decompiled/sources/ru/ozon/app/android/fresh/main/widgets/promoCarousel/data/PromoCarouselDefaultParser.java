package ru.ozon.app.android.fresh.main.widgets.promoCarousel.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselDefaultParser;", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselWidgetParser;", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "invoke", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselDTO;", "params", "", "state", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PromoCarouselDefaultParser implements PromoCarouselWidgetParser {

    @NotNull
    private final JsonParser jsonDeserializer;

    public PromoCarouselDefaultParser(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public PromoCarouselDTO invoke(String params, String state) {
        final JsonParser jsonParser = this.jsonDeserializer;
        return new Function2<String, String, PromoCarouselDTO>() { // from class: ru.ozon.app.android.fresh.main.widgets.promoCarousel.data.PromoCarouselDefaultParser$invoke$$inlined$getDefaultWidgetParser$1
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ru.ozon.app.android.fresh.main.widgets.promoCarousel.data.PromoCarouselDTO] */
            @Override // kotlin.jvm.functions.Function2
            public PromoCarouselDTO invoke(String params2, String state2) {
                JsonParser jsonParser2 = JsonParser.this;
                if (state2 != null) {
                    return jsonParser2.fromJson(state2, PromoCarouselDTO.class);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }.invoke(params, state);
    }
}

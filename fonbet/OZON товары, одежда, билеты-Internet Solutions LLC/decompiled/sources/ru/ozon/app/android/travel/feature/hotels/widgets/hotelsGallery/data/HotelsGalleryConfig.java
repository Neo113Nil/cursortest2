package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.data;

import j20.C7244b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.widgets.base.Config;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0015\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR:\u0010\u0010\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020\u000ej\b\u0012\u0004\u0012\u00020\u0002`\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryConfig;", "Lru/ozon/app/android/composer/widgets/base/Config;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "", "", "supportedPlaceholders", "Ljava/util/Set;", "getSupportedPlaceholders", "()Ljava/util/Set;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "parser", "Lkotlin/jvm/functions/Function2;", "getParser", "()Lkotlin/jvm/functions/Function2;", "Companion", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsGalleryConfig implements Config<HotelsGalleryDTO> {

    @NotNull
    private final Function2<String, String, HotelsGalleryDTO> parser;

    @NotNull
    private final Set<String> supportedPlaceholders;
    public static final int $stable = 8;

    public HotelsGalleryConfig(@NotNull final JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.supportedPlaceholders = e0.a("islandPlaceholder");
        this.parser = new Function2<String, String, HotelsGalleryDTO>() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.data.HotelsGalleryConfig$special$$inlined$getDefaultWidgetParser$1
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.data.HotelsGalleryDTO] */
            @Override // kotlin.jvm.functions.Function2
            public HotelsGalleryDTO invoke(String params, String state) {
                JsonParser jsonParser = JsonParser.this;
                if (state != null) {
                    return jsonParser.fromJson(state, HotelsGalleryDTO.class);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        };
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        return Config.DefaultImpls.canParse(this, c7244b);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.Config
    @NotNull
    public Function2<String, String, HotelsGalleryDTO> getParser() {
        return this.parser;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return this.supportedPlaceholders;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return Config.DefaultImpls.getSupportedVersions(this);
    }

    @Override // j20.InterfaceC7243a
    public HotelsGalleryDTO parse(@NotNull C7244b c7244b) {
        return (HotelsGalleryDTO) Config.DefaultImpls.parse(this, c7244b);
    }
}

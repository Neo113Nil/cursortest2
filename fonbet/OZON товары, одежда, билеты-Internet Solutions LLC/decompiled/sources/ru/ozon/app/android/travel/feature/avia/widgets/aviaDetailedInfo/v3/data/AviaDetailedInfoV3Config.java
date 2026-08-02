package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.data;

import j20.C7244b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.widgets.base.Config;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0015\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R:\u0010\u000b\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020\bj\b\u0012\u0004\u0012\u00020\u0002`\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3Config;", "Lru/ozon/app/android/composer/widgets/base/Config;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lkotlin/Function2;", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "parser", "Lkotlin/jvm/functions/Function2;", "getParser", "()Lkotlin/jvm/functions/Function2;", "", "supportedVersions", "[J", "getSupportedVersions", "()[J", "Companion", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AviaDetailedInfoV3Config implements Config<AviaDetailedInfoV3DTO> {

    @NotNull
    private final Function2<String, String, AviaDetailedInfoV3DTO> parser;

    @NotNull
    private final long[] supportedVersions;
    public static final int $stable = 8;

    public AviaDetailedInfoV3Config(@NotNull final JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.parser = new Function2<String, String, AviaDetailedInfoV3DTO>() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.data.AviaDetailedInfoV3Config$special$$inlined$getDefaultWidgetParser$1
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.data.AviaDetailedInfoV3DTO] */
            @Override // kotlin.jvm.functions.Function2
            public AviaDetailedInfoV3DTO invoke(String params, String state) {
                JsonParser jsonParser = JsonParser.this;
                if (state != null) {
                    return jsonParser.fromJson(state, AviaDetailedInfoV3DTO.class);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        };
        this.supportedVersions = new long[]{3};
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        return Config.DefaultImpls.canParse(this, c7244b);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.Config
    @NotNull
    public Function2<String, String, AviaDetailedInfoV3DTO> getParser() {
        return this.parser;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return Config.DefaultImpls.getSupportedPlaceholders(this);
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return this.supportedVersions;
    }

    @Override // j20.InterfaceC7243a
    public AviaDetailedInfoV3DTO parse(@NotNull C7244b c7244b) {
        return (AviaDetailedInfoV3DTO) Config.DefaultImpls.parse(this, c7244b);
    }
}

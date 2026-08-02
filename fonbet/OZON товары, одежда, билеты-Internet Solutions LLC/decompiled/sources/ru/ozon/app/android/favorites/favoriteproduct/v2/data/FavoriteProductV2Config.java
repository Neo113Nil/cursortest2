package ru.ozon.app.android.favorites.favoriteproduct.v2.data;

import j20.C7244b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.widgets.base.Config;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0015\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nR2\u0010\r\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/favorites/favoriteproduct/v2/data/FavoriteProductV2Config;", "Lru/ozon/app/android/composer/widgets/base/Config;", "Lru/ozon/app/android/favorites/favoriteproduct/v2/data/FavoriteProductV2DTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "getJsonDeserializer", "()Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lkotlin/Function2;", "", "parser", "Lkotlin/jvm/functions/Function2;", "getParser", "()Lkotlin/jvm/functions/Function2;", "", "supportedVersions", "[J", "getSupportedVersions", "()[J", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoriteProductV2Config implements Config<FavoriteProductV2DTO> {

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final Function2<String, String, FavoriteProductV2DTO> parser;

    @NotNull
    private final long[] supportedVersions;

    public FavoriteProductV2Config(@NotNull final JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
        this.parser = new Function2<String, String, FavoriteProductV2DTO>() { // from class: ru.ozon.app.android.favorites.favoriteproduct.v2.data.FavoriteProductV2Config$special$$inlined$getDefaultWidgetParser$1
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ru.ozon.app.android.favorites.favoriteproduct.v2.data.FavoriteProductV2DTO] */
            @Override // kotlin.jvm.functions.Function2
            public FavoriteProductV2DTO invoke(String params, String state) {
                JsonParser jsonParser = JsonParser.this;
                if (state != null) {
                    return jsonParser.fromJson(state, FavoriteProductV2DTO.class);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        };
        this.supportedVersions = new long[]{2};
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        return Config.DefaultImpls.canParse(this, c7244b);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.Config
    @NotNull
    public Function2<String, String, FavoriteProductV2DTO> getParser() {
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
    public FavoriteProductV2DTO parse(@NotNull C7244b c7244b) {
        return (FavoriteProductV2DTO) Config.DefaultImpls.parse(this, c7244b);
    }
}

package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3;

import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.AviaSearchResultV3DTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00142\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001\u0014B\u0015\b\u0007\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/AviaSearchResultV3Config;", "Lj20/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/AviaSearchResultV3DTO;", "Lru/ozon/composer/network/widget/config/StateConfig;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lj20/b;", "Lru/ozon/composer/network/widget/config/WidgetParsedState;", "state", "parse", "(Lj20/b;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/AviaSearchResultV3DTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "", "supportedVersions", "[J", "getSupportedVersions", "()[J", "Companion", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AviaSearchResultV3Config implements InterfaceC7243a<AviaSearchResultV3DTO> {

    @NotNull
    private final JsonParser deserializer;

    @NotNull
    private final long[] supportedVersions;
    public static final int $stable = 8;

    public AviaSearchResultV3Config(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.deserializer = deserializer;
        this.supportedVersions = new long[]{3};
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        InterfaceC7243a.C1128a.a(c7244b);
        return true;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return M.f71699a;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return this.supportedVersions;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public AviaSearchResultV3DTO parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return (AviaSearchResultV3DTO) this.deserializer.fromJson(state.b(), AviaSearchResultV3DTO.class);
    }
}

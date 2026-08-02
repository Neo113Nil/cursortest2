package ru.ozon.app.android.mapcommon.map.provider.suggestions;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mapcommon.map.OzonSuggestionsController;
import ru.ozon.app.android.mapcommon.map.sdk.SdkSuggestionsController;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/mapcommon/map/provider/suggestions/OzonSuggestionsProviderImpl;", "Lru/ozon/app/android/mapcommon/map/provider/suggestions/OzonSuggestionsProvider;", "<init>", "()V", "provideSuggestionsController", "Lru/ozon/app/android/mapcommon/map/OzonSuggestionsController;", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OzonSuggestionsProviderImpl implements OzonSuggestionsProvider {
    @Override // ru.ozon.app.android.mapcommon.map.provider.suggestions.OzonSuggestionsProvider
    @NotNull
    public OzonSuggestionsController provideSuggestionsController() {
        return new SdkSuggestionsController();
    }
}

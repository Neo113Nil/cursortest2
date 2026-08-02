package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/SearchResultsConstants;", "", "<init>", "()V", "waveWidth", "", "getWaveWidth", "()F", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchResultsConstants {

    @NotNull
    public static final SearchResultsConstants INSTANCE = new SearchResultsConstants();
    private static final float waveWidth = ResourceExtKt.toPxF(18);

    private SearchResultsConstants() {
    }

    public final float getWaveWidth() {
        return waveWidth;
    }
}

package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common;

import Lm0.a;
import j20.C7244b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.TileLayout;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/SearchResultsCanParseDelegate;", "", "<init>", "()V", "Lj20/b;", "state", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/TileLayout;", "canParse", "(Lj20/b;)Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/TileLayout;", "", "parseTileSize", "(Ljava/lang/String;)Ljava/lang/String;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchResultsCanParseDelegate {
    public final TileLayout canParse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        String parseTileSize = parseTileSize(state.b());
        if (parseTileSize == null) {
            a.f17149a.e("Invalid widget tile layout", new Object[0]);
            return TileLayout.LAYOUT_INVALID;
        }
        for (TileLayout tileLayout : TileLayout.values()) {
            if (Intrinsics.d(tileLayout.name(), parseTileSize)) {
                return tileLayout;
            }
        }
        return null;
    }

    public final String parseTileSize(String state) {
        try {
            if (state == null) {
                state = "";
            }
            return new JSONObject(state).getString("tileLayout");
        } catch (JSONException e11) {
            a.f17149a.e(e11);
            return null;
        }
    }
}

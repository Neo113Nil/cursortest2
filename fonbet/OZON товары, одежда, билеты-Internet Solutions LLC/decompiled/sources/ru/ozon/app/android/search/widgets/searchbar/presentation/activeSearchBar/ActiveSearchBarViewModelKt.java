package ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0005"}, d2 = {"isFreshSuborders", "", "", "isFreshPage", "isFavoritePage", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActiveSearchBarViewModelKt {
    public static final boolean isFavoritePage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return h.t(str, "my", false) && h.t(str, "favorites", false);
    }

    public static final boolean isFreshPage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return h.t(str, "supermarket", false) || h.t(str, "25000", false) || h.t(str, "25001", false);
    }

    public static final boolean isFreshSuborders(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return h.t(str, "fresh_suborders", false);
    }
}

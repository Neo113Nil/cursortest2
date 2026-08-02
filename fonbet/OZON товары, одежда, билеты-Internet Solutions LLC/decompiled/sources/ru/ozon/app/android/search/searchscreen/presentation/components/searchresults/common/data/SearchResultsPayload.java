package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/SearchResultsPayload;", "", "<init>", "(Ljava/lang/String;I)V", "BUTTON_TYPE_CHANGED", "BUTTON_STATE_CHANGED", "BUTTON_ADDED", "BUTTON_REMOVED", "TOP_RIGHT_BUTTONS_CHANGED", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchResultsPayload {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SearchResultsPayload[] $VALUES;
    public static final SearchResultsPayload BUTTON_TYPE_CHANGED = new SearchResultsPayload("BUTTON_TYPE_CHANGED", 0);
    public static final SearchResultsPayload BUTTON_STATE_CHANGED = new SearchResultsPayload("BUTTON_STATE_CHANGED", 1);
    public static final SearchResultsPayload BUTTON_ADDED = new SearchResultsPayload("BUTTON_ADDED", 2);
    public static final SearchResultsPayload BUTTON_REMOVED = new SearchResultsPayload("BUTTON_REMOVED", 3);
    public static final SearchResultsPayload TOP_RIGHT_BUTTONS_CHANGED = new SearchResultsPayload("TOP_RIGHT_BUTTONS_CHANGED", 4);

    private static final /* synthetic */ SearchResultsPayload[] $values() {
        return new SearchResultsPayload[]{BUTTON_TYPE_CHANGED, BUTTON_STATE_CHANGED, BUTTON_ADDED, BUTTON_REMOVED, TOP_RIGHT_BUTTONS_CHANGED};
    }

    static {
        SearchResultsPayload[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private SearchResultsPayload(String str, int i11) {
    }

    public static SearchResultsPayload valueOf(String str) {
        return (SearchResultsPayload) Enum.valueOf(SearchResultsPayload.class, str);
    }

    public static SearchResultsPayload[] values() {
        return (SearchResultsPayload[]) $VALUES.clone();
    }
}

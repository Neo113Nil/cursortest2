package ru.ozon.app.android.search.widgets.utils;

import kotlin.Metadata;
import kotlin.text.h;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0004"}, d2 = {"isAiMode", "", "", "isAiInitMode", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchAiUtilsKt {
    public static final boolean isAiInitMode(String str) {
        return str != null && h.t(str, "ai_mode=init", false);
    }

    public static final boolean isAiMode(String str) {
        return str != null && h.t(str, "ai_mode", false);
    }
}

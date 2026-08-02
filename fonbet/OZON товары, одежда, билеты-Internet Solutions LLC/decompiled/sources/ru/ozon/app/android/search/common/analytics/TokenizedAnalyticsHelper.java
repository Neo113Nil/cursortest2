package ru.ozon.app.android.search.common.analytics;

import WZ.l;
import WZ.s;
import WZ.t;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.tracker.sendEvent.ActionType;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n*\u00060\u0004j\u0002`\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/search/common/analytics/TokenizedAnalyticsHelper;", "", "<init>", "()V", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "", "widgetToken", "cellToken", "currentSearchQuery", "", "processSearchClick", "(LWZ/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TokenizedAnalyticsHelper {

    @NotNull
    public static final TokenizedAnalyticsHelper INSTANCE = new TokenizedAnalyticsHelper();

    private TokenizedAnalyticsHelper() {
    }

    public final void processSearchClick(@NotNull l lVar, String str, String str2, @NotNull String currentSearchQuery) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(currentSearchQuery, "currentSearchQuery");
        Parcelable.Creator<t> creator = t.CREATOR;
        ActionType.SEARCH search = ActionType.SEARCH.INSTANCE;
        String type = search.getType();
        s.a aVar = new s.a();
        aVar.a(search.getType());
        if (str != null) {
            aVar.l(str);
        }
        if (str2 != null) {
            aVar.c(str2);
        }
        aVar.d(U.i(new Pair("searchString", currentSearchQuery)));
        Unit unit = Unit.f71690a;
        TokenizedAnalyticsExtensionsKt.processAnyEvents$default(lVar, t.a.a(type, aVar.b()), null, 2, null);
    }
}

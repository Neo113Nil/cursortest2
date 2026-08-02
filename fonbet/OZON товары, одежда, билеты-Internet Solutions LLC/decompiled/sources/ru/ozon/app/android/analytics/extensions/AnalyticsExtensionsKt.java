package ru.ozon.app.android.analytics.extensions;

import Rg.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.datalayer.AnalyticsScreenKt;
import ru.ozon.app.android.utils.UriExtKt;
import ru.ozon.tracker.sendEvent.Page;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LRg/a;", "Lru/ozon/app/android/analytics/datalayer/AnalyticsScreen;", "Lru/ozon/tracker/sendEvent/Page;", "toPage", "(LRg/a;)Lru/ozon/tracker/sendEvent/Page;", "analytics_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AnalyticsExtensionsKt {
    @NotNull
    public static final Page toPage(a aVar) {
        String str;
        if (aVar == null) {
            return new Page("", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262142, null);
        }
        String f7 = aVar.f();
        a h11 = aVar.h();
        Page page = h11 != null ? toPage(h11) : null;
        String c11 = aVar.c();
        if (c11 == null || (str = UriExtKt.removeSchema(c11)) == null) {
            str = "";
        }
        String str2 = str;
        String d11 = aVar.d();
        String j11 = aVar.j();
        String e11 = aVar.e();
        String g10 = aVar.g();
        Long categoryId = AnalyticsScreenKt.getCategoryId(aVar);
        return new Page(f7, g10, str2, j11, d11, e11, null, page, categoryId != null ? Integer.valueOf((int) categoryId.longValue()) : null, null, aVar.k(), AnalyticsScreenKt.getSku(aVar), AnalyticsScreenKt.getHighlightId(aVar), AnalyticsScreenKt.getSellerId(aVar), AnalyticsScreenKt.getBrandId(aVar), AnalyticsScreenKt.getMiniapp(aVar), AnalyticsScreenKt.getMarketplaceId(aVar), AnalyticsScreenKt.getTeensMode(aVar), 64, null);
    }
}

package ru.ozon.app.android.analytics.datalayer;

import Rg.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00060\u0000j\u0002`\u00018F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0002*\u00060\u0000j\u0002`\u00018F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u001b\u0010\t\u001a\u0004\u0018\u00010\u0002*\u00060\u0000j\u0002`\u00018F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\"\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u0002*\u00060\u0000j\u0002`\u00018F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004\"\u001b\u0010\r\u001a\u0004\u0018\u00010\u0002*\u00060\u0000j\u0002`\u00018F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004\"\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00060\u0000j\u0002`\u00018F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u000e*\u00060\u0000j\u0002`\u00018F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\"\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u0014*\u00060\u0000j\u0002`\u00018F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016*\u001a\b\u0007\u0010\u001b\"\u00020\u00002\u00020\u0000B\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a¨\u0006\u001c"}, d2 = {"LRg/a;", "Lru/ozon/app/android/analytics/datalayer/AnalyticsScreen;", "", "getSku", "(LRg/a;)Ljava/lang/Long;", "sku", "getHighlightId", "highlightId", "getSellerId", "sellerId", "getBrandId", "brandId", "getCategoryId", "categoryId", "", "getMiniapp", "(LRg/a;)Ljava/lang/String;", "miniapp", "getMarketplaceId", "marketplaceId", "", "getTeensMode", "(LRg/a;)Ljava/lang/Boolean;", "teensMode", "LSc/a;", "message", "Перейти на ru.ozon.analytics.AnalyticsScreen", "AnalyticsScreen", "analytics_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsScreenKt {
    public static final Long getBrandId(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Object obj = aVar.b().get("brandId");
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    public static final Long getCategoryId(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Object obj = aVar.b().get("categoryId");
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    public static final Long getHighlightId(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Object obj = aVar.b().get("highlightId");
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    public static final String getMarketplaceId(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Object obj = aVar.b().get("marketplaceId");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static final String getMiniapp(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Object obj = aVar.b().get("miniapp");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static final Long getSellerId(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Object obj = aVar.b().get("sellerId");
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    public static final Long getSku(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Object obj = aVar.b().get("sku");
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    public static final Boolean getTeensMode(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Object obj = aVar.b().get("teensMode");
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }
}

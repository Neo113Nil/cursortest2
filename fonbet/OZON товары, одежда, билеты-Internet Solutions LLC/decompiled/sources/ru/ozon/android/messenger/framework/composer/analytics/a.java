package ru.ozon.android.messenger.framework.composer.analytics;

import Hj.C3143a;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.sendEvent.Page;

/* loaded from: classes10.dex */
public final class a {
    @NotNull
    public static final Page a(@NotNull Rg.a aVar) {
        String str;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String f7 = aVar.f();
        Rg.a h11 = aVar.h();
        Page a11 = h11 != null ? a(h11) : null;
        String c11 = aVar.c();
        if (c11 != null) {
            String uri = Uri.parse(c11).toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            str = "/";
            String g10 = C3143a.g(".*://", uri, "/");
            if (g10.length() != 0) {
                str = g10;
            }
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String d11 = aVar.d();
        String j11 = aVar.j();
        String e11 = aVar.e();
        String g11 = aVar.g();
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Object obj = aVar.b().get("categoryId");
        Long l11 = obj instanceof Long ? (Long) obj : null;
        Integer valueOf = l11 != null ? Integer.valueOf((int) l11.longValue()) : null;
        Long k11 = aVar.k();
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Object obj2 = aVar.b().get("sku");
        Long l12 = obj2 instanceof Long ? (Long) obj2 : null;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Object obj3 = aVar.b().get("highlightId");
        Long l13 = obj3 instanceof Long ? (Long) obj3 : null;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Object obj4 = aVar.b().get("sellerId");
        Long l14 = obj4 instanceof Long ? (Long) obj4 : null;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Object obj5 = aVar.b().get("brandId");
        Long l15 = obj5 instanceof Long ? (Long) obj5 : null;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Object obj6 = aVar.b().get("miniapp");
        String str3 = obj6 instanceof String ? (String) obj6 : null;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Object obj7 = aVar.b().get("marketplaceId");
        return new Page(f7, g11, str2, j11, d11, e11, null, a11, valueOf, null, k11, l12, l13, l14, l15, str3, obj7 instanceof String ? (String) obj7 : null, null, 131136, null);
    }
}

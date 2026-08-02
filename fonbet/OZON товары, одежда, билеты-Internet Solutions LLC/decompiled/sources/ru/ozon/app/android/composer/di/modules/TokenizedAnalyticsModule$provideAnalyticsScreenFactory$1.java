package ru.ozon.app.android.composer.di.modules;

import T00.a;
import T00.c;
import T00.e;
import Tc.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LT00/a;", "", "", "", "invoke", "(LT00/a;)Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class TokenizedAnalyticsModule$provideAnalyticsScreenFactory$1 extends AbstractC7737t implements Function1<a, Map<String, ? extends Object>> {
    public static final TokenizedAnalyticsModule$provideAnalyticsScreenFactory$1 INSTANCE = new TokenizedAnalyticsModule$provideAnalyticsScreenFactory$1();

    TokenizedAnalyticsModule$provideAnalyticsScreenFactory$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Map<String, Object> invoke(a DefaultAnalyticsScreenFactory) {
        e.a b11;
        e.a b12;
        e.a b13;
        e.a b14;
        e.a b15;
        Intrinsics.checkNotNullParameter(DefaultAnalyticsScreenFactory, "$this$DefaultAnalyticsScreenFactory");
        d builder = new d();
        e h11 = DefaultAnalyticsScreenFactory.h();
        Long l11 = null;
        builder.put("sku", (h11 == null || (b15 = h11.b()) == null) ? null : b15.e());
        e h12 = DefaultAnalyticsScreenFactory.h();
        builder.put("highlightId", (h12 == null || (b14 = h12.b()) == null) ? null : b14.c());
        e h13 = DefaultAnalyticsScreenFactory.h();
        builder.put("sellerId", (h13 == null || (b13 = h13.b()) == null) ? null : b13.d());
        e h14 = DefaultAnalyticsScreenFactory.h();
        builder.put("brandId", (h14 == null || (b12 = h14.b()) == null) ? null : b12.a());
        c e11 = DefaultAnalyticsScreenFactory.e();
        builder.put("miniapp", e11 != null ? e11.b() : null);
        c e12 = DefaultAnalyticsScreenFactory.e();
        builder.put("marketplaceId", e12 != null ? e12.a() : null);
        c e13 = DefaultAnalyticsScreenFactory.e();
        builder.put("teensMode", e13 != null ? e13.c() : null);
        e h15 = DefaultAnalyticsScreenFactory.h();
        if (h15 != null && (b11 = h15.b()) != null) {
            l11 = b11.b();
        }
        builder.put("categoryId", l11);
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.u();
    }
}

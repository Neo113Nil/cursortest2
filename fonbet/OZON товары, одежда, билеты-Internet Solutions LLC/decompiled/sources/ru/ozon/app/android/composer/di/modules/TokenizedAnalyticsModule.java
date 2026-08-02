package ru.ozon.app.android.composer.di.modules;

import Hj.C3143a;
import RZ.a;
import Rg.a;
import VZ.b;
import WZ.l;
import android.net.Uri;
import ei0.InterfaceC6369b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.TrackerAnalyticsWrapper;
import ru.ozon.app.android.analytics.datalayer.AnalyticsScreenKt;
import ru.ozon.app.android.analytics.plugins.AnalyticsEventExecutor;
import ru.ozon.tracker.sendEvent.Page;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ[\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\f\b\u0001\u0010\u0012\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0010\u0010\u001a\u001a\f\u0012\b\u0012\u00060\u0018j\u0002`\u00190\u0017H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0015H\u0007¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/composer/di/modules/TokenizedAnalyticsModule;", "", "<init>", "()V", "LRg/a;", "Lru/ozon/tracker/sendEvent/Page;", "toPage", "(LRg/a;)Lru/ozon/tracker/sendEvent/Page;", "", "removeScheme", "(Ljava/lang/String;)Ljava/lang/String;", "Lei0/b;", "tracker", "Lru/ozon/app/android/analytics/plugins/AnalyticsEventExecutor;", "analyticsEventExecutor", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "applicationAnalyticsScreenStorage", "LVZ/a;", "analyticsScreenFactory", "LZZ/a;", "analyticsScreenToTrackerPageConverter", "", "LYZ/a;", "Lru/ozon/app/android/analytics/modules/tokenized/payloadprocessing/base/PayloadType;", "supportedTypes", "LWZ/l;", "provideTokenizedAnalytics", "(Lei0/b;Lru/ozon/app/android/analytics/plugins/AnalyticsEventExecutor;LSg/a;LSg/a;LVZ/a;LZZ/a;Ljava/util/Set;)LWZ/l;", "provideAnalyticsScreenFactory", "()LVZ/a;", "provideAnalyticsScreenToTrackerPageConverter", "()LZZ/a;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TokenizedAnalyticsModule {

    @NotNull
    public static final TokenizedAnalyticsModule INSTANCE = new TokenizedAnalyticsModule();

    private TokenizedAnalyticsModule() {
    }

    private final String removeScheme(String str) {
        String uri = Uri.parse(str).toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        String g10 = C3143a.g(".*://", uri, "/");
        return g10.length() == 0 ? "/" : g10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Page toPage(a aVar) {
        String f7 = aVar.f();
        a h11 = aVar.h();
        Page page = h11 != null ? toPage(h11) : null;
        String c11 = aVar.c();
        String removeScheme = c11 != null ? removeScheme(c11) : null;
        if (removeScheme == null) {
            removeScheme = "";
        }
        String str = removeScheme;
        String d11 = aVar.d();
        String j11 = aVar.j();
        String e11 = aVar.e();
        Integer num = null;
        String g10 = aVar.g();
        Long categoryId = AnalyticsScreenKt.getCategoryId(aVar);
        if (categoryId != null) {
            num = Integer.valueOf((int) categoryId.longValue());
        }
        return new Page(f7, g10, str, j11, d11, e11, null, page, num, null, aVar.k(), AnalyticsScreenKt.getSku(aVar), AnalyticsScreenKt.getHighlightId(aVar), AnalyticsScreenKt.getSellerId(aVar), AnalyticsScreenKt.getBrandId(aVar), AnalyticsScreenKt.getMiniapp(aVar), AnalyticsScreenKt.getMarketplaceId(aVar), AnalyticsScreenKt.getTeensMode(aVar), 64, null);
    }

    @NotNull
    public final VZ.a provideAnalyticsScreenFactory() {
        return new b(TokenizedAnalyticsModule$provideAnalyticsScreenFactory$1.INSTANCE);
    }

    @NotNull
    public final ZZ.a provideAnalyticsScreenToTrackerPageConverter() {
        return new ZZ.a() { // from class: ru.ozon.app.android.composer.di.modules.TokenizedAnalyticsModule$provideAnalyticsScreenToTrackerPageConverter$1
            @Override // ZZ.a
            public Page convert(a screen) {
                Page page;
                Intrinsics.checkNotNullParameter(screen, "screen");
                page = TokenizedAnalyticsModule.INSTANCE.toPage(screen);
                return page;
            }
        };
    }

    @NotNull
    public final l provideTokenizedAnalytics(@NotNull InterfaceC6369b tracker, @NotNull AnalyticsEventExecutor analyticsEventExecutor, @NotNull Sg.a analyticsScreenStorage, @NotNull Sg.a applicationAnalyticsScreenStorage, @NotNull VZ.a analyticsScreenFactory, @NotNull ZZ.a analyticsScreenToTrackerPageConverter, @NotNull Set<YZ.a> supportedTypes) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(analyticsEventExecutor, "analyticsEventExecutor");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(applicationAnalyticsScreenStorage, "applicationAnalyticsScreenStorage");
        Intrinsics.checkNotNullParameter(analyticsScreenFactory, "analyticsScreenFactory");
        Intrinsics.checkNotNullParameter(analyticsScreenToTrackerPageConverter, "analyticsScreenToTrackerPageConverter");
        Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
        a.C0494a c0494a = new a.C0494a(new TrackerAnalyticsWrapper(tracker, analyticsScreenToTrackerPageConverter));
        c0494a.b(analyticsEventExecutor.getExecutor());
        c0494a.d(new a.b(analyticsScreenStorage, applicationAnalyticsScreenStorage, analyticsScreenFactory));
        c0494a.e(supportedTypes);
        return c0494a.a().f();
    }
}

package ru.ozon.app.android.analytics.plugins.af;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerDeeplinkResult;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/analytics/plugins/af/AppsFlyerDeeplinkResult;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/analytics/plugins/af/AppsFlyerDeeplinkResult;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AppsFlyerConversionStorageImpl$observeDeferredResult$1 extends AbstractC7737t implements Function1<AppsFlyerDeeplinkResult, Boolean> {
    public static final AppsFlyerConversionStorageImpl$observeDeferredResult$1 INSTANCE = new AppsFlyerConversionStorageImpl$observeDeferredResult$1();

    AppsFlyerConversionStorageImpl$observeDeferredResult$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AppsFlyerDeeplinkResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!Intrinsics.d(it, AppsFlyerDeeplinkResult.Nan.INSTANCE) && it.getDeferred());
    }
}

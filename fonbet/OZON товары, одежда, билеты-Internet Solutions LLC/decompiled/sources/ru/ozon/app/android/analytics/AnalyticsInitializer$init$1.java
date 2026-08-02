package ru.ozon.app.android.analytics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.plugins.base.AnalyticsPlugin;
import ru.ozon.app.android.analytics.plugins.base.PluginType;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/analytics/plugins/base/AnalyticsPlugin;", "invoke", "(Lru/ozon/app/android/analytics/plugins/base/AnalyticsPlugin;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AnalyticsInitializer$init$1 extends AbstractC7737t implements Function1<AnalyticsPlugin, Boolean> {
    public static final AnalyticsInitializer$init$1 INSTANCE = new AnalyticsInitializer$init$1();

    AnalyticsInitializer$init$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AnalyticsPlugin it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.getPluginType() == PluginType.APPSFLYER);
    }
}

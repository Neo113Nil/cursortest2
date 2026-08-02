package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.di;

import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammersV3BodyViewMapper;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammersV3Config;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammersV3GradientHeaderViewMapper;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammersV3HeaderViewMapper;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3Parser;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.core.OldHammersV3BodyViewMapper;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/di/HammersV3WidgetModule;", "", "<init>", "()V", "provideHammersWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3Config;", "headerViewMapper", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3HeaderViewMapper;", "bodyViewMapper", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3BodyViewMapper;", "oldBodyViewMapper", "Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/core/OldHammersV3BodyViewMapper;", "gradientHeaderViewMapper", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3GradientHeaderViewMapper;", "provideParser", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3Parser;", "moshi", "Lcom/squareup/moshi/Moshi;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HammersV3WidgetModule {

    @NotNull
    public static final HammersV3WidgetModule INSTANCE = new HammersV3WidgetModule();

    private HammersV3WidgetModule() {
    }

    @NotNull
    public final Widget2 provideHammersWidget(@NotNull HammersV3Config config, @NotNull HammersV3HeaderViewMapper headerViewMapper, @NotNull HammersV3BodyViewMapper bodyViewMapper, @NotNull OldHammersV3BodyViewMapper oldBodyViewMapper, @NotNull HammersV3GradientHeaderViewMapper gradientHeaderViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(headerViewMapper, "headerViewMapper");
        Intrinsics.checkNotNullParameter(bodyViewMapper, "bodyViewMapper");
        Intrinsics.checkNotNullParameter(oldBodyViewMapper, "oldBodyViewMapper");
        Intrinsics.checkNotNullParameter(gradientHeaderViewMapper, "gradientHeaderViewMapper");
        return new Widget2("marketing", "hammers", config, new ViewMapper2[]{headerViewMapper, gradientHeaderViewMapper, bodyViewMapper, oldBodyViewMapper});
    }

    @NotNull
    public final HammersV3Parser provideParser(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new HammersV3Parser(moshi);
    }
}

package ru.ozon.app.android.marketing.widgets.blackFridayStatus.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.core.BlackFridayStatusConfig;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.core.BlackFridayStatusImageTitleViewMapper;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.core.BlackFridayStatusTextTitleViewMapper;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackFridayStatus/di/BlackFridayStatusModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/core/BlackFridayStatusConfig;", "textTitleLayoutViewMapper", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/core/BlackFridayStatusTextTitleViewMapper;", "imageTitleLayoutViewMapper", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/core/BlackFridayStatusImageTitleViewMapper;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BlackFridayStatusModule {

    @NotNull
    public static final BlackFridayStatusModule INSTANCE = new BlackFridayStatusModule();

    private BlackFridayStatusModule() {
    }

    @NotNull
    public final Widget2 provideWidget(@NotNull BlackFridayStatusConfig config, @NotNull BlackFridayStatusTextTitleViewMapper textTitleLayoutViewMapper, @NotNull BlackFridayStatusImageTitleViewMapper imageTitleLayoutViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(textTitleLayoutViewMapper, "textTitleLayoutViewMapper");
        Intrinsics.checkNotNullParameter(imageTitleLayoutViewMapper, "imageTitleLayoutViewMapper");
        return new Widget2("marketing", "blackFridayStatus", config, new ViewMapper2[]{textTitleLayoutViewMapper, imageTitleLayoutViewMapper});
    }
}

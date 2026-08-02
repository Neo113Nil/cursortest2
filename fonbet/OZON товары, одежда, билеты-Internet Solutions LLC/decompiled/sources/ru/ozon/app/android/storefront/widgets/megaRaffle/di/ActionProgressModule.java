package ru.ozon.app.android.storefront.widgets.megaRaffle.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.widgets.megaRaffle.core.ActionProgressConfig;
import ru.ozon.app.android.storefront.widgets.megaRaffle.core.ActionProgressViewMapper;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/megaRaffle/di/ActionProgressModule;", "", "<init>", "()V", "provideMegaRaffleWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "stickyScrollConfig", "Lru/ozon/app/android/storefront/widgets/megaRaffle/core/ActionProgressConfig;", "stickyScrollViewMapper", "Lru/ozon/app/android/storefront/widgets/megaRaffle/core/ActionProgressViewMapper;", "provideMegaRaffleWidget$storefront_prodGoogleAllVendorsRelease", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActionProgressModule {

    @NotNull
    public static final ActionProgressModule INSTANCE = new ActionProgressModule();

    private ActionProgressModule() {
    }

    @NotNull
    public final Widget2 provideMegaRaffleWidget$storefront_prodGoogleAllVendorsRelease(@NotNull ActionProgressConfig stickyScrollConfig, @NotNull ActionProgressViewMapper stickyScrollViewMapper) {
        Intrinsics.checkNotNullParameter(stickyScrollConfig, "stickyScrollConfig");
        Intrinsics.checkNotNullParameter(stickyScrollViewMapper, "stickyScrollViewMapper");
        return new Widget2("megadraw", "actionProgress", stickyScrollConfig, new ViewMapper2[]{stickyScrollViewMapper});
    }
}

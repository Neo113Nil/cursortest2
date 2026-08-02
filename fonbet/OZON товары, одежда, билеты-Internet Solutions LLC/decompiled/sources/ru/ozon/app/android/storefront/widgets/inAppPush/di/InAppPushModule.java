package ru.ozon.app.android.storefront.widgets.inAppPush.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.widgets.inAppPush.core.InAppPushConfig;
import ru.ozon.app.android.storefront.widgets.inAppPush.core.InAppPushViewMapper;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/inAppPush/di/InAppPushModule;", "", "<init>", "()V", "provideMiniappHeaderWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "inAppPushConfig", "Lru/ozon/app/android/storefront/widgets/inAppPush/core/InAppPushConfig;", "inAppPushViewMapper", "Lru/ozon/app/android/storefront/widgets/inAppPush/core/InAppPushViewMapper;", "provideMiniappHeaderWidget$storefront_prodGoogleAllVendorsRelease", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InAppPushModule {

    @NotNull
    public static final InAppPushModule INSTANCE = new InAppPushModule();

    private InAppPushModule() {
    }

    @NotNull
    public final Widget2 provideMiniappHeaderWidget$storefront_prodGoogleAllVendorsRelease(@NotNull InAppPushConfig inAppPushConfig, @NotNull InAppPushViewMapper inAppPushViewMapper) {
        Intrinsics.checkNotNullParameter(inAppPushConfig, "inAppPushConfig");
        Intrinsics.checkNotNullParameter(inAppPushViewMapper, "inAppPushViewMapper");
        return new Widget2("communication", "inAppPush", inAppPushConfig, new ViewMapper2[]{inAppPushViewMapper});
    }
}

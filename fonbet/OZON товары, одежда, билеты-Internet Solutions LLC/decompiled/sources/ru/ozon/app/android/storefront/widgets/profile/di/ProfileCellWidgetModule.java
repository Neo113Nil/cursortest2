package ru.ozon.app.android.storefront.widgets.profile.di;

import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.widgets.profile.core.ProfileCellConfig;
import ru.ozon.app.android.storefront.widgets.profile.core.ProfileCellViewMapper;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/storefront/widgets/profile/di/ProfileCellWidgetModule;", "", "<init>", "()V", "provideProfileCellWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/storefront/widgets/profile/core/ProfileCellConfig;", "viewMapper", "Lru/ozon/app/android/storefront/widgets/profile/core/ProfileCellViewMapper;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProfileCellWidgetModule {

    @NotNull
    public static final ProfileCellWidgetModule INSTANCE = new ProfileCellWidgetModule();

    private ProfileCellWidgetModule() {
    }

    @NotNull
    public final Widget2 provideProfileCellWidget(@NotNull ProfileCellConfig config, @NotNull ProfileCellViewMapper viewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        return new Widget2("myProfile", Scopes.PROFILE, config, new ViewMapper2[]{viewMapper});
    }
}

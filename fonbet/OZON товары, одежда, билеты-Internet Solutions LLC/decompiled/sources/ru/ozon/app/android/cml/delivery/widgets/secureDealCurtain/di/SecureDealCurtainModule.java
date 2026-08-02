package ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.data.SecureDealCurtainConfig;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.buttons.SecureDealButtonsViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.secureDeal.SecureDealDataViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/di/SecureDealCurtainModule;", "", "<init>", "()V", "provideSecureDealCurtainWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/data/SecureDealCurtainConfig;", "secureDealDataViewMapper", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/SecureDealDataViewMapper;", "secureDealButtonsViewMapper", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/buttons/SecureDealButtonsViewMapper;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SecureDealCurtainModule {

    @NotNull
    public static final SecureDealCurtainModule INSTANCE = new SecureDealCurtainModule();

    private SecureDealCurtainModule() {
    }

    @NotNull
    public final Widget2 provideSecureDealCurtainWidget(@NotNull SecureDealCurtainConfig config, @NotNull SecureDealDataViewMapper secureDealDataViewMapper, @NotNull SecureDealButtonsViewMapper secureDealButtonsViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(secureDealDataViewMapper, "secureDealDataViewMapper");
        Intrinsics.checkNotNullParameter(secureDealButtonsViewMapper, "secureDealButtonsViewMapper");
        return new Widget2("cml", "secureDealCurtain", config, new ViewMapper2[]{secureDealDataViewMapper, secureDealButtonsViewMapper});
    }
}

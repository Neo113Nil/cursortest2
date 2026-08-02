package ru.ozon.app.android.session.instantLoginSettings.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.session.instantLoginSettings.InstantLoginSettingsConfig;
import ru.ozon.app.android.session.instantLoginSettings.ui.InstantLoginSettingsViewMapper;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/session/instantLoginSettings/di/InstantLoginModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/di/Widget;", "widgetConfig", "Lru/ozon/app/android/session/instantLoginSettings/InstantLoginSettingsConfig;", "widgetViewMapper", "Lru/ozon/app/android/session/instantLoginSettings/ui/InstantLoginSettingsViewMapper;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InstantLoginModule {

    @NotNull
    public static final InstantLoginModule INSTANCE = new InstantLoginModule();

    private InstantLoginModule() {
    }

    @NotNull
    public final Widget provideWidget(@NotNull InstantLoginSettingsConfig widgetConfig, @NotNull InstantLoginSettingsViewMapper widgetViewMapper) {
        Intrinsics.checkNotNullParameter(widgetConfig, "widgetConfig");
        Intrinsics.checkNotNullParameter(widgetViewMapper, "widgetViewMapper");
        return new Widget("csma", "instantLoginSettings", widgetConfig, new InstantLoginSettingsViewMapper[]{widgetViewMapper});
    }
}

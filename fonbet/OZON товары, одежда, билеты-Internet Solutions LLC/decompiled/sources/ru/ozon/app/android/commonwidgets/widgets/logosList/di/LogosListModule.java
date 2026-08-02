package ru.ozon.app.android.commonwidgets.widgets.logosList.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.widgets.logosList.data.LogosListConfig;
import ru.ozon.app.android.commonwidgets.widgets.logosList.presentation.LogosListViewMapper;
import ru.ozon.app.android.composer.di.Widget;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/logosList/di/LogosListModule;", "", "<init>", "()V", "provideLogosListWidget", "Lru/ozon/app/android/composer/di/Widget;", "config", "Lru/ozon/app/android/commonwidgets/widgets/logosList/data/LogosListConfig;", "viewMapper", "Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListViewMapper;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LogosListModule {

    @NotNull
    public static final LogosListModule INSTANCE = new LogosListModule();

    private LogosListModule() {
    }

    @NotNull
    public static final Widget provideLogosListWidget(@NotNull LogosListConfig config, @NotNull LogosListViewMapper viewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        return new Widget("common", "logosList", config, new LogosListViewMapper[]{viewMapper});
    }
}

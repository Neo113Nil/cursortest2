package ru.ozon.app.android.commonwidgets.widgets.curtain.di;

import I00.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.widgets.curtain.data.CurtainConfig;
import ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.CurtainCustomViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.ui.CurtainViewMapper;
import ru.ozon.app.android.composer.di.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/di/CurtainWidgetModule;", "", "<init>", "()V", "provideCurtainWidget", "Lru/ozon/app/android/composer/di/Widget;", "config", "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainConfig;", "viewMapper", "Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/ui/CurtainViewMapper;", "customViewMapper", "Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/custom/CurtainCustomViewMapper;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CurtainWidgetModule {

    @NotNull
    public static final CurtainWidgetModule INSTANCE = new CurtainWidgetModule();

    private CurtainWidgetModule() {
    }

    @NotNull
    public static final Widget provideCurtainWidget(@NotNull CurtainConfig config, @NotNull CurtainViewMapper viewMapper, @NotNull CurtainCustomViewMapper customViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        Intrinsics.checkNotNullParameter(customViewMapper, "customViewMapper");
        return new Widget("common", "curtain", config, new d[]{viewMapper, customViewMapper});
    }
}

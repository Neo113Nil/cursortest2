package ru.ozon.app.android.commonwidgets.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.widgets.iconButton.core.IconButtonWidgetConfig;
import ru.ozon.app.android.commonwidgets.widgets.iconButton.core.IconButtonWidgetViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/commonwidgets/di/StorefrontCommonV2Module;", "", "<init>", "()V", "provideWidget", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "iconButtonWidgetConfig", "Lru/ozon/app/android/commonwidgets/widgets/iconButton/core/IconButtonWidgetConfig;", "iconButtonWidgetViewMapper", "Lru/ozon/app/android/commonwidgets/widgets/iconButton/core/IconButtonWidgetViewMapper;", "provideWidget$commonwidgets_prodGoogleAllVendorsRelease", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StorefrontCommonV2Module {

    @NotNull
    public static final StorefrontCommonV2Module INSTANCE = new StorefrontCommonV2Module();

    private StorefrontCommonV2Module() {
    }

    @NotNull
    public final Set<Widget2> provideWidget$commonwidgets_prodGoogleAllVendorsRelease(@NotNull IconButtonWidgetConfig iconButtonWidgetConfig, @NotNull IconButtonWidgetViewMapper iconButtonWidgetViewMapper) {
        Intrinsics.checkNotNullParameter(iconButtonWidgetConfig, "iconButtonWidgetConfig");
        Intrinsics.checkNotNullParameter(iconButtonWidgetViewMapper, "iconButtonWidgetViewMapper");
        return e0.h(new Widget2("common", "iconButton", iconButtonWidgetConfig, new ViewMapper2[]{iconButtonWidgetViewMapper}));
    }
}

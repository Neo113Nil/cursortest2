package ru.ozon.app.android.commonwidgets.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.widgets.curtainHeader.core.CurtainHeaderConfig;
import ru.ozon.app.android.commonwidgets.widgets.curtainHeader.core.CurtainHeaderViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.curtainSettings.core.CurtainSettingsConfig;
import ru.ozon.app.android.commonwidgets.widgets.curtainSettings.core.CurtainSettingsViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/commonwidgets/di/CurtainSettingsWidgetsModule;", "", "<init>", "()V", "provideWidget", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "curtainSettingsConfig", "Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/core/CurtainSettingsConfig;", "curtainSettingsViewMapper", "Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/core/CurtainSettingsViewMapper;", "curtainHeaderConfig", "Lru/ozon/app/android/commonwidgets/widgets/curtainHeader/core/CurtainHeaderConfig;", "curtainHeaderViewMapper", "Lru/ozon/app/android/commonwidgets/widgets/curtainHeader/core/CurtainHeaderViewMapper;", "provideWidget$widgets_prodGoogleAllVendorsRelease", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CurtainSettingsWidgetsModule {

    @NotNull
    public static final CurtainSettingsWidgetsModule INSTANCE = new CurtainSettingsWidgetsModule();

    private CurtainSettingsWidgetsModule() {
    }

    @NotNull
    public final Set<Widget2> provideWidget$widgets_prodGoogleAllVendorsRelease(@NotNull CurtainSettingsConfig curtainSettingsConfig, @NotNull CurtainSettingsViewMapper curtainSettingsViewMapper, @NotNull CurtainHeaderConfig curtainHeaderConfig, @NotNull CurtainHeaderViewMapper curtainHeaderViewMapper) {
        Intrinsics.checkNotNullParameter(curtainSettingsConfig, "curtainSettingsConfig");
        Intrinsics.checkNotNullParameter(curtainSettingsViewMapper, "curtainSettingsViewMapper");
        Intrinsics.checkNotNullParameter(curtainHeaderConfig, "curtainHeaderConfig");
        Intrinsics.checkNotNullParameter(curtainHeaderViewMapper, "curtainHeaderViewMapper");
        Widget2[] elements = {new Widget2("common", "curtainSettings", curtainSettingsConfig, new ViewMapper2[]{curtainSettingsViewMapper}), new Widget2("common", "curtainHeader", curtainHeaderConfig, new ViewMapper2[]{curtainHeaderViewMapper})};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}

package ru.ozon.app.android.common.buttonwidget.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.buttonwidget.core.ButtonConfig;
import ru.ozon.app.android.common.buttonwidget.core.ButtonV2ViewMapper;
import ru.ozon.app.android.common.buttonwidget.core.ButtonV3ViewMapper;
import ru.ozon.app.android.common.buttonwidget.core.ButtonViewMapper;
import ru.ozon.app.android.common.buttonwidget.sticky.ButtonViewStickyNoUIMapper;
import ru.ozon.app.android.common.buttonwidget.sticky.ButtonViewV3StickyNoUIMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/common/buttonwidget/di/ButtonWidgetV2Module;", "", "<init>", "()V", "provideButtonWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/common/buttonwidget/core/ButtonConfig;", "buttonViewMapper", "Lru/ozon/app/android/common/buttonwidget/core/ButtonViewMapper;", "buttonV2ViewMapper", "Lru/ozon/app/android/common/buttonwidget/core/ButtonV2ViewMapper;", "buttonV3ViewMapper", "Lru/ozon/app/android/common/buttonwidget/core/ButtonV3ViewMapper;", "stickyViewMapper", "Lru/ozon/app/android/common/buttonwidget/sticky/ButtonViewStickyNoUIMapper;", "stickyV3ViewMapper", "Lru/ozon/app/android/common/buttonwidget/sticky/ButtonViewV3StickyNoUIMapper;", "provideButtonWidget$button_widget_prodGoogleAllVendorsRelease", "button-widget_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ButtonWidgetV2Module {

    @NotNull
    public static final ButtonWidgetV2Module INSTANCE = new ButtonWidgetV2Module();

    private ButtonWidgetV2Module() {
    }

    @NotNull
    public final Widget2 provideButtonWidget$button_widget_prodGoogleAllVendorsRelease(@NotNull ButtonConfig config, @NotNull ButtonViewMapper buttonViewMapper, @NotNull ButtonV2ViewMapper buttonV2ViewMapper, @NotNull ButtonV3ViewMapper buttonV3ViewMapper, @NotNull ButtonViewStickyNoUIMapper stickyViewMapper, @NotNull ButtonViewV3StickyNoUIMapper stickyV3ViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(buttonViewMapper, "buttonViewMapper");
        Intrinsics.checkNotNullParameter(buttonV2ViewMapper, "buttonV2ViewMapper");
        Intrinsics.checkNotNullParameter(buttonV3ViewMapper, "buttonV3ViewMapper");
        Intrinsics.checkNotNullParameter(stickyViewMapper, "stickyViewMapper");
        Intrinsics.checkNotNullParameter(stickyV3ViewMapper, "stickyV3ViewMapper");
        return new Widget2("common", "buttonWidget", config, new ViewMapper2[]{buttonViewMapper, buttonV2ViewMapper, stickyViewMapper, buttonV3ViewMapper, stickyV3ViewMapper});
    }
}

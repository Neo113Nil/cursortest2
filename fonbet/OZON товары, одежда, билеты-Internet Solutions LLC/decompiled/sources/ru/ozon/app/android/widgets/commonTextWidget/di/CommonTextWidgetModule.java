package ru.ozon.app.android.widgets.commonTextWidget.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.header.core.HeaderViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.widgets.commonTextWidget.cellList.core.CellListV2ViewMapper;
import ru.ozon.app.android.widgets.commonTextWidget.data.CommonTextWidgetConfig;
import ru.ozon.app.android.widgets.commonTextWidget.separator.core.SeparatorViewMapper;
import ru.ozon.app.android.widgets.plainText.core.PlainTextViewMapper2;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/widgets/commonTextWidget/di/CommonTextWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "widgetConfig", "Lru/ozon/app/android/widgets/commonTextWidget/data/CommonTextWidgetConfig;", "headerViewMapper", "Lru/ozon/app/android/common/header/core/HeaderViewMapper2;", "plainTextViewMapper", "Lru/ozon/app/android/widgets/plainText/core/PlainTextViewMapper2;", "cellListViewMapper", "Lru/ozon/app/android/widgets/commonTextWidget/cellList/core/CellListV2ViewMapper;", "separatorViewMapper", "Lru/ozon/app/android/widgets/commonTextWidget/separator/core/SeparatorViewMapper;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CommonTextWidgetModule {
    @NotNull
    public final Widget2 provideWidget(@NotNull CommonTextWidgetConfig widgetConfig, @NotNull HeaderViewMapper2 headerViewMapper, @NotNull PlainTextViewMapper2 plainTextViewMapper, @NotNull CellListV2ViewMapper cellListViewMapper, @NotNull SeparatorViewMapper separatorViewMapper) {
        Intrinsics.checkNotNullParameter(widgetConfig, "widgetConfig");
        Intrinsics.checkNotNullParameter(headerViewMapper, "headerViewMapper");
        Intrinsics.checkNotNullParameter(plainTextViewMapper, "plainTextViewMapper");
        Intrinsics.checkNotNullParameter(cellListViewMapper, "cellListViewMapper");
        Intrinsics.checkNotNullParameter(separatorViewMapper, "separatorViewMapper");
        return new Widget2("common", "textWidget", widgetConfig, new ViewMapper2[]{headerViewMapper, plainTextViewMapper, cellListViewMapper, separatorViewMapper});
    }
}

package ru.ozon.app.android.widgets.plainText.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.plainText.core.PlainTextConfig;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.widgets.plainText.core.PlainTextViewMapper2;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/widgets/plainText/di/PlainTextWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "widgetConfig", "Lru/ozon/android/composerCommonViewKit/plainText/core/PlainTextConfig;", "widgetViewMapper", "Lru/ozon/app/android/widgets/plainText/core/PlainTextViewMapper2;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlainTextWidgetModule {

    @NotNull
    public static final PlainTextWidgetModule INSTANCE = new PlainTextWidgetModule();

    private PlainTextWidgetModule() {
    }

    @NotNull
    public final Widget2 provideWidget(@NotNull PlainTextConfig widgetConfig, @NotNull PlainTextViewMapper2 widgetViewMapper) {
        Intrinsics.checkNotNullParameter(widgetConfig, "widgetConfig");
        Intrinsics.checkNotNullParameter(widgetViewMapper, "widgetViewMapper");
        return new Widget2("common", SelectionItemFormDTO.PLAIN_TEXT_FIELD_NAME, widgetConfig, new ViewMapper2[]{widgetViewMapper});
    }
}

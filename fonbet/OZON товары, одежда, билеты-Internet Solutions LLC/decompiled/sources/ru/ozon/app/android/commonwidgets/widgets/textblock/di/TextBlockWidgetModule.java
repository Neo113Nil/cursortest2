package ru.ozon.app.android.commonwidgets.widgets.textblock.di;

import I00.d;
import android.annotation.SuppressLint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.widgets.textblock.TextBlockConfig;
import ru.ozon.app.android.commonwidgets.widgets.textblock.presentation.main.TextBlockViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.textblock.presentation.sticky.TextBlockNoUiViewMapper;
import ru.ozon.app.android.composer.di.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/textblock/di/TextBlockWidgetModule;", "", "<init>", "()V", "provideDiscountCodeWidget", "Lru/ozon/app/android/composer/di/Widget;", "config", "Lru/ozon/app/android/commonwidgets/widgets/textblock/TextBlockConfig;", "viewMapper", "Lru/ozon/app/android/commonwidgets/widgets/textblock/presentation/main/TextBlockViewMapper;", "noUiViewMapper", "Lru/ozon/app/android/commonwidgets/widgets/textblock/presentation/sticky/TextBlockNoUiViewMapper;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextBlockWidgetModule {

    @NotNull
    public static final TextBlockWidgetModule INSTANCE = new TextBlockWidgetModule();

    private TextBlockWidgetModule() {
    }

    @SuppressLint({"DeprecatedClassesUsage"})
    @NotNull
    public static final Widget provideDiscountCodeWidget(@NotNull TextBlockConfig config, @NotNull TextBlockViewMapper viewMapper, @NotNull TextBlockNoUiViewMapper noUiViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        Intrinsics.checkNotNullParameter(noUiViewMapper, "noUiViewMapper");
        return new Widget("common", "textBlock", config, new d[]{viewMapper, noUiViewMapper});
    }
}

package ru.ozon.app.android.autopicker.di;

import I00.d;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.core.ProductPickerDetailsConfig;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.core.resetbutton.ResetButtonViewMapper;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.core.sections.SectionsViewMapper;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.core.selector.SelectorViewMapper;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.core.stickyblock.StickyBlockViewMapper;
import ru.ozon.app.android.composer.di.Widget;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/autopicker/di/AutoPickerExportModule;", "", "<init>", "()V", "provideExportWidgets", "", "Lru/ozon/app/android/composer/di/Widget;", "productPickerDetailsConfig", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/core/ProductPickerDetailsConfig;", "selectorViewMapper", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/core/selector/SelectorViewMapper;", "sectionsViewMapper", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/core/sections/SectionsViewMapper;", "stickyBlockViewMapper", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/core/stickyblock/StickyBlockViewMapper;", "resetButtonViewMapper", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/core/resetbutton/ResetButtonViewMapper;", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutoPickerExportModule {
    @NotNull
    public final Set<Widget> provideExportWidgets(@NotNull ProductPickerDetailsConfig productPickerDetailsConfig, @NotNull SelectorViewMapper selectorViewMapper, @NotNull SectionsViewMapper sectionsViewMapper, @NotNull StickyBlockViewMapper stickyBlockViewMapper, @NotNull ResetButtonViewMapper resetButtonViewMapper) {
        Intrinsics.checkNotNullParameter(productPickerDetailsConfig, "productPickerDetailsConfig");
        Intrinsics.checkNotNullParameter(selectorViewMapper, "selectorViewMapper");
        Intrinsics.checkNotNullParameter(sectionsViewMapper, "sectionsViewMapper");
        Intrinsics.checkNotNullParameter(stickyBlockViewMapper, "stickyBlockViewMapper");
        Intrinsics.checkNotNullParameter(resetButtonViewMapper, "resetButtonViewMapper");
        return e0.h(new Widget("selector", "productPickerDetails", productPickerDetailsConfig, new d[]{selectorViewMapper, sectionsViewMapper, resetButtonViewMapper, stickyBlockViewMapper}));
    }
}

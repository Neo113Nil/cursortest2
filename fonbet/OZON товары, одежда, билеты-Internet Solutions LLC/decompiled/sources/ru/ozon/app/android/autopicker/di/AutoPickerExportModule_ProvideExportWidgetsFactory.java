package ru.ozon.app.android.autopicker.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.core.ProductPickerDetailsConfig;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.core.resetbutton.ResetButtonViewMapper;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.core.sections.SectionsViewMapper;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.core.selector.SelectorViewMapper;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.core.stickyblock.StickyBlockViewMapper;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class AutoPickerExportModule_ProvideExportWidgetsFactory implements e<Set<Widget>> {
    public static Set<Widget> provideExportWidgets(AutoPickerExportModule autoPickerExportModule, ProductPickerDetailsConfig productPickerDetailsConfig, SelectorViewMapper selectorViewMapper, SectionsViewMapper sectionsViewMapper, StickyBlockViewMapper stickyBlockViewMapper, ResetButtonViewMapper resetButtonViewMapper) {
        Set<Widget> provideExportWidgets = autoPickerExportModule.provideExportWidgets(productPickerDetailsConfig, selectorViewMapper, sectionsViewMapper, stickyBlockViewMapper, resetButtonViewMapper);
        j.d(provideExportWidgets);
        return provideExportWidgets;
    }
}

package ru.ozon.app.android.cabinet.sectionheader;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class SectionHeaderModule_Companion_ProvideWidgetFactory implements e<Widget> {
    public static Widget provideWidget(SectionHeaderConfig sectionHeaderConfig, SectionHeaderViewMapper sectionHeaderViewMapper) {
        Widget provideWidget = SectionHeaderModule.INSTANCE.provideWidget(sectionHeaderConfig, sectionHeaderViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}

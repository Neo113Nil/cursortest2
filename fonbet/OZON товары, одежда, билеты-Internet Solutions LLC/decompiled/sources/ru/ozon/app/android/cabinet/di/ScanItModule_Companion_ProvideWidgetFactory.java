package ru.ozon.app.android.cabinet.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.cabinet.scanItIntro.ScanItIntroConfig;
import ru.ozon.app.android.cabinet.scanItIntro.presentation.ScanItIntroViewMapper;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class ScanItModule_Companion_ProvideWidgetFactory implements e<Set<Widget>> {
    public static Set<Widget> provideWidget(ScanItIntroConfig scanItIntroConfig, ScanItIntroViewMapper scanItIntroViewMapper) {
        Set<Widget> provideWidget = ScanItModule.INSTANCE.provideWidget(scanItIntroConfig, scanItIntroViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}

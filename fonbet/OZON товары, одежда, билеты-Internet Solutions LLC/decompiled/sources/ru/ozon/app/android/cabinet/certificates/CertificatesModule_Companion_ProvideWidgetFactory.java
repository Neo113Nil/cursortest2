package ru.ozon.app.android.cabinet.certificates;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.cabinet.tabSelector.TabSelectorConfig;
import ru.ozon.app.android.cabinet.tabSelector.presentation.TabSelectorViewMapper;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class CertificatesModule_Companion_ProvideWidgetFactory implements e<Set<Widget>> {
    public static Set<Widget> provideWidget(CertificatesConfig certificatesConfig, CertificatesViewMapper certificatesViewMapper, TabSelectorConfig tabSelectorConfig, TabSelectorViewMapper tabSelectorViewMapper) {
        Set<Widget> provideWidget = CertificatesModule.INSTANCE.provideWidget(certificatesConfig, certificatesViewMapper, tabSelectorConfig, tabSelectorViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}

package ru.ozon.app.android.storefront.widgets.helpCert.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.widgets.helpCert.data.HelpCertConfig;
import ru.ozon.app.android.storefront.widgets.helpCert.ui.HelpCertViewMapper;

/* loaded from: classes7.dex */
public final class HelpCertModule_ProvideHelpCertFactory implements e<Widget2> {
    public static Widget2 provideHelpCert(HelpCertConfig helpCertConfig, HelpCertViewMapper helpCertViewMapper) {
        Widget2 provideHelpCert = HelpCertModule.INSTANCE.provideHelpCert(helpCertConfig, helpCertViewMapper);
        j.d(provideHelpCert);
        return provideHelpCert;
    }
}

package ru.ozon.app.android.faq.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.faq.accordion.presentation.FaqAccordionViewMapper;
import ru.ozon.app.android.faq.data.FaqConfig;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;

/* loaded from: classes6.dex */
public final class FaqWidgetModule_ProvideWidgetFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideWidget(FaqWidgetModule faqWidgetModule, FaqConfig faqConfig, FaqAccordionViewMapper faqAccordionViewMapper, CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper2) {
        Set<Widget2> provideWidget = faqWidgetModule.provideWidget(faqConfig, faqAccordionViewMapper, commonIslandSeparatorViewMapper2);
        j.d(provideWidget);
        return provideWidget;
    }
}

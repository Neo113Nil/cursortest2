package ru.ozon.app.android.faq.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.faq.accordion.presentation.FaqAccordionViewMapper;
import ru.ozon.app.android.faq.data.FaqConfig;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lru/ozon/app/android/faq/di/FaqWidgetModule;", "", "<init>", "()V", "provideWidget", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "faqConfig", "Lru/ozon/app/android/faq/data/FaqConfig;", "accordionViewMapper", "Lru/ozon/app/android/faq/accordion/presentation/FaqAccordionViewMapper;", "islandSeparatorViewMapper", "Lru/ozon/app/android/islandSeparator/core/CommonIslandSeparatorViewMapper2;", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FaqWidgetModule {
    @NotNull
    public final Set<Widget2> provideWidget(@NotNull FaqConfig faqConfig, @NotNull FaqAccordionViewMapper accordionViewMapper, @NotNull CommonIslandSeparatorViewMapper2 islandSeparatorViewMapper) {
        Intrinsics.checkNotNullParameter(faqConfig, "faqConfig");
        Intrinsics.checkNotNullParameter(accordionViewMapper, "accordionViewMapper");
        Intrinsics.checkNotNullParameter(islandSeparatorViewMapper, "islandSeparatorViewMapper");
        return e0.a(new Widget2("csma", "faq", faqConfig, new ViewMapper2[]{accordionViewMapper, islandSeparatorViewMapper}));
    }
}

package ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.feature.notifications.utils.ViewIntent;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation.PromoPushEnableViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2$1$1$1 extends C7735q implements Function1<ViewIntent, Unit> {
    PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2$1$1$1(Object obj) {
        super(1, obj, PromoPushEnableViewModel.class, "onIntent", "onIntent(Lru/ozon/app/android/storefront/feature/notifications/utils/ViewIntent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ViewIntent viewIntent) {
        invoke2(viewIntent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ViewIntent p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((PromoPushEnableViewModel) this.receiver).onIntent(p02);
    }
}

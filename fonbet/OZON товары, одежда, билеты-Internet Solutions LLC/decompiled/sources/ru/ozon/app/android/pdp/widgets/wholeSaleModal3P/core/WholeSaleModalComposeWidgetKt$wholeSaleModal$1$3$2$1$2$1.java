package ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.ViewIntent;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.WholeSaleModalViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class WholeSaleModalComposeWidgetKt$wholeSaleModal$1$3$2$1$2$1 extends C7735q implements Function1<ViewIntent, Unit> {
    WholeSaleModalComposeWidgetKt$wholeSaleModal$1$3$2$1$2$1(Object obj) {
        super(1, obj, WholeSaleModalViewModel.class, "onViewIntent", "onViewIntent(Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/ViewIntent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ViewIntent viewIntent) {
        invoke2(viewIntent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ViewIntent p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((WholeSaleModalViewModel) this.receiver).onViewIntent(p02);
    }
}

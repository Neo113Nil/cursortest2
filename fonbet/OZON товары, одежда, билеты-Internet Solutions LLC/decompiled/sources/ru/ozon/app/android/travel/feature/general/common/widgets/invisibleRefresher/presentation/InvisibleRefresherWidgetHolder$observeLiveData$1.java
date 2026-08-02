package ru.ozon.app.android.travel.feature.general.common.widgets.invisibleRefresher.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.common.widgets.invisibleRefresher.presentation.InvisibleRefresherViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class InvisibleRefresherWidgetHolder$observeLiveData$1 extends C7735q implements Function1<InvisibleRefresherViewModel.ActionResult, Unit> {
    InvisibleRefresherWidgetHolder$observeLiveData$1(Object obj) {
        super(1, obj, InvisibleRefresherWidgetHolder.class, "handleResult", "handleResult(Lru/ozon/app/android/travel/feature/general/common/widgets/invisibleRefresher/presentation/InvisibleRefresherViewModel$ActionResult;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InvisibleRefresherViewModel.ActionResult actionResult) {
        invoke2(actionResult);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InvisibleRefresherViewModel.ActionResult p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((InvisibleRefresherWidgetHolder) this.receiver).handleResult(p02);
    }
}

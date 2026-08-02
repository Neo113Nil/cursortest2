package ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.data.tabs.Tabs;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class SkiResortInfoWidgetViewHolder$actionHandler$1$1$3 extends C7735q implements Function1<Tabs, Unit> {
    SkiResortInfoWidgetViewHolder$actionHandler$1$1$3(Object obj) {
        super(1, obj, SkiResortInfoWidgetViewHolder.class, "updateTabs", "updateTabs(Lru/ozon/uni/atoms/data/tabs/Tabs;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Tabs tabs) {
        invoke2(tabs);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Tabs p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((SkiResortInfoWidgetViewHolder) this.receiver).updateTabs(p02);
    }
}

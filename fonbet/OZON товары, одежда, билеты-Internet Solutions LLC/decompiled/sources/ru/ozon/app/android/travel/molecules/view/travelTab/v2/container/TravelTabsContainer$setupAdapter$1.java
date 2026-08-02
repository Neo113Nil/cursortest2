package ru.ozon.app.android.travel.molecules.view.travelTab.v2.container;

import android.view.View;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.view.travelTab.v2.TravelTabVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class TravelTabsContainer$setupAdapter$1 extends C7735q implements InterfaceC6511n<Integer, TravelTabVO, View, Unit> {
    TravelTabsContainer$setupAdapter$1(Object obj) {
        super(3, obj, TravelTabsContainer.class, "onTabClicked", "onTabClicked(ILru/ozon/app/android/travel/molecules/view/travelTab/v2/TravelTabVO;Landroid/view/View;)V", 0);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, TravelTabVO travelTabVO, View view) {
        invoke(num.intValue(), travelTabVO, view);
        return Unit.f71690a;
    }

    public final void invoke(int i11, TravelTabVO p12, View p22) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        Intrinsics.checkNotNullParameter(p22, "p2");
        ((TravelTabsContainer) this.receiver).onTabClicked(i11, p12, p22);
    }
}

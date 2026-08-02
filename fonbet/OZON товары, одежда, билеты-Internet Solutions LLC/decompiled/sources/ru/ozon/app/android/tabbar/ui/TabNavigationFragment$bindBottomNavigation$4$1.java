package ru.ozon.app.android.tabbar.ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.tabbar.TabConfigViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class TabNavigationFragment$bindBottomNavigation$4$1 extends C7735q implements Function1<Integer, Unit> {
    TabNavigationFragment$bindBottomNavigation$4$1(Object obj) {
        super(1, obj, TabConfigViewModel.class, "onSelectedTabIdChanged", "onSelectedTabIdChanged(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        ((TabConfigViewModel) this.receiver).onSelectedTabIdChanged(i11);
    }
}

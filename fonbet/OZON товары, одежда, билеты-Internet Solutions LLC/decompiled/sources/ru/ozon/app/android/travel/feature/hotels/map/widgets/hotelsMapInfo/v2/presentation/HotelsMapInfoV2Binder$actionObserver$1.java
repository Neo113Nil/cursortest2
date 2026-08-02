package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation;

import Sc.InterfaceC4003e;
import androidx.lifecycle.W;
import kotlin.Metadata;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.map.viewModel.HotelMapInfoViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class HotelsMapInfoV2Binder$actionObserver$1 implements W, InterfaceC7732n {
    final /* synthetic */ HotelsMapInfoV2Binder $tmp0;

    HotelsMapInfoV2Binder$actionObserver$1(HotelsMapInfoV2Binder hotelsMapInfoV2Binder) {
        this.$tmp0 = hotelsMapInfoV2Binder;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof W) && (obj instanceof InterfaceC7732n)) {
            return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC7732n
    public final InterfaceC4003e<?> getFunctionDelegate() {
        return new C7735q(1, this.$tmp0, HotelsMapInfoV2Binder.class, "actionHandler", "actionHandler(Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.W
    public final void onChanged(HotelMapInfoViewModel.Action p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        this.$tmp0.actionHandler(p02);
    }
}

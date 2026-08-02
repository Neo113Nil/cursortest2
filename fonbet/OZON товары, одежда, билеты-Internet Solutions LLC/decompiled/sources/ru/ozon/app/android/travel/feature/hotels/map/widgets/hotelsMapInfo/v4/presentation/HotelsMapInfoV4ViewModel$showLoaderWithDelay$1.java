package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4DTO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapAction;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4ViewModel$showLoaderWithDelay$1", f = "HotelsMapInfoV4ViewModel.kt", l = {782}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsMapInfoV4ViewModel$showLoaderWithDelay$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ HotelsMapInfoV4ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4ViewModel$showLoaderWithDelay$1(HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel, d<? super HotelsMapInfoV4ViewModel$showLoaderWithDelay$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsMapInfoV4ViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsMapInfoV4ViewModel$showLoaderWithDelay$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        HotelsMapInfoV4DTO.DelaySettings delaySettings;
        boolean z11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            HotelsMapInfoV4VO hotelsMapInfoV4VO = this.this$0.vo;
            long showLoaderDelay = (hotelsMapInfoV4VO == null || (delaySettings = hotelsMapInfoV4VO.getDelaySettings()) == null) ? 2000L : delaySettings.getShowLoaderDelay();
            this.label = 1;
            if (Y.b(showLoaderDelay, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        z11 = this.this$0.isPolling;
        if (z11) {
            this.this$0.analyticsHelper.trackLoaderStatus(true);
            this.this$0.send(new MapAction.ToggleLoader(true));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsMapInfoV4ViewModel$showLoaderWithDelay$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

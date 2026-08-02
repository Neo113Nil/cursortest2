package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import Sc.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4DTO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapAction;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4ViewModel$showCardsLoaderWithDelay$1", f = "HotelsMapInfoV4ViewModel.kt", l = {803}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsMapInfoV4ViewModel$showCardsLoaderWithDelay$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ List<HotelsMapInfoV4VO.CardState> $cards;
    int label;
    final /* synthetic */ HotelsMapInfoV4ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HotelsMapInfoV4ViewModel$showCardsLoaderWithDelay$1(HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel, List<? extends HotelsMapInfoV4VO.CardState> list, d<? super HotelsMapInfoV4ViewModel$showCardsLoaderWithDelay$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsMapInfoV4ViewModel;
        this.$cards = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsMapInfoV4ViewModel$showCardsLoaderWithDelay$1(this.this$0, this.$cards, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        HotelsMapInfoV4DTO.DelaySettings delaySettings;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            HotelsMapInfoV4VO hotelsMapInfoV4VO = this.this$0.vo;
            long showCardSkeletonDelay = (hotelsMapInfoV4VO == null || (delaySettings = hotelsMapInfoV4VO.getDelaySettings()) == null) ? 500L : delaySettings.getShowCardSkeletonDelay();
            this.label = 1;
            if (Y.b(showCardSkeletonDelay, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.this$0.send(new MapAction.ToggleCard(this.$cards, null, 2, null));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsMapInfoV4ViewModel$showCardsLoaderWithDelay$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

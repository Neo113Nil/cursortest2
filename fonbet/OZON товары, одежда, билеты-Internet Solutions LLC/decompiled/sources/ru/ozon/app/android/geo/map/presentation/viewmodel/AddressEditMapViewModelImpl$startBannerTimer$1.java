package ru.ozon.app.android.geo.map.presentation.viewmodel;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVOWithPayloads;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModelImpl$startBannerTimer$1", f = "AddressEditMapViewModel.kt", l = {369}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddressEditMapViewModelImpl$startBannerTimer$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ AddressEditMapViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditMapViewModelImpl$startBannerTimer$1(AddressEditMapViewModelImpl addressEditMapViewModelImpl, d<? super AddressEditMapViewModelImpl$startBannerTimer$1> dVar) {
        super(2, dVar);
        this.this$0 = addressEditMapViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AddressEditMapViewModelImpl$startBannerTimer$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AddressEditMapVO page;
        AddressEditMapVO.MapIcon.BannerIcon bannerIcon;
        Long hideTimer;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            AddressEditMapVOWithPayloads value = this.this$0.getMapState().getValue();
            if (value != null && (page = value.getPage()) != null && (bannerIcon = page.getBannerIcon()) != null && (hideTimer = bannerIcon.getHideTimer()) != null) {
                long longValue = hideTimer.longValue();
                this.label = 1;
                if (Y.b(longValue, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.this$0.getBannerState().postValue(AddressEditMapViewModel.BannerState.HIDE_BANNER);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AddressEditMapViewModelImpl$startBannerTimer$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

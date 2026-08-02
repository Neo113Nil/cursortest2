package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapAction;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view.HotelsMapInfoV4View;
import ru.ozon.app.android.travel.molecules.extensions.ViewExtensionsKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4Wrapper$toggleCard$1$1", f = "HotelsMapInfoV4Wrapper.kt", l = {443}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsMapInfoV4Wrapper$toggleCard$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ MapAction.ToggleCard $action;
    int label;
    final /* synthetic */ HotelsMapInfoV4Wrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4Wrapper$toggleCard$1$1(HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper, MapAction.ToggleCard toggleCard, d<? super HotelsMapInfoV4Wrapper$toggleCard$1$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsMapInfoV4Wrapper;
        this.$action = toggleCard;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsMapInfoV4Wrapper$toggleCard$1$1(this.this$0, this.$action, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.this$0.hotelsMapInfoView.restoreCardsRvState(this.$action.getSavedRvState());
            HotelsMapInfoV4View hotelsMapInfoV4View = this.this$0.hotelsMapInfoView;
            this.label = 1;
            if (ViewExtensionsKt.awaitNextLayout(hotelsMapInfoV4View, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        HotelsMapInfoV4View.toggleCards$default(this.this$0.hotelsMapInfoView, true, null, 2, null);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsMapInfoV4Wrapper$toggleCard$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

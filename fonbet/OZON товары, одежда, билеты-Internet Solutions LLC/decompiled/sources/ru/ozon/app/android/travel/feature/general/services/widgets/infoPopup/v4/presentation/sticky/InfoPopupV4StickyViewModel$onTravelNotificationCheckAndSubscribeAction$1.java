package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.sticky;

import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.sticky.InfoPopupV4StickyViewModel$onTravelNotificationCheckAndSubscribeAction$1", f = "InfoPopupV4StickyViewModel.kt", l = {DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InfoPopupV4StickyViewModel$onTravelNotificationCheckAndSubscribeAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $atomAction;
    int label;
    final /* synthetic */ InfoPopupV4StickyViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InfoPopupV4StickyViewModel$onTravelNotificationCheckAndSubscribeAction$1(InfoPopupV4StickyViewModel infoPopupV4StickyViewModel, AtomAction atomAction, d<? super InfoPopupV4StickyViewModel$onTravelNotificationCheckAndSubscribeAction$1> dVar) {
        super(2, dVar);
        this.this$0 = infoPopupV4StickyViewModel;
        this.$atomAction = atomAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new InfoPopupV4StickyViewModel$onTravelNotificationCheckAndSubscribeAction$1(this.this$0, this.$atomAction, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object processAction;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InfoPopupV4StickyViewModel infoPopupV4StickyViewModel = this.this$0;
            AtomAction atomAction = this.$atomAction;
            this.label = 1;
            processAction = infoPopupV4StickyViewModel.processAction(atomAction, this);
            if (processAction == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((InfoPopupV4StickyViewModel$onTravelNotificationCheckAndSubscribeAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation;

import He.b;
import Sc.r;
import Sc.s;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.data.TravelAddNewPassengerFormV3DTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.data.TravelAddNewPassengerFormV3Mapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.data.TravelAddNewPassengerFormV3ResponseDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3ViewModel$performOnTextChangeComposerAction$1", f = "TravelAddNewPassengerFormV3ViewModel.kt", l = {254}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TravelAddNewPassengerFormV3ViewModel$performOnTextChangeComposerAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $atomAction;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ long $widgetId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TravelAddNewPassengerFormV3ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelAddNewPassengerFormV3ViewModel$performOnTextChangeComposerAction$1(TravelAddNewPassengerFormV3ViewModel travelAddNewPassengerFormV3ViewModel, AtomAction atomAction, Map<String, String> map, long j11, d<? super TravelAddNewPassengerFormV3ViewModel$performOnTextChangeComposerAction$1> dVar) {
        super(2, dVar);
        this.this$0 = travelAddNewPassengerFormV3ViewModel;
        this.$atomAction = atomAction;
        this.$params = map;
        this.$widgetId = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TravelAddNewPassengerFormV3ViewModel$performOnTextChangeComposerAction$1 travelAddNewPassengerFormV3ViewModel$performOnTextChangeComposerAction$1 = new TravelAddNewPassengerFormV3ViewModel$performOnTextChangeComposerAction$1(this.this$0, this.$atomAction, this.$params, this.$widgetId, dVar);
        travelAddNewPassengerFormV3ViewModel$performOnTextChangeComposerAction$1.L$0 = obj;
        return travelAddNewPassengerFormV3ViewModel$performOnTextChangeComposerAction$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        Throwable th2;
        Object a11;
        Throwable b11;
        TravelAddNewPassengerFormV3Mapper travelAddNewPassengerFormV3Mapper;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                M m12 = (M) this.L$0;
                TravelAddNewPassengerFormV3ViewModel travelAddNewPassengerFormV3ViewModel = this.this$0;
                AtomAction atomAction = this.$atomAction;
                Map<String, String> map = this.$params;
                try {
                    r.Companion companion = r.INSTANCE;
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    b bVar = b.f10879b;
                    TravelAddNewPassengerFormV3ViewModel$performOnTextChangeComposerAction$1$1$1 travelAddNewPassengerFormV3ViewModel$performOnTextChangeComposerAction$1$1$1 = new TravelAddNewPassengerFormV3ViewModel$performOnTextChangeComposerAction$1$1$1(travelAddNewPassengerFormV3ViewModel, atomAction, map, null);
                    this.L$0 = m12;
                    this.label = 1;
                    Object f7 = C10727i.f(bVar, travelAddNewPassengerFormV3ViewModel$performOnTextChangeComposerAction$1$1$1, this);
                    if (f7 == aVar) {
                        return aVar;
                    }
                    m11 = m12;
                    obj = f7;
                } catch (Throwable th3) {
                    m11 = m12;
                    th2 = th3;
                    r.Companion companion2 = r.INSTANCE;
                    a11 = s.a(th2);
                    b11 = r.b(a11);
                    if (b11 != null) {
                    }
                    TravelAddNewPassengerFormV3ViewModel travelAddNewPassengerFormV3ViewModel2 = this.this$0;
                    long j11 = this.$widgetId;
                    if (!(a11 instanceof r.b)) {
                    }
                    return Unit.f71690a;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m11 = (M) this.L$0;
                try {
                    s.b(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    r.Companion companion22 = r.INSTANCE;
                    a11 = s.a(th2);
                    b11 = r.b(a11);
                    if (b11 != null) {
                    }
                    TravelAddNewPassengerFormV3ViewModel travelAddNewPassengerFormV3ViewModel22 = this.this$0;
                    long j112 = this.$widgetId;
                    if (!(a11 instanceof r.b)) {
                    }
                    return Unit.f71690a;
                }
            }
            a11 = (TravelAddNewPassengerFormV3ResponseDTO) obj;
            r.Companion companion3 = r.INSTANCE;
            b11 = r.b(a11);
            if (b11 != null) {
                Lm0.a.f17149a.e(b11);
            }
            TravelAddNewPassengerFormV3ViewModel travelAddNewPassengerFormV3ViewModel222 = this.this$0;
            long j1122 = this.$widgetId;
            if (!(a11 instanceof r.b)) {
                TravelAddNewPassengerFormV3ResponseDTO travelAddNewPassengerFormV3ResponseDTO = (TravelAddNewPassengerFormV3ResponseDTO) a11;
                if (N.f(m11)) {
                    List<TravelAddNewPassengerFormV3DTO.InputItemDTO> inputs = travelAddNewPassengerFormV3ResponseDTO.getInputs();
                    List<TravelAddNewPassengerFormV3DTO.InputItemDTO> list = inputs;
                    if (list == null || list.isEmpty()) {
                        return Unit.f71690a;
                    }
                    travelAddNewPassengerFormV3Mapper = travelAddNewPassengerFormV3ViewModel222.mapper;
                    travelAddNewPassengerFormV3ViewModel222.updateInputs(travelAddNewPassengerFormV3Mapper.mapInputsItemsToVO(inputs, j1122), false);
                }
            }
            return Unit.f71690a;
        } catch (CancellationException e11) {
            throw e11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TravelAddNewPassengerFormV3ViewModel$performOnTextChangeComposerAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

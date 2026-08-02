package ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.presentation;

import He.b;
import Sc.r;
import Sc.s;
import Wc.a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionWithErrorResponse;
import ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.presentation.ToursLoaderViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.presentation.ToursLoaderViewModel$performComposerAction$1", f = "ToursLoaderViewModel.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class ToursLoaderViewModel$performComposerAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $atomAction;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ToursLoaderViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursLoaderViewModel$performComposerAction$1(ToursLoaderViewModel toursLoaderViewModel, AtomAction atomAction, d<? super ToursLoaderViewModel$performComposerAction$1> dVar) {
        super(2, dVar);
        this.this$0 = toursLoaderViewModel;
        this.$atomAction = atomAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ToursLoaderViewModel$performComposerAction$1 toursLoaderViewModel$performComposerAction$1 = new ToursLoaderViewModel$performComposerAction$1(this.this$0, this.$atomAction, dVar);
        toursLoaderViewModel$performComposerAction$1.L$0 = obj;
        return toursLoaderViewModel$performComposerAction$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        Throwable th2;
        Object a11;
        Throwable b11;
        SingleLiveEvent singleLiveEvent;
        ToursLoaderViewModel.Result error;
        SingleLiveEvent singleLiveEvent2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                M m12 = (M) this.L$0;
                ToursLoaderViewModel toursLoaderViewModel = this.this$0;
                AtomAction atomAction = this.$atomAction;
                try {
                    r.Companion companion = r.INSTANCE;
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    b bVar = b.f10879b;
                    ToursLoaderViewModel$performComposerAction$1$1$1 toursLoaderViewModel$performComposerAction$1$1$1 = new ToursLoaderViewModel$performComposerAction$1$1$1(toursLoaderViewModel, atomAction, null);
                    this.L$0 = m12;
                    this.label = 1;
                    Object f7 = C10727i.f(bVar, toursLoaderViewModel$performComposerAction$1$1$1, this);
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
                    ToursLoaderViewModel toursLoaderViewModel2 = this.this$0;
                    b11 = r.b(a11);
                    if (b11 != null) {
                    }
                    ToursLoaderViewModel toursLoaderViewModel3 = this.this$0;
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
                    ToursLoaderViewModel toursLoaderViewModel22 = this.this$0;
                    b11 = r.b(a11);
                    if (b11 != null) {
                    }
                    ToursLoaderViewModel toursLoaderViewModel32 = this.this$0;
                    if (!(a11 instanceof r.b)) {
                    }
                    return Unit.f71690a;
                }
            }
            a11 = (TravelCommonActionWithErrorResponse) obj;
            r.Companion companion3 = r.INSTANCE;
            ToursLoaderViewModel toursLoaderViewModel222 = this.this$0;
            b11 = r.b(a11);
            if (b11 != null) {
                Lm0.a.f17149a.e(b11);
                singleLiveEvent2 = toursLoaderViewModel222.resultLiveData;
                singleLiveEvent2.setValue(new ToursLoaderViewModel.Result.Error(null));
            }
            ToursLoaderViewModel toursLoaderViewModel322 = this.this$0;
            if (!(a11 instanceof r.b)) {
                TravelCommonActionWithErrorResponse travelCommonActionWithErrorResponse = (TravelCommonActionWithErrorResponse) a11;
                if (N.f(m11)) {
                    singleLiveEvent = toursLoaderViewModel322.resultLiveData;
                    AtomActionDTO action = travelCommonActionWithErrorResponse.getAction();
                    if (action != null) {
                        error = action.getBehavior() == AtomActionDTO.Behavior.BEHAVIOR_TYPE_REFRESH ? new ToursLoaderViewModel.Result.SuccessRefresh(action.getLink()) : new ToursLoaderViewModel.Result.SuccessAction(AtomActionMapperKt.toAtomAction(action, null));
                    } else {
                        String error2 = travelCommonActionWithErrorResponse.getError();
                        if (error2 == null) {
                            error2 = "";
                        }
                        error = new ToursLoaderViewModel.Result.Error(error2);
                    }
                    singleLiveEvent.setValue(error);
                }
            }
            return Unit.f71690a;
        } catch (CancellationException e11) {
            throw e11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ToursLoaderViewModel$performComposerAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

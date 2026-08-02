package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel;

import Sc.r;
import Sc.s;
import W10.c;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel.HotelsBookTotalV3ViewModel;
import ru.ozon.app.android.travel.usecase.RequestTravelCommonActionV2UseCase;
import ru.ozon.app.android.travel.usecase.TravelCommonActionV2Model;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel.HotelsBookTotalV3ViewModel$performApiAction$4", f = "HotelsBookTotalV3ViewModel.kt", l = {46, 47, 48, 49}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class HotelsBookTotalV3ViewModel$performApiAction$4 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ Map<String, Object> $filledParams;
    final /* synthetic */ boolean $isButtonLoader;
    final /* synthetic */ c $trackingData;
    Object L$0;
    int label;
    final /* synthetic */ HotelsBookTotalV3ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsBookTotalV3ViewModel$performApiAction$4(HotelsBookTotalV3ViewModel hotelsBookTotalV3ViewModel, boolean z11, String str, Map<String, Object> map, c cVar, d<? super HotelsBookTotalV3ViewModel$performApiAction$4> dVar) {
        super(2, dVar);
        this.this$0 = hotelsBookTotalV3ViewModel;
        this.$isButtonLoader = z11;
        this.$actionName = str;
        this.$filledParams = map;
        this.$trackingData = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsBookTotalV3ViewModel$performApiAction$4(this.this$0, this.$isButtonLoader, this.$actionName, this.$filledParams, this.$trackingData, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008a, code lost:
    
        if (r8 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r8 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r8 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        if (r8 == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object sendResult;
        RequestTravelCommonActionV2UseCase requestTravelCommonActionV2UseCase;
        Object f26106a;
        Object sendResult2;
        Throwable b11;
        Object handleOnFailure;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            HotelsBookTotalV3ViewModel hotelsBookTotalV3ViewModel = this.this$0;
            HotelsBookTotalV3ViewModel.ActionResult.Loading loading = new HotelsBookTotalV3ViewModel.ActionResult.Loading(this.$isButtonLoader);
            this.label = 1;
            sendResult = hotelsBookTotalV3ViewModel.sendResult(loading, this);
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    s.b(obj);
                    f26106a = ((r) obj).getF26106a();
                    HotelsBookTotalV3ViewModel hotelsBookTotalV3ViewModel2 = this.this$0;
                    if (!(f26106a instanceof r.b)) {
                        HotelsBookTotalV3ViewModel.ActionResult.Success success = new HotelsBookTotalV3ViewModel.ActionResult.Success(((TravelCommonActionV2Model) f26106a).getAction());
                        this.L$0 = f26106a;
                        this.label = 3;
                        sendResult2 = hotelsBookTotalV3ViewModel2.sendResult(success, this);
                    }
                    HotelsBookTotalV3ViewModel hotelsBookTotalV3ViewModel3 = this.this$0;
                    b11 = r.b(f26106a);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                f26106a = this.L$0;
                s.b(obj);
                HotelsBookTotalV3ViewModel hotelsBookTotalV3ViewModel32 = this.this$0;
                b11 = r.b(f26106a);
                if (b11 != null) {
                    this.L$0 = f26106a;
                    this.label = 4;
                    handleOnFailure = hotelsBookTotalV3ViewModel32.handleOnFailure(b11, this);
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        requestTravelCommonActionV2UseCase = this.this$0.requestTravelCommonActionV2UseCase;
        String str = this.$actionName;
        Map<String, ? extends Object> map = this.$filledParams;
        c cVar = this.$trackingData;
        this.label = 2;
        obj = requestTravelCommonActionV2UseCase.invoke(str, map, cVar, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsBookTotalV3ViewModel$performApiAction$4) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

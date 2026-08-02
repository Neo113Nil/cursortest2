package ru.ozon.app.android.mapcommon.map.sdk;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.mapcommon.map.model.CoordinateModel;
import ru.ozon.app.android.mapcommon.map.model.CoordinateModelKt;
import we0.m;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwe0/m;", "it", "", "<anonymous>", "(Lwe0/m;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mapcommon.map.sdk.SdkMapController$doAfterMapInit$1$2", f = "SdkMapController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SdkMapController$doAfterMapInit$1$2 extends j implements Function2<m, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SdkMapController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SdkMapController$doAfterMapInit$1$2(SdkMapController sdkMapController, d<? super SdkMapController$doAfterMapInit$1$2> dVar) {
        super(2, dVar);
        this.this$0 = sdkMapController;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SdkMapController$doAfterMapInit$1$2 sdkMapController$doAfterMapInit$1$2 = new SdkMapController$doAfterMapInit$1$2(this.this$0, dVar);
        sdkMapController$doAfterMapInit$1$2.L$0 = obj;
        return sdkMapController$doAfterMapInit$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        m mVar = (m) this.L$0;
        Function1<CoordinateModel, Unit> onMapClickListener = this.this$0.getOnMapClickListener();
        if (onMapClickListener != null) {
            onMapClickListener.invoke(CoordinateModelKt.toCoordinateModel(mVar));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(m mVar, d<? super Unit> dVar) {
        return ((SdkMapController$doAfterMapInit$1$2) create(mVar, dVar)).invokeSuspend(Unit.f71690a);
    }
}

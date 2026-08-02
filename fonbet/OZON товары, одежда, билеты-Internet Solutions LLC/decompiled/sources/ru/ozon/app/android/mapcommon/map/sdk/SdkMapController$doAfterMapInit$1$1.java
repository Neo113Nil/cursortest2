package ru.ozon.app.android.mapcommon.map.sdk;

import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.mapcommon.map.model.CameraPositionModel;
import ru.ozon.app.android.mapcommon.map.model.CameraPositionModelKt;
import ru.ozon.app.android.mapcommon.map.model.CameraUpdateReasonModel;
import ru.ozon.app.android.mapcommon.map.model.CameraUpdateReasonModelKt;
import we0.h;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwe0/h;", "it", "", "<anonymous>", "(Lwe0/h;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mapcommon.map.sdk.SdkMapController$doAfterMapInit$1$1", f = "SdkMapController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SdkMapController$doAfterMapInit$1$1 extends j implements Function2<h, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SdkMapController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SdkMapController$doAfterMapInit$1$1(SdkMapController sdkMapController, d<? super SdkMapController$doAfterMapInit$1$1> dVar) {
        super(2, dVar);
        this.this$0 = sdkMapController;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SdkMapController$doAfterMapInit$1$1 sdkMapController$doAfterMapInit$1$1 = new SdkMapController$doAfterMapInit$1$1(this.this$0, dVar);
        sdkMapController$doAfterMapInit$1$1.L$0 = obj;
        return sdkMapController$doAfterMapInit$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        h hVar = (h) this.L$0;
        InterfaceC6511n<CameraPositionModel, CameraUpdateReasonModel, Boolean, Unit> onCameraChanged = this.this$0.getOnCameraChanged();
        if (onCameraChanged != null) {
            onCameraChanged.invoke(CameraPositionModelKt.toCameraPositionModel(hVar.a()), CameraUpdateReasonModelKt.toCameraUpdateReasonModel(hVar.b()), Boolean.valueOf(hVar.c()));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(h hVar, d<? super Unit> dVar) {
        return ((SdkMapController$doAfterMapInit$1$1) create(hVar, dVar)).invokeSuspend(Unit.f71690a);
    }
}

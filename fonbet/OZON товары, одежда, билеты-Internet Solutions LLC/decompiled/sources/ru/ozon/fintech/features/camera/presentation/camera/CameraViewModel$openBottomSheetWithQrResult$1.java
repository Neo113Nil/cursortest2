package ru.ozon.fintech.features.camera.presentation.camera;

import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.fintech.features.camera.presentation.camera.CameraViewModel$openBottomSheetWithQrResult$1", f = "CameraViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CameraViewModel$openBottomSheetWithQrResult$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ boolean $needPop;
    int label;
    final /* synthetic */ CameraViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraViewModel$openBottomSheetWithQrResult$1(boolean z11, CameraViewModel cameraViewModel, d<? super CameraViewModel$openBottomSheetWithQrResult$1> dVar) {
        super(2, dVar);
        this.$needPop = z11;
        this.this$0 = cameraViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CameraViewModel$openBottomSheetWithQrResult$1(this.$needPop, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        S80.b bVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (this.$needPop) {
            bVar = this.this$0.fintechNavigation;
            bVar.pop();
        }
        this.this$0.getOpenErrorBottomSheet().tryEmit(Boolean.TRUE);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CameraViewModel$openBottomSheetWithQrResult$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

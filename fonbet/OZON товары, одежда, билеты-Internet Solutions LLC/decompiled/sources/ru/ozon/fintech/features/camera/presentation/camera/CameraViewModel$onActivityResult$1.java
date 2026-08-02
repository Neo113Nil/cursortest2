package ru.ozon.fintech.features.camera.presentation.camera;

import Sc.s;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.fintech.features.camera.presentation.camera.CameraViewModel$onActivityResult$1", f = "CameraViewModel.kt", l = {1065}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CameraViewModel$onActivityResult$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Uri $dataUri;
    final /* synthetic */ int $requestCode;
    int label;
    final /* synthetic */ CameraViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraViewModel$onActivityResult$1(CameraViewModel cameraViewModel, Uri uri, int i11, d<? super CameraViewModel$onActivityResult$1> dVar) {
        super(2, dVar);
        this.this$0 = cameraViewModel;
        this.$dataUri = uri;
        this.$requestCode = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CameraViewModel$onActivityResult$1(this.this$0, this.$dataUri, this.$requestCode, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.label = 1;
            if (Y.b(400L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        try {
            this.this$0.handleFileUriByReqId(this.$dataUri, this.$requestCode);
        } catch (Exception e11) {
            L80.a.c("CameraViewModel", null, e11);
            CameraViewModel.openBottomSheetWithQrResult$default(this.this$0, false, 1, null);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CameraViewModel$onActivityResult$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

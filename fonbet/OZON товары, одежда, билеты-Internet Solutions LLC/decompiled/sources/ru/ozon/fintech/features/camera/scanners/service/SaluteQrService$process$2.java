package ru.ozon.fintech.features.camera.scanners.service;

import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.features.camera.scanners.salute.SaluteInteractor;
import ru.ozon.fintech.features.camera.scanners.service.SaluteQrService;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.fintech.features.camera.scanners.service.SaluteQrService$process$2", f = "SaluteQrService.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SaluteQrService$process$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ SaluteInteractor.ScanResult $result;
    final /* synthetic */ SaluteQrService.Task $task;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaluteQrService$process$2(SaluteQrService.Task task, SaluteInteractor.ScanResult scanResult, d<? super SaluteQrService$process$2> dVar) {
        super(2, dVar);
        this.$task = task;
        this.$result = scanResult;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SaluteQrService$process$2(this.$task, this.$result, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.$task.getCallback().onSuccess(this.$result.getQrData(), this.$result.getRawBytesBase64(), this.$result.getFormatCode());
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SaluteQrService$process$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

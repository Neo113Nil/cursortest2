package ru.ozon.fintech.features.camera.domain.scanner.base;

import Sc.s;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.features.camera.domain.scanner.ImageAnalyzerUtilsKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.fintech.features.camera.domain.scanner.base.FintechBaseImageAnalyzer$checkForAutoFocus$1$1", f = "FintechBaseImageAnalyzer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FintechBaseImageAnalyzer$checkForAutoFocus$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ByteBuffer $it;
    int label;
    final /* synthetic */ FintechBaseImageAnalyzer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FintechBaseImageAnalyzer$checkForAutoFocus$1$1(ByteBuffer byteBuffer, FintechBaseImageAnalyzer fintechBaseImageAnalyzer, d<? super FintechBaseImageAnalyzer$checkForAutoFocus$1$1> dVar) {
        super(2, dVar);
        this.$it = byteBuffer;
        this.this$0 = fintechBaseImageAnalyzer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FintechBaseImageAnalyzer$checkForAutoFocus$1$1(this.$it, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        double estimateSharpness = ImageAnalyzerUtilsKt.estimateSharpness(this.$it);
        if (estimateSharpness > 0.0d && estimateSharpness < this.this$0.getMobScannerConfig().getSharpnessThreshold()) {
            this.this$0.getNeedAutoFocusFlow().tryEmit(Unit.f71690a);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FintechBaseImageAnalyzer$checkForAutoFocus$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

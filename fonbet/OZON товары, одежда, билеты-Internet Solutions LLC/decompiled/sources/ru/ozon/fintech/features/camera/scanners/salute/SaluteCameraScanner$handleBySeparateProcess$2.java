package ru.ozon.fintech.features.camera.scanners.salute;

import Sc.s;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.features.camera.scanners.salute.SaluteCameraScanner;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/fintech/features/camera/scanners/salute/SaluteCameraScanner$ServiceScannerResult;", "<anonymous>", "(Lxe/M;)Lru/ozon/fintech/features/camera/scanners/salute/SaluteCameraScanner$ServiceScannerResult;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.fintech.features.camera.scanners.salute.SaluteCameraScanner$handleBySeparateProcess$2", f = "SaluteCameraScanner.kt", l = {192}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SaluteCameraScanner$handleBySeparateProcess$2 extends j implements Function2<M, d<? super SaluteCameraScanner.ServiceScannerResult>, Object> {
    final /* synthetic */ File $file;
    int label;
    final /* synthetic */ SaluteCameraScanner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaluteCameraScanner$handleBySeparateProcess$2(SaluteCameraScanner saluteCameraScanner, File file, d<? super SaluteCameraScanner$handleBySeparateProcess$2> dVar) {
        super(2, dVar);
        this.this$0 = saluteCameraScanner;
        this.$file = file;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SaluteCameraScanner$handleBySeparateProcess$2(this.this$0, this.$file, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        long j11;
        Object submitAndAwait;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        SaluteCameraScanner saluteCameraScanner = this.this$0;
        String absolutePath = this.$file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        j11 = this.this$0.processTimeout;
        this.label = 1;
        submitAndAwait = saluteCameraScanner.submitAndAwait(absolutePath, j11, this);
        return submitAndAwait == aVar ? aVar : submitAndAwait;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super SaluteCameraScanner.ServiceScannerResult> dVar) {
        return ((SaluteCameraScanner$handleBySeparateProcess$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

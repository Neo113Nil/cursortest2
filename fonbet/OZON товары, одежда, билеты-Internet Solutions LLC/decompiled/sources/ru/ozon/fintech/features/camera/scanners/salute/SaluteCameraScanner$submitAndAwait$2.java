package ru.ozon.fintech.features.camera.scanners.salute;

import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.features.camera.scanners.ipc.ISaluteQrAnalyzer;
import ru.ozon.fintech.features.camera.scanners.ipc.ISaluteQrResultCallback;
import ru.ozon.fintech.features.camera.scanners.salute.SaluteCameraScanner;
import xe.C10737n;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/fintech/features/camera/scanners/salute/SaluteCameraScanner$ServiceScannerResult;", "<anonymous>", "(Lxe/M;)Lru/ozon/fintech/features/camera/scanners/salute/SaluteCameraScanner$ServiceScannerResult;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.fintech.features.camera.scanners.salute.SaluteCameraScanner$submitAndAwait$2", f = "SaluteCameraScanner.kt", l = {393}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SaluteCameraScanner$submitAndAwait$2 extends j implements Function2<M, d<? super SaluteCameraScanner.ServiceScannerResult>, Object> {
    final /* synthetic */ String $path;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SaluteCameraScanner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaluteCameraScanner$submitAndAwait$2(SaluteCameraScanner saluteCameraScanner, String str, d<? super SaluteCameraScanner$submitAndAwait$2> dVar) {
        super(2, dVar);
        this.this$0 = saluteCameraScanner;
        this.$path = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SaluteCameraScanner$submitAndAwait$2(this.this$0, this.$path, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ISaluteQrAnalyzer iSaluteQrAnalyzer;
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
        String str = this.$path;
        this.L$0 = saluteCameraScanner;
        this.L$1 = str;
        this.label = 1;
        final C10737n c10737n = new C10737n(1, Wc.b.b(this));
        c10737n.o();
        iSaluteQrAnalyzer = saluteCameraScanner.service;
        if (iSaluteQrAnalyzer == null) {
            c10737n.u(null, null);
        } else {
            try {
                iSaluteQrAnalyzer.analyze(str, null, new ISaluteQrResultCallback.Stub() { // from class: ru.ozon.fintech.features.camera.scanners.salute.SaluteCameraScanner$submitAndAwait$2$1$callback$1
                    @Override // ru.ozon.fintech.features.camera.scanners.ipc.ISaluteQrResultCallback
                    public void onError() {
                        if (c10737n.isActive()) {
                            c10737n.u(null, null);
                        }
                    }

                    @Override // ru.ozon.fintech.features.camera.scanners.ipc.ISaluteQrResultCallback
                    public void onSuccess(String qrData, String rawDataBase64, int barcodeFormatOrdinal) {
                        if (c10737n.isActive()) {
                            c10737n.u(new SaluteCameraScanner.ServiceScannerResult(qrData, rawDataBase64, Integer.valueOf(barcodeFormatOrdinal)), null);
                        }
                    }
                });
            } catch (Throwable th2) {
                L80.a.c("SALUTE_SCANNER", "submitAndAwait try/catch", th2);
                if (c10737n.isActive()) {
                    c10737n.u(null, null);
                }
            }
            c10737n.q(new Function1<Throwable, Unit>() { // from class: ru.ozon.fintech.features.camera.scanners.salute.SaluteCameraScanner$submitAndAwait$2$1$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th3) {
                    invoke2(th3);
                    return Unit.f71690a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th3) {
                    L80.a.a("SALUTE_SCANNER", "submitAndAwait coroutine cancelled");
                }
            });
        }
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(this, "frame");
        }
        return n11 == aVar ? aVar : n11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super SaluteCameraScanner.ServiceScannerResult> dVar) {
        return ((SaluteCameraScanner$submitAndAwait$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

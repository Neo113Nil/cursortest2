package ru.ozon.fintech.features.camera.scanners.salute;

import Sc.s;
import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.C10727i;
import xe.M;
import xe.N0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.fintech.features.camera.scanners.salute.SaluteCameraScanner$shutdown$1", f = "SaluteCameraScanner.kt", l = {139}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SaluteCameraScanner$shutdown$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ SaluteCameraScanner this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.fintech.features.camera.scanners.salute.SaluteCameraScanner$shutdown$1$1", f = "SaluteCameraScanner.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.fintech.features.camera.scanners.salute.SaluteCameraScanner$shutdown$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;
        final /* synthetic */ SaluteCameraScanner this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SaluteCameraScanner saluteCameraScanner, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = saluteCameraScanner;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Context context;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            SaluteCameraScanner saluteCameraScanner = this.this$0;
            context = this.this$0.context;
            saluteCameraScanner.clean(new File(context.getFilesDir(), "/imgTmp/"));
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaluteCameraScanner$shutdown$1(SaluteCameraScanner saluteCameraScanner, d<? super SaluteCameraScanner$shutdown$1> dVar) {
        super(2, dVar);
        this.this$0 = saluteCameraScanner;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SaluteCameraScanner$shutdown$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            N0 n02 = N0.f105411a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (C10727i.f(n02, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SaluteCameraScanner$shutdown$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

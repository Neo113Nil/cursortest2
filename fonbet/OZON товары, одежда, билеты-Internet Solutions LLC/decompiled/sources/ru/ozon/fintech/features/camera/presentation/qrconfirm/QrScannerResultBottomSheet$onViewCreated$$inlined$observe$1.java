package ru.ozon.fintech.features.camera.presentation.qrconfirm;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.features.camera.domain.QrBottomSheetViewState;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.fintech.features.camera.presentation.qrconfirm.QrScannerResultBottomSheet$onViewCreated$$inlined$observe$1", f = "QrScannerResultBottomSheet.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class QrScannerResultBottomSheet$onViewCreated$$inlined$observe$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ComponentCallbacksC5392m $fragment;
    final /* synthetic */ InterfaceC2395h $this_observe;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ QrScannerResultBottomSheet this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.fintech.features.camera.presentation.qrconfirm.QrScannerResultBottomSheet$onViewCreated$$inlined$observe$1$1", f = "QrScannerResultBottomSheet.kt", l = {34}, m = "invokeSuspend")
    /* renamed from: ru.ozon.fintech.features.camera.presentation.qrconfirm.QrScannerResultBottomSheet$onViewCreated$$inlined$observe$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ InterfaceC2395h $this_observe;
        int label;
        final /* synthetic */ QrScannerResultBottomSheet this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC2395h interfaceC2395h, d dVar, QrScannerResultBottomSheet qrScannerResultBottomSheet) {
            super(2, dVar);
            this.$this_observe = interfaceC2395h;
            this.this$0 = qrScannerResultBottomSheet;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$this_observe, dVar, this.this$0);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2395h interfaceC2395h = this.$this_observe;
                final QrScannerResultBottomSheet qrScannerResultBottomSheet = this.this$0;
                InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.fintech.features.camera.presentation.qrconfirm.QrScannerResultBottomSheet$onViewCreated$.inlined.observe.1.1.1
                    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
                    
                        r3 = r1.negativeBtn;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
                    
                        r3 = r1.positiveBtn;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
                    
                        r3 = r1.titleTv;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // Ae.InterfaceC2397i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(T t2, d<? super Unit> dVar) {
                        Button button;
                        Button button2;
                        TextView textView;
                        QrBottomSheetViewState qrBottomSheetViewState = (QrBottomSheetViewState) t2;
                        if (qrBottomSheetViewState != null) {
                            if (qrBottomSheetViewState.getTitle().length() > 0 && textView != null) {
                                textView.setText(qrBottomSheetViewState.getTitle());
                            }
                            if (qrBottomSheetViewState.getNegativeBtnText().length() > 0 && button2 != null) {
                                button2.setText(qrBottomSheetViewState.getNegativeBtnText());
                            }
                            if (qrBottomSheetViewState.getPositiveBtnText().length() > 0 && button != null) {
                                button.setText(qrBottomSheetViewState.getPositiveBtnText());
                            }
                        }
                        return Unit.f71690a;
                    }
                };
                this.label = 1;
                if (interfaceC2395h.collect(interfaceC2397i, this) == aVar) {
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
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrScannerResultBottomSheet$onViewCreated$$inlined$observe$1(ComponentCallbacksC5392m componentCallbacksC5392m, InterfaceC2395h interfaceC2395h, d dVar, QrScannerResultBottomSheet qrScannerResultBottomSheet) {
        super(2, dVar);
        this.$fragment = componentCallbacksC5392m;
        this.$this_observe = interfaceC2395h;
        this.this$0 = qrScannerResultBottomSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        QrScannerResultBottomSheet$onViewCreated$$inlined$observe$1 qrScannerResultBottomSheet$onViewCreated$$inlined$observe$1 = new QrScannerResultBottomSheet$onViewCreated$$inlined$observe$1(this.$fragment, this.$this_observe, dVar, this.this$0);
        qrScannerResultBottomSheet$onViewCreated$$inlined$observe$1.L$0 = obj;
        return qrScannerResultBottomSheet$onViewCreated$$inlined$observe$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (N.f((M) this.L$0)) {
                J viewLifecycleOwner = this.$fragment.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_observe, null, this.this$0);
                this.label = 1;
                if (C5412d0.b(viewLifecycleOwner, bVar, anonymousClass1, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((QrScannerResultBottomSheet$onViewCreated$$inlined$observe$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

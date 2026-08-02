package ru.ozon.app.android.pikazon.glide.loaders;

import Ae.InterfaceC2397i;
import Ae.M0;
import Sc.C4005g;
import Sc.s;
import Ud0.a;
import Wc.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pikazon.glide.loaders.PikazonImageWarmUpper$startConfigUpdateListening$1", f = "PikazonImageWarmUpper.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class PikazonImageWarmUpper$startConfigUpdateListening$1 extends j implements Function2<M, d<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    PikazonImageWarmUpper$startConfigUpdateListening$1(d<? super PikazonImageWarmUpper$startConfigUpdateListening$1> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        PikazonImageWarmUpper$startConfigUpdateListening$1 pikazonImageWarmUpper$startConfigUpdateListening$1 = new PikazonImageWarmUpper$startConfigUpdateListening$1(dVar);
        pikazonImageWarmUpper$startConfigUpdateListening$1.L$0 = obj;
        return pikazonImageWarmUpper$startConfigUpdateListening$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        M0 m02;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            final M m11 = (M) this.L$0;
            m02 = PikazonImageWarmUpper.configFlow;
            if (m02 == null) {
                return Unit.f71690a;
            }
            InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.pikazon.glide.loaders.PikazonImageWarmUpper$startConfigUpdateListening$1.1
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((Ud0.a) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(Ud0.a aVar2, d<? super Unit> dVar) {
                    ArrayList d11 = aVar2.d();
                    if (d11 != null) {
                        M m12 = M.this;
                        Iterator<T> it = d11.iterator();
                        while (it.hasNext()) {
                            C10727i.c(m12, null, null, new PikazonImageWarmUpper$startConfigUpdateListening$1$1$1$1((a.b) it.next(), null), 3);
                        }
                    }
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (m02.collect(interfaceC2397i, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        throw new C4005g();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PikazonImageWarmUpper$startConfigUpdateListening$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

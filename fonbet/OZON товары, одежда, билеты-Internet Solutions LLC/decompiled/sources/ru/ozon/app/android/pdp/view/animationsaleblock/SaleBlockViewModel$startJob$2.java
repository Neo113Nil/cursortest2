package ru.ozon.app.android.pdp.view.animationsaleblock;

import Sc.s;
import Wc.a;
import androidx.lifecycle.V;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.view.animationsaleblock.SaleBlockViewModel$startJob$2", f = "SaleBlockViewModel.kt", l = {56, 67}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SaleBlockViewModel$startJob$2 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ SaleBlockViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaleBlockViewModel$startJob$2(SaleBlockViewModel saleBlockViewModel, d<? super SaleBlockViewModel$startJob$2> dVar) {
        super(2, dVar);
        this.this$0 = saleBlockViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SaleBlockViewModel$startJob$2(this.this$0, dVar);
    }

    /* JADX WARN: Incorrect condition in loop: B:36:0x002a */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0083 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0085  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x005d -> B:6:0x0077). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Set set;
        V v11;
        AtomicBoolean atomicBoolean;
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        Set set2;
        Set set3;
        Set set4;
        Set set5;
        V v12;
        Integer num;
        AtomicInteger atomicInteger3;
        Set set6;
        V v13;
        Set set7;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            while (!set5.isEmpty()) {
            }
            v12 = this.this$0._events;
            v12.postValue(null);
            num = this.this$0.delay;
            if (num != null) {
            }
            while (!set.isEmpty()) {
            }
            v11 = this.this$0._events;
            v11.postValue(null);
            return Unit.f71690a;
        }
        s.b(obj);
        while (!set.isEmpty()) {
            atomicBoolean = this.this$0.itemInCart;
            if (atomicBoolean.get()) {
                break;
            }
            atomicInteger = this.this$0.timer;
            if (atomicInteger.get() < 0) {
                return Unit.f71690a;
            }
            atomicInteger2 = this.this$0.timer;
            if (atomicInteger2.getAndDecrement() > 0) {
                this.label = 1;
                if (Y.b(1000L, this) == aVar) {
                    return aVar;
                }
            } else {
                set2 = this.this$0.postObjects;
                set2.clear();
                set3 = this.this$0.postObjects;
                set4 = this.this$0.objects;
                set3.addAll(set4);
                while (!set5.isEmpty()) {
                    set6 = this.this$0.postObjects;
                    Iterator it = set6.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    Object next = it.next();
                    if (it.hasNext()) {
                        int priority = ((ObjectAnimation) next).getPriority();
                        do {
                            Object next2 = it.next();
                            int priority2 = ((ObjectAnimation) next2).getPriority();
                            if (priority < priority2) {
                                next = next2;
                                priority = priority2;
                            }
                        } while (it.hasNext());
                    }
                    SaleBlockViewModel saleBlockViewModel = this.this$0;
                    ObjectAnimation objectAnimation = (ObjectAnimation) next;
                    v13 = saleBlockViewModel._events;
                    v13.postValue(objectAnimation);
                    set7 = saleBlockViewModel.postObjects;
                    set7.remove(objectAnimation);
                    this.label = 2;
                    if (Y.b(1000L, this) == aVar) {
                        break;
                    }
                }
                v12 = this.this$0._events;
                v12.postValue(null);
                num = this.this$0.delay;
                if (num != null) {
                    SaleBlockViewModel saleBlockViewModel2 = this.this$0;
                    int intValue = num.intValue();
                    atomicInteger3 = saleBlockViewModel2.timer;
                    atomicInteger3.set(intValue);
                }
                while (!set.isEmpty()) {
                }
            }
        }
        v11 = this.this$0._events;
        v11.postValue(null);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SaleBlockViewModel$startJob$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

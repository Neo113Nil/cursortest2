package ru.ozon.android.messenger.framework.data.modules.atoms.timerbadge;

import Ae.AbstractC2381a;
import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import De.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import org.joda.time.MutableDateTime;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.modules.atoms.timerbadge.TimerBadgeHolder$startTimer$1", f = "TimerBadgeHolder.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f87633d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f87634e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ d f87635f;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f87636a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M f87637b;

        a(d dVar, M m11) {
            this.f87636a = dVar;
            this.f87637b = m11;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            MutableDateTime mutableDateTime;
            d dVar2 = this.f87636a;
            mutableDateTime = dVar2.f87641c;
            if (mutableDateTime != null) {
                mutableDateTime.i().h();
                C10720e0 c10720e0 = C10720e0.f105451a;
                C10727i.c(this.f87637b, s.f6650a, null, new b(dVar2, null), 2);
                if (mutableDateTime.getMillis() < 1000) {
                    d.e(dVar2);
                }
            } else {
                d.e(dVar2);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, kotlin.coroutines.d<? super c> dVar2) {
        super(2, dVar2);
        this.f87635f = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        c cVar = new c(this.f87635f, dVar);
        cVar.f87634e = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f87633d;
        if (i11 == 0) {
            Sc.s.b(obj);
            M m11 = (M) this.f87634e;
            InterfaceC2395h A11 = C2399j.A(new e(2, null));
            a aVar2 = new a(this.f87635f, m11);
            this.f87633d = 1;
            if (((AbstractC2381a) A11).collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}

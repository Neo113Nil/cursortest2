package ru.ozon.android.messenger.blocks.travelOrders;

import Ae.AbstractC2381a;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.n1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import v0.I;
import v0.InterfaceC10174n;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.travelOrders.TravelOrdersContentKt$TravelOrdersContent$1$1", f = "TravelOrdersContent.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f86514d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ I f86515e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Set<Integer> f86516f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ p f86517g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function1<Map<String, MessengerTrackingInfo>, Unit> f86518h;

    static final class a extends AbstractC7737t implements Function0<List<? extends InterfaceC10174n>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ I f86519b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(I i11) {
            super(0);
            this.f86519b = i11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC10174n> invoke() {
            return this.f86519b.t().g();
        }
    }

    static final class b<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set<Integer> f86520a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f86521b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Map<String, MessengerTrackingInfo>, Unit> f86522c;

        /* JADX WARN: Multi-variable type inference failed */
        b(Set<Integer> set, p pVar, Function1<? super Map<String, MessengerTrackingInfo>, Unit> function1) {
            this.f86520a = set;
            this.f86521b = pVar;
            this.f86522c = function1;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            ru.ozon.android.messenger.blocks.travelOrders.a aVar;
            Map<String, MessengerTrackingInfo> e11;
            Iterator<T> it = ((List) obj).iterator();
            while (it.hasNext()) {
                int index = ((InterfaceC10174n) it.next()).getIndex();
                if (this.f86520a.add(new Integer(index)) && (aVar = (ru.ozon.android.messenger.blocks.travelOrders.a) C7714v.Q(index, this.f86521b.c())) != null && (e11 = aVar.e()) != null) {
                    this.f86522c.invoke(e11);
                }
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    g(I i11, Set<Integer> set, p pVar, Function1<? super Map<String, MessengerTrackingInfo>, Unit> function1, kotlin.coroutines.d<? super g> dVar) {
        super(2, dVar);
        this.f86515e = i11;
        this.f86516f = set;
        this.f86517g = pVar;
        this.f86518h = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f86515e, this.f86516f, this.f86517g, this.f86518h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f86514d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC2395h m11 = n1.m(new a(this.f86515e));
            b bVar = new b(this.f86516f, this.f86517g, this.f86518h);
            this.f86514d = 1;
            if (((AbstractC2381a) m11).collect(bVar, this) == aVar) {
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

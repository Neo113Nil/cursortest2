package pe0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import we0.p;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.userLocationManager.BaseUserLocationManager$subscribeForLocationUpdates$1", f = "BaseUserLocationManager.kt", l = {167}, m = "invokeSuspend")
/* renamed from: pe0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8906b extends kotlin.coroutines.jvm.internal.j implements Function2<p, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f80426d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f80427e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC8905a<se0.c> f80428f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.userLocationManager.BaseUserLocationManager$subscribeForLocationUpdates$1$1", f = "BaseUserLocationManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pe0.b$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC8905a<se0.c> f80429d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ p f80430e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC8905a<se0.c> abstractC8905a, p pVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f80429d = abstractC8905a;
            this.f80430e = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f80429d, this.f80430e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            AbstractC8905a<se0.c> abstractC8905a = this.f80429d;
            se0.c f7 = abstractC8905a.f();
            p pVar = this.f80430e;
            f7.a(pVar);
            abstractC8905a.g(pVar);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8906b(AbstractC8905a abstractC8905a, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f80428f = abstractC8905a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C8906b c8906b = new C8906b(this.f80428f, dVar);
        c8906b.f80427e = obj;
        return c8906b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(p pVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C8906b) create(pVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f80426d;
        if (i11 == 0) {
            s.b(obj);
            p pVar = (p) this.f80427e;
            C10720e0 c10720e0 = C10720e0.f105451a;
            L0 x11 = De.s.f6650a.x();
            a aVar2 = new a(this.f80428f, pVar, null);
            this.f80426d = 1;
            if (C10727i.f(x11, aVar2, this) == aVar) {
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
}

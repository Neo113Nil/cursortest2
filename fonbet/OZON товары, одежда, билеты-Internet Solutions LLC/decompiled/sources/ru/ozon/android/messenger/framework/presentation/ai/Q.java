package ru.ozon.android.messenger.framework.presentation.ai;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.InterfaceC3978p0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.chatdetail.j;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantScreenKt$AiAssistantScreen$1$2$1", f = "AiAssistantScreen.kt", l = {119}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class Q extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89331d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89332e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f89333f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function1<Map<String, ? extends Object>, Unit> f89334g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f89335h;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f89336a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Map<String, ? extends Object>, Unit> f89337b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<Boolean> f89338c;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function0<Unit> function0, Function1<? super Map<String, ? extends Object>, Unit> function1, InterfaceC3978p0<Boolean> interfaceC3978p0) {
            this.f89336a = function0;
            this.f89337b = function1;
            this.f89338c = interfaceC3978p0;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            ru.ozon.android.messenger.framework.presentation.chatdetail.j jVar = (ru.ozon.android.messenger.framework.presentation.chatdetail.j) obj;
            if (Intrinsics.d(jVar, j.C1661j.f89878a) || (jVar instanceof j.i)) {
                int i11 = U.f89357b;
                this.f89338c.setValue(Boolean.TRUE);
            } else if (jVar instanceof j.s) {
                this.f89336a.invoke();
            } else if (jVar instanceof j.b) {
                this.f89337b.invoke(((j.b) jVar).a());
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Q(C9414c0 c9414c0, Function0<Unit> function0, Function1<? super Map<String, ? extends Object>, Unit> function1, InterfaceC3978p0<Boolean> interfaceC3978p0, kotlin.coroutines.d<? super Q> dVar) {
        super(2, dVar);
        this.f89332e = c9414c0;
        this.f89333f = function0;
        this.f89334g = function1;
        this.f89335h = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new Q(this.f89332e, this.f89333f, this.f89334g, this.f89335h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((Q) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89331d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.chatdetail.j> P02 = this.f89332e.P0();
            a aVar2 = new a(this.f89333f, this.f89334g, this.f89335h);
            this.f89331d = 1;
            if (P02.collect(aVar2, this) == aVar) {
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

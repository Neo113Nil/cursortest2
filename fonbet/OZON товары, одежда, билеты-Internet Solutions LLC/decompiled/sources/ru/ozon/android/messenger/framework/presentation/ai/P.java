package ru.ozon.android.messenger.framework.presentation.ai;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.n1;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import v0.InterfaceC10174n;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantScreenKt$AiAssistantScreen$1$1$1", f = "AiAssistantScreen.kt", l = {114}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class P extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89323d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f89324e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ v0.I f89325f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ float f89326g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function1<Boolean, Unit> f89327h;

    static final class a extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0.I f89328b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f89329c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v0.I i11, float f7) {
            super(0);
            this.f89328b = i11;
            this.f89329c = f7;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        
            if (r1 <= r6.f89329c) goto L14;
         */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke() {
            v0.y t2 = this.f89328b.t();
            List<InterfaceC10174n> g10 = t2.g();
            if (g10.isEmpty()) {
                return Boolean.FALSE;
            }
            boolean z11 = true;
            int d11 = t2.d() - 1;
            InterfaceC10174n interfaceC10174n = (InterfaceC10174n) C7714v.X(g10);
            if (interfaceC10174n.getIndex() >= d11) {
                int size = (interfaceC10174n.getSize() + interfaceC10174n.getOffset()) - (t2.h() - t2.b());
                if (size < 0) {
                    size = 0;
                }
            }
            z11 = false;
            return Boolean.valueOf(z11);
        }
    }

    static final class b<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f89330a;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super Boolean, Unit> function1) {
            this.f89330a = function1;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            this.f89330a.invoke(bool);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    P(boolean z11, v0.I i11, float f7, Function1<? super Boolean, Unit> function1, kotlin.coroutines.d<? super P> dVar) {
        super(2, dVar);
        this.f89324e = z11;
        this.f89325f = i11;
        this.f89326g = f7;
        this.f89327h = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new P(this.f89324e, this.f89325f, this.f89326g, this.f89327h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((P) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89323d;
        if (i11 == 0) {
            Sc.s.b(obj);
            if (!this.f89324e) {
                return Unit.f71690a;
            }
            InterfaceC2395h o11 = C2399j.o(n1.m(new a(this.f89325f, this.f89326g)));
            b bVar = new b(this.f89327h);
            this.f89323d = 1;
            if (o11.collect(bVar, this) == aVar) {
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

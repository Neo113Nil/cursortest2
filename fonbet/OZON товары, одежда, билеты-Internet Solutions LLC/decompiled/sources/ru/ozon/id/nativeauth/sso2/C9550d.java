package ru.ozon.id.nativeauth.sso2;

import Hb0.f;
import Sc.InterfaceC4008j;
import We.L;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2CheckDomainNetworkInterceptor$trackErrorsIfAny$1", f = "Sso2CheckDomainNetworkInterceptor.kt", l = {76, 80}, m = "invokeSuspend")
/* renamed from: ru.ozon.id.nativeauth.sso2.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C9550d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f97386d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f97387e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9549c f97388f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ L f97389g;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2CheckDomainNetworkInterceptor$trackErrorsIfAny$1$1", f = "Sso2CheckDomainNetworkInterceptor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.id.nativeauth.sso2.d$a */
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C9549c f97390d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ L f97391e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C9549c c9549c, L l11, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f97390d = c9549c;
            this.f97391e = l11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f97390d, this.f97391e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            C9549c.c(this.f97390d, this.f97391e);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2CheckDomainNetworkInterceptor$trackErrorsIfAny$1$2", f = "Sso2CheckDomainNetworkInterceptor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.id.nativeauth.sso2.d$b */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C9549c f97392d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C9549c c9549c, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f97392d = c9549c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f97392d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC4008j interfaceC4008j;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            interfaceC4008j = this.f97392d.f97379h;
            ((hd0.b) interfaceC4008j.getValue()).d(true);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2CheckDomainNetworkInterceptor$trackErrorsIfAny$1$3", f = "Sso2CheckDomainNetworkInterceptor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.id.nativeauth.sso2.d$c */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C9549c f97393d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ L f97394e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C9549c c9549c, L l11, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f97393d = c9549c;
            this.f97394e = l11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f97393d, this.f97394e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            C9549c.b(this.f97393d, this.f97394e);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9550d(C9549c c9549c, L l11, kotlin.coroutines.d<? super C9550d> dVar) {
        super(2, dVar);
        this.f97388f = c9549c;
        this.f97389g = l11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C9550d c9550d = new C9550d(this.f97388f, this.f97389g, dVar);
        c9550d.f97387e = obj;
        return c9550d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9550d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0076  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        M m11;
        InterfaceC4008j interfaceC4008j2;
        M m12;
        boolean booleanValue;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f97386d;
        C9549c c9549c = this.f97388f;
        if (i11 == 0) {
            Sc.s.b(obj);
            M m13 = (M) this.f97387e;
            interfaceC4008j = c9549c.f97376e;
            hd0.i iVar = (hd0.i) interfaceC4008j.getValue();
            this.f97387e = m13;
            this.f97386d = 1;
            Object f7 = iVar.f(this);
            if (f7 != aVar) {
                m11 = m13;
                obj = f7;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m12 = (M) this.f97387e;
            Sc.s.b(obj);
            booleanValue = ((Boolean) obj).booleanValue();
            L l11 = this.f97389g;
            if (booleanValue) {
                C10727i.c(m12, null, null, new a(c9549c, l11, null), 3);
                C10727i.c(m12, null, null, new b(c9549c, null), 3);
            }
            C10727i.c(m12, null, null, new c(c9549c, l11, null), 3);
            return Unit.f71690a;
        }
        m11 = (M) this.f97387e;
        Sc.s.b(obj);
        Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO = (Sso2MobileConfigResponseDTO) obj;
        if (!(sso2MobileConfigResponseDTO != null ? sso2MobileConfigResponseDTO.getLogsEnabled() : true)) {
            return Unit.f71690a;
        }
        interfaceC4008j2 = c9549c.f97380i;
        Hb0.c cVar = (Hb0.c) interfaceC4008j2.getValue();
        f.o oVar = f.o.f10813a;
        this.f97387e = m11;
        this.f97386d = 2;
        obj = cVar.a(oVar, this);
        if (obj != aVar) {
            m12 = m11;
            booleanValue = ((Boolean) obj).booleanValue();
            L l112 = this.f97389g;
            if (booleanValue) {
            }
            C10727i.c(m12, null, null, new c(c9549c, l112, null), 3);
            return Unit.f71690a;
        }
        return aVar;
    }
}

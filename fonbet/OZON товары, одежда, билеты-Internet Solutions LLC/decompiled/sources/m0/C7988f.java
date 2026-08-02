package m0;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {419}, m = "invokeSuspend")
/* renamed from: m0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7988f extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    ze.j f73706d;

    /* renamed from: e, reason: collision with root package name */
    int f73707e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f73708f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ze.h<Object> f73709g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C7980b<Object, Object> f73710h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f73711i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f73712j;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", l = {428}, m = "invokeSuspend")
    /* renamed from: m0.f$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f73713d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f73714e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C7980b<Object, Object> f73715f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f73716g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f73717h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, C7980b c7980b, InterfaceC3978p0 interfaceC3978p0, InterfaceC3978p0 interfaceC3978p02, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f73714e = obj;
            this.f73715f = c7980b;
            this.f73716g = interfaceC3978p0;
            this.f73717h = interfaceC3978p02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f73714e, this.f73715f, this.f73716g, this.f73717h, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f73713d;
            C7980b<Object, Object> c7980b = this.f73715f;
            if (i11 == 0) {
                Sc.s.b(obj);
                if (Intrinsics.d(this.f73714e, c7980b.i())) {
                    return Unit.f71690a;
                }
                int i12 = C7990g.f73755c;
                InterfaceC8002m interfaceC8002m = (InterfaceC8002m) this.f73716g.getValue();
                this.f73713d = 1;
                aVar = this;
                if (C7980b.f(this.f73715f, this.f73714e, interfaceC8002m, null, aVar, 12) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                aVar = this;
            }
            int i13 = C7990g.f73755c;
            Function1 function1 = (Function1) aVar.f73717h.getValue();
            if (function1 != null) {
                function1.invoke(c7980b.k());
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7988f(ze.h hVar, C7980b c7980b, InterfaceC3978p0 interfaceC3978p0, InterfaceC3978p0 interfaceC3978p02, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f73709g = hVar;
        this.f73710h = c7980b;
        this.f73711i = interfaceC3978p0;
        this.f73712j = interfaceC3978p02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C7988f c7988f = new C7988f(this.f73709g, this.f73710h, this.f73711i, this.f73712j, dVar);
        c7988f.f73708f = obj;
        return c7988f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7988f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:5:0x0036). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        ze.j<Object> it;
        xe.M m11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f73707e;
        ze.h<Object> hVar = this.f73709g;
        if (i11 == 0) {
            Sc.s.b(obj);
            xe.M m12 = (xe.M) this.f73708f;
            it = hVar.iterator();
            m11 = m12;
            this.f73708f = m11;
            this.f73706d = it;
            this.f73707e = 1;
            obj = it.b(this);
            if (obj == aVar) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f73706d;
            m11 = (xe.M) this.f73708f;
            Sc.s.b(obj);
            if (((Boolean) obj).booleanValue()) {
                Object next = it.next();
                Object d11 = ze.l.d(hVar.e());
                Object obj2 = d11 == null ? next : d11;
                C10727i.c(m11, null, null, new a(obj2, this.f73710h, this.f73711i, this.f73712j, null), 3);
                this.f73708f = m11;
                this.f73706d = it;
                this.f73707e = 1;
                obj = it.b(this);
                if (obj == aVar) {
                    return aVar;
                }
                if (((Boolean) obj).booleanValue()) {
                    return Unit.f71690a;
                }
            }
        }
    }
}

package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {782}, m = "invokeSuspend")
/* renamed from: r0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9112M extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC9141u, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    C9113N f82411d;

    /* renamed from: e, reason: collision with root package name */
    kotlin.jvm.internal.L f82412e;

    /* renamed from: f, reason: collision with root package name */
    long f82413f;

    /* renamed from: g, reason: collision with root package name */
    int f82414g;

    /* renamed from: h, reason: collision with root package name */
    private /* synthetic */ Object f82415h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C9113N f82416i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.L f82417j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ long f82418k;

    /* renamed from: r0.M$a */
    public static final class a implements InterfaceC9106G {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C9113N f82419a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC9141u f82420b;

        a(InterfaceC9141u interfaceC9141u, C9113N c9113n) {
            this.f82419a = c9113n;
            this.f82420b = interfaceC9141u;
        }

        @Override // r0.InterfaceC9106G
        public final float a(float f7) {
            C9113N c9113n = this.f82419a;
            return c9113n.r(c9113n.w(this.f82420b.a(2, c9113n.s(c9113n.x(f7)))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9112M(C9113N c9113n, kotlin.jvm.internal.L l11, long j11, kotlin.coroutines.d<? super C9112M> dVar) {
        super(2, dVar);
        this.f82416i = c9113n;
        this.f82417j = l11;
        this.f82418k = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C9112M c9112m = new C9112M(this.f82416i, this.f82417j, this.f82418k, dVar);
        c9112m.f82415h = obj;
        return c9112m;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC9141u interfaceC9141u, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9112M) create(interfaceC9141u, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        C9113N c9113n;
        InterfaceC9138r interfaceC9138r;
        kotlin.jvm.internal.L l11;
        long j11;
        C9113N c9113n2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f82414g;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC9141u interfaceC9141u = (InterfaceC9141u) this.f82415h;
            c9113n = this.f82416i;
            a aVar2 = new a(interfaceC9141u, c9113n);
            interfaceC9138r = c9113n.f82423c;
            kotlin.jvm.internal.L l12 = this.f82417j;
            long j12 = l12.f71786a;
            float r11 = c9113n.r(C9113N.l(c9113n, this.f82418k));
            this.f82415h = c9113n;
            this.f82411d = c9113n;
            this.f82412e = l12;
            this.f82413f = j12;
            this.f82414g = 1;
            obj = interfaceC9138r.a(aVar2, r11, this);
            if (obj == aVar) {
                return aVar;
            }
            l11 = l12;
            j11 = j12;
            c9113n2 = c9113n;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = this.f82413f;
            l11 = this.f82412e;
            c9113n = this.f82411d;
            c9113n2 = (C9113N) this.f82415h;
            Sc.s.b(obj);
        }
        l11.f71786a = C9113N.m(c9113n, j11, c9113n2.r(((Number) obj).floatValue()));
        return Unit.f71690a;
    }
}

package zendesk.talk.android.internal.call;

import Dj.r;
import Dj.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;
import zendesk.talk.android.internal.call.a;
import zendesk.talk.android.internal.call.e;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public List f68767a = new ArrayList();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Dj.d.values().length];
            try {
                iArr[Dj.d.f2819a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Dj.d.f2820b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Dj.d.f2822d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Dj.d.f2823e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Dj.d.f2824f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Dj.d.f2821c.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Dj.b.values().length];
            try {
                iArr2[Dj.b.f2813a.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Dj.b.f2814b.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Dj.b.f2815c.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final class b implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f68768a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f68769b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f68770c;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f68771a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f68772b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ r f68773c;

            /* renamed from: zendesk.talk.android.internal.call.d$b$a$a, reason: collision with other inner class name */
            public static final class C0992a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f68774n;

                /* renamed from: o, reason: collision with root package name */
                public int f68775o;

                public C0992a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f68774n = obj;
                    this.f68775o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC5322g interfaceC5322g, d dVar, r rVar) {
                this.f68771a = interfaceC5322g;
                this.f68772b = dVar;
                this.f68773c = rVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0992a c0992a;
                int i10;
                if (continuation instanceof C0992a) {
                    c0992a = (C0992a) continuation;
                    int i11 = c0992a.f68775o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0992a.f68775o = i11 - Integer.MIN_VALUE;
                        Object obj2 = c0992a.f68774n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c0992a.f68775o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC5322g interfaceC5322g = this.f68771a;
                            zendesk.talk.android.internal.call.a o10 = this.f68772b.o(this.f68773c, (Dj.d) obj);
                            c0992a.f68775o = 1;
                            if (interfaceC5322g.emit(o10, c0992a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                c0992a = new C0992a(continuation);
                Object obj22 = c0992a.f68774n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0992a.f68775o;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public b(InterfaceC5321f interfaceC5321f, d dVar, r rVar) {
            this.f68768a = interfaceC5321f;
            this.f68769b = dVar;
            this.f68770c = rVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f68768a.collect(new a(interfaceC5322g, this.f68769b, this.f68770c), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f68777n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f68778o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ r f68779p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r rVar, Continuation continuation) {
            super(2, continuation);
            this.f68779p = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(this.f68779p, continuation);
            cVar.f68778o = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            return ((c) create(interfaceC5322g, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f68777n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5322g interfaceC5322g = (InterfaceC5322g) this.f68778o;
                a.d dVar = new a.d(this.f68779p, 0L, false, 6, null);
                this.f68777n = 1;
                if (interfaceC5322g.emit(dVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final zendesk.talk.android.internal.call.a i(a.AbstractC0988a.c cVar, r call, zendesk.talk.android.internal.call.a aVar) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        call.disconnect();
        return cVar;
    }

    public static final zendesk.talk.android.internal.call.a j(d dVar, r call, zendesk.talk.android.internal.call.a state) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(state, "state");
        return zendesk.talk.android.internal.call.c.b(state, 0L, dVar.t(call), 1, null);
    }

    public static final zendesk.talk.android.internal.call.a k(d dVar, r call, zendesk.talk.android.internal.call.a state) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(state, "state");
        dVar.s(call);
        return state;
    }

    public static final zendesk.talk.android.internal.call.a l(e eVar, r call, zendesk.talk.android.internal.call.a state) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(state, "state");
        call.a(((e.a) eVar).a());
        return state;
    }

    public final zendesk.talk.android.internal.call.a f(r rVar) {
        r rVar2;
        a.AbstractC0988a.c cVar = null;
        for (e eVar : this.f68767a) {
            if (Intrinsics.areEqual(eVar, e.b.f68781a)) {
                rVar.disconnect();
                rVar2 = rVar;
                cVar = new a.AbstractC0988a.c(rVar2, 0L, false, 4, null);
            } else {
                rVar2 = rVar;
                if (Intrinsics.areEqual(eVar, e.d.f68783a)) {
                    t(rVar2);
                } else if (Intrinsics.areEqual(eVar, e.c.f68782a)) {
                    s(rVar2);
                } else {
                    if (!(eVar instanceof e.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rVar2.a(((e.a) eVar).a());
                }
            }
            rVar = rVar2;
        }
        this.f68767a.clear();
        return cVar;
    }

    public final zendesk.talk.android.internal.call.a g(zendesk.talk.android.internal.call.a aVar, zendesk.talk.android.internal.call.a aVar2, e eVar, Function2 function2) {
        r a10 = aVar.a();
        if (a10 != null) {
            return (zendesk.talk.android.internal.call.a) function2.invoke(a10, aVar);
        }
        this.f68767a.add(eVar);
        return aVar2;
    }

    public final zendesk.talk.android.internal.call.a h(final e eVar, zendesk.talk.android.internal.call.a aVar) {
        r a10 = aVar.a();
        if (Intrinsics.areEqual(eVar, e.b.f68781a)) {
            final a.AbstractC0988a.c cVar = new a.AbstractC0988a.c(a10, aVar.c(), aVar.b());
            return g(aVar, cVar, eVar, new Function2() { // from class: Fj.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    zendesk.talk.android.internal.call.a i10;
                    i10 = zendesk.talk.android.internal.call.d.i(a.AbstractC0988a.c.this, (Dj.r) obj, (zendesk.talk.android.internal.call.a) obj2);
                    return i10;
                }
            });
        }
        if (Intrinsics.areEqual(eVar, e.d.f68783a)) {
            return g(aVar, aVar, eVar, new Function2() { // from class: Fj.x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    zendesk.talk.android.internal.call.a j10;
                    j10 = zendesk.talk.android.internal.call.d.j(zendesk.talk.android.internal.call.d.this, (Dj.r) obj, (zendesk.talk.android.internal.call.a) obj2);
                    return j10;
                }
            });
        }
        if (Intrinsics.areEqual(eVar, e.c.f68782a)) {
            return g(aVar, aVar, eVar, new Function2() { // from class: Fj.y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    zendesk.talk.android.internal.call.a k10;
                    k10 = zendesk.talk.android.internal.call.d.k(zendesk.talk.android.internal.call.d.this, (Dj.r) obj, (zendesk.talk.android.internal.call.a) obj2);
                    return k10;
                }
            });
        }
        if (eVar instanceof e.a) {
            return g(aVar, aVar, eVar, new Function2() { // from class: Fj.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    zendesk.talk.android.internal.call.a l10;
                    l10 = zendesk.talk.android.internal.call.d.l(zendesk.talk.android.internal.call.e.this, (Dj.r) obj, (zendesk.talk.android.internal.call.a) obj2);
                    return l10;
                }
            });
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC5321f m(s inputState) {
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        if (!(inputState instanceof s.b)) {
            if (inputState instanceof s.a) {
                return AbstractC5323h.z(new a.b.C0990a(null, 0L, false, 6, null));
            }
            throw new NoWhenBranchMatchedException();
        }
        s.b bVar = (s.b) inputState;
        zendesk.talk.android.internal.call.a f10 = f(bVar.c());
        if (f10 == null) {
            f10 = new a.d(bVar.c(), 0L, false, 6, null);
        }
        return n(f10, bVar.b());
    }

    public final InterfaceC5321f n(zendesk.talk.android.internal.call.a aVar, InterfaceC5321f interfaceC5321f) {
        return aVar instanceof a.d ? r(interfaceC5321f, ((a.d) aVar).a()) : aVar instanceof a.c ? r(interfaceC5321f, ((a.c) aVar).a()) : AbstractC5323h.z(aVar);
    }

    public final zendesk.talk.android.internal.call.a o(r rVar, Dj.d dVar) {
        switch (a.$EnumSwitchMapping$0[dVar.ordinal()]) {
            case 1:
                return new a.c(rVar, 0L, false, 6, null);
            case 2:
                return new a.AbstractC0988a.b(rVar, 0L, false, 6, null);
            case 3:
                return new a.b.C0991b(rVar, 0L, false, 6, null);
            case 4:
                return new a.d(rVar, 0L, false, 6, null);
            case 5:
                return new a.c(rVar, 0L, false, 6, null);
            case 6:
                return new a.AbstractC0988a.C0989a(rVar, 0L, false, 6, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final zendesk.talk.android.internal.call.a p(zendesk.talk.android.internal.call.a previousState, e viewAction) {
        Intrinsics.checkNotNullParameter(previousState, "previousState");
        Intrinsics.checkNotNullParameter(viewAction, "viewAction");
        return h(viewAction, previousState);
    }

    public final zendesk.talk.android.internal.call.a q(zendesk.talk.android.internal.call.a state, boolean z10) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!z10) {
            return state;
        }
        r a10 = state.a();
        if (a10 != null) {
            a10.disconnect();
        }
        return new a.AbstractC0988a.c(state.a(), state.c(), state.b());
    }

    public final InterfaceC5321f r(InterfaceC5321f interfaceC5321f, r rVar) {
        return AbstractC5323h.G(new b(AbstractC5323h.k(interfaceC5321f), this, rVar), new c(rVar, null));
    }

    public final void s(r rVar) {
        Dj.b bVar;
        int i10 = a.$EnumSwitchMapping$1[rVar.b().ordinal()];
        if (i10 == 1) {
            bVar = Dj.b.f2814b;
        } else if (i10 == 2) {
            bVar = Dj.b.f2813a;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = Dj.b.f2815c;
        }
        rVar.a(bVar);
    }

    public final boolean t(r rVar) {
        boolean z10 = !rVar.c();
        rVar.mute(z10);
        return z10;
    }
}

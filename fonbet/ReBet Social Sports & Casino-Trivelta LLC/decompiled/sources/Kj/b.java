package Kj;

import Dj.a;
import Dj.s;
import Fj.C1158d;
import Ph.P;
import Ph.Q;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.C;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.I;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;
import kotlinx.coroutines.flow.N;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.x;
import kotlinx.coroutines.flow.y;
import zendesk.talk.android.internal.call.a;
import zendesk.talk.android.internal.call.e;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: l, reason: collision with root package name */
    public static final a f6663l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    public static final List f6664m = CollectionsKt.listOf((Object[]) new Dj.a[]{new a.c(false), new a.b(true)});

    /* renamed from: a, reason: collision with root package name */
    public final Dj.q f6665a;

    /* renamed from: b, reason: collision with root package name */
    public final zendesk.talk.android.internal.call.d f6666b;

    /* renamed from: c, reason: collision with root package name */
    public final zendesk.talk.android.internal.call.b f6667c;

    /* renamed from: d, reason: collision with root package name */
    public final C1158d f6668d;

    /* renamed from: e, reason: collision with root package name */
    public final Jj.d f6669e;

    /* renamed from: f, reason: collision with root package name */
    public final Ej.j f6670f;

    /* renamed from: g, reason: collision with root package name */
    public final x f6671g;

    /* renamed from: h, reason: collision with root package name */
    public final y f6672h;

    /* renamed from: i, reason: collision with root package name */
    public final y f6673i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC5321f f6674j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC5321f f6675k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return b.f6664m;
        }

        public a() {
        }
    }

    /* renamed from: Kj.b$b, reason: collision with other inner class name */
    public static final class C0140b extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f6676n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f6677o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ boolean f6678p;

        public C0140b(Continuation continuation) {
            super(3, continuation);
        }

        public final Object i(zendesk.talk.android.internal.call.a aVar, boolean z10, Continuation continuation) {
            C0140b c0140b = b.this.new C0140b(continuation);
            c0140b.f6677o = aVar;
            c0140b.f6678p = z10;
            return c0140b.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((zendesk.talk.android.internal.call.a) obj, ((Boolean) obj2).booleanValue(), (Continuation) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6676n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return b.this.f6666b.q((zendesk.talk.android.internal.call.a) this.f6677o, this.f6678p);
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f6680n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f6681o;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(continuation);
            cVar.f6681o = obj;
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
            int i10 = this.f6680n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5322g interfaceC5322g = (InterfaceC5322g) this.f6681o;
                Boolean boxBoolean = Boxing.boxBoolean(false);
                this.f6680n = 1;
                if (interfaceC5322g.emit(boxBoolean, this) == coroutine_suspended) {
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

    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f6682n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f6683o;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Dj.c f6685q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Dj.c cVar, Continuation continuation) {
            super(2, continuation);
            this.f6685q = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = b.this.new d(this.f6685q, continuation);
            dVar.f6683o = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            return ((d) create(interfaceC5322g, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC5322g interfaceC5322g;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f6682n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                interfaceC5322g = (InterfaceC5322g) this.f6683o;
                Dj.q qVar = b.this.f6665a;
                Dj.c cVar = this.f6685q;
                this.f6683o = interfaceC5322g;
                this.f6682n = 1;
                obj = qVar.b(cVar, this);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                interfaceC5322g = (InterfaceC5322g) this.f6683o;
                ResultKt.throwOnFailure(obj);
            }
            this.f6683o = null;
            this.f6682n = 2;
        }
    }

    public static final class e extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f6686n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f6687o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f6688p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f6689q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ b f6690r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Continuation continuation, InterfaceC5321f interfaceC5321f, b bVar) {
            super(3, continuation);
            this.f6689q = interfaceC5321f;
            this.f6690r = bVar;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5322g interfaceC5322g, Object obj, Continuation continuation) {
            e eVar = new e(continuation, this.f6689q, this.f6690r);
            eVar.f6687o = interfaceC5322g;
            eVar.f6688p = obj;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f6686n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5322g interfaceC5322g = (InterfaceC5322g) this.f6687o;
                InterfaceC5321f J10 = AbstractC5323h.J(this.f6689q, (zendesk.talk.android.internal.call.a) this.f6688p, this.f6690r.new f(null));
                this.f6686n = 1;
                if (AbstractC5323h.p(interfaceC5322g, J10, this) == coroutine_suspended) {
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

    public static final class f extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f6691n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f6692o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f6693p;

        public f(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zendesk.talk.android.internal.call.a aVar, zendesk.talk.android.internal.call.e eVar, Continuation continuation) {
            f fVar = b.this.new f(continuation);
            fVar.f6692o = aVar;
            fVar.f6693p = eVar;
            return fVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6691n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return b.this.f6666b.p((zendesk.talk.android.internal.call.a) this.f6692o, (zendesk.talk.android.internal.call.e) this.f6693p);
        }
    }

    public static final class g extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f6695n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f6696o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f6697p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ b f6698q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Continuation continuation, b bVar) {
            super(3, continuation);
            this.f6698q = bVar;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5322g interfaceC5322g, Object obj, Continuation continuation) {
            g gVar = new g(continuation, this.f6698q);
            gVar.f6696o = interfaceC5322g;
            gVar.f6697p = obj;
            return gVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f6695n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5322g interfaceC5322g = (InterfaceC5322g) this.f6696o;
                InterfaceC5321f m10 = this.f6698q.f6666b.m((s) this.f6697p);
                this.f6695n = 1;
                if (AbstractC5323h.p(interfaceC5322g, m10, this) == coroutine_suspended) {
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

    public static final class h extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f6699n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f6700o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f6701p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ b f6702q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Continuation continuation, b bVar) {
            super(3, continuation);
            this.f6702q = bVar;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5322g interfaceC5322g, Object obj, Continuation continuation) {
            h hVar = new h(continuation, this.f6702q);
            hVar.f6700o = interfaceC5322g;
            hVar.f6701p = obj;
            return hVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f6699n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5322g interfaceC5322g = (InterfaceC5322g) this.f6700o;
                InterfaceC5321f j10 = this.f6702q.j((s) this.f6701p);
                this.f6699n = 1;
                if (AbstractC5323h.p(interfaceC5322g, j10, this) == coroutine_suspended) {
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

    public static final class i implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f6703a;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f6704a;

            /* renamed from: Kj.b$i$a$a, reason: collision with other inner class name */
            public static final class C0141a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f6705n;

                /* renamed from: o, reason: collision with root package name */
                public int f6706o;

                public C0141a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f6705n = obj;
                    this.f6706o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC5322g interfaceC5322g) {
                this.f6704a = interfaceC5322g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0141a c0141a;
                int i10;
                if (continuation instanceof C0141a) {
                    c0141a = (C0141a) continuation;
                    int i11 = c0141a.f6706o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0141a.f6706o = i11 - Integer.MIN_VALUE;
                        Object obj2 = c0141a.f6705n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c0141a.f6706o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC5322g interfaceC5322g = this.f6704a;
                            Unit unit = Unit.INSTANCE;
                            c0141a.f6706o = 1;
                            if (interfaceC5322g.emit(unit, c0141a) == coroutine_suspended) {
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
                c0141a = new C0141a(continuation);
                Object obj22 = c0141a.f6705n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0141a.f6706o;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public i(InterfaceC5321f interfaceC5321f) {
            this.f6703a = interfaceC5321f;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f6703a.collect(new a(interfaceC5322g), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public static final class j extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f6708n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f6709o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f6710p;

        public j(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zendesk.talk.android.internal.call.a aVar, List list, Continuation continuation) {
            j jVar = new j(continuation);
            jVar.f6709o = aVar;
            jVar.f6710p = list;
            return jVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6708n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return TuplesKt.to((zendesk.talk.android.internal.call.a) this.f6709o, (List) this.f6710p);
        }
    }

    public static final class k extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f6711n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f6712o;

        public k(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            k kVar = b.this.new k(continuation);
            kVar.f6712o = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Pair pair, Continuation continuation) {
            return ((k) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6711n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.f6712o;
            b.this.f6672h.setValue(pair.getFirst());
            b.this.f6673i.setValue(pair.getSecond());
            return Unit.INSTANCE;
        }
    }

    public static final class l extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f6714n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ P f6715o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(P p10, Continuation continuation) {
            super(3, continuation);
            this.f6715o = p10;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5322g interfaceC5322g, Throwable th2, Continuation continuation) {
            return new l(this.f6715o, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6714n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Q.f(this.f6715o, null, 1, null);
            return Unit.INSTANCE;
        }
    }

    public static final class m extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f6716n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f6717o;

        public m(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            m mVar = new m(continuation);
            mVar.f6717o = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            return ((m) create(interfaceC5322g, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f6716n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5322g interfaceC5322g = (InterfaceC5322g) this.f6717o;
                List a10 = b.f6663l.a();
                this.f6716n = 1;
                if (interfaceC5322g.emit(a10, this) == coroutine_suspended) {
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

    public static final class n extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f6718n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f6719o;

        public n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = new n(continuation);
            nVar.f6719o = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            return ((n) create(interfaceC5322g, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f6718n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5322g interfaceC5322g = (InterfaceC5322g) this.f6719o;
                a.d dVar = new a.d(null, 0L, false, 7, null);
                this.f6718n = 1;
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

    public static final class o implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f6720a;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f6721a;

            /* renamed from: Kj.b$o$a$a, reason: collision with other inner class name */
            public static final class C0142a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f6722n;

                /* renamed from: o, reason: collision with root package name */
                public int f6723o;

                public C0142a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f6722n = obj;
                    this.f6723o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC5322g interfaceC5322g) {
                this.f6721a = interfaceC5322g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0142a c0142a;
                int i10;
                if (continuation instanceof C0142a) {
                    c0142a = (C0142a) continuation;
                    int i11 = c0142a.f6723o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0142a.f6723o = i11 - Integer.MIN_VALUE;
                        Object obj2 = c0142a.f6722n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c0142a.f6723o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC5322g interfaceC5322g = this.f6721a;
                            if (!(((zendesk.talk.android.internal.call.a) obj) instanceof a.d)) {
                                c0142a.f6723o = 1;
                                if (interfaceC5322g.emit(obj, c0142a) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
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
                c0142a = new C0142a(continuation);
                Object obj22 = c0142a.f6722n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0142a.f6723o;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public o(InterfaceC5321f interfaceC5321f) {
            this.f6720a = interfaceC5321f;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f6720a.collect(new a(interfaceC5322g), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public static final class p extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f6725n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f6726o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f6727p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ b f6728q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Continuation continuation, b bVar) {
            super(3, continuation);
            this.f6728q = bVar;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5322g interfaceC5322g, Object obj, Continuation continuation) {
            p pVar = new p(continuation, this.f6728q);
            pVar.f6726o = interfaceC5322g;
            pVar.f6727p = obj;
            return pVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f6725n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5322g interfaceC5322g = (InterfaceC5322g) this.f6726o;
                InterfaceC5321f b10 = this.f6728q.f6668d.b();
                this.f6725n = 1;
                if (AbstractC5323h.p(interfaceC5322g, b10, this) == coroutine_suspended) {
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

    public static final class q extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f6729n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f6730o;

        public q(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            q qVar = new q(continuation);
            qVar.f6730o = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            return ((q) create(interfaceC5322g, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f6729n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5322g interfaceC5322g = (InterfaceC5322g) this.f6730o;
                Long boxLong = Boxing.boxLong(0L);
                this.f6729n = 1;
                if (interfaceC5322g.emit(boxLong, this) == coroutine_suspended) {
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

    public static final class r extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f6731n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f6732o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ long f6733p;

        public r(Continuation continuation) {
            super(3, continuation);
        }

        public final Object i(zendesk.talk.android.internal.call.a aVar, long j10, Continuation continuation) {
            r rVar = new r(continuation);
            rVar.f6732o = aVar;
            rVar.f6733p = j10;
            return rVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((zendesk.talk.android.internal.call.a) obj, ((Number) obj2).longValue(), (Continuation) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6731n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return zendesk.talk.android.internal.call.c.b((zendesk.talk.android.internal.call.a) this.f6732o, this.f6733p, false, 2, null);
        }
    }

    public b(Dj.q talk, zendesk.talk.android.internal.call.d processor, zendesk.talk.android.internal.call.b distinctChecker, C1158d callStopwatch, Jj.d gsmStateProvider, Ej.j coroutinesDispatchers) {
        Intrinsics.checkNotNullParameter(talk, "talk");
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(distinctChecker, "distinctChecker");
        Intrinsics.checkNotNullParameter(callStopwatch, "callStopwatch");
        Intrinsics.checkNotNullParameter(gsmStateProvider, "gsmStateProvider");
        Intrinsics.checkNotNullParameter(coroutinesDispatchers, "coroutinesDispatchers");
        this.f6665a = talk;
        this.f6666b = processor;
        this.f6667c = distinctChecker;
        this.f6668d = callStopwatch;
        this.f6669e = gsmStateProvider;
        this.f6670f = coroutinesDispatchers;
        this.f6671g = E.b(1, 0, null, 6, null);
        y a10 = N.a(new a.d(null, 0L, false, 7, null));
        this.f6672h = a10;
        y a11 = N.a(f6664m);
        this.f6673i = a11;
        this.f6674j = AbstractC5323h.l(a10, new Function2() { // from class: Kj.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                boolean v10;
                v10 = b.v(b.this, (zendesk.talk.android.internal.call.a) obj, (zendesk.talk.android.internal.call.a) obj2);
                return Boolean.valueOf(v10);
            }
        });
        this.f6675k = a11;
    }

    public static final boolean v(b bVar, zendesk.talk.android.internal.call.a old, zendesk.talk.android.internal.call.a aVar) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(aVar, "new");
        return bVar.f6667c.a(old, aVar);
    }

    public final InterfaceC5321f j(s sVar) {
        return sVar instanceof s.b ? ((s.b) sVar).a() : AbstractC5323h.z(CollectionsKt.emptyList());
    }

    public final void k(Dj.b audioOutput) {
        Intrinsics.checkNotNullParameter(audioOutput, "audioOutput");
        this.f6671g.a(new e.a(audioOutput));
    }

    public final InterfaceC5321f l(InterfaceC5321f interfaceC5321f) {
        return AbstractC5323h.y(interfaceC5321f, AbstractC5323h.G(this.f6669e.d(), new c(null)), new C0140b(null));
    }

    public final InterfaceC5321f m(Dj.c cVar) {
        return AbstractC5323h.x(new d(cVar, null));
    }

    public final void n() {
        this.f6671g.a(e.b.f68781a);
    }

    public final InterfaceC5321f o(InterfaceC5321f interfaceC5321f, InterfaceC5321f interfaceC5321f2) {
        return AbstractC5323h.O(interfaceC5321f, new e(null, interfaceC5321f2, this));
    }

    public final InterfaceC5321f p() {
        return this.f6675k;
    }

    public final zendesk.talk.android.internal.call.a q() {
        return (zendesk.talk.android.internal.call.a) this.f6672h.getValue();
    }

    public final InterfaceC5321f r() {
        return this.f6674j;
    }

    public final boolean s() {
        Iterable iterable = (Iterable) this.f6673i.getValue();
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((Dj.a) it.next()) instanceof a.C0059a) {
                return true;
            }
        }
        return false;
    }

    public final InterfaceC5321f t(String digitalLine, Dj.p pVar) {
        C f10;
        C f11;
        C f12;
        Intrinsics.checkNotNullParameter(digitalLine, "digitalLine");
        P a10 = Q.a(this.f6670f.b());
        C a11 = AbstractC5323h.a(this.f6671g);
        InterfaceC5321f m10 = m(new Dj.c(digitalLine, pVar));
        I.a aVar = I.f54641a;
        f10 = u.f(m10, a10, aVar.b(), 0, 4, null);
        f11 = u.f(AbstractC5323h.G(AbstractC5323h.O(f10, new g(null, this)), new n(null)), a10, aVar.b(), 0, 4, null);
        InterfaceC5321f G10 = AbstractC5323h.G(AbstractC5323h.O(f10, new h(null, this)), new m(null));
        f12 = u.f(l(o(f11, a11)), a10, aVar.b(), 0, 4, null);
        return new i(AbstractC5323h.E(AbstractC5323h.F(AbstractC5323h.y(y(f12), G10, new j(null)), new k(null)), new l(a10, null)));
    }

    public final InterfaceC5321f u(InterfaceC5321f interfaceC5321f) {
        return AbstractC5323h.G(AbstractC5323h.O(AbstractC5323h.M(new o(interfaceC5321f), 1), new p(null, this)), new q(null));
    }

    public final void w() {
        this.f6671g.a(e.c.f68782a);
    }

    public final void x() {
        this.f6671g.a(e.d.f68783a);
    }

    public final InterfaceC5321f y(InterfaceC5321f interfaceC5321f) {
        return AbstractC5323h.y(interfaceC5321f, u(interfaceC5321f), new r(null));
    }
}

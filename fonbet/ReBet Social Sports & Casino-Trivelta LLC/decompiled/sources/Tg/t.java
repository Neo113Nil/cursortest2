package Tg;

import Ph.Q;
import ah.AbstractC2026s;
import bh.AbstractC2423b;
import ch.C2924a;
import gh.AbstractC4384e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: c, reason: collision with root package name */
    public static final d f11947c = new d(null);

    /* renamed from: d, reason: collision with root package name */
    public static final C2924a f11948d = new C2924a("HttpSend");

    /* renamed from: a, reason: collision with root package name */
    public final int f11949a;

    /* renamed from: b, reason: collision with root package name */
    public final List f11950b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f11951a = 20;

        public final int a() {
            return this.f11951a;
        }
    }

    public static final class b implements z {

        /* renamed from: a, reason: collision with root package name */
        public final int f11952a;

        /* renamed from: b, reason: collision with root package name */
        public final Ng.a f11953b;

        /* renamed from: c, reason: collision with root package name */
        public int f11954c;

        /* renamed from: d, reason: collision with root package name */
        public Og.b f11955d;

        public static final class a extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public Object f11956n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f11957o;

            /* renamed from: q, reason: collision with root package name */
            public int f11959q;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f11957o = obj;
                this.f11959q |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        public b(int i10, Ng.a client) {
            Intrinsics.checkNotNullParameter(client, "client");
            this.f11952a = i10;
            this.f11953b = client;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // Tg.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(Wg.c cVar, Continuation continuation) {
            a aVar;
            int i10;
            b bVar;
            Og.b bVar2;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f11959q;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f11959q = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f11957o;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f11959q;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        Og.b bVar3 = this.f11955d;
                        if (bVar3 != null) {
                            Q.f(bVar3, null, 1, null);
                        }
                        int i12 = this.f11954c;
                        if (i12 >= this.f11952a) {
                            throw new y("Max send count " + this.f11952a + " exceeded. Consider increasing the property maxSendCount if more is required.");
                        }
                        this.f11954c = i12 + 1;
                        Wg.h D02 = this.f11953b.D0();
                        Object d10 = cVar.d();
                        aVar.f11956n = this;
                        aVar.f11959q = 1;
                        obj = D02.d(cVar, d10, aVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        bVar = this;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (b) aVar.f11956n;
                        ResultKt.throwOnFailure(obj);
                    }
                    bVar2 = obj instanceof Og.b ? (Og.b) obj : null;
                    if (bVar2 == null) {
                        bVar.f11955d = bVar2;
                        return bVar2;
                    }
                    throw new IllegalStateException(("Failed to execute send pipeline. Expected [HttpClientCall], but received " + obj).toString());
                }
            }
            aVar = new a(continuation);
            Object obj2 = aVar.f11957o;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = aVar.f11959q;
            if (i10 != 0) {
            }
            if (obj2 instanceof Og.b) {
            }
            if (bVar2 == null) {
            }
        }
    }

    public static final class c implements z {

        /* renamed from: a, reason: collision with root package name */
        public final Function3 f11960a;

        /* renamed from: b, reason: collision with root package name */
        public final z f11961b;

        public c(Function3 interceptor, z nextSender) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            Intrinsics.checkNotNullParameter(nextSender, "nextSender");
            this.f11960a = interceptor;
            this.f11961b = nextSender;
        }

        @Override // Tg.z
        public Object a(Wg.c cVar, Continuation continuation) {
            return this.f11960a.invoke(this.f11961b, cVar, continuation);
        }
    }

    public static final class d implements k {

        public static final class a extends SuspendLambda implements Function3 {

            /* renamed from: n, reason: collision with root package name */
            public int f11962n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f11963o;

            /* renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f11964p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ t f11965q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ Ng.a f11966r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(t tVar, Ng.a aVar, Continuation continuation) {
                super(3, continuation);
                this.f11965q = tVar;
                this.f11966r = aVar;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC4384e abstractC4384e, Object obj, Continuation continuation) {
                a aVar = new a(this.f11965q, this.f11966r, continuation);
                aVar.f11963o = abstractC4384e;
                aVar.f11964p = obj;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x00aa, code lost:
            
                if (r1.e((Og.b) r11, r10) == r0) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x00ac, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
            
                if (r11 == r0) goto L21;
             */
            /* JADX WARN: Type inference failed for: r11v13, types: [T, Tg.t$b] */
            /* JADX WARN: Type inference failed for: r8v1, types: [T, Tg.t$c] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AbstractC4384e abstractC4384e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f11962n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    abstractC4384e = (AbstractC4384e) this.f11963o;
                    Object obj2 = this.f11964p;
                    if (!(obj2 instanceof AbstractC2423b)) {
                        throw new IllegalStateException(StringsKt.trimMargin$default("\n|Fail to prepare request body for sending. \n|The body type is: " + Reflection.getOrCreateKotlinClass(obj2.getClass()) + ", with Content-Type: " + AbstractC2026s.d((ah.r) abstractC4384e.b()) + ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header.", null, 1, null).toString());
                    }
                    Wg.c cVar = (Wg.c) abstractC4384e.b();
                    cVar.j(obj2);
                    cVar.k(null);
                    ?? bVar = new b(this.f11965q.f11949a, this.f11966r);
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = bVar;
                    IntProgression downTo = RangesKt.downTo(CollectionsKt.getLastIndex(this.f11965q.f11950b), 0);
                    t tVar = this.f11965q;
                    Iterator<Integer> it = downTo.iterator();
                    while (it.hasNext()) {
                        objectRef.element = new c((Function3) tVar.f11950b.get(((IntIterator) it).nextInt()), (z) objectRef.element);
                    }
                    z zVar = (z) objectRef.element;
                    Wg.c cVar2 = (Wg.c) abstractC4384e.b();
                    this.f11963o = abstractC4384e;
                    this.f11962n = 1;
                    obj = zVar.a(cVar2, this);
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    abstractC4384e = (AbstractC4384e) this.f11963o;
                    ResultKt.throwOnFailure(obj);
                }
                this.f11963o = null;
                this.f11962n = 2;
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Tg.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(t plugin, Ng.a scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.z0().l(Wg.f.f13260g.c(), new a(plugin, scope, null));
        }

        @Override // Tg.k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public t a(Function1 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            return new t(aVar.a(), null);
        }

        @Override // Tg.k
        public C2924a getKey() {
            return t.f11948d;
        }

        public d() {
        }
    }

    public /* synthetic */ t(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public final void d(Function3 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f11950b.add(block);
    }

    public t(int i10) {
        this.f11949a = i10;
        this.f11950b = new ArrayList();
    }
}

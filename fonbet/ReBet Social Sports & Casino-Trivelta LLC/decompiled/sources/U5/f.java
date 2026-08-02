package U5;

import I5.i;
import I5.p;
import L5.ScreenshotContext;
import Ph.AbstractC1455i;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import Ph.L;
import Ph.P;
import Ph.Q;
import Ph.X;
import U5.a;
import Wh.g;
import a6.C1921a;
import android.content.Context;
import android.graphics.Bitmap;
import c5.C2889b;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;
import r5.C6208b;
import r5.InterfaceC6207a;
import s5.C6339a;
import u5.C6523d;
import y5.C6854a;
import y5.C6855b;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: i, reason: collision with root package name */
    public static C1921a f12074i;

    /* renamed from: k, reason: collision with root package name */
    public static Y5.b f12076k;

    /* renamed from: m, reason: collision with root package name */
    public static C0 f12078m;

    /* renamed from: n, reason: collision with root package name */
    public static C0 f12079n;

    /* renamed from: a, reason: collision with root package name */
    public static final f f12066a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final P f12067b = C6339a.f64787a.a();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f12068c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f12069d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public static final Wh.a f12070e = g.b(false, 1, null);

    /* renamed from: f, reason: collision with root package name */
    public static final Object f12071f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static final L5.b f12072g = new L5.b();

    /* renamed from: h, reason: collision with root package name */
    public static WeakReference f12073h = new WeakReference(null);

    /* renamed from: j, reason: collision with root package name */
    public static final W5.d f12075j = new W5.a();

    /* renamed from: l, reason: collision with root package name */
    public static final InterfaceC6207a f12077l = new C6208b();

    /* renamed from: o, reason: collision with root package name */
    public static final ConcurrentHashMap.KeySetView f12080o = ConcurrentHashMap.newKeySet();

    public static final class a extends SuspendLambda implements Function1 {

        /* renamed from: n, reason: collision with root package name */
        public int f12081n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ U5.a f12082o;

        /* renamed from: U5.f$a$a, reason: collision with other inner class name */
        public static final class C0249a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public Object f12083n;

            /* renamed from: o, reason: collision with root package name */
            public int f12084o;

            /* renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f12085p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ Context f12086q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ U5.a f12087r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0249a(Context context, U5.a aVar, Continuation continuation) {
                super(2, continuation);
                this.f12086q = context;
                this.f12087r = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0249a c0249a = new C0249a(this.f12086q, this.f12087r, continuation);
                c0249a.f12085p = obj;
                return c0249a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((C0249a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:59:0x00bc  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x00c4  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Throwable th2;
                C0249a c0249a;
                C1921a c1921a;
                Bitmap bitmap;
                Bitmap bitmap2;
                Throwable th3;
                ScreenshotContext a10;
                ScreenshotContext screenshotContext;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f12084o;
                try {
                    try {
                        if (i10 == 0) {
                            ResultKt.throwOnFailure(obj);
                            try {
                                C1921a c1921a2 = f.f12074i;
                                C1921a c1921a3 = c1921a2 != null ? c1921a2 : null;
                                if (c1921a3 == null) {
                                    E5.b.f3006a.a("replayOptions is null, ignoring captureEvent call");
                                    return null;
                                }
                                ConcurrentHashMap.KeySetView keySetView = f.f12080o;
                                Intrinsics.checkNotNullExpressionValue(keySetView, "access$getMaskedFlutterViewsIds$p(...)");
                                List list = CollectionsKt.toList(keySetView);
                                W5.d dVar = f.f12075j;
                                Context context = this.f12086q;
                                U5.a aVar = this.f12087r;
                                this.f12085p = c1921a3;
                                this.f12084o = 1;
                                c0249a = this;
                                obj = dVar.a(context, c1921a3, aVar, list, c0249a);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                c1921a = c1921a3;
                            } catch (Throwable th4) {
                                th = th4;
                                th2 = th;
                                if (!(th2 instanceof CancellationException)) {
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                screenshotContext = (ScreenshotContext) this.f12083n;
                                bitmap2 = (Bitmap) this.f12085p;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    a10 = screenshotContext;
                                    bitmap = bitmap2;
                                    bitmap.recycle();
                                    return a10;
                                } catch (Throwable th5) {
                                    th3 = th5;
                                    bitmap2.recycle();
                                    throw th3;
                                }
                            }
                            c1921a = (C1921a) this.f12085p;
                            ResultKt.throwOnFailure(obj);
                            c0249a = this;
                        }
                        bitmap = (Bitmap) obj;
                        if (bitmap == null) {
                            E5.b.f3006a.a("Frame is null, possible duplicate, ignoring captureEvent call");
                            return null;
                        }
                        try {
                            a10 = f.f12072g.a(c0249a.f12087r.a());
                            Y5.b bVar = f.f12076k;
                            if (bVar != null) {
                                c0249a.f12085p = bitmap;
                                c0249a.f12083n = a10;
                                c0249a.f12084o = 2;
                                if (bVar.a(bitmap, c1921a, a10, this) != coroutine_suspended) {
                                    bitmap2 = bitmap;
                                    screenshotContext = a10;
                                    a10 = screenshotContext;
                                    bitmap = bitmap2;
                                }
                                return coroutine_suspended;
                            }
                            bitmap.recycle();
                            return a10;
                        } catch (Throwable th6) {
                            bitmap2 = bitmap;
                            th3 = th6;
                            bitmap2.recycle();
                            throw th3;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Throwable th8) {
                    th2 = th8;
                    if (!(th2 instanceof CancellationException)) {
                        throw th2;
                    }
                    E5.b.f3006a.c("Failed to capture frame", th2);
                    return null;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(U5.a aVar, Continuation continuation) {
            super(1, continuation);
            this.f12082o = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new a(this.f12082o, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            X b10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f12081n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!f.f12069d.get()) {
                    return null;
                }
                M5.a d10 = H5.b.f4801a.d();
                if (d10 != null && d10.isIdle()) {
                    return null;
                }
                Context context = (Context) f.f12073h.get();
                if (context == null) {
                    E5.b.f3006a.b("Context is null, ignoring captureEvent call");
                    return null;
                }
                b10 = AbstractC1459k.b(f.f12067b, null, null, new C0249a(context, this.f12082o, null), 3, null);
                this.f12081n = 1;
                obj = b10.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ScreenshotContext screenshotContext = (ScreenshotContext) obj;
            if (screenshotContext == null) {
                return null;
            }
            U5.a aVar = this.f12082o;
            if (aVar.b()) {
                ScreenshotContext b11 = ScreenshotContext.b(screenshotContext, null, 0, 0, 0L, aVar instanceof a.b, 15, null);
                C2889b c2889b = (C2889b) S4.c.f10591a.g(i.l.f5430b);
                if (c2889b != null) {
                    c2889b.B(b11);
                }
            }
            return screenshotContext;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f12088n;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f12088n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                f fVar = f.f12066a;
                a.b bVar = new a.b(f.f12077l.a());
                this.f12088n = 1;
                if (fVar.s(bVar, this) == coroutine_suspended) {
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

    public static final class c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f12089n;

        /* renamed from: o, reason: collision with root package name */
        public Object f12090o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f12091p;

        /* renamed from: r, reason: collision with root package name */
        public int f12093r;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12091p = obj;
            this.f12093r |= Integer.MIN_VALUE;
            return f.this.v(null, this);
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f12094n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f12095o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ C1921a f12096p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Context f12097q;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f12098n;

            /* renamed from: U5.f$d$a$a, reason: collision with other inner class name */
            public static final class C0250a implements InterfaceC5322g {

                /* renamed from: a, reason: collision with root package name */
                public static final C0250a f12099a = new C0250a();

                @Override // kotlinx.coroutines.flow.InterfaceC5322g
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(C5.b bVar, Continuation continuation) {
                    Object B10 = f.f12066a.B(bVar, continuation);
                    return B10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? B10 : Unit.INSTANCE;
                }
            }

            public a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f12098n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC5321f s10 = C5.d.f1144a.s();
                    C0250a c0250a = C0250a.f12099a;
                    this.f12098n = 1;
                    if (s10.collect(c0250a, this) == coroutine_suspended) {
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

        public static final class b extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public Object f12100n;

            /* renamed from: o, reason: collision with root package name */
            public Object f12101o;

            /* renamed from: p, reason: collision with root package name */
            public int f12102p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ Context f12103q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Context context, Continuation continuation) {
                super(2, continuation);
                this.f12103q = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.f12103q, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                V5.a aVar;
                V5.a aVar2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f12102p;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    aVar = new V5.a(new File(this.f12103q.getFilesDir(), "frames"), null, 2, null);
                    this.f12100n = aVar;
                    this.f12101o = aVar;
                    this.f12102p = 1;
                    if (aVar.h(this) != coroutine_suspended) {
                        aVar2 = aVar;
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V5.a aVar3 = (V5.a) this.f12100n;
                    ResultKt.throwOnFailure(obj);
                    return aVar3;
                }
                aVar = (V5.a) this.f12101o;
                aVar2 = (V5.a) this.f12100n;
                ResultKt.throwOnFailure(obj);
                this.f12100n = aVar2;
                this.f12101o = null;
                this.f12102p = 2;
                return aVar.f(this) == coroutine_suspended ? coroutine_suspended : aVar2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1921a c1921a, Context context, Continuation continuation) {
            super(2, continuation);
            this.f12096p = c1921a;
            this.f12097q = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(this.f12096p, this.f12097q, continuation);
            dVar.f12095o = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            p k10;
            p pVar;
            C0 d10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f12094n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                M5.a d11 = H5.b.f4801a.d();
                if (d11 == null || (k10 = d11.k()) == null) {
                    E5.b.f3006a.b("session configuration is null, can't initialize session replay");
                    return Unit.INSTANCE;
                }
                C6523d.f66138a.o(new C6855b(this.f12096p.e(), this.f12096p.i(), this.f12096p.d(), this.f12096p.f()));
                L b10 = C1452g0.b();
                b bVar = new b(this.f12097q, null);
                this.f12095o = k10;
                this.f12094n = 1;
                Object g10 = AbstractC1455i.g(b10, bVar, this);
                if (g10 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pVar = k10;
                obj = g10;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p pVar2 = (p) this.f12095o;
                ResultKt.throwOnFailure(obj);
                pVar = pVar2;
            }
            f fVar = f.f12066a;
            f.f12076k = new Y5.a((V5.a) obj, new Z5.g(null, null, null, pVar, 7, null));
            d10 = AbstractC1459k.d(f.f12067b, null, null, new a(null), 3, null);
            f.f12078m = d10;
            f.f12068c.set(true);
            if (this.f12096p.a()) {
                f.f12066a.G();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f12104n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f12105o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f12106p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10, Continuation continuation) {
            super(2, continuation);
            this.f12106p = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            e eVar = new e(this.f12106p, continuation);
            eVar.f12105o = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
        
            if (Ph.AbstractC1440a0.a(r6, r8) != r0) goto L7;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0071 -> B:6:0x0015). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            P p10;
            P p11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f12104n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                p10 = (P) this.f12105o;
                if (Q.i(p10)) {
                }
                return Unit.INSTANCE;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p11 = (P) this.f12105o;
                ResultKt.throwOnFailure(obj);
                p10 = p11;
                if (Q.i(p10) || !f.f12068c.get() || !f.f12069d.get()) {
                    return Unit.INSTANCE;
                }
                f fVar = f.f12066a;
                a.c cVar = new a.c(f.f12077l.a());
                this.f12105o = p10;
                this.f12104n = 1;
                if (fVar.s(cVar, this) != coroutine_suspended) {
                    p11 = p10;
                    long j10 = 1000 / this.f12106p;
                    this.f12105o = p11;
                    this.f12104n = 2;
                }
                return coroutine_suspended;
            }
            p11 = (P) this.f12105o;
            ResultKt.throwOnFailure(obj);
            long j102 = 1000 / this.f12106p;
            this.f12105o = p11;
            this.f12104n = 2;
        }
    }

    public static final Unit D() {
        f12072g.c();
        return Unit.INSTANCE;
    }

    public static final Unit H() {
        if (f12069d.getAndSet(true)) {
            E5.b.f3006a.f("SessionReplayInternal is already recording, ignoring startSessionRecording call");
            return Unit.INSTANCE;
        }
        E5.b.f3006a.a("SessionReplayInternal.startSessionRecording");
        C1921a c1921a = f12074i;
        if (c1921a == null) {
            return null;
        }
        f12066a.E(c1921a.g());
        return Unit.INSTANCE;
    }

    public static final Unit K() {
        if (f12069d.getAndSet(false)) {
            E5.b.f3006a.a("SessionReplayInternal.stopSessionRecording");
        } else {
            E5.b.f3006a.f("SessionReplayInternal is not recording, ignoring stopSessionRecording call");
        }
        return Unit.INSTANCE;
    }

    public static final Boolean x() {
        return Boolean.valueOf(f12072g.b());
    }

    public final boolean A() {
        boolean z10;
        synchronized (f12071f) {
            z10 = f12069d.get();
        }
        return z10;
    }

    public final Object B(C5.b bVar, Continuation continuation) {
        C6854a c6854a = new C6854a(bVar.a(), bVar.b());
        E5.b.f3006a.a("onUserTouchEvent: " + c6854a);
        Object s10 = s(new a.d(c6854a, f12077l.a()), continuation);
        return s10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? s10 : Unit.INSTANCE;
    }

    public final Unit C() {
        return (Unit) u(new Function0() { // from class: U5.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit D10;
                D10 = f.D();
                return D10;
            }
        });
    }

    public final void E(int i10) {
        C0 d10;
        d10 = AbstractC1459k.d(f12067b, null, null, new e(i10, null), 3, null);
        f12079n = d10;
    }

    public final void F() {
        synchronized (f12071f) {
            try {
                AtomicBoolean atomicBoolean = f12068c;
                if (atomicBoolean.get()) {
                    E5.b.f3006a.a("SessionReplayInternal.shutdown");
                    f12073h.clear();
                    f fVar = f12066a;
                    fVar.J();
                    fVar.I();
                    f12074i = null;
                    f12076k = null;
                    C0 c02 = f12078m;
                    if (c02 != null) {
                        C0.a.b(c02, null, 1, null);
                    }
                    f12078m = null;
                    f12080o.clear();
                    atomicBoolean.set(false);
                    X5.e.f13590a.close();
                } else {
                    E5.b.f3006a.f("SessionReplayInternal is not running, ignoring shutdown call");
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Unit G() {
        return (Unit) u(new Function0() { // from class: U5.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit H10;
                H10 = f.H();
                return H10;
            }
        });
    }

    public final void I() {
        C0 c02 = f12079n;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        f12079n = null;
    }

    public final Unit J() {
        return (Unit) u(new Function0() { // from class: U5.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit K10;
                K10 = f.K();
                return K10;
            }
        });
    }

    public final Object s(U5.a aVar, Continuation continuation) {
        return v(new a(aVar, null), continuation);
    }

    public final void t() {
        AbstractC1459k.d(f12067b, null, null, new b(null), 3, null);
    }

    public final Object u(Function0 function0) {
        synchronized (f12071f) {
            if (!f12068c.get()) {
                return null;
            }
            return function0.invoke();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0058, code lost:
    
        if (r9.f(null, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x007b, blocks: (B:24:0x005b, B:28:0x0067), top: B:23:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Function1 function1, Continuation continuation) {
        c cVar;
        int i10;
        Wh.a aVar;
        Throwable th2;
        Wh.a aVar2;
        try {
            if (continuation instanceof c) {
                cVar = (c) continuation;
                int i11 = cVar.f12093r;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    cVar.f12093r = i11 - Integer.MIN_VALUE;
                    Object obj = cVar.f12091p;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = cVar.f12093r;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        aVar = f12070e;
                        cVar.f12089n = function1;
                        cVar.f12090o = aVar;
                        cVar.f12093r = 1;
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (Wh.a) cVar.f12089n;
                            try {
                                ResultKt.throwOnFailure(obj);
                                aVar2.g(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                aVar2.g(null);
                                throw th2;
                            }
                        }
                        Wh.a aVar3 = (Wh.a) cVar.f12090o;
                        Function1 function12 = (Function1) cVar.f12089n;
                        ResultKt.throwOnFailure(obj);
                        aVar = aVar3;
                        function1 = function12;
                    }
                    if (f12068c.get()) {
                        aVar.g(null);
                        return null;
                    }
                    cVar.f12089n = aVar;
                    cVar.f12090o = null;
                    cVar.f12093r = 2;
                    Object invoke = function1.invoke(cVar);
                    if (invoke != coroutine_suspended) {
                        Wh.a aVar4 = aVar;
                        obj = invoke;
                        aVar2 = aVar4;
                        aVar2.g(null);
                        return obj;
                    }
                    return coroutine_suspended;
                }
            }
            if (f12068c.get()) {
            }
        } catch (Throwable th4) {
            Wh.a aVar5 = aVar;
            th2 = th4;
            aVar2 = aVar5;
            aVar2.g(null);
            throw th2;
        }
        cVar = new c(continuation);
        Object obj2 = cVar.f12091p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = cVar.f12093r;
        if (i10 != 0) {
        }
    }

    public final boolean w() {
        Boolean bool = (Boolean) u(new Function0() { // from class: U5.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Boolean x10;
                x10 = f.x();
                return x10;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void y(Context context, C1921a options) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
        synchronized (f12071f) {
            try {
                if (f12068c.get()) {
                    E5.b.f3006a.f("SessionReplayInternal is already running, ignoring initialize call");
                } else {
                    f12074i = options;
                    f12073h = new WeakReference(context);
                    AbstractC1459k.d(f12067b, C1452g0.c().e2(), null, new d(options, context, null), 2, null);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean z() {
        boolean z10;
        synchronized (f12071f) {
            z10 = f12068c.get();
        }
        return z10;
    }
}

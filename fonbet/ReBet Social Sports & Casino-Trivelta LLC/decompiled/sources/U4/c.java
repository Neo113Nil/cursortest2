package U4;

import G5.CoralogixStackTrace;
import I5.a;
import L5.ScreenshotContext;
import Ph.AbstractC1459k;
import Ph.P;
import Q5.b;
import U5.a;
import U5.f;
import android.app.Application;
import ei.AbstractC4212b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import p5.C6047b;
import p5.C6048c;
import r5.C6208b;
import r5.InterfaceC6207a;
import rh.InterfaceC6290h;
import rh.InterfaceC6300r;
import s5.C6339a;

/* loaded from: classes2.dex */
public final class c implements b5.c {

    /* renamed from: j, reason: collision with root package name */
    public static final a f12040j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6300r f12041a;

    /* renamed from: b, reason: collision with root package name */
    public final Application f12042b;

    /* renamed from: c, reason: collision with root package name */
    public final N5.a f12043c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC6207a f12044d;

    /* renamed from: e, reason: collision with root package name */
    public final C6048c f12045e;

    /* renamed from: f, reason: collision with root package name */
    public final P f12046f;

    /* renamed from: g, reason: collision with root package name */
    public final O5.a f12047g;

    /* renamed from: h, reason: collision with root package name */
    public final b5.d f12048h;

    /* renamed from: i, reason: collision with root package name */
    public final e f12049i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f12050n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ U4.a f12052p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(U4.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f12052p = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new b(this.f12052p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f12050n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                c cVar = c.this;
                U4.a aVar = this.f12052p;
                this.f12050n = 1;
                if (cVar.w0(aVar, this) == coroutine_suspended) {
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

    /* renamed from: U4.c$c, reason: collision with other inner class name */
    public static final class C0247c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f12053n;

        /* renamed from: o, reason: collision with root package name */
        public Object f12054o;

        /* renamed from: p, reason: collision with root package name */
        public long f12055p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f12056q;

        /* renamed from: s, reason: collision with root package name */
        public int f12058s;

        public C0247c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12056q = obj;
            this.f12058s |= Integer.MIN_VALUE;
            return c.this.w0(null, this);
        }
    }

    public c(InterfaceC6300r tracer, Application application, N5.a configurationsManager, InterfaceC6207a clock, C6048c spanFactory, P scope, O5.a snapshotManager) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(configurationsManager, "configurationsManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(spanFactory, "spanFactory");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(snapshotManager, "snapshotManager");
        this.f12041a = tracer;
        this.f12042b = application;
        this.f12043c = configurationsManager;
        this.f12044d = clock;
        this.f12045e = spanFactory;
        this.f12046f = scope;
        this.f12047g = snapshotManager;
        b5.d dVar = new b5.d() { // from class: U4.b
            @Override // b5.d
            public final void a(Object obj) {
                c.U(c.this, (a) obj);
            }
        };
        this.f12048h = dVar;
        this.f12049i = new e(dVar);
    }

    public static final void U(c cVar, U4.a error) {
        Intrinsics.checkNotNullParameter(error, "error");
        AbstractC1459k.d(cVar.B(), null, null, cVar.new b(error, null), 3, null);
    }

    public P B() {
        return this.f12046f;
    }

    public C6048c J() {
        return this.f12045e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12049i.d();
        Unit unit = Unit.INSTANCE;
        E5.b.f3006a.f("uncaught exception instrumentation stopped");
    }

    public InterfaceC6207a k() {
        return this.f12044d;
    }

    public N5.a r() {
        return this.f12043c;
    }

    @Override // b5.c
    public void r0() {
        this.f12049i.b();
        Unit unit = Unit.INSTANCE;
        E5.b.f3006a.f("uncaught exception instrumentation started");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w0(U4.a aVar, Continuation continuation) {
        C0247c c0247c;
        int i10;
        c cVar;
        long j10;
        String f10;
        String a10;
        String b10;
        if (continuation instanceof C0247c) {
            c0247c = (C0247c) continuation;
            int i11 = c0247c.f12058s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0247c.f12058s = i11 - Integer.MIN_VALUE;
                Object obj = c0247c.f12056q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0247c.f12058s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (z0(aVar)) {
                        return Unit.INSTANCE;
                    }
                    E5.b.f3006a.a("reporting unhandled exception: " + aVar.c());
                    this.f12047g.e();
                    long a11 = k().a();
                    f fVar = f.f12066a;
                    a.C0248a c0248a = new a.C0248a(a11);
                    c0247c.f12053n = this;
                    c0247c.f12054o = aVar;
                    c0247c.f12055p = a11;
                    c0247c.f12058s = 1;
                    obj = fVar.s(c0248a, c0247c);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cVar = this;
                    j10 = a11;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j10 = c0247c.f12055p;
                    aVar = (U4.a) c0247c.f12054o;
                    cVar = (c) c0247c.f12053n;
                    ResultKt.throwOnFailure(obj);
                }
                InterfaceC6290h a12 = cVar.J().a(new C6047b(a.b.f5352c.a(), b.e.f9376b, null, Boxing.boxLong(j10), (ScreenshotContext) obj, null, null, 100, null));
                a12.h("error.type", aVar.e());
                a12.h("error.message", aVar.c());
                a12.j("error.is_crash", aVar.g());
                AbstractC4212b b11 = F5.b.b();
                CoralogixStackTrace d10 = aVar.d();
                b11.a();
                a12.h("error.stack", b11.b(CoralogixStackTrace.INSTANCE.serializer(), d10));
                f10 = aVar.f();
                if (f10 != null) {
                    a12.h("error.stack_trace_type", f10);
                }
                a10 = aVar.a();
                if (a10 != null) {
                    a12.h("error.arch", a10);
                }
                b10 = aVar.b();
                if (b10 != null) {
                    a12.h("error.build_id", b10);
                }
                a12.end();
                return Unit.INSTANCE;
            }
        }
        c0247c = new C0247c(continuation);
        Object obj2 = c0247c.f12056q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c0247c.f12058s;
        if (i10 != 0) {
        }
        InterfaceC6290h a122 = cVar.J().a(new C6047b(a.b.f5352c.a(), b.e.f9376b, null, Boxing.boxLong(j10), (ScreenshotContext) obj2, null, null, 100, null));
        a122.h("error.type", aVar.e());
        a122.h("error.message", aVar.c());
        a122.j("error.is_crash", aVar.g());
        AbstractC4212b b112 = F5.b.b();
        CoralogixStackTrace d102 = aVar.d();
        b112.a();
        a122.h("error.stack", b112.b(CoralogixStackTrace.INSTANCE.serializer(), d102));
        f10 = aVar.f();
        if (f10 != null) {
        }
        a10 = aVar.a();
        if (a10 != null) {
        }
        b10 = aVar.b();
        if (b10 != null) {
        }
        a122.end();
        return Unit.INSTANCE;
    }

    public final boolean z0(U4.a aVar) {
        Object m147constructorimpl;
        String c10 = aVar.c();
        Locale locale = Locale.ROOT;
        String lowerCase = c10.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String lowerCase2 = aVar.e().toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        List<String> j10 = r().k().c().j();
        boolean z10 = j10 instanceof Collection;
        boolean z11 = true;
        if (!z10 || !j10.isEmpty()) {
            Iterator it = j10.iterator();
            while (it.hasNext()) {
                if (StringsKt.equals((String) it.next(), lowerCase2, true)) {
                    break;
                }
            }
        }
        if (!z10 || !j10.isEmpty()) {
            Iterator it2 = j10.iterator();
            while (it2.hasNext()) {
                if (StringsKt.equals((String) it2.next(), lowerCase, true)) {
                    return true;
                }
            }
        }
        if (!z10 || !j10.isEmpty()) {
            for (String str : j10) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m147constructorimpl = Result.m147constructorimpl(new Regex(str, RegexOption.IGNORE_CASE));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
                }
                if (Result.m153isFailureimpl(m147constructorimpl)) {
                    m147constructorimpl = null;
                }
                Regex regex = (Regex) m147constructorimpl;
                if ((regex != null && regex.matches(lowerCase2)) || (regex != null && regex.matches(lowerCase))) {
                    break;
                }
            }
        }
        z11 = false;
        E5.b.f3006a.a("ignoring error: " + z11);
        return z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ c(InterfaceC6300r interfaceC6300r, Application application, N5.a aVar, InterfaceC6207a interfaceC6207a, C6048c c6048c, P p10, O5.a aVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6300r, application, aVar, r4, (i10 & 16) != 0 ? new C6048c(interfaceC6300r, r4, aVar) : c6048c, (i10 & 32) != 0 ? C6339a.f64787a.a() : p10, (i10 & 64) != 0 ? O5.b.f8334a : aVar2);
        InterfaceC6207a c6208b = (i10 & 8) != 0 ? new C6208b() : interfaceC6207a;
    }
}

package T4;

import G5.CoralogixStackTrace;
import I5.a;
import L5.ScreenshotContext;
import Ph.AbstractC1459k;
import Ph.P;
import Q5.b;
import U5.a;
import android.app.Application;
import ei.AbstractC4212b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p5.C6047b;
import p5.C6048c;
import r5.C6208b;
import r5.InterfaceC6207a;
import rh.InterfaceC6290h;
import rh.InterfaceC6300r;
import s5.C6339a;

/* loaded from: classes2.dex */
public final class e implements b5.c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6300r f10935a;

    /* renamed from: b, reason: collision with root package name */
    public final Application f10936b;

    /* renamed from: c, reason: collision with root package name */
    public final N5.a f10937c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC6207a f10938d;

    /* renamed from: e, reason: collision with root package name */
    public final C6048c f10939e;

    /* renamed from: f, reason: collision with root package name */
    public final P f10940f;

    /* renamed from: g, reason: collision with root package name */
    public final O5.a f10941g;

    /* renamed from: h, reason: collision with root package name */
    public final b5.d f10942h;

    /* renamed from: i, reason: collision with root package name */
    public final T4.a f10943i;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f10944n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ f f10946p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, Continuation continuation) {
            super(2, continuation);
            this.f10946p = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new a(this.f10946p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f10944n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                e eVar = e.this;
                f fVar = this.f10946p;
                this.f10944n = 1;
                if (eVar.A0(fVar, this) == coroutine_suspended) {
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

    public static final class b extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f10947n;

        /* renamed from: o, reason: collision with root package name */
        public Object f10948o;

        /* renamed from: p, reason: collision with root package name */
        public long f10949p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f10950q;

        /* renamed from: s, reason: collision with root package name */
        public int f10952s;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10950q = obj;
            this.f10952s |= Integer.MIN_VALUE;
            return e.this.A0(null, this);
        }
    }

    public e(InterfaceC6300r tracer, Application application, N5.a configurationsManager, InterfaceC6207a clock, C6048c spanFactory, P scope, O5.a snapshotManager) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(configurationsManager, "configurationsManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(spanFactory, "spanFactory");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(snapshotManager, "snapshotManager");
        this.f10935a = tracer;
        this.f10936b = application;
        this.f10937c = configurationsManager;
        this.f10938d = clock;
        this.f10939e = spanFactory;
        this.f10940f = scope;
        this.f10941g = snapshotManager;
        b5.d dVar = new b5.d() { // from class: T4.d
            @Override // b5.d
            public final void a(Object obj) {
                e.z0(e.this, (f) obj);
            }
        };
        this.f10942h = dVar;
        this.f10943i = new T4.a(r(), dVar);
    }

    public static final void z0(e eVar, f anr) {
        Intrinsics.checkNotNullParameter(anr, "anr");
        AbstractC1459k.d(eVar.U(), null, null, eVar.new a(anr, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A0(f fVar, Continuation continuation) {
        b bVar;
        int i10;
        e eVar;
        long j10;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f10952s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f10952s = i11 - Integer.MIN_VALUE;
                Object obj = bVar.f10950q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = bVar.f10952s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    E5.b.f3006a.a("reporting ANR event: " + fVar);
                    this.f10941g.e();
                    long a10 = B().a();
                    U5.f fVar2 = U5.f.f12066a;
                    a.C0248a c0248a = new a.C0248a(a10);
                    bVar.f10947n = this;
                    bVar.f10948o = fVar;
                    bVar.f10949p = a10;
                    bVar.f10952s = 1;
                    obj = fVar2.s(c0248a, bVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eVar = this;
                    j10 = a10;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j10 = bVar.f10949p;
                    fVar = (f) bVar.f10948o;
                    eVar = (e) bVar.f10947n;
                    ResultKt.throwOnFailure(obj);
                }
                InterfaceC6290h a11 = eVar.w0().a(new C6047b(a.b.f5352c.a(), b.e.f9376b, null, Boxing.boxLong(j10), (ScreenshotContext) obj, null, null, 100, null));
                a11.h("error.type", "ANR");
                a11.h("error.message", fVar.a());
                AbstractC4212b b10 = F5.b.b();
                CoralogixStackTrace b11 = fVar.b();
                b10.a();
                a11.h("error.stack", b10.b(CoralogixStackTrace.INSTANCE.serializer(), b11));
                a11.end();
                return Unit.INSTANCE;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f10950q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = bVar.f10952s;
        if (i10 != 0) {
        }
        InterfaceC6290h a112 = eVar.w0().a(new C6047b(a.b.f5352c.a(), b.e.f9376b, null, Boxing.boxLong(j10), (ScreenshotContext) obj2, null, null, 100, null));
        a112.h("error.type", "ANR");
        a112.h("error.message", fVar.a());
        AbstractC4212b b102 = F5.b.b();
        CoralogixStackTrace b112 = fVar.b();
        b102.a();
        a112.h("error.stack", b102.b(CoralogixStackTrace.INSTANCE.serializer(), b112));
        a112.end();
        return Unit.INSTANCE;
    }

    public InterfaceC6207a B() {
        return this.f10938d;
    }

    public final boolean D0() {
        List listOf = CollectionsKt.listOf((Object[]) new String[]{"ANR", "Application Not Responding"});
        List<String> j10 = J().k().c().j();
        if ((j10 instanceof Collection) && j10.isEmpty()) {
            return false;
        }
        for (String str : j10) {
            List list = listOf;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (StringsKt.contains((CharSequence) str, (CharSequence) it.next(), true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public N5.a J() {
        return this.f10937c;
    }

    public P U() {
        return this.f10940f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f10943i.d();
        Unit unit = Unit.INSTANCE;
        E5.b.f3006a.f("ANR instrumentation stopped");
    }

    public Application r() {
        return this.f10936b;
    }

    @Override // b5.c
    public void r0() {
        if (D0()) {
            return;
        }
        this.f10943i.b();
        Unit unit = Unit.INSTANCE;
        E5.b.f3006a.f("ANR instrumentation started");
    }

    public C6048c w0() {
        return this.f10939e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ e(InterfaceC6300r interfaceC6300r, Application application, N5.a aVar, InterfaceC6207a interfaceC6207a, C6048c c6048c, P p10, O5.a aVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6300r, application, aVar, r4, (i10 & 16) != 0 ? new C6048c(interfaceC6300r, r4, aVar) : c6048c, (i10 & 32) != 0 ? C6339a.f64787a.a() : p10, (i10 & 64) != 0 ? O5.b.f8334a : aVar2);
        InterfaceC6207a c6208b = (i10 & 8) != 0 ? new C6208b() : interfaceC6207a;
    }
}

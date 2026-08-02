package o5;

import Dh.h;
import I5.CoralogixLog;
import I5.LogEntry;
import I5.p;
import Ph.AbstractC1459k;
import Ph.P;
import Ph.Q;
import b5.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m5.C5559a;
import m5.InterfaceC5560b;
import m5.InterfaceC5561c;
import oh.g;
import q5.C6118a;
import s5.C6339a;
import t5.InterfaceC6443a;
import yh.C6896e;

/* renamed from: o5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5815b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f59327a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5560b f59328b;

    /* renamed from: c, reason: collision with root package name */
    public final O5.a f59329c;

    /* renamed from: d, reason: collision with root package name */
    public final t5.b f59330d;

    /* renamed from: e, reason: collision with root package name */
    public final P f59331e;

    /* renamed from: f, reason: collision with root package name */
    public final d f59332f;

    /* renamed from: o5.b$a */
    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f59333n;

        /* renamed from: o, reason: collision with root package name */
        public Object f59334o;

        /* renamed from: p, reason: collision with root package name */
        public int f59335p;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C5815b.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C5815b c5815b;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f59335p;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                List b10 = C6118a.f63407a.b();
                c5815b = C5815b.this;
                it = b10.iterator();
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.f59334o;
                c5815b = (C5815b) this.f59333n;
                ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                CoralogixLog coralogixLog = (CoralogixLog) it.next();
                InterfaceC5560b interfaceC5560b = c5815b.f59328b;
                this.f59333n = c5815b;
                this.f59334o = it;
                this.f59335p = 1;
                if (interfaceC5560b.a(coralogixLog, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: o5.b$b, reason: collision with other inner class name */
    public static final class C0862b extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f59337n;

        /* renamed from: o, reason: collision with root package name */
        public Object f59338o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f59339p;

        /* renamed from: r, reason: collision with root package name */
        public int f59341r;

        public C0862b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f59339p = obj;
            this.f59341r |= Integer.MIN_VALUE;
            return C5815b.this.z0(null, null, this);
        }
    }

    /* renamed from: o5.b$c */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f59342n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ CoralogixLog f59344p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C6896e f59345q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoralogixLog coralogixLog, C6896e c6896e, Continuation continuation) {
            super(2, continuation);
            this.f59344p = coralogixLog;
            this.f59345q = c6896e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C5815b.this.new c(this.f59344p, this.f59345q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f59342n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                if (C5815b.this.f59330d.isNetworkAvailable()) {
                    C5815b c5815b = C5815b.this;
                    CoralogixLog coralogixLog = this.f59344p;
                    C6896e c6896e = this.f59345q;
                    this.f59342n = 1;
                    if (c5815b.z0(coralogixLog, c6896e, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    C5815b.this.A0(this.f59344p, this.f59345q);
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

    public C5815b(M5.a sessionManager, InterfaceC5560b apiService, O5.a snapshotManager, t5.b connectivityMonitor) {
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(snapshotManager, "snapshotManager");
        Intrinsics.checkNotNullParameter(connectivityMonitor, "connectivityMonitor");
        this.f59327a = sessionManager;
        this.f59328b = apiService;
        this.f59329c = snapshotManager;
        this.f59330d = connectivityMonitor;
        this.f59331e = C6339a.f64787a.a();
        d dVar = new d() { // from class: o5.a
            @Override // b5.d
            public final void a(Object obj) {
                C5815b.U(C5815b.this, (InterfaceC6443a) obj);
            }
        };
        this.f59332f = dVar;
        connectivityMonitor.b(dVar);
    }

    public static final void U(C5815b c5815b, InterfaceC6443a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (Intrinsics.areEqual(state, InterfaceC6443a.C0911a.f65678a)) {
            E5.b.f3006a.a("network available - sending cached logs to server");
            AbstractC1459k.d(c5815b.f59331e, null, null, c5815b.new a(null), 3, null);
        }
    }

    public final void A0(CoralogixLog coralogixLog, C6896e c6896e) {
        E5.b.f3006a.a("network unavailable - caching log");
        C6118a.f63407a.c(coralogixLog);
        c6896e.k();
    }

    public final void D0(InterfaceC5561c interfaceC5561c, C6896e c6896e) {
        if (interfaceC5561c instanceof InterfaceC5561c.b) {
            c6896e.k();
        } else {
            c6896e.b();
        }
    }

    @Override // Dh.h
    public C6896e O(Collection spans) {
        Intrinsics.checkNotNullParameter(spans, "spans");
        if (this.f59327a.isIdle()) {
            E5.b.f3006a.a("session is idle - skipping export");
            C6896e j10 = C6896e.j();
            Intrinsics.checkNotNullExpressionValue(j10, "ofSuccess(...)");
            return j10;
        }
        E5.b.f3006a.a("attempting to export " + spans.size() + " spans");
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            g attributes = ((Ch.c) obj).getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
            if (R4.a.m(attributes)) {
                arrayList.add(obj);
            }
        }
        List w02 = w0(arrayList);
        Function1 e10 = this.f59327a.k().c().e();
        if (H5.a.f4799a.c() || e10 == null) {
            return m1(w02);
        }
        List list = w02;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(F5.b.g((LogEntry) it.next(), LogEntry.INSTANCE.serializer()));
        }
        e10.invoke(arrayList2);
        C6896e j11 = C6896e.j();
        Intrinsics.checkNotNullExpressionValue(j11, "ofSuccess(...)");
        return j11;
    }

    public final C6896e m1(List logs) {
        Intrinsics.checkNotNullParameter(logs, "logs");
        CoralogixLog g10 = new CoralogixLog(logs, !r0.f()).b(this.f59327a.k().c().d(), this.f59329c).g();
        if (g10.f()) {
            C6896e i10 = C6896e.i();
            E5.b.f3006a.a("no logs to send, aborting");
            Intrinsics.checkNotNullExpressionValue(i10, "also(...)");
            return i10;
        }
        E5.b.f3006a.a("exporting " + g10.getLogs().size() + " valid spans");
        C6896e c6896e = new C6896e();
        AbstractC1459k.d(this.f59331e, null, null, new c(g10, c6896e, null), 3, null);
        return c6896e;
    }

    @Override // Dh.h
    public C6896e shutdown() {
        Q.f(this.f59331e, null, 1, null);
        this.f59330d.a(this.f59332f);
        C6896e j10 = C6896e.j();
        Intrinsics.checkNotNullExpressionValue(j10, "ofSuccess(...)");
        return j10;
    }

    public final List w0(List list) {
        p k10 = this.f59327a.k();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new LogEntry((Ch.c) it.next(), k10, this.f59329c));
        }
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22)(1:23))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        r6.b();
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z0(CoralogixLog coralogixLog, C6896e c6896e, Continuation continuation) {
        C0862b c0862b;
        int i10;
        C5815b c5815b;
        if (continuation instanceof C0862b) {
            c0862b = (C0862b) continuation;
            int i11 = c0862b.f59341r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0862b.f59341r = i11 - Integer.MIN_VALUE;
                Object obj = c0862b.f59339p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0862b.f59341r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    E5.b.f3006a.a("network available - sending log to server");
                    InterfaceC5560b interfaceC5560b = this.f59328b;
                    c0862b.f59337n = this;
                    c0862b.f59338o = c6896e;
                    c0862b.f59341r = 1;
                    obj = interfaceC5560b.a(coralogixLog, c0862b);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c5815b = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c6896e = (C6896e) c0862b.f59338o;
                    c5815b = (C5815b) c0862b.f59337n;
                    ResultKt.throwOnFailure(obj);
                }
                c5815b.D0((InterfaceC5561c) obj, c6896e);
                return Unit.INSTANCE;
            }
        }
        c0862b = new C0862b(continuation);
        Object obj2 = c0862b.f59339p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c0862b.f59341r;
        if (i10 != 0) {
        }
        c5815b.D0((InterfaceC5561c) obj2, c6896e);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C5815b(M5.a aVar, InterfaceC5560b interfaceC5560b, O5.a aVar2, t5.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, interfaceC5560b, (i10 & 4) != 0 ? O5.b.f8334a : aVar2, (i10 & 8) != 0 ? t5.c.f65680a : bVar);
        M5.a aVar3;
        if ((i10 & 2) != 0) {
            aVar3 = aVar;
            interfaceC5560b = new C5559a(null, null, aVar3, 3, null);
        } else {
            aVar3 = aVar;
        }
    }
}

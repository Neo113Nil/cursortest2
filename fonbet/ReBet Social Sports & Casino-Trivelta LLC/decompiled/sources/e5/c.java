package e5;

import I5.a;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.P;
import Q5.ViewContext;
import Q5.b;
import Q5.q;
import android.app.Application;
import com.coralogix.android.sdk.internal.features.instrumentations.vitals.MobileVitalsMonitor;
import com.plaid.internal.EnumC3631g;
import di.A0;
import di.Z0;
import ei.AbstractC4212b;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.C;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;
import kotlinx.coroutines.flow.x;
import kotlinx.serialization.json.JsonObject;
import p5.C6047b;
import p5.C6048c;
import r5.C6208b;
import r5.InterfaceC6207a;
import rh.InterfaceC6290h;
import rh.InterfaceC6300r;
import s5.C6339a;

/* loaded from: classes2.dex */
public final class c implements b5.c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6300r f45662a;

    /* renamed from: b, reason: collision with root package name */
    public final Application f45663b;

    /* renamed from: c, reason: collision with root package name */
    public final N5.a f45664c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC6207a f45665d;

    /* renamed from: e, reason: collision with root package name */
    public final C6048c f45666e;

    /* renamed from: f, reason: collision with root package name */
    public final P f45667f;

    /* renamed from: g, reason: collision with root package name */
    public final x f45668g;

    /* renamed from: h, reason: collision with root package name */
    public C0 f45669h;

    /* renamed from: i, reason: collision with root package name */
    public C0 f45670i;

    /* renamed from: j, reason: collision with root package name */
    public final Map f45671j;

    /* renamed from: k, reason: collision with root package name */
    public final MobileVitalsMonitor f45672k;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f45673n;

        /* renamed from: e5.c$a$a, reason: collision with other inner class name */
        public static final class C0662a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f45675n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f45676o;

            public C0662a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0662a c0662a = new C0662a(continuation);
                c0662a.f45676o = obj;
                return c0662a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC5322g interfaceC5322g, Continuation continuation) {
                return ((C0662a) create(interfaceC5322g, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
            
                if (r1.emit(r6, r5) == r0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
            
                if (Ph.AbstractC1440a0.a(15000, r5) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                InterfaceC5322g interfaceC5322g;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f45675n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    interfaceC5322g = (InterfaceC5322g) this.f45676o;
                    this.f45676o = interfaceC5322g;
                    this.f45675n = 1;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    interfaceC5322g = (InterfaceC5322g) this.f45676o;
                    ResultKt.throwOnFailure(obj);
                }
                Unit unit = Unit.INSTANCE;
                this.f45676o = null;
                this.f45675n = 2;
            }
        }

        public static final class b implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f45677a;

            public b(c cVar) {
                this.f45677a = cVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(Unit unit, Continuation continuation) {
                c.n1(this.f45677a, null, 1, null);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: e5.c$a$c, reason: collision with other inner class name */
        public static final class C0663c extends SuspendLambda implements Function3 {

            /* renamed from: n, reason: collision with root package name */
            public int f45678n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f45679o;

            /* renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f45680p;

            public C0663c(Continuation continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC5322g interfaceC5322g, Object obj, Continuation continuation) {
                C0663c c0663c = new C0663c(continuation);
                c0663c.f45679o = interfaceC5322g;
                c0663c.f45680p = obj;
                return c0663c.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f45678n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC5322g interfaceC5322g = (InterfaceC5322g) this.f45679o;
                    InterfaceC5321f x10 = AbstractC5323h.x(new C0662a(null));
                    this.f45678n = 1;
                    if (AbstractC5323h.p(interfaceC5322g, x10, this) == coroutine_suspended) {
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

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f45673n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f O10 = AbstractC5323h.O(c.this.f45668g, new C0663c(null));
                b bVar = new b(c.this);
                this.f45673n = 1;
                if (O10.collect(bVar, this) == coroutine_suspended) {
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
        public int f45681n;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f45683a;

            public a(c cVar) {
                this.f45683a = cVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(Pair pair, Continuation continuation) {
                this.f45683a.Y1(pair);
                return Unit.INSTANCE;
            }
        }

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f45681n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C events = c.this.f45672k.getEvents();
                a aVar = new a(c.this);
                this.f45681n = 1;
                if (events.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public c(InterfaceC6300r tracer, Application application, N5.a configurationsManager, InterfaceC6207a clock, C6048c spanFactory, P scope) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(configurationsManager, "configurationsManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(spanFactory, "spanFactory");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f45662a = tracer;
        this.f45663b = application;
        this.f45664c = configurationsManager;
        this.f45665d = clock;
        this.f45666e = spanFactory;
        this.f45667f = scope;
        this.f45668g = E.b(0, 1, null, 5, null);
        Map n10 = B().k().c().n();
        this.f45671j = n10;
        this.f45672k = new MobileVitalsMonitor(r(), J(), n10);
    }

    public static /* synthetic */ void D0(c cVar, ViewContext viewContext, MobileVitalsAggregation mobileVitalsAggregation, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            viewContext = null;
        }
        if ((i10 & 2) != 0) {
            mobileVitalsAggregation = null;
        }
        cVar.A0(viewContext, mobileVitalsAggregation, z10);
    }

    public static /* synthetic */ void T1(c cVar, ViewContext viewContext, MobileVitalsAggregation mobileVitalsAggregation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            mobileVitalsAggregation = null;
        }
        cVar.y1(viewContext, mobileVitalsAggregation);
    }

    public static /* synthetic */ void n1(c cVar, MobileVitalsAggregation mobileVitalsAggregation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mobileVitalsAggregation = null;
        }
        cVar.m1(mobileVitalsAggregation);
    }

    public final void A0(ViewContext viewContext, MobileVitalsAggregation mobileVitalsAggregation, boolean z10) {
        if (viewContext == null) {
            viewContext = B().k().c().w();
        }
        ViewContext viewContext2 = viewContext;
        if (mobileVitalsAggregation == null && (mobileVitalsAggregation = this.f45672k.c(z10)) == null) {
            return;
        }
        if (w0(mobileVitalsAggregation)) {
            E5.b.f3006a.a("skipping empty mobile vitals aggregation");
            return;
        }
        E5.b.f3006a.a("reporting mobile vitals aggregation: " + mobileVitalsAggregation);
        InterfaceC6290h a10 = U().a(new C6047b(a.g.f5357c.a(), b.f.f9377b, viewContext2, null, null, null, null, 120, null));
        AbstractC4212b b10 = F5.b.b();
        b10.a();
        a10.h("mobile_vitals_aggregation", b10.b(MobileVitalsAggregation.INSTANCE.serializer(), mobileVitalsAggregation));
        a10.end();
        this.f45668g.a(Unit.INSTANCE);
    }

    public N5.a B() {
        return this.f45664c;
    }

    public P J() {
        return this.f45667f;
    }

    public C6048c U() {
        return this.f45666e;
    }

    public final void Y1(Pair event) {
        Intrinsics.checkNotNullParameter(event, "event");
        E5.b.f3006a.a("reporting mobile vitals one-shot: " + event);
        InterfaceC6290h a10 = U().a(new C6047b(a.g.f5357c.a(), b.f.f9377b, null, null, null, null, null, EnumC3631g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null));
        AbstractC4212b b10 = F5.b.b();
        b10.a();
        a10.h("mobile_vitals_one_shot", b10.b(new A0(Z0.f45341a, JsonObject.INSTANCE.serializer()), event));
        a10.end();
    }

    public final Map Z1(Map map) {
        EnumEntries b10 = q.b();
        if (map.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(b10, 10)), 16));
            for (Object obj : b10) {
                linkedHashMap.put(obj, Boolean.TRUE);
            }
            return linkedHashMap;
        }
        if (map.size() == b10.size()) {
            Collection values = map.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    if (((Boolean) it.next()).booleanValue()) {
                    }
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(b10, 10)), 16));
            for (Object obj2 : b10) {
                linkedHashMap2.put(obj2, Boolean.FALSE);
            }
            return linkedHashMap2;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(b10, 10)), 16));
        for (Object obj3 : b10) {
            Boolean bool = (Boolean) map.get((q) obj3);
            linkedHashMap3.put(obj3, Boolean.valueOf(bool != null ? bool.booleanValue() : true));
        }
        return linkedHashMap3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C0 c02 = this.f45669h;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        this.f45669h = null;
        C0 c03 = this.f45670i;
        if (c03 != null) {
            C0.a.b(c03, null, 1, null);
        }
        this.f45670i = null;
        this.f45672k.e();
        E5.b.f3006a.f("mobile vitals instrumentation stopped");
    }

    public final void m1(MobileVitalsAggregation mobileVitalsAggregation) {
        D0(this, null, mobileVitalsAggregation, false, 1, null);
    }

    public Application r() {
        return this.f45663b;
    }

    @Override // b5.c
    public void r0() {
        C0 d10;
        C0 d11;
        this.f45672k.d();
        Unit unit = Unit.INSTANCE;
        Map n10 = B().k().c().n();
        Map Z12 = Z1(n10);
        z0(n10, Z12);
        Collection values = Z12.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue()) {
                    if (this.f45669h == null) {
                        d11 = AbstractC1459k.d(J(), null, null, new a(null), 3, null);
                        this.f45669h = d11;
                        this.f45668g.a(Unit.INSTANCE);
                    }
                    d10 = AbstractC1459k.d(J(), null, null, new b(null), 3, null);
                    this.f45670i = d10;
                    E5.b.f3006a.f("mobile vitals instrumentation started");
                    return;
                }
            }
        }
        E5.b.f3006a.a("no vitals detector enabled, skipping instrumentation start");
    }

    public final boolean w0(MobileVitalsAggregation mobileVitalsAggregation) {
        return Intrinsics.areEqual(mobileVitalsAggregation, new MobileVitalsAggregation(null, null, null, null));
    }

    public final void y1(ViewContext viewContext, MobileVitalsAggregation mobileVitalsAggregation) {
        Intrinsics.checkNotNullParameter(viewContext, "viewContext");
        A0(viewContext, mobileVitalsAggregation, true);
    }

    public final void z0(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : map.entrySet()) {
            if (!((Boolean) entry2.getValue()).booleanValue()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        Set keySet2 = linkedHashMap2.keySet();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry3 : map2.entrySet()) {
            q qVar = (q) entry3.getKey();
            if (((Boolean) entry3.getValue()).booleanValue() && !keySet.contains(qVar)) {
                linkedHashMap3.put(entry3.getKey(), entry3.getValue());
            }
        }
        Set keySet3 = linkedHashMap3.keySet();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry4 : map2.entrySet()) {
            q qVar2 = (q) entry4.getKey();
            if (!((Boolean) entry4.getValue()).booleanValue() && !keySet2.contains(qVar2)) {
                linkedHashMap4.put(entry4.getKey(), entry4.getValue());
            }
        }
        Set keySet4 = linkedHashMap4.keySet();
        E5.b bVar = E5.b.f3006a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MobileVitals configuration resolved:");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("  Explicitly enabled: " + keySet);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("  Explicitly disabled: " + keySet2);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("  Implicitly enabled (defaults): " + keySet3);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("  Implicitly disabled (full-disable case only): " + keySet4);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        for (Map.Entry entry5 : map2.entrySet()) {
            if (((Boolean) entry5.getValue()).booleanValue()) {
                linkedHashMap5.put(entry5.getKey(), entry5.getValue());
            }
        }
        sb2.append("  Final enabled detectors: " + linkedHashMap5.keySet());
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        bVar.a(sb3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ c(InterfaceC6300r interfaceC6300r, Application application, N5.a aVar, InterfaceC6207a interfaceC6207a, C6048c c6048c, P p10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6300r, application, aVar, r4, (i10 & 16) != 0 ? new C6048c(interfaceC6300r, r4, aVar) : c6048c, (i10 & 32) != 0 ? C6339a.f64787a.a() : p10);
        InterfaceC6207a c6208b = (i10 & 8) != 0 ? new C6208b() : interfaceC6207a;
    }
}

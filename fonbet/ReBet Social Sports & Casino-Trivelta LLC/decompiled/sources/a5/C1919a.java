package a5;

import L5.ScreenshotContext;
import Ph.AbstractC1459k;
import Ph.P;
import Ph.X;
import Q5.b;
import U5.a;
import U5.f;
import android.app.Application;
import b5.InterfaceC2398a;
import ei.AbstractC4212b;
import ei.j;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import p5.C6046a;
import p5.C6048c;
import r5.C6208b;
import r5.InterfaceC6207a;
import rh.InterfaceC6290h;
import rh.InterfaceC6300r;
import s5.C6339a;

/* renamed from: a5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1919a implements InterfaceC2398a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6300r f15053a;

    /* renamed from: b, reason: collision with root package name */
    public final Application f15054b;

    /* renamed from: c, reason: collision with root package name */
    public final N5.a f15055c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC6207a f15056d;

    /* renamed from: e, reason: collision with root package name */
    public final C6048c f15057e;

    /* renamed from: f, reason: collision with root package name */
    public final P f15058f;

    /* renamed from: g, reason: collision with root package name */
    public final O5.a f15059g;

    /* renamed from: a5.a$a, reason: collision with other inner class name */
    public static final class C0317a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f15060n;

        /* renamed from: o, reason: collision with root package name */
        public Object f15061o;

        /* renamed from: p, reason: collision with root package name */
        public Object f15062p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f15063q;

        /* renamed from: s, reason: collision with root package name */
        public int f15065s;

        public C0317a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15063q = obj;
            this.f15065s |= Integer.MIN_VALUE;
            return C1919a.this.b(null, 0L, null, this);
        }
    }

    /* renamed from: a5.a$b */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f15066n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f15067o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6290h f15068p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, InterfaceC6290h interfaceC6290h, Continuation continuation) {
            super(2, continuation);
            this.f15067o = j10;
            this.f15068p = interfaceC6290h;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f15067o, this.f15068p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f15066n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                f fVar = f.f12066a;
                a.C0248a c0248a = new a.C0248a(this.f15067o);
                this.f15066n = 1;
                obj = fVar.s(c0248a, this);
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
            InterfaceC6290h interfaceC6290h = this.f15068p;
            AbstractC4212b b10 = F5.b.b();
            b10.a();
            return interfaceC6290h.h("screenshot_context", b10.b(ScreenshotContext.INSTANCE.serializer(), screenshotContext));
        }
    }

    public C1919a(InterfaceC6300r tracer, Application application, N5.a configurationsManager, InterfaceC6207a clock, C6048c spanFactory, P scope, O5.a snapshotManager) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(configurationsManager, "configurationsManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(spanFactory, "spanFactory");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(snapshotManager, "snapshotManager");
        this.f15053a = tracer;
        this.f15054b = application;
        this.f15055c = configurationsManager;
        this.f15056d = clock;
        this.f15057e = spanFactory;
        this.f15058f = scope;
        this.f15059g = snapshotManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0105 A[LOOP:0: B:18:0x00ff->B:20:0x0105, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0152 A[LOOP:1: B:28:0x014c->B:30:0x0152, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(InterfaceC6290h interfaceC6290h, long j10, C1920b c1920b, Continuation continuation) {
        C0317a c0317a;
        int i10;
        InterfaceC6290h interfaceC6290h2;
        X b10;
        String d10;
        Map h10;
        Map k10;
        String i11;
        String l10;
        if (continuation instanceof C0317a) {
            c0317a = (C0317a) continuation;
            int i12 = c0317a.f15065s;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c0317a.f15065s = i12 - Integer.MIN_VALUE;
                Object obj = c0317a.f15063q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0317a.f15065s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    interfaceC6290h.h("http.method", c1920b.g());
                    interfaceC6290h.h("http.url", c1920b.s());
                    interfaceC6290h.h("http.status_code", String.valueOf(c1920b.p()));
                    interfaceC6290h.h("http.scheme", c1920b.m());
                    interfaceC6290h.k("http.response.body.size", c1920b.j());
                    interfaceC6290h.h("http.target", c1920b.e());
                    interfaceC6290h.h("net.peer.name", c1920b.f());
                    interfaceC6290h.h("status_text", c1920b.q());
                    interfaceC6290h.k("duration", c1920b.c());
                    interfaceC6290h.k("severity", c1920b.n().getLevel());
                    if (Intrinsics.areEqual(c1920b.n(), b.e.f9376b)) {
                        b10 = AbstractC1459k.b(g(), null, null, new b(j10, interfaceC6290h, null), 3, null);
                        c0317a.f15060n = c1920b;
                        c0317a.f15061o = interfaceC6290h;
                        c0317a.f15062p = interfaceC6290h;
                        c0317a.f15065s = 1;
                        if (b10.await(c0317a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    interfaceC6290h2 = interfaceC6290h;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC6290h = (InterfaceC6290h) c0317a.f15062p;
                    interfaceC6290h2 = (InterfaceC6290h) c0317a.f15061o;
                    c1920b = (C1920b) c0317a.f15060n;
                    ResultKt.throwOnFailure(obj);
                }
                d10 = c1920b.d();
                if (d10 != null) {
                    interfaceC6290h.h("error-message", d10);
                }
                h10 = c1920b.h();
                if (h10 != null && !h10.isEmpty()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(h10.size()));
                    for (Map.Entry entry : h10.entrySet()) {
                        linkedHashMap.put(entry.getKey(), j.c((String) entry.getValue()));
                    }
                    interfaceC6290h.h("request_headers", new JsonObject(linkedHashMap).toString());
                }
                k10 = c1920b.k();
                if (k10 != null && !k10.isEmpty()) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(k10.size()));
                    for (Map.Entry entry2 : k10.entrySet()) {
                        linkedHashMap2.put(entry2.getKey(), j.c((String) entry2.getValue()));
                    }
                    interfaceC6290h.h("response_headers", new JsonObject(linkedHashMap2).toString());
                }
                i11 = c1920b.i();
                if (i11 != null) {
                    interfaceC6290h.h("request_payload", i11);
                }
                l10 = c1920b.l();
                if (l10 != null) {
                    interfaceC6290h.h("response_payload", l10);
                }
                interfaceC6290h.end();
                return interfaceC6290h2;
            }
        }
        c0317a = new C0317a(continuation);
        Object obj2 = c0317a.f15063q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c0317a.f15065s;
        if (i10 != 0) {
        }
        d10 = c1920b.d();
        if (d10 != null) {
        }
        h10 = c1920b.h();
        if (h10 != null) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt.mapCapacity(h10.size()));
            while (r13.hasNext()) {
            }
            interfaceC6290h.h("request_headers", new JsonObject(linkedHashMap3).toString());
        }
        k10 = c1920b.k();
        if (k10 != null) {
            LinkedHashMap linkedHashMap22 = new LinkedHashMap(MapsKt.mapCapacity(k10.size()));
            while (r13.hasNext()) {
            }
            interfaceC6290h.h("response_headers", new JsonObject(linkedHashMap22).toString());
        }
        i11 = c1920b.i();
        if (i11 != null) {
        }
        l10 = c1920b.l();
        if (l10 != null) {
        }
        interfaceC6290h.end();
        return interfaceC6290h2;
    }

    public final Object c(long j10, C1920b c1920b, InterfaceC6290h interfaceC6290h, Continuation continuation) {
        E5.b.f3006a.a("reporting network request to url " + c1920b.s());
        if (Intrinsics.areEqual(c1920b.n(), b.e.f9376b)) {
            this.f15059g.e();
        }
        Object b10 = b(interfaceC6290h, j10, c1920b, continuation);
        return b10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b10 : Unit.INSTANCE;
    }

    public Object d(C1920b c1920b, Continuation continuation) {
        long a10 = e().a();
        Object c10 = c(a10, c1920b, f(new C6046a(b.f.f9377b, Boxing.boxLong(a10), c1920b.r(), c1920b.o(), false)), continuation);
        return c10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? c10 : Unit.INSTANCE;
    }

    public InterfaceC6207a e() {
        return this.f15056d;
    }

    public final InterfaceC6290h f(C6046a spanDetails) {
        Intrinsics.checkNotNullParameter(spanDetails, "spanDetails");
        InterfaceC6290h a10 = h().a(spanDetails);
        a10.j("auto_attached", spanDetails.h());
        return a10;
    }

    public P g() {
        return this.f15058f;
    }

    public C6048c h() {
        return this.f15057e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C1919a(InterfaceC6300r interfaceC6300r, Application application, N5.a aVar, InterfaceC6207a interfaceC6207a, C6048c c6048c, P p10, O5.a aVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6300r, application, aVar, r4, (i10 & 16) != 0 ? new C6048c(interfaceC6300r, r4, aVar) : c6048c, (i10 & 32) != 0 ? C6339a.f64787a.a() : p10, (i10 & 64) != 0 ? O5.b.f8334a : aVar2);
        InterfaceC6207a c6208b = (i10 & 8) != 0 ? new C6208b() : interfaceC6207a;
    }
}

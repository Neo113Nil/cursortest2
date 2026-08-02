package X4;

import I5.a;
import L5.ScreenshotContext;
import Ph.AbstractC1459k;
import Ph.P;
import Ph.X;
import Q5.b;
import U5.a;
import U5.f;
import android.app.Application;
import b5.InterfaceC2398a;
import java.util.Map;
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
import p5.C6047b;
import p5.C6048c;
import r5.C6208b;
import r5.InterfaceC6207a;
import rh.InterfaceC6290h;
import rh.InterfaceC6300r;
import s5.C6339a;

/* loaded from: classes2.dex */
public final class b implements InterfaceC2398a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6300r f13539a;

    /* renamed from: b, reason: collision with root package name */
    public final Application f13540b;

    /* renamed from: c, reason: collision with root package name */
    public final N5.a f13541c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC6207a f13542d;

    /* renamed from: e, reason: collision with root package name */
    public final C6048c f13543e;

    /* renamed from: f, reason: collision with root package name */
    public final P f13544f;

    /* renamed from: g, reason: collision with root package name */
    public final O5.a f13545g;

    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f13546n;

        /* renamed from: o, reason: collision with root package name */
        public Object f13547o;

        /* renamed from: p, reason: collision with root package name */
        public long f13548p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f13549q;

        /* renamed from: s, reason: collision with root package name */
        public int f13551s;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13549q = obj;
            this.f13551s |= Integer.MIN_VALUE;
            return b.this.a(null, this);
        }
    }

    /* renamed from: X4.b$b, reason: collision with other inner class name */
    public static final class C0277b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f13552n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f13553o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0277b(long j10, Continuation continuation) {
            super(2, continuation);
            this.f13553o = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C0277b(this.f13553o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((C0277b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f13552n;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            f fVar = f.f12066a;
            a.C0248a c0248a = new a.C0248a(this.f13553o);
            this.f13552n = 1;
            Object s10 = fVar.s(c0248a, this);
            return s10 == coroutine_suspended ? coroutine_suspended : s10;
        }
    }

    public b(InterfaceC6300r tracer, Application application, N5.a configurationsManager, InterfaceC6207a clock, C6048c spanFactory, P scope, O5.a snapshotManager) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(configurationsManager, "configurationsManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(spanFactory, "spanFactory");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(snapshotManager, "snapshotManager");
        this.f13539a = tracer;
        this.f13540b = application;
        this.f13541c = configurationsManager;
        this.f13542d = clock;
        this.f13543e = spanFactory;
        this.f13544f = scope;
        this.f13545g = snapshotManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(X4.a aVar, Continuation continuation) {
        a aVar2;
        int i10;
        long a10;
        b bVar;
        ScreenshotContext screenshotContext;
        X b10;
        long j10;
        Map a11;
        Map b11;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f13551s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f13551s = i11 - Integer.MIN_VALUE;
                Object obj = aVar2.f13549q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = aVar2.f13551s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    E5.b.f3006a.f("dispatching custom log event, details: " + aVar);
                    Q5.b d10 = aVar.d();
                    b.e eVar = b.e.f9376b;
                    if (Intrinsics.areEqual(d10, eVar)) {
                        this.f13545g.e();
                    }
                    a10 = b().a();
                    if (!Intrinsics.areEqual(aVar.d(), eVar)) {
                        bVar = this;
                        screenshotContext = null;
                        InterfaceC6290h a12 = bVar.d().a(new C6047b(a.e.f5355c.a(), aVar.d(), null, Boxing.boxLong(a10), screenshotContext, null, null, 100, null));
                        a12.h("cx_log", aVar.c());
                        a11 = aVar.a();
                        if (a11 != null) {
                            a12.h("cx_log_data", F5.b.e(a11).toString());
                        }
                        b11 = aVar.b();
                        if (b11 != null) {
                            a12.h("custom_labels", F5.b.e(b11).toString());
                        }
                        a12.end();
                        return Unit.INSTANCE;
                    }
                    b10 = AbstractC1459k.b(c(), null, null, new C0277b(a10, null), 3, null);
                    aVar2.f13546n = this;
                    aVar2.f13547o = aVar;
                    aVar2.f13548p = a10;
                    aVar2.f13551s = 1;
                    obj = b10.await(aVar2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bVar = this;
                    j10 = a10;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j10 = aVar2.f13548p;
                    aVar = (X4.a) aVar2.f13547o;
                    bVar = (b) aVar2.f13546n;
                    ResultKt.throwOnFailure(obj);
                }
                screenshotContext = (ScreenshotContext) obj;
                a10 = j10;
                InterfaceC6290h a122 = bVar.d().a(new C6047b(a.e.f5355c.a(), aVar.d(), null, Boxing.boxLong(a10), screenshotContext, null, null, 100, null));
                a122.h("cx_log", aVar.c());
                a11 = aVar.a();
                if (a11 != null) {
                }
                b11 = aVar.b();
                if (b11 != null) {
                }
                a122.end();
                return Unit.INSTANCE;
            }
        }
        aVar2 = new a(continuation);
        Object obj2 = aVar2.f13549q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar2.f13551s;
        if (i10 != 0) {
        }
        screenshotContext = (ScreenshotContext) obj2;
        a10 = j10;
        InterfaceC6290h a1222 = bVar.d().a(new C6047b(a.e.f5355c.a(), aVar.d(), null, Boxing.boxLong(a10), screenshotContext, null, null, 100, null));
        a1222.h("cx_log", aVar.c());
        a11 = aVar.a();
        if (a11 != null) {
        }
        b11 = aVar.b();
        if (b11 != null) {
        }
        a1222.end();
        return Unit.INSTANCE;
    }

    public InterfaceC6207a b() {
        return this.f13542d;
    }

    public P c() {
        return this.f13544f;
    }

    public C6048c d() {
        return this.f13543e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ b(InterfaceC6300r interfaceC6300r, Application application, N5.a aVar, InterfaceC6207a interfaceC6207a, C6048c c6048c, P p10, O5.a aVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6300r, application, aVar, r4, (i10 & 16) != 0 ? new C6048c(interfaceC6300r, r4, aVar) : c6048c, (i10 & 32) != 0 ? C6339a.f64787a.a() : p10, (i10 & 64) != 0 ? O5.b.f8334a : aVar2);
        InterfaceC6207a c6208b = (i10 & 8) != 0 ? new C6208b() : interfaceC6207a;
    }
}

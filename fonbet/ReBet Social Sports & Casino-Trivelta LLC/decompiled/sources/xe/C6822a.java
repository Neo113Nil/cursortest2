package xe;

import Ph.AbstractC1459k;
import Ph.P;
import android.app.Application;
import com.zoho.livechat.android.modules.common.domain.entities.Form;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import ie.EnumC4544a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import td.C6461a;

/* renamed from: xe.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6822a {

    /* renamed from: a, reason: collision with root package name */
    public static final C6822a f68124a = new C6822a();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f68125b = LazyKt.lazy(C0971a.f68137d);

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f68126c = LazyKt.lazy(b.f68138d);

    /* renamed from: d, reason: collision with root package name */
    public static final Lazy f68127d = LazyKt.lazy(e.f68142d);

    /* renamed from: e, reason: collision with root package name */
    public static final Lazy f68128e = LazyKt.lazy(n.f68154d);

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f68129f = LazyKt.lazy(h.f68145d);

    /* renamed from: g, reason: collision with root package name */
    public static final Lazy f68130g = LazyKt.lazy(f.f68143d);

    /* renamed from: h, reason: collision with root package name */
    public static final Lazy f68131h = LazyKt.lazy(l.f68149d);

    /* renamed from: i, reason: collision with root package name */
    public static final Lazy f68132i = LazyKt.lazy(d.f68141d);

    /* renamed from: j, reason: collision with root package name */
    public static final Lazy f68133j = LazyKt.lazy(i.f68146d);

    /* renamed from: k, reason: collision with root package name */
    public static final Lazy f68134k = LazyKt.lazy(g.f68144d);

    /* renamed from: l, reason: collision with root package name */
    public static final Lazy f68135l = LazyKt.lazy(k.f68148d);

    /* renamed from: m, reason: collision with root package name */
    public static final Lazy f68136m = LazyKt.lazy(j.f68147d);

    /* renamed from: xe.a$a, reason: collision with other inner class name */
    public static final class C0971a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C0971a f68137d = new C0971a();

        public C0971a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Application invoke() {
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            Intrinsics.checkNotNull(e10);
            return e10;
        }
    }

    /* renamed from: xe.a$b */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f68138d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Kd.a invoke() {
            return Kd.a.f6469f.a(C6822a.f68124a.k());
        }
    }

    /* renamed from: xe.a$c */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f68139n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Function0 f68140o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f68140o = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f68140o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f68139n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C6822a.f68124a.n().a();
            Function0 function0 = this.f68140o;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: xe.a$d */
    public static final class d extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final d f68141d = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Od.a invoke() {
            return new Od.a(C6822a.f68124a.l());
        }
    }

    /* renamed from: xe.a$e */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final e f68142d = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Be.a invoke() {
            return Be.a.f866b.a(C6822a.f68124a.k());
        }
    }

    /* renamed from: xe.a$f */
    public static final class f extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final f f68143d = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ge.a invoke() {
            return new Ge.a(C6822a.f68124a.o());
        }
    }

    /* renamed from: xe.a$g */
    public static final class g extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final g f68144d = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Od.b invoke() {
            return new Od.b(C6822a.f68124a.l());
        }
    }

    /* renamed from: xe.a$h */
    public static final class h extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final h f68145d = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ge.d invoke() {
            return new Ge.d(C6822a.f68124a.o());
        }
    }

    /* renamed from: xe.a$i */
    public static final class i extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final i f68146d = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Od.c invoke() {
            return new Od.c(C6822a.f68124a.l());
        }
    }

    /* renamed from: xe.a$j */
    public static final class j extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final j f68147d = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Od.d invoke() {
            return new Od.d(C6822a.f68124a.l());
        }
    }

    /* renamed from: xe.a$k */
    public static final class k extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final k f68148d = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Od.e invoke() {
            return new Od.e(C6822a.f68124a.l());
        }
    }

    /* renamed from: xe.a$l */
    public static final class l extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final l f68149d = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Od.h invoke() {
            return new Od.h(C6822a.f68124a.l());
        }
    }

    /* renamed from: xe.a$m */
    public static final class m extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f68150n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f68151o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ EnumC4544a f68152p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Function0 f68153q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(boolean z10, EnumC4544a enumC4544a, Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f68151o = z10;
            this.f68152p = enumC4544a;
            this.f68153q = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new m(this.f68151o, this.f68152p, this.f68153q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((m) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f68150n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Od.h z10 = C6822a.f68124a.z();
                boolean z11 = this.f68151o;
                EnumC4544a enumC4544a = this.f68152p;
                this.f68150n = 1;
                obj = z10.a(z11, null, enumC4544a, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Function0 function0 = this.f68153q;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: xe.a$n */
    public static final class n extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final n f68154d = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ge.j invoke() {
            return new Ge.j(C6822a.f68124a.o());
        }
    }

    public static final boolean B(EnumC4544a appStatus, String str, String str2, boolean z10) {
        Intrinsics.checkNotNullParameter(appStatus, "appStatus");
        return og.i.j((Boolean) f68124a.x().a(appStatus, str, str2, z10).b());
    }

    public static final boolean C(EnumC4544a appStatus) {
        Intrinsics.checkNotNullParameter(appStatus, "appStatus");
        return og.i.i((Boolean) f68124a.y().a(appStatus).b());
    }

    public static final void D(boolean z10, EnumC4544a appStatus, Function0 function0) {
        Intrinsics.checkNotNullParameter(appStatus, "appStatus");
        AbstractC1459k.d(f68124a.j(), null, null, new m(z10, appStatus, function0, null), 3, null);
    }

    public static final void E(Ze.a salesIQDataIntentFilter) {
        Intrinsics.checkNotNullParameter(salesIQDataIntentFilter, "salesIQDataIntentFilter");
        C6822a c6822a = f68124a;
        c6822a.A().a(c6822a.i(salesIQDataIntentFilter));
    }

    public static final void f() {
        h(null, 1, null);
    }

    public static final void g(Function0 function0) {
        AbstractC1459k.d(f68124a.j(), null, null, new c(function0, null), 3, null);
    }

    public static /* synthetic */ void h(Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = null;
        }
        g(function0);
    }

    public static final Channel m() {
        return (Channel) f68124a.t().a().b();
    }

    public static final Form.Message p() {
        return (Form.Message) f68124a.u().a().b();
    }

    public static final String q(boolean z10) {
        return null;
    }

    public static final De.b r() {
        return (De.b) f68124a.v().a().b();
    }

    public static final Form s(EnumC4544a appStatus) {
        Intrinsics.checkNotNullParameter(appStatus, "appStatus");
        return (Form) f68124a.w().a(appStatus).b();
    }

    public final Ge.j A() {
        return (Ge.j) f68128e.getValue();
    }

    public final De.b i(Ze.a aVar) {
        throw null;
    }

    public final P j() {
        return C6461a.f65810a.e();
    }

    public final Application k() {
        return (Application) f68125b.getValue();
    }

    public final Kd.a l() {
        return (Kd.a) f68126c.getValue();
    }

    public final Od.a n() {
        return (Od.a) f68132i.getValue();
    }

    public final Be.a o() {
        return (Be.a) f68127d.getValue();
    }

    public final Ge.a t() {
        return (Ge.a) f68130g.getValue();
    }

    public final Od.b u() {
        return (Od.b) f68134k.getValue();
    }

    public final Ge.d v() {
        return (Ge.d) f68129f.getValue();
    }

    public final Od.c w() {
        return (Od.c) f68133j.getValue();
    }

    public final Od.d x() {
        return (Od.d) f68136m.getValue();
    }

    public final Od.e y() {
        return (Od.e) f68135l.getValue();
    }

    public final Od.h z() {
        return (Od.h) f68131h.getValue();
    }
}

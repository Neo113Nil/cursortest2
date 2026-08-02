package ge;

import ae.C1934a;
import android.app.Application;
import ce.AbstractC2916a;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQResponse;
import je.InterfaceC5131a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: ge.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4377a implements InterfaceC5131a {

    /* renamed from: e, reason: collision with root package name */
    public static C4377a f47236e;

    /* renamed from: a, reason: collision with root package name */
    public final Application f47238a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f47239b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f47240c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0689a f47235d = new C0689a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final Object f47237f = new Object();

    /* renamed from: ge.a$a, reason: collision with other inner class name */
    public static final class C0689a {
        public /* synthetic */ C0689a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4377a a(Application application) {
            C4377a c4377a;
            Intrinsics.checkNotNullParameter(application, "application");
            synchronized (C4377a.f47237f) {
                c4377a = C4377a.f47236e;
                if (c4377a == null) {
                    c4377a = new C4377a(application, null);
                    C4377a.f47236e = c4377a;
                }
            }
            return c4377a;
        }

        public C0689a() {
        }
    }

    /* renamed from: ge.a$b */
    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ae.a invoke() {
            return Ae.a.f447b.b(C4377a.this.f());
        }
    }

    /* renamed from: ge.a$c */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f47242d = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1934a invoke() {
            return C1934a.f15123b.a();
        }
    }

    /* renamed from: ge.a$d */
    public static final class d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f47243n;

        /* renamed from: p, reason: collision with root package name */
        public int f47245p;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f47243n = obj;
            this.f47245p |= Integer.MIN_VALUE;
            return C4377a.this.a(null, null, this);
        }
    }

    /* renamed from: ge.a$e */
    public static final class e extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f47246n;

        /* renamed from: p, reason: collision with root package name */
        public int f47248p;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f47246n = obj;
            this.f47248p |= Integer.MIN_VALUE;
            return C4377a.this.b(null, this);
        }
    }

    public /* synthetic */ C4377a(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // je.InterfaceC5131a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(String str, String str2, Continuation continuation) {
        d dVar;
        int i10;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f47245p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f47245p = i11 - Integer.MIN_VALUE;
                Object obj = dVar.f47243n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = dVar.f47245p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    C1934a h10 = h();
                    dVar.f47245p = 1;
                    obj = h10.e(str, str2, dVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return com.zoho.livechat.android.modules.common.data.remote.responses.a.c((SalesIQResponse) obj);
            }
        }
        dVar = new d(continuation);
        Object obj2 = dVar.f47243n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = dVar.f47245p;
        if (i10 != 0) {
        }
        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c((SalesIQResponse) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // je.InterfaceC5131a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(ie.b bVar, Continuation continuation) {
        e eVar;
        int i10;
        SalesIQResponse b10;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f47248p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f47248p = i11 - Integer.MIN_VALUE;
                Object obj = eVar.f47246n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = eVar.f47248p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String I10 = g().I();
                    if (I10 == null || I10.length() == 0) {
                        b10 = SalesIQResponse.INSTANCE.b(new Throwable("Screen name is null for logDebugInfo"));
                        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(b10);
                    }
                    C1934a h10 = h();
                    AbstractC2916a a10 = he.b.a(bVar);
                    eVar.f47248p = 1;
                    obj = h10.f(I10, a10, eVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                b10 = (SalesIQResponse) obj;
                return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(b10);
            }
        }
        eVar = new e(continuation);
        Object obj2 = eVar.f47246n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = eVar.f47248p;
        if (i10 != 0) {
        }
        b10 = (SalesIQResponse) obj2;
        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(b10);
    }

    public final Application f() {
        return this.f47238a;
    }

    public final Ae.a g() {
        return (Ae.a) this.f47240c.getValue();
    }

    public final C1934a h() {
        return (C1934a) this.f47239b.getValue();
    }

    public C4377a(Application application) {
        this.f47238a = application;
        this.f47239b = LazyKt.lazy(c.f47242d);
        this.f47240c = LazyKt.lazy(new b());
    }
}

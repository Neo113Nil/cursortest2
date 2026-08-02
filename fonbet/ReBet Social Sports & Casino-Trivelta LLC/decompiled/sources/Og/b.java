package Og;

import Ph.P;
import Ph.Q;
import bh.C2422a;
import ch.C2924a;
import ch.InterfaceC2925b;
import hh.AbstractC4509b;
import hh.C4508a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class b implements P {

    /* renamed from: a, reason: collision with root package name */
    public final Ng.a f8636a;

    /* renamed from: b, reason: collision with root package name */
    public Wg.b f8637b;

    /* renamed from: c, reason: collision with root package name */
    public Xg.c f8638c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8639d;

    @NotNull
    private volatile /* synthetic */ int received;

    /* renamed from: e, reason: collision with root package name */
    public static final a f8633e = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final C2924a f8635g = new C2924a("CustomResponse");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8634f = AtomicIntegerFieldUpdater.newUpdater(b.class, "received");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: Og.b$b, reason: collision with other inner class name */
    public static final class C0173b extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f8640n;

        /* renamed from: o, reason: collision with root package name */
        public Object f8641o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f8642p;

        /* renamed from: r, reason: collision with root package name */
        public int f8644r;

        public C0173b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f8642p = obj;
            this.f8644r |= Integer.MIN_VALUE;
            return b.this.a(null, this);
        }
    }

    public b(Ng.a client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f8636a = client;
        this.received = 0;
    }

    public static /* synthetic */ Object h(b bVar, Continuation continuation) {
        return bVar.f().b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x009d, code lost:
    
        if (r7 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C4508a c4508a, Continuation continuation) {
        C0173b c0173b;
        Object obj;
        Object coroutine_suspended;
        int i10;
        b bVar;
        b bVar2;
        Object c10;
        if (continuation instanceof C0173b) {
            c0173b = (C0173b) continuation;
            int i11 = c0173b.f8644r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0173b.f8644r = i11 - Integer.MIN_VALUE;
                obj = c0173b.f8642p;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0173b.f8644r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        if (AbstractC4509b.a(f(), c4508a.a())) {
                            Xg.c f10 = f();
                            Xg.e.c(f());
                            return f10;
                        }
                        if (!b() && !f8634f.compareAndSet(this, 0, 1)) {
                            throw new Og.a(this);
                        }
                        obj = getAttributes().f(f8635g);
                        if (obj == null) {
                            c0173b.f8640n = this;
                            c0173b.f8641o = c4508a;
                            c0173b.f8644r = 1;
                            obj = g(c0173b);
                        }
                        bVar2 = this;
                    } catch (Throwable th2) {
                        th = th2;
                        bVar = this;
                        Q.c(bVar.f(), "Receive failed", th);
                        throw th;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c4508a = (C4508a) c0173b.f8641o;
                        bVar = (b) c0173b.f8640n;
                        try {
                            ResultKt.throwOnFailure(obj);
                            c10 = ((Xg.d) obj).c();
                            if (!Intrinsics.areEqual(c10, C2422a.f25189a)) {
                                c10 = null;
                            }
                            if (c10 != null && !AbstractC4509b.a(c10, c4508a.a())) {
                                throw new c(bVar.f(), Reflection.getOrCreateKotlinClass(c10.getClass()), c4508a.a());
                            }
                            return c10;
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                Q.c(bVar.f(), "Receive failed", th);
                                throw th;
                            } finally {
                                Xg.e.c(bVar.f());
                            }
                        }
                    }
                    c4508a = (C4508a) c0173b.f8641o;
                    bVar2 = (b) c0173b.f8640n;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        bVar = bVar2;
                        Q.c(bVar.f(), "Receive failed", th);
                        throw th;
                    }
                }
                Xg.d dVar = new Xg.d(c4508a, obj);
                Xg.f A02 = bVar2.f8636a.A0();
                c0173b.f8640n = bVar2;
                c0173b.f8641o = c4508a;
                c0173b.f8644r = 2;
                obj = A02.d(bVar2, dVar, c0173b);
                if (obj != coroutine_suspended) {
                    bVar = bVar2;
                    c10 = ((Xg.d) obj).c();
                    if (!Intrinsics.areEqual(c10, C2422a.f25189a)) {
                    }
                    if (c10 != null) {
                        throw new c(bVar.f(), Reflection.getOrCreateKotlinClass(c10.getClass()), c4508a.a());
                    }
                    return c10;
                }
                return coroutine_suspended;
            }
        }
        c0173b = new C0173b(continuation);
        obj = c0173b.f8642p;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c0173b.f8644r;
        if (i10 != 0) {
        }
        Xg.d dVar2 = new Xg.d(c4508a, obj);
        Xg.f A022 = bVar2.f8636a.A0();
        c0173b.f8640n = bVar2;
        c0173b.f8641o = c4508a;
        c0173b.f8644r = 2;
        obj = A022.d(bVar2, dVar2, c0173b);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public boolean b() {
        return this.f8639d;
    }

    public final Ng.a c() {
        return this.f8636a;
    }

    public final Wg.b e() {
        Wg.b bVar = this.f8637b;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("request");
        return null;
    }

    public final Xg.c f() {
        Xg.c cVar = this.f8638c;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("response");
        return null;
    }

    public Object g(Continuation continuation) {
        return h(this, continuation);
    }

    public final InterfaceC2925b getAttributes() {
        return e().getAttributes();
    }

    @Override // Ph.P
    public CoroutineContext getCoroutineContext() {
        return f().getCoroutineContext();
    }

    public final void i(Wg.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f8637b = bVar;
    }

    public final void j(Xg.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f8638c = cVar;
    }

    public final void k(Xg.c response) {
        Intrinsics.checkNotNullParameter(response, "response");
        j(response);
    }

    public String toString() {
        return "HttpClientCall[" + e().getUrl() + ", " + f().f() + ']';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Ng.a client, Wg.d requestData, Wg.g responseData) {
        this(client);
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(responseData, "responseData");
        i(new Wg.a(this, requestData));
        j(new Xg.a(this, responseData));
        if (responseData.a() instanceof io.ktor.utils.io.f) {
            return;
        }
        getAttributes().b(f8635g, responseData.a());
    }
}

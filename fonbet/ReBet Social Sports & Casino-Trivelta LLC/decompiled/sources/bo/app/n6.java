package bo.app;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import Ph.L;
import Ph.P;
import Ph.Q;
import Rh.A;
import com.braze.support.BrazeLogger;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class n6 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Ref.ObjectRef f25792a;

    /* renamed from: b, reason: collision with root package name */
    public Object f25793b;

    /* renamed from: c, reason: collision with root package name */
    public int f25794c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f25795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o6 f25796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f6 f25797f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e6 f25798g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d6 f25799h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f25800i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(o6 o6Var, f6 f6Var, e6 e6Var, d6 d6Var, String str, Continuation continuation) {
        super(2, continuation);
        this.f25796e = o6Var;
        this.f25797f = f6Var;
        this.f25798g = e6Var;
        this.f25799h = d6Var;
        this.f25800i = str;
    }

    public static final String a(String str) {
        return "Starting DUST stream to " + str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String b(Ref.ObjectRef objectRef) {
        return "DUST stream connection failed with response code " + ((HttpURLConnection) objectRef.element).getResponseCode();
    }

    public static final String c() {
        return "Stream connection job cancelled";
    }

    public static final String d() {
        return "Closing stream connection data";
    }

    public static final String e() {
        return "Stream job finished";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        n6 n6Var = new n6(this.f25796e, this.f25797f, this.f25798g, this.f25799h, this.f25800i, continuation);
        n6Var.f25795d = obj;
        return n6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n6) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x016d, code lost:
    
        if (r0 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x01be, code lost:
    
        r20.f25796e.a(false);
        com.braze.support.BrazeLogger.brazelog$default(com.braze.support.BrazeLogger.INSTANCE, bo.app.o6.f25853d, (com.braze.support.BrazeLogger.Priority) null, (java.lang.Throwable) null, false, new c3.C2858y6(), 14, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x01d8, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x01bb, code lost:
    
        r0.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b9, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0176 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:7:0x001d, B:8:0x010c, B:37:0x0170, B:39:0x0176, B:40:0x019d, B:43:0x018a, B:59:0x0067), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018a A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:7:0x001d, B:8:0x010c, B:37:0x0170, B:39:0x0176, B:40:0x019d, B:43:0x018a, B:59:0x0067), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f2  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v7, types: [T, java.net.HttpURLConnection] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        Exception exc;
        HttpURLConnection httpURLConnection;
        Ref.ObjectRef objectRef2;
        HttpURLConnection httpURLConnection2;
        Ref.ObjectRef objectRef3;
        Object g10;
        final Ref.ObjectRef objectRef4;
        P p10 = (P) this.f25795d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r32 = this.f25794c;
        try {
            try {
                try {
                    try {
                        if (r32 == 0) {
                            ResultKt.throwOnFailure(obj);
                            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                            String str = o6.f25853d;
                            final String str2 = this.f25800i;
                            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.r6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return bo.app.n6.a(str2);
                                }
                            }, 14, (Object) null);
                            this.f25796e.a(false);
                            objectRef3 = new Ref.ObjectRef();
                            L b10 = C1452g0.b();
                            m6 m6Var = new m6(this.f25800i, null);
                            this.f25795d = p10;
                            this.f25792a = objectRef3;
                            this.f25793b = objectRef3;
                            this.f25794c = 1;
                            g10 = AbstractC1455i.g(b10, m6Var, this);
                            if (g10 != coroutine_suspended) {
                                objectRef4 = objectRef3;
                            }
                            return coroutine_suspended;
                        }
                        if (r32 == 1) {
                            objectRef3 = (Ref.ObjectRef) this.f25793b;
                            objectRef = this.f25792a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                objectRef4 = objectRef;
                                g10 = obj;
                            } catch (Exception e10) {
                                exc = e10;
                                objectRef2 = objectRef;
                                if (Q.i(p10)) {
                                }
                                this.f25797f.invoke(null);
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.f25853d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.v6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return bo.app.n6.d();
                                    }
                                }, 14, (Object) null);
                                httpURLConnection2 = (HttpURLConnection) objectRef2.element;
                            } catch (Throwable th2) {
                                th = th2;
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.f25853d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.v6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return bo.app.n6.d();
                                    }
                                }, 14, (Object) null);
                                httpURLConnection = (HttpURLConnection) objectRef.element;
                                if (httpURLConnection != null) {
                                }
                                throw th;
                            }
                        } else {
                            if (r32 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Ref.ObjectRef objectRef5 = this.f25792a;
                            ResultKt.throwOnFailure(obj);
                            r32 = objectRef5;
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.f25853d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.t6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return bo.app.n6.a();
                                }
                            }, 14, (Object) null);
                            objectRef4 = r32;
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.f25853d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.v6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return bo.app.n6.d();
                                }
                            }, 14, (Object) null);
                            httpURLConnection2 = (HttpURLConnection) objectRef4.element;
                        }
                        Intrinsics.checkNotNull(g10, "null cannot be cast to non-null type java.net.HttpURLConnection");
                        objectRef3.element = (HttpURLConnection) g10;
                        BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
                        String str3 = o6.f25853d;
                        BrazeLogger.brazelog$default(brazeLogger2, str3, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.s6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return bo.app.n6.a(Ref.ObjectRef.this);
                            }
                        }, 14, (Object) null);
                        IntRange intRange = o6.f25854e;
                        int first = intRange.getFirst();
                        int last = intRange.getLast();
                        int responseCode = ((HttpURLConnection) objectRef4.element).getResponseCode();
                        if (first > responseCode || responseCode > last) {
                            BrazeLogger.brazelog$default(brazeLogger2, str3, BrazeLogger.Priority.f29470E, (Throwable) null, false, new Function0() { // from class: c3.u6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return bo.app.n6.b(Ref.ObjectRef.this);
                                }
                            }, 12, (Object) null);
                            this.f25797f.invoke(Boxing.boxInt(((HttpURLConnection) objectRef4.element).getResponseCode()));
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.f25853d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.v6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return bo.app.n6.d();
                                }
                            }, 14, (Object) null);
                            httpURLConnection2 = (HttpURLConnection) objectRef4.element;
                        } else {
                            this.f25796e.a(true);
                            this.f25798g.invoke();
                            InputStream inputStream = ((HttpURLConnection) objectRef4.element).getInputStream();
                            Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                            BufferedReader inputReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
                            try {
                                Intrinsics.checkNotNullParameter(p10, "<this>");
                                Intrinsics.checkNotNullParameter(inputReader, "inputReader");
                                A e11 = Rh.w.e(p10, null, 0, new k6(inputReader, null), 3, null);
                                o6 o6Var = this.f25796e;
                                d6 d6Var = this.f25799h;
                                this.f25795d = p10;
                                this.f25792a = objectRef4;
                                this.f25793b = SpillingKt.nullOutSpilledVariable(e11);
                                this.f25794c = 2;
                                if (o6Var.a(p10, e11, d6Var, this) != coroutine_suspended) {
                                    r32 = objectRef4;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.f25853d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.t6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return bo.app.n6.a();
                                        }
                                    }, 14, (Object) null);
                                    objectRef4 = r32;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.f25853d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.v6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return bo.app.n6.d();
                                        }
                                    }, 14, (Object) null);
                                    httpURLConnection2 = (HttpURLConnection) objectRef4.element;
                                }
                                return coroutine_suspended;
                            } catch (Exception e12) {
                                exc = e12;
                                objectRef2 = objectRef4;
                                if (Q.i(p10)) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.f25853d, BrazeLogger.Priority.f29470E, (Throwable) exc, false, new Function0() { // from class: c3.w6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return bo.app.n6.b();
                                        }
                                    }, 8, (Object) null);
                                } else {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.f25853d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.x6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return bo.app.n6.c();
                                        }
                                    }, 14, (Object) null);
                                }
                                this.f25797f.invoke(null);
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.f25853d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.v6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return bo.app.n6.d();
                                    }
                                }, 14, (Object) null);
                                httpURLConnection2 = (HttpURLConnection) objectRef2.element;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        objectRef = objectRef4;
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.f25853d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.v6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return bo.app.n6.d();
                            }
                        }, 14, (Object) null);
                        httpURLConnection = (HttpURLConnection) objectRef.element;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (Exception e13) {
                    e = e13;
                    r32 = objectRef4;
                    exc = e;
                    objectRef2 = r32;
                    if (Q.i(p10)) {
                    }
                    this.f25797f.invoke(null);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.f25853d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.v6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.n6.d();
                        }
                    }, 14, (Object) null);
                    httpURLConnection2 = (HttpURLConnection) objectRef2.element;
                }
            } catch (Throwable th4) {
                th = th4;
                objectRef = r32;
            }
        } catch (Exception e14) {
            e = e14;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String a(Ref.ObjectRef objectRef) {
        return "DUST stream response code " + ((HttpURLConnection) objectRef.element).getResponseCode();
    }

    public static final String b() {
        return "Caught unexpected exception listening to DUST stream";
    }

    public static final String a() {
        return "Stream job coroutine no longer active";
    }
}

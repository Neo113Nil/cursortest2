package bo.app;

import Ph.AbstractC1457j;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.F0;
import Ph.P;
import Ph.Q;
import Rh.A;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.plaid.internal.EnumC3631g;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o6 {

    /* renamed from: d, reason: collision with root package name */
    public static final String f25853d = BrazeLogger.getBrazeLogTag((Class<?>) o6.class);

    /* renamed from: e, reason: collision with root package name */
    public static final IntRange f25854e = new IntRange(200, EnumC3631g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE);

    /* renamed from: f, reason: collision with root package name */
    public static final IntRange f25855f = new IntRange(400, 499);

    /* renamed from: g, reason: collision with root package name */
    public static final IntRange f25856g = new IntRange(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, 599);

    /* renamed from: a, reason: collision with root package name */
    public C0 f25857a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f25858b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f25859c = new AtomicLong(DateTimeUtils.nowInMilliseconds());

    public static final String a(o6 o6Var) {
        return "Got call to endStream(). Stream job: " + o6Var.f25857a;
    }

    public static final String c(o6 o6Var) {
        return "Not restarting stream since " + o6Var.f25857a + " is still active.";
    }

    public static final String d(String str) {
        return "Got call to startStream() for url " + str;
    }

    public final void b() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.l7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.o6.a(bo.app.o6.this);
            }
        }, 7, (Object) null);
        C0 c02 = this.f25857a;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        this.f25857a = null;
    }

    public static final String c(String str) {
        return "Failed to parse data line:\n" + str;
    }

    public static final String d(o6 o6Var) {
        return "Started stream job " + o6Var.f25857a;
    }

    public final void a(final String url, d6 ingestor, e6 onConnectionSuccess, f6 onConnectionFailed, boolean z10) {
        C0 d10;
        C0 c02;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(ingestor, "ingestor");
        Intrinsics.checkNotNullParameter(onConnectionSuccess, "onConnectionSuccess");
        Intrinsics.checkNotNullParameter(onConnectionFailed, "onConnectionFailed");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.m7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.o6.d(url);
            }
        }, 7, (Object) null);
        if (z10 && (c02 = this.f25857a) != null && c02.isActive()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.n7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o6.c(bo.app.o6.this);
                }
            }, 7, (Object) null);
            return;
        }
        AbstractC1457j.b(null, new l6(this, null), 1, null);
        d10 = AbstractC1459k.d(BrazeCoroutineScope.INSTANCE, null, null, new n6(this, onConnectionFailed, onConnectionSuccess, ingestor, url, null), 3, null);
        this.f25857a = d10;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.o7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.o6.d(bo.app.o6.this);
            }
        }, 7, (Object) null);
    }

    public static final String b(Ref.ObjectRef objectRef) {
        return "Recorded data type: " + objectRef.element;
    }

    public static final String b(String str) {
        return "Got un-actionable stream line:\n" + str;
    }

    public static final String b(o6 o6Var) {
        return "Got call to endStreamAndJoin(). Stream job: " + o6Var.f25857a;
    }

    public static final String b(String str, String str2) {
        return "Not handling event: '" + str + "' and data: '" + str2 + "'";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0095 -> B:10:0x009a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(P p10, A a10, d6 d6Var, ContinuationImpl continuationImpl) {
        h6 h6Var;
        int i10;
        final Ref.ObjectRef objectRef;
        h6 h6Var2;
        final Ref.ObjectRef objectRef2;
        P p11;
        d6 d6Var2;
        if (continuationImpl instanceof h6) {
            h6Var = (h6) continuationImpl;
            int i11 = h6Var.f25515h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                h6Var.f25515h = i11 - Integer.MIN_VALUE;
                Object obj = h6Var.f25513f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = h6Var.f25515h;
                int i12 = 1;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    objectRef3.element = "";
                    Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                    objectRef4.element = "";
                    objectRef = objectRef3;
                    h6Var2 = h6Var;
                    objectRef2 = objectRef4;
                    p11 = p10;
                    d6Var2 = d6Var;
                    r1 = a10;
                    if (Q.i(p11)) {
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ref.ObjectRef objectRef5 = h6Var.f25512e;
                    Ref.ObjectRef objectRef6 = h6Var.f25511d;
                    ?? r82 = h6Var.f25510c;
                    A a11 = h6Var.f25509b;
                    P p12 = h6Var.f25508a;
                    ResultKt.throwOnFailure(obj);
                    h6Var2 = h6Var;
                    A a12 = a11;
                    objectRef = objectRef6;
                    objectRef2 = objectRef5;
                    d6Var2 = r82;
                    final String str = (String) obj;
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    String str2 = f25853d;
                    BrazeLogger.brazelog$default(brazeLogger, str2, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.d7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.o6.a(str);
                        }
                    }, 12, (Object) null);
                    if (!StringsKt.startsWith$default(str, "event: ", false, 2, (Object) null)) {
                        ?? substring = str.substring(7);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        objectRef.element = substring;
                        BrazeLogger.brazelog$default(brazeLogger, str2, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.e7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return bo.app.o6.a(Ref.ObjectRef.this);
                            }
                        }, 14, (Object) null);
                        a10 = a12;
                    } else {
                        a10 = a12;
                        if (StringsKt.startsWith$default(str, "data: ", false, 2, (Object) null)) {
                            Object obj2 = objectRef2.element;
                            String substring2 = str.substring(6);
                            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                            objectRef2.element = obj2 + substring2;
                            BrazeLogger.brazelog$default(brazeLogger, str2, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.f7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return bo.app.o6.b(Ref.ObjectRef.this);
                                }
                            }, 14, (Object) null);
                        } else if (StringsKt.isBlank(str)) {
                            BrazeLogger.brazelog$default(brazeLogger, str2, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.g7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return bo.app.o6.a(Ref.ObjectRef.this, objectRef2);
                                }
                            }, 14, (Object) null);
                            a((String) objectRef.element, (String) objectRef2.element, d6Var2);
                            objectRef2.element = "";
                            objectRef.element = "";
                        } else {
                            objectRef.element = "";
                            objectRef2.element = "";
                            BrazeLogger.brazelog$default(brazeLogger, str2, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.h7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return bo.app.o6.b(str);
                                }
                            }, 14, (Object) null);
                        }
                    }
                    p11 = p12;
                    i12 = 1;
                    a12 = a10;
                    if (Q.i(p11)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f25853d, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.c7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return bo.app.o6.a();
                            }
                        }, 12, (Object) null);
                        h6Var2.f25508a = p11;
                        h6Var2.f25509b = a12;
                        h6Var2.f25510c = d6Var2;
                        h6Var2.f25511d = objectRef;
                        h6Var2.f25512e = objectRef2;
                        h6Var2.f25515h = i12;
                        Object m10 = a12.m(h6Var2);
                        if (m10 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        p12 = p11;
                        obj = m10;
                        final String str3 = (String) obj;
                        BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
                        String str22 = f25853d;
                        BrazeLogger.brazelog$default(brazeLogger2, str22, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.d7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return bo.app.o6.a(str3);
                            }
                        }, 12, (Object) null);
                        if (!StringsKt.startsWith$default(str3, "event: ", false, 2, (Object) null)) {
                        }
                        p11 = p12;
                        i12 = 1;
                        a12 = a10;
                        if (Q.i(p11)) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        h6Var = new h6(this, continuationImpl);
        Object obj3 = h6Var.f25513f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = h6Var.f25515h;
        int i122 = 1;
        if (i10 != 0) {
        }
    }

    public static final String a() {
        return "Waiting to consume new line";
    }

    public static final String a(String str) {
        return "Received new line: '" + str + "'";
    }

    public static final String a(Ref.ObjectRef objectRef) {
        return "Recorded event type: " + objectRef.element;
    }

    public static final String a(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        return "Handling full event on blank line. lastEventType: '" + objectRef.element + "' \ndata: '" + objectRef2.element + "'";
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (Ph.AbstractC1440a0.a(50, r0) != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        i6 i6Var;
        int i10;
        int i11;
        C0 c02;
        if (continuationImpl instanceof i6) {
            i6Var = (i6) continuationImpl;
            int i12 = i6Var.f25565e;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                i6Var.f25565e = i12 - Integer.MIN_VALUE;
                Object obj = i6Var.f25563c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = i6Var.f25565e;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f25853d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.p7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.o6.b(bo.app.o6.this);
                        }
                    }, 14, (Object) null);
                    C0 c03 = this.f25857a;
                    if (c03 != null) {
                        i6Var.f25561a = SpillingKt.nullOutSpilledVariable(c03);
                        i11 = 0;
                        i6Var.f25562b = 0;
                        i6Var.f25565e = 1;
                        if (F0.f(c03, i6Var) != coroutine_suspended) {
                            c02 = c03;
                            i6Var.f25561a = SpillingKt.nullOutSpilledVariable(c02);
                            i6Var.f25562b = i11;
                            i6Var.f25565e = 2;
                        }
                        return coroutine_suspended;
                    }
                    this.f25857a = null;
                    return Unit.INSTANCE;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.f25857a = null;
                    return Unit.INSTANCE;
                }
                i11 = i6Var.f25562b;
                c02 = (C0) i6Var.f25561a;
                ResultKt.throwOnFailure(obj);
                i6Var.f25561a = SpillingKt.nullOutSpilledVariable(c02);
                i6Var.f25562b = i11;
                i6Var.f25565e = 2;
            }
        }
        i6Var = new i6(this, continuationImpl);
        Object obj2 = i6Var.f25563c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = i6Var.f25565e;
        if (i10 != 0) {
        }
    }

    public static void a(final String eventType, final String data, Function1 ingestor) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(ingestor, "ingestor");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str = f25853d;
        BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.b7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.o6.a(eventType, data);
            }
        }, 14, (Object) null);
        if (Intrinsics.areEqual(eventType, "msg")) {
            try {
                final JSONObject jSONObject = new JSONObject(data);
                BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.i7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.o6.a(jSONObject);
                    }
                }, 14, (Object) null);
                ingestor.invoke(i9.f25566a.a(jSONObject));
                return;
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f25853d, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.j7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.o6.c(data);
                    }
                }, 8, (Object) null);
                return;
            }
        }
        BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.k7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.o6.b(eventType, data);
            }
        }, 14, (Object) null);
    }

    public static final String a(String str, String str2) {
        return "Got event '" + str + "' and data: '" + str2 + "'";
    }

    public static final String a(JSONObject jSONObject) {
        return "Parsed dust message json to:\n" + JsonUtils.getPrettyPrintedString(jSONObject);
    }

    public final void a(final boolean z10) {
        this.f25858b.set(z10);
        this.f25859c.set(z10 ? DateTimeUtils.nowInMilliseconds() : 0L);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f25853d, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.q7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.o6.a(z10, this);
            }
        }, 12, (Object) null);
    }

    public static final String a(boolean z10, o6 o6Var) {
        return "Set stream listening state to " + z10 + " and stream listen started at " + o6Var.f25859c;
    }
}

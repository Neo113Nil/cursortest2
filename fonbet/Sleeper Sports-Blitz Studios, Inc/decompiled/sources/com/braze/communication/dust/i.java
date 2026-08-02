package com.braze.communication.dust;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.managers.d0;
import com.braze.managers.e0;
import com.braze.managers.f0;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import io.sentry.HttpStatusCodeRange;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class i implements j {
    public static final String d = BrazeLogger.getBrazeLogTag((Class<?>) i.class);
    public static final IntRange e = new IntRange(200, 299);
    public static final IntRange f = new IntRange(400, 499);
    public static final IntRange g = new IntRange(500, HttpStatusCodeRange.DEFAULT_MAX);

    /* renamed from: a, reason: collision with root package name */
    public Job f482a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicLong c = new AtomicLong(DateTimeUtils.nowInMilliseconds());

    public static final String a(i iVar) {
        return "Got call to endStream(). Stream job: " + iVar.f482a;
    }

    public static final String c(i iVar) {
        return "Not restarting stream since " + iVar.f482a + " is still active.";
    }

    public static final String d(String str) {
        return "Got call to startStream() for url " + str;
    }

    public final void b() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.i$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.a(i.this);
            }
        }, 7, (Object) null);
        Job job = this.f482a;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f482a = null;
    }

    public static final String c(String str) {
        return "Failed to parse data line:\n" + str;
    }

    public static final String d(i iVar) {
        return "Started stream job " + iVar.f482a;
    }

    public final void a(final String url, d0 ingestor, e0 onConnectionSuccess, f0 onConnectionFailed, boolean z) {
        Job launch$default;
        Job job;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(ingestor, "ingestor");
        Intrinsics.checkNotNullParameter(onConnectionSuccess, "onConnectionSuccess");
        Intrinsics.checkNotNullParameter(onConnectionFailed, "onConnectionFailed");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.i$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.d(url);
            }
        }, 7, (Object) null);
        if (z && (job = this.f482a) != null && job.isActive()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.i$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i.c(i.this);
                }
            }, 7, (Object) null);
            return;
        }
        BuildersKt__BuildersKt.runBlocking$default(null, new f(this, null), 1, null);
        launch$default = BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new h(this, onConnectionFailed, onConnectionSuccess, ingestor, url, null), 3, null);
        this.f482a = launch$default;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.i$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.d(i.this);
            }
        }, 7, (Object) null);
    }

    public static final String b(Ref.ObjectRef objectRef) {
        return "Recorded data type: " + objectRef.element;
    }

    public static final String b(String str) {
        return "Got un-actionable stream line:\n" + str;
    }

    public static final String b(i iVar) {
        return "Got call to endStreamAndJoin(). Stream job: " + iVar.f482a;
    }

    public static final String b(String str, String str2) {
        return "Not handling event: '" + str + "' and data: '" + str2 + "'";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009b -> B:10:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(CoroutineScope coroutineScope, ReceiveChannel receiveChannel, d0 d0Var, ContinuationImpl continuationImpl) {
        b bVar;
        i iVar;
        int i;
        final Ref.ObjectRef objectRef;
        b bVar2;
        i iVar2;
        final Ref.ObjectRef objectRef2;
        CoroutineScope coroutineScope2;
        ReceiveChannel receiveChannel2;
        d0 d0Var2;
        if (continuationImpl instanceof b) {
            bVar = (b) continuationImpl;
            int i2 = bVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.i = i2 - Integer.MIN_VALUE;
                iVar = this;
                Object obj = bVar.g;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.i;
                int i3 = 1;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    objectRef3.element = "";
                    Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                    objectRef4.element = "";
                    objectRef = objectRef3;
                    bVar2 = bVar;
                    iVar2 = iVar;
                    objectRef2 = objectRef4;
                    coroutineScope2 = coroutineScope;
                    receiveChannel2 = receiveChannel;
                    d0Var2 = d0Var;
                    if (CoroutineScopeKt.isActive(coroutineScope2)) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ref.ObjectRef objectRef5 = bVar.f;
                    Ref.ObjectRef objectRef6 = bVar.e;
                    ?? r8 = bVar.d;
                    ReceiveChannel receiveChannel3 = bVar.c;
                    CoroutineScope coroutineScope3 = bVar.b;
                    iVar2 = bVar.f475a;
                    ResultKt.throwOnFailure(obj);
                    bVar2 = bVar;
                    receiveChannel2 = receiveChannel3;
                    objectRef = objectRef6;
                    objectRef2 = objectRef5;
                    d0Var2 = r8;
                    final String str = (String) obj;
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    String str2 = d;
                    BrazeLogger.brazelog$default(brazeLogger, str2, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.i$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return i.a(str);
                        }
                    }, 12, (Object) null);
                    ReceiveChannel receiveChannel4 = receiveChannel2;
                    if (StringsKt.startsWith$default(str, "event: ", false, 2, (Object) null)) {
                        objectRef.element = a.a(str, "event: ");
                        BrazeLogger.brazelog$default(brazeLogger, str2, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.i$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return i.a(Ref.ObjectRef.this);
                            }
                        }, 14, (Object) null);
                    } else if (StringsKt.startsWith$default(str, "data: ", false, 2, (Object) null)) {
                        objectRef2.element = objectRef2.element + a.a(str, "data: ");
                        BrazeLogger.brazelog$default(brazeLogger, str2, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.i$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return i.b(Ref.ObjectRef.this);
                            }
                        }, 14, (Object) null);
                    } else if (StringsKt.isBlank(str)) {
                        BrazeLogger.brazelog$default(brazeLogger, str2, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.i$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return i.a(Ref.ObjectRef.this, objectRef2);
                            }
                        }, 14, (Object) null);
                        String str3 = (String) objectRef.element;
                        String str4 = (String) objectRef2.element;
                        iVar2.getClass();
                        a(str3, str4, d0Var2);
                        objectRef2.element = "";
                        objectRef.element = "";
                    } else {
                        objectRef.element = "";
                        objectRef2.element = "";
                        BrazeLogger.brazelog$default(brazeLogger, str2, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.i$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return i.b(str);
                            }
                        }, 14, (Object) null);
                    }
                    receiveChannel2 = receiveChannel4;
                    coroutineScope2 = coroutineScope3;
                    i3 = 1;
                    if (CoroutineScopeKt.isActive(coroutineScope2)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, d, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.i$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return i.a();
                            }
                        }, 12, (Object) null);
                        bVar2.f475a = iVar2;
                        bVar2.b = coroutineScope2;
                        bVar2.c = receiveChannel2;
                        bVar2.d = d0Var2;
                        bVar2.e = objectRef;
                        bVar2.f = objectRef2;
                        bVar2.i = i3;
                        Object receive = receiveChannel2.receive(bVar2);
                        if (receive == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coroutineScope3 = coroutineScope2;
                        obj = receive;
                        final String str5 = (String) obj;
                        BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
                        String str22 = d;
                        BrazeLogger.brazelog$default(brazeLogger2, str22, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.i$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return i.a(str5);
                            }
                        }, 12, (Object) null);
                        ReceiveChannel receiveChannel42 = receiveChannel2;
                        if (StringsKt.startsWith$default(str5, "event: ", false, 2, (Object) null)) {
                        }
                        receiveChannel2 = receiveChannel42;
                        coroutineScope2 = coroutineScope3;
                        i3 = 1;
                        if (CoroutineScopeKt.isActive(coroutineScope2)) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        iVar = this;
        bVar = new b(iVar, continuationImpl);
        Object obj2 = bVar.g;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.i;
        int i32 = 1;
        if (i != 0) {
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        c cVar;
        int i;
        i iVar;
        i iVar2;
        if (continuationImpl instanceof c) {
            cVar = (c) continuationImpl;
            int i2 = cVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.d = i2 - Integer.MIN_VALUE;
                Object obj = cVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.i$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return i.b(i.this);
                        }
                    }, 14, (Object) null);
                    Job job = this.f482a;
                    if (job != null) {
                        cVar.f476a = this;
                        cVar.d = 1;
                        if (JobKt.cancelAndJoin(job, cVar) != coroutine_suspended) {
                            iVar2 = this;
                            cVar.f476a = iVar2;
                            cVar.d = 2;
                            if (DelayKt.delay(50L, cVar) != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    iVar = this;
                    iVar.f482a = null;
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar = cVar.f476a;
                    ResultKt.throwOnFailure(obj);
                    iVar.f482a = null;
                    return Unit.INSTANCE;
                }
                iVar2 = cVar.f476a;
                ResultKt.throwOnFailure(obj);
                cVar.f476a = iVar2;
                cVar.d = 2;
                if (DelayKt.delay(50L, cVar) != coroutine_suspended) {
                    iVar = iVar2;
                    iVar.f482a = null;
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }
        cVar = new c(this, continuationImpl);
        Object obj2 = cVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.d;
        if (i != 0) {
        }
    }

    public static void a(final String eventType, final String data, Function1 ingestor) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(ingestor, "ingestor");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str = d;
        BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.i$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.a(eventType, data);
            }
        }, 14, (Object) null);
        if (Intrinsics.areEqual(eventType, "msg")) {
            try {
                final JSONObject jSONObject = new JSONObject(data);
                BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.i$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return i.a(jSONObject);
                    }
                }, 14, (Object) null);
                ingestor.invoke(com.braze.models.dust.e.f625a.a(jSONObject));
                return;
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, d, BrazeLogger.Priority.E, (Throwable) e2, false, new Function0() { // from class: com.braze.communication.dust.i$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return i.c(data);
                    }
                }, 8, (Object) null);
                return;
            }
        }
        BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.i$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.b(eventType, data);
            }
        }, 14, (Object) null);
    }

    public static final String a(String str, String str2) {
        return "Got event '" + str + "' and data: '" + str2 + "'";
    }

    public static final String a(JSONObject jSONObject) {
        return "Parsed dust message json to:\n" + JsonUtils.getPrettyPrintedString(jSONObject);
    }

    public final void a(final boolean z) {
        this.b.set(z);
        this.c.set(z ? DateTimeUtils.nowInMilliseconds() : 0L);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, d, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.i$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.a(z, this);
            }
        }, 12, (Object) null);
    }

    public static final String a(boolean z, i iVar) {
        return "Set stream listening state to " + z + " and stream listen started at " + iVar.c;
    }
}

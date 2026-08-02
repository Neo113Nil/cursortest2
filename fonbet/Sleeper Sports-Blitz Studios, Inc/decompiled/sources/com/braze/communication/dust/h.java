package com.braze.communication.dust;

import com.braze.managers.d0;
import com.braze.managers.e0;
import com.braze.managers.f0;
import com.braze.support.BrazeLogger;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;

/* loaded from: classes6.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Ref.ObjectRef f481a;
    public Ref.ObjectRef b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ i e;
    public final /* synthetic */ f0 f;
    public final /* synthetic */ e0 g;
    public final /* synthetic */ d0 h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, f0 f0Var, e0 e0Var, d0 d0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.e = iVar;
        this.f = f0Var;
        this.g = e0Var;
        this.h = d0Var;
        this.i = str;
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
        h hVar = new h(this.e, this.f, this.g, this.h, this.i, continuation);
        hVar.d = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x015d, code lost:
    
        if (r0 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x01b4, code lost:
    
        r18.e.a(false);
        com.braze.support.BrazeLogger.brazelog$default(com.braze.support.BrazeLogger.INSTANCE, com.braze.communication.dust.i.d, (com.braze.support.BrazeLogger.Priority) null, (java.lang.Throwable) null, false, new com.braze.communication.dust.h$$ExternalSyntheticLambda7(), 14, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x01cd, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x01b1, code lost:
    
        r0.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01af, code lost:
    
        if (r0 != null) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016f A[Catch: all -> 0x0123, TryCatch #2 {all -> 0x0123, blocks: (B:8:0x0019, B:9:0x010f, B:20:0x0169, B:22:0x016f, B:23:0x0194, B:27:0x0182), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0182 A[Catch: all -> 0x0123, TryCatch #2 {all -> 0x0123, blocks: (B:8:0x0019, B:9:0x010f, B:20:0x0169, B:22:0x016f, B:23:0x0194, B:27:0x0182), top: B:7:0x0019 }] */
    /* JADX WARN: Type inference failed for: r8v5, types: [T, java.net.HttpURLConnection] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final Ref.ObjectRef objectRef;
        Exception exc;
        CoroutineScope coroutineScope;
        Ref.ObjectRef objectRef2;
        Object withContext;
        CoroutineScope coroutineScope2;
        Ref.ObjectRef objectRef3;
        HttpURLConnection httpURLConnection;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        try {
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.d;
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    String str = i.d;
                    final String str2 = this.i;
                    BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.h$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return h.a(str2);
                        }
                    }, 14, (Object) null);
                    this.e.a(false);
                    objectRef = new Ref.ObjectRef();
                    try {
                        CoroutineDispatcher io2 = Dispatchers.getIO();
                        g gVar = new g(this.i, null);
                        this.d = coroutineScope3;
                        this.f481a = objectRef;
                        this.b = objectRef;
                        this.c = 1;
                        withContext = BuildersKt.withContext(io2, gVar, this);
                        if (withContext != coroutine_suspended) {
                            coroutineScope2 = coroutineScope3;
                            objectRef3 = objectRef;
                        }
                        return coroutine_suspended;
                    } catch (Exception e) {
                        exc = e;
                        coroutineScope = coroutineScope3;
                        objectRef2 = objectRef;
                        if (CoroutineScopeKt.isActive(coroutineScope)) {
                        }
                        this.f.invoke(null);
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, i.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.h$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return h.d();
                            }
                        }, 14, (Object) null);
                        httpURLConnection = (HttpURLConnection) objectRef2.element;
                    }
                } else if (i == 1) {
                    objectRef3 = this.b;
                    objectRef = this.f481a;
                    CoroutineScope coroutineScope4 = (CoroutineScope) this.d;
                    try {
                        ResultKt.throwOnFailure(obj);
                        coroutineScope2 = coroutineScope4;
                        withContext = obj;
                    } catch (Exception e2) {
                        exc = e2;
                        objectRef2 = objectRef;
                        coroutineScope = coroutineScope4;
                        if (CoroutineScopeKt.isActive(coroutineScope)) {
                        }
                        this.f.invoke(null);
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, i.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.h$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return h.d();
                            }
                        }, 14, (Object) null);
                        httpURLConnection = (HttpURLConnection) objectRef2.element;
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = this.f481a;
                    coroutineScope = (CoroutineScope) this.d;
                    try {
                        try {
                            ResultKt.throwOnFailure(obj);
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, i.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.h$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return h.a();
                                }
                            }, 14, (Object) null);
                            objectRef = objectRef2;
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, i.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.h$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return h.d();
                                }
                            }, 14, (Object) null);
                            httpURLConnection = (HttpURLConnection) objectRef.element;
                        } catch (Exception e3) {
                            exc = e3;
                            if (CoroutineScopeKt.isActive(coroutineScope)) {
                            }
                            this.f.invoke(null);
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, i.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.h$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return h.d();
                                }
                            }, 14, (Object) null);
                            httpURLConnection = (HttpURLConnection) objectRef2.element;
                        }
                    } catch (Throwable th) {
                        th = th;
                        Ref.ObjectRef objectRef4 = objectRef2;
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, i.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.h$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return h.d();
                            }
                        }, 14, (Object) null);
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) objectRef4.element;
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        throw th;
                    }
                }
                Intrinsics.checkNotNull(withContext, "null cannot be cast to non-null type java.net.HttpURLConnection");
                objectRef3.element = (HttpURLConnection) withContext;
                BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
                String str3 = i.d;
                BrazeLogger.brazelog$default(brazeLogger2, str3, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.h$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h.a(Ref.ObjectRef.this);
                    }
                }, 14, (Object) null);
                IntRange intRange = i.e;
                int first = intRange.getFirst();
                int last = intRange.getLast();
                int responseCode = ((HttpURLConnection) objectRef.element).getResponseCode();
                if (first <= responseCode && responseCode <= last) {
                    this.e.a(true);
                    this.g.invoke();
                    InputStream inputStream = ((HttpURLConnection) objectRef.element).getInputStream();
                    Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                    Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
                    BufferedReader inputReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                    Intrinsics.checkNotNullParameter(coroutineScope2, "<this>");
                    Intrinsics.checkNotNullParameter(inputReader, "inputReader");
                    ReceiveChannel produce$default = ProduceKt.produce$default(coroutineScope2, null, 0, new e(inputReader, null), 3, null);
                    i iVar = this.e;
                    d0 d0Var = this.h;
                    this.d = coroutineScope2;
                    this.f481a = objectRef;
                    this.b = null;
                    this.c = 2;
                    if (iVar.a(coroutineScope2, produce$default, d0Var, this) != coroutine_suspended) {
                        objectRef2 = objectRef;
                        coroutineScope = coroutineScope2;
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, i.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.h$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return h.a();
                            }
                        }, 14, (Object) null);
                        objectRef = objectRef2;
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, i.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.h$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return h.d();
                            }
                        }, 14, (Object) null);
                        httpURLConnection = (HttpURLConnection) objectRef.element;
                    }
                    return coroutine_suspended;
                }
                BrazeLogger.brazelog$default(brazeLogger2, str3, BrazeLogger.Priority.E, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.h$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h.b(Ref.ObjectRef.this);
                    }
                }, 12, (Object) null);
                this.f.invoke(Boxing.boxInt(((HttpURLConnection) objectRef.element).getResponseCode()));
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, i.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.h$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h.d();
                    }
                }, 14, (Object) null);
                httpURLConnection = (HttpURLConnection) objectRef.element;
            } catch (Exception e4) {
                exc = e4;
                objectRef2 = objectRef;
                coroutineScope = coroutineScope2;
                if (CoroutineScopeKt.isActive(coroutineScope)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, i.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.h$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return h.c();
                        }
                    }, 14, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, i.d, BrazeLogger.Priority.E, (Throwable) exc, false, new Function0() { // from class: com.braze.communication.dust.h$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return h.b();
                        }
                    }, 8, (Object) null);
                }
                this.f.invoke(null);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, i.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.dust.h$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h.d();
                    }
                }, 14, (Object) null);
                httpURLConnection = (HttpURLConnection) objectRef2.element;
            }
        } catch (Throwable th2) {
            th = th2;
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

package com.moloco.sdk.internal.ilrd;

import android.util.Base64;
import androidx.compose.material.TextFieldImplKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ironsource.InterfaceC2517l1;
import com.ironsource.X3;
import com.moloco.sdk.IlrdRequest;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.d;
import com.moloco.sdk.internal.services.AbstractC2808c;
import com.moloco.sdk.internal.services.InterfaceC2809d;
import com.moloco.sdk.internal.services.J;
import com.moloco.sdk.internal.services.w;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.http.ContentType;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.zip.GZIPOutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes7.dex */
public final class b implements DefaultLifecycleObserver {
    public static final c s = new c(null);
    public static final int t = 8;
    public static final String u = "IlrdEventsRepository";
    public static final String v = "ilrd_session_store";
    public static final String w = "ilrd_events_store";
    public final CoroutineScope a;
    public final String b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i c;
    public final long d;
    public final int e;
    public final long f;
    public final long g;
    public final J h;
    public final InterfaceC2809d i;
    public final String j;
    public final String k;
    public final w l;
    public final com.moloco.sdk.internal.ilrd.e m;
    public final com.moloco.sdk.internal.ilrd.e n;
    public final com.moloco.sdk.internal.ilrd.e o;
    public final Mutex p;
    public com.moloco.sdk.internal.ilrd.a q;
    public final List<IlrdRequest.ImpressionLevelRevenue> r;

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$1", f = "IlrdEventsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Lifecycle b;
        public final /* synthetic */ b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Lifecycle lifecycle, b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = lifecycle;
            this.c = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.addObserver(this.c);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$2", f = "IlrdEventsRepository.kt", i = {0, 1}, l = {499, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    /* renamed from: com.moloco.sdk.internal.ilrd.b$b, reason: collision with other inner class name */
    public static final class C0237b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;

        public C0237b(Continuation<? super C0237b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C0237b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new C0237b(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
        
            if (r7.lock(null, r6) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            b bVar;
            Mutex mutex2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    mutex = b.this.p;
                    bVar = b.this;
                    this.a = mutex;
                    this.b = bVar;
                    this.c = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) this.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            Unit unit = Unit.INSTANCE;
                            mutex2.unlock(null);
                            return unit;
                        } catch (Throwable th) {
                            Mutex mutex3 = mutex2;
                            th = th;
                            mutex = mutex3;
                            mutex.unlock(null);
                            throw th;
                        }
                    }
                    bVar = (b) this.b;
                    Mutex mutex4 = (Mutex) this.a;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex4;
                }
                this.a = mutex;
                this.b = null;
                this.c = 2;
                if (bVar.a(this) != coroutine_suspended) {
                    mutex2 = mutex;
                    Unit unit2 = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return unit2;
                }
                return coroutine_suspended;
            } catch (Throwable th2) {
                th = th2;
                mutex.unlock(null);
                throw th;
            }
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void a() {
        }

        public static /* synthetic */ void b() {
        }

        public c() {
        }

        public final byte[] a(byte[] bArr) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(bArr);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(gZIPOutputStream, null);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                    Intrinsics.checkNotNullExpressionValue(byteArray, "use(...)");
                    return byteArray;
                } finally {
                }
            } finally {
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$onEvent$1", f = "IlrdEventsRepository.kt", i = {0, 0, 1, 1, 2, 2}, l = {499, 251, 259, 267}, m = "invokeSuspend", n = {"shouldSend", "$this$withLock_u24default$iv", "shouldSend", "$this$withLock_u24default$iv", "shouldSend", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public final /* synthetic */ d.a g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(d.a aVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.g = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new d(this.g, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x013a, code lost:
        
            if (r0.b(r20) == r2) goto L49;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0121 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:15:0x0032, B:16:0x011b, B:18:0x0121, B:19:0x0123), top: B:14:0x0032 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ef A[Catch: all -> 0x004e, TryCatch #2 {all -> 0x004e, blocks: (B:31:0x004a, B:32:0x00b2, B:34:0x00ef, B:35:0x00f5), top: B:30:0x004a }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ref.BooleanRef booleanRef;
            b bVar;
            Mutex mutex;
            d.a aVar;
            Mutex mutex2;
            b bVar2;
            Ref.BooleanRef booleanRef2;
            Mutex mutex3;
            b bVar3;
            Ref.BooleanRef booleanRef3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    booleanRef = new Ref.BooleanRef();
                    Mutex mutex4 = b.this.p;
                    bVar = b.this;
                    d.a aVar2 = this.g;
                    this.a = booleanRef;
                    this.b = mutex4;
                    this.c = bVar;
                    this.d = aVar2;
                    this.e = 1;
                    if (mutex4.lock(null, this) != coroutine_suspended) {
                        mutex = mutex4;
                        aVar = aVar2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        bVar3 = (b) this.c;
                        mutex3 = (Mutex) this.b;
                        booleanRef3 = (Ref.BooleanRef) this.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            if (bVar3.h()) {
                                booleanRef3.element = true;
                            }
                            Unit unit = Unit.INSTANCE;
                            mutex3.unlock(null);
                            if (booleanRef3.element) {
                                b bVar4 = b.this;
                                this.a = null;
                                this.b = null;
                                this.c = null;
                                this.e = 4;
                            }
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            th = th;
                            mutex3.unlock(null);
                            throw th;
                        }
                    }
                    aVar = (d.a) this.d;
                    bVar2 = (b) this.c;
                    mutex2 = (Mutex) this.b;
                    booleanRef2 = (Ref.BooleanRef) this.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        IlrdRequest.ImpressionLevelRevenue a = bVar2.a(aVar);
                        List<IlrdRequest.ImpressionLevelRevenue> b = bVar2.b();
                        Intrinsics.checkNotNull(a);
                        b.add(a);
                        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                        StringBuilder append = new StringBuilder("Event id ").append(a.getEventId()).append(" added. Count: ").append(bVar2.b().size()).append(", current events in session: ");
                        com.moloco.sdk.internal.ilrd.a e = bVar2.e();
                        MolocoLogger.info$default(molocoLogger, b.u, append.append(e == null ? e.b() : null).toString(), null, false, 12, null);
                        this.a = booleanRef2;
                        this.b = mutex2;
                        this.c = bVar2;
                        this.d = null;
                        this.e = 3;
                        if (bVar2.c(this) != coroutine_suspended) {
                            bVar3 = bVar2;
                            mutex3 = mutex2;
                            booleanRef3 = booleanRef2;
                            if (bVar3.h()) {
                            }
                            Unit unit2 = Unit.INSTANCE;
                            mutex3.unlock(null);
                            if (booleanRef3.element) {
                            }
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex3 = mutex2;
                        mutex3.unlock(null);
                        throw th;
                    }
                }
                aVar = (d.a) this.d;
                bVar = (b) this.c;
                mutex = (Mutex) this.b;
                booleanRef = (Ref.BooleanRef) this.a;
                ResultKt.throwOnFailure(obj);
                bVar.a();
                bVar.j();
                com.moloco.sdk.internal.ilrd.a e2 = bVar.e();
                if (e2 != null) {
                    e2.a(aVar);
                }
                this.a = booleanRef;
                this.b = mutex;
                this.c = bVar;
                this.d = aVar;
                this.e = 2;
                if (bVar.d(this) != coroutine_suspended) {
                    bVar2 = bVar;
                    mutex2 = mutex;
                    booleanRef2 = booleanRef;
                    IlrdRequest.ImpressionLevelRevenue a2 = bVar2.a(aVar);
                    List<IlrdRequest.ImpressionLevelRevenue> b2 = bVar2.b();
                    Intrinsics.checkNotNull(a2);
                    b2.add(a2);
                    MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                    StringBuilder append2 = new StringBuilder("Event id ").append(a2.getEventId()).append(" added. Count: ").append(bVar2.b().size()).append(", current events in session: ");
                    com.moloco.sdk.internal.ilrd.a e3 = bVar2.e();
                    MolocoLogger.info$default(molocoLogger2, b.u, append2.append(e3 == null ? e3.b() : null).toString(), null, false, 12, null);
                    this.a = booleanRef2;
                    this.b = mutex2;
                    this.c = bVar2;
                    this.d = null;
                    this.e = 3;
                    if (bVar2.c(this) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                th = th3;
                mutex2 = mutex;
                mutex3 = mutex2;
                mutex3.unlock(null);
                throw th;
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository", f = "IlrdEventsRepository.kt", i = {0, 1, 1, 2, 5, 5, 6}, l = {148, TextFieldImplKt.AnimationDuration, 153, 166, 176, 194, 205, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE}, m = "restoreSavedSession", n = {"this", "this", "existingSession", "this", "this", "restoredSession", "this"}, s = {"L$0", "L$0", "L$1", "L$0", "L$0", "L$1", "L$0"})
    public static final class e extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return b.this.a(this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$restoreSavedSession$restoredSession$1", f = "IlrdEventsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.ilrd.a>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.ilrd.a> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new f(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new com.moloco.sdk.internal.ilrd.a(b.this.h, this.c);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$scheduleInactiveSessionExpiry$1", f = "IlrdEventsRepository.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public int a;

        public g(Continuation<? super g> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((g) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return b.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.ilrd.a e = b.this.e();
                if (e != null) {
                    e.a();
                }
                b bVar = b.this;
                this.a = 1;
                if (bVar.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$scheduleMaxSessionLength$1", f = "IlrdEventsRepository.kt", i = {}, l = {377}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public int a;

        public h(Continuation<? super h> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((h) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return b.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.ilrd.a e = b.this.e();
                if (e != null) {
                    e.a();
                }
                b bVar = b.this;
                this.a = 1;
                if (bVar.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$scheduleUploadIntervalScheduler$1", f = "IlrdEventsRepository.kt", i = {}, l = {392}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public int a;

        public i(Continuation<? super i> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((i) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return b.this.new i(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                b bVar = b.this;
                this.a = 1;
                if (bVar.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$sendEvents$1", f = "IlrdEventsRepository.kt", i = {}, l = {InterfaceC2517l1.a.b.f}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                b bVar = b.this;
                this.a = 1;
                if (bVar.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository", f = "IlrdEventsRepository.kt", i = {0, 0, 1, 1, 1}, l = {499, 437}, m = "sendEventsSuspending", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "compressed"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class k extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return b.this.b(this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$storeEventsToPersistentStorage$2", f = "IlrdEventsRepository.kt", i = {}, l = {448, 455}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new l(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        
            if (r5.a(com.moloco.sdk.internal.ilrd.b.w, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
        
            if (r2.a(com.moloco.sdk.internal.ilrd.b.w, r5, r4) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (b.this.b().isEmpty()) {
                w wVar = b.this.l;
                this.a = 1;
            } else {
                String encodeToString = Base64.encodeToString(IlrdRequest.ImpressionRevenueRequest.newBuilder().addAllEvents(b.this.b()).build().toByteArray(), 2);
                w wVar2 = b.this.l;
                this.a = 2;
            }
            return coroutine_suspended;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$storeSessionToPersistentStorage$2", f = "IlrdEventsRepository.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ com.moloco.sdk.internal.ilrd.a b;
        public final /* synthetic */ b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.moloco.sdk.internal.ilrd.a aVar, b bVar, Continuation<? super m> continuation) {
            super(2, continuation);
            this.b = aVar;
            this.c = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new m(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String f = this.b.f();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, b.u, "Storing current session: " + f, null, false, 12, null);
                w wVar = this.c.l;
                this.a = 1;
                if (wVar.a(b.v, f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(CoroutineScope coroutineScope, String str, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, long j2, int i2, long j3, long j4, J j5, Lifecycle lifecycle, InterfaceC2809d interfaceC2809d, String str2, String str3, w wVar, com.moloco.sdk.internal.ilrd.e eVar, com.moloco.sdk.internal.ilrd.e eVar2, com.moloco.sdk.internal.ilrd.e eVar3, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, str, iVar, j2, i2, j3, j4, j5, lifecycle, interfaceC2809d, str2, str3, wVar, eVar, eVar2, eVar3);
    }

    public static /* synthetic */ void c() {
    }

    public final com.moloco.sdk.internal.ilrd.a e() {
        return this.q;
    }

    public final com.moloco.sdk.internal.ilrd.e f() {
        return this.m;
    }

    public final com.moloco.sdk.internal.ilrd.e g() {
        return this.n;
    }

    public final boolean h() {
        boolean z = this.r.size() >= this.e;
        if (z) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "batch size reached", null, false, 12, null);
        }
        return z;
    }

    public final synchronized void i() {
        a();
        j();
    }

    public final void j() {
        this.m.a(this.d, new g(null));
    }

    public final void k() {
        this.o.a(this.f, new i(null));
    }

    public final void l() {
        BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new j(null), 3, null);
    }

    public final void m() {
        com.moloco.sdk.internal.ilrd.a aVar = new com.moloco.sdk.internal.ilrd.a(this.h, null, 2, null);
        this.q = aVar;
        a(this.g);
        k();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "New session started: sessionId=" + aVar.c() + ", maxBatch=" + this.e + ", uploadInterval=" + ((Object) Duration.m12567toStringimpl(this.f)) + ", sessionExp=" + ((Object) Duration.m12567toStringimpl(this.d)) + ", maxLength=" + ((Object) Duration.m12567toStringimpl(this.g)), null, false, 12, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "onPause called, sending events", null, false, 12, null);
        l();
    }

    public b(CoroutineScope scope, String url, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, long j2, int i2, long j3, long j4, J timeProvider, Lifecycle processLifeycle, InterfaceC2809d advertisingIdService, String pubId, String appId, w dataStoreService, com.moloco.sdk.internal.ilrd.e sessionInactiveScheduler, com.moloco.sdk.internal.ilrd.e sessionMaxLengthScheduler, com.moloco.sdk.internal.ilrd.e scheduledUploadScheduler) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(processLifeycle, "processLifeycle");
        Intrinsics.checkNotNullParameter(advertisingIdService, "advertisingIdService");
        Intrinsics.checkNotNullParameter(pubId, "pubId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(dataStoreService, "dataStoreService");
        Intrinsics.checkNotNullParameter(sessionInactiveScheduler, "sessionInactiveScheduler");
        Intrinsics.checkNotNullParameter(sessionMaxLengthScheduler, "sessionMaxLengthScheduler");
        Intrinsics.checkNotNullParameter(scheduledUploadScheduler, "scheduledUploadScheduler");
        this.a = scope;
        this.b = url;
        this.c = persistentHttpRequest;
        this.d = j2;
        this.e = i2;
        this.f = j3;
        this.g = j4;
        this.h = timeProvider;
        this.i = advertisingIdService;
        this.j = pubId;
        this.k = appId;
        this.l = dataStoreService;
        this.m = sessionInactiveScheduler;
        this.n = sessionMaxLengthScheduler;
        this.o = scheduledUploadScheduler;
        this.p = MutexKt.Mutex$default(false, 1, null);
        this.r = new ArrayList();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "ILRD repository initialized - url=" + url + ", uploadInterval=" + ((Object) Duration.m12567toStringimpl(j3)) + ", maxBatchSize=" + i2 + ", sessionExpiry=" + ((Object) Duration.m12567toStringimpl(j2)) + ", maxSessionLength=" + ((Object) Duration.m12567toStringimpl(j4)), null, false, 12, null);
        BuildersKt__Builders_commonKt.launch$default(scope, com.moloco.sdk.internal.scheduling.b.a().getMainImmediate(), null, new a(processLifeycle, this, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C0237b(null), 3, null);
    }

    public final com.moloco.sdk.internal.ilrd.e d() {
        return this.o;
    }

    public final List<IlrdRequest.ImpressionLevelRevenue> b() {
        return this.r;
    }

    public final Object d(Continuation<? super Unit> continuation) {
        Object withContext;
        com.moloco.sdk.internal.ilrd.a aVar = this.q;
        return (aVar != null && (withContext = BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getDefault(), new m(aVar, this, null), continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? withContext : Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|75|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x027c, code lost:
    
        if (r0.a(com.moloco.sdk.internal.ilrd.b.w, r2) == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0125, code lost:
    
        if (r0.a(com.moloco.sdk.internal.ilrd.b.w, r2) == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015a, code lost:
    
        if (r0.a(com.moloco.sdk.internal.ilrd.b.w, r2) == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00df, code lost:
    
        if (r0 == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c3, code lost:
    
        if (r8.a(com.moloco.sdk.internal.ilrd.b.v, r2) == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0042, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x027f, code lost:
    
        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.ilrd.b.u, "Failed to restore persisted ILRD events", r0, false, 8, null);
        r0 = r4.l;
        r2.a = null;
        r2.b = null;
        r2.e = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x029a, code lost:
    
        if (r0.a(com.moloco.sdk.internal.ilrd.b.w, r2) != r3) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.moloco.sdk.internal.ilrd.b, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation<? super Unit> continuation) {
        e eVar;
        ?? r4;
        b bVar;
        String str;
        com.moloco.sdk.internal.ilrd.a aVar;
        String str2;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.e = i2 - Integer.MIN_VALUE;
                Object obj = eVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r4 = eVar.e;
                switch (r4) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        w wVar = this.l;
                        eVar.a = this;
                        eVar.e = 1;
                        obj = wVar.d(v, eVar);
                        if (obj != coroutine_suspended) {
                            bVar = this;
                            str = (String) obj;
                            if (str != null) {
                                return Unit.INSTANCE;
                            }
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Existing session found: " + str, null, false, 12, null);
                            w wVar2 = bVar.l;
                            eVar.a = bVar;
                            eVar.b = str;
                            eVar.e = 2;
                            break;
                        }
                        return coroutine_suspended;
                    case 1:
                        bVar = (b) eVar.a;
                        ResultKt.throwOnFailure(obj);
                        str = (String) obj;
                        if (str != null) {
                        }
                        break;
                    case 2:
                        String str3 = (String) eVar.b;
                        b bVar2 = (b) eVar.a;
                        ResultKt.throwOnFailure(obj);
                        str = str3;
                        bVar = bVar2;
                        CoroutineContext coroutineContext = com.moloco.sdk.internal.scheduling.b.a().getDefault();
                        f fVar = bVar.new f(str, null);
                        eVar.a = bVar;
                        eVar.b = null;
                        eVar.e = 3;
                        obj = BuildersKt.withContext(coroutineContext, fVar, eVar);
                        break;
                    case 3:
                        bVar = (b) eVar.a;
                        ResultKt.throwOnFailure(obj);
                        com.moloco.sdk.internal.ilrd.a aVar2 = (com.moloco.sdk.internal.ilrd.a) obj;
                        long a2 = bVar.h.a();
                        Duration.Companion companion = Duration.INSTANCE;
                        long d2 = a2 - aVar2.d();
                        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
                        long duration = DurationKt.toDuration(d2, durationUnit);
                        long i3 = aVar2.b().i();
                        if (Duration.m12526compareToLRDsOJo(duration, bVar.g) > 0) {
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Discarding restored session - exceeded maximum length.", null, false, 12, null);
                            w wVar3 = bVar.l;
                            eVar.a = null;
                            eVar.e = 4;
                            break;
                        } else if (i3 > 0 && a2 - i3 > Duration.m12538getInWholeMillisecondsimpl(bVar.d)) {
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Discarding restored session - exceeded inactivity timeout", null, false, 12, null);
                            w wVar4 = bVar.l;
                            eVar.a = null;
                            eVar.e = 5;
                            break;
                        } else {
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "ILRD session restored successfully - sessionId=" + aVar2.c() + ", age=" + ((Object) Duration.m12567toStringimpl(DurationKt.toDuration(a2 - aVar2.d(), durationUnit))) + ", impressions=" + aVar2.b(), null, false, 12, null);
                            bVar.q = aVar2;
                            bVar.k();
                            bVar.a(Duration.m12555minusLRDsOJo(bVar.g, duration));
                            w wVar5 = bVar.l;
                            eVar.a = bVar;
                            eVar.b = aVar2;
                            eVar.e = 6;
                            Object d3 = wVar5.d(w, eVar);
                            if (d3 != coroutine_suspended) {
                                aVar = aVar2;
                                obj = d3;
                                str2 = (String) obj;
                                if (str2 != null) {
                                    List<IlrdRequest.ImpressionLevelRevenue> eventsList = IlrdRequest.ImpressionRevenueRequest.parseFrom(Base64.decode(str2, 0)).getEventsList();
                                    Intrinsics.checkNotNullExpressionValue(eventsList, "getEventsList(...)");
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj2 : eventsList) {
                                        if (Intrinsics.areEqual(((IlrdRequest.ImpressionLevelRevenue) obj2).getSessionId(), aVar.c())) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                    if (!arrayList.isEmpty()) {
                                        bVar.r.addAll(arrayList);
                                        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Restored " + arrayList.size() + " pending ILRD events for sessionId=" + aVar.c(), null, false, 12, null);
                                    } else {
                                        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "No pending ILRD events matched restored sessionId=" + aVar.c() + "; clearing persisted events", null, false, 12, null);
                                        w wVar6 = bVar.l;
                                        eVar.a = bVar;
                                        eVar.b = null;
                                        eVar.e = 7;
                                        break;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        return coroutine_suspended;
                    case 4:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 5:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 6:
                        com.moloco.sdk.internal.ilrd.a aVar3 = (com.moloco.sdk.internal.ilrd.a) eVar.b;
                        b bVar3 = (b) eVar.a;
                        ResultKt.throwOnFailure(obj);
                        aVar = aVar3;
                        bVar = bVar3;
                        str2 = (String) obj;
                        if (str2 != null) {
                        }
                        return Unit.INSTANCE;
                    case 7:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 8:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        eVar = new e(continuation);
        Object obj3 = eVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = eVar.e;
        switch (r4) {
        }
    }

    public final void b(d.a ilrdData) {
        Intrinsics.checkNotNullParameter(ilrdData, "ilrdData");
        BuildersKt.launch(this.a, EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new d(ilrdData, null));
    }

    public final Object c(Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getDefault(), new l(null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public /* synthetic */ b(CoroutineScope coroutineScope, String str, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, long j2, int i2, long j3, long j4, J j5, Lifecycle lifecycle, InterfaceC2809d interfaceC2809d, String str2, String str3, w wVar, com.moloco.sdk.internal.ilrd.e eVar, com.moloco.sdk.internal.ilrd.e eVar2, com.moloco.sdk.internal.ilrd.e eVar3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, str, iVar, j2, i2, j3, j4, j5, lifecycle, interfaceC2809d, str2, str3, wVar, (i3 & 8192) != 0 ? new com.moloco.sdk.internal.ilrd.e(coroutineScope, j5, "SessionInactiveScheduler") : eVar, (i3 & 16384) != 0 ? new com.moloco.sdk.internal.ilrd.e(coroutineScope, j5, "SessionMaxLengthScheduler") : eVar2, (i3 & 32768) != 0 ? new com.moloco.sdk.internal.ilrd.e(coroutineScope, j5, "UploadIntervalScheduler") : eVar3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073 A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:27:0x006b, B:29:0x0073, B:30:0x0086, B:32:0x00a3, B:34:0x00a9, B:35:0x00b0), top: B:26:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086 A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:27:0x006b, B:29:0x0073, B:30:0x0086, B:32:0x00a3, B:34:0x00a9, B:35:0x00b0), top: B:26:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation<? super Unit> continuation) {
        k kVar;
        int i2;
        Mutex mutex;
        b bVar;
        Mutex mutex2;
        byte[] a2;
        b bVar2;
        try {
            if (continuation instanceof k) {
                kVar = (k) continuation;
                int i3 = kVar.f;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    kVar.f = i3 - Integer.MIN_VALUE;
                    Object obj = kVar.d;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = kVar.f;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        k();
                        mutex = this.p;
                        kVar.a = this;
                        kVar.b = mutex;
                        kVar.f = 1;
                        if (mutex.lock(null, kVar) != coroutine_suspended) {
                            bVar = this;
                        }
                        return coroutine_suspended;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a2 = (byte[]) kVar.c;
                        mutex2 = (Mutex) kVar.b;
                        bVar2 = (b) kVar.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            mutex2.unlock(null);
                            if (a2 != null) {
                                bVar2.c.a(bVar2.b, a2, ContentType.Application.INSTANCE.getProtoBuf(), "gzip");
                            }
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            mutex2.unlock(null);
                            throw th2;
                        }
                    }
                    Mutex mutex3 = (Mutex) kVar.b;
                    bVar = (b) kVar.a;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex3;
                    if (!bVar.r.isEmpty()) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Request for sendEvent came, but event list is empty. Returning", null, false, 12, null);
                        mutex2 = mutex;
                        bVar2 = bVar;
                        a2 = null;
                    } else {
                        IlrdRequest.ImpressionRevenueRequest.Builder newBuilder = IlrdRequest.ImpressionRevenueRequest.newBuilder();
                        newBuilder.setOs(X3.d);
                        newBuilder.setPublisherId(bVar.j);
                        newBuilder.setPublisherAppId(bVar.k);
                        AbstractC2808c a3 = bVar.i.a();
                        AbstractC2808c.a aVar = a3 instanceof AbstractC2808c.a ? (AbstractC2808c.a) a3 : null;
                        if (aVar != null) {
                            newBuilder.setDeviceId(aVar.b());
                        }
                        newBuilder.addAllEvents(bVar.r);
                        IlrdRequest.ImpressionRevenueRequest build = newBuilder.build();
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Ilrd request created now sending it with " + build.getEventsList().size() + " events", null, false, 12, null);
                        c cVar = s;
                        byte[] byteArray = build.toByteArray();
                        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                        a2 = cVar.a(byteArray);
                        bVar.r.clear();
                        w wVar = bVar.l;
                        kVar.a = bVar;
                        kVar.b = mutex;
                        kVar.c = a2;
                        kVar.f = 2;
                        if (wVar.a(w, kVar) != coroutine_suspended) {
                            mutex2 = mutex;
                            bVar2 = bVar;
                        }
                        return coroutine_suspended;
                    }
                    mutex2.unlock(null);
                    if (a2 != null) {
                    }
                    return Unit.INSTANCE;
                }
            }
            if (!bVar.r.isEmpty()) {
            }
            mutex2.unlock(null);
            if (a2 != null) {
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            Throwable th22 = th;
            mutex2.unlock(null);
            throw th22;
        }
        kVar = new k(continuation);
        Object obj2 = kVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = kVar.f;
        if (i2 != 0) {
        }
    }

    public final IlrdRequest.ImpressionLevelRevenue a(d.a aVar) {
        IlrdRequest.ImpressionLevelRevenue.Builder eventId = IlrdRequest.ImpressionLevelRevenue.newBuilder().setEventId(UUID.randomUUID().toString());
        com.moloco.sdk.internal.ilrd.a aVar2 = this.q;
        if (aVar2 != null) {
            eventId.setSessionId(aVar2.c());
            Duration.Companion companion = Duration.INSTANCE;
            MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Event created: sessionId=" + aVar2.c() + ", sessionAge=" + ((Object) Duration.m12567toStringimpl(DurationKt.toDuration(this.h.a() - aVar2.d(), DurationUnit.MILLISECONDS))), null, false, 12, null);
        }
        if (aVar instanceof d.a.b) {
            eventId.setMax(((d.a.b) aVar).b());
        } else {
            if (!(aVar instanceof d.a.C0238a)) {
                throw new NoWhenBranchMatchedException();
            }
            eventId.setLevelplay(((d.a.C0238a) aVar).b());
        }
        return eventId.build();
    }

    public final void a() {
        com.moloco.sdk.internal.ilrd.a aVar = this.q;
        if (aVar != null && !aVar.e()) {
            Duration.Companion companion = Duration.INSTANCE;
            MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Session validation - age: " + ((Object) Duration.m12567toStringimpl(DurationKt.toDuration(this.h.a() - aVar.d(), DurationUnit.MILLISECONDS))) + ", limit: " + ((Object) Duration.m12567toStringimpl(this.g)), null, false, 12, null);
            return;
        }
        m();
    }

    public final void a(long j2) {
        this.n.a(j2, new h(null));
    }
}

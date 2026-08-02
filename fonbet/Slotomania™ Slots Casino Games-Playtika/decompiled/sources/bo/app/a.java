package bo.app;

import com.braze.Constants;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00018\u0000H'¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\r\u001a\u00020\u0006R\u0011\u0010\u000f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000e¨\u0006\u0012"}, d2 = {"Lbo/app/a;", "T", "", "outboundObject", "", "isSuccessful", "", "b", "(Ljava/lang/Object;Z)V", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "()Ljava/lang/Object;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Ljava/lang/Object;Z)Z", "c", "()Z", "isLocked", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes7.dex */
public abstract class a<T> {
    private final Semaphore a = SemaphoreKt.Semaphore$default(1, 0, 2, null);

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: bo.app.a$a, reason: collision with other inner class name */
    static final class C0068a extends Lambda implements Function0<String> {
        final /* synthetic */ T b;
        final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0068a(T t, boolean z) {
            super(0);
            this.b = t;
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Tried to confirm outboundObject [" + this.b + "] with success [" + this.c + "], but the cache wasn't locked, so not doing anything.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ a<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a<T> aVar) {
            super(0);
            this.b = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Notifying confirmAndUnlock listeners for cache: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ a<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a<T> aVar) {
            super(0);
            this.b = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Cache locked successfully for export: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        public static final d b = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Received call to export dirty object, but the cache was already locked.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.braze.storage.AbstractLockedCache$lockAndUnlock$1", f = "AbstractLockedCache.kt", i = {0}, l = {92}, m = "invokeSuspend", n = {"$this$withPermit$iv"}, s = {"L$0"})
    static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object b;
        int c;
        final /* synthetic */ a<T> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a<T> aVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.d = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Semaphore semaphore;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Semaphore semaphore2 = ((a) this.d).a;
                this.b = semaphore2;
                this.c = 1;
                if (semaphore2.acquire(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                semaphore = semaphore2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                semaphore = (Semaphore) this.b;
                ResultKt.throwOnFailure(obj);
            }
            try {
                Unit unit = Unit.INSTANCE;
                semaphore.release();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                semaphore.release();
                throw th;
            }
        }
    }

    public abstract void b(T outboundObject, boolean isSuccessful);

    public final boolean b() {
        return this.a.getAvailablePermits() == 0;
    }

    public final void c() {
        BuildersKt__BuildersKt.runBlocking$default(null, new e(this, null), 1, null);
    }

    public abstract T d();

    public final synchronized T a() {
        T t;
        try {
            if (this.a.tryAcquire()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(this), 3, (Object) null);
                t = d();
            } else {
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, d.b, 3, (Object) null);
                    t = null;
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            }
            return t;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final synchronized boolean a(T outboundObject, boolean isSuccessful) {
        if (this.a.getAvailablePermits() != 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new C0068a(outboundObject, isSuccessful), 2, (Object) null);
            return false;
        }
        b(outboundObject, isSuccessful);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new b(this), 2, (Object) null);
        this.a.release();
        return true;
    }
}

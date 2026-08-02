package bo.app;

import android.content.Context;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.support.BrazeLogger;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o4 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f25846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultBrazeImageLoader f25847b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(Context context, DefaultBrazeImageLoader defaultBrazeImageLoader, Continuation continuation) {
        super(2, continuation);
        this.f25846a = context;
        this.f25847b = defaultBrazeImageLoader;
    }

    public static final String a() {
        return "Initializing disk cache";
    }

    public static final String b() {
        return "Disk cache initialized";
    }

    public static final String c() {
        return "Image loader was replaced. Disk cache shut down";
    }

    public static final String d() {
        return "Caught exception creating new disk cache. Unable to create new disk cache";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new o4(this.f25846a, this.f25847b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new o4(this.f25846a, this.f25847b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ReentrantLock reentrantLock;
        String str;
        String str2;
        AtomicBoolean atomicBoolean;
        String str3;
        k0 k0Var;
        String str4;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        n4 n4Var = DefaultBrazeImageLoader.Companion;
        Context context = this.f25846a;
        n4Var.getClass();
        File a10 = n4.a(context, "appboy.imageloader.lru.cache");
        reentrantLock = this.f25847b.diskCacheLock;
        DefaultBrazeImageLoader defaultBrazeImageLoader = this.f25847b;
        reentrantLock.lock();
        try {
            try {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                str2 = DefaultBrazeImageLoader.TAG;
                BrazeLogger.brazelog$default(brazeLogger, str2, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.X6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.o4.a();
                    }
                }, 14, (Object) null);
                defaultBrazeImageLoader.diskLruCache = new k0(a10);
                atomicBoolean = defaultBrazeImageLoader.isOffline;
                if (atomicBoolean.get()) {
                    str3 = DefaultBrazeImageLoader.TAG;
                    BrazeLogger.brazelog$default(brazeLogger, str3, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Z6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.o4.c();
                        }
                    }, 14, (Object) null);
                    k0Var = defaultBrazeImageLoader.diskLruCache;
                    if (k0Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                        k0Var = null;
                    }
                    k0Var.a();
                } else {
                    str4 = DefaultBrazeImageLoader.TAG;
                    BrazeLogger.brazelog$default(brazeLogger, str4, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Y6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.o4.b();
                        }
                    }, 14, (Object) null);
                    defaultBrazeImageLoader.isDiskCacheStarting = false;
                }
            } catch (Exception e10) {
                BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
                str = DefaultBrazeImageLoader.TAG;
                BrazeLogger.brazelog$default(brazeLogger2, str, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.a7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.o4.d();
                    }
                }, 8, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            return unit;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}

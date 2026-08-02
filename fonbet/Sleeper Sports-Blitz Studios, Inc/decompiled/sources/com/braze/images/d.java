package com.braze.images;

import android.content.Context;
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

/* loaded from: classes6.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f550a;
    public final /* synthetic */ DefaultBrazeImageLoader b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, DefaultBrazeImageLoader defaultBrazeImageLoader, Continuation continuation) {
        super(2, continuation);
        this.f550a = context;
        this.b = defaultBrazeImageLoader;
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
        return new d(this.f550a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new d(this.f550a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ReentrantLock reentrantLock;
        String str;
        String str2;
        AtomicBoolean atomicBoolean;
        String str3;
        a aVar;
        String str4;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        c cVar = DefaultBrazeImageLoader.Companion;
        Context context = this.f550a;
        cVar.getClass();
        File a2 = c.a(context, DefaultBrazeImageLoader.BRAZE_LRU_CACHE_FOLDER);
        reentrantLock = this.b.diskCacheLock;
        DefaultBrazeImageLoader defaultBrazeImageLoader = this.b;
        reentrantLock.lock();
        try {
            try {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                str2 = DefaultBrazeImageLoader.TAG;
                BrazeLogger.brazelog$default(brazeLogger, str2, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.images.d$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d.a();
                    }
                }, 14, (Object) null);
                defaultBrazeImageLoader.diskLruCache = new a(a2);
                atomicBoolean = defaultBrazeImageLoader.isOffline;
                if (atomicBoolean.get()) {
                    str3 = DefaultBrazeImageLoader.TAG;
                    BrazeLogger.brazelog$default(brazeLogger, str3, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.images.d$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d.c();
                        }
                    }, 14, (Object) null);
                    aVar = defaultBrazeImageLoader.diskLruCache;
                    if (aVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                        aVar = null;
                    }
                    aVar.a();
                } else {
                    str4 = DefaultBrazeImageLoader.TAG;
                    BrazeLogger.brazelog$default(brazeLogger, str4, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.images.d$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d.b();
                        }
                    }, 14, (Object) null);
                    defaultBrazeImageLoader.isDiskCacheStarting = false;
                }
            } catch (Exception e) {
                BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
                str = DefaultBrazeImageLoader.TAG;
                BrazeLogger.brazelog$default(brazeLogger2, str, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.images.d$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d.d();
                    }
                }, 8, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            return unit;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}

package com.unity3d.services.core.extensions;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: CoroutineExtensions.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00020\u00022\u001e\b\u0004\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a@\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\u001e\b\u0004\u0010\u0015\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0086Hø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a@\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\u001e\b\u0004\u0010\u0015\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0086Hø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0016\"5\u0010\u0000\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001j\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"deferreds", "Ljava/util/LinkedHashMap;", "", "Lkotlinx/coroutines/Deferred;", "Lkotlin/collections/LinkedHashMap;", "getDeferreds", "()Ljava/util/LinkedHashMap;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "getMutex", "()Lkotlinx/coroutines/sync/Mutex;", "memoize", "T", "key", "action", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runReturnSuspendCatching", "Lkotlin/Result;", "R", "block", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runSuspendCatching", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CoroutineExtensionsKt {
    private static final LinkedHashMap<Object, Deferred<?>> deferreds = new LinkedHashMap<Object, Deferred<?>>() { // from class: com.unity3d.services.core.extensions.CoroutineExtensionsKt$deferreds$1
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof Deferred) {
                return containsValue((Deferred<?>) obj);
            }
            return false;
        }

        public /* bridge */ boolean containsValue(Deferred<?> deferred) {
            return super.containsValue((Object) deferred);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<Object, Deferred<?>>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<Object, Deferred<?>>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<Object> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<Deferred<?>> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Object> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && (obj2 instanceof Deferred)) {
                return remove(obj, (Deferred<?>) obj2);
            }
            return false;
        }

        public /* bridge */ boolean remove(Object obj, Deferred<?> deferred) {
            return super.remove(obj, (Object) deferred);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<Deferred<?>> values() {
            return getValues();
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Object, Deferred<?>> eldest) {
            Intrinsics.checkNotNullParameter(eldest, "eldest");
            return size() > 100;
        }
    };
    private static final Mutex mutex = MutexKt.Mutex$default(false, 1, null);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> Object runSuspendCatching(Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super Result<? extends R>> continuation) {
        CoroutineExtensionsKt$runSuspendCatching$1 coroutineExtensionsKt$runSuspendCatching$1;
        int i;
        try {
            if (continuation instanceof CoroutineExtensionsKt$runSuspendCatching$1) {
                coroutineExtensionsKt$runSuspendCatching$1 = (CoroutineExtensionsKt$runSuspendCatching$1) continuation;
                if ((coroutineExtensionsKt$runSuspendCatching$1.label & Integer.MIN_VALUE) != 0) {
                    coroutineExtensionsKt$runSuspendCatching$1.label -= Integer.MIN_VALUE;
                    Object obj = coroutineExtensionsKt$runSuspendCatching$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = coroutineExtensionsKt$runSuspendCatching$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Result.Companion companion = Result.INSTANCE;
                        coroutineExtensionsKt$runSuspendCatching$1.label = 1;
                        obj = function1.invoke(coroutineExtensionsKt$runSuspendCatching$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Result.m11180constructorimpl(obj);
                }
            }
            if (i != 0) {
            }
            return Result.m11180constructorimpl(obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        coroutineExtensionsKt$runSuspendCatching$1 = new CoroutineExtensionsKt$runSuspendCatching$1(continuation);
        Object obj2 = coroutineExtensionsKt$runSuspendCatching$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = coroutineExtensionsKt$runSuspendCatching$1.label;
    }

    private static final <R> Object runSuspendCatching$$forInline(Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super Result<? extends R>> continuation) {
        try {
            Result.Companion companion = Result.INSTANCE;
            return Result.m11180constructorimpl(function1.invoke(continuation));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|12|(2:14|15)(2:17|(2:19|20)(1:21))))|33|6|7|(0)(0)|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0046, code lost:
    
        r5 = kotlin.Result.INSTANCE;
        r4 = kotlin.Result.m11180constructorimpl(kotlin.ResultKt.createFailure(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> Object runReturnSuspendCatching(Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super Result<? extends R>> continuation) {
        CoroutineExtensionsKt$runReturnSuspendCatching$1 coroutineExtensionsKt$runReturnSuspendCatching$1;
        int i;
        Object m11180constructorimpl;
        if (continuation instanceof CoroutineExtensionsKt$runReturnSuspendCatching$1) {
            coroutineExtensionsKt$runReturnSuspendCatching$1 = (CoroutineExtensionsKt$runReturnSuspendCatching$1) continuation;
            if ((coroutineExtensionsKt$runReturnSuspendCatching$1.label & Integer.MIN_VALUE) != 0) {
                coroutineExtensionsKt$runReturnSuspendCatching$1.label -= Integer.MIN_VALUE;
                Object obj = coroutineExtensionsKt$runReturnSuspendCatching$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = coroutineExtensionsKt$runReturnSuspendCatching$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    coroutineExtensionsKt$runReturnSuspendCatching$1.label = 1;
                    obj = function1.invoke(coroutineExtensionsKt$runReturnSuspendCatching$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                m11180constructorimpl = Result.m11180constructorimpl(obj);
                if (!Result.m11187isSuccessimpl(m11180constructorimpl)) {
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m11180constructorimpl(m11180constructorimpl);
                }
                Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
                if (m11183exceptionOrNullimpl == null) {
                    return m11180constructorimpl;
                }
                Result.Companion companion3 = Result.INSTANCE;
                return Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl));
            }
        }
        coroutineExtensionsKt$runReturnSuspendCatching$1 = new CoroutineExtensionsKt$runReturnSuspendCatching$1(continuation);
        Object obj2 = coroutineExtensionsKt$runReturnSuspendCatching$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = coroutineExtensionsKt$runReturnSuspendCatching$1.label;
        if (i != 0) {
        }
        m11180constructorimpl = Result.m11180constructorimpl(obj2);
        if (!Result.m11187isSuccessimpl(m11180constructorimpl)) {
        }
    }

    public static final LinkedHashMap<Object, Deferred<?>> getDeferreds() {
        return deferreds;
    }

    public static final Mutex getMutex() {
        return mutex;
    }

    public static final <T> Object memoize(Object obj, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        return CoroutineScopeKt.coroutineScope(new CoroutineExtensionsKt$memoize$2(obj, function1, null), continuation);
    }

    private static final <R> Object runReturnSuspendCatching$$forInline(Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super Result<? extends R>> continuation) {
        Object m11180constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(function1.invoke(continuation));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m11187isSuccessimpl(m11180constructorimpl)) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m11180constructorimpl(m11180constructorimpl);
        }
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
        if (m11183exceptionOrNullimpl == null) {
            return m11180constructorimpl;
        }
        Result.Companion companion4 = Result.INSTANCE;
        return Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl));
    }
}

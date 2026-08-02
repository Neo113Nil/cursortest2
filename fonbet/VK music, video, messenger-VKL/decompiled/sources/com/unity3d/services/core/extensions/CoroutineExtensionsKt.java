package com.unity3d.services.core.extensions;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.bay;
import xsna.izs;
import xsna.spj;
import xsna.ui50;
import xsna.zrl;
import xsna.zvj;

/* compiled from: CoroutineExtensions.kt */
/* loaded from: classes14.dex */
public final class CoroutineExtensionsKt {
    private static final LinkedHashMap<Object, zrl<?>> deferreds = new LinkedHashMap<Object, zrl<?>>() { // from class: com.unity3d.services.core.extensions.CoroutineExtensionsKt$deferreds$1
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof zrl) {
                return containsValue((zrl<?>) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<Object, zrl<?>>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<Object, zrl<?>>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<Object> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<zrl<?>> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Object> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && (obj2 instanceof zrl)) {
                return remove(obj, (zrl<?>) obj2);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Object, zrl<?>> entry) {
            return size() > 100;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<zrl<?>> values() {
            return getValues();
        }

        public /* bridge */ boolean containsValue(zrl<?> zrlVar) {
            return super.containsValue((Object) zrlVar);
        }

        public /* bridge */ boolean remove(Object obj, zrl<?> zrlVar) {
            return super.remove(obj, (Object) zrlVar);
        }
    };
    private static final ui50 mutex = bay.a();

    public static final LinkedHashMap<Object, zrl<?>> getDeferreds() {
        return deferreds;
    }

    public static final ui50 getMutex() {
        return mutex;
    }

    public static final <T> Object memoize(Object obj, izs<? super spj<? super T>, ? extends Object> izsVar, spj<? super T> spjVar) {
        return zvj.d(new CoroutineExtensionsKt$memoize$2(obj, izsVar, null), spjVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:22|23))(3:24|25|(1:27))|11|12|(1:14)(2:16|(2:18|19)(1:20))))|32|6|7|(0)(0)|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003b, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003c, code lost:
    
        r5 = new kotlin.Result.Failure(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> Object runReturnSuspendCatching(izs<? super spj<? super R>, ? extends Object> izsVar, spj<? super Result<? extends R>> spjVar) {
        CoroutineExtensionsKt$runReturnSuspendCatching$1 coroutineExtensionsKt$runReturnSuspendCatching$1;
        Object obj;
        int i;
        if (spjVar instanceof CoroutineExtensionsKt$runReturnSuspendCatching$1) {
            coroutineExtensionsKt$runReturnSuspendCatching$1 = (CoroutineExtensionsKt$runReturnSuspendCatching$1) spjVar;
            int i2 = coroutineExtensionsKt$runReturnSuspendCatching$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coroutineExtensionsKt$runReturnSuspendCatching$1.label = i2 - Integer.MIN_VALUE;
                obj = coroutineExtensionsKt$runReturnSuspendCatching$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coroutineExtensionsKt$runReturnSuspendCatching$1.label;
                if (i != 0) {
                    a.a(obj);
                    coroutineExtensionsKt$runReturnSuspendCatching$1.label = 1;
                    obj = izsVar.invoke(coroutineExtensionsKt$runReturnSuspendCatching$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                }
                if (obj instanceof Result.Failure) {
                    return obj;
                }
                Throwable a = Result.a(obj);
                return a != null ? new Result.Failure(a) : obj;
            }
        }
        coroutineExtensionsKt$runReturnSuspendCatching$1 = new CoroutineExtensionsKt$runReturnSuspendCatching$1(spjVar);
        obj = coroutineExtensionsKt$runReturnSuspendCatching$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coroutineExtensionsKt$runReturnSuspendCatching$1.label;
        if (i != 0) {
        }
        if (obj instanceof Result.Failure) {
        }
    }

    private static final <R> Object runReturnSuspendCatching$$forInline(izs<? super spj<? super R>, ? extends Object> izsVar, spj<? super Result<? extends R>> spjVar) {
        Object failure;
        try {
            failure = izsVar.invoke(spjVar);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (!(failure instanceof Result.Failure)) {
            return failure;
        }
        Throwable a = Result.a(failure);
        return a != null ? new Result.Failure(a) : failure;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> Object runSuspendCatching(izs<? super spj<? super R>, ? extends Object> izsVar, spj<? super Result<? extends R>> spjVar) {
        CoroutineExtensionsKt$runSuspendCatching$1 coroutineExtensionsKt$runSuspendCatching$1;
        int i;
        try {
            if (spjVar instanceof CoroutineExtensionsKt$runSuspendCatching$1) {
                coroutineExtensionsKt$runSuspendCatching$1 = (CoroutineExtensionsKt$runSuspendCatching$1) spjVar;
                int i2 = coroutineExtensionsKt$runSuspendCatching$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    coroutineExtensionsKt$runSuspendCatching$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = coroutineExtensionsKt$runSuspendCatching$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = coroutineExtensionsKt$runSuspendCatching$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a.a(obj);
                        return obj;
                    }
                    a.a(obj);
                    coroutineExtensionsKt$runSuspendCatching$1.label = 1;
                    Object invoke = izsVar.invoke(coroutineExtensionsKt$runSuspendCatching$1);
                    return invoke == coroutineSingletons ? coroutineSingletons : invoke;
                }
            }
            if (i == 0) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        coroutineExtensionsKt$runSuspendCatching$1 = new CoroutineExtensionsKt$runSuspendCatching$1(spjVar);
        Object obj2 = coroutineExtensionsKt$runSuspendCatching$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coroutineExtensionsKt$runSuspendCatching$1.label;
    }

    private static final <R> Object runSuspendCatching$$forInline(izs<? super spj<? super R>, ? extends Object> izsVar, spj<? super Result<? extends R>> spjVar) {
        try {
            return izsVar.invoke(spjVar);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }
}

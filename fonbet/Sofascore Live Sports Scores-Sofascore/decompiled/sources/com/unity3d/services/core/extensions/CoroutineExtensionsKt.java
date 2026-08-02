package com.unity3d.services.core.extensions;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.a70;
import defpackage.h2d;
import defpackage.j2d;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.y6a;
import defpackage.zu4;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a<\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u001e\b\u0004\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0086H¢\u0006\u0004\b\u0006\u0010\u0007\u001a<\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u001e\b\u0004\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0086H¢\u0006\u0004\b\b\u0010\u0007\u001a>\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u00032\u001e\b\u0004\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0086H¢\u0006\u0004\b\f\u0010\r\";\u0010\u0011\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000ej\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {PlayerKt.ICE_HOCKEY_RIGHT_WING, "Lkotlin/Function1;", "Lrq3;", "", "block", "Lw2g;", "runSuspendCatching", "(Lkotlin/jvm/functions/Function1;Lrq3;)Ljava/lang/Object;", "runReturnSuspendCatching", "T", U3.i.W, "action", "memoize", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lrq3;)Ljava/lang/Object;", "Ljava/util/LinkedHashMap;", "Lzu4;", "Lkotlin/collections/LinkedHashMap;", "deferreds", "Ljava/util/LinkedHashMap;", "getDeferreds", "()Ljava/util/LinkedHashMap;", "Lh2d;", "mutex", "Lh2d;", "getMutex", "()Lh2d;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CoroutineExtensionsKt {

    @NotNull
    private static final LinkedHashMap<Object, zu4> deferreds = new LinkedHashMap<Object, zu4>() { // from class: com.unity3d.services.core.extensions.CoroutineExtensionsKt$deferreds$1
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof zu4) {
                return containsValue((zu4) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<Object, zu4>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<Object, zu4>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<Object> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<zu4> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Object> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && (obj2 instanceof zu4)) {
                return remove(obj, (zu4) obj2);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Object, zu4> eldest) {
            eldest.getClass();
            return size() > 100;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<zu4> values() {
            return getValues();
        }

        public /* bridge */ boolean containsValue(zu4 zu4Var) {
            return super.containsValue((Object) zu4Var);
        }

        public /* bridge */ boolean remove(Object obj, zu4 zu4Var) {
            return super.remove(obj, (Object) zu4Var);
        }
    };

    @NotNull
    private static final h2d mutex = new j2d();

    @NotNull
    public static final LinkedHashMap<Object, zu4> getDeferreds() {
        return deferreds;
    }

    @NotNull
    public static final h2d getMutex() {
        return mutex;
    }

    @Nullable
    public static final <T> Object memoize(@NotNull Object obj, @NotNull Function1<? super rq3<? super T>, ? extends Object> function1, @NotNull rq3<? super T> rq3Var) {
        return s9a.r(new CoroutineExtensionsKt$memoize$2(obj, function1, null), rq3Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:22|23))(3:24|25|(1:27))|11|12|(1:14)(2:16|(2:18|19)(1:20))))|32|6|7|(0)(0)|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003f, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0040, code lost:
    
        r5 = defpackage.w2g.b;
        r5 = new defpackage.u2g(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> Object runReturnSuspendCatching(@NotNull Function1<? super rq3<? super R>, ? extends Object> function1, @NotNull rq3<? super w2g> rq3Var) {
        CoroutineExtensionsKt$runReturnSuspendCatching$1 coroutineExtensionsKt$runReturnSuspendCatching$1;
        Object obj;
        int i;
        if (rq3Var instanceof CoroutineExtensionsKt$runReturnSuspendCatching$1) {
            coroutineExtensionsKt$runReturnSuspendCatching$1 = (CoroutineExtensionsKt$runReturnSuspendCatching$1) rq3Var;
            int i2 = coroutineExtensionsKt$runReturnSuspendCatching$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coroutineExtensionsKt$runReturnSuspendCatching$1.label = i2 - Integer.MIN_VALUE;
                obj = coroutineExtensionsKt$runReturnSuspendCatching$1.result;
                lu3 lu3Var = lu3.a;
                i = coroutineExtensionsKt$runReturnSuspendCatching$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    p2g p2gVar = w2g.b;
                    coroutineExtensionsKt$runReturnSuspendCatching$1.label = 1;
                    obj = function1.invoke(coroutineExtensionsKt$runReturnSuspendCatching$1);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                p2g p2gVar2 = w2g.b;
                if (obj instanceof u2g) {
                    return obj;
                }
                Throwable a = w2g.a(obj);
                return a != null ? new u2g(a) : obj;
            }
        }
        coroutineExtensionsKt$runReturnSuspendCatching$1 = new CoroutineExtensionsKt$runReturnSuspendCatching$1(rq3Var);
        obj = coroutineExtensionsKt$runReturnSuspendCatching$1.result;
        lu3 lu3Var2 = lu3.a;
        i = coroutineExtensionsKt$runReturnSuspendCatching$1.label;
        if (i != 0) {
        }
        p2g p2gVar22 = w2g.b;
        if (obj instanceof u2g) {
        }
    }

    private static final <R> Object runReturnSuspendCatching$$forInline(Function1<? super rq3<? super R>, ? extends Object> function1, rq3<? super w2g> rq3Var) {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            u2gVar = function1.invoke(rq3Var);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (!(u2gVar instanceof u2g)) {
            return u2gVar;
        }
        Throwable a = w2g.a(u2gVar);
        return a != null ? new u2g(a) : u2gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> Object runSuspendCatching(@NotNull Function1<? super rq3<? super R>, ? extends Object> function1, @NotNull rq3<? super w2g> rq3Var) {
        CoroutineExtensionsKt$runSuspendCatching$1 coroutineExtensionsKt$runSuspendCatching$1;
        int i;
        try {
            if (rq3Var instanceof CoroutineExtensionsKt$runSuspendCatching$1) {
                coroutineExtensionsKt$runSuspendCatching$1 = (CoroutineExtensionsKt$runSuspendCatching$1) rq3Var;
                int i2 = coroutineExtensionsKt$runSuspendCatching$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    coroutineExtensionsKt$runSuspendCatching$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = coroutineExtensionsKt$runSuspendCatching$1.result;
                    lu3 lu3Var = lu3.a;
                    i = coroutineExtensionsKt$runSuspendCatching$1.label;
                    if (i != 0) {
                        y6a.M(obj);
                        p2g p2gVar = w2g.b;
                        coroutineExtensionsKt$runSuspendCatching$1.label = 1;
                        obj = function1.invoke(coroutineExtensionsKt$runSuspendCatching$1);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    p2g p2gVar2 = w2g.b;
                    return obj;
                }
            }
            if (i != 0) {
            }
            p2g p2gVar22 = w2g.b;
            return obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            p2g p2gVar3 = w2g.b;
            return new u2g(th);
        }
        coroutineExtensionsKt$runSuspendCatching$1 = new CoroutineExtensionsKt$runSuspendCatching$1(rq3Var);
        Object obj2 = coroutineExtensionsKt$runSuspendCatching$1.result;
        lu3 lu3Var2 = lu3.a;
        i = coroutineExtensionsKt$runSuspendCatching$1.label;
    }

    private static final <R> Object runSuspendCatching$$forInline(Function1<? super rq3<? super R>, ? extends Object> function1, rq3<? super w2g> rq3Var) {
        try {
            p2g p2gVar = w2g.b;
            return function1.invoke(rq3Var);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            return new u2g(th);
        }
    }
}

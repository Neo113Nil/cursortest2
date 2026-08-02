package nd;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import ld.C7925f;
import org.jetbrains.annotations.NotNull;

/* renamed from: nd.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8540h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final AbstractC8526a<X<? extends Object>> f76977a = C8528b.a(C8530c.f76955a);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final AbstractC8526a<C8571w0> f76978b = C8528b.a(C8532d.f76959a);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final AbstractC8526a<kotlin.reflect.q> f76979c = C8528b.a(C8534e.f76962a);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final AbstractC8526a<ConcurrentHashMap<Pair<List<KTypeProjection>, Boolean>, kotlin.reflect.q>> f76980d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f76981e = 0;

    static {
        C8528b.a(C8536f.f76964a);
        f76980d = C8528b.a(C8538g.f76971a);
    }

    @NotNull
    public static final kotlin.reflect.q a(@NotNull Class jClass, @NotNull List arguments) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (arguments.isEmpty()) {
            return f76979c.a(jClass);
        }
        ConcurrentHashMap<Pair<List<KTypeProjection>, Boolean>, kotlin.reflect.q> a11 = f76980d.a(jClass);
        Pair<List<KTypeProjection>, Boolean> pair = new Pair<>(arguments, Boolean.FALSE);
        kotlin.reflect.q qVar = a11.get(pair);
        if (qVar == null) {
            R0 a12 = C7925f.a(b(jClass), arguments, false, kotlin.collections.K.f71697a);
            kotlin.reflect.q putIfAbsent = a11.putIfAbsent(pair, a12);
            qVar = putIfAbsent == null ? a12 : putIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(qVar, "getOrPut(...)");
        return qVar;
    }

    @NotNull
    public static final <T> X<T> b(@NotNull Class<T> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Z a11 = f76977a.a(jClass);
        Intrinsics.g(a11, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (X) a11;
    }

    @NotNull
    public static final <T> kotlin.reflect.g c(@NotNull Class<T> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        return f76978b.a(jClass);
    }
}

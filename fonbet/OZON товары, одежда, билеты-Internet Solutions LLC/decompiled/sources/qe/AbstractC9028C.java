package qe;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: qe.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9028C<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<String, Integer> f81938a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicInteger f81939b = new AtomicInteger(0);

    static int a(AbstractC9028C abstractC9028C, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return abstractC9028C.f81939b.getAndIncrement();
    }

    public abstract int b(@NotNull ConcurrentHashMap<String, Integer> concurrentHashMap, @NotNull String str, @NotNull Function1<? super String, Integer> function1);

    public final int c(@NotNull String keyQualifiedName) {
        Intrinsics.checkNotNullParameter(keyQualifiedName, "keyQualifiedName");
        return b(this.f81938a, keyQualifiedName, new C9027B(this));
    }

    @NotNull
    protected final Collection<Integer> d() {
        Collection<Integer> values = this.f81938a.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        return values;
    }
}

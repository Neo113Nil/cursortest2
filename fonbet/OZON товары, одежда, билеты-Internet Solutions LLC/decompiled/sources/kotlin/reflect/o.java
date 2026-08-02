package kotlin.reflect;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface o<T, V> extends m<V>, Function1<T, V> {

    public interface a<T, V> extends m.b<V>, Function1<T, V> {
    }

    V get(T t2);

    @Override // kotlin.reflect.m
    @NotNull
    a<T, V> getGetter();
}

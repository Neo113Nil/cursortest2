package kotlin.reflect;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface k<T, V> extends o<T, V>, i<V> {

    /* loaded from: classes10.dex */
    public interface a<T, V> extends i.a<V>, Function2<T, V, Unit> {
    }

    @Override // kotlin.reflect.i
    @NotNull
    a<T, V> getSetter();

    void y(T t2, V v11);
}

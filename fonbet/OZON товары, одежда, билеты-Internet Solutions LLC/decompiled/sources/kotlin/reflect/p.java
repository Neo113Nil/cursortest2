package kotlin.reflect;

import kotlin.jvm.functions.Function2;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface p<D, E, V> extends m<V>, Function2<D, E, V> {

    /* loaded from: classes10.dex */
    public interface a<D, E, V> extends m.b<V>, Function2<D, E, V> {
    }

    @Override // kotlin.reflect.m
    @NotNull
    a<D, E, V> getGetter();
}

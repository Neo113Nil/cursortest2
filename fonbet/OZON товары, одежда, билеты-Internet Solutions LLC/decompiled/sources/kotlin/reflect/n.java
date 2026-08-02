package kotlin.reflect;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface n<V> extends m<V>, Function0<V> {

    /* loaded from: classes10.dex */
    public interface a<V> extends m.b<V>, Function0<V> {
    }

    V get();

    @Override // kotlin.reflect.m
    @NotNull
    a<V> getGetter();
}

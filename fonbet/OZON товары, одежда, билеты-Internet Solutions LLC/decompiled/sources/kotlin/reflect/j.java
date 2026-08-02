package kotlin.reflect;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface j<V> extends n<V>, i<V> {

    /* loaded from: classes10.dex */
    public interface a<V> extends i.a<V>, Function1<V, Unit> {
    }

    @Override // kotlin.reflect.i
    @NotNull
    a<V> getSetter();

    void set(V v11);
}

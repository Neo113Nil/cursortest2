package kotlin.reflect;

import kotlin.Unit;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface i<V> extends m<V> {

    public interface a<V> extends m.a<V>, h<Unit> {
    }

    @NotNull
    a<V> getSetter();
}

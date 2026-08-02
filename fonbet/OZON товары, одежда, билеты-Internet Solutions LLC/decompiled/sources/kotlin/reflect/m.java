package kotlin.reflect;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface m<V> extends c<V> {

    public interface a<V> {
        @NotNull
        m<V> b();
    }

    public interface b<V> extends a<V>, h<V> {
    }

    @NotNull
    b<V> getGetter();
}

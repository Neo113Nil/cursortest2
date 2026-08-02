package id;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class c<V> implements f<Object, V> {
    private V value;

    public c(V v11) {
        this.value = v11;
    }

    protected void afterChange(@NotNull m<?> property, V v11, V v12) {
        Intrinsics.checkNotNullParameter(property, "property");
    }

    protected boolean beforeChange(@NotNull m<?> property, V v11, V v12) {
        Intrinsics.checkNotNullParameter(property, "property");
        return true;
    }

    @Override // id.e
    public V getValue(Object obj, @NotNull m<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.value;
    }

    @Override // id.f
    public void setValue(Object obj, @NotNull m<?> property, V v11) {
        Intrinsics.checkNotNullParameter(property, "property");
        V v12 = this.value;
        if (beforeChange(property, v12, v11)) {
            this.value = v11;
            afterChange(property, v12, v11);
        }
    }

    @NotNull
    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}

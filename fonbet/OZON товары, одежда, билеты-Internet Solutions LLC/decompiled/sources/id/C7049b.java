package id;

import B3.D;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lid/b;", "", "T", "Lid/f;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: id.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C7049b<T> implements f<Object, T> {

    /* renamed from: a, reason: collision with root package name */
    private T f66243a;

    @Override // id.e
    @NotNull
    public final T getValue(Object obj, @NotNull m<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        T t2 = this.f66243a;
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException("Property " + property.getName() + " should be initialized before get.");
    }

    @Override // id.f
    public final void setValue(Object obj, @NotNull m<?> property, @NotNull T value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f66243a = value;
    }

    @NotNull
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("NotNullProperty(");
        if (this.f66243a != null) {
            str = "value=" + this.f66243a;
        } else {
            str = "value not initialized yet";
        }
        return D.c(sb2, str, ')');
    }
}

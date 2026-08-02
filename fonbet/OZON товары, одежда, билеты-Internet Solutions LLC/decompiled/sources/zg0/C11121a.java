package zg0;

import id.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;

/* renamed from: zg0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C11121a<T> implements f<Object, T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<String> f109056a;

    /* renamed from: b, reason: collision with root package name */
    private T f109057b;

    public C11121a(@NotNull Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f109056a = message;
    }

    @Override // id.e
    @NotNull
    public final T getValue(Object obj, @NotNull m<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        T t2 = this.f109057b;
        if (t2 != null) {
            return t2;
        }
        throw new IllegalArgumentException(this.f109056a.invoke().toString());
    }

    @Override // id.f
    public final void setValue(Object obj, @NotNull m<?> property, @NotNull T value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f109057b = value;
    }
}

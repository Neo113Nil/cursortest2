package ib0;

import id.f;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;

/* renamed from: ib0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C7040a<T> implements f<Object, T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<String> f66216a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private AtomicReference<T> f66217b;

    public C7040a(@NotNull Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f66216a = message;
        this.f66217b = new AtomicReference<>(null);
    }

    @Override // id.e
    @NotNull
    public final T getValue(Object obj, @NotNull m<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        T t2 = this.f66217b.get();
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException(this.f66216a.invoke().toString());
    }

    @Override // id.f
    public final void setValue(Object obj, @NotNull m<?> property, @NotNull T value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        AtomicReference<T> atomicReference = this.f66217b;
        while (!atomicReference.compareAndSet(null, value) && atomicReference.get() == null) {
        }
    }
}

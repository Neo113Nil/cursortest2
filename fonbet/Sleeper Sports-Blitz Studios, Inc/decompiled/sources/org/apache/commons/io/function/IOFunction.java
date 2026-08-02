package org.apache.commons.io.function;

import java.io.IOException;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
/* loaded from: classes10.dex */
public interface IOFunction<T, R> {
    static /* synthetic */ Object lambda$identity$8(Object obj) throws IOException {
        return obj;
    }

    R apply(T t) throws IOException;

    default <V> IOFunction<V, R> compose(final IOFunction<? super V, ? extends T> iOFunction) {
        Objects.requireNonNull(iOFunction);
        return new IOFunction() { // from class: org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda7
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                Object apply;
                apply = IOFunction.this.apply(iOFunction.apply(obj));
                return apply;
            }
        };
    }

    default <V> IOFunction<V, R> compose(final Function<? super V, ? extends T> function) {
        Objects.requireNonNull(function);
        return new IOFunction() { // from class: org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda1
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                Object apply;
                apply = IOFunction.this.apply(function.apply(obj));
                return apply;
            }
        };
    }

    default IOSupplier<R> compose(final IOSupplier<? extends T> iOSupplier) {
        Objects.requireNonNull(iOSupplier);
        return new IOSupplier() { // from class: org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda6
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                Object apply;
                apply = IOFunction.this.apply(iOSupplier.get());
                return apply;
            }
        };
    }

    default IOSupplier<R> compose(final Supplier<? extends T> supplier) {
        Objects.requireNonNull(supplier);
        return new IOSupplier() { // from class: org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda8
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                Object apply;
                apply = IOFunction.this.apply(supplier.get());
                return apply;
            }
        };
    }

    default <V> IOFunction<T, V> andThen(final IOFunction<? super R, ? extends V> iOFunction) {
        Objects.requireNonNull(iOFunction);
        return new IOFunction() { // from class: org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda0
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                Object apply;
                apply = iOFunction.apply(IOFunction.this.apply(obj));
                return apply;
            }
        };
    }

    default <V> IOFunction<T, V> andThen(final Function<? super R, ? extends V> function) {
        Objects.requireNonNull(function);
        return new IOFunction() { // from class: org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda3
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                Object apply;
                apply = function.apply(IOFunction.this.apply(obj));
                return apply;
            }
        };
    }

    default IOConsumer<T> andThen(final IOConsumer<? super R> iOConsumer) {
        Objects.requireNonNull(iOConsumer);
        return new IOConsumer() { // from class: org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda2
            @Override // org.apache.commons.io.function.IOConsumer
            public final void accept(Object obj) {
                iOConsumer.accept(IOFunction.this.apply(obj));
            }
        };
    }

    default IOConsumer<T> andThen(final Consumer<? super R> consumer) {
        Objects.requireNonNull(consumer);
        return new IOConsumer() { // from class: org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda4
            @Override // org.apache.commons.io.function.IOConsumer
            public final void accept(Object obj) {
                consumer.accept(IOFunction.this.apply(obj));
            }
        };
    }

    static <T> IOFunction<T, T> identity() {
        return new IOFunction() { // from class: org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda5
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                return IOFunction.lambda$identity$8(obj);
            }
        };
    }
}

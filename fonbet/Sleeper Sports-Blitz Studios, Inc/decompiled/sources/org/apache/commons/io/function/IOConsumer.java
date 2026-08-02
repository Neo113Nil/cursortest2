package org.apache.commons.io.function;

import java.io.IOException;
import java.util.Objects;

@FunctionalInterface
/* loaded from: classes10.dex */
public interface IOConsumer<T> {
    void accept(T t) throws IOException;

    default IOConsumer<T> andThen(final IOConsumer<? super T> iOConsumer) {
        Objects.requireNonNull(iOConsumer);
        return new IOConsumer() { // from class: org.apache.commons.io.function.IOConsumer$$ExternalSyntheticLambda0
            @Override // org.apache.commons.io.function.IOConsumer
            public final void accept(Object obj) {
                IOConsumer.lambda$andThen$0(IOConsumer.this, iOConsumer, obj);
            }
        };
    }

    static /* synthetic */ void lambda$andThen$0(IOConsumer _this, IOConsumer iOConsumer, Object obj) throws IOException {
        _this.accept(obj);
        iOConsumer.accept(obj);
    }
}

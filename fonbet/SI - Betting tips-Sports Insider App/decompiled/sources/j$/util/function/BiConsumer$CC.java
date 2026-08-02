package j$.util.function;

import j$.util.Objects;
import j$.util.concurrent.r;
import java.util.function.BiConsumer;

/* renamed from: j$.util.function.BiConsumer$-CC, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class BiConsumer$CC {
    public static BiConsumer $default$andThen(BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(biConsumer2);
        return new r(1, biConsumer, biConsumer2);
    }
}

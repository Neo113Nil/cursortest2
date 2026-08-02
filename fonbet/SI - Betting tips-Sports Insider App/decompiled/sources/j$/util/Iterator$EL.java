package j$.util;

import java.util.Iterator;
import java.util.function.Consumer;

/* renamed from: j$.util.Iterator$-EL, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class Iterator$EL {
    public static void forEachRemaining(Iterator it, Consumer consumer) {
        if (it instanceof y) {
            ((y) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}

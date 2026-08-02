package Eh;

import io.opentelemetry.internal.shaded.jctools.queues.d;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f3103a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f3104b = Logger.getLogger(d.class.getName());

    public static void a(Queue queue, int i10, final Consumer consumer) {
        if (!(queue instanceof io.opentelemetry.internal.shaded.jctools.queues.d)) {
            b(queue, i10, consumer);
        } else {
            Objects.requireNonNull(consumer);
            ((io.opentelemetry.internal.shaded.jctools.queues.d) queue).e(new d.a() { // from class: Eh.c
                @Override // io.opentelemetry.internal.shaded.jctools.queues.d.a
                public final void accept(Object obj) {
                    consumer.accept(obj);
                }
            }, i10);
        }
    }

    public static void b(Queue queue, int i10, Consumer consumer) {
        Object poll;
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            if (i11 >= i10 || (poll = queue.poll()) == null) {
                return;
            }
            consumer.accept(poll);
            i11 = i12;
        }
    }

    public static Queue c(int i10) {
        try {
            return new io.opentelemetry.internal.shaded.jctools.queues.e(i10);
        } catch (ExceptionInInitializerError | NoClassDefFoundError e10) {
            if (!f3103a.getAndSet(true)) {
                f3104b.log(Level.WARNING, "Cannot create high-performance queue, reverting to ArrayBlockingQueue ({0})", Objects.toString(e10, "unknown cause"));
            }
            return new ArrayBlockingQueue(i10);
        }
    }
}

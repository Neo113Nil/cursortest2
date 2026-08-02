package Sh;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlin.sequences.SequencesKt;

/* renamed from: Sh.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1568f {

    /* renamed from: a, reason: collision with root package name */
    public static final Collection f10786a = SequencesKt.toList(SequencesKt.asSequence(ServiceLoader.load(Ph.M.class, Ph.M.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f10786a;
    }

    public static final void b(Throwable th2) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
    }
}

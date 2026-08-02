package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;

/* renamed from: kotlinx.coroutines.flow.internal.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5325a extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient Object f54705a;

    public C5325a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f54705a = obj;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

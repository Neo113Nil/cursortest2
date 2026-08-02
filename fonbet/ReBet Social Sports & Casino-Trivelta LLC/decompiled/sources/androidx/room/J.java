package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class J implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f23279a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f23280b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f23281c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23282d;

    public J(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f23279a = executor;
        this.f23280b = new ArrayDeque();
        this.f23282d = new Object();
    }

    public static final void b(Runnable command, J this$0) {
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            command.run();
        } finally {
            this$0.c();
        }
    }

    public final void c() {
        synchronized (this.f23282d) {
            try {
                Object poll = this.f23280b.poll();
                Runnable runnable = (Runnable) poll;
                this.f23281c = runnable;
                if (poll != null) {
                    this.f23279a.execute(runnable);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        synchronized (this.f23282d) {
            try {
                this.f23280b.offer(new Runnable() { // from class: androidx.room.I
                    @Override // java.lang.Runnable
                    public final void run() {
                        J.b(command, this);
                    }
                });
                if (this.f23281c == null) {
                    c();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

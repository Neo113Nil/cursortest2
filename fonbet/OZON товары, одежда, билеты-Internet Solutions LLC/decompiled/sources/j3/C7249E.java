package j3;

import Sc.r;
import j3.y;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* renamed from: j3.E, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7249E implements y.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<y, y.b, Unit> f68931a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10737n f68932b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f68933c;

    public C7249E(@NotNull Function2 onEvents, @NotNull C10737n continuation) {
        Intrinsics.checkNotNullParameter(onEvents, "onEvents");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.f68931a = onEvents;
        this.f68932b = continuation;
        this.f68933c = new AtomicBoolean(false);
    }

    @Override // j3.y.c
    public final void Q(@NotNull y player, @NotNull y.b events) {
        AtomicBoolean atomicBoolean = this.f68933c;
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(events, "events");
        try {
            if (atomicBoolean.get()) {
                return;
            }
            this.f68931a.invoke(player, events);
        } catch (Throwable th2) {
            atomicBoolean.set(true);
            r.Companion companion = Sc.r.INSTANCE;
            this.f68932b.resumeWith(Sc.s.a(th2));
        }
    }

    @NotNull
    public final AtomicBoolean q() {
        return this.f68933c;
    }
}

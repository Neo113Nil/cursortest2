package ue0;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ue0.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C10048e implements InterfaceC10046c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<InterfaceC10046c> f100667a;

    /* JADX WARN: Multi-variable type inference failed */
    public C10048e(@NotNull List<? extends InterfaceC10046c> loggers) {
        Intrinsics.checkNotNullParameter(loggers, "loggers");
        this.f100667a = loggers;
    }

    @Override // ue0.InterfaceC10046c
    public final void a(@NotNull String tag, @NotNull String message, Throwable th2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Iterator<T> it = this.f100667a.iterator();
        while (it.hasNext()) {
            ((InterfaceC10046c) it.next()).a(tag, message, th2);
        }
    }

    @Override // ue0.InterfaceC10046c
    public final void b(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Iterator<T> it = this.f100667a.iterator();
        while (it.hasNext()) {
            ((InterfaceC10046c) it.next()).b(tag, message);
        }
    }

    @Override // ue0.InterfaceC10046c
    public final void c(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Iterator<T> it = this.f100667a.iterator();
        while (it.hasNext()) {
            ((InterfaceC10046c) it.next()).c(tag, message);
        }
    }

    @NotNull
    public final String toString() {
        return this.f100667a.toString();
    }
}

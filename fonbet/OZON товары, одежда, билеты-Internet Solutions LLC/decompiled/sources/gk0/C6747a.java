package gk0;

import android.app.Activity;
import android.content.Context;
import gk0.e;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.E0;

/* renamed from: gk0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6747a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentLinkedQueue<String> f64499a = new ConcurrentLinkedQueue<>();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ConcurrentLinkedQueue<Context> f64500b = new ConcurrentLinkedQueue<>();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomicInteger f64501c = new AtomicInteger(0);

    public final void a(@NotNull Function0<Unit> body) {
        AtomicInteger atomicInteger = this.f64501c;
        Intrinsics.checkNotNullParameter(body, "body");
        try {
            atomicInteger.getAndAdd(1);
            ((e.c.a) body).invoke();
        } finally {
            atomicInteger.getAndAdd(-1);
        }
    }

    public final void b(@NotNull Activity context, @NotNull Function0 body) {
        ConcurrentLinkedQueue<Context> concurrentLinkedQueue = this.f64500b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(body, "body");
        try {
            concurrentLinkedQueue.add(context);
            ((e.b.a) body).invoke();
        } finally {
            concurrentLinkedQueue.remove(context);
        }
    }

    public final void c(@NotNull String tag, @NotNull Function0<Unit> body) {
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = this.f64499a;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(body, "body");
        try {
            concurrentLinkedQueue.add(tag);
            ((e.a.C1045a) body).invoke();
        } finally {
            concurrentLinkedQueue.remove(tag);
        }
    }

    public final Unit d(@NotNull String str, @NotNull Context context, @NotNull kotlin.coroutines.d dVar) {
        if (this.f64499a.contains(str) || this.f64500b.contains(context) || this.f64501c.get() != 0) {
            E0.b(dVar.getContext(), null);
        }
        return Unit.f71690a;
    }
}

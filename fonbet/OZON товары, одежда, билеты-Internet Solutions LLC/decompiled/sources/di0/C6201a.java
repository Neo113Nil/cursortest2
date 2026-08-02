package di0;

import ci0.C5836a;
import ci0.InterfaceC5837b;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: di0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6201a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f61628a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final TreeSet<C5836a> f61629b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f61630c;

    public C6201a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f61628a = key;
        this.f61629b = new TreeSet<>();
        this.f61630c = new AtomicBoolean(false);
    }

    public static /* synthetic */ void f(C6201a c6201a, InterfaceC5837b interfaceC5837b, long j11, boolean z11, int i11) {
        if ((i11 & 2) != 0) {
            j11 = System.nanoTime();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        c6201a.e(interfaceC5837b, j11, z11);
    }

    @NotNull
    public final String a() {
        return this.f61628a;
    }

    public final synchronized Long b(@NotNull InterfaceC5837b type) {
        Object obj;
        C5836a c5836a;
        try {
            Intrinsics.checkNotNullParameter(type, "type");
            Iterator<T> it = this.f61629b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((C5836a) obj).a(), type)) {
                    break;
                }
            }
            c5836a = (C5836a) obj;
        } catch (Throwable th2) {
            throw th2;
        }
        return c5836a != null ? Long.valueOf(c5836a.b()) : null;
    }

    @NotNull
    public final synchronized TreeSet c() {
        return new TreeSet((SortedSet) this.f61629b);
    }

    public final boolean d() {
        return this.f61630c.get();
    }

    public final synchronized void e(@NotNull InterfaceC5837b type, long j11, boolean z11) {
        try {
            Intrinsics.checkNotNullParameter(type, "type");
            if (this.f61630c.get()) {
                C5836a c5836a = new C5836a(type, j11);
                if (!z11) {
                    if (!this.f61629b.contains(c5836a)) {
                    }
                }
                this.f61629b.remove(c5836a);
                this.f61629b.add(c5836a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void g() {
        this.f61630c.compareAndSet(false, true);
    }

    public final void h() {
        this.f61630c.compareAndSet(true, false);
    }

    @NotNull
    public final String toString() {
        return "PerfTrace(key='" + this.f61628a + "', metrics=" + this.f61629b + ", started=" + this.f61630c + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6201a(@NotNull C6201a trace) {
        this(trace.f61628a);
        Intrinsics.checkNotNullParameter(trace, "trace");
        this.f61629b.addAll(trace.f61629b);
    }
}

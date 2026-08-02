package h3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.M;

/* renamed from: h3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6791d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.google.common.primitives.e f64736a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f64737b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f64738c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f64739d;

    public C6791d() {
        this.f64736a = new com.google.common.primitives.e();
        this.f64737b = new LinkedHashMap();
        this.f64738c = new LinkedHashSet();
    }

    private static void d(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    public final void a(@NotNull AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        if (this.f64739d) {
            d(closeable);
            return;
        }
        synchronized (this.f64736a) {
            this.f64738c.add(closeable);
            Unit unit = Unit.f71690a;
        }
    }

    public final void b(@NotNull String key, @NotNull AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        if (this.f64739d) {
            d(closeable);
            return;
        }
        synchronized (this.f64736a) {
            autoCloseable = (AutoCloseable) this.f64737b.put(key, closeable);
        }
        d(autoCloseable);
    }

    public final void c() {
        if (this.f64739d) {
            return;
        }
        this.f64739d = true;
        synchronized (this.f64736a) {
            try {
                Iterator it = this.f64737b.values().iterator();
                while (it.hasNext()) {
                    d((AutoCloseable) it.next());
                }
                Iterator it2 = this.f64738c.iterator();
                while (it2.hasNext()) {
                    d((AutoCloseable) it2.next());
                }
                this.f64738c.clear();
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <T extends AutoCloseable> T e(@NotNull String key) {
        T t2;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f64736a) {
            t2 = (T) this.f64737b.get(key);
        }
        return t2;
    }

    public C6791d(@NotNull M coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "viewModelScope");
        this.f64736a = new com.google.common.primitives.e();
        this.f64737b = new LinkedHashMap();
        this.f64738c = new LinkedHashSet();
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        b("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", new C6788a(coroutineScope.getCoroutineContext()));
    }

    public C6791d(@NotNull AutoCloseable... closeables) {
        Intrinsics.checkNotNullParameter(closeables, "closeables");
        this.f64736a = new com.google.common.primitives.e();
        this.f64737b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f64738c = linkedHashSet;
        C7714v.r(linkedHashSet, closeables);
    }

    public C6791d(@NotNull M coroutineScope, @NotNull AutoCloseable... closeables) {
        Intrinsics.checkNotNullParameter(coroutineScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(closeables, "closeables");
        this.f64736a = new com.google.common.primitives.e();
        this.f64737b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f64738c = linkedHashSet;
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        b("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", new C6788a(coroutineScope.getCoroutineContext()));
        C7714v.r(linkedHashSet, closeables);
    }
}

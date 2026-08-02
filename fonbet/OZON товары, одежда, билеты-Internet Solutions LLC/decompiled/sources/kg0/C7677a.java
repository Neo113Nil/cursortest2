package kg0;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: kg0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7677a implements InterfaceC7679c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Set<InterfaceC7678b> f71590a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Set<InterfaceC7679c> f71591b;

    /* JADX WARN: Multi-variable type inference failed */
    public C7677a(@NotNull Set<? extends InterfaceC7678b> enrichers, @NotNull Set<? extends InterfaceC7679c> repeatableEnrichers) {
        Intrinsics.checkNotNullParameter(enrichers, "enrichers");
        Intrinsics.checkNotNullParameter(repeatableEnrichers, "repeatableEnrichers");
        this.f71590a = enrichers;
        this.f71591b = repeatableEnrichers;
    }

    @Override // kg0.InterfaceC7678b
    public final void a() {
        Iterator<T> it = this.f71590a.iterator();
        while (it.hasNext()) {
            ((InterfaceC7678b) it.next()).a();
        }
    }

    @Override // kg0.InterfaceC7679c
    public final void b() {
        Iterator<T> it = this.f71591b.iterator();
        while (it.hasNext()) {
            ((InterfaceC7679c) it.next()).b();
        }
    }
}

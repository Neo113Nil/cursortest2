package wf0;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wf0.a;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f104501a;

    @NotNull
    public static final a a() throws IllegalStateException {
        Intrinsics.checkNotNullParameter(a.f104498b, "<this>");
        a aVar = f104501a;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("DomainReachability not initialized. Call `init` method first");
    }

    public static final a b() {
        Intrinsics.checkNotNullParameter(a.f104498b, "<this>");
        return f104501a;
    }

    public static final void c(@NotNull b config) throws IllegalStateException {
        a.C2259a c2259a = a.f104498b;
        Intrinsics.checkNotNullParameter(c2259a, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        if (f104501a != null) {
            throw new IllegalStateException("DomainReachability already initialized");
        }
        synchronized (c2259a) {
            if (f104501a != null) {
                throw new IllegalStateException("DomainReachability already initialized");
            }
            f104501a = new a(config);
            Unit unit = Unit.f71690a;
        }
    }
}

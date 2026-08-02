package gf0;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: gf0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6729a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f64463a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f64464b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f64465c;

    public AbstractC6729a(@NotNull String destinationName) {
        Intrinsics.checkNotNullParameter(destinationName, "destinationName");
        this.f64463a = destinationName;
        this.f64464b = new LinkedHashSet();
        this.f64465c = new LinkedHashSet();
    }

    @NotNull
    public final LinkedHashSet a() {
        return this.f64464b;
    }

    @NotNull
    public final LinkedHashSet b() {
        return this.f64464b;
    }

    @NotNull
    public final LinkedHashSet c() {
        return this.f64465c;
    }

    @NotNull
    public final LinkedHashSet d() {
        return this.f64465c;
    }

    @NotNull
    public final String e() {
        return this.f64463a;
    }
}

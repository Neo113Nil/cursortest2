package p00;

import org.jetbrains.annotations.NotNull;
import p00.InterfaceC8826b;

/* renamed from: p00.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8825a extends InterfaceC8826b.a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C8825a f80002b = new C8825a();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f80003c = "COMPOSER_PERFORMANCE_LOGGER";

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f80004d = "Performance metrics logger";

    @Override // p00.InterfaceC8826b.a
    @NotNull
    public final String b() {
        return f80004d;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C8825a);
    }

    @Override // p00.InterfaceC8826b
    @NotNull
    public final String getName() {
        return f80003c;
    }

    public final int hashCode() {
        return 454990404;
    }

    @NotNull
    public final String toString() {
        return "ComposerPerformanceLoggerEnabled";
    }
}

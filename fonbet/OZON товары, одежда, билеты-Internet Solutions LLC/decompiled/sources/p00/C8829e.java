package p00;

import org.jetbrains.annotations.NotNull;
import p00.InterfaceC8826b;

/* renamed from: p00.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8829e extends InterfaceC8826b.AbstractC1343b {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C8829e f80013b = new C8829e();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f80014c = "X03_COMPOSER_DEBUG_HEADER_VALUE";

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f80015d = "Введите x03 composer debug header value";

    @Override // p00.InterfaceC8826b.AbstractC1343b
    @NotNull
    public final String b() {
        return f80015d;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C8829e);
    }

    @Override // p00.InterfaceC8826b
    @NotNull
    public final String getName() {
        return f80014c;
    }

    public final int hashCode() {
        return 2129397193;
    }

    @NotNull
    public final String toString() {
        return "X03ComposerDebugHeaderValue";
    }
}

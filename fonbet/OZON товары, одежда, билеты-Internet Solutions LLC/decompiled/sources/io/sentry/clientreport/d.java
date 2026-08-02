package io.sentry.clientreport;

import io.sentry.util.p;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f67830a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f67831b;

    d(@NotNull String str, @NotNull String str2) {
        this.f67830a = str;
        this.f67831b = str2;
    }

    @NotNull
    public final String a() {
        return this.f67831b;
    }

    @NotNull
    public final String b() {
        return this.f67830a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p.a(this.f67830a, dVar.f67830a) && p.a(this.f67831b, dVar.f67831b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f67830a, this.f67831b});
    }
}

package io.sentry;

import java.util.Objects;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f66588a;

    /* renamed from: b, reason: collision with root package name */
    private final Pattern f66589b;

    public C(@NotNull String str) {
        Pattern pattern;
        this.f66588a = str;
        try {
            pattern = Pattern.compile(str);
        } catch (Throwable unused) {
            K1.d().getOptions().getLogger().c(I2.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            pattern = null;
        }
        this.f66589b = pattern;
    }

    @NotNull
    public final String a() {
        return this.f66588a;
    }

    public final boolean b(String str) {
        Pattern pattern = this.f66589b;
        if (pattern == null) {
            return false;
        }
        return pattern.matcher(str).matches();
    }

    public final boolean equals(Object obj) {
        if (obj == null || C.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f66588a, ((C) obj).f66588a);
    }

    public final int hashCode() {
        return Objects.hash(this.f66588a);
    }
}

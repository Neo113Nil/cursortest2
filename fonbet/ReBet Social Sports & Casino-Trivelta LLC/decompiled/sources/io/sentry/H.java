package io.sentry;

import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final String f50352a;

    /* renamed from: b, reason: collision with root package name */
    public final Pattern f50353b;

    public H(String str) {
        Pattern pattern;
        this.f50352a = str;
        try {
            pattern = Pattern.compile(str);
        } catch (Throwable unused) {
            AbstractC4772k2.p().i().getLogger().c(EnumC4788n3.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            pattern = null;
        }
        this.f50353b = pattern;
    }

    public String a() {
        return this.f50352a;
    }

    public boolean b(String str) {
        Pattern pattern = this.f50353b;
        if (pattern == null) {
            return false;
        }
        return pattern.matcher(str).matches();
    }

    public boolean equals(Object obj) {
        if (obj == null || H.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f50352a, ((H) obj).f50352a);
    }

    public int hashCode() {
        return Objects.hash(this.f50352a);
    }
}

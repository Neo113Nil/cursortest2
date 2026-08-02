package io.sentry;

import j$.util.Objects;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f16391a;

    /* renamed from: b, reason: collision with root package name */
    public final Pattern f16392b;

    public f0(String str) {
        Pattern pattern;
        this.f16391a = str;
        try {
            pattern = Pattern.compile(str);
        } catch (Throwable unused) {
            d4.d().m().getLogger().h(b5.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            pattern = null;
        }
        this.f16392b = pattern;
    }

    public final boolean equals(Object obj) {
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f16391a, ((f0) obj).f16391a);
    }

    public final int hashCode() {
        return Objects.hash(this.f16391a);
    }
}

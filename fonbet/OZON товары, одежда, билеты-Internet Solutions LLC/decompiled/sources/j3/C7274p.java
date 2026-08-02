package j3;

import java.util.Objects;

/* renamed from: j3.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7274p {

    /* renamed from: a, reason: collision with root package name */
    public final String f69180a;

    /* renamed from: b, reason: collision with root package name */
    public final String f69181b;

    static {
        m3.N.L(0);
        m3.N.L(1);
    }

    public C7274p(String str, String str2) {
        this.f69180a = m3.N.R(str);
        this.f69181b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7274p.class == obj.getClass()) {
            C7274p c7274p = (C7274p) obj;
            if (Objects.equals(this.f69180a, c7274p.f69180a) && Objects.equals(this.f69181b, c7274p.f69181b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f69181b.hashCode() * 31;
        String str = this.f69180a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}

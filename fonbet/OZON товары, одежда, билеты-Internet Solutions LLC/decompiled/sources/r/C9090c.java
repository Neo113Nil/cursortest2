package r;

import java.util.Arrays;

/* renamed from: r.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9090c {

    /* renamed from: a, reason: collision with root package name */
    private final int f82301a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f82302b;

    C9090c(int i11, CharSequence charSequence) {
        this.f82301a = i11;
        this.f82302b = charSequence;
    }

    final int a() {
        return this.f82301a;
    }

    final CharSequence b() {
        return this.f82302b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9090c)) {
            return false;
        }
        C9090c c9090c = (C9090c) obj;
        if (this.f82301a != c9090c.f82301a) {
            return false;
        }
        CharSequence charSequence = this.f82302b;
        String charSequence2 = charSequence != null ? charSequence.toString() : null;
        CharSequence charSequence3 = c9090c.f82302b;
        String charSequence4 = charSequence3 != null ? charSequence3.toString() : null;
        if (charSequence2 == null && charSequence4 == null) {
            return true;
        }
        return charSequence2 != null && charSequence2.equals(charSequence4);
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.f82301a);
        CharSequence charSequence = this.f82302b;
        return Arrays.hashCode(new Object[]{valueOf, charSequence != null ? charSequence.toString() : null});
    }
}

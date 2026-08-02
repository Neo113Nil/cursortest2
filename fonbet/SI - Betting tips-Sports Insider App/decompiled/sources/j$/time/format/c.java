package j$.time.format;

/* loaded from: classes2.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final char f17380a;

    public c(char c2) {
        this.f17380a = c2;
    }

    @Override // j$.time.format.e
    public final boolean i(y yVar, StringBuilder sb2) {
        sb2.append(this.f17380a);
        return true;
    }

    @Override // j$.time.format.e
    public final int j(v vVar, CharSequence charSequence, int i5) {
        if (i5 == charSequence.length()) {
            return ~i5;
        }
        char charAt = charSequence.charAt(i5);
        char c2 = this.f17380a;
        return (charAt == c2 || (!vVar.f17459b && (Character.toUpperCase(charAt) == Character.toUpperCase(c2) || Character.toLowerCase(charAt) == Character.toLowerCase(c2)))) ? i5 + 1 : ~i5;
    }

    public final String toString() {
        char c2 = this.f17380a;
        if (c2 == '\'') {
            return "''";
        }
        return "'" + c2 + "'";
    }
}

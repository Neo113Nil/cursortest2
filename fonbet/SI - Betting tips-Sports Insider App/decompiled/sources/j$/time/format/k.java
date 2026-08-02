package j$.time.format;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes2.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final e f17418a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17419b;

    /* renamed from: c, reason: collision with root package name */
    public final char f17420c;

    @Override // j$.time.format.e
    public final int j(v vVar, CharSequence charSequence, int i5) {
        boolean z5 = vVar.f17460c;
        if (i5 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i5 == charSequence.length()) {
            return ~i5;
        }
        int i10 = this.f17419b + i5;
        if (i10 > charSequence.length()) {
            if (z5) {
                return ~i5;
            }
            i10 = charSequence.length();
        }
        int i11 = i5;
        while (i11 < i10 && vVar.a(charSequence.charAt(i11), this.f17420c)) {
            i11++;
        }
        int j = this.f17418a.j(vVar, charSequence.subSequence(0, i10), i11);
        return (j == i10 || !z5) ? j : ~(i5 + i11);
    }

    public k(e eVar, int i5, char c2) {
        this.f17418a = eVar;
        this.f17419b = i5;
        this.f17420c = c2;
    }

    @Override // j$.time.format.e
    public final boolean i(y yVar, StringBuilder sb2) {
        int length = sb2.length();
        if (!this.f17418a.i(yVar, sb2)) {
            return false;
        }
        int length2 = sb2.length() - length;
        int i5 = this.f17419b;
        if (length2 <= i5) {
            for (int i10 = 0; i10 < i5 - length2; i10++) {
                sb2.insert(length, this.f17420c);
            }
            return true;
        }
        throw new j$.time.b("Cannot print as output of " + length2 + " characters exceeds pad width of " + i5);
    }

    public final String toString() {
        String str;
        char c2 = this.f17420c;
        if (c2 == ' ') {
            str = ")";
        } else {
            str = ",'" + c2 + "')";
        }
        return "Pad(" + this.f17418a + StringUtils.COMMA + this.f17419b + str;
    }
}

package j$.time.format;

/* loaded from: classes2.dex */
public final class l extends m {
    @Override // j$.time.format.m
    public final m d(String str, String str2, m mVar) {
        return new l(str, str2, mVar);
    }

    @Override // j$.time.format.m
    public final boolean b(char c2, char c8) {
        return v.b(c2, c8);
    }

    @Override // j$.time.format.m
    public final boolean e(CharSequence charSequence, int i5, int i10) {
        int length = this.f17421a.length();
        if (length > i10 - i5) {
            return false;
        }
        int i11 = 0;
        while (true) {
            int i12 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i13 = i11 + 1;
            int i14 = i5 + 1;
            if (!v.b(this.f17421a.charAt(i11), charSequence.charAt(i5))) {
                return false;
            }
            i5 = i14;
            length = i12;
            i11 = i13;
        }
    }
}

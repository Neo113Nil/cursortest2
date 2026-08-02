package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qcp implements CharSequence {
    public char[] a;
    public String b;

    private qcp() {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.a[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.a.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new String(this.a, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.a);
        this.b = str2;
        return str2;
    }
}

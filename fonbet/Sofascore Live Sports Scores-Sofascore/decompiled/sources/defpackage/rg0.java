package defpackage;

import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class rg0 implements CharSequence {
    public final char[] a;
    public int b;

    public rg0(char[] cArr) {
        this.a = cArr;
        this.b = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.a[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return c.i(this.a, i, Math.min(i2, this.b));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.b;
        return c.i(this.a, 0, Math.min(i, i));
    }
}

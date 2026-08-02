package defpackage;

import com.ironsource.mediationsdk.metadata.a;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class oo2 implements CharSequence, Appendable {
    public final akd a;
    public ArrayList b;
    public char[] c;
    public String d;
    public boolean e;
    public int f;
    public int g;

    public oo2() {
        akd akdVar = uo2.a;
        akdVar.getClass();
        this.a = akdVar;
    }

    public final char[] a(int i) {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            char[] cArr = this.c;
            cArr.getClass();
            return (char[]) arrayList.get(i / cArr.length);
        }
        if (i >= 2048) {
            e(i);
            throw null;
        }
        char[] cArr2 = this.c;
        if (cArr2 != null) {
            return cArr2;
        }
        e(i);
        throw null;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            return this;
        }
        int i3 = i;
        while (i3 < i2) {
            char[] d = d();
            int length = d.length;
            int i4 = this.f;
            int i5 = length - i4;
            int min = Math.min(i2 - i3, i4);
            for (int i6 = 0; i6 < min; i6++) {
                d[i5 + i6] = charSequence.charAt(i3 + i6);
            }
            i3 += min;
            this.f -= min;
        }
        this.d = null;
        this.g = (i2 - i) + this.g;
        return this;
    }

    public final CharSequence b(int i, int i2) {
        if (i == i2) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i2 - i);
        for (int i3 = i - (i % a.o); i3 < i2; i3 += a.o) {
            char[] a = a(i3);
            int min = Math.min(i2 - i3, a.o);
            for (int max = Math.max(0, i - i3); max < min; max++) {
                sb.append(a[max]);
            }
        }
        return sb;
    }

    public final char c(int i) {
        char[] a = a(i);
        char[] cArr = this.c;
        cArr.getClass();
        return a[i % cArr.length];
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0) {
            ogj.h(ljg.j(i, "index is negative: "));
            return (char) 0;
        }
        if (i < this.g) {
            return c(i);
        }
        ogj.h(wv8.j(lnb.t(i, "index ", " is not in range [0, "), this.g, ')'));
        return (char) 0;
    }

    public final char[] d() {
        if (this.f != 0) {
            char[] cArr = this.c;
            cArr.getClass();
            return cArr;
        }
        char[] cArr2 = (char[]) this.a.p0();
        char[] cArr3 = this.c;
        this.c = cArr2;
        this.f = cArr2.length;
        this.e = false;
        if (cArr3 != null) {
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.b = arrayList;
                arrayList.add(cArr3);
            }
            arrayList.add(cArr2);
        }
        return cArr2;
    }

    public final void e(int i) {
        if (this.e) {
            throw new IllegalStateException("Buffer is already released");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is not in range [0; ");
        char[] cArr = this.c;
        cArr.getClass();
        sb.append(cArr.length - this.f);
        sb.append(')');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (this.g == charSequence.length()) {
                int i = this.g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (c(i2) != charSequence.charAt(i2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.d;
        if (str != null) {
            return str.hashCode();
        }
        int i = this.g;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + c(i3);
        }
        return i2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.g;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i > i2) {
            ogj.j(") should be less or equal to endIndex (", "startIndex (", i, i2);
            return null;
        }
        if (i < 0) {
            ogj.h(ljg.j(i, "startIndex is negative: "));
            return null;
        }
        if (i2 <= this.g) {
            return new mo2(this, i, i2);
        }
        ogj.h(wv8.j(lnb.t(i2, "endIndex (", ") is greater than length ("), this.g, ')'));
        return null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        String obj = b(0, this.g).toString();
        this.d = obj;
        return obj;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        char[] d = d();
        char[] cArr = this.c;
        cArr.getClass();
        int length = cArr.length;
        int i = this.f;
        d[length - i] = c;
        this.d = null;
        this.f = i - 1;
        this.g++;
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            return this;
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }
}

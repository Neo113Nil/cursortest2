package defpackage;

import com.google.android.gms.internal.consent_sdk.zzdj;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jzn implements Iterator {
    public String a;
    public final String c;
    public int b = 2;
    public int d = 0;
    public int e = Integer.MAX_VALUE;

    public jzn(String str) {
        this.c = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2 = this.b;
        if (i2 == 4) {
            zzl.s();
            return false;
        }
        int i3 = i2 - 1;
        String str = null;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            return true;
        }
        if (i3 != 2) {
            this.b = 4;
            int i4 = this.d;
            while (true) {
                int i5 = this.d;
                if (i5 == -1) {
                    this.b = 3;
                    break;
                }
                String str2 = this.c;
                int length = str2.length();
                zzdj.b(i5, length);
                while (true) {
                    if (i5 >= length) {
                        i5 = -1;
                        break;
                    }
                    if (str2.charAt(i5) == ',') {
                        break;
                    }
                    i5++;
                }
                if (i5 == -1) {
                    i5 = str2.length();
                    this.d = -1;
                    i = -1;
                } else {
                    i = i5 + 1;
                    this.d = i;
                }
                if (i == i4) {
                    int i6 = i + 1;
                    this.d = i6;
                    if (i6 > str2.length()) {
                        this.d = -1;
                    }
                } else {
                    if (i4 < i5) {
                        str2.charAt(i4);
                    }
                    if (i4 < i5) {
                        str2.charAt(i5 - 1);
                    }
                    int i7 = this.e;
                    if (i7 == 1) {
                        i5 = str2.length();
                        this.d = -1;
                        if (i5 > i4) {
                            str2.charAt(i5 - 1);
                        }
                    } else {
                        this.e = i7 - 1;
                    }
                    str = str2.subSequence(i4, i5).toString();
                }
            }
            this.a = str;
            if (this.b != 3) {
                this.b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            yhk.d();
            return null;
        }
        this.b = 2;
        String str = this.a;
        this.a = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

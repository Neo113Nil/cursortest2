package defpackage;

import com.google.android.gms.internal.ads.zzgty;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzguz;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class pyh implements Iterator {
    public final /* synthetic */ int a;
    public String b;
    public int c;
    public final CharSequence d;
    public final boolean e;
    public int f;
    public int g;
    public final Object h;

    public pyh(zzguz zzguzVar, CharSequence charSequence) {
        this.a = 1;
        this.c = 2;
        this.f = 0;
        this.h = zzguzVar.a;
        this.e = zzguzVar.b;
        this.g = Integer.MAX_VALUE;
        this.d = charSequence;
    }

    public abstract int a(int i);

    public abstract int b(int i);

    public abstract int c(int i);

    public abstract int d(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int b;
        int a;
        int c;
        int d;
        int i = this.a;
        boolean z = this.e;
        CharSequence charSequence = this.d;
        Object obj = this.h;
        String str = null;
        switch (i) {
            case 0:
                z1a.E(this.c != 4);
                int C = wt3.C(this.c);
                if (C == 0) {
                    return true;
                }
                if (C != 2) {
                    this.c = 4;
                    ip2 ip2Var = (ip2) obj;
                    int i2 = this.f;
                    while (true) {
                        int i3 = this.f;
                        if (i3 != -1) {
                            b = b(i3);
                            if (b == -1) {
                                b = charSequence.length();
                                this.f = -1;
                                a = -1;
                            } else {
                                a = a(b);
                                this.f = a;
                            }
                            if (a == i2) {
                                int i4 = a + 1;
                                this.f = i4;
                                if (i4 > charSequence.length()) {
                                    this.f = -1;
                                }
                            } else {
                                while (i2 < b && ip2Var.b(charSequence.charAt(i2))) {
                                    i2++;
                                }
                                while (b > i2 && ip2Var.b(charSequence.charAt(b - 1))) {
                                    b--;
                                }
                                if (z && i2 == b) {
                                    i2 = this.f;
                                }
                            }
                        } else {
                            this.c = 3;
                        }
                    }
                    int i5 = this.g;
                    if (i5 == 1) {
                        int length = charSequence.length();
                        this.f = -1;
                        b = length;
                        while (b > i2 && ip2Var.b(charSequence.charAt(b - 1))) {
                            b--;
                        }
                    } else {
                        this.g = i5 - 1;
                    }
                    str = charSequence.subSequence(i2, b).toString();
                    this.b = str;
                    if (this.c != 3) {
                        this.c = 1;
                        return true;
                    }
                }
                return false;
            default:
                zzguk.f(this.c != 4);
                int i6 = this.c;
                int i7 = i6 - 1;
                if (i6 == 0) {
                    throw null;
                }
                if (i7 == 0) {
                    return true;
                }
                if (i7 != 2) {
                    this.c = 4;
                    zzgty zzgtyVar = (zzgty) obj;
                    int i8 = this.f;
                    while (true) {
                        int i9 = this.f;
                        if (i9 != -1) {
                            c = c(i9);
                            if (c == -1) {
                                c = charSequence.length();
                                this.f = -1;
                                d = -1;
                            } else {
                                d = d(c);
                                this.f = d;
                            }
                            if (d == i8) {
                                int i10 = d + 1;
                                this.f = i10;
                                if (i10 > charSequence.length()) {
                                    this.f = -1;
                                }
                            } else {
                                while (i8 < c && zzgtyVar.a(charSequence.charAt(i8))) {
                                    i8++;
                                }
                                while (c > i8) {
                                    int i11 = c - 1;
                                    if (zzgtyVar.a(charSequence.charAt(i11))) {
                                        c = i11;
                                    } else if (!z && i8 == c) {
                                        i8 = this.f;
                                    }
                                }
                                if (!z) {
                                }
                            }
                        } else {
                            this.c = 3;
                        }
                    }
                    int i12 = this.g;
                    if (i12 == 1) {
                        int length2 = charSequence.length();
                        this.f = -1;
                        do {
                            c = length2;
                            if (c > i8) {
                                length2 = c - 1;
                            }
                        } while (zzgtyVar.a(charSequence.charAt(length2)));
                    } else {
                        this.g = i12 - 1;
                    }
                    str = charSequence.subSequence(i8, c).toString();
                    this.b = str;
                    if (this.c != 3) {
                        this.c = 1;
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (!hasNext()) {
                    yhk.d();
                    break;
                } else {
                    this.c = 2;
                    String str = this.b;
                    this.b = null;
                    break;
                }
            default:
                if (!hasNext()) {
                    yhk.d();
                    break;
                } else {
                    this.c = 2;
                    String str2 = this.b;
                    this.b = null;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public pyh(a02 a02Var, CharSequence charSequence) {
        this.a = 0;
        this.c = 2;
        this.f = 0;
        this.h = (ip2) a02Var.d;
        this.e = a02Var.c;
        this.g = a02Var.b;
        this.d = charSequence;
    }
}

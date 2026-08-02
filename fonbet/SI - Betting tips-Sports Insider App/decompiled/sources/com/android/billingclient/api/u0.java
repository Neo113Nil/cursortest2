package com.android.billingclient.api;

import android.net.Uri;
import com.google.android.gms.internal.measurement.l4;
import com.google.android.gms.internal.play_billing.i5;
import com.google.android.gms.internal.play_billing.p1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class u0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4106a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4107b;

    public u0(Uri uri, boolean z5, boolean z7) {
        this.f4107b = uri;
        this.f4106a = z5;
    }

    public boolean a() {
        return this.f4106a;
    }

    public boolean b(int i5, CharSequence charSequence) {
        if (charSequence == null || i5 < 0 || charSequence.length() - i5 < 0) {
            throw new IllegalArgumentException();
        }
        o0.e eVar = (o0.e) this.f4107b;
        if (eVar == null) {
            return a();
        }
        eVar.getClass();
        char c2 = 2;
        for (int i10 = 0; i10 < i5 && c2 == 2; i10++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i10));
            u0 u0Var = o0.f.f21075a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c2 = 2;
                            break;
                    }
                }
                c2 = 0;
            }
            c2 = 1;
        }
        if (c2 == 0) {
            return true;
        }
        if (c2 != 1) {
            return a();
        }
        return false;
    }

    public void c() {
        this.f4106a = false;
    }

    public void d(byte b10) {
        ((l0) this.f4107b).n(String.valueOf(b10));
    }

    public void e(char c2) {
        l0 l0Var = (l0) this.f4107b;
        l0Var.d(l0Var.f4044b, 1);
        char[] cArr = (char[]) l0Var.f4045c;
        int i5 = l0Var.f4044b;
        l0Var.f4044b = i5 + 1;
        cArr[i5] = c2;
    }

    public void f(int i5) {
        ((l0) this.f4107b).n(String.valueOf(i5));
    }

    public void g(long j) {
        ((l0) this.f4107b).n(String.valueOf(j));
    }

    public void h(String v5) {
        Intrinsics.checkNotNullParameter(v5, "v");
        ((l0) this.f4107b).n(v5);
    }

    public void i(short s8) {
        ((l0) this.f4107b).n(String.valueOf(s8));
    }

    public void j(String text) {
        int i5;
        Intrinsics.checkNotNullParameter(text, "value");
        l0 l0Var = (l0) this.f4107b;
        Intrinsics.checkNotNullParameter(text, "text");
        l0Var.d(l0Var.f4044b, text.length() + 2);
        char[] cArr = (char[]) l0Var.f4045c;
        int i10 = l0Var.f4044b;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        int i13 = i11;
        while (i13 < i12) {
            char c2 = cArr[i13];
            byte[] bArr = ug.v.f24322b;
            if (c2 < bArr.length && bArr[c2] != 0) {
                int length2 = text.length();
                for (int i14 = i13 - i11; i14 < length2; i14++) {
                    l0Var.d(i13, 2);
                    char charAt = text.charAt(i14);
                    byte[] bArr2 = ug.v.f24322b;
                    if (charAt < bArr2.length) {
                        byte b10 = bArr2[charAt];
                        if (b10 == 0) {
                            i5 = i13 + 1;
                            ((char[]) l0Var.f4045c)[i13] = charAt;
                        } else {
                            if (b10 == 1) {
                                String str = ug.v.f24321a[charAt];
                                Intrinsics.checkNotNull(str);
                                l0Var.d(i13, str.length());
                                str.getChars(0, str.length(), (char[]) l0Var.f4045c, i13);
                                int length3 = str.length() + i13;
                                l0Var.f4044b = length3;
                                i13 = length3;
                            } else {
                                char[] cArr2 = (char[]) l0Var.f4045c;
                                cArr2[i13] = '\\';
                                cArr2[i13 + 1] = (char) b10;
                                i13 += 2;
                                l0Var.f4044b = i13;
                            }
                        }
                    } else {
                        i5 = i13 + 1;
                        ((char[]) l0Var.f4045c)[i13] = charAt;
                    }
                    i13 = i5;
                }
                l0Var.d(i13, 1);
                ((char[]) l0Var.f4045c)[i13] = '\"';
                l0Var.f4044b = i13 + 1;
                return;
            }
            i13++;
        }
        cArr[i12] = '\"';
        l0Var.f4044b = i12 + 1;
    }

    public void m(i5 i5Var) {
        if (this.f4106a) {
            p1.g("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((c4.d) this.f4107b).o(new b5.a(i5Var, null));
        } catch (Throwable unused) {
            p1.g("BillingLogger", "logging failed.");
        }
    }

    public l4 n(long j, String str) {
        Long valueOf = Long.valueOf(j);
        Object obj = l4.f5117g;
        return new l4(this, str, valueOf, 0);
    }

    public l4 o(String str, boolean z5) {
        Boolean valueOf = Boolean.valueOf(z5);
        Object obj = l4.f5117g;
        return new l4(this, str, valueOf, 1);
    }

    public l4 p(String str, String str2) {
        Object obj = l4.f5117g;
        return new l4(this, str, str2, 3);
    }

    public u0(l0 writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f4107b = writer;
        this.f4106a = true;
    }

    public u0(o0.e eVar, boolean z5) {
        this.f4107b = eVar;
        this.f4106a = z5;
    }

    public void k() {
    }

    public void l() {
    }
}

package androidx.biometric;

import java.util.Arrays;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f17459a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f17460b;

    public c(int i10, CharSequence charSequence) {
        this.f17459a = i10;
        this.f17460b = charSequence;
    }

    public static String a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public int b() {
        return this.f17459a;
    }

    public CharSequence c() {
        return this.f17460b;
    }

    public final boolean d(CharSequence charSequence) {
        String a10 = a(this.f17460b);
        String a11 = a(charSequence);
        if (a10 == null && a11 == null) {
            return true;
        }
        return a10 != null && a10.equals(a11);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f17459a == cVar.f17459a && d(cVar.f17460b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17459a), a(this.f17460b)});
    }
}

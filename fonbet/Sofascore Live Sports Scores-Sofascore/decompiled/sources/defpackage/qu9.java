package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qu9 {
    public static final qu9 g = new qu9(false, 0, true, 1, 1, eib.c);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final eib f;

    public qu9(boolean z, int i, boolean z2, int i2, int i3, eib eibVar) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = eibVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu9)) {
            return false;
        }
        qu9 qu9Var = (qu9) obj;
        return this.a == qu9Var.a && this.b == qu9Var.b && this.c == qu9Var.c && this.d == qu9Var.d && this.e == qu9Var.e && Intrinsics.c(this.f, qu9Var.f);
    }

    public final int hashCode() {
        return this.f.a.hashCode() + wv8.a(this.e, wv8.a(this.d, dmi.e(wv8.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + ((Object) jja.a(this.b)) + ", autoCorrect=" + this.c + ", keyboardType=" + ((Object) lja.a(this.d)) + ", imeAction=" + ((Object) lu9.a(this.e)) + ", platformImeOptions=null, hintLocales=" + this.f + ')';
    }
}

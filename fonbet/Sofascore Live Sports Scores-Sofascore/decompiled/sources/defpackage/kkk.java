package defpackage;

import androidx.compose.runtime.e;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kkk implements w8l {
    public final String a;
    public final e1d b;

    public kkk(e5a e5aVar, String str) {
        this.a = str;
        this.b = e.f(e5aVar);
    }

    @Override // defpackage.w8l
    public final int a(kx4 kx4Var) {
        return e().b;
    }

    @Override // defpackage.w8l
    public final int b(kx4 kx4Var, ema emaVar) {
        return e().c;
    }

    @Override // defpackage.w8l
    public final int c(kx4 kx4Var) {
        return e().d;
    }

    @Override // defpackage.w8l
    public final int d(kx4 kx4Var, ema emaVar) {
        return e().a;
    }

    public final e5a e() {
        return (e5a) ((eoh) this.b).getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kkk) {
            return Intrinsics.c(e(), ((kkk) obj).e());
        }
        return false;
    }

    public final void f(e5a e5aVar) {
        ((eoh) this.b).setValue(e5aVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a);
        sb.append("(left=");
        sb.append(e().a);
        sb.append(", top=");
        sb.append(e().b);
        sb.append(", right=");
        sb.append(e().c);
        sb.append(", bottom=");
        return wv8.j(sb, e().d, ')');
    }
}

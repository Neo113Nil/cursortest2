package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gq5 extends xt9 {
    public final Drawable a;
    public final ot9 b;
    public final Throwable c;

    public gq5(Drawable drawable, ot9 ot9Var, Throwable th) {
        this.a = drawable;
        this.b = ot9Var;
        this.c = th;
    }

    @Override // defpackage.xt9
    public final Drawable a() {
        return this.a;
    }

    @Override // defpackage.xt9
    public final ot9 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq5)) {
            return false;
        }
        gq5 gq5Var = (gq5) obj;
        return Intrinsics.c(this.a, gq5Var.a) && Intrinsics.c(this.b, gq5Var.b) && this.c.equals(gq5Var.c);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int hashCode = drawable != null ? drawable.hashCode() : 0;
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }
}

package defpackage;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xjh implements h0f {
    public final wmb a;
    public int b;
    public Bitmap.Config c;

    public xjh(wmb wmbVar) {
        this.a = wmbVar;
    }

    @Override // defpackage.h0f
    public final void a() {
        this.a.D(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xjh) {
            xjh xjhVar = (xjh) obj;
            if (this.b == xjhVar.b && kik.k(this.c, xjhVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b * 31;
        Bitmap.Config config = this.c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return yjh.c(this.b, this.c);
    }
}

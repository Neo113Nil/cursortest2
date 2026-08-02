package defpackage;

import android.graphics.Shader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pvh extends n52 {
    public final long a;

    public pvh(long j) {
        this.a = j;
    }

    @Override // defpackage.n52
    public final void a(float f, long j, gtj gtjVar) {
        gtjVar.t(1.0f);
        long j2 = this.a;
        if (f != 1.0f) {
            j2 = r13.c(j2, r13.d(j2) * f);
        }
        gtjVar.v(j2);
        if (((Shader) gtjVar.e) != null) {
            gtjVar.z(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvh)) {
            return false;
        }
        long j = ((pvh) obj).a;
        int i = r13.j;
        return e8k.a(this.a, j);
    }

    public final int hashCode() {
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) r13.i(this.a)) + ')';
    }
}

package defpackage;

import com.google.android.gms.internal.measurement.zzafc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class z9n {
    public final Object a;
    public final int b;

    public z9n(int i, zzafc zzafcVar) {
        this.a = zzafcVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z9n)) {
            return false;
        }
        z9n z9nVar = (z9n) obj;
        return this.a == z9nVar.a && this.b == z9nVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q8d extends r8d {
    public final e8d a;
    public final int b;

    public q8d(e8d e8dVar, int i) {
        e8dVar.getClass();
        this.a = e8dVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q8d.class != obj.getClass()) {
            return false;
        }
        q8d q8dVar = (q8d) obj;
        return this.b == q8dVar.b && Intrinsics.c(this.a, q8dVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InProgress(latestEvent=");
        sb.append(this.a);
        sb.append(", direction=");
        return wv8.j(sb, this.b, ')');
    }
}

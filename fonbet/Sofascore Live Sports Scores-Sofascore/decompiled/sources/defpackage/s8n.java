package defpackage;

import com.google.android.gms.internal.pal.zzaef;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class s8n {
    public final Object a;
    public final int b;

    public s8n(zzaef zzaefVar, int i) {
        this.a = zzaefVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s8n)) {
            return false;
        }
        s8n s8nVar = (s8n) obj;
        return this.a == s8nVar.a && this.b == s8nVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}

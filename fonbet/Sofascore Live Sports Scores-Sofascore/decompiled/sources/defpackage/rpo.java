package defpackage;

import com.google.android.gms.internal.ads.zzigw;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rpo {
    public final Object a;
    public final int b;

    public rpo(int i, zzigw zzigwVar) {
        this.a = zzigwVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rpo)) {
            return false;
        }
        rpo rpoVar = (rpo) obj;
        return this.a == rpoVar.a && this.b == rpoVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}

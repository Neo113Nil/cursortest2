package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vnj implements c71, Serializable {
    public final unj a;
    public final boolean b;

    public vnj(unj unjVar) {
        this.a = unjVar;
        this.b = unjVar.g;
    }

    @Override // defpackage.c71
    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vnj) && this.a.equals(((vnj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TopStatsPlayerItem(player=" + this.a + ")";
    }
}

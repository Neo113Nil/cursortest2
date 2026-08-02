package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class omb {
    public final plb a;
    public final Throwable b;

    public omb(plb plbVar) {
        this.a = plbVar;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omb)) {
            return false;
        }
        omb ombVar = (omb) obj;
        plb plbVar = this.a;
        if (plbVar != null && plbVar == ombVar.a) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || ombVar.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public omb(Throwable th) {
        this.b = th;
        this.a = null;
    }
}

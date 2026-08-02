package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g5c {
    public final Uri a;

    static {
        nik.N(0);
    }

    public g5c(by9 by9Var) {
        this.a = (Uri) by9Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g5c) && this.a.equals(((g5c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}

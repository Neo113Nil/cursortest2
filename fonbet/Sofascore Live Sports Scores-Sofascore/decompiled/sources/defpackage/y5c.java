package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class y5c implements i72 {
    public static final y5c c = new y5c(new ejg(12, false));
    public static final i3c d = new i3c(5);
    public final Uri a;
    public final String b;

    public y5c(ejg ejgVar) {
        this.a = (Uri) ejgVar.c;
        this.b = (String) ejgVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5c)) {
            return false;
        }
        y5c y5cVar = (y5c) obj;
        return lik.a(this.a, y5cVar.a) && lik.a(this.b, y5cVar.b);
    }

    public final int hashCode() {
        Uri uri = this.a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}

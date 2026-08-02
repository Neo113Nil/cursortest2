package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class am6 {
    public final zc9 a;
    public final Uri b;
    public final int c;

    public am6(zc9 zc9Var, Uri uri, int i) {
        zc9Var.getClass();
        uri.getClass();
        this.a = zc9Var;
        this.b = uri;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am6)) {
            return false;
        }
        am6 am6Var = (am6) obj;
        return Intrinsics.c(this.a, am6Var.a) && Intrinsics.c(this.b, am6Var.b) && this.c == am6Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResolvedMediaPlaylist(mediaPlaylist=");
        sb.append(this.a);
        sb.append(", playlistUri=");
        sb.append(this.b);
        sb.append(", bitrate=");
        return wv8.j(sb, this.c, ')');
    }
}

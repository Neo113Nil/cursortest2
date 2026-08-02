package defpackage;

import android.widget.RemoteViews;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dyf {
    public final RemoteViews a;
    public final s4a b;

    public dyf(RemoteViews remoteViews, s4a s4aVar) {
        this.a = remoteViews;
        this.b = s4aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyf)) {
            return false;
        }
        dyf dyfVar = (dyf) obj;
        return this.a.equals(dyfVar.a) && this.b.equals(dyfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.a + ", view=" + this.b + ')';
    }
}

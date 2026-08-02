package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wpm {
    public static final a d = new a(null);
    public final boolean a;
    public final boolean b;
    public boolean c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public wpm(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static wpm copy$default(wpm wpmVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = wpmVar.a;
        }
        if ((i & 2) != 0) {
            z2 = wpmVar.b;
        }
        if ((i & 4) != 0) {
            z3 = wpmVar.c;
        }
        wpmVar.getClass();
        return new wpm(z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpm)) {
            return false;
        }
        wpm wpmVar = (wpm) obj;
        return this.a == wpmVar.a && this.b == wpmVar.b && this.c == wpmVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + u0a.t(Boolean.hashCode(this.a) * 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideosOverlayVisibilityState(shouldShowOverlay=");
        sb.append(this.a);
        sb.append(", shouldShowSeekbar=");
        sb.append(this.b);
        sb.append(", shouldShowReplay=");
        return lnb.r(sb, this.c, ')');
    }
}

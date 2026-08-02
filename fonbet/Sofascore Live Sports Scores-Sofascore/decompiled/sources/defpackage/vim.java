package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vim {
    public final String a;

    public vim(String str) {
        str.getClass();
        this.a = str;
    }

    public static vim copy$default(vim vimVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vimVar.a;
        }
        vimVar.getClass();
        str.getClass();
        return new vim(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vim) && Intrinsics.c(this.a, ((vim) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return lnb.q(new StringBuilder("VPMute(key="), this.a, ')');
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wul {
    public final String a;
    public final String b;
    public final String c;

    public wul(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        me4.p(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static wul copy$default(wul wulVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wulVar.a;
        }
        if ((i & 2) != 0) {
            str2 = wulVar.b;
        }
        if ((i & 4) != 0) {
            str3 = wulVar.c;
        }
        wulVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new wul(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wul)) {
            return false;
        }
        wul wulVar = (wul) obj;
        return Intrinsics.c(this.a, wulVar.a) && Intrinsics.c(this.b, wulVar.b) && Intrinsics.c(this.c, wulVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + o6a.k(this.b, this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SharingPath(story=");
        sb.append(this.a);
        sb.append(", moment=");
        sb.append(this.b);
        sb.append(", video=");
        return lnb.q(sb, this.c, ')');
    }
}

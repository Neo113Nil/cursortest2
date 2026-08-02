package defpackage;

import com.appsflyer.internal.i;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class huj {
    public static final huj c = new huj(241802, "");
    public final int a;
    public final String b;

    public huj(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof huj)) {
            return false;
        }
        huj hujVar = (huj) obj;
        return this.a == hujVar.a && Intrinsics.c(this.b, hujVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return i.g(this.a, "TrackerTeamUiModel(id=", ", name=", this.b, ")");
    }
}

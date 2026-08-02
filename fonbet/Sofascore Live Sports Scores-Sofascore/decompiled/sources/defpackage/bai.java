package defpackage;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes6.dex */
public final class bai implements Serializable {

    @NotNull
    public static final aai Companion = new aai();
    public final long a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ bai(long j, int i, boolean z, boolean z2) {
        if (7 != (i & 7)) {
            oea.z(i, 7, z9i.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bai)) {
            return false;
        }
        bai baiVar = (bai) obj;
        return this.a == baiVar.a && this.b == baiVar.b && this.c == baiVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dmi.e(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "StandingsLastUpdateRow(updatedAtTimestamp=" + this.a + ", isLive=" + this.b + ", isLast=" + this.c + ")";
    }

    public bai(long j, boolean z, boolean z2) {
        this.a = j;
        this.b = z;
        this.c = z2;
    }
}

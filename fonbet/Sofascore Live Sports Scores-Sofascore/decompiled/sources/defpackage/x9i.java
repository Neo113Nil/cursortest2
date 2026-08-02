package defpackage;

import androidx.core.app.NotificationCompat;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes6.dex */
public final class x9i implements Serializable {

    @NotNull
    public static final w9i Companion = new w9i();
    public static final joa[] j;
    public final int a;
    public final String b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public cai h;
    public boolean i;

    static {
        ysa ysaVar = ysa.b;
        j = new joa[]{null, null, ypa.a(ysaVar, new u9i(0)), ypa.a(ysaVar, new u9i(1)), ypa.a(ysaVar, new u9i(2)), ypa.a(ysaVar, new u9i(3)), ypa.a(ysaVar, new u9i(4)), ypa.a(ysaVar, new u9i(5)), null};
    }

    public /* synthetic */ x9i(int i, int i2, String str, List list, List list2, List list3, List list4, List list5, cai caiVar, boolean z) {
        if (255 != (i & 255)) {
            oea.z(i, 255, v9i.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = list5;
        this.h = caiVar;
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.i = false;
        } else {
            this.i = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9i)) {
            return false;
        }
        x9i x9iVar = (x9i) obj;
        return this.a == x9iVar.a && Intrinsics.c(this.b, x9iVar.b) && Intrinsics.c(this.c, x9iVar.c) && Intrinsics.c(this.d, x9iVar.d) && Intrinsics.c(this.e, x9iVar.e) && Intrinsics.c(this.f, x9iVar.f) && Intrinsics.c(this.g, x9iVar.g) && this.h == x9iVar.h && this.i == x9iVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + dmi.d(dmi.d(dmi.d(dmi.d(dmi.d(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31);
    }

    public final String toString() {
        cai caiVar = this.h;
        boolean z = this.i;
        StringBuilder t = dmi.t(this.a, "StandingsDescriptionRow(tableId=", ", sport=", this.b, ", descriptionRows=");
        vxd.w(t, this.c, ", legendRows=", this.d, ", statisticsRowShort=");
        vxd.w(t, this.e, ", statisticsRowFull=", this.f, ", statisticsRowForm=");
        t.append(this.g);
        t.append(", viewMode=");
        t.append(caiVar);
        t.append(", expanded=");
        return wt3.p(t, z, ")");
    }

    public x9i(int i, String str, List list, List list2, List list3, List list4, List list5, cai caiVar, boolean z) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        caiVar.getClass();
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = list5;
        this.h = caiVar;
        this.i = z;
    }
}

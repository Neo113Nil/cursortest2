package defpackage;

import com.mbridge.msdk.out.MBSupportMuteAdType;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes6.dex */
public final class wai implements Serializable {

    @NotNull
    public static final vai Companion = new vai();
    public static final joa[] j;
    public final int a;
    public cai b;
    public final List c;
    public final List d;
    public final Integer e;
    public final String f;
    public final Integer g;
    public final boolean h;
    public final String i;

    static {
        ysa ysaVar = ysa.b;
        j = new joa[]{null, ypa.a(ysaVar, new u9i(15)), ypa.a(ysaVar, new u9i(16)), ypa.a(ysaVar, new u9i(17)), null, null, null, null, null};
    }

    public /* synthetic */ wai(int i, int i2, cai caiVar, List list, List list2, Integer num, String str, Integer num2, boolean z, String str2) {
        if (287 != (i & MBSupportMuteAdType.INTERSTITIAL_VIDEO)) {
            oea.z(i, MBSupportMuteAdType.INTERSTITIAL_VIDEO, uai.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = caiVar;
        this.c = list;
        this.d = list2;
        this.e = num;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z;
        }
        this.i = str2;
    }

    public static wai a(wai waiVar, List list, List list2, String str, Integer num, int i) {
        int i2 = waiVar.a;
        cai caiVar = waiVar.b;
        if ((i & 4) != 0) {
            list = waiVar.c;
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = waiVar.d;
        }
        List list4 = list2;
        Integer num2 = waiVar.e;
        if ((i & 32) != 0) {
            str = waiVar.f;
        }
        String str2 = str;
        if ((i & 64) != 0) {
            num = waiVar.g;
        }
        boolean z = waiVar.h;
        String str3 = waiVar.i;
        caiVar.getClass();
        list3.getClass();
        list4.getClass();
        str3.getClass();
        return new wai(i2, caiVar, list3, list4, num2, str2, num, z, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wai)) {
            return false;
        }
        wai waiVar = (wai) obj;
        return this.a == waiVar.a && this.b == waiVar.b && Intrinsics.c(this.c, waiVar.c) && Intrinsics.c(this.d, waiVar.d) && Intrinsics.c(this.e, waiVar.e) && Intrinsics.c(this.f, waiVar.f) && Intrinsics.c(this.g, waiVar.g) && this.h == waiVar.h && Intrinsics.c(this.i, waiVar.i);
    }

    public final int hashCode() {
        int d = dmi.d(dmi.d((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d);
        Integer num = this.e;
        int hashCode = (d + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.g;
        return this.i.hashCode() + dmi.e((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.h);
    }

    public final String toString() {
        cai caiVar = this.b;
        StringBuilder sb = new StringBuilder("StandingsTableHeaderRow(tableId=");
        sb.append(this.a);
        sb.append(", viewMode=");
        sb.append(caiVar);
        sb.append(", fullColumns=");
        vxd.w(sb, this.c, ", shortColumns=", this.d, ", year=");
        vxd.s(this.e, ", standingsPromoName=", this.f, ", promotionColorIndex=", sb);
        sb.append(this.g);
        sb.append(", isHomeOrAway=");
        sb.append(this.h);
        sb.append(", sport=");
        return mz1.o(sb, this.i, ")");
    }

    public wai(int i, cai caiVar, List list, List list2, Integer num, String str, Integer num2, boolean z, String str2) {
        list.getClass();
        list2.getClass();
        str2.getClass();
        this.a = i;
        this.b = caiVar;
        this.c = list;
        this.d = list2;
        this.e = num;
        this.f = str;
        this.g = num2;
        this.h = z;
        this.i = str2;
    }
}

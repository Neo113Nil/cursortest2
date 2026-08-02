package defpackage;

import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamStatus;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ipm {
    public final String a;
    public final String b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final Double f;
    public final Map g;
    public final BlazeLiveStreamStatus h;
    public final String i;
    public final Map j;

    public ipm(@NotNull String str, @NotNull String str2, @NotNull List<xvm> list, boolean z, boolean z2, @Nullable Double d, @NotNull Map<String, String> map, @Nullable BlazeLiveStreamStatus blazeLiveStreamStatus, @Nullable String str3, @Nullable Map<String, String> map2) {
        str.getClass();
        str2.getClass();
        list.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = z;
        this.e = z2;
        this.f = d;
        this.g = map;
        this.h = blazeLiveStreamStatus;
        this.i = str3;
        this.j = map2;
    }

    public static ipm copy$default(ipm ipmVar, String str, String str2, List list, boolean z, boolean z2, Double d, Map map, BlazeLiveStreamStatus blazeLiveStreamStatus, String str3, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ipmVar.a;
        }
        if ((i & 2) != 0) {
            str2 = ipmVar.b;
        }
        if ((i & 4) != 0) {
            list = ipmVar.c;
        }
        if ((i & 8) != 0) {
            z = ipmVar.d;
        }
        if ((i & 16) != 0) {
            z2 = ipmVar.e;
        }
        if ((i & 32) != 0) {
            d = ipmVar.f;
        }
        if ((i & 64) != 0) {
            map = ipmVar.g;
        }
        if ((i & 128) != 0) {
            blazeLiveStreamStatus = ipmVar.h;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            str3 = ipmVar.i;
        }
        if ((i & 512) != 0) {
            map2 = ipmVar.j;
        }
        Map map3 = map2;
        ipmVar.getClass();
        str.getClass();
        str2.getClass();
        list.getClass();
        map.getClass();
        BlazeLiveStreamStatus blazeLiveStreamStatus2 = blazeLiveStreamStatus;
        Double d2 = d;
        String str4 = str3;
        Map map4 = map;
        boolean z3 = z2;
        List list2 = list;
        return new ipm(str, str2, list2, z, z3, d2, map4, blazeLiveStreamStatus2, str4, map3);
    }

    public final nqm a() {
        boolean z = this.e;
        boolean z2 = this.d;
        return (z2 || !z) ? !z2 ? nqm.UNREAD : z ? nqm.LIVE_READ : nqm.READ : nqm.LIVE_UNREAD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipm)) {
            return false;
        }
        ipm ipmVar = (ipm) obj;
        return Intrinsics.c(this.a, ipmVar.a) && Intrinsics.c(this.b, ipmVar.b) && Intrinsics.c(this.c, ipmVar.c) && this.d == ipmVar.d && this.e == ipmVar.e && Intrinsics.c(this.f, ipmVar.f) && Intrinsics.c(this.g, ipmVar.g) && this.h == ipmVar.h && Intrinsics.c(this.i, ipmVar.i) && Intrinsics.c(this.j, ipmVar.j);
    }

    public final int hashCode() {
        int t = u0a.t(u0a.t(dmi.d(o6a.k(this.b, this.a.hashCode() * 31), 31, this.c), this.d), this.e);
        Double d = this.f;
        int g = dmi.g(this.g, (t + (d == null ? 0 : d.hashCode())) * 31, 31);
        BlazeLiveStreamStatus blazeLiveStreamStatus = this.h;
        int hashCode = (g + (blazeLiveStreamStatus == null ? 0 : blazeLiveStreamStatus.hashCode())) * 31;
        String str = this.i;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.j;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WidgetItemModel(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", thumbnails=");
        sb.append(this.c);
        sb.append(", isRead=");
        sb.append(this.d);
        sb.append(", isLive=");
        sb.append(this.e);
        sb.append(", duration=");
        sb.append(this.f);
        sb.append(", extraInfo=");
        sb.append(this.g);
        sb.append(", streamStatus=");
        sb.append(this.h);
        sb.append(", eventTime=");
        sb.append(this.i);
        sb.append(", retrievedLanguages=");
        return dmi.s(sb, this.j, ')');
    }
}

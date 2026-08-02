package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uul {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final int l;
    public final int m;
    public final int n;
    public final Long o;
    public final Boolean p;
    public final boolean q;

    public uul(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, boolean z2, boolean z3, @Nullable String str7, boolean z4, int i, int i2, int i3, @Nullable Long l, @Nullable Boolean bool, boolean z5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = str7;
        this.k = z4;
        this.l = i;
        this.m = i2;
        this.n = i3;
        this.o = l;
        this.p = bool;
        this.q = z5;
    }

    public static uul copy$default(uul uulVar, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, String str7, boolean z4, int i, int i2, int i3, Long l, Boolean bool, boolean z5, int i4, Object obj) {
        String str8 = (i4 & 1) != 0 ? uulVar.a : str;
        String str9 = (i4 & 2) != 0 ? uulVar.b : str2;
        String str10 = (i4 & 4) != 0 ? uulVar.c : str3;
        String str11 = (i4 & 8) != 0 ? uulVar.d : str4;
        String str12 = (i4 & 16) != 0 ? uulVar.e : str5;
        String str13 = (i4 & 32) != 0 ? uulVar.f : str6;
        boolean z6 = (i4 & 64) != 0 ? uulVar.g : z;
        boolean z7 = (i4 & 128) != 0 ? uulVar.h : z2;
        boolean z8 = (i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? uulVar.i : z3;
        String str14 = (i4 & 512) != 0 ? uulVar.j : str7;
        boolean z9 = (i4 & 1024) != 0 ? uulVar.k : z4;
        int i5 = (i4 & a.o) != 0 ? uulVar.l : i;
        int i6 = (i4 & 4096) != 0 ? uulVar.m : i2;
        int i7 = (i4 & 8192) != 0 ? uulVar.n : i3;
        String str15 = str8;
        Long l2 = (i4 & 16384) != 0 ? uulVar.o : l;
        Boolean bool2 = (i4 & 32768) != 0 ? uulVar.p : bool;
        boolean z10 = (i4 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? uulVar.q : z5;
        uulVar.getClass();
        str15.getClass();
        str9.getClass();
        str10.getClass();
        str11.getClass();
        str12.getClass();
        str13.getClass();
        return new uul(str15, str9, str10, str11, str12, str13, z6, z7, z8, str14, z9, i5, i6, i7, l2, bool2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uul)) {
            return false;
        }
        uul uulVar = (uul) obj;
        return Intrinsics.c(this.a, uulVar.a) && Intrinsics.c(this.b, uulVar.b) && Intrinsics.c(this.c, uulVar.c) && Intrinsics.c(this.d, uulVar.d) && Intrinsics.c(this.e, uulVar.e) && Intrinsics.c(this.f, uulVar.f) && this.g == uulVar.g && this.h == uulVar.h && this.i == uulVar.i && Intrinsics.c(this.j, uulVar.j) && this.k == uulVar.k && this.l == uulVar.l && this.m == uulVar.m && this.n == uulVar.n && Intrinsics.c(this.o, uulVar.o) && Intrinsics.c(this.p, uulVar.p) && this.q == uulVar.q;
    }

    public final int hashCode() {
        int t = u0a.t(u0a.t(u0a.t(o6a.k(this.f, o6a.k(this.e, o6a.k(this.d, o6a.k(this.c, o6a.k(this.b, this.a.hashCode() * 31))))), this.g), this.h), this.i);
        String str = this.j;
        int e = l4a.e(this.n, l4a.e(this.m, l4a.e(this.l, u0a.t((t + (str == null ? 0 : str.hashCode())) * 31, this.k))));
        Long l = this.o;
        int hashCode = (e + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.p;
        return Boolean.hashCode(this.q) + ((hashCode + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations(analyticsBatchIntervalInSeconds=");
        sb.append(this.a);
        sb.append(", analyticsMaxAllowedBatchSize=");
        sb.append(this.b);
        sb.append(", analyticsMinAllowedBatchSize=");
        sb.append(this.c);
        sb.append(", activityFetchTimeIntervalInSeconds=");
        sb.append(this.d);
        sb.append(", activitySyncMinAllowedBatchSize=");
        sb.append(this.e);
        sb.append(", activitySyncTimeIntervalInSeconds=");
        sb.append(this.f);
        sb.append(", allowActivitySync=");
        sb.append(this.g);
        sb.append(", disableAppActivityEvents=");
        sb.append(this.h);
        sb.append(", analyticsAddExtraInfo=");
        sb.append(this.i);
        sb.append(", closedCaptionsParserURL=");
        sb.append(this.j);
        sb.append(", remoteWidgetConfigEnabled=");
        sb.append(this.k);
        sb.append(", momentsLikesThreshold=");
        sb.append(this.l);
        sb.append(", storiesLikesThreshold=");
        sb.append(this.m);
        sb.append(", videosLikesThreshold=");
        sb.append(this.n);
        sb.append(", configRefetchIntervalInMilliSeconds=");
        sb.append(this.o);
        sb.append(", enableHLSPrefetch=");
        sb.append(this.p);
        sb.append(", enableClientPlaybackModification=");
        return lnb.r(sb, this.q, ')');
    }
}

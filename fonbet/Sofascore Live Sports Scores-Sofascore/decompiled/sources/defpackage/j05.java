package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Country;
import com.sofascore.model.newNetwork.AffiliateBanner;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j05 {
    public final boolean A;
    public final boolean B;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final mi6 h;
    public final List i;
    public final ri6 j;
    public final List k;
    public final List l;
    public final xk m;
    public final AffiliateBanner n;
    public final Country o;
    public final vuf p;
    public final List q;
    public final boolean r;
    public final String s;
    public final Map t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final List y;
    public final String z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j05(String str, String str2, String str3, String str4, String str5, List list, mi6 mi6Var, ArrayList arrayList, ri6 ri6Var, ArrayList arrayList2, List list2, xk xkVar, Country country, vuf vufVar, List list3, LinkedHashMap linkedHashMap, boolean z, List list4, String str6, boolean z2, int i) {
        this(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, null, r18, r19, r20, false, "api.sofascore.com/", r23, false, false, (4194304 & i) != 0 ? true : z, false, (16777216 & i) != 0 ? km5.a : list4, (33554432 & i) != 0 ? null : str6, false, (i & 134217728) != 0 ? false : z2);
        Map map;
        String str7 = (i & 1) != 0 ? "" : str;
        String str8 = (i & 2) != 0 ? "" : str2;
        String str9 = (i & 4) != 0 ? "" : str3;
        String str10 = (i & 8) != 0 ? "" : str4;
        String str11 = (i & 16) != 0 ? "" : "26.07.20";
        String str12 = (i & 32) != 0 ? "" : str5;
        List list5 = (i & 64) != 0 ? km5.a : list;
        mi6 mi6Var2 = (i & 128) != 0 ? null : mi6Var;
        ArrayList arrayList3 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : arrayList;
        ri6 ri6Var2 = (i & 512) != 0 ? null : ri6Var;
        List list6 = (i & 1024) != 0 ? km5.a : arrayList2;
        List list7 = (i & a.o) != 0 ? km5.a : list2;
        xk xkVar2 = (i & 4096) != 0 ? null : xkVar;
        Country country2 = (i & 16384) != 0 ? null : country;
        vuf vufVar2 = (32768 & i) != 0 ? null : vufVar;
        List list8 = (65536 & i) != 0 ? km5.a : list3;
        if ((524288 & i) != 0) {
            Map map2 = lm5.a;
            map2.getClass();
            map = map2;
        } else {
            map = linkedHashMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.Map] */
    public static j05 a(j05 j05Var, String str, mi6 mi6Var, ArrayList arrayList, ri6 ri6Var, List list, xk xkVar, AffiliateBanner affiliateBanner, Country country, vuf vufVar, List list2, boolean z, String str2, LinkedHashMap linkedHashMap, boolean z2, boolean z3, String str3, boolean z4, int i) {
        List list3;
        String str4;
        String str5 = j05Var.a;
        String str6 = j05Var.b;
        String str7 = j05Var.c;
        String str8 = (i & 8) != 0 ? j05Var.d : str;
        String str9 = j05Var.e;
        String str10 = str8;
        String str11 = j05Var.f;
        List list4 = j05Var.g;
        mi6 mi6Var2 = (i & 128) != 0 ? j05Var.h : mi6Var;
        List list5 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? j05Var.i : arrayList;
        ri6 ri6Var2 = (i & 512) != 0 ? j05Var.j : ri6Var;
        List list6 = j05Var.k;
        List list7 = (i & a.o) != 0 ? j05Var.l : list;
        xk xkVar2 = (i & 4096) != 0 ? j05Var.m : xkVar;
        AffiliateBanner affiliateBanner2 = (i & 8192) != 0 ? j05Var.n : affiliateBanner;
        Country country2 = (i & 16384) != 0 ? j05Var.o : country;
        vuf vufVar2 = (i & 32768) != 0 ? j05Var.p : vufVar;
        List list8 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? j05Var.q : list2;
        boolean z5 = (i & 131072) != 0 ? j05Var.r : z;
        String str12 = (i & 262144) != 0 ? j05Var.s : str2;
        LinkedHashMap linkedHashMap2 = (i & 524288) != 0 ? j05Var.t : linkedHashMap;
        boolean z6 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? j05Var.u : z2;
        boolean z7 = (i & 2097152) != 0 ? j05Var.v : z3;
        boolean z8 = j05Var.w;
        boolean z9 = j05Var.x;
        List list9 = j05Var.y;
        if ((i & 33554432) != 0) {
            list3 = list9;
            str4 = j05Var.z;
        } else {
            list3 = list9;
            str4 = str3;
        }
        boolean z10 = (i & 67108864) != 0 ? j05Var.A : z4;
        boolean z11 = j05Var.B;
        j05Var.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str10.getClass();
        str9.getClass();
        str11.getClass();
        list4.getClass();
        list6.getClass();
        list7.getClass();
        list8.getClass();
        str12.getClass();
        linkedHashMap2.getClass();
        list3.getClass();
        return new j05(str5, str6, str7, str10, str9, str11, list4, mi6Var2, list5, ri6Var2, list6, list7, xkVar2, affiliateBanner2, country2, vufVar2, list8, z5, str12, linkedHashMap2, z6, z7, z8, z9, list3, str4, z10, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j05)) {
            return false;
        }
        j05 j05Var = (j05) obj;
        return Intrinsics.c(this.a, j05Var.a) && Intrinsics.c(this.b, j05Var.b) && Intrinsics.c(this.c, j05Var.c) && Intrinsics.c(this.d, j05Var.d) && Intrinsics.c(this.e, j05Var.e) && Intrinsics.c(this.f, j05Var.f) && Intrinsics.c(this.g, j05Var.g) && Intrinsics.c(this.h, j05Var.h) && Intrinsics.c(this.i, j05Var.i) && Intrinsics.c(this.j, j05Var.j) && Intrinsics.c(this.k, j05Var.k) && Intrinsics.c(this.l, j05Var.l) && this.m == j05Var.m && Intrinsics.c(this.n, j05Var.n) && Intrinsics.c(this.o, j05Var.o) && Intrinsics.c(this.p, j05Var.p) && Intrinsics.c(this.q, j05Var.q) && this.r == j05Var.r && Intrinsics.c(this.s, j05Var.s) && Intrinsics.c(this.t, j05Var.t) && this.u == j05Var.u && this.v == j05Var.v && this.w == j05Var.w && this.x == j05Var.x && Intrinsics.c(this.y, j05Var.y) && Intrinsics.c(this.z, j05Var.z) && this.A == j05Var.A && this.B == j05Var.B;
    }

    public final int hashCode() {
        int d = dmi.d(dmi.c(dmi.c(dmi.c(dmi.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        mi6 mi6Var = this.h;
        int hashCode = (d + (mi6Var == null ? 0 : mi6Var.hashCode())) * 31;
        List list = this.i;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        ri6 ri6Var = this.j;
        int d2 = dmi.d(dmi.d((hashCode2 + (ri6Var == null ? 0 : ri6Var.hashCode())) * 31, 31, this.k), 31, this.l);
        xk xkVar = this.m;
        int hashCode3 = (d2 + (xkVar == null ? 0 : xkVar.hashCode())) * 31;
        AffiliateBanner affiliateBanner = this.n;
        int hashCode4 = (hashCode3 + (affiliateBanner == null ? 0 : affiliateBanner.hashCode())) * 31;
        Country country = this.o;
        int hashCode5 = (hashCode4 + (country == null ? 0 : country.hashCode())) * 31;
        vuf vufVar = this.p;
        int d3 = dmi.d(dmi.e(dmi.e(dmi.e(dmi.e(dmi.g(this.t, dmi.c(dmi.e(dmi.d((hashCode5 + (vufVar == null ? 0 : vufVar.hashCode())) * 31, 31, this.q), 31, this.r), 31, this.s), 31), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y);
        String str = this.z;
        return Boolean.hashCode(this.B) + dmi.e((d3 + (str != null ? str.hashCode() : 0)) * 31, 31, this.A);
    }

    public final String toString() {
        StringBuilder s = mz1.s("DeveloperOptionsState(uuid=", this.a, ", userId=", this.b, ", pushId=");
        bf3.v(s, this.c, ", firebaseId=", this.d, ", appVersion=");
        bf3.v(s, this.e, ", devMod=", this.f, ", experiments=");
        s.append(this.g);
        s.append(", selectedExperiment=");
        s.append(this.h);
        s.append(", selectedExperimentGroups=");
        s.append(this.i);
        s.append(", selectedExperimentGroup=");
        s.append(this.j);
        s.append(", countries=");
        vxd.w(s, this.k, ", regions=", this.l, ", selectedAdNetwork=");
        s.append(this.m);
        s.append(", selectedAffiliateBanner=");
        s.append(this.n);
        s.append(", selectedCountry=");
        s.append(this.o);
        s.append(", selectedRegion=");
        s.append(this.p);
        s.append(", apiBranches=");
        s.append(this.q);
        s.append(", authTokenError=");
        s.append(this.r);
        s.append(", selectedApiBranch=");
        s.append(this.s);
        s.append(", displaySettings=");
        s.append(this.t);
        s.append(", showDeleteAppDataDialog=");
        vxd.t(", showTriggerPopUpDialog=", ", showForceAdsOption=", s, this.u, this.v);
        vxd.t(", showLeakCanaryOption=", ", sofaSeasonTestIDs=", s, this.w, this.x);
        s.append(this.y);
        s.append(", sofaSeasonTestIdSelected=");
        s.append(this.z);
        s.append(", showAffiliateBannerPicker=");
        return w1l.i(", hasUsedAnalystTrial=", ")", s, this.A, this.B);
    }

    public j05(String str, String str2, String str3, String str4, String str5, String str6, List list, mi6 mi6Var, List list2, ri6 ri6Var, List list3, List list4, xk xkVar, AffiliateBanner affiliateBanner, Country country, vuf vufVar, List list5, boolean z, String str7, Map map, boolean z2, boolean z3, boolean z4, boolean z5, List list6, String str8, boolean z6, boolean z7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        list.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        map.getClass();
        list6.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = list;
        this.h = mi6Var;
        this.i = list2;
        this.j = ri6Var;
        this.k = list3;
        this.l = list4;
        this.m = xkVar;
        this.n = affiliateBanner;
        this.o = country;
        this.p = vufVar;
        this.q = list5;
        this.r = z;
        this.s = str7;
        this.t = map;
        this.u = z2;
        this.v = z3;
        this.w = z4;
        this.x = z5;
        this.y = list6;
        this.z = str8;
        this.A = z6;
        this.B = z7;
    }
}

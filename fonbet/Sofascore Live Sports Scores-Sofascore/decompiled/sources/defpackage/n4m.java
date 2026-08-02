package defpackage;

import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.models.ui.BlazeAdInfoModel;
import com.blaze.blazesdk.features.shared.models.ui_shared.i;
import com.blaze.blazesdk.interactions.models.ui.InteractionModel;
import com.blaze.blazesdk.players.models.c;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.gim;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n4m implements osm {
    public final String a;
    public final gim b;
    public final a c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Date h;
    public final i i;
    public final Integer j;
    public final boolean k;
    public final boolean l;
    public Boolean m;
    public final boolean n;
    public int o;
    public int p;
    public c q;
    public final BlazeAdInfoModel r;
    public final BlazeAdInfoModel s;
    public final List t;
    public final Boolean u;
    public boolean v;
    public float w;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class a {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: n4m$a$a, reason: collision with other inner class name */
        public static final class C1353a extends a {
            public final String a;
            public final double b;
            public final qrl c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1353a(@NotNull String str, double d, @Nullable qrl qrlVar) {
                super(null);
                str.getClass();
                this.a = str;
                this.b = d;
                this.c = qrlVar;
            }

            public static C1353a copy$default(C1353a c1353a, String str, double d, qrl qrlVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c1353a.a;
                }
                if ((i & 2) != 0) {
                    d = c1353a.b;
                }
                if ((i & 4) != 0) {
                    qrlVar = c1353a.c;
                }
                c1353a.getClass();
                str.getClass();
                return new C1353a(str, d, qrlVar);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1353a)) {
                    return false;
                }
                C1353a c1353a = (C1353a) obj;
                return Intrinsics.c(this.a, c1353a.a) && Double.compare(this.b, c1353a.b) == 0 && Intrinsics.c(this.c, c1353a.c);
            }

            public final int hashCode() {
                int b = dmi.b(this.a.hashCode() * 31, 31, this.b);
                qrl qrlVar = this.c;
                return b + (qrlVar == null ? 0 : qrlVar.hashCode());
            }

            public final String toString() {
                return "Image(urlString=" + this.a + ", duration=" + this.b + ", aspectRatio=" + this.c + ')';
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static abstract class b extends a {
            public final String a;
            public final String b;
            public final Float c;
            public final Float d;
            public final qrl e;

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            /* renamed from: n4m$a$b$a, reason: collision with other inner class name */
            public static final class C1354a extends b {
                public final String f;
                public final String g;
                public final Float h;
                public final Float i;
                public final qrl j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1354a(@NotNull String str, @Nullable String str2, @Nullable Float f, @Nullable Float f2, @Nullable qrl qrlVar) {
                    super(str, str2, f, f2, qrlVar, null);
                    str.getClass();
                    this.f = str;
                    this.g = str2;
                    this.h = f;
                    this.i = f2;
                    this.j = qrlVar;
                }

                public static C1354a copy$default(C1354a c1354a, String str, String str2, Float f, Float f2, qrl qrlVar, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = c1354a.f;
                    }
                    if ((i & 2) != 0) {
                        str2 = c1354a.g;
                    }
                    if ((i & 4) != 0) {
                        f = c1354a.h;
                    }
                    if ((i & 8) != 0) {
                        f2 = c1354a.i;
                    }
                    if ((i & 16) != 0) {
                        qrlVar = c1354a.j;
                    }
                    qrl qrlVar2 = qrlVar;
                    c1354a.getClass();
                    str.getClass();
                    Float f3 = f;
                    return new C1354a(str, str2, f3, f2, qrlVar2);
                }

                @Override // n4m.a.b
                public final qrl a() {
                    return this.j;
                }

                @Override // n4m.a.b
                public final Float b() {
                    return this.h;
                }

                @Override // n4m.a.b
                public final Float c() {
                    return this.i;
                }

                @Override // n4m.a.b
                public final String d() {
                    return this.g;
                }

                @Override // n4m.a.b
                public final String e() {
                    return this.f;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1354a)) {
                        return false;
                    }
                    C1354a c1354a = (C1354a) obj;
                    return Intrinsics.c(this.f, c1354a.f) && Intrinsics.c(this.g, c1354a.g) && Intrinsics.c(this.h, c1354a.h) && Intrinsics.c(this.i, c1354a.i) && Intrinsics.c(this.j, c1354a.j);
                }

                public final int hashCode() {
                    int hashCode = this.f.hashCode() * 31;
                    String str = this.g;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    Float f = this.h;
                    int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
                    Float f2 = this.i;
                    int hashCode4 = (hashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
                    qrl qrlVar = this.j;
                    return hashCode4 + (qrlVar != null ? qrlVar.hashCode() : 0);
                }

                public final String toString() {
                    return "Dash(urlString=" + this.f + ", loadingImageUrl=" + this.g + ", bitRate=" + this.h + ", fileSize=" + this.i + ", aspectRatio=" + this.j + ')';
                }
            }

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            /* renamed from: n4m$a$b$b, reason: collision with other inner class name */
            public static final class C1355b extends b {
                public final String f;
                public final String g;
                public final Float h;
                public final Float i;
                public final qrl j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1355b(@NotNull String str, @Nullable String str2, @Nullable Float f, @Nullable Float f2, @Nullable qrl qrlVar) {
                    super(str, str2, f, f2, qrlVar, null);
                    str.getClass();
                    this.f = str;
                    this.g = str2;
                    this.h = f;
                    this.i = f2;
                    this.j = qrlVar;
                }

                public static C1355b copy$default(C1355b c1355b, String str, String str2, Float f, Float f2, qrl qrlVar, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = c1355b.f;
                    }
                    if ((i & 2) != 0) {
                        str2 = c1355b.g;
                    }
                    if ((i & 4) != 0) {
                        f = c1355b.h;
                    }
                    if ((i & 8) != 0) {
                        f2 = c1355b.i;
                    }
                    if ((i & 16) != 0) {
                        qrlVar = c1355b.j;
                    }
                    qrl qrlVar2 = qrlVar;
                    c1355b.getClass();
                    str.getClass();
                    Float f3 = f;
                    return new C1355b(str, str2, f3, f2, qrlVar2);
                }

                @Override // n4m.a.b
                public final qrl a() {
                    return this.j;
                }

                @Override // n4m.a.b
                public final Float b() {
                    return this.h;
                }

                @Override // n4m.a.b
                public final Float c() {
                    return this.i;
                }

                @Override // n4m.a.b
                public final String d() {
                    return this.g;
                }

                @Override // n4m.a.b
                public final String e() {
                    return this.f;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1355b)) {
                        return false;
                    }
                    C1355b c1355b = (C1355b) obj;
                    return Intrinsics.c(this.f, c1355b.f) && Intrinsics.c(this.g, c1355b.g) && Intrinsics.c(this.h, c1355b.h) && Intrinsics.c(this.i, c1355b.i) && Intrinsics.c(this.j, c1355b.j);
                }

                public final int hashCode() {
                    int hashCode = this.f.hashCode() * 31;
                    String str = this.g;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    Float f = this.h;
                    int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
                    Float f2 = this.i;
                    int hashCode4 = (hashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
                    qrl qrlVar = this.j;
                    return hashCode4 + (qrlVar != null ? qrlVar.hashCode() : 0);
                }

                public final String toString() {
                    return "Hls(urlString=" + this.f + ", loadingImageUrl=" + this.g + ", bitRate=" + this.h + ", fileSize=" + this.i + ", aspectRatio=" + this.j + ')';
                }
            }

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class c extends b {
                public final String f;
                public final String g;
                public final Float h;
                public final Float i;
                public final qrl j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(@NotNull String str, @Nullable String str2, @Nullable Float f, @Nullable Float f2, @Nullable qrl qrlVar) {
                    super(str, str2, f, f2, qrlVar, null);
                    str.getClass();
                    this.f = str;
                    this.g = str2;
                    this.h = f;
                    this.i = f2;
                    this.j = qrlVar;
                }

                public static c copy$default(c cVar, String str, String str2, Float f, Float f2, qrl qrlVar, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = cVar.f;
                    }
                    if ((i & 2) != 0) {
                        str2 = cVar.g;
                    }
                    if ((i & 4) != 0) {
                        f = cVar.h;
                    }
                    if ((i & 8) != 0) {
                        f2 = cVar.i;
                    }
                    if ((i & 16) != 0) {
                        qrlVar = cVar.j;
                    }
                    qrl qrlVar2 = qrlVar;
                    cVar.getClass();
                    str.getClass();
                    Float f3 = f;
                    return new c(str, str2, f3, f2, qrlVar2);
                }

                @Override // n4m.a.b
                public final qrl a() {
                    return this.j;
                }

                @Override // n4m.a.b
                public final Float b() {
                    return this.h;
                }

                @Override // n4m.a.b
                public final Float c() {
                    return this.i;
                }

                @Override // n4m.a.b
                public final String d() {
                    return this.g;
                }

                @Override // n4m.a.b
                public final String e() {
                    return this.f;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return Intrinsics.c(this.f, cVar.f) && Intrinsics.c(this.g, cVar.g) && Intrinsics.c(this.h, cVar.h) && Intrinsics.c(this.i, cVar.i) && Intrinsics.c(this.j, cVar.j);
                }

                public final int hashCode() {
                    int hashCode = this.f.hashCode() * 31;
                    String str = this.g;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    Float f = this.h;
                    int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
                    Float f2 = this.i;
                    int hashCode4 = (hashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
                    qrl qrlVar = this.j;
                    return hashCode4 + (qrlVar != null ? qrlVar.hashCode() : 0);
                }

                public final String toString() {
                    return "Mp4(urlString=" + this.f + ", loadingImageUrl=" + this.g + ", bitRate=" + this.h + ", fileSize=" + this.i + ", aspectRatio=" + this.j + ')';
                }
            }

            public b(String str, String str2, Float f, Float f2, qrl qrlVar, DefaultConstructorMarker defaultConstructorMarker) {
                super(null);
                this.a = str;
                this.b = str2;
                this.c = f;
                this.d = f2;
                this.e = qrlVar;
            }

            public qrl a() {
                return this.e;
            }

            public Float b() {
                return this.c;
            }

            public Float c() {
                return this.d;
            }

            public String d() {
                return this.b;
            }

            public String e() {
                return this.a;
            }
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ n4m(String str, gim gimVar, a aVar, String str2, String str3, String str4, String str5, Date date, i iVar, Integer num, boolean z, boolean z2, Boolean bool, boolean z3, int i, int i2, c cVar, BlazeAdInfoModel blazeAdInfoModel, BlazeAdInfoModel blazeAdInfoModel2, List list, Boolean bool2, boolean z4, float f, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, gimVar, aVar, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? null : str5, (i3 & 128) != 0 ? null : date, (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : iVar, (i3 & 512) != 0 ? null : num, (i3 & 1024) != 0 ? false : z, (i3 & com.ironsource.mediationsdk.metadata.a.o) != 0 ? true : z2, (i3 & 4096) != 0 ? null : bool, (i3 & 8192) != 0 ? true : z3, (i3 & 16384) != 0 ? -1 : i, (32768 & i3) != 0 ? -1 : i2, (65536 & i3) != 0 ? null : cVar, (131072 & i3) != 0 ? null : blazeAdInfoModel, (262144 & i3) != 0 ? null : blazeAdInfoModel2, (524288 & i3) != 0 ? null : list, (1048576 & i3) != 0 ? null : bool2, (2097152 & i3) != 0 ? false : z4, (i3 & 4194304) != 0 ? 0.0f : f);
    }

    public static n4m copy$default(n4m n4mVar, String str, gim gimVar, a aVar, String str2, String str3, String str4, String str5, Date date, i iVar, Integer num, boolean z, boolean z2, Boolean bool, boolean z3, int i, int i2, c cVar, BlazeAdInfoModel blazeAdInfoModel, BlazeAdInfoModel blazeAdInfoModel2, List list, Boolean bool2, boolean z4, float f, int i3, Object obj) {
        String str6 = (i3 & 1) != 0 ? n4mVar.a : str;
        gim gimVar2 = (i3 & 2) != 0 ? n4mVar.b : gimVar;
        a aVar2 = (i3 & 4) != 0 ? n4mVar.c : aVar;
        String str7 = (i3 & 8) != 0 ? n4mVar.d : str2;
        String str8 = (i3 & 16) != 0 ? n4mVar.e : str3;
        String str9 = (i3 & 32) != 0 ? n4mVar.f : str4;
        String str10 = (i3 & 64) != 0 ? n4mVar.g : str5;
        Date date2 = (i3 & 128) != 0 ? n4mVar.h : date;
        i iVar2 = (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? n4mVar.i : iVar;
        Integer num2 = (i3 & 512) != 0 ? n4mVar.j : num;
        boolean z5 = (i3 & 1024) != 0 ? n4mVar.k : z;
        boolean z6 = (i3 & com.ironsource.mediationsdk.metadata.a.o) != 0 ? n4mVar.l : z2;
        Boolean bool3 = (i3 & 4096) != 0 ? n4mVar.m : bool;
        boolean z7 = (i3 & 8192) != 0 ? n4mVar.n : z3;
        String str11 = str6;
        int i4 = (i3 & 16384) != 0 ? n4mVar.o : i;
        int i5 = (i3 & 32768) != 0 ? n4mVar.p : i2;
        c cVar2 = (i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? n4mVar.q : cVar;
        BlazeAdInfoModel blazeAdInfoModel3 = (i3 & 131072) != 0 ? n4mVar.r : blazeAdInfoModel;
        BlazeAdInfoModel blazeAdInfoModel4 = (i3 & 262144) != 0 ? n4mVar.s : blazeAdInfoModel2;
        List list2 = (i3 & 524288) != 0 ? n4mVar.t : list;
        Boolean bool4 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? n4mVar.u : bool2;
        boolean z8 = (i3 & 2097152) != 0 ? n4mVar.v : z4;
        float f2 = (i3 & 4194304) != 0 ? n4mVar.w : f;
        n4mVar.getClass();
        str11.getClass();
        gimVar2.getClass();
        aVar2.getClass();
        return new n4m(str11, gimVar2, aVar2, str7, str8, str9, str10, date2, iVar2, num2, z5, z6, bool3, z7, i4, i5, cVar2, blazeAdInfoModel3, blazeAdInfoModel4, list2, bool4, z8, f2);
    }

    public final InteractionModel a() {
        gim gimVar = this.b;
        if (gimVar instanceof gim.b) {
            return ((gim.b) gimVar).a.n;
        }
        if (gimVar instanceof gim.d) {
            return ((gim.d) gimVar).b.l;
        }
        if (gimVar instanceof gim.e) {
            return ((gim.e) gimVar).a.n;
        }
        if ((gimVar instanceof gim.a) || (gimVar instanceof gim.c)) {
            return null;
        }
        zzl.b();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4m)) {
            return false;
        }
        n4m n4mVar = (n4m) obj;
        return Intrinsics.c(this.a, n4mVar.a) && Intrinsics.c(this.b, n4mVar.b) && Intrinsics.c(this.c, n4mVar.c) && Intrinsics.c(this.d, n4mVar.d) && Intrinsics.c(this.e, n4mVar.e) && Intrinsics.c(this.f, n4mVar.f) && Intrinsics.c(this.g, n4mVar.g) && Intrinsics.c(this.h, n4mVar.h) && Intrinsics.c(this.i, n4mVar.i) && Intrinsics.c(this.j, n4mVar.j) && this.k == n4mVar.k && this.l == n4mVar.l && Intrinsics.c(this.m, n4mVar.m) && this.n == n4mVar.n && this.o == n4mVar.o && this.p == n4mVar.p && Intrinsics.c(this.q, n4mVar.q) && Intrinsics.c(this.r, n4mVar.r) && Intrinsics.c(this.s, n4mVar.s) && Intrinsics.c(this.t, n4mVar.t) && Intrinsics.c(this.u, n4mVar.u) && this.v == n4mVar.v && Float.compare(this.w, n4mVar.w) == 0;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Date date = this.h;
        int hashCode6 = (hashCode5 + (date == null ? 0 : date.hashCode())) * 31;
        i iVar = this.i;
        int hashCode7 = (hashCode6 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Integer num = this.j;
        int t = u0a.t(u0a.t((hashCode7 + (num == null ? 0 : num.hashCode())) * 31, this.k), this.l);
        Boolean bool = this.m;
        int e = l4a.e(this.p, l4a.e(this.o, u0a.t((t + (bool == null ? 0 : bool.hashCode())) * 31, this.n)));
        c cVar = this.q;
        int hashCode8 = (e + (cVar == null ? 0 : cVar.hashCode())) * 31;
        BlazeAdInfoModel blazeAdInfoModel = this.r;
        int hashCode9 = (hashCode8 + (blazeAdInfoModel == null ? 0 : blazeAdInfoModel.hashCode())) * 31;
        BlazeAdInfoModel blazeAdInfoModel2 = this.s;
        int hashCode10 = (hashCode9 + (blazeAdInfoModel2 == null ? 0 : blazeAdInfoModel2.hashCode())) * 31;
        List list = this.t;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.u;
        return Float.hashCode(this.w) + u0a.t((hashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31, this.v);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlazePlayableItem(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", content=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", subtitle=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", itemTime=");
        sb.append(this.g);
        sb.append(", assetsExpiryTime=");
        sb.append(this.h);
        sb.append(", cta=");
        sb.append(this.i);
        sb.append(", index=");
        sb.append(this.j);
        sb.append(", isLive=");
        sb.append(this.k);
        sb.append(", isSkippable=");
        sb.append(this.l);
        sb.append(", isRead=");
        sb.append(this.m);
        sb.append(", shouldShowCloseButton=");
        sb.append(this.n);
        sb.append(", indexInArray=");
        sb.append(this.o);
        sb.append(", indexInTotalPlayables=");
        sb.append(this.p);
        sb.append(", externalContentToShow=");
        sb.append(this.q);
        sb.append(", adInfo=");
        sb.append(this.r);
        sb.append(", defaultAdsInfo=");
        sb.append(this.s);
        sb.append(", followEntities=");
        sb.append(this.t);
        sb.append(", shouldShowBannerAd=");
        sb.append(this.u);
        sb.append(", isDescriptionExpanded=");
        sb.append(this.v);
        sb.append(", descriptionScrollingPercentage=");
        return wt3.n(sb, this.w, ')');
    }

    public n4m(@NotNull String str, @NotNull gim gimVar, @NotNull a aVar, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Date date, @Nullable i iVar, @Nullable Integer num, boolean z, boolean z2, @Nullable Boolean bool, boolean z3, int i, int i2, @Nullable c cVar, @Nullable BlazeAdInfoModel blazeAdInfoModel, @Nullable BlazeAdInfoModel blazeAdInfoModel2, @Nullable List<glm> list, @Nullable Boolean bool2, boolean z4, float f) {
        str.getClass();
        gimVar.getClass();
        aVar.getClass();
        this.a = str;
        this.b = gimVar;
        this.c = aVar;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = date;
        this.i = iVar;
        this.j = num;
        this.k = z;
        this.l = z2;
        this.m = bool;
        this.n = z3;
        this.o = i;
        this.p = i2;
        this.q = cVar;
        this.r = blazeAdInfoModel;
        this.s = blazeAdInfoModel2;
        this.t = list;
        this.u = bool2;
        this.v = z4;
        this.w = f;
    }
}

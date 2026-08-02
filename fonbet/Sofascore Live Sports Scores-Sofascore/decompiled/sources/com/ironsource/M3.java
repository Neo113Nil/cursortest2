package com.ironsource;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.bf3;
import defpackage.lnb;
import defpackage.me4;
import defpackage.mz1;
import defpackage.vxd;
import defpackage.wv8;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class M3 {

    @Nullable
    private final c a;

    @Nullable
    private final a b;

    @Nullable
    private final d c;

    @Nullable
    private final b d;

    public /* synthetic */ M3(c cVar, a aVar, d dVar, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cVar, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : dVar, (i & 8) != 0 ? null : bVar);
    }

    public static /* synthetic */ M3 a(M3 m3, c cVar, a aVar, d dVar, b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = m3.a;
        }
        if ((i & 2) != 0) {
            aVar = m3.b;
        }
        if ((i & 4) != 0) {
            dVar = m3.c;
        }
        if ((i & 8) != 0) {
            bVar = m3.d;
        }
        return m3.a(cVar, aVar, dVar, bVar);
    }

    @Nullable
    public final a b() {
        return this.b;
    }

    @Nullable
    public final d c() {
        return this.c;
    }

    @Nullable
    public final b d() {
        return this.d;
    }

    @Nullable
    public final a e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M3)) {
            return false;
        }
        M3 m3 = (M3) obj;
        return Intrinsics.c(this.a, m3.a) && Intrinsics.c(this.b, m3.b) && Intrinsics.c(this.c, m3.c) && Intrinsics.c(this.d, m3.d);
    }

    @Nullable
    public final b f() {
        return this.d;
    }

    @Nullable
    public final c g() {
        return this.a;
    }

    @Nullable
    public final d h() {
        return this.c;
    }

    public int hashCode() {
        c cVar = this.a;
        int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        d dVar = this.c;
        int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        b bVar = this.d;
        return hashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Configurations2(application=" + this.a + ", adFormats=" + this.b + ", testSuite=" + this.c + ", adQuality=" + this.d + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c {

        @Nullable
        private final e a;

        @Nullable
        private final C0189c b;

        @Nullable
        private final h c;

        @Nullable
        private final f d;

        @Nullable
        private final a e;

        @Nullable
        private final b f;

        @Nullable
        private final g g;

        @Nullable
        private final d h;

        @Nullable
        private final Boolean i;

        @Nullable
        private final Boolean j;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a {

            @Nullable
            private final String a;

            @Nullable
            private final String b;

            @Nullable
            private final String c;

            @Nullable
            private final Integer d;

            @Nullable
            private final Long e;

            @Nullable
            private final Integer f;

            @Nullable
            private final Boolean g;

            @Nullable
            private final Boolean h;

            @Nullable
            private final Integer i;

            @Nullable
            private final Boolean j;

            @Nullable
            private final C0188a k;

            @Nullable
            private final C0188a l;

            @Nullable
            private final C0188a m;

            @Nullable
            private final C0188a n;

            public /* synthetic */ a(String str, String str2, String str3, Integer num, Long l, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, C0188a c0188a, C0188a c0188a2, C0188a c0188a3, C0188a c0188a4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : num3, (i & 512) != 0 ? null : bool3, (i & 1024) != 0 ? null : c0188a, (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? null : c0188a2, (i & 4096) != 0 ? null : c0188a3, (i & 8192) != 0 ? null : c0188a4);
            }

            @Nullable
            public final C0188a A() {
                return this.k;
            }

            @Nullable
            public final Boolean B() {
                return this.j;
            }

            @Nullable
            public final Boolean b() {
                return this.j;
            }

            @Nullable
            public final C0188a c() {
                return this.k;
            }

            @Nullable
            public final C0188a d() {
                return this.l;
            }

            @Nullable
            public final C0188a e() {
                return this.m;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.c(this.a, aVar.a) && Intrinsics.c(this.b, aVar.b) && Intrinsics.c(this.c, aVar.c) && Intrinsics.c(this.d, aVar.d) && Intrinsics.c(this.e, aVar.e) && Intrinsics.c(this.f, aVar.f) && Intrinsics.c(this.g, aVar.g) && Intrinsics.c(this.h, aVar.h) && Intrinsics.c(this.i, aVar.i) && Intrinsics.c(this.j, aVar.j) && Intrinsics.c(this.k, aVar.k) && Intrinsics.c(this.l, aVar.l) && Intrinsics.c(this.m, aVar.m) && Intrinsics.c(this.n, aVar.n);
            }

            @Nullable
            public final C0188a f() {
                return this.n;
            }

            @Nullable
            public final String g() {
                return this.b;
            }

            @Nullable
            public final String h() {
                return this.c;
            }

            public int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Integer num = this.d;
                int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                Long l = this.e;
                int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
                Integer num2 = this.f;
                int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool = this.g;
                int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.h;
                int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Integer num3 = this.i;
                int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Boolean bool3 = this.j;
                int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                C0188a c0188a = this.k;
                int hashCode11 = (hashCode10 + (c0188a == null ? 0 : c0188a.hashCode())) * 31;
                C0188a c0188a2 = this.l;
                int hashCode12 = (hashCode11 + (c0188a2 == null ? 0 : c0188a2.hashCode())) * 31;
                C0188a c0188a3 = this.m;
                int hashCode13 = (hashCode12 + (c0188a3 == null ? 0 : c0188a3.hashCode())) * 31;
                C0188a c0188a4 = this.n;
                return hashCode13 + (c0188a4 != null ? c0188a4.hashCode() : 0);
            }

            @Nullable
            public final Integer i() {
                return this.d;
            }

            @Nullable
            public final Long j() {
                return this.e;
            }

            @Nullable
            public final Integer k() {
                return this.f;
            }

            @Nullable
            public final Boolean l() {
                return this.g;
            }

            @Nullable
            public final Boolean m() {
                return this.h;
            }

            @Nullable
            public final Integer n() {
                return this.i;
            }

            @Nullable
            public final String o() {
                return this.a;
            }

            @Nullable
            public final Integer p() {
                return this.f;
            }

            @Nullable
            public final Long q() {
                return this.e;
            }

            @Nullable
            public final Integer r() {
                return this.d;
            }

            @Nullable
            public final String s() {
                return this.b;
            }

            @Nullable
            public final C0188a t() {
                return this.m;
            }

            @NotNull
            public String toString() {
                String str = this.a;
                String str2 = this.b;
                String str3 = this.c;
                Integer num = this.d;
                Long l = this.e;
                Integer num2 = this.f;
                Boolean bool = this.g;
                Boolean bool2 = this.h;
                Integer num3 = this.i;
                Boolean bool3 = this.j;
                C0188a c0188a = this.k;
                C0188a c0188a2 = this.l;
                C0188a c0188a3 = this.m;
                C0188a c0188a4 = this.n;
                StringBuilder s = mz1.s("Auction(auctionData=", str, ", auctioneerURL=", str2, ", extAuctioneerURL=");
                me4.o(num, str3, ", auctionTrials=", ", auctionTimeout=", s);
                s.append(l);
                s.append(", auctionSavedHistory=");
                s.append(num2);
                s.append(", compressAuctionRequest=");
                com.appsflyer.internal.i.q(s, bool, ", compressAuctionResponse=", bool2, ", encryptionVersion=");
                vxd.v(s, num3, ", tokenPerAdapter=", bool3, ", rewarded=");
                s.append(c0188a);
                s.append(", interstitial=");
                s.append(c0188a2);
                s.append(", banner=");
                s.append(c0188a3);
                s.append(", nativeAd=");
                s.append(c0188a4);
                s.append(")");
                return s.toString();
            }

            @Nullable
            public final Boolean u() {
                return this.g;
            }

            @Nullable
            public final Boolean v() {
                return this.h;
            }

            @Nullable
            public final Integer w() {
                return this.i;
            }

            @Nullable
            public final String x() {
                return this.c;
            }

            @Nullable
            public final C0188a y() {
                return this.l;
            }

            @Nullable
            public final C0188a z() {
                return this.n;
            }

            public a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Long l, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num3, @Nullable Boolean bool3, @Nullable C0188a c0188a, @Nullable C0188a c0188a2, @Nullable C0188a c0188a3, @Nullable C0188a c0188a4) {
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = num;
                this.e = l;
                this.f = num2;
                this.g = bool;
                this.h = bool2;
                this.i = num3;
                this.j = bool3;
                this.k = c0188a;
                this.l = c0188a2;
                this.m = c0188a3;
                this.n = c0188a4;
            }

            public a() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            /* renamed from: com.ironsource.M3$c$a$a, reason: collision with other inner class name */
            public static final class C0188a {

                @Nullable
                private final Boolean a;

                @Nullable
                private final Integer b;

                @Nullable
                private final Boolean c;

                @Nullable
                private final Integer d;

                @Nullable
                private final Integer e;

                @Nullable
                private final Boolean f;

                @Nullable
                private final Boolean g;

                @Nullable
                private final Integer h;

                @Nullable
                private final Integer i;

                @Nullable
                private final Boolean j;

                public /* synthetic */ C0188a(Boolean bool, Integer num, Boolean bool2, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Integer num4, Integer num5, Boolean bool5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : bool4, (i & 128) != 0 ? null : num4, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : num5, (i & 512) != 0 ? null : bool5);
                }

                public static /* synthetic */ C0188a a(C0188a c0188a, Boolean bool, Integer num, Boolean bool2, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Integer num4, Integer num5, Boolean bool5, int i, Object obj) {
                    if ((i & 1) != 0) {
                        bool = c0188a.a;
                    }
                    if ((i & 2) != 0) {
                        num = c0188a.b;
                    }
                    if ((i & 4) != 0) {
                        bool2 = c0188a.c;
                    }
                    if ((i & 8) != 0) {
                        num2 = c0188a.d;
                    }
                    if ((i & 16) != 0) {
                        num3 = c0188a.e;
                    }
                    if ((i & 32) != 0) {
                        bool3 = c0188a.f;
                    }
                    if ((i & 64) != 0) {
                        bool4 = c0188a.g;
                    }
                    if ((i & 128) != 0) {
                        num4 = c0188a.h;
                    }
                    if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                        num5 = c0188a.i;
                    }
                    if ((i & 512) != 0) {
                        bool5 = c0188a.j;
                    }
                    Integer num6 = num5;
                    Boolean bool6 = bool5;
                    Boolean bool7 = bool4;
                    Integer num7 = num4;
                    Integer num8 = num3;
                    Boolean bool8 = bool3;
                    return c0188a.a(bool, num, bool2, num2, num8, bool8, bool7, num7, num6, bool6);
                }

                @Nullable
                public final Boolean b() {
                    return this.j;
                }

                @Nullable
                public final Integer c() {
                    return this.b;
                }

                @Nullable
                public final Boolean d() {
                    return this.c;
                }

                @Nullable
                public final Integer e() {
                    return this.d;
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0188a)) {
                        return false;
                    }
                    C0188a c0188a = (C0188a) obj;
                    return Intrinsics.c(this.a, c0188a.a) && Intrinsics.c(this.b, c0188a.b) && Intrinsics.c(this.c, c0188a.c) && Intrinsics.c(this.d, c0188a.d) && Intrinsics.c(this.e, c0188a.e) && Intrinsics.c(this.f, c0188a.f) && Intrinsics.c(this.g, c0188a.g) && Intrinsics.c(this.h, c0188a.h) && Intrinsics.c(this.i, c0188a.i) && Intrinsics.c(this.j, c0188a.j);
                }

                @Nullable
                public final Integer f() {
                    return this.e;
                }

                @Nullable
                public final Boolean g() {
                    return this.f;
                }

                @Nullable
                public final Boolean h() {
                    return this.g;
                }

                public int hashCode() {
                    Boolean bool = this.a;
                    int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    Integer num = this.b;
                    int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                    Boolean bool2 = this.c;
                    int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                    Integer num2 = this.d;
                    int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
                    Integer num3 = this.e;
                    int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
                    Boolean bool3 = this.f;
                    int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                    Boolean bool4 = this.g;
                    int hashCode7 = (hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
                    Integer num4 = this.h;
                    int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
                    Integer num5 = this.i;
                    int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
                    Boolean bool5 = this.j;
                    return hashCode9 + (bool5 != null ? bool5.hashCode() : 0);
                }

                @Nullable
                public final Integer i() {
                    return this.h;
                }

                @Nullable
                public final Integer j() {
                    return this.i;
                }

                @Nullable
                public final Integer k() {
                    return this.d;
                }

                @Nullable
                public final Boolean l() {
                    return this.j;
                }

                @Nullable
                public final Integer m() {
                    return this.b;
                }

                @Nullable
                public final Boolean n() {
                    return this.c;
                }

                @Nullable
                public final Boolean o() {
                    return this.a;
                }

                @Nullable
                public final Integer p() {
                    return this.h;
                }

                @Nullable
                public final Integer q() {
                    return this.e;
                }

                @Nullable
                public final Integer r() {
                    return this.i;
                }

                @Nullable
                public final Boolean s() {
                    return this.f;
                }

                @Nullable
                public final Boolean t() {
                    return this.g;
                }

                @NotNull
                public String toString() {
                    Boolean bool = this.a;
                    Integer num = this.b;
                    Boolean bool2 = this.c;
                    Integer num2 = this.d;
                    Integer num3 = this.e;
                    Boolean bool3 = this.f;
                    Boolean bool4 = this.g;
                    Integer num4 = this.h;
                    Integer num5 = this.i;
                    Boolean bool5 = this.j;
                    StringBuilder sb = new StringBuilder("AdFormatAuction(programmatic=");
                    sb.append(bool);
                    sb.append(", minTimeBeforeFirstAuction=");
                    sb.append(num);
                    sb.append(", objectPerWaterfall=");
                    sb.append(bool2);
                    sb.append(", auctionRetryInterval=");
                    sb.append(num2);
                    sb.append(", timeToWaitBeforeAuction=");
                    vxd.v(sb, num3, ", isAuctionOnShowStart=", bool3, ", isLoadWhileShow=");
                    sb.append(bool4);
                    sb.append(", timeToDeleteOldWaterfallAfterAuction=");
                    sb.append(num4);
                    sb.append(", timeToWaitBeforeLoad=");
                    sb.append(num5);
                    sb.append(", enableAuctionFallback=");
                    sb.append(bool5);
                    sb.append(")");
                    return sb.toString();
                }

                public C0188a(@Nullable Boolean bool, @Nullable Integer num, @Nullable Boolean bool2, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Integer num4, @Nullable Integer num5, @Nullable Boolean bool5) {
                    this.a = bool;
                    this.b = num;
                    this.c = bool2;
                    this.d = num2;
                    this.e = num3;
                    this.f = bool3;
                    this.g = bool4;
                    this.h = num4;
                    this.i = num5;
                    this.j = bool5;
                }

                public C0188a() {
                    this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
                }

                @NotNull
                public final C0188a a(@Nullable Boolean bool, @Nullable Integer num, @Nullable Boolean bool2, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Integer num4, @Nullable Integer num5, @Nullable Boolean bool5) {
                    return new C0188a(bool, num, bool2, num2, num3, bool3, bool4, num4, num5, bool5);
                }

                @Nullable
                public final Boolean a() {
                    return this.a;
                }
            }

            @NotNull
            public final a a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Long l, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num3, @Nullable Boolean bool3, @Nullable C0188a c0188a, @Nullable C0188a c0188a2, @Nullable C0188a c0188a3, @Nullable C0188a c0188a4) {
                return new a(str, str2, str3, num, l, num2, bool, bool2, num3, bool3, c0188a, c0188a2, c0188a3, c0188a4);
            }

            @Nullable
            public final String a() {
                return this.a;
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.M3$c$c, reason: collision with other inner class name */
        public static final class C0189c {

            @Nullable
            private final Boolean a;

            @Nullable
            private final Boolean b;

            @Nullable
            private final Boolean c;

            @Nullable
            private final Integer d;

            @Nullable
            private final String e;

            @Nullable
            private final String f;

            @Nullable
            private final Integer g;

            @Nullable
            private final Integer h;

            @Nullable
            private final Integer i;

            @Nullable
            private final List<Integer> j;

            @Nullable
            private final List<Integer> k;

            @Nullable
            private final List<Integer> l;

            @Nullable
            private final List<Integer> m;

            @Nullable
            private final JSONObject n;

            @Nullable
            private final a o;

            @Nullable
            private final String p;

            public /* synthetic */ C0189c(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, List list, List list2, List list3, List list4, JSONObject jSONObject, a aVar, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : num4, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : list2, (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? null : list3, (i & 4096) != 0 ? null : list4, (i & 8192) != 0 ? null : jSONObject, (i & 16384) != 0 ? null : aVar, (i & 32768) != 0 ? null : str3);
            }

            @Nullable
            public final a A() {
                return this.o;
            }

            @Nullable
            public final Boolean B() {
                return this.b;
            }

            @Nullable
            public final Boolean C() {
                return this.a;
            }

            @Nullable
            public final String D() {
                return this.f;
            }

            @Nullable
            public final String E() {
                return this.e;
            }

            @Nullable
            public final List<Integer> F() {
                return this.l;
            }

            @Nullable
            public final List<Integer> b() {
                return this.j;
            }

            @Nullable
            public final List<Integer> c() {
                return this.k;
            }

            @Nullable
            public final List<Integer> d() {
                return this.l;
            }

            @Nullable
            public final List<Integer> e() {
                return this.m;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0189c)) {
                    return false;
                }
                C0189c c0189c = (C0189c) obj;
                return Intrinsics.c(this.a, c0189c.a) && Intrinsics.c(this.b, c0189c.b) && Intrinsics.c(this.c, c0189c.c) && Intrinsics.c(this.d, c0189c.d) && Intrinsics.c(this.e, c0189c.e) && Intrinsics.c(this.f, c0189c.f) && Intrinsics.c(this.g, c0189c.g) && Intrinsics.c(this.h, c0189c.h) && Intrinsics.c(this.i, c0189c.i) && Intrinsics.c(this.j, c0189c.j) && Intrinsics.c(this.k, c0189c.k) && Intrinsics.c(this.l, c0189c.l) && Intrinsics.c(this.m, c0189c.m) && Intrinsics.c(this.n, c0189c.n) && Intrinsics.c(this.o, c0189c.o) && Intrinsics.c(this.p, c0189c.p);
            }

            @Nullable
            public final JSONObject f() {
                return this.n;
            }

            @Nullable
            public final a g() {
                return this.o;
            }

            @Nullable
            public final String h() {
                return this.p;
            }

            public int hashCode() {
                Boolean bool = this.a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.b;
                int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.c;
                int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num = this.d;
                int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                String str = this.e;
                int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f;
                int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num2 = this.g;
                int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.h;
                int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.i;
                int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
                List<Integer> list = this.j;
                int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
                List<Integer> list2 = this.k;
                int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
                List<Integer> list3 = this.l;
                int hashCode12 = (hashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
                List<Integer> list4 = this.m;
                int hashCode13 = (hashCode12 + (list4 == null ? 0 : list4.hashCode())) * 31;
                JSONObject jSONObject = this.n;
                int hashCode14 = (hashCode13 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                a aVar = this.o;
                int hashCode15 = (hashCode14 + (aVar == null ? 0 : aVar.hashCode())) * 31;
                String str3 = this.p;
                return hashCode15 + (str3 != null ? str3.hashCode() : 0);
            }

            @Nullable
            public final Boolean i() {
                return this.b;
            }

            @Nullable
            public final Boolean j() {
                return this.c;
            }

            @Nullable
            public final Integer k() {
                return this.d;
            }

            @Nullable
            public final String l() {
                return this.e;
            }

            @Nullable
            public final String m() {
                return this.f;
            }

            @Nullable
            public final Integer n() {
                return this.g;
            }

            @Nullable
            public final Integer o() {
                return this.h;
            }

            @Nullable
            public final Integer p() {
                return this.i;
            }

            @Nullable
            public final String q() {
                return this.p;
            }

            @Nullable
            public final Integer r() {
                return this.g;
            }

            @Nullable
            public final Boolean s() {
                return this.c;
            }

            @Nullable
            public final Integer t() {
                return this.d;
            }

            @NotNull
            public String toString() {
                Boolean bool = this.a;
                Boolean bool2 = this.b;
                Boolean bool3 = this.c;
                Integer num = this.d;
                String str = this.e;
                String str2 = this.f;
                Integer num2 = this.g;
                Integer num3 = this.h;
                Integer num4 = this.i;
                List<Integer> list = this.j;
                List<Integer> list2 = this.k;
                List<Integer> list3 = this.l;
                List<Integer> list4 = this.m;
                JSONObject jSONObject = this.n;
                a aVar = this.o;
                String str3 = this.p;
                StringBuilder sb = new StringBuilder("Events(sendUltraEvents=");
                sb.append(bool);
                sb.append(", sendEventsToggle=");
                sb.append(bool2);
                sb.append(", eventsCompression=");
                sb.append(bool3);
                sb.append(", eventsCompressionLevel=");
                sb.append(num);
                sb.append(", serverEventsURL=");
                bf3.v(sb, str, ", serverEventsType=", str2, ", backupThreshold=");
                vxd.r(num2, num3, ", maxNumberOfEvents=", ", maxEventsPerBatch=", sb);
                sb.append(num4);
                sb.append(", optOut=");
                sb.append(list);
                sb.append(", optIn=");
                vxd.w(sb, list2, ", triggerEvents=", list3, ", nonConnectivityEvents=");
                sb.append(list4);
                sb.append(", genericParams=");
                sb.append(jSONObject);
                sb.append(", pixel=");
                sb.append(aVar);
                sb.append(", abt=");
                sb.append(str3);
                sb.append(")");
                return sb.toString();
            }

            @Nullable
            public final JSONObject u() {
                return this.n;
            }

            @Nullable
            public final Integer v() {
                return this.i;
            }

            @Nullable
            public final Integer w() {
                return this.h;
            }

            @Nullable
            public final List<Integer> x() {
                return this.m;
            }

            @Nullable
            public final List<Integer> y() {
                return this.k;
            }

            @Nullable
            public final List<Integer> z() {
                return this.j;
            }

            public C0189c(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable List<Integer> list, @Nullable List<Integer> list2, @Nullable List<Integer> list3, @Nullable List<Integer> list4, @Nullable JSONObject jSONObject, @Nullable a aVar, @Nullable String str3) {
                this.a = bool;
                this.b = bool2;
                this.c = bool3;
                this.d = num;
                this.e = str;
                this.f = str2;
                this.g = num2;
                this.h = num3;
                this.i = num4;
                this.j = list;
                this.k = list2;
                this.l = list3;
                this.m = list4;
                this.n = jSONObject;
                this.o = aVar;
                this.p = str3;
            }

            @NotNull
            public final C0189c a(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable List<Integer> list, @Nullable List<Integer> list2, @Nullable List<Integer> list3, @Nullable List<Integer> list4, @Nullable JSONObject jSONObject, @Nullable a aVar, @Nullable String str3) {
                return new C0189c(bool, bool2, bool3, num, str, str2, num2, num3, num4, list, list2, list3, list4, jSONObject, aVar, str3);
            }

            @Nullable
            public final Boolean a() {
                return this.a;
            }

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            /* renamed from: com.ironsource.M3$c$c$a */
            public static final class a {

                @Nullable
                private final String a;

                @Nullable
                private final Boolean b;

                public /* synthetic */ a(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool);
                }

                public static /* synthetic */ a a(a aVar, String str, Boolean bool, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = aVar.a;
                    }
                    if ((i & 2) != 0) {
                        bool = aVar.b;
                    }
                    return aVar.a(str, bool);
                }

                @Nullable
                public final Boolean b() {
                    return this.b;
                }

                @Nullable
                public final Boolean c() {
                    return this.b;
                }

                @Nullable
                public final String d() {
                    return this.a;
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return Intrinsics.c(this.a, aVar.a) && Intrinsics.c(this.b, aVar.b);
                }

                public int hashCode() {
                    String str = this.a;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    Boolean bool = this.b;
                    return hashCode + (bool != null ? bool.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "Pixel(pixelEventsUrl=" + this.a + ", pixelEventsEnabled=" + this.b + ")";
                }

                public a(@Nullable String str, @Nullable Boolean bool) {
                    this.a = str;
                    this.b = bool;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public a() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                @NotNull
                public final a a(@Nullable String str, @Nullable Boolean bool) {
                    return new a(str, bool);
                }

                @Nullable
                public final String a() {
                    return this.a;
                }
            }

            public C0189c() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
            }
        }

        public /* synthetic */ c(e eVar, C0189c c0189c, h hVar, f fVar, a aVar, b bVar, g gVar, d dVar, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : eVar, (i & 2) != 0 ? null : c0189c, (i & 4) != 0 ? null : hVar, (i & 8) != 0 ? null : fVar, (i & 16) != 0 ? null : aVar, (i & 32) != 0 ? null : bVar, (i & 64) != 0 ? null : gVar, (i & 128) != 0 ? null : dVar, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : bool, (i & 512) != 0 ? null : bool2);
        }

        public static /* synthetic */ c a(c cVar, e eVar, C0189c c0189c, h hVar, f fVar, a aVar, b bVar, g gVar, d dVar, Boolean bool, Boolean bool2, int i, Object obj) {
            if ((i & 1) != 0) {
                eVar = cVar.a;
            }
            if ((i & 2) != 0) {
                c0189c = cVar.b;
            }
            if ((i & 4) != 0) {
                hVar = cVar.c;
            }
            if ((i & 8) != 0) {
                fVar = cVar.d;
            }
            if ((i & 16) != 0) {
                aVar = cVar.e;
            }
            if ((i & 32) != 0) {
                bVar = cVar.f;
            }
            if ((i & 64) != 0) {
                gVar = cVar.g;
            }
            if ((i & 128) != 0) {
                dVar = cVar.h;
            }
            if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                bool = cVar.i;
            }
            if ((i & 512) != 0) {
                bool2 = cVar.j;
            }
            Boolean bool3 = bool;
            Boolean bool4 = bool2;
            g gVar2 = gVar;
            d dVar2 = dVar;
            a aVar2 = aVar;
            b bVar2 = bVar;
            return cVar.a(eVar, c0189c, hVar, fVar, aVar2, bVar2, gVar2, dVar2, bool3, bool4);
        }

        @Nullable
        public final Boolean b() {
            return this.j;
        }

        @Nullable
        public final C0189c c() {
            return this.b;
        }

        @Nullable
        public final h d() {
            return this.c;
        }

        @Nullable
        public final f e() {
            return this.d;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.c(this.a, cVar.a) && Intrinsics.c(this.b, cVar.b) && Intrinsics.c(this.c, cVar.c) && Intrinsics.c(this.d, cVar.d) && Intrinsics.c(this.e, cVar.e) && Intrinsics.c(this.f, cVar.f) && Intrinsics.c(this.g, cVar.g) && Intrinsics.c(this.h, cVar.h) && Intrinsics.c(this.i, cVar.i) && Intrinsics.c(this.j, cVar.j);
        }

        @Nullable
        public final a f() {
            return this.e;
        }

        @Nullable
        public final b g() {
            return this.f;
        }

        @Nullable
        public final g h() {
            return this.g;
        }

        public int hashCode() {
            e eVar = this.a;
            int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
            C0189c c0189c = this.b;
            int hashCode2 = (hashCode + (c0189c == null ? 0 : c0189c.hashCode())) * 31;
            h hVar = this.c;
            int hashCode3 = (hashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
            f fVar = this.d;
            int hashCode4 = (hashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            a aVar = this.e;
            int hashCode5 = (hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            b bVar = this.f;
            int hashCode6 = (hashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            g gVar = this.g;
            int hashCode7 = (hashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            d dVar = this.h;
            int hashCode8 = (hashCode7 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            Boolean bool = this.i;
            int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.j;
            return hashCode9 + (bool2 != null ? bool2.hashCode() : 0);
        }

        @Nullable
        public final d i() {
            return this.h;
        }

        @Nullable
        public final Boolean j() {
            return this.i;
        }

        @Nullable
        public final a k() {
            return this.e;
        }

        @Nullable
        public final b l() {
            return this.f;
        }

        @Nullable
        public final C0189c m() {
            return this.b;
        }

        @Nullable
        public final d n() {
            return this.h;
        }

        @Nullable
        public final Boolean o() {
            return this.j;
        }

        @Nullable
        public final e p() {
            return this.a;
        }

        @Nullable
        public final f q() {
            return this.d;
        }

        @Nullable
        public final g r() {
            return this.g;
        }

        @Nullable
        public final h s() {
            return this.c;
        }

        @Nullable
        public final Boolean t() {
            return this.i;
        }

        @NotNull
        public String toString() {
            return "Application(loggers=" + this.a + ", events=" + this.b + ", token=" + this.c + ", segment=" + this.d + ", auction=" + this.e + ", crashReporter=" + this.f + ", settings=" + this.g + ", external=" + this.h + ", uuidEnabled=" + this.i + ", integration=" + this.j + ")";
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class g {

            @Nullable
            private final Boolean a;

            @Nullable
            private final a b;

            @Nullable
            private final Boolean c;

            @Nullable
            private final C0190c d;

            @Nullable
            private final List<String> e;

            @Nullable
            private final Integer f;

            @Nullable
            private final Boolean g;

            @Nullable
            private final b h;

            public /* synthetic */ g(Boolean bool, a aVar, Boolean bool2, C0190c c0190c, List list, Integer num, Boolean bool3, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : c0190c, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : bool3, (i & 128) != 0 ? null : bVar);
            }

            public static /* synthetic */ g a(g gVar, Boolean bool, a aVar, Boolean bool2, C0190c c0190c, List list, Integer num, Boolean bool3, b bVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = gVar.a;
                }
                if ((i & 2) != 0) {
                    aVar = gVar.b;
                }
                if ((i & 4) != 0) {
                    bool2 = gVar.c;
                }
                if ((i & 8) != 0) {
                    c0190c = gVar.d;
                }
                if ((i & 16) != 0) {
                    list = gVar.e;
                }
                if ((i & 32) != 0) {
                    num = gVar.f;
                }
                if ((i & 64) != 0) {
                    bool3 = gVar.g;
                }
                if ((i & 128) != 0) {
                    bVar = gVar.h;
                }
                Boolean bool4 = bool3;
                b bVar2 = bVar;
                List list2 = list;
                Integer num2 = num;
                return gVar.a(bool, aVar, bool2, c0190c, list2, num2, bool4, bVar2);
            }

            @Nullable
            public final a b() {
                return this.b;
            }

            @Nullable
            public final Boolean c() {
                return this.c;
            }

            @Nullable
            public final C0190c d() {
                return this.d;
            }

            @Nullable
            public final List<String> e() {
                return this.e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return Intrinsics.c(this.a, gVar.a) && Intrinsics.c(this.b, gVar.b) && Intrinsics.c(this.c, gVar.c) && Intrinsics.c(this.d, gVar.d) && Intrinsics.c(this.e, gVar.e) && Intrinsics.c(this.f, gVar.f) && Intrinsics.c(this.g, gVar.g) && Intrinsics.c(this.h, gVar.h);
            }

            @Nullable
            public final Integer f() {
                return this.f;
            }

            @Nullable
            public final Boolean g() {
                return this.g;
            }

            @Nullable
            public final b h() {
                return this.h;
            }

            public int hashCode() {
                Boolean bool = this.a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                a aVar = this.b;
                int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                Boolean bool2 = this.c;
                int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                C0190c c0190c = this.d;
                int hashCode4 = (hashCode3 + (c0190c == null ? 0 : c0190c.hashCode())) * 31;
                List<String> list = this.e;
                int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
                Integer num = this.f;
                int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                Boolean bool3 = this.g;
                int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                b bVar = this.h;
                return hashCode7 + (bVar != null ? bVar.hashCode() : 0);
            }

            @Nullable
            public final a i() {
                return this.b;
            }

            @Nullable
            public final b j() {
                return this.h;
            }

            @Nullable
            public final List<String> k() {
                return this.e;
            }

            @Nullable
            public final Boolean l() {
                return this.c;
            }

            @Nullable
            public final Boolean m() {
                return this.g;
            }

            @Nullable
            public final Boolean n() {
                return this.a;
            }

            @Nullable
            public final C0190c o() {
                return this.d;
            }

            @Nullable
            public final Integer p() {
                return this.f;
            }

            @NotNull
            public String toString() {
                return "Settings(sid=" + this.a + ", consentView=" + this.b + ", passAdditionalContextualSignals=" + this.c + ", skd=" + this.d + ", isp=" + this.e + ", uaeh=" + this.f + ", sharedThreadPool=" + this.g + ", epConfig=" + this.h + ")";
            }

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            /* renamed from: com.ironsource.M3$c$g$c, reason: collision with other inner class name */
            public static final class C0190c {

                @Nullable
                private final Map<String, a> a;

                public /* synthetic */ C0190c(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : map);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ C0190c a(C0190c c0190c, Map map, int i, Object obj) {
                    if ((i & 1) != 0) {
                        map = c0190c.a;
                    }
                    return c0190c.a(map);
                }

                @Nullable
                public final Map<String, a> b() {
                    return this.a;
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0190c) && Intrinsics.c(this.a, ((C0190c) obj).a);
                }

                public int hashCode() {
                    Map<String, a> map = this.a;
                    if (map == null) {
                        return 0;
                    }
                    return map.hashCode();
                }

                @NotNull
                public String toString() {
                    return "Skd(providers=" + this.a + ")";
                }

                /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
                /* renamed from: com.ironsource.M3$c$g$c$a */
                public static final class a {

                    @Nullable
                    private final List<String> a;

                    public /* synthetic */ a(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? null : list);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static /* synthetic */ a a(a aVar, List list, int i, Object obj) {
                        if ((i & 1) != 0) {
                            list = aVar.a;
                        }
                        return aVar.a(list);
                    }

                    @Nullable
                    public final List<String> b() {
                        return this.a;
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof a) && Intrinsics.c(this.a, ((a) obj).a);
                    }

                    public int hashCode() {
                        List<String> list = this.a;
                        if (list == null) {
                            return 0;
                        }
                        return list.hashCode();
                    }

                    @NotNull
                    public String toString() {
                        return com.appsflyer.internal.i.i("Provider(skanIds=", ")", this.a);
                    }

                    public a(@Nullable List<String> list) {
                        this.a = list;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public a() {
                        this(null, 1, 0 == true ? 1 : 0);
                    }

                    @NotNull
                    public final a a(@Nullable List<String> list) {
                        return new a(list);
                    }

                    @Nullable
                    public final List<String> a() {
                        return this.a;
                    }
                }

                public C0190c(@Nullable Map<String, a> map) {
                    this.a = map;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public C0190c() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                @NotNull
                public final C0190c a(@Nullable Map<String, a> map) {
                    return new C0190c(map);
                }

                @Nullable
                public final Map<String, a> a() {
                    return this.a;
                }
            }

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class b {

                @Nullable
                private final JSONObject a;

                public /* synthetic */ b(JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : jSONObject);
                }

                public static /* synthetic */ b a(b bVar, JSONObject jSONObject, int i, Object obj) {
                    if ((i & 1) != 0) {
                        jSONObject = bVar.a;
                    }
                    return bVar.a(jSONObject);
                }

                @Nullable
                public final JSONObject b() {
                    return this.a;
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && Intrinsics.c(this.a, ((b) obj).a);
                }

                public int hashCode() {
                    JSONObject jSONObject = this.a;
                    if (jSONObject == null) {
                        return 0;
                    }
                    return jSONObject.hashCode();
                }

                @NotNull
                public String toString() {
                    return "EpConfig(traits=" + this.a + ")";
                }

                public b(@Nullable JSONObject jSONObject) {
                    this.a = jSONObject;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public b() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                @NotNull
                public final b a(@Nullable JSONObject jSONObject) {
                    return new b(jSONObject);
                }

                @Nullable
                public final JSONObject a() {
                    return this.a;
                }
            }

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a {

                @Nullable
                private final String a;

                @Nullable
                private final String b;

                public /* synthetic */ a(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
                }

                public static /* synthetic */ a a(a aVar, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = aVar.a;
                    }
                    if ((i & 2) != 0) {
                        str2 = aVar.b;
                    }
                    return aVar.a(str, str2);
                }

                @Nullable
                public final String b() {
                    return this.b;
                }

                @Nullable
                public final String c() {
                    return this.b;
                }

                @Nullable
                public final String d() {
                    return this.a;
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return Intrinsics.c(this.a, aVar.a) && Intrinsics.c(this.b, aVar.b);
                }

                public int hashCode() {
                    String str = this.a;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.b;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return bf3.k("ConsentView(pre=", this.a, ", post=", this.b, ")");
                }

                public a(@Nullable String str, @Nullable String str2) {
                    this.a = str;
                    this.b = str2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public a() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                @NotNull
                public final a a(@Nullable String str, @Nullable String str2) {
                    return new a(str, str2);
                }

                @Nullable
                public final String a() {
                    return this.a;
                }
            }

            public g(@Nullable Boolean bool, @Nullable a aVar, @Nullable Boolean bool2, @Nullable C0190c c0190c, @Nullable List<String> list, @Nullable Integer num, @Nullable Boolean bool3, @Nullable b bVar) {
                this.a = bool;
                this.b = aVar;
                this.c = bool2;
                this.d = c0190c;
                this.e = list;
                this.f = num;
                this.g = bool3;
                this.h = bVar;
            }

            public g() {
                this(null, null, null, null, null, null, null, null, 255, null);
            }

            @NotNull
            public final g a(@Nullable Boolean bool, @Nullable a aVar, @Nullable Boolean bool2, @Nullable C0190c c0190c, @Nullable List<String> list, @Nullable Integer num, @Nullable Boolean bool3, @Nullable b bVar) {
                return new g(bool, aVar, bool2, c0190c, list, num, bool3, bVar);
            }

            @Nullable
            public final Boolean a() {
                return this.a;
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class d {

            @Nullable
            private final Map<String, String> a;

            public /* synthetic */ d(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : map);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ d a(d dVar, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    map = dVar.a;
                }
                return dVar.a(map);
            }

            @Nullable
            public final Map<String, String> b() {
                return this.a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.c(this.a, ((d) obj).a);
            }

            public int hashCode() {
                Map<String, String> map = this.a;
                if (map == null) {
                    return 0;
                }
                return map.hashCode();
            }

            @NotNull
            public String toString() {
                return "External(mediationTypes=" + this.a + ")";
            }

            public d(@Nullable Map<String, String> map) {
                this.a = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public d() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @NotNull
            public final d a(@Nullable Map<String, String> map) {
                return new d(map);
            }

            @Nullable
            public final Map<String, String> a() {
                return this.a;
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class f {

            @Nullable
            private final String a;

            @Nullable
            private final String b;

            @Nullable
            private final JSONObject c;

            public /* synthetic */ f(String str, String str2, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : jSONObject);
            }

            public static /* synthetic */ f a(f fVar, String str, String str2, JSONObject jSONObject, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fVar.a;
                }
                if ((i & 2) != 0) {
                    str2 = fVar.b;
                }
                if ((i & 4) != 0) {
                    jSONObject = fVar.c;
                }
                return fVar.a(str, str2, jSONObject);
            }

            @Nullable
            public final String b() {
                return this.b;
            }

            @Nullable
            public final JSONObject c() {
                return this.c;
            }

            @Nullable
            public final JSONObject d() {
                return this.c;
            }

            @Nullable
            public final String e() {
                return this.b;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.c(this.a, fVar.a) && Intrinsics.c(this.b, fVar.b) && Intrinsics.c(this.c, fVar.c);
            }

            @Nullable
            public final String f() {
                return this.a;
            }

            public int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                JSONObject jSONObject = this.c;
                return hashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.a;
                String str2 = this.b;
                JSONObject jSONObject = this.c;
                StringBuilder s = mz1.s("Segment(name=", str, ", id=", str2, ", custom=");
                s.append(jSONObject);
                s.append(")");
                return s.toString();
            }

            public f(@Nullable String str, @Nullable String str2, @Nullable JSONObject jSONObject) {
                this.a = str;
                this.b = str2;
                this.c = jSONObject;
            }

            @NotNull
            public final f a(@Nullable String str, @Nullable String str2, @Nullable JSONObject jSONObject) {
                return new f(str, str2, jSONObject);
            }

            public f() {
                this(null, null, null, 7, null);
            }

            @Nullable
            public final String a() {
                return this.a;
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class e {

            @Nullable
            private final Integer a;

            @Nullable
            private final Integer b;

            @Nullable
            private final Integer c;

            @Nullable
            private final Boolean d;

            public /* synthetic */ e(Integer num, Integer num2, Integer num3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : bool);
            }

            public static /* synthetic */ e a(e eVar, Integer num, Integer num2, Integer num3, Boolean bool, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = eVar.a;
                }
                if ((i & 2) != 0) {
                    num2 = eVar.b;
                }
                if ((i & 4) != 0) {
                    num3 = eVar.c;
                }
                if ((i & 8) != 0) {
                    bool = eVar.d;
                }
                return eVar.a(num, num2, num3, bool);
            }

            @Nullable
            public final Integer b() {
                return this.b;
            }

            @Nullable
            public final Integer c() {
                return this.c;
            }

            @Nullable
            public final Boolean d() {
                return this.d;
            }

            @Nullable
            public final Integer e() {
                return this.c;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return Intrinsics.c(this.a, eVar.a) && Intrinsics.c(this.b, eVar.b) && Intrinsics.c(this.c, eVar.c) && Intrinsics.c(this.d, eVar.d);
            }

            @Nullable
            public final Integer f() {
                return this.b;
            }

            @Nullable
            public final Integer g() {
                return this.a;
            }

            @Nullable
            public final Boolean h() {
                return this.d;
            }

            public int hashCode() {
                Integer num = this.a;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.b;
                int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.c;
                int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Boolean bool = this.d;
                return hashCode3 + (bool != null ? bool.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                Integer num = this.a;
                Integer num2 = this.b;
                Integer num3 = this.c;
                Boolean bool = this.d;
                StringBuilder k = wv8.k(num, "Loggers(server=", ", publisher=", ", console=", num2);
                k.append(num3);
                k.append(", shouldSendPublisherLogsOnUIThread=");
                k.append(bool);
                k.append(")");
                return k.toString();
            }

            public e(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool) {
                this.a = num;
                this.b = num2;
                this.c = num3;
                this.d = bool;
            }

            @NotNull
            public final e a(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool) {
                return new e(num, num2, num3, bool);
            }

            public e() {
                this(null, null, null, null, 15, null);
            }

            @Nullable
            public final Integer a() {
                return this.a;
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class h {

            @Nullable
            private final List<String> a;

            @Nullable
            private final JSONObject b;

            @Nullable
            private final Boolean c;

            @Nullable
            private final Boolean d;

            @Nullable
            private final Boolean e;

            public /* synthetic */ h(List list, JSONObject jSONObject, Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : jSONObject, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : bool3);
            }

            public static /* synthetic */ h a(h hVar, List list, JSONObject jSONObject, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = hVar.a;
                }
                if ((i & 2) != 0) {
                    jSONObject = hVar.b;
                }
                if ((i & 4) != 0) {
                    bool = hVar.c;
                }
                if ((i & 8) != 0) {
                    bool2 = hVar.d;
                }
                if ((i & 16) != 0) {
                    bool3 = hVar.e;
                }
                Boolean bool4 = bool3;
                Boolean bool5 = bool;
                return hVar.a(list, jSONObject, bool5, bool2, bool4);
            }

            @Nullable
            public final JSONObject b() {
                return this.b;
            }

            @Nullable
            public final Boolean c() {
                return this.c;
            }

            @Nullable
            public final Boolean d() {
                return this.d;
            }

            @Nullable
            public final Boolean e() {
                return this.e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return Intrinsics.c(this.a, hVar.a) && Intrinsics.c(this.b, hVar.b) && Intrinsics.c(this.c, hVar.c) && Intrinsics.c(this.d, hVar.d) && Intrinsics.c(this.e, hVar.e);
            }

            @Nullable
            public final Boolean f() {
                return this.d;
            }

            @Nullable
            public final Boolean g() {
                return this.c;
            }

            @Nullable
            public final Boolean h() {
                return this.e;
            }

            public int hashCode() {
                List<String> list = this.a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                JSONObject jSONObject = this.b;
                int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Boolean bool = this.c;
                int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.d;
                int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.e;
                return hashCode4 + (bool3 != null ? bool3.hashCode() : 0);
            }

            @Nullable
            public final List<String> i() {
                return this.a;
            }

            @Nullable
            public final JSONObject j() {
                return this.b;
            }

            @NotNull
            public String toString() {
                List<String> list = this.a;
                JSONObject jSONObject = this.b;
                Boolean bool = this.c;
                Boolean bool2 = this.d;
                Boolean bool3 = this.e;
                StringBuilder sb = new StringBuilder("Token(optInKeys=");
                sb.append(list);
                sb.append(", tokenGenericParams=");
                sb.append(jSONObject);
                sb.append(", compressToken=");
                com.appsflyer.internal.i.q(sb, bool, ", compressExternalToken=", bool2, ", oneToken=");
                sb.append(bool3);
                sb.append(")");
                return sb.toString();
            }

            public h(@Nullable List<String> list, @Nullable JSONObject jSONObject, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
                this.a = list;
                this.b = jSONObject;
                this.c = bool;
                this.d = bool2;
                this.e = bool3;
            }

            public h() {
                this(null, null, null, null, null, 31, null);
            }

            @NotNull
            public final h a(@Nullable List<String> list, @Nullable JSONObject jSONObject, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
                return new h(list, jSONObject, bool, bool2, bool3);
            }

            @Nullable
            public final List<String> a() {
                return this.a;
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class b {

            @Nullable
            private final Boolean a;

            @Nullable
            private final String b;

            @Nullable
            private final String c;

            @Nullable
            private final Boolean d;

            @Nullable
            private final Integer e;

            @Nullable
            private final Boolean f;

            @Nullable
            private final List<String> g;

            public /* synthetic */ b(Boolean bool, String str, String str2, Boolean bool2, Integer num, Boolean bool3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : list);
            }

            public static /* synthetic */ b a(b bVar, Boolean bool, String str, String str2, Boolean bool2, Integer num, Boolean bool3, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = bVar.a;
                }
                if ((i & 2) != 0) {
                    str = bVar.b;
                }
                if ((i & 4) != 0) {
                    str2 = bVar.c;
                }
                if ((i & 8) != 0) {
                    bool2 = bVar.d;
                }
                if ((i & 16) != 0) {
                    num = bVar.e;
                }
                if ((i & 32) != 0) {
                    bool3 = bVar.f;
                }
                if ((i & 64) != 0) {
                    list = bVar.g;
                }
                Boolean bool4 = bool3;
                List list2 = list;
                Integer num2 = num;
                String str3 = str2;
                return bVar.a(bool, str, str3, bool2, num2, bool4, list2);
            }

            @Nullable
            public final String b() {
                return this.b;
            }

            @Nullable
            public final String c() {
                return this.c;
            }

            @Nullable
            public final Boolean d() {
                return this.d;
            }

            @Nullable
            public final Integer e() {
                return this.e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.c(this.a, bVar.a) && Intrinsics.c(this.b, bVar.b) && Intrinsics.c(this.c, bVar.c) && Intrinsics.c(this.d, bVar.d) && Intrinsics.c(this.e, bVar.e) && Intrinsics.c(this.f, bVar.f) && Intrinsics.c(this.g, bVar.g);
            }

            @Nullable
            public final Boolean f() {
                return this.f;
            }

            @Nullable
            public final List<String> g() {
                return this.g;
            }

            @Nullable
            public final Boolean h() {
                return this.a;
            }

            public int hashCode() {
                Boolean bool = this.a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                String str = this.b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.c;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool2 = this.d;
                int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Integer num = this.e;
                int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
                Boolean bool3 = this.f;
                int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                List<String> list = this.g;
                return hashCode6 + (list != null ? list.hashCode() : 0);
            }

            @Nullable
            public final Boolean i() {
                return this.d;
            }

            @Nullable
            public final List<String> j() {
                return this.g;
            }

            @Nullable
            public final String k() {
                return this.c;
            }

            @Nullable
            public final String l() {
                return this.b;
            }

            @Nullable
            public final Boolean m() {
                return this.f;
            }

            @Nullable
            public final Integer n() {
                return this.e;
            }

            @NotNull
            public String toString() {
                Boolean bool = this.a;
                String str = this.b;
                String str2 = this.c;
                Boolean bool2 = this.d;
                Integer num = this.e;
                Boolean bool3 = this.f;
                List<String> list = this.g;
                StringBuilder sb = new StringBuilder("CrashReporter(enabled=");
                sb.append(bool);
                sb.append(", reporterURL=");
                sb.append(str);
                sb.append(", reporterKeyword=");
                sb.append(str2);
                sb.append(", includeANR=");
                sb.append(bool2);
                sb.append(", timeout=");
                vxd.v(sb, num, ", setIgnoreDebugger=", bool3, ", keysToInclude=");
                return mz1.p(sb, list, ")");
            }

            public b(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable Boolean bool2, @Nullable Integer num, @Nullable Boolean bool3, @Nullable List<String> list) {
                this.a = bool;
                this.b = str;
                this.c = str2;
                this.d = bool2;
                this.e = num;
                this.f = bool3;
                this.g = list;
            }

            public b() {
                this(null, null, null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null);
            }

            @NotNull
            public final b a(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable Boolean bool2, @Nullable Integer num, @Nullable Boolean bool3, @Nullable List<String> list) {
                return new b(bool, str, str2, bool2, num, bool3, list);
            }

            @Nullable
            public final Boolean a() {
                return this.a;
            }
        }

        public c(@Nullable e eVar, @Nullable C0189c c0189c, @Nullable h hVar, @Nullable f fVar, @Nullable a aVar, @Nullable b bVar, @Nullable g gVar, @Nullable d dVar, @Nullable Boolean bool, @Nullable Boolean bool2) {
            this.a = eVar;
            this.b = c0189c;
            this.c = hVar;
            this.d = fVar;
            this.e = aVar;
            this.f = bVar;
            this.g = gVar;
            this.h = dVar;
            this.i = bool;
            this.j = bool2;
        }

        public c() {
            this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
        }

        @NotNull
        public final c a(@Nullable e eVar, @Nullable C0189c c0189c, @Nullable h hVar, @Nullable f fVar, @Nullable a aVar, @Nullable b bVar, @Nullable g gVar, @Nullable d dVar, @Nullable Boolean bool, @Nullable Boolean bool2) {
            return new c(eVar, c0189c, hVar, fVar, aVar, bVar, gVar, dVar, bool, bool2);
        }

        @Nullable
        public final e a() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class d {

        @Nullable
        private final String a;

        public /* synthetic */ d(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public static /* synthetic */ d a(d dVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.a;
            }
            return dVar.a(str);
        }

        @Nullable
        public final String b() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.c(this.a, ((d) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return lnb.o("TestSuite(controllerUrl=", this.a, ")");
        }

        public d(@Nullable String str) {
            this.a = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final d a(@Nullable String str) {
            return new d(str);
        }

        @Nullable
        public final String a() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {

        @Nullable
        private final g a;

        @Nullable
        private final c b;

        @Nullable
        private final b c;

        @Nullable
        private final d d;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.M3$a$a, reason: collision with other inner class name */
        public interface InterfaceC0186a {
            @Nullable
            List<e> a();
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class b implements InterfaceC0186a {

            @Nullable
            private final List<e> a;

            @Nullable
            private final Integer b;

            @Nullable
            private final Long c;

            @Nullable
            private final c.C0189c d;

            @Nullable
            private final Integer e;

            @Nullable
            private final Boolean f;

            @Nullable
            private final Long g;

            @Nullable
            private final Boolean h;

            @Nullable
            private final JSONObject i;

            @Nullable
            private final Boolean j;

            @Nullable
            private final Integer k;

            @Nullable
            private final Integer l;

            @Nullable
            private final Integer m;

            @Nullable
            private final f n;

            public /* synthetic */ b(List list, Integer num, Long l, c.C0189c c0189c, Integer num2, Boolean bool, Long l2, Boolean bool2, JSONObject jSONObject, Boolean bool3, Integer num3, Integer num4, Integer num5, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : c0189c, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : l2, (i & 128) != 0 ? null : bool2, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : jSONObject, (i & 512) != 0 ? null : bool3, (i & 1024) != 0 ? null : num3, (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? null : num4, (i & 4096) != 0 ? null : num5, (i & 8192) != 0 ? null : fVar);
            }

            @Nullable
            public final Boolean A() {
                return this.h;
            }

            @Nullable
            public final Boolean B() {
                return this.j;
            }

            @Nullable
            public final List<e> b() {
                return this.a;
            }

            @Nullable
            public final Boolean c() {
                return this.j;
            }

            @Nullable
            public final Integer d() {
                return this.k;
            }

            @Nullable
            public final Integer e() {
                return this.l;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.c(this.a, bVar.a) && Intrinsics.c(this.b, bVar.b) && Intrinsics.c(this.c, bVar.c) && Intrinsics.c(this.d, bVar.d) && Intrinsics.c(this.e, bVar.e) && Intrinsics.c(this.f, bVar.f) && Intrinsics.c(this.g, bVar.g) && Intrinsics.c(this.h, bVar.h) && Intrinsics.c(this.i, bVar.i) && Intrinsics.c(this.j, bVar.j) && Intrinsics.c(this.k, bVar.k) && Intrinsics.c(this.l, bVar.l) && Intrinsics.c(this.m, bVar.m) && Intrinsics.c(this.n, bVar.n);
            }

            @Nullable
            public final Integer f() {
                return this.m;
            }

            @Nullable
            public final f g() {
                return this.n;
            }

            @Nullable
            public final Integer h() {
                return this.b;
            }

            public int hashCode() {
                List<e> list = this.a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                Integer num = this.b;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Long l = this.c;
                int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
                c.C0189c c0189c = this.d;
                int hashCode4 = (hashCode3 + (c0189c == null ? 0 : c0189c.hashCode())) * 31;
                Integer num2 = this.e;
                int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool = this.f;
                int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l2 = this.g;
                int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
                Boolean bool2 = this.h;
                int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.i;
                int hashCode9 = (hashCode8 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Boolean bool3 = this.j;
                int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num3 = this.k;
                int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.l;
                int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.m;
                int hashCode13 = (hashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
                f fVar = this.n;
                return hashCode13 + (fVar != null ? fVar.hashCode() : 0);
            }

            @Nullable
            public final Long i() {
                return this.c;
            }

            @Nullable
            public final c.C0189c j() {
                return this.d;
            }

            @Nullable
            public final Integer k() {
                return this.e;
            }

            @Nullable
            public final Boolean l() {
                return this.f;
            }

            @Nullable
            public final Long m() {
                return this.g;
            }

            @Nullable
            public final Boolean n() {
                return this.h;
            }

            @Nullable
            public final JSONObject o() {
                return this.i;
            }

            @Nullable
            public final JSONObject p() {
                return this.i;
            }

            @Nullable
            public final Integer q() {
                return this.m;
            }

            @Nullable
            public final Integer r() {
                return this.l;
            }

            @Nullable
            public final Long s() {
                return this.c;
            }

            @Nullable
            public final Integer t() {
                return this.e;
            }

            @NotNull
            public String toString() {
                List<e> list = this.a;
                Integer num = this.b;
                Long l = this.c;
                c.C0189c c0189c = this.d;
                Integer num2 = this.e;
                Boolean bool = this.f;
                Long l2 = this.g;
                Boolean bool2 = this.h;
                JSONObject jSONObject = this.i;
                Boolean bool3 = this.j;
                Integer num3 = this.k;
                Integer num4 = this.l;
                Integer num5 = this.m;
                f fVar = this.n;
                StringBuilder sb = new StringBuilder("Banner(placements=");
                sb.append(list);
                sb.append(", maxNumOfAdaptersToLoadOnStart=");
                sb.append(num);
                sb.append(", atim=");
                sb.append(l);
                sb.append(", events=");
                sb.append(c0189c);
                sb.append(", bannerInterval=");
                vxd.v(sb, num2, ", collectBiddingDataAsyncEnabled=", bool, ", collectBiddingDataTimeout=");
                sb.append(l2);
                sb.append(", sharedManagersThread=");
                sb.append(bool2);
                sb.append(", adUnits=");
                sb.append(jSONObject);
                sb.append(", isOneFlow=");
                sb.append(bool3);
                sb.append(", delayLoadFailure=");
                vxd.r(num3, num4, ", advancedLoading=", ", adapterTimeOutInSeconds=", sb);
                sb.append(num5);
                sb.append(", providers=");
                sb.append(fVar);
                sb.append(")");
                return sb.toString();
            }

            @Nullable
            public final Boolean u() {
                return this.f;
            }

            @Nullable
            public final Long v() {
                return this.g;
            }

            @Nullable
            public final Integer w() {
                return this.k;
            }

            @Nullable
            public final c.C0189c x() {
                return this.d;
            }

            @Nullable
            public final Integer y() {
                return this.b;
            }

            @Nullable
            public final f z() {
                return this.n;
            }

            public b(@Nullable List<e> list, @Nullable Integer num, @Nullable Long l, @Nullable c.C0189c c0189c, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Long l2, @Nullable Boolean bool2, @Nullable JSONObject jSONObject, @Nullable Boolean bool3, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable f fVar) {
                this.a = list;
                this.b = num;
                this.c = l;
                this.d = c0189c;
                this.e = num2;
                this.f = bool;
                this.g = l2;
                this.h = bool2;
                this.i = jSONObject;
                this.j = bool3;
                this.k = num3;
                this.l = num4;
                this.m = num5;
                this.n = fVar;
            }

            public b() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }

            @NotNull
            public final b a(@Nullable List<e> list, @Nullable Integer num, @Nullable Long l, @Nullable c.C0189c c0189c, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Long l2, @Nullable Boolean bool2, @Nullable JSONObject jSONObject, @Nullable Boolean bool3, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable f fVar) {
                return new b(list, num, l, c0189c, num2, bool, l2, bool2, jSONObject, bool3, num3, num4, num5, fVar);
            }

            @Override // com.ironsource.M3.a.InterfaceC0186a
            @Nullable
            public List<e> a() {
                return this.a;
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class c implements InterfaceC0186a {

            @Nullable
            private final List<e> a;

            @Nullable
            private final c.C0189c b;

            @Nullable
            private final Integer c;

            @Nullable
            private final Integer d;

            @Nullable
            private final Integer e;

            @Nullable
            private final Boolean f;

            @Nullable
            private final Long g;

            @Nullable
            private final Boolean h;

            @Nullable
            private final JSONObject i;

            @Nullable
            private final Integer j;

            @Nullable
            private final Integer k;

            @Nullable
            private final Boolean l;

            @Nullable
            private final Integer m;

            @Nullable
            private final Integer n;

            @Nullable
            private final f o;

            public /* synthetic */ c(List list, c.C0189c c0189c, Integer num, Integer num2, Integer num3, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num4, Integer num5, Boolean bool3, Integer num6, Integer num7, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : c0189c, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : bool2, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : jSONObject, (i & 512) != 0 ? null : num4, (i & 1024) != 0 ? null : num5, (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? null : bool3, (i & 4096) != 0 ? null : num6, (i & 8192) != 0 ? null : num7, (i & 16384) != 0 ? null : fVar);
            }

            @Nullable
            public final Integer A() {
                return this.m;
            }

            @Nullable
            public final f B() {
                return this.o;
            }

            @Nullable
            public final Boolean C() {
                return this.h;
            }

            @Nullable
            public final Boolean D() {
                return this.l;
            }

            @Nullable
            public final List<e> b() {
                return this.a;
            }

            @Nullable
            public final Integer c() {
                return this.j;
            }

            @Nullable
            public final Integer d() {
                return this.k;
            }

            @Nullable
            public final Boolean e() {
                return this.l;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.c(this.a, cVar.a) && Intrinsics.c(this.b, cVar.b) && Intrinsics.c(this.c, cVar.c) && Intrinsics.c(this.d, cVar.d) && Intrinsics.c(this.e, cVar.e) && Intrinsics.c(this.f, cVar.f) && Intrinsics.c(this.g, cVar.g) && Intrinsics.c(this.h, cVar.h) && Intrinsics.c(this.i, cVar.i) && Intrinsics.c(this.j, cVar.j) && Intrinsics.c(this.k, cVar.k) && Intrinsics.c(this.l, cVar.l) && Intrinsics.c(this.m, cVar.m) && Intrinsics.c(this.n, cVar.n) && Intrinsics.c(this.o, cVar.o);
            }

            @Nullable
            public final Integer f() {
                return this.m;
            }

            @Nullable
            public final Integer g() {
                return this.n;
            }

            @Nullable
            public final f h() {
                return this.o;
            }

            public int hashCode() {
                List<e> list = this.a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                c.C0189c c0189c = this.b;
                int hashCode2 = (hashCode + (c0189c == null ? 0 : c0189c.hashCode())) * 31;
                Integer num = this.c;
                int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.d;
                int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.e;
                int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Boolean bool = this.f;
                int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l = this.g;
                int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
                Boolean bool2 = this.h;
                int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.i;
                int hashCode9 = (hashCode8 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Integer num4 = this.j;
                int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.k;
                int hashCode11 = (hashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
                Boolean bool3 = this.l;
                int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num6 = this.m;
                int hashCode13 = (hashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
                Integer num7 = this.n;
                int hashCode14 = (hashCode13 + (num7 == null ? 0 : num7.hashCode())) * 31;
                f fVar = this.o;
                return hashCode14 + (fVar != null ? fVar.hashCode() : 0);
            }

            @Nullable
            public final c.C0189c i() {
                return this.b;
            }

            @Nullable
            public final Integer j() {
                return this.c;
            }

            @Nullable
            public final Integer k() {
                return this.d;
            }

            @Nullable
            public final Integer l() {
                return this.e;
            }

            @Nullable
            public final Boolean m() {
                return this.f;
            }

            @Nullable
            public final Long n() {
                return this.g;
            }

            @Nullable
            public final Boolean o() {
                return this.h;
            }

            @Nullable
            public final JSONObject p() {
                return this.i;
            }

            @Nullable
            public final JSONObject q() {
                return this.i;
            }

            @Nullable
            public final Integer r() {
                return this.d;
            }

            @Nullable
            public final Integer s() {
                return this.k;
            }

            @Nullable
            public final Integer t() {
                return this.n;
            }

            @NotNull
            public String toString() {
                List<e> list = this.a;
                c.C0189c c0189c = this.b;
                Integer num = this.c;
                Integer num2 = this.d;
                Integer num3 = this.e;
                Boolean bool = this.f;
                Long l = this.g;
                Boolean bool2 = this.h;
                JSONObject jSONObject = this.i;
                Integer num4 = this.j;
                Integer num5 = this.k;
                Boolean bool3 = this.l;
                Integer num6 = this.m;
                Integer num7 = this.n;
                f fVar = this.o;
                StringBuilder sb = new StringBuilder("Interstitial(placements=");
                sb.append(list);
                sb.append(", events=");
                sb.append(c0189c);
                sb.append(", maxNumOfAdaptersToLoadOnStart=");
                vxd.r(num, num2, ", adapterTimeOutInSeconds=", ", delayLoadFailure=", sb);
                vxd.v(sb, num3, ", collectBiddingDataAsyncEnabled=", bool, ", collectBiddingDataTimeout=");
                sb.append(l);
                sb.append(", sharedManagersThread=");
                sb.append(bool2);
                sb.append(", adUnits=");
                sb.append(jSONObject);
                sb.append(", expiredDurationInMinutes=");
                sb.append(num4);
                sb.append(", advancedLoading=");
                vxd.v(sb, num5, ", isOneFlow=", bool3, ", parallelLoad=");
                vxd.r(num6, num7, ", atim=", ", providers=", sb);
                sb.append(fVar);
                sb.append(")");
                return sb.toString();
            }

            @Nullable
            public final Boolean u() {
                return this.f;
            }

            @Nullable
            public final Long v() {
                return this.g;
            }

            @Nullable
            public final Integer w() {
                return this.e;
            }

            @Nullable
            public final c.C0189c x() {
                return this.b;
            }

            @Nullable
            public final Integer y() {
                return this.j;
            }

            @Nullable
            public final Integer z() {
                return this.c;
            }

            @NotNull
            public final c a(@Nullable List<e> list, @Nullable c.C0189c c0189c, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool, @Nullable Long l, @Nullable Boolean bool2, @Nullable JSONObject jSONObject, @Nullable Integer num4, @Nullable Integer num5, @Nullable Boolean bool3, @Nullable Integer num6, @Nullable Integer num7, @Nullable f fVar) {
                return new c(list, c0189c, num, num2, num3, bool, l, bool2, jSONObject, num4, num5, bool3, num6, num7, fVar);
            }

            @Override // com.ironsource.M3.a.InterfaceC0186a
            @Nullable
            public List<e> a() {
                return this.a;
            }

            public c(@Nullable List<e> list, @Nullable c.C0189c c0189c, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool, @Nullable Long l, @Nullable Boolean bool2, @Nullable JSONObject jSONObject, @Nullable Integer num4, @Nullable Integer num5, @Nullable Boolean bool3, @Nullable Integer num6, @Nullable Integer num7, @Nullable f fVar) {
                this.a = list;
                this.b = c0189c;
                this.c = num;
                this.d = num2;
                this.e = num3;
                this.f = bool;
                this.g = l;
                this.h = bool2;
                this.i = jSONObject;
                this.j = num4;
                this.k = num5;
                this.l = bool3;
                this.m = num6;
                this.n = num7;
                this.o = fVar;
            }

            public c() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class g implements InterfaceC0186a {

            @Nullable
            private final List<e> a;

            @Nullable
            private final Integer b;

            @Nullable
            private final Integer c;

            @Nullable
            private final Integer d;

            @Nullable
            private final Integer e;

            @Nullable
            private final Integer f;

            @Nullable
            private final Boolean g;

            @Nullable
            private final Long h;

            @Nullable
            private final Boolean i;

            @Nullable
            private final JSONObject j;

            @Nullable
            private final Integer k;

            @Nullable
            private final Boolean l;

            @Nullable
            private final Integer m;

            @Nullable
            private final Integer n;

            @Nullable
            private final f o;

            public /* synthetic */ g(List list, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num6, Boolean bool3, Integer num7, Integer num8, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : num5, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : l, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : bool2, (i & 512) != 0 ? null : jSONObject, (i & 1024) != 0 ? null : num6, (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? null : bool3, (i & 4096) != 0 ? null : num7, (i & 8192) != 0 ? null : num8, (i & 16384) != 0 ? null : fVar);
            }

            @Nullable
            public final Integer A() {
                return this.m;
            }

            @Nullable
            public final f B() {
                return this.o;
            }

            @Nullable
            public final Boolean C() {
                return this.i;
            }

            @Nullable
            public final Boolean D() {
                return this.l;
            }

            @Nullable
            public final List<e> b() {
                return this.a;
            }

            @Nullable
            public final JSONObject c() {
                return this.j;
            }

            @Nullable
            public final Integer d() {
                return this.k;
            }

            @Nullable
            public final Boolean e() {
                return this.l;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return Intrinsics.c(this.a, gVar.a) && Intrinsics.c(this.b, gVar.b) && Intrinsics.c(this.c, gVar.c) && Intrinsics.c(this.d, gVar.d) && Intrinsics.c(this.e, gVar.e) && Intrinsics.c(this.f, gVar.f) && Intrinsics.c(this.g, gVar.g) && Intrinsics.c(this.h, gVar.h) && Intrinsics.c(this.i, gVar.i) && Intrinsics.c(this.j, gVar.j) && Intrinsics.c(this.k, gVar.k) && Intrinsics.c(this.l, gVar.l) && Intrinsics.c(this.m, gVar.m) && Intrinsics.c(this.n, gVar.n) && Intrinsics.c(this.o, gVar.o);
            }

            @Nullable
            public final Integer f() {
                return this.m;
            }

            @Nullable
            public final Integer g() {
                return this.n;
            }

            @Nullable
            public final f h() {
                return this.o;
            }

            public int hashCode() {
                List<e> list = this.a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                Integer num = this.b;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.c;
                int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.d;
                int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.e;
                int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.f;
                int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
                Boolean bool = this.g;
                int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l = this.h;
                int hashCode8 = (hashCode7 + (l == null ? 0 : l.hashCode())) * 31;
                Boolean bool2 = this.i;
                int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.j;
                int hashCode10 = (hashCode9 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Integer num6 = this.k;
                int hashCode11 = (hashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
                Boolean bool3 = this.l;
                int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num7 = this.m;
                int hashCode13 = (hashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
                Integer num8 = this.n;
                int hashCode14 = (hashCode13 + (num8 == null ? 0 : num8.hashCode())) * 31;
                f fVar = this.o;
                return hashCode14 + (fVar != null ? fVar.hashCode() : 0);
            }

            @Nullable
            public final Integer i() {
                return this.b;
            }

            @Nullable
            public final Integer j() {
                return this.c;
            }

            @Nullable
            public final Integer k() {
                return this.d;
            }

            @Nullable
            public final Integer l() {
                return this.e;
            }

            @Nullable
            public final Integer m() {
                return this.f;
            }

            @Nullable
            public final Boolean n() {
                return this.g;
            }

            @Nullable
            public final Long o() {
                return this.h;
            }

            @Nullable
            public final Boolean p() {
                return this.i;
            }

            @Nullable
            public final JSONObject q() {
                return this.j;
            }

            @Nullable
            public final Integer r() {
                return this.c;
            }

            @Nullable
            public final Integer s() {
                return this.e;
            }

            @Nullable
            public final Integer t() {
                return this.n;
            }

            @NotNull
            public String toString() {
                List<e> list = this.a;
                Integer num = this.b;
                Integer num2 = this.c;
                Integer num3 = this.d;
                Integer num4 = this.e;
                Integer num5 = this.f;
                Boolean bool = this.g;
                Long l = this.h;
                Boolean bool2 = this.i;
                JSONObject jSONObject = this.j;
                Integer num6 = this.k;
                Boolean bool3 = this.l;
                Integer num7 = this.m;
                Integer num8 = this.n;
                f fVar = this.o;
                StringBuilder sb = new StringBuilder("Rewarded(placements=");
                sb.append(list);
                sb.append(", maxNumOfAdaptersToLoadOnStart=");
                sb.append(num);
                sb.append(", adapterTimeOutInSeconds=");
                vxd.r(num2, num3, ", loadRVInterval=", ", advancedLoading=", sb);
                vxd.r(num4, num5, ", expiredDurationInMinutes=", ", collectBiddingDataAsyncEnabled=", sb);
                sb.append(bool);
                sb.append(", collectBiddingDataTimeout=");
                sb.append(l);
                sb.append(", sharedManagersThread=");
                sb.append(bool2);
                sb.append(", adUnits=");
                sb.append(jSONObject);
                sb.append(", delayLoadFailure=");
                vxd.v(sb, num6, ", isOneFlow=", bool3, ", parallelLoad=");
                vxd.r(num7, num8, ", atim=", ", providers=", sb);
                sb.append(fVar);
                sb.append(")");
                return sb.toString();
            }

            @Nullable
            public final Boolean u() {
                return this.g;
            }

            @Nullable
            public final Long v() {
                return this.h;
            }

            @Nullable
            public final Integer w() {
                return this.k;
            }

            @Nullable
            public final Integer x() {
                return this.f;
            }

            @Nullable
            public final Integer y() {
                return this.d;
            }

            @Nullable
            public final Integer z() {
                return this.b;
            }

            @NotNull
            public final g a(@Nullable List<e> list, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Boolean bool, @Nullable Long l, @Nullable Boolean bool2, @Nullable JSONObject jSONObject, @Nullable Integer num6, @Nullable Boolean bool3, @Nullable Integer num7, @Nullable Integer num8, @Nullable f fVar) {
                return new g(list, num, num2, num3, num4, num5, bool, l, bool2, jSONObject, num6, bool3, num7, num8, fVar);
            }

            @Override // com.ironsource.M3.a.InterfaceC0186a
            @Nullable
            public List<e> a() {
                return this.a;
            }

            public g(@Nullable List<e> list, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Boolean bool, @Nullable Long l, @Nullable Boolean bool2, @Nullable JSONObject jSONObject, @Nullable Integer num6, @Nullable Boolean bool3, @Nullable Integer num7, @Nullable Integer num8, @Nullable f fVar) {
                this.a = list;
                this.b = num;
                this.c = num2;
                this.d = num3;
                this.e = num4;
                this.f = num5;
                this.g = bool;
                this.h = l;
                this.i = bool2;
                this.j = jSONObject;
                this.k = num6;
                this.l = bool3;
                this.m = num7;
                this.n = num8;
                this.o = fVar;
            }

            public g() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
            }
        }

        public /* synthetic */ a(g gVar, c cVar, b bVar, d dVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : gVar, (i & 2) != 0 ? null : cVar, (i & 4) != 0 ? null : bVar, (i & 8) != 0 ? null : dVar);
        }

        public static /* synthetic */ a a(a aVar, g gVar, c cVar, b bVar, d dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                gVar = aVar.a;
            }
            if ((i & 2) != 0) {
                cVar = aVar.b;
            }
            if ((i & 4) != 0) {
                bVar = aVar.c;
            }
            if ((i & 8) != 0) {
                dVar = aVar.d;
            }
            return aVar.a(gVar, cVar, bVar, dVar);
        }

        @Nullable
        public final c b() {
            return this.b;
        }

        @Nullable
        public final b c() {
            return this.c;
        }

        @Nullable
        public final d d() {
            return this.d;
        }

        @Nullable
        public final b e() {
            return this.c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.c(this.a, aVar.a) && Intrinsics.c(this.b, aVar.b) && Intrinsics.c(this.c, aVar.c) && Intrinsics.c(this.d, aVar.d);
        }

        @Nullable
        public final c f() {
            return this.b;
        }

        @Nullable
        public final d g() {
            return this.d;
        }

        @Nullable
        public final g h() {
            return this.a;
        }

        public int hashCode() {
            g gVar = this.a;
            int hashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
            c cVar = this.b;
            int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            b bVar = this.c;
            int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            d dVar = this.d;
            return hashCode3 + (dVar != null ? dVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AdFormats(rewarded=" + this.a + ", interstitial=" + this.b + ", banner=" + this.c + ", nativeAd=" + this.d + ")";
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class e {

            @Nullable
            private final Integer a;

            @Nullable
            private final String b;

            @Nullable
            private final Boolean c;

            @Nullable
            private final String d;

            @Nullable
            private final Integer e;

            @Nullable
            private final Boolean f;

            @Nullable
            private final C0187a g;

            @Nullable
            private final b h;

            public /* synthetic */ e(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C0187a c0187a, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : c0187a, (i & 128) != 0 ? null : bVar);
            }

            public static /* synthetic */ e a(e eVar, Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C0187a c0187a, b bVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = eVar.a;
                }
                if ((i & 2) != 0) {
                    str = eVar.b;
                }
                if ((i & 4) != 0) {
                    bool = eVar.c;
                }
                if ((i & 8) != 0) {
                    str2 = eVar.d;
                }
                if ((i & 16) != 0) {
                    num2 = eVar.e;
                }
                if ((i & 32) != 0) {
                    bool2 = eVar.f;
                }
                if ((i & 64) != 0) {
                    c0187a = eVar.g;
                }
                if ((i & 128) != 0) {
                    bVar = eVar.h;
                }
                C0187a c0187a2 = c0187a;
                b bVar2 = bVar;
                Integer num3 = num2;
                Boolean bool3 = bool2;
                return eVar.a(num, str, bool, str2, num3, bool3, c0187a2, bVar2);
            }

            @Nullable
            public final String b() {
                return this.b;
            }

            @Nullable
            public final Boolean c() {
                return this.c;
            }

            @Nullable
            public final String d() {
                return this.d;
            }

            @Nullable
            public final Integer e() {
                return this.e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return Intrinsics.c(this.a, eVar.a) && Intrinsics.c(this.b, eVar.b) && Intrinsics.c(this.c, eVar.c) && Intrinsics.c(this.d, eVar.d) && Intrinsics.c(this.e, eVar.e) && Intrinsics.c(this.f, eVar.f) && Intrinsics.c(this.g, eVar.g) && Intrinsics.c(this.h, eVar.h);
            }

            @Nullable
            public final Boolean f() {
                return this.f;
            }

            @Nullable
            public final C0187a g() {
                return this.g;
            }

            @Nullable
            public final b h() {
                return this.h;
            }

            public int hashCode() {
                Integer num = this.a;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Boolean bool = this.c;
                int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str2 = this.d;
                int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num2 = this.e;
                int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool2 = this.f;
                int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                C0187a c0187a = this.g;
                int hashCode7 = (hashCode6 + (c0187a == null ? 0 : c0187a.hashCode())) * 31;
                b bVar = this.h;
                return hashCode7 + (bVar != null ? bVar.hashCode() : 0);
            }

            @Nullable
            public final C0187a i() {
                return this.g;
            }

            @Nullable
            public final Boolean j() {
                return this.f;
            }

            @Nullable
            public final b k() {
                return this.h;
            }

            @Nullable
            public final Integer l() {
                return this.a;
            }

            @Nullable
            public final String m() {
                return this.b;
            }

            @Nullable
            public final Integer n() {
                return this.e;
            }

            @Nullable
            public final String o() {
                return this.d;
            }

            @Nullable
            public final Boolean p() {
                return this.c;
            }

            @NotNull
            public String toString() {
                Integer num = this.a;
                String str = this.b;
                Boolean bool = this.c;
                String str2 = this.d;
                Integer num2 = this.e;
                Boolean bool2 = this.f;
                C0187a c0187a = this.g;
                b bVar = this.h;
                StringBuilder m = wv8.m("Placement(placementId=", num, ", placementName=", str, ", isDefault=");
                m.append(bool);
                m.append(", virtualItemName=");
                m.append(str2);
                m.append(", virtualItemCount=");
                vxd.v(m, num2, ", delivery=", bool2, ", capping=");
                m.append(c0187a);
                m.append(", pacing=");
                m.append(bVar);
                m.append(")");
                return m.toString();
            }

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class b {

                @Nullable
                private final Boolean a;

                @Nullable
                private final Integer b;

                public /* synthetic */ b(Boolean bool, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num);
                }

                public static /* synthetic */ b a(b bVar, Boolean bool, Integer num, int i, Object obj) {
                    if ((i & 1) != 0) {
                        bool = bVar.a;
                    }
                    if ((i & 2) != 0) {
                        num = bVar.b;
                    }
                    return bVar.a(bool, num);
                }

                @Nullable
                public final Integer b() {
                    return this.b;
                }

                @Nullable
                public final Boolean c() {
                    return this.a;
                }

                @Nullable
                public final Integer d() {
                    return this.b;
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return Intrinsics.c(this.a, bVar.a) && Intrinsics.c(this.b, bVar.b);
                }

                public int hashCode() {
                    Boolean bool = this.a;
                    int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    Integer num = this.b;
                    return hashCode + (num != null ? num.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "Pacing(enabled=" + this.a + ", numOfSeconds=" + this.b + ")";
                }

                public b(@Nullable Boolean bool, @Nullable Integer num) {
                    this.a = bool;
                    this.b = num;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public b() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                @NotNull
                public final b a(@Nullable Boolean bool, @Nullable Integer num) {
                    return new b(bool, num);
                }

                @Nullable
                public final Boolean a() {
                    return this.a;
                }
            }

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            /* renamed from: com.ironsource.M3$a$e$a, reason: collision with other inner class name */
            public static final class C0187a {

                @Nullable
                private final Boolean a;

                @Nullable
                private final String b;

                @Nullable
                private final Integer c;

                public /* synthetic */ C0187a(Boolean bool, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
                }

                public static /* synthetic */ C0187a a(C0187a c0187a, Boolean bool, String str, Integer num, int i, Object obj) {
                    if ((i & 1) != 0) {
                        bool = c0187a.a;
                    }
                    if ((i & 2) != 0) {
                        str = c0187a.b;
                    }
                    if ((i & 4) != 0) {
                        num = c0187a.c;
                    }
                    return c0187a.a(bool, str, num);
                }

                @Nullable
                public final String b() {
                    return this.b;
                }

                @Nullable
                public final Integer c() {
                    return this.c;
                }

                @Nullable
                public final Boolean d() {
                    return this.a;
                }

                @Nullable
                public final Integer e() {
                    return this.c;
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0187a)) {
                        return false;
                    }
                    C0187a c0187a = (C0187a) obj;
                    return Intrinsics.c(this.a, c0187a.a) && Intrinsics.c(this.b, c0187a.b) && Intrinsics.c(this.c, c0187a.c);
                }

                @Nullable
                public final String f() {
                    return this.b;
                }

                public int hashCode() {
                    Boolean bool = this.a;
                    int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    String str = this.b;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    Integer num = this.c;
                    return hashCode2 + (num != null ? num.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    Boolean bool = this.a;
                    String str = this.b;
                    Integer num = this.c;
                    StringBuilder sb = new StringBuilder("Capping(enabled=");
                    sb.append(bool);
                    sb.append(", unit=");
                    sb.append(str);
                    sb.append(", maxImpressions=");
                    return vxd.n(sb, num, ")");
                }

                public C0187a(@Nullable Boolean bool, @Nullable String str, @Nullable Integer num) {
                    this.a = bool;
                    this.b = str;
                    this.c = num;
                }

                @NotNull
                public final C0187a a(@Nullable Boolean bool, @Nullable String str, @Nullable Integer num) {
                    return new C0187a(bool, str, num);
                }

                public C0187a() {
                    this(null, null, null, 7, null);
                }

                @Nullable
                public final Boolean a() {
                    return this.a;
                }
            }

            public e(@Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable C0187a c0187a, @Nullable b bVar) {
                this.a = num;
                this.b = str;
                this.c = bool;
                this.d = str2;
                this.e = num2;
                this.f = bool2;
                this.g = c0187a;
                this.h = bVar;
            }

            public e() {
                this(null, null, null, null, null, null, null, null, 255, null);
            }

            @NotNull
            public final e a(@Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable C0187a c0187a, @Nullable b bVar) {
                return new e(num, str, bool, str2, num2, bool2, c0187a, bVar);
            }

            @Nullable
            public final Integer a() {
                return this.a;
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class f {

            @Nullable
            private final Boolean a;

            @Nullable
            private final Boolean b;

            public /* synthetic */ f(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
            }

            public static /* synthetic */ f a(f fVar, Boolean bool, Boolean bool2, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = fVar.a;
                }
                if ((i & 2) != 0) {
                    bool2 = fVar.b;
                }
                return fVar.a(bool, bool2);
            }

            @Nullable
            public final Boolean b() {
                return this.b;
            }

            @Nullable
            public final Boolean c() {
                return this.a;
            }

            @Nullable
            public final Boolean d() {
                return this.b;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.c(this.a, fVar.a) && Intrinsics.c(this.b, fVar.b);
            }

            public int hashCode() {
                Boolean bool = this.a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.b;
                return hashCode + (bool2 != null ? bool2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Providers(parallelInit=" + this.a + ", waitUntilAllProvidersFinishInit=" + this.b + ")";
            }

            public f(@Nullable Boolean bool, @Nullable Boolean bool2) {
                this.a = bool;
                this.b = bool2;
            }

            @NotNull
            public final f a(@Nullable Boolean bool, @Nullable Boolean bool2) {
                return new f(bool, bool2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public f() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Nullable
            public final Boolean a() {
                return this.a;
            }
        }

        public a(@Nullable g gVar, @Nullable c cVar, @Nullable b bVar, @Nullable d dVar) {
            this.a = gVar;
            this.b = cVar;
            this.c = bVar;
            this.d = dVar;
        }

        @NotNull
        public final a a(@Nullable g gVar, @Nullable c cVar, @Nullable b bVar, @Nullable d dVar) {
            return new a(gVar, cVar, bVar, dVar);
        }

        public a() {
            this(null, null, null, null, 15, null);
        }

        @Nullable
        public final g a() {
            return this.a;
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class d implements InterfaceC0186a {

            @Nullable
            private final List<e> a;

            @Nullable
            private final c.C0189c b;

            @Nullable
            private final Boolean c;

            @Nullable
            private final Long d;

            @Nullable
            private final Boolean e;

            @Nullable
            private final JSONObject f;

            @Nullable
            private final Integer g;

            @Nullable
            private final Integer h;

            @Nullable
            private final Integer i;

            @Nullable
            private final Integer j;

            @Nullable
            private final Long k;

            @Nullable
            private final f l;

            public /* synthetic */ d(List list, c.C0189c c0189c, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num, Integer num2, Integer num3, Integer num4, Long l2, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : c0189c, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : jSONObject, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : num3, (i & 512) != 0 ? null : num4, (i & 1024) != 0 ? null : l2, (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? null : fVar);
            }

            public static /* synthetic */ d a(d dVar, List list, c.C0189c c0189c, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num, Integer num2, Integer num3, Integer num4, Long l2, f fVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = dVar.a;
                }
                if ((i & 2) != 0) {
                    c0189c = dVar.b;
                }
                if ((i & 4) != 0) {
                    bool = dVar.c;
                }
                if ((i & 8) != 0) {
                    l = dVar.d;
                }
                if ((i & 16) != 0) {
                    bool2 = dVar.e;
                }
                if ((i & 32) != 0) {
                    jSONObject = dVar.f;
                }
                if ((i & 64) != 0) {
                    num = dVar.g;
                }
                if ((i & 128) != 0) {
                    num2 = dVar.h;
                }
                if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                    num3 = dVar.i;
                }
                if ((i & 512) != 0) {
                    num4 = dVar.j;
                }
                if ((i & 1024) != 0) {
                    l2 = dVar.k;
                }
                if ((i & com.ironsource.mediationsdk.metadata.a.o) != 0) {
                    fVar = dVar.l;
                }
                Long l3 = l2;
                f fVar2 = fVar;
                Integer num5 = num3;
                Integer num6 = num4;
                Integer num7 = num;
                Integer num8 = num2;
                Boolean bool3 = bool2;
                JSONObject jSONObject2 = jSONObject;
                return dVar.a(list, c0189c, bool, l, bool3, jSONObject2, num7, num8, num5, num6, l3, fVar2);
            }

            @Nullable
            public final List<e> b() {
                return this.a;
            }

            @Nullable
            public final Integer c() {
                return this.j;
            }

            @Nullable
            public final Long d() {
                return this.k;
            }

            @Nullable
            public final f e() {
                return this.l;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return Intrinsics.c(this.a, dVar.a) && Intrinsics.c(this.b, dVar.b) && Intrinsics.c(this.c, dVar.c) && Intrinsics.c(this.d, dVar.d) && Intrinsics.c(this.e, dVar.e) && Intrinsics.c(this.f, dVar.f) && Intrinsics.c(this.g, dVar.g) && Intrinsics.c(this.h, dVar.h) && Intrinsics.c(this.i, dVar.i) && Intrinsics.c(this.j, dVar.j) && Intrinsics.c(this.k, dVar.k) && Intrinsics.c(this.l, dVar.l);
            }

            @Nullable
            public final c.C0189c f() {
                return this.b;
            }

            @Nullable
            public final Boolean g() {
                return this.c;
            }

            @Nullable
            public final Long h() {
                return this.d;
            }

            public int hashCode() {
                List<e> list = this.a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                c.C0189c c0189c = this.b;
                int hashCode2 = (hashCode + (c0189c == null ? 0 : c0189c.hashCode())) * 31;
                Boolean bool = this.c;
                int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l = this.d;
                int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
                Boolean bool2 = this.e;
                int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.f;
                int hashCode6 = (hashCode5 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Integer num = this.g;
                int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.h;
                int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.i;
                int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.j;
                int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Long l2 = this.k;
                int hashCode11 = (hashCode10 + (l2 == null ? 0 : l2.hashCode())) * 31;
                f fVar = this.l;
                return hashCode11 + (fVar != null ? fVar.hashCode() : 0);
            }

            @Nullable
            public final Boolean i() {
                return this.e;
            }

            @Nullable
            public final JSONObject j() {
                return this.f;
            }

            @Nullable
            public final Integer k() {
                return this.g;
            }

            @Nullable
            public final Integer l() {
                return this.h;
            }

            @Nullable
            public final Integer m() {
                return this.i;
            }

            @Nullable
            public final JSONObject n() {
                return this.f;
            }

            @Nullable
            public final Integer o() {
                return this.j;
            }

            @Nullable
            public final Integer p() {
                return this.g;
            }

            @Nullable
            public final Long q() {
                return this.k;
            }

            @Nullable
            public final Boolean r() {
                return this.c;
            }

            @Nullable
            public final Long s() {
                return this.d;
            }

            @Nullable
            public final Integer t() {
                return this.h;
            }

            @NotNull
            public String toString() {
                List<e> list = this.a;
                c.C0189c c0189c = this.b;
                Boolean bool = this.c;
                Long l = this.d;
                Boolean bool2 = this.e;
                JSONObject jSONObject = this.f;
                Integer num = this.g;
                Integer num2 = this.h;
                Integer num3 = this.i;
                Integer num4 = this.j;
                Long l2 = this.k;
                f fVar = this.l;
                StringBuilder sb = new StringBuilder("NativeAd(placements=");
                sb.append(list);
                sb.append(", events=");
                sb.append(c0189c);
                sb.append(", collectBiddingDataAsyncEnabled=");
                sb.append(bool);
                sb.append(", collectBiddingDataTimeout=");
                sb.append(l);
                sb.append(", sharedManagersThread=");
                sb.append(bool2);
                sb.append(", adUnits=");
                sb.append(jSONObject);
                sb.append(", advancedLoading=");
                vxd.r(num, num2, ", delayLoadFailure=", ", maxNumOfAdaptersToLoadOnStart=", sb);
                vxd.r(num3, num4, ", adapterTimeOutInSeconds=", ", atim=", sb);
                sb.append(l2);
                sb.append(", providers=");
                sb.append(fVar);
                sb.append(")");
                return sb.toString();
            }

            @Nullable
            public final c.C0189c u() {
                return this.b;
            }

            @Nullable
            public final Integer v() {
                return this.i;
            }

            @Nullable
            public final f w() {
                return this.l;
            }

            @Nullable
            public final Boolean x() {
                return this.e;
            }

            public d(@Nullable List<e> list, @Nullable c.C0189c c0189c, @Nullable Boolean bool, @Nullable Long l, @Nullable Boolean bool2, @Nullable JSONObject jSONObject, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Long l2, @Nullable f fVar) {
                this.a = list;
                this.b = c0189c;
                this.c = bool;
                this.d = l;
                this.e = bool2;
                this.f = jSONObject;
                this.g = num;
                this.h = num2;
                this.i = num3;
                this.j = num4;
                this.k = l2;
                this.l = fVar;
            }

            public d() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
            }

            @NotNull
            public final d a(@Nullable List<e> list, @Nullable c.C0189c c0189c, @Nullable Boolean bool, @Nullable Long l, @Nullable Boolean bool2, @Nullable JSONObject jSONObject, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Long l2, @Nullable f fVar) {
                return new d(list, c0189c, bool, l, bool2, jSONObject, num, num2, num3, num4, l2, fVar);
            }

            @Override // com.ironsource.M3.a.InterfaceC0186a
            @Nullable
            public List<e> a() {
                return this.a;
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b {

        @Nullable
        private final Integer a;

        @Nullable
        private final String b;

        public /* synthetic */ b(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
        }

        public static /* synthetic */ b a(b bVar, Integer num, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                num = bVar.a;
            }
            if ((i & 2) != 0) {
                str = bVar.b;
            }
            return bVar.a(num, str);
        }

        @Nullable
        public final String b() {
            return this.b;
        }

        @Nullable
        public final String c() {
            return this.b;
        }

        @Nullable
        public final Integer d() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.c(this.a, bVar.a) && Intrinsics.c(this.b, bVar.b);
        }

        public int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AdQuality(initMode=" + this.a + ", adqInitBlob=" + this.b + ")";
        }

        public b(@Nullable Integer num, @Nullable String str) {
            this.a = num;
            this.b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @NotNull
        public final b a(@Nullable Integer num, @Nullable String str) {
            return new b(num, str);
        }

        @Nullable
        public final Integer a() {
            return this.a;
        }
    }

    public M3(@Nullable c cVar, @Nullable a aVar, @Nullable d dVar, @Nullable b bVar) {
        this.a = cVar;
        this.b = aVar;
        this.c = dVar;
        this.d = bVar;
    }

    @NotNull
    public final M3 a(@Nullable c cVar, @Nullable a aVar, @Nullable d dVar, @Nullable b bVar) {
        return new M3(cVar, aVar, dVar, bVar);
    }

    public M3() {
        this(null, null, null, null, 15, null);
    }

    @Nullable
    public final c a() {
        return this.a;
    }
}

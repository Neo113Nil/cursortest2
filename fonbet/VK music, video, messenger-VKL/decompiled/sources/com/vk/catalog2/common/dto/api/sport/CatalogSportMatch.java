package com.vk.catalog2.common.dto.api.sport;

import com.huawei.hms.hihealth.HiHealthActivities;
import com.vk.core.serialize.Serializer;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import org.json.JSONObject;
import xsna.aay;
import xsna.asp;
import xsna.drm0;
import xsna.epx;
import xsna.erm0;
import xsna.ho8;
import xsna.zrp;

/* compiled from: CatalogSportMatch.kt */
/* loaded from: classes16.dex */
public final class CatalogSportMatch extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogSportMatch> CREATOR = new b();
    public static final a q = new a();
    public final String b;
    public final SportsType c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Status h;
    public final String i;
    public final String j;
    public final CatalogSportsMatchTeam k;
    public final CatalogSportsMatchTeam l;
    public final CatalogSportsMatchResult m;
    public final String n;
    public final String o;
    public final String p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogSportMatch.kt */
    public static final class SportsType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SportsType[] $VALUES;
        public static final SportsType Basketball;
        public static final a Companion;
        public static final SportsType Football;
        public static final SportsType Hockey;
        public static final SportsType Tennis;
        private final String apiName;

        /* compiled from: CatalogSportMatch.kt */
        public static final class a {
            public static SportsType a(String str) {
                Object obj;
                Iterator<E> it = SportsType.i().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((SportsType) obj).h(), str)) {
                        break;
                    }
                }
                return (SportsType) obj;
            }
        }

        static {
            SportsType sportsType = new SportsType("Football", 0, "football");
            Football = sportsType;
            SportsType sportsType2 = new SportsType("Basketball", 1, HiHealthActivities.BASKETBALL);
            Basketball = sportsType2;
            SportsType sportsType3 = new SportsType("Hockey", 2, HiHealthActivities.HOCKEY);
            Hockey = sportsType3;
            SportsType sportsType4 = new SportsType("Tennis", 3, HiHealthActivities.TENNIS);
            Tennis = sportsType4;
            SportsType[] sportsTypeArr = {sportsType, sportsType2, sportsType3, sportsType4};
            $VALUES = sportsTypeArr;
            $ENTRIES = new asp(sportsTypeArr);
            Companion = new a();
        }

        public SportsType(String str, int i, String str2) {
            this.apiName = str2;
        }

        public static zrp<SportsType> i() {
            return $ENTRIES;
        }

        public static SportsType valueOf(String str) {
            return (SportsType) Enum.valueOf(SportsType.class, str);
        }

        public static SportsType[] values() {
            return (SportsType[]) $VALUES.clone();
        }

        public final String h() {
            return this.apiName;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogSportMatch.kt */
    public static final class Status {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status Canceled;
        public static final a Companion;
        public static final Status Finished;
        public static final Status InProgress;
        public static final Status Planned;
        public static final Status Result;
        private final String apiName;

        /* compiled from: CatalogSportMatch.kt */
        public static final class a {
            public static Status a(String str) {
                Object obj;
                Iterator<E> it = Status.i().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((Status) obj).h(), str)) {
                        break;
                    }
                }
                return (Status) obj;
            }
        }

        static {
            Status status = new Status("Planned", 0, "planned");
            Planned = status;
            Status status2 = new Status("Canceled", 1, "canceled");
            Canceled = status2;
            Status status3 = new Status("Finished", 2, "finished");
            Finished = status3;
            Status status4 = new Status("Result", 3, "result");
            Result = status4;
            Status status5 = new Status("InProgress", 4, "in_progress");
            InProgress = status5;
            Status[] statusArr = {status, status2, status3, status4, status5};
            $VALUES = statusArr;
            $ENTRIES = new asp(statusArr);
            Companion = new a();
        }

        public Status(String str, int i, String str2) {
            this.apiName = str2;
        }

        public static zrp<Status> i() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        public final String h() {
            return this.apiName;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogSportMatch> {
        @Override // xsna.aay
        public final CatalogSportMatch a(JSONObject jSONObject) {
            return new CatalogSportMatch(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogSportMatch> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogSportMatch a(Serializer serializer) {
            return new CatalogSportMatch(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogSportMatch[i];
        }
    }

    public CatalogSportMatch(String str, SportsType sportsType, String str2, String str3, String str4, String str5, Status status, String str6, String str7, CatalogSportsMatchTeam catalogSportsMatchTeam, CatalogSportsMatchTeam catalogSportsMatchTeam2, CatalogSportsMatchResult catalogSportsMatchResult, String str8, String str9, String str10) {
        this.b = str;
        this.c = sportsType;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = status;
        this.i = str6;
        this.j = str7;
        this.k = catalogSportsMatchTeam;
        this.l = catalogSportsMatchTeam2;
        this.m = catalogSportsMatchResult;
        this.n = str8;
        this.o = str9;
        this.p = str10;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        SportsType sportsType = this.c;
        serializer.j0(sportsType != null ? sportsType.h() : null);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        Status status = this.h;
        serializer.j0(status != null ? status.h() : null);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.i0(this.k);
        serializer.i0(this.l);
        serializer.i0(this.m);
        serializer.j0(this.n);
        serializer.j0(this.o);
        serializer.j0(this.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogSportMatch)) {
            return false;
        }
        CatalogSportMatch catalogSportMatch = (CatalogSportMatch) obj;
        return epx.f(this.b, catalogSportMatch.b) && this.c == catalogSportMatch.c && epx.f(this.d, catalogSportMatch.d) && epx.f(this.e, catalogSportMatch.e) && epx.f(this.f, catalogSportMatch.f) && epx.f(this.g, catalogSportMatch.g) && this.h == catalogSportMatch.h && epx.f(this.i, catalogSportMatch.i) && epx.f(this.j, catalogSportMatch.j) && epx.f(this.k, catalogSportMatch.k) && epx.f(this.l, catalogSportMatch.l) && epx.f(this.m, catalogSportMatch.m) && epx.f(this.n, catalogSportMatch.n) && epx.f(this.o, catalogSportMatch.o) && epx.f(this.p, catalogSportMatch.p);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        SportsType sportsType = this.c;
        int hashCode2 = (hashCode + (sportsType == null ? 0 : sportsType.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Status status = this.h;
        int hashCode7 = (hashCode6 + (status == null ? 0 : status.hashCode())) * 31;
        String str5 = this.i;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        CatalogSportsMatchTeam catalogSportsMatchTeam = this.k;
        int hashCode10 = (hashCode9 + (catalogSportsMatchTeam == null ? 0 : catalogSportsMatchTeam.hashCode())) * 31;
        CatalogSportsMatchTeam catalogSportsMatchTeam2 = this.l;
        int hashCode11 = (hashCode10 + (catalogSportsMatchTeam2 == null ? 0 : catalogSportsMatchTeam2.hashCode())) * 31;
        CatalogSportsMatchResult catalogSportsMatchResult = this.m;
        int hashCode12 = (hashCode11 + (catalogSportsMatchResult == null ? 0 : catalogSportsMatchResult.hashCode())) * 31;
        String str7 = this.n;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.o;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.p;
        return hashCode14 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogSportMatch(matchId=");
        sb.append(this.b);
        sb.append(", sportsType=");
        sb.append(this.c);
        sb.append(", tournamentId=");
        sb.append(this.d);
        sb.append(", tournamentTitle=");
        sb.append(this.e);
        sb.append(", tournamentImageUrl=");
        sb.append(this.f);
        sb.append(", championshipId=");
        sb.append(this.g);
        sb.append(", status=");
        sb.append(this.h);
        sb.append(", refereeName=");
        sb.append(this.i);
        sb.append(", locationName=");
        sb.append(this.j);
        sb.append(", team1=");
        sb.append(this.k);
        sb.append(", team2=");
        sb.append(this.l);
        sb.append(", result=");
        sb.append(this.m);
        sb.append(", startDt=");
        sb.append(this.n);
        sb.append(", tournamentUrl=");
        sb.append(this.o);
        sb.append(", matchUrl=");
        return ho8.a(sb, this.p, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogSportMatch(JSONObject jSONObject) {
        this(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, drm0.Y(r1, r2, r3, erm0.D0(3, r1.substring(r2, r3))).toString(), jSONObject.optString("tournament_url"), jSONObject.optString("match_url"));
        CatalogSportsMatchTeam catalogSportsMatchTeam;
        CatalogSportsMatchTeam catalogSportsMatchTeam2;
        String optString = jSONObject.optString("match_id");
        SportsType.a aVar = SportsType.Companion;
        String optString2 = jSONObject.optString("sports_type");
        aVar.getClass();
        SportsType a2 = SportsType.a.a(optString2);
        String optString3 = jSONObject.optString("tournament_id");
        String optString4 = jSONObject.optString("tournament_title");
        String optString5 = jSONObject.optString("tournament_image_url");
        String optString6 = jSONObject.optString("championship_id");
        Status.a aVar2 = Status.Companion;
        String optString7 = jSONObject.optString("status");
        aVar2.getClass();
        Status a3 = Status.a.a(optString7);
        String optString8 = jSONObject.optString("referee_name");
        String optString9 = jSONObject.optString("location_name");
        JSONObject optJSONObject = jSONObject.optJSONObject("team1");
        CatalogSportsMatchResult catalogSportsMatchResult = null;
        if (optJSONObject != null) {
            CatalogSportsMatchTeam.e.getClass();
            catalogSportsMatchTeam = new CatalogSportsMatchTeam(optJSONObject);
        } else {
            catalogSportsMatchTeam = null;
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("team2");
        if (optJSONObject2 != null) {
            CatalogSportsMatchTeam.e.getClass();
            catalogSportsMatchTeam2 = new CatalogSportsMatchTeam(optJSONObject2);
        } else {
            catalogSportsMatchTeam2 = null;
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("result");
        if (optJSONObject3 != null) {
            CatalogSportsMatchResult.g.getClass();
            catalogSportsMatchResult = new CatalogSportsMatchResult(optJSONObject3);
        }
        CatalogSportsMatchResult catalogSportsMatchResult2 = catalogSportsMatchResult;
        String format = ZonedDateTime.parse(jSONObject.optString("start_dt")).format(DateTimeFormatter.ofPattern("dd MMM yyyy\nHH:mm"));
        int L = drm0.L(format, ' ', 0, 6) + 1;
        int L2 = drm0.L(format, ' ', L, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogSportMatch(Serializer serializer) {
        this(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r0 == null ? "" : r0);
        String H = serializer.H();
        String str = H == null ? "" : H;
        SportsType.a aVar = SportsType.Companion;
        String H2 = serializer.H();
        aVar.getClass();
        SportsType a2 = SportsType.a.a(H2);
        String H3 = serializer.H();
        String str2 = H3 == null ? "" : H3;
        String H4 = serializer.H();
        String str3 = H4 == null ? "" : H4;
        String H5 = serializer.H();
        String str4 = H5 == null ? "" : H5;
        String H6 = serializer.H();
        String str5 = H6 == null ? "" : H6;
        Status.a aVar2 = Status.Companion;
        String H7 = serializer.H();
        aVar2.getClass();
        Status a3 = Status.a.a(H7);
        String H8 = serializer.H();
        String str6 = H8 == null ? "" : H8;
        String H9 = serializer.H();
        String str7 = H9 == null ? "" : H9;
        CatalogSportsMatchTeam catalogSportsMatchTeam = (CatalogSportsMatchTeam) serializer.G(CatalogSportsMatchTeam.class.getClassLoader());
        CatalogSportsMatchTeam catalogSportsMatchTeam2 = (CatalogSportsMatchTeam) serializer.G(CatalogSportsMatchTeam.class.getClassLoader());
        CatalogSportsMatchResult catalogSportsMatchResult = (CatalogSportsMatchResult) serializer.G(CatalogSportsMatchResult.class.getClassLoader());
        String H10 = serializer.H();
        String str8 = H10 == null ? "" : H10;
        String H11 = serializer.H();
        String str9 = H11 == null ? "" : H11;
        String H12 = serializer.H();
    }
}

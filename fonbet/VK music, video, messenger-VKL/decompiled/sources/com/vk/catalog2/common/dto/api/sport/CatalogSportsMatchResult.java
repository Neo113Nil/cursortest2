package com.vk.catalog2.common.dto.api.sport;

import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import java.util.Iterator;
import org.json.JSONObject;
import xsna.aay;
import xsna.asp;
import xsna.epx;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatalogSportsMatchResult.kt */
/* loaded from: classes16.dex */
public final class CatalogSportsMatchResult extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogSportsMatchResult> CREATOR = new b();
    public static final a g = new a();
    public final Stage b;
    public final Integer c;
    public final Integer d;
    public final CatalogSportsMatchResultTeam e;
    public final CatalogSportsMatchResultTeam f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogSportsMatchResult.kt */
    public static final class Stage {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Stage[] $VALUES;
        public static final Stage AfterMatchPenalties;
        public static final Stage AwardedWin;
        public static final Stage Canceled;
        public static final a Companion;
        public static final Stage ExtraTime;
        public static final Stage FirstHalf;
        public static final Stage FullTime;
        public static final Stage HalfTime;
        public static final Stage MatchResultAfterExtraTime;
        public static final Stage MatchResultAfterPenalties;
        public static final Stage NotInfoYet;
        public static final Stage NotStarted;
        public static final Stage Period1;
        public static final Stage Period1End;
        public static final Stage Period2;
        public static final Stage Period2End;
        public static final Stage Period3;
        public static final Stage Period3End;
        public static final Stage Postponed;
        public static final Stage Quarter1;
        public static final Stage Quarter1End;
        public static final Stage Quarter2;
        public static final Stage Quarter2End;
        public static final Stage Quarter3;
        public static final Stage Quarter3End;
        public static final Stage Quarter4;
        public static final Stage Quarter4End;
        public static final Stage RainDelay;
        public static final Stage Result;
        public static final Stage Retired;
        public static final Stage SecondHalf;
        public static final Stage Set1;
        public static final Stage Set2;
        public static final Stage Set3;
        public static final Stage Set4;
        public static final Stage Set5;
        public static final Stage Suspended;
        public static final Stage ToBeFinished;
        private final String apiName;

        /* compiled from: CatalogSportsMatchResult.kt */
        public static final class a {
            public static Stage a(String str) {
                Object obj;
                Iterator<E> it = Stage.i().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((Stage) obj).h(), str)) {
                        break;
                    }
                }
                return (Stage) obj;
            }
        }

        static {
            Stage stage = new Stage("NotStarted", 0, "not_started");
            NotStarted = stage;
            Stage stage2 = new Stage("Postponed", 1, "postponed");
            Postponed = stage2;
            Stage stage3 = new Stage("Suspended", 2, "suspended");
            Suspended = stage3;
            Stage stage4 = new Stage("NotInfoYet", 3, "not_info_yet");
            NotInfoYet = stage4;
            Stage stage5 = new Stage("AwardedWin", 4, "awarded_win");
            AwardedWin = stage5;
            Stage stage6 = new Stage("Canceled", 5, "canceled");
            Canceled = stage6;
            Stage stage7 = new Stage("ExtraTime", 6, "extra_time");
            ExtraTime = stage7;
            Stage stage8 = new Stage("MatchResultAfterExtraTime", 7, "match_result_after_extra_time");
            MatchResultAfterExtraTime = stage8;
            Stage stage9 = new Stage("FullTime", 8, "full_time");
            FullTime = stage9;
            Stage stage10 = new Stage("FirstHalf", 9, "first_half");
            FirstHalf = stage10;
            Stage stage11 = new Stage("HalfTime", 10, "half_time");
            HalfTime = stage11;
            Stage stage12 = new Stage("SecondHalf", 11, "second_half");
            SecondHalf = stage12;
            Stage stage13 = new Stage("AfterMatchPenalties", 12, "after_match_penalties");
            AfterMatchPenalties = stage13;
            Stage stage14 = new Stage("MatchResultAfterPenalties", 13, "match_result_after_penalties");
            MatchResultAfterPenalties = stage14;
            Stage stage15 = new Stage("Quarter1", 14, "quarter_1");
            Quarter1 = stage15;
            Stage stage16 = new Stage("Quarter1End", 15, "quarter_1_end");
            Quarter1End = stage16;
            Stage stage17 = new Stage("Quarter2", 16, "quarter_2");
            Quarter2 = stage17;
            Stage stage18 = new Stage("Quarter2End", 17, "quarter_2_end");
            Quarter2End = stage18;
            Stage stage19 = new Stage("Quarter3", 18, "quarter_3");
            Quarter3 = stage19;
            Stage stage20 = new Stage("Quarter3End", 19, "quarter_3_end");
            Quarter3End = stage20;
            Stage stage21 = new Stage("Quarter4", 20, "quarter_4");
            Quarter4 = stage21;
            Stage stage22 = new Stage("Quarter4End", 21, "quarter_4_end");
            Quarter4End = stage22;
            Stage stage23 = new Stage("Period1", 22, "period_1");
            Period1 = stage23;
            Stage stage24 = new Stage("Period1End", 23, "period_1_end");
            Period1End = stage24;
            Stage stage25 = new Stage("Period2", 24, "period_2");
            Period2 = stage25;
            Stage stage26 = new Stage("Period2End", 25, "period_2_end");
            Period2End = stage26;
            Stage stage27 = new Stage("Period3", 26, "period_3");
            Period3 = stage27;
            Stage stage28 = new Stage("Period3End", 27, "period_3_end");
            Period3End = stage28;
            Stage stage29 = new Stage("Set1", 28, "set_1");
            Set1 = stage29;
            Stage stage30 = new Stage("Set2", 29, "set_2");
            Set2 = stage30;
            Stage stage31 = new Stage("Set3", 30, "set_3");
            Set3 = stage31;
            Stage stage32 = new Stage("Set4", 31, "set_4");
            Set4 = stage32;
            Stage stage33 = new Stage("Set5", 32, "set_5");
            Set5 = stage33;
            Stage stage34 = new Stage("Result", 33, "result");
            Result = stage34;
            Stage stage35 = new Stage("Retired", 34, "retired");
            Retired = stage35;
            Stage stage36 = new Stage("RainDelay", 35, "rain_delay");
            RainDelay = stage36;
            Stage stage37 = new Stage("ToBeFinished", 36, "to_be_finished");
            ToBeFinished = stage37;
            Stage[] stageArr = {stage, stage2, stage3, stage4, stage5, stage6, stage7, stage8, stage9, stage10, stage11, stage12, stage13, stage14, stage15, stage16, stage17, stage18, stage19, stage20, stage21, stage22, stage23, stage24, stage25, stage26, stage27, stage28, stage29, stage30, stage31, stage32, stage33, stage34, stage35, stage36, stage37};
            $VALUES = stageArr;
            $ENTRIES = new asp(stageArr);
            Companion = new a();
        }

        public Stage(String str, int i, String str2) {
            this.apiName = str2;
        }

        public static zrp<Stage> i() {
            return $ENTRIES;
        }

        public static Stage valueOf(String str) {
            return (Stage) Enum.valueOf(Stage.class, str);
        }

        public static Stage[] values() {
            return (Stage[]) $VALUES.clone();
        }

        public final String h() {
            return this.apiName;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogSportsMatchResult> {
        @Override // xsna.aay
        public final CatalogSportsMatchResult a(JSONObject jSONObject) {
            return new CatalogSportsMatchResult(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogSportsMatchResult> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogSportsMatchResult a(Serializer serializer) {
            return new CatalogSportsMatchResult(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogSportsMatchResult[i];
        }
    }

    public CatalogSportsMatchResult() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        Stage stage = this.b;
        serializer.j0(stage != null ? stage.h() : null);
        serializer.V(this.c);
        serializer.V(this.d);
        serializer.i0(this.e);
        serializer.i0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogSportsMatchResult)) {
            return false;
        }
        CatalogSportsMatchResult catalogSportsMatchResult = (CatalogSportsMatchResult) obj;
        return this.b == catalogSportsMatchResult.b && epx.f(this.c, catalogSportsMatchResult.c) && epx.f(this.d, catalogSportsMatchResult.d) && epx.f(this.e, catalogSportsMatchResult.e) && epx.f(this.f, catalogSportsMatchResult.f);
    }

    public final int hashCode() {
        Stage stage = this.b;
        int hashCode = (stage == null ? 0 : stage.hashCode()) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        CatalogSportsMatchResultTeam catalogSportsMatchResultTeam = this.e;
        int hashCode4 = (hashCode3 + (catalogSportsMatchResultTeam == null ? 0 : catalogSportsMatchResultTeam.hashCode())) * 31;
        CatalogSportsMatchResultTeam catalogSportsMatchResultTeam2 = this.f;
        return hashCode4 + (catalogSportsMatchResultTeam2 != null ? catalogSportsMatchResultTeam2.hashCode() : 0);
    }

    public final String toString() {
        return "CatalogSportsMatchResult(stage=" + this.b + ", minute=" + this.c + ", extraMinute=" + this.d + ", team1=" + this.e + ", team2=" + this.f + ')';
    }

    public /* synthetic */ CatalogSportsMatchResult(Stage stage, Integer num, Integer num2, CatalogSportsMatchResultTeam catalogSportsMatchResultTeam, CatalogSportsMatchResultTeam catalogSportsMatchResultTeam2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : stage, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : catalogSportsMatchResultTeam, (i & 16) != 0 ? null : catalogSportsMatchResultTeam2);
    }

    public CatalogSportsMatchResult(Stage stage, Integer num, Integer num2, CatalogSportsMatchResultTeam catalogSportsMatchResultTeam, CatalogSportsMatchResultTeam catalogSportsMatchResultTeam2) {
        this.b = stage;
        this.c = num;
        this.d = num2;
        this.e = catalogSportsMatchResultTeam;
        this.f = catalogSportsMatchResultTeam2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogSportsMatchResult(JSONObject jSONObject) {
        this(r3, r4, r5, r6, r1);
        CatalogSportsMatchResultTeam catalogSportsMatchResultTeam;
        Stage.a aVar = Stage.Companion;
        String optString = jSONObject.optString(X3.i.q);
        aVar.getClass();
        Stage a2 = Stage.a.a(optString);
        Integer valueOf = Integer.valueOf(jSONObject.optInt("minute"));
        Integer valueOf2 = Integer.valueOf(jSONObject.optInt("extra_minute", -1));
        JSONObject optJSONObject = jSONObject.optJSONObject("team1");
        CatalogSportsMatchResultTeam catalogSportsMatchResultTeam2 = null;
        if (optJSONObject != null) {
            CatalogSportsMatchResultTeam.c.getClass();
            catalogSportsMatchResultTeam = new CatalogSportsMatchResultTeam(optJSONObject);
        } else {
            catalogSportsMatchResultTeam = null;
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("team2");
        if (optJSONObject2 != null) {
            CatalogSportsMatchResultTeam.c.getClass();
            catalogSportsMatchResultTeam2 = new CatalogSportsMatchResultTeam(optJSONObject2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogSportsMatchResult(Serializer serializer) {
        this(Stage.a.a(r1), Integer.valueOf(serializer.u()), serializer.v(), (CatalogSportsMatchResultTeam) serializer.G(CatalogSportsMatchResultTeam.class.getClassLoader()), (CatalogSportsMatchResultTeam) serializer.G(CatalogSportsMatchResultTeam.class.getClassLoader()));
        Stage.a aVar = Stage.Companion;
        String H = serializer.H();
        aVar.getClass();
    }
}

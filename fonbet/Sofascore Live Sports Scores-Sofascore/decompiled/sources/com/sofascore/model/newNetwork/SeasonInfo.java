package com.sofascore.model.newNetwork;

import com.sofascore.model.Money;
import com.sofascore.model.Money$$serializer;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Season$$serializer;
import com.sofascore.model.mvvm.model.Team;
import defpackage.a7a;
import defpackage.dtg;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b&\b\u0007\u0018\u0000 I2\u00020\u0001:\u0002JIBÍ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001a\u0010\u001bBë\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ'\u0010(\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u00101R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b2\u00101R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b3\u00101R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b4\u00101R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b5\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\b<\u0010;R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u00109\u001a\u0004\b=\u0010;R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b>\u0010;R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u00109\u001a\u0004\b?\u0010;R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u00109\u001a\u0004\b@\u0010;R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u00109\u001a\u0004\bA\u0010;R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u00109\u001a\u0004\bE\u0010;R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010F\u001a\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lcom/sofascore/model/newNetwork/SeasonInfo;", "Ljava/io/Serializable;", "", "id", "Lcom/sofascore/model/mvvm/model/Season;", TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, "", "", "hostCountries", "hostCities", "Lcom/sofascore/model/mvvm/model/Team;", "newcomersUpperDivision", "newcomersLowerDivision", "newcomersOther", "Lcom/sofascore/model/Money;", "totalPrizeMoneyRaw", "numberOfCompetitors", "goals", "homeTeamWins", "awayTeamWins", "draws", "yellowCards", "redCards", "tier", "numberOfRounds", "winner", "<init>", "(ILcom/sofascore/model/mvvm/model/Season;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/sofascore/model/Money;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Team;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/mvvm/model/Season;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/sofascore/model/Money;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Team;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/SeasonInfo;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "()I", "Lcom/sofascore/model/mvvm/model/Season;", "getSeason", "()Lcom/sofascore/model/mvvm/model/Season;", "Ljava/util/List;", "getHostCountries", "()Ljava/util/List;", "getHostCities", "getNewcomersUpperDivision", "getNewcomersLowerDivision", "getNewcomersOther", "Lcom/sofascore/model/Money;", "getTotalPrizeMoneyRaw", "()Lcom/sofascore/model/Money;", "Ljava/lang/Integer;", "getNumberOfCompetitors", "()Ljava/lang/Integer;", "getGoals", "getHomeTeamWins", "getAwayTeamWins", "getDraws", "getYellowCards", "getRedCards", "Ljava/lang/String;", "getTier", "()Ljava/lang/String;", "getNumberOfRounds", "Lcom/sofascore/model/mvvm/model/Team;", "getWinner", "()Lcom/sofascore/model/mvvm/model/Team;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SeasonInfo implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer awayTeamWins;

    @Nullable
    private final Integer draws;

    @Nullable
    private final Integer goals;

    @Nullable
    private final Integer homeTeamWins;

    @Nullable
    private final List<String> hostCities;

    @NotNull
    private final List<String> hostCountries;
    private final int id;

    @NotNull
    private final List<Team> newcomersLowerDivision;

    @NotNull
    private final List<Team> newcomersOther;

    @NotNull
    private final List<Team> newcomersUpperDivision;

    @Nullable
    private final Integer numberOfCompetitors;

    @Nullable
    private final Integer numberOfRounds;

    @Nullable
    private final Integer redCards;

    @NotNull
    private final Season season;

    @Nullable
    private final String tier;

    @Nullable
    private final Money totalPrizeMoneyRaw;

    @Nullable
    private final Team winner;

    @Nullable
    private final Integer yellowCards;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, ypa.a(ysaVar, new dtg(14)), ypa.a(ysaVar, new dtg(15)), ypa.a(ysaVar, new dtg(16)), ypa.a(ysaVar, new dtg(17)), ypa.a(ysaVar, new dtg(18)), null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new dtg(19))};
    }

    public /* synthetic */ SeasonInfo(int i, int i2, Season season, List list, List list2, List list3, List list4, List list5, Money money, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str, Integer num8, Team team, t5h t5hVar) {
        if (262143 != (i & 262143)) {
            oea.z(i, 262143, SeasonInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.season = season;
        this.hostCountries = list;
        this.hostCities = list2;
        this.newcomersUpperDivision = list3;
        this.newcomersLowerDivision = list4;
        this.newcomersOther = list5;
        this.totalPrizeMoneyRaw = money;
        this.numberOfCompetitors = num;
        this.goals = num2;
        this.homeTeamWins = num3;
        this.awayTeamWins = num4;
        this.draws = num5;
        this.yellowCards = num6;
        this.redCards = num7;
        this.tier = str;
        this.numberOfRounds = num8;
        this.winner = team;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(uhi.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(uhi.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(Team.INSTANCE.serializer(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(Team.INSTANCE.serializer(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(Team.INSTANCE.serializer(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return Team.INSTANCE.serializer();
    }

    public static final /* synthetic */ void write$Self$model_release(SeasonInfo self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.f(serialDesc, 1, Season$$serializer.INSTANCE, self.season);
        output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.hostCountries);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.hostCities);
        output.f(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.newcomersUpperDivision);
        output.f(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.newcomersLowerDivision);
        output.f(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.newcomersOther);
        output.h(serialDesc, 7, Money$$serializer.INSTANCE, self.totalPrizeMoneyRaw);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 8, a7aVar, self.numberOfCompetitors);
        output.h(serialDesc, 9, a7aVar, self.goals);
        output.h(serialDesc, 10, a7aVar, self.homeTeamWins);
        output.h(serialDesc, 11, a7aVar, self.awayTeamWins);
        output.h(serialDesc, 12, a7aVar, self.draws);
        output.h(serialDesc, 13, a7aVar, self.yellowCards);
        output.h(serialDesc, 14, a7aVar, self.redCards);
        output.h(serialDesc, 15, uhi.a, self.tier);
        output.h(serialDesc, 16, a7aVar, self.numberOfRounds);
        output.h(serialDesc, 17, (KSerializer) joaVarArr[17].getValue(), self.winner);
    }

    @Nullable
    public final Integer getAwayTeamWins() {
        return this.awayTeamWins;
    }

    @Nullable
    public final Integer getDraws() {
        return this.draws;
    }

    @Nullable
    public final Integer getGoals() {
        return this.goals;
    }

    @Nullable
    public final Integer getHomeTeamWins() {
        return this.homeTeamWins;
    }

    @Nullable
    public final List<String> getHostCities() {
        return this.hostCities;
    }

    @NotNull
    public final List<String> getHostCountries() {
        return this.hostCountries;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final List<Team> getNewcomersLowerDivision() {
        return this.newcomersLowerDivision;
    }

    @NotNull
    public final List<Team> getNewcomersOther() {
        return this.newcomersOther;
    }

    @NotNull
    public final List<Team> getNewcomersUpperDivision() {
        return this.newcomersUpperDivision;
    }

    @Nullable
    public final Integer getNumberOfCompetitors() {
        return this.numberOfCompetitors;
    }

    @Nullable
    public final Integer getNumberOfRounds() {
        return this.numberOfRounds;
    }

    @Nullable
    public final Integer getRedCards() {
        return this.redCards;
    }

    @NotNull
    public final Season getSeason() {
        return this.season;
    }

    @Nullable
    public final String getTier() {
        return this.tier;
    }

    @Nullable
    public final Money getTotalPrizeMoneyRaw() {
        return this.totalPrizeMoneyRaw;
    }

    @Nullable
    public final Team getWinner() {
        return this.winner;
    }

    @Nullable
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/SeasonInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/SeasonInfo;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SeasonInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SeasonInfo(int i, @NotNull Season season, @NotNull List<String> list, @Nullable List<String> list2, @NotNull List<Team> list3, @NotNull List<Team> list4, @NotNull List<Team> list5, @Nullable Money money, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable String str, @Nullable Integer num8, @Nullable Team team) {
        season.getClass();
        list.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        this.id = i;
        this.season = season;
        this.hostCountries = list;
        this.hostCities = list2;
        this.newcomersUpperDivision = list3;
        this.newcomersLowerDivision = list4;
        this.newcomersOther = list5;
        this.totalPrizeMoneyRaw = money;
        this.numberOfCompetitors = num;
        this.goals = num2;
        this.homeTeamWins = num3;
        this.awayTeamWins = num4;
        this.draws = num5;
        this.yellowCards = num6;
        this.redCards = num7;
        this.tier = str;
        this.numberOfRounds = num8;
        this.winner = team;
    }
}

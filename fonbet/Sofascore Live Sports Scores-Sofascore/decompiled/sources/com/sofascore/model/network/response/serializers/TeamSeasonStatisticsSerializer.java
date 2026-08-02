package com.sofascore.model.network.response.serializers;

import com.ironsource.U3;
import com.sofascore.model.Sports;
import com.sofascore.model.newNetwork.statistics.season.team.BasketballRankedStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.BasketballTeamSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.FootballTeamSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.FutsalTeamSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.RugbyTeamSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatisticsResponse;
import com.sofascore.model.newNetwork.statistics.season.team.TennisTeamSeasonStatistics;
import com.sofascore.model.newNetwork.topperformance.StatisticsType;
import defpackage.a70;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.km5;
import defpackage.l98;
import defpackage.m5h;
import defpackage.mfa;
import defpackage.nii;
import defpackage.ph0;
import defpackage.qfa;
import defpackage.vfa;
import defpackage.vv2;
import defpackage.yea;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/sofascore/model/network/response/serializers/TeamSeasonStatisticsSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatisticsResponse;", "Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatistics;", "<init>", "()V", "Lcom/sofascore/model/newNetwork/topperformance/StatisticsType;", "statisticsType", "Ldy4;", "selectDeserializer", "(Lcom/sofascore/model/newNetwork/topperformance/StatisticsType;)Ldy4;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatisticsResponse;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatisticsResponse;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TeamSeasonStatisticsSerializer implements KSerializer {

    @NotNull
    private final SerialDescriptor descriptor;

    public TeamSeasonStatisticsSerializer() {
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        if (StringsKt.R("TeamSeasonStatisticsResponse")) {
            a70.p("Blank serial names are prohibited");
            throw null;
        }
        vv2 vv2Var = new vv2("TeamSeasonStatisticsResponse");
        descriptor$lambda$0(vv2Var);
        this.descriptor = new m5h("TeamSeasonStatisticsResponse", nii.f, vv2Var.c.size(), ph0.X(serialDescriptorArr), vv2Var);
    }

    private static final Unit descriptor$lambda$0(vv2 vv2Var) {
        vv2Var.getClass();
        km5 km5Var = km5.a;
        vv2Var.a(TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, b.Companion.serializer().getDescriptor(), km5Var, false);
        a7a a7aVar = a7a.a;
        vv2Var.a("teamCount", l98.W(a7aVar).getDescriptor(), km5Var, true);
        vv2Var.a("matches", l98.W(a7aVar).getDescriptor(), km5Var, true);
        vv2Var.a("awardedMatches", l98.W(a7aVar).getDescriptor(), km5Var, true);
        vv2Var.a("statisticsType", StatisticsType.INSTANCE.serializer().getDescriptor(), km5Var, false);
        return Unit.a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    private final dy4 selectDeserializer(StatisticsType statisticsType) {
        String sportSlug = statisticsType.getSportSlug();
        String statisticsType2 = statisticsType.getStatisticsType();
        switch (sportSlug.hashCode()) {
            case -1263172551:
                if (sportSlug.equals(Sports.FUTSAL)) {
                    return FutsalTeamSeasonStatistics.INSTANCE.serializer();
                }
                break;
            case -877324069:
                if (sportSlug.equals(Sports.TENNIS)) {
                    return TennisTeamSeasonStatistics.INSTANCE.serializer();
                }
                break;
            case 108869083:
                if (sportSlug.equals(Sports.RUGBY)) {
                    return RugbyTeamSeasonStatistics.INSTANCE.serializer();
                }
                break;
            case 394668909:
                if (sportSlug.equals(Sports.FOOTBALL)) {
                    return FootballTeamSeasonStatistics.INSTANCE.serializer();
                }
                break;
            case 727149765:
                if (sportSlug.equals(Sports.BASKETBALL)) {
                    return Intrinsics.c(statisticsType2, TopPerformanceResponseSerializerKt.TYPE_TEAMS_RANKED) ? BasketballRankedStatistics.INSTANCE.serializer() : BasketballTeamSeasonStatistics.INSTANCE.serializer();
                }
                break;
        }
        throw new IllegalStateException(("Unknown TeamSeasonStatisticsKSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
    }

    @Override // defpackage.dy4
    @NotNull
    public TeamSeasonStatisticsResponse<TeamSeasonStatistics> deserialize(@NotNull Decoder decoder) {
        b bVar;
        StatisticsType statisticsType;
        decoder.getClass();
        if (!(decoder instanceof mfa)) {
            a70.p("This serializer only works with JSON");
            return null;
        }
        mfa mfaVar = (mfa) decoder;
        c g = qfa.g(mfaVar.j());
        if (g.containsKey(TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS)) {
            Object obj = g.get(TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS);
            obj.getClass();
            bVar = (b) obj;
        } else {
            if (!g.containsKey(TeamSeasonStatisticsSerializerKt.PROPERTY_RANKS)) {
                a70.r("JSON must contain one of: statistics or ranks");
                return null;
            }
            Object obj2 = g.get(TeamSeasonStatisticsSerializerKt.PROPERTY_RANKS);
            obj2.getClass();
            bVar = (b) obj2;
        }
        b bVar2 = (b) g.get("statisticsType");
        if (bVar2 == null || (statisticsType = (StatisticsType) mfaVar.d().a(StatisticsType.INSTANCE.serializer(), bVar2)) == null) {
            b bVar3 = (b) qfa.g(bVar).get("statisticsType");
            if (bVar3 == null) {
                a70.p("statisticsType is required");
                return null;
            }
            statisticsType = (StatisticsType) mfaVar.d().a(StatisticsType.INSTANCE.serializer(), bVar3);
        }
        StatisticsType statisticsType2 = statisticsType;
        TeamSeasonStatistics teamSeasonStatistics = (TeamSeasonStatistics) mfaVar.d().a(selectDeserializer(statisticsType2), bVar);
        b bVar4 = (b) g.get("teamCount");
        Integer f = bVar4 != null ? qfa.f(qfa.h(bVar4)) : null;
        b bVar5 = (b) g.get("matches");
        Integer f2 = bVar5 != null ? qfa.f(qfa.h(bVar5)) : null;
        b bVar6 = (b) g.get("awardedMatches");
        return new TeamSeasonStatisticsResponse<>(teamSeasonStatistics, f, f2, bVar6 != null ? qfa.f(qfa.h(bVar6)) : null, statisticsType2);
    }

    @Override // defpackage.dy4
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @NotNull TeamSeasonStatisticsResponse<TeamSeasonStatistics> value) {
        encoder.getClass();
        value.getClass();
        if (!(encoder instanceof vfa)) {
            a70.p("This serializer only works with JSON");
            return;
        }
        dy4 selectDeserializer = selectDeserializer(value.getStatisticsType());
        selectDeserializer.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        vfa vfaVar = (vfa) encoder;
        yea d = vfaVar.d();
        TeamSeasonStatistics statistics = value.getStatistics();
        d.getClass();
        Integer teamCount = value.getTeamCount();
        if (teamCount != null) {
            d b = qfa.b(Integer.valueOf(teamCount.intValue()));
            b.getClass();
        }
        Integer matches = value.getMatches();
        if (matches != null) {
            d b2 = qfa.b(Integer.valueOf(matches.intValue()));
            b2.getClass();
        }
        Integer awardedMatches = value.getAwardedMatches();
        if (awardedMatches != null) {
            d b3 = qfa.b(Integer.valueOf(awardedMatches.intValue()));
            b3.getClass();
        }
        yea d2 = vfaVar.d();
        KSerializer serializer = StatisticsType.INSTANCE.serializer();
        StatisticsType statisticsType = value.getStatisticsType();
        d2.getClass();
        serializer.getClass();
        vfaVar.z(new c(linkedHashMap));
    }
}

package com.sofascore.model.network.response.serializers;

import com.ironsource.U3;
import com.sofascore.model.newNetwork.topperformance.StatisticsType;
import com.sofascore.model.newNetwork.topperformance.TopPerformanceResponse;
import com.sofascore.model.newNetwork.topperformance.response.AmericanFootballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.BaseballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.BaseballTopStatsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.BasketballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.BasketballTopStatsPerGameStatistics;
import com.sofascore.model.newNetwork.topperformance.response.BasketballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.CricketTopPlayerStatistics;
import com.sofascore.model.newNetwork.topperformance.response.FootballTopStatsPerGameStatistics;
import com.sofascore.model.newNetwork.topperformance.response.FootballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.FutsalTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.FutsalTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.HandballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.HandballTopStatsPerGameStatistics;
import com.sofascore.model.newNetwork.topperformance.response.HandballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.IceHockeyTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.IceHockeyTopStatsPerGameStatistics;
import com.sofascore.model.newNetwork.topperformance.response.IceHockeyTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.RugbyTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.RugbyTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.TennisTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.TopPerformanceStatistics;
import com.sofascore.model.newNetwork.topperformance.response.VolleyballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.VolleyballTopStatsPerGameStatistics;
import com.sofascore.model.newNetwork.topperformance.response.VolleyballTopTeamsStatistics;
import defpackage.a70;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.km5;
import defpackage.m5h;
import defpackage.mfa;
import defpackage.nii;
import defpackage.ph0;
import defpackage.qfa;
import defpackage.vfa;
import defpackage.vv2;
import defpackage.wv8;
import defpackage.yea;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement$Companion;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/sofascore/model/network/response/serializers/TopPerformanceResponseSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/TopPerformanceResponse;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "<init>", "()V", "Lcom/sofascore/model/newNetwork/topperformance/StatisticsType;", "statisticsType", "Ldy4;", "selectDeserializer", "(Lcom/sofascore/model/newNetwork/topperformance/StatisticsType;)Ldy4;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/topperformance/TopPerformanceResponse;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/topperformance/TopPerformanceResponse;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TopPerformanceResponseSerializer implements KSerializer {

    @NotNull
    private final SerialDescriptor descriptor;

    public TopPerformanceResponseSerializer() {
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        if (StringsKt.R("TopPerformanceResponse")) {
            a70.p("Blank serial names are prohibited");
            throw null;
        }
        vv2 vv2Var = new vv2("TopPerformanceResponse");
        descriptor$lambda$0(vv2Var);
        this.descriptor = new m5h("TopPerformanceResponse", nii.f, vv2Var.c.size(), ph0.X(serialDescriptorArr), vv2Var);
    }

    private static final Unit descriptor$lambda$0(vv2 vv2Var) {
        vv2Var.getClass();
        km5 km5Var = km5.a;
        JsonElement$Companion jsonElement$Companion = b.Companion;
        vv2Var.a("topPerformanceItems", jsonElement$Companion.serializer().getDescriptor(), km5Var, false);
        gz1 gz1Var = gz1.a;
        vv2Var.a("playerOfTheTournament", gz1.b, km5Var, false);
        vv2Var.a("ineligibleTopPlayers", jsonElement$Companion.serializer().getDescriptor(), km5Var, false);
        vv2Var.a("statisticsType", StatisticsType.INSTANCE.serializer().getDescriptor(), km5Var, false);
        return Unit.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        if (r1.equals("minifootball_player") != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010e, code lost:
    
        return com.sofascore.model.newNetwork.topperformance.response.FootballTopPlayersStatistics.INSTANCE.serializer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0104, code lost:
    
        if (r1.equals("football_player") != false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final dy4 selectDeserializer(StatisticsType statisticsType) {
        String sportSlug = statisticsType.getSportSlug();
        String statisticsType2 = statisticsType.getStatisticsType();
        String i = wv8.i(sportSlug, "_", statisticsType2);
        switch (i.hashCode()) {
            case -2067445705:
                if (i.equals("ice-hockey_team")) {
                    return IceHockeyTopTeamsStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            case -1697500509:
                if (i.equals("futsal_team")) {
                    return FutsalTopTeamsStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            case -1697070384:
                if (i.equals("volleyball_team")) {
                    return VolleyballTopTeamsStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            case -1394592959:
                if (i.equals("tennis_team")) {
                    return TennisTopTeamsStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            case -1281216588:
                if (i.equals("football_player.perGame")) {
                    return FootballTopStatsPerGameStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            case -871502865:
                if (i.equals("football_team")) {
                    return FootballTopTeamsStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            case -814490511:
                if (i.equals("baseball_player.perGame")) {
                    return BaseballTopStatsStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            case -372598446:
                if (i.equals("handball_player")) {
                    return HandballTopPlayersStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            case -200818281:
                if (i.equals("basketball_team")) {
                    return BasketballTopTeamsStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            case -148171940:
                if (i.equals("basketball_player.perGame")) {
                    return BasketballTopStatsPerGameStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            case -103667725:
                break;
            case 92087749:
                if (i.equals("rugby_player")) {
                    return RugbyTopPlayersStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            case 179123099:
                if (i.equals("basketball_player")) {
                    return BasketballTopPlayersStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            case 294931526:
                if (i.equals("american-football_player")) {
                    return AmericanFootballTopPlayersStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            case 408592725:
                if (i.equals("volleyball_player.perGame")) {
                    return VolleyballTopStatsPerGameStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            case 681546151:
                if (i.equals("futsal_player")) {
                    return FutsalTopPlayersStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            case 1094896276:
                if (i.equals("volleyball_player")) {
                    return VolleyballTopPlayersStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            case 1143525884:
                if (i.equals("ice-hockey_player.perGame")) {
                    return IceHockeyTopStatsPerGameStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            case 1493494460:
                break;
            case 1574228719:
                if (i.equals("cricket_player")) {
                    return CricketTopPlayerStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            case 1646498363:
                if (i.equals("ice-hockey_player")) {
                    return IceHockeyTopPlayersStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            case 1675700494:
                if (i.equals("handball_team")) {
                    return HandballTopTeamsStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            case 1711198739:
                if (i.equals("handball_player.perGame")) {
                    return HandballTopStatsPerGameStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            case 1805792833:
                if (i.equals("rugby_team")) {
                    return RugbyTopTeamsStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            case 2129060272:
                if (i.equals("baseball_player")) {
                    return BaseballTopPlayersStatistics.INSTANCE.serializer();
                }
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
            default:
                throw new IllegalStateException(("Unknown TopPerformanceStatisticsSerializer statisticsType = " + sportSlug + "_" + statisticsType2).toString());
        }
    }

    @Override // defpackage.dy4
    @NotNull
    public TopPerformanceResponse<TopPerformanceStatistics> deserialize(@NotNull Decoder decoder) {
        StatisticsType statisticsType;
        b bVar;
        Boolean e;
        decoder.getClass();
        TopPerformanceStatistics topPerformanceStatistics = null;
        if (!(decoder instanceof mfa)) {
            a70.p("This serializer only works with JSON");
            return null;
        }
        mfa mfaVar = (mfa) decoder;
        c g = qfa.g(mfaVar.j());
        b bVar2 = (b) g.get("statisticsType");
        if (bVar2 == null || (statisticsType = (StatisticsType) mfaVar.d().a(StatisticsType.INSTANCE.serializer(), bVar2)) == null) {
            a70.p("statisticsType is required");
            return null;
        }
        if (g.containsKey(TopPerformanceResponseSerializerKt.PROPERTY_TOP_TEAMS)) {
            Object obj = g.get(TopPerformanceResponseSerializerKt.PROPERTY_TOP_TEAMS);
            obj.getClass();
            bVar = (b) obj;
        } else if (g.containsKey(TopPerformanceResponseSerializerKt.PROPERTY_TOP_PLAYERS)) {
            Object obj2 = g.get(TopPerformanceResponseSerializerKt.PROPERTY_TOP_PLAYERS);
            obj2.getClass();
            bVar = (b) obj2;
        } else {
            if (!g.containsKey(TopPerformanceResponseSerializerKt.PROPERTY_TOP_STATS)) {
                a70.r("JSON must contain one of: topTeams, topPlayers, or topStats");
                return null;
            }
            Object obj3 = g.get(TopPerformanceResponseSerializerKt.PROPERTY_TOP_STATS);
            obj3.getClass();
            bVar = (b) obj3;
        }
        dy4 selectDeserializer = selectDeserializer(statisticsType);
        TopPerformanceStatistics topPerformanceStatistics2 = (TopPerformanceStatistics) mfaVar.d().a(selectDeserializer, bVar);
        b bVar3 = (b) g.get("playerOfTheTournament");
        boolean booleanValue = (bVar3 == null || (e = qfa.e(qfa.h(bVar3))) == null) ? false : e.booleanValue();
        b bVar4 = (b) g.get("ineligibleTopPlayers");
        if (bVar4 != null) {
            if (bVar4 instanceof JsonNull) {
                bVar4 = null;
            }
            if (bVar4 != null) {
                topPerformanceStatistics = (TopPerformanceStatistics) mfaVar.d().a(selectDeserializer, bVar4);
            }
        }
        return new TopPerformanceResponse<>(topPerformanceStatistics2, booleanValue, topPerformanceStatistics, statisticsType);
    }

    @Override // defpackage.dy4
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @NotNull TopPerformanceResponse<TopPerformanceStatistics> value) {
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
        KSerializer serializer = StatisticsType.INSTANCE.serializer();
        StatisticsType statisticsType = value.getStatisticsType();
        d.getClass();
        serializer.getClass();
        yea d2 = vfaVar.d();
        TopPerformanceStatistics topPerformanceItems = value.getTopPerformanceItems();
        d2.getClass();
        vfaVar.z(new c(linkedHashMap));
    }
}

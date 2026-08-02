package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.network.response.AmericanFootballPlayerEventStatistics;
import com.sofascore.model.network.response.FootballPlayerEventStatistics;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.PlayerEventStatisticsSerializer;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import defpackage.a7a;
import defpackage.boe;
import defpackage.c88;
import defpackage.gz1;
import defpackage.h75;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u0089\u00012\u00020\u0001:\u0004\u008a\u0001\u0089\u0001B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018Bñ\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001a\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001a\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b\u0017\u0010(J\u0015\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020\u001b¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020*2\u0006\u0010)\u001a\u00020\u001b¢\u0006\u0004\b-\u0010,J\u0015\u0010.\u001a\u00020*2\u0006\u0010)\u001a\u00020\u001e¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020*2\u0006\u0010)\u001a\u00020 ¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\b¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b=\u0010<J\u0012\u0010>\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b@\u0010?J\u0012\u0010A\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bA\u0010?J\u0012\u0010B\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bF\u0010EJ\u0012\u0010G\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bG\u0010?J\u0012\u0010H\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bH\u0010IJª\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\bHÖ\u0001¢\u0006\u0004\bL\u0010<J\u0010\u0010M\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\bM\u0010NJ\u001a\u0010Q\u001a\u00020\u000b2\b\u0010P\u001a\u0004\u0018\u00010OHÖ\u0003¢\u0006\u0004\bQ\u0010RJ'\u0010Z\u001a\u00020*2\u0006\u0010S\u001a\u00020\u00002\u0006\u0010U\u001a\u00020T2\u0006\u0010W\u001a\u00020VH\u0001¢\u0006\u0004\bX\u0010YR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010[\u001a\u0004\b\\\u00106R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010]\u001a\u0004\b^\u00108R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010_\u001a\u0004\b`\u0010:R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010a\u001a\u0004\bb\u0010<R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010a\u001a\u0004\bc\u0010<R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010d\u001a\u0004\be\u0010?R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010d\u001a\u0004\bf\u0010?R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010d\u001a\u0004\bg\u0010?R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010h\u001a\u0004\bi\u0010CR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010j\u001a\u0004\bk\u0010ER\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010j\u001a\u0004\bl\u0010ER\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010d\u001a\u0004\bm\u0010?R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010n\u001a\u0004\bo\u0010IR4\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u000e\u0010p\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010q\u001a\u0004\br\u0010sR4\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u000e\u0010p\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010q\u001a\u0004\bt\u0010sR4\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001a2\u000e\u0010p\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010q\u001a\u0004\bu\u0010sR4\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001a2\u000e\u0010p\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b!\u0010q\u001a\u0004\bv\u0010sR$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R%\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b%\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0081\u00018F¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0017\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0085\u00018F¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u008b\u0001"}, d2 = {"Lcom/sofascore/model/mvvm/model/PlayerData;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "", "avgRating", "Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown;", "seasonRatingBreakdown", "", "jerseyNumber", "position", "", "substitute", "captain", "inPlay", "Lcom/sofascore/model/network/response/PlayerEventStatistics;", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "", "gameStar", "teamId", "ejected", "Lcom/sofascore/model/mvvm/model/BaseballAdditionalPlayerData;", "baseballAllPositions", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Double;Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sofascore/model/network/response/PlayerEventStatistics;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/sofascore/model/mvvm/model/BaseballAdditionalPlayerData;)V", "seen0", "", "Lcom/sofascore/model/mvvm/model/Incident$GoalIncident;", "goalIncidents", "assistIncidents", "Lcom/sofascore/model/mvvm/model/Incident$CardIncident;", "cardIncidents", "Lcom/sofascore/model/mvvm/model/Incident$SubstitutionIncident;", "substitutionIncidents", "", "fantasyPoints", "Lcom/sofascore/model/mvvm/model/PlayerDataInfo;", "info", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Player;Ljava/lang/Double;Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sofascore/model/network/response/PlayerEventStatistics;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/sofascore/model/mvvm/model/BaseballAdditionalPlayerData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/sofascore/model/mvvm/model/PlayerDataInfo;Lt5h;)V", "incident", "", "addGoalIncident", "(Lcom/sofascore/model/mvvm/model/Incident$GoalIncident;)V", "addAssistIncident", "addCardIncident", "(Lcom/sofascore/model/mvvm/model/Incident$CardIncident;)V", "addSubstitutionIncident", "(Lcom/sofascore/model/mvvm/model/Incident$SubstitutionIncident;)V", SearchResponseKt.SPORT_ENTITY, "hasEventStatistics", "(Ljava/lang/String;)Z", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "()Ljava/lang/Double;", "component3", "()Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "component9", "()Lcom/sofascore/model/network/response/PlayerEventStatistics;", "component10", "()Ljava/lang/Integer;", "component11", "component12", "component13", "()Lcom/sofascore/model/mvvm/model/BaseballAdditionalPlayerData;", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Double;Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sofascore/model/network/response/PlayerEventStatistics;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/sofascore/model/mvvm/model/BaseballAdditionalPlayerData;)Lcom/sofascore/model/mvvm/model/PlayerData;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/PlayerData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Ljava/lang/Double;", "getAvgRating", "Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown;", "getSeasonRatingBreakdown", "Ljava/lang/String;", "getJerseyNumber", "getPosition", "Ljava/lang/Boolean;", "getSubstitute", "getCaptain", "getInPlay", "Lcom/sofascore/model/network/response/PlayerEventStatistics;", "getStatistics", "Ljava/lang/Integer;", "getGameStar", "getTeamId", "getEjected", "Lcom/sofascore/model/mvvm/model/BaseballAdditionalPlayerData;", "getBaseballAllPositions", U3.i.X, "Ljava/util/List;", "getGoalIncidents", "()Ljava/util/List;", "getAssistIncidents", "getCardIncidents", "getSubstitutionIncidents", "Ljava/lang/Float;", "getFantasyPoints", "()Ljava/lang/Float;", "setFantasyPoints", "(Ljava/lang/Float;)V", "Lcom/sofascore/model/mvvm/model/PlayerDataInfo;", "getInfo", "()Lcom/sofascore/model/mvvm/model/PlayerDataInfo;", "setInfo", "(Lcom/sofascore/model/mvvm/model/PlayerDataInfo;)V", "Lcom/sofascore/model/network/response/FootballPlayerEventStatistics;", "getFootballStatistics", "()Lcom/sofascore/model/network/response/FootballPlayerEventStatistics;", "footballStatistics", "Lcom/sofascore/model/network/response/AmericanFootballPlayerEventStatistics;", "getAmFootballStatistics", "()Lcom/sofascore/model/network/response/AmericanFootballPlayerEventStatistics;", "amFootballStatistics", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlayerData implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private List<Incident.GoalIncident> assistIncidents;

    @Nullable
    private final Double avgRating;

    @Nullable
    private final BaseballAdditionalPlayerData baseballAllPositions;

    @Nullable
    private final Boolean captain;

    @Nullable
    private List<Incident.CardIncident> cardIncidents;

    @Nullable
    private final Boolean ejected;

    @Nullable
    private Float fantasyPoints;

    @Nullable
    private final Integer gameStar;

    @Nullable
    private List<Incident.GoalIncident> goalIncidents;

    @Nullable
    private final Boolean inPlay;

    @Nullable
    private PlayerDataInfo info;

    @Nullable
    private final String jerseyNumber;

    @NotNull
    private final Player player;

    @Nullable
    private final String position;

    @Nullable
    private final SeasonRatingBreakdown seasonRatingBreakdown;

    @Nullable
    private final PlayerEventStatistics statistics;

    @Nullable
    private final Boolean substitute;

    @Nullable
    private List<Incident.SubstitutionIncident> substitutionIncidents;

    @Nullable
    private final Integer teamId;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new boe(0)), ypa.a(ysaVar, new boe(1)), ypa.a(ysaVar, new boe(2)), ypa.a(ysaVar, new boe(3)), null, null};
    }

    public /* synthetic */ PlayerData(int i, Player player, Double d, SeasonRatingBreakdown seasonRatingBreakdown, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, PlayerEventStatistics playerEventStatistics, Integer num, Integer num2, Boolean bool4, BaseballAdditionalPlayerData baseballAdditionalPlayerData, List list, List list2, List list3, List list4, Float f, PlayerDataInfo playerDataInfo, t5h t5hVar) {
        if (8187 != (i & 8187)) {
            oea.z(i, 8187, PlayerData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.player = player;
        this.avgRating = d;
        if ((i & 4) == 0) {
            this.seasonRatingBreakdown = null;
        } else {
            this.seasonRatingBreakdown = seasonRatingBreakdown;
        }
        this.jerseyNumber = str;
        this.position = str2;
        this.substitute = bool;
        this.captain = bool2;
        this.inPlay = bool3;
        this.statistics = playerEventStatistics;
        this.gameStar = num;
        this.teamId = num2;
        this.ejected = bool4;
        this.baseballAllPositions = baseballAdditionalPlayerData;
        if ((i & 8192) == 0) {
            this.goalIncidents = null;
        } else {
            this.goalIncidents = list;
        }
        if ((i & 16384) == 0) {
            this.assistIncidents = null;
        } else {
            this.assistIncidents = list2;
        }
        if ((32768 & i) == 0) {
            this.cardIncidents = null;
        } else {
            this.cardIncidents = list3;
        }
        if ((65536 & i) == 0) {
            this.substitutionIncidents = null;
        } else {
            this.substitutionIncidents = list4;
        }
        if ((131072 & i) == 0) {
            this.fantasyPoints = null;
        } else {
            this.fantasyPoints = f;
        }
        if ((i & 262144) == 0) {
            this.info = null;
        } else {
            this.info = playerDataInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(Incident$GoalIncident$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(Incident$GoalIncident$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(Incident$CardIncident$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(Incident$SubstitutionIncident$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ PlayerData copy$default(PlayerData playerData, Player player, Double d, SeasonRatingBreakdown seasonRatingBreakdown, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, PlayerEventStatistics playerEventStatistics, Integer num, Integer num2, Boolean bool4, BaseballAdditionalPlayerData baseballAdditionalPlayerData, int i, Object obj) {
        if ((i & 1) != 0) {
            player = playerData.player;
        }
        return playerData.copy(player, (i & 2) != 0 ? playerData.avgRating : d, (i & 4) != 0 ? playerData.seasonRatingBreakdown : seasonRatingBreakdown, (i & 8) != 0 ? playerData.jerseyNumber : str, (i & 16) != 0 ? playerData.position : str2, (i & 32) != 0 ? playerData.substitute : bool, (i & 64) != 0 ? playerData.captain : bool2, (i & 128) != 0 ? playerData.inPlay : bool3, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? playerData.statistics : playerEventStatistics, (i & 512) != 0 ? playerData.gameStar : num, (i & 1024) != 0 ? playerData.teamId : num2, (i & a.o) != 0 ? playerData.ejected : bool4, (i & 4096) != 0 ? playerData.baseballAllPositions : baseballAdditionalPlayerData);
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerData self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, Player$$serializer.INSTANCE, self.player);
        output.h(serialDesc, 1, h75.a, self.avgRating);
        if (output.o(serialDesc) || self.seasonRatingBreakdown != null) {
            output.h(serialDesc, 2, SeasonRatingBreakdown$$serializer.INSTANCE, self.seasonRatingBreakdown);
        }
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 3, uhiVar, self.jerseyNumber);
        output.h(serialDesc, 4, uhiVar, self.position);
        gz1 gz1Var = gz1.a;
        output.h(serialDesc, 5, gz1Var, self.substitute);
        output.h(serialDesc, 6, gz1Var, self.captain);
        output.h(serialDesc, 7, gz1Var, self.inPlay);
        output.h(serialDesc, 8, PlayerEventStatisticsSerializer.INSTANCE, self.statistics);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 9, a7aVar, self.gameStar);
        output.h(serialDesc, 10, a7aVar, self.teamId);
        output.h(serialDesc, 11, gz1Var, self.ejected);
        output.h(serialDesc, 12, BaseballAdditionalPlayerData$$serializer.INSTANCE, self.baseballAllPositions);
        if (output.o(serialDesc) || self.goalIncidents != null) {
            output.h(serialDesc, 13, (KSerializer) joaVarArr[13].getValue(), self.goalIncidents);
        }
        if (output.o(serialDesc) || self.assistIncidents != null) {
            output.h(serialDesc, 14, (KSerializer) joaVarArr[14].getValue(), self.assistIncidents);
        }
        if (output.o(serialDesc) || self.cardIncidents != null) {
            output.h(serialDesc, 15, (KSerializer) joaVarArr[15].getValue(), self.cardIncidents);
        }
        if (output.o(serialDesc) || self.substitutionIncidents != null) {
            output.h(serialDesc, 16, (KSerializer) joaVarArr[16].getValue(), self.substitutionIncidents);
        }
        if (output.o(serialDesc) || self.fantasyPoints != null) {
            output.h(serialDesc, 17, c88.a, self.fantasyPoints);
        }
        if (!output.o(serialDesc) && self.info == null) {
            return;
        }
        output.h(serialDesc, 18, PlayerDataInfo$$serializer.INSTANCE, self.info);
    }

    public final void addAssistIncident(@NotNull Incident.GoalIncident incident) {
        incident.getClass();
        List<Incident.GoalIncident> list = this.assistIncidents;
        if (list == null) {
            this.assistIncidents = b.l(incident);
        } else {
            list.add(incident);
        }
    }

    public final void addCardIncident(@NotNull Incident.CardIncident incident) {
        incident.getClass();
        List<Incident.CardIncident> list = this.cardIncidents;
        if (list == null) {
            this.cardIncidents = b.l(incident);
        } else {
            list.add(incident);
        }
    }

    public final void addGoalIncident(@NotNull Incident.GoalIncident incident) {
        incident.getClass();
        List<Incident.GoalIncident> list = this.goalIncidents;
        if (list == null) {
            this.goalIncidents = b.l(incident);
        } else {
            list.add(incident);
        }
    }

    public final void addSubstitutionIncident(@NotNull Incident.SubstitutionIncident incident) {
        incident.getClass();
        List<Incident.SubstitutionIncident> list = this.substitutionIncidents;
        if (list == null) {
            this.substitutionIncidents = b.l(incident);
        } else {
            list.add(incident);
        }
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getGameStar() {
        return this.gameStar;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getTeamId() {
        return this.teamId;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Boolean getEjected() {
        return this.ejected;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final BaseballAdditionalPlayerData getBaseballAllPositions() {
        return this.baseballAllPositions;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Double getAvgRating() {
        return this.avgRating;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final SeasonRatingBreakdown getSeasonRatingBreakdown() {
        return this.seasonRatingBreakdown;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getJerseyNumber() {
        return this.jerseyNumber;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getPosition() {
        return this.position;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Boolean getSubstitute() {
        return this.substitute;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Boolean getCaptain() {
        return this.captain;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Boolean getInPlay() {
        return this.inPlay;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final PlayerEventStatistics getStatistics() {
        return this.statistics;
    }

    @NotNull
    public final PlayerData copy(@NotNull Player player, @Nullable Double avgRating, @Nullable SeasonRatingBreakdown seasonRatingBreakdown, @Nullable String jerseyNumber, @Nullable String position, @Nullable Boolean substitute, @Nullable Boolean captain, @Nullable Boolean inPlay, @Nullable PlayerEventStatistics statistics, @Nullable Integer gameStar, @Nullable Integer teamId, @Nullable Boolean ejected, @Nullable BaseballAdditionalPlayerData baseballAllPositions) {
        player.getClass();
        return new PlayerData(player, avgRating, seasonRatingBreakdown, jerseyNumber, position, substitute, captain, inPlay, statistics, gameStar, teamId, ejected, baseballAllPositions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerData)) {
            return false;
        }
        PlayerData playerData = (PlayerData) other;
        return Intrinsics.c(this.player, playerData.player) && Intrinsics.c(this.avgRating, playerData.avgRating) && Intrinsics.c(this.seasonRatingBreakdown, playerData.seasonRatingBreakdown) && Intrinsics.c(this.jerseyNumber, playerData.jerseyNumber) && Intrinsics.c(this.position, playerData.position) && Intrinsics.c(this.substitute, playerData.substitute) && Intrinsics.c(this.captain, playerData.captain) && Intrinsics.c(this.inPlay, playerData.inPlay) && Intrinsics.c(this.statistics, playerData.statistics) && Intrinsics.c(this.gameStar, playerData.gameStar) && Intrinsics.c(this.teamId, playerData.teamId) && Intrinsics.c(this.ejected, playerData.ejected) && Intrinsics.c(this.baseballAllPositions, playerData.baseballAllPositions);
    }

    @Nullable
    public final AmericanFootballPlayerEventStatistics getAmFootballStatistics() {
        PlayerEventStatistics playerEventStatistics = this.statistics;
        if (playerEventStatistics instanceof AmericanFootballPlayerEventStatistics) {
            return (AmericanFootballPlayerEventStatistics) playerEventStatistics;
        }
        return null;
    }

    @Nullable
    public final List<Incident.GoalIncident> getAssistIncidents() {
        return this.assistIncidents;
    }

    @Nullable
    public final Double getAvgRating() {
        return this.avgRating;
    }

    @Nullable
    public final BaseballAdditionalPlayerData getBaseballAllPositions() {
        return this.baseballAllPositions;
    }

    @Nullable
    public final Boolean getCaptain() {
        return this.captain;
    }

    @Nullable
    public final List<Incident.CardIncident> getCardIncidents() {
        return this.cardIncidents;
    }

    @Nullable
    public final Boolean getEjected() {
        return this.ejected;
    }

    @Nullable
    public final Float getFantasyPoints() {
        return this.fantasyPoints;
    }

    @Nullable
    public final FootballPlayerEventStatistics getFootballStatistics() {
        PlayerEventStatistics playerEventStatistics = this.statistics;
        if (playerEventStatistics instanceof FootballPlayerEventStatistics) {
            return (FootballPlayerEventStatistics) playerEventStatistics;
        }
        return null;
    }

    @Nullable
    public final Integer getGameStar() {
        return this.gameStar;
    }

    @Nullable
    public final List<Incident.GoalIncident> getGoalIncidents() {
        return this.goalIncidents;
    }

    @Nullable
    public final Boolean getInPlay() {
        return this.inPlay;
    }

    @Nullable
    public final PlayerDataInfo getInfo() {
        return this.info;
    }

    @Nullable
    public final String getJerseyNumber() {
        return this.jerseyNumber;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    public final String getPosition() {
        return this.position;
    }

    @Nullable
    public final SeasonRatingBreakdown getSeasonRatingBreakdown() {
        return this.seasonRatingBreakdown;
    }

    @Nullable
    public final PlayerEventStatistics getStatistics() {
        return this.statistics;
    }

    @Nullable
    public final Boolean getSubstitute() {
        return this.substitute;
    }

    @Nullable
    public final List<Incident.SubstitutionIncident> getSubstitutionIncidents() {
        return this.substitutionIncidents;
    }

    @Nullable
    public final Integer getTeamId() {
        return this.teamId;
    }

    public final boolean hasEventStatistics(@NotNull String sport) {
        sport.getClass();
        if (!Intrinsics.c(sport, Sports.FOOTBALL)) {
            return this.statistics != null;
        }
        FootballPlayerEventStatistics footballStatistics = getFootballStatistics();
        return (footballStatistics != null ? footballStatistics.getMinutesPlayed() : null) != null;
    }

    public int hashCode() {
        int hashCode = this.player.hashCode() * 31;
        Double d = this.avgRating;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        SeasonRatingBreakdown seasonRatingBreakdown = this.seasonRatingBreakdown;
        int hashCode3 = (hashCode2 + (seasonRatingBreakdown == null ? 0 : seasonRatingBreakdown.hashCode())) * 31;
        String str = this.jerseyNumber;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.position;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.substitute;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.captain;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.inPlay;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        PlayerEventStatistics playerEventStatistics = this.statistics;
        int hashCode9 = (hashCode8 + (playerEventStatistics == null ? 0 : playerEventStatistics.hashCode())) * 31;
        Integer num = this.gameStar;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.teamId;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.ejected;
        int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        BaseballAdditionalPlayerData baseballAdditionalPlayerData = this.baseballAllPositions;
        return hashCode12 + (baseballAdditionalPlayerData != null ? baseballAdditionalPlayerData.hashCode() : 0);
    }

    public final void setFantasyPoints(@Nullable Float f) {
        this.fantasyPoints = f;
    }

    public final void setInfo(@Nullable PlayerDataInfo playerDataInfo) {
        this.info = playerDataInfo;
    }

    @NotNull
    public String toString() {
        Player player = this.player;
        Double d = this.avgRating;
        SeasonRatingBreakdown seasonRatingBreakdown = this.seasonRatingBreakdown;
        String str = this.jerseyNumber;
        String str2 = this.position;
        Boolean bool = this.substitute;
        Boolean bool2 = this.captain;
        Boolean bool3 = this.inPlay;
        PlayerEventStatistics playerEventStatistics = this.statistics;
        Integer num = this.gameStar;
        Integer num2 = this.teamId;
        Boolean bool4 = this.ejected;
        BaseballAdditionalPlayerData baseballAdditionalPlayerData = this.baseballAllPositions;
        StringBuilder sb = new StringBuilder("PlayerData(player=");
        sb.append(player);
        sb.append(", avgRating=");
        sb.append(d);
        sb.append(", seasonRatingBreakdown=");
        sb.append(seasonRatingBreakdown);
        sb.append(", jerseyNumber=");
        sb.append(str);
        sb.append(", position=");
        sb.append(str2);
        sb.append(", substitute=");
        sb.append(bool);
        sb.append(", captain=");
        i.q(sb, bool2, ", inPlay=", bool3, ", statistics=");
        sb.append(playerEventStatistics);
        sb.append(", gameStar=");
        sb.append(num);
        sb.append(", teamId=");
        vxd.v(sb, num2, ", ejected=", bool4, ", baseballAllPositions=");
        sb.append(baseballAdditionalPlayerData);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/PlayerData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/PlayerData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PlayerData(@NotNull Player player, @Nullable Double d, @Nullable SeasonRatingBreakdown seasonRatingBreakdown, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable PlayerEventStatistics playerEventStatistics, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool4, @Nullable BaseballAdditionalPlayerData baseballAdditionalPlayerData) {
        player.getClass();
        this.player = player;
        this.avgRating = d;
        this.seasonRatingBreakdown = seasonRatingBreakdown;
        this.jerseyNumber = str;
        this.position = str2;
        this.substitute = bool;
        this.captain = bool2;
        this.inPlay = bool3;
        this.statistics = playerEventStatistics;
        this.gameStar = num;
        this.teamId = num2;
        this.ejected = bool4;
        this.baseballAllPositions = baseballAdditionalPlayerData;
    }

    public /* synthetic */ PlayerData(Player player, Double d, SeasonRatingBreakdown seasonRatingBreakdown, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, PlayerEventStatistics playerEventStatistics, Integer num, Integer num2, Boolean bool4, BaseballAdditionalPlayerData baseballAdditionalPlayerData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(player, d, (i & 4) != 0 ? null : seasonRatingBreakdown, str, str2, bool, bool2, bool3, playerEventStatistics, num, num2, bool4, baseballAdditionalPlayerData);
    }
}

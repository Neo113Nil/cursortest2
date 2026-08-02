package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Country$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournament$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.fn0;
import defpackage.h75;
import defpackage.joa;
import defpackage.lkb;
import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.s8f;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.wt3;
import defpackage.wv8;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b(\b\u0087\b\u0018\u0000 }2\u00020\u0001:\u0002~}Bù\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#B\u0087\u0002\b\u0010\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b\"\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010)J\u0010\u00100\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010)J\u0012\u00103\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b5\u0010.J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b:\u0010.J\u0012\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b;\u0010.J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u00107J\u0012\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b=\u0010.J\u0012\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b>\u0010.J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u00107J\u0012\u0010@\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b@\u00104J\u0012\u0010A\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bA\u00104J\u0012\u0010B\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u00107J\u0012\u0010E\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bG\u0010.J\u0010\u0010H\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bH\u0010)J\u0010\u0010I\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bI\u0010)Jª\u0002\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\bL\u0010.J\u0010\u0010M\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bM\u0010)J\u001a\u0010P\u001a\u00020O2\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bP\u0010QJ'\u0010Z\u001a\u00020W2\u0006\u0010R\u001a\u00020\u00002\u0006\u0010T\u001a\u00020S2\u0006\u0010V\u001a\u00020UH\u0001¢\u0006\u0004\bX\u0010YR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010[\u001a\u0004\b\\\u0010)R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010[\u001a\u0004\b]\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010^\u001a\u0004\b_\u0010,R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010`\u001a\u0004\ba\u0010.R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010[\u001a\u0004\bb\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010c\u001a\u0004\bd\u00101R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010[\u001a\u0004\be\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\r\u0010f\u001a\u0004\bg\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010`\u001a\u0004\bh\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010i\u001a\u0004\bj\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010k\u001a\u0004\bl\u00109R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010`\u001a\u0004\bm\u0010.R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010`\u001a\u0004\bn\u0010.R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010i\u001a\u0004\bo\u00107R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010`\u001a\u0004\bp\u0010.R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010`\u001a\u0004\bq\u0010.R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010i\u001a\u0004\br\u00107R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0018\u0010f\u001a\u0004\bs\u00104R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010f\u001a\u0004\bt\u00104R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010u\u001a\u0004\bv\u0010CR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010i\u001a\u0004\bw\u00107R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010x\u001a\u0004\by\u0010FR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010`\u001a\u0004\bz\u0010.R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010[\u001a\u0004\b{\u0010)R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010[\u001a\u0004\b|\u0010)¨\u0006\u007f"}, d2 = {"Lcom/sofascore/model/newNetwork/RankingItem;", "", "", "id", "type", "Lcom/sofascore/model/mvvm/model/Country;", "country", "", "rankingClass", "ranking", "", "points", "previousRanking", "previousPoints", "rowName", "bestRanking", "", "bestRankingDateTimestamp", "currentRound", "currentTournamentName", "currentTournamentId", "previousTournamentRound", "previousTournamentName", "previousTournamentId", "nextWinPoints", "maxPoints", "Lcom/sofascore/model/mvvm/model/Team;", "team", "tournamentsPlayed", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", SearchResponseKt.LEAGUE_ENTITY, "year", "totalTeams", "playingTeams", "<init>", "(IILcom/sofascore/model/mvvm/model/Country;Ljava/lang/String;IDILjava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/UniqueTournament;Ljava/lang/String;II)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIILcom/sofascore/model/mvvm/model/Country;Ljava/lang/String;IDILjava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/UniqueTournament;Ljava/lang/String;IILt5h;)V", "component1", "()I", "component2", "component3", "()Lcom/sofascore/model/mvvm/model/Country;", "component4", "()Ljava/lang/String;", "component5", "component6", "()D", "component7", "component8", "()Ljava/lang/Double;", "component9", "component10", "()Ljava/lang/Integer;", "component11", "()Ljava/lang/Long;", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "()Lcom/sofascore/model/mvvm/model/Team;", "component21", "component22", "()Lcom/sofascore/model/mvvm/model/UniqueTournament;", "component23", "component24", "component25", "copy", "(IILcom/sofascore/model/mvvm/model/Country;Ljava/lang/String;IDILjava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/UniqueTournament;Ljava/lang/String;II)Lcom/sofascore/model/newNetwork/RankingItem;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/RankingItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "getType", "Lcom/sofascore/model/mvvm/model/Country;", "getCountry", "Ljava/lang/String;", "getRankingClass", "getRanking", "D", "getPoints", "getPreviousRanking", "Ljava/lang/Double;", "getPreviousPoints", "getRowName", "Ljava/lang/Integer;", "getBestRanking", "Ljava/lang/Long;", "getBestRankingDateTimestamp", "getCurrentRound", "getCurrentTournamentName", "getCurrentTournamentId", "getPreviousTournamentRound", "getPreviousTournamentName", "getPreviousTournamentId", "getNextWinPoints", "getMaxPoints", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "getTournamentsPlayed", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "getUniqueTournament", "getYear", "getTotalTeams", "getPlayingTeams", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RankingItem {

    @Nullable
    private final Integer bestRanking;

    @Nullable
    private final Long bestRankingDateTimestamp;

    @NotNull
    private final Country country;

    @Nullable
    private final String currentRound;

    @Nullable
    private final Integer currentTournamentId;

    @Nullable
    private final String currentTournamentName;
    private final int id;

    @Nullable
    private final Double maxPoints;

    @Nullable
    private final Double nextWinPoints;
    private final int playingTeams;
    private final double points;

    @Nullable
    private final Double previousPoints;
    private final int previousRanking;

    @Nullable
    private final Integer previousTournamentId;

    @Nullable
    private final String previousTournamentName;

    @Nullable
    private final String previousTournamentRound;
    private final int ranking;

    @NotNull
    private final String rankingClass;

    @Nullable
    private final String rowName;

    @Nullable
    private final Team team;
    private final int totalTeams;

    @Nullable
    private final Integer tournamentsPlayed;
    private final int type;

    @Nullable
    private final UniqueTournament uniqueTournament;

    @Nullable
    private final String year;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysa.b, new s8f(20)), null, null, null, null, null};

    public /* synthetic */ RankingItem(int i, int i2, int i3, Country country, String str, int i4, double d, int i5, Double d2, String str2, Integer num, Long l, String str3, String str4, Integer num2, String str5, String str6, Integer num3, Double d3, Double d4, Team team, Integer num4, UniqueTournament uniqueTournament, String str7, int i6, int i7, t5h t5hVar) {
        if (8388495 != (i & 8388495)) {
            oea.z(i, 8388495, RankingItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.type = i3;
        this.country = country;
        this.rankingClass = str;
        if ((i & 16) == 0) {
            this.ranking = 0;
            i4 = 0;
        } else {
            this.ranking = i4;
        }
        if ((i & 32) == 0) {
            this.points = 0.0d;
        } else {
            this.points = d;
        }
        if ((i & 64) == 0) {
            this.previousRanking = i4;
        } else {
            this.previousRanking = i5;
        }
        this.previousPoints = d2;
        this.rowName = str2;
        this.bestRanking = num;
        this.bestRankingDateTimestamp = l;
        this.currentRound = str3;
        this.currentTournamentName = str4;
        this.currentTournamentId = num2;
        this.previousTournamentRound = str5;
        this.previousTournamentName = str6;
        this.previousTournamentId = num3;
        this.nextWinPoints = d3;
        this.maxPoints = d4;
        this.team = team;
        this.tournamentsPlayed = num4;
        this.uniqueTournament = uniqueTournament;
        this.year = str7;
        if ((8388608 & i) == 0) {
            this.totalTeams = 0;
        } else {
            this.totalTeams = i6;
        }
        if ((i & C.DEFAULT_MUXED_BUFFER_SIZE) == 0) {
            this.playingTeams = 0;
        } else {
            this.playingTeams = i7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ RankingItem copy$default(RankingItem rankingItem, int i, int i2, Country country, String str, int i3, double d, int i4, Double d2, String str2, Integer num, Long l, String str3, String str4, Integer num2, String str5, String str6, Integer num3, Double d3, Double d4, Team team, Integer num4, UniqueTournament uniqueTournament, String str7, int i5, int i6, int i7, Object obj) {
        int i8;
        int i9;
        int i10 = (i7 & 1) != 0 ? rankingItem.id : i;
        int i11 = (i7 & 2) != 0 ? rankingItem.type : i2;
        Country country2 = (i7 & 4) != 0 ? rankingItem.country : country;
        String str8 = (i7 & 8) != 0 ? rankingItem.rankingClass : str;
        int i12 = (i7 & 16) != 0 ? rankingItem.ranking : i3;
        double d5 = (i7 & 32) != 0 ? rankingItem.points : d;
        int i13 = (i7 & 64) != 0 ? rankingItem.previousRanking : i4;
        Double d6 = (i7 & 128) != 0 ? rankingItem.previousPoints : d2;
        String str9 = (i7 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? rankingItem.rowName : str2;
        Integer num5 = (i7 & 512) != 0 ? rankingItem.bestRanking : num;
        Long l2 = (i7 & 1024) != 0 ? rankingItem.bestRankingDateTimestamp : l;
        String str10 = (i7 & a.o) != 0 ? rankingItem.currentRound : str3;
        String str11 = (i7 & 4096) != 0 ? rankingItem.currentTournamentName : str4;
        int i14 = i10;
        Integer num6 = (i7 & 8192) != 0 ? rankingItem.currentTournamentId : num2;
        String str12 = (i7 & 16384) != 0 ? rankingItem.previousTournamentRound : str5;
        String str13 = (i7 & 32768) != 0 ? rankingItem.previousTournamentName : str6;
        Integer num7 = (i7 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? rankingItem.previousTournamentId : num3;
        Double d7 = (i7 & 131072) != 0 ? rankingItem.nextWinPoints : d3;
        Double d8 = (i7 & 262144) != 0 ? rankingItem.maxPoints : d4;
        Team team2 = (i7 & 524288) != 0 ? rankingItem.team : team;
        Integer num8 = (i7 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? rankingItem.tournamentsPlayed : num4;
        UniqueTournament uniqueTournament2 = (i7 & 2097152) != 0 ? rankingItem.uniqueTournament : uniqueTournament;
        String str14 = (i7 & 4194304) != 0 ? rankingItem.year : str7;
        int i15 = (i7 & 8388608) != 0 ? rankingItem.totalTeams : i5;
        if ((i7 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0) {
            i9 = i15;
            i8 = rankingItem.playingTeams;
        } else {
            i8 = i6;
            i9 = i15;
        }
        return rankingItem.copy(i14, i11, country2, str8, i12, d5, i13, d6, str9, num5, l2, str10, str11, num6, str12, str13, num7, d7, d8, team2, num8, uniqueTournament2, str14, i9, i8);
    }

    public static final /* synthetic */ void write$Self$model_release(RankingItem self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.u(1, self.type, serialDesc);
        output.f(serialDesc, 2, Country$$serializer.INSTANCE, self.country);
        output.y(serialDesc, 3, self.rankingClass);
        if (output.o(serialDesc) || self.ranking != 0) {
            output.u(4, self.ranking, serialDesc);
        }
        if (output.o(serialDesc) || Double.compare(self.points, 0.0d) != 0) {
            output.D(serialDesc, 5, self.points);
        }
        if (output.o(serialDesc) || self.previousRanking != self.ranking) {
            output.u(6, self.previousRanking, serialDesc);
        }
        h75 h75Var = h75.a;
        output.h(serialDesc, 7, h75Var, self.previousPoints);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 8, uhiVar, self.rowName);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 9, a7aVar, self.bestRanking);
        output.h(serialDesc, 10, lkb.a, self.bestRankingDateTimestamp);
        output.h(serialDesc, 11, uhiVar, self.currentRound);
        output.h(serialDesc, 12, uhiVar, self.currentTournamentName);
        output.h(serialDesc, 13, a7aVar, self.currentTournamentId);
        output.h(serialDesc, 14, uhiVar, self.previousTournamentRound);
        output.h(serialDesc, 15, uhiVar, self.previousTournamentName);
        output.h(serialDesc, 16, a7aVar, self.previousTournamentId);
        output.h(serialDesc, 17, h75Var, self.nextWinPoints);
        output.h(serialDesc, 18, h75Var, self.maxPoints);
        output.h(serialDesc, 19, (KSerializer) joaVarArr[19].getValue(), self.team);
        output.h(serialDesc, 20, a7aVar, self.tournamentsPlayed);
        output.h(serialDesc, 21, UniqueTournament$$serializer.INSTANCE, self.uniqueTournament);
        output.h(serialDesc, 22, uhiVar, self.year);
        if (output.o(serialDesc) || self.totalTeams != 0) {
            output.u(23, self.totalTeams, serialDesc);
        }
        if (!output.o(serialDesc) && self.playingTeams == 0) {
            return;
        }
        output.u(24, self.playingTeams, serialDesc);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getBestRanking() {
        return this.bestRanking;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Long getBestRankingDateTimestamp() {
        return this.bestRankingDateTimestamp;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getCurrentRound() {
        return this.currentRound;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getCurrentTournamentName() {
        return this.currentTournamentName;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getCurrentTournamentId() {
        return this.currentTournamentId;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getPreviousTournamentRound() {
        return this.previousTournamentRound;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getPreviousTournamentName() {
        return this.previousTournamentName;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getPreviousTournamentId() {
        return this.previousTournamentId;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Double getNextWinPoints() {
        return this.nextWinPoints;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Double getMaxPoints() {
        return this.maxPoints;
    }

    /* renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Integer getTournamentsPlayed() {
        return this.tournamentsPlayed;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final String getYear() {
        return this.year;
    }

    /* renamed from: component24, reason: from getter */
    public final int getTotalTeams() {
        return this.totalTeams;
    }

    /* renamed from: component25, reason: from getter */
    public final int getPlayingTeams() {
        return this.playingTeams;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Country getCountry() {
        return this.country;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getRankingClass() {
        return this.rankingClass;
    }

    /* renamed from: component5, reason: from getter */
    public final int getRanking() {
        return this.ranking;
    }

    /* renamed from: component6, reason: from getter */
    public final double getPoints() {
        return this.points;
    }

    /* renamed from: component7, reason: from getter */
    public final int getPreviousRanking() {
        return this.previousRanking;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Double getPreviousPoints() {
        return this.previousPoints;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getRowName() {
        return this.rowName;
    }

    @NotNull
    public final RankingItem copy(int id, int type, @NotNull Country country, @NotNull String rankingClass, int ranking, double points, int previousRanking, @Nullable Double previousPoints, @Nullable String rowName, @Nullable Integer bestRanking, @Nullable Long bestRankingDateTimestamp, @Nullable String currentRound, @Nullable String currentTournamentName, @Nullable Integer currentTournamentId, @Nullable String previousTournamentRound, @Nullable String previousTournamentName, @Nullable Integer previousTournamentId, @Nullable Double nextWinPoints, @Nullable Double maxPoints, @Nullable Team team, @Nullable Integer tournamentsPlayed, @Nullable UniqueTournament uniqueTournament, @Nullable String year, int totalTeams, int playingTeams) {
        country.getClass();
        rankingClass.getClass();
        return new RankingItem(id, type, country, rankingClass, ranking, points, previousRanking, previousPoints, rowName, bestRanking, bestRankingDateTimestamp, currentRound, currentTournamentName, currentTournamentId, previousTournamentRound, previousTournamentName, previousTournamentId, nextWinPoints, maxPoints, team, tournamentsPlayed, uniqueTournament, year, totalTeams, playingTeams);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankingItem)) {
            return false;
        }
        RankingItem rankingItem = (RankingItem) other;
        return this.id == rankingItem.id && this.type == rankingItem.type && Intrinsics.c(this.country, rankingItem.country) && Intrinsics.c(this.rankingClass, rankingItem.rankingClass) && this.ranking == rankingItem.ranking && Double.compare(this.points, rankingItem.points) == 0 && this.previousRanking == rankingItem.previousRanking && Intrinsics.c(this.previousPoints, rankingItem.previousPoints) && Intrinsics.c(this.rowName, rankingItem.rowName) && Intrinsics.c(this.bestRanking, rankingItem.bestRanking) && Intrinsics.c(this.bestRankingDateTimestamp, rankingItem.bestRankingDateTimestamp) && Intrinsics.c(this.currentRound, rankingItem.currentRound) && Intrinsics.c(this.currentTournamentName, rankingItem.currentTournamentName) && Intrinsics.c(this.currentTournamentId, rankingItem.currentTournamentId) && Intrinsics.c(this.previousTournamentRound, rankingItem.previousTournamentRound) && Intrinsics.c(this.previousTournamentName, rankingItem.previousTournamentName) && Intrinsics.c(this.previousTournamentId, rankingItem.previousTournamentId) && Intrinsics.c(this.nextWinPoints, rankingItem.nextWinPoints) && Intrinsics.c(this.maxPoints, rankingItem.maxPoints) && Intrinsics.c(this.team, rankingItem.team) && Intrinsics.c(this.tournamentsPlayed, rankingItem.tournamentsPlayed) && Intrinsics.c(this.uniqueTournament, rankingItem.uniqueTournament) && Intrinsics.c(this.year, rankingItem.year) && this.totalTeams == rankingItem.totalTeams && this.playingTeams == rankingItem.playingTeams;
    }

    @Nullable
    public final Integer getBestRanking() {
        return this.bestRanking;
    }

    @Nullable
    public final Long getBestRankingDateTimestamp() {
        return this.bestRankingDateTimestamp;
    }

    @NotNull
    public final Country getCountry() {
        return this.country;
    }

    @Nullable
    public final String getCurrentRound() {
        return this.currentRound;
    }

    @Nullable
    public final Integer getCurrentTournamentId() {
        return this.currentTournamentId;
    }

    @Nullable
    public final String getCurrentTournamentName() {
        return this.currentTournamentName;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Double getMaxPoints() {
        return this.maxPoints;
    }

    @Nullable
    public final Double getNextWinPoints() {
        return this.nextWinPoints;
    }

    public final int getPlayingTeams() {
        return this.playingTeams;
    }

    public final double getPoints() {
        return this.points;
    }

    @Nullable
    public final Double getPreviousPoints() {
        return this.previousPoints;
    }

    public final int getPreviousRanking() {
        return this.previousRanking;
    }

    @Nullable
    public final Integer getPreviousTournamentId() {
        return this.previousTournamentId;
    }

    @Nullable
    public final String getPreviousTournamentName() {
        return this.previousTournamentName;
    }

    @Nullable
    public final String getPreviousTournamentRound() {
        return this.previousTournamentRound;
    }

    public final int getRanking() {
        return this.ranking;
    }

    @NotNull
    public final String getRankingClass() {
        return this.rankingClass;
    }

    @Nullable
    public final String getRowName() {
        return this.rowName;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    public final int getTotalTeams() {
        return this.totalTeams;
    }

    @Nullable
    public final Integer getTournamentsPlayed() {
        return this.tournamentsPlayed;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    @Nullable
    public final String getYear() {
        return this.year;
    }

    public int hashCode() {
        int a = wv8.a(this.previousRanking, dmi.b(wv8.a(this.ranking, dmi.c((this.country.hashCode() + wv8.a(this.type, Integer.hashCode(this.id) * 31, 31)) * 31, 31, this.rankingClass), 31), 31, this.points), 31);
        Double d = this.previousPoints;
        int hashCode = (a + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.rowName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.bestRanking;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.bestRankingDateTimestamp;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.currentRound;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currentTournamentName;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.currentTournamentId;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.previousTournamentRound;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.previousTournamentName;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.previousTournamentId;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d2 = this.nextWinPoints;
        int hashCode11 = (hashCode10 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.maxPoints;
        int hashCode12 = (hashCode11 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Team team = this.team;
        int hashCode13 = (hashCode12 + (team == null ? 0 : team.hashCode())) * 31;
        Integer num4 = this.tournamentsPlayed;
        int hashCode14 = (hashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        UniqueTournament uniqueTournament = this.uniqueTournament;
        int hashCode15 = (hashCode14 + (uniqueTournament == null ? 0 : uniqueTournament.hashCode())) * 31;
        String str6 = this.year;
        return Integer.hashCode(this.playingTeams) + wv8.a(this.totalTeams, (hashCode15 + (str6 != null ? str6.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        int i2 = this.type;
        Country country = this.country;
        String str = this.rankingClass;
        int i3 = this.ranking;
        double d = this.points;
        int i4 = this.previousRanking;
        Double d2 = this.previousPoints;
        String str2 = this.rowName;
        Integer num = this.bestRanking;
        Long l = this.bestRankingDateTimestamp;
        String str3 = this.currentRound;
        String str4 = this.currentTournamentName;
        Integer num2 = this.currentTournamentId;
        String str5 = this.previousTournamentRound;
        String str6 = this.previousTournamentName;
        Integer num3 = this.previousTournamentId;
        Double d3 = this.nextWinPoints;
        Double d4 = this.maxPoints;
        Team team = this.team;
        Integer num4 = this.tournamentsPlayed;
        UniqueTournament uniqueTournament = this.uniqueTournament;
        String str7 = this.year;
        int i5 = this.totalTeams;
        int i6 = this.playingTeams;
        StringBuilder s = lnb.s(i, i2, "RankingItem(id=", ", type=", ", country=");
        s.append(country);
        s.append(", rankingClass=");
        s.append(str);
        s.append(", ranking=");
        s.append(i3);
        s.append(", points=");
        s.append(d);
        s.append(", previousRanking=");
        s.append(i4);
        s.append(", previousPoints=");
        s.append(d2);
        s.append(", rowName=");
        s.append(str2);
        s.append(", bestRanking=");
        s.append(num);
        s.append(", bestRankingDateTimestamp=");
        s.append(l);
        s.append(", currentRound=");
        s.append(str3);
        s.append(", currentTournamentName=");
        s.append(str4);
        s.append(", currentTournamentId=");
        s.append(num2);
        bf3.v(s, ", previousTournamentRound=", str5, ", previousTournamentName=", str6);
        s.append(", previousTournamentId=");
        s.append(num3);
        s.append(", nextWinPoints=");
        s.append(d3);
        s.append(", maxPoints=");
        s.append(d4);
        s.append(", team=");
        s.append(team);
        s.append(", tournamentsPlayed=");
        s.append(num4);
        s.append(", uniqueTournament=");
        s.append(uniqueTournament);
        wt3.t(i5, ", year=", str7, ", totalTeams=", s);
        return fn0.k(i6, ", playingTeams=", ")", s);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/RankingItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/RankingItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RankingItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RankingItem(int i, int i2, @NotNull Country country, @NotNull String str, int i3, double d, int i4, @Nullable Double d2, @Nullable String str2, @Nullable Integer num, @Nullable Long l, @Nullable String str3, @Nullable String str4, @Nullable Integer num2, @Nullable String str5, @Nullable String str6, @Nullable Integer num3, @Nullable Double d3, @Nullable Double d4, @Nullable Team team, @Nullable Integer num4, @Nullable UniqueTournament uniqueTournament, @Nullable String str7, int i5, int i6) {
        country.getClass();
        str.getClass();
        this.id = i;
        this.type = i2;
        this.country = country;
        this.rankingClass = str;
        this.ranking = i3;
        this.points = d;
        this.previousRanking = i4;
        this.previousPoints = d2;
        this.rowName = str2;
        this.bestRanking = num;
        this.bestRankingDateTimestamp = l;
        this.currentRound = str3;
        this.currentTournamentName = str4;
        this.currentTournamentId = num2;
        this.previousTournamentRound = str5;
        this.previousTournamentName = str6;
        this.previousTournamentId = num3;
        this.nextWinPoints = d3;
        this.maxPoints = d4;
        this.team = team;
        this.tournamentsPlayed = num4;
        this.uniqueTournament = uniqueTournament;
        this.year = str7;
        this.totalTeams = i5;
        this.playingTeams = i6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RankingItem(int i, int i2, Country country, String str, int i3, double d, int i4, Double d2, String str2, Integer num, Long l, String str3, String str4, Integer num2, String str5, String str6, Integer num3, Double d3, Double d4, Team team, Integer num4, UniqueTournament uniqueTournament, String str7, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, country, str, r7, (i7 & 32) != 0 ? 0.0d : d, (i7 & 64) != 0 ? r7 : i4, d2, str2, num, l, str3, str4, num2, str5, str6, num3, d3, d4, team, num4, uniqueTournament, str7, (i7 & 8388608) != 0 ? 0 : i5, (i7 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? 0 : i6);
        int i8 = (i7 & 16) != 0 ? 0 : i3;
    }
}

package com.sofascore.model.newNetwork.statistics.season.team;

import defpackage.duf;
import defpackage.fuf;
import defpackage.r5h;
import defpackage.zvg;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatistics;", "", "Companion", "Lcom/sofascore/model/newNetwork/statistics/season/team/BasketballRankedStatistics;", "Lcom/sofascore/model/newNetwork/statistics/season/team/BasketballTeamSeasonStatistics;", "Lcom/sofascore/model/newNetwork/statistics/season/team/FootballTeamSeasonStatistics;", "Lcom/sofascore/model/newNetwork/statistics/season/team/FutsalTeamSeasonStatistics;", "Lcom/sofascore/model/newNetwork/statistics/season/team/RugbyTeamSeasonStatistics;", "Lcom/sofascore/model/newNetwork/statistics/season/team/TennisTeamSeasonStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface TeamSeasonStatistics {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            fuf fufVar = duf.a;
            return new zvg("com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatistics", fufVar.getOrCreateKotlinClass(TeamSeasonStatistics.class), new KClass[]{fufVar.getOrCreateKotlinClass(BasketballRankedStatistics.class), fufVar.getOrCreateKotlinClass(BasketballTeamSeasonStatistics.class), fufVar.getOrCreateKotlinClass(FootballTeamSeasonStatistics.class), fufVar.getOrCreateKotlinClass(FutsalTeamSeasonStatistics.class), fufVar.getOrCreateKotlinClass(RugbyTeamSeasonStatistics.class), fufVar.getOrCreateKotlinClass(TennisTeamSeasonStatistics.class)}, new KSerializer[]{BasketballRankedStatistics$$serializer.INSTANCE, BasketballTeamSeasonStatistics$$serializer.INSTANCE, FootballTeamSeasonStatistics$$serializer.INSTANCE, FutsalTeamSeasonStatistics$$serializer.INSTANCE, RugbyTeamSeasonStatistics$$serializer.INSTANCE, TennisTeamSeasonStatistics$$serializer.INSTANCE}, new Annotation[0]);
        }
    }
}

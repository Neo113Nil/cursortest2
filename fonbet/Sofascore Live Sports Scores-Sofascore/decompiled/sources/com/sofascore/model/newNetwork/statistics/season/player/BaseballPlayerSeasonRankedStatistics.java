package com.sofascore.model.newNetwork.statistics.season.player;

import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Season$$serializer;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002\"!B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballPlayerSeasonRankedStatistics;", "", "Lcom/sofascore/model/mvvm/model/Season;", TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, "Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistics;", "rankings", "", "type", "<init>", "(Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistics;Ljava/lang/String;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistics;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballPlayerSeasonRankedStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/Season;", "getSeason", "()Lcom/sofascore/model/mvvm/model/Season;", "Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistics;", "getRankings", "()Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballRankedStatistics;", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BaseballPlayerSeasonRankedStatistics {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final BaseballRankedStatistics rankings;

    @NotNull
    private final Season season;

    @Nullable
    private final String type;

    public /* synthetic */ BaseballPlayerSeasonRankedStatistics(int i, Season season, BaseballRankedStatistics baseballRankedStatistics, String str, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, BaseballPlayerSeasonRankedStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.season = season;
        this.rankings = baseballRankedStatistics;
        this.type = str;
    }

    public static final /* synthetic */ void write$Self$model_release(BaseballPlayerSeasonRankedStatistics self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, Season$$serializer.INSTANCE, self.season);
        output.h(serialDesc, 1, BaseballRankedStatistics$$serializer.INSTANCE, self.rankings);
        output.h(serialDesc, 2, uhi.a, self.type);
    }

    @Nullable
    public final BaseballRankedStatistics getRankings() {
        return this.rankings;
    }

    @NotNull
    public final Season getSeason() {
        return this.season;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballPlayerSeasonRankedStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/season/player/BaseballPlayerSeasonRankedStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BaseballPlayerSeasonRankedStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BaseballPlayerSeasonRankedStatistics(@NotNull Season season, @Nullable BaseballRankedStatistics baseballRankedStatistics, @Nullable String str) {
        season.getClass();
        this.season = season;
        this.rankings = baseballRankedStatistics;
        this.type = str;
    }
}

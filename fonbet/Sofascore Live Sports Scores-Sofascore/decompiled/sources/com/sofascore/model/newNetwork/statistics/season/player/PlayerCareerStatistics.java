package com.sofascore.model.newNetwork.statistics.season.player;

import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uye;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001c*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u001d\u001cB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB1\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJG\u0010\u0018\u001a\u00020\u0015\"\n\b\u0001\u0010\u0002*\u0004\u0018\u00010\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerCareerStatistics;", "Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;", "T", "", "", "Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerSeasonStatisticsInfo;", "seasons", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerCareerStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/KSerializer;)V", "write$Self", "Ljava/util/List;", "getSeasons", "()Ljava/util/List;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PlayerCareerStatistics<T extends AbstractPlayerSeasonStatistics> {

    @NotNull
    private static final SerialDescriptor $cachedDescriptor;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<PlayerSeasonStatisticsInfo<T>> seasons;

    static {
        uye uyeVar = new uye("com.sofascore.model.newNetwork.statistics.season.player.PlayerCareerStatistics", null, 1);
        uyeVar.j("seasons", false);
        $cachedDescriptor = uyeVar;
    }

    public /* synthetic */ PlayerCareerStatistics(int i, List list, t5h t5hVar) {
        if (1 == (i & 1)) {
            this.seasons = list;
        } else {
            oea.z(i, 1, $cachedDescriptor);
            throw null;
        }
    }

    @NotNull
    public final List<PlayerSeasonStatisticsInfo<T>> getSeasons() {
        return this.seasons;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\"\u0004\b\u0001\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005¨\u0006\t"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerCareerStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerCareerStatistics;", "T", "typeSerial0", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> KSerializer serializer(@NotNull KSerializer typeSerial0) {
            typeSerial0.getClass();
            return new PlayerCareerStatistics$$serializer(typeSerial0);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerCareerStatistics(@NotNull List<? extends PlayerSeasonStatisticsInfo<? extends T>> list) {
        list.getClass();
        this.seasons = list;
    }
}

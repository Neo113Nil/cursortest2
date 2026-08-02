package com.sofascore.model.network.response;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.network.response.serializers.PlayerEventStatisticsSerializer;
import defpackage.r5h;
import java.io.Serializable;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = PlayerEventStatisticsSerializer.class)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\n\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/sofascore/model/network/response/PlayerEventStatistics;", "Ljava/io/Serializable;", CampaignEx.JSON_KEY_STAR, "", "getRating", "()Ljava/lang/Double;", "Companion", "Lcom/sofascore/model/network/response/AmericanFootballPlayerEventStatistics;", "Lcom/sofascore/model/network/response/BaseballPlayerEventStatistics;", "Lcom/sofascore/model/network/response/BasketballPlayerEventStatistics;", "Lcom/sofascore/model/network/response/FootballPlayerEventStatistics;", "Lcom/sofascore/model/network/response/FutsalPlayerEventStatistics;", "Lcom/sofascore/model/network/response/HandballPlayerEventStatistics;", "Lcom/sofascore/model/network/response/IceHockeyPlayerEventStatistics;", "Lcom/sofascore/model/network/response/OtherPlayerEventStatistics;", "Lcom/sofascore/model/network/response/RugbyPlayerEventStatistics;", "Lcom/sofascore/model/network/response/VolleyballPlayerEventStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PlayerEventStatistics extends Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/PlayerEventStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/PlayerEventStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerEventStatisticsSerializer.INSTANCE;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @Nullable
        public static Double getRating(@NotNull PlayerEventStatistics playerEventStatistics) {
            return PlayerEventStatistics.super.getRating();
        }
    }

    @Nullable
    default Double getRating() {
        return null;
    }
}

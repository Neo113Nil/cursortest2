package com.sofascore.model.network.response.serializers;

import com.sofascore.model.Sports;
import com.sofascore.model.network.response.AmericanFootballPlayerEventStatistics;
import com.sofascore.model.network.response.BaseballPlayerEventStatistics;
import com.sofascore.model.network.response.BasketballPlayerEventStatistics;
import com.sofascore.model.network.response.FootballPlayerEventStatistics;
import com.sofascore.model.network.response.FutsalPlayerEventStatistics;
import com.sofascore.model.network.response.HandballPlayerEventStatistics;
import com.sofascore.model.network.response.IceHockeyPlayerEventStatistics;
import com.sofascore.model.network.response.OtherPlayerEventStatistics;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.network.response.RugbyPlayerEventStatistics;
import com.sofascore.model.network.response.VolleyballPlayerEventStatistics;
import defpackage.duf;
import defpackage.dy4;
import defpackage.hfa;
import defpackage.qfa;
import kotlin.Metadata;
import kotlinx.serialization.json.b;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/sofascore/model/network/response/serializers/PlayerEventStatisticsSerializer;", "Lhfa;", "Lcom/sofascore/model/network/response/PlayerEventStatistics;", "<init>", "()V", "Lkotlinx/serialization/json/b;", "element", "Ldy4;", "selectDeserializer", "(Lkotlinx/serialization/json/b;)Ldy4;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PlayerEventStatisticsSerializer extends hfa {

    @NotNull
    public static final PlayerEventStatisticsSerializer INSTANCE = new PlayerEventStatisticsSerializer();

    private PlayerEventStatisticsSerializer() {
        super(duf.a.getOrCreateKotlinClass(PlayerEventStatistics.class));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // defpackage.hfa
    @NotNull
    public dy4 selectDeserializer(@NotNull b element) {
        b bVar;
        element.getClass();
        b bVar2 = (b) qfa.g(element).get("statisticsType");
        String c = (bVar2 == null || (bVar = (b) qfa.g(bVar2).get("sportSlug")) == null) ? null : qfa.h(bVar).c();
        if (c != null) {
            switch (c.hashCode()) {
                case -2002238939:
                    if (c.equals(Sports.ICE_HOCKEY)) {
                        return IceHockeyPlayerEventStatistics.INSTANCE.serializer();
                    }
                    break;
                case -1721090992:
                    if (c.equals(Sports.BASEBALL)) {
                        return BaseballPlayerEventStatistics.INSTANCE.serializer();
                    }
                    break;
                case -1263172551:
                    if (c.equals(Sports.FUTSAL)) {
                        return FutsalPlayerEventStatistics.INSTANCE.serializer();
                    }
                    break;
                case -1160328212:
                    if (c.equals(Sports.VOLLEYBALL)) {
                        return VolleyballPlayerEventStatistics.INSTANCE.serializer();
                    }
                    break;
                case -83759494:
                    if (c.equals(Sports.AMERICAN_FOOTBALL)) {
                        return AmericanFootballPlayerEventStatistics.INSTANCE.serializer();
                    }
                    break;
                case 1767150:
                    if (c.equals(Sports.HANDBALL)) {
                        return HandballPlayerEventStatistics.INSTANCE.serializer();
                    }
                    break;
                case 108869083:
                    if (c.equals(Sports.RUGBY)) {
                        return RugbyPlayerEventStatistics.INSTANCE.serializer();
                    }
                    break;
                case 394668909:
                    if (c.equals(Sports.FOOTBALL)) {
                        return FootballPlayerEventStatistics.INSTANCE.serializer();
                    }
                    break;
                case 727149765:
                    if (c.equals(Sports.BASKETBALL)) {
                        return BasketballPlayerEventStatistics.INSTANCE.serializer();
                    }
                    break;
            }
        }
        return OtherPlayerEventStatistics.INSTANCE.serializer();
    }
}

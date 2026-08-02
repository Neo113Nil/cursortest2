package com.sofascore.model.newNetwork.topperformance.response;

import defpackage.duf;
import defpackage.eej;
import defpackage.fuf;
import defpackage.joa;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.zvg;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0018\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "", "<init>", "()V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Lcom/sofascore/model/newNetwork/topperformance/response/AmericanFootballTopPlayersStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/BaseballTopPlayersStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/BaseballTopStatsStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/BasketballTopPlayersStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/BasketballTopStatsPerGameStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/BasketballTopTeamsStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/CricketTopPlayerStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/FootballTopPlayersStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/FootballTopStatsPerGameStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/FootballTopTeamsStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/FutsalTopPlayersStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/FutsalTopTeamsStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/HandballTopPlayersStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/HandballTopStatsPerGameStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/HandballTopTeamsStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopPlayersStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopStatsPerGameStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopTeamsStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/RugbyTopPlayersStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/RugbyTopTeamsStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TennisTopTeamsStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/VolleyballTopPlayersStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/VolleyballTopStatsPerGameStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/VolleyballTopTeamsStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class TopPerformanceStatistics {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa $cachedSerializer$delegate = ypa.a(ysa.b, new eej(8));

    public /* synthetic */ TopPerformanceStatistics(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        fuf fufVar = duf.a;
        return new zvg("com.sofascore.model.newNetwork.topperformance.response.TopPerformanceStatistics", fufVar.getOrCreateKotlinClass(TopPerformanceStatistics.class), new KClass[]{fufVar.getOrCreateKotlinClass(AmericanFootballTopPlayersStatistics.class), fufVar.getOrCreateKotlinClass(BaseballTopPlayersStatistics.class), fufVar.getOrCreateKotlinClass(BaseballTopStatsStatistics.class), fufVar.getOrCreateKotlinClass(BasketballTopPlayersStatistics.class), fufVar.getOrCreateKotlinClass(BasketballTopStatsPerGameStatistics.class), fufVar.getOrCreateKotlinClass(BasketballTopTeamsStatistics.class), fufVar.getOrCreateKotlinClass(CricketTopPlayerStatistics.class), fufVar.getOrCreateKotlinClass(FootballTopPlayersStatistics.class), fufVar.getOrCreateKotlinClass(FootballTopStatsPerGameStatistics.class), fufVar.getOrCreateKotlinClass(FootballTopTeamsStatistics.class), fufVar.getOrCreateKotlinClass(FutsalTopPlayersStatistics.class), fufVar.getOrCreateKotlinClass(FutsalTopTeamsStatistics.class), fufVar.getOrCreateKotlinClass(HandballTopPlayersStatistics.class), fufVar.getOrCreateKotlinClass(HandballTopStatsPerGameStatistics.class), fufVar.getOrCreateKotlinClass(HandballTopTeamsStatistics.class), fufVar.getOrCreateKotlinClass(IceHockeyTopPlayersStatistics.class), fufVar.getOrCreateKotlinClass(IceHockeyTopStatsPerGameStatistics.class), fufVar.getOrCreateKotlinClass(IceHockeyTopTeamsStatistics.class), fufVar.getOrCreateKotlinClass(RugbyTopPlayersStatistics.class), fufVar.getOrCreateKotlinClass(RugbyTopTeamsStatistics.class), fufVar.getOrCreateKotlinClass(TennisTopTeamsStatistics.class), fufVar.getOrCreateKotlinClass(VolleyballTopPlayersStatistics.class), fufVar.getOrCreateKotlinClass(VolleyballTopStatsPerGameStatistics.class), fufVar.getOrCreateKotlinClass(VolleyballTopTeamsStatistics.class)}, new KSerializer[]{AmericanFootballTopPlayersStatistics$$serializer.INSTANCE, BaseballTopPlayersStatistics$$serializer.INSTANCE, BaseballTopStatsStatistics$$serializer.INSTANCE, BasketballTopPlayersStatistics$$serializer.INSTANCE, BasketballTopStatsPerGameStatistics$$serializer.INSTANCE, BasketballTopTeamsStatistics$$serializer.INSTANCE, CricketTopPlayerStatistics$$serializer.INSTANCE, FootballTopPlayersStatistics$$serializer.INSTANCE, FootballTopStatsPerGameStatistics$$serializer.INSTANCE, FootballTopTeamsStatistics$$serializer.INSTANCE, FutsalTopPlayersStatistics$$serializer.INSTANCE, FutsalTopTeamsStatistics$$serializer.INSTANCE, HandballTopPlayersStatistics$$serializer.INSTANCE, HandballTopStatsPerGameStatistics$$serializer.INSTANCE, HandballTopTeamsStatistics$$serializer.INSTANCE, IceHockeyTopPlayersStatistics$$serializer.INSTANCE, IceHockeyTopStatsPerGameStatistics$$serializer.INSTANCE, IceHockeyTopTeamsStatistics$$serializer.INSTANCE, RugbyTopPlayersStatistics$$serializer.INSTANCE, RugbyTopTeamsStatistics$$serializer.INSTANCE, TennisTopTeamsStatistics$$serializer.INSTANCE, VolleyballTopPlayersStatistics$$serializer.INSTANCE, VolleyballTopStatsPerGameStatistics$$serializer.INSTANCE, VolleyballTopTeamsStatistics$$serializer.INSTANCE}, new Annotation[0]);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) TopPerformanceStatistics.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    private TopPerformanceStatistics() {
    }

    public /* synthetic */ TopPerformanceStatistics(int i, t5h t5hVar) {
    }

    public static final /* synthetic */ void write$Self(TopPerformanceStatistics self, wf3 output, SerialDescriptor serialDesc) {
    }
}

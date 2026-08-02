package com.sofascore.model.newNetwork.statistics.season.player;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import com.sofascore.model.newNetwork.statistics.season.player.AmericanFootballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.BasketballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.IceHockeyPlayerSeasonStatistics;
import defpackage.a0f;
import defpackage.c0;
import defpackage.duf;
import defpackage.joa;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\b'\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;", "", "<init>", "()V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "sportHasRating", "()Z", "getId", "()I", "id", "", "getType", "()Ljava/lang/String;", "type", "getAppearances", "()Ljava/lang/Integer;", "appearances", "", "getRating", "()Ljava/lang/Double;", CampaignEx.JSON_KEY_STAR, "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AbstractPlayerSeasonStatistics {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa $cachedSerializer$delegate = ypa.a(ysa.b, new c0(8));

    public AbstractPlayerSeasonStatistics() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        return new a0f(duf.a.getOrCreateKotlinClass(AbstractPlayerSeasonStatistics.class), new Annotation[0]);
    }

    @Nullable
    public abstract Integer getAppearances();

    public abstract int getId();

    @Nullable
    public abstract Double getRating();

    @NotNull
    public abstract String getType();

    public boolean sportHasRating() {
        return false;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\u001b\u0010\u0004\u001a\u0004\u0018\u00010\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u0016\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0007J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010¨\u0006\u0011"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics$Companion;", "", "<init>", "()V", "nullableSum", "", "values", "", "(Ljava/util/List;)Ljava/lang/Integer;", "", "(Ljava/util/List;)Ljava/lang/Double;", "nullableAverageDouble", "aggregate", "Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "serializer", "Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) AbstractPlayerSeasonStatistics.$cachedSerializer$delegate.getValue();
        }

        @Nullable
        public final AbstractPlayerSeasonStatistics aggregate(@NotNull List<? extends AbstractPlayerSeasonStatistics> statistics) {
            statistics.getClass();
            AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics = (AbstractPlayerSeasonStatistics) CollectionsKt.firstOrNull(statistics);
            if (statistics.size() <= 1) {
                return abstractPlayerSeasonStatistics;
            }
            if (abstractPlayerSeasonStatistics instanceof BasketballPlayerSeasonStatistics) {
                BasketballPlayerSeasonStatistics.Companion companion = BasketballPlayerSeasonStatistics.Companion;
                ArrayList arrayList = new ArrayList();
                for (Object obj : statistics) {
                    if (obj instanceof BasketballPlayerSeasonStatistics) {
                        arrayList.add(obj);
                    }
                }
                return companion.aggregate(arrayList);
            }
            if (abstractPlayerSeasonStatistics instanceof FootballPlayerSeasonStatistics) {
                FootballPlayerSeasonStatistics.Companion companion2 = FootballPlayerSeasonStatistics.Companion;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : statistics) {
                    if (obj2 instanceof FootballPlayerSeasonStatistics) {
                        arrayList2.add(obj2);
                    }
                }
                return companion2.aggregate(arrayList2);
            }
            if (abstractPlayerSeasonStatistics instanceof IceHockeyPlayerSeasonStatistics) {
                IceHockeyPlayerSeasonStatistics.Companion companion3 = IceHockeyPlayerSeasonStatistics.Companion;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : statistics) {
                    if (obj3 instanceof IceHockeyPlayerSeasonStatistics) {
                        arrayList3.add(obj3);
                    }
                }
                return companion3.aggregate(arrayList3);
            }
            if (abstractPlayerSeasonStatistics instanceof AmericanFootballPlayerSeasonStatistics) {
                AmericanFootballPlayerSeasonStatistics.Companion companion4 = AmericanFootballPlayerSeasonStatistics.INSTANCE;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : statistics) {
                    if (obj4 instanceof AmericanFootballPlayerSeasonStatistics) {
                        arrayList4.add(obj4);
                    }
                }
                return companion4.aggregate(arrayList4);
            }
            if (!(abstractPlayerSeasonStatistics instanceof BaseballPlayerSeasonStatistics)) {
                return null;
            }
            BaseballPlayerSeasonStatistics.Companion companion5 = BaseballPlayerSeasonStatistics.Companion;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj5 : statistics) {
                if (obj5 instanceof BaseballPlayerSeasonStatistics) {
                    arrayList5.add(obj5);
                }
            }
            return companion5.aggregate(arrayList5);
        }

        @Nullable
        public final Double nullableAverageDouble(@NotNull List<Double> values) {
            values.getClass();
            if (values.isEmpty()) {
                return null;
            }
            return Double.valueOf(CollectionsKt.O(values));
        }

        @Nullable
        /* renamed from: nullableSum, reason: collision with other method in class */
        public final Integer m690nullableSum(@NotNull List<Integer> values) {
            values.getClass();
            if (values.isEmpty()) {
                return null;
            }
            return Integer.valueOf(CollectionsKt.K0(values));
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }

        @Nullable
        public final Double nullableSum(@NotNull List<Double> values) {
            values.getClass();
            if (values.isEmpty()) {
                return null;
            }
            return Double.valueOf(CollectionsKt.J0(values));
        }
    }

    public /* synthetic */ AbstractPlayerSeasonStatistics(int i, t5h t5hVar) {
    }

    public static final /* synthetic */ void write$Self(AbstractPlayerSeasonStatistics self, wf3 output, SerialDescriptor serialDesc) {
    }
}

package com.sofascore.model.network.response;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.TeamSides;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.gz8;
import defpackage.h75;
import defpackage.hz8;
import defpackage.joa;
import defpackage.jp5;
import defpackage.mz1;
import defpackage.oea;
import defpackage.q5h;
import defpackage.qt5;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.w1l;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 u2\u00020\u0001:\u0003vwuB\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017BÇ\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u0016\u0010 J\u0017\u0010#\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b'\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b*\u0010$J\u0017\u0010+\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b+\u0010&J\u0017\u0010,\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b,\u0010&J\u0019\u0010-\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b-\u0010)J\u0017\u0010.\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u00101J\u0012\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b9\u0010:J¤\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b=\u00101J\u0010\u0010>\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b>\u0010?J\u001a\u0010B\u001a\u00020\b2\b\u0010A\u001a\u0004\u0018\u00010@HÖ\u0003¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\bD\u00101J\u0010\u0010E\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\bE\u00101J\u0010\u0010F\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\bF\u0010?J\u0010\u0010G\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\bG\u00101J\u0010\u0010H\u001a\u00020\fHÂ\u0003¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\fHÂ\u0003¢\u0006\u0004\bJ\u0010IJ\u0012\u0010K\u001a\u0004\u0018\u00010\fHÂ\u0003¢\u0006\u0004\bK\u0010LJ\u0012\u0010M\u001a\u0004\u0018\u00010\fHÂ\u0003¢\u0006\u0004\bM\u0010LJ'\u0010V\u001a\u00020S2\u0006\u0010N\u001a\u00020\u00002\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020QH\u0001¢\u0006\u0004\bT\u0010UR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010W\u001a\u0004\bX\u00101R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010WR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010WR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010YR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010Z\u001a\u0004\b[\u00103R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010WR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010W\u001a\u0004\b\\\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010]R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010]R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010^R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010^R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010_\u001a\u0004\b`\u00106R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010a\u0012\u0004\bc\u0010d\u001a\u0004\bb\u00108R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010e\u001a\u0004\bf\u0010:R\"\u0010\u0019\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010Z\u001a\u0004\bg\u00103\"\u0004\bh\u0010iR\"\u0010\u001a\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010Z\u001a\u0004\bj\u00103\"\u0004\bk\u0010iR\"\u0010\u001b\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010Z\u001a\u0004\bl\u00103\"\u0004\bm\u0010iR\"\u0010\u001c\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010Z\u001a\u0004\bn\u00103\"\u0004\bo\u0010iR\"\u0010\u001d\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010Z\u001a\u0004\bp\u00103\"\u0004\bq\u0010iR\u0011\u0010s\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\br\u00103R\u0011\u0010t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bt\u00103¨\u0006x"}, d2 = {"Lcom/sofascore/model/network/response/EventStatisticsItem;", "Ljava/io/Serializable;", "", "name", "home", "away", "", "compareCode", "", "otherPlayerSelected", "statisticsType", "valueType", "", "homeValue", "awayValue", "homeTotal", "awayTotal", "renderType", "Lcom/sofascore/model/network/response/EventStatisticsItem$SpecialEventStatisticType;", "specialStatisticType", "Lcom/sofascore/model/network/response/TeamAverageRatingVersion;", "avgRatingVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Lcom/sofascore/model/network/response/EventStatisticsItem$SpecialEventStatisticType;Lcom/sofascore/model/network/response/TeamAverageRatingVersion;)V", "seen0", "hideDivider", "roundTop", "roundBottom", "shouldReverseTeams", "shouldRoundToInt", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Lcom/sofascore/model/network/response/EventStatisticsItem$SpecialEventStatisticType;Lcom/sofascore/model/network/response/TeamAverageRatingVersion;ZZZZZLt5h;)V", "Lcom/sofascore/model/mvvm/model/TeamSides;", "side", "getHome", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Ljava/lang/String;", "getHomeValue", "(Lcom/sofascore/model/mvvm/model/TeamSides;)D", "getAbsoluteHomeValue", "getHomeTotal", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Ljava/lang/Double;", "getAway", "getAwayValue", "getAbsoluteAwayValue", "getAwayTotal", "getCompareCode", "(Lcom/sofascore/model/mvvm/model/TeamSides;)I", "component1", "()Ljava/lang/String;", "component5", "()Z", "component7", "component12", "()Ljava/lang/Integer;", "component13", "()Lcom/sofascore/model/network/response/EventStatisticsItem$SpecialEventStatisticType;", "component14", "()Lcom/sofascore/model/network/response/TeamAverageRatingVersion;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Lcom/sofascore/model/network/response/EventStatisticsItem$SpecialEventStatisticType;Lcom/sofascore/model/network/response/TeamAverageRatingVersion;)Lcom/sofascore/model/network/response/EventStatisticsItem;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "component2", "component3", "component4", "component6", "component8", "()D", "component9", "component10", "()Ljava/lang/Double;", "component11", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/EventStatisticsItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getName", "I", "Z", "getOtherPlayerSelected", "getValueType", "D", "Ljava/lang/Double;", "Ljava/lang/Integer;", "getRenderType", "Lcom/sofascore/model/network/response/EventStatisticsItem$SpecialEventStatisticType;", "getSpecialStatisticType", "getSpecialStatisticType$annotations", "()V", "Lcom/sofascore/model/network/response/TeamAverageRatingVersion;", "getAvgRatingVersion", "getHideDivider", "setHideDivider", "(Z)V", "getRoundTop", "setRoundTop", "getRoundBottom", "setRoundBottom", "getShouldReverseTeams", "setShouldReverseTeams", "getShouldRoundToInt", "setShouldRoundToInt", "getHasTeamValueType", "hasTeamValueType", "isNegativeStatistic", "Companion", "SpecialEventStatisticType", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EventStatisticsItem implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final TeamAverageRatingVersion avgRatingVersion;

    @NotNull
    private final String away;

    @Nullable
    private final Double awayTotal;
    private final double awayValue;
    private final int compareCode;
    private boolean hideDivider;

    @NotNull
    private final String home;

    @Nullable
    private final Double homeTotal;
    private final double homeValue;

    @NotNull
    private final String name;
    private final boolean otherPlayerSelected;

    @Nullable
    private final Integer renderType;
    private boolean roundBottom;
    private boolean roundTop;
    private boolean shouldReverseTeams;
    private boolean shouldRoundToInt;

    @Nullable
    private final SpecialEventStatisticType specialStatisticType;

    @NotNull
    private final String statisticsType;

    @NotNull
    private final String valueType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/sofascore/model/network/response/EventStatisticsItem$SpecialEventStatisticType;", "", "<init>", "(Ljava/lang/String;I)V", "ExpectedGoals", "ExpectedGoalsOnTarget", "GoalsPrevented", "DistanceCovered", "KeyPasses", "Corsi", "Fenwick", "AverageShotDistance", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SpecialEventStatisticType {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ SpecialEventStatisticType[] $VALUES;

        @q5h("expectedGoals")
        public static final SpecialEventStatisticType ExpectedGoals = new SpecialEventStatisticType("ExpectedGoals", 0);

        @q5h("expectedGoalsOnTarget")
        public static final SpecialEventStatisticType ExpectedGoalsOnTarget = new SpecialEventStatisticType("ExpectedGoalsOnTarget", 1);

        @q5h("goalsPrevented")
        public static final SpecialEventStatisticType GoalsPrevented = new SpecialEventStatisticType("GoalsPrevented", 2);

        @q5h("distanceCovered")
        public static final SpecialEventStatisticType DistanceCovered = new SpecialEventStatisticType("DistanceCovered", 3);

        @q5h("keyPasses")
        public static final SpecialEventStatisticType KeyPasses = new SpecialEventStatisticType("KeyPasses", 4);

        @q5h("corsiPct")
        public static final SpecialEventStatisticType Corsi = new SpecialEventStatisticType("Corsi", 5);

        @q5h("fenwickPct")
        public static final SpecialEventStatisticType Fenwick = new SpecialEventStatisticType("Fenwick", 6);

        @q5h("averageShotDistance")
        public static final SpecialEventStatisticType AverageShotDistance = new SpecialEventStatisticType("AverageShotDistance", 7);

        private static final /* synthetic */ SpecialEventStatisticType[] $values() {
            return new SpecialEventStatisticType[]{ExpectedGoals, ExpectedGoalsOnTarget, GoalsPrevented, DistanceCovered, KeyPasses, Corsi, Fenwick, AverageShotDistance};
        }

        static {
            SpecialEventStatisticType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private SpecialEventStatisticType(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static SpecialEventStatisticType valueOf(String str) {
            return (SpecialEventStatisticType) Enum.valueOf(SpecialEventStatisticType.class, str);
        }

        public static SpecialEventStatisticType[] values() {
            return (SpecialEventStatisticType[]) $VALUES.clone();
        }
    }

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new qt5(17)), ypa.a(ysaVar, new qt5(18)), null, null, null, null, null};
    }

    public /* synthetic */ EventStatisticsItem(int i, String str, String str2, String str3, int i2, boolean z, String str4, String str5, double d, double d2, Double d3, Double d4, Integer num, SpecialEventStatisticType specialEventStatisticType, TeamAverageRatingVersion teamAverageRatingVersion, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, t5h t5hVar) {
        if (4079 != (i & 4079)) {
            oea.z(i, 4079, EventStatisticsItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.name = str;
        this.home = str2;
        this.away = str3;
        this.compareCode = i2;
        if ((i & 16) == 0) {
            this.otherPlayerSelected = false;
        } else {
            this.otherPlayerSelected = z;
        }
        this.statisticsType = str4;
        this.valueType = str5;
        this.homeValue = d;
        this.awayValue = d2;
        this.homeTotal = d3;
        this.awayTotal = d4;
        this.renderType = num;
        if ((i & 4096) == 0) {
            this.specialStatisticType = null;
        } else {
            this.specialStatisticType = specialEventStatisticType;
        }
        this.avgRatingVersion = (i & 8192) == 0 ? TeamAverageRatingVersion.ORIGINAL : teamAverageRatingVersion;
        if ((i & 16384) == 0) {
            this.hideDivider = false;
        } else {
            this.hideDivider = z2;
        }
        if ((32768 & i) == 0) {
            this.roundTop = false;
        } else {
            this.roundTop = z3;
        }
        if ((65536 & i) == 0) {
            this.roundBottom = false;
        } else {
            this.roundBottom = z4;
        }
        if ((131072 & i) == 0) {
            this.shouldReverseTeams = false;
        } else {
            this.shouldReverseTeams = z5;
        }
        if ((i & 262144) == 0) {
            this.shouldRoundToInt = false;
        } else {
            this.shouldRoundToInt = z6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return hz8.F("com.sofascore.model.network.response.EventStatisticsItem.SpecialEventStatisticType", SpecialEventStatisticType.values(), new String[]{"expectedGoals", "expectedGoalsOnTarget", "goalsPrevented", "distanceCovered", "keyPasses", "corsiPct", "fenwickPct", "averageShotDistance"}, new Annotation[][]{null, null, null, null, null, null, null, null});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return TeamAverageRatingVersion.INSTANCE.serializer();
    }

    /* renamed from: component10, reason: from getter */
    private final Double getHomeTotal() {
        return this.homeTotal;
    }

    /* renamed from: component11, reason: from getter */
    private final Double getAwayTotal() {
        return this.awayTotal;
    }

    /* renamed from: component2, reason: from getter */
    private final String getHome() {
        return this.home;
    }

    /* renamed from: component3, reason: from getter */
    private final String getAway() {
        return this.away;
    }

    /* renamed from: component4, reason: from getter */
    private final int getCompareCode() {
        return this.compareCode;
    }

    /* renamed from: component6, reason: from getter */
    private final String getStatisticsType() {
        return this.statisticsType;
    }

    /* renamed from: component8, reason: from getter */
    private final double getHomeValue() {
        return this.homeValue;
    }

    /* renamed from: component9, reason: from getter */
    private final double getAwayValue() {
        return this.awayValue;
    }

    public static /* synthetic */ double getAbsoluteAwayValue$default(EventStatisticsItem eventStatisticsItem, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return eventStatisticsItem.getAbsoluteAwayValue(teamSides);
    }

    public static /* synthetic */ double getAbsoluteHomeValue$default(EventStatisticsItem eventStatisticsItem, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return eventStatisticsItem.getAbsoluteHomeValue(teamSides);
    }

    public static /* synthetic */ String getAway$default(EventStatisticsItem eventStatisticsItem, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return eventStatisticsItem.getAway(teamSides);
    }

    public static /* synthetic */ Double getAwayTotal$default(EventStatisticsItem eventStatisticsItem, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return eventStatisticsItem.getAwayTotal(teamSides);
    }

    public static /* synthetic */ double getAwayValue$default(EventStatisticsItem eventStatisticsItem, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return eventStatisticsItem.getAwayValue(teamSides);
    }

    public static /* synthetic */ int getCompareCode$default(EventStatisticsItem eventStatisticsItem, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return eventStatisticsItem.getCompareCode(teamSides);
    }

    public static /* synthetic */ String getHome$default(EventStatisticsItem eventStatisticsItem, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return eventStatisticsItem.getHome(teamSides);
    }

    public static /* synthetic */ Double getHomeTotal$default(EventStatisticsItem eventStatisticsItem, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return eventStatisticsItem.getHomeTotal(teamSides);
    }

    public static /* synthetic */ double getHomeValue$default(EventStatisticsItem eventStatisticsItem, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return eventStatisticsItem.getHomeValue(teamSides);
    }

    public static final /* synthetic */ void write$Self$model_release(EventStatisticsItem self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.y(serialDesc, 0, self.name);
        output.y(serialDesc, 1, self.home);
        output.y(serialDesc, 2, self.away);
        output.u(3, self.compareCode, serialDesc);
        if (output.o(serialDesc) || self.otherPlayerSelected) {
            output.x(serialDesc, 4, self.otherPlayerSelected);
        }
        output.y(serialDesc, 5, self.statisticsType);
        output.y(serialDesc, 6, self.valueType);
        output.D(serialDesc, 7, self.homeValue);
        output.D(serialDesc, 8, self.awayValue);
        h75 h75Var = h75.a;
        output.h(serialDesc, 9, h75Var, self.homeTotal);
        output.h(serialDesc, 10, h75Var, self.awayTotal);
        output.h(serialDesc, 11, a7a.a, self.renderType);
        if (output.o(serialDesc) || self.specialStatisticType != null) {
            output.h(serialDesc, 12, (KSerializer) joaVarArr[12].getValue(), self.specialStatisticType);
        }
        if (output.o(serialDesc) || self.avgRatingVersion != TeamAverageRatingVersion.ORIGINAL) {
            output.f(serialDesc, 13, (KSerializer) joaVarArr[13].getValue(), self.avgRatingVersion);
        }
        if (output.o(serialDesc) || self.hideDivider) {
            output.x(serialDesc, 14, self.hideDivider);
        }
        if (output.o(serialDesc) || self.roundTop) {
            output.x(serialDesc, 15, self.roundTop);
        }
        if (output.o(serialDesc) || self.roundBottom) {
            output.x(serialDesc, 16, self.roundBottom);
        }
        if (output.o(serialDesc) || self.shouldReverseTeams) {
            output.x(serialDesc, 17, self.shouldReverseTeams);
        }
        if (output.o(serialDesc) || self.shouldRoundToInt) {
            output.x(serialDesc, 18, self.shouldRoundToInt);
        }
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getRenderType() {
        return this.renderType;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final SpecialEventStatisticType getSpecialStatisticType() {
        return this.specialStatisticType;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final TeamAverageRatingVersion getAvgRatingVersion() {
        return this.avgRatingVersion;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getOtherPlayerSelected() {
        return this.otherPlayerSelected;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getValueType() {
        return this.valueType;
    }

    @NotNull
    public final EventStatisticsItem copy(@NotNull String name, @NotNull String home, @NotNull String away, int compareCode, boolean otherPlayerSelected, @NotNull String statisticsType, @NotNull String valueType, double homeValue, double awayValue, @Nullable Double homeTotal, @Nullable Double awayTotal, @Nullable Integer renderType, @Nullable SpecialEventStatisticType specialStatisticType, @NotNull TeamAverageRatingVersion avgRatingVersion) {
        name.getClass();
        home.getClass();
        away.getClass();
        statisticsType.getClass();
        valueType.getClass();
        avgRatingVersion.getClass();
        return new EventStatisticsItem(name, home, away, compareCode, otherPlayerSelected, statisticsType, valueType, homeValue, awayValue, homeTotal, awayTotal, renderType, specialStatisticType, avgRatingVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventStatisticsItem)) {
            return false;
        }
        EventStatisticsItem eventStatisticsItem = (EventStatisticsItem) other;
        return Intrinsics.c(this.name, eventStatisticsItem.name) && Intrinsics.c(this.home, eventStatisticsItem.home) && Intrinsics.c(this.away, eventStatisticsItem.away) && this.compareCode == eventStatisticsItem.compareCode && this.otherPlayerSelected == eventStatisticsItem.otherPlayerSelected && Intrinsics.c(this.statisticsType, eventStatisticsItem.statisticsType) && Intrinsics.c(this.valueType, eventStatisticsItem.valueType) && Double.compare(this.homeValue, eventStatisticsItem.homeValue) == 0 && Double.compare(this.awayValue, eventStatisticsItem.awayValue) == 0 && Intrinsics.c(this.homeTotal, eventStatisticsItem.homeTotal) && Intrinsics.c(this.awayTotal, eventStatisticsItem.awayTotal) && Intrinsics.c(this.renderType, eventStatisticsItem.renderType) && this.specialStatisticType == eventStatisticsItem.specialStatisticType && this.avgRatingVersion == eventStatisticsItem.avgRatingVersion;
    }

    public final double getAbsoluteAwayValue(@NotNull TeamSides side) {
        side.getClass();
        return Math.abs((side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.homeValue : this.awayValue);
    }

    public final double getAbsoluteHomeValue(@NotNull TeamSides side) {
        side.getClass();
        return Math.abs((side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.awayValue : this.homeValue);
    }

    @NotNull
    public final TeamAverageRatingVersion getAvgRatingVersion() {
        return this.avgRatingVersion;
    }

    @NotNull
    public final String getAway(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.home : this.away;
    }

    @Nullable
    public final Double getAwayTotal(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.homeTotal : this.awayTotal;
    }

    public final double getAwayValue(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.homeValue : this.awayValue;
    }

    public final int getCompareCode(@NotNull TeamSides side) {
        side.getClass();
        if (side != TeamSides.REVERSIBLE || !this.shouldReverseTeams) {
            return this.compareCode;
        }
        int i = this.compareCode;
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i;
        }
        return 1;
    }

    public final boolean getHasTeamValueType() {
        return Intrinsics.c(this.valueType, "team");
    }

    public final boolean getHideDivider() {
        return this.hideDivider;
    }

    @NotNull
    public final String getHome(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.away : this.home;
    }

    @Nullable
    public final Double getHomeTotal(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.awayTotal : this.homeTotal;
    }

    public final double getHomeValue(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.awayValue : this.homeValue;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getOtherPlayerSelected() {
        return this.otherPlayerSelected;
    }

    @Nullable
    public final Integer getRenderType() {
        return this.renderType;
    }

    public final boolean getRoundBottom() {
        return this.roundBottom;
    }

    public final boolean getRoundTop() {
        return this.roundTop;
    }

    public final boolean getShouldReverseTeams() {
        return this.shouldReverseTeams;
    }

    public final boolean getShouldRoundToInt() {
        return this.shouldRoundToInt;
    }

    @Nullable
    public final SpecialEventStatisticType getSpecialStatisticType() {
        return this.specialStatisticType;
    }

    @NotNull
    public final String getValueType() {
        return this.valueType;
    }

    public int hashCode() {
        int b = dmi.b(dmi.b(dmi.c(dmi.c(dmi.e(wv8.a(this.compareCode, dmi.c(dmi.c(this.name.hashCode() * 31, 31, this.home), 31, this.away), 31), 31, this.otherPlayerSelected), 31, this.statisticsType), 31, this.valueType), 31, this.homeValue), 31, this.awayValue);
        Double d = this.homeTotal;
        int hashCode = (b + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.awayTotal;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.renderType;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        SpecialEventStatisticType specialEventStatisticType = this.specialStatisticType;
        return this.avgRatingVersion.hashCode() + ((hashCode3 + (specialEventStatisticType != null ? specialEventStatisticType.hashCode() : 0)) * 31);
    }

    public final boolean isNegativeStatistic() {
        return Intrinsics.c(this.statisticsType, "negative");
    }

    public final void setHideDivider(boolean z) {
        this.hideDivider = z;
    }

    public final void setRoundBottom(boolean z) {
        this.roundBottom = z;
    }

    public final void setRoundTop(boolean z) {
        this.roundTop = z;
    }

    public final void setShouldReverseTeams(boolean z) {
        this.shouldReverseTeams = z;
    }

    public final void setShouldRoundToInt(boolean z) {
        this.shouldRoundToInt = z;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.home;
        String str3 = this.away;
        int i = this.compareCode;
        boolean z = this.otherPlayerSelected;
        String str4 = this.statisticsType;
        String str5 = this.valueType;
        double d = this.homeValue;
        double d2 = this.awayValue;
        Double d3 = this.homeTotal;
        Double d4 = this.awayTotal;
        Integer num = this.renderType;
        SpecialEventStatisticType specialEventStatisticType = this.specialStatisticType;
        TeamAverageRatingVersion teamAverageRatingVersion = this.avgRatingVersion;
        StringBuilder s = mz1.s("EventStatisticsItem(name=", str, ", home=", str2, ", away=");
        w1l.q(i, str3, ", compareCode=", ", otherPlayerSelected=", s);
        s.append(z);
        s.append(", statisticsType=");
        s.append(str4);
        s.append(", valueType=");
        s.append(str5);
        s.append(", homeValue=");
        s.append(d);
        fn0.A(s, ", awayValue=", d2, ", homeTotal=");
        fc6.A(s, d3, ", awayTotal=", d4, ", renderType=");
        s.append(num);
        s.append(", specialStatisticType=");
        s.append(specialEventStatisticType);
        s.append(", avgRatingVersion=");
        s.append(teamAverageRatingVersion);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/EventStatisticsItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/EventStatisticsItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EventStatisticsItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @q5h(U3.i.W)
    public static /* synthetic */ void getSpecialStatisticType$annotations() {
    }

    public EventStatisticsItem(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, boolean z, @NotNull String str4, @NotNull String str5, double d, double d2, @Nullable Double d3, @Nullable Double d4, @Nullable Integer num, @Nullable SpecialEventStatisticType specialEventStatisticType, @NotNull TeamAverageRatingVersion teamAverageRatingVersion) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        teamAverageRatingVersion.getClass();
        this.name = str;
        this.home = str2;
        this.away = str3;
        this.compareCode = i;
        this.otherPlayerSelected = z;
        this.statisticsType = str4;
        this.valueType = str5;
        this.homeValue = d;
        this.awayValue = d2;
        this.homeTotal = d3;
        this.awayTotal = d4;
        this.renderType = num;
        this.specialStatisticType = specialEventStatisticType;
        this.avgRatingVersion = teamAverageRatingVersion;
    }

    public /* synthetic */ EventStatisticsItem(String str, String str2, String str3, int i, boolean z, String str4, String str5, double d, double d2, Double d3, Double d4, Integer num, SpecialEventStatisticType specialEventStatisticType, TeamAverageRatingVersion teamAverageRatingVersion, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i, (i2 & 16) != 0 ? false : z, str4, str5, d, d2, d3, d4, num, (i2 & 4096) != 0 ? null : specialEventStatisticType, (i2 & 8192) != 0 ? TeamAverageRatingVersion.ORIGINAL : teamAverageRatingVersion);
    }
}

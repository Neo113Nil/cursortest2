package com.sofascore.model.buzzer;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.lnb;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wv8;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0002YXB\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016B«\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010 J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010 J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010 J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010 J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010 J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010 J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010 J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010 JÄ\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b6\u0010 J\u001a\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b:\u0010;J'\u0010D\u001a\u00020A2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0001¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010E\u001a\u0004\bF\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010E\u001a\u0004\bG\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bH\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010E\u001a\u0004\bI\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bJ\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bK\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bL\u0010 R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bM\u0010 R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bN\u0010 R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bO\u0010 R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bP\u0010 R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bQ\u0010 R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bR\u0010 R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bS\u0010 R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bT\u0010 R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bU\u0010 R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bV\u0010 R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bW\u0010 ¨\u0006Z"}, d2 = {"Lcom/sofascore/model/buzzer/TileReasonCount;", "Ljava/io/Serializable;", "", BuzzerConfigResponseKt.TOP_EVENT, BuzzerConfigResponseKt.TOP_FOOTBALL_EVENT_PLAYER_PERFORMANCE, BuzzerConfigResponseKt.TOP_BASKETBALL_EVENT_PLAYER_PERFORMANCE, BuzzerConfigResponseKt.ATP_SINGLES_RANKING_CHANGE, BuzzerConfigResponseKt.WTA_SINGLES_RANKING_CHANGE, BuzzerConfigResponseKt.FIFA_RANKING_CHANGE, BuzzerConfigResponseKt.SURPRISE_EVENT_RESULT, BuzzerConfigResponseKt.UT_KEY_MOMENT, BuzzerConfigResponseKt.CUP_PROGRESSION, BuzzerConfigResponseKt.FORMULA_ONE, BuzzerConfigResponseKt.INTERESTING_STATISTIC, BuzzerConfigResponseKt.TRANSFER, BuzzerConfigResponseKt.MMA_EVENT, BuzzerConfigResponseKt.TEAM_OF_THE_WEEK, BuzzerConfigResponseKt.DETAILED_STATISTIC, BuzzerConfigResponseKt.SOFASCORE_RATING, BuzzerConfigResponseKt.WEEKLY_CHALLENGE, BuzzerConfigResponseKt.AI_INSIGHTS, "<init>", "(IIIIIIIIIIIIIIIIII)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIIIIIIIIIIIIIIIIIILt5h;)V", "", "", "getTileReasonList", "()Ljava/util/List;", "component1", "()I", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(IIIIIIIIIIIIIIIIII)Lcom/sofascore/model/buzzer/TileReasonCount;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/buzzer/TileReasonCount;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getTopEvent", "getTopFootballEventPlayerPerformance", "getTopBasketballEventPlayerPerformance", "getATPSinglesRankingChange", "getWTASinglesRankingChange", "getFIFACountryRankingChange", "getSurpriseEventResult", "getUtKeyMoment", "getCupProgression", "getFormulaOne", "getInterestingStatistic", "getTransfer", "getMmaEvent", "getTeamOfTheWeek", "getDetailedStat", "getSofascoreRating", "getWeeklyChallenge", "getAiInsights", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TileReasonCount implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int ATPSinglesRankingChange;
    private final int FIFACountryRankingChange;
    private final int WTASinglesRankingChange;
    private final int aiInsights;
    private final int cupProgression;
    private final int detailedStat;
    private final int formulaOne;
    private final int interestingStatistic;
    private final int mmaEvent;
    private final int sofascoreRating;
    private final int surpriseEventResult;
    private final int teamOfTheWeek;
    private final int topBasketballEventPlayerPerformance;
    private final int topEvent;
    private final int topFootballEventPlayerPerformance;
    private final int transfer;
    private final int utKeyMoment;
    private final int weeklyChallenge;

    public /* synthetic */ TileReasonCount(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, t5h t5hVar) {
        if (262143 != (i & 262143)) {
            oea.z(i, 262143, TileReasonCount$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.topEvent = i2;
        this.topFootballEventPlayerPerformance = i3;
        this.topBasketballEventPlayerPerformance = i4;
        this.ATPSinglesRankingChange = i5;
        this.WTASinglesRankingChange = i6;
        this.FIFACountryRankingChange = i7;
        this.surpriseEventResult = i8;
        this.utKeyMoment = i9;
        this.cupProgression = i10;
        this.formulaOne = i11;
        this.interestingStatistic = i12;
        this.transfer = i13;
        this.mmaEvent = i14;
        this.teamOfTheWeek = i15;
        this.detailedStat = i16;
        this.sofascoreRating = i17;
        this.weeklyChallenge = i18;
        this.aiInsights = i19;
    }

    public static /* synthetic */ TileReasonCount copy$default(TileReasonCount tileReasonCount, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, Object obj) {
        int i20;
        int i21;
        int i22 = (i19 & 1) != 0 ? tileReasonCount.topEvent : i;
        int i23 = (i19 & 2) != 0 ? tileReasonCount.topFootballEventPlayerPerformance : i2;
        int i24 = (i19 & 4) != 0 ? tileReasonCount.topBasketballEventPlayerPerformance : i3;
        int i25 = (i19 & 8) != 0 ? tileReasonCount.ATPSinglesRankingChange : i4;
        int i26 = (i19 & 16) != 0 ? tileReasonCount.WTASinglesRankingChange : i5;
        int i27 = (i19 & 32) != 0 ? tileReasonCount.FIFACountryRankingChange : i6;
        int i28 = (i19 & 64) != 0 ? tileReasonCount.surpriseEventResult : i7;
        int i29 = (i19 & 128) != 0 ? tileReasonCount.utKeyMoment : i8;
        int i30 = (i19 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? tileReasonCount.cupProgression : i9;
        int i31 = (i19 & 512) != 0 ? tileReasonCount.formulaOne : i10;
        int i32 = (i19 & 1024) != 0 ? tileReasonCount.interestingStatistic : i11;
        int i33 = (i19 & a.o) != 0 ? tileReasonCount.transfer : i12;
        int i34 = (i19 & 4096) != 0 ? tileReasonCount.mmaEvent : i13;
        int i35 = (i19 & 8192) != 0 ? tileReasonCount.teamOfTheWeek : i14;
        int i36 = i22;
        int i37 = (i19 & 16384) != 0 ? tileReasonCount.detailedStat : i15;
        int i38 = (i19 & 32768) != 0 ? tileReasonCount.sofascoreRating : i16;
        int i39 = (i19 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? tileReasonCount.weeklyChallenge : i17;
        if ((i19 & 131072) != 0) {
            i21 = i39;
            i20 = tileReasonCount.aiInsights;
        } else {
            i20 = i18;
            i21 = i39;
        }
        return tileReasonCount.copy(i36, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i37, i38, i21, i20);
    }

    public static final /* synthetic */ void write$Self$model_release(TileReasonCount self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.topEvent, serialDesc);
        output.u(1, self.topFootballEventPlayerPerformance, serialDesc);
        output.u(2, self.topBasketballEventPlayerPerformance, serialDesc);
        output.u(3, self.ATPSinglesRankingChange, serialDesc);
        output.u(4, self.WTASinglesRankingChange, serialDesc);
        output.u(5, self.FIFACountryRankingChange, serialDesc);
        output.u(6, self.surpriseEventResult, serialDesc);
        output.u(7, self.utKeyMoment, serialDesc);
        output.u(8, self.cupProgression, serialDesc);
        output.u(9, self.formulaOne, serialDesc);
        output.u(10, self.interestingStatistic, serialDesc);
        output.u(11, self.transfer, serialDesc);
        output.u(12, self.mmaEvent, serialDesc);
        output.u(13, self.teamOfTheWeek, serialDesc);
        output.u(14, self.detailedStat, serialDesc);
        output.u(15, self.sofascoreRating, serialDesc);
        output.u(16, self.weeklyChallenge, serialDesc);
        output.u(17, self.aiInsights, serialDesc);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTopEvent() {
        return this.topEvent;
    }

    /* renamed from: component10, reason: from getter */
    public final int getFormulaOne() {
        return this.formulaOne;
    }

    /* renamed from: component11, reason: from getter */
    public final int getInterestingStatistic() {
        return this.interestingStatistic;
    }

    /* renamed from: component12, reason: from getter */
    public final int getTransfer() {
        return this.transfer;
    }

    /* renamed from: component13, reason: from getter */
    public final int getMmaEvent() {
        return this.mmaEvent;
    }

    /* renamed from: component14, reason: from getter */
    public final int getTeamOfTheWeek() {
        return this.teamOfTheWeek;
    }

    /* renamed from: component15, reason: from getter */
    public final int getDetailedStat() {
        return this.detailedStat;
    }

    /* renamed from: component16, reason: from getter */
    public final int getSofascoreRating() {
        return this.sofascoreRating;
    }

    /* renamed from: component17, reason: from getter */
    public final int getWeeklyChallenge() {
        return this.weeklyChallenge;
    }

    /* renamed from: component18, reason: from getter */
    public final int getAiInsights() {
        return this.aiInsights;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTopFootballEventPlayerPerformance() {
        return this.topFootballEventPlayerPerformance;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTopBasketballEventPlayerPerformance() {
        return this.topBasketballEventPlayerPerformance;
    }

    /* renamed from: component4, reason: from getter */
    public final int getATPSinglesRankingChange() {
        return this.ATPSinglesRankingChange;
    }

    /* renamed from: component5, reason: from getter */
    public final int getWTASinglesRankingChange() {
        return this.WTASinglesRankingChange;
    }

    /* renamed from: component6, reason: from getter */
    public final int getFIFACountryRankingChange() {
        return this.FIFACountryRankingChange;
    }

    /* renamed from: component7, reason: from getter */
    public final int getSurpriseEventResult() {
        return this.surpriseEventResult;
    }

    /* renamed from: component8, reason: from getter */
    public final int getUtKeyMoment() {
        return this.utKeyMoment;
    }

    /* renamed from: component9, reason: from getter */
    public final int getCupProgression() {
        return this.cupProgression;
    }

    @NotNull
    public final TileReasonCount copy(int topEvent, int topFootballEventPlayerPerformance, int topBasketballEventPlayerPerformance, int ATPSinglesRankingChange, int WTASinglesRankingChange, int FIFACountryRankingChange, int surpriseEventResult, int utKeyMoment, int cupProgression, int formulaOne, int interestingStatistic, int transfer, int mmaEvent, int teamOfTheWeek, int detailedStat, int sofascoreRating, int weeklyChallenge, int aiInsights) {
        return new TileReasonCount(topEvent, topFootballEventPlayerPerformance, topBasketballEventPlayerPerformance, ATPSinglesRankingChange, WTASinglesRankingChange, FIFACountryRankingChange, surpriseEventResult, utKeyMoment, cupProgression, formulaOne, interestingStatistic, transfer, mmaEvent, teamOfTheWeek, detailedStat, sofascoreRating, weeklyChallenge, aiInsights);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileReasonCount)) {
            return false;
        }
        TileReasonCount tileReasonCount = (TileReasonCount) other;
        return this.topEvent == tileReasonCount.topEvent && this.topFootballEventPlayerPerformance == tileReasonCount.topFootballEventPlayerPerformance && this.topBasketballEventPlayerPerformance == tileReasonCount.topBasketballEventPlayerPerformance && this.ATPSinglesRankingChange == tileReasonCount.ATPSinglesRankingChange && this.WTASinglesRankingChange == tileReasonCount.WTASinglesRankingChange && this.FIFACountryRankingChange == tileReasonCount.FIFACountryRankingChange && this.surpriseEventResult == tileReasonCount.surpriseEventResult && this.utKeyMoment == tileReasonCount.utKeyMoment && this.cupProgression == tileReasonCount.cupProgression && this.formulaOne == tileReasonCount.formulaOne && this.interestingStatistic == tileReasonCount.interestingStatistic && this.transfer == tileReasonCount.transfer && this.mmaEvent == tileReasonCount.mmaEvent && this.teamOfTheWeek == tileReasonCount.teamOfTheWeek && this.detailedStat == tileReasonCount.detailedStat && this.sofascoreRating == tileReasonCount.sofascoreRating && this.weeklyChallenge == tileReasonCount.weeklyChallenge && this.aiInsights == tileReasonCount.aiInsights;
    }

    public final int getATPSinglesRankingChange() {
        return this.ATPSinglesRankingChange;
    }

    public final int getAiInsights() {
        return this.aiInsights;
    }

    public final int getCupProgression() {
        return this.cupProgression;
    }

    public final int getDetailedStat() {
        return this.detailedStat;
    }

    public final int getFIFACountryRankingChange() {
        return this.FIFACountryRankingChange;
    }

    public final int getFormulaOne() {
        return this.formulaOne;
    }

    public final int getInterestingStatistic() {
        return this.interestingStatistic;
    }

    public final int getMmaEvent() {
        return this.mmaEvent;
    }

    public final int getSofascoreRating() {
        return this.sofascoreRating;
    }

    public final int getSurpriseEventResult() {
        return this.surpriseEventResult;
    }

    public final int getTeamOfTheWeek() {
        return this.teamOfTheWeek;
    }

    @NotNull
    public final List<String> getTileReasonList() {
        ArrayList arrayList = new ArrayList();
        int i = this.topEvent;
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(BuzzerConfigResponseKt.TOP_EVENT);
        }
        int i3 = this.topFootballEventPlayerPerformance;
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(BuzzerConfigResponseKt.TOP_FOOTBALL_EVENT_PLAYER_PERFORMANCE);
        }
        int i5 = this.topBasketballEventPlayerPerformance;
        for (int i6 = 0; i6 < i5; i6++) {
            arrayList.add(BuzzerConfigResponseKt.TOP_BASKETBALL_EVENT_PLAYER_PERFORMANCE);
        }
        int i7 = this.ATPSinglesRankingChange;
        for (int i8 = 0; i8 < i7; i8++) {
            arrayList.add(BuzzerConfigResponseKt.ATP_SINGLES_RANKING_CHANGE);
        }
        int i9 = this.WTASinglesRankingChange;
        for (int i10 = 0; i10 < i9; i10++) {
            arrayList.add(BuzzerConfigResponseKt.WTA_SINGLES_RANKING_CHANGE);
        }
        int i11 = this.FIFACountryRankingChange;
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(BuzzerConfigResponseKt.FIFA_RANKING_CHANGE);
        }
        int i13 = this.surpriseEventResult;
        for (int i14 = 0; i14 < i13; i14++) {
            arrayList.add(BuzzerConfigResponseKt.SURPRISE_EVENT_RESULT);
        }
        int i15 = this.utKeyMoment;
        for (int i16 = 0; i16 < i15; i16++) {
            arrayList.add(BuzzerConfigResponseKt.UT_KEY_MOMENT);
        }
        int i17 = this.cupProgression;
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(BuzzerConfigResponseKt.CUP_PROGRESSION);
        }
        int i19 = this.formulaOne;
        for (int i20 = 0; i20 < i19; i20++) {
            arrayList.add(BuzzerConfigResponseKt.FORMULA_ONE);
        }
        int i21 = this.interestingStatistic;
        for (int i22 = 0; i22 < i21; i22++) {
            arrayList.add(BuzzerConfigResponseKt.INTERESTING_STATISTIC);
        }
        int i23 = this.transfer;
        for (int i24 = 0; i24 < i23; i24++) {
            arrayList.add(BuzzerConfigResponseKt.TRANSFER);
        }
        int i25 = this.mmaEvent;
        for (int i26 = 0; i26 < i25; i26++) {
            arrayList.add(BuzzerConfigResponseKt.MMA_EVENT);
        }
        int i27 = this.detailedStat;
        for (int i28 = 0; i28 < i27; i28++) {
            arrayList.add(BuzzerConfigResponseKt.DETAILED_STATISTIC);
        }
        int i29 = this.teamOfTheWeek;
        for (int i30 = 0; i30 < i29; i30++) {
            arrayList.add(BuzzerConfigResponseKt.TEAM_OF_THE_WEEK);
        }
        int i31 = this.sofascoreRating;
        for (int i32 = 0; i32 < i31; i32++) {
            arrayList.add(BuzzerConfigResponseKt.SOFASCORE_RATING);
        }
        int i33 = this.weeklyChallenge;
        for (int i34 = 0; i34 < i33; i34++) {
            arrayList.add(BuzzerConfigResponseKt.WEEKLY_CHALLENGE);
        }
        int i35 = this.aiInsights;
        for (int i36 = 0; i36 < i35; i36++) {
            arrayList.add(BuzzerConfigResponseKt.AI_INSIGHTS);
        }
        return arrayList;
    }

    public final int getTopBasketballEventPlayerPerformance() {
        return this.topBasketballEventPlayerPerformance;
    }

    public final int getTopEvent() {
        return this.topEvent;
    }

    public final int getTopFootballEventPlayerPerformance() {
        return this.topFootballEventPlayerPerformance;
    }

    public final int getTransfer() {
        return this.transfer;
    }

    public final int getUtKeyMoment() {
        return this.utKeyMoment;
    }

    public final int getWTASinglesRankingChange() {
        return this.WTASinglesRankingChange;
    }

    public final int getWeeklyChallenge() {
        return this.weeklyChallenge;
    }

    public int hashCode() {
        return Integer.hashCode(this.aiInsights) + wv8.a(this.weeklyChallenge, wv8.a(this.sofascoreRating, wv8.a(this.detailedStat, wv8.a(this.teamOfTheWeek, wv8.a(this.mmaEvent, wv8.a(this.transfer, wv8.a(this.interestingStatistic, wv8.a(this.formulaOne, wv8.a(this.cupProgression, wv8.a(this.utKeyMoment, wv8.a(this.surpriseEventResult, wv8.a(this.FIFACountryRankingChange, wv8.a(this.WTASinglesRankingChange, wv8.a(this.ATPSinglesRankingChange, wv8.a(this.topBasketballEventPlayerPerformance, wv8.a(this.topFootballEventPlayerPerformance, Integer.hashCode(this.topEvent) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        int i = this.topEvent;
        int i2 = this.topFootballEventPlayerPerformance;
        int i3 = this.topBasketballEventPlayerPerformance;
        int i4 = this.ATPSinglesRankingChange;
        int i5 = this.WTASinglesRankingChange;
        int i6 = this.FIFACountryRankingChange;
        int i7 = this.surpriseEventResult;
        int i8 = this.utKeyMoment;
        int i9 = this.cupProgression;
        int i10 = this.formulaOne;
        int i11 = this.interestingStatistic;
        int i12 = this.transfer;
        int i13 = this.mmaEvent;
        int i14 = this.teamOfTheWeek;
        int i15 = this.detailedStat;
        int i16 = this.sofascoreRating;
        int i17 = this.weeklyChallenge;
        int i18 = this.aiInsights;
        StringBuilder s = lnb.s(i, i2, "TileReasonCount(topEvent=", ", topFootballEventPlayerPerformance=", ", topBasketballEventPlayerPerformance=");
        me4.q(s, i3, ", ATPSinglesRankingChange=", i4, ", WTASinglesRankingChange=");
        me4.q(s, i5, ", FIFACountryRankingChange=", i6, ", surpriseEventResult=");
        me4.q(s, i7, ", utKeyMoment=", i8, ", cupProgression=");
        me4.q(s, i9, ", formulaOne=", i10, ", interestingStatistic=");
        me4.q(s, i11, ", transfer=", i12, ", mmaEvent=");
        me4.q(s, i13, ", teamOfTheWeek=", i14, ", detailedStat=");
        me4.q(s, i15, ", sofascoreRating=", i16, ", weeklyChallenge=");
        return me4.i(s, i17, ", aiInsights=", i18, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/buzzer/TileReasonCount$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/buzzer/TileReasonCount;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TileReasonCount$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TileReasonCount(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.topEvent = i;
        this.topFootballEventPlayerPerformance = i2;
        this.topBasketballEventPlayerPerformance = i3;
        this.ATPSinglesRankingChange = i4;
        this.WTASinglesRankingChange = i5;
        this.FIFACountryRankingChange = i6;
        this.surpriseEventResult = i7;
        this.utKeyMoment = i8;
        this.cupProgression = i9;
        this.formulaOne = i10;
        this.interestingStatistic = i11;
        this.transfer = i12;
        this.mmaEvent = i13;
        this.teamOfTheWeek = i14;
        this.detailedStat = i15;
        this.sofascoreRating = i16;
        this.weeklyChallenge = i17;
        this.aiInsights = i18;
    }
}

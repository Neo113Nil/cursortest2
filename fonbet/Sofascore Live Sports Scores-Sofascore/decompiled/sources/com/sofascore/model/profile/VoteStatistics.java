package com.sofascore.model.profile;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.OddsChoice$$serializer;
import defpackage.dmi;
import defpackage.me4;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.w1l;
import defpackage.wf3;
import defpackage.wv8;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B}\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0080\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0018J\u0010\u0010)\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b)\u0010\u001fJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b=\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b>\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\bA\u0010\u001fR\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\bB\u0010\u001fR\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\bC\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\bD\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010%¨\u0006I"}, d2 = {"Lcom/sofascore/model/profile/VoteStatistics;", "Ljava/io/Serializable;", "", U3.i.l, "correct", "Lcom/sofascore/model/odds/OddsChoice;", "avgCorrectOdds", "percentage", "ranking", "", "rankingMove", "correctVotesWithOdds", "totalVotesWithOdds", "correctVotesWithoutOdds", "totalVotesWithoutOdds", "", "roi", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/odds/OddsChoice;Ljava/lang/String;Ljava/lang/String;IIIIIF)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/odds/OddsChoice;Ljava/lang/String;Ljava/lang/String;IIIIIFLt5h;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/sofascore/model/odds/OddsChoice;", "component4", "component5", "component6", "()I", "component7", "component8", "component9", "component10", "component11", "()F", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/odds/OddsChoice;Ljava/lang/String;Ljava/lang/String;IIIIIF)Lcom/sofascore/model/profile/VoteStatistics;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/profile/VoteStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getTotal", "getCorrect", "Lcom/sofascore/model/odds/OddsChoice;", "getAvgCorrectOdds", "getPercentage", "getRanking", "I", "getRankingMove", "getCorrectVotesWithOdds", "getTotalVotesWithOdds", "getCorrectVotesWithoutOdds", "getTotalVotesWithoutOdds", "F", "getRoi", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VoteStatistics implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final OddsChoice avgCorrectOdds;

    @NotNull
    private final String correct;
    private final int correctVotesWithOdds;
    private final int correctVotesWithoutOdds;

    @NotNull
    private final String percentage;

    @NotNull
    private final String ranking;
    private final int rankingMove;
    private final float roi;

    @NotNull
    private final String total;
    private final int totalVotesWithOdds;
    private final int totalVotesWithoutOdds;

    public /* synthetic */ VoteStatistics(int i, String str, String str2, OddsChoice oddsChoice, String str3, String str4, int i2, int i3, int i4, int i5, int i6, float f, t5h t5hVar) {
        if (1055 != (i & 1055)) {
            oea.z(i, 1055, VoteStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.total = str;
        this.correct = str2;
        this.avgCorrectOdds = oddsChoice;
        this.percentage = str3;
        this.ranking = str4;
        if ((i & 32) == 0) {
            this.rankingMove = 0;
        } else {
            this.rankingMove = i2;
        }
        if ((i & 64) == 0) {
            this.correctVotesWithOdds = 0;
        } else {
            this.correctVotesWithOdds = i3;
        }
        if ((i & 128) == 0) {
            this.totalVotesWithOdds = 0;
        } else {
            this.totalVotesWithOdds = i4;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.correctVotesWithoutOdds = 0;
        } else {
            this.correctVotesWithoutOdds = i5;
        }
        if ((i & 512) == 0) {
            this.totalVotesWithoutOdds = 0;
        } else {
            this.totalVotesWithoutOdds = i6;
        }
        this.roi = f;
    }

    public static /* synthetic */ VoteStatistics copy$default(VoteStatistics voteStatistics, String str, String str2, OddsChoice oddsChoice, String str3, String str4, int i, int i2, int i3, int i4, int i5, float f, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = voteStatistics.total;
        }
        if ((i6 & 2) != 0) {
            str2 = voteStatistics.correct;
        }
        if ((i6 & 4) != 0) {
            oddsChoice = voteStatistics.avgCorrectOdds;
        }
        if ((i6 & 8) != 0) {
            str3 = voteStatistics.percentage;
        }
        if ((i6 & 16) != 0) {
            str4 = voteStatistics.ranking;
        }
        if ((i6 & 32) != 0) {
            i = voteStatistics.rankingMove;
        }
        if ((i6 & 64) != 0) {
            i2 = voteStatistics.correctVotesWithOdds;
        }
        if ((i6 & 128) != 0) {
            i3 = voteStatistics.totalVotesWithOdds;
        }
        if ((i6 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            i4 = voteStatistics.correctVotesWithoutOdds;
        }
        if ((i6 & 512) != 0) {
            i5 = voteStatistics.totalVotesWithoutOdds;
        }
        if ((i6 & 1024) != 0) {
            f = voteStatistics.roi;
        }
        int i7 = i5;
        float f2 = f;
        int i8 = i3;
        int i9 = i4;
        int i10 = i;
        int i11 = i2;
        String str5 = str4;
        OddsChoice oddsChoice2 = oddsChoice;
        return voteStatistics.copy(str, str2, oddsChoice2, str3, str5, i10, i11, i8, i9, i7, f2);
    }

    public static final /* synthetic */ void write$Self$model_release(VoteStatistics self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.total);
        output.y(serialDesc, 1, self.correct);
        output.h(serialDesc, 2, OddsChoice$$serializer.INSTANCE, self.avgCorrectOdds);
        output.y(serialDesc, 3, self.percentage);
        output.y(serialDesc, 4, self.ranking);
        if (output.o(serialDesc) || self.rankingMove != 0) {
            output.u(5, self.rankingMove, serialDesc);
        }
        if (output.o(serialDesc) || self.correctVotesWithOdds != 0) {
            output.u(6, self.correctVotesWithOdds, serialDesc);
        }
        if (output.o(serialDesc) || self.totalVotesWithOdds != 0) {
            output.u(7, self.totalVotesWithOdds, serialDesc);
        }
        if (output.o(serialDesc) || self.correctVotesWithoutOdds != 0) {
            output.u(8, self.correctVotesWithoutOdds, serialDesc);
        }
        if (output.o(serialDesc) || self.totalVotesWithoutOdds != 0) {
            output.u(9, self.totalVotesWithoutOdds, serialDesc);
        }
        output.t(serialDesc, 10, self.roi);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTotal() {
        return this.total;
    }

    /* renamed from: component10, reason: from getter */
    public final int getTotalVotesWithoutOdds() {
        return this.totalVotesWithoutOdds;
    }

    /* renamed from: component11, reason: from getter */
    public final float getRoi() {
        return this.roi;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCorrect() {
        return this.correct;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final OddsChoice getAvgCorrectOdds() {
        return this.avgCorrectOdds;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getPercentage() {
        return this.percentage;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getRanking() {
        return this.ranking;
    }

    /* renamed from: component6, reason: from getter */
    public final int getRankingMove() {
        return this.rankingMove;
    }

    /* renamed from: component7, reason: from getter */
    public final int getCorrectVotesWithOdds() {
        return this.correctVotesWithOdds;
    }

    /* renamed from: component8, reason: from getter */
    public final int getTotalVotesWithOdds() {
        return this.totalVotesWithOdds;
    }

    /* renamed from: component9, reason: from getter */
    public final int getCorrectVotesWithoutOdds() {
        return this.correctVotesWithoutOdds;
    }

    @NotNull
    public final VoteStatistics copy(@NotNull String total, @NotNull String correct, @Nullable OddsChoice avgCorrectOdds, @NotNull String percentage, @NotNull String ranking, int rankingMove, int correctVotesWithOdds, int totalVotesWithOdds, int correctVotesWithoutOdds, int totalVotesWithoutOdds, float roi) {
        total.getClass();
        correct.getClass();
        percentage.getClass();
        ranking.getClass();
        return new VoteStatistics(total, correct, avgCorrectOdds, percentage, ranking, rankingMove, correctVotesWithOdds, totalVotesWithOdds, correctVotesWithoutOdds, totalVotesWithoutOdds, roi);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoteStatistics)) {
            return false;
        }
        VoteStatistics voteStatistics = (VoteStatistics) other;
        return Intrinsics.c(this.total, voteStatistics.total) && Intrinsics.c(this.correct, voteStatistics.correct) && Intrinsics.c(this.avgCorrectOdds, voteStatistics.avgCorrectOdds) && Intrinsics.c(this.percentage, voteStatistics.percentage) && Intrinsics.c(this.ranking, voteStatistics.ranking) && this.rankingMove == voteStatistics.rankingMove && this.correctVotesWithOdds == voteStatistics.correctVotesWithOdds && this.totalVotesWithOdds == voteStatistics.totalVotesWithOdds && this.correctVotesWithoutOdds == voteStatistics.correctVotesWithoutOdds && this.totalVotesWithoutOdds == voteStatistics.totalVotesWithoutOdds && Float.compare(this.roi, voteStatistics.roi) == 0;
    }

    @Nullable
    public final OddsChoice getAvgCorrectOdds() {
        return this.avgCorrectOdds;
    }

    @NotNull
    public final String getCorrect() {
        return this.correct;
    }

    public final int getCorrectVotesWithOdds() {
        return this.correctVotesWithOdds;
    }

    public final int getCorrectVotesWithoutOdds() {
        return this.correctVotesWithoutOdds;
    }

    @NotNull
    public final String getPercentage() {
        return this.percentage;
    }

    @NotNull
    public final String getRanking() {
        return this.ranking;
    }

    public final int getRankingMove() {
        return this.rankingMove;
    }

    public final float getRoi() {
        return this.roi;
    }

    @NotNull
    public final String getTotal() {
        return this.total;
    }

    public final int getTotalVotesWithOdds() {
        return this.totalVotesWithOdds;
    }

    public final int getTotalVotesWithoutOdds() {
        return this.totalVotesWithoutOdds;
    }

    public int hashCode() {
        int c = dmi.c(this.total.hashCode() * 31, 31, this.correct);
        OddsChoice oddsChoice = this.avgCorrectOdds;
        return Float.hashCode(this.roi) + wv8.a(this.totalVotesWithoutOdds, wv8.a(this.correctVotesWithoutOdds, wv8.a(this.totalVotesWithOdds, wv8.a(this.correctVotesWithOdds, wv8.a(this.rankingMove, dmi.c(dmi.c((c + (oddsChoice == null ? 0 : oddsChoice.hashCode())) * 31, 31, this.percentage), 31, this.ranking), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.total;
        String str2 = this.correct;
        OddsChoice oddsChoice = this.avgCorrectOdds;
        String str3 = this.percentage;
        String str4 = this.ranking;
        int i = this.rankingMove;
        int i2 = this.correctVotesWithOdds;
        int i3 = this.totalVotesWithOdds;
        int i4 = this.correctVotesWithoutOdds;
        int i5 = this.totalVotesWithoutOdds;
        float f = this.roi;
        StringBuilder s = mz1.s("VoteStatistics(total=", str, ", correct=", str2, ", avgCorrectOdds=");
        s.append(oddsChoice);
        s.append(", percentage=");
        s.append(str3);
        s.append(", ranking=");
        w1l.q(i, str4, ", rankingMove=", ", correctVotesWithOdds=", s);
        me4.q(s, i2, ", totalVotesWithOdds=", i3, ", correctVotesWithoutOdds=");
        me4.q(s, i4, ", totalVotesWithoutOdds=", i5, ", roi=");
        s.append(f);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/profile/VoteStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/profile/VoteStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return VoteStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public VoteStatistics(@NotNull String str, @NotNull String str2, @Nullable OddsChoice oddsChoice, @NotNull String str3, @NotNull String str4, int i, int i2, int i3, int i4, int i5, float f) {
        w1l.y(str, str2, str3, str4);
        this.total = str;
        this.correct = str2;
        this.avgCorrectOdds = oddsChoice;
        this.percentage = str3;
        this.ranking = str4;
        this.rankingMove = i;
        this.correctVotesWithOdds = i2;
        this.totalVotesWithOdds = i3;
        this.correctVotesWithoutOdds = i4;
        this.totalVotesWithoutOdds = i5;
        this.roi = f;
    }

    public /* synthetic */ VoteStatistics(String str, String str2, OddsChoice oddsChoice, String str3, String str4, int i, int i2, int i3, int i4, int i5, float f, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, oddsChoice, str3, str4, (i6 & 32) != 0 ? 0 : i, (i6 & 64) != 0 ? 0 : i2, (i6 & 128) != 0 ? 0 : i3, (i6 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 0 : i4, (i6 & 512) != 0 ? 0 : i5, f);
    }
}

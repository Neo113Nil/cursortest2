package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.newNetwork.commentary.CommentKt;
import defpackage.a7a;
import defpackage.fc6;
import defpackage.h75;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u007f\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001eJ\u0088\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b<\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b=\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b>\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b?\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b@\u0010\u001e¨\u0006C"}, d2 = {"Lcom/sofascore/model/mvvm/model/ScoreCricketInning;", "Ljava/io/Serializable;", "", "id", CommentKt.AMERICAN_FOOTBALL_PLAY_TYPE_RUN, "score", "wickets", "", "overs", "runRate", "targetRunRate", "inningDeclare", "hits", "errors", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/ScoreCricketInning;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "()Ljava/lang/Double;", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/mvvm/model/ScoreCricketInning;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getId", "getRun", "getScore", "getWickets", "Ljava/lang/Double;", "getOvers", "getRunRate", "getTargetRunRate", "getInningDeclare", "getHits", "getErrors", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ScoreCricketInning implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer errors;

    @Nullable
    private final Integer hits;

    @Nullable
    private final Integer id;

    @Nullable
    private final Integer inningDeclare;

    @Nullable
    private final Double overs;

    @Nullable
    private final Integer run;

    @Nullable
    private final Double runRate;

    @Nullable
    private final Integer score;

    @Nullable
    private final Double targetRunRate;

    @Nullable
    private final Integer wickets;

    public /* synthetic */ ScoreCricketInning(int i, Integer num, Integer num2, Integer num3, Integer num4, Double d, Double d2, Double d3, Integer num5, Integer num6, Integer num7, t5h t5hVar) {
        if (1023 != (i & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)) {
            oea.z(i, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, ScoreCricketInning$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = num;
        this.run = num2;
        this.score = num3;
        this.wickets = num4;
        this.overs = d;
        this.runRate = d2;
        this.targetRunRate = d3;
        this.inningDeclare = num5;
        this.hits = num6;
        this.errors = num7;
    }

    public static /* synthetic */ ScoreCricketInning copy$default(ScoreCricketInning scoreCricketInning, Integer num, Integer num2, Integer num3, Integer num4, Double d, Double d2, Double d3, Integer num5, Integer num6, Integer num7, int i, Object obj) {
        if ((i & 1) != 0) {
            num = scoreCricketInning.id;
        }
        if ((i & 2) != 0) {
            num2 = scoreCricketInning.run;
        }
        if ((i & 4) != 0) {
            num3 = scoreCricketInning.score;
        }
        if ((i & 8) != 0) {
            num4 = scoreCricketInning.wickets;
        }
        if ((i & 16) != 0) {
            d = scoreCricketInning.overs;
        }
        if ((i & 32) != 0) {
            d2 = scoreCricketInning.runRate;
        }
        if ((i & 64) != 0) {
            d3 = scoreCricketInning.targetRunRate;
        }
        if ((i & 128) != 0) {
            num5 = scoreCricketInning.inningDeclare;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            num6 = scoreCricketInning.hits;
        }
        if ((i & 512) != 0) {
            num7 = scoreCricketInning.errors;
        }
        Integer num8 = num6;
        Integer num9 = num7;
        Double d4 = d3;
        Integer num10 = num5;
        Double d5 = d;
        Double d6 = d2;
        return scoreCricketInning.copy(num, num2, num3, num4, d5, d6, d4, num10, num8, num9);
    }

    public static final /* synthetic */ void write$Self$model_release(ScoreCricketInning self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.id);
        output.h(serialDesc, 1, a7aVar, self.run);
        output.h(serialDesc, 2, a7aVar, self.score);
        output.h(serialDesc, 3, a7aVar, self.wickets);
        h75 h75Var = h75.a;
        output.h(serialDesc, 4, h75Var, self.overs);
        output.h(serialDesc, 5, h75Var, self.runRate);
        output.h(serialDesc, 6, h75Var, self.targetRunRate);
        output.h(serialDesc, 7, a7aVar, self.inningDeclare);
        output.h(serialDesc, 8, a7aVar, self.hits);
        output.h(serialDesc, 9, a7aVar, self.errors);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getErrors() {
        return this.errors;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getRun() {
        return this.run;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getScore() {
        return this.score;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getWickets() {
        return this.wickets;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Double getOvers() {
        return this.overs;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Double getRunRate() {
        return this.runRate;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Double getTargetRunRate() {
        return this.targetRunRate;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getInningDeclare() {
        return this.inningDeclare;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getHits() {
        return this.hits;
    }

    @NotNull
    public final ScoreCricketInning copy(@Nullable Integer id, @Nullable Integer run, @Nullable Integer score, @Nullable Integer wickets, @Nullable Double overs, @Nullable Double runRate, @Nullable Double targetRunRate, @Nullable Integer inningDeclare, @Nullable Integer hits, @Nullable Integer errors) {
        return new ScoreCricketInning(id, run, score, wickets, overs, runRate, targetRunRate, inningDeclare, hits, errors);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScoreCricketInning)) {
            return false;
        }
        ScoreCricketInning scoreCricketInning = (ScoreCricketInning) other;
        return Intrinsics.c(this.id, scoreCricketInning.id) && Intrinsics.c(this.run, scoreCricketInning.run) && Intrinsics.c(this.score, scoreCricketInning.score) && Intrinsics.c(this.wickets, scoreCricketInning.wickets) && Intrinsics.c(this.overs, scoreCricketInning.overs) && Intrinsics.c(this.runRate, scoreCricketInning.runRate) && Intrinsics.c(this.targetRunRate, scoreCricketInning.targetRunRate) && Intrinsics.c(this.inningDeclare, scoreCricketInning.inningDeclare) && Intrinsics.c(this.hits, scoreCricketInning.hits) && Intrinsics.c(this.errors, scoreCricketInning.errors);
    }

    @Nullable
    public final Integer getErrors() {
        return this.errors;
    }

    @Nullable
    public final Integer getHits() {
        return this.hits;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final Integer getInningDeclare() {
        return this.inningDeclare;
    }

    @Nullable
    public final Double getOvers() {
        return this.overs;
    }

    @Nullable
    public final Integer getRun() {
        return this.run;
    }

    @Nullable
    public final Double getRunRate() {
        return this.runRate;
    }

    @Nullable
    public final Integer getScore() {
        return this.score;
    }

    @Nullable
    public final Double getTargetRunRate() {
        return this.targetRunRate;
    }

    @Nullable
    public final Integer getWickets() {
        return this.wickets;
    }

    public int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.run;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.score;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.wickets;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d = this.overs;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.runRate;
        int hashCode6 = (hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.targetRunRate;
        int hashCode7 = (hashCode6 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num5 = this.inningDeclare;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.hits;
        int hashCode9 = (hashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.errors;
        return hashCode9 + (num7 != null ? num7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.id;
        Integer num2 = this.run;
        Integer num3 = this.score;
        Integer num4 = this.wickets;
        Double d = this.overs;
        Double d2 = this.runRate;
        Double d3 = this.targetRunRate;
        Integer num5 = this.inningDeclare;
        Integer num6 = this.hits;
        Integer num7 = this.errors;
        StringBuilder k = wv8.k(num, "ScoreCricketInning(id=", ", run=", ", score=", num2);
        vxd.r(num3, num4, ", wickets=", ", overs=", k);
        fc6.A(k, d, ", runRate=", d2, ", targetRunRate=");
        mz1.x(d3, num5, ", inningDeclare=", ", hits=", k);
        return fc6.l(num6, num7, ", errors=", ")", k);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/ScoreCricketInning$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/ScoreCricketInning;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ScoreCricketInning$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ScoreCricketInning(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Double d, @Nullable Double d2, @Nullable Double d3, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7) {
        this.id = num;
        this.run = num2;
        this.score = num3;
        this.wickets = num4;
        this.overs = d;
        this.runRate = d2;
        this.targetRunRate = d3;
        this.inningDeclare = num5;
        this.hits = num6;
        this.errors = num7;
    }
}

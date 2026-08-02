package com.sofascore.model.newNetwork;

import defpackage.joa;
import defpackage.oea;
import defpackage.pxk;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001d¨\u00061"}, d2 = {"Lcom/sofascore/model/newNetwork/Votes;", "", "Lcom/sofascore/model/newNetwork/WhoWillWinOptions;", "fullTime", "Lcom/sofascore/model/newNetwork/WillBothTeamsScoreOptions;", "bothTeamsToScore", "Lcom/sofascore/model/newNetwork/FirstTeamToScoreOptions;", "firstTeamToScore", "<init>", "(Lcom/sofascore/model/newNetwork/WhoWillWinOptions;Lcom/sofascore/model/newNetwork/WillBothTeamsScoreOptions;Lcom/sofascore/model/newNetwork/FirstTeamToScoreOptions;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/WhoWillWinOptions;Lcom/sofascore/model/newNetwork/WillBothTeamsScoreOptions;Lcom/sofascore/model/newNetwork/FirstTeamToScoreOptions;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/Votes;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/newNetwork/WhoWillWinOptions;", "component2", "()Lcom/sofascore/model/newNetwork/WillBothTeamsScoreOptions;", "component3", "()Lcom/sofascore/model/newNetwork/FirstTeamToScoreOptions;", "copy", "(Lcom/sofascore/model/newNetwork/WhoWillWinOptions;Lcom/sofascore/model/newNetwork/WillBothTeamsScoreOptions;Lcom/sofascore/model/newNetwork/FirstTeamToScoreOptions;)Lcom/sofascore/model/newNetwork/Votes;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/newNetwork/WhoWillWinOptions;", "getFullTime", "Lcom/sofascore/model/newNetwork/WillBothTeamsScoreOptions;", "getBothTeamsToScore", "Lcom/sofascore/model/newNetwork/FirstTeamToScoreOptions;", "getFirstTeamToScore", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Votes {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final WillBothTeamsScoreOptions bothTeamsToScore;

    @Nullable
    private final FirstTeamToScoreOptions firstTeamToScore;

    @Nullable
    private final WhoWillWinOptions fullTime;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new pxk(24)), ypa.a(ysaVar, new pxk(25)), ypa.a(ysaVar, new pxk(26))};
    }

    public /* synthetic */ Votes(int i, WhoWillWinOptions whoWillWinOptions, WillBothTeamsScoreOptions willBothTeamsScoreOptions, FirstTeamToScoreOptions firstTeamToScoreOptions, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, Votes$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.fullTime = whoWillWinOptions;
        this.bothTeamsToScore = willBothTeamsScoreOptions;
        this.firstTeamToScore = firstTeamToScoreOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return WhoWillWinOptions.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return WillBothTeamsScoreOptions.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return FirstTeamToScoreOptions.INSTANCE.serializer();
    }

    public static /* synthetic */ Votes copy$default(Votes votes, WhoWillWinOptions whoWillWinOptions, WillBothTeamsScoreOptions willBothTeamsScoreOptions, FirstTeamToScoreOptions firstTeamToScoreOptions, int i, Object obj) {
        if ((i & 1) != 0) {
            whoWillWinOptions = votes.fullTime;
        }
        if ((i & 2) != 0) {
            willBothTeamsScoreOptions = votes.bothTeamsToScore;
        }
        if ((i & 4) != 0) {
            firstTeamToScoreOptions = votes.firstTeamToScore;
        }
        return votes.copy(whoWillWinOptions, willBothTeamsScoreOptions, firstTeamToScoreOptions);
    }

    public static final /* synthetic */ void write$Self$model_release(Votes self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.fullTime);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.bothTeamsToScore);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.firstTeamToScore);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final WhoWillWinOptions getFullTime() {
        return this.fullTime;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final WillBothTeamsScoreOptions getBothTeamsToScore() {
        return this.bothTeamsToScore;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final FirstTeamToScoreOptions getFirstTeamToScore() {
        return this.firstTeamToScore;
    }

    @NotNull
    public final Votes copy(@Nullable WhoWillWinOptions fullTime, @Nullable WillBothTeamsScoreOptions bothTeamsToScore, @Nullable FirstTeamToScoreOptions firstTeamToScore) {
        return new Votes(fullTime, bothTeamsToScore, firstTeamToScore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Votes)) {
            return false;
        }
        Votes votes = (Votes) other;
        return this.fullTime == votes.fullTime && this.bothTeamsToScore == votes.bothTeamsToScore && this.firstTeamToScore == votes.firstTeamToScore;
    }

    @Nullable
    public final WillBothTeamsScoreOptions getBothTeamsToScore() {
        return this.bothTeamsToScore;
    }

    @Nullable
    public final FirstTeamToScoreOptions getFirstTeamToScore() {
        return this.firstTeamToScore;
    }

    @Nullable
    public final WhoWillWinOptions getFullTime() {
        return this.fullTime;
    }

    public int hashCode() {
        WhoWillWinOptions whoWillWinOptions = this.fullTime;
        int hashCode = (whoWillWinOptions == null ? 0 : whoWillWinOptions.hashCode()) * 31;
        WillBothTeamsScoreOptions willBothTeamsScoreOptions = this.bothTeamsToScore;
        int hashCode2 = (hashCode + (willBothTeamsScoreOptions == null ? 0 : willBothTeamsScoreOptions.hashCode())) * 31;
        FirstTeamToScoreOptions firstTeamToScoreOptions = this.firstTeamToScore;
        return hashCode2 + (firstTeamToScoreOptions != null ? firstTeamToScoreOptions.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Votes(fullTime=" + this.fullTime + ", bothTeamsToScore=" + this.bothTeamsToScore + ", firstTeamToScore=" + this.firstTeamToScore + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/Votes$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/Votes;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Votes$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Votes(@Nullable WhoWillWinOptions whoWillWinOptions, @Nullable WillBothTeamsScoreOptions willBothTeamsScoreOptions, @Nullable FirstTeamToScoreOptions firstTeamToScoreOptions) {
        this.fullTime = whoWillWinOptions;
        this.bothTeamsToScore = willBothTeamsScoreOptions;
        this.firstTeamToScore = firstTeamToScoreOptions;
    }
}

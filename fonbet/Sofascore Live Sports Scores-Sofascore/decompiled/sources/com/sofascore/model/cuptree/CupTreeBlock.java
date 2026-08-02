package com.sofascore.model.cuptree;

import com.ironsource.C4227o2;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.model.mvvm.model.Venue$$serializer;
import defpackage.a7a;
import defpackage.g14;
import defpackage.gz1;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b0\b\u0007\u0018\u0000 P2\u00020\u0001:\u0002PQB\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B¥\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ'\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b)\u0010(R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u00101R\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010*\u001a\u0004\b2\u0010,\"\u0004\b3\u0010.R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b9\u00106R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b:\u00106R*\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b@\u0010=R\"\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010*\u001a\u0004\bA\u0010,\"\u0004\bB\u0010.R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010*\u001a\u0004\bF\u0010,R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010G\u001a\u0004\bH\u0010IR\u0013\u0010L\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0013\u0010N\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bM\u0010KR\u0011\u0010O\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bO\u0010,¨\u0006R"}, d2 = {"Lcom/sofascore/model/cuptree/CupTreeBlock;", "Ljava/io/Serializable;", "", "blockId", C4227o2.u, "", StatusKt.STATUS_FINISHED, "hasNextRoundLink", "eventInProgress", "", "result", "homeTeamScore", "awayTeamScore", "", "Lcom/sofascore/model/cuptree/CupTreeParticipant;", "participants", "events", "blocksNotGrouped", "", "seriesStartDateTimestamp", "automaticProgression", "Lcom/sofascore/model/mvvm/model/Venue;", "venue", "<init>", "(IIZLjava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZJZLcom/sofascore/model/mvvm/model/Venue;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIIZLjava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZJZLcom/sofascore/model/mvvm/model/Venue;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/cuptree/CupTreeBlock;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getBlockId", "()I", "getOrder", "Z", "getFinished", "()Z", "setFinished", "(Z)V", "Ljava/lang/Boolean;", "getHasNextRoundLink", "()Ljava/lang/Boolean;", "getEventInProgress", "setEventInProgress", "Ljava/lang/String;", "getResult", "()Ljava/lang/String;", "setResult", "(Ljava/lang/String;)V", "getHomeTeamScore", "getAwayTeamScore", "Ljava/util/List;", "getParticipants", "()Ljava/util/List;", "setParticipants", "(Ljava/util/List;)V", "getEvents", "getBlocksNotGrouped", "setBlocksNotGrouped", "J", "getSeriesStartDateTimestamp", "()J", "getAutomaticProgression", "Lcom/sofascore/model/mvvm/model/Venue;", "getVenue", "()Lcom/sofascore/model/mvvm/model/Venue;", "getHomeParticipant", "()Lcom/sofascore/model/cuptree/CupTreeParticipant;", "homeParticipant", "getAwayParticipant", "awayParticipant", "isEnabled", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CupTreeBlock implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    @NotNull
    public static final String BLOCK_RESULT_RETIRED = "retired";

    @NotNull
    public static final String BLOCK_RESULT_WALKOVER = "walkover";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean automaticProgression;

    @Nullable
    private final String awayTeamScore;
    private final int blockId;
    private boolean blocksNotGrouped;
    private boolean eventInProgress;

    @Nullable
    private final List<Integer> events;
    private boolean finished;

    @Nullable
    private final Boolean hasNextRoundLink;

    @Nullable
    private final String homeTeamScore;
    private final int order;

    @Nullable
    private List<CupTreeParticipant> participants;

    @Nullable
    private String result;
    private final long seriesStartDateTimestamp;

    @Nullable
    private final Venue venue;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, null, null, null, null, null, ypa.a(ysaVar, new g14(18)), ypa.a(ysaVar, new g14(19)), null, null, null, null};
    }

    public /* synthetic */ CupTreeBlock(int i, int i2, int i3, boolean z, Boolean bool, boolean z2, String str, String str2, String str3, List list, List list2, boolean z3, long j, boolean z4, Venue venue, t5h t5hVar) {
        if (13289 != (i & 13289)) {
            oea.z(i, 13289, CupTreeBlock$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.blockId = i2;
        if ((i & 2) == 0) {
            this.order = 0;
        } else {
            this.order = i3;
        }
        if ((i & 4) == 0) {
            this.finished = false;
        } else {
            this.finished = z;
        }
        this.hasNextRoundLink = bool;
        if ((i & 16) == 0) {
            this.eventInProgress = false;
        } else {
            this.eventInProgress = z2;
        }
        this.result = str;
        this.homeTeamScore = str2;
        this.awayTeamScore = str3;
        this.participants = list;
        this.events = list2;
        if ((i & 1024) == 0) {
            this.blocksNotGrouped = false;
        } else {
            this.blocksNotGrouped = z3;
        }
        this.seriesStartDateTimestamp = (i & a.o) == 0 ? 0L : j;
        this.automaticProgression = z4;
        this.venue = venue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(CupTreeParticipant$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(a7a.a, 0);
    }

    public static final /* synthetic */ void write$Self$model_release(CupTreeBlock self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.blockId, serialDesc);
        if (output.o(serialDesc) || self.order != 0) {
            output.u(1, self.order, serialDesc);
        }
        if (output.o(serialDesc) || self.finished) {
            output.x(serialDesc, 2, self.finished);
        }
        output.h(serialDesc, 3, gz1.a, self.hasNextRoundLink);
        if (output.o(serialDesc) || self.eventInProgress) {
            output.x(serialDesc, 4, self.eventInProgress);
        }
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 5, uhiVar, self.result);
        output.h(serialDesc, 6, uhiVar, self.homeTeamScore);
        output.h(serialDesc, 7, uhiVar, self.awayTeamScore);
        output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.participants);
        output.h(serialDesc, 9, (KSerializer) joaVarArr[9].getValue(), self.events);
        if (output.o(serialDesc) || self.blocksNotGrouped) {
            output.x(serialDesc, 10, self.blocksNotGrouped);
        }
        if (output.o(serialDesc) || self.seriesStartDateTimestamp != 0) {
            output.E(serialDesc, 11, self.seriesStartDateTimestamp);
        }
        output.x(serialDesc, 12, self.automaticProgression);
        output.h(serialDesc, 13, Venue$$serializer.INSTANCE, self.venue);
    }

    public final boolean getAutomaticProgression() {
        return this.automaticProgression;
    }

    @Nullable
    public final CupTreeParticipant getAwayParticipant() {
        List<CupTreeParticipant> list = this.participants;
        if (list != null) {
            return (CupTreeParticipant) CollectionsKt.a0(1, list);
        }
        return null;
    }

    @Nullable
    public final String getAwayTeamScore() {
        return this.awayTeamScore;
    }

    public final int getBlockId() {
        return this.blockId;
    }

    public final boolean getBlocksNotGrouped() {
        return this.blocksNotGrouped;
    }

    public final boolean getEventInProgress() {
        return this.eventInProgress;
    }

    @Nullable
    public final List<Integer> getEvents() {
        return this.events;
    }

    public final boolean getFinished() {
        return this.finished;
    }

    @Nullable
    public final Boolean getHasNextRoundLink() {
        return this.hasNextRoundLink;
    }

    @Nullable
    public final CupTreeParticipant getHomeParticipant() {
        List<CupTreeParticipant> list = this.participants;
        if (list != null) {
            return (CupTreeParticipant) CollectionsKt.a0(0, list);
        }
        return null;
    }

    @Nullable
    public final String getHomeTeamScore() {
        return this.homeTeamScore;
    }

    public final int getOrder() {
        return this.order;
    }

    @Nullable
    public final List<CupTreeParticipant> getParticipants() {
        return this.participants;
    }

    @Nullable
    public final String getResult() {
        return this.result;
    }

    public final long getSeriesStartDateTimestamp() {
        return this.seriesStartDateTimestamp;
    }

    @Nullable
    public final Venue getVenue() {
        return this.venue;
    }

    public final boolean isEnabled() {
        List<Integer> list = this.events;
        return !(list == null || list.isEmpty());
    }

    public final void setBlocksNotGrouped(boolean z) {
        this.blocksNotGrouped = z;
    }

    public final void setEventInProgress(boolean z) {
        this.eventInProgress = z;
    }

    public final void setFinished(boolean z) {
        this.finished = z;
    }

    public final void setParticipants(@Nullable List<CupTreeParticipant> list) {
        this.participants = list;
    }

    public final void setResult(@Nullable String str) {
        this.result = str;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/sofascore/model/cuptree/CupTreeBlock$Companion;", "", "<init>", "()V", "BLOCK_RESULT_WALKOVER", "", "BLOCK_RESULT_RETIRED", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/cuptree/CupTreeBlock;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CupTreeBlock$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CupTreeBlock(int i, int i2, boolean z, @Nullable Boolean bool, boolean z2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<CupTreeParticipant> list, @Nullable List<Integer> list2, boolean z3, long j, boolean z4, @Nullable Venue venue) {
        this.blockId = i;
        this.order = i2;
        this.finished = z;
        this.hasNextRoundLink = bool;
        this.eventInProgress = z2;
        this.result = str;
        this.homeTeamScore = str2;
        this.awayTeamScore = str3;
        this.participants = list;
        this.events = list2;
        this.blocksNotGrouped = z3;
        this.seriesStartDateTimestamp = j;
        this.automaticProgression = z4;
        this.venue = venue;
    }

    public /* synthetic */ CupTreeBlock(int i, int i2, boolean z, Boolean bool, boolean z2, String str, String str2, String str3, List list, List list2, boolean z3, long j, boolean z4, Venue venue, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? false : z, bool, (i3 & 16) != 0 ? false : z2, str, str2, str3, list, list2, (i3 & 1024) != 0 ? false : z3, (i3 & a.o) != 0 ? 0L : j, z4, venue);
    }
}

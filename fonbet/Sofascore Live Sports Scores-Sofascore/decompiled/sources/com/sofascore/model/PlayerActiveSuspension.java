package com.sofascore.model;

import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournament$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a7a;
import defpackage.gz8;
import defpackage.hz8;
import defpackage.joa;
import defpackage.jp5;
import defpackage.lkb;
import defpackage.oea;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.t2e;
import defpackage.t5h;
import defpackage.wf3;
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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0004CDEBBK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB_\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)J^\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001eJ\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b?\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010)¨\u0006F"}, d2 = {"Lcom/sofascore/model/PlayerActiveSuspension;", "Ljava/io/Serializable;", "", "id", "Lcom/sofascore/model/PlayerActiveSuspension$SuspensionType;", "type", "Lcom/sofascore/model/PlayerActiveSuspension$SuspensionReason;", "reason", "matches", "", "startDateTimestamp", "endDateTimestamp", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", SearchResponseKt.LEAGUE_ENTITY, "<init>", "(ILcom/sofascore/model/PlayerActiveSuspension$SuspensionType;Lcom/sofascore/model/PlayerActiveSuspension$SuspensionReason;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Lcom/sofascore/model/mvvm/model/UniqueTournament;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/PlayerActiveSuspension$SuspensionType;Lcom/sofascore/model/PlayerActiveSuspension$SuspensionReason;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Lcom/sofascore/model/mvvm/model/UniqueTournament;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/PlayerActiveSuspension;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Lcom/sofascore/model/PlayerActiveSuspension$SuspensionType;", "component3", "()Lcom/sofascore/model/PlayerActiveSuspension$SuspensionReason;", "component4", "()Ljava/lang/Integer;", "component5", "()Ljava/lang/Long;", "component6", "component7", "()Lcom/sofascore/model/mvvm/model/UniqueTournament;", "copy", "(ILcom/sofascore/model/PlayerActiveSuspension$SuspensionType;Lcom/sofascore/model/PlayerActiveSuspension$SuspensionReason;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Lcom/sofascore/model/mvvm/model/UniqueTournament;)Lcom/sofascore/model/PlayerActiveSuspension;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lcom/sofascore/model/PlayerActiveSuspension$SuspensionType;", "getType", "Lcom/sofascore/model/PlayerActiveSuspension$SuspensionReason;", "getReason", "Ljava/lang/Integer;", "getMatches", "Ljava/lang/Long;", "getStartDateTimestamp", "getEndDateTimestamp", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "getUniqueTournament", "Companion", "SuspensionReason", "SuspensionType", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlayerActiveSuspension implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Long endDateTimestamp;
    private final int id;

    @Nullable
    private final Integer matches;

    @NotNull
    private final SuspensionReason reason;

    @Nullable
    private final Long startDateTimestamp;

    @NotNull
    private final SuspensionType type;

    @Nullable
    private final UniqueTournament uniqueTournament;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/sofascore/model/PlayerActiveSuspension$SuspensionReason;", "", "<init>", "(Ljava/lang/String;I)V", "RedCard", "YellowCardAccumulation", "ImproperConduct", "Doping", "SuspendedAfterReview", "YellowToRedCard", "Personal", "PoliceInvestigation", "CoachDecision", "ClubDecision", "PendingTransfer", "Rested", "Gambling", "NationalTeam", "Other", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SuspensionReason {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ SuspensionReason[] $VALUES;

        @q5h("red_card_suspension")
        public static final SuspensionReason RedCard = new SuspensionReason("RedCard", 0);

        @q5h("yellow_card_accumulation_suspension")
        public static final SuspensionReason YellowCardAccumulation = new SuspensionReason("YellowCardAccumulation", 1);

        @q5h("fa_charge_of_improper_conduct")
        public static final SuspensionReason ImproperConduct = new SuspensionReason("ImproperConduct", 2);

        @q5h("doping_violation")
        public static final SuspensionReason Doping = new SuspensionReason("Doping", 3);

        @q5h("suspended_after_video_review")
        public static final SuspensionReason SuspendedAfterReview = new SuspensionReason("SuspendedAfterReview", 4);

        @q5h("yellow_or_red_card")
        public static final SuspensionReason YellowToRedCard = new SuspensionReason("YellowToRedCard", 5);

        @q5h("personal_reason")
        public static final SuspensionReason Personal = new SuspensionReason("Personal", 6);

        @q5h("police_investigation")
        public static final SuspensionReason PoliceInvestigation = new SuspensionReason("PoliceInvestigation", 7);

        @q5h("coach_decision")
        public static final SuspensionReason CoachDecision = new SuspensionReason("CoachDecision", 8);

        @q5h("club_decision")
        public static final SuspensionReason ClubDecision = new SuspensionReason("ClubDecision", 9);

        @q5h("pending_transfer")
        public static final SuspensionReason PendingTransfer = new SuspensionReason("PendingTransfer", 10);

        @q5h("rested")
        public static final SuspensionReason Rested = new SuspensionReason("Rested", 11);

        @q5h("gambling")
        public static final SuspensionReason Gambling = new SuspensionReason("Gambling", 12);

        @q5h("national_team")
        public static final SuspensionReason NationalTeam = new SuspensionReason("NationalTeam", 13);

        @q5h("other")
        public static final SuspensionReason Other = new SuspensionReason("Other", 14);

        private static final /* synthetic */ SuspensionReason[] $values() {
            return new SuspensionReason[]{RedCard, YellowCardAccumulation, ImproperConduct, Doping, SuspendedAfterReview, YellowToRedCard, Personal, PoliceInvestigation, CoachDecision, ClubDecision, PendingTransfer, Rested, Gambling, NationalTeam, Other};
        }

        static {
            SuspensionReason[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private SuspensionReason(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static SuspensionReason valueOf(String str) {
            return (SuspensionReason) Enum.valueOf(SuspensionReason.class, str);
        }

        public static SuspensionReason[] values() {
            return (SuspensionReason[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/PlayerActiveSuspension$SuspensionType;", "", "<init>", "(Ljava/lang/String;I)V", "Matches", "Period", "Other", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SuspensionType {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ SuspensionType[] $VALUES;

        @q5h("matches")
        public static final SuspensionType Matches = new SuspensionType("Matches", 0);

        @q5h("period")
        public static final SuspensionType Period = new SuspensionType("Period", 1);

        @q5h("other")
        public static final SuspensionType Other = new SuspensionType("Other", 2);

        private static final /* synthetic */ SuspensionType[] $values() {
            return new SuspensionType[]{Matches, Period, Other};
        }

        static {
            SuspensionType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private SuspensionType(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static SuspensionType valueOf(String str) {
            return (SuspensionType) Enum.valueOf(SuspensionType.class, str);
        }

        public static SuspensionType[] values() {
            return (SuspensionType[]) $VALUES.clone();
        }
    }

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, ypa.a(ysaVar, new t2e(20)), ypa.a(ysaVar, new t2e(21)), null, null, null, null};
    }

    public /* synthetic */ PlayerActiveSuspension(int i, int i2, SuspensionType suspensionType, SuspensionReason suspensionReason, Integer num, Long l, Long l2, UniqueTournament uniqueTournament, t5h t5hVar) {
        if (121 != (i & Sdk.SDKError.Reason.TPAT_ERROR_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, PlayerActiveSuspension$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        if ((i & 2) == 0) {
            this.type = SuspensionType.Other;
        } else {
            this.type = suspensionType;
        }
        if ((i & 4) == 0) {
            this.reason = SuspensionReason.Other;
        } else {
            this.reason = suspensionReason;
        }
        this.matches = num;
        this.startDateTimestamp = l;
        this.endDateTimestamp = l2;
        this.uniqueTournament = uniqueTournament;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return hz8.F("com.sofascore.model.PlayerActiveSuspension.SuspensionType", SuspensionType.values(), new String[]{"matches", "period", "other"}, new Annotation[][]{null, null, null});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return hz8.F("com.sofascore.model.PlayerActiveSuspension.SuspensionReason", SuspensionReason.values(), new String[]{"red_card_suspension", "yellow_card_accumulation_suspension", "fa_charge_of_improper_conduct", "doping_violation", "suspended_after_video_review", "yellow_or_red_card", "personal_reason", "police_investigation", "coach_decision", "club_decision", "pending_transfer", "rested", "gambling", "national_team", "other"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
    }

    public static /* synthetic */ PlayerActiveSuspension copy$default(PlayerActiveSuspension playerActiveSuspension, int i, SuspensionType suspensionType, SuspensionReason suspensionReason, Integer num, Long l, Long l2, UniqueTournament uniqueTournament, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = playerActiveSuspension.id;
        }
        if ((i2 & 2) != 0) {
            suspensionType = playerActiveSuspension.type;
        }
        if ((i2 & 4) != 0) {
            suspensionReason = playerActiveSuspension.reason;
        }
        if ((i2 & 8) != 0) {
            num = playerActiveSuspension.matches;
        }
        if ((i2 & 16) != 0) {
            l = playerActiveSuspension.startDateTimestamp;
        }
        if ((i2 & 32) != 0) {
            l2 = playerActiveSuspension.endDateTimestamp;
        }
        if ((i2 & 64) != 0) {
            uniqueTournament = playerActiveSuspension.uniqueTournament;
        }
        Long l3 = l2;
        UniqueTournament uniqueTournament2 = uniqueTournament;
        Long l4 = l;
        SuspensionReason suspensionReason2 = suspensionReason;
        return playerActiveSuspension.copy(i, suspensionType, suspensionReason2, num, l4, l3, uniqueTournament2);
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerActiveSuspension self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        if (output.o(serialDesc) || self.type != SuspensionType.Other) {
            output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.type);
        }
        if (output.o(serialDesc) || self.reason != SuspensionReason.Other) {
            output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.reason);
        }
        output.h(serialDesc, 3, a7a.a, self.matches);
        lkb lkbVar = lkb.a;
        output.h(serialDesc, 4, lkbVar, self.startDateTimestamp);
        output.h(serialDesc, 5, lkbVar, self.endDateTimestamp);
        output.h(serialDesc, 6, UniqueTournament$$serializer.INSTANCE, self.uniqueTournament);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final SuspensionType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final SuspensionReason getReason() {
        return this.reason;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getMatches() {
        return this.matches;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Long getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Long getEndDateTimestamp() {
        return this.endDateTimestamp;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    @NotNull
    public final PlayerActiveSuspension copy(int id, @NotNull SuspensionType type, @NotNull SuspensionReason reason, @Nullable Integer matches, @Nullable Long startDateTimestamp, @Nullable Long endDateTimestamp, @Nullable UniqueTournament uniqueTournament) {
        type.getClass();
        reason.getClass();
        return new PlayerActiveSuspension(id, type, reason, matches, startDateTimestamp, endDateTimestamp, uniqueTournament);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerActiveSuspension)) {
            return false;
        }
        PlayerActiveSuspension playerActiveSuspension = (PlayerActiveSuspension) other;
        return this.id == playerActiveSuspension.id && this.type == playerActiveSuspension.type && this.reason == playerActiveSuspension.reason && Intrinsics.c(this.matches, playerActiveSuspension.matches) && Intrinsics.c(this.startDateTimestamp, playerActiveSuspension.startDateTimestamp) && Intrinsics.c(this.endDateTimestamp, playerActiveSuspension.endDateTimestamp) && Intrinsics.c(this.uniqueTournament, playerActiveSuspension.uniqueTournament);
    }

    @Nullable
    public final Long getEndDateTimestamp() {
        return this.endDateTimestamp;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getMatches() {
        return this.matches;
    }

    @NotNull
    public final SuspensionReason getReason() {
        return this.reason;
    }

    @Nullable
    public final Long getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    @NotNull
    public final SuspensionType getType() {
        return this.type;
    }

    @Nullable
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    public int hashCode() {
        int hashCode = (this.reason.hashCode() + ((this.type.hashCode() + (Integer.hashCode(this.id) * 31)) * 31)) * 31;
        Integer num = this.matches;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.startDateTimestamp;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endDateTimestamp;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        UniqueTournament uniqueTournament = this.uniqueTournament;
        return hashCode4 + (uniqueTournament != null ? uniqueTournament.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PlayerActiveSuspension(id=" + this.id + ", type=" + this.type + ", reason=" + this.reason + ", matches=" + this.matches + ", startDateTimestamp=" + this.startDateTimestamp + ", endDateTimestamp=" + this.endDateTimestamp + ", uniqueTournament=" + this.uniqueTournament + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/PlayerActiveSuspension$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/PlayerActiveSuspension;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerActiveSuspension$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PlayerActiveSuspension(int i, @NotNull SuspensionType suspensionType, @NotNull SuspensionReason suspensionReason, @Nullable Integer num, @Nullable Long l, @Nullable Long l2, @Nullable UniqueTournament uniqueTournament) {
        suspensionType.getClass();
        suspensionReason.getClass();
        this.id = i;
        this.type = suspensionType;
        this.reason = suspensionReason;
        this.matches = num;
        this.startDateTimestamp = l;
        this.endDateTimestamp = l2;
        this.uniqueTournament = uniqueTournament;
    }

    public /* synthetic */ PlayerActiveSuspension(int i, SuspensionType suspensionType, SuspensionReason suspensionReason, Integer num, Long l, Long l2, UniqueTournament uniqueTournament, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? SuspensionType.Other : suspensionType, (i2 & 4) != 0 ? SuspensionReason.Other : suspensionReason, num, l, l2, uniqueTournament);
    }
}

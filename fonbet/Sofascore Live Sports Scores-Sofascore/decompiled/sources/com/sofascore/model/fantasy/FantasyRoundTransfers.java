package com.sofascore.model.fantasy;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.dmi;
import defpackage.gz1;
import defpackage.jf7;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fBa\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010&J`\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010 J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001eJ\u001a\u0010-\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010#R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b6\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b9\u0010&¨\u0006<"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyRoundTransfers;", "", "", "roundId", "", "roundName", "roundSequence", "", "Lcom/sofascore/model/fantasy/FantasyTransfer;", "transfers", "transferPenalty", "", "rebuildSquadActive", "quickFixActive", "<init>", "(ILjava/lang/String;ILjava/util/List;ILjava/lang/Boolean;Ljava/lang/Boolean;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;ILjava/util/List;ILjava/lang/Boolean;Ljava/lang/Boolean;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyRoundTransfers;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "copy", "(ILjava/lang/String;ILjava/util/List;ILjava/lang/Boolean;Ljava/lang/Boolean;)Lcom/sofascore/model/fantasy/FantasyRoundTransfers;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getRoundId", "Ljava/lang/String;", "getRoundName", "getRoundSequence", "Ljava/util/List;", "getTransfers", "getTransferPenalty", "Ljava/lang/Boolean;", "getRebuildSquadActive", "getQuickFixActive", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyRoundTransfers {

    @Nullable
    private final Boolean quickFixActive;

    @Nullable
    private final Boolean rebuildSquadActive;
    private final int roundId;

    @NotNull
    private final String roundName;
    private final int roundSequence;
    private final int transferPenalty;

    @NotNull
    private final List<FantasyTransfer> transfers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, ypa.a(ysa.b, new jf7(14)), null, null, null};

    public /* synthetic */ FantasyRoundTransfers(int i, int i2, String str, int i3, List list, int i4, Boolean bool, Boolean bool2, t5h t5hVar) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, FantasyRoundTransfers$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.roundId = i2;
        this.roundName = str;
        this.roundSequence = i3;
        this.transfers = list;
        this.transferPenalty = i4;
        this.rebuildSquadActive = bool;
        this.quickFixActive = bool2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(FantasyTransfer$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ FantasyRoundTransfers copy$default(FantasyRoundTransfers fantasyRoundTransfers, int i, String str, int i2, List list, int i3, Boolean bool, Boolean bool2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = fantasyRoundTransfers.roundId;
        }
        if ((i4 & 2) != 0) {
            str = fantasyRoundTransfers.roundName;
        }
        if ((i4 & 4) != 0) {
            i2 = fantasyRoundTransfers.roundSequence;
        }
        if ((i4 & 8) != 0) {
            list = fantasyRoundTransfers.transfers;
        }
        if ((i4 & 16) != 0) {
            i3 = fantasyRoundTransfers.transferPenalty;
        }
        if ((i4 & 32) != 0) {
            bool = fantasyRoundTransfers.rebuildSquadActive;
        }
        if ((i4 & 64) != 0) {
            bool2 = fantasyRoundTransfers.quickFixActive;
        }
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        int i5 = i3;
        int i6 = i2;
        return fantasyRoundTransfers.copy(i, str, i6, list, i5, bool3, bool4);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyRoundTransfers self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.roundId, serialDesc);
        output.y(serialDesc, 1, self.roundName);
        output.u(2, self.roundSequence, serialDesc);
        output.f(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.transfers);
        output.u(4, self.transferPenalty, serialDesc);
        gz1 gz1Var = gz1.a;
        output.h(serialDesc, 5, gz1Var, self.rebuildSquadActive);
        output.h(serialDesc, 6, gz1Var, self.quickFixActive);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRoundId() {
        return this.roundId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRoundName() {
        return this.roundName;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRoundSequence() {
        return this.roundSequence;
    }

    @NotNull
    public final List<FantasyTransfer> component4() {
        return this.transfers;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTransferPenalty() {
        return this.transferPenalty;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Boolean getRebuildSquadActive() {
        return this.rebuildSquadActive;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Boolean getQuickFixActive() {
        return this.quickFixActive;
    }

    @NotNull
    public final FantasyRoundTransfers copy(int roundId, @NotNull String roundName, int roundSequence, @NotNull List<FantasyTransfer> transfers, int transferPenalty, @Nullable Boolean rebuildSquadActive, @Nullable Boolean quickFixActive) {
        roundName.getClass();
        transfers.getClass();
        return new FantasyRoundTransfers(roundId, roundName, roundSequence, transfers, transferPenalty, rebuildSquadActive, quickFixActive);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyRoundTransfers)) {
            return false;
        }
        FantasyRoundTransfers fantasyRoundTransfers = (FantasyRoundTransfers) other;
        return this.roundId == fantasyRoundTransfers.roundId && Intrinsics.c(this.roundName, fantasyRoundTransfers.roundName) && this.roundSequence == fantasyRoundTransfers.roundSequence && Intrinsics.c(this.transfers, fantasyRoundTransfers.transfers) && this.transferPenalty == fantasyRoundTransfers.transferPenalty && Intrinsics.c(this.rebuildSquadActive, fantasyRoundTransfers.rebuildSquadActive) && Intrinsics.c(this.quickFixActive, fantasyRoundTransfers.quickFixActive);
    }

    @Nullable
    public final Boolean getQuickFixActive() {
        return this.quickFixActive;
    }

    @Nullable
    public final Boolean getRebuildSquadActive() {
        return this.rebuildSquadActive;
    }

    public final int getRoundId() {
        return this.roundId;
    }

    @NotNull
    public final String getRoundName() {
        return this.roundName;
    }

    public final int getRoundSequence() {
        return this.roundSequence;
    }

    public final int getTransferPenalty() {
        return this.transferPenalty;
    }

    @NotNull
    public final List<FantasyTransfer> getTransfers() {
        return this.transfers;
    }

    public int hashCode() {
        int a = wv8.a(this.transferPenalty, dmi.d(wv8.a(this.roundSequence, dmi.c(Integer.hashCode(this.roundId) * 31, 31, this.roundName), 31), 31, this.transfers), 31);
        Boolean bool = this.rebuildSquadActive;
        int hashCode = (a + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.quickFixActive;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.roundId;
        String str = this.roundName;
        int i2 = this.roundSequence;
        List<FantasyTransfer> list = this.transfers;
        int i3 = this.transferPenalty;
        Boolean bool = this.rebuildSquadActive;
        Boolean bool2 = this.quickFixActive;
        StringBuilder t = dmi.t(i, "FantasyRoundTransfers(roundId=", ", roundName=", str, ", roundSequence=");
        t.append(i2);
        t.append(", transfers=");
        t.append(list);
        t.append(", transferPenalty=");
        t.append(i3);
        t.append(", rebuildSquadActive=");
        t.append(bool);
        t.append(", quickFixActive=");
        t.append(bool2);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyRoundTransfers$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyRoundTransfers;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyRoundTransfers$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyRoundTransfers(int i, @NotNull String str, int i2, @NotNull List<FantasyTransfer> list, int i3, @Nullable Boolean bool, @Nullable Boolean bool2) {
        str.getClass();
        list.getClass();
        this.roundId = i;
        this.roundName = str;
        this.roundSequence = i2;
        this.transfers = list;
        this.transferPenalty = i3;
        this.rebuildSquadActive = bool;
        this.quickFixActive = bool2;
    }
}

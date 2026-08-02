package com.sofascore.model.newNetwork.commentary;

import defpackage.a7a;
import defpackage.fc6;
import defpackage.hz8;
import defpackage.ivc;
import defpackage.joa;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010 JX\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b4\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b5\u0010 ¨\u00068"}, d2 = {"Lcom/sofascore/model/newNetwork/commentary/NotableAction;", "Ljava/io/Serializable;", "", "action", "Lcom/sofascore/model/newNetwork/commentary/BaseballActionOutcome;", "outcome", "description", "", "playerId", "atBatId", "pitchId", "<init>", "(Ljava/lang/String;Lcom/sofascore/model/newNetwork/commentary/BaseballActionOutcome;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/sofascore/model/newNetwork/commentary/BaseballActionOutcome;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/commentary/NotableAction;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/sofascore/model/newNetwork/commentary/BaseballActionOutcome;", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/sofascore/model/newNetwork/commentary/BaseballActionOutcome;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/commentary/NotableAction;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAction", "Lcom/sofascore/model/newNetwork/commentary/BaseballActionOutcome;", "getOutcome", "getDescription", "Ljava/lang/Integer;", "getPlayerId", "getAtBatId", "getPitchId", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NotableAction implements Serializable {

    @Nullable
    private final String action;

    @Nullable
    private final Integer atBatId;

    @Nullable
    private final String description;

    @Nullable
    private final BaseballActionOutcome outcome;

    @Nullable
    private final Integer pitchId;

    @Nullable
    private final Integer playerId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new ivc(19)), null, null, null, null};

    public /* synthetic */ NotableAction(int i, String str, BaseballActionOutcome baseballActionOutcome, String str2, Integer num, Integer num2, Integer num3, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, NotableAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.action = str;
        this.outcome = baseballActionOutcome;
        this.description = str2;
        this.playerId = num;
        this.atBatId = num2;
        this.pitchId = num3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return hz8.F("com.sofascore.model.newNetwork.commentary.BaseballActionOutcome", BaseballActionOutcome.values(), new String[]{"kAK", "kAKP", "kAKB", "kKL", "kKS", "kF", "kFT", "rPABC", "rPABO", "oBI", "oDT2", "oDT3", "oDT4", "oFC", "oFCT2", "oFCT3", "oFCT4", "oFO", "oGO", "oKLT1", "oKLT2", "oKLT3", "oKLT4", "oKST1", "oKST2", "oKST3", "oKST4", "oROET2", "oROET3", "oROET4", "oST1", "oST2", "oST3", "oST4", "oTT3", "oTT4", "oLO", "oOBB", "oOP", "oPO", "oSB", "oSBT2", "oSBT3", "oSBT4", "oSF", "oSFT2", "oSFT3", "oSFT4", "bAB", "bABP", "bABC", "bABS", "bB", "bDB", "bIB", "bPO", "aBK", "aCI", "aD", "aDAD3", "aDAD4", "aFCAD2", "aFCAD3", "aFCAD4", "aHBP", "aHR", "aIBB", "BB", "aKLAD1", "aKLAD2", "aKLAD3", "aKLAD4", "aKSAD1", "aKSAD2", "aKSAD3", "aKSAD4", "aROE", "aROEAD2", "aROEAD3", "aROEAD4", "aROV", "aS", "aSAD2", "aSAD3", "aSAD4", "aSBAD1", "aSBAD2", "aSBAD3", "aSBAD4", "aSFAD1", "aSFAD2", "aSFAD3", "aSFAD4", "aT", "aTAD4", "CS2", "CS3", "CS4", "POCS2", "POCS3", "POCS4", "TO", "TO2", "TO3", "TO4", "FO1", "FO2", "FO3", "FO4", "DO1", "DO2", "DO3", "SB2O2", "SB2O3", "SB2O4", "SB3O3", "SB3O4", "RI", "OOA", "OBP", "HBB", "SB2", "SB3", "SB4", "SB4u", "AD1", "AD2", "AD3", "DI2", "DI3", "CS2AD3", "CS2AD4", "CS2AD4u", "CS3AD4", "CS3AD4u", "SB2E2", "SB2E3", "SB2E4", "SB3E4", "SB2E4E", "SB3E4E", "SB2AD3", "SB2AD4", "SB2AD4u", "SB3AD4", "SB3AD4u", "CK", "PO", "POCSC", "ERN", "eRN", "ERNu", "eRNu", "URN", "uRN", "PITCHER_SUBSTITUTION", "PINCH_HITTING_SUBSTITUTION", "PINCH_RUNNING_SUBSTITUTION", "DEFENSIVE_SUBSTITUTION", "DEFENSIVE_SWITCH"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
    }

    public static /* synthetic */ NotableAction copy$default(NotableAction notableAction, String str, BaseballActionOutcome baseballActionOutcome, String str2, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notableAction.action;
        }
        if ((i & 2) != 0) {
            baseballActionOutcome = notableAction.outcome;
        }
        if ((i & 4) != 0) {
            str2 = notableAction.description;
        }
        if ((i & 8) != 0) {
            num = notableAction.playerId;
        }
        if ((i & 16) != 0) {
            num2 = notableAction.atBatId;
        }
        if ((i & 32) != 0) {
            num3 = notableAction.pitchId;
        }
        Integer num4 = num2;
        Integer num5 = num3;
        return notableAction.copy(str, baseballActionOutcome, str2, num, num4, num5);
    }

    public static final /* synthetic */ void write$Self$model_release(NotableAction self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 0, uhiVar, self.action);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.outcome);
        output.h(serialDesc, 2, uhiVar, self.description);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 3, a7aVar, self.playerId);
        output.h(serialDesc, 4, a7aVar, self.atBatId);
        output.h(serialDesc, 5, a7aVar, self.pitchId);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final BaseballActionOutcome getOutcome() {
        return this.outcome;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getPlayerId() {
        return this.playerId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getAtBatId() {
        return this.atBatId;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getPitchId() {
        return this.pitchId;
    }

    @NotNull
    public final NotableAction copy(@Nullable String action, @Nullable BaseballActionOutcome outcome, @Nullable String description, @Nullable Integer playerId, @Nullable Integer atBatId, @Nullable Integer pitchId) {
        return new NotableAction(action, outcome, description, playerId, atBatId, pitchId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotableAction)) {
            return false;
        }
        NotableAction notableAction = (NotableAction) other;
        return Intrinsics.c(this.action, notableAction.action) && this.outcome == notableAction.outcome && Intrinsics.c(this.description, notableAction.description) && Intrinsics.c(this.playerId, notableAction.playerId) && Intrinsics.c(this.atBatId, notableAction.atBatId) && Intrinsics.c(this.pitchId, notableAction.pitchId);
    }

    @Nullable
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final Integer getAtBatId() {
        return this.atBatId;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final BaseballActionOutcome getOutcome() {
        return this.outcome;
    }

    @Nullable
    public final Integer getPitchId() {
        return this.pitchId;
    }

    @Nullable
    public final Integer getPlayerId() {
        return this.playerId;
    }

    public int hashCode() {
        String str = this.action;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BaseballActionOutcome baseballActionOutcome = this.outcome;
        int hashCode2 = (hashCode + (baseballActionOutcome == null ? 0 : baseballActionOutcome.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.playerId;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.atBatId;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.pitchId;
        return hashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.action;
        BaseballActionOutcome baseballActionOutcome = this.outcome;
        String str2 = this.description;
        Integer num = this.playerId;
        Integer num2 = this.atBatId;
        Integer num3 = this.pitchId;
        StringBuilder sb = new StringBuilder("NotableAction(action=");
        sb.append(str);
        sb.append(", outcome=");
        sb.append(baseballActionOutcome);
        sb.append(", description=");
        me4.o(num, str2, ", playerId=", ", atBatId=", sb);
        return fc6.l(num2, num3, ", pitchId=", ")", sb);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/commentary/NotableAction$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/commentary/NotableAction;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return NotableAction$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public NotableAction(@Nullable String str, @Nullable BaseballActionOutcome baseballActionOutcome, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.action = str;
        this.outcome = baseballActionOutcome;
        this.description = str2;
        this.playerId = num;
        this.atBatId = num2;
        this.pitchId = num3;
    }
}

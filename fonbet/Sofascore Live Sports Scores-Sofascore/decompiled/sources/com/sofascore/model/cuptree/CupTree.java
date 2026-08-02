package com.sofascore.model.cuptree;

import defpackage.dmi;
import defpackage.g14;
import defpackage.gz1;
import defpackage.joa;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000289BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%JX\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001dJ\u001a\u0010,\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u001dR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u0010%¨\u0006:"}, d2 = {"Lcom/sofascore/model/cuptree/CupTree;", "Ljava/io/Serializable;", "", "id", "", "name", "currentRound", "type", "", "Lcom/sofascore/model/cuptree/CupTreeRound;", "rounds", "", "showSingleParticipantByeBlocks", "<init>", "(ILjava/lang/String;IILjava/util/List;Ljava/lang/Boolean;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;IILjava/util/List;Ljava/lang/Boolean;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/cuptree/CupTree;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "()Ljava/lang/Boolean;", "copy", "(ILjava/lang/String;IILjava/util/List;Ljava/lang/Boolean;)Lcom/sofascore/model/cuptree/CupTree;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getName", "getCurrentRound", "getType", "Ljava/util/List;", "getRounds", "Ljava/lang/Boolean;", "getShowSingleParticipantByeBlocks", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CupTree implements Serializable {
    public static final int CUP_TREE_REGULAR = 1;
    private final int currentRound;
    private final int id;

    @Nullable
    private final String name;

    @Nullable
    private final List<CupTreeRound> rounds;

    @Nullable
    private final Boolean showSingleParticipantByeBlocks;
    private final int type;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, ypa.a(ysa.b, new g14(17)), null};

    public /* synthetic */ CupTree(int i, int i2, String str, int i3, int i4, List list, Boolean bool, t5h t5hVar) {
        if (58 != (i & 58)) {
            oea.z(i, 58, CupTree$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = (i & 1) == 0 ? -1 : i2;
        this.name = str;
        if ((i & 4) == 0) {
            this.currentRound = 0;
        } else {
            this.currentRound = i3;
        }
        this.type = i4;
        this.rounds = list;
        this.showSingleParticipantByeBlocks = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(CupTreeRound$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ CupTree copy$default(CupTree cupTree, int i, String str, int i2, int i3, List list, Boolean bool, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = cupTree.id;
        }
        if ((i4 & 2) != 0) {
            str = cupTree.name;
        }
        if ((i4 & 4) != 0) {
            i2 = cupTree.currentRound;
        }
        if ((i4 & 8) != 0) {
            i3 = cupTree.type;
        }
        if ((i4 & 16) != 0) {
            list = cupTree.rounds;
        }
        if ((i4 & 32) != 0) {
            bool = cupTree.showSingleParticipantByeBlocks;
        }
        List list2 = list;
        Boolean bool2 = bool;
        return cupTree.copy(i, str, i2, i3, list2, bool2);
    }

    public static final /* synthetic */ void write$Self$model_release(CupTree self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        if (output.o(serialDesc) || self.id != -1) {
            output.u(0, self.id, serialDesc);
        }
        output.h(serialDesc, 1, uhi.a, self.name);
        if (output.o(serialDesc) || self.currentRound != 0) {
            output.u(2, self.currentRound, serialDesc);
        }
        output.u(3, self.type, serialDesc);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.rounds);
        output.h(serialDesc, 5, gz1.a, self.showSingleParticipantByeBlocks);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCurrentRound() {
        return this.currentRound;
    }

    /* renamed from: component4, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    public final List<CupTreeRound> component5() {
        return this.rounds;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Boolean getShowSingleParticipantByeBlocks() {
        return this.showSingleParticipantByeBlocks;
    }

    @NotNull
    public final CupTree copy(int id, @Nullable String name, int currentRound, int type, @Nullable List<CupTreeRound> rounds, @Nullable Boolean showSingleParticipantByeBlocks) {
        return new CupTree(id, name, currentRound, type, rounds, showSingleParticipantByeBlocks);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CupTree)) {
            return false;
        }
        CupTree cupTree = (CupTree) other;
        return this.id == cupTree.id && Intrinsics.c(this.name, cupTree.name) && this.currentRound == cupTree.currentRound && this.type == cupTree.type && Intrinsics.c(this.rounds, cupTree.rounds) && Intrinsics.c(this.showSingleParticipantByeBlocks, cupTree.showSingleParticipantByeBlocks);
    }

    public final int getCurrentRound() {
        return this.currentRound;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<CupTreeRound> getRounds() {
        return this.rounds;
    }

    @Nullable
    public final Boolean getShowSingleParticipantByeBlocks() {
        return this.showSingleParticipantByeBlocks;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.name;
        int a = wv8.a(this.type, wv8.a(this.currentRound, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        List<CupTreeRound> list = this.rounds;
        int hashCode2 = (a + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.showSingleParticipantByeBlocks;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.name;
        int i2 = this.currentRound;
        int i3 = this.type;
        List<CupTreeRound> list = this.rounds;
        Boolean bool = this.showSingleParticipantByeBlocks;
        StringBuilder t = dmi.t(i, "CupTree(id=", ", name=", str, ", currentRound=");
        me4.q(t, i2, ", type=", i3, ", rounds=");
        t.append(list);
        t.append(", showSingleParticipantByeBlocks=");
        t.append(bool);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/sofascore/model/cuptree/CupTree$Companion;", "", "<init>", "()V", "CUP_TREE_REGULAR", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/cuptree/CupTree;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CupTree$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CupTree(int i, @Nullable String str, int i2, int i3, @Nullable List<CupTreeRound> list, @Nullable Boolean bool) {
        this.id = i;
        this.name = str;
        this.currentRound = i2;
        this.type = i3;
        this.rounds = list;
        this.showSingleParticipantByeBlocks = bool;
    }

    public /* synthetic */ CupTree(int i, String str, int i2, int i3, List list, Boolean bool, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, str, (i4 & 4) != 0 ? 0 : i2, i3, list, bool);
    }
}

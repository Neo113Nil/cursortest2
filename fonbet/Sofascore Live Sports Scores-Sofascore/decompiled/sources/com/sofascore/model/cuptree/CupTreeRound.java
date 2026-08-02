package com.sofascore.model.cuptree;

import com.ironsource.C4227o2;
import defpackage.dmi;
import defpackage.g14;
import defpackage.joa;
import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000278BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBU\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%JT\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b(\u0010!J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0014J\u001a\u0010,\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u0010%¨\u00069"}, d2 = {"Lcom/sofascore/model/cuptree/CupTreeRound;", "Ljava/io/Serializable;", "", "type", C4227o2.u, "id", "", "description", "", "Lcom/sofascore/model/cuptree/CupTreeBlock;", "blocks", "", "participantDraw", "<init>", "(IIILjava/lang/String;Ljava/util/List;Z)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIIILjava/lang/String;Ljava/util/List;ZLt5h;)V", "component3", "()I", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/cuptree/CupTreeRound;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "component2", "component4", "()Ljava/lang/String;", "component5", "()Ljava/util/List;", "component6", "()Z", "copy", "(IIILjava/lang/String;Ljava/util/List;Z)Lcom/sofascore/model/cuptree/CupTreeRound;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getType", "getOrder", "Ljava/lang/String;", "getDescription", "Ljava/util/List;", "getBlocks", "Z", "getParticipantDraw", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CupTreeRound implements Serializable {
    public static final int TYPE_3RD_PLACE = 0;
    public static final int TYPE_EIGHT_FINALS = 8;
    public static final int TYPE_FINALS = 1;
    public static final int TYPE_QUARTERFINALS = 4;
    public static final int TYPE_SEMIFINALS = 2;
    public static final int TYPE_SIXTEEN_FINALS = 16;

    @NotNull
    private final List<CupTreeBlock> blocks;

    @Nullable
    private final String description;
    private final int id;
    private final int order;
    private final boolean participantDraw;
    private final int type;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, ypa.a(ysa.b, new g14(22)), null};

    public /* synthetic */ CupTreeRound(int i, int i2, int i3, int i4, String str, List list, boolean z, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, CupTreeRound$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = i2;
        this.order = i3;
        this.id = i4;
        if ((i & 8) == 0) {
            this.description = null;
        } else {
            this.description = str;
        }
        if ((i & 16) == 0) {
            this.blocks = new ArrayList();
        } else {
            this.blocks = list;
        }
        if ((i & 32) == 0) {
            this.participantDraw = false;
        } else {
            this.participantDraw = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(CupTreeBlock$$serializer.INSTANCE, 0);
    }

    /* renamed from: component3, reason: from getter */
    private final int getId() {
        return this.id;
    }

    public static /* synthetic */ CupTreeRound copy$default(CupTreeRound cupTreeRound, int i, int i2, int i3, String str, List list, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = cupTreeRound.type;
        }
        if ((i4 & 2) != 0) {
            i2 = cupTreeRound.order;
        }
        if ((i4 & 4) != 0) {
            i3 = cupTreeRound.id;
        }
        if ((i4 & 8) != 0) {
            str = cupTreeRound.description;
        }
        if ((i4 & 16) != 0) {
            list = cupTreeRound.blocks;
        }
        if ((i4 & 32) != 0) {
            z = cupTreeRound.participantDraw;
        }
        List list2 = list;
        boolean z2 = z;
        return cupTreeRound.copy(i, i2, i3, str, list2, z2);
    }

    public static final /* synthetic */ void write$Self$model_release(CupTreeRound self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.type, serialDesc);
        output.u(1, self.order, serialDesc);
        output.u(2, self.id, serialDesc);
        if (output.o(serialDesc) || self.description != null) {
            output.h(serialDesc, 3, uhi.a, self.description);
        }
        if (output.o(serialDesc) || !Intrinsics.c(self.blocks, new ArrayList())) {
            output.f(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.blocks);
        }
        if (output.o(serialDesc) || self.participantDraw) {
            output.x(serialDesc, 5, self.participantDraw);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final List<CupTreeBlock> component5() {
        return this.blocks;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getParticipantDraw() {
        return this.participantDraw;
    }

    @NotNull
    public final CupTreeRound copy(int type, int order, int id, @Nullable String description, @NotNull List<CupTreeBlock> blocks, boolean participantDraw) {
        blocks.getClass();
        return new CupTreeRound(type, order, id, description, blocks, participantDraw);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CupTreeRound)) {
            return false;
        }
        CupTreeRound cupTreeRound = (CupTreeRound) other;
        return this.type == cupTreeRound.type && this.order == cupTreeRound.order && this.id == cupTreeRound.id && Intrinsics.c(this.description, cupTreeRound.description) && Intrinsics.c(this.blocks, cupTreeRound.blocks) && this.participantDraw == cupTreeRound.participantDraw;
    }

    @NotNull
    public final List<CupTreeBlock> getBlocks() {
        return this.blocks;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public final int getOrder() {
        return this.order;
    }

    public final boolean getParticipantDraw() {
        return this.participantDraw;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int a = wv8.a(this.id, wv8.a(this.order, Integer.hashCode(this.type) * 31, 31), 31);
        String str = this.description;
        return Boolean.hashCode(this.participantDraw) + dmi.d((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.blocks);
    }

    @NotNull
    public String toString() {
        int i = this.type;
        int i2 = this.order;
        int i3 = this.id;
        String str = this.description;
        List<CupTreeBlock> list = this.blocks;
        boolean z = this.participantDraw;
        StringBuilder s = lnb.s(i, i2, "CupTreeRound(type=", ", order=", ", id=");
        vxd.p(i3, ", description=", str, ", blocks=", s);
        s.append(list);
        s.append(", participantDraw=");
        s.append(z);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/sofascore/model/cuptree/CupTreeRound$Companion;", "", "<init>", "()V", "TYPE_3RD_PLACE", "", "TYPE_FINALS", "TYPE_SEMIFINALS", "TYPE_QUARTERFINALS", "TYPE_EIGHT_FINALS", "TYPE_SIXTEEN_FINALS", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/cuptree/CupTreeRound;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CupTreeRound$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CupTreeRound(int i, int i2, int i3, @Nullable String str, @NotNull List<CupTreeBlock> list, boolean z) {
        list.getClass();
        this.type = i;
        this.order = i2;
        this.id = i3;
        this.description = str;
        this.blocks = list;
        this.participantDraw = z;
    }

    public /* synthetic */ CupTreeRound(int i, int i2, int i3, String str, List list, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, (i4 & 8) != 0 ? null : str, (i4 & 16) != 0 ? new ArrayList() : list, (i4 & 32) != 0 ? false : z);
    }
}

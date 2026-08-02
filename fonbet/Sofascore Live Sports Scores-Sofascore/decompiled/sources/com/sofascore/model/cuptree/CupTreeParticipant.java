package com.sofascore.model.cuptree;

import com.ironsource.C4227o2;
import com.sofascore.model.mvvm.model.Team;
import defpackage.g14;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 *2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002+*B7\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBG\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/sofascore/model/cuptree/CupTreeParticipant;", "Ljava/io/Serializable;", "", "Lcom/sofascore/model/mvvm/model/Team;", "team", "", "winner", "", "sourceBlockId", C4227o2.u, "", "teamSeed", "<init>", "(Lcom/sofascore/model/mvvm/model/Team;ZIILjava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Team;ZIILjava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/cuptree/CupTreeParticipant;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "other", "compareTo", "(Lcom/sofascore/model/cuptree/CupTreeParticipant;)I", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "()Lcom/sofascore/model/mvvm/model/Team;", "Z", "getWinner", "()Z", "I", "getSourceBlockId", "()I", "Ljava/lang/String;", "getTeamSeed", "()Ljava/lang/String;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CupTreeParticipant implements Serializable, Comparable<CupTreeParticipant> {
    private final int order;
    private final int sourceBlockId;

    @Nullable
    private final Team team;

    @Nullable
    private final String teamSeed;
    private final boolean winner;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {ypa.a(ysa.b, new g14(21)), null, null, null, null};

    public /* synthetic */ CupTreeParticipant(int i, Team team, boolean z, int i2, int i3, String str, t5h t5hVar) {
        if (19 != (i & 19)) {
            oea.z(i, 19, CupTreeParticipant$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.team = team;
        this.winner = z;
        if ((i & 4) == 0) {
            this.sourceBlockId = 0;
        } else {
            this.sourceBlockId = i2;
        }
        if ((i & 8) == 0) {
            this.order = 0;
        } else {
            this.order = i3;
        }
        this.teamSeed = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static final /* synthetic */ void write$Self$model_release(CupTreeParticipant self, wf3 output, SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.team);
        output.x(serialDesc, 1, self.winner);
        if (output.o(serialDesc) || self.sourceBlockId != 0) {
            output.u(2, self.sourceBlockId, serialDesc);
        }
        if (output.o(serialDesc) || self.order != 0) {
            output.u(3, self.order, serialDesc);
        }
        output.h(serialDesc, 4, uhi.a, self.teamSeed);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull CupTreeParticipant other) {
        other.getClass();
        return this.order < other.order ? -1 : 1;
    }

    public final int getSourceBlockId() {
        return this.sourceBlockId;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    public final String getTeamSeed() {
        return this.teamSeed;
    }

    public final boolean getWinner() {
        return this.winner;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/cuptree/CupTreeParticipant$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/cuptree/CupTreeParticipant;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CupTreeParticipant$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CupTreeParticipant(@Nullable Team team, boolean z, int i, int i2, @Nullable String str) {
        this.team = team;
        this.winner = z;
        this.sourceBlockId = i;
        this.order = i2;
        this.teamSeed = str;
    }

    public /* synthetic */ CupTreeParticipant(Team team, boolean z, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(team, z, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, str);
    }
}

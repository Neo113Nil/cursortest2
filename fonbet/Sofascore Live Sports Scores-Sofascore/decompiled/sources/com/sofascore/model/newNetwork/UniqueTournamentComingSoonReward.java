package com.sofascore.model.newNetwork;

import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006*"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentComingSoonReward;", "Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualReward;", "", "name", "Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualAwardType;", "type", "<init>", "(Ljava/lang/String;Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualAwardType;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualAwardType;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/UniqueTournamentComingSoonReward;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualAwardType;", "copy", "(Ljava/lang/String;Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualAwardType;)Lcom/sofascore/model/newNetwork/UniqueTournamentComingSoonReward;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualAwardType;", "getType", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UniqueTournamentComingSoonReward implements UniqueTournamentIndividualReward {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String name;

    @Nullable
    private final UniqueTournamentIndividualAwardType type;

    public /* synthetic */ UniqueTournamentComingSoonReward(int i, String str, UniqueTournamentIndividualAwardType uniqueTournamentIndividualAwardType, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, UniqueTournamentComingSoonReward$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.name = str;
        this.type = uniqueTournamentIndividualAwardType;
    }

    public static /* synthetic */ UniqueTournamentComingSoonReward copy$default(UniqueTournamentComingSoonReward uniqueTournamentComingSoonReward, String str, UniqueTournamentIndividualAwardType uniqueTournamentIndividualAwardType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uniqueTournamentComingSoonReward.name;
        }
        if ((i & 2) != 0) {
            uniqueTournamentIndividualAwardType = uniqueTournamentComingSoonReward.type;
        }
        return uniqueTournamentComingSoonReward.copy(str, uniqueTournamentIndividualAwardType);
    }

    public static final /* synthetic */ void write$Self$model_release(UniqueTournamentComingSoonReward self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.getName());
        output.h(serialDesc, 1, UniqueTournamentIndividualAwardTypeSerializer.INSTANCE, self.getType());
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final UniqueTournamentIndividualAwardType getType() {
        return this.type;
    }

    @NotNull
    public final UniqueTournamentComingSoonReward copy(@NotNull String name, @Nullable UniqueTournamentIndividualAwardType type) {
        name.getClass();
        return new UniqueTournamentComingSoonReward(name, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniqueTournamentComingSoonReward)) {
            return false;
        }
        UniqueTournamentComingSoonReward uniqueTournamentComingSoonReward = (UniqueTournamentComingSoonReward) other;
        return Intrinsics.c(this.name, uniqueTournamentComingSoonReward.name) && this.type == uniqueTournamentComingSoonReward.type;
    }

    @Override // com.sofascore.model.newNetwork.UniqueTournamentIndividualReward
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override // com.sofascore.model.newNetwork.UniqueTournamentIndividualReward
    @Nullable
    public UniqueTournamentIndividualAwardType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        UniqueTournamentIndividualAwardType uniqueTournamentIndividualAwardType = this.type;
        return hashCode + (uniqueTournamentIndividualAwardType == null ? 0 : uniqueTournamentIndividualAwardType.hashCode());
    }

    @NotNull
    public String toString() {
        return "UniqueTournamentComingSoonReward(name=" + this.name + ", type=" + this.type + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentComingSoonReward$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/UniqueTournamentComingSoonReward;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UniqueTournamentComingSoonReward$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UniqueTournamentComingSoonReward(@NotNull String str, @Nullable UniqueTournamentIndividualAwardType uniqueTournamentIndividualAwardType) {
        str.getClass();
        this.name = str;
        this.type = uniqueTournamentIndividualAwardType;
    }
}

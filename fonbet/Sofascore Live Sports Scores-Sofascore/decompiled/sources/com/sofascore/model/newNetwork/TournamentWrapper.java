package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournament$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.fc6;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u0019¨\u0006,"}, d2 = {"Lcom/sofascore/model/newNetwork/TournamentWrapper;", "", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", SearchResponseKt.LEAGUE_ENTITY, "", "numberOfEvents", "numberOfLiveEvents", "<init>", "(Lcom/sofascore/model/mvvm/model/UniqueTournament;II)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/UniqueTournament;IILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/TournamentWrapper;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/UniqueTournament;", "component2", "()I", "component3", "copy", "(Lcom/sofascore/model/mvvm/model/UniqueTournament;II)Lcom/sofascore/model/newNetwork/TournamentWrapper;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "getUniqueTournament", "I", "getNumberOfEvents", "getNumberOfLiveEvents", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TournamentWrapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int numberOfEvents;
    private final int numberOfLiveEvents;

    @NotNull
    private final UniqueTournament uniqueTournament;

    public /* synthetic */ TournamentWrapper(int i, UniqueTournament uniqueTournament, int i2, int i3, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, TournamentWrapper$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.uniqueTournament = uniqueTournament;
        this.numberOfEvents = i2;
        this.numberOfLiveEvents = i3;
    }

    public static /* synthetic */ TournamentWrapper copy$default(TournamentWrapper tournamentWrapper, UniqueTournament uniqueTournament, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            uniqueTournament = tournamentWrapper.uniqueTournament;
        }
        if ((i3 & 2) != 0) {
            i = tournamentWrapper.numberOfEvents;
        }
        if ((i3 & 4) != 0) {
            i2 = tournamentWrapper.numberOfLiveEvents;
        }
        return tournamentWrapper.copy(uniqueTournament, i, i2);
    }

    public static final /* synthetic */ void write$Self$model_release(TournamentWrapper self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, UniqueTournament$$serializer.INSTANCE, self.uniqueTournament);
        output.u(1, self.numberOfEvents, serialDesc);
        output.u(2, self.numberOfLiveEvents, serialDesc);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    /* renamed from: component2, reason: from getter */
    public final int getNumberOfEvents() {
        return this.numberOfEvents;
    }

    /* renamed from: component3, reason: from getter */
    public final int getNumberOfLiveEvents() {
        return this.numberOfLiveEvents;
    }

    @NotNull
    public final TournamentWrapper copy(@NotNull UniqueTournament uniqueTournament, int numberOfEvents, int numberOfLiveEvents) {
        uniqueTournament.getClass();
        return new TournamentWrapper(uniqueTournament, numberOfEvents, numberOfLiveEvents);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TournamentWrapper)) {
            return false;
        }
        TournamentWrapper tournamentWrapper = (TournamentWrapper) other;
        return Intrinsics.c(this.uniqueTournament, tournamentWrapper.uniqueTournament) && this.numberOfEvents == tournamentWrapper.numberOfEvents && this.numberOfLiveEvents == tournamentWrapper.numberOfLiveEvents;
    }

    public final int getNumberOfEvents() {
        return this.numberOfEvents;
    }

    public final int getNumberOfLiveEvents() {
        return this.numberOfLiveEvents;
    }

    @NotNull
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    public int hashCode() {
        return Integer.hashCode(this.numberOfLiveEvents) + wv8.a(this.numberOfEvents, this.uniqueTournament.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        UniqueTournament uniqueTournament = this.uniqueTournament;
        int i = this.numberOfEvents;
        int i2 = this.numberOfLiveEvents;
        StringBuilder sb = new StringBuilder("TournamentWrapper(uniqueTournament=");
        sb.append(uniqueTournament);
        sb.append(", numberOfEvents=");
        sb.append(i);
        sb.append(", numberOfLiveEvents=");
        return fc6.h(i2, ")", sb);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TournamentWrapper$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TournamentWrapper;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TournamentWrapper$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TournamentWrapper(@NotNull UniqueTournament uniqueTournament, int i, int i2) {
        uniqueTournament.getClass();
        this.uniqueTournament = uniqueTournament;
        this.numberOfEvents = i;
        this.numberOfLiveEvents = i2;
    }
}

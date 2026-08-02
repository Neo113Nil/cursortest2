package com.sofascore.model.newNetwork;

import defpackage.ag5;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007BI\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001d¨\u00060"}, d2 = {"Lcom/sofascore/model/newNetwork/EventBestPlayersSummaryResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "", "Lcom/sofascore/model/newNetwork/EventBestPlayer;", "leaderboard", "playerOfTheMatch", "<init>", "(Ljava/util/List;Lcom/sofascore/model/newNetwork/EventBestPlayer;)V", "", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Ljava/util/List;Lcom/sofascore/model/newNetwork/EventBestPlayer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/EventBestPlayersSummaryResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/sofascore/model/newNetwork/EventBestPlayer;", "copy", "(Ljava/util/List;Lcom/sofascore/model/newNetwork/EventBestPlayer;)Lcom/sofascore/model/newNetwork/EventBestPlayersSummaryResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getLeaderboard", "Lcom/sofascore/model/newNetwork/EventBestPlayer;", "getPlayerOfTheMatch", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EventBestPlayersSummaryResponse extends NetworkResponse {

    @Nullable
    private final List<EventBestPlayer> leaderboard;

    @Nullable
    private final EventBestPlayer playerOfTheMatch;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, ypa.a(ysa.b, new ag5(28)), null};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EventBestPlayersSummaryResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, List list, EventBestPlayer eventBestPlayer, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (12 != (i & 12)) {
            oea.z(i, 12, EventBestPlayersSummaryResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.leaderboard = list;
        this.playerOfTheMatch = eventBestPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(EventBestPlayer$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventBestPlayersSummaryResponse copy$default(EventBestPlayersSummaryResponse eventBestPlayersSummaryResponse, List list, EventBestPlayer eventBestPlayer, int i, Object obj) {
        if ((i & 1) != 0) {
            list = eventBestPlayersSummaryResponse.leaderboard;
        }
        if ((i & 2) != 0) {
            eventBestPlayer = eventBestPlayersSummaryResponse.playerOfTheMatch;
        }
        return eventBestPlayersSummaryResponse.copy(list, eventBestPlayer);
    }

    public static final /* synthetic */ void write$Self$model_release(EventBestPlayersSummaryResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        output.h(serialDesc, 2, (KSerializer) $childSerializers[2].getValue(), self.leaderboard);
        output.h(serialDesc, 3, EventBestPlayer$$serializer.INSTANCE, self.playerOfTheMatch);
    }

    @Nullable
    public final List<EventBestPlayer> component1() {
        return this.leaderboard;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final EventBestPlayer getPlayerOfTheMatch() {
        return this.playerOfTheMatch;
    }

    @NotNull
    public final EventBestPlayersSummaryResponse copy(@Nullable List<EventBestPlayer> leaderboard, @Nullable EventBestPlayer playerOfTheMatch) {
        return new EventBestPlayersSummaryResponse(leaderboard, playerOfTheMatch);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventBestPlayersSummaryResponse)) {
            return false;
        }
        EventBestPlayersSummaryResponse eventBestPlayersSummaryResponse = (EventBestPlayersSummaryResponse) other;
        return Intrinsics.c(this.leaderboard, eventBestPlayersSummaryResponse.leaderboard) && Intrinsics.c(this.playerOfTheMatch, eventBestPlayersSummaryResponse.playerOfTheMatch);
    }

    @Nullable
    public final List<EventBestPlayer> getLeaderboard() {
        return this.leaderboard;
    }

    @Nullable
    public final EventBestPlayer getPlayerOfTheMatch() {
        return this.playerOfTheMatch;
    }

    public int hashCode() {
        List<EventBestPlayer> list = this.leaderboard;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        EventBestPlayer eventBestPlayer = this.playerOfTheMatch;
        return hashCode + (eventBestPlayer != null ? eventBestPlayer.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EventBestPlayersSummaryResponse(leaderboard=" + this.leaderboard + ", playerOfTheMatch=" + this.playerOfTheMatch + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/EventBestPlayersSummaryResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/EventBestPlayersSummaryResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EventBestPlayersSummaryResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventBestPlayersSummaryResponse(@Nullable List<EventBestPlayer> list, @Nullable EventBestPlayer eventBestPlayer) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        this.leaderboard = list;
        this.playerOfTheMatch = eventBestPlayer;
    }
}

package com.sofascore.model.network.response;

import defpackage.a7a;
import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wv8;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB=\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001b¨\u0006/"}, d2 = {"Lcom/sofascore/model/network/response/EventBasicInfo;", "Ljava/io/Serializable;", "", "eventId", "homeTeamId", "awayTeamId", "uniqueTournamentId", "<init>", "(IIILjava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIIILjava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/EventBasicInfo;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "component4", "()Ljava/lang/Integer;", "copy", "(IIILjava/lang/Integer;)Lcom/sofascore/model/network/response/EventBasicInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getEventId", "getHomeTeamId", "getAwayTeamId", "Ljava/lang/Integer;", "getUniqueTournamentId", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EventBasicInfo implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int awayTeamId;
    private final int eventId;
    private final int homeTeamId;

    @Nullable
    private final Integer uniqueTournamentId;

    public /* synthetic */ EventBasicInfo(int i, int i2, int i3, int i4, Integer num, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, EventBasicInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.eventId = i2;
        this.homeTeamId = i3;
        this.awayTeamId = i4;
        this.uniqueTournamentId = num;
    }

    public static /* synthetic */ EventBasicInfo copy$default(EventBasicInfo eventBasicInfo, int i, int i2, int i3, Integer num, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = eventBasicInfo.eventId;
        }
        if ((i4 & 2) != 0) {
            i2 = eventBasicInfo.homeTeamId;
        }
        if ((i4 & 4) != 0) {
            i3 = eventBasicInfo.awayTeamId;
        }
        if ((i4 & 8) != 0) {
            num = eventBasicInfo.uniqueTournamentId;
        }
        return eventBasicInfo.copy(i, i2, i3, num);
    }

    public static final /* synthetic */ void write$Self$model_release(EventBasicInfo self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.eventId, serialDesc);
        output.u(1, self.homeTeamId, serialDesc);
        output.u(2, self.awayTeamId, serialDesc);
        output.h(serialDesc, 3, a7a.a, self.uniqueTournamentId);
    }

    /* renamed from: component1, reason: from getter */
    public final int getEventId() {
        return this.eventId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHomeTeamId() {
        return this.homeTeamId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAwayTeamId() {
        return this.awayTeamId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getUniqueTournamentId() {
        return this.uniqueTournamentId;
    }

    @NotNull
    public final EventBasicInfo copy(int eventId, int homeTeamId, int awayTeamId, @Nullable Integer uniqueTournamentId) {
        return new EventBasicInfo(eventId, homeTeamId, awayTeamId, uniqueTournamentId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventBasicInfo)) {
            return false;
        }
        EventBasicInfo eventBasicInfo = (EventBasicInfo) other;
        return this.eventId == eventBasicInfo.eventId && this.homeTeamId == eventBasicInfo.homeTeamId && this.awayTeamId == eventBasicInfo.awayTeamId && Intrinsics.c(this.uniqueTournamentId, eventBasicInfo.uniqueTournamentId);
    }

    public final int getAwayTeamId() {
        return this.awayTeamId;
    }

    public final int getEventId() {
        return this.eventId;
    }

    public final int getHomeTeamId() {
        return this.homeTeamId;
    }

    @Nullable
    public final Integer getUniqueTournamentId() {
        return this.uniqueTournamentId;
    }

    public int hashCode() {
        int a = wv8.a(this.awayTeamId, wv8.a(this.homeTeamId, Integer.hashCode(this.eventId) * 31, 31), 31);
        Integer num = this.uniqueTournamentId;
        return a + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.eventId;
        int i2 = this.homeTeamId;
        int i3 = this.awayTeamId;
        Integer num = this.uniqueTournamentId;
        StringBuilder s = lnb.s(i, i2, "EventBasicInfo(eventId=", ", homeTeamId=", ", awayTeamId=");
        s.append(i3);
        s.append(", uniqueTournamentId=");
        s.append(num);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/EventBasicInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/EventBasicInfo;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EventBasicInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public EventBasicInfo(int i, int i2, int i3, @Nullable Integer num) {
        this.eventId = i;
        this.homeTeamId = i2;
        this.awayTeamId = i3;
        this.uniqueTournamentId = num;
    }
}

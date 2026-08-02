package com.sofascore.model.mvvm.model;

import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.TeamLinkedRoundsSerializer;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import defpackage.a7a;
import defpackage.bxi;
import defpackage.dmi;
import defpackage.joa;
import defpackage.oea;
import defpackage.qq3;
import defpackage.r5h;
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
@r5h(with = TeamLinkedRoundsSerializer.class)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/sofascore/model/mvvm/model/TeamLinkedRound;", "Ljava/io/Serializable;", "<init>", "()V", "TournamentTeamLinkedRound", "EventTeamLinkedRound", "UnknownTeamLinkedRound", "Companion", "Lcom/sofascore/model/mvvm/model/TeamLinkedRound$EventTeamLinkedRound;", "Lcom/sofascore/model/mvvm/model/TeamLinkedRound$TournamentTeamLinkedRound;", "Lcom/sofascore/model/mvvm/model/TeamLinkedRound$UnknownTeamLinkedRound;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class TeamLinkedRound implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0083\u0004J\n\u0010\t\u001a\u00020\nHÖ\u0081\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\fJ\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004¨\u0006\u000f"}, d2 = {"Lcom/sofascore/model/mvvm/model/TeamLinkedRound$UnknownTeamLinkedRound;", "Lcom/sofascore/model/mvvm/model/TeamLinkedRound;", "Ljava/io/Serializable;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnknownTeamLinkedRound extends TeamLinkedRound implements Serializable {

        @NotNull
        public static final UnknownTeamLinkedRound INSTANCE = new UnknownTeamLinkedRound();
        private static final /* synthetic */ joa $cachedSerializer$delegate = ypa.a(ysa.b, new bxi(3));

        private UnknownTeamLinkedRound() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new qq3("com.sofascore.model.mvvm.model.TeamLinkedRound.UnknownTeamLinkedRound", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof UnknownTeamLinkedRound);
        }

        public int hashCode() {
            return -1981257742;
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        @NotNull
        public String toString() {
            return "UnknownTeamLinkedRound";
        }
    }

    public /* synthetic */ TeamLinkedRound(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u000232B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ8\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b1\u0010\u001f¨\u00064"}, d2 = {"Lcom/sofascore/model/mvvm/model/TeamLinkedRound$EventTeamLinkedRound;", "Lcom/sofascore/model/mvvm/model/TeamLinkedRound;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/model/TeamLinksEvent;", "event", "", "type", "Lcom/sofascore/model/mvvm/model/TeamLinksEventTeam;", "homeTeam", "awayTeam", "<init>", "(Lcom/sofascore/model/mvvm/model/TeamLinksEvent;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/TeamLinksEventTeam;Lcom/sofascore/model/mvvm/model/TeamLinksEventTeam;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/TeamLinksEvent;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/TeamLinksEventTeam;Lcom/sofascore/model/mvvm/model/TeamLinksEventTeam;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/TeamLinkedRound$EventTeamLinkedRound;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/TeamLinksEvent;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/sofascore/model/mvvm/model/TeamLinksEventTeam;", "component4", "copy", "(Lcom/sofascore/model/mvvm/model/TeamLinksEvent;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/TeamLinksEventTeam;Lcom/sofascore/model/mvvm/model/TeamLinksEventTeam;)Lcom/sofascore/model/mvvm/model/TeamLinkedRound$EventTeamLinkedRound;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/TeamLinksEvent;", "getEvent", "Ljava/lang/String;", "getType", "Lcom/sofascore/model/mvvm/model/TeamLinksEventTeam;", "getHomeTeam", "getAwayTeam", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EventTeamLinkedRound extends TeamLinkedRound implements Serializable {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final TeamLinksEventTeam awayTeam;

        @NotNull
        private final TeamLinksEvent event;

        @NotNull
        private final TeamLinksEventTeam homeTeam;

        @NotNull
        private final String type;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ EventTeamLinkedRound(int i, TeamLinksEvent teamLinksEvent, String str, TeamLinksEventTeam teamLinksEventTeam, TeamLinksEventTeam teamLinksEventTeam2, t5h t5hVar) {
            super(r0);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (15 != (i & 15)) {
                oea.z(i, 15, TeamLinkedRound$EventTeamLinkedRound$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.event = teamLinksEvent;
            this.type = str;
            this.homeTeam = teamLinksEventTeam;
            this.awayTeam = teamLinksEventTeam2;
        }

        public static /* synthetic */ EventTeamLinkedRound copy$default(EventTeamLinkedRound eventTeamLinkedRound, TeamLinksEvent teamLinksEvent, String str, TeamLinksEventTeam teamLinksEventTeam, TeamLinksEventTeam teamLinksEventTeam2, int i, Object obj) {
            if ((i & 1) != 0) {
                teamLinksEvent = eventTeamLinkedRound.event;
            }
            if ((i & 2) != 0) {
                str = eventTeamLinkedRound.type;
            }
            if ((i & 4) != 0) {
                teamLinksEventTeam = eventTeamLinkedRound.homeTeam;
            }
            if ((i & 8) != 0) {
                teamLinksEventTeam2 = eventTeamLinkedRound.awayTeam;
            }
            return eventTeamLinkedRound.copy(teamLinksEvent, str, teamLinksEventTeam, teamLinksEventTeam2);
        }

        public static final /* synthetic */ void write$Self$model_release(EventTeamLinkedRound self, wf3 output, SerialDescriptor serialDesc) {
            output.f(serialDesc, 0, TeamLinksEvent$$serializer.INSTANCE, self.event);
            output.y(serialDesc, 1, self.type);
            TeamLinksEventTeam$$serializer teamLinksEventTeam$$serializer = TeamLinksEventTeam$$serializer.INSTANCE;
            output.f(serialDesc, 2, teamLinksEventTeam$$serializer, self.homeTeam);
            output.f(serialDesc, 3, teamLinksEventTeam$$serializer, self.awayTeam);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TeamLinksEvent getEvent() {
            return this.event;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TeamLinksEventTeam getHomeTeam() {
            return this.homeTeam;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TeamLinksEventTeam getAwayTeam() {
            return this.awayTeam;
        }

        @NotNull
        public final EventTeamLinkedRound copy(@NotNull TeamLinksEvent event, @NotNull String type, @NotNull TeamLinksEventTeam homeTeam, @NotNull TeamLinksEventTeam awayTeam) {
            event.getClass();
            type.getClass();
            homeTeam.getClass();
            awayTeam.getClass();
            return new EventTeamLinkedRound(event, type, homeTeam, awayTeam);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventTeamLinkedRound)) {
                return false;
            }
            EventTeamLinkedRound eventTeamLinkedRound = (EventTeamLinkedRound) other;
            return Intrinsics.c(this.event, eventTeamLinkedRound.event) && Intrinsics.c(this.type, eventTeamLinkedRound.type) && Intrinsics.c(this.homeTeam, eventTeamLinkedRound.homeTeam) && Intrinsics.c(this.awayTeam, eventTeamLinkedRound.awayTeam);
        }

        @NotNull
        public final TeamLinksEventTeam getAwayTeam() {
            return this.awayTeam;
        }

        @NotNull
        public final TeamLinksEvent getEvent() {
            return this.event;
        }

        @NotNull
        public final TeamLinksEventTeam getHomeTeam() {
            return this.homeTeam;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.awayTeam.hashCode() + ((this.homeTeam.hashCode() + dmi.c(this.event.hashCode() * 31, 31, this.type)) * 31);
        }

        @NotNull
        public String toString() {
            return "EventTeamLinkedRound(event=" + this.event + ", type=" + this.type + ", homeTeam=" + this.homeTeam + ", awayTeam=" + this.awayTeam + ")";
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/TeamLinkedRound$EventTeamLinkedRound$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/TeamLinkedRound$EventTeamLinkedRound;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return TeamLinkedRound$EventTeamLinkedRound$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EventTeamLinkedRound(@NotNull TeamLinksEvent teamLinksEvent, @NotNull String str, @NotNull TeamLinksEventTeam teamLinksEventTeam, @NotNull TeamLinksEventTeam teamLinksEventTeam2) {
            super(null);
            teamLinksEvent.getClass();
            str.getClass();
            teamLinksEventTeam.getClass();
            teamLinksEventTeam2.getClass();
            this.event = teamLinksEvent;
            this.type = str;
            this.homeTeam = teamLinksEventTeam;
            this.awayTeam = teamLinksEventTeam2;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u00012\u00020\u0002:\u000254B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÆ\u0003¢\u0006\u0004\b \u0010!J:\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010!¨\u00066"}, d2 = {"Lcom/sofascore/model/mvvm/model/TeamLinkedRound$TournamentTeamLinkedRound;", "Lcom/sofascore/model/mvvm/model/TeamLinkedRound;", "Ljava/io/Serializable;", "", "type", "", "cupTreeId", "Lcom/sofascore/model/mvvm/model/Season;", TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, "Lcom/sofascore/model/mvvm/model/UniqueTournament;", SearchResponseKt.LEAGUE_ENTITY, "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/mvvm/model/UniqueTournament;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/mvvm/model/UniqueTournament;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/TeamLinkedRound$TournamentTeamLinkedRound;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "()Lcom/sofascore/model/mvvm/model/Season;", "component4", "()Lcom/sofascore/model/mvvm/model/UniqueTournament;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/mvvm/model/UniqueTournament;)Lcom/sofascore/model/mvvm/model/TeamLinkedRound$TournamentTeamLinkedRound;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Ljava/lang/Integer;", "getCupTreeId", "Lcom/sofascore/model/mvvm/model/Season;", "getSeason", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "getUniqueTournament", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TournamentTeamLinkedRound extends TeamLinkedRound implements Serializable {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Integer cupTreeId;

        @NotNull
        private final Season season;

        @NotNull
        private final String type;

        @NotNull
        private final UniqueTournament uniqueTournament;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ TournamentTeamLinkedRound(int i, String str, Integer num, Season season, UniqueTournament uniqueTournament, t5h t5hVar) {
            super(r0);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (15 != (i & 15)) {
                oea.z(i, 15, TeamLinkedRound$TournamentTeamLinkedRound$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.type = str;
            this.cupTreeId = num;
            this.season = season;
            this.uniqueTournament = uniqueTournament;
        }

        public static /* synthetic */ TournamentTeamLinkedRound copy$default(TournamentTeamLinkedRound tournamentTeamLinkedRound, String str, Integer num, Season season, UniqueTournament uniqueTournament, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tournamentTeamLinkedRound.type;
            }
            if ((i & 2) != 0) {
                num = tournamentTeamLinkedRound.cupTreeId;
            }
            if ((i & 4) != 0) {
                season = tournamentTeamLinkedRound.season;
            }
            if ((i & 8) != 0) {
                uniqueTournament = tournamentTeamLinkedRound.uniqueTournament;
            }
            return tournamentTeamLinkedRound.copy(str, num, season, uniqueTournament);
        }

        public static final /* synthetic */ void write$Self$model_release(TournamentTeamLinkedRound self, wf3 output, SerialDescriptor serialDesc) {
            output.y(serialDesc, 0, self.type);
            output.h(serialDesc, 1, a7a.a, self.cupTreeId);
            output.f(serialDesc, 2, Season$$serializer.INSTANCE, self.season);
            output.f(serialDesc, 3, UniqueTournament$$serializer.INSTANCE, self.uniqueTournament);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Integer getCupTreeId() {
            return this.cupTreeId;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Season getSeason() {
            return this.season;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final UniqueTournament getUniqueTournament() {
            return this.uniqueTournament;
        }

        @NotNull
        public final TournamentTeamLinkedRound copy(@NotNull String type, @Nullable Integer cupTreeId, @NotNull Season season, @NotNull UniqueTournament uniqueTournament) {
            type.getClass();
            season.getClass();
            uniqueTournament.getClass();
            return new TournamentTeamLinkedRound(type, cupTreeId, season, uniqueTournament);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TournamentTeamLinkedRound)) {
                return false;
            }
            TournamentTeamLinkedRound tournamentTeamLinkedRound = (TournamentTeamLinkedRound) other;
            return Intrinsics.c(this.type, tournamentTeamLinkedRound.type) && Intrinsics.c(this.cupTreeId, tournamentTeamLinkedRound.cupTreeId) && Intrinsics.c(this.season, tournamentTeamLinkedRound.season) && Intrinsics.c(this.uniqueTournament, tournamentTeamLinkedRound.uniqueTournament);
        }

        @Nullable
        public final Integer getCupTreeId() {
            return this.cupTreeId;
        }

        @NotNull
        public final Season getSeason() {
            return this.season;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final UniqueTournament getUniqueTournament() {
            return this.uniqueTournament;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            Integer num = this.cupTreeId;
            return this.uniqueTournament.hashCode() + ((this.season.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "TournamentTeamLinkedRound(type=" + this.type + ", cupTreeId=" + this.cupTreeId + ", season=" + this.season + ", uniqueTournament=" + this.uniqueTournament + ")";
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/TeamLinkedRound$TournamentTeamLinkedRound$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/TeamLinkedRound$TournamentTeamLinkedRound;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return TeamLinkedRound$TournamentTeamLinkedRound$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TournamentTeamLinkedRound(@NotNull String str, @Nullable Integer num, @NotNull Season season, @NotNull UniqueTournament uniqueTournament) {
            super(null);
            str.getClass();
            season.getClass();
            uniqueTournament.getClass();
            this.type = str;
            this.cupTreeId = num;
            this.season = season;
            this.uniqueTournament = uniqueTournament;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/TeamLinkedRound$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/TeamLinkedRound;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TeamLinkedRoundsSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    private TeamLinkedRound() {
    }
}

package com.sofascore.model.fantasy;

import com.appsflyer.internal.i;
import defpackage.dmi;
import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.w1l;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBO\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JL\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001bJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b1\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\"¨\u00066"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyFixtureFDRView;", "", "", "eventId", "opponentTeamId", "", "locationType", "sequence", "fixtureDifficulty", "", "startTimestamp", "<init>", "(IILjava/lang/String;ILjava/lang/String;J)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIILjava/lang/String;ILjava/lang/String;JLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyFixtureFDRView;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()J", "copy", "(IILjava/lang/String;ILjava/lang/String;J)Lcom/sofascore/model/fantasy/FantasyFixtureFDRView;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getEventId", "getOpponentTeamId", "Ljava/lang/String;", "getLocationType", "getSequence", "getFixtureDifficulty", "J", "getStartTimestamp", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyFixtureFDRView {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int eventId;

    @NotNull
    private final String fixtureDifficulty;

    @NotNull
    private final String locationType;
    private final int opponentTeamId;
    private final int sequence;
    private final long startTimestamp;

    public /* synthetic */ FantasyFixtureFDRView(int i, int i2, int i3, String str, int i4, String str2, long j, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, FantasyFixtureFDRView$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.eventId = i2;
        this.opponentTeamId = i3;
        this.locationType = str;
        this.sequence = i4;
        this.fixtureDifficulty = str2;
        this.startTimestamp = j;
    }

    public static /* synthetic */ FantasyFixtureFDRView copy$default(FantasyFixtureFDRView fantasyFixtureFDRView, int i, int i2, String str, int i3, String str2, long j, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = fantasyFixtureFDRView.eventId;
        }
        if ((i4 & 2) != 0) {
            i2 = fantasyFixtureFDRView.opponentTeamId;
        }
        if ((i4 & 4) != 0) {
            str = fantasyFixtureFDRView.locationType;
        }
        if ((i4 & 8) != 0) {
            i3 = fantasyFixtureFDRView.sequence;
        }
        if ((i4 & 16) != 0) {
            str2 = fantasyFixtureFDRView.fixtureDifficulty;
        }
        if ((i4 & 32) != 0) {
            j = fantasyFixtureFDRView.startTimestamp;
        }
        long j2 = j;
        String str3 = str2;
        String str4 = str;
        return fantasyFixtureFDRView.copy(i, i2, str4, i3, str3, j2);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyFixtureFDRView self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.eventId, serialDesc);
        output.u(1, self.opponentTeamId, serialDesc);
        output.y(serialDesc, 2, self.locationType);
        output.u(3, self.sequence, serialDesc);
        output.y(serialDesc, 4, self.fixtureDifficulty);
        output.E(serialDesc, 5, self.startTimestamp);
    }

    /* renamed from: component1, reason: from getter */
    public final int getEventId() {
        return this.eventId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOpponentTeamId() {
        return this.opponentTeamId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getLocationType() {
        return this.locationType;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSequence() {
        return this.sequence;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getFixtureDifficulty() {
        return this.fixtureDifficulty;
    }

    /* renamed from: component6, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    @NotNull
    public final FantasyFixtureFDRView copy(int eventId, int opponentTeamId, @NotNull String locationType, int sequence, @NotNull String fixtureDifficulty, long startTimestamp) {
        locationType.getClass();
        fixtureDifficulty.getClass();
        return new FantasyFixtureFDRView(eventId, opponentTeamId, locationType, sequence, fixtureDifficulty, startTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyFixtureFDRView)) {
            return false;
        }
        FantasyFixtureFDRView fantasyFixtureFDRView = (FantasyFixtureFDRView) other;
        return this.eventId == fantasyFixtureFDRView.eventId && this.opponentTeamId == fantasyFixtureFDRView.opponentTeamId && Intrinsics.c(this.locationType, fantasyFixtureFDRView.locationType) && this.sequence == fantasyFixtureFDRView.sequence && Intrinsics.c(this.fixtureDifficulty, fantasyFixtureFDRView.fixtureDifficulty) && this.startTimestamp == fantasyFixtureFDRView.startTimestamp;
    }

    public final int getEventId() {
        return this.eventId;
    }

    @NotNull
    public final String getFixtureDifficulty() {
        return this.fixtureDifficulty;
    }

    @NotNull
    public final String getLocationType() {
        return this.locationType;
    }

    public final int getOpponentTeamId() {
        return this.opponentTeamId;
    }

    public final int getSequence() {
        return this.sequence;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.startTimestamp) + dmi.c(wv8.a(this.sequence, dmi.c(wv8.a(this.opponentTeamId, Integer.hashCode(this.eventId) * 31, 31), 31, this.locationType), 31), 31, this.fixtureDifficulty);
    }

    @NotNull
    public String toString() {
        int i = this.eventId;
        int i2 = this.opponentTeamId;
        String str = this.locationType;
        int i3 = this.sequence;
        String str2 = this.fixtureDifficulty;
        long j = this.startTimestamp;
        StringBuilder s = lnb.s(i, i2, "FantasyFixtureFDRView(eventId=", ", opponentTeamId=", ", locationType=");
        w1l.q(i3, str, ", sequence=", ", fixtureDifficulty=", s);
        i.n(j, str2, ", startTimestamp=", s);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyFixtureFDRView$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyFixtureFDRView;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyFixtureFDRView$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyFixtureFDRView(int i, int i2, @NotNull String str, int i3, @NotNull String str2, long j) {
        str.getClass();
        str2.getClass();
        this.eventId = i;
        this.opponentTeamId = i2;
        this.locationType = str;
        this.sequence = i3;
        this.fixtureDifficulty = str2;
        this.startTimestamp = j;
    }
}

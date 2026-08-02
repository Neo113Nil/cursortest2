package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.serializers.EventSerializer;
import defpackage.dmi;
import defpackage.fn0;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rBQ\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b$\u0010 JL\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001cJ\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\"R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b6\u0010\"R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b7\u0010 ¨\u0006:"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerPenaltyHistoryData;", "Ljava/io/Serializable;", "", "id", "Lcom/sofascore/model/mvvm/model/Event;", "event", "", "outcome", "", "x", "y", "zone", "<init>", "(ILcom/sofascore/model/mvvm/model/Event;Ljava/lang/String;DDLjava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/mvvm/model/Event;Ljava/lang/String;DDLjava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/PlayerPenaltyHistoryData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Lcom/sofascore/model/mvvm/model/Event;", "component3", "()Ljava/lang/String;", "component4", "()D", "component5", "component6", "copy", "(ILcom/sofascore/model/mvvm/model/Event;Ljava/lang/String;DDLjava/lang/String;)Lcom/sofascore/model/newNetwork/PlayerPenaltyHistoryData;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lcom/sofascore/model/mvvm/model/Event;", "getEvent", "Ljava/lang/String;", "getOutcome", "D", "getX", "getY", "getZone", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlayerPenaltyHistoryData implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Event event;
    private final int id;

    @NotNull
    private final String outcome;
    private final double x;
    private final double y;

    @NotNull
    private final String zone;

    public /* synthetic */ PlayerPenaltyHistoryData(int i, int i2, Event event, String str, double d, double d2, String str2, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, PlayerPenaltyHistoryData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.event = event;
        this.outcome = str;
        this.x = d;
        this.y = d2;
        this.zone = str2;
    }

    public static /* synthetic */ PlayerPenaltyHistoryData copy$default(PlayerPenaltyHistoryData playerPenaltyHistoryData, int i, Event event, String str, double d, double d2, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = playerPenaltyHistoryData.id;
        }
        if ((i2 & 2) != 0) {
            event = playerPenaltyHistoryData.event;
        }
        if ((i2 & 4) != 0) {
            str = playerPenaltyHistoryData.outcome;
        }
        if ((i2 & 8) != 0) {
            d = playerPenaltyHistoryData.x;
        }
        if ((i2 & 16) != 0) {
            d2 = playerPenaltyHistoryData.y;
        }
        if ((i2 & 32) != 0) {
            str2 = playerPenaltyHistoryData.zone;
        }
        String str3 = str2;
        double d3 = d2;
        String str4 = str;
        return playerPenaltyHistoryData.copy(i, event, str4, d, d3, str3);
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerPenaltyHistoryData self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.f(serialDesc, 1, EventSerializer.INSTANCE, self.event);
        output.y(serialDesc, 2, self.outcome);
        output.D(serialDesc, 3, self.x);
        output.D(serialDesc, 4, self.y);
        output.y(serialDesc, 5, self.zone);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Event getEvent() {
        return this.event;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getOutcome() {
        return this.outcome;
    }

    /* renamed from: component4, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* renamed from: component5, reason: from getter */
    public final double getY() {
        return this.y;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getZone() {
        return this.zone;
    }

    @NotNull
    public final PlayerPenaltyHistoryData copy(int id, @NotNull Event event, @NotNull String outcome, double x, double y, @NotNull String zone) {
        event.getClass();
        outcome.getClass();
        zone.getClass();
        return new PlayerPenaltyHistoryData(id, event, outcome, x, y, zone);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerPenaltyHistoryData)) {
            return false;
        }
        PlayerPenaltyHistoryData playerPenaltyHistoryData = (PlayerPenaltyHistoryData) other;
        return this.id == playerPenaltyHistoryData.id && Intrinsics.c(this.event, playerPenaltyHistoryData.event) && Intrinsics.c(this.outcome, playerPenaltyHistoryData.outcome) && Double.compare(this.x, playerPenaltyHistoryData.x) == 0 && Double.compare(this.y, playerPenaltyHistoryData.y) == 0 && Intrinsics.c(this.zone, playerPenaltyHistoryData.zone);
    }

    @NotNull
    public final Event getEvent() {
        return this.event;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getOutcome() {
        return this.outcome;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    @NotNull
    public final String getZone() {
        return this.zone;
    }

    public int hashCode() {
        return this.zone.hashCode() + dmi.b(dmi.b(dmi.c((this.event.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31, this.outcome), 31, this.x), 31, this.y);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        Event event = this.event;
        String str = this.outcome;
        double d = this.x;
        double d2 = this.y;
        String str2 = this.zone;
        StringBuilder sb = new StringBuilder("PlayerPenaltyHistoryData(id=");
        sb.append(i);
        sb.append(", event=");
        sb.append(event);
        sb.append(", outcome=");
        sb.append(str);
        sb.append(", x=");
        sb.append(d);
        fn0.A(sb, ", y=", d2, ", zone=");
        return mz1.o(sb, str2, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerPenaltyHistoryData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PlayerPenaltyHistoryData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerPenaltyHistoryData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PlayerPenaltyHistoryData(int i, @NotNull Event event, @NotNull String str, double d, double d2, @NotNull String str2) {
        event.getClass();
        str.getClass();
        str2.getClass();
        this.id = i;
        this.event = event;
        this.outcome = str;
        this.x = d;
        this.y = d2;
        this.zone = str2;
    }
}

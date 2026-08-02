package com.sofascore.model.fantasy;

import defpackage.jf7;
import defpackage.joa;
import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.wv8;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ@\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u001f¨\u00061"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyRoundPlayerStatistics;", "", "", "playerId", "fantasyPlayerId", "", "fantasyPlayerPosition", "", "Lcom/sofascore/model/fantasy/FantasyRoundPlayerEvent;", "eventStatistics", "<init>", "(IILjava/lang/String;Ljava/util/List;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIILjava/lang/String;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyRoundPlayerStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "copy", "(IILjava/lang/String;Ljava/util/List;)Lcom/sofascore/model/fantasy/FantasyRoundPlayerStatistics;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPlayerId", "getFantasyPlayerId", "Ljava/lang/String;", "getFantasyPlayerPosition", "Ljava/util/List;", "getEventStatistics", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyRoundPlayerStatistics {

    @NotNull
    private final List<FantasyRoundPlayerEvent> eventStatistics;
    private final int fantasyPlayerId;

    @Nullable
    private final String fantasyPlayerPosition;
    private final int playerId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, ypa.a(ysa.b, new jf7(7))};

    public /* synthetic */ FantasyRoundPlayerStatistics(int i, int i2, int i3, String str, List list, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, FantasyRoundPlayerStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.playerId = i2;
        this.fantasyPlayerId = i3;
        this.fantasyPlayerPosition = str;
        this.eventStatistics = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(FantasyRoundPlayerEvent$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FantasyRoundPlayerStatistics copy$default(FantasyRoundPlayerStatistics fantasyRoundPlayerStatistics, int i, int i2, String str, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = fantasyRoundPlayerStatistics.playerId;
        }
        if ((i3 & 2) != 0) {
            i2 = fantasyRoundPlayerStatistics.fantasyPlayerId;
        }
        if ((i3 & 4) != 0) {
            str = fantasyRoundPlayerStatistics.fantasyPlayerPosition;
        }
        if ((i3 & 8) != 0) {
            list = fantasyRoundPlayerStatistics.eventStatistics;
        }
        return fantasyRoundPlayerStatistics.copy(i, i2, str, list);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyRoundPlayerStatistics self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.playerId, serialDesc);
        output.u(1, self.fantasyPlayerId, serialDesc);
        output.h(serialDesc, 2, uhi.a, self.fantasyPlayerPosition);
        output.f(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.eventStatistics);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPlayerId() {
        return this.playerId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFantasyPlayerId() {
        return this.fantasyPlayerId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getFantasyPlayerPosition() {
        return this.fantasyPlayerPosition;
    }

    @NotNull
    public final List<FantasyRoundPlayerEvent> component4() {
        return this.eventStatistics;
    }

    @NotNull
    public final FantasyRoundPlayerStatistics copy(int playerId, int fantasyPlayerId, @Nullable String fantasyPlayerPosition, @NotNull List<FantasyRoundPlayerEvent> eventStatistics) {
        eventStatistics.getClass();
        return new FantasyRoundPlayerStatistics(playerId, fantasyPlayerId, fantasyPlayerPosition, eventStatistics);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyRoundPlayerStatistics)) {
            return false;
        }
        FantasyRoundPlayerStatistics fantasyRoundPlayerStatistics = (FantasyRoundPlayerStatistics) other;
        return this.playerId == fantasyRoundPlayerStatistics.playerId && this.fantasyPlayerId == fantasyRoundPlayerStatistics.fantasyPlayerId && Intrinsics.c(this.fantasyPlayerPosition, fantasyRoundPlayerStatistics.fantasyPlayerPosition) && Intrinsics.c(this.eventStatistics, fantasyRoundPlayerStatistics.eventStatistics);
    }

    @NotNull
    public final List<FantasyRoundPlayerEvent> getEventStatistics() {
        return this.eventStatistics;
    }

    public final int getFantasyPlayerId() {
        return this.fantasyPlayerId;
    }

    @Nullable
    public final String getFantasyPlayerPosition() {
        return this.fantasyPlayerPosition;
    }

    public final int getPlayerId() {
        return this.playerId;
    }

    public int hashCode() {
        int a = wv8.a(this.fantasyPlayerId, Integer.hashCode(this.playerId) * 31, 31);
        String str = this.fantasyPlayerPosition;
        return this.eventStatistics.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        int i = this.playerId;
        int i2 = this.fantasyPlayerId;
        String str = this.fantasyPlayerPosition;
        List<FantasyRoundPlayerEvent> list = this.eventStatistics;
        StringBuilder s = lnb.s(i, i2, "FantasyRoundPlayerStatistics(playerId=", ", fantasyPlayerId=", ", fantasyPlayerPosition=");
        s.append(str);
        s.append(", eventStatistics=");
        s.append(list);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyRoundPlayerStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyRoundPlayerStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyRoundPlayerStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyRoundPlayerStatistics(int i, int i2, @Nullable String str, @NotNull List<FantasyRoundPlayerEvent> list) {
        list.getClass();
        this.playerId = i;
        this.fantasyPlayerId = i2;
        this.fantasyPlayerPosition = str;
        this.eventStatistics = list;
    }
}

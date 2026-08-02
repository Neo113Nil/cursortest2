package com.sofascore.model.fantasy;

import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import defpackage.jf7;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006*"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyRoundPlayerEvent;", "", "", "id", "", "Lcom/sofascore/model/fantasy/FantasyPlayerStatistic;", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "<init>", "(ILjava/util/List;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyRoundPlayerEvent;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lcom/sofascore/model/fantasy/FantasyRoundPlayerEvent;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/util/List;", "getStatistics", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyRoundPlayerEvent {
    private final int id;

    @NotNull
    private final List<FantasyPlayerStatistic> statistics;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new jf7(6))};

    public /* synthetic */ FantasyRoundPlayerEvent(int i, int i2, List list, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, FantasyRoundPlayerEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.statistics = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(FantasyPlayerStatistic$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FantasyRoundPlayerEvent copy$default(FantasyRoundPlayerEvent fantasyRoundPlayerEvent, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fantasyRoundPlayerEvent.id;
        }
        if ((i2 & 2) != 0) {
            list = fantasyRoundPlayerEvent.statistics;
        }
        return fantasyRoundPlayerEvent.copy(i, list);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyRoundPlayerEvent self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.statistics);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    public final List<FantasyPlayerStatistic> component2() {
        return this.statistics;
    }

    @NotNull
    public final FantasyRoundPlayerEvent copy(int id, @NotNull List<FantasyPlayerStatistic> statistics) {
        statistics.getClass();
        return new FantasyRoundPlayerEvent(id, statistics);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyRoundPlayerEvent)) {
            return false;
        }
        FantasyRoundPlayerEvent fantasyRoundPlayerEvent = (FantasyRoundPlayerEvent) other;
        return this.id == fantasyRoundPlayerEvent.id && Intrinsics.c(this.statistics, fantasyRoundPlayerEvent.statistics);
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final List<FantasyPlayerStatistic> getStatistics() {
        return this.statistics;
    }

    public int hashCode() {
        return this.statistics.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return "FantasyRoundPlayerEvent(id=" + this.id + ", statistics=" + this.statistics + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyRoundPlayerEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyRoundPlayerEvent;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyRoundPlayerEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyRoundPlayerEvent(int i, @NotNull List<FantasyPlayerStatistic> list) {
        list.getClass();
        this.id = i;
        this.statistics = list;
    }
}

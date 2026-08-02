package com.sofascore.model.mvvm.model;

import defpackage.a7a;
import defpackage.fc6;
import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBS\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJT\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0019J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b0\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b1\u0010\u001c¨\u00064"}, d2 = {"Lcom/sofascore/model/mvvm/model/EventTeamsInfo;", "", "", "homeTeamId", "awayTeamId", "homeSubTeam1Id", "homeSubTeam2Id", "awaySubTeam1Id", "awaySubTeam2Id", "<init>", "(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/EventTeamsInfo;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "copy", "(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/mvvm/model/EventTeamsInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getHomeTeamId", "getAwayTeamId", "Ljava/lang/Integer;", "getHomeSubTeam1Id", "getHomeSubTeam2Id", "getAwaySubTeam1Id", "getAwaySubTeam2Id", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EventTeamsInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer awaySubTeam1Id;

    @Nullable
    private final Integer awaySubTeam2Id;
    private final int awayTeamId;

    @Nullable
    private final Integer homeSubTeam1Id;

    @Nullable
    private final Integer homeSubTeam2Id;
    private final int homeTeamId;

    public /* synthetic */ EventTeamsInfo(int i, int i2, int i3, Integer num, Integer num2, Integer num3, Integer num4, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, EventTeamsInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.homeTeamId = i2;
        this.awayTeamId = i3;
        this.homeSubTeam1Id = num;
        this.homeSubTeam2Id = num2;
        this.awaySubTeam1Id = num3;
        this.awaySubTeam2Id = num4;
    }

    public static /* synthetic */ EventTeamsInfo copy$default(EventTeamsInfo eventTeamsInfo, int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = eventTeamsInfo.homeTeamId;
        }
        if ((i3 & 2) != 0) {
            i2 = eventTeamsInfo.awayTeamId;
        }
        if ((i3 & 4) != 0) {
            num = eventTeamsInfo.homeSubTeam1Id;
        }
        if ((i3 & 8) != 0) {
            num2 = eventTeamsInfo.homeSubTeam2Id;
        }
        if ((i3 & 16) != 0) {
            num3 = eventTeamsInfo.awaySubTeam1Id;
        }
        if ((i3 & 32) != 0) {
            num4 = eventTeamsInfo.awaySubTeam2Id;
        }
        Integer num5 = num3;
        Integer num6 = num4;
        return eventTeamsInfo.copy(i, i2, num, num2, num5, num6);
    }

    public static final /* synthetic */ void write$Self$model_release(EventTeamsInfo self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.homeTeamId, serialDesc);
        output.u(1, self.awayTeamId, serialDesc);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 2, a7aVar, self.homeSubTeam1Id);
        output.h(serialDesc, 3, a7aVar, self.homeSubTeam2Id);
        output.h(serialDesc, 4, a7aVar, self.awaySubTeam1Id);
        output.h(serialDesc, 5, a7aVar, self.awaySubTeam2Id);
    }

    /* renamed from: component1, reason: from getter */
    public final int getHomeTeamId() {
        return this.homeTeamId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAwayTeamId() {
        return this.awayTeamId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getHomeSubTeam1Id() {
        return this.homeSubTeam1Id;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getHomeSubTeam2Id() {
        return this.homeSubTeam2Id;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getAwaySubTeam1Id() {
        return this.awaySubTeam1Id;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getAwaySubTeam2Id() {
        return this.awaySubTeam2Id;
    }

    @NotNull
    public final EventTeamsInfo copy(int homeTeamId, int awayTeamId, @Nullable Integer homeSubTeam1Id, @Nullable Integer homeSubTeam2Id, @Nullable Integer awaySubTeam1Id, @Nullable Integer awaySubTeam2Id) {
        return new EventTeamsInfo(homeTeamId, awayTeamId, homeSubTeam1Id, homeSubTeam2Id, awaySubTeam1Id, awaySubTeam2Id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventTeamsInfo)) {
            return false;
        }
        EventTeamsInfo eventTeamsInfo = (EventTeamsInfo) other;
        return this.homeTeamId == eventTeamsInfo.homeTeamId && this.awayTeamId == eventTeamsInfo.awayTeamId && Intrinsics.c(this.homeSubTeam1Id, eventTeamsInfo.homeSubTeam1Id) && Intrinsics.c(this.homeSubTeam2Id, eventTeamsInfo.homeSubTeam2Id) && Intrinsics.c(this.awaySubTeam1Id, eventTeamsInfo.awaySubTeam1Id) && Intrinsics.c(this.awaySubTeam2Id, eventTeamsInfo.awaySubTeam2Id);
    }

    @Nullable
    public final Integer getAwaySubTeam1Id() {
        return this.awaySubTeam1Id;
    }

    @Nullable
    public final Integer getAwaySubTeam2Id() {
        return this.awaySubTeam2Id;
    }

    public final int getAwayTeamId() {
        return this.awayTeamId;
    }

    @Nullable
    public final Integer getHomeSubTeam1Id() {
        return this.homeSubTeam1Id;
    }

    @Nullable
    public final Integer getHomeSubTeam2Id() {
        return this.homeSubTeam2Id;
    }

    public final int getHomeTeamId() {
        return this.homeTeamId;
    }

    public int hashCode() {
        int a = wv8.a(this.awayTeamId, Integer.hashCode(this.homeTeamId) * 31, 31);
        Integer num = this.homeSubTeam1Id;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.homeSubTeam2Id;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.awaySubTeam1Id;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.awaySubTeam2Id;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.homeTeamId;
        int i2 = this.awayTeamId;
        Integer num = this.homeSubTeam1Id;
        Integer num2 = this.homeSubTeam2Id;
        Integer num3 = this.awaySubTeam1Id;
        Integer num4 = this.awaySubTeam2Id;
        StringBuilder s = lnb.s(i, i2, "EventTeamsInfo(homeTeamId=", ", awayTeamId=", ", homeSubTeam1Id=");
        vxd.r(num, num2, ", homeSubTeam2Id=", ", awaySubTeam1Id=", s);
        return fc6.l(num3, num4, ", awaySubTeam2Id=", ")", s);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/EventTeamsInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/EventTeamsInfo;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EventTeamsInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public EventTeamsInfo(int i, int i2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        this.homeTeamId = i;
        this.awayTeamId = i2;
        this.homeSubTeam1Id = num;
        this.homeSubTeam2Id = num2;
        this.awaySubTeam1Id = num3;
        this.awaySubTeam2Id = num4;
    }
}

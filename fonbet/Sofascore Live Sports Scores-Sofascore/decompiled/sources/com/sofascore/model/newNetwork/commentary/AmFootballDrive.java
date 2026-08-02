package com.sofascore.model.newNetwork.commentary;

import defpackage.dmi;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJN\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001aJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b0\u0010\u001a¨\u00063"}, d2 = {"Lcom/sofascore/model/newNetwork/commentary/AmFootballDrive;", "", "", "id", "", "endReason", "playCount", "durationSeconds", "netDriveYards", "teamId", "<init>", "(ILjava/lang/String;IIII)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;IIIILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/commentary/AmFootballDrive;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "copy", "(ILjava/lang/String;IIII)Lcom/sofascore/model/newNetwork/commentary/AmFootballDrive;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getEndReason", "getPlayCount", "getDurationSeconds", "getNetDriveYards", "getTeamId", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AmFootballDrive {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int durationSeconds;

    @Nullable
    private final String endReason;
    private final int id;
    private final int netDriveYards;
    private final int playCount;
    private final int teamId;

    public /* synthetic */ AmFootballDrive(int i, int i2, String str, int i3, int i4, int i5, int i6, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, AmFootballDrive$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.endReason = str;
        this.playCount = i3;
        this.durationSeconds = i4;
        this.netDriveYards = i5;
        this.teamId = i6;
    }

    public static /* synthetic */ AmFootballDrive copy$default(AmFootballDrive amFootballDrive, int i, String str, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = amFootballDrive.id;
        }
        if ((i6 & 2) != 0) {
            str = amFootballDrive.endReason;
        }
        if ((i6 & 4) != 0) {
            i2 = amFootballDrive.playCount;
        }
        if ((i6 & 8) != 0) {
            i3 = amFootballDrive.durationSeconds;
        }
        if ((i6 & 16) != 0) {
            i4 = amFootballDrive.netDriveYards;
        }
        if ((i6 & 32) != 0) {
            i5 = amFootballDrive.teamId;
        }
        int i7 = i4;
        int i8 = i5;
        return amFootballDrive.copy(i, str, i2, i3, i7, i8);
    }

    public static final /* synthetic */ void write$Self$model_release(AmFootballDrive self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.h(serialDesc, 1, uhi.a, self.endReason);
        output.u(2, self.playCount, serialDesc);
        output.u(3, self.durationSeconds, serialDesc);
        output.u(4, self.netDriveYards, serialDesc);
        output.u(5, self.teamId, serialDesc);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getEndReason() {
        return this.endReason;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPlayCount() {
        return this.playCount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDurationSeconds() {
        return this.durationSeconds;
    }

    /* renamed from: component5, reason: from getter */
    public final int getNetDriveYards() {
        return this.netDriveYards;
    }

    /* renamed from: component6, reason: from getter */
    public final int getTeamId() {
        return this.teamId;
    }

    @NotNull
    public final AmFootballDrive copy(int id, @Nullable String endReason, int playCount, int durationSeconds, int netDriveYards, int teamId) {
        return new AmFootballDrive(id, endReason, playCount, durationSeconds, netDriveYards, teamId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmFootballDrive)) {
            return false;
        }
        AmFootballDrive amFootballDrive = (AmFootballDrive) other;
        return this.id == amFootballDrive.id && Intrinsics.c(this.endReason, amFootballDrive.endReason) && this.playCount == amFootballDrive.playCount && this.durationSeconds == amFootballDrive.durationSeconds && this.netDriveYards == amFootballDrive.netDriveYards && this.teamId == amFootballDrive.teamId;
    }

    public final int getDurationSeconds() {
        return this.durationSeconds;
    }

    @Nullable
    public final String getEndReason() {
        return this.endReason;
    }

    public final int getId() {
        return this.id;
    }

    public final int getNetDriveYards() {
        return this.netDriveYards;
    }

    public final int getPlayCount() {
        return this.playCount;
    }

    public final int getTeamId() {
        return this.teamId;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.endReason;
        return Integer.hashCode(this.teamId) + wv8.a(this.netDriveYards, wv8.a(this.durationSeconds, wv8.a(this.playCount, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.endReason;
        int i2 = this.playCount;
        int i3 = this.durationSeconds;
        int i4 = this.netDriveYards;
        int i5 = this.teamId;
        StringBuilder t = dmi.t(i, "AmFootballDrive(id=", ", endReason=", str, ", playCount=");
        me4.q(t, i2, ", durationSeconds=", i3, ", netDriveYards=");
        return me4.i(t, i4, ", teamId=", i5, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/commentary/AmFootballDrive$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/commentary/AmFootballDrive;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AmFootballDrive$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AmFootballDrive(int i, @Nullable String str, int i2, int i3, int i4, int i5) {
        this.id = i;
        this.endReason = str;
        this.playCount = i2;
        this.durationSeconds = i3;
        this.netDriveYards = i4;
        this.teamId = i5;
    }
}

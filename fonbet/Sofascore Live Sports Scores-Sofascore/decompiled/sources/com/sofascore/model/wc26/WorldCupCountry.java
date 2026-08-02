package com.sofascore.model.wc26;

import defpackage.mz1;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u0017¨\u0006*"}, d2 = {"Lcom/sofascore/model/wc26/WorldCupCountry;", "", "", "alpha2", "", "teamId", "color", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/wc26/WorldCupCountry;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;ILjava/lang/String;)Lcom/sofascore/model/wc26/WorldCupCountry;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAlpha2", "I", "getTeamId", "getColor", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WorldCupCountry {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String alpha2;

    @NotNull
    private final String color;
    private final int teamId;

    public /* synthetic */ WorldCupCountry(int i, String str, int i2, String str2, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, WorldCupCountry$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.alpha2 = str;
        this.teamId = i2;
        this.color = str2;
    }

    public static /* synthetic */ WorldCupCountry copy$default(WorldCupCountry worldCupCountry, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = worldCupCountry.alpha2;
        }
        if ((i2 & 2) != 0) {
            i = worldCupCountry.teamId;
        }
        if ((i2 & 4) != 0) {
            str2 = worldCupCountry.color;
        }
        return worldCupCountry.copy(str, i, str2);
    }

    public static final /* synthetic */ void write$Self$model_release(WorldCupCountry self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.alpha2);
        output.u(1, self.teamId, serialDesc);
        output.y(serialDesc, 2, self.color);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAlpha2() {
        return this.alpha2;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTeamId() {
        return this.teamId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final WorldCupCountry copy(@NotNull String alpha2, int teamId, @NotNull String color) {
        alpha2.getClass();
        color.getClass();
        return new WorldCupCountry(alpha2, teamId, color);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorldCupCountry)) {
            return false;
        }
        WorldCupCountry worldCupCountry = (WorldCupCountry) other;
        return Intrinsics.c(this.alpha2, worldCupCountry.alpha2) && this.teamId == worldCupCountry.teamId && Intrinsics.c(this.color, worldCupCountry.color);
    }

    @NotNull
    public final String getAlpha2() {
        return this.alpha2;
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    public final int getTeamId() {
        return this.teamId;
    }

    public int hashCode() {
        return this.color.hashCode() + wv8.a(this.teamId, this.alpha2.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.alpha2;
        int i = this.teamId;
        return mz1.o(mz1.q(i, "WorldCupCountry(alpha2=", str, ", teamId=", ", color="), this.color, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/wc26/WorldCupCountry$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/wc26/WorldCupCountry;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return WorldCupCountry$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WorldCupCountry(@NotNull String str, int i, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.alpha2 = str;
        this.teamId = i;
        this.color = str2;
    }
}

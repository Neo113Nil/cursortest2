package com.sofascore.model.mvvm.model;

import defpackage.gz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006*"}, d2 = {"Lcom/sofascore/model/mvvm/model/PlayerDataExtras;", "", "", "substitute", "Lcom/sofascore/model/mvvm/model/BaseballAdditionalPlayerData;", "baseballAllPositions", "<init>", "(Ljava/lang/Boolean;Lcom/sofascore/model/mvvm/model/BaseballAdditionalPlayerData;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/sofascore/model/mvvm/model/BaseballAdditionalPlayerData;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/PlayerDataExtras;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Lcom/sofascore/model/mvvm/model/BaseballAdditionalPlayerData;", "copy", "(Ljava/lang/Boolean;Lcom/sofascore/model/mvvm/model/BaseballAdditionalPlayerData;)Lcom/sofascore/model/mvvm/model/PlayerDataExtras;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getSubstitute", "Lcom/sofascore/model/mvvm/model/BaseballAdditionalPlayerData;", "getBaseballAllPositions", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlayerDataExtras {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final BaseballAdditionalPlayerData baseballAllPositions;

    @Nullable
    private final Boolean substitute;

    public /* synthetic */ PlayerDataExtras(int i, Boolean bool, BaseballAdditionalPlayerData baseballAdditionalPlayerData, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, PlayerDataExtras$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.substitute = bool;
        this.baseballAllPositions = baseballAdditionalPlayerData;
    }

    public static /* synthetic */ PlayerDataExtras copy$default(PlayerDataExtras playerDataExtras, Boolean bool, BaseballAdditionalPlayerData baseballAdditionalPlayerData, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = playerDataExtras.substitute;
        }
        if ((i & 2) != 0) {
            baseballAdditionalPlayerData = playerDataExtras.baseballAllPositions;
        }
        return playerDataExtras.copy(bool, baseballAdditionalPlayerData);
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerDataExtras self, wf3 output, SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, gz1.a, self.substitute);
        output.h(serialDesc, 1, BaseballAdditionalPlayerData$$serializer.INSTANCE, self.baseballAllPositions);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getSubstitute() {
        return this.substitute;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final BaseballAdditionalPlayerData getBaseballAllPositions() {
        return this.baseballAllPositions;
    }

    @NotNull
    public final PlayerDataExtras copy(@Nullable Boolean substitute, @Nullable BaseballAdditionalPlayerData baseballAllPositions) {
        return new PlayerDataExtras(substitute, baseballAllPositions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerDataExtras)) {
            return false;
        }
        PlayerDataExtras playerDataExtras = (PlayerDataExtras) other;
        return Intrinsics.c(this.substitute, playerDataExtras.substitute) && Intrinsics.c(this.baseballAllPositions, playerDataExtras.baseballAllPositions);
    }

    @Nullable
    public final BaseballAdditionalPlayerData getBaseballAllPositions() {
        return this.baseballAllPositions;
    }

    @Nullable
    public final Boolean getSubstitute() {
        return this.substitute;
    }

    public int hashCode() {
        Boolean bool = this.substitute;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        BaseballAdditionalPlayerData baseballAdditionalPlayerData = this.baseballAllPositions;
        return hashCode + (baseballAdditionalPlayerData != null ? baseballAdditionalPlayerData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PlayerDataExtras(substitute=" + this.substitute + ", baseballAllPositions=" + this.baseballAllPositions + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/PlayerDataExtras$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/PlayerDataExtras;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerDataExtras$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PlayerDataExtras(@Nullable Boolean bool, @Nullable BaseballAdditionalPlayerData baseballAdditionalPlayerData) {
        this.substitute = bool;
        this.baseballAllPositions = baseballAdditionalPlayerData;
    }
}

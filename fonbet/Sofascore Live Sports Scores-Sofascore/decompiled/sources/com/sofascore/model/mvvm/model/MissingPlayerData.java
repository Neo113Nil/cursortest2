package com.sofascore.model.mvvm.model;

import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.dmi;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ:\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b.\u0010\u001b¨\u00061"}, d2 = {"Lcom/sofascore/model/mvvm/model/MissingPlayerData;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "", "type", "", "reason", "description", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;ILjava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;ILjava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/MissingPlayerData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "()Ljava/lang/String;", "component3", "()I", "component4", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;ILjava/lang/String;)Lcom/sofascore/model/mvvm/model/MissingPlayerData;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Ljava/lang/String;", "getType", "I", "getReason", "getDescription", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MissingPlayerData implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String description;

    @NotNull
    private final Player player;
    private final int reason;

    @NotNull
    private final String type;

    public /* synthetic */ MissingPlayerData(int i, Player player, String str, int i2, String str2, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, MissingPlayerData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.player = player;
        this.type = str;
        this.reason = i2;
        this.description = str2;
    }

    public static /* synthetic */ MissingPlayerData copy$default(MissingPlayerData missingPlayerData, Player player, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            player = missingPlayerData.player;
        }
        if ((i2 & 2) != 0) {
            str = missingPlayerData.type;
        }
        if ((i2 & 4) != 0) {
            i = missingPlayerData.reason;
        }
        if ((i2 & 8) != 0) {
            str2 = missingPlayerData.description;
        }
        return missingPlayerData.copy(player, str, i, str2);
    }

    public static final /* synthetic */ void write$Self$model_release(MissingPlayerData self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, Player$$serializer.INSTANCE, self.player);
        output.y(serialDesc, 1, self.type);
        output.u(2, self.reason, serialDesc);
        output.h(serialDesc, 3, uhi.a, self.description);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final int getReason() {
        return this.reason;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final MissingPlayerData copy(@NotNull Player player, @NotNull String type, int reason, @Nullable String description) {
        player.getClass();
        type.getClass();
        return new MissingPlayerData(player, type, reason, description);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissingPlayerData)) {
            return false;
        }
        MissingPlayerData missingPlayerData = (MissingPlayerData) other;
        return Intrinsics.c(this.player, missingPlayerData.player) && Intrinsics.c(this.type, missingPlayerData.type) && this.reason == missingPlayerData.reason && Intrinsics.c(this.description, missingPlayerData.description);
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    public final int getReason() {
        return this.reason;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int a = wv8.a(this.reason, dmi.c(this.player.hashCode() * 31, 31, this.type), 31);
        String str = this.description;
        return a + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "MissingPlayerData(player=" + this.player + ", type=" + this.type + ", reason=" + this.reason + ", description=" + this.description + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/MissingPlayerData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/MissingPlayerData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MissingPlayerData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public MissingPlayerData(@NotNull Player player, @NotNull String str, int i, @Nullable String str2) {
        player.getClass();
        str.getClass();
        this.player = player;
        this.type = str;
        this.reason = i;
        this.description = str2;
    }
}

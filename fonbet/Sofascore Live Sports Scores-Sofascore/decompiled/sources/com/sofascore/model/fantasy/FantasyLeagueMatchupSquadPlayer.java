package com.sofascore.model.fantasy;

import defpackage.dmi;
import defpackage.lnb;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0019J\u001a\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b\b\u0010\u001e¨\u0006."}, d2 = {"Lcom/sofascore/model/fantasy/FantasyLeagueMatchupSquadPlayer;", "", "", "fantasyPlayerId", "roundPlayerId", "", "position", "", "isCaptain", "<init>", "(IILjava/lang/String;Z)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIILjava/lang/String;ZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyLeagueMatchupSquadPlayer;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "()Z", "copy", "(IILjava/lang/String;Z)Lcom/sofascore/model/fantasy/FantasyLeagueMatchupSquadPlayer;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getFantasyPlayerId", "getRoundPlayerId", "Ljava/lang/String;", "getPosition", "Z", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyLeagueMatchupSquadPlayer {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int fantasyPlayerId;
    private final boolean isCaptain;

    @NotNull
    private final String position;
    private final int roundPlayerId;

    public /* synthetic */ FantasyLeagueMatchupSquadPlayer(int i, int i2, int i3, String str, boolean z, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, FantasyLeagueMatchupSquadPlayer$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.fantasyPlayerId = i2;
        this.roundPlayerId = i3;
        this.position = str;
        this.isCaptain = z;
    }

    public static /* synthetic */ FantasyLeagueMatchupSquadPlayer copy$default(FantasyLeagueMatchupSquadPlayer fantasyLeagueMatchupSquadPlayer, int i, int i2, String str, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = fantasyLeagueMatchupSquadPlayer.fantasyPlayerId;
        }
        if ((i3 & 2) != 0) {
            i2 = fantasyLeagueMatchupSquadPlayer.roundPlayerId;
        }
        if ((i3 & 4) != 0) {
            str = fantasyLeagueMatchupSquadPlayer.position;
        }
        if ((i3 & 8) != 0) {
            z = fantasyLeagueMatchupSquadPlayer.isCaptain;
        }
        return fantasyLeagueMatchupSquadPlayer.copy(i, i2, str, z);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyLeagueMatchupSquadPlayer self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.fantasyPlayerId, serialDesc);
        output.u(1, self.roundPlayerId, serialDesc);
        output.y(serialDesc, 2, self.position);
        output.x(serialDesc, 3, self.isCaptain);
    }

    /* renamed from: component1, reason: from getter */
    public final int getFantasyPlayerId() {
        return this.fantasyPlayerId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRoundPlayerId() {
        return this.roundPlayerId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPosition() {
        return this.position;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCaptain() {
        return this.isCaptain;
    }

    @NotNull
    public final FantasyLeagueMatchupSquadPlayer copy(int fantasyPlayerId, int roundPlayerId, @NotNull String position, boolean isCaptain) {
        position.getClass();
        return new FantasyLeagueMatchupSquadPlayer(fantasyPlayerId, roundPlayerId, position, isCaptain);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyLeagueMatchupSquadPlayer)) {
            return false;
        }
        FantasyLeagueMatchupSquadPlayer fantasyLeagueMatchupSquadPlayer = (FantasyLeagueMatchupSquadPlayer) other;
        return this.fantasyPlayerId == fantasyLeagueMatchupSquadPlayer.fantasyPlayerId && this.roundPlayerId == fantasyLeagueMatchupSquadPlayer.roundPlayerId && Intrinsics.c(this.position, fantasyLeagueMatchupSquadPlayer.position) && this.isCaptain == fantasyLeagueMatchupSquadPlayer.isCaptain;
    }

    public final int getFantasyPlayerId() {
        return this.fantasyPlayerId;
    }

    @NotNull
    public final String getPosition() {
        return this.position;
    }

    public final int getRoundPlayerId() {
        return this.roundPlayerId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isCaptain) + dmi.c(wv8.a(this.roundPlayerId, Integer.hashCode(this.fantasyPlayerId) * 31, 31), 31, this.position);
    }

    public final boolean isCaptain() {
        return this.isCaptain;
    }

    @NotNull
    public String toString() {
        int i = this.fantasyPlayerId;
        int i2 = this.roundPlayerId;
        String str = this.position;
        boolean z = this.isCaptain;
        StringBuilder s = lnb.s(i, i2, "FantasyLeagueMatchupSquadPlayer(fantasyPlayerId=", ", roundPlayerId=", ", position=");
        s.append(str);
        s.append(", isCaptain=");
        s.append(z);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyLeagueMatchupSquadPlayer$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyLeagueMatchupSquadPlayer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyLeagueMatchupSquadPlayer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyLeagueMatchupSquadPlayer(int i, int i2, @NotNull String str, boolean z) {
        str.getClass();
        this.fantasyPlayerId = i;
        this.roundPlayerId = i2;
        this.position = str;
        this.isCaptain = z;
    }
}

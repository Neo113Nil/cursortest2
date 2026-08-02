package com.sofascore.model.fantasy;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.fn0;
import defpackage.me4;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011Bs\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b+\u0010&J\u0010\u0010,\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b,\u0010&Jt\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b/\u0010)J\u0010\u00100\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b0\u0010&J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b9\u0010#R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b:\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010&R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b=\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010)R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b@\u0010)R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\bA\u0010&R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\bB\u0010&¨\u0006E"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyTransfer;", "", "Lcom/sofascore/model/mvvm/model/Player;", "playerIn", "playerOut", "", "priceIn", "priceOut", "", "teamIdIn", "teamIdOut", "", "teamNameCodeIn", "teamNameCodeOut", "fantasyPlayerIdIn", "fantasyPlayerIdOut", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;DDIILjava/lang/String;Ljava/lang/String;II)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;DDIILjava/lang/String;Ljava/lang/String;IILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyTransfer;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "component3", "()D", "component4", "component5", "()I", "component6", "component7", "()Ljava/lang/String;", "component8", "component9", "component10", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;DDIILjava/lang/String;Ljava/lang/String;II)Lcom/sofascore/model/fantasy/FantasyTransfer;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayerIn", "getPlayerOut", "D", "getPriceIn", "getPriceOut", "I", "getTeamIdIn", "getTeamIdOut", "Ljava/lang/String;", "getTeamNameCodeIn", "getTeamNameCodeOut", "getFantasyPlayerIdIn", "getFantasyPlayerIdOut", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyTransfer {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int fantasyPlayerIdIn;
    private final int fantasyPlayerIdOut;

    @NotNull
    private final Player playerIn;

    @NotNull
    private final Player playerOut;
    private final double priceIn;
    private final double priceOut;
    private final int teamIdIn;
    private final int teamIdOut;

    @NotNull
    private final String teamNameCodeIn;

    @NotNull
    private final String teamNameCodeOut;

    public /* synthetic */ FantasyTransfer(int i, Player player, Player player2, double d, double d2, int i2, int i3, String str, String str2, int i4, int i5, t5h t5hVar) {
        if (1023 != (i & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)) {
            oea.z(i, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, FantasyTransfer$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.playerIn = player;
        this.playerOut = player2;
        this.priceIn = d;
        this.priceOut = d2;
        this.teamIdIn = i2;
        this.teamIdOut = i3;
        this.teamNameCodeIn = str;
        this.teamNameCodeOut = str2;
        this.fantasyPlayerIdIn = i4;
        this.fantasyPlayerIdOut = i5;
    }

    public static /* synthetic */ FantasyTransfer copy$default(FantasyTransfer fantasyTransfer, Player player, Player player2, double d, double d2, int i, int i2, String str, String str2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            player = fantasyTransfer.playerIn;
        }
        if ((i5 & 2) != 0) {
            player2 = fantasyTransfer.playerOut;
        }
        if ((i5 & 4) != 0) {
            d = fantasyTransfer.priceIn;
        }
        if ((i5 & 8) != 0) {
            d2 = fantasyTransfer.priceOut;
        }
        if ((i5 & 16) != 0) {
            i = fantasyTransfer.teamIdIn;
        }
        if ((i5 & 32) != 0) {
            i2 = fantasyTransfer.teamIdOut;
        }
        if ((i5 & 64) != 0) {
            str = fantasyTransfer.teamNameCodeIn;
        }
        if ((i5 & 128) != 0) {
            str2 = fantasyTransfer.teamNameCodeOut;
        }
        if ((i5 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            i3 = fantasyTransfer.fantasyPlayerIdIn;
        }
        if ((i5 & 512) != 0) {
            i4 = fantasyTransfer.fantasyPlayerIdOut;
        }
        int i6 = i3;
        int i7 = i4;
        double d3 = d2;
        double d4 = d;
        return fantasyTransfer.copy(player, player2, d4, d3, i, i2, str, str2, i6, i7);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyTransfer self, wf3 output, SerialDescriptor serialDesc) {
        Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
        output.f(serialDesc, 0, player$$serializer, self.playerIn);
        output.f(serialDesc, 1, player$$serializer, self.playerOut);
        output.D(serialDesc, 2, self.priceIn);
        output.D(serialDesc, 3, self.priceOut);
        output.u(4, self.teamIdIn, serialDesc);
        output.u(5, self.teamIdOut, serialDesc);
        output.y(serialDesc, 6, self.teamNameCodeIn);
        output.y(serialDesc, 7, self.teamNameCodeOut);
        output.u(8, self.fantasyPlayerIdIn, serialDesc);
        output.u(9, self.fantasyPlayerIdOut, serialDesc);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Player getPlayerIn() {
        return this.playerIn;
    }

    /* renamed from: component10, reason: from getter */
    public final int getFantasyPlayerIdOut() {
        return this.fantasyPlayerIdOut;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Player getPlayerOut() {
        return this.playerOut;
    }

    /* renamed from: component3, reason: from getter */
    public final double getPriceIn() {
        return this.priceIn;
    }

    /* renamed from: component4, reason: from getter */
    public final double getPriceOut() {
        return this.priceOut;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTeamIdIn() {
        return this.teamIdIn;
    }

    /* renamed from: component6, reason: from getter */
    public final int getTeamIdOut() {
        return this.teamIdOut;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getTeamNameCodeIn() {
        return this.teamNameCodeIn;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getTeamNameCodeOut() {
        return this.teamNameCodeOut;
    }

    /* renamed from: component9, reason: from getter */
    public final int getFantasyPlayerIdIn() {
        return this.fantasyPlayerIdIn;
    }

    @NotNull
    public final FantasyTransfer copy(@NotNull Player playerIn, @NotNull Player playerOut, double priceIn, double priceOut, int teamIdIn, int teamIdOut, @NotNull String teamNameCodeIn, @NotNull String teamNameCodeOut, int fantasyPlayerIdIn, int fantasyPlayerIdOut) {
        playerIn.getClass();
        playerOut.getClass();
        teamNameCodeIn.getClass();
        teamNameCodeOut.getClass();
        return new FantasyTransfer(playerIn, playerOut, priceIn, priceOut, teamIdIn, teamIdOut, teamNameCodeIn, teamNameCodeOut, fantasyPlayerIdIn, fantasyPlayerIdOut);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyTransfer)) {
            return false;
        }
        FantasyTransfer fantasyTransfer = (FantasyTransfer) other;
        return Intrinsics.c(this.playerIn, fantasyTransfer.playerIn) && Intrinsics.c(this.playerOut, fantasyTransfer.playerOut) && Double.compare(this.priceIn, fantasyTransfer.priceIn) == 0 && Double.compare(this.priceOut, fantasyTransfer.priceOut) == 0 && this.teamIdIn == fantasyTransfer.teamIdIn && this.teamIdOut == fantasyTransfer.teamIdOut && Intrinsics.c(this.teamNameCodeIn, fantasyTransfer.teamNameCodeIn) && Intrinsics.c(this.teamNameCodeOut, fantasyTransfer.teamNameCodeOut) && this.fantasyPlayerIdIn == fantasyTransfer.fantasyPlayerIdIn && this.fantasyPlayerIdOut == fantasyTransfer.fantasyPlayerIdOut;
    }

    public final int getFantasyPlayerIdIn() {
        return this.fantasyPlayerIdIn;
    }

    public final int getFantasyPlayerIdOut() {
        return this.fantasyPlayerIdOut;
    }

    @NotNull
    public final Player getPlayerIn() {
        return this.playerIn;
    }

    @NotNull
    public final Player getPlayerOut() {
        return this.playerOut;
    }

    public final double getPriceIn() {
        return this.priceIn;
    }

    public final double getPriceOut() {
        return this.priceOut;
    }

    public final int getTeamIdIn() {
        return this.teamIdIn;
    }

    public final int getTeamIdOut() {
        return this.teamIdOut;
    }

    @NotNull
    public final String getTeamNameCodeIn() {
        return this.teamNameCodeIn;
    }

    @NotNull
    public final String getTeamNameCodeOut() {
        return this.teamNameCodeOut;
    }

    public int hashCode() {
        return Integer.hashCode(this.fantasyPlayerIdOut) + wv8.a(this.fantasyPlayerIdIn, dmi.c(dmi.c(wv8.a(this.teamIdOut, wv8.a(this.teamIdIn, dmi.b(dmi.b((this.playerOut.hashCode() + (this.playerIn.hashCode() * 31)) * 31, 31, this.priceIn), 31, this.priceOut), 31), 31), 31, this.teamNameCodeIn), 31, this.teamNameCodeOut), 31);
    }

    @NotNull
    public String toString() {
        Player player = this.playerIn;
        Player player2 = this.playerOut;
        double d = this.priceIn;
        double d2 = this.priceOut;
        int i = this.teamIdIn;
        int i2 = this.teamIdOut;
        String str = this.teamNameCodeIn;
        String str2 = this.teamNameCodeOut;
        int i3 = this.fantasyPlayerIdIn;
        int i4 = this.fantasyPlayerIdOut;
        StringBuilder sb = new StringBuilder("FantasyTransfer(playerIn=");
        sb.append(player);
        sb.append(", playerOut=");
        sb.append(player2);
        sb.append(", priceIn=");
        sb.append(d);
        fn0.A(sb, ", priceOut=", d2, ", teamIdIn=");
        me4.q(sb, i, ", teamIdOut=", i2, ", teamNameCodeIn=");
        bf3.v(sb, str, ", teamNameCodeOut=", str2, ", fantasyPlayerIdIn=");
        return me4.i(sb, i3, ", fantasyPlayerIdOut=", i4, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyTransfer$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyTransfer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyTransfer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyTransfer(@NotNull Player player, @NotNull Player player2, double d, double d2, int i, int i2, @NotNull String str, @NotNull String str2, int i3, int i4) {
        player.getClass();
        player2.getClass();
        str.getClass();
        str2.getClass();
        this.playerIn = player;
        this.playerOut = player2;
        this.priceIn = d;
        this.priceOut = d2;
        this.teamIdIn = i;
        this.teamIdOut = i2;
        this.teamNameCodeIn = str;
        this.teamNameCodeOut = str2;
        this.fantasyPlayerIdIn = i3;
        this.fantasyPlayerIdOut = i4;
    }
}

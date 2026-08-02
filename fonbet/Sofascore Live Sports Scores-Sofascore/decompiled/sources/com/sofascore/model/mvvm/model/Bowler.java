package com.sofascore.model.mvvm.model;

import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.commentary.CommentKt;
import defpackage.a7a;
import defpackage.fc6;
import defpackage.h75;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fBk\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010$Jn\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010 J\u0010\u0010,\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b;\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b<\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b=\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b>\u0010$¨\u0006A"}, d2 = {"Lcom/sofascore/model/mvvm/model/Bowler;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "", "playerName", "", "over", "", "maiden", CommentKt.AMERICAN_FOOTBALL_PLAY_TYPE_RUN, "wicket", "wide", "noBall", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Bowler;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Double;", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "component8", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/mvvm/model/Bowler;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Ljava/lang/String;", "getPlayerName", "Ljava/lang/Double;", "getOver", "Ljava/lang/Integer;", "getMaiden", "getRun", "getWicket", "getWide", "getNoBall", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Bowler implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer maiden;

    @Nullable
    private final Integer noBall;

    @Nullable
    private final Double over;

    @NotNull
    private final Player player;

    @Nullable
    private final String playerName;

    @Nullable
    private final Integer run;

    @Nullable
    private final Integer wicket;

    @Nullable
    private final Integer wide;

    public /* synthetic */ Bowler(int i, Player player, String str, Double d, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, t5h t5hVar) {
        if (255 != (i & 255)) {
            oea.z(i, 255, Bowler$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.player = player;
        this.playerName = str;
        this.over = d;
        this.maiden = num;
        this.run = num2;
        this.wicket = num3;
        this.wide = num4;
        this.noBall = num5;
    }

    public static /* synthetic */ Bowler copy$default(Bowler bowler, Player player, String str, Double d, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, Object obj) {
        if ((i & 1) != 0) {
            player = bowler.player;
        }
        if ((i & 2) != 0) {
            str = bowler.playerName;
        }
        if ((i & 4) != 0) {
            d = bowler.over;
        }
        if ((i & 8) != 0) {
            num = bowler.maiden;
        }
        if ((i & 16) != 0) {
            num2 = bowler.run;
        }
        if ((i & 32) != 0) {
            num3 = bowler.wicket;
        }
        if ((i & 64) != 0) {
            num4 = bowler.wide;
        }
        if ((i & 128) != 0) {
            num5 = bowler.noBall;
        }
        Integer num6 = num4;
        Integer num7 = num5;
        Integer num8 = num2;
        Integer num9 = num3;
        return bowler.copy(player, str, d, num, num8, num9, num6, num7);
    }

    public static final /* synthetic */ void write$Self$model_release(Bowler self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, Player$$serializer.INSTANCE, self.player);
        output.h(serialDesc, 1, uhi.a, self.playerName);
        output.h(serialDesc, 2, h75.a, self.over);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 3, a7aVar, self.maiden);
        output.h(serialDesc, 4, a7aVar, self.run);
        output.h(serialDesc, 5, a7aVar, self.wicket);
        output.h(serialDesc, 6, a7aVar, self.wide);
        output.h(serialDesc, 7, a7aVar, self.noBall);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getPlayerName() {
        return this.playerName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getOver() {
        return this.over;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getMaiden() {
        return this.maiden;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getRun() {
        return this.run;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getWicket() {
        return this.wicket;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getWide() {
        return this.wide;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getNoBall() {
        return this.noBall;
    }

    @NotNull
    public final Bowler copy(@NotNull Player player, @Nullable String playerName, @Nullable Double over, @Nullable Integer maiden, @Nullable Integer run, @Nullable Integer wicket, @Nullable Integer wide, @Nullable Integer noBall) {
        player.getClass();
        return new Bowler(player, playerName, over, maiden, run, wicket, wide, noBall);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Bowler)) {
            return false;
        }
        Bowler bowler = (Bowler) other;
        return Intrinsics.c(this.player, bowler.player) && Intrinsics.c(this.playerName, bowler.playerName) && Intrinsics.c(this.over, bowler.over) && Intrinsics.c(this.maiden, bowler.maiden) && Intrinsics.c(this.run, bowler.run) && Intrinsics.c(this.wicket, bowler.wicket) && Intrinsics.c(this.wide, bowler.wide) && Intrinsics.c(this.noBall, bowler.noBall);
    }

    @Nullable
    public final Integer getMaiden() {
        return this.maiden;
    }

    @Nullable
    public final Integer getNoBall() {
        return this.noBall;
    }

    @Nullable
    public final Double getOver() {
        return this.over;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    public final String getPlayerName() {
        return this.playerName;
    }

    @Nullable
    public final Integer getRun() {
        return this.run;
    }

    @Nullable
    public final Integer getWicket() {
        return this.wicket;
    }

    @Nullable
    public final Integer getWide() {
        return this.wide;
    }

    public int hashCode() {
        int hashCode = this.player.hashCode() * 31;
        String str = this.playerName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.over;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.maiden;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.run;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.wicket;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.wide;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.noBall;
        return hashCode7 + (num5 != null ? num5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Player player = this.player;
        String str = this.playerName;
        Double d = this.over;
        Integer num = this.maiden;
        Integer num2 = this.run;
        Integer num3 = this.wicket;
        Integer num4 = this.wide;
        Integer num5 = this.noBall;
        StringBuilder sb = new StringBuilder("Bowler(player=");
        sb.append(player);
        sb.append(", playerName=");
        sb.append(str);
        sb.append(", over=");
        mz1.x(d, num, ", maiden=", ", run=", sb);
        vxd.r(num2, num3, ", wicket=", ", wide=", sb);
        return fc6.l(num4, num5, ", noBall=", ")", sb);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Bowler$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Bowler;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Bowler$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Bowler(@NotNull Player player, @Nullable String str, @Nullable Double d, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5) {
        player.getClass();
        this.player = player;
        this.playerName = str;
        this.over = d;
        this.maiden = num;
        this.run = num2;
        this.wicket = num3;
        this.wide = num4;
        this.noBall = num5;
    }
}

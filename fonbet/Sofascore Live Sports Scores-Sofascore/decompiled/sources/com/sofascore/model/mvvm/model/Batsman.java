package com.sofascore.model.mvvm.model;

import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.fn0;
import defpackage.h75;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 Q2\u00020\u0001:\u0002RQB\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015B§\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001bJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010\u001dJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001bJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010\u001dJ¶\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b.\u0010\u001dJ\u0010\u0010/\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105J'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bD\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bE\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bF\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bG\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bH\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bI\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bJ\u0010\u001fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010K\u001a\u0004\bL\u0010'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\bM\u0010\u001bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bN\u0010\u001dR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\bO\u0010\u001bR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bP\u0010\u001d¨\u0006S"}, d2 = {"Lcom/sofascore/model/mvvm/model/Batsman;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "", "playerName", "", "score", "balls", "s4", "s6", "wicketTypeId", "wicketTypeName", "fowScore", "", "fowOver", "wicketBowler", "wicketBowlerName", "wicketCatch", "wicketCatchName", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Lt5h;)V", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/lang/Double;", "component11", "component12", "component13", "component14", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;)Lcom/sofascore/model/mvvm/model/Batsman;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Batsman;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Ljava/lang/String;", "getPlayerName", "Ljava/lang/Integer;", "getScore", "getBalls", "getS4", "getS6", "getWicketTypeId", "getWicketTypeName", "getFowScore", "Ljava/lang/Double;", "getFowOver", "getWicketBowler", "getWicketBowlerName", "getWicketCatch", "getWicketCatchName", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Batsman implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer balls;

    @Nullable
    private final Double fowOver;

    @Nullable
    private final Integer fowScore;

    @NotNull
    private final Player player;

    @Nullable
    private final String playerName;

    @Nullable
    private final Integer s4;

    @Nullable
    private final Integer s6;

    @Nullable
    private final Integer score;

    @Nullable
    private final Player wicketBowler;

    @Nullable
    private final String wicketBowlerName;

    @Nullable
    private final Player wicketCatch;

    @Nullable
    private final String wicketCatchName;

    @Nullable
    private final Integer wicketTypeId;

    @Nullable
    private final String wicketTypeName;

    public /* synthetic */ Batsman(int i, Player player, String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str2, Integer num6, Double d, Player player2, String str3, Player player3, String str4, t5h t5hVar) {
        if (16383 != (i & 16383)) {
            oea.z(i, 16383, Batsman$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.player = player;
        this.playerName = str;
        this.score = num;
        this.balls = num2;
        this.s4 = num3;
        this.s6 = num4;
        this.wicketTypeId = num5;
        this.wicketTypeName = str2;
        this.fowScore = num6;
        this.fowOver = d;
        this.wicketBowler = player2;
        this.wicketBowlerName = str3;
        this.wicketCatch = player3;
        this.wicketCatchName = str4;
    }

    public static final /* synthetic */ void write$Self$model_release(Batsman self, wf3 output, SerialDescriptor serialDesc) {
        Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
        output.f(serialDesc, 0, player$$serializer, self.player);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 1, uhiVar, self.playerName);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 2, a7aVar, self.score);
        output.h(serialDesc, 3, a7aVar, self.balls);
        output.h(serialDesc, 4, a7aVar, self.s4);
        output.h(serialDesc, 5, a7aVar, self.s6);
        output.h(serialDesc, 6, a7aVar, self.wicketTypeId);
        output.h(serialDesc, 7, uhiVar, self.wicketTypeName);
        output.h(serialDesc, 8, a7aVar, self.fowScore);
        output.h(serialDesc, 9, h75.a, self.fowOver);
        output.h(serialDesc, 10, player$$serializer, self.wicketBowler);
        output.h(serialDesc, 11, uhiVar, self.wicketBowlerName);
        output.h(serialDesc, 12, player$$serializer, self.wicketCatch);
        output.h(serialDesc, 13, uhiVar, self.wicketCatchName);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Double getFowOver() {
        return this.fowOver;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Player getWicketBowler() {
        return this.wicketBowler;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getWicketBowlerName() {
        return this.wicketBowlerName;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Player getWicketCatch() {
        return this.wicketCatch;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getWicketCatchName() {
        return this.wicketCatchName;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getPlayerName() {
        return this.playerName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getScore() {
        return this.score;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getBalls() {
        return this.balls;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getS4() {
        return this.s4;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getS6() {
        return this.s6;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getWicketTypeId() {
        return this.wicketTypeId;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getWicketTypeName() {
        return this.wicketTypeName;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getFowScore() {
        return this.fowScore;
    }

    @NotNull
    public final Batsman copy(@NotNull Player player, @Nullable String playerName, @Nullable Integer score, @Nullable Integer balls, @Nullable Integer s4, @Nullable Integer s6, @Nullable Integer wicketTypeId, @Nullable String wicketTypeName, @Nullable Integer fowScore, @Nullable Double fowOver, @Nullable Player wicketBowler, @Nullable String wicketBowlerName, @Nullable Player wicketCatch, @Nullable String wicketCatchName) {
        player.getClass();
        return new Batsman(player, playerName, score, balls, s4, s6, wicketTypeId, wicketTypeName, fowScore, fowOver, wicketBowler, wicketBowlerName, wicketCatch, wicketCatchName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Batsman)) {
            return false;
        }
        Batsman batsman = (Batsman) other;
        return Intrinsics.c(this.player, batsman.player) && Intrinsics.c(this.playerName, batsman.playerName) && Intrinsics.c(this.score, batsman.score) && Intrinsics.c(this.balls, batsman.balls) && Intrinsics.c(this.s4, batsman.s4) && Intrinsics.c(this.s6, batsman.s6) && Intrinsics.c(this.wicketTypeId, batsman.wicketTypeId) && Intrinsics.c(this.wicketTypeName, batsman.wicketTypeName) && Intrinsics.c(this.fowScore, batsman.fowScore) && Intrinsics.c(this.fowOver, batsman.fowOver) && Intrinsics.c(this.wicketBowler, batsman.wicketBowler) && Intrinsics.c(this.wicketBowlerName, batsman.wicketBowlerName) && Intrinsics.c(this.wicketCatch, batsman.wicketCatch) && Intrinsics.c(this.wicketCatchName, batsman.wicketCatchName);
    }

    @Nullable
    public final Integer getBalls() {
        return this.balls;
    }

    @Nullable
    public final Double getFowOver() {
        return this.fowOver;
    }

    @Nullable
    public final Integer getFowScore() {
        return this.fowScore;
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
    public final Integer getS4() {
        return this.s4;
    }

    @Nullable
    public final Integer getS6() {
        return this.s6;
    }

    @Nullable
    public final Integer getScore() {
        return this.score;
    }

    @Nullable
    public final Player getWicketBowler() {
        return this.wicketBowler;
    }

    @Nullable
    public final String getWicketBowlerName() {
        return this.wicketBowlerName;
    }

    @Nullable
    public final Player getWicketCatch() {
        return this.wicketCatch;
    }

    @Nullable
    public final String getWicketCatchName() {
        return this.wicketCatchName;
    }

    @Nullable
    public final Integer getWicketTypeId() {
        return this.wicketTypeId;
    }

    @Nullable
    public final String getWicketTypeName() {
        return this.wicketTypeName;
    }

    public int hashCode() {
        int hashCode = this.player.hashCode() * 31;
        String str = this.playerName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.score;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.balls;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.s4;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.s6;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.wicketTypeId;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str2 = this.wicketTypeName;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num6 = this.fowScore;
        int hashCode9 = (hashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Double d = this.fowOver;
        int hashCode10 = (hashCode9 + (d == null ? 0 : d.hashCode())) * 31;
        Player player = this.wicketBowler;
        int hashCode11 = (hashCode10 + (player == null ? 0 : player.hashCode())) * 31;
        String str3 = this.wicketBowlerName;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Player player2 = this.wicketCatch;
        int hashCode13 = (hashCode12 + (player2 == null ? 0 : player2.hashCode())) * 31;
        String str4 = this.wicketCatchName;
        return hashCode13 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Player player = this.player;
        String str = this.playerName;
        Integer num = this.score;
        Integer num2 = this.balls;
        Integer num3 = this.s4;
        Integer num4 = this.s6;
        Integer num5 = this.wicketTypeId;
        String str2 = this.wicketTypeName;
        Integer num6 = this.fowScore;
        Double d = this.fowOver;
        Player player2 = this.wicketBowler;
        String str3 = this.wicketBowlerName;
        Player player3 = this.wicketCatch;
        String str4 = this.wicketCatchName;
        StringBuilder sb = new StringBuilder("Batsman(player=");
        sb.append(player);
        sb.append(", playerName=");
        sb.append(str);
        sb.append(", score=");
        vxd.r(num, num2, ", balls=", ", s4=", sb);
        vxd.r(num3, num4, ", s6=", ", wicketTypeId=", sb);
        vxd.s(num5, ", wicketTypeName=", str2, ", fowScore=", sb);
        fn0.v(d, num6, ", fowOver=", ", wicketBowler=", sb);
        sb.append(player2);
        sb.append(", wicketBowlerName=");
        sb.append(str3);
        sb.append(", wicketCatch=");
        sb.append(player3);
        sb.append(", wicketCatchName=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Batsman$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Batsman;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Batsman$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Batsman(@NotNull Player player, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str2, @Nullable Integer num6, @Nullable Double d, @Nullable Player player2, @Nullable String str3, @Nullable Player player3, @Nullable String str4) {
        player.getClass();
        this.player = player;
        this.playerName = str;
        this.score = num;
        this.balls = num2;
        this.s4 = num3;
        this.s6 = num4;
        this.wicketTypeId = num5;
        this.wicketTypeName = str2;
        this.fowScore = num6;
        this.fowOver = d;
        this.wicketBowler = player2;
        this.wicketBowlerName = str3;
        this.wicketCatch = player3;
        this.wicketCatchName = str4;
    }
}

package com.sofascore.model.newNetwork;

import defpackage.dmi;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.xt8;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ6\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0019J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001d¨\u00061"}, d2 = {"Lcom/sofascore/model/newNetwork/GamePP;", "Ljava/io/Serializable;", "", "game", "", "Lcom/sofascore/model/newNetwork/PointPP;", "points", "Lcom/sofascore/model/newNetwork/ScorePP;", "score", "<init>", "(ILjava/util/List;Lcom/sofascore/model/newNetwork/ScorePP;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/util/List;Lcom/sofascore/model/newNetwork/ScorePP;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/GamePP;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/util/List;", "component3", "()Lcom/sofascore/model/newNetwork/ScorePP;", "copy", "(ILjava/util/List;Lcom/sofascore/model/newNetwork/ScorePP;)Lcom/sofascore/model/newNetwork/GamePP;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getGame", "Ljava/util/List;", "getPoints", "Lcom/sofascore/model/newNetwork/ScorePP;", "getScore", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GamePP implements Serializable {
    private final int game;

    @NotNull
    private final List<PointPP> points;

    @Nullable
    private final ScorePP score;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new xt8(14)), null};

    public /* synthetic */ GamePP(int i, int i2, List list, ScorePP scorePP, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, GamePP$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.game = i2;
        this.points = list;
        this.score = scorePP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(PointPP$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GamePP copy$default(GamePP gamePP, int i, List list, ScorePP scorePP, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = gamePP.game;
        }
        if ((i2 & 2) != 0) {
            list = gamePP.points;
        }
        if ((i2 & 4) != 0) {
            scorePP = gamePP.score;
        }
        return gamePP.copy(i, list, scorePP);
    }

    public static final /* synthetic */ void write$Self$model_release(GamePP self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.game, serialDesc);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.points);
        output.h(serialDesc, 2, ScorePP$$serializer.INSTANCE, self.score);
    }

    /* renamed from: component1, reason: from getter */
    public final int getGame() {
        return this.game;
    }

    @NotNull
    public final List<PointPP> component2() {
        return this.points;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final ScorePP getScore() {
        return this.score;
    }

    @NotNull
    public final GamePP copy(int game, @NotNull List<PointPP> points, @Nullable ScorePP score) {
        points.getClass();
        return new GamePP(game, points, score);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GamePP)) {
            return false;
        }
        GamePP gamePP = (GamePP) other;
        return this.game == gamePP.game && Intrinsics.c(this.points, gamePP.points) && Intrinsics.c(this.score, gamePP.score);
    }

    public final int getGame() {
        return this.game;
    }

    @NotNull
    public final List<PointPP> getPoints() {
        return this.points;
    }

    @Nullable
    public final ScorePP getScore() {
        return this.score;
    }

    public int hashCode() {
        int d = dmi.d(Integer.hashCode(this.game) * 31, 31, this.points);
        ScorePP scorePP = this.score;
        return d + (scorePP == null ? 0 : scorePP.hashCode());
    }

    @NotNull
    public String toString() {
        return "GamePP(game=" + this.game + ", points=" + this.points + ", score=" + this.score + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/GamePP$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/GamePP;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return GamePP$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public GamePP(int i, @NotNull List<PointPP> list, @Nullable ScorePP scorePP) {
        list.getClass();
        this.game = i;
        this.points = list;
        this.score = scorePP;
    }
}

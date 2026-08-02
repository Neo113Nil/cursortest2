package com.sofascore.model.mvvm.model;

import defpackage.a7a;
import defpackage.fc6;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ<\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b.\u0010\u001b¨\u00061"}, d2 = {"Lcom/sofascore/model/mvvm/model/Partnership;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/model/Player;", "player1", "player2", "", "score", "balls", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Partnership;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/mvvm/model/Partnership;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer1", "getPlayer2", "Ljava/lang/Integer;", "getScore", "getBalls", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Partnership implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer balls;

    @NotNull
    private final Player player1;

    @NotNull
    private final Player player2;

    @Nullable
    private final Integer score;

    public /* synthetic */ Partnership(int i, Player player, Player player2, Integer num, Integer num2, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, Partnership$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.player1 = player;
        this.player2 = player2;
        this.score = num;
        this.balls = num2;
    }

    public static /* synthetic */ Partnership copy$default(Partnership partnership, Player player, Player player2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            player = partnership.player1;
        }
        if ((i & 2) != 0) {
            player2 = partnership.player2;
        }
        if ((i & 4) != 0) {
            num = partnership.score;
        }
        if ((i & 8) != 0) {
            num2 = partnership.balls;
        }
        return partnership.copy(player, player2, num, num2);
    }

    public static final /* synthetic */ void write$Self$model_release(Partnership self, wf3 output, SerialDescriptor serialDesc) {
        Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
        output.f(serialDesc, 0, player$$serializer, self.player1);
        output.f(serialDesc, 1, player$$serializer, self.player2);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 2, a7aVar, self.score);
        output.h(serialDesc, 3, a7aVar, self.balls);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Player getPlayer1() {
        return this.player1;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Player getPlayer2() {
        return this.player2;
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

    @NotNull
    public final Partnership copy(@NotNull Player player1, @NotNull Player player2, @Nullable Integer score, @Nullable Integer balls) {
        player1.getClass();
        player2.getClass();
        return new Partnership(player1, player2, score, balls);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Partnership)) {
            return false;
        }
        Partnership partnership = (Partnership) other;
        return Intrinsics.c(this.player1, partnership.player1) && Intrinsics.c(this.player2, partnership.player2) && Intrinsics.c(this.score, partnership.score) && Intrinsics.c(this.balls, partnership.balls);
    }

    @Nullable
    public final Integer getBalls() {
        return this.balls;
    }

    @NotNull
    public final Player getPlayer1() {
        return this.player1;
    }

    @NotNull
    public final Player getPlayer2() {
        return this.player2;
    }

    @Nullable
    public final Integer getScore() {
        return this.score;
    }

    public int hashCode() {
        int hashCode = (this.player2.hashCode() + (this.player1.hashCode() * 31)) * 31;
        Integer num = this.score;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.balls;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Player player = this.player1;
        Player player2 = this.player2;
        Integer num = this.score;
        Integer num2 = this.balls;
        StringBuilder sb = new StringBuilder("Partnership(player1=");
        sb.append(player);
        sb.append(", player2=");
        sb.append(player2);
        sb.append(", score=");
        return fc6.l(num, num2, ", balls=", ")", sb);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Partnership$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Partnership;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Partnership$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Partnership(@NotNull Player player, @NotNull Player player2, @Nullable Integer num, @Nullable Integer num2) {
        player.getClass();
        player2.getClass();
        this.player1 = player;
        this.player2 = player2;
        this.score = num;
        this.balls = num2;
    }
}

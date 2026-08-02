package com.sofascore.model.mvvm.model;

import defpackage.dmi;
import defpackage.fc6;
import defpackage.ila;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.xg0;
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
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BM\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBi\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\"Jb\u0010*\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b,\u0010%J\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\u001e2\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b4\u0010\"R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b5\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010'R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b:\u0010'R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b;\u0010\"¨\u0006>"}, d2 = {"Lcom/sofascore/model/mvvm/model/Lineups;", "Ljava/io/Serializable;", "", "Lcom/sofascore/model/mvvm/model/PlayerData;", "players", "Lcom/sofascore/model/mvvm/model/CricketSupportStaff;", "supportStaff", "", "formation", "Lcom/sofascore/model/mvvm/model/ShirtColor;", "playerColor", "goalkeeperColor", "Lcom/sofascore/model/mvvm/model/MissingPlayerData;", "missingPlayers", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/ShirtColor;Lcom/sofascore/model/mvvm/model/ShirtColor;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/ShirtColor;Lcom/sofascore/model/mvvm/model/ShirtColor;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Lineups;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "playersHaveAverageRatings", "()Z", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Lcom/sofascore/model/mvvm/model/ShirtColor;", "component5", "component6", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/ShirtColor;Lcom/sofascore/model/mvvm/model/ShirtColor;Ljava/util/List;)Lcom/sofascore/model/mvvm/model/Lineups;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPlayers", "getSupportStaff", "Ljava/lang/String;", "getFormation", "Lcom/sofascore/model/mvvm/model/ShirtColor;", "getPlayerColor", "getGoalkeeperColor", "getMissingPlayers", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Lineups implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String formation;

    @NotNull
    private final ShirtColor goalkeeperColor;

    @Nullable
    private final List<MissingPlayerData> missingPlayers;

    @NotNull
    private final ShirtColor playerColor;

    @NotNull
    private final List<PlayerData> players;

    @NotNull
    private final List<CricketSupportStaff> supportStaff;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new ila(20)), ypa.a(ysaVar, new ila(21)), null, null, null, ypa.a(ysaVar, new ila(22))};
    }

    public /* synthetic */ Lineups(int i, List list, List list2, String str, ShirtColor shirtColor, ShirtColor shirtColor2, List list3, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, Lineups$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.players = list;
        this.supportStaff = list2;
        this.formation = str;
        this.playerColor = shirtColor;
        this.goalkeeperColor = shirtColor2;
        this.missingPlayers = list3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(PlayerData$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(CricketSupportStaff$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(MissingPlayerData$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ Lineups copy$default(Lineups lineups, List list, List list2, String str, ShirtColor shirtColor, ShirtColor shirtColor2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = lineups.players;
        }
        if ((i & 2) != 0) {
            list2 = lineups.supportStaff;
        }
        if ((i & 4) != 0) {
            str = lineups.formation;
        }
        if ((i & 8) != 0) {
            shirtColor = lineups.playerColor;
        }
        if ((i & 16) != 0) {
            shirtColor2 = lineups.goalkeeperColor;
        }
        if ((i & 32) != 0) {
            list3 = lineups.missingPlayers;
        }
        ShirtColor shirtColor3 = shirtColor2;
        List list4 = list3;
        return lineups.copy(list, list2, str, shirtColor, shirtColor3, list4);
    }

    public static final /* synthetic */ void write$Self$model_release(Lineups self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.players);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.supportStaff);
        output.h(serialDesc, 2, uhi.a, self.formation);
        ShirtColor$$serializer shirtColor$$serializer = ShirtColor$$serializer.INSTANCE;
        output.f(serialDesc, 3, shirtColor$$serializer, self.playerColor);
        output.f(serialDesc, 4, shirtColor$$serializer, self.goalkeeperColor);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.missingPlayers);
    }

    @NotNull
    public final List<PlayerData> component1() {
        return this.players;
    }

    @NotNull
    public final List<CricketSupportStaff> component2() {
        return this.supportStaff;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getFormation() {
        return this.formation;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ShirtColor getPlayerColor() {
        return this.playerColor;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ShirtColor getGoalkeeperColor() {
        return this.goalkeeperColor;
    }

    @Nullable
    public final List<MissingPlayerData> component6() {
        return this.missingPlayers;
    }

    @NotNull
    public final Lineups copy(@NotNull List<PlayerData> players, @NotNull List<CricketSupportStaff> supportStaff, @Nullable String formation, @NotNull ShirtColor playerColor, @NotNull ShirtColor goalkeeperColor, @Nullable List<MissingPlayerData> missingPlayers) {
        players.getClass();
        supportStaff.getClass();
        playerColor.getClass();
        goalkeeperColor.getClass();
        return new Lineups(players, supportStaff, formation, playerColor, goalkeeperColor, missingPlayers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Lineups)) {
            return false;
        }
        Lineups lineups = (Lineups) other;
        return Intrinsics.c(this.players, lineups.players) && Intrinsics.c(this.supportStaff, lineups.supportStaff) && Intrinsics.c(this.formation, lineups.formation) && Intrinsics.c(this.playerColor, lineups.playerColor) && Intrinsics.c(this.goalkeeperColor, lineups.goalkeeperColor) && Intrinsics.c(this.missingPlayers, lineups.missingPlayers);
    }

    @Nullable
    public final String getFormation() {
        return this.formation;
    }

    @NotNull
    public final ShirtColor getGoalkeeperColor() {
        return this.goalkeeperColor;
    }

    @Nullable
    public final List<MissingPlayerData> getMissingPlayers() {
        return this.missingPlayers;
    }

    @NotNull
    public final ShirtColor getPlayerColor() {
        return this.playerColor;
    }

    @NotNull
    public final List<PlayerData> getPlayers() {
        return this.players;
    }

    @NotNull
    public final List<CricketSupportStaff> getSupportStaff() {
        return this.supportStaff;
    }

    public int hashCode() {
        int d = dmi.d(this.players.hashCode() * 31, 31, this.supportStaff);
        String str = this.formation;
        int hashCode = (this.goalkeeperColor.hashCode() + ((this.playerColor.hashCode() + ((d + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        List<MissingPlayerData> list = this.missingPlayers;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final boolean playersHaveAverageRatings() {
        List<PlayerData> list = this.players;
        if (list != null && list.isEmpty()) {
            return false;
        }
        for (PlayerData playerData : list) {
            if (playerData.getAvgRating() != null && playerData.getAvgRating().doubleValue() > 3.0d) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public String toString() {
        List<PlayerData> list = this.players;
        List<CricketSupportStaff> list2 = this.supportStaff;
        String str = this.formation;
        ShirtColor shirtColor = this.playerColor;
        ShirtColor shirtColor2 = this.goalkeeperColor;
        List<MissingPlayerData> list3 = this.missingPlayers;
        StringBuilder s = fc6.s("Lineups(players=", ", supportStaff=", ", formation=", list, list2);
        s.append(str);
        s.append(", playerColor=");
        s.append(shirtColor);
        s.append(", goalkeeperColor=");
        s.append(shirtColor2);
        s.append(", missingPlayers=");
        s.append(list3);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Lineups$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Lineups;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Lineups$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Lineups(@NotNull List<PlayerData> list, @NotNull List<CricketSupportStaff> list2, @Nullable String str, @NotNull ShirtColor shirtColor, @NotNull ShirtColor shirtColor2, @Nullable List<MissingPlayerData> list3) {
        list.getClass();
        list2.getClass();
        shirtColor.getClass();
        shirtColor2.getClass();
        this.players = list;
        this.supportStaff = list2;
        this.formation = str;
        this.playerColor = shirtColor;
        this.goalkeeperColor = shirtColor2;
        this.missingPlayers = list3;
    }
}

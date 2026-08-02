package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.dmi;
import defpackage.joa;
import defpackage.me4;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wc4;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b&\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Bg\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b)\u0010*Jf\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001fJ\u0010\u0010.\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010*J\u001a\u00100\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b\u0007\u0010#R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b7\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010(R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010*¨\u0006@"}, d2 = {"Lcom/sofascore/model/newNetwork/DraftProspect;", "", "", "firstName", "lastName", "teamName", "", "isTopProspect", "position", "Lcom/sofascore/model/mvvm/model/Team;", "team", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Player;I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Player;ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/DraftProspect;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "component6", "()Lcom/sofascore/model/mvvm/model/Team;", "component7", "()Lcom/sofascore/model/mvvm/model/Player;", "component8", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Player;I)Lcom/sofascore/model/newNetwork/DraftProspect;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFirstName", "getLastName", "getTeamName", "Z", "getPosition", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "I", "getId", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DraftProspect {

    @NotNull
    private final String firstName;
    private final int id;
    private final boolean isTopProspect;

    @NotNull
    private final String lastName;

    @Nullable
    private final Player player;

    @NotNull
    private final String position;

    @Nullable
    private final Team team;

    @Nullable
    private final String teamName;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, null, ypa.a(ysa.b, new wc4(20)), null, null};

    public /* synthetic */ DraftProspect(int i, String str, String str2, String str3, boolean z, String str4, Team team, Player player, int i2, t5h t5hVar) {
        if (255 != (i & 255)) {
            oea.z(i, 255, DraftProspect$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.firstName = str;
        this.lastName = str2;
        this.teamName = str3;
        this.isTopProspect = z;
        this.position = str4;
        this.team = team;
        this.player = player;
        this.id = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ DraftProspect copy$default(DraftProspect draftProspect, String str, String str2, String str3, boolean z, String str4, Team team, Player player, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = draftProspect.firstName;
        }
        if ((i2 & 2) != 0) {
            str2 = draftProspect.lastName;
        }
        if ((i2 & 4) != 0) {
            str3 = draftProspect.teamName;
        }
        if ((i2 & 8) != 0) {
            z = draftProspect.isTopProspect;
        }
        if ((i2 & 16) != 0) {
            str4 = draftProspect.position;
        }
        if ((i2 & 32) != 0) {
            team = draftProspect.team;
        }
        if ((i2 & 64) != 0) {
            player = draftProspect.player;
        }
        if ((i2 & 128) != 0) {
            i = draftProspect.id;
        }
        Player player2 = player;
        int i3 = i;
        String str5 = str4;
        Team team2 = team;
        return draftProspect.copy(str, str2, str3, z, str5, team2, player2, i3);
    }

    public static final /* synthetic */ void write$Self$model_release(DraftProspect self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.y(serialDesc, 0, self.firstName);
        output.y(serialDesc, 1, self.lastName);
        output.h(serialDesc, 2, uhi.a, self.teamName);
        output.x(serialDesc, 3, self.isTopProspect);
        output.y(serialDesc, 4, self.position);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.team);
        output.h(serialDesc, 6, Player$$serializer.INSTANCE, self.player);
        output.u(7, self.id, serialDesc);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getTeamName() {
        return this.teamName;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsTopProspect() {
        return this.isTopProspect;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getPosition() {
        return this.position;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    /* renamed from: component8, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    public final DraftProspect copy(@NotNull String firstName, @NotNull String lastName, @Nullable String teamName, boolean isTopProspect, @NotNull String position, @Nullable Team team, @Nullable Player player, int id) {
        firstName.getClass();
        lastName.getClass();
        position.getClass();
        return new DraftProspect(firstName, lastName, teamName, isTopProspect, position, team, player, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DraftProspect)) {
            return false;
        }
        DraftProspect draftProspect = (DraftProspect) other;
        return Intrinsics.c(this.firstName, draftProspect.firstName) && Intrinsics.c(this.lastName, draftProspect.lastName) && Intrinsics.c(this.teamName, draftProspect.teamName) && this.isTopProspect == draftProspect.isTopProspect && Intrinsics.c(this.position, draftProspect.position) && Intrinsics.c(this.team, draftProspect.team) && Intrinsics.c(this.player, draftProspect.player) && this.id == draftProspect.id;
    }

    @NotNull
    public final String getFirstName() {
        return this.firstName;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final Player getPlayer() {
        return this.player;
    }

    @NotNull
    public final String getPosition() {
        return this.position;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    public final String getTeamName() {
        return this.teamName;
    }

    public int hashCode() {
        int c = dmi.c(this.firstName.hashCode() * 31, 31, this.lastName);
        String str = this.teamName;
        int c2 = dmi.c(dmi.e((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.isTopProspect), 31, this.position);
        Team team = this.team;
        int hashCode = (c2 + (team == null ? 0 : team.hashCode())) * 31;
        Player player = this.player;
        return Integer.hashCode(this.id) + ((hashCode + (player != null ? player.hashCode() : 0)) * 31);
    }

    public final boolean isTopProspect() {
        return this.isTopProspect;
    }

    @NotNull
    public String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.teamName;
        boolean z = this.isTopProspect;
        String str4 = this.position;
        Team team = this.team;
        Player player = this.player;
        int i = this.id;
        StringBuilder s = mz1.s("DraftProspect(firstName=", str, ", lastName=", str2, ", teamName=");
        dmi.w(s, str3, ", isTopProspect=", z, ", position=");
        s.append(str4);
        s.append(", team=");
        s.append(team);
        s.append(", player=");
        s.append(player);
        s.append(", id=");
        s.append(i);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/DraftProspect$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/DraftProspect;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DraftProspect$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public DraftProspect(@NotNull String str, @NotNull String str2, @Nullable String str3, boolean z, @NotNull String str4, @Nullable Team team, @Nullable Player player, int i) {
        me4.p(str, str2, str4);
        this.firstName = str;
        this.lastName = str2;
        this.teamName = str3;
        this.isTopProspect = z;
        this.position = str4;
        this.team = team;
        this.player = player;
        this.id = i;
    }
}

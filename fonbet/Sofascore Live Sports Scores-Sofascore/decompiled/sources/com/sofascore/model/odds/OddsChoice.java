package com.sofascore.model.odds;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamSides;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.ivc;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KJBo\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011B{\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b*\u0010\"J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010$J\u0012\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b.\u0010'J\u0084\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010$J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b2\u0010$J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b3\u0010$J'\u0010;\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b9\u0010:R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010$\"\u0004\b>\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b?\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bA\u0010'R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010<R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010<R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bC\u0010)R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\bF\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\bH\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bI\u0010'¨\u0006L"}, d2 = {"Lcom/sofascore/model/odds/OddsChoice;", "Ljava/io/Serializable;", "", "fractionalValue", "initialFractionalValue", "", "sourceId", "name", "reversibleName", "", "winning", "change", "slipContent", "Lcom/sofascore/model/mvvm/model/Team;", "team", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Integer;Lt5h;)V", "Lcom/sofascore/model/mvvm/model/TeamSides;", "sides", "getReversibleName", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Ljava/lang/String;", "", "setReversibleName", "(Ljava/lang/String;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component6", "()Z", "component7", "component8", "component9", "()Lcom/sofascore/model/mvvm/model/Team;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Integer;)Lcom/sofascore/model/odds/OddsChoice;", "toString", "component4", "component5", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$model_release", "(Lcom/sofascore/model/odds/OddsChoice;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getFractionalValue", "setFractionalValue", "getInitialFractionalValue", "Ljava/lang/Integer;", "getSourceId", "Z", "getWinning", "I", "getChange", "getSlipContent", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "getId", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OddsChoice implements Serializable {
    private final int change;

    @Nullable
    private String fractionalValue;

    @Nullable
    private final Integer id;

    @Nullable
    private final String initialFractionalValue;

    @Nullable
    private final String name;

    @Nullable
    private String reversibleName;

    @Nullable
    private final String slipContent;

    @Nullable
    private final Integer sourceId;

    @Nullable
    private final Team team;
    private final boolean winning;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, null, null, null, null, ypa.a(ysa.b, new ivc(28)), null};

    public /* synthetic */ OddsChoice(int i, String str, String str2, Integer num, String str3, String str4, boolean z, int i2, String str5, Team team, Integer num2, t5h t5hVar) {
        if (159 != (i & 159)) {
            oea.z(i, 159, OddsChoice$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.fractionalValue = str;
        this.initialFractionalValue = str2;
        this.sourceId = num;
        this.name = str3;
        this.reversibleName = str4;
        if ((i & 32) == 0) {
            this.winning = false;
        } else {
            this.winning = z;
        }
        if ((i & 64) == 0) {
            this.change = 0;
        } else {
            this.change = i2;
        }
        this.slipContent = str5;
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.team = null;
        } else {
            this.team = team;
        }
        if ((i & 512) == 0) {
            this.id = null;
        } else {
            this.id = num2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    /* renamed from: component4, reason: from getter */
    private final String getName() {
        return this.name;
    }

    /* renamed from: component5, reason: from getter */
    private final String getReversibleName() {
        return this.reversibleName;
    }

    public static /* synthetic */ OddsChoice copy$default(OddsChoice oddsChoice, String str, String str2, Integer num, String str3, String str4, boolean z, int i, String str5, Team team, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = oddsChoice.fractionalValue;
        }
        if ((i2 & 2) != 0) {
            str2 = oddsChoice.initialFractionalValue;
        }
        if ((i2 & 4) != 0) {
            num = oddsChoice.sourceId;
        }
        if ((i2 & 8) != 0) {
            str3 = oddsChoice.name;
        }
        if ((i2 & 16) != 0) {
            str4 = oddsChoice.reversibleName;
        }
        if ((i2 & 32) != 0) {
            z = oddsChoice.winning;
        }
        if ((i2 & 64) != 0) {
            i = oddsChoice.change;
        }
        if ((i2 & 128) != 0) {
            str5 = oddsChoice.slipContent;
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            team = oddsChoice.team;
        }
        if ((i2 & 512) != 0) {
            num2 = oddsChoice.id;
        }
        Team team2 = team;
        Integer num3 = num2;
        int i3 = i;
        String str6 = str5;
        String str7 = str4;
        boolean z2 = z;
        return oddsChoice.copy(str, str2, num, str3, str7, z2, i3, str6, team2, num3);
    }

    public static /* synthetic */ String getReversibleName$default(OddsChoice oddsChoice, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return oddsChoice.getReversibleName(teamSides);
    }

    public static final /* synthetic */ void write$Self$model_release(OddsChoice self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 0, uhiVar, self.fractionalValue);
        output.h(serialDesc, 1, uhiVar, self.initialFractionalValue);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 2, a7aVar, self.sourceId);
        output.h(serialDesc, 3, uhiVar, self.name);
        output.h(serialDesc, 4, uhiVar, self.reversibleName);
        if (output.o(serialDesc) || self.winning) {
            output.x(serialDesc, 5, self.winning);
        }
        if (output.o(serialDesc) || self.change != 0) {
            output.u(6, self.change, serialDesc);
        }
        output.h(serialDesc, 7, uhiVar, self.slipContent);
        if (output.o(serialDesc) || self.team != null) {
            output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.team);
        }
        if (!output.o(serialDesc) && self.id == null) {
            return;
        }
        output.h(serialDesc, 9, a7aVar, self.id);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getFractionalValue() {
        return this.fractionalValue;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getInitialFractionalValue() {
        return this.initialFractionalValue;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getSourceId() {
        return this.sourceId;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getWinning() {
        return this.winning;
    }

    /* renamed from: component7, reason: from getter */
    public final int getChange() {
        return this.change;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getSlipContent() {
        return this.slipContent;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @NotNull
    public final OddsChoice copy(@Nullable String fractionalValue, @Nullable String initialFractionalValue, @Nullable Integer sourceId, @Nullable String name, @Nullable String reversibleName, boolean winning, int change, @Nullable String slipContent, @Nullable Team team, @Nullable Integer id) {
        return new OddsChoice(fractionalValue, initialFractionalValue, sourceId, name, reversibleName, winning, change, slipContent, team, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OddsChoice)) {
            return false;
        }
        OddsChoice oddsChoice = (OddsChoice) other;
        return Intrinsics.c(this.fractionalValue, oddsChoice.fractionalValue) && Intrinsics.c(this.reversibleName, oddsChoice.reversibleName);
    }

    public final int getChange() {
        return this.change;
    }

    @Nullable
    public final String getFractionalValue() {
        return this.fractionalValue;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getInitialFractionalValue() {
        return this.initialFractionalValue;
    }

    @Nullable
    public final String getReversibleName(@NotNull TeamSides sides) {
        String str;
        sides.getClass();
        return (sides != TeamSides.REVERSIBLE || (str = this.reversibleName) == null) ? this.name : str;
    }

    @Nullable
    public final String getSlipContent() {
        return this.slipContent;
    }

    @Nullable
    public final Integer getSourceId() {
        return this.sourceId;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    public final boolean getWinning() {
        return this.winning;
    }

    public int hashCode() {
        return Objects.hash(this.fractionalValue, this.reversibleName);
    }

    public final void setFractionalValue(@Nullable String str) {
        this.fractionalValue = str;
    }

    public final void setReversibleName(@Nullable String reversibleName) {
        this.reversibleName = reversibleName;
    }

    @NotNull
    public String toString() {
        String str = this.fractionalValue;
        String str2 = this.initialFractionalValue;
        Integer num = this.sourceId;
        String str3 = this.name;
        String str4 = this.reversibleName;
        boolean z = this.winning;
        int i = this.change;
        String str5 = this.slipContent;
        Team team = this.team;
        Integer num2 = this.id;
        StringBuilder s = mz1.s("OddsChoice(fractionalValue=", str, ", initialFractionalValue=", str2, ", sourceId=");
        vxd.s(num, ", name=", str3, ", reversibleName=", s);
        dmi.w(s, str4, ", winning=", z, ", change=");
        vxd.p(i, ", slipContent=", str5, ", team=", s);
        s.append(team);
        s.append(", id=");
        s.append(num2);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/odds/OddsChoice$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/odds/OddsChoice;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return OddsChoice$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public OddsChoice(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, boolean z, int i, @Nullable String str5, @Nullable Team team, @Nullable Integer num2) {
        this.fractionalValue = str;
        this.initialFractionalValue = str2;
        this.sourceId = num;
        this.name = str3;
        this.reversibleName = str4;
        this.winning = z;
        this.change = i;
        this.slipContent = str5;
        this.team = team;
        this.id = num2;
    }

    public /* synthetic */ OddsChoice(String str, String str2, Integer num, String str3, String str4, boolean z, int i, String str5, Team team, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num, str3, str4, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? 0 : i, str5, (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : team, (i2 & 512) != 0 ? null : num2);
    }
}

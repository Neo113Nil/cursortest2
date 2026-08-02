package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.Money;
import com.sofascore.model.Money$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import defpackage.a7a;
import defpackage.eej;
import defpackage.fc6;
import defpackage.joa;
import defpackage.lnb;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.ypa;
import defpackage.ysa;
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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 ]2\u00020\u0001:\u0002^]B\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014B\u0097\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0013\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b*\u0010$J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010'J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010'J\u009c\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b/\u0010$J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u001cJ\u001a\u00103\u001a\u00020\u00162\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u0010AR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010>\u001a\u0004\bB\u0010\u001c\"\u0004\bC\u0010AR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010D\u001a\u0004\bE\u0010\u001fR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010F\u001a\u0004\bG\u0010!\"\u0004\bH\u0010IR$\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010F\u001a\u0004\bJ\u0010!\"\u0004\bK\u0010IR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010L\u001a\u0004\bM\u0010$\"\u0004\bN\u0010OR$\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010L\u001a\u0004\bP\u0010$\"\u0004\bQ\u0010OR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010R\u001a\u0004\bS\u0010'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010T\u001a\u0004\bU\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010L\u001a\u0004\bV\u0010$R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010R\u001a\u0004\bW\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010R\u001a\u0004\bX\u0010'R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010Y\u001a\u0004\b\u0017\u0010Z\"\u0004\b[\u0010\\¨\u0006_"}, d2 = {"Lcom/sofascore/model/mvvm/model/Transfer;", "Ljava/io/Serializable;", "", "id", "transferDateTimestamp", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/mvvm/model/Team;", "transferFrom", "transferTo", "", "fromTeamName", "toTeamName", "type", "Lcom/sofascore/model/Money;", "transferFeeRaw", "transferFeeDescription", TeamOfTheWeekRoundsResponseKt.TOTW_ROUND, "pick", "<init>", "(IILcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/Money;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "", "isManager", "Lt5h;", "serializationConstructorMarker", "(IIILcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/Money;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLt5h;)V", "component1", "()I", "component2", "component3", "()Lcom/sofascore/model/mvvm/model/Player;", "component4", "()Lcom/sofascore/model/mvvm/model/Team;", "component5", "component6", "()Ljava/lang/String;", "component7", "component8", "()Ljava/lang/Integer;", "component9", "()Lcom/sofascore/model/Money;", "component10", "component11", "component12", "copy", "(IILcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/Money;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/mvvm/model/Transfer;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Transfer;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "setId", "(I)V", "getTransferDateTimestamp", "setTransferDateTimestamp", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Lcom/sofascore/model/mvvm/model/Team;", "getTransferFrom", "setTransferFrom", "(Lcom/sofascore/model/mvvm/model/Team;)V", "getTransferTo", "setTransferTo", "Ljava/lang/String;", "getFromTeamName", "setFromTeamName", "(Ljava/lang/String;)V", "getToTeamName", "setToTeamName", "Ljava/lang/Integer;", "getType", "Lcom/sofascore/model/Money;", "getTransferFeeRaw", "getTransferFeeDescription", "getRound", "getPick", "Z", "()Z", "setManager", "(Z)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Transfer implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String fromTeamName;
    private int id;
    private boolean isManager;

    @Nullable
    private final Integer pick;

    @Nullable
    private final Player player;

    @Nullable
    private final Integer round;

    @Nullable
    private String toTeamName;
    private int transferDateTimestamp;

    @Nullable
    private final String transferFeeDescription;

    @Nullable
    private final Money transferFeeRaw;

    @Nullable
    private Team transferFrom;

    @Nullable
    private Team transferTo;

    @Nullable
    private final Integer type;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, ypa.a(ysaVar, new eej(26)), ypa.a(ysaVar, new eej(27)), null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ Transfer(int i, int i2, int i3, Player player, Team team, Team team2, String str, String str2, Integer num, Money money, String str3, Integer num2, Integer num3, boolean z, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, Transfer$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.transferDateTimestamp = i3;
        if ((i & 4) == 0) {
            this.player = null;
        } else {
            this.player = player;
        }
        if ((i & 8) == 0) {
            this.transferFrom = null;
        } else {
            this.transferFrom = team;
        }
        if ((i & 16) == 0) {
            this.transferTo = null;
        } else {
            this.transferTo = team2;
        }
        if ((i & 32) == 0) {
            this.fromTeamName = null;
        } else {
            this.fromTeamName = str;
        }
        if ((i & 64) == 0) {
            this.toTeamName = null;
        } else {
            this.toTeamName = str2;
        }
        if ((i & 128) == 0) {
            this.type = null;
        } else {
            this.type = num;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.transferFeeRaw = null;
        } else {
            this.transferFeeRaw = money;
        }
        if ((i & 512) == 0) {
            this.transferFeeDescription = null;
        } else {
            this.transferFeeDescription = str3;
        }
        if ((i & 1024) == 0) {
            this.round = null;
        } else {
            this.round = num2;
        }
        if ((i & a.o) == 0) {
            this.pick = null;
        } else {
            this.pick = num3;
        }
        this.isManager = (i & 4096) == 0 ? false : z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ Transfer copy$default(Transfer transfer, int i, int i2, Player player, Team team, Team team2, String str, String str2, Integer num, Money money, String str3, Integer num2, Integer num3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = transfer.id;
        }
        if ((i3 & 2) != 0) {
            i2 = transfer.transferDateTimestamp;
        }
        if ((i3 & 4) != 0) {
            player = transfer.player;
        }
        if ((i3 & 8) != 0) {
            team = transfer.transferFrom;
        }
        if ((i3 & 16) != 0) {
            team2 = transfer.transferTo;
        }
        if ((i3 & 32) != 0) {
            str = transfer.fromTeamName;
        }
        if ((i3 & 64) != 0) {
            str2 = transfer.toTeamName;
        }
        if ((i3 & 128) != 0) {
            num = transfer.type;
        }
        if ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            money = transfer.transferFeeRaw;
        }
        if ((i3 & 512) != 0) {
            str3 = transfer.transferFeeDescription;
        }
        if ((i3 & 1024) != 0) {
            num2 = transfer.round;
        }
        if ((i3 & a.o) != 0) {
            num3 = transfer.pick;
        }
        Integer num4 = num2;
        Integer num5 = num3;
        Money money2 = money;
        String str4 = str3;
        String str5 = str2;
        Integer num6 = num;
        Team team3 = team2;
        String str6 = str;
        return transfer.copy(i, i2, player, team, team3, str6, str5, num6, money2, str4, num4, num5);
    }

    public static final /* synthetic */ void write$Self$model_release(Transfer self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.u(1, self.transferDateTimestamp, serialDesc);
        if (output.o(serialDesc) || self.player != null) {
            output.h(serialDesc, 2, Player$$serializer.INSTANCE, self.player);
        }
        if (output.o(serialDesc) || self.transferFrom != null) {
            output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.transferFrom);
        }
        if (output.o(serialDesc) || self.transferTo != null) {
            output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.transferTo);
        }
        if (output.o(serialDesc) || self.fromTeamName != null) {
            output.h(serialDesc, 5, uhi.a, self.fromTeamName);
        }
        if (output.o(serialDesc) || self.toTeamName != null) {
            output.h(serialDesc, 6, uhi.a, self.toTeamName);
        }
        if (output.o(serialDesc) || self.type != null) {
            output.h(serialDesc, 7, a7a.a, self.type);
        }
        if (output.o(serialDesc) || self.transferFeeRaw != null) {
            output.h(serialDesc, 8, Money$$serializer.INSTANCE, self.transferFeeRaw);
        }
        if (output.o(serialDesc) || self.transferFeeDescription != null) {
            output.h(serialDesc, 9, uhi.a, self.transferFeeDescription);
        }
        if (output.o(serialDesc) || self.round != null) {
            output.h(serialDesc, 10, a7a.a, self.round);
        }
        if (output.o(serialDesc) || self.pick != null) {
            output.h(serialDesc, 11, a7a.a, self.pick);
        }
        if (output.o(serialDesc) || self.isManager) {
            output.x(serialDesc, 12, self.isManager);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getTransferFeeDescription() {
        return this.transferFeeDescription;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getRound() {
        return this.round;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getPick() {
        return this.pick;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTransferDateTimestamp() {
        return this.transferDateTimestamp;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Team getTransferFrom() {
        return this.transferFrom;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Team getTransferTo() {
        return this.transferTo;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getFromTeamName() {
        return this.fromTeamName;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getToTeamName() {
        return this.toTeamName;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Money getTransferFeeRaw() {
        return this.transferFeeRaw;
    }

    @NotNull
    public final Transfer copy(int id, int transferDateTimestamp, @Nullable Player player, @Nullable Team transferFrom, @Nullable Team transferTo, @Nullable String fromTeamName, @Nullable String toTeamName, @Nullable Integer type, @Nullable Money transferFeeRaw, @Nullable String transferFeeDescription, @Nullable Integer round, @Nullable Integer pick) {
        return new Transfer(id, transferDateTimestamp, player, transferFrom, transferTo, fromTeamName, toTeamName, type, transferFeeRaw, transferFeeDescription, round, pick);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Transfer)) {
            return false;
        }
        Transfer transfer = (Transfer) other;
        return this.id == transfer.id && this.transferDateTimestamp == transfer.transferDateTimestamp && Intrinsics.c(this.player, transfer.player) && Intrinsics.c(this.transferFrom, transfer.transferFrom) && Intrinsics.c(this.transferTo, transfer.transferTo) && Intrinsics.c(this.fromTeamName, transfer.fromTeamName) && Intrinsics.c(this.toTeamName, transfer.toTeamName) && Intrinsics.c(this.type, transfer.type) && Intrinsics.c(this.transferFeeRaw, transfer.transferFeeRaw) && Intrinsics.c(this.transferFeeDescription, transfer.transferFeeDescription) && Intrinsics.c(this.round, transfer.round) && Intrinsics.c(this.pick, transfer.pick);
    }

    @Nullable
    public final String getFromTeamName() {
        return this.fromTeamName;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getPick() {
        return this.pick;
    }

    @Nullable
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    public final Integer getRound() {
        return this.round;
    }

    @Nullable
    public final String getToTeamName() {
        return this.toTeamName;
    }

    public final int getTransferDateTimestamp() {
        return this.transferDateTimestamp;
    }

    @Nullable
    public final String getTransferFeeDescription() {
        return this.transferFeeDescription;
    }

    @Nullable
    public final Money getTransferFeeRaw() {
        return this.transferFeeRaw;
    }

    @Nullable
    public final Team getTransferFrom() {
        return this.transferFrom;
    }

    @Nullable
    public final Team getTransferTo() {
        return this.transferTo;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        int a = wv8.a(this.transferDateTimestamp, Integer.hashCode(this.id) * 31, 31);
        Player player = this.player;
        int hashCode = (a + (player == null ? 0 : player.hashCode())) * 31;
        Team team = this.transferFrom;
        int hashCode2 = (hashCode + (team == null ? 0 : team.hashCode())) * 31;
        Team team2 = this.transferTo;
        int hashCode3 = (hashCode2 + (team2 == null ? 0 : team2.hashCode())) * 31;
        String str = this.fromTeamName;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.toTeamName;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.type;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Money money = this.transferFeeRaw;
        int hashCode7 = (hashCode6 + (money == null ? 0 : money.hashCode())) * 31;
        String str3 = this.transferFeeDescription;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.round;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.pick;
        return hashCode9 + (num3 != null ? num3.hashCode() : 0);
    }

    /* renamed from: isManager, reason: from getter */
    public final boolean getIsManager() {
        return this.isManager;
    }

    public final void setFromTeamName(@Nullable String str) {
        this.fromTeamName = str;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setManager(boolean z) {
        this.isManager = z;
    }

    public final void setToTeamName(@Nullable String str) {
        this.toTeamName = str;
    }

    public final void setTransferDateTimestamp(int i) {
        this.transferDateTimestamp = i;
    }

    public final void setTransferFrom(@Nullable Team team) {
        this.transferFrom = team;
    }

    public final void setTransferTo(@Nullable Team team) {
        this.transferTo = team;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        int i2 = this.transferDateTimestamp;
        Player player = this.player;
        Team team = this.transferFrom;
        Team team2 = this.transferTo;
        String str = this.fromTeamName;
        String str2 = this.toTeamName;
        Integer num = this.type;
        Money money = this.transferFeeRaw;
        String str3 = this.transferFeeDescription;
        Integer num2 = this.round;
        Integer num3 = this.pick;
        StringBuilder s = lnb.s(i, i2, "Transfer(id=", ", transferDateTimestamp=", ", player=");
        s.append(player);
        s.append(", transferFrom=");
        s.append(team);
        s.append(", transferTo=");
        s.append(team2);
        s.append(", fromTeamName=");
        s.append(str);
        s.append(", toTeamName=");
        me4.o(num, str2, ", type=", ", transferFeeRaw=", s);
        s.append(money);
        s.append(", transferFeeDescription=");
        s.append(str3);
        s.append(", round=");
        return fc6.l(num2, num3, ", pick=", ")", s);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Transfer$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Transfer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Transfer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Transfer(int i, int i2, @Nullable Player player, @Nullable Team team, @Nullable Team team2, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Money money, @Nullable String str3, @Nullable Integer num2, @Nullable Integer num3) {
        this.id = i;
        this.transferDateTimestamp = i2;
        this.player = player;
        this.transferFrom = team;
        this.transferTo = team2;
        this.fromTeamName = str;
        this.toTeamName = str2;
        this.type = num;
        this.transferFeeRaw = money;
        this.transferFeeDescription = str3;
        this.round = num2;
        this.pick = num3;
    }

    public /* synthetic */ Transfer(int i, int i2, Player player, Team team, Team team2, String str, String str2, Integer num, Money money, String str3, Integer num2, Integer num3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : player, (i3 & 8) != 0 ? null : team, (i3 & 16) != 0 ? null : team2, (i3 & 32) != 0 ? null : str, (i3 & 64) != 0 ? null : str2, (i3 & 128) != 0 ? null : num, (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : money, (i3 & 512) != 0 ? null : str3, (i3 & 1024) != 0 ? null : num2, (i3 & a.o) != 0 ? null : num3);
    }
}

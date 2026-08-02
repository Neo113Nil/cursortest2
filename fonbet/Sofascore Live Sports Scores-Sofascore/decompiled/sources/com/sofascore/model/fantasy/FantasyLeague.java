package com.sofascore.model.fantasy;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Country$$serializer;
import defpackage.a7a;
import defpackage.au6;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.joa;
import defpackage.lkb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002ONBq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0087\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u0012\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b)\u0010*J\u008e\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010\u001cJ\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u001aJ\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102J'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b?\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b@\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\bA\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bC\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bD\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bF\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\bG\u0010\u001cR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bI\u0010&R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010J\u001a\u0004\bK\u0010(R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\bM\u0010*¨\u0006P"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyLeague;", "", "", "id", "", "name", "description", "ownerId", "startRoundId", "totalPlayers", "", "createdAtTimestamp", "ownerNickname", "Lcom/sofascore/model/mvvm/model/Country;", "country", "Lcom/sofascore/model/fantasy/FantasyLeagueType;", "type", "Lcom/sofascore/model/fantasy/FantasyLeagueGameType;", "gameType", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Country;Lcom/sofascore/model/fantasy/FantasyLeagueType;Lcom/sofascore/model/fantasy/FantasyLeagueGameType;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Country;Lcom/sofascore/model/fantasy/FantasyLeagueType;Lcom/sofascore/model/fantasy/FantasyLeagueGameType;Lt5h;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Ljava/lang/Integer;", "component6", "component7", "()Ljava/lang/Long;", "component8", "component9", "()Lcom/sofascore/model/mvvm/model/Country;", "component10", "()Lcom/sofascore/model/fantasy/FantasyLeagueType;", "component11", "()Lcom/sofascore/model/fantasy/FantasyLeagueGameType;", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Country;Lcom/sofascore/model/fantasy/FantasyLeagueType;Lcom/sofascore/model/fantasy/FantasyLeagueGameType;)Lcom/sofascore/model/fantasy/FantasyLeague;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyLeague;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getName", "getDescription", "getOwnerId", "Ljava/lang/Integer;", "getStartRoundId", "getTotalPlayers", "Ljava/lang/Long;", "getCreatedAtTimestamp", "getOwnerNickname", "Lcom/sofascore/model/mvvm/model/Country;", "getCountry", "Lcom/sofascore/model/fantasy/FantasyLeagueType;", "getType", "Lcom/sofascore/model/fantasy/FantasyLeagueGameType;", "getGameType", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyLeague {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Country country;

    @Nullable
    private final Long createdAtTimestamp;

    @Nullable
    private final String description;

    @NotNull
    private final FantasyLeagueGameType gameType;
    private final int id;

    @NotNull
    private final String name;

    @Nullable
    private final String ownerId;

    @Nullable
    private final String ownerNickname;

    @Nullable
    private final Integer startRoundId;

    @Nullable
    private final Integer totalPlayers;

    @Nullable
    private final FantasyLeagueType type;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new au6(19)), ypa.a(ysaVar, new au6(20))};
    }

    public /* synthetic */ FantasyLeague(int i, int i2, String str, String str2, String str3, Integer num, Integer num2, Long l, String str4, Country country, FantasyLeagueType fantasyLeagueType, FantasyLeagueGameType fantasyLeagueGameType, t5h t5hVar) {
        if (1023 != (i & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)) {
            oea.z(i, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, FantasyLeague$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.name = str;
        this.description = str2;
        this.ownerId = str3;
        this.startRoundId = num;
        this.totalPlayers = num2;
        this.createdAtTimestamp = l;
        this.ownerNickname = str4;
        this.country = country;
        this.type = fantasyLeagueType;
        if ((i & 1024) == 0) {
            this.gameType = FantasyLeagueGameType.CLASSIC;
        } else {
            this.gameType = fantasyLeagueGameType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return FantasyLeagueType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return FantasyLeagueGameType.INSTANCE.serializer();
    }

    public static /* synthetic */ FantasyLeague copy$default(FantasyLeague fantasyLeague, int i, String str, String str2, String str3, Integer num, Integer num2, Long l, String str4, Country country, FantasyLeagueType fantasyLeagueType, FantasyLeagueGameType fantasyLeagueGameType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fantasyLeague.id;
        }
        if ((i2 & 2) != 0) {
            str = fantasyLeague.name;
        }
        if ((i2 & 4) != 0) {
            str2 = fantasyLeague.description;
        }
        if ((i2 & 8) != 0) {
            str3 = fantasyLeague.ownerId;
        }
        if ((i2 & 16) != 0) {
            num = fantasyLeague.startRoundId;
        }
        if ((i2 & 32) != 0) {
            num2 = fantasyLeague.totalPlayers;
        }
        if ((i2 & 64) != 0) {
            l = fantasyLeague.createdAtTimestamp;
        }
        if ((i2 & 128) != 0) {
            str4 = fantasyLeague.ownerNickname;
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            country = fantasyLeague.country;
        }
        if ((i2 & 512) != 0) {
            fantasyLeagueType = fantasyLeague.type;
        }
        if ((i2 & 1024) != 0) {
            fantasyLeagueGameType = fantasyLeague.gameType;
        }
        FantasyLeagueType fantasyLeagueType2 = fantasyLeagueType;
        FantasyLeagueGameType fantasyLeagueGameType2 = fantasyLeagueGameType;
        String str5 = str4;
        Country country2 = country;
        Integer num3 = num2;
        Long l2 = l;
        Integer num4 = num;
        String str6 = str2;
        return fantasyLeague.copy(i, str, str6, str3, num4, num3, l2, str5, country2, fantasyLeagueType2, fantasyLeagueGameType2);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyLeague self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.name);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 2, uhiVar, self.description);
        output.h(serialDesc, 3, uhiVar, self.ownerId);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 4, a7aVar, self.startRoundId);
        output.h(serialDesc, 5, a7aVar, self.totalPlayers);
        output.h(serialDesc, 6, lkb.a, self.createdAtTimestamp);
        output.h(serialDesc, 7, uhiVar, self.ownerNickname);
        output.h(serialDesc, 8, Country$$serializer.INSTANCE, self.country);
        output.h(serialDesc, 9, (KSerializer) joaVarArr[9].getValue(), self.type);
        if (!output.o(serialDesc) && self.gameType == FantasyLeagueGameType.CLASSIC) {
            return;
        }
        output.f(serialDesc, 10, (KSerializer) joaVarArr[10].getValue(), self.gameType);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final FantasyLeagueType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final FantasyLeagueGameType getGameType() {
        return this.gameType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getStartRoundId() {
        return this.startRoundId;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getTotalPlayers() {
        return this.totalPlayers;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Long getCreatedAtTimestamp() {
        return this.createdAtTimestamp;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getOwnerNickname() {
        return this.ownerNickname;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Country getCountry() {
        return this.country;
    }

    @NotNull
    public final FantasyLeague copy(int id, @NotNull String name, @Nullable String description, @Nullable String ownerId, @Nullable Integer startRoundId, @Nullable Integer totalPlayers, @Nullable Long createdAtTimestamp, @Nullable String ownerNickname, @Nullable Country country, @Nullable FantasyLeagueType type, @NotNull FantasyLeagueGameType gameType) {
        name.getClass();
        gameType.getClass();
        return new FantasyLeague(id, name, description, ownerId, startRoundId, totalPlayers, createdAtTimestamp, ownerNickname, country, type, gameType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyLeague)) {
            return false;
        }
        FantasyLeague fantasyLeague = (FantasyLeague) other;
        return this.id == fantasyLeague.id && Intrinsics.c(this.name, fantasyLeague.name) && Intrinsics.c(this.description, fantasyLeague.description) && Intrinsics.c(this.ownerId, fantasyLeague.ownerId) && Intrinsics.c(this.startRoundId, fantasyLeague.startRoundId) && Intrinsics.c(this.totalPlayers, fantasyLeague.totalPlayers) && Intrinsics.c(this.createdAtTimestamp, fantasyLeague.createdAtTimestamp) && Intrinsics.c(this.ownerNickname, fantasyLeague.ownerNickname) && Intrinsics.c(this.country, fantasyLeague.country) && this.type == fantasyLeague.type && this.gameType == fantasyLeague.gameType;
    }

    @Nullable
    public final Country getCountry() {
        return this.country;
    }

    @Nullable
    public final Long getCreatedAtTimestamp() {
        return this.createdAtTimestamp;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final FantasyLeagueGameType getGameType() {
        return this.gameType;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final String getOwnerNickname() {
        return this.ownerNickname;
    }

    @Nullable
    public final Integer getStartRoundId() {
        return this.startRoundId;
    }

    @Nullable
    public final Integer getTotalPlayers() {
        return this.totalPlayers;
    }

    @Nullable
    public final FantasyLeagueType getType() {
        return this.type;
    }

    public int hashCode() {
        int c = dmi.c(Integer.hashCode(this.id) * 31, 31, this.name);
        String str = this.description;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ownerId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.startRoundId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalPlayers;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.createdAtTimestamp;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.ownerNickname;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Country country = this.country;
        int hashCode7 = (hashCode6 + (country == null ? 0 : country.hashCode())) * 31;
        FantasyLeagueType fantasyLeagueType = this.type;
        return this.gameType.hashCode() + ((hashCode7 + (fantasyLeagueType != null ? fantasyLeagueType.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.name;
        String str2 = this.description;
        String str3 = this.ownerId;
        Integer num = this.startRoundId;
        Integer num2 = this.totalPlayers;
        Long l = this.createdAtTimestamp;
        String str4 = this.ownerNickname;
        Country country = this.country;
        FantasyLeagueType fantasyLeagueType = this.type;
        FantasyLeagueGameType fantasyLeagueGameType = this.gameType;
        StringBuilder t = dmi.t(i, "FantasyLeague(id=", ", name=", str, ", description=");
        bf3.v(t, str2, ", ownerId=", str3, ", startRoundId=");
        vxd.r(num, num2, ", totalPlayers=", ", createdAtTimestamp=", t);
        t.append(l);
        t.append(", ownerNickname=");
        t.append(str4);
        t.append(", country=");
        t.append(country);
        t.append(", type=");
        t.append(fantasyLeagueType);
        t.append(", gameType=");
        t.append(fantasyLeagueGameType);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyLeague$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyLeague;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyLeague$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyLeague(int i, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l, @Nullable String str4, @Nullable Country country, @Nullable FantasyLeagueType fantasyLeagueType, @NotNull FantasyLeagueGameType fantasyLeagueGameType) {
        str.getClass();
        fantasyLeagueGameType.getClass();
        this.id = i;
        this.name = str;
        this.description = str2;
        this.ownerId = str3;
        this.startRoundId = num;
        this.totalPlayers = num2;
        this.createdAtTimestamp = l;
        this.ownerNickname = str4;
        this.country = country;
        this.type = fantasyLeagueType;
        this.gameType = fantasyLeagueGameType;
    }

    public /* synthetic */ FantasyLeague(int i, String str, String str2, String str3, Integer num, Integer num2, Long l, String str4, Country country, FantasyLeagueType fantasyLeagueType, FantasyLeagueGameType fantasyLeagueGameType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, num, num2, l, str4, country, fantasyLeagueType, (i2 & 1024) != 0 ? FantasyLeagueGameType.CLASSIC : fantasyLeagueGameType);
    }
}

package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Money;
import com.sofascore.model.Money$$serializer;
import com.sofascore.model.cuptree.CupTreeBlock;
import defpackage.a7a;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.gz1;
import defpackage.h75;
import defpackage.lkb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.wt3;
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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 n2\u00020\u0001:\u0002onB×\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eBé\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u0012\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010&J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010&J\u0012\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b/\u0010.J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b6\u00105J\u0012\u00107\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b7\u00103J\u0012\u00108\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b8\u0010&J\u0012\u00109\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b9\u0010&J\u0012\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b:\u0010&J\u0012\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b;\u0010)J\u0012\u0010<\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b<\u00103J\u0012\u0010=\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b=\u00103J\u0010\u0010>\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0088\u0002\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bB\u0010&J\u0010\u0010C\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bC\u0010$J\u001a\u0010F\u001a\u00020\u00122\b\u0010E\u001a\u0004\u0018\u00010DHÖ\u0003¢\u0006\u0004\bF\u0010GJ'\u0010P\u001a\u00020M2\u0006\u0010H\u001a\u00020\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020KH\u0001¢\u0006\u0004\bN\u0010OR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010Q\u001a\u0004\bR\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010S\u001a\u0004\bT\u0010&R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010S\u001a\u0004\bU\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010V\u001a\u0004\bW\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010V\u001a\u0004\bX\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010S\u001a\u0004\bY\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010S\u001a\u0004\bZ\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010[\u001a\u0004\b\\\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010[\u001a\u0004\b]\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010^\u001a\u0004\b_\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010`\u001a\u0004\ba\u00103R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010b\u001a\u0004\bc\u00105R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010b\u001a\u0004\bd\u00105R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010`\u001a\u0004\be\u00103R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010S\u001a\u0004\bf\u0010&R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010S\u001a\u0004\bg\u0010&R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010S\u001a\u0004\bh\u0010&R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010V\u001a\u0004\bi\u0010)R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u001a\u0010`\u001a\u0004\bj\u00103R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u001b\u0010`\u001a\u0004\bk\u00103R\u0017\u0010\u001c\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u001c\u0010l\u001a\u0004\bm\u0010?¨\u0006p"}, d2 = {"Lcom/sofascore/model/mvvm/model/PlayerTeamInfo;", "Ljava/io/Serializable;", "", "id", "", "residence", "birthplace", "", "height", "weight", "plays", "turnedPro", "Lcom/sofascore/model/Money;", "prizeCurrentRaw", "prizeTotalRaw", "number", "", "birthDateTimestamp", "", CupTreeBlock.BLOCK_RESULT_RETIRED, "deceased", "dateOfDeathTimestamp", "nickname", "weightClass", "fightingStyle", "reach", "currentUniqueTournamentSinceTimestamp", "currentUniqueTournamentUntilTimestamp", "underage", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/Money;Lcom/sofascore/model/Money;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Z)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/Money;Lcom/sofascore/model/Money;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;ZLt5h;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Double;", "component5", "component6", "component7", "component8", "()Lcom/sofascore/model/Money;", "component9", "component10", "()Ljava/lang/Integer;", "component11", "()Ljava/lang/Long;", "component12", "()Ljava/lang/Boolean;", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "()Z", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/Money;Lcom/sofascore/model/Money;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Z)Lcom/sofascore/model/mvvm/model/PlayerTeamInfo;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/PlayerTeamInfo;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getResidence", "getBirthplace", "Ljava/lang/Double;", "getHeight", "getWeight", "getPlays", "getTurnedPro", "Lcom/sofascore/model/Money;", "getPrizeCurrentRaw", "getPrizeTotalRaw", "Ljava/lang/Integer;", "getNumber", "Ljava/lang/Long;", "getBirthDateTimestamp", "Ljava/lang/Boolean;", "getRetired", "getDeceased", "getDateOfDeathTimestamp", "getNickname", "getWeightClass", "getFightingStyle", "getReach", "getCurrentUniqueTournamentSinceTimestamp", "getCurrentUniqueTournamentUntilTimestamp", "Z", "getUnderage", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlayerTeamInfo implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Long birthDateTimestamp;

    @Nullable
    private final String birthplace;

    @Nullable
    private final Long currentUniqueTournamentSinceTimestamp;

    @Nullable
    private final Long currentUniqueTournamentUntilTimestamp;

    @Nullable
    private final Long dateOfDeathTimestamp;

    @Nullable
    private final Boolean deceased;

    @Nullable
    private final String fightingStyle;

    @Nullable
    private final Double height;
    private final int id;

    @Nullable
    private final String nickname;

    @Nullable
    private final Integer number;

    @Nullable
    private final String plays;

    @Nullable
    private final Money prizeCurrentRaw;

    @Nullable
    private final Money prizeTotalRaw;

    @Nullable
    private final Double reach;

    @Nullable
    private final String residence;

    @Nullable
    private final Boolean retired;

    @Nullable
    private final String turnedPro;
    private final boolean underage;

    @Nullable
    private final Double weight;

    @Nullable
    private final String weightClass;

    public /* synthetic */ PlayerTeamInfo(int i, int i2, String str, String str2, Double d, Double d2, String str3, String str4, Money money, Money money2, Integer num, Long l, Boolean bool, Boolean bool2, Long l2, String str5, String str6, String str7, Double d3, Long l3, Long l4, boolean z, t5h t5hVar) {
        if (1048575 != (i & 1048575)) {
            oea.z(i, 1048575, PlayerTeamInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.residence = str;
        this.birthplace = str2;
        this.height = d;
        this.weight = d2;
        this.plays = str3;
        this.turnedPro = str4;
        this.prizeCurrentRaw = money;
        this.prizeTotalRaw = money2;
        this.number = num;
        this.birthDateTimestamp = l;
        this.retired = bool;
        this.deceased = bool2;
        this.dateOfDeathTimestamp = l2;
        this.nickname = str5;
        this.weightClass = str6;
        this.fightingStyle = str7;
        this.reach = d3;
        this.currentUniqueTournamentSinceTimestamp = l3;
        this.currentUniqueTournamentUntilTimestamp = l4;
        this.underage = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0 ? false : z;
    }

    public static /* synthetic */ PlayerTeamInfo copy$default(PlayerTeamInfo playerTeamInfo, int i, String str, String str2, Double d, Double d2, String str3, String str4, Money money, Money money2, Integer num, Long l, Boolean bool, Boolean bool2, Long l2, String str5, String str6, String str7, Double d3, Long l3, Long l4, boolean z, int i2, Object obj) {
        boolean z2;
        Long l5;
        int i3 = (i2 & 1) != 0 ? playerTeamInfo.id : i;
        String str8 = (i2 & 2) != 0 ? playerTeamInfo.residence : str;
        String str9 = (i2 & 4) != 0 ? playerTeamInfo.birthplace : str2;
        Double d4 = (i2 & 8) != 0 ? playerTeamInfo.height : d;
        Double d5 = (i2 & 16) != 0 ? playerTeamInfo.weight : d2;
        String str10 = (i2 & 32) != 0 ? playerTeamInfo.plays : str3;
        String str11 = (i2 & 64) != 0 ? playerTeamInfo.turnedPro : str4;
        Money money3 = (i2 & 128) != 0 ? playerTeamInfo.prizeCurrentRaw : money;
        Money money4 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? playerTeamInfo.prizeTotalRaw : money2;
        Integer num2 = (i2 & 512) != 0 ? playerTeamInfo.number : num;
        Long l6 = (i2 & 1024) != 0 ? playerTeamInfo.birthDateTimestamp : l;
        Boolean bool3 = (i2 & a.o) != 0 ? playerTeamInfo.retired : bool;
        Boolean bool4 = (i2 & 4096) != 0 ? playerTeamInfo.deceased : bool2;
        Long l7 = (i2 & 8192) != 0 ? playerTeamInfo.dateOfDeathTimestamp : l2;
        int i4 = i3;
        String str12 = (i2 & 16384) != 0 ? playerTeamInfo.nickname : str5;
        String str13 = (i2 & 32768) != 0 ? playerTeamInfo.weightClass : str6;
        String str14 = (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? playerTeamInfo.fightingStyle : str7;
        Double d6 = (i2 & 131072) != 0 ? playerTeamInfo.reach : d3;
        Long l8 = (i2 & 262144) != 0 ? playerTeamInfo.currentUniqueTournamentSinceTimestamp : l3;
        Long l9 = (i2 & 524288) != 0 ? playerTeamInfo.currentUniqueTournamentUntilTimestamp : l4;
        if ((i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
            l5 = l9;
            z2 = playerTeamInfo.underage;
        } else {
            z2 = z;
            l5 = l9;
        }
        return playerTeamInfo.copy(i4, str8, str9, d4, d5, str10, str11, money3, money4, num2, l6, bool3, bool4, l7, str12, str13, str14, d6, l8, l5, z2);
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerTeamInfo self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 1, uhiVar, self.residence);
        output.h(serialDesc, 2, uhiVar, self.birthplace);
        h75 h75Var = h75.a;
        output.h(serialDesc, 3, h75Var, self.height);
        output.h(serialDesc, 4, h75Var, self.weight);
        output.h(serialDesc, 5, uhiVar, self.plays);
        output.h(serialDesc, 6, uhiVar, self.turnedPro);
        Money$$serializer money$$serializer = Money$$serializer.INSTANCE;
        output.h(serialDesc, 7, money$$serializer, self.prizeCurrentRaw);
        output.h(serialDesc, 8, money$$serializer, self.prizeTotalRaw);
        output.h(serialDesc, 9, a7a.a, self.number);
        lkb lkbVar = lkb.a;
        output.h(serialDesc, 10, lkbVar, self.birthDateTimestamp);
        gz1 gz1Var = gz1.a;
        output.h(serialDesc, 11, gz1Var, self.retired);
        output.h(serialDesc, 12, gz1Var, self.deceased);
        output.h(serialDesc, 13, lkbVar, self.dateOfDeathTimestamp);
        output.h(serialDesc, 14, uhiVar, self.nickname);
        output.h(serialDesc, 15, uhiVar, self.weightClass);
        output.h(serialDesc, 16, uhiVar, self.fightingStyle);
        output.h(serialDesc, 17, h75Var, self.reach);
        output.h(serialDesc, 18, lkbVar, self.currentUniqueTournamentSinceTimestamp);
        output.h(serialDesc, 19, lkbVar, self.currentUniqueTournamentUntilTimestamp);
        if (output.o(serialDesc) || self.underage) {
            output.x(serialDesc, 20, self.underage);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getNumber() {
        return this.number;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Long getBirthDateTimestamp() {
        return this.birthDateTimestamp;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Boolean getRetired() {
        return this.retired;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Boolean getDeceased() {
        return this.deceased;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Long getDateOfDeathTimestamp() {
        return this.dateOfDeathTimestamp;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getWeightClass() {
        return this.weightClass;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getFightingStyle() {
        return this.fightingStyle;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Double getReach() {
        return this.reach;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Long getCurrentUniqueTournamentSinceTimestamp() {
        return this.currentUniqueTournamentSinceTimestamp;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getResidence() {
        return this.residence;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Long getCurrentUniqueTournamentUntilTimestamp() {
        return this.currentUniqueTournamentUntilTimestamp;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getUnderage() {
        return this.underage;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getBirthplace() {
        return this.birthplace;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getHeight() {
        return this.height;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Double getWeight() {
        return this.weight;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getPlays() {
        return this.plays;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getTurnedPro() {
        return this.turnedPro;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Money getPrizeCurrentRaw() {
        return this.prizeCurrentRaw;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Money getPrizeTotalRaw() {
        return this.prizeTotalRaw;
    }

    @NotNull
    public final PlayerTeamInfo copy(int id, @Nullable String residence, @Nullable String birthplace, @Nullable Double height, @Nullable Double weight, @Nullable String plays, @Nullable String turnedPro, @Nullable Money prizeCurrentRaw, @Nullable Money prizeTotalRaw, @Nullable Integer number, @Nullable Long birthDateTimestamp, @Nullable Boolean retired, @Nullable Boolean deceased, @Nullable Long dateOfDeathTimestamp, @Nullable String nickname, @Nullable String weightClass, @Nullable String fightingStyle, @Nullable Double reach, @Nullable Long currentUniqueTournamentSinceTimestamp, @Nullable Long currentUniqueTournamentUntilTimestamp, boolean underage) {
        return new PlayerTeamInfo(id, residence, birthplace, height, weight, plays, turnedPro, prizeCurrentRaw, prizeTotalRaw, number, birthDateTimestamp, retired, deceased, dateOfDeathTimestamp, nickname, weightClass, fightingStyle, reach, currentUniqueTournamentSinceTimestamp, currentUniqueTournamentUntilTimestamp, underage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerTeamInfo)) {
            return false;
        }
        PlayerTeamInfo playerTeamInfo = (PlayerTeamInfo) other;
        return this.id == playerTeamInfo.id && Intrinsics.c(this.residence, playerTeamInfo.residence) && Intrinsics.c(this.birthplace, playerTeamInfo.birthplace) && Intrinsics.c(this.height, playerTeamInfo.height) && Intrinsics.c(this.weight, playerTeamInfo.weight) && Intrinsics.c(this.plays, playerTeamInfo.plays) && Intrinsics.c(this.turnedPro, playerTeamInfo.turnedPro) && Intrinsics.c(this.prizeCurrentRaw, playerTeamInfo.prizeCurrentRaw) && Intrinsics.c(this.prizeTotalRaw, playerTeamInfo.prizeTotalRaw) && Intrinsics.c(this.number, playerTeamInfo.number) && Intrinsics.c(this.birthDateTimestamp, playerTeamInfo.birthDateTimestamp) && Intrinsics.c(this.retired, playerTeamInfo.retired) && Intrinsics.c(this.deceased, playerTeamInfo.deceased) && Intrinsics.c(this.dateOfDeathTimestamp, playerTeamInfo.dateOfDeathTimestamp) && Intrinsics.c(this.nickname, playerTeamInfo.nickname) && Intrinsics.c(this.weightClass, playerTeamInfo.weightClass) && Intrinsics.c(this.fightingStyle, playerTeamInfo.fightingStyle) && Intrinsics.c(this.reach, playerTeamInfo.reach) && Intrinsics.c(this.currentUniqueTournamentSinceTimestamp, playerTeamInfo.currentUniqueTournamentSinceTimestamp) && Intrinsics.c(this.currentUniqueTournamentUntilTimestamp, playerTeamInfo.currentUniqueTournamentUntilTimestamp) && this.underage == playerTeamInfo.underage;
    }

    @Nullable
    public final Long getBirthDateTimestamp() {
        return this.birthDateTimestamp;
    }

    @Nullable
    public final String getBirthplace() {
        return this.birthplace;
    }

    @Nullable
    public final Long getCurrentUniqueTournamentSinceTimestamp() {
        return this.currentUniqueTournamentSinceTimestamp;
    }

    @Nullable
    public final Long getCurrentUniqueTournamentUntilTimestamp() {
        return this.currentUniqueTournamentUntilTimestamp;
    }

    @Nullable
    public final Long getDateOfDeathTimestamp() {
        return this.dateOfDeathTimestamp;
    }

    @Nullable
    public final Boolean getDeceased() {
        return this.deceased;
    }

    @Nullable
    public final String getFightingStyle() {
        return this.fightingStyle;
    }

    @Nullable
    public final Double getHeight() {
        return this.height;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final Integer getNumber() {
        return this.number;
    }

    @Nullable
    public final String getPlays() {
        return this.plays;
    }

    @Nullable
    public final Money getPrizeCurrentRaw() {
        return this.prizeCurrentRaw;
    }

    @Nullable
    public final Money getPrizeTotalRaw() {
        return this.prizeTotalRaw;
    }

    @Nullable
    public final Double getReach() {
        return this.reach;
    }

    @Nullable
    public final String getResidence() {
        return this.residence;
    }

    @Nullable
    public final Boolean getRetired() {
        return this.retired;
    }

    @Nullable
    public final String getTurnedPro() {
        return this.turnedPro;
    }

    public final boolean getUnderage() {
        return this.underage;
    }

    @Nullable
    public final Double getWeight() {
        return this.weight;
    }

    @Nullable
    public final String getWeightClass() {
        return this.weightClass;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.residence;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.birthplace;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.height;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.weight;
        int hashCode5 = (hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str3 = this.plays;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.turnedPro;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Money money = this.prizeCurrentRaw;
        int hashCode8 = (hashCode7 + (money == null ? 0 : money.hashCode())) * 31;
        Money money2 = this.prizeTotalRaw;
        int hashCode9 = (hashCode8 + (money2 == null ? 0 : money2.hashCode())) * 31;
        Integer num = this.number;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.birthDateTimestamp;
        int hashCode11 = (hashCode10 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.retired;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.deceased;
        int hashCode13 = (hashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l2 = this.dateOfDeathTimestamp;
        int hashCode14 = (hashCode13 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str5 = this.nickname;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.weightClass;
        int hashCode16 = (hashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fightingStyle;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d3 = this.reach;
        int hashCode18 = (hashCode17 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Long l3 = this.currentUniqueTournamentSinceTimestamp;
        int hashCode19 = (hashCode18 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.currentUniqueTournamentUntilTimestamp;
        return Boolean.hashCode(this.underage) + ((hashCode19 + (l4 != null ? l4.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.residence;
        String str2 = this.birthplace;
        Double d = this.height;
        Double d2 = this.weight;
        String str3 = this.plays;
        String str4 = this.turnedPro;
        Money money = this.prizeCurrentRaw;
        Money money2 = this.prizeTotalRaw;
        Integer num = this.number;
        Long l = this.birthDateTimestamp;
        Boolean bool = this.retired;
        Boolean bool2 = this.deceased;
        Long l2 = this.dateOfDeathTimestamp;
        String str5 = this.nickname;
        String str6 = this.weightClass;
        String str7 = this.fightingStyle;
        Double d3 = this.reach;
        Long l3 = this.currentUniqueTournamentSinceTimestamp;
        Long l4 = this.currentUniqueTournamentUntilTimestamp;
        boolean z = this.underage;
        StringBuilder t = dmi.t(i, "PlayerTeamInfo(id=", ", residence=", str, ", birthplace=");
        t.append(str2);
        t.append(", height=");
        t.append(d);
        t.append(", weight=");
        t.append(d2);
        t.append(", plays=");
        t.append(str3);
        t.append(", turnedPro=");
        t.append(str4);
        t.append(", prizeCurrentRaw=");
        t.append(money);
        t.append(", prizeTotalRaw=");
        t.append(money2);
        t.append(", number=");
        t.append(num);
        t.append(", birthDateTimestamp=");
        t.append(l);
        t.append(", retired=");
        t.append(bool);
        t.append(", deceased=");
        t.append(bool2);
        t.append(", dateOfDeathTimestamp=");
        t.append(l2);
        t.append(", nickname=");
        bf3.v(t, str5, ", weightClass=", str6, ", fightingStyle=");
        t.append(str7);
        t.append(", reach=");
        t.append(d3);
        t.append(", currentUniqueTournamentSinceTimestamp=");
        t.append(l3);
        t.append(", currentUniqueTournamentUntilTimestamp=");
        t.append(l4);
        t.append(", underage=");
        return wt3.p(t, z, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/PlayerTeamInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/PlayerTeamInfo;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerTeamInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PlayerTeamInfo(int i, @Nullable String str, @Nullable String str2, @Nullable Double d, @Nullable Double d2, @Nullable String str3, @Nullable String str4, @Nullable Money money, @Nullable Money money2, @Nullable Integer num, @Nullable Long l, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Long l2, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Double d3, @Nullable Long l3, @Nullable Long l4, boolean z) {
        this.id = i;
        this.residence = str;
        this.birthplace = str2;
        this.height = d;
        this.weight = d2;
        this.plays = str3;
        this.turnedPro = str4;
        this.prizeCurrentRaw = money;
        this.prizeTotalRaw = money2;
        this.number = num;
        this.birthDateTimestamp = l;
        this.retired = bool;
        this.deceased = bool2;
        this.dateOfDeathTimestamp = l2;
        this.nickname = str5;
        this.weightClass = str6;
        this.fightingStyle = str7;
        this.reach = d3;
        this.currentUniqueTournamentSinceTimestamp = l3;
        this.currentUniqueTournamentUntilTimestamp = l4;
        this.underage = z;
    }

    public /* synthetic */ PlayerTeamInfo(int i, String str, String str2, Double d, Double d2, String str3, String str4, Money money, Money money2, Integer num, Long l, Boolean bool, Boolean bool2, Long l2, String str5, String str6, String str7, Double d3, Long l3, Long l4, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, d, d2, str3, str4, money, money2, num, l, bool, bool2, l2, str5, str6, str7, d3, l3, l4, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? false : z);
    }
}

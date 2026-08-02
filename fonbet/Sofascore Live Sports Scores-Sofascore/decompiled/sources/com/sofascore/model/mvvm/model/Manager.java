package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.cuptree.CupTreeBlock;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.model.mvvm.IUrlSharing;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.ManagerPerformance;
import com.sofascore.model.newNetwork.ManagerPerformance$$serializer;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.joa;
import defpackage.lkb;
import defpackage.oea;
import defpackage.ogb;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.wx4;
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
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b*\b\u0087\b\u0018\u0000 x2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002yxB±\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 B×\u0001\b\u0010\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010\"\u001a\u00020\u001a\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b\u001f\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b+\u0010(J\u0012\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b,\u0010(J\u0010\u0010-\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b-\u0010(J\u0012\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b6\u00107J\u0018\u00108\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b<\u0010;J\u0012\u0010=\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b=\u0010(J\u0012\u0010>\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b>\u0010(J\u0010\u0010?\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\bA\u0010@J\u0012\u0010B\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bB\u0010CJØ\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bF\u0010*J\u001a\u0010I\u001a\u00020\u001a2\b\u0010H\u001a\u0004\u0018\u00010GHÖ\u0003¢\u0006\u0004\bI\u0010JJ'\u0010S\u001a\u00020P2\u0006\u0010K\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L2\u0006\u0010O\u001a\u00020NH\u0001¢\u0006\u0004\bQ\u0010RR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010T\u001a\u0004\bU\u0010*R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010V\u0012\u0004\bX\u0010Y\u001a\u0004\bW\u0010(R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010V\u0012\u0004\b[\u0010Y\u001a\u0004\bZ\u0010(R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010V\u001a\u0004\b\\\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010]\u001a\u0004\b^\u0010/R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010_\u001a\u0004\b`\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010a\u001a\u0004\bb\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010c\u001a\u0004\bd\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010e\u001a\u0004\bf\u00107R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010g\u001a\u0004\bh\u00109R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010i\u001a\u0004\bj\u0010;R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010i\u001a\u0004\bk\u0010;R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010V\u001a\u0004\bl\u0010(R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010V\u001a\u0004\bm\u0010(R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010n\u001a\u0004\bo\u0010@R\u0017\u0010\u001c\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010n\u001a\u0004\bp\u0010@R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010q\u001a\u0004\br\u0010CR\"\u0010\"\u001a\u00020\u001a8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\"\u0010n\u001a\u0004\b\"\u0010@\"\u0004\bs\u0010tR\u001a\u0010#\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010V\u001a\u0004\bu\u0010(R\u0016\u0010w\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010(¨\u0006z"}, d2 = {"Lcom/sofascore/model/mvvm/model/Manager;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/IRecent;", "Lcom/sofascore/model/mvvm/IUrlSharing;", "", "id", "", "name", "shortName", "slug", "Lcom/sofascore/model/mvvm/model/Sport;", SearchResponseKt.SPORT_ENTITY, "Lcom/sofascore/model/mvvm/model/Team;", "team", "Lcom/sofascore/model/mvvm/model/Country;", "country", "Lcom/sofascore/model/newNetwork/ManagerPerformance;", "performance", "formerPlayerId", "", "teams", "", "dateOfBirthTimestamp", "dateOfDeathTimestamp", "preferredFormation", "nationalityISO2", "", CupTreeBlock.BLOCK_RESULT_RETIRED, "deceased", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "fieldTranslations", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Sport;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Country;Lcom/sofascore/model/newNetwork/ManagerPerformance;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZZLcom/sofascore/model/mvvm/model/FieldTranslations;)V", "seen0", "isRecent", "webUrl", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Sport;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Country;Lcom/sofascore/model/newNetwork/ManagerPerformance;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZZLcom/sofascore/model/mvvm/model/FieldTranslations;ZLjava/lang/String;Lt5h;)V", "toString", "()Ljava/lang/String;", "component1", "()I", "component2", "component3", "component4", "component5", "()Lcom/sofascore/model/mvvm/model/Sport;", "component6", "()Lcom/sofascore/model/mvvm/model/Team;", "component7", "()Lcom/sofascore/model/mvvm/model/Country;", "component8", "()Lcom/sofascore/model/newNetwork/ManagerPerformance;", "component9", "()Ljava/lang/Integer;", "component10", "()Ljava/util/List;", "component11", "()Ljava/lang/Long;", "component12", "component13", "component14", "component15", "()Z", "component16", "component17", "()Lcom/sofascore/model/mvvm/model/FieldTranslations;", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Sport;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Country;Lcom/sofascore/model/newNetwork/ManagerPerformance;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZZLcom/sofascore/model/mvvm/model/FieldTranslations;)Lcom/sofascore/model/mvvm/model/Manager;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Manager;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "getShortName", "getShortName$annotations", "getSlug", "Lcom/sofascore/model/mvvm/model/Sport;", "getSport", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Lcom/sofascore/model/mvvm/model/Country;", "getCountry", "Lcom/sofascore/model/newNetwork/ManagerPerformance;", "getPerformance", "Ljava/lang/Integer;", "getFormerPlayerId", "Ljava/util/List;", "getTeams", "Ljava/lang/Long;", "getDateOfBirthTimestamp", "getDateOfDeathTimestamp", "getPreferredFormation", "getNationalityISO2", "Z", "getRetired", "getDeceased", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "getFieldTranslations", "setRecent", "(Z)V", "getWebUrl", "getSportSlug", "sportSlug", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Manager implements Serializable, IRecent, IUrlSharing {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Country country;

    @Nullable
    private final Long dateOfBirthTimestamp;

    @Nullable
    private final Long dateOfDeathTimestamp;
    private final boolean deceased;

    @Nullable
    private final FieldTranslations fieldTranslations;

    @Nullable
    private final Integer formerPlayerId;
    private final int id;
    private boolean isRecent;

    @NotNull
    private final String name;

    @Nullable
    private final String nationalityISO2;

    @Nullable
    private final ManagerPerformance performance;

    @Nullable
    private final String preferredFormation;
    private final boolean retired;

    @Nullable
    private final String shortName;

    @NotNull
    private final String slug;

    @Nullable
    private final Sport sport;

    @Nullable
    private final Team team;

    @Nullable
    private final List<Team> teams;

    @NotNull
    private final String webUrl;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, null, null, ypa.a(ysaVar, new ogb(17)), null, null, null, ypa.a(ysaVar, new ogb(18)), null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ Manager(int i, int i2, String str, String str2, String str3, Sport sport, Team team, Country country, ManagerPerformance managerPerformance, Integer num, List list, Long l, Long l2, String str4, String str5, boolean z, boolean z2, FieldTranslations fieldTranslations, boolean z3, String str6, t5h t5hVar) {
        if (81919 != (i & 81919)) {
            oea.z(i, 81919, Manager$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.name = str;
        this.shortName = str2;
        this.slug = str3;
        this.sport = sport;
        this.team = team;
        this.country = country;
        this.performance = managerPerformance;
        this.formerPlayerId = num;
        this.teams = list;
        this.dateOfBirthTimestamp = l;
        this.dateOfDeathTimestamp = l2;
        this.preferredFormation = str4;
        this.nationalityISO2 = str5;
        if ((i & 16384) == 0) {
            this.retired = false;
        } else {
            this.retired = z;
        }
        if ((32768 & i) == 0) {
            this.deceased = false;
        } else {
            this.deceased = z2;
        }
        this.fieldTranslations = fieldTranslations;
        if ((131072 & i) == 0) {
            this.isRecent = false;
        } else {
            this.isRecent = z3;
        }
        this.webUrl = (i & 262144) == 0 ? dmi.l(getId(), "/manager/", str3, "/") : str6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(Team.INSTANCE.serializer(), 0);
    }

    public static /* synthetic */ Manager copy$default(Manager manager, int i, String str, String str2, String str3, Sport sport, Team team, Country country, ManagerPerformance managerPerformance, Integer num, List list, Long l, Long l2, String str4, String str5, boolean z, boolean z2, FieldTranslations fieldTranslations, int i2, Object obj) {
        FieldTranslations fieldTranslations2;
        boolean z3;
        int i3;
        Manager manager2;
        boolean z4;
        String str6;
        String str7;
        String str8;
        Sport sport2;
        Team team2;
        Country country2;
        ManagerPerformance managerPerformance2;
        Integer num2;
        List list2;
        Long l3;
        Long l4;
        String str9;
        String str10;
        int i4 = (i2 & 1) != 0 ? manager.id : i;
        String str11 = (i2 & 2) != 0 ? manager.name : str;
        String str12 = (i2 & 4) != 0 ? manager.shortName : str2;
        String str13 = (i2 & 8) != 0 ? manager.slug : str3;
        Sport sport3 = (i2 & 16) != 0 ? manager.sport : sport;
        Team team3 = (i2 & 32) != 0 ? manager.team : team;
        Country country3 = (i2 & 64) != 0 ? manager.country : country;
        ManagerPerformance managerPerformance3 = (i2 & 128) != 0 ? manager.performance : managerPerformance;
        Integer num3 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? manager.formerPlayerId : num;
        List list3 = (i2 & 512) != 0 ? manager.teams : list;
        Long l5 = (i2 & 1024) != 0 ? manager.dateOfBirthTimestamp : l;
        Long l6 = (i2 & a.o) != 0 ? manager.dateOfDeathTimestamp : l2;
        String str14 = (i2 & 4096) != 0 ? manager.preferredFormation : str4;
        String str15 = (i2 & 8192) != 0 ? manager.nationalityISO2 : str5;
        int i5 = i4;
        boolean z5 = (i2 & 16384) != 0 ? manager.retired : z;
        boolean z6 = (i2 & 32768) != 0 ? manager.deceased : z2;
        if ((i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0) {
            z3 = z6;
            fieldTranslations2 = manager.fieldTranslations;
            z4 = z5;
            str6 = str11;
            str7 = str12;
            str8 = str13;
            sport2 = sport3;
            team2 = team3;
            country2 = country3;
            managerPerformance2 = managerPerformance3;
            num2 = num3;
            list2 = list3;
            l3 = l5;
            l4 = l6;
            str9 = str14;
            str10 = str15;
            i3 = i5;
            manager2 = manager;
        } else {
            fieldTranslations2 = fieldTranslations;
            z3 = z6;
            i3 = i5;
            manager2 = manager;
            z4 = z5;
            str6 = str11;
            str7 = str12;
            str8 = str13;
            sport2 = sport3;
            team2 = team3;
            country2 = country3;
            managerPerformance2 = managerPerformance3;
            num2 = num3;
            list2 = list3;
            l3 = l5;
            l4 = l6;
            str9 = str14;
            str10 = str15;
        }
        return manager2.copy(i3, str6, str7, str8, sport2, team2, country2, managerPerformance2, num2, list2, l3, l4, str9, str10, z4, z3, fieldTranslations2);
    }

    public static final /* synthetic */ void write$Self$model_release(Manager self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.getId(), serialDesc);
        output.y(serialDesc, 1, self.name);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 2, uhiVar, self.shortName);
        output.y(serialDesc, 3, self.slug);
        output.h(serialDesc, 4, Sport$$serializer.INSTANCE, self.sport);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.team);
        output.h(serialDesc, 6, Country$$serializer.INSTANCE, self.country);
        output.h(serialDesc, 7, ManagerPerformance$$serializer.INSTANCE, self.performance);
        output.h(serialDesc, 8, a7a.a, self.formerPlayerId);
        output.h(serialDesc, 9, (KSerializer) joaVarArr[9].getValue(), self.teams);
        lkb lkbVar = lkb.a;
        output.h(serialDesc, 10, lkbVar, self.dateOfBirthTimestamp);
        output.h(serialDesc, 11, lkbVar, self.dateOfDeathTimestamp);
        output.h(serialDesc, 12, uhiVar, self.preferredFormation);
        output.h(serialDesc, 13, uhiVar, self.nationalityISO2);
        if (output.o(serialDesc) || self.retired) {
            output.x(serialDesc, 14, self.retired);
        }
        if (output.o(serialDesc) || self.deceased) {
            output.x(serialDesc, 15, self.deceased);
        }
        output.h(serialDesc, 16, FieldTranslations$$serializer.INSTANCE, self.fieldTranslations);
        if (output.o(serialDesc) || self.getIsRecent()) {
            output.x(serialDesc, 17, self.getIsRecent());
        }
        if (!output.o(serialDesc)) {
            if (Intrinsics.c(self.getWebUrl(), "/manager/" + self.slug + "/" + self.getId())) {
                return;
            }
        }
        output.y(serialDesc, 18, self.getWebUrl());
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    public final List<Team> component10() {
        return this.teams;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Long getDateOfBirthTimestamp() {
        return this.dateOfBirthTimestamp;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Long getDateOfDeathTimestamp() {
        return this.dateOfDeathTimestamp;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getPreferredFormation() {
        return this.preferredFormation;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getNationalityISO2() {
        return this.nationalityISO2;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getRetired() {
        return this.retired;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getDeceased() {
        return this.deceased;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Sport getSport() {
        return this.sport;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Country getCountry() {
        return this.country;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final ManagerPerformance getPerformance() {
        return this.performance;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getFormerPlayerId() {
        return this.formerPlayerId;
    }

    @NotNull
    public final Manager copy(int id, @NotNull String name, @Nullable String shortName, @NotNull String slug, @Nullable Sport sport, @Nullable Team team, @Nullable Country country, @Nullable ManagerPerformance performance, @Nullable Integer formerPlayerId, @Nullable List<Team> teams, @Nullable Long dateOfBirthTimestamp, @Nullable Long dateOfDeathTimestamp, @Nullable String preferredFormation, @Nullable String nationalityISO2, boolean retired, boolean deceased, @Nullable FieldTranslations fieldTranslations) {
        name.getClass();
        slug.getClass();
        return new Manager(id, name, shortName, slug, sport, team, country, performance, formerPlayerId, teams, dateOfBirthTimestamp, dateOfDeathTimestamp, preferredFormation, nationalityISO2, retired, deceased, fieldTranslations);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Manager)) {
            return false;
        }
        Manager manager = (Manager) other;
        return this.id == manager.id && Intrinsics.c(this.name, manager.name) && Intrinsics.c(this.shortName, manager.shortName) && Intrinsics.c(this.slug, manager.slug) && Intrinsics.c(this.sport, manager.sport) && Intrinsics.c(this.team, manager.team) && Intrinsics.c(this.country, manager.country) && Intrinsics.c(this.performance, manager.performance) && Intrinsics.c(this.formerPlayerId, manager.formerPlayerId) && Intrinsics.c(this.teams, manager.teams) && Intrinsics.c(this.dateOfBirthTimestamp, manager.dateOfBirthTimestamp) && Intrinsics.c(this.dateOfDeathTimestamp, manager.dateOfDeathTimestamp) && Intrinsics.c(this.preferredFormation, manager.preferredFormation) && Intrinsics.c(this.nationalityISO2, manager.nationalityISO2) && this.retired == manager.retired && this.deceased == manager.deceased && Intrinsics.c(this.fieldTranslations, manager.fieldTranslations);
    }

    @Nullable
    public final Country getCountry() {
        return this.country;
    }

    @Nullable
    public final Long getDateOfBirthTimestamp() {
        return this.dateOfBirthTimestamp;
    }

    @Nullable
    public final Long getDateOfDeathTimestamp() {
        return this.dateOfDeathTimestamp;
    }

    public final boolean getDeceased() {
        return this.deceased;
    }

    @Nullable
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    @Nullable
    public final Integer getFormerPlayerId() {
        return this.formerPlayerId;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    public int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNationalityISO2() {
        return this.nationalityISO2;
    }

    @Nullable
    public final ManagerPerformance getPerformance() {
        return this.performance;
    }

    @Nullable
    public final String getPreferredFormation() {
        return this.preferredFormation;
    }

    public final boolean getRetired() {
        return this.retired;
    }

    @Nullable
    public final String getShortName() {
        return this.shortName;
    }

    @NotNull
    public final String getSlug() {
        return this.slug;
    }

    @Nullable
    public final Sport getSport() {
        return this.sport;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    @Nullable
    public String getSportSlug() {
        Sport sport = this.sport;
        if (sport != null) {
            return sport.getSlug();
        }
        return null;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    public final List<Team> getTeams() {
        return this.teams;
    }

    @Override // com.sofascore.model.mvvm.IUrlSharing
    @NotNull
    public String getWebUrl() {
        return this.webUrl;
    }

    public int hashCode() {
        int c = dmi.c(Integer.hashCode(this.id) * 31, 31, this.name);
        String str = this.shortName;
        int c2 = dmi.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.slug);
        Sport sport = this.sport;
        int hashCode = (c2 + (sport == null ? 0 : sport.hashCode())) * 31;
        Team team = this.team;
        int hashCode2 = (hashCode + (team == null ? 0 : team.hashCode())) * 31;
        Country country = this.country;
        int hashCode3 = (hashCode2 + (country == null ? 0 : country.hashCode())) * 31;
        ManagerPerformance managerPerformance = this.performance;
        int hashCode4 = (hashCode3 + (managerPerformance == null ? 0 : managerPerformance.hashCode())) * 31;
        Integer num = this.formerPlayerId;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<Team> list = this.teams;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.dateOfBirthTimestamp;
        int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.dateOfDeathTimestamp;
        int hashCode8 = (hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.preferredFormation;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nationalityISO2;
        int e = dmi.e(dmi.e((hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.retired), 31, this.deceased);
        FieldTranslations fieldTranslations = this.fieldTranslations;
        return e + (fieldTranslations != null ? fieldTranslations.hashCode() : 0);
    }

    @Override // com.sofascore.model.mvvm.IRecent
    /* renamed from: isRecent, reason: from getter */
    public boolean getIsRecent() {
        return this.isRecent;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    public void setRecent(boolean z) {
        this.isRecent = z;
    }

    @NotNull
    public String toString() {
        return this.name;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Manager$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Manager;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Manager$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @wx4
    public static /* synthetic */ void getName$annotations() {
    }

    @wx4
    public static /* synthetic */ void getShortName$annotations() {
    }

    public Manager(int i, @NotNull String str, @Nullable String str2, @NotNull String str3, @Nullable Sport sport, @Nullable Team team, @Nullable Country country, @Nullable ManagerPerformance managerPerformance, @Nullable Integer num, @Nullable List<Team> list, @Nullable Long l, @Nullable Long l2, @Nullable String str4, @Nullable String str5, boolean z, boolean z2, @Nullable FieldTranslations fieldTranslations) {
        str.getClass();
        str3.getClass();
        this.id = i;
        this.name = str;
        this.shortName = str2;
        this.slug = str3;
        this.sport = sport;
        this.team = team;
        this.country = country;
        this.performance = managerPerformance;
        this.formerPlayerId = num;
        this.teams = list;
        this.dateOfBirthTimestamp = l;
        this.dateOfDeathTimestamp = l2;
        this.preferredFormation = str4;
        this.nationalityISO2 = str5;
        this.retired = z;
        this.deceased = z2;
        this.fieldTranslations = fieldTranslations;
        this.webUrl = dmi.l(getId(), "/manager/", str3, "/");
    }

    public /* synthetic */ Manager(int i, String str, String str2, String str3, Sport sport, Team team, Country country, ManagerPerformance managerPerformance, Integer num, List list, Long l, Long l2, String str4, String str5, boolean z, boolean z2, FieldTranslations fieldTranslations, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, sport, team, country, managerPerformance, num, list, l, l2, str4, str5, (i2 & 16384) != 0 ? false : z, (i2 & 32768) != 0 ? false : z2, fieldTranslations);
    }
}

package com.sofascore.model.mvvm.model;

import com.ironsource.C4227o2;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.IUrlSharing;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import com.sofascore.model.util.ChatInterface;
import defpackage.a7a;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.gz1;
import defpackage.lkb;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.wx4;
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
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b3\b\u0087\b\u0018\u0000 ~2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u007f~B\u009f\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001e\u0010\u001fB5\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001e\u0010 BÍ\u0001\b\u0010\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b\u001e\u0010&J\u001a\u0010)\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b-\u0010,J\u0010\u0010.\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b0\u0010/J\u0010\u00101\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b5\u0010/J\u0012\u00106\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b<\u0010/J\u0012\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b=\u0010/J\u0012\u0010>\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b@\u0010?J\u0012\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bA\u0010/J\u0012\u0010B\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bD\u00109JÈ\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\bG\u0010/J'\u0010P\u001a\u00020M2\u0006\u0010H\u001a\u00020\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020KH\u0001¢\u0006\u0004\bN\u0010OR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010Q\u001a\u0004\bR\u0010,R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010S\u0012\u0004\bU\u0010V\u001a\u0004\bT\u0010/R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010S\u001a\u0004\bW\u0010/R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010X\u001a\u0004\bY\u00102R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010Z\u001a\u0004\b[\u00104R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010S\u001a\u0004\b\\\u0010/R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010]\u001a\u0004\b^\u00107\"\u0004\b_\u0010`R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010a\u001a\u0004\b\u0012\u00109R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010b\u001a\u0004\bc\u0010;R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010S\u001a\u0004\bd\u0010/R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010S\u001a\u0004\be\u0010/R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010f\u001a\u0004\bg\u0010?R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010f\u001a\u0004\bh\u0010?R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010S\u001a\u0004\bi\u0010/R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010j\u001a\u0004\bk\u0010CR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010a\u001a\u0004\bl\u00109R$\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001a\u0010#\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010S\u001a\u0004\br\u0010/R\u0011\u0010t\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bs\u0010/R\u0014\u0010v\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010,R\u0014\u0010y\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0014\u0010{\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010/R\u0014\u0010}\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010/¨\u0006\u0080\u0001"}, d2 = {"Lcom/sofascore/model/mvvm/model/Tournament;", "Ljava/io/Serializable;", "Lcom/sofascore/model/util/ChatInterface;", "Lcom/sofascore/model/mvvm/IUrlSharing;", "Lcom/sofascore/model/mvvm/model/IShareContent;", "", "id", "", "name", "slug", "Lcom/sofascore/model/mvvm/model/Category;", "category", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", SearchResponseKt.LEAGUE_ENTITY, "roundPrefix", "Lcom/sofascore/model/mvvm/model/Season;", TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, "", "isLive", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "fieldTranslations", "location", "groupName", "", "startTimestamp", "endTimestamp", "groupSign", "Lcom/sofascore/model/mvvm/model/TournamentType;", "competitionType", "qualificationOrPreliminary", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Category;Lcom/sofascore/model/mvvm/model/UniqueTournament;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Season;Ljava/lang/Boolean;Lcom/sofascore/model/mvvm/model/FieldTranslations;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/TournamentType;Ljava/lang/Boolean;)V", "(ILjava/lang/String;Lcom/sofascore/model/mvvm/model/Category;Lcom/sofascore/model/mvvm/model/UniqueTournament;Lcom/sofascore/model/mvvm/model/FieldTranslations;)V", "seen0", C4227o2.u, "webUrl", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Category;Lcom/sofascore/model/mvvm/model/UniqueTournament;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Season;Ljava/lang/Boolean;Lcom/sofascore/model/mvvm/model/FieldTranslations;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/TournamentType;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lt5h;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/sofascore/model/mvvm/model/Category;", "component5", "()Lcom/sofascore/model/mvvm/model/UniqueTournament;", "component6", "component7", "()Lcom/sofascore/model/mvvm/model/Season;", "component8", "()Ljava/lang/Boolean;", "component9", "()Lcom/sofascore/model/mvvm/model/FieldTranslations;", "component10", "component11", "component12", "()Ljava/lang/Long;", "component13", "component14", "component15", "()Lcom/sofascore/model/mvvm/model/TournamentType;", "component16", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Category;Lcom/sofascore/model/mvvm/model/UniqueTournament;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Season;Ljava/lang/Boolean;Lcom/sofascore/model/mvvm/model/FieldTranslations;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/TournamentType;Ljava/lang/Boolean;)Lcom/sofascore/model/mvvm/model/Tournament;", "toString", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Tournament;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "getSlug", "Lcom/sofascore/model/mvvm/model/Category;", "getCategory", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "getUniqueTournament", "getRoundPrefix", "Lcom/sofascore/model/mvvm/model/Season;", "getSeason", "setSeason", "(Lcom/sofascore/model/mvvm/model/Season;)V", "Ljava/lang/Boolean;", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "getFieldTranslations", "getLocation", "getGroupName", "Ljava/lang/Long;", "getStartTimestamp", "getEndTimestamp", "getGroupSign", "Lcom/sofascore/model/mvvm/model/TournamentType;", "getCompetitionType", "getQualificationOrPreliminary", "Ljava/lang/Integer;", "getOrder", "()Ljava/lang/Integer;", "setOrder", "(Ljava/lang/Integer;)V", "getWebUrl", "getSportSlug", "sportSlug", "getChatId", "chatId", "getTimestamp", "()J", "timestamp", "getStatusType", "statusType", "getChannelName", "channelName", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Tournament implements Serializable, ChatInterface, IUrlSharing, IShareContent {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Category category;

    @Nullable
    private final TournamentType competitionType;

    @Nullable
    private final Long endTimestamp;

    @Nullable
    private final FieldTranslations fieldTranslations;

    @Nullable
    private final String groupName;

    @Nullable
    private final String groupSign;
    private final int id;

    @Nullable
    private final Boolean isLive;

    @Nullable
    private final String location;

    @NotNull
    private final String name;

    @Nullable
    private Integer order;

    @Nullable
    private final Boolean qualificationOrPreliminary;

    @Nullable
    private final String roundPrefix;

    @Nullable
    private Season season;

    @NotNull
    private final String slug;

    @Nullable
    private final Long startTimestamp;

    @Nullable
    private final UniqueTournament uniqueTournament;

    @NotNull
    private final String webUrl;

    public /* synthetic */ Tournament(int i, int i2, String str, String str2, Category category, UniqueTournament uniqueTournament, String str3, Season season, Boolean bool, FieldTranslations fieldTranslations, String str4, String str5, Long l, Long l2, String str6, TournamentType tournamentType, Boolean bool2, Integer num, String str7, t5h t5hVar) {
        String h;
        if (65535 != (i & 65535)) {
            oea.z(i, 65535, Tournament$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.name = str;
        this.slug = str2;
        this.category = category;
        this.uniqueTournament = uniqueTournament;
        this.roundPrefix = str3;
        this.season = season;
        this.isLive = bool;
        this.fieldTranslations = fieldTranslations;
        this.location = str4;
        this.groupName = str5;
        this.startTimestamp = l;
        this.endTimestamp = l2;
        this.groupSign = str6;
        this.competitionType = tournamentType;
        this.qualificationOrPreliminary = bool2;
        if ((65536 & i) == 0) {
            this.order = null;
        } else {
            this.order = num;
        }
        if ((i & 131072) != 0) {
            this.webUrl = str7;
            return;
        }
        if (Intrinsics.c(getSportSlug(), Sports.MMA)) {
            StringBuilder s = mz1.s("/mma/", uniqueTournament != null ? uniqueTournament.getSlug() : null, "/fight-night/", str2, "/");
            s.append(i2);
            h = s.toString();
        } else {
            h = bf3.h(i2, str2, "/", mz1.s("/tournament/", getSportSlug(), "/", category.getSlug(), "/"));
        }
        this.webUrl = h;
    }

    public static final /* synthetic */ void write$Self$model_release(Tournament self, wf3 output, SerialDescriptor serialDesc) {
        String h;
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.name);
        output.y(serialDesc, 2, self.slug);
        output.f(serialDesc, 3, Category$$serializer.INSTANCE, self.category);
        output.h(serialDesc, 4, UniqueTournament$$serializer.INSTANCE, self.uniqueTournament);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 5, uhiVar, self.roundPrefix);
        output.h(serialDesc, 6, Season$$serializer.INSTANCE, self.season);
        gz1 gz1Var = gz1.a;
        output.h(serialDesc, 7, gz1Var, self.isLive);
        output.h(serialDesc, 8, FieldTranslations$$serializer.INSTANCE, self.fieldTranslations);
        output.h(serialDesc, 9, uhiVar, self.location);
        output.h(serialDesc, 10, uhiVar, self.groupName);
        lkb lkbVar = lkb.a;
        output.h(serialDesc, 11, lkbVar, self.startTimestamp);
        output.h(serialDesc, 12, lkbVar, self.endTimestamp);
        output.h(serialDesc, 13, uhiVar, self.groupSign);
        output.h(serialDesc, 14, TournamentTypeSerializer.INSTANCE, self.competitionType);
        output.h(serialDesc, 15, gz1Var, self.qualificationOrPreliminary);
        if (output.o(serialDesc) || self.order != null) {
            output.h(serialDesc, 16, a7a.a, self.order);
        }
        if (!output.o(serialDesc)) {
            String webUrl = self.getWebUrl();
            if (Intrinsics.c(self.getSportSlug(), Sports.MMA)) {
                UniqueTournament uniqueTournament = self.uniqueTournament;
                String slug = uniqueTournament != null ? uniqueTournament.getSlug() : null;
                String str = self.slug;
                int i = self.id;
                StringBuilder s = mz1.s("/mma/", slug, "/fight-night/", str, "/");
                s.append(i);
                h = s.toString();
            } else {
                h = bf3.h(self.id, self.slug, "/", mz1.s("/tournament/", self.getSportSlug(), "/", self.category.getSlug(), "/"));
            }
            if (Intrinsics.c(webUrl, h)) {
                return;
            }
        }
        output.y(serialDesc, 17, self.getWebUrl());
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Long getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Long getEndTimestamp() {
        return this.endTimestamp;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getGroupSign() {
        return this.groupSign;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final TournamentType getCompetitionType() {
        return this.competitionType;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Boolean getQualificationOrPreliminary() {
        return this.qualificationOrPreliminary;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Category getCategory() {
        return this.category;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getRoundPrefix() {
        return this.roundPrefix;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Season getSeason() {
        return this.season;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Boolean getIsLive() {
        return this.isLive;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    @NotNull
    public final Tournament copy(int id, @NotNull String name, @NotNull String slug, @NotNull Category category, @Nullable UniqueTournament uniqueTournament, @Nullable String roundPrefix, @Nullable Season season, @Nullable Boolean isLive, @Nullable FieldTranslations fieldTranslations, @Nullable String location, @Nullable String groupName, @Nullable Long startTimestamp, @Nullable Long endTimestamp, @Nullable String groupSign, @Nullable TournamentType competitionType, @Nullable Boolean qualificationOrPreliminary) {
        name.getClass();
        slug.getClass();
        category.getClass();
        return new Tournament(id, name, slug, category, uniqueTournament, roundPrefix, season, isLive, fieldTranslations, location, groupName, startTimestamp, endTimestamp, groupSign, competitionType, qualificationOrPreliminary);
    }

    public boolean equals(@Nullable Object other) {
        int i;
        if (this == other) {
            return true;
        }
        if (other != null && getClass().equals(other.getClass())) {
            Tournament tournament = (Tournament) other;
            int i2 = this.id;
            if (i2 == 0 || (i = tournament.id) == 0 || i2 != i) {
                if (i2 == 0 || tournament.id == 0) {
                    UniqueTournament uniqueTournament = this.uniqueTournament;
                    Integer valueOf = uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null;
                    UniqueTournament uniqueTournament2 = tournament.uniqueTournament;
                    if (Intrinsics.c(valueOf, uniqueTournament2 != null ? Integer.valueOf(uniqueTournament2.getId()) : null)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @NotNull
    public final Category getCategory() {
        return this.category;
    }

    @Override // com.sofascore.model.util.ChatInterface
    @NotNull
    public String getChannelName() {
        return "tournament";
    }

    @Override // com.sofascore.model.util.ChatInterface
    public int getChatId() {
        return this.id;
    }

    @Nullable
    public final TournamentType getCompetitionType() {
        return this.competitionType;
    }

    @Nullable
    public final Long getEndTimestamp() {
        return this.endTimestamp;
    }

    @Nullable
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    @Nullable
    public final String getGroupName() {
        return this.groupName;
    }

    @Nullable
    public final String getGroupSign() {
        return this.groupSign;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getLocation() {
        return this.location;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getOrder() {
        return this.order;
    }

    @Nullable
    public final Boolean getQualificationOrPreliminary() {
        return this.qualificationOrPreliminary;
    }

    @Nullable
    public final String getRoundPrefix() {
        return this.roundPrefix;
    }

    @Nullable
    public final Season getSeason() {
        return this.season;
    }

    @NotNull
    public final String getSlug() {
        return this.slug;
    }

    @NotNull
    public final String getSportSlug() {
        return this.category.getSport().getSlug();
    }

    @Nullable
    public final Long getStartTimestamp() {
        return this.startTimestamp;
    }

    @Override // com.sofascore.model.util.ChatInterface
    @NotNull
    public String getStatusType() {
        return "";
    }

    @Override // com.sofascore.model.util.ChatInterface
    public long getTimestamp() {
        return 0L;
    }

    @Nullable
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    @Override // com.sofascore.model.mvvm.IUrlSharing
    @NotNull
    public String getWebUrl() {
        return this.webUrl;
    }

    public int hashCode() {
        return this.id;
    }

    @Nullable
    public final Boolean isLive() {
        return this.isLive;
    }

    public final void setOrder(@Nullable Integer num) {
        this.order = num;
    }

    public final void setSeason(@Nullable Season season) {
        this.season = season;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.name;
        String str2 = this.slug;
        Category category = this.category;
        UniqueTournament uniqueTournament = this.uniqueTournament;
        String str3 = this.roundPrefix;
        Season season = this.season;
        Boolean bool = this.isLive;
        FieldTranslations fieldTranslations = this.fieldTranslations;
        String str4 = this.location;
        String str5 = this.groupName;
        Long l = this.startTimestamp;
        Long l2 = this.endTimestamp;
        String str6 = this.groupSign;
        TournamentType tournamentType = this.competitionType;
        Boolean bool2 = this.qualificationOrPreliminary;
        StringBuilder t = dmi.t(i, "Tournament(id=", ", name=", str, ", slug=");
        t.append(str2);
        t.append(", category=");
        t.append(category);
        t.append(", uniqueTournament=");
        t.append(uniqueTournament);
        t.append(", roundPrefix=");
        t.append(str3);
        t.append(", season=");
        t.append(season);
        t.append(", isLive=");
        t.append(bool);
        t.append(", fieldTranslations=");
        t.append(fieldTranslations);
        t.append(", location=");
        t.append(str4);
        t.append(", groupName=");
        t.append(str5);
        t.append(", startTimestamp=");
        t.append(l);
        t.append(", endTimestamp=");
        t.append(l2);
        t.append(", groupSign=");
        t.append(str6);
        t.append(", competitionType=");
        t.append(tournamentType);
        t.append(", qualificationOrPreliminary=");
        t.append(bool2);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Tournament$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Tournament;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Tournament$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @wx4
    public static /* synthetic */ void getName$annotations() {
    }

    public Tournament(int i, @NotNull String str, @NotNull String str2, @NotNull Category category, @Nullable UniqueTournament uniqueTournament, @Nullable String str3, @Nullable Season season, @Nullable Boolean bool, @Nullable FieldTranslations fieldTranslations, @Nullable String str4, @Nullable String str5, @Nullable Long l, @Nullable Long l2, @Nullable String str6, @Nullable TournamentType tournamentType, @Nullable Boolean bool2) {
        String h;
        str.getClass();
        str2.getClass();
        category.getClass();
        this.id = i;
        this.name = str;
        this.slug = str2;
        this.category = category;
        this.uniqueTournament = uniqueTournament;
        this.roundPrefix = str3;
        this.season = season;
        this.isLive = bool;
        this.fieldTranslations = fieldTranslations;
        this.location = str4;
        this.groupName = str5;
        this.startTimestamp = l;
        this.endTimestamp = l2;
        this.groupSign = str6;
        this.competitionType = tournamentType;
        this.qualificationOrPreliminary = bool2;
        if (Intrinsics.c(getSportSlug(), Sports.MMA)) {
            StringBuilder s = mz1.s("/mma/", uniqueTournament != null ? uniqueTournament.getSlug() : null, "/fight-night/", str2, "/");
            s.append(i);
            h = s.toString();
        } else {
            h = bf3.h(i, str2, "/", mz1.s("/tournament/", getSportSlug(), "/", category.getSlug(), "/"));
        }
        this.webUrl = h;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Tournament(int i, @NotNull String str, @NotNull Category category, @Nullable UniqueTournament uniqueTournament, @Nullable FieldTranslations fieldTranslations) {
        this(i, str, "", category, uniqueTournament, null, null, null, fieldTranslations, null, null, null, null, null, null, null);
        str.getClass();
        category.getClass();
    }
}

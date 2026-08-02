package com.sofascore.model.mvvm.model;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import defpackage.a7a;
import defpackage.gz1;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.uzj;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b8\b\u0017\u0018\u0000 n2\u00020\u0001:\u0002onB\u0087\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010%\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b&\u0010'B¥\u0002\b\u0016\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0015\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0015\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0015\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010%\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J\u001a\u0010-\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0002H\u0016¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u000b¢\u0006\u0004\b1\u00102J'\u00109\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0007¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u00100R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010=\u0012\u0004\b@\u0010A\u001a\u0004\b>\u0010?R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\bB\u0010?R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010K\u001a\u0004\bL\u00102R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bM\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\bN\u0010?R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bP\u0010QR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010=\u001a\u0004\bR\u0010?R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010V\u001a\u0004\bW\u0010XR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010Y\u001a\u0004\bZ\u0010[R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010V\u001a\u0004\b\\\u0010XR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010V\u001a\u0004\b]\u0010XR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010V\u001a\u0004\b^\u0010XR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00158\u0006¢\u0006\f\n\u0004\b\u001b\u0010Y\u001a\u0004\b_\u0010[R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00158\u0006¢\u0006\f\n\u0004\b\u001c\u0010Y\u001a\u0004\b`\u0010[R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00158\u0006¢\u0006\f\n\u0004\b\u001d\u0010Y\u001a\u0004\ba\u0010[R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010V\u001a\u0004\bb\u0010XR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010=\u001a\u0004\bc\u0010?R\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010d\u001a\u0004\be\u0010fR\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010g\u001a\u0004\bh\u0010iR\u0019\u0010$\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010j\u001a\u0004\bk\u0010lR\u0019\u0010%\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010j\u001a\u0004\bm\u0010l¨\u0006p"}, d2 = {"Lcom/sofascore/model/mvvm/model/UniqueTournamentDetails;", "", "", "id", "", "name", "slug", "Lcom/sofascore/model/mvvm/model/Category;", "category", "", "userCount", "", "hasEventPlayerStatistics", "displayInverseHomeAwayTeams", "groundType", "Lcom/sofascore/model/mvvm/model/Country;", "country", "owner", "Lcom/sofascore/model/mvvm/model/Team;", "titleHolder", "titleHolderTitles", "", "mostTitlesTeams", "mostTitles", "startDateTimestamp", "endDateTimestamp", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "linkedUniqueTournaments", "upperDivisions", "lowerDivisions", "numberOfSets", "competitionType", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "fieldTranslations", "Lcom/sofascore/model/mvvm/model/Gender;", InneractiveMediationDefs.KEY_GENDER, "showBanner", "playerOfTheTournament", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Category;JZZLjava/lang/String;Lcom/sofascore/model/mvvm/model/Country;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/FieldTranslations;Lcom/sofascore/model/mvvm/model/Gender;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Category;JZZLjava/lang/String;Lcom/sofascore/model/mvvm/model/Country;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/FieldTranslations;Lcom/sofascore/model/mvvm/model/Gender;Ljava/lang/Boolean;Ljava/lang/Boolean;Lt5h;)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "shouldReverseTeams", "()Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/sofascore/model/mvvm/model/UniqueTournamentDetails;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "I", "getId", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getName$annotations", "()V", "getSlug", "Lcom/sofascore/model/mvvm/model/Category;", "getCategory", "()Lcom/sofascore/model/mvvm/model/Category;", "setCategory", "(Lcom/sofascore/model/mvvm/model/Category;)V", "J", "getUserCount", "()J", "Z", "getHasEventPlayerStatistics", "getDisplayInverseHomeAwayTeams", "getGroundType", "Lcom/sofascore/model/mvvm/model/Country;", "getCountry", "()Lcom/sofascore/model/mvvm/model/Country;", "getOwner", "Lcom/sofascore/model/mvvm/model/Team;", "getTitleHolder", "()Lcom/sofascore/model/mvvm/model/Team;", "Ljava/lang/Integer;", "getTitleHolderTitles", "()Ljava/lang/Integer;", "Ljava/util/List;", "getMostTitlesTeams", "()Ljava/util/List;", "getMostTitles", "getStartDateTimestamp", "getEndDateTimestamp", "getLinkedUniqueTournaments", "getUpperDivisions", "getLowerDivisions", "getNumberOfSets", "getCompetitionType", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "getFieldTranslations", "()Lcom/sofascore/model/mvvm/model/FieldTranslations;", "Lcom/sofascore/model/mvvm/model/Gender;", "getGender", "()Lcom/sofascore/model/mvvm/model/Gender;", "Ljava/lang/Boolean;", "getShowBanner", "()Ljava/lang/Boolean;", "getPlayerOfTheTournament", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public class UniqueTournamentDetails {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private Category category;

    @Nullable
    private final String competitionType;

    @Nullable
    private final Country country;
    private final boolean displayInverseHomeAwayTeams;

    @Nullable
    private final Integer endDateTimestamp;

    @Nullable
    private final FieldTranslations fieldTranslations;

    @Nullable
    private final Gender gender;

    @Nullable
    private final String groundType;
    private final boolean hasEventPlayerStatistics;
    private final int id;

    @NotNull
    private final List<UniqueTournament> linkedUniqueTournaments;

    @NotNull
    private final List<UniqueTournament> lowerDivisions;

    @Nullable
    private final Integer mostTitles;

    @NotNull
    private final List<Team> mostTitlesTeams;

    @NotNull
    private final String name;

    @Nullable
    private final Integer numberOfSets;

    @Nullable
    private final String owner;

    @Nullable
    private final Boolean playerOfTheTournament;

    @Nullable
    private final Boolean showBanner;

    @NotNull
    private final String slug;

    @Nullable
    private final Integer startDateTimestamp;

    @Nullable
    private final Team titleHolder;

    @Nullable
    private final Integer titleHolderTitles;

    @NotNull
    private final List<UniqueTournament> upperDivisions;
    private final long userCount;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new uzj(21)), null, ypa.a(ysaVar, new uzj(22)), null, null, null, ypa.a(ysaVar, new uzj(23)), ypa.a(ysaVar, new uzj(24)), ypa.a(ysaVar, new uzj(25)), null, null, null, null, null, null};
    }

    public /* synthetic */ UniqueTournamentDetails(int i, int i2, String str, String str2, Category category, long j, boolean z, boolean z2, String str3, Country country, String str4, Team team, Integer num, List list, Integer num2, Integer num3, Integer num4, List list2, List list3, List list4, Integer num5, String str5, FieldTranslations fieldTranslations, Gender gender, Boolean bool, Boolean bool2, t5h t5hVar) {
        if (33554383 != (i & 33554383)) {
            oea.z(i, 33554383, UniqueTournamentDetails$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.name = str;
        this.slug = str2;
        this.category = category;
        if ((i & 16) == 0) {
            this.userCount = 0L;
        } else {
            this.userCount = j;
        }
        if ((i & 32) == 0) {
            this.hasEventPlayerStatistics = false;
        } else {
            this.hasEventPlayerStatistics = z;
        }
        this.displayInverseHomeAwayTeams = z2;
        this.groundType = str3;
        this.country = country;
        this.owner = str4;
        this.titleHolder = team;
        this.titleHolderTitles = num;
        this.mostTitlesTeams = list;
        this.mostTitles = num2;
        this.startDateTimestamp = num3;
        this.endDateTimestamp = num4;
        this.linkedUniqueTournaments = list2;
        this.upperDivisions = list3;
        this.lowerDivisions = list4;
        this.numberOfSets = num5;
        this.competitionType = str5;
        this.fieldTranslations = fieldTranslations;
        this.gender = gender;
        this.showBanner = bool;
        this.playerOfTheTournament = bool2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(Team.INSTANCE.serializer(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(UniqueTournament$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(UniqueTournament$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(UniqueTournament$$serializer.INSTANCE, 0);
    }

    public static final /* synthetic */ void write$Self(UniqueTournamentDetails self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.name);
        output.y(serialDesc, 2, self.slug);
        output.f(serialDesc, 3, Category$$serializer.INSTANCE, self.category);
        if (output.o(serialDesc) || self.userCount != 0) {
            output.E(serialDesc, 4, self.userCount);
        }
        if (output.o(serialDesc) || self.hasEventPlayerStatistics) {
            output.x(serialDesc, 5, self.hasEventPlayerStatistics);
        }
        output.x(serialDesc, 6, self.displayInverseHomeAwayTeams);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 7, uhiVar, self.groundType);
        output.h(serialDesc, 8, Country$$serializer.INSTANCE, self.country);
        output.h(serialDesc, 9, uhiVar, self.owner);
        output.h(serialDesc, 10, (KSerializer) joaVarArr[10].getValue(), self.titleHolder);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 11, a7aVar, self.titleHolderTitles);
        output.f(serialDesc, 12, (KSerializer) joaVarArr[12].getValue(), self.mostTitlesTeams);
        output.h(serialDesc, 13, a7aVar, self.mostTitles);
        output.h(serialDesc, 14, a7aVar, self.startDateTimestamp);
        output.h(serialDesc, 15, a7aVar, self.endDateTimestamp);
        output.f(serialDesc, 16, (KSerializer) joaVarArr[16].getValue(), self.linkedUniqueTournaments);
        output.f(serialDesc, 17, (KSerializer) joaVarArr[17].getValue(), self.upperDivisions);
        output.f(serialDesc, 18, (KSerializer) joaVarArr[18].getValue(), self.lowerDivisions);
        output.h(serialDesc, 19, a7aVar, self.numberOfSets);
        output.h(serialDesc, 20, uhiVar, self.competitionType);
        output.h(serialDesc, 21, FieldTranslations$$serializer.INSTANCE, self.fieldTranslations);
        output.h(serialDesc, 22, GenderSerializer.INSTANCE, self.gender);
        gz1 gz1Var = gz1.a;
        output.h(serialDesc, 23, gz1Var, self.showBanner);
        output.h(serialDesc, 24, gz1Var, self.playerOfTheTournament);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UniqueTournament) && this.id == ((UniqueTournament) other).getId();
    }

    @NotNull
    public final Category getCategory() {
        return this.category;
    }

    @Nullable
    public final String getCompetitionType() {
        return this.competitionType;
    }

    @Nullable
    public final Country getCountry() {
        return this.country;
    }

    public final boolean getDisplayInverseHomeAwayTeams() {
        return this.displayInverseHomeAwayTeams;
    }

    @Nullable
    public final Integer getEndDateTimestamp() {
        return this.endDateTimestamp;
    }

    @Nullable
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    @Nullable
    public final Gender getGender() {
        return this.gender;
    }

    @Nullable
    public final String getGroundType() {
        return this.groundType;
    }

    public final boolean getHasEventPlayerStatistics() {
        return this.hasEventPlayerStatistics;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final List<UniqueTournament> getLinkedUniqueTournaments() {
        return this.linkedUniqueTournaments;
    }

    @NotNull
    public final List<UniqueTournament> getLowerDivisions() {
        return this.lowerDivisions;
    }

    @Nullable
    public final Integer getMostTitles() {
        return this.mostTitles;
    }

    @NotNull
    public final List<Team> getMostTitlesTeams() {
        return this.mostTitlesTeams;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getNumberOfSets() {
        return this.numberOfSets;
    }

    @Nullable
    public final String getOwner() {
        return this.owner;
    }

    @Nullable
    public final Boolean getPlayerOfTheTournament() {
        return this.playerOfTheTournament;
    }

    @Nullable
    public final Boolean getShowBanner() {
        return this.showBanner;
    }

    @NotNull
    public final String getSlug() {
        return this.slug;
    }

    @Nullable
    public final Integer getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    @Nullable
    public final Team getTitleHolder() {
        return this.titleHolder;
    }

    @Nullable
    public final Integer getTitleHolderTitles() {
        return this.titleHolderTitles;
    }

    @NotNull
    public final List<UniqueTournament> getUpperDivisions() {
        return this.upperDivisions;
    }

    public final long getUserCount() {
        return this.userCount;
    }

    public int hashCode() {
        return this.id;
    }

    public final void setCategory(@NotNull Category category) {
        category.getClass();
        this.category = category;
    }

    public final boolean shouldReverseTeams() {
        return this.displayInverseHomeAwayTeams;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/UniqueTournamentDetails$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/UniqueTournamentDetails;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UniqueTournamentDetails$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @wx4
    public static /* synthetic */ void getName$annotations() {
    }

    public UniqueTournamentDetails(int i, @NotNull String str, @NotNull String str2, @NotNull Category category, long j, boolean z, boolean z2, @Nullable String str3, @Nullable Country country, @Nullable String str4, @Nullable Team team, @Nullable Integer num, @NotNull List<Team> list, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @NotNull List<UniqueTournament> list2, @NotNull List<UniqueTournament> list3, @NotNull List<UniqueTournament> list4, @Nullable Integer num5, @Nullable String str5, @Nullable FieldTranslations fieldTranslations, @Nullable Gender gender, @Nullable Boolean bool, @Nullable Boolean bool2) {
        str.getClass();
        str2.getClass();
        category.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.id = i;
        this.name = str;
        this.slug = str2;
        this.category = category;
        this.userCount = j;
        this.hasEventPlayerStatistics = z;
        this.displayInverseHomeAwayTeams = z2;
        this.groundType = str3;
        this.country = country;
        this.owner = str4;
        this.titleHolder = team;
        this.titleHolderTitles = num;
        this.mostTitlesTeams = list;
        this.mostTitles = num2;
        this.startDateTimestamp = num3;
        this.endDateTimestamp = num4;
        this.linkedUniqueTournaments = list2;
        this.upperDivisions = list3;
        this.lowerDivisions = list4;
        this.numberOfSets = num5;
        this.competitionType = str5;
        this.fieldTranslations = fieldTranslations;
        this.gender = gender;
        this.showBanner = bool;
        this.playerOfTheTournament = bool2;
    }

    public /* synthetic */ UniqueTournamentDetails(int i, String str, String str2, Category category, long j, boolean z, boolean z2, String str3, Country country, String str4, Team team, Integer num, List list, Integer num2, Integer num3, Integer num4, List list2, List list3, List list4, Integer num5, String str5, FieldTranslations fieldTranslations, Gender gender, Boolean bool, Boolean bool2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, category, (i2 & 16) != 0 ? 0L : j, (i2 & 32) != 0 ? false : z, z2, str3, country, str4, team, num, list, num2, num3, num4, list2, list3, list4, num5, str5, fieldTranslations, gender, bool, bool2);
    }
}

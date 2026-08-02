package com.sofascore.model.fantasy;

import defpackage.a7a;
import defpackage.au6;
import defpackage.dmi;
import defpackage.gz1;
import defpackage.joa;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298BC\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB]\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%JX\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b2\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b5\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u0010%¨\u0006:"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyCreateTeamPostBody;", "", "", "Lcom/sofascore/model/fantasy/FantasyPlayerPostModel;", "players", "", "name", "country", "", "userAgeGroupId", "countryBrandedFantasyCompetitionId", "", "termsAndConditionsAccepted", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyCreateTeamPostBody;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "()Ljava/lang/Boolean;", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/sofascore/model/fantasy/FantasyCreateTeamPostBody;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPlayers", "Ljava/lang/String;", "getName", "getCountry", "Ljava/lang/Integer;", "getUserAgeGroupId", "getCountryBrandedFantasyCompetitionId", "Ljava/lang/Boolean;", "getTermsAndConditionsAccepted", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyCreateTeamPostBody {

    @NotNull
    private final String country;

    @Nullable
    private final Integer countryBrandedFantasyCompetitionId;

    @NotNull
    private final String name;

    @NotNull
    private final List<FantasyPlayerPostModel> players;

    @Nullable
    private final Boolean termsAndConditionsAccepted;

    @Nullable
    private final Integer userAgeGroupId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {ypa.a(ysa.b, new au6(8)), null, null, null, null, null};

    public /* synthetic */ FantasyCreateTeamPostBody(int i, List list, String str, String str2, Integer num, Integer num2, Boolean bool, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, FantasyCreateTeamPostBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.players = list;
        this.name = str;
        this.country = str2;
        this.userAgeGroupId = num;
        this.countryBrandedFantasyCompetitionId = num2;
        this.termsAndConditionsAccepted = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(FantasyPlayerPostModel$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ FantasyCreateTeamPostBody copy$default(FantasyCreateTeamPostBody fantasyCreateTeamPostBody, List list, String str, String str2, Integer num, Integer num2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fantasyCreateTeamPostBody.players;
        }
        if ((i & 2) != 0) {
            str = fantasyCreateTeamPostBody.name;
        }
        if ((i & 4) != 0) {
            str2 = fantasyCreateTeamPostBody.country;
        }
        if ((i & 8) != 0) {
            num = fantasyCreateTeamPostBody.userAgeGroupId;
        }
        if ((i & 16) != 0) {
            num2 = fantasyCreateTeamPostBody.countryBrandedFantasyCompetitionId;
        }
        if ((i & 32) != 0) {
            bool = fantasyCreateTeamPostBody.termsAndConditionsAccepted;
        }
        Integer num3 = num2;
        Boolean bool2 = bool;
        return fantasyCreateTeamPostBody.copy(list, str, str2, num, num3, bool2);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyCreateTeamPostBody self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.players);
        output.y(serialDesc, 1, self.name);
        output.y(serialDesc, 2, self.country);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 3, a7aVar, self.userAgeGroupId);
        output.h(serialDesc, 4, a7aVar, self.countryBrandedFantasyCompetitionId);
        output.h(serialDesc, 5, gz1.a, self.termsAndConditionsAccepted);
    }

    @NotNull
    public final List<FantasyPlayerPostModel> component1() {
        return this.players;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getUserAgeGroupId() {
        return this.userAgeGroupId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getCountryBrandedFantasyCompetitionId() {
        return this.countryBrandedFantasyCompetitionId;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Boolean getTermsAndConditionsAccepted() {
        return this.termsAndConditionsAccepted;
    }

    @NotNull
    public final FantasyCreateTeamPostBody copy(@NotNull List<FantasyPlayerPostModel> players, @NotNull String name, @NotNull String country, @Nullable Integer userAgeGroupId, @Nullable Integer countryBrandedFantasyCompetitionId, @Nullable Boolean termsAndConditionsAccepted) {
        players.getClass();
        name.getClass();
        country.getClass();
        return new FantasyCreateTeamPostBody(players, name, country, userAgeGroupId, countryBrandedFantasyCompetitionId, termsAndConditionsAccepted);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyCreateTeamPostBody)) {
            return false;
        }
        FantasyCreateTeamPostBody fantasyCreateTeamPostBody = (FantasyCreateTeamPostBody) other;
        return Intrinsics.c(this.players, fantasyCreateTeamPostBody.players) && Intrinsics.c(this.name, fantasyCreateTeamPostBody.name) && Intrinsics.c(this.country, fantasyCreateTeamPostBody.country) && Intrinsics.c(this.userAgeGroupId, fantasyCreateTeamPostBody.userAgeGroupId) && Intrinsics.c(this.countryBrandedFantasyCompetitionId, fantasyCreateTeamPostBody.countryBrandedFantasyCompetitionId) && Intrinsics.c(this.termsAndConditionsAccepted, fantasyCreateTeamPostBody.termsAndConditionsAccepted);
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final Integer getCountryBrandedFantasyCompetitionId() {
        return this.countryBrandedFantasyCompetitionId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<FantasyPlayerPostModel> getPlayers() {
        return this.players;
    }

    @Nullable
    public final Boolean getTermsAndConditionsAccepted() {
        return this.termsAndConditionsAccepted;
    }

    @Nullable
    public final Integer getUserAgeGroupId() {
        return this.userAgeGroupId;
    }

    public int hashCode() {
        int c = dmi.c(dmi.c(this.players.hashCode() * 31, 31, this.name), 31, this.country);
        Integer num = this.userAgeGroupId;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.countryBrandedFantasyCompetitionId;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.termsAndConditionsAccepted;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<FantasyPlayerPostModel> list = this.players;
        String str = this.name;
        String str2 = this.country;
        Integer num = this.userAgeGroupId;
        Integer num2 = this.countryBrandedFantasyCompetitionId;
        Boolean bool = this.termsAndConditionsAccepted;
        StringBuilder sb = new StringBuilder("FantasyCreateTeamPostBody(players=");
        sb.append(list);
        sb.append(", name=");
        sb.append(str);
        sb.append(", country=");
        me4.o(num, str2, ", userAgeGroupId=", ", countryBrandedFantasyCompetitionId=", sb);
        sb.append(num2);
        sb.append(", termsAndConditionsAccepted=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyCreateTeamPostBody$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyCreateTeamPostBody;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyCreateTeamPostBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyCreateTeamPostBody(@NotNull List<FantasyPlayerPostModel> list, @NotNull String str, @NotNull String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool) {
        list.getClass();
        str.getClass();
        str2.getClass();
        this.players = list;
        this.name = str;
        this.country = str2;
        this.userAgeGroupId = num;
        this.countryBrandedFantasyCompetitionId = num2;
        this.termsAndConditionsAccepted = bool;
    }
}

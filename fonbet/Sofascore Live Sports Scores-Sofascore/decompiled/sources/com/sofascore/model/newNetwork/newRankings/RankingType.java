package com.sofascore.model.newNetwork.newRankings;

import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Category$$serializer;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.GenderSerializer;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Sport$$serializer;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournament$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.dmi;
import defpackage.lkb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002JIB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013Bs\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010$J\u0012\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010$J\u0012\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b/\u00100Jv\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b3\u0010$J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u0010\"J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\b@\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\bC\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bE\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\bF\u0010$R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bH\u00100¨\u0006K"}, d2 = {"Lcom/sofascore/model/newNetwork/newRankings/RankingType;", "", "", "id", "", "slug", "Lcom/sofascore/model/mvvm/model/Sport;", SearchResponseKt.SPORT_ENTITY, "Lcom/sofascore/model/mvvm/model/Category;", "category", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", SearchResponseKt.LEAGUE_ENTITY, "name", "Lcom/sofascore/model/mvvm/model/Gender;", InneractiveMediationDefs.KEY_GENDER, "weightClass", "", "lastUpdatedTimestamp", "<init>", "(ILjava/lang/String;Lcom/sofascore/model/mvvm/model/Sport;Lcom/sofascore/model/mvvm/model/Category;Lcom/sofascore/model/mvvm/model/UniqueTournament;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Gender;Ljava/lang/String;Ljava/lang/Long;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Lcom/sofascore/model/mvvm/model/Sport;Lcom/sofascore/model/mvvm/model/Category;Lcom/sofascore/model/mvvm/model/UniqueTournament;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Gender;Ljava/lang/String;Ljava/lang/Long;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/newRankings/RankingType;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Lcom/sofascore/model/mvvm/model/Sport;", "component4", "()Lcom/sofascore/model/mvvm/model/Category;", "component5", "()Lcom/sofascore/model/mvvm/model/UniqueTournament;", "component6", "component7", "()Lcom/sofascore/model/mvvm/model/Gender;", "component8", "component9", "()Ljava/lang/Long;", "copy", "(ILjava/lang/String;Lcom/sofascore/model/mvvm/model/Sport;Lcom/sofascore/model/mvvm/model/Category;Lcom/sofascore/model/mvvm/model/UniqueTournament;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Gender;Ljava/lang/String;Ljava/lang/Long;)Lcom/sofascore/model/newNetwork/newRankings/RankingType;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getSlug", "Lcom/sofascore/model/mvvm/model/Sport;", "getSport", "Lcom/sofascore/model/mvvm/model/Category;", "getCategory", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "getUniqueTournament", "getName", "Lcom/sofascore/model/mvvm/model/Gender;", "getGender", "getWeightClass", "Ljava/lang/Long;", "getLastUpdatedTimestamp", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RankingType {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Category category;

    @Nullable
    private final Gender gender;
    private final int id;

    @Nullable
    private final Long lastUpdatedTimestamp;

    @Nullable
    private final String name;

    @NotNull
    private final String slug;

    @NotNull
    private final Sport sport;

    @Nullable
    private final UniqueTournament uniqueTournament;

    @Nullable
    private final String weightClass;

    public /* synthetic */ RankingType(int i, int i2, String str, Sport sport, Category category, UniqueTournament uniqueTournament, String str2, Gender gender, String str3, Long l, t5h t5hVar) {
        if (511 != (i & 511)) {
            oea.z(i, 511, RankingType$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.slug = str;
        this.sport = sport;
        this.category = category;
        this.uniqueTournament = uniqueTournament;
        this.name = str2;
        this.gender = gender;
        this.weightClass = str3;
        this.lastUpdatedTimestamp = l;
    }

    public static /* synthetic */ RankingType copy$default(RankingType rankingType, int i, String str, Sport sport, Category category, UniqueTournament uniqueTournament, String str2, Gender gender, String str3, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = rankingType.id;
        }
        if ((i2 & 2) != 0) {
            str = rankingType.slug;
        }
        if ((i2 & 4) != 0) {
            sport = rankingType.sport;
        }
        if ((i2 & 8) != 0) {
            category = rankingType.category;
        }
        if ((i2 & 16) != 0) {
            uniqueTournament = rankingType.uniqueTournament;
        }
        if ((i2 & 32) != 0) {
            str2 = rankingType.name;
        }
        if ((i2 & 64) != 0) {
            gender = rankingType.gender;
        }
        if ((i2 & 128) != 0) {
            str3 = rankingType.weightClass;
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            l = rankingType.lastUpdatedTimestamp;
        }
        String str4 = str3;
        Long l2 = l;
        String str5 = str2;
        Gender gender2 = gender;
        UniqueTournament uniqueTournament2 = uniqueTournament;
        Sport sport2 = sport;
        return rankingType.copy(i, str, sport2, category, uniqueTournament2, str5, gender2, str4, l2);
    }

    public static final /* synthetic */ void write$Self$model_release(RankingType self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.slug);
        output.f(serialDesc, 2, Sport$$serializer.INSTANCE, self.sport);
        output.h(serialDesc, 3, Category$$serializer.INSTANCE, self.category);
        output.h(serialDesc, 4, UniqueTournament$$serializer.INSTANCE, self.uniqueTournament);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 5, uhiVar, self.name);
        output.h(serialDesc, 6, GenderSerializer.INSTANCE, self.gender);
        output.h(serialDesc, 7, uhiVar, self.weightClass);
        output.h(serialDesc, 8, lkb.a, self.lastUpdatedTimestamp);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Sport getSport() {
        return this.sport;
    }

    @Nullable
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
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Gender getGender() {
        return this.gender;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getWeightClass() {
        return this.weightClass;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    @NotNull
    public final RankingType copy(int id, @NotNull String slug, @NotNull Sport sport, @Nullable Category category, @Nullable UniqueTournament uniqueTournament, @Nullable String name, @Nullable Gender gender, @Nullable String weightClass, @Nullable Long lastUpdatedTimestamp) {
        slug.getClass();
        sport.getClass();
        return new RankingType(id, slug, sport, category, uniqueTournament, name, gender, weightClass, lastUpdatedTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankingType)) {
            return false;
        }
        RankingType rankingType = (RankingType) other;
        return this.id == rankingType.id && Intrinsics.c(this.slug, rankingType.slug) && Intrinsics.c(this.sport, rankingType.sport) && Intrinsics.c(this.category, rankingType.category) && Intrinsics.c(this.uniqueTournament, rankingType.uniqueTournament) && Intrinsics.c(this.name, rankingType.name) && this.gender == rankingType.gender && Intrinsics.c(this.weightClass, rankingType.weightClass) && Intrinsics.c(this.lastUpdatedTimestamp, rankingType.lastUpdatedTimestamp);
    }

    @Nullable
    public final Category getCategory() {
        return this.category;
    }

    @Nullable
    public final Gender getGender() {
        return this.gender;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getSlug() {
        return this.slug;
    }

    @NotNull
    public final Sport getSport() {
        return this.sport;
    }

    @Nullable
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    @Nullable
    public final String getWeightClass() {
        return this.weightClass;
    }

    public int hashCode() {
        int hashCode = (this.sport.hashCode() + dmi.c(Integer.hashCode(this.id) * 31, 31, this.slug)) * 31;
        Category category = this.category;
        int hashCode2 = (hashCode + (category == null ? 0 : category.hashCode())) * 31;
        UniqueTournament uniqueTournament = this.uniqueTournament;
        int hashCode3 = (hashCode2 + (uniqueTournament == null ? 0 : uniqueTournament.hashCode())) * 31;
        String str = this.name;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Gender gender = this.gender;
        int hashCode5 = (hashCode4 + (gender == null ? 0 : gender.hashCode())) * 31;
        String str2 = this.weightClass;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.lastUpdatedTimestamp;
        return hashCode6 + (l != null ? l.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.slug;
        Sport sport = this.sport;
        Category category = this.category;
        UniqueTournament uniqueTournament = this.uniqueTournament;
        String str2 = this.name;
        Gender gender = this.gender;
        String str3 = this.weightClass;
        Long l = this.lastUpdatedTimestamp;
        StringBuilder t = dmi.t(i, "RankingType(id=", ", slug=", str, ", sport=");
        t.append(sport);
        t.append(", category=");
        t.append(category);
        t.append(", uniqueTournament=");
        t.append(uniqueTournament);
        t.append(", name=");
        t.append(str2);
        t.append(", gender=");
        t.append(gender);
        t.append(", weightClass=");
        t.append(str3);
        t.append(", lastUpdatedTimestamp=");
        t.append(l);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/newRankings/RankingType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/newRankings/RankingType;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RankingType$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RankingType(int i, @NotNull String str, @NotNull Sport sport, @Nullable Category category, @Nullable UniqueTournament uniqueTournament, @Nullable String str2, @Nullable Gender gender, @Nullable String str3, @Nullable Long l) {
        str.getClass();
        sport.getClass();
        this.id = i;
        this.slug = str;
        this.sport = sport;
        this.category = category;
        this.uniqueTournament = uniqueTournament;
        this.name = str2;
        this.gender = gender;
        this.weightClass = str3;
        this.lastUpdatedTimestamp = l;
    }
}

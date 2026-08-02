package com.sofascore.model.profile;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.GenderSerializer;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Sport$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.dmi;
import defpackage.fn0;
import defpackage.ljg;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fB[\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001eJZ\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010 J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001eJ\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b5\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010'R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b<\u0010\u001e¨\u0006?"}, d2 = {"Lcom/sofascore/model/profile/TeamSubscription;", "", "", "id", "", "name", "slug", "Lcom/sofascore/model/mvvm/model/Sport;", SearchResponseKt.SPORT_ENTITY, "", "userCount", "Lcom/sofascore/model/mvvm/model/Gender;", InneractiveMediationDefs.KEY_GENDER, "type", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Sport;JLcom/sofascore/model/mvvm/model/Gender;I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Sport;JLcom/sofascore/model/mvvm/model/Gender;ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/profile/TeamSubscription;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/sofascore/model/mvvm/model/Sport;", "component5", "()J", "component6", "()Lcom/sofascore/model/mvvm/model/Gender;", "component7", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Sport;JLcom/sofascore/model/mvvm/model/Gender;I)Lcom/sofascore/model/profile/TeamSubscription;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getName", "getSlug", "Lcom/sofascore/model/mvvm/model/Sport;", "getSport", "J", "getUserCount", "Lcom/sofascore/model/mvvm/model/Gender;", "getGender", "getType", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TeamSubscription {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Gender gender;
    private final int id;

    @NotNull
    private final String name;

    @NotNull
    private final String slug;

    @Nullable
    private final Sport sport;
    private final int type;
    private final long userCount;

    public /* synthetic */ TeamSubscription(int i, int i2, String str, String str2, Sport sport, long j, Gender gender, int i3, t5h t5hVar) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, TeamSubscription$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.name = str;
        this.slug = str2;
        this.sport = sport;
        this.userCount = j;
        this.gender = gender;
        this.type = i3;
    }

    public static /* synthetic */ TeamSubscription copy$default(TeamSubscription teamSubscription, int i, String str, String str2, Sport sport, long j, Gender gender, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = teamSubscription.id;
        }
        if ((i3 & 2) != 0) {
            str = teamSubscription.name;
        }
        if ((i3 & 4) != 0) {
            str2 = teamSubscription.slug;
        }
        if ((i3 & 8) != 0) {
            sport = teamSubscription.sport;
        }
        if ((i3 & 16) != 0) {
            j = teamSubscription.userCount;
        }
        if ((i3 & 32) != 0) {
            gender = teamSubscription.gender;
        }
        if ((i3 & 64) != 0) {
            i2 = teamSubscription.type;
        }
        long j2 = j;
        String str3 = str2;
        Sport sport2 = sport;
        return teamSubscription.copy(i, str, str3, sport2, j2, gender, i2);
    }

    public static final /* synthetic */ void write$Self$model_release(TeamSubscription self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.name);
        output.y(serialDesc, 2, self.slug);
        output.h(serialDesc, 3, Sport$$serializer.INSTANCE, self.sport);
        output.E(serialDesc, 4, self.userCount);
        output.h(serialDesc, 5, GenderSerializer.INSTANCE, self.gender);
        output.u(6, self.type, serialDesc);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
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

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Sport getSport() {
        return this.sport;
    }

    /* renamed from: component5, reason: from getter */
    public final long getUserCount() {
        return this.userCount;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Gender getGender() {
        return this.gender;
    }

    /* renamed from: component7, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final TeamSubscription copy(int id, @NotNull String name, @NotNull String slug, @Nullable Sport sport, long userCount, @Nullable Gender gender, int type) {
        name.getClass();
        slug.getClass();
        return new TeamSubscription(id, name, slug, sport, userCount, gender, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamSubscription)) {
            return false;
        }
        TeamSubscription teamSubscription = (TeamSubscription) other;
        return this.id == teamSubscription.id && Intrinsics.c(this.name, teamSubscription.name) && Intrinsics.c(this.slug, teamSubscription.slug) && Intrinsics.c(this.sport, teamSubscription.sport) && this.userCount == teamSubscription.userCount && this.gender == teamSubscription.gender && this.type == teamSubscription.type;
    }

    @Nullable
    public final Gender getGender() {
        return this.gender;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getSlug() {
        return this.slug;
    }

    @Nullable
    public final Sport getSport() {
        return this.sport;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUserCount() {
        return this.userCount;
    }

    public int hashCode() {
        int c = dmi.c(dmi.c(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.slug);
        Sport sport = this.sport;
        int c2 = ljg.c((c + (sport == null ? 0 : sport.hashCode())) * 31, 31, this.userCount);
        Gender gender = this.gender;
        return Integer.hashCode(this.type) + ((c2 + (gender != null ? gender.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.name;
        String str2 = this.slug;
        Sport sport = this.sport;
        long j = this.userCount;
        Gender gender = this.gender;
        int i2 = this.type;
        StringBuilder t = dmi.t(i, "TeamSubscription(id=", ", name=", str, ", slug=");
        t.append(str2);
        t.append(", sport=");
        t.append(sport);
        t.append(", userCount=");
        t.append(j);
        t.append(", gender=");
        t.append(gender);
        return fn0.k(i2, ", type=", ")", t);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/profile/TeamSubscription$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/profile/TeamSubscription;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TeamSubscription$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TeamSubscription(int i, @NotNull String str, @NotNull String str2, @Nullable Sport sport, long j, @Nullable Gender gender, int i2) {
        str.getClass();
        str2.getClass();
        this.id = i;
        this.name = str;
        this.slug = str2;
        this.sport = sport;
        this.userCount = j;
        this.gender = gender;
        this.type = i2;
    }
}

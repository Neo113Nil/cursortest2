package com.sofascore.model.profile;

import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Sport$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.me4;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$JN\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001eJ\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001cJ\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b2\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010$¨\u00069"}, d2 = {"Lcom/sofascore/model/profile/UniqueTournamentSubscription;", "", "", "id", "", "name", "slug", "categorySlug", "Lcom/sofascore/model/mvvm/model/Sport;", SearchResponseKt.SPORT_ENTITY, "", "userCount", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Sport;J)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Sport;JLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/profile/UniqueTournamentSubscription;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/sofascore/model/mvvm/model/Sport;", "component6", "()J", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Sport;J)Lcom/sofascore/model/profile/UniqueTournamentSubscription;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getName", "getSlug", "getCategorySlug", "Lcom/sofascore/model/mvvm/model/Sport;", "getSport", "J", "getUserCount", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UniqueTournamentSubscription {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String categorySlug;
    private final int id;

    @NotNull
    private final String name;

    @NotNull
    private final String slug;

    @Nullable
    private final Sport sport;
    private final long userCount;

    public /* synthetic */ UniqueTournamentSubscription(int i, int i2, String str, String str2, String str3, Sport sport, long j, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, UniqueTournamentSubscription$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.name = str;
        this.slug = str2;
        this.categorySlug = str3;
        this.sport = sport;
        this.userCount = j;
    }

    public static /* synthetic */ UniqueTournamentSubscription copy$default(UniqueTournamentSubscription uniqueTournamentSubscription, int i, String str, String str2, String str3, Sport sport, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = uniqueTournamentSubscription.id;
        }
        if ((i2 & 2) != 0) {
            str = uniqueTournamentSubscription.name;
        }
        if ((i2 & 4) != 0) {
            str2 = uniqueTournamentSubscription.slug;
        }
        if ((i2 & 8) != 0) {
            str3 = uniqueTournamentSubscription.categorySlug;
        }
        if ((i2 & 16) != 0) {
            sport = uniqueTournamentSubscription.sport;
        }
        if ((i2 & 32) != 0) {
            j = uniqueTournamentSubscription.userCount;
        }
        long j2 = j;
        Sport sport2 = sport;
        String str4 = str2;
        return uniqueTournamentSubscription.copy(i, str, str4, str3, sport2, j2);
    }

    public static final /* synthetic */ void write$Self$model_release(UniqueTournamentSubscription self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.name);
        output.y(serialDesc, 2, self.slug);
        output.y(serialDesc, 3, self.categorySlug);
        output.h(serialDesc, 4, Sport$$serializer.INSTANCE, self.sport);
        output.E(serialDesc, 5, self.userCount);
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

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCategorySlug() {
        return this.categorySlug;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Sport getSport() {
        return this.sport;
    }

    /* renamed from: component6, reason: from getter */
    public final long getUserCount() {
        return this.userCount;
    }

    @NotNull
    public final UniqueTournamentSubscription copy(int id, @NotNull String name, @NotNull String slug, @NotNull String categorySlug, @Nullable Sport sport, long userCount) {
        name.getClass();
        slug.getClass();
        categorySlug.getClass();
        return new UniqueTournamentSubscription(id, name, slug, categorySlug, sport, userCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniqueTournamentSubscription)) {
            return false;
        }
        UniqueTournamentSubscription uniqueTournamentSubscription = (UniqueTournamentSubscription) other;
        return this.id == uniqueTournamentSubscription.id && Intrinsics.c(this.name, uniqueTournamentSubscription.name) && Intrinsics.c(this.slug, uniqueTournamentSubscription.slug) && Intrinsics.c(this.categorySlug, uniqueTournamentSubscription.categorySlug) && Intrinsics.c(this.sport, uniqueTournamentSubscription.sport) && this.userCount == uniqueTournamentSubscription.userCount;
    }

    @NotNull
    public final String getCategorySlug() {
        return this.categorySlug;
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

    public final long getUserCount() {
        return this.userCount;
    }

    public int hashCode() {
        int c = dmi.c(dmi.c(dmi.c(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.slug), 31, this.categorySlug);
        Sport sport = this.sport;
        return Long.hashCode(this.userCount) + ((c + (sport == null ? 0 : sport.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.name;
        String str2 = this.slug;
        String str3 = this.categorySlug;
        Sport sport = this.sport;
        long j = this.userCount;
        StringBuilder t = dmi.t(i, "UniqueTournamentSubscription(id=", ", name=", str, ", slug=");
        bf3.v(t, str2, ", categorySlug=", str3, ", sport=");
        t.append(sport);
        t.append(", userCount=");
        t.append(j);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/profile/UniqueTournamentSubscription$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/profile/UniqueTournamentSubscription;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UniqueTournamentSubscription$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UniqueTournamentSubscription(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Sport sport, long j) {
        me4.p(str, str2, str3);
        this.id = i;
        this.name = str;
        this.slug = str2;
        this.categorySlug = str3;
        this.sport = sport;
        this.userCount = j;
    }
}

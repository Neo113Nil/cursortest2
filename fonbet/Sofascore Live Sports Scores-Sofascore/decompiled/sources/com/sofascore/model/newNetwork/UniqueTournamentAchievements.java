package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournament$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006*"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentAchievements;", "", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", SearchResponseKt.LEAGUE_ENTITY, "", "trophiesWon", "<init>", "(Lcom/sofascore/model/mvvm/model/UniqueTournament;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/UniqueTournament;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/UniqueTournamentAchievements;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/UniqueTournament;", "component2", "()Ljava/lang/Integer;", "copy", "(Lcom/sofascore/model/mvvm/model/UniqueTournament;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/UniqueTournamentAchievements;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "getUniqueTournament", "Ljava/lang/Integer;", "getTrophiesWon", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UniqueTournamentAchievements {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer trophiesWon;

    @Nullable
    private final UniqueTournament uniqueTournament;

    public /* synthetic */ UniqueTournamentAchievements(int i, UniqueTournament uniqueTournament, Integer num, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, UniqueTournamentAchievements$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.uniqueTournament = uniqueTournament;
        this.trophiesWon = num;
    }

    public static /* synthetic */ UniqueTournamentAchievements copy$default(UniqueTournamentAchievements uniqueTournamentAchievements, UniqueTournament uniqueTournament, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            uniqueTournament = uniqueTournamentAchievements.uniqueTournament;
        }
        if ((i & 2) != 0) {
            num = uniqueTournamentAchievements.trophiesWon;
        }
        return uniqueTournamentAchievements.copy(uniqueTournament, num);
    }

    public static final /* synthetic */ void write$Self$model_release(UniqueTournamentAchievements self, wf3 output, SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, UniqueTournament$$serializer.INSTANCE, self.uniqueTournament);
        output.h(serialDesc, 1, a7a.a, self.trophiesWon);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getTrophiesWon() {
        return this.trophiesWon;
    }

    @NotNull
    public final UniqueTournamentAchievements copy(@Nullable UniqueTournament uniqueTournament, @Nullable Integer trophiesWon) {
        return new UniqueTournamentAchievements(uniqueTournament, trophiesWon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniqueTournamentAchievements)) {
            return false;
        }
        UniqueTournamentAchievements uniqueTournamentAchievements = (UniqueTournamentAchievements) other;
        return Intrinsics.c(this.uniqueTournament, uniqueTournamentAchievements.uniqueTournament) && Intrinsics.c(this.trophiesWon, uniqueTournamentAchievements.trophiesWon);
    }

    @Nullable
    public final Integer getTrophiesWon() {
        return this.trophiesWon;
    }

    @Nullable
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    public int hashCode() {
        UniqueTournament uniqueTournament = this.uniqueTournament;
        int hashCode = (uniqueTournament == null ? 0 : uniqueTournament.hashCode()) * 31;
        Integer num = this.trophiesWon;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UniqueTournamentAchievements(uniqueTournament=" + this.uniqueTournament + ", trophiesWon=" + this.trophiesWon + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentAchievements$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/UniqueTournamentAchievements;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UniqueTournamentAchievements$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UniqueTournamentAchievements(@Nullable UniqueTournament uniqueTournament, @Nullable Integer num) {
        this.uniqueTournament = uniqueTournament;
        this.trophiesWon = num;
    }
}

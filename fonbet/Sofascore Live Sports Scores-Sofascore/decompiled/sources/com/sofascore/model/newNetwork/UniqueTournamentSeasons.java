package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Season$$serializer;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournament$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vak;
import defpackage.vxd;
import defpackage.wf3;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ6\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001d¨\u00062"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentSeasons;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", SearchResponseKt.LEAGUE_ENTITY, "", "Lcom/sofascore/model/mvvm/model/Season;", "seasons", "", "allTimeSeasonId", "<init>", "(Lcom/sofascore/model/mvvm/model/UniqueTournament;Ljava/util/List;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/UniqueTournament;Ljava/util/List;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/UniqueTournamentSeasons;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/UniqueTournament;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/Integer;", "copy", "(Lcom/sofascore/model/mvvm/model/UniqueTournament;Ljava/util/List;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/UniqueTournamentSeasons;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "getUniqueTournament", "Ljava/util/List;", "getSeasons", "Ljava/lang/Integer;", "getAllTimeSeasonId", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UniqueTournamentSeasons implements Serializable {

    @Nullable
    private final Integer allTimeSeasonId;

    @NotNull
    private final List<Season> seasons;

    @NotNull
    private final UniqueTournament uniqueTournament;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new vak(14)), null};

    public /* synthetic */ UniqueTournamentSeasons(int i, UniqueTournament uniqueTournament, List list, Integer num, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, UniqueTournamentSeasons$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.uniqueTournament = uniqueTournament;
        this.seasons = list;
        this.allTimeSeasonId = num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(Season$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UniqueTournamentSeasons copy$default(UniqueTournamentSeasons uniqueTournamentSeasons, UniqueTournament uniqueTournament, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            uniqueTournament = uniqueTournamentSeasons.uniqueTournament;
        }
        if ((i & 2) != 0) {
            list = uniqueTournamentSeasons.seasons;
        }
        if ((i & 4) != 0) {
            num = uniqueTournamentSeasons.allTimeSeasonId;
        }
        return uniqueTournamentSeasons.copy(uniqueTournament, list, num);
    }

    public static final /* synthetic */ void write$Self$model_release(UniqueTournamentSeasons self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, UniqueTournament$$serializer.INSTANCE, self.uniqueTournament);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.seasons);
        output.h(serialDesc, 2, a7a.a, self.allTimeSeasonId);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    @NotNull
    public final List<Season> component2() {
        return this.seasons;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getAllTimeSeasonId() {
        return this.allTimeSeasonId;
    }

    @NotNull
    public final UniqueTournamentSeasons copy(@NotNull UniqueTournament uniqueTournament, @NotNull List<Season> seasons, @Nullable Integer allTimeSeasonId) {
        uniqueTournament.getClass();
        seasons.getClass();
        return new UniqueTournamentSeasons(uniqueTournament, seasons, allTimeSeasonId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniqueTournamentSeasons)) {
            return false;
        }
        UniqueTournamentSeasons uniqueTournamentSeasons = (UniqueTournamentSeasons) other;
        return Intrinsics.c(this.uniqueTournament, uniqueTournamentSeasons.uniqueTournament) && Intrinsics.c(this.seasons, uniqueTournamentSeasons.seasons) && Intrinsics.c(this.allTimeSeasonId, uniqueTournamentSeasons.allTimeSeasonId);
    }

    @Nullable
    public final Integer getAllTimeSeasonId() {
        return this.allTimeSeasonId;
    }

    @NotNull
    public final List<Season> getSeasons() {
        return this.seasons;
    }

    @NotNull
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    public int hashCode() {
        int d = dmi.d(this.uniqueTournament.hashCode() * 31, 31, this.seasons);
        Integer num = this.allTimeSeasonId;
        return d + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        UniqueTournament uniqueTournament = this.uniqueTournament;
        List<Season> list = this.seasons;
        Integer num = this.allTimeSeasonId;
        StringBuilder sb = new StringBuilder("UniqueTournamentSeasons(uniqueTournament=");
        sb.append(uniqueTournament);
        sb.append(", seasons=");
        sb.append(list);
        sb.append(", allTimeSeasonId=");
        return vxd.n(sb, num, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentSeasons$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/UniqueTournamentSeasons;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UniqueTournamentSeasons$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UniqueTournamentSeasons(@NotNull UniqueTournament uniqueTournament, @NotNull List<Season> list, @Nullable Integer num) {
        uniqueTournament.getClass();
        list.getClass();
        this.uniqueTournament = uniqueTournament;
        this.seasons = list;
        this.allTimeSeasonId = num;
    }
}

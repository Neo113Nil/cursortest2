package com.sofascore.model;

import com.sofascore.model.network.response.SearchResponseKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/sofascore/model/UniqueTournamentSeasonsSpinnerData;", "", SearchResponseKt.LEAGUE_ENTITY, "Lcom/sofascore/model/UniqueTournamentSpinnerData;", "seasons", "", "Lcom/sofascore/model/SeasonSpinnerData;", "<init>", "(Lcom/sofascore/model/UniqueTournamentSpinnerData;Ljava/util/List;)V", "getUniqueTournament", "()Lcom/sofascore/model/UniqueTournamentSpinnerData;", "getSeasons", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UniqueTournamentSeasonsSpinnerData {

    @NotNull
    private final List<SeasonSpinnerData> seasons;

    @NotNull
    private final UniqueTournamentSpinnerData uniqueTournament;

    public UniqueTournamentSeasonsSpinnerData(@NotNull UniqueTournamentSpinnerData uniqueTournamentSpinnerData, @NotNull List<SeasonSpinnerData> list) {
        uniqueTournamentSpinnerData.getClass();
        list.getClass();
        this.uniqueTournament = uniqueTournamentSpinnerData;
        this.seasons = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UniqueTournamentSeasonsSpinnerData copy$default(UniqueTournamentSeasonsSpinnerData uniqueTournamentSeasonsSpinnerData, UniqueTournamentSpinnerData uniqueTournamentSpinnerData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            uniqueTournamentSpinnerData = uniqueTournamentSeasonsSpinnerData.uniqueTournament;
        }
        if ((i & 2) != 0) {
            list = uniqueTournamentSeasonsSpinnerData.seasons;
        }
        return uniqueTournamentSeasonsSpinnerData.copy(uniqueTournamentSpinnerData, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final UniqueTournamentSpinnerData getUniqueTournament() {
        return this.uniqueTournament;
    }

    @NotNull
    public final List<SeasonSpinnerData> component2() {
        return this.seasons;
    }

    @NotNull
    public final UniqueTournamentSeasonsSpinnerData copy(@NotNull UniqueTournamentSpinnerData uniqueTournament, @NotNull List<SeasonSpinnerData> seasons) {
        uniqueTournament.getClass();
        seasons.getClass();
        return new UniqueTournamentSeasonsSpinnerData(uniqueTournament, seasons);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniqueTournamentSeasonsSpinnerData)) {
            return false;
        }
        UniqueTournamentSeasonsSpinnerData uniqueTournamentSeasonsSpinnerData = (UniqueTournamentSeasonsSpinnerData) other;
        return Intrinsics.c(this.uniqueTournament, uniqueTournamentSeasonsSpinnerData.uniqueTournament) && Intrinsics.c(this.seasons, uniqueTournamentSeasonsSpinnerData.seasons);
    }

    @NotNull
    public final List<SeasonSpinnerData> getSeasons() {
        return this.seasons;
    }

    @NotNull
    public final UniqueTournamentSpinnerData getUniqueTournament() {
        return this.uniqueTournament;
    }

    public int hashCode() {
        return this.seasons.hashCode() + (this.uniqueTournament.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "UniqueTournamentSeasonsSpinnerData(uniqueTournament=" + this.uniqueTournament + ", seasons=" + this.seasons + ")";
    }
}

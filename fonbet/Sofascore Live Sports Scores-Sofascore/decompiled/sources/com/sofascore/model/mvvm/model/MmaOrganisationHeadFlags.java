package com.sofascore.model.mvvm.model;

import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.dmi;
import defpackage.wt3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/sofascore/model/mvvm/model/MmaOrganisationHeadFlags;", "", SearchResponseKt.LEAGUE_ENTITY, "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "events", "", "rankings", "<init>", "(Lcom/sofascore/model/mvvm/model/UniqueTournament;ZZ)V", "getUniqueTournament", "()Lcom/sofascore/model/mvvm/model/UniqueTournament;", "getEvents", "()Z", "getRankings", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MmaOrganisationHeadFlags {
    private final boolean events;
    private final boolean rankings;

    @NotNull
    private final UniqueTournament uniqueTournament;

    public MmaOrganisationHeadFlags(@NotNull UniqueTournament uniqueTournament, boolean z, boolean z2) {
        uniqueTournament.getClass();
        this.uniqueTournament = uniqueTournament;
        this.events = z;
        this.rankings = z2;
    }

    public static /* synthetic */ MmaOrganisationHeadFlags copy$default(MmaOrganisationHeadFlags mmaOrganisationHeadFlags, UniqueTournament uniqueTournament, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            uniqueTournament = mmaOrganisationHeadFlags.uniqueTournament;
        }
        if ((i & 2) != 0) {
            z = mmaOrganisationHeadFlags.events;
        }
        if ((i & 4) != 0) {
            z2 = mmaOrganisationHeadFlags.rankings;
        }
        return mmaOrganisationHeadFlags.copy(uniqueTournament, z, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEvents() {
        return this.events;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRankings() {
        return this.rankings;
    }

    @NotNull
    public final MmaOrganisationHeadFlags copy(@NotNull UniqueTournament uniqueTournament, boolean events, boolean rankings) {
        uniqueTournament.getClass();
        return new MmaOrganisationHeadFlags(uniqueTournament, events, rankings);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MmaOrganisationHeadFlags)) {
            return false;
        }
        MmaOrganisationHeadFlags mmaOrganisationHeadFlags = (MmaOrganisationHeadFlags) other;
        return Intrinsics.c(this.uniqueTournament, mmaOrganisationHeadFlags.uniqueTournament) && this.events == mmaOrganisationHeadFlags.events && this.rankings == mmaOrganisationHeadFlags.rankings;
    }

    public final boolean getEvents() {
        return this.events;
    }

    public final boolean getRankings() {
        return this.rankings;
    }

    @NotNull
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    public int hashCode() {
        return Boolean.hashCode(this.rankings) + dmi.e(this.uniqueTournament.hashCode() * 31, 31, this.events);
    }

    @NotNull
    public String toString() {
        UniqueTournament uniqueTournament = this.uniqueTournament;
        boolean z = this.events;
        boolean z2 = this.rankings;
        StringBuilder sb = new StringBuilder("MmaOrganisationHeadFlags(uniqueTournament=");
        sb.append(uniqueTournament);
        sb.append(", events=");
        sb.append(z);
        sb.append(", rankings=");
        return wt3.p(sb, z2, ")");
    }
}

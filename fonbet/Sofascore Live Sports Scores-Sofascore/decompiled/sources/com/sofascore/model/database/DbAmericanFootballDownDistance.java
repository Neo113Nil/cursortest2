package com.sofascore.model.database;

import defpackage.fc6;
import defpackage.vxd;
import defpackage.wv8;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0083\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0006\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\rR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, d2 = {"Lcom/sofascore/model/database/DbAmericanFootballDownDistance;", "Ljava/io/Serializable;", "currentYardsToFirstDown", "", "currentDown", "currentYardline", "isGoalPossession", "", "currentPossession", "currentTeamHalf", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCurrentYardsToFirstDown", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrentDown", "getCurrentYardline", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCurrentPossession", "getCurrentTeamHalf", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/database/DbAmericanFootballDownDistance;", "equals", "other", "", "hashCode", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DbAmericanFootballDownDistance implements Serializable {

    @Nullable
    private final Integer currentDown;

    @Nullable
    private final Integer currentPossession;

    @Nullable
    private final Integer currentTeamHalf;

    @Nullable
    private final Integer currentYardline;

    @Nullable
    private final Integer currentYardsToFirstDown;

    @Nullable
    private final Boolean isGoalPossession;

    public DbAmericanFootballDownDistance(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool, @Nullable Integer num4, @Nullable Integer num5) {
        this.currentYardsToFirstDown = num;
        this.currentDown = num2;
        this.currentYardline = num3;
        this.isGoalPossession = bool;
        this.currentPossession = num4;
        this.currentTeamHalf = num5;
    }

    public static /* synthetic */ DbAmericanFootballDownDistance copy$default(DbAmericanFootballDownDistance dbAmericanFootballDownDistance, Integer num, Integer num2, Integer num3, Boolean bool, Integer num4, Integer num5, int i, Object obj) {
        if ((i & 1) != 0) {
            num = dbAmericanFootballDownDistance.currentYardsToFirstDown;
        }
        if ((i & 2) != 0) {
            num2 = dbAmericanFootballDownDistance.currentDown;
        }
        if ((i & 4) != 0) {
            num3 = dbAmericanFootballDownDistance.currentYardline;
        }
        if ((i & 8) != 0) {
            bool = dbAmericanFootballDownDistance.isGoalPossession;
        }
        if ((i & 16) != 0) {
            num4 = dbAmericanFootballDownDistance.currentPossession;
        }
        if ((i & 32) != 0) {
            num5 = dbAmericanFootballDownDistance.currentTeamHalf;
        }
        Integer num6 = num4;
        Integer num7 = num5;
        return dbAmericanFootballDownDistance.copy(num, num2, num3, bool, num6, num7);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getCurrentYardsToFirstDown() {
        return this.currentYardsToFirstDown;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getCurrentDown() {
        return this.currentDown;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getCurrentYardline() {
        return this.currentYardline;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Boolean getIsGoalPossession() {
        return this.isGoalPossession;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getCurrentPossession() {
        return this.currentPossession;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getCurrentTeamHalf() {
        return this.currentTeamHalf;
    }

    @NotNull
    public final DbAmericanFootballDownDistance copy(@Nullable Integer currentYardsToFirstDown, @Nullable Integer currentDown, @Nullable Integer currentYardline, @Nullable Boolean isGoalPossession, @Nullable Integer currentPossession, @Nullable Integer currentTeamHalf) {
        return new DbAmericanFootballDownDistance(currentYardsToFirstDown, currentDown, currentYardline, isGoalPossession, currentPossession, currentTeamHalf);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbAmericanFootballDownDistance)) {
            return false;
        }
        DbAmericanFootballDownDistance dbAmericanFootballDownDistance = (DbAmericanFootballDownDistance) other;
        return Intrinsics.c(this.currentYardsToFirstDown, dbAmericanFootballDownDistance.currentYardsToFirstDown) && Intrinsics.c(this.currentDown, dbAmericanFootballDownDistance.currentDown) && Intrinsics.c(this.currentYardline, dbAmericanFootballDownDistance.currentYardline) && Intrinsics.c(this.isGoalPossession, dbAmericanFootballDownDistance.isGoalPossession) && Intrinsics.c(this.currentPossession, dbAmericanFootballDownDistance.currentPossession) && Intrinsics.c(this.currentTeamHalf, dbAmericanFootballDownDistance.currentTeamHalf);
    }

    @Nullable
    public final Integer getCurrentDown() {
        return this.currentDown;
    }

    @Nullable
    public final Integer getCurrentPossession() {
        return this.currentPossession;
    }

    @Nullable
    public final Integer getCurrentTeamHalf() {
        return this.currentTeamHalf;
    }

    @Nullable
    public final Integer getCurrentYardline() {
        return this.currentYardline;
    }

    @Nullable
    public final Integer getCurrentYardsToFirstDown() {
        return this.currentYardsToFirstDown;
    }

    public int hashCode() {
        Integer num = this.currentYardsToFirstDown;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.currentDown;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.currentYardline;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.isGoalPossession;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num4 = this.currentPossession;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.currentTeamHalf;
        return hashCode5 + (num5 != null ? num5.hashCode() : 0);
    }

    @Nullable
    public final Boolean isGoalPossession() {
        return this.isGoalPossession;
    }

    @NotNull
    public String toString() {
        Integer num = this.currentYardsToFirstDown;
        Integer num2 = this.currentDown;
        Integer num3 = this.currentYardline;
        Boolean bool = this.isGoalPossession;
        Integer num4 = this.currentPossession;
        Integer num5 = this.currentTeamHalf;
        StringBuilder k = wv8.k(num, "DbAmericanFootballDownDistance(currentYardsToFirstDown=", ", currentDown=", ", currentYardline=", num2);
        vxd.v(k, num3, ", isGoalPossession=", bool, ", currentPossession=");
        return fc6.l(num4, num5, ", currentTeamHalf=", ")", k);
    }
}

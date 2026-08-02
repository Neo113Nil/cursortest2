package com.sofascore.model.database;

import defpackage.dmi;
import defpackage.ljg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0014\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/sofascore/model/database/DbVote;", "", "id", "", "userChoice", "", "eventTimestamp", "", "success", "", "voteType", "Lcom/sofascore/model/database/VoteType;", "<init>", "(ILjava/lang/String;JZLcom/sofascore/model/database/VoteType;)V", "getId", "()I", "getUserChoice", "()Ljava/lang/String;", "getEventTimestamp", "()J", "getSuccess", "()Z", "getVoteType", "()Lcom/sofascore/model/database/VoteType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DbVote {
    private final long eventTimestamp;
    private final int id;
    private final boolean success;

    @NotNull
    private final String userChoice;

    @NotNull
    private final VoteType voteType;

    public DbVote(int i, @NotNull String str, long j, boolean z, @NotNull VoteType voteType) {
        str.getClass();
        voteType.getClass();
        this.id = i;
        this.userChoice = str;
        this.eventTimestamp = j;
        this.success = z;
        this.voteType = voteType;
    }

    public static /* synthetic */ DbVote copy$default(DbVote dbVote, int i, String str, long j, boolean z, VoteType voteType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dbVote.id;
        }
        if ((i2 & 2) != 0) {
            str = dbVote.userChoice;
        }
        if ((i2 & 4) != 0) {
            j = dbVote.eventTimestamp;
        }
        if ((i2 & 8) != 0) {
            z = dbVote.success;
        }
        if ((i2 & 16) != 0) {
            voteType = dbVote.voteType;
        }
        long j2 = j;
        return dbVote.copy(i, str, j2, z, voteType);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUserChoice() {
        return this.userChoice;
    }

    /* renamed from: component3, reason: from getter */
    public final long getEventTimestamp() {
        return this.eventTimestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final VoteType getVoteType() {
        return this.voteType;
    }

    @NotNull
    public final DbVote copy(int id, @NotNull String userChoice, long eventTimestamp, boolean success, @NotNull VoteType voteType) {
        userChoice.getClass();
        voteType.getClass();
        return new DbVote(id, userChoice, eventTimestamp, success, voteType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbVote)) {
            return false;
        }
        DbVote dbVote = (DbVote) other;
        return this.id == dbVote.id && Intrinsics.c(this.userChoice, dbVote.userChoice) && this.eventTimestamp == dbVote.eventTimestamp && this.success == dbVote.success && this.voteType == dbVote.voteType;
    }

    public final long getEventTimestamp() {
        return this.eventTimestamp;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public final String getUserChoice() {
        return this.userChoice;
    }

    @NotNull
    public final VoteType getVoteType() {
        return this.voteType;
    }

    public int hashCode() {
        return this.voteType.hashCode() + dmi.e(ljg.c(dmi.c(Integer.hashCode(this.id) * 31, 31, this.userChoice), 31, this.eventTimestamp), 31, this.success);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.userChoice;
        long j = this.eventTimestamp;
        boolean z = this.success;
        VoteType voteType = this.voteType;
        StringBuilder t = dmi.t(i, "DbVote(id=", ", userChoice=", str, ", eventTimestamp=");
        t.append(j);
        t.append(", success=");
        t.append(z);
        t.append(", voteType=");
        t.append(voteType);
        t.append(")");
        return t.toString();
    }
}

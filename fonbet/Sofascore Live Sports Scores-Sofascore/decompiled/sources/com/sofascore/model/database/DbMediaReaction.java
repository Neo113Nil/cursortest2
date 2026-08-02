package com.sofascore.model.database;

import defpackage.ljg;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/sofascore/model/database/DbMediaReaction;", "", "mediaPostId", "", "reaction", "Lcom/sofascore/model/database/MediaReactionType;", "timestamp", "", "shareCount", "<init>", "(ILcom/sofascore/model/database/MediaReactionType;JI)V", "getMediaPostId", "()I", "getReaction", "()Lcom/sofascore/model/database/MediaReactionType;", "getTimestamp", "()J", "getShareCount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DbMediaReaction {
    private final int mediaPostId;

    @Nullable
    private final MediaReactionType reaction;
    private final int shareCount;
    private final long timestamp;

    public DbMediaReaction(int i, @Nullable MediaReactionType mediaReactionType, long j, int i2) {
        this.mediaPostId = i;
        this.reaction = mediaReactionType;
        this.timestamp = j;
        this.shareCount = i2;
    }

    public static /* synthetic */ DbMediaReaction copy$default(DbMediaReaction dbMediaReaction, int i, MediaReactionType mediaReactionType, long j, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = dbMediaReaction.mediaPostId;
        }
        if ((i3 & 2) != 0) {
            mediaReactionType = dbMediaReaction.reaction;
        }
        if ((i3 & 4) != 0) {
            j = dbMediaReaction.timestamp;
        }
        if ((i3 & 8) != 0) {
            i2 = dbMediaReaction.shareCount;
        }
        int i4 = i2;
        return dbMediaReaction.copy(i, mediaReactionType, j, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMediaPostId() {
        return this.mediaPostId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final MediaReactionType getReaction() {
        return this.reaction;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final int getShareCount() {
        return this.shareCount;
    }

    @NotNull
    public final DbMediaReaction copy(int mediaPostId, @Nullable MediaReactionType reaction, long timestamp, int shareCount) {
        return new DbMediaReaction(mediaPostId, reaction, timestamp, shareCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbMediaReaction)) {
            return false;
        }
        DbMediaReaction dbMediaReaction = (DbMediaReaction) other;
        return this.mediaPostId == dbMediaReaction.mediaPostId && this.reaction == dbMediaReaction.reaction && this.timestamp == dbMediaReaction.timestamp && this.shareCount == dbMediaReaction.shareCount;
    }

    public final int getMediaPostId() {
        return this.mediaPostId;
    }

    @Nullable
    public final MediaReactionType getReaction() {
        return this.reaction;
    }

    public final int getShareCount() {
        return this.shareCount;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.mediaPostId) * 31;
        MediaReactionType mediaReactionType = this.reaction;
        return Integer.hashCode(this.shareCount) + ljg.c((hashCode + (mediaReactionType == null ? 0 : mediaReactionType.hashCode())) * 31, 31, this.timestamp);
    }

    @NotNull
    public String toString() {
        return "DbMediaReaction(mediaPostId=" + this.mediaPostId + ", reaction=" + this.reaction + ", timestamp=" + this.timestamp + ", shareCount=" + this.shareCount + ")";
    }
}

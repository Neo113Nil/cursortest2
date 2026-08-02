package com.sofascore.model.database;

import defpackage.lnb;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/sofascore/model/database/DbMediaLike;", "", "mediaPostId", "", "reaction", "Lcom/sofascore/model/database/MediaReactionType;", "timestamp", "", "<init>", "(ILcom/sofascore/model/database/MediaReactionType;J)V", "getMediaPostId", "()I", "getReaction", "()Lcom/sofascore/model/database/MediaReactionType;", "getTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DbMediaLike {
    private final int mediaPostId;

    @Nullable
    private final MediaReactionType reaction;
    private final long timestamp;

    public DbMediaLike(int i, @Nullable MediaReactionType mediaReactionType, long j) {
        this.mediaPostId = i;
        this.reaction = mediaReactionType;
        this.timestamp = j;
    }

    public static /* synthetic */ DbMediaLike copy$default(DbMediaLike dbMediaLike, int i, MediaReactionType mediaReactionType, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dbMediaLike.mediaPostId;
        }
        if ((i2 & 2) != 0) {
            mediaReactionType = dbMediaLike.reaction;
        }
        if ((i2 & 4) != 0) {
            j = dbMediaLike.timestamp;
        }
        return dbMediaLike.copy(i, mediaReactionType, j);
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

    @NotNull
    public final DbMediaLike copy(int mediaPostId, @Nullable MediaReactionType reaction, long timestamp) {
        return new DbMediaLike(mediaPostId, reaction, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbMediaLike)) {
            return false;
        }
        DbMediaLike dbMediaLike = (DbMediaLike) other;
        return this.mediaPostId == dbMediaLike.mediaPostId && this.reaction == dbMediaLike.reaction && this.timestamp == dbMediaLike.timestamp;
    }

    public final int getMediaPostId() {
        return this.mediaPostId;
    }

    @Nullable
    public final MediaReactionType getReaction() {
        return this.reaction;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.mediaPostId) * 31;
        MediaReactionType mediaReactionType = this.reaction;
        return Long.hashCode(this.timestamp) + ((hashCode + (mediaReactionType == null ? 0 : mediaReactionType.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        int i = this.mediaPostId;
        MediaReactionType mediaReactionType = this.reaction;
        long j = this.timestamp;
        StringBuilder sb = new StringBuilder("DbMediaLike(mediaPostId=");
        sb.append(i);
        sb.append(", reaction=");
        sb.append(mediaReactionType);
        sb.append(", timestamp=");
        return lnb.l(j, ")", sb);
    }
}

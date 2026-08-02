package com.sofascore.model.database;

import defpackage.lnb;
import defpackage.wv8;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/sofascore/model/database/DbMediaShare;", "", "mediaPostId", "", "shareCount", "timestamp", "", "<init>", "(IIJ)V", "getMediaPostId", "()I", "getShareCount", "getTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DbMediaShare {
    private final int mediaPostId;
    private final int shareCount;
    private final long timestamp;

    public DbMediaShare(int i, int i2, long j) {
        this.mediaPostId = i;
        this.shareCount = i2;
        this.timestamp = j;
    }

    public static /* synthetic */ DbMediaShare copy$default(DbMediaShare dbMediaShare, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = dbMediaShare.mediaPostId;
        }
        if ((i3 & 2) != 0) {
            i2 = dbMediaShare.shareCount;
        }
        if ((i3 & 4) != 0) {
            j = dbMediaShare.timestamp;
        }
        return dbMediaShare.copy(i, i2, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMediaPostId() {
        return this.mediaPostId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getShareCount() {
        return this.shareCount;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final DbMediaShare copy(int mediaPostId, int shareCount, long timestamp) {
        return new DbMediaShare(mediaPostId, shareCount, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbMediaShare)) {
            return false;
        }
        DbMediaShare dbMediaShare = (DbMediaShare) other;
        return this.mediaPostId == dbMediaShare.mediaPostId && this.shareCount == dbMediaShare.shareCount && this.timestamp == dbMediaShare.timestamp;
    }

    public final int getMediaPostId() {
        return this.mediaPostId;
    }

    public final int getShareCount() {
        return this.shareCount;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + wv8.a(this.shareCount, Integer.hashCode(this.mediaPostId) * 31, 31);
    }

    @NotNull
    public String toString() {
        return lnb.l(this.timestamp, ")", lnb.s(this.mediaPostId, this.shareCount, "DbMediaShare(mediaPostId=", ", shareCount=", ", timestamp="));
    }
}

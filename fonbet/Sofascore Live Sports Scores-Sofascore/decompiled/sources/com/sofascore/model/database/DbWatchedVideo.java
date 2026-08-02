package com.sofascore.model.database;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/sofascore/model/database/DbWatchedVideo;", "", "id", "", "timestamp", "", "<init>", "(IJ)V", "getId", "()I", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DbWatchedVideo {
    private final int id;
    private final long timestamp;

    public DbWatchedVideo(int i, long j) {
        this.id = i;
        this.timestamp = j;
    }

    public static /* synthetic */ DbWatchedVideo copy$default(DbWatchedVideo dbWatchedVideo, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dbWatchedVideo.id;
        }
        if ((i2 & 2) != 0) {
            j = dbWatchedVideo.timestamp;
        }
        return dbWatchedVideo.copy(i, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final DbWatchedVideo copy(int id, long timestamp) {
        return new DbWatchedVideo(id, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbWatchedVideo)) {
            return false;
        }
        DbWatchedVideo dbWatchedVideo = (DbWatchedVideo) other;
        return this.id == dbWatchedVideo.id && this.timestamp == dbWatchedVideo.timestamp;
    }

    public final int getId() {
        return this.id;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + (Integer.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return "DbWatchedVideo(id=" + this.id + ", timestamp=" + this.timestamp + ")";
    }
}

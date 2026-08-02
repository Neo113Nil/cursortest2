package com.sofascore.model.database;

import defpackage.ljg;
import defpackage.lnb;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/sofascore/model/database/DbSeenNews;", "", "id", "", "timestamp", "<init>", "(JJ)V", "getId", "()J", "getTimestamp", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DbSeenNews {
    private final long id;
    private final long timestamp;

    public DbSeenNews(long j, long j2) {
        this.id = j;
        this.timestamp = j2;
    }

    public static /* synthetic */ DbSeenNews copy$default(DbSeenNews dbSeenNews, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dbSeenNews.id;
        }
        if ((i & 2) != 0) {
            j2 = dbSeenNews.timestamp;
        }
        return dbSeenNews.copy(j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final DbSeenNews copy(long id, long timestamp) {
        return new DbSeenNews(id, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbSeenNews)) {
            return false;
        }
        DbSeenNews dbSeenNews = (DbSeenNews) other;
        return this.id == dbSeenNews.id && this.timestamp == dbSeenNews.timestamp;
    }

    public final long getId() {
        return this.id;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return lnb.l(this.timestamp, ")", ljg.o("DbSeenNews(id=", this.id, ", timestamp="));
    }
}

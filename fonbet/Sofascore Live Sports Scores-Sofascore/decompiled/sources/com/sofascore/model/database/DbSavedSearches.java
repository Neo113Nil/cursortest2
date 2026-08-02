package com.sofascore.model.database;

import com.appsflyer.internal.i;
import defpackage.dmi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/sofascore/model/database/DbSavedSearches;", "", "id", "", "entity", "", "json", "timestamp", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;J)V", "getId", "()I", "getEntity", "()Ljava/lang/String;", "getJson", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DbSavedSearches {

    @NotNull
    private final String entity;
    private final int id;

    @NotNull
    private final String json;
    private final long timestamp;

    public /* synthetic */ DbSavedSearches(int i, String str, String str2, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0L : j);
    }

    public static /* synthetic */ DbSavedSearches copy$default(DbSavedSearches dbSavedSearches, int i, String str, String str2, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dbSavedSearches.id;
        }
        if ((i2 & 2) != 0) {
            str = dbSavedSearches.entity;
        }
        if ((i2 & 4) != 0) {
            str2 = dbSavedSearches.json;
        }
        if ((i2 & 8) != 0) {
            j = dbSavedSearches.timestamp;
        }
        String str3 = str2;
        return dbSavedSearches.copy(i, str, str3, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEntity() {
        return this.entity;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getJson() {
        return this.json;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final DbSavedSearches copy(int id, @NotNull String entity, @NotNull String json, long timestamp) {
        entity.getClass();
        json.getClass();
        return new DbSavedSearches(id, entity, json, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbSavedSearches)) {
            return false;
        }
        DbSavedSearches dbSavedSearches = (DbSavedSearches) other;
        return this.id == dbSavedSearches.id && Intrinsics.c(this.entity, dbSavedSearches.entity) && Intrinsics.c(this.json, dbSavedSearches.json) && this.timestamp == dbSavedSearches.timestamp;
    }

    @NotNull
    public final String getEntity() {
        return this.entity;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getJson() {
        return this.json;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + dmi.c(dmi.c(Integer.hashCode(this.id) * 31, 31, this.entity), 31, this.json);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.entity;
        String str2 = this.json;
        long j = this.timestamp;
        StringBuilder t = dmi.t(i, "DbSavedSearches(id=", ", entity=", str, ", json=");
        i.n(j, str2, ", timestamp=", t);
        t.append(")");
        return t.toString();
    }

    public DbSavedSearches(int i, @NotNull String str, @NotNull String str2, long j) {
        str.getClass();
        str2.getClass();
        this.id = i;
        this.entity = str;
        this.json = str2;
        this.timestamp = j;
    }

    public DbSavedSearches() {
        this(0, null, null, 0L, 15, null);
    }
}

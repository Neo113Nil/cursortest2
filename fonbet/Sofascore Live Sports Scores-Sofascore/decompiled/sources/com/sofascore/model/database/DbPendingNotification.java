package com.sofascore.model.database;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.lnb;
import defpackage.mz1;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0006HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/sofascore/model/database/DbPendingNotification;", "", "id", "", "notificationId", "title", "", PglCryptUtils.KEY_MESSAGE, "updatableNotificationId", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getNotificationId", "getTitle", "()Ljava/lang/String;", "getMessage", "getUpdatableNotificationId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DbPendingNotification {
    private final int id;

    @NotNull
    private final String message;
    private final int notificationId;

    @NotNull
    private final String title;

    @Nullable
    private final String updatableNotificationId;

    public DbPendingNotification(int i, int i2, @NotNull String str, @NotNull String str2, @Nullable String str3) {
        str.getClass();
        str2.getClass();
        this.id = i;
        this.notificationId = i2;
        this.title = str;
        this.message = str2;
        this.updatableNotificationId = str3;
    }

    public static /* synthetic */ DbPendingNotification copy$default(DbPendingNotification dbPendingNotification, int i, int i2, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = dbPendingNotification.id;
        }
        if ((i3 & 2) != 0) {
            i2 = dbPendingNotification.notificationId;
        }
        if ((i3 & 4) != 0) {
            str = dbPendingNotification.title;
        }
        if ((i3 & 8) != 0) {
            str2 = dbPendingNotification.message;
        }
        if ((i3 & 16) != 0) {
            str3 = dbPendingNotification.updatableNotificationId;
        }
        String str4 = str3;
        String str5 = str;
        return dbPendingNotification.copy(i, i2, str5, str2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getNotificationId() {
        return this.notificationId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getUpdatableNotificationId() {
        return this.updatableNotificationId;
    }

    @NotNull
    public final DbPendingNotification copy(int id, int notificationId, @NotNull String title, @NotNull String message, @Nullable String updatableNotificationId) {
        title.getClass();
        message.getClass();
        return new DbPendingNotification(id, notificationId, title, message, updatableNotificationId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbPendingNotification)) {
            return false;
        }
        DbPendingNotification dbPendingNotification = (DbPendingNotification) other;
        return this.id == dbPendingNotification.id && this.notificationId == dbPendingNotification.notificationId && Intrinsics.c(this.title, dbPendingNotification.title) && Intrinsics.c(this.message, dbPendingNotification.message) && Intrinsics.c(this.updatableNotificationId, dbPendingNotification.updatableNotificationId);
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final int getNotificationId() {
        return this.notificationId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUpdatableNotificationId() {
        return this.updatableNotificationId;
    }

    public int hashCode() {
        int c = dmi.c(dmi.c(wv8.a(this.notificationId, Integer.hashCode(this.id) * 31, 31), 31, this.title), 31, this.message);
        String str = this.updatableNotificationId;
        return c + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.id;
        int i2 = this.notificationId;
        String str = this.title;
        String str2 = this.message;
        String str3 = this.updatableNotificationId;
        StringBuilder s = lnb.s(i, i2, "DbPendingNotification(id=", ", notificationId=", ", title=");
        bf3.v(s, str, ", message=", str2, ", updatableNotificationId=");
        return mz1.o(s, str3, ")");
    }
}

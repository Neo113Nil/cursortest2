package com.sofascore.model.database;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import defpackage.dmi;
import defpackage.mz1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/sofascore/model/database/DbNatsEvent;", "", "id", "", "topic", "", PglCryptUtils.KEY_MESSAGE, "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getTopic", "()Ljava/lang/String;", "getMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DbNatsEvent {
    private final int id;

    @NotNull
    private final String message;

    @NotNull
    private final String topic;

    public DbNatsEvent(int i, @NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.id = i;
        this.topic = str;
        this.message = str2;
    }

    public static /* synthetic */ DbNatsEvent copy$default(DbNatsEvent dbNatsEvent, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dbNatsEvent.id;
        }
        if ((i2 & 2) != 0) {
            str = dbNatsEvent.topic;
        }
        if ((i2 & 4) != 0) {
            str2 = dbNatsEvent.message;
        }
        return dbNatsEvent.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final DbNatsEvent copy(int id, @NotNull String topic, @NotNull String message) {
        topic.getClass();
        message.getClass();
        return new DbNatsEvent(id, topic, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbNatsEvent)) {
            return false;
        }
        DbNatsEvent dbNatsEvent = (DbNatsEvent) other;
        return this.id == dbNatsEvent.id && Intrinsics.c(this.topic, dbNatsEvent.topic) && Intrinsics.c(this.message, dbNatsEvent.message);
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        return this.message.hashCode() + dmi.c(Integer.hashCode(this.id) * 31, 31, this.topic);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.topic;
        return mz1.o(dmi.t(i, "DbNatsEvent(id=", ", topic=", str, ", message="), this.message, ")");
    }

    public /* synthetic */ DbNatsEvent(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, str2);
    }
}

package com.sofascore.model.mvvm.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/sofascore/model/mvvm/model/DbMyPlayer;", "", "playerId", "", "notificationsEnabled", "", "<init>", "(IZ)V", "getPlayerId", "()I", "getNotificationsEnabled", "()Z", "setNotificationsEnabled", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DbMyPlayer {
    private boolean notificationsEnabled;
    private final int playerId;

    public DbMyPlayer(int i, boolean z) {
        this.playerId = i;
        this.notificationsEnabled = z;
    }

    public static /* synthetic */ DbMyPlayer copy$default(DbMyPlayer dbMyPlayer, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dbMyPlayer.playerId;
        }
        if ((i2 & 2) != 0) {
            z = dbMyPlayer.notificationsEnabled;
        }
        return dbMyPlayer.copy(i, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPlayerId() {
        return this.playerId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getNotificationsEnabled() {
        return this.notificationsEnabled;
    }

    @NotNull
    public final DbMyPlayer copy(int playerId, boolean notificationsEnabled) {
        return new DbMyPlayer(playerId, notificationsEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbMyPlayer)) {
            return false;
        }
        DbMyPlayer dbMyPlayer = (DbMyPlayer) other;
        return this.playerId == dbMyPlayer.playerId && this.notificationsEnabled == dbMyPlayer.notificationsEnabled;
    }

    public final boolean getNotificationsEnabled() {
        return this.notificationsEnabled;
    }

    public final int getPlayerId() {
        return this.playerId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.notificationsEnabled) + (Integer.hashCode(this.playerId) * 31);
    }

    public final void setNotificationsEnabled(boolean z) {
        this.notificationsEnabled = z;
    }

    @NotNull
    public String toString() {
        return "DbMyPlayer(playerId=" + this.playerId + ", notificationsEnabled=" + this.notificationsEnabled + ")";
    }
}

package com.sofascore.model.notifications;

import defpackage.dmi;
import defpackage.mz1;
import defpackage.w1l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/sofascore/model/notifications/NotificationSetting;", "", "group", "", "name", "enabled", "", "channelId", "groupInSettingsScreen", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getGroup", "()Ljava/lang/String;", "getName", "getEnabled", "()Z", "getChannelId", "getGroupInSettingsScreen", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NotificationSetting {

    @NotNull
    private final String channelId;
    private final boolean enabled;

    @NotNull
    private final String group;

    @NotNull
    private final String groupInSettingsScreen;

    @NotNull
    private final String name;

    public NotificationSetting(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4) {
        w1l.y(str, str2, str3, str4);
        this.group = str;
        this.name = str2;
        this.enabled = z;
        this.channelId = str3;
        this.groupInSettingsScreen = str4;
    }

    public static /* synthetic */ NotificationSetting copy$default(NotificationSetting notificationSetting, String str, String str2, boolean z, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationSetting.group;
        }
        if ((i & 2) != 0) {
            str2 = notificationSetting.name;
        }
        if ((i & 4) != 0) {
            z = notificationSetting.enabled;
        }
        if ((i & 8) != 0) {
            str3 = notificationSetting.channelId;
        }
        if ((i & 16) != 0) {
            str4 = notificationSetting.groupInSettingsScreen;
        }
        String str5 = str4;
        boolean z2 = z;
        return notificationSetting.copy(str, str2, z2, str3, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getGroup() {
        return this.group;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getGroupInSettingsScreen() {
        return this.groupInSettingsScreen;
    }

    @NotNull
    public final NotificationSetting copy(@NotNull String group, @NotNull String name, boolean enabled, @NotNull String channelId, @NotNull String groupInSettingsScreen) {
        group.getClass();
        name.getClass();
        channelId.getClass();
        groupInSettingsScreen.getClass();
        return new NotificationSetting(group, name, enabled, channelId, groupInSettingsScreen);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationSetting)) {
            return false;
        }
        NotificationSetting notificationSetting = (NotificationSetting) other;
        return Intrinsics.c(this.group, notificationSetting.group) && Intrinsics.c(this.name, notificationSetting.name) && this.enabled == notificationSetting.enabled && Intrinsics.c(this.channelId, notificationSetting.channelId) && Intrinsics.c(this.groupInSettingsScreen, notificationSetting.groupInSettingsScreen);
    }

    @NotNull
    public final String getChannelId() {
        return this.channelId;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final String getGroup() {
        return this.group;
    }

    @NotNull
    public final String getGroupInSettingsScreen() {
        return this.groupInSettingsScreen;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.groupInSettingsScreen.hashCode() + dmi.c(dmi.e(dmi.c(this.group.hashCode() * 31, 31, this.name), 31, this.enabled), 31, this.channelId);
    }

    @NotNull
    public String toString() {
        String str = this.group;
        String str2 = this.name;
        boolean z = this.enabled;
        String str3 = this.channelId;
        String str4 = this.groupInSettingsScreen;
        StringBuilder s = mz1.s("NotificationSetting(group=", str, ", name=", str2, ", enabled=");
        s.append(z);
        s.append(", channelId=");
        s.append(str3);
        s.append(", groupInSettingsScreen=");
        return mz1.o(s, str4, ")");
    }

    public /* synthetic */ NotificationSetting(String str, String str2, boolean z, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, str3, (i & 16) != 0 ? str : str4);
    }
}

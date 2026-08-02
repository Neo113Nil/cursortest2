package com.sofascore.model.notifications;

import defpackage.dmi;
import defpackage.w1l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/sofascore/model/notifications/SofascoreNotification;", "", "isPing", "", "isSync", "isFetchConfig", "textToSpeech", "", "notificationType", "", "notificationData", "Lcom/sofascore/model/notifications/NotificationData;", "<init>", "(ZZZLjava/lang/String;Ljava/util/List;Lcom/sofascore/model/notifications/NotificationData;)V", "()Z", "getTextToSpeech", "()Ljava/lang/String;", "getNotificationType", "()Ljava/util/List;", "getNotificationData", "()Lcom/sofascore/model/notifications/NotificationData;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SofascoreNotification {
    private final boolean isFetchConfig;
    private final boolean isPing;
    private final boolean isSync;

    @Nullable
    private final NotificationData notificationData;

    @Nullable
    private final List<String> notificationType;

    @Nullable
    private final String textToSpeech;

    public SofascoreNotification(boolean z, boolean z2, boolean z3, @Nullable String str, @Nullable List<String> list, @Nullable NotificationData notificationData) {
        this.isPing = z;
        this.isSync = z2;
        this.isFetchConfig = z3;
        this.textToSpeech = str;
        this.notificationType = list;
        this.notificationData = notificationData;
    }

    public static /* synthetic */ SofascoreNotification copy$default(SofascoreNotification sofascoreNotification, boolean z, boolean z2, boolean z3, String str, List list, NotificationData notificationData, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sofascoreNotification.isPing;
        }
        if ((i & 2) != 0) {
            z2 = sofascoreNotification.isSync;
        }
        if ((i & 4) != 0) {
            z3 = sofascoreNotification.isFetchConfig;
        }
        if ((i & 8) != 0) {
            str = sofascoreNotification.textToSpeech;
        }
        if ((i & 16) != 0) {
            list = sofascoreNotification.notificationType;
        }
        if ((i & 32) != 0) {
            notificationData = sofascoreNotification.notificationData;
        }
        List list2 = list;
        NotificationData notificationData2 = notificationData;
        return sofascoreNotification.copy(z, z2, z3, str, list2, notificationData2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsPing() {
        return this.isPing;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSync() {
        return this.isSync;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsFetchConfig() {
        return this.isFetchConfig;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getTextToSpeech() {
        return this.textToSpeech;
    }

    @Nullable
    public final List<String> component5() {
        return this.notificationType;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final NotificationData getNotificationData() {
        return this.notificationData;
    }

    @NotNull
    public final SofascoreNotification copy(boolean isPing, boolean isSync, boolean isFetchConfig, @Nullable String textToSpeech, @Nullable List<String> notificationType, @Nullable NotificationData notificationData) {
        return new SofascoreNotification(isPing, isSync, isFetchConfig, textToSpeech, notificationType, notificationData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SofascoreNotification)) {
            return false;
        }
        SofascoreNotification sofascoreNotification = (SofascoreNotification) other;
        return this.isPing == sofascoreNotification.isPing && this.isSync == sofascoreNotification.isSync && this.isFetchConfig == sofascoreNotification.isFetchConfig && Intrinsics.c(this.textToSpeech, sofascoreNotification.textToSpeech) && Intrinsics.c(this.notificationType, sofascoreNotification.notificationType) && Intrinsics.c(this.notificationData, sofascoreNotification.notificationData);
    }

    @Nullable
    public final NotificationData getNotificationData() {
        return this.notificationData;
    }

    @Nullable
    public final List<String> getNotificationType() {
        return this.notificationType;
    }

    @Nullable
    public final String getTextToSpeech() {
        return this.textToSpeech;
    }

    public int hashCode() {
        int e = dmi.e(dmi.e(Boolean.hashCode(this.isPing) * 31, 31, this.isSync), 31, this.isFetchConfig);
        String str = this.textToSpeech;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.notificationType;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        NotificationData notificationData = this.notificationData;
        return hashCode2 + (notificationData != null ? notificationData.hashCode() : 0);
    }

    public final boolean isFetchConfig() {
        return this.isFetchConfig;
    }

    public final boolean isPing() {
        return this.isPing;
    }

    public final boolean isSync() {
        return this.isSync;
    }

    @NotNull
    public String toString() {
        boolean z = this.isPing;
        boolean z2 = this.isSync;
        boolean z3 = this.isFetchConfig;
        String str = this.textToSpeech;
        List<String> list = this.notificationType;
        NotificationData notificationData = this.notificationData;
        StringBuilder k = w1l.k("SofascoreNotification(isPing=", z, ", isSync=", z2, ", isFetchConfig=");
        k.append(z3);
        k.append(", textToSpeech=");
        k.append(str);
        k.append(", notificationType=");
        k.append(list);
        k.append(", notificationData=");
        k.append(notificationData);
        k.append(")");
        return k.toString();
    }
}

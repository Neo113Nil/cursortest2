package ru.ozon.inapp.push.sdk.internal.data.dto;

import C.o0;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessResponse;", "", "notificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "refreshIntervalSec", "", "pixelUrl", "", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/lang/Integer;Ljava/lang/String;)V", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getRefreshIntervalSec", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPixelUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/lang/Integer;Ljava/lang/String;)Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessResponse;", "equals", "", "other", "hashCode", "toString", "in-app-push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ActionProcessResponse {
    private final NotificationDTO notificationBar;
    private final String pixelUrl;
    private final Integer refreshIntervalSec;

    public ActionProcessResponse(@i(name = "notificationBar") NotificationDTO notificationDTO, @i(name = "refreshInterval") Integer num, @i(name = "pixelUrl") String str) {
        this.notificationBar = notificationDTO;
        this.refreshIntervalSec = num;
        this.pixelUrl = str;
    }

    public static /* synthetic */ ActionProcessResponse copy$default(ActionProcessResponse actionProcessResponse, NotificationDTO notificationDTO, Integer num, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            notificationDTO = actionProcessResponse.notificationBar;
        }
        if ((i11 & 2) != 0) {
            num = actionProcessResponse.refreshIntervalSec;
        }
        if ((i11 & 4) != 0) {
            str = actionProcessResponse.pixelUrl;
        }
        return actionProcessResponse.copy(notificationDTO, num, str);
    }

    /* renamed from: component1, reason: from getter */
    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getRefreshIntervalSec() {
        return this.refreshIntervalSec;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPixelUrl() {
        return this.pixelUrl;
    }

    @NotNull
    public final ActionProcessResponse copy(@i(name = "notificationBar") NotificationDTO notificationBar, @i(name = "refreshInterval") Integer refreshIntervalSec, @i(name = "pixelUrl") String pixelUrl) {
        return new ActionProcessResponse(notificationBar, refreshIntervalSec, pixelUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionProcessResponse)) {
            return false;
        }
        ActionProcessResponse actionProcessResponse = (ActionProcessResponse) other;
        return Intrinsics.d(this.notificationBar, actionProcessResponse.notificationBar) && Intrinsics.d(this.refreshIntervalSec, actionProcessResponse.refreshIntervalSec) && Intrinsics.d(this.pixelUrl, actionProcessResponse.pixelUrl);
    }

    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    public final String getPixelUrl() {
        return this.pixelUrl;
    }

    public final Integer getRefreshIntervalSec() {
        return this.refreshIntervalSec;
    }

    public int hashCode() {
        NotificationDTO notificationDTO = this.notificationBar;
        int hashCode = (notificationDTO == null ? 0 : notificationDTO.hashCode()) * 31;
        Integer num = this.refreshIntervalSec;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.pixelUrl;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        NotificationDTO notificationDTO = this.notificationBar;
        Integer num = this.refreshIntervalSec;
        String str = this.pixelUrl;
        StringBuilder sb2 = new StringBuilder("ActionProcessResponse(notificationBar=");
        sb2.append(notificationDTO);
        sb2.append(", refreshIntervalSec=");
        sb2.append(num);
        sb2.append(", pixelUrl=");
        return o0.c(sb2, str, ")");
    }
}

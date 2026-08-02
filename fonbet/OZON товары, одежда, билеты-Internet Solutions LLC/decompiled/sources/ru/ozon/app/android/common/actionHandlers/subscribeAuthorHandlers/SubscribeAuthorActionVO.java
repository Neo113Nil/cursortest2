package ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers;

import G.g;
import Kk.C3532b;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/subscribeAuthorHandlers/SubscribeAuthorActionVO;", "", "", "actionId", "authorId", "", "success", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "successNotification", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActionId", "getAuthorId", "Z", "getSuccess", "()Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getSuccessNotification", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SubscribeAuthorActionVO {
    private final String actionId;

    @NotNull
    private final String authorId;
    private final NotificationDTO notification;
    private final boolean success;
    private final NotificationDTO successNotification;

    public SubscribeAuthorActionVO(String str, @NotNull String authorId, boolean z11, NotificationDTO notificationDTO, NotificationDTO notificationDTO2) {
        Intrinsics.checkNotNullParameter(authorId, "authorId");
        this.actionId = str;
        this.authorId = authorId;
        this.success = z11;
        this.notification = notificationDTO;
        this.successNotification = notificationDTO2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscribeAuthorActionVO)) {
            return false;
        }
        SubscribeAuthorActionVO subscribeAuthorActionVO = (SubscribeAuthorActionVO) other;
        return Intrinsics.d(this.actionId, subscribeAuthorActionVO.actionId) && Intrinsics.d(this.authorId, subscribeAuthorActionVO.authorId) && this.success == subscribeAuthorActionVO.success && Intrinsics.d(this.notification, subscribeAuthorActionVO.notification) && Intrinsics.d(this.successNotification, subscribeAuthorActionVO.successNotification);
    }

    public final String getActionId() {
        return this.actionId;
    }

    @NotNull
    public final String getAuthorId() {
        return this.authorId;
    }

    public final NotificationDTO getNotification() {
        return this.notification;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final NotificationDTO getSuccessNotification() {
        return this.successNotification;
    }

    public int hashCode() {
        String str = this.actionId;
        int a11 = C3532b.a(g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.authorId), 31, this.success);
        NotificationDTO notificationDTO = this.notification;
        int hashCode = (a11 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31;
        NotificationDTO notificationDTO2 = this.successNotification;
        return hashCode + (notificationDTO2 != null ? notificationDTO2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.actionId;
        String str2 = this.authorId;
        boolean z11 = this.success;
        NotificationDTO notificationDTO = this.notification;
        NotificationDTO notificationDTO2 = this.successNotification;
        StringBuilder d11 = C3660k.d("SubscribeAuthorActionVO(actionId=", str, ", authorId=", str2, ", success=");
        d11.append(z11);
        d11.append(", notification=");
        d11.append(notificationDTO);
        d11.append(", successNotification=");
        d11.append(notificationDTO2);
        d11.append(")");
        return d11.toString();
    }
}

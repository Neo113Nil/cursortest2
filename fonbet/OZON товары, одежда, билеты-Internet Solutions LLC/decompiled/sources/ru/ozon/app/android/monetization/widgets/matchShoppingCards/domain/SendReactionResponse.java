package ru.ozon.app.android.monetization.widgets.matchShoppingCards.domain;

import Tg.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/domain/SendReactionResponse;", "", "", "addedToSelection", "LTg/b;", "action", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "<init>", "(ZLTg/b;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getAddedToSelection", "()Z", "LTg/b;", "getAction", "()LTg/b;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SendReactionResponse {
    private final b action;
    private final boolean addedToSelection;
    private final NotificationDTO notification;

    public SendReactionResponse(boolean z11, b bVar, NotificationDTO notificationDTO) {
        this.addedToSelection = z11;
        this.action = bVar;
        this.notification = notificationDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendReactionResponse)) {
            return false;
        }
        SendReactionResponse sendReactionResponse = (SendReactionResponse) other;
        return this.addedToSelection == sendReactionResponse.addedToSelection && Intrinsics.d(this.action, sendReactionResponse.action) && Intrinsics.d(this.notification, sendReactionResponse.notification);
    }

    public final b getAction() {
        return this.action;
    }

    public final boolean getAddedToSelection() {
        return this.addedToSelection;
    }

    public final NotificationDTO getNotification() {
        return this.notification;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.addedToSelection) * 31;
        b bVar = this.action;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        NotificationDTO notificationDTO = this.notification;
        return hashCode2 + (notificationDTO != null ? notificationDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SendReactionResponse(addedToSelection=" + this.addedToSelection + ", action=" + this.action + ", notification=" + this.notification + ")";
    }
}

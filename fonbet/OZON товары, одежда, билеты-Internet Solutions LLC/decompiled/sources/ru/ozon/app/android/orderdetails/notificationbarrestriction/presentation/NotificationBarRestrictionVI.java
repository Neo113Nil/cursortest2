package ru.ozon.app.android.orderdetails.notificationbarrestriction.presentation;

import Bi.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u0007\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/orderdetails/notificationbarrestriction/presentation/NotificationBarRestrictionVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "", "isShown", "<init>", "(JLru/ozon/uni/atoms/data/notification/NotificationDTO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Z", "()Z", "setShown", "(Z)V", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class NotificationBarRestrictionVI implements c {
    private final long id;
    private boolean isShown;

    @NotNull
    private final NotificationDTO notification;

    public NotificationBarRestrictionVI(long j11, @NotNull NotificationDTO notification, boolean z11) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        this.id = j11;
        this.notification = notification;
        this.isShown = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationBarRestrictionVI)) {
            return false;
        }
        NotificationBarRestrictionVI notificationBarRestrictionVI = (NotificationBarRestrictionVI) other;
        return this.id == notificationBarRestrictionVI.id && Intrinsics.d(this.notification, notificationBarRestrictionVI.notification) && this.isShown == notificationBarRestrictionVI.isShown;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final NotificationDTO getNotification() {
        return this.notification;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return Boolean.hashCode(this.isShown) + ((this.notification.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
    }

    /* renamed from: isShown, reason: from getter */
    public final boolean getIsShown() {
        return this.isShown;
    }

    public final void setShown(boolean z11) {
        this.isShown = z11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        NotificationDTO notificationDTO = this.notification;
        boolean z11 = this.isShown;
        StringBuilder sb2 = new StringBuilder("NotificationBarRestrictionVI(id=");
        sb2.append(j11);
        sb2.append(", notification=");
        sb2.append(notificationDTO);
        return b.f(sb2, ", isShown=", z11, ")");
    }

    public /* synthetic */ NotificationBarRestrictionVI(long j11, NotificationDTO notificationDTO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, notificationDTO, (i11 & 4) != 0 ? false : z11);
    }
}

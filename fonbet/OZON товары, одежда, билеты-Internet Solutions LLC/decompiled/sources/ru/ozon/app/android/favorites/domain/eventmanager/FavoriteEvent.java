package ru.ozon.app.android.favorites.domain.eventmanager;

import Ak.b;
import Kk.C3532b;
import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent;", "", "<init>", "()V", "FavoriteStateUpdated", "FavoriteEntityUpdated", "OnFavoriteListEdited", "OnFavoriteWishlistEdited", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent$FavoriteEntityUpdated;", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent$FavoriteStateUpdated;", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent$OnFavoriteListEdited;", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent$OnFavoriteWishlistEdited;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class FavoriteEvent {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent$FavoriteEntityUpdated;", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FavoriteEntityUpdated extends FavoriteEvent {

        @NotNull
        public static final FavoriteEntityUpdated INSTANCE = new FavoriteEntityUpdated();

        private FavoriteEntityUpdated() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof FavoriteEntityUpdated);
        }

        public int hashCode() {
            return -2064170913;
        }

        @NotNull
        public String toString() {
            return "FavoriteEntityUpdated";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent$FavoriteStateUpdated;", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FavoriteStateUpdated extends FavoriteEvent {

        @NotNull
        public static final FavoriteStateUpdated INSTANCE = new FavoriteStateUpdated();

        private FavoriteStateUpdated() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof FavoriteStateUpdated);
        }

        public int hashCode() {
            return 1994039555;
        }

        @NotNull
        public String toString() {
            return "FavoriteStateUpdated";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent$OnFavoriteListEdited;", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent;", "", "message", "", "messageIsShowed", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Z", "getMessageIsShowed", "()Z", "setMessageIsShowed", "(Z)V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnFavoriteListEdited extends FavoriteEvent {
        private final String message;
        private boolean messageIsShowed;

        /* JADX WARN: Multi-variable type inference failed */
        public OnFavoriteListEdited() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnFavoriteListEdited)) {
                return false;
            }
            OnFavoriteListEdited onFavoriteListEdited = (OnFavoriteListEdited) other;
            return Intrinsics.d(this.message, onFavoriteListEdited.message) && this.messageIsShowed == onFavoriteListEdited.messageIsShowed;
        }

        public final String getMessage() {
            return this.message;
        }

        public final boolean getMessageIsShowed() {
            return this.messageIsShowed;
        }

        public int hashCode() {
            String str = this.message;
            return Boolean.hashCode(this.messageIsShowed) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final void setMessageIsShowed(boolean z11) {
            this.messageIsShowed = z11;
        }

        @NotNull
        public String toString() {
            return b.f("OnFavoriteListEdited(message=", this.message, ", messageIsShowed=", ")", this.messageIsShowed);
        }

        public /* synthetic */ OnFavoriteListEdited(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? false : z11);
        }

        public OnFavoriteListEdited(String str, boolean z11) {
            super(null);
            this.message = str;
            this.messageIsShowed = z11;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent$OnFavoriteWishlistEdited;", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent;", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notification", "", "notificationIsShowed", "needRefresh", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "Z", "getNotificationIsShowed", "()Z", "setNotificationIsShowed", "(Z)V", "getNeedRefresh", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnFavoriteWishlistEdited extends FavoriteEvent {
        private final boolean needRefresh;
        private final NotificationModelWrapper notification;
        private boolean notificationIsShowed;

        public OnFavoriteWishlistEdited() {
            this(null, false, false, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnFavoriteWishlistEdited)) {
                return false;
            }
            OnFavoriteWishlistEdited onFavoriteWishlistEdited = (OnFavoriteWishlistEdited) other;
            return Intrinsics.d(this.notification, onFavoriteWishlistEdited.notification) && this.notificationIsShowed == onFavoriteWishlistEdited.notificationIsShowed && this.needRefresh == onFavoriteWishlistEdited.needRefresh;
        }

        public final boolean getNeedRefresh() {
            return this.needRefresh;
        }

        public final NotificationModelWrapper getNotification() {
            return this.notification;
        }

        public final boolean getNotificationIsShowed() {
            return this.notificationIsShowed;
        }

        public int hashCode() {
            NotificationModelWrapper notificationModelWrapper = this.notification;
            return Boolean.hashCode(this.needRefresh) + C3532b.a((notificationModelWrapper == null ? 0 : notificationModelWrapper.hashCode()) * 31, 31, this.notificationIsShowed);
        }

        public final void setNotificationIsShowed(boolean z11) {
            this.notificationIsShowed = z11;
        }

        @NotNull
        public String toString() {
            NotificationModelWrapper notificationModelWrapper = this.notification;
            boolean z11 = this.notificationIsShowed;
            boolean z12 = this.needRefresh;
            StringBuilder sb2 = new StringBuilder("OnFavoriteWishlistEdited(notification=");
            sb2.append(notificationModelWrapper);
            sb2.append(", notificationIsShowed=");
            sb2.append(z11);
            sb2.append(", needRefresh=");
            return a.a(")", sb2, z12);
        }

        public /* synthetic */ OnFavoriteWishlistEdited(NotificationModelWrapper notificationModelWrapper, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : notificationModelWrapper, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12);
        }

        public OnFavoriteWishlistEdited(NotificationModelWrapper notificationModelWrapper, boolean z11, boolean z12) {
            super(null);
            this.notification = notificationModelWrapper;
            this.notificationIsShowed = z11;
            this.needRefresh = z12;
        }
    }

    public /* synthetic */ FavoriteEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FavoriteEvent() {
    }
}

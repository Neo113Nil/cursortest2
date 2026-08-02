package ru.ozon.app.android.favorites.ui;

import N3.C3660k;
import Nc.C3669c;
import Sc.InterfaceC3999a;
import io.reactivex.p;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.ui.notification.NotificationBundle;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@InterfaceC3999a
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001$B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J=\u0010\u0011\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0003J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\"\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010\u00160\u00160 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "", "<init>", "()V", "", "isChanged", "", "onNameChanged", "(Z)V", "onListDeleted", "", "deeplink", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "quantity", "Lru/ozon/app/android/favorites/ui/notification/NotificationBundle;", "notificationBundle", "onListCreated", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/app/android/favorites/ui/notification/NotificationBundle;)V", "onPinStatusChanged", "onListAccessChanged", "Lio/reactivex/p;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent;", "events", "()Lio/reactivex/p;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "shouldShowFlashbar", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getShouldShowFlashbar", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setShouldShowFlashbar", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "LNc/c;", "kotlin.jvm.PlatformType", "favoritesListChanges", "LNc/c;", "FavoritesListsEvent", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoritesListsEventsManager {

    @NotNull
    private final C3669c<FavoritesListsEvent> favoritesListChanges;

    @NotNull
    private AtomicBoolean shouldShowFlashbar = new AtomicBoolean(false);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent;", "", "<init>", "()V", "Renamed", "Removed", "PinStatusChanged", "ListAccessModeChange", "Unsupported", "Created", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent$Created;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent$ListAccessModeChange;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent$PinStatusChanged;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent$Removed;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent$Renamed;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent$Unsupported;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static abstract class FavoritesListsEvent {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent$Created;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent;", "", "deeplink", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "quantity", "Lru/ozon/app/android/favorites/ui/notification/NotificationBundle;", "notificationBundle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/app/android/favorites/ui/notification/NotificationBundle;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "getTitle", "Ljava/lang/Integer;", "getQuantity", "()Ljava/lang/Integer;", "Lru/ozon/app/android/favorites/ui/notification/NotificationBundle;", "getNotificationBundle", "()Lru/ozon/app/android/favorites/ui/notification/NotificationBundle;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Created extends FavoritesListsEvent {
            private final String deeplink;
            private final NotificationBundle notificationBundle;
            private final Integer quantity;
            private final String title;

            public Created() {
                this(null, null, null, null, 15, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Created)) {
                    return false;
                }
                Created created = (Created) other;
                return Intrinsics.d(this.deeplink, created.deeplink) && Intrinsics.d(this.title, created.title) && Intrinsics.d(this.quantity, created.quantity) && Intrinsics.d(this.notificationBundle, created.notificationBundle);
            }

            public final NotificationBundle getNotificationBundle() {
                return this.notificationBundle;
            }

            public int hashCode() {
                String str = this.deeplink;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.title;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num = this.quantity;
                int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                NotificationBundle notificationBundle = this.notificationBundle;
                return hashCode3 + (notificationBundle != null ? notificationBundle.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.deeplink;
                String str2 = this.title;
                Integer num = this.quantity;
                NotificationBundle notificationBundle = this.notificationBundle;
                StringBuilder d11 = C3660k.d("Created(deeplink=", str, ", title=", str2, ", quantity=");
                d11.append(num);
                d11.append(", notificationBundle=");
                d11.append(notificationBundle);
                d11.append(")");
                return d11.toString();
            }

            public /* synthetic */ Created(String str, String str2, Integer num, NotificationBundle notificationBundle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : notificationBundle);
            }

            public Created(String str, String str2, Integer num, NotificationBundle notificationBundle) {
                super(null);
                this.deeplink = str;
                this.title = str2;
                this.quantity = num;
                this.notificationBundle = notificationBundle;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent$ListAccessModeChange;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent;", "<init>", "()V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ListAccessModeChange extends FavoritesListsEvent {

            @NotNull
            public static final ListAccessModeChange INSTANCE = new ListAccessModeChange();

            private ListAccessModeChange() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent$PinStatusChanged;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent;", "<init>", "()V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class PinStatusChanged extends FavoritesListsEvent {

            @NotNull
            public static final PinStatusChanged INSTANCE = new PinStatusChanged();

            private PinStatusChanged() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent$Removed;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent;", "<init>", "()V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Removed extends FavoritesListsEvent {

            @NotNull
            public static final Removed INSTANCE = new Removed();

            private Removed() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent$Renamed;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent;", "<init>", "()V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Renamed extends FavoritesListsEvent {

            @NotNull
            public static final Renamed INSTANCE = new Renamed();

            private Renamed() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent$Unsupported;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager$FavoritesListsEvent;", "<init>", "()V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Unsupported extends FavoritesListsEvent {

            @NotNull
            public static final Unsupported INSTANCE = new Unsupported();

            private Unsupported() {
                super(null);
            }
        }

        public /* synthetic */ FavoritesListsEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private FavoritesListsEvent() {
        }
    }

    public FavoritesListsEventsManager() {
        C3669c<FavoritesListsEvent> d11 = C3669c.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.favoritesListChanges = d11;
    }

    public static /* synthetic */ void onListCreated$default(FavoritesListsEventsManager favoritesListsEventsManager, String str, String str2, Integer num, NotificationBundle notificationBundle, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            notificationBundle = null;
        }
        favoritesListsEventsManager.onListCreated(str, str2, num, notificationBundle);
    }

    @NotNull
    public final p<FavoritesListsEvent> events() {
        p<FavoritesListsEvent> hide = this.favoritesListChanges.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "hide(...)");
        return hide;
    }

    @NotNull
    public final AtomicBoolean getShouldShowFlashbar() {
        return this.shouldShowFlashbar;
    }

    public final void onListAccessChanged() {
        this.favoritesListChanges.onNext(FavoritesListsEvent.ListAccessModeChange.INSTANCE);
    }

    public final void onListCreated(String deeplink, String title, Integer quantity, NotificationBundle notificationBundle) {
        this.favoritesListChanges.onNext(new FavoritesListsEvent.Created(deeplink, title, quantity, notificationBundle));
    }

    public final void onListDeleted() {
        this.favoritesListChanges.onNext(FavoritesListsEvent.Removed.INSTANCE);
    }

    public final void onNameChanged(boolean isChanged) {
        this.favoritesListChanges.onNext(isChanged ? FavoritesListsEvent.Renamed.INSTANCE : FavoritesListsEvent.Unsupported.INSTANCE);
        this.shouldShowFlashbar.set(isChanged);
    }

    public final void onPinStatusChanged() {
        this.favoritesListChanges.onNext(FavoritesListsEvent.PinStatusChanged.INSTANCE);
    }
}

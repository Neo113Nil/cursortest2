package ru.ozon.app.android.favorites.createshoppinglist.presentation.viewmodel;

import AA.d;
import B0.A0;
import B0.C2454a;
import Bc.i;
import Bc.m;
import G.g;
import Kk.C3532b;
import Lz.C3602a;
import N3.C3660k;
import Tl.b;
import V.e;
import W10.c;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import c8.C5766e;
import io.reactivex.C;
import io.reactivex.y;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.viewmodel.CreateShoppingListViewModel;
import ru.ozon.app.android.favorites.data.shoppinglists.models.CreateFavoritesList;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import vc.l;
import vc.n;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 B2\u00020\u0001:\u0002BCB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJY\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00152\u0006\u0010 \u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\f¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R$\u0010,\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010(R*\u00103\u001a\n\u0018\u000101j\u0004\u0018\u0001`28\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020:098\u0006¢\u0006\f\n\u0004\b \u0010;\u001a\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010-¨\u0006D"}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "interactor", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "favoritesListManager", "<init>", "(Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;)V", "", "skuToAdd", "", "listHash", "fromList", "category", "parentCategoryId", "", "isWishlist", "addLink", "openList", "", "createListAndAdd", "(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Z)V", "createWishlist", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "renameListId", "renameList", "(Ljava/lang/Long;)V", "onCleared", "()V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "handleClick", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "handleComposerAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "onShoppingListTitleChanged", "(Ljava/lang/String;)V", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "shoppingListInitTitle", "Ljava/lang/String;", "getShoppingListInitTitle", "()Ljava/lang/String;", "setShoppingListInitTitle", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "LW10/c;", "getTrackingData", "()LW10/c;", "setTrackingData", "(LW10/c;)V", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action;", "Landroidx/lifecycle/V;", "getAction", "()Landroidx/lifecycle/V;", "Lnc/a;", "compositeDisposable", "Lnc/a;", "shoppingListTitle", "Companion", "Action", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CreateShoppingListViewModel extends w0 {

    @NotNull
    private final V<Action> action;

    @NotNull
    private final C8486a compositeDisposable;

    @NotNull
    private final FavoriteManager favoriteManager;

    @NotNull
    private final FavoritesListsEventsManager favoritesListManager;

    @NotNull
    private final FavoritesListsInteractor interactor;
    private String shoppingListInitTitle;

    @NotNull
    private String shoppingListTitle;
    private c trackingData;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action;", "", "<init>", "()V", "Loading", "SuccessRename", "SuccessCreate", "ValidationError", "Error", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action$Error;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action$Loading;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action$SuccessCreate;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action$SuccessRename;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action$ValidationError;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action$Error;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends Action {

            @NotNull
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull String message) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.d(this.message, ((Error) other).message);
            }

            @NotNull
            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Error(message=", this.message, ")");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action$Loading;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action;", "<init>", "()V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Loading extends Action {

            @NotNull
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action$SuccessCreate;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action;", "", "listTitle", "listDeeplink", "", "wasProductAdded", "description", "", "quantity", "openList", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notification", "", "payloads", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IZLru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getListTitle", "getListDeeplink", "Z", "getWasProductAdded", "()Z", "getDescription", "I", "getQuantity", "getOpenList", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "Ljava/util/Map;", "getPayloads", "()Ljava/util/Map;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SuccessCreate extends Action {

            @NotNull
            private final String description;

            @NotNull
            private final String listDeeplink;

            @NotNull
            private final String listTitle;
            private final NotificationModelWrapper notification;
            private final boolean openList;
            private final Map<String, String> payloads;
            private final int quantity;
            private final boolean wasProductAdded;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SuccessCreate(@NotNull String listTitle, @NotNull String listDeeplink, boolean z11, @NotNull String description, int i11, boolean z12, NotificationModelWrapper notificationModelWrapper, Map<String, String> map) {
                super(null);
                Intrinsics.checkNotNullParameter(listTitle, "listTitle");
                Intrinsics.checkNotNullParameter(listDeeplink, "listDeeplink");
                Intrinsics.checkNotNullParameter(description, "description");
                this.listTitle = listTitle;
                this.listDeeplink = listDeeplink;
                this.wasProductAdded = z11;
                this.description = description;
                this.quantity = i11;
                this.openList = z12;
                this.notification = notificationModelWrapper;
                this.payloads = map;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SuccessCreate)) {
                    return false;
                }
                SuccessCreate successCreate = (SuccessCreate) other;
                return Intrinsics.d(this.listTitle, successCreate.listTitle) && Intrinsics.d(this.listDeeplink, successCreate.listDeeplink) && this.wasProductAdded == successCreate.wasProductAdded && Intrinsics.d(this.description, successCreate.description) && this.quantity == successCreate.quantity && this.openList == successCreate.openList && Intrinsics.d(this.notification, successCreate.notification) && Intrinsics.d(this.payloads, successCreate.payloads);
            }

            @NotNull
            public final String getDescription() {
                return this.description;
            }

            @NotNull
            public final String getListDeeplink() {
                return this.listDeeplink;
            }

            @NotNull
            public final String getListTitle() {
                return this.listTitle;
            }

            public final NotificationModelWrapper getNotification() {
                return this.notification;
            }

            public final boolean getOpenList() {
                return this.openList;
            }

            public final Map<String, String> getPayloads() {
                return this.payloads;
            }

            public final int getQuantity() {
                return this.quantity;
            }

            public final boolean getWasProductAdded() {
                return this.wasProductAdded;
            }

            public int hashCode() {
                int a11 = C3532b.a(C2454a.a(this.quantity, g.a(C3532b.a(g.a(this.listTitle.hashCode() * 31, 31, this.listDeeplink), 31, this.wasProductAdded), 31, this.description), 31), 31, this.openList);
                NotificationModelWrapper notificationModelWrapper = this.notification;
                int hashCode = (a11 + (notificationModelWrapper == null ? 0 : notificationModelWrapper.hashCode())) * 31;
                Map<String, String> map = this.payloads;
                return hashCode + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.listTitle;
                String str2 = this.listDeeplink;
                boolean z11 = this.wasProductAdded;
                String str3 = this.description;
                int i11 = this.quantity;
                boolean z12 = this.openList;
                NotificationModelWrapper notificationModelWrapper = this.notification;
                Map<String, String> map = this.payloads;
                StringBuilder d11 = C3660k.d("SuccessCreate(listTitle=", str, ", listDeeplink=", str2, ", wasProductAdded=");
                C5766e.a(", description=", str3, ", quantity=", d11, z11);
                Ql.c.d(d11, i11, ", openList=", z12, ", notification=");
                d11.append(notificationModelWrapper);
                d11.append(", payloads=");
                d11.append(map);
                d11.append(")");
                return d11.toString();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action$SuccessRename;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action;", "<init>", "()V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SuccessRename extends Action {

            @NotNull
            public static final SuccessRename INSTANCE = new SuccessRename();

            private SuccessRename() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action$ValidationError;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action;", "", "listTitle", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getListTitle", "getMessage", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ValidationError extends Action {

            @NotNull
            private final String listTitle;

            @NotNull
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ValidationError(@NotNull String listTitle, @NotNull String message) {
                super(null);
                Intrinsics.checkNotNullParameter(listTitle, "listTitle");
                Intrinsics.checkNotNullParameter(message, "message");
                this.listTitle = listTitle;
                this.message = message;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ValidationError)) {
                    return false;
                }
                ValidationError validationError = (ValidationError) other;
                return Intrinsics.d(this.listTitle, validationError.listTitle) && Intrinsics.d(this.message, validationError.message);
            }

            @NotNull
            public final String getListTitle() {
                return this.listTitle;
            }

            @NotNull
            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode() + (this.listTitle.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("ValidationError(listTitle=", this.listTitle, ", message=", this.message, ")");
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    public CreateShoppingListViewModel(@NotNull FavoritesListsInteractor interactor, @NotNull FavoriteManager favoriteManager, @NotNull FavoritesListsEventsManager favoritesListManager) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        Intrinsics.checkNotNullParameter(favoritesListManager, "favoritesListManager");
        this.interactor = interactor;
        this.favoriteManager = favoriteManager;
        this.favoritesListManager = favoritesListManager;
        this.action = new V<>();
        this.compositeDisposable = new C8486a();
        this.shoppingListTitle = "";
    }

    private final void createListAndAdd(long skuToAdd, String listHash, Long fromList, Long category, Long parentCategoryId, Boolean isWishlist, String addLink, boolean openList) {
        boolean z11 = skuToAdd != 0;
        List a02 = z11 ? C7714v.a0(Long.valueOf(skuToAdd)) : K.f71697a;
        C8486a c8486a = this.compositeDisposable;
        y<CreateFavoritesList> createFavoritesList = this.interactor.createFavoritesList(this.shoppingListTitle, listHash, fromList != null ? fromList.toString() : null, category, parentCategoryId, isWishlist);
        IJ.a aVar = new IJ.a(new CreateShoppingListViewModel$createListAndAdd$1(z11, this, a02, addLink), 3);
        createFavoritesList.getClass();
        InterfaceC8487b h11 = new i(new m(createFavoritesList, aVar).j(Mc.a.b()).g(C8125a.a()), new HX.a(new CreateShoppingListViewModel$createListAndAdd$2(this), 4)).h(new AA.a(new CreateShoppingListViewModel$createListAndAdd$3(this, z11, a02, openList), 5), new C3602a(new CreateShoppingListViewModel$createListAndAdd$4(this), 4));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C createListAndAdd$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    private final void createWishlist(String listHash, Boolean isWishlist) {
        C8486a c8486a = this.compositeDisposable;
        InterfaceC8487b h11 = new i(FavoritesListsInteractor.DefaultImpls.createFavoritesList$default(this.interactor, this.shoppingListTitle, listHash, null, null, null, isWishlist, 28, null).j(Mc.a.b()).g(C8125a.a()), new AA.c(new CreateShoppingListViewModel$createWishlist$1(this), 3)).h(new d(new CreateShoppingListViewModel$createWishlist$2(this), 8), new Cw.c(new CreateShoppingListViewModel$createWishlist$3(this), 8));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    private final void renameList(Long renameListId) {
        if (renameListId == null) {
            return;
        }
        if (Intrinsics.d(this.shoppingListInitTitle, this.shoppingListTitle)) {
            this.action.setValue(Action.SuccessRename.INSTANCE);
            return;
        }
        C8486a c8486a = this.compositeDisposable;
        n f7 = new l(this.interactor.renameFavoritesList(renameListId.longValue(), this.shoppingListTitle).k(Mc.a.b()), C8125a.a()).f(new GJ.a(new CreateShoppingListViewModel$renameList$1(this), 4));
        uc.i iVar = new uc.i(new NX.a(new CreateShoppingListViewModel$renameList$3(this), 2), new InterfaceC9019a() { // from class: at.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                CreateShoppingListViewModel.renameList$lambda$8(CreateShoppingListViewModel.this);
            }
        });
        f7.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renameList$lambda$8(CreateShoppingListViewModel createShoppingListViewModel) {
        createShoppingListViewModel.action.setValue(Action.SuccessRename.INSTANCE);
        createShoppingListViewModel.favoritesListManager.onNameChanged(true);
    }

    @NotNull
    public final V<Action> getAction() {
        return this.action;
    }

    public final c getTrackingData() {
        return this.trackingData;
    }

    public final void handleClick(@NotNull AtomAction.Click action) {
        String str;
        String str2;
        Boolean t02;
        String str3;
        String str4;
        String str5;
        String str6;
        Long y02;
        if (b.i(action, "action", "createListAddSkus")) {
            Map<String, String> params = action.getParams();
            long longValue = (params == null || (str6 = params.get("sku")) == null || (y02 = h.y0(str6)) == null) ? 0L : y02.longValue();
            Map<String, String> params2 = action.getParams();
            String str7 = params2 != null ? params2.get("hash") : null;
            Map<String, String> params3 = action.getParams();
            Long y03 = (params3 == null || (str5 = params3.get("fromList")) == null) ? null : h.y0(str5);
            Map<String, String> params4 = action.getParams();
            Long y04 = (params4 == null || (str4 = params4.get("category")) == null) ? null : h.y0(str4);
            Map<String, String> params5 = action.getParams();
            Long y05 = (params5 == null || (str3 = params5.get("parentCategoryId")) == null) ? null : h.y0(str3);
            Map<String, String> params6 = action.getParams();
            Boolean valueOf = Boolean.valueOf((params6 == null || (str2 = params6.get("isWishlist")) == null || (t02 = h.t0(str2)) == null) ? true : t02.booleanValue());
            Map<String, String> params7 = action.getParams();
            if (params7 == null || (str = params7.get("addLink")) == null) {
                return;
            }
            Map<String, String> params8 = action.getParams();
            createListAndAdd(longValue, str7, y03, y04, y05, valueOf, str, Boolean.parseBoolean(params8 != null ? params8.get("openList") : null));
        }
    }

    public final void handleComposerAction(@NotNull AtomAction.ComposerAction action) {
        String str;
        Boolean t02;
        String str2;
        Intrinsics.checkNotNullParameter(action, "action");
        String id2 = action.getId();
        r2 = null;
        Long l11 = null;
        if (Intrinsics.d(id2, "favoriteRenameList")) {
            Map<String, String> params = action.getParams();
            if (params != null && (str2 = params.get("id")) != null) {
                l11 = h.y0(str2);
            }
            renameList(l11);
            return;
        }
        if (Intrinsics.d(id2, "favoriteCreateList")) {
            Map<String, String> params2 = action.getParams();
            String str3 = params2 != null ? params2.get("hash") : null;
            Map<String, String> params3 = action.getParams();
            createWishlist(str3, Boolean.valueOf((params3 == null || (str = params3.get("isWishlist")) == null || (t02 = h.t0(str)) == null) ? true : t02.booleanValue()));
        }
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.compositeDisposable.d();
    }

    public final void onShoppingListTitleChanged(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.shoppingListTitle = title;
    }

    public final void setShoppingListInitTitle(String str) {
        this.shoppingListInitTitle = str;
    }

    public final void setTrackingData(c cVar) {
        this.trackingData = cVar;
    }
}

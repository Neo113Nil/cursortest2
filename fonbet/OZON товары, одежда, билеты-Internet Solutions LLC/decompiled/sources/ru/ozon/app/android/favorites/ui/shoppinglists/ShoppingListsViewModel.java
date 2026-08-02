package ru.ozon.app.android.favorites.ui.shoppinglists;

import B0.A0;
import L9.c;
import Mc.a;
import Tm.C4047b;
import androidx.lifecycle.w0;
import com.squareup.moshi.j;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;
import ru.ozon.app.android.favorites.ui.shoppinglists.ShoppingListsViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import uc.i;
import vc.l;
import vc.n;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002%&B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010#\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00130\u00130!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "interactor", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "favoritesListsEventsManager", "<init>", "(Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;)V", "", "onCleared", "()V", "", "id", "requestId", "onRemoveFavoritesListClicked", "(JJ)V", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "Lio/reactivex/p;", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel$ListActionDTO;", "action", "Lio/reactivex/p;", "getAction", "()Lio/reactivex/p;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "", "actionShareLiveData", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getActionShareLiveData", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lnc/a;", "compositeDisposable", "Lnc/a;", "LL9/c;", "kotlin.jvm.PlatformType", "actionRelay", "LL9/c;", "Action", "ListActionDTO", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ShoppingListsViewModel extends w0 {

    @NotNull
    private final p<ListActionDTO> action;

    @NotNull
    private final c<ListActionDTO> actionRelay;

    @NotNull
    private final SingleLiveEvent<Object> actionShareLiveData;

    @NotNull
    private final C8486a compositeDisposable;

    @NotNull
    private final FavoritesListsEventsManager favoritesListsEventsManager;

    @NotNull
    private final FavoritesListsInteractor interactor;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel$Action;", "", "<init>", "()V", "Loading", "Success", "Error", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel$Action$Error;", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel$Action$Loading;", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel$Action$Success;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel$Action$Error;", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel$Action;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel$Action$Loading;", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel$Action;", "<init>", "()V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Loading extends Action {

            @NotNull
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel$Action$Success;", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel$Action;", "<init>", "()V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Success extends Action {

            @NotNull
            public static final Success INSTANCE = new Success();

            private Success() {
                super(null);
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel$ListActionDTO;", "", "requestId", "", "action", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel$Action;", "<init>", "(JLru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel$Action;)V", "getRequestId", "()J", "getAction", "()Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel$Action;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ListActionDTO {
        public static final int $stable = 0;

        @NotNull
        private final Action action;
        private final long requestId;

        public ListActionDTO(long j11, @NotNull Action action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.requestId = j11;
            this.action = action;
        }

        public static /* synthetic */ ListActionDTO copy$default(ListActionDTO listActionDTO, long j11, Action action, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = listActionDTO.requestId;
            }
            if ((i11 & 2) != 0) {
                action = listActionDTO.action;
            }
            return listActionDTO.copy(j11, action);
        }

        /* renamed from: component1, reason: from getter */
        public final long getRequestId() {
            return this.requestId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        @NotNull
        public final ListActionDTO copy(long requestId, @NotNull Action action) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new ListActionDTO(requestId, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListActionDTO)) {
                return false;
            }
            ListActionDTO listActionDTO = (ListActionDTO) other;
            return this.requestId == listActionDTO.requestId && Intrinsics.d(this.action, listActionDTO.action);
        }

        @NotNull
        public final Action getAction() {
            return this.action;
        }

        public final long getRequestId() {
            return this.requestId;
        }

        public int hashCode() {
            return this.action.hashCode() + (Long.hashCode(this.requestId) * 31);
        }

        @NotNull
        public String toString() {
            return "ListActionDTO(requestId=" + this.requestId + ", action=" + this.action + ")";
        }
    }

    public ShoppingListsViewModel(@NotNull FavoritesListsInteractor interactor, @NotNull FavoritesListsEventsManager favoritesListsEventsManager) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(favoritesListsEventsManager, "favoritesListsEventsManager");
        this.interactor = interactor;
        this.favoritesListsEventsManager = favoritesListsEventsManager;
        this.actionShareLiveData = new SingleLiveEvent<>();
        this.compositeDisposable = new C8486a();
        c<ListActionDTO> c11 = c.c();
        Intrinsics.checkNotNullExpressionValue(c11, "create(...)");
        this.actionRelay = c11;
        this.action = c11.hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRemoveFavoritesListClicked$lambda$1(ShoppingListsViewModel shoppingListsViewModel, long j11) {
        shoppingListsViewModel.favoritesListsEventsManager.onListDeleted();
        shoppingListsViewModel.actionRelay.accept(new ListActionDTO(j11, Action.Success.INSTANCE));
    }

    @NotNull
    public final p<ListActionDTO> getAction() {
        return this.action;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.compositeDisposable.d();
    }

    public final void onRemoveFavoritesListClicked(long id2, final long requestId) {
        C8486a c8486a = this.compositeDisposable;
        n f7 = new l(this.interactor.removeFavoritesList(id2).k(a.b()), C8125a.a()).f(new HC.a(new ShoppingListsViewModel$onRemoveFavoritesListClicked$1(this, requestId), 9));
        i iVar = new i(new C4047b(new ShoppingListsViewModel$onRemoveFavoritesListClicked$3(this, requestId), 5), new InterfaceC9019a() { // from class: zt.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                ShoppingListsViewModel.onRemoveFavoritesListClicked$lambda$1(ShoppingListsViewModel.this, requestId);
            }
        });
        f7.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, iVar);
    }
}

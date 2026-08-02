package ru.ozon.app.android.favorites.ui.wishlists;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.x0;
import Sc.o;
import Sc.s;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistDelete;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistUpdate;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistsInteractor;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import xe.C10727i;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/favorites/ui/wishlists/DeleteWishlistViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistsInteractor;", "wishlistsInteractor", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "favoritesListsEventsManager", "<init>", "(Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistsInteractor;Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "", "deleteWishlist", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;LW10/c;)V", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistsInteractor;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "LAe/x0;", "Lru/ozon/app/android/favorites/ui/wishlists/DeleteWishlistViewModel$State;", "_state", "LAe/x0;", "LAe/h;", "state", "LAe/h;", "getState", "()LAe/h;", "", "listId", "Ljava/lang/Long;", "getListId", "()Ljava/lang/Long;", "setListId", "(Ljava/lang/Long;)V", "State", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeleteWishlistViewModel extends w0 {

    @NotNull
    private final x0<State> _state;

    @NotNull
    private final FavoritesListsEventsManager favoritesListsEventsManager;
    private Long listId;

    @NotNull
    private final InterfaceC2395h<State> state;

    @NotNull
    private final WishlistsInteractor wishlistsInteractor;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "update", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistUpdate;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.favorites.ui.wishlists.DeleteWishlistViewModel$2", f = "DeleteWishlistViewModel.kt", l = {DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, 40, 41}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.favorites.ui.wishlists.DeleteWishlistViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<WishlistUpdate, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = DeleteWishlistViewModel.this.new AnonymousClass2(dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
        
            if (r1.emit(r2, r5) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                WishlistUpdate wishlistUpdate = (WishlistUpdate) this.L$0;
                if (wishlistUpdate instanceof WishlistDelete.Success) {
                    DeleteWishlistViewModel.this.favoritesListsEventsManager.onListDeleted();
                    x0 x0Var = DeleteWishlistViewModel.this._state;
                    WishlistDelete.Success success = (WishlistDelete.Success) wishlistUpdate;
                    State.Success success2 = new State.Success(success.getNotification(), success.getPayloads());
                    this.label = 1;
                } else if (wishlistUpdate instanceof WishlistDelete.Started) {
                    x0 x0Var2 = DeleteWishlistViewModel.this._state;
                    State.Loading loading = State.Loading.INSTANCE;
                    this.label = 2;
                } else {
                    if (!(wishlistUpdate instanceof WishlistDelete.Failure)) {
                        if (wishlistUpdate instanceof WishlistDelete) {
                            throw new o();
                        }
                        return Unit.f71690a;
                    }
                    x0 x0Var3 = DeleteWishlistViewModel.this._state;
                    State.Error error = State.Error.INSTANCE;
                    this.label = 3;
                }
            } else {
                if (i11 != 1 && i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WishlistUpdate wishlistUpdate, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(wishlistUpdate, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/favorites/ui/wishlists/DeleteWishlistViewModel$State;", "", "Loading", "Error", "Success", "Lru/ozon/app/android/favorites/ui/wishlists/DeleteWishlistViewModel$State$Error;", "Lru/ozon/app/android/favorites/ui/wishlists/DeleteWishlistViewModel$State$Loading;", "Lru/ozon/app/android/favorites/ui/wishlists/DeleteWishlistViewModel$State$Success;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface State {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/favorites/ui/wishlists/DeleteWishlistViewModel$State$Error;", "Lru/ozon/app/android/favorites/ui/wishlists/DeleteWishlistViewModel$State;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements State {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return -2054161869;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/favorites/ui/wishlists/DeleteWishlistViewModel$State$Loading;", "Lru/ozon/app/android/favorites/ui/wishlists/DeleteWishlistViewModel$State;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading implements State {

            @NotNull
            public static final Loading INSTANCE = new Loading();

            private Loading() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -843928921;
            }

            @NotNull
            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/favorites/ui/wishlists/DeleteWishlistViewModel$State$Success;", "Lru/ozon/app/android/favorites/ui/wishlists/DeleteWishlistViewModel$State;", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notification", "", "", "payloads", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "Ljava/util/Map;", "getPayloads", "()Ljava/util/Map;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success implements State {
            private final NotificationModelWrapper notification;
            private final Map<String, String> payloads;

            public Success(NotificationModelWrapper notificationModelWrapper, Map<String, String> map) {
                this.notification = notificationModelWrapper;
                this.payloads = map;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.d(this.notification, success.notification) && Intrinsics.d(this.payloads, success.payloads);
            }

            public final NotificationModelWrapper getNotification() {
                return this.notification;
            }

            public final Map<String, String> getPayloads() {
                return this.payloads;
            }

            public int hashCode() {
                NotificationModelWrapper notificationModelWrapper = this.notification;
                int hashCode = (notificationModelWrapper == null ? 0 : notificationModelWrapper.hashCode()) * 31;
                Map<String, String> map = this.payloads;
                return hashCode + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Success(notification=" + this.notification + ", payloads=" + this.payloads + ")";
            }
        }
    }

    public DeleteWishlistViewModel(@NotNull WishlistsInteractor wishlistsInteractor, @NotNull FavoritesListsEventsManager favoritesListsEventsManager) {
        Intrinsics.checkNotNullParameter(wishlistsInteractor, "wishlistsInteractor");
        Intrinsics.checkNotNullParameter(favoritesListsEventsManager, "favoritesListsEventsManager");
        this.wishlistsInteractor = wishlistsInteractor;
        this.favoritesListsEventsManager = favoritesListsEventsManager;
        x0<State> a11 = O0.a(null);
        this._state = a11;
        this.state = new C2406m0(a11);
        final InterfaceC2395h<WishlistUpdate> wishlistsUpdates = wishlistsInteractor.getWishlistsUpdates();
        C2399j.C(new C2408n0(new InterfaceC2395h<WishlistUpdate>() { // from class: ru.ozon.app.android.favorites.ui.wishlists.DeleteWishlistViewModel$special$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.favorites.ui.wishlists.DeleteWishlistViewModel$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ DeleteWishlistViewModel this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.favorites.ui.wishlists.DeleteWishlistViewModel$special$$inlined$filter$1$2", f = "DeleteWishlistViewModel.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.favorites.ui.wishlists.DeleteWishlistViewModel$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, DeleteWishlistViewModel deleteWishlistViewModel) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = deleteWishlistViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                long id2 = ((WishlistUpdate) obj).getId();
                                Long listId = this.this$0.getListId();
                                if (listId != null && id2 == listId.longValue()) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super WishlistUpdate> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new AnonymousClass2(null)), androidx.lifecycle.x0.a(this));
    }

    public final void deleteWishlist(@NotNull AtomAction.ComposerAction action, W10.c trackingData) {
        Intrinsics.checkNotNullParameter(action, "action");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new DeleteWishlistViewModel$deleteWishlist$1(this, action, trackingData, null), 3);
    }

    public final Long getListId() {
        return this.listId;
    }

    @NotNull
    public final InterfaceC2395h<State> getState() {
        return this.state;
    }

    public final void setListId(Long l11) {
        this.listId = l11;
    }
}

package ru.ozon.app.android.favorites.domain.favoriteToggleProductButton;

import Ae.B0;
import Ae.C0;
import Ae.C2408n0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.w0;
import Sc.o;
import Sc.s;
import W10.c;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteToggleProductButton.model.FavoriteToggleProductButtonChangeResult;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemDelete;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemUpdate;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemsInteractor;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JJ\u0010\u0011\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/favorites/domain/favoriteToggleProductButton/FavoriteToggleProductButtonInteractorImpl;", "Lru/ozon/app/android/favorites/domain/favoriteToggleProductButton/FavoriteToggleProductButtonInteractor;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemsInteractor;", "wishlistItemsInteractor", "<init>", "(Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemsInteractor;)V", "", "sku", "listId", "giftId", "", "uniqId", "actionName", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "", "addFavoriteWishlistChangeRequest", "(Ljava/lang/Long;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;LW10/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LAe/h;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteToggleProductButton/model/FavoriteToggleProductButtonChangeResult;", "observeRequests", "()LAe/h;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemsInteractor;", "LAe/w0;", "_favoriteToggleProductButtonUpdates", "LAe/w0;", "LAe/B0;", "favoriteToggleProductButtonUpdates", "LAe/B0;", "getFavoriteToggleProductButtonUpdates", "()LAe/B0;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteToggleProductButtonInteractorImpl implements FavoriteToggleProductButtonInteractor {

    @NotNull
    private final w0<FavoriteToggleProductButtonChangeResult> _favoriteToggleProductButtonUpdates;

    @NotNull
    private final B0<FavoriteToggleProductButtonChangeResult> favoriteToggleProductButtonUpdates;

    @NotNull
    private final WishlistItemsInteractor wishlistItemsInteractor;

    public FavoriteToggleProductButtonInteractorImpl(@NotNull WishlistItemsInteractor wishlistItemsInteractor) {
        Intrinsics.checkNotNullParameter(wishlistItemsInteractor, "wishlistItemsInteractor");
        this.wishlistItemsInteractor = wishlistItemsInteractor;
        C0 b11 = E0.b(0, 0, null, 7);
        this._favoriteToggleProductButtonUpdates = b11;
        this.favoriteToggleProductButtonUpdates = b11;
    }

    @Override // ru.ozon.app.android.favorites.domain.favoriteToggleProductButton.FavoriteToggleProductButtonInteractor
    public Object addFavoriteWishlistChangeRequest(Long l11, long j11, Long l12, String str, @NotNull String str2, @NotNull c cVar, @NotNull d<? super Unit> dVar) {
        Object addWishlistItemChangeRequest = this.wishlistItemsInteractor.addWishlistItemChangeRequest(l11, j11, l12, str, str2, cVar, dVar);
        return addWishlistItemChangeRequest == a.COROUTINE_SUSPENDED ? addWishlistItemChangeRequest : Unit.f71690a;
    }

    @Override // ru.ozon.app.android.favorites.domain.favoriteToggleProductButton.FavoriteToggleProductButtonInteractor
    @NotNull
    public InterfaceC2395h<FavoriteToggleProductButtonChangeResult> observeRequests() {
        final InterfaceC2395h<WishlistItemUpdate> wishlistItemUpdates = this.wishlistItemsInteractor.getWishlistItemUpdates();
        final InterfaceC2395h<Object> interfaceC2395h = new InterfaceC2395h<Object>() { // from class: ru.ozon.app.android.favorites.domain.favoriteToggleProductButton.FavoriteToggleProductButtonInteractorImpl$observeRequests$$inlined$filterIsInstance$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.favorites.domain.favoriteToggleProductButton.FavoriteToggleProductButtonInteractorImpl$observeRequests$$inlined$filterIsInstance$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.favorites.domain.favoriteToggleProductButton.FavoriteToggleProductButtonInteractorImpl$observeRequests$$inlined$filterIsInstance$1$2", f = "FavoriteToggleProductButtonInteractorImpl.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.favorites.domain.favoriteToggleProductButton.FavoriteToggleProductButtonInteractorImpl$observeRequests$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
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

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
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
                                if (obj instanceof WishlistItemDelete) {
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
            public Object collect(InterfaceC2397i<? super Object> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        };
        return new C2408n0(new InterfaceC2395h<FavoriteToggleProductButtonChangeResult>() { // from class: ru.ozon.app.android.favorites.domain.favoriteToggleProductButton.FavoriteToggleProductButtonInteractorImpl$observeRequests$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.favorites.domain.favoriteToggleProductButton.FavoriteToggleProductButtonInteractorImpl$observeRequests$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.favorites.domain.favoriteToggleProductButton.FavoriteToggleProductButtonInteractorImpl$observeRequests$$inlined$map$1$2", f = "FavoriteToggleProductButtonInteractorImpl.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.favorites.domain.favoriteToggleProductButton.FavoriteToggleProductButtonInteractorImpl$observeRequests$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
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

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
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
                    FavoriteToggleProductButtonChangeResult failure;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Object obj3 = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                WishlistItemDelete wishlistItemDelete = (WishlistItemDelete) obj;
                                if (wishlistItemDelete instanceof WishlistItemDelete.Success) {
                                    WishlistItemDelete.Success success = (WishlistItemDelete.Success) wishlistItemDelete;
                                    failure = new FavoriteToggleProductButtonChangeResult.Success(success.getSku(), success.getGiftId(), success.getNotification());
                                } else {
                                    if (!(wishlistItemDelete instanceof WishlistItemDelete.Failure)) {
                                        throw new o();
                                    }
                                    WishlistItemDelete.Failure failure2 = (WishlistItemDelete.Failure) wishlistItemDelete;
                                    failure = new FavoriteToggleProductButtonChangeResult.Failure(failure2.getSku(), failure2.getGiftId());
                                }
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(failure, anonymousClass1) == obj3) {
                                    return obj3;
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
                    Object obj32 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super FavoriteToggleProductButtonChangeResult> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new FavoriteToggleProductButtonInteractorImpl$observeRequests$2(this._favoriteToggleProductButtonUpdates));
    }

    @Override // ru.ozon.app.android.favorites.domain.favoriteToggleProductButton.FavoriteToggleProductButtonInteractor
    @NotNull
    public B0<FavoriteToggleProductButtonChangeResult> getFavoriteToggleProductButtonUpdates() {
        return this.favoriteToggleProductButtonUpdates;
    }
}

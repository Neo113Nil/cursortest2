package ru.ozon.app.android.account.favorites.seller;

import Bc.j;
import Bc.o;
import Bc.r;
import DM.g;
import Lm0.a;
import Nc.C3667a;
import VL.c;
import VL.d;
import VL.e;
import VL.f;
import android.annotation.SuppressLint;
import io.reactivex.AbstractC7094b;
import io.reactivex.C;
import io.reactivex.p;
import io.reactivex.y;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteServiceImpl;
import ru.ozon.app.android.account.favorites.seller.api.SellerActionResponse;
import ru.ozon.app.android.account.favorites.seller.api.SellerFavoriteApi;
import ru.ozon.app.android.account.favorites.seller.api.SellerFavoriteRequest;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storage.entity.sellerfavorites.SellerFavoriteDao;
import vc.C10296a;
import vc.h;
import vc.s;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 12\u00020\u0001:\u00011B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170\u001b0\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R:\u0010/\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0017 .*\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b0\u001b0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/account/favorites/seller/SellerFavoriteServiceImpl;", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "Lru/ozon/app/android/account/favorites/seller/api/SellerFavoriteApi;", "sellerFavoriteApi", "Lru/ozon/app/android/storage/entity/sellerfavorites/SellerFavoriteDao;", "sellerFavoriteDao", "<init>", "(Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/account/favorites/seller/api/SellerFavoriteApi;Lru/ozon/app/android/storage/entity/sellerfavorites/SellerFavoriteDao;)V", "", "sellerId", "Lio/reactivex/y;", "Lru/ozon/app/android/account/favorites/seller/api/SellerActionResponse;", "addSellerFavorite", "(J)Lio/reactivex/y;", "", "addSellerFavoriteLocal", "(J)V", "addSellerFavoriteWithResult", "removeSellerFavorite", "removeSellerFavoriteLocal", "removeSellerFavoriteWithResult", "", "isSellerFavoriteLocally", "(J)Z", "Lio/reactivex/p;", "", "favoritesChangeEvents", "()Lio/reactivex/p;", "Lnc/b;", "fillSellerFavoritesCache", "()Lnc/b;", "Lio/reactivex/b;", "syncLocalFavorites", "()Lio/reactivex/b;", "clearSellerFavoritesLocally", "()V", "clearSellerFavoritesSession", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/account/favorites/seller/api/SellerFavoriteApi;", "Lru/ozon/app/android/storage/entity/sellerfavorites/SellerFavoriteDao;", "Ljava/util/concurrent/ConcurrentHashMap;", "sessionFavorites", "Ljava/util/concurrent/ConcurrentHashMap;", "LNc/a;", "kotlin.jvm.PlatformType", "sessionFavoritesSubject", "LNc/a;", "Companion", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"CheckResult"})
/* loaded from: classes6.dex */
public final class SellerFavoriteServiceImpl implements SellerFavoriteService {

    @NotNull
    private final AuthStateStorage authStateStorage;

    @NotNull
    private final SellerFavoriteApi sellerFavoriteApi;

    @NotNull
    private final SellerFavoriteDao sellerFavoriteDao;

    @NotNull
    private final ConcurrentHashMap<Long, Boolean> sessionFavorites;

    @NotNull
    private final C3667a<Map<Long, Boolean>> sessionFavoritesSubject;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lkotlin/jvm/internal/EnhancedNullability;", "it", "Lio/reactivex/C;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.account.favorites.seller.SellerFavoriteServiceImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Boolean, C<? extends Unit>> {
        AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1(SellerFavoriteServiceImpl sellerFavoriteServiceImpl) {
            sellerFavoriteServiceImpl.clearSellerFavoritesSession();
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final C<? extends Unit> invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.booleanValue()) {
                return new s(SellerFavoriteServiceImpl.this.syncLocalFavorites().k(Mc.a.b()), new Callable() { // from class: ru.ozon.app.android.account.favorites.seller.a
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Unit unit;
                        unit = Unit.f71690a;
                        return unit;
                    }
                });
            }
            final SellerFavoriteServiceImpl sellerFavoriteServiceImpl = SellerFavoriteServiceImpl.this;
            return new o(new Callable() { // from class: ru.ozon.app.android.account.favorites.seller.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit invoke$lambda$1;
                    invoke$lambda$1 = SellerFavoriteServiceImpl.AnonymousClass1.invoke$lambda$1(SellerFavoriteServiceImpl.this);
                    return invoke$lambda$1;
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.account.favorites.seller.SellerFavoriteServiceImpl$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<Unit, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.f71690a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.account.favorites.seller.SellerFavoriteServiceImpl$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass3(Object obj) {
            super(1, obj, a.b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((a.b) this.receiver).e(th2);
        }
    }

    public SellerFavoriteServiceImpl(@NotNull AuthStateStorage authStateStorage, @NotNull SellerFavoriteApi sellerFavoriteApi, @NotNull SellerFavoriteDao sellerFavoriteDao) {
        Intrinsics.checkNotNullParameter(authStateStorage, "authStateStorage");
        Intrinsics.checkNotNullParameter(sellerFavoriteApi, "sellerFavoriteApi");
        Intrinsics.checkNotNullParameter(sellerFavoriteDao, "sellerFavoriteDao");
        this.authStateStorage = authStateStorage;
        this.sellerFavoriteApi = sellerFavoriteApi;
        this.sellerFavoriteDao = sellerFavoriteDao;
        this.sessionFavorites = new ConcurrentHashMap<>();
        C3667a<Map<Long, Boolean>> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.sessionFavoritesSubject = d11;
        fillSellerFavoritesCache();
        int i11 = 1;
        authStateStorage.getAuthState().observeOn(Mc.a.a()).switchMapSingle(new c(new AnonymousClass1(), i11)).subscribe(new d(AnonymousClass2.INSTANCE, i11), new Ol.b(new AnonymousClass3(Lm0.a.f17149a), 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C _init_$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addSellerFavorite$lambda$3(SellerFavoriteServiceImpl sellerFavoriteServiceImpl, long j11) {
        sellerFavoriteServiceImpl.sellerFavoriteDao.addSellerFavorite(j11);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SellerActionResponse addSellerFavorite$lambda$4() {
        return new SellerActionResponse("Магазин добавлен в избранное");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addSellerFavoriteLocal$lambda$6(SellerFavoriteServiceImpl sellerFavoriteServiceImpl, long j11) {
        sellerFavoriteServiceImpl.sellerFavoriteDao.addSellerFavorite(j11);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSellerFavoriteLocal$lambda$7(SellerFavoriteServiceImpl sellerFavoriteServiceImpl, long j11) {
        sellerFavoriteServiceImpl.sessionFavorites.put(Long.valueOf(j11), Boolean.TRUE);
        sellerFavoriteServiceImpl.sessionFavoritesSubject.onNext(sellerFavoriteServiceImpl.sessionFavorites);
    }

    private final void clearSellerFavoritesLocally() {
        this.sellerFavoriteDao.removeSellerFavorites();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearSellerFavoritesSession() {
        clearSellerFavoritesLocally();
        this.sessionFavorites.clear();
        this.sessionFavoritesSubject.onNext(this.sessionFavorites);
    }

    private final InterfaceC8487b fillSellerFavoritesCache() {
        InterfaceC8487b h11 = new r(this.sellerFavoriteDao.getSellerFavoritesAsync().j(Mc.a.b()).g(Mc.a.a()), new e(SellerFavoriteServiceImpl$fillSellerFavoritesCache$1.INSTANCE)).h(new f(new SellerFavoriteServiceImpl$fillSellerFavoritesCache$2(this), 1), new Py.b(new SellerFavoriteServiceImpl$fillSellerFavoritesCache$3(Lm0.a.f17149a), 3));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        return h11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map fillSellerFavoritesCache$lambda$17(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Map) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeSellerFavorite$lambda$10(SellerFavoriteServiceImpl sellerFavoriteServiceImpl, long j11) {
        sellerFavoriteServiceImpl.sellerFavoriteDao.removeSellerFavorite(j11);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SellerActionResponse removeSellerFavorite$lambda$11() {
        return new SellerActionResponse("Магазин удален из избранного");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeSellerFavoriteLocal$lambda$13(SellerFavoriteServiceImpl sellerFavoriteServiceImpl, long j11) {
        sellerFavoriteServiceImpl.sellerFavoriteDao.removeSellerFavorite(j11);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeSellerFavoriteLocal$lambda$14(SellerFavoriteServiceImpl sellerFavoriteServiceImpl, long j11) {
        sellerFavoriteServiceImpl.sessionFavorites.put(Long.valueOf(j11), Boolean.FALSE);
        sellerFavoriteServiceImpl.sessionFavoritesSubject.onNext(sellerFavoriteServiceImpl.sessionFavorites);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC7094b syncLocalFavorites() {
        C10296a c11 = this.sellerFavoriteApi.addSellersFavorite(this.sellerFavoriteDao.getSellerFavorites()).c(new io.reactivex.f() { // from class: fk.a
            @Override // io.reactivex.f
            public final void a(io.reactivex.d dVar) {
                SellerFavoriteServiceImpl.syncLocalFavorites$lambda$20(SellerFavoriteServiceImpl.this, dVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(c11, "andThen(...)");
        return c11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void syncLocalFavorites$lambda$20(SellerFavoriteServiceImpl sellerFavoriteServiceImpl, io.reactivex.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        sellerFavoriteServiceImpl.clearSellerFavoritesLocally();
    }

    @Override // ru.ozon.app.android.account.favorites.seller.SellerFavoriteService
    @NotNull
    public y<SellerActionResponse> addSellerFavorite(final long sellerId) {
        y<SellerActionResponse> addSellerFavoriteWithResult = this.authStateStorage.isAuthenticated() ? this.sellerFavoriteApi.addSellerFavoriteWithResult(new SellerFavoriteRequest(sellerId)) : new s(new h(new Callable() { // from class: fk.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit addSellerFavorite$lambda$3;
                addSellerFavorite$lambda$3 = SellerFavoriteServiceImpl.addSellerFavorite$lambda$3(SellerFavoriteServiceImpl.this, sellerId);
                return addSellerFavorite$lambda$3;
            }
        }), new Callable() { // from class: fk.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SellerActionResponse addSellerFavorite$lambda$4;
                addSellerFavorite$lambda$4 = SellerFavoriteServiceImpl.addSellerFavorite$lambda$4();
                return addSellerFavorite$lambda$4;
            }
        });
        g gVar = new g(new SellerFavoriteServiceImpl$addSellerFavorite$1(this, sellerId), 5);
        addSellerFavoriteWithResult.getClass();
        j jVar = new j(addSellerFavoriteWithResult, gVar);
        Intrinsics.checkNotNullExpressionValue(jVar, "doOnSuccess(...)");
        return jVar;
    }

    @Override // ru.ozon.app.android.account.favorites.seller.SellerFavoriteService
    public void addSellerFavoriteLocal(final long sellerId) {
        new h(new Callable() { // from class: fk.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit addSellerFavoriteLocal$lambda$6;
                addSellerFavoriteLocal$lambda$6 = SellerFavoriteServiceImpl.addSellerFavoriteLocal$lambda$6(SellerFavoriteServiceImpl.this, sellerId);
                return addSellerFavoriteLocal$lambda$6;
            }
        }).k(Mc.a.b()).d(new InterfaceC9019a() { // from class: fk.d
            @Override // qc.InterfaceC9019a
            public final void run() {
                SellerFavoriteServiceImpl.addSellerFavoriteLocal$lambda$7(SellerFavoriteServiceImpl.this, sellerId);
            }
        }).i();
    }

    @Override // ru.ozon.app.android.account.favorites.seller.SellerFavoriteService
    @NotNull
    public y<SellerActionResponse> addSellerFavoriteWithResult(long sellerId) {
        y<SellerActionResponse> addSellerFavoriteWithResult = this.sellerFavoriteApi.addSellerFavoriteWithResult(new SellerFavoriteRequest(sellerId));
        DJ.e eVar = new DJ.e(new SellerFavoriteServiceImpl$addSellerFavoriteWithResult$1(this, sellerId), 8);
        addSellerFavoriteWithResult.getClass();
        Bc.h hVar = new Bc.h(new j(addSellerFavoriteWithResult, eVar), new Hs.b(new SellerFavoriteServiceImpl$addSellerFavoriteWithResult$2(this, sellerId), 7));
        Intrinsics.checkNotNullExpressionValue(hVar, "doOnError(...)");
        return hVar;
    }

    @Override // ru.ozon.app.android.account.favorites.seller.SellerFavoriteService
    @NotNull
    public p<Map<Long, Boolean>> favoritesChangeEvents() {
        return this.sessionFavoritesSubject;
    }

    @Override // ru.ozon.app.android.account.favorites.seller.SellerFavoriteService
    public boolean isSellerFavoriteLocally(long sellerId) {
        Boolean bool = this.sessionFavorites.get(Long.valueOf(sellerId));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // ru.ozon.app.android.account.favorites.seller.SellerFavoriteService
    @NotNull
    public y<SellerActionResponse> removeSellerFavorite(final long sellerId) {
        y<SellerActionResponse> removeSellerFavoriteWithResult = this.authStateStorage.isAuthenticated() ? this.sellerFavoriteApi.removeSellerFavoriteWithResult(new SellerFavoriteRequest(sellerId)) : new s(new h(new Callable() { // from class: fk.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit removeSellerFavorite$lambda$10;
                removeSellerFavorite$lambda$10 = SellerFavoriteServiceImpl.removeSellerFavorite$lambda$10(SellerFavoriteServiceImpl.this, sellerId);
                return removeSellerFavorite$lambda$10;
            }
        }), new Callable() { // from class: fk.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SellerActionResponse removeSellerFavorite$lambda$11;
                removeSellerFavorite$lambda$11 = SellerFavoriteServiceImpl.removeSellerFavorite$lambda$11();
                return removeSellerFavorite$lambda$11;
            }
        });
        Fw.b bVar = new Fw.b(new SellerFavoriteServiceImpl$removeSellerFavorite$1(this, sellerId), 9);
        removeSellerFavoriteWithResult.getClass();
        j jVar = new j(removeSellerFavoriteWithResult, bVar);
        Intrinsics.checkNotNullExpressionValue(jVar, "doOnSuccess(...)");
        return jVar;
    }

    @Override // ru.ozon.app.android.account.favorites.seller.SellerFavoriteService
    public void removeSellerFavoriteLocal(final long sellerId) {
        new h(new Callable() { // from class: fk.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit removeSellerFavoriteLocal$lambda$13;
                removeSellerFavoriteLocal$lambda$13 = SellerFavoriteServiceImpl.removeSellerFavoriteLocal$lambda$13(SellerFavoriteServiceImpl.this, sellerId);
                return removeSellerFavoriteLocal$lambda$13;
            }
        }).k(Mc.a.b()).d(new InterfaceC9019a() { // from class: fk.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                SellerFavoriteServiceImpl.removeSellerFavoriteLocal$lambda$14(SellerFavoriteServiceImpl.this, sellerId);
            }
        }).i();
    }

    @Override // ru.ozon.app.android.account.favorites.seller.SellerFavoriteService
    @NotNull
    public y<SellerActionResponse> removeSellerFavoriteWithResult(long sellerId) {
        y<SellerActionResponse> removeSellerFavoriteWithResult = this.sellerFavoriteApi.removeSellerFavoriteWithResult(new SellerFavoriteRequest(sellerId));
        DM.h hVar = new DM.h(new SellerFavoriteServiceImpl$removeSellerFavoriteWithResult$1(this, sellerId), 4);
        removeSellerFavoriteWithResult.getClass();
        Bc.h hVar2 = new Bc.h(new j(removeSellerFavoriteWithResult, hVar), new GH.a(new SellerFavoriteServiceImpl$removeSellerFavoriteWithResult$2(this, sellerId), 9));
        Intrinsics.checkNotNullExpressionValue(hVar2, "doOnError(...)");
        return hVar2;
    }
}

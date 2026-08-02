package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.w0;
import He.b;
import Sc.o;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent$Result$ActionResult;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEventManager;
import ru.ozon.app.android.product.tiles.tilegrid2.domain.wishlist.WishlistTileKey;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist.WishlistUpdate;
import xe.B0;
import xe.C10720e0;
import xe.H0;
import xe.J;
import xe.L;
import xe.M;
import xe.N;
import xe.X0;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R0\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0019j\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006`\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010)\u001a\u0004\u0018\u00010&*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/domain/wishlist/WishlistServiceImpl;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/domain/wishlist/WishlistService;", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManager;", "wishlistEventManager", "<init>", "(Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManager;)V", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent;", "event", "", "onEvent", "(Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent;)V", "Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;", "key", "", "isRemovedFromWishlist", "(Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;)Z", "start", "()V", "LAe/h;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/domain/wishlist/WishlistUpdate;", "subscribeToEvents", "(Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;)LAe/h;", "stop", "clear", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManager;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "wishlistEventsMap", "Ljava/util/HashMap;", "Lxe/B0;", "wishlistEventsJob", "Lxe/B0;", "Lxe/M;", "wishlistEventsScope", "Lxe/M;", "LAe/w0;", "tileWishListedResultFlow", "LAe/w0;", "", "getId", "(Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent;)Ljava/lang/String;", "id", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WishlistServiceImpl implements WishlistService {

    @NotNull
    private final w0<WishlistUpdate> tileWishListedResultFlow;

    @NotNull
    private final WishlistEventManager wishlistEventManager;
    private B0 wishlistEventsJob;

    @NotNull
    private final HashMap<WishlistTileKey, WishlistEvent> wishlistEventsMap;

    @NotNull
    private final M wishlistEventsScope;

    public WishlistServiceImpl(@NotNull WishlistEventManager wishlistEventManager) {
        Intrinsics.checkNotNullParameter(wishlistEventManager, "wishlistEventManager");
        this.wishlistEventManager = wishlistEventManager;
        this.wishlistEventsMap = new HashMap<>();
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext d11 = CoroutineContext.Element.a.d(b.f10879b, (H0) b11);
        Intrinsics.checkNotNullExpressionValue("WishlistServiceImpl", "getSimpleName(...)");
        this.wishlistEventsScope = N.a(d11.plus(new L("WishlistServiceImpl")).plus(new WishlistServiceImpl$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
        this.tileWishListedResultFlow = E0.b(0, 1, EnumC11113a.DROP_OLDEST, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getId(WishlistEvent wishlistEvent) {
        String uniqId = wishlistEvent.getUniqId();
        if (uniqId != null) {
            return uniqId;
        }
        Long sku = wishlistEvent.getSku();
        if (sku != null) {
            return sku.toString();
        }
        return null;
    }

    private final void onEvent(WishlistEvent event) {
        HashMap<WishlistTileKey, WishlistEvent> hashMap = this.wishlistEventsMap;
        Long valueOf = Long.valueOf(event.getWishlistId());
        String id2 = getId(event);
        if (id2 == null) {
            return;
        }
        hashMap.put(new WishlistTileKey(valueOf, id2), event);
        this.tileWishListedResultFlow.tryEmit(new WishlistUpdate.Event(event));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object start$onEvent(WishlistServiceImpl wishlistServiceImpl, WishlistEvent wishlistEvent, d dVar) {
        wishlistServiceImpl.onEvent(wishlistEvent);
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist.WishlistService
    public void clear() {
        this.wishlistEventsMap.clear();
        this.tileWishListedResultFlow.tryEmit(WishlistUpdate.EventsCleared.INSTANCE);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist.WishlistService
    public boolean isRemovedFromWishlist(@NotNull WishlistTileKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        WishlistEvent wishlistEvent = this.wishlistEventsMap.get(key);
        return (wishlistEvent instanceof WishlistEvent.ProductRemoved) && ((WishlistEvent.ProductRemoved) wishlistEvent).getResult() == WishlistEvent$Result$ActionResult.SUCCEED;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist.WishlistService
    public void start() {
        B0 b02 = this.wishlistEventsJob;
        if (b02 == null || !b02.isActive()) {
            this.wishlistEventsJob = C2399j.C(new C2408n0(this.wishlistEventManager.getWishlistEvents(), new WishlistServiceImpl$start$1(this)), this.wishlistEventsScope);
        }
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist.WishlistService
    public void stop() {
        B0 b02 = this.wishlistEventsJob;
        if (b02 != null) {
            b02.j(null);
        }
        xe.E0.d(this.wishlistEventsScope.getCoroutineContext());
        this.wishlistEventsJob = null;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist.WishlistService
    @NotNull
    public InterfaceC2395h<WishlistUpdate> subscribeToEvents(@NotNull final WishlistTileKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        final w0<WishlistUpdate> w0Var = this.tileWishListedResultFlow;
        return new InterfaceC2395h<WishlistUpdate>() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist.WishlistServiceImpl$subscribeToEvents$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist.WishlistServiceImpl$subscribeToEvents$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ WishlistTileKey $key$inlined;
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ WishlistServiceImpl this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist.WishlistServiceImpl$subscribeToEvents$$inlined$filter$1$2", f = "WishlistServiceImpl.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist.WishlistServiceImpl$subscribeToEvents$$inlined$filter$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, WishlistTileKey wishlistTileKey, WishlistServiceImpl wishlistServiceImpl) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.$key$inlined = wishlistTileKey;
                    this.this$0 = wishlistServiceImpl;
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
                
                    if (kotlin.jvm.internal.Intrinsics.d(r2, r8.$key$inlined.getTileId()) != false) goto L26;
                 */
                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    String id2;
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
                                WishlistUpdate wishlistUpdate = (WishlistUpdate) obj;
                                if (wishlistUpdate instanceof WishlistUpdate.Event) {
                                    WishlistUpdate.Event event = (WishlistUpdate.Event) wishlistUpdate;
                                    long wishlistId = event.getEvent().getWishlistId();
                                    Long wishlistId2 = this.$key$inlined.getWishlistId();
                                    if (wishlistId2 != null && wishlistId == wishlistId2.longValue()) {
                                        id2 = this.this$0.getId(event.getEvent());
                                    }
                                } else if (!Intrinsics.d(wishlistUpdate, WishlistUpdate.EventsCleared.INSTANCE)) {
                                    throw new o();
                                }
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                    return aVar;
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
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, key, this), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        };
    }
}

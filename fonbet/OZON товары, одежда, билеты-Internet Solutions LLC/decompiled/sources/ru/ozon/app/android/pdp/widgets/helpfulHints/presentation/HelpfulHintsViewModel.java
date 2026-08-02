package ru.ozon.app.android.pdp.widgets.helpfulHints.presentation;

import AF.b;
import AF.d;
import Fn.C3055d;
import Mc.a;
import Sc.o;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.pdp.ui.configurators.pdp.helpfulhints.HelpfulHintsInfoStorage;
import ru.ozon.app.android.pdp.ui.configurators.pdp.helpfulhints.HelpfulHintsVO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;
import sc.C9653a;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\fJ\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010-R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0018\u00103\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101¨\u00065"}, d2 = {"Lru/ozon/app/android/pdp/widgets/helpfulHints/presentation/HelpfulHintsViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "favoriteInteractor", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;Lru/ozon/app/android/cart/common/domain/CartService;)V", "Lru/ozon/app/android/pdp/ui/configurators/pdp/helpfulhints/HelpfulHintsVO;", "vo", "", "observeCart", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/helpfulhints/HelpfulHintsVO;)V", "", "sku", "Lru/ozon/app/android/pdp/ui/configurators/pdp/helpfulhints/HelpfulHintsVO$NotificationBehavior;", "behavior", "cancelTimer", "(Ljava/lang/String;Lru/ozon/app/android/pdp/ui/configurators/pdp/helpfulhints/HelpfulHintsVO$NotificationBehavior;)V", "observeFavorites", "", "showNotificationIfNeed", "(J)V", "onCleared", "()V", "item", "startTimer", "stopTimer", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "_notificationShow", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/P;", "notificationShow", "Landroidx/lifecycle/P;", "getNotificationShow", "()Landroidx/lifecycle/P;", "Lxe/B0;", "job", "Lxe/B0;", "Ljava/util/concurrent/atomic/AtomicInteger;", "delaySeconds", "Ljava/util/concurrent/atomic/AtomicInteger;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/helpfulhints/HelpfulHintsVO;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/helpfulhints/HelpfulHintsVO$NotificationBehavior;", "Lnc/b;", "favoriteChecker", "Lnc/b;", "cartChecker", "favoriteStateChecker", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HelpfulHintsViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<NotificationAtom.NotificationWithIcon> _notificationShow;

    @NotNull
    private HelpfulHintsVO.NotificationBehavior behavior;
    private InterfaceC8487b cartChecker;

    @NotNull
    private final CartService cartService;

    @NotNull
    private AtomicInteger delaySeconds;
    private InterfaceC8487b favoriteChecker;

    @NotNull
    private final FavoriteInteractor favoriteInteractor;
    private InterfaceC8487b favoriteStateChecker;
    private B0 job;

    @NotNull
    private final P<NotificationAtom.NotificationWithIcon> notificationShow;
    private HelpfulHintsVO vo;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HelpfulHintsVO.NotificationBehavior.values().length];
            try {
                iArr[HelpfulHintsVO.NotificationBehavior.ADD_TO_FAV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HelpfulHintsVO.NotificationBehavior.ADD_TO_CART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HelpfulHintsVO.NotificationBehavior.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HelpfulHintsVO.NotificationBehavior.ORDER_DONE_LITE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HelpfulHintsViewModel(@NotNull FavoriteInteractor favoriteInteractor, @NotNull CartService cartService) {
        Intrinsics.checkNotNullParameter(favoriteInteractor, "favoriteInteractor");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        this.favoriteInteractor = favoriteInteractor;
        this.cartService = cartService;
        SingleLiveEvent<NotificationAtom.NotificationWithIcon> singleLiveEvent = new SingleLiveEvent<>();
        this._notificationShow = singleLiveEvent;
        this.notificationShow = singleLiveEvent;
        this.delaySeconds = new AtomicInteger();
        this.behavior = HelpfulHintsVO.NotificationBehavior.CUSTOM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTimer(String sku, HelpfulHintsVO.NotificationBehavior behavior) {
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        HelpfulHintsInfoStorage.INSTANCE.addToSetOfSku(sku, 0, behavior);
    }

    private final void observeCart(HelpfulHintsVO vo) {
        InterfaceC8487b interfaceC8487b = this.cartChecker;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
        this.cartChecker = this.cartService.observeCartState(true).subscribeOn(a.b()).observeOn(C8125a.a()).subscribe(new d(new HelpfulHintsViewModel$observeCart$1(vo, this), 10));
    }

    private final void observeFavorites(HelpfulHintsVO vo) {
        InterfaceC8487b interfaceC8487b = this.favoriteStateChecker;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
        this.favoriteStateChecker = this.favoriteInteractor.favoriteChangeEvents().subscribeOn(a.b()).filter(new b(HelpfulHintsViewModel$observeFavorites$1.INSTANCE, 9)).observeOn(C8125a.a()).subscribe(new C3055d(new HelpfulHintsViewModel$observeFavorites$2(vo, this), 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean observeFavorites$lambda$2(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotificationIfNeed(long sku) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.behavior.ordinal()];
        if (i11 == 1) {
            InterfaceC8487b interfaceC8487b = this.favoriteChecker;
            if (interfaceC8487b != null) {
                interfaceC8487b.dispose();
            }
            this.favoriteChecker = this.favoriteInteractor.isFavorite(sku).j(a.b()).g(C8125a.a()).h(new AF.a(new HelpfulHintsViewModel$showNotificationIfNeed$1(this), 10), C9653a.f98525e);
            return;
        }
        if (i11 == 2) {
            if (CartService.DefaultImpls.isProductInCart$default(this.cartService, sku, null, 2, null)) {
                return;
            }
            SingleLiveEvent<NotificationAtom.NotificationWithIcon> singleLiveEvent = this._notificationShow;
            HelpfulHintsVO helpfulHintsVO = this.vo;
            singleLiveEvent.setValue(helpfulHintsVO != null ? helpfulHintsVO.getNotification() : null);
            return;
        }
        if (i11 == 3) {
            SingleLiveEvent<NotificationAtom.NotificationWithIcon> singleLiveEvent2 = this._notificationShow;
            HelpfulHintsVO helpfulHintsVO2 = this.vo;
            singleLiveEvent2.setValue(helpfulHintsVO2 != null ? helpfulHintsVO2.getNotification() : null);
        } else {
            if (i11 != 4) {
                throw new o();
            }
            SingleLiveEvent<NotificationAtom.NotificationWithIcon> singleLiveEvent3 = this._notificationShow;
            HelpfulHintsVO helpfulHintsVO3 = this.vo;
            singleLiveEvent3.setValue(helpfulHintsVO3 != null ? helpfulHintsVO3.getNotification() : null);
        }
    }

    @NotNull
    public final P<NotificationAtom.NotificationWithIcon> getNotificationShow() {
        return this.notificationShow;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        InterfaceC8487b interfaceC8487b = this.favoriteChecker;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
        InterfaceC8487b interfaceC8487b2 = this.cartChecker;
        if (interfaceC8487b2 != null) {
            interfaceC8487b2.dispose();
        }
        InterfaceC8487b interfaceC8487b3 = this.favoriteStateChecker;
        if (interfaceC8487b3 != null) {
            interfaceC8487b3.dispose();
        }
    }

    public final void startTimer(@NotNull HelpfulHintsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.vo = item;
        HelpfulHintsVO.NotificationBehavior notificationBehaviour = item.getNotificationBehaviour();
        this.behavior = notificationBehaviour;
        int i11 = WhenMappings.$EnumSwitchMapping$0[notificationBehaviour.ordinal()];
        if (i11 == 1) {
            observeFavorites(item);
        } else if (i11 == 2) {
            observeCart(item);
        }
        AtomicInteger atomicInteger = this.delaySeconds;
        Integer time = HelpfulHintsInfoStorage.INSTANCE.getTime(item.getSku(), this.behavior);
        atomicInteger.set(time != null ? time.intValue() : item.getSeconds());
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        this.job = C10727i.c(x0.a(this), null, null, new HelpfulHintsViewModel$startTimer$1(this, item, null), 3);
    }

    public final void stopTimer() {
        String sku;
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        HelpfulHintsVO helpfulHintsVO = this.vo;
        if (helpfulHintsVO == null || (sku = helpfulHintsVO.getSku()) == null) {
            return;
        }
        HelpfulHintsInfoStorage.INSTANCE.addToSetOfSku(sku, this.delaySeconds.get(), this.behavior);
    }
}

package ru.ozon.app.android.cart.domain.prefetch.controller;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import B0.C2454a;
import De.C2862e;
import He.b;
import Sc.o;
import Sc.s;
import Wc.a;
import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.data.prefetch.CartPrefetchController;
import ru.ozon.app.android.cart.common.data.prefetch.state.CartPrefetchState;
import ru.ozon.app.android.cart.common.domain.CartNavigationService;
import ru.ozon.app.android.cart.common.domain.delegate.CartModeManager;
import ru.ozon.app.android.cart.common.domain.delegate.CartScreenStateHolder;
import ru.ozon.app.android.cart.domain.prefetch.cache.CartCacheHandler;
import ru.ozon.app.android.cart.domain.prefetch.cache.CartCacheReason;
import ru.ozon.app.android.cart.domain.prefetch.flags.CartAdditionalPrefetchOnInvalidateCache;
import ru.ozon.app.android.cart.domain.prefetch.flags.CartPrefetchAppStartFlag;
import ru.ozon.app.android.cart.domain.prefetch.flags.CartPrefetchOnAddToCartForMiniAppWhiteListFlag;
import ru.ozon.app.android.cart.domain.prefetch.flags.CartPrefetchOnCartSynced;
import ru.ozon.app.android.cart.domain.prefetch.flags.CartPrefetchOnChangeMiniAppWhiteListFlag;
import ru.ozon.app.android.cart.domain.prefetch.flags.CartPrefetchOnOrderDoneFlag;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;
import ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchService;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.navigation.miniapp.CurrentMiniAppHolder;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.L;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 b2\u00020\u0001:\u0001bBQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\"\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00182\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00182\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b(\u0010'J\u0017\u0010)\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b)\u0010\u001aJ\u0013\u0010.\u001a\u00020+*\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b/\u0010\u001aJ\u0017\u00101\u001a\u00020\u00162\u0006\u00100\u001a\u00020*H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0016H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0016H\u0002¢\u0006\u0004\b5\u00104J\u000f\u00106\u001a\u00020\u0016H\u0002¢\u0006\u0004\b6\u00104J\u000f\u00107\u001a\u00020\u0016H\u0002¢\u0006\u0004\b7\u00104J\u0013\u00109\u001a\u000208*\u00020$H\u0002¢\u0006\u0004\b9\u0010:J\u0013\u0010;\u001a\u00020\u0016*\u00020\u001dH\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00182\u0006\u0010%\u001a\u000208H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00182\u0006\u0010%\u001a\u00020+H\u0002¢\u0006\u0004\b?\u0010@J\u001d\u0010E\u001a\u00020\u00182\f\u0010D\u001a\b\u0012\u0004\u0012\u00020C0BH\u0002¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010GR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010HR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010IR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010JR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010KR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010LR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010MR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010QR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u0002080S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR$\u0010Y\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0014\u0010a\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006c"}, d2 = {"Lru/ozon/app/android/cart/domain/prefetch/controller/CartPrefetchControllerImpl;", "Lru/ozon/app/android/cart/common/data/prefetch/CartPrefetchController;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchService;", "composerPrefetchService", "Lru/ozon/app/android/cart/domain/prefetch/cache/CartCacheHandler;", "cacheHandler", "Lru/ozon/app/android/cart/common/domain/delegate/CartScreenStateHolder;", "cartScreenStateHolder", "Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolder;", "currentMiniAppHolder", "Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "cartModeManager", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "cartNavigationService", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatchersProvider", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchService;Lru/ozon/app/android/cart/domain/prefetch/cache/CartCacheHandler;Lru/ozon/app/android/cart/common/domain/delegate/CartScreenStateHolder;Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolder;Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;Lru/ozon/app/android/cart/common/domain/CartNavigationService;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "", "hasDiff", "", "prefetch", "(Z)V", "prefetchOnAppStart", "()V", "", "requestId", ImagesContract.URL, "", "statusCode", "tracePageLoad", "(Ljava/lang/String;Ljava/lang/String;I)V", "Lru/ozon/app/android/cart/common/data/prefetch/CartPrefetchController$ClearCacheReason;", "reason", "clearCache", "(Lru/ozon/app/android/cart/common/data/prefetch/CartPrefetchController$ClearCacheReason;)V", "clearCartCache", "oldPrefetch", "Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;", "Lru/ozon/app/android/cart/domain/prefetch/cache/CartCacheReason;", "toCartCacheReason-p4RCBwo", "(Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;)Ljava/lang/String;", "toCartCacheReason", "newPrefetch", "state", "allowPrefetch", "(Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;)Z", "isPrefetchingAddToCart", "()Z", "isPrefetchAppStart", "isPrefetchChangeMiniApp", "isPrefetchOrderDone", "Lru/ozon/app/android/composer/network/cache/ClearCacheReason;", "toHandlerReason", "(Lru/ozon/app/android/cart/common/data/prefetch/CartPrefetchController$ClearCacheReason;)Lru/ozon/app/android/composer/network/cache/ClearCacheReason;", "containsCurrentMiniApp", "(Ljava/lang/String;)Z", "prefetchAdditionalOnInvalidateCache", "(Lru/ozon/app/android/composer/network/cache/ClearCacheReason;)V", "doPrefetch-21HNBsg", "(Ljava/lang/String;)V", "doPrefetch", "Lkotlin/Function0;", "", "then", "waitActionIfNeedThenDo", "(Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/composer/network/prefetch/ComposerPrefetchService;", "Lru/ozon/app/android/cart/domain/prefetch/cache/CartCacheHandler;", "Lru/ozon/app/android/cart/common/domain/delegate/CartScreenStateHolder;", "Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolder;", "Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "Lxe/M;", "waitActionScope", "Lxe/M;", "clearCacheScope", "", "additionalPrefetchForReasons", "Ljava/util/List;", "Lxe/B0;", "waitingActionJob", "Lxe/B0;", "currentPrefetchState", "Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;", "getCurrentPrefetchState", "()Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;", "setCurrentPrefetchState", "(Lru/ozon/app/android/cart/common/data/prefetch/state/CartPrefetchState;)V", "getPrefetchUrl", "()Ljava/lang/String;", "prefetchUrl", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartPrefetchControllerImpl implements CartPrefetchController {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Uri refreshUri = LinkGenerator.INSTANCE.cart();

    @NotNull
    private final List<ClearCacheReason> additionalPrefetchForReasons;

    @NotNull
    private final CartCacheHandler cacheHandler;

    @NotNull
    private final CartModeManager cartModeManager;

    @NotNull
    private final CartNavigationService cartNavigationService;

    @NotNull
    private final CartScreenStateHolder cartScreenStateHolder;

    @NotNull
    private final M clearCacheScope;

    @NotNull
    private final ComposerPrefetchService composerPrefetchService;

    @NotNull
    private final CurrentMiniAppHolder currentMiniAppHolder;
    private volatile CartPrefetchState currentPrefetchState;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final M waitActionScope;
    private B0 waitingActionJob;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/composer/network/cache/ClearCacheReason;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.cart.domain.prefetch.controller.CartPrefetchControllerImpl$2", f = "CartPrefetchControllerImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.cart.domain.prefetch.controller.CartPrefetchControllerImpl$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<ClearCacheReason, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.cart.domain.prefetch.controller.CartPrefetchControllerImpl$2$1, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
            final /* synthetic */ ClearCacheReason $it;
            final /* synthetic */ CartPrefetchControllerImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CartPrefetchControllerImpl cartPrefetchControllerImpl, ClearCacheReason clearCacheReason) {
                super(0);
                this.this$0 = cartPrefetchControllerImpl;
                this.$it = clearCacheReason;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.prefetchAdditionalOnInvalidateCache(this.$it);
            }
        }

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = CartPrefetchControllerImpl.this.new AnonymousClass2(dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            ClearCacheReason clearCacheReason = (ClearCacheReason) this.L$0;
            CartPrefetchControllerImpl cartPrefetchControllerImpl = CartPrefetchControllerImpl.this;
            cartPrefetchControllerImpl.waitActionIfNeedThenDo(new AnonymousClass1(cartPrefetchControllerImpl, clearCacheReason));
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ClearCacheReason clearCacheReason, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(clearCacheReason, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cart/domain/prefetch/controller/CartPrefetchControllerImpl$Companion;", "", "<init>", "()V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CartPrefetchController.ClearCacheReason.values().length];
            try {
                iArr[CartPrefetchController.ClearCacheReason.CART_PREFETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CartPrefetchController.ClearCacheReason.CART_BEFORE_START_PREFETCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CartPrefetchController.ClearCacheReason.CANCEL_ORDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CartPrefetchController.ClearCacheReason.CANCEL_ORDER_HANDLER_V3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CartPrefetchControllerImpl(@NotNull FeatureChecker featureChecker, @NotNull FeatureService featureService, @NotNull ComposerPrefetchService composerPrefetchService, @NotNull CartCacheHandler cacheHandler, @NotNull CartScreenStateHolder cartScreenStateHolder, @NotNull CurrentMiniAppHolder currentMiniAppHolder, @NotNull CartModeManager cartModeManager, @NotNull CartNavigationService cartNavigationService, @NotNull CoroutineDispatcherProvider dispatchersProvider) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(composerPrefetchService, "composerPrefetchService");
        Intrinsics.checkNotNullParameter(cacheHandler, "cacheHandler");
        Intrinsics.checkNotNullParameter(cartScreenStateHolder, "cartScreenStateHolder");
        Intrinsics.checkNotNullParameter(currentMiniAppHolder, "currentMiniAppHolder");
        Intrinsics.checkNotNullParameter(cartModeManager, "cartModeManager");
        Intrinsics.checkNotNullParameter(cartNavigationService, "cartNavigationService");
        Intrinsics.checkNotNullParameter(dispatchersProvider, "dispatchersProvider");
        this.featureChecker = featureChecker;
        this.featureService = featureService;
        this.composerPrefetchService = composerPrefetchService;
        this.cacheHandler = cacheHandler;
        this.cartScreenStateHolder = cartScreenStateHolder;
        this.currentMiniAppHolder = currentMiniAppHolder;
        this.cartModeManager = cartModeManager;
        this.cartNavigationService = cartNavigationService;
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext d11 = CoroutineContext.Element.a.d(b.f10879b, (H0) b11);
        Intrinsics.checkNotNullExpressionValue("CartPrefetchControllerImpl", "getSimpleName(...)");
        this.waitActionScope = N.a(d11.plus(new L("CartPrefetchControllerImpl")).plus(new CartPrefetchControllerImpl$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
        C2862e a11 = N.a(dispatchersProvider.getIO());
        this.clearCacheScope = a11;
        this.additionalPrefetchForReasons = C7714v.b0(ClearCacheReason.ADDRESS_STATE_CHANGED, ClearCacheReason.FAVORITE_STATE_CHANGED);
        final Ae.B0<ClearCacheReason> cartClearCacheReasonSharedFlow = cacheHandler.getCartClearCacheReasonSharedFlow();
        C2399j.C(new C2408n0(new InterfaceC2395h<ClearCacheReason>() { // from class: ru.ozon.app.android.cart.domain.prefetch.controller.CartPrefetchControllerImpl$special$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.cart.domain.prefetch.controller.CartPrefetchControllerImpl$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ CartPrefetchControllerImpl this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.cart.domain.prefetch.controller.CartPrefetchControllerImpl$special$$inlined$filter$1$2", f = "CartPrefetchControllerImpl.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.cart.domain.prefetch.controller.CartPrefetchControllerImpl$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes11.dex */
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

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, CartPrefetchControllerImpl cartPrefetchControllerImpl) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = cartPrefetchControllerImpl;
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
                    List list;
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
                                list = this.this$0.additionalPrefetchForReasons;
                                if (list.contains((ClearCacheReason) obj)) {
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
            public Object collect(InterfaceC2397i<? super ClearCacheReason> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new AnonymousClass2(null)), a11);
    }

    private final boolean allowPrefetch(CartPrefetchState state) {
        if (state instanceof CartPrefetchState.AddToCart) {
            return isPrefetchingAddToCart() && !this.cartScreenStateHolder.isOpen();
        }
        if (state instanceof CartPrefetchState.ChangeMiniApp) {
            return isPrefetchChangeMiniApp() && ((this.currentMiniAppHolder.isMainMiniApp() && !this.cartScreenStateHolder.isOpen()) || !this.currentMiniAppHolder.isMainMiniApp());
        }
        if (state instanceof CartPrefetchState.OrderDone) {
            return isPrefetchOrderDone();
        }
        if (state instanceof CartPrefetchState.AppStart) {
            return isPrefetchAppStart();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearCartCache(CartPrefetchController.ClearCacheReason reason) {
        this.cacheHandler.removeAllCacheForGroup(toHandlerReason(reason));
    }

    private final boolean containsCurrentMiniApp(String str) {
        List m11 = h.m(str, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(C7714v.z(m11, 10));
        Iterator it = m11.iterator();
        while (it.hasNext()) {
            C2454a.g((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!h.K((String) next)) {
                arrayList2.add(next);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (h.e0(this.currentMiniAppHolder.getCurrentMiniApp(), (String) it3.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: doPrefetch-21HNBsg, reason: not valid java name */
    private final void m546doPrefetch21HNBsg(String reason) {
        L00.c prefetch$default = ComposerPrefetchService.DefaultImpls.prefetch$default(this.composerPrefetchService, getPrefetchUrl(), this.cacheHandler.getCacheGroup(), null, 4, null);
        if (prefetch$default == null) {
            return;
        }
        this.cacheHandler.m524setPrefetchReasonCvmKg8I(prefetch$default.c().j(), reason);
    }

    private final String getPrefetchUrl() {
        Object build;
        if (this.currentMiniAppHolder.isMainMiniApp()) {
            build = this.cartNavigationService.getCurrentTab();
            if (build == null) {
                build = refreshUri;
            }
        } else {
            build = refreshUri.buildUpon().appendQueryParameter("miniapp", this.currentMiniAppHolder.getCurrentMiniApp()).build();
        }
        return build.toString();
    }

    private final boolean isPrefetchAppStart() {
        return this.featureChecker.isEnabled(CartPrefetchAppStartFlag.INSTANCE);
    }

    private final boolean isPrefetchChangeMiniApp() {
        return containsCurrentMiniApp(this.featureService.getStringKey(CartPrefetchOnChangeMiniAppWhiteListFlag.INSTANCE));
    }

    private final boolean isPrefetchOrderDone() {
        return this.featureChecker.isEnabled(CartPrefetchOnOrderDoneFlag.INSTANCE);
    }

    private final boolean isPrefetchingAddToCart() {
        return containsCurrentMiniApp(this.featureService.getStringKey(CartPrefetchOnAddToCartForMiniAppWhiteListFlag.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void newPrefetch(boolean hasDiff) {
        if (hasDiff && !this.cartScreenStateHolder.isOpen(this.currentMiniAppHolder.getCurrentMiniApp())) {
            clearCartCache(CartPrefetchController.ClearCacheReason.CART_PREFETCH);
            m546doPrefetch21HNBsg(CartCacheReason.m528constructorimpl("didUpdateWithRemoteState"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void oldPrefetch(boolean hasDiff) {
        CartPrefetchState cartPrefetchState = this.currentPrefetchState;
        if (cartPrefetchState == null) {
            return;
        }
        if (!cartPrefetchState.equals(CartPrefetchState.CartUpdate.INSTANCE) || hasDiff) {
            if (!cartPrefetchState.equals(CartPrefetchState.AppStart.INSTANCE)) {
                clearCartCache(CartPrefetchController.ClearCacheReason.CART_PREFETCH);
            }
            if (allowPrefetch(cartPrefetchState)) {
                m546doPrefetch21HNBsg(m547toCartCacheReasonp4RCBwo(cartPrefetchState));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prefetchAdditionalOnInvalidateCache(ClearCacheReason reason) {
        if (this.featureChecker.isEnabled(CartAdditionalPrefetchOnInvalidateCache.INSTANCE) && !this.cartScreenStateHolder.isOpen(this.currentMiniAppHolder.getCurrentMiniApp())) {
            m546doPrefetch21HNBsg(reason == ClearCacheReason.ADDRESS_STATE_CHANGED ? CartCacheReason.m528constructorimpl("locationDidChange") : CartCacheReason.m528constructorimpl("didChangeIsFavorite"));
        }
    }

    /* renamed from: toCartCacheReason-p4RCBwo, reason: not valid java name */
    private final String m547toCartCacheReasonp4RCBwo(CartPrefetchState cartPrefetchState) {
        String str;
        if (Intrinsics.d(cartPrefetchState, CartPrefetchState.AddToCart.INSTANCE)) {
            str = "addToCart";
        } else if (Intrinsics.d(cartPrefetchState, CartPrefetchState.AppStart.INSTANCE)) {
            str = "appStart";
        } else if (Intrinsics.d(cartPrefetchState, CartPrefetchState.Authentication.INSTANCE)) {
            str = "authentication";
        } else if (Intrinsics.d(cartPrefetchState, CartPrefetchState.CartUpdate.INSTANCE)) {
            str = "cartUpdate";
        } else if (Intrinsics.d(cartPrefetchState, CartPrefetchState.ChangeMiniApp.INSTANCE)) {
            str = "changeMiniApp";
        } else if (Intrinsics.d(cartPrefetchState, CartPrefetchState.OrderDone.INSTANCE)) {
            str = "orderDone";
        } else {
            if (!Intrinsics.d(cartPrefetchState, CartPrefetchState.AddToFamilyCart.INSTANCE)) {
                throw new o();
            }
            str = "addToFamilyCart";
        }
        return CartCacheReason.m528constructorimpl(str);
    }

    private final ClearCacheReason toHandlerReason(CartPrefetchController.ClearCacheReason clearCacheReason) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[clearCacheReason.ordinal()];
        if (i11 == 1) {
            return ClearCacheReason.CART_PREFETCH_CONTROLLER_PREFETCH;
        }
        if (i11 == 2) {
            return ClearCacheReason.CART_PREFETCH_CONTROLLER_BEFORE_START_PREFETCH;
        }
        if (i11 == 3) {
            return ClearCacheReason.CART_PREFETCH_CONTROLLER_CANCEL_ORDER;
        }
        if (i11 == 4) {
            return ClearCacheReason.CART_PREFETCH_CONTROLLER_CANCEL_ORDER_HANDLER_V3;
        }
        throw new o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void waitActionIfNeedThenDo(Function0<? extends Object> then) {
        if (!this.cartModeManager.enabledCartModes()) {
            then.invoke();
            return;
        }
        B0 b02 = this.waitingActionJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.waitingActionJob = C10727i.c(this.waitActionScope, null, null, new CartPrefetchControllerImpl$waitActionIfNeedThenDo$1(this, then, null), 3);
    }

    @Override // ru.ozon.app.android.cart.common.data.prefetch.CartPrefetchController
    public void clearCache(@NotNull CartPrefetchController.ClearCacheReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        C10727i.c(this.clearCacheScope, null, null, new CartPrefetchControllerImpl$clearCache$1(this, reason, null), 3);
    }

    public void prefetch(boolean hasDiff) {
        if (this.featureChecker.isEnabled(CartPrefetchOnCartSynced.INSTANCE)) {
            waitActionIfNeedThenDo(new CartPrefetchControllerImpl$prefetch$1(this, hasDiff));
        } else {
            waitActionIfNeedThenDo(new CartPrefetchControllerImpl$prefetch$2(this, hasDiff));
        }
    }

    @Override // ru.ozon.app.android.cart.common.data.prefetch.CartPrefetchController
    public void prefetchOnAppStart() {
        this.currentPrefetchState = CartPrefetchState.AppStart.INSTANCE;
        if (this.featureChecker.isEnabled(CartPrefetchOnCartSynced.INSTANCE)) {
            return;
        }
        waitActionIfNeedThenDo(new CartPrefetchControllerImpl$prefetchOnAppStart$1(this));
    }

    public final void setCurrentPrefetchState(CartPrefetchState cartPrefetchState) {
        this.currentPrefetchState = cartPrefetchState;
    }

    @Override // ru.ozon.app.android.cart.common.data.prefetch.CartPrefetchController
    public void tracePageLoad(String requestId, @NotNull String url, int statusCode) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.cacheHandler.tracePageLoad(requestId, url, statusCode);
    }
}

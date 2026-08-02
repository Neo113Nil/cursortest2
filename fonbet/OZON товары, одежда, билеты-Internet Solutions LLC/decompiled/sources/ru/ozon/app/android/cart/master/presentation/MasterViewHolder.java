package ru.ozon.app.android.cart.master.presentation;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Sc.s;
import W10.c;
import WZ.d;
import WZ.l;
import WZ.t;
import android.view.View;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.K;
import d20.AbstractC6065b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.CartViewModel;
import ru.ozon.app.android.cart.common.data.prefetch.state.CartPrefetchState;
import ru.ozon.app.android.cart.common.domain.CartChangeSource;
import ru.ozon.app.android.cart.common.domain.CartNavigationService;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartType;
import ru.ozon.app.android.cart.common.domain.delegate.CartItemsChecker;
import ru.ozon.app.android.cart.common.domain.local.CartSource;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.cart.domain.prefetch.flags.CartRemoveExtraCacheRemovalFlag;
import ru.ozon.app.android.cart.flags.CartBigOzonItemsAtFreshMiniapp;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.composer.ui.widget.f;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001ABC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f*\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001cH\u0016¢\u0006\u0004\b'\u0010(J'\u0010-\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00103R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00104R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00105R\u0016\u00106\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001e\u0010:\u001a\n\u0018\u000108j\u0004\u0018\u0001`98\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010=\u001a\u0004\u0018\u00010<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lru/ozon/app/android/cart/master/presentation/MasterViewHolder;", "Ld20/b;", "Lru/ozon/app/android/cart/master/presentation/MasterVO;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "cartNavigationService", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/cart/CartViewModel;", "viewModel", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/cart/common/domain/delegate/CartItemsChecker;", "cartItemsChecker", "Ll10/i;", "container", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/cart/common/domain/CartNavigationService;LWZ/l;Lru/ozon/app/android/cart/CartViewModel;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/cart/common/domain/delegate/CartItemsChecker;Ll10/i;)V", "", "needUpdateCart", "()Z", "", "Lru/ozon/app/android/cart/master/presentation/CartSummaryItemVO;", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "Lru/ozon/app/android/cart/common/domain/CartType;", "cartType", "", "updateCart", "(Ljava/util/List;Lru/ozon/app/android/cart/common/domain/CartType;)V", "", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "toCartItemsMap", "(Ljava/util/List;)Ljava/util/Map;", "item", "bind", "(Lru/ozon/app/android/cart/master/presentation/MasterVO;)V", "onRefresh", "()V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/cart/master/presentation/MasterVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "LWZ/l;", "Lru/ozon/app/android/cart/CartViewModel;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/cart/common/domain/delegate/CartItemsChecker;", "Ll10/i;", "wasRefresh", "Z", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "LWZ/t;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MasterViewHolder extends AbstractC6065b<MasterVO> {

    @NotNull
    private final CartItemsChecker cartItemsChecker;

    @NotNull
    private final CartNavigationService cartNavigationService;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final i container;

    @NotNull
    private final FeatureChecker featureChecker;
    private final View metricView;

    @NotNull
    private final l tokenizedAnalytics;
    private t tokenizedEvent;

    @NotNull
    private final CartViewModel viewModel;
    private boolean wasRefresh;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final d pullRefreshFilter = new d(MasterViewHolder$Companion$pullRefreshFilter$1.INSTANCE);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "it", "", "<anonymous>", "(LA00/a;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.cart.master.presentation.MasterViewHolder$1", f = "MasterViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.cart.master.presentation.MasterViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<a, kotlin.coroutines.d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = MasterViewHolder.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(a aVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            a aVar2 = (a) this.L$0;
            if (aVar2 instanceof a.u.c) {
                t tVar = MasterViewHolder.this.tokenizedEvent;
                if (tVar != null) {
                    MasterViewHolder.this.tokenizedAnalytics.f(tVar, MasterViewHolder.pullRefreshFilter, null);
                }
            } else if (aVar2 instanceof A00.d) {
                MasterViewHolder.this.wasRefresh = true;
            }
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cart/master/presentation/MasterViewHolder$Companion;", "", "<init>", "()V", "", "PULL_TO_REFRESH_ANALYTICS_KEY", "Ljava/lang/String;", "LWZ/d;", "pullRefreshFilter", "LWZ/d;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MasterViewHolder(@NotNull CartService cartService, @NotNull CartNavigationService cartNavigationService, @NotNull l tokenizedAnalytics, @NotNull CartViewModel viewModel, @NotNull FeatureChecker featureChecker, @NotNull CartItemsChecker cartItemsChecker, @NotNull i container) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(cartNavigationService, "cartNavigationService");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(cartItemsChecker, "cartItemsChecker");
        Intrinsics.checkNotNullParameter(container, "container");
        this.cartService = cartService;
        this.cartNavigationService = cartNavigationService;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.featureChecker = featureChecker;
        this.cartItemsChecker = cartItemsChecker;
        this.container = container;
        C2399j.C(new C2408n0(container.M().getEventsFlow(), new AnonymousClass1(null)), K.a(container.Q().g()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if ((r4 != null ? r4.getSummaryFamily() : null) != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean needUpdateCart() {
        AbstractC5434v lifecycle;
        AbstractC5434v.b b11;
        boolean z11 = this.wasRefresh || !this.viewModel.checkIfFirstLoadProcessedAndReset();
        r a11 = this.container.Q().a();
        boolean z12 = (a11 == null || (lifecycle = a11.getLifecycle()) == null || (b11 = lifecycle.b()) == null || !b11.a(AbstractC5434v.b.RESUMED)) ? false : true;
        MasterVO boundData = getBoundData();
        if ((boundData != null ? boundData.getSummary() : null) == null) {
            MasterVO boundData2 = getBoundData();
        }
        return z11 && z12;
    }

    private final Map<Long, CartItemInfo> toCartItemsMap(List<CartSummaryItemVO> list) {
        LinkedHashMap linkedHashMap;
        if (list != null) {
            List<CartSummaryItemVO> list2 = list;
            int h11 = U.h(C7714v.z(list2, 10));
            if (h11 < 16) {
                h11 = 16;
            }
            linkedHashMap = new LinkedHashMap(h11);
            for (CartSummaryItemVO cartSummaryItemVO : list2) {
                Pair pair = new Pair(Long.valueOf(cartSummaryItemVO.getId()), new CartItemInfo(cartSummaryItemVO.getQuantity(), cartSummaryItemVO.getSelectedDeliverySchema(), null, null, null, null, 60, null));
                linkedHashMap.put(pair.e(), pair.f());
            }
        } else {
            linkedHashMap = null;
        }
        return linkedHashMap == null ? U.c() : linkedHashMap;
    }

    private final void updateCart(List<CartSummaryItemVO> summary, CartType cartType) {
        Map<Long, CartItemInfo> cartItemsMap = toCartItemsMap(summary);
        if (Intrinsics.d(this.cartService.getCartStateByCartType(cartType).getItems(), cartItemsMap)) {
            return;
        }
        CartService cartService = this.cartService;
        CartSource cartSource = CartSource.REMOTE;
        CartChangeSource cartChangeSource = CartChangeSource.MASTER;
        CartPrefetchState.CartUpdate cartUpdate = CartPrefetchState.CartUpdate.INSTANCE;
        if (cartType != CartType.MAIN_CART || this.featureChecker.isEnabled(CartRemoveExtraCacheRemovalFlag.INSTANCE)) {
            cartUpdate = null;
        }
        cartService.setItems(cartItemsMap, cartSource, cartChangeSource, cartUpdate, cartType);
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onRefresh() {
        super.onRefresh();
        this.wasRefresh = true;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull MasterVO item) {
        List<CartSummaryItemVO> summary;
        Intrinsics.checkNotNullParameter(item, "item");
        this.tokenizedEvent = item.getTokenizedEvent();
        if (needUpdateCart()) {
            this.wasRefresh = false;
            updateCart(item.getSummary(), CartType.MAIN_CART);
            this.cartNavigationService.onMasterUpdated(item.getNextTabDeeplink());
            updateCart(item.getSummaryFamily(), CartType.FAMILY_CART);
            if (!this.featureChecker.isEnabled(CartBigOzonItemsAtFreshMiniapp.INSTANCE) || (summary = item.getSummary()) == null) {
                return;
            }
            List<CartSummaryItemVO> list = summary;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((CartSummaryItemVO) it.next()).getSelectedDeliverySchema());
            }
            this.cartItemsChecker.checkMiniappItems(arrayList);
        }
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull MasterVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}

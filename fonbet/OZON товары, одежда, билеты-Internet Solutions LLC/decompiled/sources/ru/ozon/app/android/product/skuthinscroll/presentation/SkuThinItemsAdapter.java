package ru.ozon.app.android.product.skuthinscroll.presentation;

import Sc.o;
import Ve.C4636t5;
import WZ.l;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.product.cartdelegate.CartButtonDelegate;
import ru.ozon.app.android.product.databinding.WidgetSkuThinScrollItem220wVhBinding;
import ru.ozon.app.android.product.databinding.WidgetSkuThinScrollItem248wVhBinding;
import ru.ozon.app.android.product.databinding.WidgetSkuThinScrollItemFillwVhBinding;
import ru.ozon.app.android.product.skuthinscroll.data.SkuThinScrollWidth;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollVO;
import ru.ozon.app.android.product.skuthinscroll.presentation.vh.SkuThinScrollItem220wViewHolder;
import ru.ozon.app.android.product.skuthinscroll.presentation.vh.SkuThinScrollItem248wViewHolder;
import ru.ozon.app.android.product.skuthinscroll.presentation.vh.SkuThinScrollItemFillwViewHolder;
import ru.ozon.app.android.product.skuthinscroll.presentation.vh.SkuThinScrollItemViewHolder;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001B\u0091\u0001\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010#\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J#\u0010&\u001a\u00020\u00062\n\u0010%\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b&\u0010'R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010-R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010.R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u001c\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinItemsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO$ItemVO;", "Lru/ozon/app/android/product/skuthinscroll/presentation/vh/SkuThinScrollItemViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;", "addToCartViewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "coroutineDispatcherProvider", "onTryToPreloadPdpVideo", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lkotlin/jvm/functions/Function1;LWZ/l;Landroidx/lifecycle/J;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/product/skuthinscroll/presentation/vh/SkuThinScrollItemViewHolder;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/product/skuthinscroll/presentation/vh/SkuThinScrollItemViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "LWZ/l;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SkuThinItemsAdapter extends i<SkuThinScrollVO.ItemVO, SkuThinScrollItemViewHolder<?>> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final AddToCartViewModel addToCartViewModel;
    private final AdultHandler adultHandler;
    private final CartService cartService;
    private final CoroutineDispatcherProvider coroutineDispatcherProvider;
    private final FeatureChecker featureChecker;
    private final Function1<AtomAction, Unit> onTryToPreloadPdpVideo;

    @NotNull
    private final ComposerReferences refs;
    private final l tokenizedAnalytics;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SkuThinScrollWidth.values().length];
            try {
                iArr[SkuThinScrollWidth.WIDTH_FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SkuThinScrollWidth.WIDTH_220.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SkuThinScrollWidth.WIDTH_248.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SkuThinScrollWidth.WIDTH_INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SkuThinItemsAdapter(Function1 function1, AddToCartViewModel addToCartViewModel, ComposerReferences composerReferences, CartService cartService, AdultHandler adultHandler, FeatureChecker featureChecker, CoroutineDispatcherProvider coroutineDispatcherProvider, Function1 function12, l lVar, J j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, addToCartViewModel, composerReferences, cartService, adultHandler, featureChecker, coroutineDispatcherProvider, function12, r11, r12);
        J j12;
        l lVar2;
        addToCartViewModel = (i11 & 2) != 0 ? null : addToCartViewModel;
        cartService = (i11 & 8) != 0 ? null : cartService;
        adultHandler = (i11 & 16) != 0 ? null : adultHandler;
        featureChecker = (i11 & 32) != 0 ? null : featureChecker;
        coroutineDispatcherProvider = (i11 & 64) != 0 ? null : coroutineDispatcherProvider;
        function12 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : function12;
        if ((i11 & 256) != 0) {
            j12 = j11;
            lVar2 = null;
        } else {
            j12 = j11;
            lVar2 = lVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return SkuThinScrollWidth.getEntries().indexOf(getCurrentList().get(position).getWidth());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public SkuThinScrollItemViewHolder<?> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        FeatureChecker featureChecker;
        CoroutineDispatcherProvider coroutineDispatcherProvider;
        LayoutInflater a11 = C4636t5.a(parent, "parent");
        CartService cartService = this.cartService;
        AdultDelegate adultDelegate = null;
        CartButtonDelegate cartButtonDelegate = (cartService == null || (coroutineDispatcherProvider = this.coroutineDispatcherProvider) == null) ? null : new CartButtonDelegate(cartService, coroutineDispatcherProvider);
        AdultHandler adultHandler = this.adultHandler;
        if (adultHandler != null && (featureChecker = this.featureChecker) != null) {
            adultDelegate = new AdultDelegate(adultHandler, featureChecker);
        }
        AdultDelegate adultDelegate2 = adultDelegate;
        int i11 = WhenMappings.$EnumSwitchMapping$0[((SkuThinScrollWidth) SkuThinScrollWidth.getEntries().get(viewType)).ordinal()];
        if (i11 == 1) {
            WidgetSkuThinScrollItemFillwVhBinding inflate = WidgetSkuThinScrollItemFillwVhBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new SkuThinScrollItemFillwViewHolder(inflate, this.refs, this.addToCartViewModel, this.actionHandler, cartButtonDelegate, adultDelegate2, this.onTryToPreloadPdpVideo, this.tokenizedAnalytics);
        }
        if (i11 == 2) {
            WidgetSkuThinScrollItem220wVhBinding inflate2 = WidgetSkuThinScrollItem220wVhBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
            return new SkuThinScrollItem220wViewHolder(inflate2, this.refs, this.addToCartViewModel, this.actionHandler, cartButtonDelegate, adultDelegate2, this.onTryToPreloadPdpVideo, this.tokenizedAnalytics);
        }
        if (i11 != 3 && i11 != 4) {
            throw new o();
        }
        WidgetSkuThinScrollItem248wVhBinding inflate3 = WidgetSkuThinScrollItem248wVhBinding.inflate(a11, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(...)");
        return new SkuThinScrollItem248wViewHolder(inflate3, this.refs, this.addToCartViewModel, this.actionHandler, cartButtonDelegate, adultDelegate2, this.onTryToPreloadPdpVideo, this.tokenizedAnalytics);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SkuThinItemsAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, AddToCartViewModel addToCartViewModel, @NotNull ComposerReferences refs, CartService cartService, AdultHandler adultHandler, FeatureChecker featureChecker, CoroutineDispatcherProvider coroutineDispatcherProvider, Function1<? super AtomAction, Unit> function1, l lVar, @NotNull J lifecycleOwner) {
        super(new SkuThinItemsDiffUtils(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.actionHandler = actionHandler;
        this.addToCartViewModel = addToCartViewModel;
        this.refs = refs;
        this.cartService = cartService;
        this.adultHandler = adultHandler;
        this.featureChecker = featureChecker;
        this.coroutineDispatcherProvider = coroutineDispatcherProvider;
        this.onTryToPreloadPdpVideo = function1;
        this.tokenizedAnalytics = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull SkuThinScrollItemViewHolder<?> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SkuThinScrollVO.ItemVO itemVO = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(itemVO, "get(...)");
        holder.bind(itemVO);
    }
}

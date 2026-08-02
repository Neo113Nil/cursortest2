package ru.ozon.app.android.checkoutcomposer.total.presentation.main;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.C2425z;
import Sc.InterfaceC4008j;
import Vg.d;
import W10.c;
import Xo.a;
import Xo.b;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import i10.l;
import java.util.List;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel;
import ru.ozon.app.android.checkout.databinding.WidgetTotalCommonBinding;
import ru.ozon.app.android.checkoutcomposer.total.models.TotalVO;
import ru.ozon.app.android.checkoutcomposer.total.presentation.ExtentionsKt;
import ru.ozon.app.android.checkoutcomposer.total.presentation.main.TotalVH;
import ru.ozon.app.android.checkoutcomposer.total.presentation.main.footerprices.FooterPricesAdapter;
import ru.ozon.app.android.checkoutcomposer.total.presentation.main.hints.HintsViewRender;
import ru.ozon.app.android.checkoutcomposer.utils.ExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.network.referrer.ReferrerValueController;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.partnerBanks.presentation.view.PartnerBanksDelegate;
import ru.ozon.app.android.partnerBanks.presentation.view.PartnerBanksView;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewState;
import ru.ozon.app.android.payment.ui.createorder.HandledState;
import ru.ozon.app.android.uikit.view.shimmer.ShimmerFrameLayout;
import ru.ozon.app.android.uikit.view.shimmer.UtilsKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.deprecated.Button;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 u2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001uBU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001bH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001bH\u0016¢\u0006\u0004\b#\u0010\"J\u0017\u0010&\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001bH\u0016¢\u0006\u0004\b(\u0010\"J)\u0010-\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001bH\u0002¢\u0006\u0004\b/\u0010\"J\u000f\u00100\u001a\u00020\u001bH\u0002¢\u0006\u0004\b0\u0010\"J\u0017\u00103\u001a\u00020\u001b2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u001bH\u0002¢\u0006\u0004\b7\u0010\"J\u000f\u00108\u001a\u00020\u001bH\u0002¢\u0006\u0004\b8\u0010\"J\u0017\u0010/\u001a\u00020\u001b2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b/\u0010;J\u0017\u0010>\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u001d\u0010G\u001a\u00020\u001b2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0DH\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020<H\u0002¢\u0006\u0004\bJ\u0010?R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010KR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010LR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010MR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010NR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010OR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010PR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010QR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010RR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR \u0010X\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\u001b0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u001b\u0010h\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020m0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010p\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010s\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010t¨\u0006v"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/presentation/main/TotalVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO;", "Lru/ozon/app/android/checkout/databinding/WidgetTotalCommonBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "totalVisibilityViewModel", "Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "referrerValueController", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksDelegate;", "partnerBanksDelegate", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "asyncCartViewModel", "<init>", "(Lru/ozon/app/android/checkout/databinding/WidgetTotalCommonBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;LVg/d;Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksDelegate;Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO;Ll20/d;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "onAttach", "()V", "onDetach", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onRecycle", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "bindSummary", "bindInteractionButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "bindNewTotalButton", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "bindOldTotalButton", "(Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO;)V", "bindInteractionsHints", "bindAdditionalHints", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary;", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "(Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary;)V", "", "showVerticalSeparator", "setVerticalOffset", "(Z)V", "Landroidx/lifecycle/v$a;", "event", "handleLifecycleEvent", "(Landroidx/lifecycle/v$a;)V", "Lru/ozon/app/android/payment/ui/createorder/HandledState;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;", "handledState", "observePaymentLoader", "(Lru/ozon/app/android/payment/ui/createorder/HandledState;)V", "isActive", "setShimmering", "Lru/ozon/app/android/checkout/databinding/WidgetTotalCommonBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksDelegate;", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "", "currentPageUrl", "Ljava/lang/String;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/checkoutcomposer/total/presentation/main/PricesAdapter;", "pricesAdapter", "Lru/ozon/app/android/checkoutcomposer/total/presentation/main/PricesAdapter;", "Lru/ozon/app/android/checkoutcomposer/total/presentation/main/footerprices/FooterPricesAdapter;", "footerPricesAdapter", "Lru/ozon/app/android/checkoutcomposer/total/presentation/main/footerprices/FooterPricesAdapter;", "Lru/ozon/app/android/checkoutcomposer/total/presentation/main/hints/HintsViewRender;", "hints", "Lru/ozon/app/android/checkoutcomposer/total/presentation/main/hints/HintsViewRender;", "", "verticalOffset$delegate", "LSc/j;", "getVerticalOffset", "()I", "verticalOffset", "Landroid/graphics/Rect;", "viewVisibleRect", "Landroid/graphics/Rect;", "", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "steps", "Ljava/util/List;", "isRebindNeeded", "Z", "Landroidx/lifecycle/G;", "lifecycleObserver", "Landroidx/lifecycle/G;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalVH extends k<TotalVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AsyncCartViewModel asyncCartViewModel;

    @NotNull
    private final WidgetTotalCommonBinding binding;

    @NotNull
    private final CreateAndPayViewModel createAndPayViewModel;

    @NotNull
    private String currentPageUrl;

    @NotNull
    private final FooterPricesAdapter footerPricesAdapter;
    private final FrameBinder frameBinder;

    @NotNull
    private final HintsViewRender hints;
    private boolean isRebindNeeded;

    @NotNull
    private final G lifecycleObserver;

    @NotNull
    private final PartnerBanksDelegate partnerBanksDelegate;

    @NotNull
    private final PricesAdapter pricesAdapter;

    @NotNull
    private final ReferrerValueController referrerValueController;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final List<BindStep> steps;

    @NotNull
    private final TotalVisibilityViewModel totalVisibilityViewModel;

    /* renamed from: verticalOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j verticalOffset;

    @NotNull
    private final Rect viewVisibleRect;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/presentation/main/TotalVH$Companion;", "", "<init>", "()V", "VISIBILITY_THRESHOLD", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            int[] iArr = new int[AbstractC5434v.a.values().length];
            try {
                iArr[AbstractC5434v.a.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC5434v.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC5434v.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TotalVH(@NotNull WidgetTotalCommonBinding binding, @NotNull ComposerReferences refs, @NotNull CreateAndPayViewModel createAndPayViewModel, @NotNull d customActionHandlersStoreFactory, @NotNull TotalVisibilityViewModel totalVisibilityViewModel, @NotNull ReferrerValueController referrerValueController, FrameBinder frameBinder, @NotNull PartnerBanksDelegate partnerBanksDelegate, @NotNull AsyncCartViewModel asyncCartViewModel) {
        super(r1);
        AbstractC5434v lifecycle;
        View view;
        int i11 = 0;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(createAndPayViewModel, "createAndPayViewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(totalVisibilityViewModel, "totalVisibilityViewModel");
        Intrinsics.checkNotNullParameter(referrerValueController, "referrerValueController");
        Intrinsics.checkNotNullParameter(partnerBanksDelegate, "partnerBanksDelegate");
        Intrinsics.checkNotNullParameter(asyncCartViewModel, "asyncCartViewModel");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.createAndPayViewModel = createAndPayViewModel;
        this.totalVisibilityViewModel = totalVisibilityViewModel;
        this.referrerValueController = referrerValueController;
        this.frameBinder = frameBinder;
        this.partnerBanksDelegate = partnerBanksDelegate;
        this.asyncCartViewModel = asyncCartViewModel;
        this.currentPageUrl = "";
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).configureBottomSheetWrapContent(true).customActionHandlers(new TotalVH$actionHandler$1(customActionHandlersStoreFactory)).onComposerAction(new TotalVH$actionHandler$2(this)).onPreProcess(new TotalVH$actionHandler$3(this)).buildHandler();
        this.actionHandler = buildHandler;
        PricesAdapter pricesAdapter = new PricesAdapter(buildHandler);
        this.pricesAdapter = pricesAdapter;
        FooterPricesAdapter footerPricesAdapter = new FooterPricesAdapter(buildHandler);
        this.footerPricesAdapter = footerPricesAdapter;
        RecyclerView interactionHintsRV = binding.interactionHintsRV;
        Intrinsics.checkNotNullExpressionValue(interactionHintsRV, "interactionHintsRV");
        RecyclerView additionalHintsRV = binding.additionalHintsRV;
        Intrinsics.checkNotNullExpressionValue(additionalHintsRV, "additionalHintsRV");
        this.hints = new HintsViewRender(interactionHintsRV, additionalHintsRV, buildHandler);
        this.verticalOffset = LazyUtilsKt.unsafeLazy(TotalVH$verticalOffset$2.INSTANCE);
        this.viewVisibleRect = new Rect();
        RecyclerView recyclerView = null;
        List<BindStep> b02 = frameBinder != null ? C7714v.b0(new a(this, i11), new b(this, i11), new BindStep() { // from class: Xo.c
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit steps$lambda$4$lambda$2;
                steps$lambda$4$lambda$2 = TotalVH.steps$lambda$4$lambda$2(TotalVH.this);
                return steps$lambda$4$lambda$2;
            }
        }, new BindStep() { // from class: Xo.d
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit steps$lambda$4$lambda$3;
                steps$lambda$4$lambda$3 = TotalVH.steps$lambda$4$lambda$3(TotalVH.this);
                return steps$lambda$4$lambda$3;
            }
        }) : null;
        this.steps = b02 == null ? K.f71697a : b02;
        G g10 = new G() { // from class: Xo.e
            @Override // androidx.lifecycle.G
            public final void onStateChanged(J j11, AbstractC5434v.a aVar) {
                TotalVH.lifecycleObserver$lambda$5(TotalVH.this, j11, aVar);
            }
        };
        this.lifecycleObserver = g10;
        RecyclerView recyclerView2 = binding.pricesRv;
        recyclerView2.setAdapter(pricesAdapter);
        recyclerView2.addItemDecoration(new PricesDecoration());
        binding.footerPricesRv.setAdapter(footerPricesAdapter);
        binding.interactionButtonBA.setOnAction(buildHandler);
        if (frameBinder != null) {
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            frameBinder.init(itemView);
        }
        if (frameBinder != null) {
            ComponentCallbacksC5392m c11 = refs.getContainer().c();
            if (c11 != null && (view = c11.getView()) != null) {
                recyclerView = ComposerViewExtensionKt.composerRecyclerView(view);
            }
            frameBinder.applyRecycler(recyclerView);
        }
        ComponentCallbacksC5392m c12 = refs.getContainer().c();
        if (c12 == null || (lifecycle = c12.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(g10);
    }

    private final void bindAdditionalHints() {
        TotalVO boundData = getBoundData();
        if (boundData == null) {
            return;
        }
        this.hints.bindAdditionalHints(boundData.getAdditionalInfo().getHints());
    }

    private final void bindInteractionButton() {
        TotalVO boundData = getBoundData();
        if (boundData == null) {
            return;
        }
        WidgetTotalCommonBinding widgetTotalCommonBinding = this.binding;
        if (boundData.getInteractiveActions().getTotalButton() != null) {
            bindNewTotalButton(boundData.getInteractiveActions().getTotalButton());
            return;
        }
        ButtonV3View totalButtonView = widgetTotalCommonBinding.totalButtonView;
        Intrinsics.checkNotNullExpressionValue(totalButtonView, "totalButtonView");
        ViewExtKt.gone(totalButtonView);
        bindOldTotalButton(boundData);
        setVerticalOffset(boundData.getShowVerticalSeparator());
        setShimmering(this.asyncCartViewModel.isProcessing().getValue().booleanValue());
    }

    private final void bindInteractionsHints() {
        TotalVO boundData = getBoundData();
        if (boundData == null) {
            return;
        }
        this.hints.bindInteractionsHints(boundData.getInteractiveActions().getHints());
    }

    private final void bindNewTotalButton(ButtonV3DTO button) {
        WidgetTotalCommonBinding widgetTotalCommonBinding = this.binding;
        ButtonV3View totalButtonView = widgetTotalCommonBinding.totalButtonView;
        Intrinsics.checkNotNullExpressionValue(totalButtonView, "totalButtonView");
        ButtonV3HolderKt.bind(totalButtonView, button, this.actionHandler);
        ButtonV3View totalButtonView2 = widgetTotalCommonBinding.totalButtonView;
        Intrinsics.checkNotNullExpressionValue(totalButtonView2, "totalButtonView");
        ViewExtKt.show(totalButtonView2);
        ButtonAtom interactionButtonBA = widgetTotalCommonBinding.interactionButtonBA;
        Intrinsics.checkNotNullExpressionValue(interactionButtonBA, "interactionButtonBA");
        ViewExtKt.gone(interactionButtonBA);
    }

    private final void bindOldTotalButton(TotalVO item) {
        WidgetTotalCommonBinding widgetTotalCommonBinding = this.binding;
        if (item.getInteractiveActions().getButton() != null) {
            if (this.isRebindNeeded) {
                ButtonAtom interactionButtonBA = widgetTotalCommonBinding.interactionButtonBA;
                Intrinsics.checkNotNullExpressionValue(interactionButtonBA, "interactionButtonBA");
                ExtentionsKt.rebindButton(interactionButtonBA, item.getInteractiveActions().getButton(), Button.Style.PRIMARY_SMALL);
                this.isRebindNeeded = false;
            }
            widgetTotalCommonBinding.interactionButtonBA.bind(item.getInteractiveActions().getButton());
            ButtonAtom interactionButtonBA2 = widgetTotalCommonBinding.interactionButtonBA;
            Intrinsics.checkNotNullExpressionValue(interactionButtonBA2, "interactionButtonBA");
            ViewExtKt.show(interactionButtonBA2);
            ButtonAtom interactionButtonBA3 = widgetTotalCommonBinding.interactionButtonBA;
            Intrinsics.checkNotNullExpressionValue(interactionButtonBA3, "interactionButtonBA");
            ExtentionsKt.customizeButton(interactionButtonBA3, item.getInteractiveActions().getButtonColor(), item.getInteractiveActions().getButtonTextColor(), new TotalVH$bindOldTotalButton$1$1(this));
        }
    }

    private final void bindSummary(TotalVO.Summary summary) {
        WidgetTotalCommonBinding widgetTotalCommonBinding = this.binding;
        widgetTotalCommonBinding.headerTitleTv.setText(summary.getHeader().getTitle());
        TextView headerSubtitleTv = widgetTotalCommonBinding.headerSubtitleTv;
        Intrinsics.checkNotNullExpressionValue(headerSubtitleTv, "headerSubtitleTv");
        TextViewExtKt.setTextOrGone(headerSubtitleTv, summary.getHeader().getInfo());
        this.pricesAdapter.submitList(summary.getPrices());
        widgetTotalCommonBinding.footerTitleTv.setText(summary.getFooter().getTitle());
        TextView footerSubtitleTv = widgetTotalCommonBinding.footerSubtitleTv;
        Intrinsics.checkNotNullExpressionValue(footerSubtitleTv, "footerSubtitleTv");
        TextViewExtKt.setTextOrGone(footerSubtitleTv, summary.getFooter().getSubtitle());
        widgetTotalCommonBinding.footerPriceTv.setText(summary.getFooter().getPrice());
        Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), summary.getFooter().getPriceColor());
        if (parseColor != null) {
            widgetTotalCommonBinding.footerPriceTv.setTextColor(parseColor.intValue());
        }
        PartnerBanksDelegate partnerBanksDelegate = this.partnerBanksDelegate;
        PartnerBanksView partnersBankMoleculeView = widgetTotalCommonBinding.partnersBankMoleculeView;
        Intrinsics.checkNotNullExpressionValue(partnersBankMoleculeView, "partnersBankMoleculeView");
        partnerBanksDelegate.bindOrGone(partnersBankMoleculeView, summary.getFooter().getPartnerBanksMolecule(), this.actionHandler);
        if (summary.getFooterPrices() == null) {
            RecyclerView footerPricesRv = widgetTotalCommonBinding.footerPricesRv;
            Intrinsics.checkNotNullExpressionValue(footerPricesRv, "footerPricesRv");
            ViewExtKt.gone(footerPricesRv);
        } else {
            this.footerPricesAdapter.submitList(summary.getFooterPrices());
            RecyclerView footerPricesRv2 = widgetTotalCommonBinding.footerPricesRv;
            Intrinsics.checkNotNullExpressionValue(footerPricesRv2, "footerPricesRv");
            ViewExtKt.show(footerPricesRv2);
        }
    }

    private final int getVerticalOffset() {
        return ((Number) this.verticalOffset.getValue()).intValue();
    }

    private final void handleLifecycleEvent(AbstractC5434v.a event) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i11 == 1) {
            getLifecycle().e(this.lifecycleObserver);
            return;
        }
        int i12 = 2;
        if (i11 == 2) {
            this.refs.getController().e(new l.a.C1079a(0L, null, i12));
        } else {
            if (i11 != 3) {
                return;
            }
            this.createAndPayViewModel.getViewState().observe(this.refs.getContainer().g(), new TotalVH$sam$androidx_lifecycle_Observer$0(new TotalVH$handleLifecycleEvent$1(this)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$5(TotalVH totalVH, J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(j11, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        totalVH.handleLifecycleEvent(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observePaymentLoader(HandledState<CreateAndPayViewState> handledState) {
        handledState.state(new TotalVH$observePaymentLoader$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttach$setShimmering(TotalVH totalVH, boolean z11, kotlin.coroutines.d dVar) {
        totalVH.setShimmering(z11);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShimmering(boolean isActive) {
        ShimmerFrameLayout shimmerView = this.binding.shimmerView;
        Intrinsics.checkNotNullExpressionValue(shimmerView, "shimmerView");
        UtilsKt.setShimmering(shimmerView, isActive);
    }

    private final void setVerticalOffset(boolean showVerticalSeparator) {
        WidgetTotalCommonBinding widgetTotalCommonBinding = this.binding;
        LinearLayout constraintLayout = widgetTotalCommonBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.updatePadding$default(constraintLayout, 0, 0, 0, showVerticalSeparator ? getVerticalOffset() : 0, 7, null);
        FrameLayout buttonContainer = widgetTotalCommonBinding.buttonContainer;
        Intrinsics.checkNotNullExpressionValue(buttonContainer, "buttonContainer");
        ViewGroup.LayoutParams layoutParams = buttonContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = showVerticalSeparator ? getVerticalOffset() : 0;
        buttonContainer.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$4$lambda$0(TotalVH totalVH) {
        totalVH.bindSummary();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$4$lambda$1(TotalVH totalVH) {
        totalVH.bindInteractionButton();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$4$lambda$2(TotalVH totalVH) {
        totalVH.bindInteractionsHints();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$4$lambda$3(TotalVH totalVH) {
        totalVH.bindAdditionalHints();
        return Unit.f71690a;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        FrameBinder frameBinder = this.frameBinder;
        if (frameBinder != null) {
            FrameBinder.DefaultImpls.onAttach$default(frameBinder, null, 1, null);
        }
        C2399j.C(new C2425z(new C2408n0(this.asyncCartViewModel.isProcessing(), new TotalVH$onAttach$1(this)), new TotalVH$onAttach$2(this, null)), androidx.lifecycle.K.a(this));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        if (this.refs.getContainer().f().getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
            this.totalVisibilityViewModel.notifyVisibility(false);
        }
        FrameBinder frameBinder = this.frameBinder;
        if (frameBinder != null) {
            frameBinder.onDetach();
        }
        this.partnerBanksDelegate.onDetach();
    }

    @Override // jk0.j, lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        super.onOffscreenPositionChanged(offscreenOffsetPercent);
        FrameBinder frameBinder = this.frameBinder;
        if (frameBinder != null) {
            frameBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
        }
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        FrameBinder frameBinder = this.frameBinder;
        if (frameBinder != null) {
            frameBinder.onRecycle();
        }
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        ComposerFragment composerFragment;
        View view;
        LinearLayout composerBottomContainer;
        View view2;
        LinearLayout composerBottomContainer2;
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        jk0.l a11 = info.a();
        FrameLayout buttonContainer = this.binding.buttonContainer;
        Intrinsics.checkNotNullExpressionValue(buttonContainer, "buttonContainer");
        float viewVisiblePercentIgnoreBottomContainer = ExtensionsKt.getViewVisiblePercentIgnoreBottomContainer(a11, buttonContainer, this.viewVisibleRect);
        this.totalVisibilityViewModel.notifyVisibility(viewVisiblePercentIgnoreBottomContainer >= 0.5f);
        if (viewVisiblePercentIgnoreBottomContainer >= 0.5f) {
            ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
            composerFragment = c11 instanceof ComposerFragment ? (ComposerFragment) c11 : null;
            if (composerFragment == null || (view2 = composerFragment.getView()) == null || (composerBottomContainer2 = ComposerViewExtensionKt.composerBottomContainer(view2)) == null) {
                return;
            }
            composerBottomContainer2.setTag(R.id.tag_skip_window_insets, Boolean.TRUE);
            return;
        }
        ComponentCallbacksC5392m c12 = this.refs.getContainer().c();
        composerFragment = c12 instanceof ComposerFragment ? (ComposerFragment) c12 : null;
        if (composerFragment == null || (view = composerFragment.getView()) == null || (composerBottomContainer = ComposerViewExtensionKt.composerBottomContainer(view)) == null) {
            return;
        }
        composerBottomContainer.setTag(R.id.tag_skip_window_insets, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TotalVO item, @NotNull l20.d info) {
        String str;
        ComponentCallbacksC5392m c11;
        AbstractC5434v lifecycle;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        T00.a b11 = info.b();
        if (b11 == null || (str = b11.c()) == null) {
            str = "";
        }
        this.currentPageUrl = str;
        if (Intrinsics.d(info.c().g(), "cart") && (c11 = this.refs.getContainer().c()) != null && (lifecycle = c11.getLifecycle()) != null) {
            lifecycle.e(this.lifecycleObserver);
        }
        FrameBinder frameBinder = this.frameBinder;
        if (frameBinder != null) {
            frameBinder.bind(this.steps, item.getViewItemKey());
            return;
        }
        bindSummary();
        bindInteractionButton();
        bindInteractionsHints();
        bindAdditionalHints();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TotalVO item, @NotNull c trackingData, f viewedPond) {
        TotalVO.Summary.Footer footer;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((TotalVH) item, trackingData, viewedPond);
        TotalVO.Summary summary = item.getSummary();
        if (summary == null || (footer = summary.getFooter()) == null || footer.getPartnerBanksMolecule() == null) {
            return;
        }
        this.partnerBanksDelegate.trackView();
    }

    private final void bindSummary() {
        TotalVO boundData = getBoundData();
        if (boundData == null) {
            return;
        }
        WidgetTotalCommonBinding widgetTotalCommonBinding = this.binding;
        TotalVO.Summary summary = boundData.getSummary();
        if (summary != null) {
            ConstraintLayout summaryCl = widgetTotalCommonBinding.summaryCl;
            Intrinsics.checkNotNullExpressionValue(summaryCl, "summaryCl");
            ViewExtKt.show(summaryCl);
            bindSummary(summary);
            return;
        }
        ConstraintLayout summaryCl2 = widgetTotalCommonBinding.summaryCl;
        Intrinsics.checkNotNullExpressionValue(summaryCl2, "summaryCl");
        ViewExtKt.gone(summaryCl2);
    }
}

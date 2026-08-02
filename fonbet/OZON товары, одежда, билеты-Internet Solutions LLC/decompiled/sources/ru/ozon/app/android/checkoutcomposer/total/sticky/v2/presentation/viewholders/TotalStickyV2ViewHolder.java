package ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.viewholders;

import Ae.C2399j;
import Ae.C2417s0;
import Ae.C2425z;
import Ae.InterfaceC2397i;
import Ae.M0;
import Sc.InterfaceC4008j;
import Sc.s;
import W10.c;
import WZ.l;
import WZ.t;
import Wc.a;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.P;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.cart.common.presentation.utils.ExtensionsKt;
import ru.ozon.app.android.checkout.databinding.WidgetTotalStickyV2Binding;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.data.DisabledButtonStyleDTO;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.TotalStickyV2UpdateResponse;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.TotalStickyV2VO;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.TotalStickyV2ViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.network.referrer.ReferrerValueController;
import ru.ozon.app.android.partnerBanks.presentation.view.PartnerBanksDelegate;
import ru.ozon.app.android.partnerBanks.presentation.view.PartnerBanksView;
import ru.ozon.app.android.uikit.view.shimmer.ShimmerFrameLayout;
import ru.ozon.app.android.uikit.view.shimmer.UtilsKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.UniColors;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 _2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001_B]\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\u001c*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\u001c*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u00020\u001c*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010\u001eJ\u0019\u0010&\u001a\u00020%2\b\b\u0001\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0014¢\u0006\u0004\b2\u00103J)\u00108\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u00105\u001a\u0002042\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u001cH\u0016¢\u0006\u0004\b:\u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010?R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010@R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010AR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010BR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010CR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010DR\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR \u0010P\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020\u001c0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001b\u0010Y\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010V\u001a\u0004\b\\\u0010]¨\u0006`"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/viewholders/TotalStickyV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2VO;", "", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/checkout/databinding/WidgetTotalStickyV2Binding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2ViewModel;", "viewModel", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "totalVisibilityViewModel", "Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "referrerValueController", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "cartEventController", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "asyncCartViewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/checkout/databinding/WidgetTotalStickyV2Binding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2ViewModel;Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;LVg/d;LWZ/l;Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;)V", "item", "", "updateConstraints", "(Lru/ozon/app/android/checkout/databinding/WidgetTotalStickyV2Binding;Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2VO;)V", "bindButton", "initLifecycleObserver", "()V", "updateBackground", "", "color", "Landroid/graphics/drawable/GradientDrawable;", "getFadeDrawable", "(I)Landroid/graphics/drawable/GradientDrawable;", "", "isActive", "setShimmering", "(Z)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2VO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onDetach", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/checkout/databinding/WidgetTotalStickyV2Binding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2ViewModel;", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "", "currentPageUrl", "Ljava/lang/String;", "Lxe/B0;", "clearReferrerJob", "Lxe/B0;", "Landroid/os/Handler;", "mainThreadHandler", "Landroid/os/Handler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/viewholders/BackgroundBindDelegate;", "backgroundBindDelegate", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/viewholders/BackgroundBindDelegate;", "disabledButtonCustomBackground$delegate", "LSc/j;", "getDisabledButtonCustomBackground", "()Landroid/graphics/drawable/GradientDrawable;", "disabledButtonCustomBackground", "Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksDelegate;", "partnerBanksDelegate$delegate", "getPartnerBanksDelegate", "()Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksDelegate;", "partnerBanksDelegate", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalStickyV2ViewHolder extends k<TotalStickyV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AsyncCartViewModel asyncCartViewModel;

    @NotNull
    private final BackgroundBindDelegate backgroundBindDelegate;

    @NotNull
    private final WidgetTotalStickyV2Binding binding;

    @NotNull
    private final CartEventsController cartEventController;
    private B0 clearReferrerJob;

    @NotNull
    private final View containerView;

    @NotNull
    private String currentPageUrl;

    /* renamed from: disabledButtonCustomBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j disabledButtonCustomBackground;

    @NotNull
    private final Handler mainThreadHandler;

    /* renamed from: partnerBanksDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j partnerBanksDelegate;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final ReferrerValueController referrerValueController;

    @NotNull
    private final TotalVisibilityViewModel totalVisibilityViewModel;
    private final TotalStickyV2ViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float buttonCornerRadius = ResourceExtKt.toPxF(8);
    private static final int DP_56 = UiExtKt.toPx(56);
    private static final int DP_60 = UiExtKt.toPx(60);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "gone", "", "view", "Landroid/view/View;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.viewholders.TotalStickyV2ViewHolder$2", f = "TotalStickyV2ViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.viewholders.TotalStickyV2ViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements InterfaceC6511n<Boolean, View, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, View view, d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), view, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            ((View) this.L$0).setVisibility(this.Z$0 ? 8 : 0);
            return Unit.f71690a;
        }

        public final Object invoke(boolean z11, View view, d<? super Unit> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.Z$0 = z11;
            anonymousClass2.L$0 = view;
            return anonymousClass2.invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "gone", "", "asyncInProcessing"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.viewholders.TotalStickyV2ViewHolder$3", f = "TotalStickyV2ViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.viewholders.TotalStickyV2ViewHolder$3, reason: invalid class name */
    static final class AnonymousClass3 extends j implements InterfaceC6511n<Boolean, Boolean, d<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        /* synthetic */ boolean Z$1;
        int label;

        AnonymousClass3(d<? super AnonymousClass3> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), bool2.booleanValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            TotalStickyV2ViewHolder.this.setShimmering(!this.Z$0 && this.Z$1);
            return Unit.f71690a;
        }

        public final Object invoke(boolean z11, boolean z12, d<? super Unit> dVar) {
            AnonymousClass3 anonymousClass3 = TotalStickyV2ViewHolder.this.new AnonymousClass3(dVar);
            anonymousClass3.Z$0 = z11;
            anonymousClass3.Z$1 = z12;
            return anonymousClass3.invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LAe/i;", "", "", "it", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.viewholders.TotalStickyV2ViewHolder$4", f = "TotalStickyV2ViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.viewholders.TotalStickyV2ViewHolder$4, reason: invalid class name */
    static final class AnonymousClass4 extends j implements InterfaceC6511n<InterfaceC2397i<? super Unit>, Throwable, d<? super Unit>, Object> {
        int label;

        AnonymousClass4(d<? super AnonymousClass4> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super Unit> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
            return TotalStickyV2ViewHolder.this.new AnonymousClass4(dVar).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            TotalStickyV2ViewHolder.this.setShimmering(false);
            return Unit.f71690a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/viewholders/TotalStickyV2ViewHolder$Companion;", "", "<init>", "()V", "", "buttonCornerRadius", "F", "getButtonCornerRadius", "()F", "", "SHARING_ACTION_ID", "Ljava/lang/String;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getButtonCornerRadius() {
            return TotalStickyV2ViewHolder.buttonCornerRadius;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TotalStickyV2ViewHolder(@NotNull View containerView, @NotNull WidgetTotalStickyV2Binding binding, @NotNull ComposerReferences references, TotalStickyV2ViewModel totalStickyV2ViewModel, @NotNull TotalVisibilityViewModel totalVisibilityViewModel, @NotNull ReferrerValueController referrerValueController, @NotNull CartEventsController cartEventController, @NotNull Vg.d customActionHandlersStoreFactory, @NotNull l tokenizedAnalytics, @NotNull AsyncCartViewModel asyncCartViewModel) {
        super(r8);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(totalVisibilityViewModel, "totalVisibilityViewModel");
        Intrinsics.checkNotNullParameter(referrerValueController, "referrerValueController");
        Intrinsics.checkNotNullParameter(cartEventController, "cartEventController");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(asyncCartViewModel, "asyncCartViewModel");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.containerView = containerView;
        this.binding = binding;
        this.references = references;
        this.viewModel = totalStickyV2ViewModel;
        this.totalVisibilityViewModel = totalVisibilityViewModel;
        this.referrerValueController = referrerValueController;
        this.cartEventController = cartEventController;
        this.asyncCartViewModel = asyncCartViewModel;
        this.currentPageUrl = "";
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new TotalStickyV2ViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onPreProcess(new TotalStickyV2ViewHolder$actionHandler$2(this)).buildHandler();
        View totalStickyBackground = binding.totalStickyBackground;
        Intrinsics.checkNotNullExpressionValue(totalStickyBackground, "totalStickyBackground");
        this.backgroundBindDelegate = new BackgroundBindDelegate(totalStickyBackground);
        this.disabledButtonCustomBackground = LazyUtilsKt.unsafeLazy(TotalStickyV2ViewHolder$disabledButtonCustomBackground$2.INSTANCE);
        this.partnerBanksDelegate = LazyUtilsKt.unsafeLazy(new TotalStickyV2ViewHolder$partnerBanksDelegate$2(tokenizedAnalytics));
        U7.d.c(references).a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.viewholders.TotalStickyV2ViewHolder.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                TotalStickyV2ViewHolder.this.mainThreadHandler.removeCallbacksAndMessages(null);
            }
        });
        M0<Boolean> isVisibleFlow = totalVisibilityViewModel.isVisibleFlow();
        ConstraintLayout constraintLayout2 = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
        C2399j.C(new C2425z(new C2417s0(ExtensionsKt.onEachOutOfLayoutView$default(isVisibleFlow, constraintLayout2, null, new AnonymousClass2(null), 2, null), asyncCartViewModel.isProcessing(), new AnonymousClass3(null)), new AnonymousClass4(null)), K.a(references.getContainer().g()));
        binding.fadeEndOfPartnerBanksView.setBackground(getFadeDrawable(getContext().getColor(UniColors.LAYER_FLOOR_1.getResId())));
        binding.partnerBanksView.setOnChangeCroppedWidget(new TotalStickyV2ViewHolder$5$1(binding));
    }

    private final void bindButton(WidgetTotalStickyV2Binding widgetTotalStickyV2Binding, TotalStickyV2VO totalStickyV2VO) {
        Integer parseColor;
        Integer parseColor2;
        ButtonV3View totalStickyNewButton = widgetTotalStickyV2Binding.totalStickyNewButton;
        Intrinsics.checkNotNullExpressionValue(totalStickyNewButton, "totalStickyNewButton");
        ButtonV3HolderKt.bindOrGone(totalStickyNewButton, totalStickyV2VO.getNewButton(), this.actionHandler);
        if (totalStickyV2VO.getNewButton() != null) {
            SmallButtonView totalStickyButton = widgetTotalStickyV2Binding.totalStickyButton;
            Intrinsics.checkNotNullExpressionValue(totalStickyButton, "totalStickyButton");
            ViewExtKt.gone(totalStickyButton);
            return;
        }
        SmallButtonView totalStickyButton2 = widgetTotalStickyV2Binding.totalStickyButton;
        Intrinsics.checkNotNullExpressionValue(totalStickyButton2, "totalStickyButton");
        ViewExtKt.show(totalStickyButton2);
        DisabledButtonStyleDTO disabledButtonStyle = totalStickyV2VO.getDisabledButtonStyle();
        if (disabledButtonStyle == null || totalStickyV2VO.getButton().getAction() != null) {
            disabledButtonStyle = null;
        }
        if (disabledButtonStyle == null && widgetTotalStickyV2Binding.totalStickyButton.getBackground() == getDisabledButtonCustomBackground()) {
            SmallButtonView totalStickyButton3 = widgetTotalStickyV2Binding.totalStickyButton;
            Intrinsics.checkNotNullExpressionValue(totalStickyButton3, "totalStickyButton");
            WrappedButtonHolderKt.bind$default(totalStickyButton3, ButtonV3Atom.SmallButton.copy$default(totalStickyV2VO.getButton(), null, ButtonV3Atom.SmallButton.SmallButtonStyle.STYLE_TYPE_DELETE_SMALL, null, null, null, null, null, 125, null), null, 2, null);
        }
        SmallButtonView totalStickyButton4 = widgetTotalStickyV2Binding.totalStickyButton;
        Intrinsics.checkNotNullExpressionValue(totalStickyButton4, "totalStickyButton");
        WrappedButtonHolderKt.bind(totalStickyButton4, totalStickyV2VO.getButton(), this.actionHandler);
        if (disabledButtonStyle == null) {
            return;
        }
        String backgroundColor = disabledButtonStyle.getBackgroundColor();
        if (backgroundColor != null && (parseColor2 = StyleParser.INSTANCE.parseColor(getContext(), backgroundColor)) != null) {
            getDisabledButtonCustomBackground().setColor(parseColor2.intValue());
            widgetTotalStickyV2Binding.totalStickyButton.setBackground(getDisabledButtonCustomBackground());
        }
        String textColor = disabledButtonStyle.getTextColor();
        if (textColor == null || (parseColor = StyleParser.INSTANCE.parseColor(getContext(), textColor)) == null) {
            return;
        }
        widgetTotalStickyV2Binding.totalStickyButton.setTextColor(parseColor.intValue());
    }

    private final GradientDrawable getDisabledButtonCustomBackground() {
        return (GradientDrawable) this.disabledButtonCustomBackground.getValue();
    }

    private final GradientDrawable getFadeDrawable(int color) {
        return new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, color});
    }

    private final PartnerBanksDelegate getPartnerBanksDelegate() {
        return (PartnerBanksDelegate) this.partnerBanksDelegate.getValue();
    }

    private final void initLifecycleObserver() {
        B0 b02 = this.clearReferrerJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.clearReferrerJob = C10727i.c(K.a(this.references.getContainer().g()), null, null, new TotalStickyV2ViewHolder$initLifecycleObserver$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShimmering(boolean isActive) {
        ShimmerFrameLayout shimmerView = this.binding.shimmerView;
        Intrinsics.checkNotNullExpressionValue(shimmerView, "shimmerView");
        UtilsKt.setShimmering(shimmerView, isActive);
    }

    private final void updateBackground(WidgetTotalStickyV2Binding widgetTotalStickyV2Binding, TotalStickyV2VO totalStickyV2VO) {
        int parseColor = StyleParser.INSTANCE.parseColor(getContext(), totalStickyV2VO.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId());
        this.backgroundBindDelegate.updateBackgroundColor(totalStickyV2VO.getDisableSeparator(), parseColor);
        if (totalStickyV2VO.getPartnerBanksMolecule() != null) {
            widgetTotalStickyV2Binding.fadeEndOfPartnerBanksView.setBackground(getFadeDrawable(parseColor));
        }
        IslandSeparatorView islandSeparatorV = widgetTotalStickyV2Binding.islandSeparatorV;
        Intrinsics.checkNotNullExpressionValue(islandSeparatorV, "islandSeparatorV");
        islandSeparatorV.setVisibility(totalStickyV2VO.getShowIsland() ? 0 : 8);
        if (totalStickyV2VO.getShowIsland()) {
            widgetTotalStickyV2Binding.islandSeparatorV.setViewState(new IslandSeparatorView.ViewState(true, false, 0, parseColor));
        }
    }

    private final void updateConstraints(WidgetTotalStickyV2Binding widgetTotalStickyV2Binding, TotalStickyV2VO totalStickyV2VO) {
        PriceView totalStickyPrice = widgetTotalStickyV2Binding.totalStickyPrice;
        Intrinsics.checkNotNullExpressionValue(totalStickyPrice, "totalStickyPrice");
        ViewGroup.LayoutParams layoutParams = totalStickyPrice.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        if (totalStickyV2VO.getPartnerBanksMolecule() == null && totalStickyV2VO.getInfoText() == null) {
            bVar.f41642l = widgetTotalStickyV2Binding.totalStickyBackground.getId();
            bVar.f41636i = widgetTotalStickyV2Binding.totalStickyBackground.getId();
            bVar.f41640k = -1;
        } else {
            bVar.f41642l = -1;
            bVar.f41636i = -1;
            bVar.f41640k = widgetTotalStickyV2Binding.summaryInfoBarrier.getId();
        }
        totalStickyPrice.setLayoutParams(bVar);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        P<TotalStickyV2UpdateResponse> widgetUpdate;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        TotalStickyV2ViewModel totalStickyV2ViewModel = this.viewModel;
        if (totalStickyV2ViewModel == null || (widgetUpdate = totalStickyV2ViewModel.getWidgetUpdate()) == null) {
            return;
        }
        widgetUpdate.observe(this.references.getContainer().g(), new TotalStickyV2ViewHolder$sam$androidx_lifecycle_Observer$0(new TotalStickyV2ViewHolder$onAttachViewModel$1(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        getPartnerBanksDelegate().onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TotalStickyV2VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetTotalStickyV2Binding widgetTotalStickyV2Binding = this.binding;
        View totalStickyBackground = widgetTotalStickyV2Binding.totalStickyBackground;
        Intrinsics.checkNotNullExpressionValue(totalStickyBackground, "totalStickyBackground");
        ViewGroup.LayoutParams layoutParams = totalStickyBackground.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41608O = item.getNewButton() != null ? DP_60 : DP_56;
        totalStickyBackground.setLayoutParams(bVar);
        ConstraintLayout constraintLayout = widgetTotalStickyV2Binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        boolean z11 = false;
        constraintLayout.setVisibility(this.totalVisibilityViewModel.isVisibleFlow().getValue().booleanValue() ? 8 : 0);
        PriceView totalStickyPrice = widgetTotalStickyV2Binding.totalStickyPrice;
        Intrinsics.checkNotNullExpressionValue(totalStickyPrice, "totalStickyPrice");
        PriceHolderKt.bind$default(totalStickyPrice, item.getPrice(), null, 2, null);
        widgetTotalStickyV2Binding.totalStickyPrice.setContentDescription(item.getPrice().getPrice());
        PriceView totalStickySecondPrice = widgetTotalStickyV2Binding.totalStickySecondPrice;
        Intrinsics.checkNotNullExpressionValue(totalStickySecondPrice, "totalStickySecondPrice");
        PriceHolderKt.bindOrGone$default(totalStickySecondPrice, item.getSecondPrice(), null, 2, null);
        TextAtomView totalStickyInfoText = widgetTotalStickyV2Binding.totalStickyInfoText;
        Intrinsics.checkNotNullExpressionValue(totalStickyInfoText, "totalStickyInfoText");
        TextAtomHolderKt.bindOrGone$default(totalStickyInfoText, item.getInfoText(), null, 2, null);
        PartnerBanksDelegate partnerBanksDelegate = getPartnerBanksDelegate();
        PartnerBanksView partnerBanksView = widgetTotalStickyV2Binding.partnerBanksView;
        Intrinsics.checkNotNullExpressionValue(partnerBanksView, "partnerBanksView");
        partnerBanksDelegate.bindOrGone(partnerBanksView, item.getPartnerBanksMolecule(), this.actionHandler);
        bindButton(widgetTotalStickyV2Binding, item);
        BadgeView totalStickyInfoBadge = widgetTotalStickyV2Binding.totalStickyInfoBadge;
        Intrinsics.checkNotNullExpressionValue(totalStickyInfoBadge, "totalStickyInfoBadge");
        BadgeHolderKt.bindOrGone(totalStickyInfoBadge, item.getBadgeInfo(), this.actionHandler);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.references.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
        TotalStickyV2ViewModel totalStickyV2ViewModel = this.viewModel;
        if (totalStickyV2ViewModel != null) {
            totalStickyV2ViewModel.setAsyncData(item.getAsyncData());
        }
        T00.a b11 = info.b();
        String c11 = b11 != null ? b11.c() : null;
        if (c11 == null) {
            c11 = "";
        }
        this.currentPageUrl = c11;
        updateBackground(widgetTotalStickyV2Binding, item);
        updateConstraints(widgetTotalStickyV2Binding, item);
        if (this.asyncCartViewModel.isProcessing().getValue().booleanValue() && !this.totalVisibilityViewModel.isVisibleFlow().getValue().booleanValue()) {
            z11 = true;
        }
        setShimmering(z11);
        initLifecycleObserver();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TotalStickyV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        getPartnerBanksDelegate().trackView();
    }
}

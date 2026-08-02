package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.M0;
import B3.D;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import Sc.s;
import WZ.m;
import WZ.t;
import Wc.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.cart.common.presentation.utils.ExtensionsKt;
import ru.ozon.app.android.fresh.cart.R$id;
import ru.ozon.app.android.fresh.cart.databinding.WidgetStickyTotalBinding;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerBinder;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerVO;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerView;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.data.Spacers;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.AddToCartParams;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalOverlayViewHolder;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.QuantCountStrategy;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.core.UniColors;
import xe.E0;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001rBI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J!\u0010 \u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010\u0017J\u001b\u0010#\u001a\u00020\u0015*\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0002H\u0003¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\u0015*\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010%H\u0003¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u0015*\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010$J/\u00101\u001a\u00020\u00152\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J9\u00108\u001a\u00020\u0015*\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u00104\u001a\u0002032\n\b\u0002\u00105\u001a\u0004\u0018\u00010%2\b\b\u0002\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109Ji\u0010@\u001a\u00020\u00152\u0006\u0010&\u001a\u00020%2\u0006\u0010:\u001a\u00020\u00022\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020<\u0018\u00010;2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010>\u001a\u00020\u001c2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010,2\n\b\u0002\u00105\u001a\u0004\u0018\u00010%2\b\b\u0002\u00107\u001a\u000206H\u0002¢\u0006\u0004\b@\u0010AJ5\u0010E\u001a\u00020D2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0;2\b\u0010C\u001a\u0004\u0018\u00010,2\u0006\u0010>\u001a\u00020\u001cH\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u00152\u0006\u0010G\u001a\u00020,H\u0002¢\u0006\u0004\bH\u0010IJ\u001f\u0010L\u001a\u00020\u00152\u0006\u0010J\u001a\u00020D2\u0006\u0010K\u001a\u00020\u0002H\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u0002H\u0002¢\u0006\u0004\bO\u0010\u001aJ!\u0010T\u001a\u00020\u00152\u0006\u0010Q\u001a\u00020P2\b\u0010S\u001a\u0004\u0018\u00010RH\u0002¢\u0006\u0004\bT\u0010UJ+\u0010Y\u001a\u00020\u00152\b\u0010V\u001a\u0004\u0018\u00010\u001e2\b\u0010W\u001a\u0004\u0018\u00010\u001e2\u0006\u0010X\u001a\u00020\u001cH\u0002¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u0015H\u0002¢\u0006\u0004\b[\u0010\u0017J\u0019\u0010]\u001a\b\u0012\u0004\u0012\u00020D0\\*\u00020PH\u0002¢\u0006\u0004\b]\u0010^R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010_R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010`R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010cR \u0010e\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00150d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001b\u0010l\u001a\u00020g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001c\u0010q\u001a\n n*\u0004\u0018\u00010m0m8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010p¨\u0006s"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalOverlayViewHolder;", "Ld20/a;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO;", "Ll10/i;", "container", "Lru/ozon/app/android/fresh/cart/databinding/WidgetStickyTotalBinding;", "binding", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalViewModel;", "viewModel", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "cartTotalVisibilityViewModel", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalMapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/fresh/cart/databinding/WidgetStickyTotalBinding;Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalViewModel;Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalMapper;LVg/d;Ld20/e;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO;)V", "onWidgetDestroyed", "", "enableAsync", "", "asyncData", "subscribeToWidgetUpdates", "(ZLjava/lang/String;)V", "unsubscribeToWidgetUpdates", "bindViews", "(Lru/ozon/app/android/fresh/cart/databinding/WidgetStickyTotalBinding;Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "bindClickableZone", "(Lru/ozon/app/android/fresh/cart/databinding/WidgetStickyTotalBinding;Lru/ozon/uni/atoms/af/AtomAction;)V", "bindControlOrGone", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerBinder$CartPickerActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "cartPickerState", "stickyTotalState", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State$Pdp;", "stickyTotalPdpData", "handlePickerAction", "(Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerBinder$CartPickerActionType;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO;Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State$Pdp;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "additionalAction", "", "delay", "bindButton", "(Lru/ozon/app/android/fresh/cart/databinding/WidgetStickyTotalBinding;Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/af/AtomAction;J)V", "oldStickyTotalVO", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "isRemoveAction", "newPickerVO", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO;Ljava/util/Map;ZZLru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;Lru/ozon/uni/atoms/af/AtomAction;J)V", "params", "newPickerState", "", "resolveNewQuantity", "(Ljava/util/Map;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;Z)I", "newPicker", "countPickerUpdate", "(Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;)V", "newQuantity", "oldVO", "updateLocalIfNeeded", "(ILru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO;)V", "newVO", "updateStickyTotal", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/Spacers;", "spacers", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State;", "state", "bindSpacers", "(Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/Spacers;Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State;)V", "borderColor", "backgroundColor", "hasRoundedCorners", "bindBorderAndBackground", "(Ljava/lang/String;Ljava/lang/String;Z)V", "enableClicksInterception", "", "toDims", "(Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/Spacers;)Ljava/util/List;", "Ll10/i;", "Lru/ozon/app/android/fresh/cart/databinding/WidgetStickyTotalBinding;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalViewModel;", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalMapper;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerBinder;", "countPickerBinder$delegate", "LSc/j;", "getCountPickerBinder", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerBinder;", "countPickerBinder", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getContext", "()Landroid/content/Context;", "context", "Companion", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StickyTotalOverlayViewHolder extends AbstractC6064a<StickyTotalVO> {

    @NotNull
    private static final float[] cornerRadiiDefault;

    @NotNull
    private static final float[] cornerRadiiFlat;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetStickyTotalBinding binding;

    @NotNull
    private final TotalVisibilityViewModel cartTotalVisibilityViewModel;

    @NotNull
    private final i container;

    /* renamed from: countPickerBinder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j countPickerBinder;

    @NotNull
    private final StickyTotalMapper mapper;

    @NotNull
    private final StickyTotalViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int defaultBackgroundColor = UniColors.LAYER_FLOOR_1.getResId();
    private static final int defaultStrokeColor = UniColors.GRAPHIC_STROKE_STICKY.getResId();
    private static final int strokeWidth = UiExtKt.toPx(1);
    private static final float mainRadius = UiExtKt.toPxF(24);
    private static final float zeroRadius = UiExtKt.toPxF(0);
    private static final int countPickerWidth = UiExtKt.toPx(202);
    private static final int controllerPadding = UiExtKt.toPx(8);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "gone", "", "view", "Landroid/view/View;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalOverlayViewHolder$1", f = "StickyTotalOverlayViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalOverlayViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements InterfaceC6511n<Boolean, View, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.Z$0 = z11;
            anonymousClass1.L$0 = view;
            return anonymousClass1.invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalOverlayViewHolder$Companion;", "", "<init>", "()V", "", "ADD_TO_CART_ACTION", "Ljava/lang/String;", "", "ZERO_DELAY", "J", "", "ZERO_QUANTITY", "I", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            int[] iArr = new int[CartPickerBinder.CartPickerActionType.values().length];
            try {
                iArr[CartPickerBinder.CartPickerActionType.INCREMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CartPickerBinder.CartPickerActionType.DECREMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CartPickerBinder.CartPickerActionType.REMOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float[] fArr = new float[8];
        int i11 = 0;
        while (i11 < 8) {
            fArr[i11] = i11 < 4 ? mainRadius : zeroRadius;
            i11++;
        }
        cornerRadiiDefault = fArr;
        float[] fArr2 = new float[8];
        for (int i12 = 0; i12 < 8; i12++) {
            fArr2[i12] = zeroRadius;
        }
        cornerRadiiFlat = fArr2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyTotalOverlayViewHolder(@NotNull i container, @NotNull WidgetStickyTotalBinding binding, @NotNull StickyTotalViewModel viewModel, @NotNull TotalVisibilityViewModel cartTotalVisibilityViewModel, @NotNull StickyTotalMapper mapper, @NotNull Vg.d customActionHandlersStoreFactory, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(cartTotalVisibilityViewModel, "cartTotalVisibilityViewModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.binding = binding;
        this.viewModel = viewModel;
        this.cartTotalVisibilityViewModel = cartTotalVisibilityViewModel;
        this.mapper = mapper;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new StickyTotalOverlayViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.countPickerBinder = k.b(StickyTotalOverlayViewHolder$countPickerBinder$2.INSTANCE);
        M0<Boolean> isVisibleFlow = cartTotalVisibilityViewModel.isVisibleFlow();
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        C2399j.C(ExtensionsKt.onEachOutOfLayoutView$default(isVisibleFlow, constraintLayout, null, new AnonymousClass1(null), 2, null), K.a(container.K().f()));
    }

    private final void bindBorderAndBackground(String borderColor, String backgroundColor, boolean hasRoundedCorners) {
        float[] fArr;
        GradientDrawable b11 = D.b(0);
        if (hasRoundedCorners) {
            int i11 = strokeWidth;
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "<get-context>(...)");
            b11.setStroke(i11, styleParser.parseColor(context, borderColor, defaultStrokeColor));
            fArr = cornerRadiiDefault;
        } else {
            fArr = cornerRadiiFlat;
        }
        b11.setCornerRadii(fArr);
        StyleParser styleParser2 = StyleParser.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "<get-context>(...)");
        b11.setColor(styleParser2.parseColor(context2, backgroundColor, defaultBackgroundColor));
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{b11});
        int i12 = strokeWidth;
        layerDrawable.setLayerInset(0, -i12, 0, -i12, -i12);
        ViewParent parent = this.binding.getConstraintLayout().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        FrameLayout frameLayout = viewGroup != null ? (FrameLayout) viewGroup.findViewById(R$id.stickyBorderContainer) : null;
        if (frameLayout != null) {
            frameLayout.setBackground(layerDrawable);
        }
    }

    private final void bindButton(WidgetStickyTotalBinding widgetStickyTotalBinding, StickyTotalVO stickyTotalVO, ButtonV3DTO buttonV3DTO, AtomAction atomAction, long j11) {
        CartPickerView countPicker = widgetStickyTotalBinding.countPicker;
        Intrinsics.checkNotNullExpressionValue(countPicker, "countPicker");
        ViewExtKt.gone(countPicker);
        ButtonV3View button = widgetStickyTotalBinding.button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        ButtonV3HolderKt.bindOrGone(button, buttonV3DTO, new StickyTotalOverlayViewHolder$bindButton$1(buttonV3DTO, stickyTotalVO, this, atomAction, j11));
    }

    static /* synthetic */ void bindButton$default(StickyTotalOverlayViewHolder stickyTotalOverlayViewHolder, WidgetStickyTotalBinding widgetStickyTotalBinding, StickyTotalVO stickyTotalVO, ButtonV3DTO buttonV3DTO, AtomAction atomAction, long j11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            atomAction = null;
        }
        AtomAction atomAction2 = atomAction;
        if ((i11 & 8) != 0) {
            j11 = 0;
        }
        stickyTotalOverlayViewHolder.bindButton(widgetStickyTotalBinding, stickyTotalVO, buttonV3DTO, atomAction2, j11);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void bindClickableZone(final WidgetStickyTotalBinding widgetStickyTotalBinding, final AtomAction atomAction) {
        widgetStickyTotalBinding.getConstraintLayout().setOnTouchListener(new View.OnTouchListener() { // from class: Pt.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean bindClickableZone$lambda$2;
                bindClickableZone$lambda$2 = StickyTotalOverlayViewHolder.bindClickableZone$lambda$2(WidgetStickyTotalBinding.this, atomAction, this, view, motionEvent);
                return bindClickableZone$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindClickableZone$lambda$2(WidgetStickyTotalBinding widgetStickyTotalBinding, AtomAction atomAction, StickyTotalOverlayViewHolder stickyTotalOverlayViewHolder, View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ButtonV3View button = widgetStickyTotalBinding.button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        float x11 = (button.getVisibility() == 0 ? widgetStickyTotalBinding.button : widgetStickyTotalBinding.countPicker).getX();
        if (event.getAction() != 1 || event.getX() >= x11 - controllerPadding) {
            return false;
        }
        if (atomAction != null) {
            stickyTotalOverlayViewHolder.actionHandler.invoke(atomAction);
        }
        return true;
    }

    private final void bindControlOrGone(WidgetStickyTotalBinding widgetStickyTotalBinding, StickyTotalVO stickyTotalVO) {
        StickyTotalVO.State state = stickyTotalVO.getState();
        if (state == null) {
            CartPickerView countPicker = widgetStickyTotalBinding.countPicker;
            Intrinsics.checkNotNullExpressionValue(countPicker, "countPicker");
            ViewExtKt.gone(countPicker);
            ButtonV3View button = widgetStickyTotalBinding.button;
            Intrinsics.checkNotNullExpressionValue(button, "button");
            ViewExtKt.gone(button);
            return;
        }
        if (state instanceof StickyTotalVO.State.ButtonOnly) {
            bindButton$default(this, widgetStickyTotalBinding, stickyTotalVO, ((StickyTotalVO.State.ButtonOnly) stickyTotalVO.getState()).getButton(), null, 0L, 12, null);
            return;
        }
        if (state instanceof StickyTotalVO.State.Cart) {
            bindButton$default(this, widgetStickyTotalBinding, stickyTotalVO, ((StickyTotalVO.State.Cart) stickyTotalVO.getState()).getButton(), null, 0L, 12, null);
            return;
        }
        if (state instanceof StickyTotalVO.State.Combo) {
            bindButton(widgetStickyTotalBinding, stickyTotalVO, ((StickyTotalVO.State.Combo) stickyTotalVO.getState()).getButton(), ((StickyTotalVO.State.Combo) stickyTotalVO.getState()).getAction(), ((StickyTotalVO.State.Combo) stickyTotalVO.getState()).getDelay());
            return;
        }
        if (!(state instanceof StickyTotalVO.State.Pdp)) {
            throw new o();
        }
        if (!((StickyTotalVO.State.Pdp) stickyTotalVO.getState()).getShowPicker()) {
            bindButton(widgetStickyTotalBinding, stickyTotalVO, ((StickyTotalVO.State.Pdp) stickyTotalVO.getState()).getButton(), ((StickyTotalVO.State.Pdp) stickyTotalVO.getState()).getAction(), ((StickyTotalVO.State.Pdp) stickyTotalVO.getState()).getDelay());
            return;
        }
        ButtonV3View button2 = widgetStickyTotalBinding.button;
        Intrinsics.checkNotNullExpressionValue(button2, "button");
        ViewExtKt.gone(button2);
        CartPickerView countPicker2 = widgetStickyTotalBinding.countPicker;
        Intrinsics.checkNotNullExpressionValue(countPicker2, "countPicker");
        ViewExtKt.show(countPicker2);
        CartPickerBinder countPickerBinder = getCountPickerBinder();
        CartPickerView countPicker3 = widgetStickyTotalBinding.countPicker;
        Intrinsics.checkNotNullExpressionValue(countPicker3, "countPicker");
        CartPickerBinder.bind$default(countPickerBinder, countPicker3, ((StickyTotalVO.State.Pdp) stickyTotalVO.getState()).getCountPicker(), new StickyTotalOverlayViewHolder$bindControlOrGone$1$1(this), new StickyTotalOverlayViewHolder$bindControlOrGone$1$2(this, stickyTotalVO, stickyTotalVO), false, 16, null);
        CartPickerView countPicker4 = widgetStickyTotalBinding.countPicker;
        Intrinsics.checkNotNullExpressionValue(countPicker4, "countPicker");
        ViewGroup.LayoutParams layoutParams = countPicker4.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = countPickerWidth;
        countPicker4.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindSpacers(Spacers spacers, StickyTotalVO.State state) {
        int i11;
        ViewGroup.LayoutParams layoutParams;
        List<Integer> dims = toDims(spacers);
        List K02 = C7714v.K0(dims, 3);
        int intValue = ((Number) K02.get(0)).intValue();
        int intValue2 = ((Number) K02.get(1)).intValue();
        int intValue3 = ((Number) K02.get(2)).intValue();
        List L02 = C7714v.L0(2, dims);
        int intValue4 = ((Number) L02.get(0)).intValue();
        int intValue5 = ((Number) L02.get(1)).intValue();
        WidgetStickyTotalBinding widgetStickyTotalBinding = this.binding;
        PriceAtomView price = widgetStickyTotalBinding.price;
        Intrinsics.checkNotNullExpressionValue(price, "price");
        ViewGroup.LayoutParams layoutParams2 = price.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        PriceAtomView priceWithoutCard = widgetStickyTotalBinding.priceWithoutCard;
        Intrinsics.checkNotNullExpressionValue(priceWithoutCard, "priceWithoutCard");
        ViewGroup.LayoutParams layoutParams3 = priceWithoutCard.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (intValue > (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0)) {
            PriceAtomView priceWithoutCard2 = widgetStickyTotalBinding.priceWithoutCard;
            Intrinsics.checkNotNullExpressionValue(priceWithoutCard2, "priceWithoutCard");
            if (priceWithoutCard2.getVisibility() != 0) {
                PriceAtomView priceWithoutCard3 = widgetStickyTotalBinding.priceWithoutCard;
                Intrinsics.checkNotNullExpressionValue(priceWithoutCard3, "priceWithoutCard");
                ViewGroup.LayoutParams layoutParams4 = priceWithoutCard3.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                i11 = intValue - (marginLayoutParams3 != null ? marginLayoutParams3.bottomMargin : 0);
                marginLayoutParams.setMargins(intValue3, i11, intValue5, marginLayoutParams.bottomMargin);
                price.setLayoutParams(marginLayoutParams);
                PriceAtomView priceWithoutCard4 = widgetStickyTotalBinding.priceWithoutCard;
                Intrinsics.checkNotNullExpressionValue(priceWithoutCard4, "priceWithoutCard");
                layoutParams = priceWithoutCard4.getLayoutParams();
                if (layoutParams != null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams4.setMargins(marginLayoutParams4.getMarginStart(), marginLayoutParams4.topMargin, intValue5, intValue2);
                priceWithoutCard4.setLayoutParams(marginLayoutParams4);
                if (!(state instanceof StickyTotalVO.State.ButtonOnly)) {
                    ButtonV3View button = widgetStickyTotalBinding.button;
                    Intrinsics.checkNotNullExpressionValue(button, "button");
                    ViewGroup.LayoutParams layoutParams5 = button.getLayoutParams();
                    if (layoutParams5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                    marginLayoutParams5.setMargins(marginLayoutParams5.getMarginStart(), intValue, intValue4, intValue2);
                    button.setLayoutParams(marginLayoutParams5);
                    return;
                }
                ButtonV3View button2 = widgetStickyTotalBinding.button;
                Intrinsics.checkNotNullExpressionValue(button2, "button");
                ViewGroup.LayoutParams layoutParams6 = button2.getLayoutParams();
                if (layoutParams6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams6;
                ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                bVar.setMargins(intValue3, intValue, intValue4, intValue2);
                bVar.setMarginStart(intValue3);
                bVar.setMarginEnd(intValue4);
                bVar.f41656t = 0;
                bVar.f41658v = 0;
                button2.setLayoutParams(bVar);
                return;
            }
        }
        i11 = intValue;
        marginLayoutParams.setMargins(intValue3, i11, intValue5, marginLayoutParams.bottomMargin);
        price.setLayoutParams(marginLayoutParams);
        PriceAtomView priceWithoutCard42 = widgetStickyTotalBinding.priceWithoutCard;
        Intrinsics.checkNotNullExpressionValue(priceWithoutCard42, "priceWithoutCard");
        layoutParams = priceWithoutCard42.getLayoutParams();
        if (layoutParams != null) {
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void bindViews(WidgetStickyTotalBinding widgetStickyTotalBinding, StickyTotalVO stickyTotalVO) {
        PriceAtomView price = widgetStickyTotalBinding.price;
        Intrinsics.checkNotNullExpressionValue(price, "price");
        PriceAtomHolderKt.bindOrGone$default(price, stickyTotalVO.getPrice(), null, 2, null);
        bindControlOrGone(widgetStickyTotalBinding, stickyTotalVO);
        PriceAtomView priceWithoutCard = widgetStickyTotalBinding.priceWithoutCard;
        Intrinsics.checkNotNullExpressionValue(priceWithoutCard, "priceWithoutCard");
        PriceAtomHolderKt.bindOrGone$default(priceWithoutCard, stickyTotalVO.getUnfavorablePrice(), null, 2, null);
        bindClickableZone(widgetStickyTotalBinding, stickyTotalVO.getPriceDetailsAction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void countPickerUpdate(CartPickerVO newPicker) {
        StickyTotalVO stickyTotalVO = (StickyTotalVO) getBoundData();
        StickyTotalVO stickyTotalVO2 = null;
        StickyTotalVO.State state = stickyTotalVO != null ? stickyTotalVO.getState() : null;
        StickyTotalVO.State.Pdp pdp = state instanceof StickyTotalVO.State.Pdp ? (StickyTotalVO.State.Pdp) state : null;
        if (pdp != null) {
            StickyTotalVO stickyTotalVO3 = (StickyTotalVO) getBoundData();
            if (stickyTotalVO3 != null) {
                stickyTotalVO2 = stickyTotalVO3.copy((r27 & 1) != 0 ? stickyTotalVO3.id : 0L, (r27 & 2) != 0 ? stickyTotalVO3.price : null, (r27 & 4) != 0 ? stickyTotalVO3.state : StickyTotalVO.State.Pdp.copy$default(pdp, newPicker.getQuantity().getValue() != 0, null, null, 0L, newPicker, null, null, null, 238, null), (r27 & 8) != 0 ? stickyTotalVO3.unfavorablePrice : null, (r27 & 16) != 0 ? stickyTotalVO3.borderColor : null, (r27 & 32) != 0 ? stickyTotalVO3.backgroundColor : null, (r27 & 64) != 0 ? stickyTotalVO3.spacers : null, (r27 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? stickyTotalVO3.enableAsync : false, (r27 & 256) != 0 ? stickyTotalVO3.asyncData : null, (r27 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? stickyTotalVO3.tokenizedEvent : null, (r27 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? stickyTotalVO3.hasRoundedCorners : false, (r27 & 2048) != 0 ? stickyTotalVO3.priceDetailsAction : null);
            }
            if (stickyTotalVO2 != null) {
                updateStickyTotal(stickyTotalVO2);
            }
        }
    }

    private final void enableClicksInterception() {
        this.binding.getConstraintLayout().setClickable(true);
        this.binding.getConstraintLayout().setFocusable(true);
    }

    private final Context getContext() {
        return this.binding.getConstraintLayout().getContext();
    }

    private final CartPickerBinder getCountPickerBinder() {
        return (CartPickerBinder) this.countPickerBinder.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePickerAction(CartPickerBinder.CartPickerActionType actionType, CartPickerVO cartPickerState, StickyTotalVO stickyTotalState, StickyTotalVO.State.Pdp stickyTotalPdpData) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[actionType.ordinal()];
        if (i11 == 1) {
            processAction$default(this, cartPickerState.getQuantity().getChangeQuantityAction().getChangeValueAction(), stickyTotalState, stickyTotalPdpData.getIncrementTrackingInfo(), stickyTotalState.getEnableAsync(), false, cartPickerState, null, 0L, 208, null);
        } else if (i11 == 2) {
            processAction$default(this, cartPickerState.getQuantity().getChangeQuantityAction().getChangeValueAction(), stickyTotalState, stickyTotalPdpData.getDecrementTrackingInfo(), stickyTotalState.getEnableAsync(), false, cartPickerState, null, 0L, 208, null);
        } else {
            if (i11 != 3) {
                throw new o();
            }
            processAction$default(this, cartPickerState.getQuantity().getDecrementRemoveAction().getAction(), stickyTotalState, stickyTotalPdpData.getRemoveTrackingInfo(), stickyTotalState.getEnableAsync(), true, cartPickerState, null, 0L, 192, null);
        }
    }

    private final void processAction(AtomAction action, StickyTotalVO oldStickyTotalVO, Map<String, TokenizedTrackingInfo> trackingInfo, boolean enableAsync, boolean isRemoveAction, CartPickerVO newPickerVO, AtomAction additionalAction, long delay) {
        boolean z11 = (action instanceof AtomAction.Click) && Intrinsics.d(((AtomAction.Click) action).getId(), "addToCart");
        if (z11 && newPickerVO == null) {
            AtomAction.Click click = (AtomAction.Click) action;
            Map<String, String> params = click.getParams();
            if (params == null) {
                params = U.c();
            }
            updateLocalIfNeeded(resolveNewQuantity(params, newPickerVO, isRemoveAction), oldStickyTotalVO);
            StickyTotalViewModel stickyTotalViewModel = this.viewModel;
            Map<String, String> params2 = click.getParams();
            if (params2 == null) {
                params2 = U.c();
            }
            stickyTotalViewModel.addToCart(params2, oldStickyTotalVO.getId(), trackingInfo, this.actionHandler, new StickyTotalOverlayViewHolder$processAction$1(this, oldStickyTotalVO), additionalAction, delay);
            return;
        }
        if (!z11) {
            this.actionHandler.invoke(action);
            return;
        }
        Map<String, String> params3 = ((AtomAction.Click) action).getParams();
        if (params3 == null) {
            params3 = U.c();
        }
        Map<String, String> map = params3;
        int resolveNewQuantity = resolveNewQuantity(map, newPickerVO, isRemoveAction);
        updateLocalIfNeeded(resolveNewQuantity, oldStickyTotalVO);
        this.viewModel.addToCart(map, resolveNewQuantity, oldStickyTotalVO.getId(), trackingInfo, this.actionHandler, new StickyTotalOverlayViewHolder$processAction$2(this, oldStickyTotalVO), additionalAction, delay, new StickyTotalOverlayViewHolder$processAction$3(this, oldStickyTotalVO), enableAsync);
    }

    static /* synthetic */ void processAction$default(StickyTotalOverlayViewHolder stickyTotalOverlayViewHolder, AtomAction atomAction, StickyTotalVO stickyTotalVO, Map map, boolean z11, boolean z12, CartPickerVO cartPickerVO, AtomAction atomAction2, long j11, int i11, Object obj) {
        stickyTotalOverlayViewHolder.processAction(atomAction, stickyTotalVO, map, z11, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? null : cartPickerVO, (i11 & 64) != 0 ? null : atomAction2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 0L : j11);
    }

    private final int resolveNewQuantity(Map<String, String> params, CartPickerVO newPickerState, boolean isRemoveAction) {
        CartPickerVO.QuantityControl quantity;
        if (isRemoveAction) {
            return 0;
        }
        AddToCartParams.CartItem firstProductFromParams = this.viewModel.getFirstProductFromParams(params);
        int quantity2 = firstProductFromParams != null ? firstProductFromParams.getQuantity() : 0;
        int value = (newPickerState == null || (quantity = newPickerState.getQuantity()) == null) ? 0 : quantity.getValue();
        if (value == 0 && quantity2 != 0) {
            return quantity2;
        }
        if (value != 0) {
            return value;
        }
        return 0;
    }

    private final void subscribeToWidgetUpdates(boolean enableAsync, String asyncData) {
        unsubscribeToWidgetUpdates();
        if (enableAsync) {
            this.viewModel.setAsyncData(asyncData);
            C2399j.C(new C2408n0(C5427n.a(this.viewModel.getWidgetUpdate(), getLifecycle(), AbstractC5434v.b.STARTED), new StickyTotalOverlayViewHolder$subscribeToWidgetUpdates$1(this, null)), K.a(this));
        }
    }

    private final List<Integer> toDims(Spacers spacers) {
        List b02 = C7714v.b0(Integer.valueOf(spacers.getTop().getCellLayoutPadding()), Integer.valueOf(spacers.getBottom().getCellLayoutPadding()), Integer.valueOf(spacers.getLeft().getCellLayoutPadding()), Integer.valueOf(spacers.getRight().getCellLayoutPadding()), Integer.valueOf(spacers.getBetween().getCellLayoutPadding()));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "<get-context>(...)");
        ArrayList arrayList = new ArrayList(C7714v.z(b02, 10));
        Iterator it = b02.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(ResourceExtKt.dim(context, ((Number) it.next()).intValue())));
        }
        return arrayList;
    }

    private final void unsubscribeToWidgetUpdates() {
        E0.d(K.a(this).getCoroutineContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLocalIfNeeded(int newQuantity, StickyTotalVO oldVO) {
        StickyTotalVO copy;
        StickyTotalVO.State state = oldVO.getState();
        StickyTotalVO.State.Pdp pdp = state instanceof StickyTotalVO.State.Pdp ? (StickyTotalVO.State.Pdp) state : null;
        if (pdp == null) {
            return;
        }
        int value = pdp.getCountPicker().getQuantity().getValue();
        if (newQuantity == 0 || value == 0) {
            copy = oldVO.copy((r27 & 1) != 0 ? oldVO.id : 0L, (r27 & 2) != 0 ? oldVO.price : null, (r27 & 4) != 0 ? oldVO.state : StickyTotalVO.State.Pdp.copy$default(pdp, newQuantity != 0, null, null, 0L, CartPickerVO.copy$default(pdp.getCountPicker(), TextDTO.copy$default(pdp.getCountPicker().getQuantityTitle(), new OzonSpannableString(String.valueOf(newQuantity)), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), null, CartPickerVO.QuantityControl.copy$default(pdp.getCountPicker().getQuantity(), newQuantity, 0, 0, 0, 0, null, null, QuantCountStrategy.INSTANCE.isIncreaseEnabled(newQuantity, pdp.getCountPicker().getQuantity().getMultiplicity(), pdp.getCountPicker().getQuantity().getMaxValue()) ? HapticToken.SUCCESS : HapticToken.ERROR, null, 382, null), null, null, null, null, null, null, 506, null), null, null, null, 238, null), (r27 & 8) != 0 ? oldVO.unfavorablePrice : null, (r27 & 16) != 0 ? oldVO.borderColor : null, (r27 & 32) != 0 ? oldVO.backgroundColor : null, (r27 & 64) != 0 ? oldVO.spacers : null, (r27 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldVO.enableAsync : false, (r27 & 256) != 0 ? oldVO.asyncData : null, (r27 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldVO.tokenizedEvent : null, (r27 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldVO.hasRoundedCorners : false, (r27 & 2048) != 0 ? oldVO.priceDetailsAction : null);
            updateStickyTotal(copy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStickyTotal(StickyTotalVO newVO) {
        this.container.M().update(new StickyTotalStateUpdate(newVO));
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        this.viewModel.attachAnalyticsHandler(this.container.X());
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        unsubscribeToWidgetUpdates();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull StickyTotalVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        FrameLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        constraintLayout.setVisibility(this.cartTotalVisibilityViewModel.isVisibleFlow().getValue().booleanValue() ? 8 : 0);
        bindViews(this.binding, item);
        bindSpacers(item.getSpacers(), item.getState());
        bindBorderAndBackground(item.getBorderColor(), item.getBackgroundColor(), item.getHasRoundedCorners());
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.container.X(), tokenizedEvent, null);
        }
        subscribeToWidgetUpdates(item.getEnableAsync(), item.getAsyncData());
        enableClicksInterception();
    }
}

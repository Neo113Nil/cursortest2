package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.pdp;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.M0;
import B3.D;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import Sc.s;
import W10.c;
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
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.cart.common.presentation.utils.ExtensionsKt;
import ru.ozon.app.android.fresh.cart.R$id;
import ru.ozon.app.android.fresh.cart.databinding.WidgetStickyTotalBinding;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerView;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.StickyTotalPDPCountPickerBinder;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.data.Spacers;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalVO;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.pdp.StickyTotalPDPViewHolder;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 Y2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001YBA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010\u0018J\u001b\u0010!\u001a\u00020\u0013*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"J#\u0010%\u001a\u00020\u0013*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u001b\u0010-\u001a\u00020\u0013*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0002H\u0003¢\u0006\u0004\b-\u0010\"J\u001d\u00100\u001a\u00020\u0013*\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010.H\u0003¢\u0006\u0004\b0\u00101J!\u00105\u001a\u00020\u00132\u0006\u00103\u001a\u0002022\b\u0010\u001f\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b5\u00106J+\u0010<\u001a\u00020\u00132\b\u00108\u001a\u0004\u0018\u0001072\b\u00109\u001a\u0004\u0018\u0001072\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0013H\u0002¢\u0006\u0004\b>\u0010\u0015J\u0019\u0010@\u001a\b\u0012\u0004\u0012\u00020'0?*\u000202H\u0002¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u0004\u0018\u00010B*\u00020\u0002H\u0002¢\u0006\u0004\bC\u0010DR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010ER\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010FR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010GR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010HR \u0010J\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00130I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0016\u0010R\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u001c\u0010X\u001a\n U*\u0004\u0018\u00010T0T8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/pdp/StickyTotalPDPViewHolder;", "Ld20/a;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO;", "Ll10/i;", "container", "Lru/ozon/app/android/fresh/cart/databinding/WidgetStickyTotalBinding;", "binding", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/pdp/StickyTotalPDPViewModel;", "viewModel", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "cartTotalVisibilityViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/fresh/cart/databinding/WidgetStickyTotalBinding;Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/pdp/StickyTotalPDPViewModel;Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;LVg/d;Ld20/e;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "state", "innerBind", "bindControlOrGone", "(Lru/ozon/app/android/fresh/cart/databinding/WidgetStickyTotalBinding;Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "bindButton", "(Lru/ozon/app/android/fresh/cart/databinding/WidgetStickyTotalBinding;Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "newQuantity", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/StickyTotalPDPCountPickerBinder$PickerActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "countPickerUpdate", "(ILru/ozon/app/android/fresh/cart/widgets/stickyTotal/StickyTotalPDPCountPickerBinder$PickerActionType;)V", "bindViews", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "bindClickableZone", "(Lru/ozon/app/android/fresh/cart/databinding/WidgetStickyTotalBinding;Lru/ozon/uni/atoms/af/AtomAction;)V", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/Spacers;", "spacers", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State;", "bindSpacers", "(Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/Spacers;Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State;)V", "", "borderColor", "backgroundColor", "", "hasRoundedCorners", "bindBorderAndBackground", "(Ljava/lang/String;Ljava/lang/String;Z)V", "enableClicksInterception", "", "toDims", "(Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/Spacers;)Ljava/util/List;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State$Pdp;", "getPdpState", "(Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO;)Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State$Pdp;", "Ll10/i;", "Lru/ozon/app/android/fresh/cart/databinding/WidgetStickyTotalBinding;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/pdp/StickyTotalPDPViewModel;", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/StickyTotalPDPCountPickerBinder;", "countPickerBinder$delegate", "LSc/j;", "getCountPickerBinder", "()Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/StickyTotalPDPCountPickerBinder;", "countPickerBinder", "currentQuantity", "I", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getContext", "()Landroid/content/Context;", "context", "Companion", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StickyTotalPDPViewHolder extends AbstractC6064a<StickyTotalVO> {

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
    private int currentQuantity;

    @NotNull
    private final StickyTotalPDPViewModel viewModel;

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
    @e(c = "ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.pdp.StickyTotalPDPViewHolder$1", f = "StickyTotalPDPViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.pdp.StickyTotalPDPViewHolder$1, reason: invalid class name */
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/pdp/StickyTotalPDPViewHolder$Companion;", "", "<init>", "()V", "", "ZERO_QUANTITY", "I", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            int[] iArr = new int[StickyTotalPDPCountPickerBinder.PickerActionType.values().length];
            try {
                iArr[StickyTotalPDPCountPickerBinder.PickerActionType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StickyTotalPDPCountPickerBinder.PickerActionType.INCREMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StickyTotalPDPCountPickerBinder.PickerActionType.DECREMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StickyTotalPDPCountPickerBinder.PickerActionType.REMOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
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
    public StickyTotalPDPViewHolder(@NotNull i container, @NotNull WidgetStickyTotalBinding binding, @NotNull StickyTotalPDPViewModel viewModel, @NotNull TotalVisibilityViewModel cartTotalVisibilityViewModel, @NotNull Vg.d customActionHandlersStoreFactory, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(cartTotalVisibilityViewModel, "cartTotalVisibilityViewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.binding = binding;
        this.viewModel = viewModel;
        this.cartTotalVisibilityViewModel = cartTotalVisibilityViewModel;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new StickyTotalPDPViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.countPickerBinder = k.b(StickyTotalPDPViewHolder$countPickerBinder$2.INSTANCE);
        M0<Boolean> isVisibleFlow = cartTotalVisibilityViewModel.isVisibleFlow();
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        C2399j.C(ExtensionsKt.onEachOutOfLayoutView$default(isVisibleFlow, constraintLayout, null, new AnonymousClass1(null), 2, null), K.a(container.Q().g()));
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

    private final void bindButton(WidgetStickyTotalBinding widgetStickyTotalBinding, StickyTotalVO stickyTotalVO, ButtonV3DTO buttonV3DTO) {
        CartPickerView countPicker = widgetStickyTotalBinding.countPicker;
        Intrinsics.checkNotNullExpressionValue(countPicker, "countPicker");
        ViewExtKt.gone(countPicker);
        ButtonV3View button = widgetStickyTotalBinding.button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        ButtonV3HolderKt.bindOrGone(button, buttonV3DTO, new StickyTotalPDPViewHolder$bindButton$1(stickyTotalVO, this));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void bindClickableZone(final WidgetStickyTotalBinding widgetStickyTotalBinding, final AtomAction atomAction) {
        widgetStickyTotalBinding.getConstraintLayout().setOnTouchListener(new View.OnTouchListener() { // from class: Qt.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean bindClickableZone$lambda$2;
                bindClickableZone$lambda$2 = StickyTotalPDPViewHolder.bindClickableZone$lambda$2(WidgetStickyTotalBinding.this, atomAction, this, view, motionEvent);
                return bindClickableZone$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindClickableZone$lambda$2(WidgetStickyTotalBinding widgetStickyTotalBinding, AtomAction atomAction, StickyTotalPDPViewHolder stickyTotalPDPViewHolder, View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ButtonV3View button = widgetStickyTotalBinding.button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        float x11 = (button.getVisibility() == 0 ? widgetStickyTotalBinding.button : widgetStickyTotalBinding.countPicker).getX();
        if (event.getAction() != 1 || event.getX() >= x11 - controllerPadding) {
            return false;
        }
        if (atomAction != null) {
            stickyTotalPDPViewHolder.actionHandler.invoke(atomAction);
        }
        return true;
    }

    private final void bindControlOrGone(WidgetStickyTotalBinding widgetStickyTotalBinding, StickyTotalVO stickyTotalVO) {
        StickyTotalVO.State.Pdp pdpState = getPdpState(stickyTotalVO);
        if (pdpState == null) {
            return;
        }
        if (!pdpState.getShowPicker()) {
            bindButton(widgetStickyTotalBinding, stickyTotalVO, pdpState.getButton());
            return;
        }
        ButtonV3View button = widgetStickyTotalBinding.button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        ViewExtKt.gone(button);
        CartPickerView countPicker = widgetStickyTotalBinding.countPicker;
        Intrinsics.checkNotNullExpressionValue(countPicker, "countPicker");
        ViewExtKt.show(countPicker);
        StickyTotalPDPCountPickerBinder countPickerBinder = getCountPickerBinder();
        CartPickerView countPicker2 = widgetStickyTotalBinding.countPicker;
        Intrinsics.checkNotNullExpressionValue(countPicker2, "countPicker");
        countPickerBinder.bind(countPicker2, pdpState.getCountPicker(), new StickyTotalPDPViewHolder$bindControlOrGone$1(this));
        CartPickerView countPicker3 = widgetStickyTotalBinding.countPicker;
        Intrinsics.checkNotNullExpressionValue(countPicker3, "countPicker");
        ViewGroup.LayoutParams layoutParams = countPicker3.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = countPickerWidth;
        countPicker3.setLayoutParams(layoutParams);
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
    public final void countPickerUpdate(int newQuantity, StickyTotalPDPCountPickerBinder.PickerActionType actionType) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Map<String, String> map;
        AtomActionDTO action;
        String sku;
        Long deliverySchema;
        Map<String, TokenizedTrackingInfo> incrementTrackingInfo;
        StickyTotalVO stickyTotalVO = (StickyTotalVO) getBoundData();
        if (stickyTotalVO == null) {
            return;
        }
        StickyTotalVO.State state = stickyTotalVO.getState();
        Map<String, String> map2 = null;
        StickyTotalVO.State.Pdp pdp = state instanceof StickyTotalVO.State.Pdp ? (StickyTotalVO.State.Pdp) state : null;
        if (pdp == null) {
            return;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[actionType.ordinal()];
        String str = "plusButtonClick";
        if (i11 != 1) {
            if (i11 == 2) {
                map = pdp.getCountPicker().getQuantity().getChangeQuantityAction().getChangeValueAction().getParams();
                incrementTrackingInfo = pdp.getIncrementTrackingInfo();
            } else if (i11 == 3) {
                map = pdp.getCountPicker().getQuantity().getChangeQuantityAction().getChangeValueAction().getParams();
                incrementTrackingInfo = pdp.getDecrementTrackingInfo();
                str = "minusButtonClick";
            } else {
                if (i11 != 4) {
                    throw new o();
                }
                map = pdp.getCountPicker().getQuantity().getDecrementRemoveAction().getAction().getParams();
                incrementTrackingInfo = pdp.getRemoveTrackingInfo();
                str = "removeFromCart";
            }
            trackingInfo = incrementTrackingInfo;
        } else {
            CommonControlSettings common = pdp.getButton().getCommon();
            if (common != null && (action = common.getAction()) != null) {
                map2 = action.getParams();
            }
            trackingInfo = pdp.getButton().getTrackingInfo();
            map = map2;
        }
        if (map == null || (sku = this.viewModel.getSKU(map)) == null || (deliverySchema = this.viewModel.getDeliverySchema(map)) == null) {
            return;
        }
        this.viewModel.addToCart(stickyTotalVO.getId(), str, sku, newQuantity, deliverySchema, trackingInfo);
    }

    private final void enableClicksInterception() {
        this.binding.getConstraintLayout().setClickable(true);
        this.binding.getConstraintLayout().setFocusable(true);
    }

    private final Context getContext() {
        return this.binding.getConstraintLayout().getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StickyTotalPDPCountPickerBinder getCountPickerBinder() {
        return (StickyTotalPDPCountPickerBinder) this.countPickerBinder.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StickyTotalVO.State.Pdp getPdpState(StickyTotalVO stickyTotalVO) {
        StickyTotalVO.State state = stickyTotalVO.getState();
        if (state instanceof StickyTotalVO.State.Pdp) {
            return (StickyTotalVO.State.Pdp) state;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void innerBind(StickyTotalVO state) {
        FrameLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        constraintLayout.setVisibility(this.cartTotalVisibilityViewModel.isVisibleFlow().getValue().booleanValue() ? 8 : 0);
        bindViews(this.binding, state);
        bindSpacers(state.getSpacers(), state.getState());
        bindBorderAndBackground(state.getBorderColor(), state.getBackgroundColor(), state.getHasRoundedCorners());
        enableClicksInterception();
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

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        this.viewModel.attachAnalyticsHandler(this.container.X());
        C2399j.C(new C2408n0(C5427n.a(this.viewModel.observeCartState(), getLifecycle(), AbstractC5434v.b.STARTED), new StickyTotalPDPViewHolder$onWidgetCreated$1(this, null)), K.a(this));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull StickyTotalVO item) {
        AtomActionDTO action;
        Map<String, String> params;
        String sku;
        Long y02;
        StickyTotalVO copy;
        Intrinsics.checkNotNullParameter(item, "item");
        StickyTotalVO.State.Pdp pdpState = getPdpState(item);
        if (pdpState == null) {
            return;
        }
        StickyTotalPDPCountPickerBinder countPickerBinder = getCountPickerBinder();
        CartPickerView countPicker = this.binding.countPicker;
        Intrinsics.checkNotNullExpressionValue(countPicker, "countPicker");
        countPickerBinder.bind(countPicker, pdpState.getCountPicker(), new StickyTotalPDPViewHolder$bind$1(this));
        CommonControlSettings common = pdpState.getButton().getCommon();
        if (common == null || (action = common.getAction()) == null || (params = action.getParams()) == null || (sku = this.viewModel.getSKU(params)) == null || (y02 = h.y0(sku)) == null) {
            return;
        }
        int productInCartQuantity = this.viewModel.getProductInCartQuantity(y02.longValue());
        this.currentQuantity = productInCartQuantity;
        copy = item.copy((r27 & 1) != 0 ? item.id : 0L, (r27 & 2) != 0 ? item.price : null, (r27 & 4) != 0 ? item.state : StickyTotalVO.State.Pdp.copy$default(pdpState, productInCartQuantity != 0, null, null, 0L, getCountPickerBinder().createNewVO(pdpState.getCountPicker(), productInCartQuantity), null, null, null, 238, null), (r27 & 8) != 0 ? item.unfavorablePrice : null, (r27 & 16) != 0 ? item.borderColor : null, (r27 & 32) != 0 ? item.backgroundColor : null, (r27 & 64) != 0 ? item.spacers : null, (r27 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? item.enableAsync : false, (r27 & 256) != 0 ? item.asyncData : null, (r27 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? item.tokenizedEvent : null, (r27 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? item.hasRoundedCorners : false, (r27 & 2048) != 0 ? item.priceDetailsAction : null);
        innerBind(copy);
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull StickyTotalVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        super.trackView((StickyTotalPDPViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.container.X(), tokenizedEvent, null);
        }
    }
}

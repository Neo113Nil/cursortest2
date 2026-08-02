package ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation;

import Bu.d;
import Bu.e;
import Sc.InterfaceC4008j;
import Sc.o;
import Xc.a;
import Xc.b;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.G;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.R$id;
import ru.ozon.app.android.fresh.common.widgets.UtilsKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarView;
import ru.ozon.app.android.uikit.utils.FigmaInterpolator;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.android.haptic.HapticVibrator;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 `2\u00020\u0001:\u0003`abB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010$\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\"0!\"\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010'JC\u00100\u001a\u00020\f*\u00020(2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\u001f2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0.H\u0003¢\u0006\u0004\b0\u00101J\u001b\u00103\u001a\u00020\u0006*\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002052\u0006\u00108\u001a\u00020\u0006H\u0002¢\u0006\u0004\b9\u0010:J1\u0010@\u001a\u00020?*\u00020\"2\u0006\u0010;\u001a\u00020\u001f2\b\b\u0002\u0010=\u001a\u00020<2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010C\u001a\u00020?2\u0006\u0010B\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u0006H\u0002¢\u0006\u0004\bC\u0010DJ*\u0010G\u001a\u00020\u001f2\u0006\u0010E\u001a\u00020\u0015H\u0003\u0082\u0002\u0010\n\u000e\b\u0000\u0012\u0002\u0018\u0001\u001a\u0006\u0010\u0001\"\u00020F¢\u0006\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010TR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010TR\u001b\u0010]\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u00107R\u0018\u0010^\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006c"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarView$ActionListener;", "newListener", "", "setListener", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarView$ActionListener;)V", "removeListener", "()V", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;", "item", "bindOrGone", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;)V", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State;", "state", "heightPx", "margin", "setMode", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State;II)V", "setActionModeImmediately", "(I)V", "setQuantityModeImmediately", "(II)V", "", "isVisible", "", "Landroid/view/View;", "views", "setViewsVisibilityAndAlpha", "(Z[Landroid/view/View;)V", "bindStyle", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;I)V", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$CustomStyle;", "style", "", "iconToken", "isIncrementDisabled", "Lkotlin/Function0;", "onClick", "bindIconButton", "(Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;ILru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$CustomStyle;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V", "newAlpha", "copyWithNewAlpha", "(II)I", "Landroid/animation/AnimatorSet;", "createAnimationToQuantityState", "()Landroid/animation/AnimatorSet;", "targetWidth", "createAnimationToActionState", "(I)Landroid/animation/AnimatorSet;", "isAppearance", "", "animationDuration", "animationDelay", "Landroid/animation/ValueAnimator;", "createAlphaAnimator", "(Landroid/view/View;ZJLjava/lang/Long;)Landroid/animation/ValueAnimator;", "currentWidth", "createWidthAnimator", "(II)Landroid/animation/ValueAnimator;", "actionBarState", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$QuantityControl;", "isActionIcon", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State;)Z", "isAnimating", "Z", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarView$Mode;", "currentMode", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarView$Mode;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarView$ActionListener;", "Landroidx/cardview/widget/CardView;", "backgroundView", "Landroidx/cardview/widget/CardView;", "minusButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "plusButton", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "valueText", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "actionButton", "animationToQuantity$delegate", "LSc/j;", "getAnimationToQuantity", "animationToQuantity", "animationToAction", "Landroid/animation/AnimatorSet;", "Companion", "ActionListener", "Mode", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductActionBarView extends ConstraintLayout {

    @NotNull
    private final IconButtonV3View actionButton;
    private AnimatorSet animationToAction;

    /* renamed from: animationToQuantity$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j animationToQuantity;

    @NotNull
    private final CardView backgroundView;
    private Mode currentMode;
    private boolean isAnimating;
    private ActionListener listener;

    @NotNull
    private final IconButtonV3View minusButton;

    @NotNull
    private final IconButtonV3View plusButton;

    @NotNull
    private final TextAtomV2View valueText;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final float elevationLevel = UiExtKt.toPxF(2);
    private static final int marginSizeSmall = UiExtKt.toPx(4);
    private static final int marginSizeBig = UiExtKt.toPx(6);
    private static final int shadowColor = Color.parseColor("#e8000000");
    private static final int defaultBackgroundColor = UniColors.BG_LIGHT_KEY.getResId();
    private static final float backgroundCornerRadius = UiExtKt.toPxF(CornerRadius.RADIUS_600.getPx());

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarView$ActionListener;", "", "onActionIconClick", "", "item", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State;", "onPlusClick", "quantityControl", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$QuantityControl;", "onMinusClick", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ActionListener {
        void onActionIconClick(@NotNull ProductActionBarVO.State item);

        void onMinusClick(@NotNull ProductActionBarVO.State.QuantityControl quantityControl);

        void onPlusClick(@NotNull ProductActionBarVO.State.QuantityControl quantityControl);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarView$Companion;", "", "<init>", "()V", "ANIMATION_STEP_DURATION", "", "ICON_DISABLED_ALPHA", "", "PRODUCT_ACTION_BAR_LOCATOR", "", "ACTION_BUTTON_LOCATOR", "PLUS_BUTTON_LOCATOR", "PLUS_BUTTON_DISABLED_LOCATOR", "MINUS_BUTTON_LOCATOR", "elevationLevel", "", "getElevationLevel", "()F", "marginSizeSmall", "marginSizeBig", "shadowColor", "defaultBackgroundColor", "backgroundCornerRadius", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getElevationLevel() {
            return ProductActionBarView.elevationLevel;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarView$Mode;", "", "<init>", "(Ljava/lang/String;I)V", "ACTION", "QUANTITY", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Mode {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode ACTION = new Mode("ACTION", 0);
        public static final Mode QUANTITY = new Mode("QUANTITY", 1);

        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{ACTION, QUANTITY};
        }

        static {
            Mode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Mode(String str, int i11) {
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ProductActionBarView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void bindIconButton(final IconButtonV3View iconButtonV3View, int i11, ProductActionBarVO.CustomStyle customStyle, String str, final boolean z11, final Function0<Unit> function0) {
        IconButtonV3HolderKt.bindOrGone$default(iconButtonV3View, new IconButtonV3DTO(i11 > ProductActionBarVOKt.getMINI_HEIGHT_PX() ? IconButtonV3DTO.Sizes.SIZE_500 : IconButtonV3DTO.Sizes.SIZE_400, ButtonV3DTO.StyleTypes.CUSTOM, IconButtonV3DTO.IconButtonShape.SHAPE_CIRCLE, str, null, null, UniColors.CLEAR_LIGHT_KEY_0.getToken(), null, Boolean.valueOf(z11), null, null, null, null, null, 16048, null), null, 2, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = iconButtonV3View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, customStyle.getIconColorToken(), UniColors.GRAPHIC_DARK_KEY.getResId());
        if (z11) {
            parseColor = copyWithNewAlpha(parseColor, 51);
        }
        iconButtonV3View.setIconColor(parseColor);
        iconButtonV3View.setOnClickListener(new View.OnClickListener() { // from class: Bu.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductActionBarView productActionBarView = this;
                ProductActionBarView.bindIconButton$lambda$20(z11, iconButtonV3View, productActionBarView, function0, view);
            }
        });
    }

    static /* synthetic */ void bindIconButton$default(ProductActionBarView productActionBarView, IconButtonV3View iconButtonV3View, int i11, ProductActionBarVO.CustomStyle customStyle, String str, boolean z11, Function0 function0, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            z11 = false;
        }
        productActionBarView.bindIconButton(iconButtonV3View, i11, customStyle, str, z11, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindIconButton$lambda$20(boolean z11, IconButtonV3View iconButtonV3View, ProductActionBarView productActionBarView, Function0 function0, View view) {
        if (z11) {
            HapticVibrator.INSTANCE.vibrate(iconButtonV3View, HapticToken.ERROR);
        } else {
            if (productActionBarView.isAnimating) {
                return;
            }
            HapticVibrator.INSTANCE.vibrate(iconButtonV3View, HapticToken.SUCCESS);
            function0.invoke();
        }
    }

    private final void bindStyle(ProductActionBarVO item, int margin) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.backgroundView.setCardBackgroundColor(styleParser.parseColor(context, item.getCustomStyle().getBackgroundColorToken(), defaultBackgroundColor));
        CardView cardView = this.backgroundView;
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.setMargins(margin, margin, margin, ((int) elevationLevel) + margin);
        cardView.setLayoutParams(bVar);
        for (IconButtonV3View iconButtonV3View : C7714v.b0(this.actionButton, this.minusButton, this.plusButton)) {
            ViewGroup.LayoutParams layoutParams2 = iconButtonV3View.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            ((ViewGroup.MarginLayoutParams) bVar2).width = item.getHeightPx();
            ((ViewGroup.MarginLayoutParams) bVar2).height = item.getHeightPx();
            iconButtonV3View.setLayoutParams(bVar2);
        }
        ProductActionBarVO.State adultActionIcon = item.getAdultActionIcon();
        if (adultActionIcon == null) {
            adultActionIcon = item.getState();
        }
        ProductActionBarVO.State state = adultActionIcon;
        if (state instanceof ProductActionBarVO.State.ActionIcon) {
            bindIconButton$default(this, this.actionButton, item.getHeightPx(), item.getCustomStyle(), ((ProductActionBarVO.State.ActionIcon) state).getIconToken(), false, new ProductActionBarView$bindStyle$3(this, state), 8, null);
            return;
        }
        if (!(state instanceof ProductActionBarVO.State.QuantityControl)) {
            throw new o();
        }
        ProductActionBarVO.State.QuantityControl quantityControl = (ProductActionBarVO.State.QuantityControl) state;
        ProductActionBarVO.State.ActionIcon cartActionIcon = quantityControl.getValue() <= 0 ? quantityControl.getCartActionIcon() : null;
        if (cartActionIcon != null) {
            bindIconButton$default(this, this.actionButton, item.getHeightPx(), item.getCustomStyle(), cartActionIcon.getIconToken(), false, new ProductActionBarView$bindStyle$4(this, state), 8, null);
        } else {
            bindIconButton$default(this, this.minusButton, item.getHeightPx(), item.getCustomStyle(), quantityControl.getDecrementIconToken(), false, new ProductActionBarView$bindStyle$5(this, state), 8, null);
            bindIconButton(this.plusButton, item.getHeightPx(), item.getCustomStyle(), quantityControl.getIncrementIconToken(), quantityControl.getIsIncrementDisabled(), new ProductActionBarView$bindStyle$6(this, state));
            this.plusButton.setContentDescription(quantityControl.getIsIncrementDisabled() ? "plusButton_disabled" : "plusButton");
        }
        TextHolderKt.bindOrGone$default(this.valueText, quantityControl.getValueText(), null, 2, null);
    }

    private final int copyWithNewAlpha(int i11, int i12) {
        return Color.argb(i12, Color.red(i11), Color.green(i11), Color.blue(i11));
    }

    private final ValueAnimator createAlphaAnimator(final View view, boolean z11, long j11, Long l11) {
        int i11 = 0;
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        Pair pair = z11 ? new Pair(valueOf2, valueOf) : new Pair(valueOf, valueOf2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Number) pair.a()).floatValue(), ((Number) pair.b()).floatValue());
        ofFloat.setStartDelay(l11 != null ? l11.longValue() : 0L);
        ofFloat.setDuration(j11);
        if (z11) {
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarView$createAlphaAnimator$lambda$32$$inlined$doOnStart$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animator) {
                    view.setVisibility(0);
                }
            });
        } else {
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarView$createAlphaAnimator$lambda$32$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animator) {
                    view.setVisibility(8);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animator) {
                }
            });
        }
        ofFloat.addUpdateListener(new e(view, i11));
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    static /* synthetic */ ValueAnimator createAlphaAnimator$default(ProductActionBarView productActionBarView, View view, boolean z11, long j11, Long l11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 100;
        }
        long j12 = j11;
        if ((i11 & 4) != 0) {
            l11 = null;
        }
        return productActionBarView.createAlphaAnimator(view, z11, j12, l11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createAlphaAnimator$lambda$32$lambda$31(View view, ValueAnimator valueAnimator) {
        view.setAlpha(((Float) Bi.a.b(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    private final AnimatorSet createAnimationToActionState(int targetWidth) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarView$createAnimationToActionState$lambda$28$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
                ProductActionBarView.this.isAnimating = true;
            }
        });
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(createAlphaAnimator$default(this, this.minusButton, false, 33L, null, 4, null), createAlphaAnimator$default(this, this.valueText, false, 33L, null, 4, null), createAlphaAnimator$default(this, this.plusButton, false, 33L, null, 4, null));
        animatorSet.playTogether(animatorSet2, createWidthAnimator(this.backgroundView.getWidth(), targetWidth), createAlphaAnimator$default(this, this.actionButton, true, 0L, 50L, 2, null));
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarView$createAnimationToActionState$lambda$28$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                ProductActionBarView.this.isAnimating = false;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AnimatorSet createAnimationToQuantityState() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarView$createAnimationToQuantityState$lambda$24$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
                ProductActionBarView.this.isAnimating = true;
            }
        });
        ValueAnimator createAlphaAnimator$default = createAlphaAnimator$default(this, this.actionButton, false, 0L, null, 6, null);
        int width = this.backgroundView.getWidth();
        int measuredWidth = getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = this.backgroundView.getLayoutParams();
        ValueAnimator createWidthAnimator = createWidthAnimator(width, measuredWidth - ((layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0) * 2));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(createAlphaAnimator(this.plusButton, true, 33L, 33L), createAlphaAnimator$default(this, this.valueText, true, 33L, null, 4, null), createAlphaAnimator$default(this, this.minusButton, true, 33L, null, 4, null));
        animatorSet.playTogether(createAlphaAnimator$default, createWidthAnimator, animatorSet2);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarView$createAnimationToQuantityState$lambda$24$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                ProductActionBarView.this.isAnimating = false;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        return animatorSet;
    }

    private final ValueAnimator createWidthAnimator(int currentWidth, int targetWidth) {
        ValueAnimator ofInt = ValueAnimator.ofInt(currentWidth, targetWidth);
        ofInt.setDuration(100L);
        ofInt.setInterpolator(FigmaInterpolator.INSTANCE.getEaseIn());
        ofInt.addUpdateListener(new d(this, 0));
        Intrinsics.checkNotNullExpressionValue(ofInt, "apply(...)");
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createWidthAnimator$lambda$35$lambda$34(ProductActionBarView productActionBarView, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        CardView cardView = productActionBarView.backgroundView;
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.width = ((Integer) animatedValue).intValue();
        cardView.setLayoutParams(layoutParams);
    }

    private final AnimatorSet getAnimationToQuantity() {
        return (AnimatorSet) this.animationToQuantity.getValue();
    }

    private final boolean isActionIcon(ProductActionBarVO.State actionBarState) {
        return actionBarState instanceof ProductActionBarVO.State.ActionIcon;
    }

    private final void setActionModeImmediately(int heightPx) {
        CardView cardView = this.backgroundView;
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = heightPx;
        layoutParams.height = heightPx;
        cardView.setLayoutParams(layoutParams);
        this.actionButton.setVisibility(0);
        this.actionButton.setAlpha(1.0f);
        setViewsVisibilityAndAlpha(false, this.minusButton, this.valueText, this.plusButton);
    }

    private final void setMode(ProductActionBarVO.State state, int heightPx, int margin) {
        Mode mode;
        if (isActionIcon(state)) {
            setActionModeImmediately(heightPx);
            return;
        }
        ProductActionBarVO.State.QuantityControl quantityControl = (ProductActionBarVO.State.QuantityControl) state;
        Mode mode2 = quantityControl.getValue() > 0 ? Mode.QUANTITY : Mode.ACTION;
        boolean z11 = getMeasuredWidth() == 0;
        if (!quantityControl.getShouldAnimate() || z11 || (mode = this.currentMode) == null || mode == mode2) {
            if (mode2 == Mode.ACTION) {
                setActionModeImmediately(heightPx);
            } else {
                setQuantityModeImmediately(heightPx, margin);
            }
        } else if (mode2 == Mode.QUANTITY) {
            getAnimationToQuantity().start();
        } else {
            if (this.animationToAction == null) {
                this.animationToAction = createAnimationToActionState(heightPx);
            }
            AnimatorSet animatorSet = this.animationToAction;
            if (animatorSet != null) {
                animatorSet.start();
            }
        }
        this.currentMode = mode2;
    }

    private final void setQuantityModeImmediately(int heightPx, int margin) {
        final ProductActionBarView$setQuantityModeImmediately$updateLayoutParams$1 productActionBarView$setQuantityModeImmediately$updateLayoutParams$1 = new ProductActionBarView$setQuantityModeImmediately$updateLayoutParams$1(this, margin, heightPx);
        if (getMeasuredWidth() <= 0) {
            G.a(this, new Runnable() { // from class: ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarView$setQuantityModeImmediately$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    productActionBarView$setQuantityModeImmediately$updateLayoutParams$1.invoke();
                }
            });
        } else {
            productActionBarView$setQuantityModeImmediately$updateLayoutParams$1.invoke();
        }
        this.actionButton.setVisibility(8);
        this.actionButton.setAlpha(0.0f);
        setViewsVisibilityAndAlpha(true, this.minusButton, this.valueText, this.plusButton);
    }

    private final void setViewsVisibilityAndAlpha(boolean isVisible, View... views) {
        for (View view : views) {
            view.setVisibility(isVisible ? 0 : 8);
            view.setAlpha(isVisible ? 1.0f : 0.0f);
        }
    }

    public final void bindOrGone(ProductActionBarVO item) {
        if (item == null) {
            setVisibility(8);
            return;
        }
        int i11 = item.getHeightPx() == ProductActionBarVOKt.getBIG_HEIGHT_PX() ? marginSizeBig : marginSizeSmall;
        bindStyle(item, i11);
        ProductActionBarVO.State adultActionIcon = item.getAdultActionIcon();
        if (adultActionIcon == null) {
            adultActionIcon = item.getState();
        }
        setMode(adultActionIcon, item.getHeightPx(), i11);
        setVisibility(0);
    }

    public final void removeListener() {
        this.listener = null;
    }

    public final void setListener(@NotNull ActionListener newListener) {
        Intrinsics.checkNotNullParameter(newListener, "newListener");
        this.listener = newListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductActionBarView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        CardView cardView = new CardView(context);
        cardView.setId(View.generateViewId());
        cardView.setCardBackgroundColor(context.getColor(defaultBackgroundColor));
        cardView.setRadius(backgroundCornerRadius);
        float f7 = elevationLevel;
        cardView.setCardElevation(f7);
        if (Build.VERSION.SDK_INT >= 28) {
            int i12 = shadowColor;
            cardView.setOutlineSpotShadowColor(i12);
            cardView.setOutlineAmbientShadowColor(i12);
        }
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41634h = 0;
        cardView.setLayoutParams(bVar);
        cardView.setContentDescription("productActionBar");
        addView(cardView);
        this.backgroundView = cardView;
        int i13 = 0;
        int i14 = 0;
        AttributeSet attributeSet2 = null;
        int i15 = 14;
        DefaultConstructorMarker defaultConstructorMarker = null;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, attributeSet2, i13, i14, i15, defaultConstructorMarker);
        iconButtonV3View.setId(View.generateViewId());
        iconButtonV3View.setZ(f7);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41636i = cardView.getId();
        bVar2.f41642l = cardView.getId();
        bVar2.f41628e = cardView.getId();
        iconButtonV3View.setLayoutParams(bVar2);
        iconButtonV3View.setContentDescription("minusButton");
        addView(iconButtonV3View);
        this.minusButton = iconButtonV3View;
        IconButtonV3View iconButtonV3View2 = new IconButtonV3View(context, attributeSet2, i13, i14, i15, defaultConstructorMarker);
        iconButtonV3View2.setId(R$id.freshTilePlusButton);
        iconButtonV3View2.setZ(f7);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, -2);
        bVar3.f41636i = cardView.getId();
        bVar3.f41642l = cardView.getId();
        bVar3.f41634h = cardView.getId();
        iconButtonV3View2.setLayoutParams(bVar3);
        addView(iconButtonV3View2);
        this.plusButton = iconButtonV3View2;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, attributeSet2, i13, 6, null);
        textAtomV2View.setId(R$id.freshTileValueText);
        textAtomV2View.setZ(f7);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(0, -2);
        bVar4.f41636i = cardView.getId();
        bVar4.f41642l = cardView.getId();
        bVar4.f41630f = iconButtonV3View.getId();
        bVar4.f41632g = iconButtonV3View2.getId();
        textAtomV2View.setLayoutParams(bVar4);
        TextViewExtKt.setTextCopyable(textAtomV2View, false);
        addView(textAtomV2View);
        this.valueText = textAtomV2View;
        IconButtonV3View iconButtonV3View3 = new IconButtonV3View(context, null, i13, 0, 14, null);
        iconButtonV3View3.setId(View.generateViewId());
        iconButtonV3View3.setZ(f7);
        ConstraintLayout.b bVar5 = new ConstraintLayout.b(-2, -2);
        bVar5.f41636i = cardView.getId();
        bVar5.f41642l = cardView.getId();
        bVar5.f41634h = cardView.getId();
        iconButtonV3View3.setLayoutParams(bVar5);
        iconButtonV3View3.setContentDescription("actionButton");
        addView(iconButtonV3View3);
        this.actionButton = iconButtonV3View3;
        this.animationToQuantity = UtilsKt.unsafeLazy(new ProductActionBarView$animationToQuantity$2(this));
    }
}

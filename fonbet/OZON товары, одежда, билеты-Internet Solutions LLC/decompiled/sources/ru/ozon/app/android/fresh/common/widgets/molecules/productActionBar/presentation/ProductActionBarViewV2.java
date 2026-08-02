package ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation;

import B0.C2454a;
import Bu.f;
import G.g;
import K00.b;
import Kk.C3532b;
import Nh.a;
import Sc.o;
import Ve.C4636t5;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.G;
import c8.C5766e;
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
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarViewV2;
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
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u0000 C2\u00020\u0001:\u0006CDEFGHB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u001e\u001a\u00020\u001aJ\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0007H\u0002J\u0018\u0010!\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0002J)\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u000b2\u0012\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020'0&\"\u00020'H\u0002¢\u0006\u0002\u0010(J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+H\u0002J>\u0010,\u001a\u00020\u001a*\u00020\u00142\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001002\b\b\u0002\u00102\u001a\u00020\u000b2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001a04H\u0002J\u0014\u00105\u001a\u00020\u0007*\u00020\u00072\u0006\u00106\u001a\u00020\u0007H\u0002J\b\u00107\u001a\u00020\u000fH\u0002J\u0010\u00108\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u0007H\u0002J/\u0010:\u001a\u00020;*\u00020'2\u0006\u0010<\u001a\u00020\u000b2\b\b\u0002\u0010=\u001a\u00020>2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0002\u0010@J\u0018\u0010A\u001a\u00020;2\u0006\u0010B\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isAnimating", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$ActionListener;", "animationToActionIcon", "Landroid/animation/AnimatorSet;", "animationToQuantityPicker", "backgroundView", "Landroidx/cardview/widget/CardView;", "minusButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "plusButton", "quantityTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "actionButton", "bind", "", "state", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$State;", "shouldAnimate", "clear", "setActionModeImmediately", "heightPx", "setQuantityModeImmediately", "marginPx", "setViewsVisibilityAndAlpha", "isVisible", "views", "", "Landroid/view/View;", "(Z[Landroid/view/View;)V", "bindCommon", "common", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$CommonStyles;", "bindIconButton", "sizeToken", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;", "iconToken", "", "iconColorToken", "isEnabled", "onClick", "Lkotlin/Function0;", "copyWithNewAlpha", "newAlpha", "getOrCreateAnimationToQuantityPicker", "getOrCreateAnimationToActionIcon", "targetWidth", "createAlphaAnimator", "Landroid/animation/ValueAnimator;", "isAppearance", "animationDuration", "", "animationDelay", "(Landroid/view/View;ZJLjava/lang/Long;)Landroid/animation/ValueAnimator;", "createWidthAnimator", "currentWidth", "Companion", "ActionListener", "State", "ActionIcon", "QuantityPicker", "CommonStyles", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductActionBarViewV2 extends ConstraintLayout {

    @NotNull
    private final IconButtonV3View actionButton;
    private AnimatorSet animationToActionIcon;
    private AnimatorSet animationToQuantityPicker;

    @NotNull
    private final CardView backgroundView;
    private boolean isAnimating;
    private ActionListener listener;

    @NotNull
    private final IconButtonV3View minusButton;

    @NotNull
    private final IconButtonV3View plusButton;

    @NotNull
    private final TextAtomV2View quantityTextView;
    private static final int shadowColor = Color.parseColor("#e8000000");
    private static final int defaultBackgroundColor = UniColors.BG_LIGHT_KEY.getResId();
    private static final float backgroundCornerRadius = UiExtKt.toPxF(CornerRadius.RADIUS_600.getPx());
    private static final float elevationLevel = UiExtKt.toPxF(2);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$ActionIcon;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$State;", "", "iconToken", "", "isEnabled", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$CommonStyles;", "commonStyles", "<init>", "(Ljava/lang/String;ZLru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$CommonStyles;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIconToken", "Z", "()Z", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$CommonStyles;", "getCommonStyles", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$CommonStyles;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionIcon implements State {

        @NotNull
        private final CommonStyles commonStyles;

        @NotNull
        private final String iconToken;
        private final boolean isEnabled;

        public ActionIcon(@NotNull String iconToken, boolean z11, @NotNull CommonStyles commonStyles) {
            Intrinsics.checkNotNullParameter(iconToken, "iconToken");
            Intrinsics.checkNotNullParameter(commonStyles, "commonStyles");
            this.iconToken = iconToken;
            this.isEnabled = z11;
            this.commonStyles = commonStyles;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionIcon)) {
                return false;
            }
            ActionIcon actionIcon = (ActionIcon) other;
            return Intrinsics.d(this.iconToken, actionIcon.iconToken) && this.isEnabled == actionIcon.isEnabled && Intrinsics.d(this.commonStyles, actionIcon.commonStyles);
        }

        @Override // ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarViewV2.State
        @NotNull
        public CommonStyles getCommonStyles() {
            return this.commonStyles;
        }

        @NotNull
        public final String getIconToken() {
            return this.iconToken;
        }

        public int hashCode() {
            return this.commonStyles.hashCode() + C3532b.a(this.iconToken.hashCode() * 31, 31, this.isEnabled);
        }

        @NotNull
        public String toString() {
            String str = this.iconToken;
            boolean z11 = this.isEnabled;
            CommonStyles commonStyles = this.commonStyles;
            StringBuilder b11 = C4636t5.b("ActionIcon(iconToken=", str, ", isEnabled=", ", commonStyles=", z11);
            b11.append(commonStyles);
            b11.append(")");
            return b11.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$ActionListener;", "", "onActionIconClick", "", "onPlusClick", "onMinusClick", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ActionListener {
        void onActionIconClick();

        void onMinusClick();

        void onPlusClick();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$CommonStyles;", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;", "sizeToken", "", "sizePx", "", "backgroundColorToken", "iconColorToken", "marginPx", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;ILjava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;", "getSizeToken", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;", "I", "getSizePx", "Ljava/lang/String;", "getBackgroundColorToken", "getIconColorToken", "getMarginPx", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CommonStyles {
        private final String backgroundColorToken;
        private final String iconColorToken;
        private final int marginPx;
        private final int sizePx;

        @NotNull
        private final IconButtonV3DTO.Sizes sizeToken;

        public CommonStyles(@NotNull IconButtonV3DTO.Sizes sizeToken, int i11, String str, String str2, int i12) {
            Intrinsics.checkNotNullParameter(sizeToken, "sizeToken");
            this.sizeToken = sizeToken;
            this.sizePx = i11;
            this.backgroundColorToken = str;
            this.iconColorToken = str2;
            this.marginPx = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommonStyles)) {
                return false;
            }
            CommonStyles commonStyles = (CommonStyles) other;
            return this.sizeToken == commonStyles.sizeToken && this.sizePx == commonStyles.sizePx && Intrinsics.d(this.backgroundColorToken, commonStyles.backgroundColorToken) && Intrinsics.d(this.iconColorToken, commonStyles.iconColorToken) && this.marginPx == commonStyles.marginPx;
        }

        public final String getBackgroundColorToken() {
            return this.backgroundColorToken;
        }

        public final String getIconColorToken() {
            return this.iconColorToken;
        }

        public final int getMarginPx() {
            return this.marginPx;
        }

        public final int getSizePx() {
            return this.sizePx;
        }

        @NotNull
        public final IconButtonV3DTO.Sizes getSizeToken() {
            return this.sizeToken;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.sizePx, this.sizeToken.hashCode() * 31, 31);
            String str = this.backgroundColorToken;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.iconColorToken;
            return Integer.hashCode(this.marginPx) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            IconButtonV3DTO.Sizes sizes = this.sizeToken;
            int i11 = this.sizePx;
            String str = this.backgroundColorToken;
            String str2 = this.iconColorToken;
            int i12 = this.marginPx;
            StringBuilder sb2 = new StringBuilder("CommonStyles(sizeToken=");
            sb2.append(sizes);
            sb2.append(", sizePx=");
            sb2.append(i11);
            sb2.append(", backgroundColorToken=");
            a.h(sb2, str, ", iconColorToken=", str2, ", marginPx=");
            return b.e(i12, ")", sb2);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u0007\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$QuantityPicker;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$State;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "quantityText", "", "plusIconToken", "", "isPlusEnabled", "minusIconToken", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$CommonStyles;", "commonStyles", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;ZLjava/lang/String;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$CommonStyles;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getQuantityText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getPlusIconToken", "Z", "()Z", "getMinusIconToken", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$CommonStyles;", "getCommonStyles", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$CommonStyles;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuantityPicker implements State {

        @NotNull
        private final CommonStyles commonStyles;
        private final boolean isPlusEnabled;

        @NotNull
        private final String minusIconToken;

        @NotNull
        private final String plusIconToken;

        @NotNull
        private final TextDTO quantityText;

        public QuantityPicker(@NotNull TextDTO quantityText, @NotNull String plusIconToken, boolean z11, @NotNull String minusIconToken, @NotNull CommonStyles commonStyles) {
            Intrinsics.checkNotNullParameter(quantityText, "quantityText");
            Intrinsics.checkNotNullParameter(plusIconToken, "plusIconToken");
            Intrinsics.checkNotNullParameter(minusIconToken, "minusIconToken");
            Intrinsics.checkNotNullParameter(commonStyles, "commonStyles");
            this.quantityText = quantityText;
            this.plusIconToken = plusIconToken;
            this.isPlusEnabled = z11;
            this.minusIconToken = minusIconToken;
            this.commonStyles = commonStyles;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuantityPicker)) {
                return false;
            }
            QuantityPicker quantityPicker = (QuantityPicker) other;
            return Intrinsics.d(this.quantityText, quantityPicker.quantityText) && Intrinsics.d(this.plusIconToken, quantityPicker.plusIconToken) && this.isPlusEnabled == quantityPicker.isPlusEnabled && Intrinsics.d(this.minusIconToken, quantityPicker.minusIconToken) && Intrinsics.d(this.commonStyles, quantityPicker.commonStyles);
        }

        @Override // ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarViewV2.State
        @NotNull
        public CommonStyles getCommonStyles() {
            return this.commonStyles;
        }

        @NotNull
        public final String getMinusIconToken() {
            return this.minusIconToken;
        }

        @NotNull
        public final String getPlusIconToken() {
            return this.plusIconToken;
        }

        @NotNull
        public final TextDTO getQuantityText() {
            return this.quantityText;
        }

        public int hashCode() {
            return this.commonStyles.hashCode() + g.a(C3532b.a(g.a(this.quantityText.hashCode() * 31, 31, this.plusIconToken), 31, this.isPlusEnabled), 31, this.minusIconToken);
        }

        /* renamed from: isPlusEnabled, reason: from getter */
        public final boolean getIsPlusEnabled() {
            return this.isPlusEnabled;
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.quantityText;
            String str = this.plusIconToken;
            boolean z11 = this.isPlusEnabled;
            String str2 = this.minusIconToken;
            CommonStyles commonStyles = this.commonStyles;
            StringBuilder f7 = D3.g.f("QuantityPicker(quantityText=", textDTO, ", plusIconToken=", str, ", isPlusEnabled=");
            C5766e.a(", minusIconToken=", str2, ", commonStyles=", f7, z11);
            f7.append(commonStyles);
            f7.append(")");
            return f7.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$State;", "", "commonStyles", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$CommonStyles;", "getCommonStyles", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$CommonStyles;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$ActionIcon;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$QuantityPicker;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface State {
        @NotNull
        CommonStyles getCommonStyles();
    }

    public /* synthetic */ ProductActionBarViewV2(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindCommon(CommonStyles common) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.backgroundView.setCardBackgroundColor(styleParser.parseColor(context, common.getBackgroundColorToken(), defaultBackgroundColor));
        CardView cardView = this.backgroundView;
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.setMargins(common.getMarginPx(), common.getMarginPx(), common.getMarginPx(), common.getMarginPx() + ((int) elevationLevel));
        cardView.setLayoutParams(bVar);
        for (IconButtonV3View iconButtonV3View : C7714v.b0(this.actionButton, this.minusButton, this.plusButton)) {
            ViewGroup.LayoutParams layoutParams2 = iconButtonV3View.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            ((ViewGroup.MarginLayoutParams) bVar2).width = common.getSizePx();
            ((ViewGroup.MarginLayoutParams) bVar2).height = common.getSizePx();
            iconButtonV3View.setLayoutParams(bVar2);
        }
    }

    private final void bindIconButton(final IconButtonV3View iconButtonV3View, IconButtonV3DTO.Sizes sizes, String str, String str2, final boolean z11, final Function0<Unit> function0) {
        IconButtonV3HolderKt.bindOrGone$default(iconButtonV3View, new IconButtonV3DTO(sizes, ButtonV3DTO.StyleTypes.CUSTOM, IconButtonV3DTO.IconButtonShape.SHAPE_CIRCLE, str, null, null, UniColors.CLEAR_LIGHT_KEY_0.getToken(), null, Boolean.valueOf(!z11), null, null, null, null, null, 16048, null), null, 2, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = iconButtonV3View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, str2, UniColors.GRAPHIC_DARK_KEY.getResId());
        if (!z11) {
            parseColor = copyWithNewAlpha(parseColor, 51);
        }
        iconButtonV3View.setIconColor(parseColor);
        iconButtonV3View.setOnClickListener(new View.OnClickListener() { // from class: Bu.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductActionBarViewV2 productActionBarViewV2 = this;
                ProductActionBarViewV2.bindIconButton$lambda$21(z11, iconButtonV3View, productActionBarViewV2, function0, view);
            }
        });
    }

    static /* synthetic */ void bindIconButton$default(ProductActionBarViewV2 productActionBarViewV2, IconButtonV3View iconButtonV3View, IconButtonV3DTO.Sizes sizes, String str, String str2, boolean z11, Function0 function0, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        productActionBarViewV2.bindIconButton(iconButtonV3View, sizes, str, str2, z11, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindIconButton$lambda$21(boolean z11, IconButtonV3View iconButtonV3View, ProductActionBarViewV2 productActionBarViewV2, Function0 function0, View view) {
        if (!z11) {
            HapticVibrator.INSTANCE.vibrate(iconButtonV3View, HapticToken.ERROR);
        } else {
            if (productActionBarViewV2.isAnimating) {
                return;
            }
            HapticVibrator.INSTANCE.vibrate(iconButtonV3View, HapticToken.SUCCESS);
            function0.invoke();
        }
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
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarViewV2$createAlphaAnimator$lambda$35$$inlined$doOnStart$1
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
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarViewV2$createAlphaAnimator$lambda$35$$inlined$doOnEnd$1
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
        ofFloat.addUpdateListener(new f(view, i11));
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    static /* synthetic */ ValueAnimator createAlphaAnimator$default(ProductActionBarViewV2 productActionBarViewV2, View view, boolean z11, long j11, Long l11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 100;
        }
        long j12 = j11;
        if ((i11 & 4) != 0) {
            l11 = null;
        }
        return productActionBarViewV2.createAlphaAnimator(view, z11, j12, l11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createAlphaAnimator$lambda$35$lambda$34(View view, ValueAnimator valueAnimator) {
        view.setAlpha(((Float) Bi.a.b(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    private final ValueAnimator createWidthAnimator(int currentWidth, int targetWidth) {
        ValueAnimator ofInt = ValueAnimator.ofInt(currentWidth, targetWidth);
        ofInt.setDuration(100L);
        ofInt.setInterpolator(FigmaInterpolator.INSTANCE.getEaseIn());
        ofInt.addUpdateListener(new Bu.g(this, 0));
        Intrinsics.checkNotNullExpressionValue(ofInt, "apply(...)");
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createWidthAnimator$lambda$38$lambda$37(ProductActionBarViewV2 productActionBarViewV2, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        CardView cardView = productActionBarViewV2.backgroundView;
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.width = ((Integer) animatedValue).intValue();
        cardView.setLayoutParams(layoutParams);
    }

    private final AnimatorSet getOrCreateAnimationToActionIcon(int targetWidth) {
        AnimatorSet animatorSet = this.animationToActionIcon;
        if (animatorSet != null) {
            return animatorSet;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarViewV2$getOrCreateAnimationToActionIcon$lambda$30$$inlined$doOnStart$1
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
                ProductActionBarViewV2.this.isAnimating = true;
            }
        });
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(createAlphaAnimator$default(this, this.minusButton, false, 33L, null, 4, null), createAlphaAnimator$default(this, this.quantityTextView, false, 33L, null, 4, null), createAlphaAnimator$default(this, this.plusButton, false, 33L, null, 4, null));
        animatorSet2.playTogether(animatorSet3, createWidthAnimator(this.backgroundView.getWidth(), targetWidth), createAlphaAnimator$default(this, this.actionButton, true, 0L, 50L, 2, null));
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarViewV2$getOrCreateAnimationToActionIcon$lambda$30$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                ProductActionBarViewV2.this.isAnimating = false;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        this.animationToActionIcon = animatorSet2;
        return animatorSet2;
    }

    private final AnimatorSet getOrCreateAnimationToQuantityPicker() {
        AnimatorSet animatorSet = this.animationToQuantityPicker;
        if (animatorSet != null) {
            return animatorSet;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarViewV2$getOrCreateAnimationToQuantityPicker$lambda$25$$inlined$doOnStart$1
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
                ProductActionBarViewV2.this.isAnimating = true;
            }
        });
        ValueAnimator createAlphaAnimator$default = createAlphaAnimator$default(this, this.actionButton, false, 0L, null, 6, null);
        int width = this.backgroundView.getWidth();
        int measuredWidth = getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = this.backgroundView.getLayoutParams();
        ValueAnimator createWidthAnimator = createWidthAnimator(width, measuredWidth - ((layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0) * 2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(createAlphaAnimator(this.plusButton, true, 33L, 33L), createAlphaAnimator$default(this, this.quantityTextView, true, 33L, null, 4, null), createAlphaAnimator$default(this, this.minusButton, true, 33L, null, 4, null));
        animatorSet2.playTogether(createAlphaAnimator$default, createWidthAnimator, animatorSet3);
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarViewV2$getOrCreateAnimationToQuantityPicker$lambda$25$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                ProductActionBarViewV2.this.isAnimating = false;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        this.animationToQuantityPicker = animatorSet2;
        return animatorSet2;
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
        setViewsVisibilityAndAlpha(false, this.minusButton, this.quantityTextView, this.plusButton);
    }

    private final void setQuantityModeImmediately(int heightPx, int marginPx) {
        final ProductActionBarViewV2$setQuantityModeImmediately$updateLayoutParams$1 productActionBarViewV2$setQuantityModeImmediately$updateLayoutParams$1 = new ProductActionBarViewV2$setQuantityModeImmediately$updateLayoutParams$1(this, marginPx, heightPx);
        if (getMeasuredWidth() <= 0) {
            G.a(this, new Runnable() { // from class: ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarViewV2$setQuantityModeImmediately$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    productActionBarViewV2$setQuantityModeImmediately$updateLayoutParams$1.invoke();
                }
            });
        } else {
            productActionBarViewV2$setQuantityModeImmediately$updateLayoutParams$1.invoke();
        }
        this.actionButton.setVisibility(8);
        this.actionButton.setAlpha(0.0f);
        setViewsVisibilityAndAlpha(true, this.minusButton, this.quantityTextView, this.plusButton);
    }

    private final void setViewsVisibilityAndAlpha(boolean isVisible, View... views) {
        for (View view : views) {
            view.setVisibility(isVisible ? 0 : 8);
            view.setAlpha(isVisible ? 1.0f : 0.0f);
        }
    }

    public final void bind(@NotNull State state, boolean shouldAnimate, ActionListener listener) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.isAnimating) {
            AnimatorSet animatorSet = this.animationToActionIcon;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.animationToQuantityPicker;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.isAnimating = false;
        }
        if (listener != null) {
            this.listener = listener;
        }
        bindCommon(state.getCommonStyles());
        boolean z11 = getMeasuredWidth() > 0;
        if (state instanceof ActionIcon) {
            ActionIcon actionIcon = (ActionIcon) state;
            bindIconButton$default(this, this.actionButton, actionIcon.getCommonStyles().getSizeToken(), actionIcon.getIconToken(), actionIcon.getCommonStyles().getIconColorToken(), false, new ProductActionBarViewV2$bind$1(listener), 8, null);
            if (shouldAnimate && z11) {
                getOrCreateAnimationToActionIcon(actionIcon.getCommonStyles().getSizePx()).start();
                return;
            } else {
                setActionModeImmediately(actionIcon.getCommonStyles().getSizePx());
                return;
            }
        }
        if (!(state instanceof QuantityPicker)) {
            throw new o();
        }
        QuantityPicker quantityPicker = (QuantityPicker) state;
        bindIconButton$default(this, this.minusButton, quantityPicker.getCommonStyles().getSizeToken(), quantityPicker.getMinusIconToken(), quantityPicker.getCommonStyles().getIconColorToken(), false, new ProductActionBarViewV2$bind$2(listener), 8, null);
        bindIconButton(this.plusButton, quantityPicker.getCommonStyles().getSizeToken(), quantityPicker.getPlusIconToken(), quantityPicker.getCommonStyles().getIconColorToken(), quantityPicker.getIsPlusEnabled(), new ProductActionBarViewV2$bind$3(listener));
        this.plusButton.setContentDescription(quantityPicker.getIsPlusEnabled() ? "plusButtonV2" : "plusButtonV2_disabled");
        TextHolderKt.bindOrGone$default(this.quantityTextView, quantityPicker.getQuantityText(), null, 2, null);
        if (shouldAnimate && z11) {
            getOrCreateAnimationToQuantityPicker().start();
        } else {
            setQuantityModeImmediately(quantityPicker.getCommonStyles().getSizePx(), quantityPicker.getCommonStyles().getMarginPx());
        }
    }

    public final void clear() {
        this.isAnimating = false;
        this.listener = null;
        this.animationToActionIcon = null;
        this.animationToQuantityPicker = null;
        CardView cardView = this.backgroundView;
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -2;
        layoutParams.height = -2;
        cardView.setLayoutParams(layoutParams);
        setViewsVisibilityAndAlpha(false, this.actionButton, this.minusButton, this.plusButton, this.quantityTextView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductActionBarViewV2(@NotNull Context context, AttributeSet attributeSet, int i11) {
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
        cardView.setContentDescription("productActionBarV2");
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
        iconButtonV3View.setContentDescription("minusButtonV2");
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
        this.quantityTextView = textAtomV2View;
        IconButtonV3View iconButtonV3View3 = new IconButtonV3View(context, null, i13, 0, 14, null);
        iconButtonV3View3.setId(View.generateViewId());
        iconButtonV3View3.setZ(f7);
        ConstraintLayout.b bVar5 = new ConstraintLayout.b(-2, -2);
        bVar5.f41636i = cardView.getId();
        bVar5.f41642l = cardView.getId();
        bVar5.f41634h = cardView.getId();
        iconButtonV3View3.setLayoutParams(bVar5);
        iconButtonV3View3.setContentDescription("actionButtonV2");
        addView(iconButtonV3View3);
        this.actionButton = iconButtonV3View3;
    }
}

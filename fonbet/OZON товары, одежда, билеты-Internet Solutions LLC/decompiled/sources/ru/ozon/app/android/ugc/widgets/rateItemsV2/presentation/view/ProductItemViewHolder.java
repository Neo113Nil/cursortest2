package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view;

import B3.D;
import Dc0.m;
import Dc0.n;
import UZ.a;
import WZ.g;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.K;
import fd.InterfaceC6511n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.timerMolecule.presentation.TimerDelegate;
import ru.ozon.app.android.timerMolecule.presentation.TimerDelegateImpl;
import ru.ozon.app.android.timerMolecule.presentation.TimerTickData;
import ru.ozon.app.android.timerMolecule.presentation.TimerVO;
import ru.ozon.app.android.ugc.databinding.WidgetRateItemsV2ProductItemBinding;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.data.RateItemsV2DTO;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.FadeAnimRefs;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2VO;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.utils.ProductItemAnimator;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.atom.rating.RatingView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.productMedia.ProductMediaHolderKt;
import ru.ozon.uni.atoms.v3.holders.rating.DsRatingHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000¯\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001R\b\u0001\u0018\u0000 m2\u00020\u0001:\u0001mB\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012$\u0010\t\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u001a\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0019\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b#\u0010!J\u0015\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b(\u0010!J\u0019\u0010+\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b+\u0010,J#\u0010/\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010\u00052\b\u0010.\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b/\u00100J!\u00103\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u00010\u00052\u0006\u00102\u001a\u00020\u0006H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010\u0018J\u0011\u00106\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\bH\u0002¢\u0006\u0004\b8\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010;R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010<R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010=R\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010=R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010>R(\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010?R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010<R$\u0010@\u001a\u0004\u0018\u00010\u00078\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010!R\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010JR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR \u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010<R\u001c\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010=R\u001c\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010=R\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010ZR\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR&\u0010g\u001a\u0014\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010?R\u0014\u0010j\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010l¨\u0006n"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/view/ProductItemViewHolder;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/view/BaseRateItemV2ViewHolder;", "Lru/ozon/app/android/ugc/databinding/WidgetRateItemsV2ProductItemBinding;", "binding", "Lkotlin/Function3;", "", "", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO$RateProductItemVO;", "", "ratingClickListener", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/Function0;", "onTimerFinish", "onItemAnimationComplete", "LWZ/l;", "tokenizedAnalytics", "Lkotlin/Function2;", "cellActionHandler", "ignoreItemActionHandler", "<init>", "(Lru/ozon/app/android/ugc/databinding/WidgetRateItemsV2ProductItemBinding;Lfd/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LWZ/l;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "onAttach", "()V", "onDetach", "onRecycle", "", "widgetId", "trackViewEvent", "(Ljava/lang/Long;)V", "rateProductItem", "bind", "(Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO$RateProductItemVO;)V", "vo", "updateItemReference", "", "compact", "updateCompactMode", "(Z)V", "bindHideAreaOrGone", "Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", "timerVO", "bindTimer", "(Lru/ozon/app/android/timerMolecule/presentation/TimerVO;)V", "backgroundColor", "strokeColor", "setupBackground", "(Ljava/lang/String;Ljava/lang/String;)V", "stringColor", "defaultColorRes", "getIntColor", "(Ljava/lang/String;I)I", "scheduleHideTitleVisibility", "shouldShowHideTitle", "()Ljava/lang/Boolean;", "removeHideTitlePreDrawListener", "Lru/ozon/app/android/ugc/databinding/WidgetRateItemsV2ProductItemBinding;", "getBinding", "()Lru/ozon/app/android/ugc/databinding/WidgetRateItemsV2ProductItemBinding;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "LWZ/l;", "Lkotlin/jvm/functions/Function2;", "item", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO$RateProductItemVO;", "getItem", "()Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO$RateProductItemVO;", "setItem", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/view/utils/ProductItemAnimator;", "itemAnimator", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/view/utils/ProductItemAnimator;", "Lru/ozon/uni/core/UniColors;", "defaultBackgroundColor", "Lru/ozon/uni/core/UniColors;", "defaultStrokeColor", "Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "ru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/view/ProductItemViewHolder$ratingCallback$1", "ratingCallback", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/view/ProductItemViewHolder$ratingCallback$1;", "ignoreActionHandler", "titleCallback", "rootCallback", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/FadeAnimRefs;", "productMediaAnimRefs", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/FadeAnimRefs;", "titleAnimRefs", "Lru/ozon/app/android/timerMolecule/presentation/TimerDelegateImpl;", "timerDelegate", "Lru/ozon/app/android/timerMolecule/presentation/TimerDelegateImpl;", "Lru/ozon/app/android/timerMolecule/presentation/TimerTickData$TimerTextType;", "lastTimerType", "Lru/ozon/app/android/timerMolecule/presentation/TimerTickData$TimerTextType;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "hideTitlePreDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "LUZ/a;", "LWZ/g;", "analyticsModifier", "getDeeplink", "()Ljava/lang/String;", "deeplink", "isScrollWithAnimation", "()Z", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductItemViewHolder extends BaseRateItemV2ViewHolder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Function2<a, g, g> analyticsModifier;

    @NotNull
    private final WidgetRateItemsV2ProductItemBinding binding;
    private final Function2<AtomAction, String, Unit> cellActionHandler;

    @NotNull
    private final UniColors defaultBackgroundColor;

    @NotNull
    private final UniColors defaultStrokeColor;

    @NotNull
    private final GradientDrawable gradientDrawable;

    @NotNull
    private final Handler handler;
    private ViewTreeObserver.OnPreDrawListener hideTitlePreDrawListener;

    @NotNull
    private final Function1<AtomAction, Unit> ignoreActionHandler;

    @NotNull
    private final Function1<AtomAction, Unit> ignoreItemActionHandler;
    private RateItemsV2VO.RateItemVO.RateProductItemVO item;

    @NotNull
    private final ProductItemAnimator itemAnimator;
    private TimerTickData.TimerTextType lastTimerType;
    private final Function0<Unit> onItemAnimationComplete;

    @NotNull
    private final Function0<Unit> onTimerFinish;

    @NotNull
    private final FadeAnimRefs productMediaAnimRefs;

    @NotNull
    private final ProductItemViewHolder$ratingCallback$1 ratingCallback;

    @NotNull
    private final Function0<Unit> rootCallback;

    @NotNull
    private final TimerDelegateImpl timerDelegate;

    @NotNull
    private final FadeAnimRefs titleAnimRefs;

    @NotNull
    private final Function0<Unit> titleCallback;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/view/ProductItemViewHolder$Companion;", "", "<init>", "()V", "VISIBILITY_CUSTOM_ANALYTICS_KEY", "", "TITLE_VISIBLE", "TITLE_HIDDEN", "COMPAT_MODE_WIDTH_PADDINGS", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ProductItemViewHolder(@NotNull WidgetRateItemsV2ProductItemBinding binding, InterfaceC6511n<? super String, ? super Integer, ? super RateItemsV2VO.RateItemVO.RateProductItemVO, Unit> interfaceC6511n, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function0<Unit> onTimerFinish, Function0<Unit> function0, @NotNull l tokenizedAnalytics, Function2<? super AtomAction, ? super String, Unit> function2, @NotNull Function1<? super AtomAction, Unit> ignoreItemActionHandler) {
        super(r4, tokenizedAnalytics);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(ignoreItemActionHandler, "ignoreItemActionHandler");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.actionHandler = actionHandler;
        this.onTimerFinish = onTimerFinish;
        this.onItemAnimationComplete = function0;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.cellActionHandler = function2;
        this.ignoreItemActionHandler = ignoreItemActionHandler;
        RatingView rating = binding.rating;
        Intrinsics.checkNotNullExpressionValue(rating, "rating");
        LinearLayout hideCL = binding.hideCL;
        Intrinsics.checkNotNullExpressionValue(hideCL, "hideCL");
        CellView cell = binding.cell;
        Intrinsics.checkNotNullExpressionValue(cell, "cell");
        TextAtomV2View title = binding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        ConstraintLayout constraintLayout2 = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
        this.itemAnimator = new ProductItemAnimator(rating, hideCL, cell, title, constraintLayout2, new ProductItemViewHolder$itemAnimator$1(this));
        UniColors uniColors = UniColors.LAYER_FLOOR_1;
        this.defaultBackgroundColor = uniColors;
        UniColors uniColors2 = UniColors.LAYER_SURFACE;
        this.defaultStrokeColor = uniColors2;
        GradientDrawable b11 = D.b(0);
        Dimens dimens = Dimens.INSTANCE;
        b11.setCornerRadius(dimens.getDPF_16());
        b11.setColor(getIntColor(uniColors.getToken(), uniColors.getResId()));
        b11.setStroke(dimens.getDP_1(), getIntColor(uniColors2.getToken(), uniColors2.getResId()));
        this.gradientDrawable = b11;
        this.handler = new Handler(Looper.getMainLooper());
        ProductItemViewHolder$ratingCallback$1 productItemViewHolder$ratingCallback$1 = new ProductItemViewHolder$ratingCallback$1(this, interfaceC6511n);
        this.ratingCallback = productItemViewHolder$ratingCallback$1;
        this.ignoreActionHandler = new ProductItemViewHolder$ignoreActionHandler$1(this);
        this.titleCallback = new ProductItemViewHolder$titleCallback$1(this);
        this.rootCallback = new ProductItemViewHolder$rootCallback$1(this);
        int i11 = 3;
        this.productMediaAnimRefs = new FadeAnimRefs(null, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        this.titleAnimRefs = new FadeAnimRefs(0 == true ? 1 : 0, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        this.timerDelegate = new TimerDelegateImpl();
        this.analyticsModifier = new ProductItemViewHolder$analyticsModifier$1(this);
        binding.getConstraintLayout().setOnClickListener(new m(this, 14));
        binding.getConstraintLayout().setBackground(b11);
        binding.rating.setRatingClickCallback(productItemViewHolder$ratingCallback$1);
        binding.hideCL.setOnClickListener(new n(this, 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$7$lambda$5(ProductItemViewHolder productItemViewHolder, View view) {
        productItemViewHolder.titleCallback.invoke();
    }

    private final void bindHideAreaOrGone(RateItemsV2VO.RateItemVO.RateProductItemVO rateProductItem) {
        WidgetRateItemsV2ProductItemBinding widgetRateItemsV2ProductItemBinding = this.binding;
        RateItemsV2VO.HideButtonVO hideButtonVO = rateProductItem.getHideButtonVO();
        LinearLayout hideCL = widgetRateItemsV2ProductItemBinding.hideCL;
        Intrinsics.checkNotNullExpressionValue(hideCL, "hideCL");
        ViewExtKt.showOrGone(hideCL, Boolean.valueOf(hideButtonVO != null));
        if (hideButtonVO != null) {
            LinearLayout hideCL2 = widgetRateItemsV2ProductItemBinding.hideCL;
            Intrinsics.checkNotNullExpressionValue(hideCL2, "hideCL");
            hideCL2.setPadding(ResourceExtKt.toPx(hideButtonVO.getLeftPadding().getPx()), hideCL2.getPaddingTop(), hideCL2.getPaddingRight(), hideCL2.getPaddingBottom());
            IconButtonV3View hideButton = widgetRateItemsV2ProductItemBinding.hideButton;
            Intrinsics.checkNotNullExpressionValue(hideButton, "hideButton");
            IconButtonV3HolderKt.bindOrGone(hideButton, hideButtonVO.getIconButton(), this.ignoreActionHandler);
            TextAtomV2View hideTitle = widgetRateItemsV2ProductItemBinding.hideTitle;
            Intrinsics.checkNotNullExpressionValue(hideTitle, "hideTitle");
            TextHolderKt.bindOrGone$default(hideTitle, hideButtonVO.getTitle(), null, 2, null);
            widgetRateItemsV2ProductItemBinding.hideTitle.setClickable(false);
            widgetRateItemsV2ProductItemBinding.hideTitle.setTextIsSelectable(false);
            scheduleHideTitleVisibility();
        }
    }

    private final void bindTimer(TimerVO timerVO) {
        WidgetRateItemsV2ProductItemBinding widgetRateItemsV2ProductItemBinding = this.binding;
        TimerDelegateImpl timerDelegateImpl = this.timerDelegate;
        TextAtomV2View timer = widgetRateItemsV2ProductItemBinding.timer;
        Intrinsics.checkNotNullExpressionValue(timer, "timer");
        TimerDelegate.DefaultImpls.bindOrGone$default(timerDelegateImpl, timer, timerVO, null, 4, null);
        widgetRateItemsV2ProductItemBinding.timer.setTextIsSelectable(false);
        widgetRateItemsV2ProductItemBinding.timer.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getDeeplink() {
        RatingDTO rating;
        CommonControlSettings common;
        AtomActionDTO action;
        String link;
        RateItemsV2VO.RateItemVO.RateProductItemVO item = getItem();
        return (item == null || (rating = item.getRating()) == null || (common = rating.getCommon()) == null || (action = common.getAction()) == null || (link = action.getLink()) == null) ? "" : link;
    }

    private final int getIntColor(String stringColor, int defaultColorRes) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return styleParser.parseColor(context, stringColor, defaultColorRes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isScrollWithAnimation() {
        RateItemsV2VO.RateItemVO.RateProductItemVO item = getItem();
        return (item != null ? item.getScrollType() : null) == RateItemsV2DTO.ScrollType.ONE_BY_ONE_WITH_SCROLL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$1(ProductItemViewHolder productItemViewHolder, View view) {
        productItemViewHolder.rootCallback.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$2(ProductItemViewHolder productItemViewHolder, View view) {
        RateItemsV2VO.HideButtonVO hideButtonVO;
        IconButtonV3DTO iconButton;
        CommonControlSettings common;
        AtomAction atomAction;
        RateItemsV2VO.RateItemVO.RateProductItemVO item = productItemViewHolder.getItem();
        if (item == null || (hideButtonVO = item.getHideButtonVO()) == null || (iconButton = hideButtonVO.getIconButton()) == null || (common = iconButton.getCommon()) == null || (atomAction = common.toAtomAction()) == null) {
            return;
        }
        productItemViewHolder.ignoreActionHandler.invoke(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeHideTitlePreDrawListener() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.hideTitlePreDrawListener;
        if (onPreDrawListener != null) {
            this.binding.getConstraintLayout().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
        this.hideTitlePreDrawListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleHideTitleVisibility() {
        removeHideTitlePreDrawListener();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.ProductItemViewHolder$scheduleHideTitleVisibility$listener$1
            private boolean corrected;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Boolean shouldShowHideTitle;
                shouldShowHideTitle = ProductItemViewHolder.this.shouldShowHideTitle();
                if (!this.corrected && shouldShowHideTitle != null) {
                    TextAtomV2View hideTitle = ProductItemViewHolder.this.getBinding().hideTitle;
                    Intrinsics.checkNotNullExpressionValue(hideTitle, "hideTitle");
                    if (!Boolean.valueOf(hideTitle.getVisibility() == 0).equals(shouldShowHideTitle)) {
                        TextAtomV2View hideTitle2 = ProductItemViewHolder.this.getBinding().hideTitle;
                        Intrinsics.checkNotNullExpressionValue(hideTitle2, "hideTitle");
                        ViewExtKt.showOrGone(hideTitle2, shouldShowHideTitle);
                        this.corrected = true;
                        return false;
                    }
                }
                ProductItemViewHolder.this.removeHideTitlePreDrawListener();
                return true;
            }
        };
        this.hideTitlePreDrawListener = onPreDrawListener;
        this.binding.getConstraintLayout().getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
    }

    private final void setupBackground(String backgroundColor, String strokeColor) {
        ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
        if (!Intrinsics.d(backgroundColor, this.defaultBackgroundColor.getToken())) {
            this.gradientDrawable.setColor(getIntColor(backgroundColor, this.defaultBackgroundColor.getResId()));
        }
        if (!Intrinsics.d(strokeColor, this.defaultStrokeColor.getToken())) {
            this.gradientDrawable.setStroke(Dimens.INSTANCE.getDP_1(), getIntColor(strokeColor, this.defaultStrokeColor.getResId()));
        }
        if (Intrinsics.d(backgroundColor, this.defaultBackgroundColor.getToken()) && Intrinsics.d(strokeColor, this.defaultStrokeColor.getToken())) {
            return;
        }
        constraintLayout.setBackground(this.gradientDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Boolean shouldShowHideTitle() {
        RateItemsV2VO.HideButtonVO hideButtonVO;
        WidgetRateItemsV2ProductItemBinding widgetRateItemsV2ProductItemBinding = this.binding;
        RateItemsV2VO.RateItemVO.RateProductItemVO item = getItem();
        if (item == null || (hideButtonVO = item.getHideButtonVO()) == null) {
            return null;
        }
        int width = ((widgetRateItemsV2ProductItemBinding.getConstraintLayout().getWidth() - hideButtonVO.getTitleWidth()) - widgetRateItemsV2ProductItemBinding.hideCL.getPaddingRight()) - ResourceExtKt.toPx(hideButtonVO.getLeftPadding().getPx());
        BadgeView badge = widgetRateItemsV2ProductItemBinding.badge;
        Intrinsics.checkNotNullExpressionValue(badge, "badge");
        int right = ViewExtKt.isVisible(badge) ? widgetRateItemsV2ProductItemBinding.badge.getRight() : 0;
        TextAtomV2View timer = widgetRateItemsV2ProductItemBinding.timer;
        Intrinsics.checkNotNullExpressionValue(timer, "timer");
        return Boolean.valueOf(Math.max(Math.max(right, ViewExtKt.isVisible(timer) ? widgetRateItemsV2ProductItemBinding.timer.getRight() : 0), widgetRateItemsV2ProductItemBinding.rating.getRight()) < width);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bind(@NotNull RateItemsV2VO.RateItemVO.RateProductItemVO rateProductItem) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Intrinsics.checkNotNullParameter(rateProductItem, "rateProductItem");
        WidgetRateItemsV2ProductItemBinding widgetRateItemsV2ProductItemBinding = this.binding;
        RateItemsV2VO.RateItemVO.RateProductItemVO item = getItem();
        setItem(rateProductItem);
        setupBackground(rateProductItem.getBackgroundColor(), rateProductItem.getStrokeColor());
        if ((item != null ? item.getSku() : null) != null && Intrinsics.d(item.getSku(), rateProductItem.getSku())) {
            TextDTO title = item.getTitle();
            OzonSpannableString text = title != null ? title.getText() : null;
            TextDTO title2 = rateProductItem.getTitle();
            if (!Intrinsics.d(text, title2 != null ? title2.getText() : null)) {
                ProductMediaView productMedia = widgetRateItemsV2ProductItemBinding.productMedia;
                Intrinsics.checkNotNullExpressionValue(productMedia, "productMedia");
                ru.ozon.app.android.ugc.view.ViewExtKt.animateFadeOutAndBack$default(productMedia, this.productMediaAnimRefs, 0L, new ProductItemViewHolder$bind$1$1(widgetRateItemsV2ProductItemBinding, rateProductItem, this), 2, null);
                TextAtomV2View title3 = widgetRateItemsV2ProductItemBinding.title;
                Intrinsics.checkNotNullExpressionValue(title3, "title");
                ru.ozon.app.android.ugc.view.ViewExtKt.animateFadeOutAndBack$default(title3, this.titleAnimRefs, 0L, new ProductItemViewHolder$bind$1$2(widgetRateItemsV2ProductItemBinding, rateProductItem), 2, null);
                widgetRateItemsV2ProductItemBinding.title.setTextIsSelectable(false);
                widgetRateItemsV2ProductItemBinding.title.setOnClickListener(new CD.a(this, 8));
                BadgeView badge = widgetRateItemsV2ProductItemBinding.badge;
                Intrinsics.checkNotNullExpressionValue(badge, "badge");
                BadgeHolderKt.bindOrGone$default(badge, rateProductItem.getBadge(), (Function1) null, 2, (Object) null);
                widgetRateItemsV2ProductItemBinding.badge.setClickable(false);
                bindTimer(rateProductItem.getTimer());
                RatingView rating = widgetRateItemsV2ProductItemBinding.rating;
                Intrinsics.checkNotNullExpressionValue(rating, "rating");
                DsRatingHolderKt.bind$default(rating, rateProductItem.getRating(), null, 2, null);
                bindHideAreaOrGone(rateProductItem);
                CellView cell = widgetRateItemsV2ProductItemBinding.cell;
                Intrinsics.checkNotNullExpressionValue(cell, "cell");
                CellHolderKt.bindOrGone(cell, rateProductItem.getCell(), new ProductItemViewHolder$bind$1$4(this));
                this.itemAnimator.resetAnimationState((isScrollWithAnimation() || rateProductItem.getCell() == null || !rateProductItem.getWasAnimated()) ? false : true);
                ConstraintLayout constraintLayout = widgetRateItemsV2ProductItemBinding.getConstraintLayout();
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                marginLayoutParams = !(layoutParams instanceof ViewGroup.MarginLayoutParams) ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    return;
                }
                int i11 = marginLayoutParams.leftMargin;
                int i12 = marginLayoutParams.topMargin;
                int i13 = marginLayoutParams.rightMargin;
                int i14 = marginLayoutParams.bottomMargin;
                if (isScrollWithAnimation()) {
                    Dimens dimens = Dimens.INSTANCE;
                    marginLayoutParams.rightMargin = dimens.getDP_16();
                    marginLayoutParams.leftMargin = getAdapterPosition() == 0 ? dimens.getDP_16() : 0;
                } else {
                    marginLayoutParams.rightMargin = 0;
                    marginLayoutParams.leftMargin = 0;
                }
                if (i11 == marginLayoutParams.leftMargin) {
                    ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams3 = constraintLayout.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                        if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                            ViewGroup.LayoutParams layoutParams4 = constraintLayout.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                            if (i14 == (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0)) {
                                return;
                            }
                        }
                    }
                }
                constraintLayout.setLayoutParams(marginLayoutParams);
                return;
            }
        }
        ProductMediaView productMedia2 = widgetRateItemsV2ProductItemBinding.productMedia;
        Intrinsics.checkNotNullExpressionValue(productMedia2, "productMedia");
        ProductMediaHolderKt.bindOrGone(productMedia2, rateProductItem.getProductMedia(), this.actionHandler);
        TextAtomV2View title4 = widgetRateItemsV2ProductItemBinding.title;
        Intrinsics.checkNotNullExpressionValue(title4, "title");
        TextHolderKt.bindOrGone$default(title4, rateProductItem.getTitle(), null, 2, null);
        widgetRateItemsV2ProductItemBinding.title.setTextIsSelectable(false);
        widgetRateItemsV2ProductItemBinding.title.setOnClickListener(new CD.a(this, 8));
        BadgeView badge2 = widgetRateItemsV2ProductItemBinding.badge;
        Intrinsics.checkNotNullExpressionValue(badge2, "badge");
        BadgeHolderKt.bindOrGone$default(badge2, rateProductItem.getBadge(), (Function1) null, 2, (Object) null);
        widgetRateItemsV2ProductItemBinding.badge.setClickable(false);
        bindTimer(rateProductItem.getTimer());
        RatingView rating2 = widgetRateItemsV2ProductItemBinding.rating;
        Intrinsics.checkNotNullExpressionValue(rating2, "rating");
        DsRatingHolderKt.bind$default(rating2, rateProductItem.getRating(), null, 2, null);
        bindHideAreaOrGone(rateProductItem);
        CellView cell2 = widgetRateItemsV2ProductItemBinding.cell;
        Intrinsics.checkNotNullExpressionValue(cell2, "cell");
        CellHolderKt.bindOrGone(cell2, rateProductItem.getCell(), new ProductItemViewHolder$bind$1$4(this));
        this.itemAnimator.resetAnimationState((isScrollWithAnimation() || rateProductItem.getCell() == null || !rateProductItem.getWasAnimated()) ? false : true);
        ConstraintLayout constraintLayout2 = widgetRateItemsV2ProductItemBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams5 = constraintLayout2.getLayoutParams();
        if (!(layoutParams5 instanceof ViewGroup.MarginLayoutParams)) {
        }
        if (marginLayoutParams != null) {
        }
    }

    @NotNull
    public final WidgetRateItemsV2ProductItemBinding getBinding() {
        return this.binding;
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        TimerDelegateImpl timerDelegateImpl = this.timerDelegate;
        TextAtomV2View timer = this.binding.timer;
        Intrinsics.checkNotNullExpressionValue(timer, "timer");
        timerDelegateImpl.onAttach(timer, K.a(this), new ProductItemViewHolder$onAttach$1(this), this.onTimerFinish);
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
        this.handler.removeCallbacksAndMessages(null);
        removeHideTitlePreDrawListener();
        this.productMediaAnimRefs.cancel();
        this.titleAnimRefs.cancel();
        this.itemAnimator.cancel();
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.timerDelegate.onClear();
        this.lastTimerType = null;
    }

    protected void setItem(RateItemsV2VO.RateItemVO.RateProductItemVO rateProductItemVO) {
        this.item = rateProductItemVO;
    }

    @Override // ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.BaseRateItemV2ViewHolder
    public void trackViewEvent(Long widgetId) {
        RateItemsV2VO.HideButtonVO hideButtonVO;
        IconButtonV3DTO iconButton;
        CommonControlSettings common;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t mapToTokenizedEvent$default;
        super.trackViewEvent(widgetId);
        RateItemsV2VO.RateItemVO.RateProductItemVO item = getItem();
        if (item == null || (hideButtonVO = item.getHideButtonVO()) == null || (iconButton = hideButtonVO.getIconButton()) == null || (common = iconButton.getCommon()) == null || (trackingInfo = common.getTrackingInfo()) == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, widgetId, null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents(this.tokenizedAnalytics, mapToTokenizedEvent$default, new ProductItemViewHolder$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(this.analyticsModifier));
    }

    public final void updateCompactMode(boolean compact) {
        int i11 = this.itemView.getContext().getResources().getDisplayMetrics().widthPixels;
        ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        int i12 = layoutParams.height;
        int i13 = layoutParams.width;
        int px = compact ? i11 - ResourceExtKt.toPx(64) : -1;
        layoutParams.width = px;
        if (i12 == layoutParams.height && i13 == px) {
            return;
        }
        constraintLayout.setLayoutParams(layoutParams);
    }

    public final void updateItemReference(@NotNull RateItemsV2VO.RateItemVO.RateProductItemVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        setItem(vo);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.BaseRateItemV2ViewHolder
    public RateItemsV2VO.RateItemVO.RateProductItemVO getItem() {
        return this.item;
    }
}

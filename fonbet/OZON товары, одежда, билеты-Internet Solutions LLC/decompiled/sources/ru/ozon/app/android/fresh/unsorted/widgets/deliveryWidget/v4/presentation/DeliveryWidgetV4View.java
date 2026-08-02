package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation;

import Au.c;
import B3.D;
import Bo.ViewOnClickListenerC2667a;
import K00.b;
import Nh.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.G;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4VO;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4View;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 \u0098\u00012\u00020\u0001:\u0006\u0098\u0001\u0099\u0001\u009a\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ9\u0010\u0011\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\r0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010$J\u001f\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J#\u00101\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00100\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0004\b1\u00102J'\u00107\u001a\u00020\r2\f\u00105\u001a\b\u0012\u0004\u0012\u000204032\b\u00106\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b7\u00108J-\u0010:\u001a\b\u0012\u0004\u0012\u000209032\f\u00105\u001a\b\u0012\u0004\u0012\u000204032\b\u00106\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b:\u0010;J\u001d\u0010=\u001a\u00020\u00152\f\u0010<\u001a\b\u0012\u0004\u0012\u00020903H\u0002¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u00020\r2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020903H\u0002¢\u0006\u0004\b?\u0010@J\u001d\u0010A\u001a\u00020\r2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020903H\u0002¢\u0006\u0004\bA\u0010@J\u0017\u0010E\u001a\u00020D2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bE\u0010FJ\u001b\u0010G\u001a\u00020\r*\u00020D2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bG\u0010HJ!\u0010L\u001a\u00020K2\u0006\u0010J\u001a\u00020I2\b\u00106\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\r2\u0006\u0010N\u001a\u00020!H\u0002¢\u0006\u0004\bO\u0010$J\u0017\u0010Q\u001a\u00020\r2\u0006\u0010P\u001a\u00020\u0015H\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\rH\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020\r2\u0006\u0010U\u001a\u00020\u0006H\u0002¢\u0006\u0004\bV\u0010WJ)\u0010Z\u001a\u00020\r2\u0006\u0010U\u001a\u00020\u00062\u0006\u0010X\u001a\u00020\u00062\b\u0010Y\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0004\bZ\u0010[J\u001f\u0010]\u001a\u00020\r2\u0006\u0010U\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020\u0015H\u0002¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\rH\u0002¢\u0006\u0004\b_\u0010TJ\u000f\u0010`\u001a\u00020\rH\u0002¢\u0006\u0004\b`\u0010TJ\u0017\u0010a\u001a\u00020\r2\u0006\u0010U\u001a\u00020\u0006H\u0002¢\u0006\u0004\ba\u0010WJ\u000f\u0010b\u001a\u00020\rH\u0002¢\u0006\u0004\bb\u0010TJ\u001f\u0010d\u001a\u00020\r2\u0006\u0010X\u001a\u00020\u00062\u0006\u0010c\u001a\u00020\u0006H\u0002¢\u0006\u0004\bd\u0010eJ'\u0010g\u001a\u00020\r2\u0006\u0010X\u001a\u00020\u00062\u0006\u0010c\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\u0006H\u0002¢\u0006\u0004\bg\u0010hJ\u001f\u0010k\u001a\u00020\r2\u0006\u0010j\u001a\u00020i2\u0006\u0010\u0014\u001a\u000209H\u0002¢\u0006\u0004\bk\u0010lJ\u0019\u0010m\u001a\u00020\r2\b\u0010Y\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0004\bm\u0010nJ\u0015\u0010o\u001a\u00020!*\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\bo\u0010pR\"\u0010q\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010WR\"\u0010v\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010r\u001a\u0004\bw\u0010t\"\u0004\bx\u0010WR\u001b\u0010~\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u0017\u0010\u0080\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u0085\u0001\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0017\u0010\u0087\u0001\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010\u0089\u0001\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0017\u0010\u008b\u0001\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008a\u0001R \u0010\u0090\u0001\u001a\u00030\u008c\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008d\u0001\u0010{\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R \u0010\u0093\u0001\u001a\u00030\u008c\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0091\u0001\u0010{\u001a\u0006\b\u0092\u0001\u0010\u008f\u0001R\u0018\u0010\u0094\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010rR)\u0010\u000e\u001a\u0014\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\r\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000e\u0010\u0095\u0001R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0010\u0010\u0095\u0001R\u0019\u0010\u0096\u0001\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001¨\u0006\u009b\u0001"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "onView", "Lru/ozon/uni/atoms/af/AtomAction;", "onClick", "setActionHandlers", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO;", "item", "", "isFirstBind", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO;Z)V", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$ChevronVO;", "chevron", "bindChevron", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$ChevronVO;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$ProgressVO;", "progress", "bindProgress", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$ProgressVO;Z)V", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ProgressState;", "newState", "applyHiddenState", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ProgressState;)V", "applyEmptyState", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ProgressState$Value;", "oldState", "applyValueState", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ProgressState$Value;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ProgressState;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$SpacersVO;", "spacers", "bindSpacers", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$SpacersVO;)V", "", "borderColor", "backgroundColor", "bindBorder", "(Ljava/lang/String;Ljava/lang/String;)V", "", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$ContentBlockVO;", "blocks", "action", "bindContentBlocks", "(Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ContentItem;", "buildContentItems", "(Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;)Ljava/util/List;", "items", "canReuseViews", "(Ljava/util/List;)Z", "rebuildContentViews", "(Ljava/util/List;)V", "rebindContentViews", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "icon", "Landroid/widget/ImageView;", "createIcon", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;)Landroid/widget/ImageView;", "bindIcon", "(Landroid/widget/ImageView;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "createText", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/uni/android/atom/text/TextAtomV2View;", "state", "initWithProgressBackgroundView", "withProgressView", "initProgressContainer", "(Z)V", "setupProgressBackground", "()V", "topPadding", "prepareAndShowProgressContainer", "(I)V", "percentage", "color", "prepareAndShowProgressWithValue", "(IILjava/lang/String;)V", "showProgress", "showProgressContainer", "(IZ)V", "hideProgressContainer", "onProgressAnimationFinished", "updateProgressContainerPadding", "updateProgressContainer", "previousPercentage", "animateToPercentage", "(II)V", "totalWidth", "animateProgressTransition", "(III)V", "Landroid/view/View;", "view", "applyRightMargin", "(Landroid/view/View;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ContentItem;)V", "applyProgressColor", "(Ljava/lang/String;)V", "toProgressState", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO$ProgressVO;)Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ProgressState;", "defaultBottomPadding", "I", "getDefaultBottomPadding", "()I", "setDefaultBottomPadding", "progressTopMargin", "getProgressTopMargin", "setProgressTopMargin", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/ProgressAnimationHelper;", "animationHelper$delegate", "LSc/j;", "getAnimationHelper", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/ProgressAnimationHelper;", "animationHelper", "Landroidx/constraintlayout/widget/ConstraintLayout;", "containerView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/LinearLayout;", "contentContainer", "Landroid/widget/LinearLayout;", "chevronView", "Landroid/widget/ImageView;", "progressContainer", "Landroid/widget/FrameLayout;", "progressBackgroundView", "Landroid/view/View;", "progressView", "Landroid/graphics/drawable/GradientDrawable;", "progressDrawable$delegate", "getProgressDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "progressDrawable", "progressLineDrawable$delegate", "getProgressLineDrawable", "progressLineDrawable", "horizontalSpacer", "Lkotlin/jvm/functions/Function1;", "currentProgressState", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ProgressState;", "Companion", "ContentItem", "ProgressState", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryWidgetV4View extends FrameLayout {
    private static final int betweenDefaultValue;

    @NotNull
    private static final float[] cornerRadiiDefault;
    private static final int defaultContentBlockRightPadding;

    /* renamed from: animationHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j animationHelper;

    @NotNull
    private final ImageView chevronView;

    @NotNull
    private final ConstraintLayout containerView;

    @NotNull
    private final LinearLayout contentContainer;

    @NotNull
    private ProgressState currentProgressState;
    private int defaultBottomPadding;
    private int horizontalSpacer;
    private Function1<? super AtomAction, Unit> onClick;
    private Function1<? super t, Unit> onView;

    @NotNull
    private final View progressBackgroundView;

    @NotNull
    private final FrameLayout progressContainer;

    /* renamed from: progressDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j progressDrawable;

    /* renamed from: progressLineDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j progressLineDrawable;
    private int progressTopMargin;

    @NotNull
    private final View progressView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int defaultBackgroundColor = UniColors.LAYER_FLOOR_1.getResId();
    private static final int defaultStrokeColor = UniColors.GRAPHIC_STROKE_STICKY.getResId();
    private static final int defaultChevronColor = UniColors.GRAPHIC_TERTIARY.getResId();
    private static final int defaultIconColor = UniColors.GRAPHIC_KEY.getResId();
    private static final int defaultProgressLineColor = UniColors.BG_OVERLAP.getResId();
    private static final int defaultProgressColor = UniColors.GRAPHIC_POSITIVE_PRIMARY.getResId();
    private static final int progressHeight = ResourceExtKt.toPx(4);
    private static final int strokeWidth = ResourceExtKt.toPx(1);
    private static final float progressRadius = ResourceExtKt.toPxF(100);
    private static final int iconsSize = ResourceExtKt.toPx(16);
    private static final float mainRadius = ResourceExtKt.toPxF(24);
    private static final float zeroRadius = ResourceExtKt.toPxF(0);
    private static final int containerBottomPadding = ResourceExtKt.toPx(8);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$Companion;", "", "<init>", "()V", "", "defaultProgressLineColor", "I", "getDefaultProgressLineColor", "()I", "", "progressRadius", "F", "getProgressRadius", "()F", "FULL_PROGRESS", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDefaultProgressLineColor() {
            return DeliveryWidgetV4View.defaultProgressLineColor;
        }

        public final float getProgressRadius() {
            return DeliveryWidgetV4View.progressRadius;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ContentItem;", "", "rightMargin", "", "getRightMargin", "()I", "Icon", "Text", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ContentItem$Icon;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ContentItem$Text;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ContentItem {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ContentItem$Icon;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ContentItem;", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "icon", "", "rightMargin", "<init>", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "I", "getRightMargin", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Icon implements ContentItem {
            public static final int $stable = CommonAtomIconDTO.$stable;

            @NotNull
            private final CommonAtomIconDTO icon;
            private final int rightMargin;

            public Icon(@NotNull CommonAtomIconDTO icon, int i11) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.icon = icon;
                this.rightMargin = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) other;
                return Intrinsics.d(this.icon, icon.icon) && this.rightMargin == icon.rightMargin;
            }

            @NotNull
            public final CommonAtomIconDTO getIcon() {
                return this.icon;
            }

            @Override // ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4View.ContentItem
            public int getRightMargin() {
                return this.rightMargin;
            }

            public int hashCode() {
                return Integer.hashCode(this.rightMargin) + (this.icon.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Icon(icon=" + this.icon + ", rightMargin=" + this.rightMargin + ")";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000e¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ContentItem$Text;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ContentItem;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "rightMargin", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "I", "getRightMargin", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Text implements ContentItem {
            public static final int $stable = AtomAction.$stable;
            private final AtomAction action;
            private final int rightMargin;

            @NotNull
            private final TextDTO text;

            public Text(@NotNull TextDTO text, AtomAction atomAction, int i11) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
                this.action = atomAction;
                this.rightMargin = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Text)) {
                    return false;
                }
                Text text = (Text) other;
                return Intrinsics.d(this.text, text.text) && Intrinsics.d(this.action, text.action) && this.rightMargin == text.rightMargin;
            }

            public final AtomAction getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4View.ContentItem
            public int getRightMargin() {
                return this.rightMargin;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                AtomAction atomAction = this.action;
                return Integer.hashCode(this.rightMargin) + ((hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31);
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.text;
                AtomAction atomAction = this.action;
                int i11 = this.rightMargin;
                StringBuilder sb2 = new StringBuilder("Text(text=");
                sb2.append(textDTO);
                sb2.append(", action=");
                sb2.append(atomAction);
                sb2.append(", rightMargin=");
                return b.e(i11, ")", sb2);
            }
        }

        int getRightMargin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ProgressState;", "", "Hidden", "Empty", "Value", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ProgressState$Empty;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ProgressState$Hidden;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ProgressState$Value;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    interface ProgressState {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ProgressState$Empty;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ProgressState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Empty implements ProgressState {

            @NotNull
            public static final Empty INSTANCE = new Empty();

            private Empty() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Empty);
            }

            public int hashCode() {
                return -1625998376;
            }

            @NotNull
            public String toString() {
                return "Empty";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ProgressState$Hidden;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ProgressState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Hidden implements ProgressState {

            @NotNull
            public static final Hidden INSTANCE = new Hidden();

            private Hidden() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Hidden);
            }

            public int hashCode() {
                return 1215477887;
            }

            @NotNull
            public String toString() {
                return "Hidden";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ProgressState$Value;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4View$ProgressState;", "", "percentage", "", "color", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPercentage", "Ljava/lang/String;", "getColor", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Value implements ProgressState {
            private final String color;
            private final int percentage;

            public Value(int i11, String str) {
                this.percentage = i11;
                this.color = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Value)) {
                    return false;
                }
                Value value = (Value) other;
                return this.percentage == value.percentage && Intrinsics.d(this.color, value.color);
            }

            public final String getColor() {
                return this.color;
            }

            public final int getPercentage() {
                return this.percentage;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.percentage) * 31;
                String str = this.color;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return a.c(this.percentage, "Value(percentage=", ", color=", this.color, ")");
            }
        }
    }

    static {
        int i11 = 0;
        float[] fArr = new float[8];
        while (i11 < 8) {
            fArr[i11] = i11 < 4 ? mainRadius : zeroRadius;
            i11++;
        }
        cornerRadiiDefault = fArr;
        defaultContentBlockRightPadding = ResourceExtKt.toPx(4);
        betweenDefaultValue = ResourceExtKt.toPx(12);
    }

    public /* synthetic */ DeliveryWidgetV4View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateProgressTransition(int percentage, int previousPercentage, int totalWidth) {
        if (totalWidth <= 0) {
            return;
        }
        int i11 = (int) ((percentage * totalWidth) / 100.0f);
        int i12 = (int) ((totalWidth * previousPercentage) / 100.0f);
        Integer valueOf = Integer.valueOf(this.progressView.getWidth());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            i12 = valueOf.intValue();
        }
        if (previousPercentage <= 0 || this.progressView.getVisibility() != 0) {
            getAnimationHelper().animateProgressAppear(i11, new DeliveryWidgetV4View$animateProgressTransition$1(this));
        } else {
            getAnimationHelper().animateProgressWidth(i12, i11, new DeliveryWidgetV4View$animateProgressTransition$2(this));
        }
    }

    private final void animateToPercentage(final int percentage, final int previousPercentage) {
        updateProgressContainer();
        int width = this.progressBackgroundView.getWidth();
        if (width > 0) {
            animateProgressTransition(percentage, previousPercentage, width);
        } else {
            final ConstraintLayout constraintLayout = this.containerView;
            G.a(constraintLayout, new Runnable() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4View$animateToPercentage$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    View view;
                    DeliveryWidgetV4View deliveryWidgetV4View = this;
                    int i11 = percentage;
                    int i12 = previousPercentage;
                    view = deliveryWidgetV4View.progressBackgroundView;
                    deliveryWidgetV4View.animateProgressTransition(i11, i12, view.getWidth());
                }
            });
        }
    }

    private final void applyEmptyState(ProgressState newState) {
        if (Intrinsics.d(newState, ProgressState.Hidden.INSTANCE)) {
            hideProgressContainer();
            return;
        }
        if (Intrinsics.d(newState, ProgressState.Empty.INSTANCE)) {
            return;
        }
        if (!(newState instanceof ProgressState.Value)) {
            throw new o();
        }
        ProgressState.Value value = (ProgressState.Value) newState;
        applyProgressColor(value.getColor());
        setupProgressBackground();
        updateProgressContainer();
        animateToPercentage(value.getPercentage(), 0);
    }

    private final void applyHiddenState(ProgressState newState) {
        if (Intrinsics.d(newState, ProgressState.Hidden.INSTANCE)) {
            return;
        }
        if (Intrinsics.d(newState, ProgressState.Empty.INSTANCE)) {
            setupProgressBackground();
            prepareAndShowProgressContainer(this.progressTopMargin);
        } else {
            if (!(newState instanceof ProgressState.Value)) {
                throw new o();
            }
            setupProgressBackground();
            ProgressState.Value value = (ProgressState.Value) newState;
            prepareAndShowProgressWithValue(this.progressTopMargin, value.getPercentage(), value.getColor());
        }
    }

    private final void applyProgressColor(String color) {
        View view = this.progressView;
        GradientDrawable progressDrawable = getProgressDrawable();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, color, defaultProgressColor);
        progressDrawable.setColors(new int[]{parseColor, parseColor});
        view.setBackground(progressDrawable);
    }

    private final void applyRightMargin(View view, ContentItem item) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginEnd(item.getRightMargin());
        view.setLayoutParams(layoutParams2);
    }

    private final void applyValueState(ProgressState.Value oldState, ProgressState newState) {
        if (Intrinsics.d(newState, ProgressState.Hidden.INSTANCE)) {
            hideProgressContainer();
            return;
        }
        if (Intrinsics.d(newState, ProgressState.Empty.INSTANCE)) {
            setupProgressBackground();
            updateProgressContainer();
            getAnimationHelper().animateProgressToZero(new DeliveryWidgetV4View$applyValueState$1(this));
        } else {
            if (!(newState instanceof ProgressState.Value)) {
                throw new o();
            }
            ProgressState.Value value = (ProgressState.Value) newState;
            applyProgressColor(value.getColor());
            setupProgressBackground();
            animateToPercentage(value.getPercentage(), oldState.getPercentage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$19$lambda$16(DeliveryWidgetV4View deliveryWidgetV4View, DeliveryWidgetV4VO deliveryWidgetV4VO, View view) {
        Function1<? super AtomAction, Unit> function1 = deliveryWidgetV4View.onClick;
        if (function1 != null) {
            function1.invoke(deliveryWidgetV4VO.getAction());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$19$lambda$17(DeliveryWidgetV4View deliveryWidgetV4View, DeliveryWidgetV4VO deliveryWidgetV4VO, View view) {
        Function1<? super AtomAction, Unit> function1 = deliveryWidgetV4View.onClick;
        if (function1 != null) {
            function1.invoke(deliveryWidgetV4VO.getAction());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$19$lambda$18(DeliveryWidgetV4View deliveryWidgetV4View, DeliveryWidgetV4VO deliveryWidgetV4VO, View view) {
        Function1<? super AtomAction, Unit> function1 = deliveryWidgetV4View.onClick;
        if (function1 != null) {
            function1.invoke(deliveryWidgetV4VO.getAction());
        }
    }

    private final void bindBorder(String borderColor, String backgroundColor) {
        GradientDrawable b11 = D.b(0);
        int i11 = strokeWidth;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        b11.setStroke(i11, styleParser.parseColor(context, borderColor, defaultStrokeColor));
        b11.setCornerRadii(cornerRadiiDefault);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        b11.setColor(styleParser.parseColor(context2, backgroundColor, defaultBackgroundColor));
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{b11});
        layerDrawable.setLayerInset(0, -i11, 0, -i11, -i11);
        setBackground(layerDrawable);
    }

    private final void bindChevron(DeliveryWidgetV4VO.ChevronVO chevron) {
        ImageView imageView = this.chevronView;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        imageView.setImageDrawable(ContextExtKt.loadIconByString(context, chevron.getChevronIcon().getIcon()));
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ThemeExtKt.tint(imageView, Integer.valueOf(styleParser.parseColor(context2, chevron.getChevronIcon().getTintColor(), defaultChevronColor)));
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int px = ResourceExtKt.toPx(chevron.getRightPadding().getPx()) - this.horizontalSpacer;
        if (px < 0) {
            px = 0;
        }
        marginLayoutParams.setMarginEnd(px);
        imageView.setLayoutParams(marginLayoutParams);
    }

    private final void bindContentBlocks(List<DeliveryWidgetV4VO.ContentBlockVO> blocks, AtomAction action) {
        List<ContentItem> buildContentItems = buildContentItems(blocks, action);
        if (canReuseViews(buildContentItems)) {
            rebindContentViews(buildContentItems);
        } else {
            rebuildContentViews(buildContentItems);
        }
    }

    private final void bindIcon(ImageView imageView, CommonAtomIconDTO commonAtomIconDTO) {
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        imageView.setImageDrawable(ContextExtKt.loadIconByString(context, commonAtomIconDTO.getIcon()));
        ViewExtKt.show(imageView);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ThemeExtKt.tint(imageView, Integer.valueOf(styleParser.parseColor(context2, commonAtomIconDTO.getTintColor(), defaultIconColor)));
    }

    private final void bindProgress(DeliveryWidgetV4VO.ProgressVO progress, boolean isFirstBind) {
        ProgressState progressState = toProgressState(progress);
        int i11 = this.progressTopMargin + progressHeight;
        if (isFirstBind) {
            initWithProgressBackgroundView(progressState);
            return;
        }
        ProgressState progressState2 = this.currentProgressState;
        if (Intrinsics.d(progressState, progressState2)) {
            if (i11 == this.progressContainer.getHeight() || Intrinsics.d(progressState, ProgressState.Hidden.INSTANCE)) {
                return;
            }
            updateProgressContainer();
            return;
        }
        if (Intrinsics.d(progressState2, ProgressState.Hidden.INSTANCE)) {
            applyHiddenState(progressState);
        } else if (Intrinsics.d(progressState2, ProgressState.Empty.INSTANCE)) {
            applyEmptyState(progressState);
        } else {
            if (!(progressState2 instanceof ProgressState.Value)) {
                throw new o();
            }
            applyValueState((ProgressState.Value) progressState2, progressState);
        }
        this.currentProgressState = progressState;
    }

    private final void bindSpacers(DeliveryWidgetV4VO.SpacersVO spacers) {
        this.defaultBottomPadding = ResourceExtKt.toPx(spacers.getBottom().getPx());
        this.horizontalSpacer = ResourceExtKt.toPx(spacers.getHorizontal().getPx());
        setPadding(ResourceExtKt.toPx(spacers.getHorizontal().getPx()), ResourceExtKt.toPx(spacers.getTop().getPx()) + strokeWidth, ResourceExtKt.toPx(spacers.getHorizontal().getPx()), ResourceExtKt.toPx(spacers.getBottom().getPx()));
        Paddings between = spacers.getBetween();
        this.progressTopMargin = between != null ? ResourceExtKt.toPx(between.getPx()) : betweenDefaultValue;
    }

    private final List<ContentItem> buildContentItems(List<DeliveryWidgetV4VO.ContentBlockVO> blocks, AtomAction action) {
        Tc.b builder = C7714v.B();
        for (DeliveryWidgetV4VO.ContentBlockVO contentBlockVO : blocks) {
            Paddings rightPadding = contentBlockVO.getRightPadding();
            int px = rightPadding != null ? ResourceExtKt.toPx(rightPadding.getPx()) : defaultContentBlockRightPadding;
            CommonAtomIconDTO icon = contentBlockVO.getIcon();
            if (icon != null) {
                builder.add(new ContentItem.Icon(icon, px));
            }
            TextDTO text = contentBlockVO.getText();
            if (text != null) {
                builder.add(new ContentItem.Text(text, action, px));
            }
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    private final boolean canReuseViews(List<? extends ContentItem> items) {
        boolean z11;
        if (this.contentContainer.getChildCount() != items.size()) {
            return false;
        }
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ContentItem contentItem = (ContentItem) obj;
            View childAt = this.contentContainer.getChildAt(i11);
            if (contentItem instanceof ContentItem.Text) {
                z11 = childAt instanceof TextAtomV2View;
            } else {
                if (!(contentItem instanceof ContentItem.Icon)) {
                    throw new o();
                }
                z11 = childAt instanceof ImageView;
            }
            if (!z11) {
                return false;
            }
            i11 = i12;
        }
        return true;
    }

    private final ImageView createIcon(CommonAtomIconDTO icon) {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i11 = iconsSize;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(i11, i11));
        bindIcon(imageView, icon);
        return imageView;
    }

    private final TextAtomV2View createText(TextDTO text, AtomAction action) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        Bi.a.d(-2, -2, textAtomV2View);
        TextHolderKt.bindOrGone$default(textAtomV2View, text, null, 2, null);
        textAtomV2View.setOnClickListener(new NV.a(5, action, this));
        return textAtomV2View;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createText$lambda$37$lambda$36(AtomAction atomAction, DeliveryWidgetV4View deliveryWidgetV4View, View view) {
        Function1<? super AtomAction, Unit> function1;
        if (atomAction == null || (function1 = deliveryWidgetV4View.onClick) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    private final ProgressAnimationHelper getAnimationHelper() {
        return (ProgressAnimationHelper) this.animationHelper.getValue();
    }

    private final GradientDrawable getProgressDrawable() {
        return (GradientDrawable) this.progressDrawable.getValue();
    }

    private final GradientDrawable getProgressLineDrawable() {
        return (GradientDrawable) this.progressLineDrawable.getValue();
    }

    private final void hideProgressContainer() {
        getAnimationHelper().animateProgressContainerVisibility(this.progressContainer.getHeight(), 0, false, new DeliveryWidgetV4View$hideProgressContainer$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initProgressContainer(boolean withProgressView) {
        setupProgressBackground();
        updateProgressContainer();
        ViewExtKt.show(this.progressBackgroundView);
        this.progressBackgroundView.setAlpha(1.0f);
        ViewExtKt.showOrGone(this.progressView, Boolean.valueOf(withProgressView));
        this.progressView.setAlpha(1.0f);
        this.progressView.setScaleX(1.0f);
    }

    private final void initWithProgressBackgroundView(final ProgressState state) {
        getAnimationHelper().cancel();
        if (!Intrinsics.d(state, ProgressState.Hidden.INSTANCE)) {
            if (Intrinsics.d(state, ProgressState.Empty.INSTANCE)) {
                initProgressContainer(false);
                View view = this.progressView;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.width = 0;
                view.setLayoutParams(layoutParams2);
            } else {
                if (!(state instanceof ProgressState.Value)) {
                    throw new o();
                }
                applyProgressColor(((ProgressState.Value) state).getColor());
                if (!isLaidOut() || isLayoutRequested()) {
                    addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4View$initWithProgressBackgroundView$$inlined$doOnLayout$1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                            view2.removeOnLayoutChangeListener(this);
                            Integer valueOf = Integer.valueOf(DeliveryWidgetV4View.this.containerView.getMeasuredWidth());
                            if (valueOf.intValue() <= 0) {
                                valueOf = null;
                            }
                            if (valueOf != null) {
                                int percentage = (int) ((((DeliveryWidgetV4View.ProgressState.Value) state).getPercentage() * valueOf.intValue()) / 100.0f);
                                View view3 = DeliveryWidgetV4View.this.progressView;
                                ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                                if (layoutParams3 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                }
                                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                layoutParams4.width = percentage;
                                view3.setLayoutParams(layoutParams4);
                                DeliveryWidgetV4View.this.initProgressContainer(true);
                                DeliveryWidgetV4View.this.progressView.bringToFront();
                            }
                        }
                    });
                } else {
                    Integer valueOf = Integer.valueOf(this.containerView.getMeasuredWidth());
                    if (valueOf.intValue() <= 0) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        int percentage = (int) ((r0.getPercentage() * valueOf.intValue()) / 100.0f);
                        View view2 = this.progressView;
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        if (layoutParams3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                        layoutParams4.width = percentage;
                        view2.setLayoutParams(layoutParams4);
                        initProgressContainer(true);
                        this.progressView.bringToFront();
                    }
                }
            }
        }
        this.currentProgressState = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onProgressAnimationFinished() {
        this.progressView.bringToFront();
    }

    private final void prepareAndShowProgressContainer(int topPadding) {
        updateProgressContainerPadding(topPadding);
        ViewExtKt.show(this.progressBackgroundView);
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.hide(this.progressView);
        showProgressContainer(topPadding, false);
    }

    private final void prepareAndShowProgressWithValue(int topPadding, int percentage, String color) {
        Integer valueOf = Integer.valueOf(this.progressContainer.getWidth());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        int intValue = (int) (((valueOf != null ? valueOf.intValue() : this.containerView.getWidth()) * percentage) / 100.0f);
        updateProgressContainerPadding(topPadding);
        applyProgressColor(color);
        setupProgressBackground();
        View view = this.progressBackgroundView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        view.setLayoutParams(layoutParams2);
        View view2 = this.progressView;
        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.width = intValue;
        view2.setLayoutParams(layoutParams4);
        ViewExtKt.show(this.progressBackgroundView);
        ViewExtKt.show(this.progressView);
        showProgressContainer(topPadding, true);
    }

    private final void rebindContentViews(List<? extends ContentItem> items) {
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ContentItem contentItem = (ContentItem) obj;
            View childAt = this.contentContainer.getChildAt(i11);
            if ((childAt instanceof ImageView) && (contentItem instanceof ContentItem.Icon)) {
                bindIcon((ImageView) childAt, ((ContentItem.Icon) contentItem).getIcon());
            } else if ((childAt instanceof TextAtomV2View) && (contentItem instanceof ContentItem.Text)) {
                TextAtomV2View textAtomV2View = (TextAtomV2View) childAt;
                TextHolderKt.bindOrGone$default(textAtomV2View, ((ContentItem.Text) contentItem).getText(), null, 2, null);
                textAtomV2View.setOnClickListener(new Sx.a(4, (ContentItem.Text) contentItem, this));
            }
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rebindContentViews$lambda$33$lambda$32(ContentItem contentItem, DeliveryWidgetV4View deliveryWidgetV4View, View view) {
        Function1<? super AtomAction, Unit> function1;
        AtomAction action = ((ContentItem.Text) contentItem).getAction();
        if (action == null || (function1 = deliveryWidgetV4View.onClick) == null) {
            return;
        }
        function1.invoke(action);
    }

    private final void rebuildContentViews(List<? extends ContentItem> items) {
        View createIcon;
        this.contentContainer.removeAllViews();
        for (ContentItem contentItem : items) {
            if (contentItem instanceof ContentItem.Text) {
                ContentItem.Text text = (ContentItem.Text) contentItem;
                createIcon = createText(text.getText(), text.getAction());
            } else {
                if (!(contentItem instanceof ContentItem.Icon)) {
                    throw new o();
                }
                createIcon = createIcon(((ContentItem.Icon) contentItem).getIcon());
            }
            applyRightMargin(createIcon, contentItem);
            this.contentContainer.addView(createIcon);
        }
    }

    private final void setupProgressBackground() {
        this.progressBackgroundView.setBackground(getProgressLineDrawable());
        getAnimationHelper().setBackgroundVisible(true);
    }

    private final void showProgressContainer(int topPadding, boolean showProgress) {
        FrameLayout frameLayout = this.progressContainer;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
        frameLayout.setLayoutParams(bVar);
        ProgressAnimationHelper.animateProgressContainerVisibility$default(getAnimationHelper(), 0, topPadding + progressHeight, showProgress, null, 8, null);
    }

    private final ProgressState toProgressState(DeliveryWidgetV4VO.ProgressVO progressVO) {
        return progressVO == null ? ProgressState.Hidden.INSTANCE : progressVO.getPercentage() <= 0 ? ProgressState.Empty.INSTANCE : new ProgressState.Value(h.e(progressVO.getPercentage(), 0, 100), progressVO.getColor());
    }

    private final void updateProgressContainer() {
        updateProgressContainerPadding(this.progressTopMargin);
        FrameLayout frameLayout = this.progressContainer;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).height = this.progressTopMargin + progressHeight;
        frameLayout.setLayoutParams(bVar);
    }

    private final void updateProgressContainerPadding(int topPadding) {
        this.progressContainer.setPadding(0, topPadding, 0, 0);
    }

    public final void bind(@NotNull DeliveryWidgetV4VO item, boolean isFirstBind) {
        Function1<? super t, Unit> function1;
        Intrinsics.checkNotNullParameter(item, "item");
        bindContentBlocks(item.getDeliveryConditionsBlocks(), item.getAction());
        bindSpacers(item.getSpacers());
        bindChevron(item.getChevron());
        setOnClickListener(new BP.a(5, this, item));
        this.contentContainer.setOnClickListener(new c(5, this, item));
        this.containerView.setOnClickListener(new ViewOnClickListenerC2667a(2, this, item));
        bindProgress(item.getProgress(), isFirstBind);
        bindBorder(item.getBorderColor(), item.getBackgroundColor());
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent == null || (function1 = this.onView) == null) {
            return;
        }
        function1.invoke(tokenizedEvent);
    }

    public final void setActionHandlers(@NotNull Function1<? super t, Unit> onView, @NotNull Function1<? super AtomAction, Unit> onClick) {
        Intrinsics.checkNotNullParameter(onView, "onView");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.onView = onView;
        this.onClick = onClick;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryWidgetV4View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.defaultBottomPadding = containerBottomPadding;
        this.animationHelper = k.b(new DeliveryWidgetV4View$animationHelper$2(this));
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(View.generateViewId());
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(constraintLayout);
        this.containerView = constraintLayout;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R$id.contentContainer);
        linearLayout.setOrientation(0);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41605L = 1;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41598E = 0.5f;
        linearLayout.setLayoutParams(bVar);
        constraintLayout.addView(linearLayout);
        this.contentContainer = linearLayout;
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.chevronView);
        int i12 = iconsSize;
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(i12, i12);
        bVar2.f41636i = linearLayout.getId();
        bVar2.f41642l = linearLayout.getId();
        bVar2.f41658v = 0;
        imageView.setLayoutParams(bVar2);
        constraintLayout.addView(imageView);
        this.chevronView = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R$id.progressContainer);
        frameLayout.setClipChildren(true);
        frameLayout.setClipToPadding(true);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, 0);
        bVar3.f41638j = linearLayout.getId();
        bVar3.f41656t = 0;
        bVar3.f41658v = 0;
        bVar3.f41642l = 0;
        frameLayout.setLayoutParams(bVar3);
        constraintLayout.addView(frameLayout);
        this.progressContainer = frameLayout;
        View view = new View(context);
        view.setId(R$id.progressBackgroundView);
        int i13 = progressHeight;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i13);
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        frameLayout.addView(view);
        this.progressBackgroundView = view;
        View view2 = new View(context);
        view2.setId(R$id.progressView);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, i13);
        layoutParams2.gravity = 8388659;
        layoutParams2.topMargin = 0;
        view2.setLayoutParams(layoutParams2);
        frameLayout.addView(view2);
        this.progressView = view2;
        this.progressDrawable = k.b(DeliveryWidgetV4View$progressDrawable$2.INSTANCE);
        this.progressLineDrawable = k.b(new DeliveryWidgetV4View$progressLineDrawable$2(context));
        this.horizontalSpacer = ResourceExtKt.toPx(Paddings.PADDING_300.getPx());
        this.currentProgressState = ProgressState.Hidden.INSTANCE;
        setClipChildren(false);
        setClipToPadding(false);
    }
}

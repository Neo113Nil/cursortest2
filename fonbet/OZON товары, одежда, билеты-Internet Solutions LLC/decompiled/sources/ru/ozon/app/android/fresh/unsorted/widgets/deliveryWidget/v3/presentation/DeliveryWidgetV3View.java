package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation;

import Ar.c;
import B3.D;
import DN.b;
import FM.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3View;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0001\u0018\u0000 \u0083\u00012\u00020\u0001:\u0002\u0083\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0016\u001a\u00020\n2\u0016\u0010\u0013\u001a\u0012\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\u0004\u0012\u00020\n0\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J'\u0010(\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010&H\u0002¢\u0006\u0004\b(\u0010)J7\u0010-\u001a\u00020\n2\u0006\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020\u00062\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010&H\u0002¢\u0006\u0004\b-\u0010.J'\u0010/\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010&H\u0002¢\u0006\u0004\b/\u0010)J-\u0010\u001a\u001a\u00020\n*\u0002002\b\u0010%\u001a\u0004\u0018\u00010$2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010&H\u0002¢\u0006\u0004\b\u001a\u00101J'\u00104\u001a\u00020\n2\u0006\u00103\u001a\u0002022\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010&H\u0002¢\u0006\u0004\b4\u00105J7\u0010:\u001a\u00020\n2\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u001c2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010&2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J/\u0010?\u001a\u00020\n2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u0006H\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010C\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u0006H\u0002¢\u0006\u0004\bC\u0010DJ\u0019\u0010F\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bF\u0010\u001fJ#\u0010I\u001a\u00020\n2\b\u0010G\u001a\u0004\u0018\u00010\u001c2\b\u0010H\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\n2\u0006\u0010K\u001a\u000208H\u0002¢\u0006\u0004\bL\u0010MJ'\u0010S\u001a\u00020\n2\u0006\u0010O\u001a\u00020N2\u0006\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020\u0006H\u0002¢\u0006\u0004\bS\u0010TJ\u0013\u0010V\u001a\u00020\n*\u00020UH\u0002¢\u0006\u0004\bV\u0010WR\"\u0010X\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\u000b\u0010\u000fR\u0014\u0010\\\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010YR\u0014\u0010]\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010YR\u0014\u0010^\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010YR\u0014\u0010_\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010YR\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010c\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010h\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010dR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010kR\u0014\u0010m\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010gR\u0014\u0010n\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010gR\u001b\u0010t\u001a\u00020o8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u001b\u0010w\u001a\u00020o8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010q\u001a\u0004\bv\u0010sR\u001b\u0010z\u001a\u00020o8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010q\u001a\u0004\by\u0010sR(\u0010\u0013\u001a\u0014\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\u0004\u0012\u00020\n\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010{R$\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010{R\u0016\u0010|\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0016\u0010~\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0080\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u007fR\u0018\u0010\u0081\u0001\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010}R\u0018\u0010\u0082\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010Y¨\u0006\u0084\u0001"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3View;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "setDefaultBottomPadding", "()V", "bottomPadding", "setBottomPadding", "(I)V", "Lkotlin/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "onView", "Lru/ozon/uni/atoms/af/AtomAction;", "onClick", "setActionHandlers", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3VO;", "item", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3VO;)V", "", "newTimeText", "updateTimerTime", "(Ljava/lang/String;)V", "", "percent", "setTimerProgress", "(F)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lkotlin/Function0;", "onClickCallback", "bindSingleText", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lkotlin/jvm/functions/Function0;)V", "priceText", "deliveryText", "eclipseMargin", "bindTextChain", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ILkotlin/jvm/functions/Function0;)V", "bindTimer", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Lru/ozon/uni/atoms/data/text/TextDTO;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "icon", "bindDeliveryIcon", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lkotlin/jvm/functions/Function0;)V", "progressValue", "gradient", "", "shouldHide", "bindProgress", "(ILjava/lang/String;Lkotlin/jvm/functions/Function0;Z)V", "topPadding", "horizontalPadding", "betweenPadding", "bindSpacers", "(IIII)V", "eclipsePadding", "deliveryInfoPadding", "bindContentSpacers", "(II)V", "eclipseColor", "bindEclipseColor", "borderColor", "backgroundColor", "bindBorder", "(Ljava/lang/String;Ljava/lang/String;)V", "shouldShow", "animateProgressVisibility", "(Z)V", "Landroidx/constraintlayout/widget/d;", "constraintSet", "Landroid/transition/AutoTransition;", "transition", "visibility", "setAnimation", "(Landroidx/constraintlayout/widget/d;Landroid/transition/AutoTransition;I)V", "Landroidx/constraintlayout/widget/ConstraintLayout$b;", "progressConstraints", "(Landroidx/constraintlayout/widget/ConstraintLayout$b;)V", "defaultBottomPadding", "I", "getDefaultBottomPadding", "()I", "progressLineViewId", "trailingIconId", "eclipseViewId", "secondTextViewId", "Landroidx/constraintlayout/widget/ConstraintLayout;", "containerView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "firstTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Landroid/view/View;", "eclipseView", "Landroid/view/View;", "secondTextView", "Landroid/widget/ImageView;", "timerIconView", "Landroid/widget/ImageView;", "trailingIconView", "progressView", "progressLineView", "Landroid/graphics/drawable/GradientDrawable;", "progressDrawable$delegate", "LSc/j;", "getProgressDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "progressDrawable", "progressLineDrawable$delegate", "getProgressLineDrawable", "progressLineDrawable", "eclipseDrawable$delegate", "getEclipseDrawable", "eclipseDrawable", "Lkotlin/jvm/functions/Function1;", "isTimerMode", "Z", "progressColor", "Ljava/lang/String;", "startColor", "deliveryInfoStyleApplied", "lastProgressValue", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryWidgetV3View extends FrameLayout {

    @NotNull
    private static final float[] cornerRadiiDefault;

    @NotNull
    private static final OzonSpannableString defaultTime;

    @NotNull
    private final ConstraintLayout containerView;
    private int defaultBottomPadding;
    private boolean deliveryInfoStyleApplied;

    /* renamed from: eclipseDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j eclipseDrawable;

    @NotNull
    private final View eclipseView;
    private final int eclipseViewId;

    @NotNull
    private final TextAtomV2View firstTextView;
    private boolean isTimerMode;
    private int lastProgressValue;
    private Function1<? super AtomAction, Unit> onClick;
    private Function1<? super t, Unit> onView;

    @NotNull
    private String progressColor;

    /* renamed from: progressDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j progressDrawable;

    /* renamed from: progressLineDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j progressLineDrawable;

    @NotNull
    private final View progressLineView;
    private final int progressLineViewId;

    @NotNull
    private final View progressView;

    @NotNull
    private final TextAtomV2View secondTextView;
    private final int secondTextViewId;

    @NotNull
    private String startColor;

    @NotNull
    private final ImageView timerIconView;
    private final int trailingIconId;

    @NotNull
    private final ImageView trailingIconView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int defaultBackgroundColor = UniColors.LAYER_FLOOR_1.getResId();
    private static final int defaultStrokeColor = UniColors.GRAPHIC_STROKE_STICKY.getResId();
    private static final int defaultEclipseColor = UniColors.GRAPHIC_NEUTRAL.getResId();
    private static final int defaultDeliveryIconColor = UniColors.GRAPHIC_TERTIARY.getResId();
    private static final int defaultProgressLineColor = UniColors.BG_OVERLAP.getResId();
    private static final int progressHeight = ResourceExtKt.toPx(4);
    private static final int strokeWidth = ResourceExtKt.toPx(1);
    private static final float progressRadius = ResourceExtKt.toPxF(100);
    private static final int deliveryInfoSize = ResourceExtKt.toPx(12);
    private static final int timerIconSize = ResourceExtKt.toPx(16);
    private static final int eclipseSize = ResourceExtKt.toPx(4);
    private static final float mainRadius = ResourceExtKt.toPxF(24);
    private static final float zeroRadius = ResourceExtKt.toPxF(0);
    private static final int containerTopPadding = ResourceExtKt.toPx(12);
    private static final int containerBottomPadding = ResourceExtKt.toPx(4);
    private static final int containerHorizontalPadding = ResourceExtKt.toPx(8);
    private static final int progressTopMargin = ResourceExtKt.toPx(10);
    private static final int deliveryInfoIconTopMargin = ResourceExtKt.toPx(1);
    private static final int deliveryInfoIconLeftMargin = ResourceExtKt.toPx(2);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3View$Companion;", "", "<init>", "()V", "", "defaultEclipseColor", "I", "getDefaultEclipseColor", "()I", "defaultProgressLineColor", "getDefaultProgressLineColor", "", "progressRadius", "F", "getProgressRadius", "()F", "FULL_PROGRESS", "", "FIFTY_PERCENT_GRADIENT", "Ljava/lang/String;", "TWENTY_PERCENT_GRADIENT", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDefaultEclipseColor() {
            return DeliveryWidgetV3View.defaultEclipseColor;
        }

        public final int getDefaultProgressLineColor() {
            return DeliveryWidgetV3View.defaultProgressLineColor;
        }

        public final float getProgressRadius() {
            return DeliveryWidgetV3View.progressRadius;
        }

        private Companion() {
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
        defaultTime = new OzonSpannableString("00:00");
    }

    public /* synthetic */ DeliveryWidgetV3View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void animateProgressVisibility(boolean shouldShow) {
        if (this.isTimerMode) {
            this.progressLineView.setVisibility(shouldShow ? 0 : 8);
            View view = this.progressView;
            view.setVisibility(shouldShow && view.getWidth() > 0 ? 0 : 8);
        } else {
            d dVar = new d();
            dVar.p(this.containerView);
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(350L);
            setAnimation(dVar, autoTransition, shouldShow ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$23$lambda$21(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$23$lambda$22(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$27(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
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

    private final void bindContentSpacers(int eclipsePadding, int deliveryInfoPadding) {
        View view = this.eclipseView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = eclipsePadding;
        marginLayoutParams.rightMargin = eclipsePadding;
        view.setLayoutParams(marginLayoutParams);
        ImageView imageView = this.trailingIconView;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.leftMargin = deliveryInfoPadding;
        imageView.setLayoutParams(marginLayoutParams2);
    }

    private final void bindDeliveryIcon(CommonAtomIconDTO icon, Function0<Unit> onClick) {
        ImageView imageView = this.trailingIconView;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        imageView.setImageDrawable(ContextExtKt.loadIconByString(context, icon.getIcon()));
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        String tintColor = icon.getTintColor();
        int i11 = defaultDeliveryIconColor;
        ThemeExtKt.tint(imageView, Integer.valueOf(styleParser.parseColor(context2, tintColor, i11)));
        imageView.setOnClickListener(new c(onClick, 9));
        ImageView imageView2 = this.timerIconView;
        Context context3 = imageView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        imageView2.setImageDrawable(ContextExtKt.loadIconByString(context3, icon.getIcon()));
        Context context4 = imageView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        ThemeExtKt.tint(imageView2, Integer.valueOf(styleParser.parseColor(context4, icon.getTintColor(), i11)));
        imageView2.setOnClickListener(new Ar.d(onClick, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindDeliveryIcon$lambda$29$lambda$28(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindDeliveryIcon$lambda$31$lambda$30(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void bindEclipseColor(String eclipseColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, eclipseColor, defaultEclipseColor);
        getEclipseDrawable().setColors(new int[]{parseColor, parseColor});
        this.eclipseView.setBackground(getEclipseDrawable());
    }

    private final void bindProgress(final int progressValue, String gradient, Function0<Unit> onClick, boolean shouldHide) {
        Color.Gradient gradient2;
        if (this.isTimerMode) {
            animateProgressVisibility(true);
            this.progressLineView.setBackground(getProgressLineDrawable());
            return;
        }
        this.lastProgressValue = progressValue;
        animateProgressVisibility(!shouldHide);
        this.progressLineView.setBackground(getProgressLineDrawable());
        final View view = this.progressView;
        if (progressValue == 0 || shouldHide) {
            view.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = 0;
            view.setLayoutParams(layoutParams);
            return;
        }
        UniGradient gradientByToken = TokensExtKt.getGradientByToken(gradient);
        if (gradientByToken != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            gradient2 = TokensExtKt.toGradient(gradientByToken, context);
        } else {
            gradient2 = null;
        }
        getProgressDrawable().setColors(gradient2 != null ? gradient2.getColors() : null);
        view.setBackground(getProgressDrawable());
        view.setOnClickListener(new a(onClick, 12));
        View view2 = this.progressLineView;
        if (!view2.isLaidOut() || view2.isLayoutRequested()) {
            view2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3View$bindProgress$lambda$36$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view3, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    int measuredWidth;
                    view3.removeOnLayoutChangeListener(this);
                    int i11 = DeliveryWidgetV3View.this.lastProgressValue;
                    int i12 = progressValue;
                    if (i11 == i12) {
                        if (i12 == 100) {
                            measuredWidth = DeliveryWidgetV3View.this.progressLineView.getMeasuredWidth();
                        } else {
                            measuredWidth = progressValue * (DeliveryWidgetV3View.this.progressLineView.getMeasuredWidth() / 100);
                        }
                        View view4 = view;
                        ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                        if (layoutParams2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams2.width = measuredWidth;
                        view4.setLayoutParams(layoutParams2);
                        view.setVisibility(0);
                    }
                }
            });
            return;
        }
        if (this.lastProgressValue == progressValue) {
            int measuredWidth = progressValue == 100 ? this.progressLineView.getMeasuredWidth() : progressValue * (this.progressLineView.getMeasuredWidth() / 100);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = measuredWidth;
            view.setLayoutParams(layoutParams2);
            view.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindProgress$lambda$36$lambda$33(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void bindSingleText(TextDTO text, Function0<Unit> onClickCallback) {
        this.timerIconView.setVisibility(8);
        this.firstTextView.setVisibility(8);
        this.eclipseView.setVisibility(8);
        this.trailingIconView.setVisibility(0);
        ConstraintLayoutExtKt.updateConstraints(this.containerView, new DeliveryWidgetV3View$bindSingleText$1(this));
        bind(this.secondTextView, text, onClickCallback);
    }

    private final void bindSpacers(int topPadding, int bottomPadding, int horizontalPadding, int betweenPadding) {
        View view = this.progressView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = betweenPadding;
        view.setLayoutParams(marginLayoutParams);
        View view2 = this.progressLineView;
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.topMargin = betweenPadding;
        view2.setLayoutParams(marginLayoutParams2);
        this.defaultBottomPadding = bottomPadding;
        setPadding(horizontalPadding, topPadding, horizontalPadding, bottomPadding);
    }

    private final void bindTextChain(TextDTO priceText, TextDTO deliveryText, int eclipseMargin, Function0<Unit> onClickCallback) {
        this.timerIconView.setVisibility(8);
        this.firstTextView.setVisibility(0);
        this.eclipseView.setVisibility(0);
        ConstraintLayoutExtKt.updateConstraints(this.containerView, new DeliveryWidgetV3View$bindTextChain$1(this, eclipseMargin));
        bind(this.firstTextView, priceText, onClickCallback);
        bind(this.secondTextView, deliveryText, onClickCallback);
    }

    private final void bindTimer(TextDTO text, Function0<Unit> onClick) {
        this.firstTextView.setVisibility(8);
        this.trailingIconView.setVisibility(8);
        this.eclipseView.setVisibility(8);
        this.timerIconView.setVisibility(0);
        ConstraintLayoutExtKt.updateConstraints(this.containerView, new DeliveryWidgetV3View$bindTimer$1(this));
        bind(this.secondTextView, TextDTO.copy$default(text, defaultTime, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), onClick);
        this.secondTextView.setTypeface(null, 1);
        setOnClickListener(null);
    }

    private final GradientDrawable getEclipseDrawable() {
        return (GradientDrawable) this.eclipseDrawable.getValue();
    }

    private final GradientDrawable getProgressDrawable() {
        return (GradientDrawable) this.progressDrawable.getValue();
    }

    private final GradientDrawable getProgressLineDrawable() {
        return (GradientDrawable) this.progressLineDrawable.getValue();
    }

    private final void progressConstraints(ConstraintLayout.b bVar) {
        bVar.f41638j = this.secondTextView.getId();
        bVar.f41642l = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41598E = 0.0f;
        bVar.f41599F = 0.0f;
        bVar.setMargins(((ViewGroup.MarginLayoutParams) bVar).leftMargin, progressTopMargin, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin);
    }

    private final void setAnimation(d constraintSet, AutoTransition transition, int visibility) {
        for (View view : C7714v.b0(this.progressLineView, this.progressView)) {
            constraintSet.h0(view.getId(), visibility);
            if (visibility == 0) {
                view.setAlpha(1.0f);
                view.setTranslationY(0.0f);
            }
        }
        TransitionManager.beginDelayedTransition(this.containerView, transition);
        constraintSet.f(this.containerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTimerProgress$lambda$26(DeliveryWidgetV3View deliveryWidgetV3View, float f7) {
        int[] iArr;
        int e11 = h.e((int) ((deliveryWidgetV3View.progressLineView.getMeasuredWidth() * f7) / 100.0f), 0, deliveryWidgetV3View.progressLineView.getMeasuredWidth());
        View view = deliveryWidgetV3View.progressView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = e11;
        view.setLayoutParams(layoutParams);
        deliveryWidgetV3View.progressView.setVisibility(e11 > 0 ? 0 : 8);
        View view2 = deliveryWidgetV3View.progressView;
        GradientDrawable progressDrawable = deliveryWidgetV3View.getProgressDrawable();
        if (TokensExtKt.getGradientByToken(deliveryWidgetV3View.progressColor) != null) {
            UniGradient gradientByToken = TokensExtKt.getGradientByToken(deliveryWidgetV3View.progressColor);
            if (gradientByToken != null) {
                Context context = deliveryWidgetV3View.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Color.Gradient gradient = TokensExtKt.toGradient(gradientByToken, context);
                if (gradient != null) {
                    iArr = gradient.getColors();
                }
            }
            iArr = null;
        } else {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context2 = deliveryWidgetV3View.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int parseColor = styleParser.parseColor(context2, deliveryWidgetV3View.progressColor, defaultProgressLineColor);
            iArr = new int[]{parseColor, parseColor};
        }
        progressDrawable.setColors(iArr);
        view2.setBackground(progressDrawable);
    }

    public final void bind(@NotNull DeliveryWidgetV3VO item) {
        Function1<? super t, Unit> function1;
        Intrinsics.checkNotNullParameter(item, "item");
        this.isTimerMode = item.getTimerDeadline() != null;
        this.startColor = item.getProgressGradient();
        DeliveryWidgetV3View$bind$1$onClickCallback$1 deliveryWidgetV3View$bind$1$onClickCallback$1 = this.isTimerMode ? null : new DeliveryWidgetV3View$bind$1$onClickCallback$1(this, item);
        bindDeliveryIcon(item.getDeliveryInfoIcon(), deliveryWidgetV3View$bind$1$onClickCallback$1);
        bindProgress(item.getProgress(), this.startColor, deliveryWidgetV3View$bind$1$onClickCallback$1, item.getShouldHideProgressBar());
        bindSpacers(item.getTopPadding(), item.getBottomPadding(), item.getHorizontalPadding(), item.getBetweenPadding());
        bindContentSpacers(item.getEclipsePadding(), item.getDeliveryInfoPadding());
        bindEclipseColor(item.getEclipseColor());
        bindBorder(item.getBorderColor(), item.getBackgroundColor());
        if (this.isTimerMode && !this.deliveryInfoStyleApplied && item.getDeliveryText() != null) {
            this.deliveryInfoStyleApplied = true;
            bindTimer(item.getDeliveryText(), deliveryWidgetV3View$bind$1$onClickCallback$1);
            setOnClickListener(new CT.a(deliveryWidgetV3View$bind$1$onClickCallback$1, 1));
        } else if (!this.isTimerMode) {
            this.deliveryInfoStyleApplied = false;
            if (item.getDeliveryText() == null) {
                bindSingleText(item.getPriceText(), deliveryWidgetV3View$bind$1$onClickCallback$1);
            } else {
                bindTextChain(item.getPriceText(), item.getDeliveryText(), item.getEclipsePadding(), deliveryWidgetV3View$bind$1$onClickCallback$1);
            }
            setOnClickListener(new b(deliveryWidgetV3View$bind$1$onClickCallback$1, 14));
        }
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent == null || (function1 = this.onView) == null) {
            return;
        }
        function1.invoke(tokenizedEvent);
    }

    public final int getDefaultBottomPadding() {
        return this.defaultBottomPadding;
    }

    public final void setActionHandlers(@NotNull Function1<? super t, Unit> onView, @NotNull Function1<? super AtomAction, Unit> onClick) {
        Intrinsics.checkNotNullParameter(onView, "onView");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.onView = onView;
        this.onClick = onClick;
    }

    public final void setBottomPadding(int bottomPadding) {
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), bottomPadding);
    }

    public final void setDefaultBottomPadding() {
        int paddingBottom = getPaddingBottom();
        int i11 = this.defaultBottomPadding;
        if (paddingBottom != i11) {
            setBottomPadding(i11);
        }
    }

    public final void setTimerProgress(final float percent) {
        if (this.isTimerMode) {
            this.progressColor = percent <= 20.0f ? "graphicNegativeOnDark" : percent <= 50.0f ? "grHighDemandDelivery" : this.startColor;
            this.progressLineView.setVisibility(0);
            this.progressLineView.post(new Runnable() { // from class: jx.b
                @Override // java.lang.Runnable
                public final void run() {
                    DeliveryWidgetV3View.setTimerProgress$lambda$26(DeliveryWidgetV3View.this, percent);
                }
            });
        }
    }

    public final void updateTimerTime(@NotNull String newTimeText) {
        Intrinsics.checkNotNullParameter(newTimeText, "newTimeText");
        this.secondTextView.setText(newTimeText);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryWidgetV3View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int i12 = containerBottomPadding;
        this.defaultBottomPadding = i12;
        int generateViewId = View.generateViewId();
        this.progressLineViewId = generateViewId;
        int generateViewId2 = View.generateViewId();
        this.trailingIconId = generateViewId2;
        int generateViewId3 = View.generateViewId();
        this.eclipseViewId = generateViewId3;
        int generateViewId4 = View.generateViewId();
        this.secondTextViewId = generateViewId4;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(View.generateViewId());
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(constraintLayout);
        this.containerView = constraintLayout;
        int i13 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, i13, defaultConstructorMarker);
        ConstraintLayout.b b11 = Fj.c.b(0, -2, textAtomV2View);
        b11.f41605L = 1;
        textAtomV2View.setLayoutParams(b11);
        constraintLayout.addView(textAtomV2View);
        this.firstTextView = textAtomV2View;
        View view = new View(context);
        view.setId(generateViewId3);
        int i14 = eclipseSize;
        view.setLayoutParams(new ConstraintLayout.b(i14, i14));
        constraintLayout.addView(view);
        this.eclipseView = view;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, i13, defaultConstructorMarker);
        ConstraintLayout.b d11 = Bi.b.d(textAtomV2View2, generateViewId4, 0, -2);
        d11.f41605L = 1;
        d11.f41636i = 0;
        d11.f41657u = generateViewId2;
        d11.f41640k = generateViewId;
        textAtomV2View2.setLayoutParams(d11);
        constraintLayout.addView(textAtomV2View2);
        this.secondTextView = textAtomV2View2;
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        int i15 = timerIconSize;
        ConstraintLayout.b bVar = new ConstraintLayout.b(i15, i15);
        bVar.f41636i = textAtomV2View2.getId();
        bVar.f41642l = textAtomV2View2.getId();
        bVar.f41656t = 0;
        bVar.f41657u = textAtomV2View2.getId();
        bVar.f41603J = 2;
        bVar.setMarginEnd(i14);
        imageView.setLayoutParams(bVar);
        constraintLayout.addView(imageView);
        this.timerIconView = imageView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(generateViewId2);
        int i16 = deliveryInfoSize;
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(i16, i16);
        bVar2.f41636i = textAtomV2View2.getId();
        bVar2.f41642l = textAtomV2View2.getId();
        bVar2.f41655s = textAtomV2View2.getId();
        bVar2.f41658v = 0;
        bVar2.f41599F = 0.0f;
        bVar2.setMargins(deliveryInfoIconLeftMargin, deliveryInfoIconTopMargin, ((ViewGroup.MarginLayoutParams) bVar2).rightMargin, ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin);
        imageView2.setLayoutParams(bVar2);
        constraintLayout.addView(imageView2);
        this.trailingIconView = imageView2;
        View view2 = new View(context);
        view2.setId(View.generateViewId());
        view2.setVisibility(4);
        int i17 = progressHeight;
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, i17);
        progressConstraints(bVar3);
        view2.setLayoutParams(bVar3);
        constraintLayout.addView(view2);
        this.progressView = view2;
        View view3 = new View(context);
        view3.setId(generateViewId);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(0, i17);
        progressConstraints(bVar4);
        view3.setLayoutParams(bVar4);
        constraintLayout.addView(view3);
        this.progressLineView = view3;
        this.progressDrawable = k.b(DeliveryWidgetV3View$progressDrawable$2.INSTANCE);
        this.progressLineDrawable = k.b(new DeliveryWidgetV3View$progressLineDrawable$2(context));
        this.eclipseDrawable = k.b(new DeliveryWidgetV3View$eclipseDrawable$2(context));
        this.progressColor = "";
        this.startColor = "";
        this.lastProgressValue = -1;
        setClipChildren(false);
        setClipToPadding(false);
        int i18 = containerHorizontalPadding;
        setPadding(i18, containerTopPadding, i18, i12);
    }

    private final void bind(TextAtomV2View textAtomV2View, TextDTO textDTO, Function0<Unit> function0) {
        TextHolderKt.bindOrGone$default(textAtomV2View, textDTO, null, 2, null);
        TextViewExtKt.setTextCopyable(textAtomV2View, false);
        textAtomV2View.setOnClickListener(new Ar.b(function0, 6));
    }
}

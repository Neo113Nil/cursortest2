package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.badge;

import Am.C2438a;
import Sc.o;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import fd.InterfaceC6511n;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListBackground;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.badge.StaticCouponListTimerFormatter;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.view.StaticCouponListGradientDrawable;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.timerFlow.TimerFlow;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 U2\u00020\u0001:\u0001UB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010#\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0013H\u0014¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001f\u0010-\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\b2\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\b2\u0006\u00107\u001a\u00020\u000b¢\u0006\u0004\b8\u0010\u000eJ\u0015\u00109\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b9\u0010\nJ\u0015\u0010:\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b:\u0010\nJ\u0015\u0010-\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b-\u0010\nJ-\u0010?\u001a\u00020\b2\u001e\u0010>\u001a\u001a\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\b0;¢\u0006\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010E\u001a\u0004\bN\u0010OR0\u0010Q\u001a\u001c\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\b\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010SR\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010T¨\u0006V"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListBadgeView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text$Timer;", "timerItem", "", "bindCountdown", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text$Timer;)V", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text$Static;", "text", "bindStatic", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text$Static;)V", "addViews", "()V", "Landroid/view/View;", "child", "", "computeTop", "(Landroid/view/View;)I", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/view/StaticCouponListGradientDrawable;", "createBackgroundDrawable", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/view/StaticCouponListGradientDrawable;", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge;", "item", "bind", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge;)V", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListTimerFormatter$Time;", "formatedTime", "Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerProgress;", "timerProgress", "bindTimer", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListTimerFormatter$Time;Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerProgress;)V", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "leftIcon", "bindLiftIcon", "(Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;", "bgColor", "bindBgColor", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;)V", "staticText", "bindStaticText", "bindTimerText", "bindTimerStyle", "Lkotlin/Function3;", "", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListTimerFormatter;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnStartTimerListener", "(Lfd/n;)V", "dp4", "I", "Lru/ozon/uni/android/atom/icon/IconView;", "iconView$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getIconView", "()Lru/ozon/uni/android/atom/icon/IconView;", "iconView", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListTimerView;", "timerView", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListTimerView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textView$delegate", "getTextView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textView", "startTimerListener", "Lfd/n;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text$Timer;", "Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerProgress;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListBadgeView extends ViewGroup {
    private final int dp4;

    /* renamed from: iconView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate iconView;
    private InterfaceC6511n<? super Long, ? super Long, ? super StaticCouponListTimerFormatter, Unit> startTimerListener;

    /* renamed from: textView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate textView;
    private StaticCouponListVO.ContentItem.Badge.Text.Timer timerItem;
    private TimerFlow.TimerProgress timerProgress;

    @NotNull
    private final StaticCouponListTimerView timerView;
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(StaticCouponListBadgeView.class, "iconView", "getIconView()Lru/ozon/uni/android/atom/icon/IconView;", 0), C2438a.c(StaticCouponListBadgeView.class, "textView", "getTextView()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListBadgeView$Companion;", "", "<init>", "()V", "RU", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            int[] iArr = new int[TimerFlow.TimerProgress.values().length];
            try {
                iArr[TimerFlow.TimerProgress.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimerFlow.TimerProgress.DURING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimerFlow.TimerProgress.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticCouponListBadgeView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = ResourceExtKt.toPx(4, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.iconView = new PreCreationViewPoolDelegate(context2, N.b(IconView.class), new StaticCouponListBadgeView$special$$inlined$preCreationViewPool$default$1(this), new StaticCouponListBadgeView$special$$inlined$preCreationViewPool$default$2());
        StaticCouponListTimerView staticCouponListTimerView = new StaticCouponListTimerView(context);
        staticCouponListTimerView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.timerView = staticCouponListTimerView;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.textView = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new StaticCouponListBadgeView$special$$inlined$preCreationViewPool$default$3(this), new StaticCouponListBadgeView$special$$inlined$preCreationViewPool$default$4());
        addViews();
    }

    private final void addViews() {
        addView(getIconView());
        addView(this.timerView);
        addView(getTextView());
    }

    private final void bindCountdown(StaticCouponListVO.ContentItem.Badge.Text.Timer timerItem) {
        this.timerItem = timerItem;
        StaticCouponListTimerView staticCouponListTimerView = this.timerView;
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseTextStyle = styleParser.parseTextStyle(timerItem.getTimerStyleToken());
        int intValue = parseTextStyle != null ? parseTextStyle.intValue() : UniTextStyles.BODY_NUMERIC_400_SMALL.getResId();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        staticCouponListTimerView.setStyle(intValue, styleParser.parseColor(context, timerItem.getTimerColorToken(), UniColors.TEXT_LIGHT_KEY.getResId()));
        bindTimer(timerItem);
    }

    private final void bindStatic(StaticCouponListVO.ContentItem.Badge.Text.Static text) {
        ViewExtKt.gone(this.timerView);
        TextHolderKt.bindOrGone$default(getTextView(), text.getStaticText(), null, 2, null);
    }

    private final int computeTop(View child) {
        return (getMeasuredHeight() - child.getMeasuredHeight()) / 2;
    }

    private final StaticCouponListGradientDrawable createBackgroundDrawable() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new StaticCouponListGradientDrawable(context);
    }

    private final IconView getIconView() {
        return (IconView) this.iconView.getValue(this, $$delegatedProperties[0]);
    }

    private final TextAtomV2View getTextView() {
        return (TextAtomV2View) this.textView.getValue(this, $$delegatedProperties[1]);
    }

    public final void bind(@NotNull StaticCouponListVO.ContentItem.Badge item) {
        Intrinsics.checkNotNullParameter(item, "item");
        IconHolderKt.bindOrGone$default(getIconView(), item.getLeftIcon(), null, 2, null);
        bindBgColor(item.getBgColor());
        StaticCouponListVO.ContentItem.Badge.Text text = item.getText();
        if (text instanceof StaticCouponListVO.ContentItem.Badge.Text.Static) {
            bindStatic((StaticCouponListVO.ContentItem.Badge.Text.Static) item.getText());
        } else {
            if (!(text instanceof StaticCouponListVO.ContentItem.Badge.Text.Timer)) {
                throw new o();
            }
            bindCountdown((StaticCouponListVO.ContentItem.Badge.Text.Timer) item.getText());
        }
    }

    public final void bindBgColor(StaticCouponListBackground bgColor) {
        if (bgColor == null) {
            setBackground(null);
            return;
        }
        Drawable background = getBackground();
        StaticCouponListGradientDrawable staticCouponListGradientDrawable = background instanceof StaticCouponListGradientDrawable ? (StaticCouponListGradientDrawable) background : null;
        if (staticCouponListGradientDrawable == null) {
            staticCouponListGradientDrawable = createBackgroundDrawable();
            setBackground(staticCouponListGradientDrawable);
        }
        staticCouponListGradientDrawable.bind(bgColor);
    }

    public final void bindLiftIcon(IconDTO leftIcon) {
        IconHolderKt.bindOrGone$default(getIconView(), leftIcon, null, 2, null);
    }

    public final void bindStaticText(@NotNull StaticCouponListVO.ContentItem.Badge.Text.Static staticText) {
        Intrinsics.checkNotNullParameter(staticText, "staticText");
        bindStatic(staticText);
    }

    public final void bindTimer(StaticCouponListTimerFormatter.Time formatedTime, @NotNull TimerFlow.TimerProgress timerProgress) {
        TextDTO preSaleText;
        Intrinsics.checkNotNullParameter(timerProgress, "timerProgress");
        this.timerView.bindOrGone(formatedTime);
        if (this.timerProgress != timerProgress) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[timerProgress.ordinal()];
            if (i11 == 1) {
                StaticCouponListVO.ContentItem.Badge.Text.Timer timer = this.timerItem;
                if (timer != null) {
                    preSaleText = timer.getPreSaleText();
                }
                preSaleText = null;
            } else if (i11 == 2) {
                StaticCouponListVO.ContentItem.Badge.Text.Timer timer2 = this.timerItem;
                if (timer2 != null) {
                    preSaleText = timer2.getSaleActiveText();
                }
                preSaleText = null;
            } else {
                if (i11 != 3) {
                    throw new o();
                }
                StaticCouponListVO.ContentItem.Badge.Text.Timer timer3 = this.timerItem;
                if (timer3 != null) {
                    preSaleText = timer3.getPostSaleText();
                }
                preSaleText = null;
            }
            TextHolderKt.bindOrGone$default(getTextView(), preSaleText, null, 2, null);
            this.timerProgress = timerProgress;
        }
    }

    public final void bindTimerStyle(@NotNull StaticCouponListVO.ContentItem.Badge.Text.Timer timerItem) {
        Intrinsics.checkNotNullParameter(timerItem, "timerItem");
        StaticCouponListTimerView staticCouponListTimerView = this.timerView;
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseTextStyle = styleParser.parseTextStyle(timerItem.getTimerStyleToken());
        int intValue = parseTextStyle != null ? parseTextStyle.intValue() : UniTextStyles.BODY_NUMERIC_400_SMALL.getResId();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        staticCouponListTimerView.setStyle(intValue, styleParser.parseColor(context, timerItem.getTimerColorToken(), UniColors.TEXT_LIGHT_KEY.getResId()));
    }

    public final void bindTimerText(@NotNull StaticCouponListVO.ContentItem.Badge.Text.Timer timerItem) {
        Intrinsics.checkNotNullParameter(timerItem, "timerItem");
        this.timerItem = timerItem;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int i11 = getIconView().getVisibility() == 0 ? this.dp4 : 0;
        LayoutExtKt.layoutLeftTop(getIconView(), getPaddingLeft(), computeTop(getIconView()));
        LayoutExtKt.layoutLeftTop(this.timerView, getIconView().getMeasuredWidth() + getPaddingLeft() + i11, computeTop(this.timerView));
        LayoutExtKt.layoutRightTop(getTextView(), getMeasuredWidth() - getPaddingRight(), computeTop(getTextView()));
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                i12++;
                measureChild(childAt, widthMeasureSpec, heightMeasureSpec);
                int measuredWidth = childAt.getMeasuredWidth() + i11;
                i13 = Math.max(i13, childAt.getMeasuredHeight());
                i11 = measuredWidth;
            }
        }
        setMeasuredDimension(View.resolveSize(((i12 - 1) * this.dp4) + getPaddingRight() + getPaddingLeft() + i11, widthMeasureSpec), View.resolveSize(getPaddingBottom() + getPaddingTop() + i13, heightMeasureSpec));
    }

    public final void setOnStartTimerListener(@NotNull InterfaceC6511n<? super Long, ? super Long, ? super StaticCouponListTimerFormatter, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.startTimerListener = listener;
    }

    public final void bindTimer(@NotNull StaticCouponListVO.ContentItem.Badge.Text.Timer timerItem) {
        Intrinsics.checkNotNullParameter(timerItem, "timerItem");
        if (timerItem.getStartSaleTimestamp() == null || timerItem.getEndSaleTimestamp() == null) {
            return;
        }
        StaticCouponListTimerFormatter staticCouponListTimerFormatter = new StaticCouponListTimerFormatter(timerItem.getWordDeclension(), new Locale("ru"));
        InterfaceC6511n<? super Long, ? super Long, ? super StaticCouponListTimerFormatter, Unit> interfaceC6511n = this.startTimerListener;
        if (interfaceC6511n != null) {
            interfaceC6511n.invoke(timerItem.getStartSaleTimestamp(), timerItem.getEndSaleTimestamp(), staticCouponListTimerFormatter);
        }
    }
}

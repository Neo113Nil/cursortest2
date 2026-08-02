package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.view;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.model.HammersV3TimerBadgeVO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0014J0\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0007H\u0014J\u000e\u00100\u001a\u00020'2\u0006\u00101\u001a\u000202J\u0018\u00103\u001a\u00020'2\u0006\u00104\u001a\u0002052\b\u00101\u001a\u0004\u0018\u000102J\u0010\u00106\u001a\u00020'2\b\u00101\u001a\u0004\u0018\u000102J\u0010\u00107\u001a\u00020'2\u0006\u00101\u001a\u000202H\u0002J\b\u00108\u001a\u00020'H\u0002J\u0010\u00109\u001a\u00020'2\u0006\u0010:\u001a\u00020\u000eH\u0002J\u0010\u0010;\u001a\u00020'2\u0006\u0010<\u001a\u00020\u000eH\u0002J\u0010\u0010=\u001a\u00020'2\u0006\u0010>\u001a\u00020?H\u0002J\u0014\u0010@\u001a\u00020\u0007*\u00020A2\u0006\u0010B\u001a\u00020\u0007H\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersV3HeaderBadge;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dp2", "dp8", "timerRadius", "", "timerContentHeight", "defaultColor", "latestBgGradientWidth", "latestTextGradientWidth", "leftTextColor", "latestLeftTextColor", "rightTextColor", "latestRightTextColor", "leftBgColor", "latestLeftBgColor", "rightBgColor", "latestRightBgColor", "timerDisclosure", "Lru/ozon/uni/android/atom/icon/IconView;", "timerText", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "timerShape", "Landroid/graphics/drawable/ShapeDrawable;", "displayWidth", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "left", "top", "right", "bottom", "bind", DynamicElementDTO.TIMER, "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3TimerBadgeVO;", "onTimeChanged", "newTime", "", "onTimeExpired", "bindColor", "updateGradientAfterMeasured", "bindBgGradientAfterMeasure", "bgWidth", "bindTextGradientAfterMeasure", "textWidth", "bindTimerDisclosure", "dto", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTopByCenter", "Landroid/view/View;", "centerY", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HammersV3HeaderBadge extends ViewGroup {
    private final int defaultColor;
    private int displayWidth;
    private final int dp2;
    private final int dp8;
    private float latestBgGradientWidth;
    private int latestLeftBgColor;
    private int latestLeftTextColor;
    private int latestRightBgColor;
    private int latestRightTextColor;
    private float latestTextGradientWidth;
    private int leftBgColor;
    private int leftTextColor;
    private int rightBgColor;
    private int rightTextColor;
    private final int timerContentHeight;

    @NotNull
    private final IconView timerDisclosure;
    private final float timerRadius;

    @NotNull
    private final ShapeDrawable timerShape;

    @NotNull
    private final TextAtomV2View timerText;

    public /* synthetic */ HammersV3HeaderBadge(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindBgGradientAfterMeasure(float bgWidth) {
        if (this.latestBgGradientWidth == bgWidth && this.latestLeftBgColor == this.leftBgColor && this.latestRightBgColor == this.rightBgColor) {
            return;
        }
        this.latestBgGradientWidth = bgWidth;
        this.timerShape.getPaint().setShader(new LinearGradient(0.0f, 0.0f, bgWidth, 0.0f, this.leftBgColor, this.rightBgColor, Shader.TileMode.CLAMP));
        this.latestLeftBgColor = this.leftBgColor;
        this.latestRightBgColor = this.rightBgColor;
    }

    private final void bindColor(HammersV3TimerBadgeVO timer) {
        setBackground(this.timerShape);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.leftBgColor = styleParser.parseColor(context, timer.getLeftBgColor(), this.defaultColor);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.rightBgColor = styleParser.parseColor(context2, timer.getRightBgColor(), this.defaultColor);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.leftTextColor = styleParser.parseColor(context3, timer.getLeftTextColor(), this.defaultColor);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.rightTextColor = styleParser.parseColor(context4, timer.getRightTextColor(), this.defaultColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindTextGradientAfterMeasure(float textWidth) {
        if (this.latestTextGradientWidth == textWidth && this.latestLeftTextColor == this.leftTextColor && this.latestRightTextColor == this.rightTextColor) {
            return;
        }
        this.latestTextGradientWidth = textWidth;
        this.timerText.getPaint().setShader(new LinearGradient(0.0f, 0.0f, textWidth, 0.0f, this.leftTextColor, this.rightTextColor, Shader.TileMode.CLAMP));
        this.latestLeftTextColor = this.leftTextColor;
        this.latestRightTextColor = this.rightTextColor;
    }

    private final void bindTimerDisclosure(IconDTO dto) {
        IconHolderKt.bind$default(this.timerDisclosure, dto, null, 2, null);
        IconView iconView = this.timerDisclosure;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CommonAtomIconDTO icon = dto.getIcon();
        iconView.setGraphicColor(Integer.valueOf(styleParser.parseColor(context, icon != null ? icon.getTintColor() : null, this.defaultColor)));
    }

    private final int getTopByCenter(View view, int i11) {
        return i11 - (view.getMeasuredHeight() / 2);
    }

    private final void updateGradientAfterMeasured() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.view.HammersV3HeaderBadge$updateGradientAfterMeasured$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                TextAtomV2View textAtomV2View;
                if (this.getMeasuredWidth() <= 0 || this.getMeasuredHeight() <= 0) {
                    return;
                }
                this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                HammersV3HeaderBadge hammersV3HeaderBadge = (HammersV3HeaderBadge) this;
                hammersV3HeaderBadge.bindBgGradientAfterMeasure(hammersV3HeaderBadge.getMeasuredWidth());
                textAtomV2View = hammersV3HeaderBadge.timerText;
                hammersV3HeaderBadge.bindTextGradientAfterMeasure(textAtomV2View.getMeasuredWidth());
            }
        });
    }

    public final void bind(@NotNull HammersV3TimerBadgeVO timer) {
        Intrinsics.checkNotNullParameter(timer, "timer");
        this.displayWidth = timer.getDisplayWidth();
        TextHolderKt.bindOrGone$default(this.timerText, timer.getBadgeText(), null, 2, null);
        bindTimerDisclosure(timer.getChevron());
        bindColor(timer);
        updateGradientAfterMeasured();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int measuredHeight = getMeasuredHeight() / 2;
        TextAtomV2View textAtomV2View = this.timerText;
        LayoutExtKt.layoutLeftTop(textAtomV2View, this.dp8, getTopByCenter(textAtomV2View, measuredHeight));
        LayoutExtKt.layoutLeftTop(this.timerDisclosure, this.timerText.getRight() + this.dp2, getTopByCenter(this.timerDisclosure, measuredHeight));
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        View ifNotGone = ViewExtKt.getIfNotGone(this.timerDisclosure);
        if (ifNotGone != null) {
            MeasureExtKt.measureUnspecified(ifNotGone);
        }
        int i11 = this.dp2;
        View ifNotGone2 = ViewExtKt.getIfNotGone(this.timerDisclosure);
        int measuredWidth = i11 + (ifNotGone2 != null ? ifNotGone2.getMeasuredWidth() + this.dp2 : 0);
        MeasureExtKt.measure(this.timerText, (((this.displayWidth / 2) - HammersV3GradientHeaderView.INSTANCE.getPaddingHorizontalOfView()) - this.dp8) - measuredWidth, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        setMeasuredDimension(this.timerText.getMeasuredWidth() + this.dp8 + measuredWidth, this.timerContentHeight);
    }

    public final void onTimeChanged(@NotNull String newTime, HammersV3TimerBadgeVO timer) {
        HammersV3HeaderBadge hammersV3HeaderBadge;
        TextDTO badgeText;
        TextDTO copy$default;
        Intrinsics.checkNotNullParameter(newTime, "newTime");
        if (timer == null || (badgeText = timer.getBadgeText()) == null || (copy$default = TextDTO.copy$default(badgeText, OzonSpannableStringKt.toOzonSpannableString(newTime), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null)) == null) {
            hammersV3HeaderBadge = this;
        } else {
            hammersV3HeaderBadge = this;
            TextHolderKt.bind$default(hammersV3HeaderBadge.timerText, copy$default, null, 2, null);
        }
        hammersV3HeaderBadge.updateGradientAfterMeasured();
    }

    public final void onTimeExpired(HammersV3TimerBadgeVO timer) {
        TextDTO onExpiredText = timer != null ? timer.getOnExpiredText() : null;
        if (onExpiredText == null) {
            ViewExtKt.gone(this);
        } else {
            TextHolderKt.bind$default(this.timerText, onExpiredText, null, 2, null);
            updateGradientAfterMeasured();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HammersV3HeaderBadge(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = ResourceExtKt.toPx(2);
        this.dp8 = ResourceExtKt.toPx(8);
        this.timerRadius = ResourceExtKt.toPxF(8);
        this.timerContentHeight = ResourceExtKt.toPx(24);
        this.defaultColor = UniColors.TEXT_PRIMARY.getResId();
        q qVar = q.f64554a;
        IconView iconView = (IconView) qVar.i(N.b(IconView.class), context);
        if (iconView == null) {
            context2 = context;
            iconView = new IconView(context2, null, 0, 6, null);
        } else {
            context2 = context;
        }
        addView(iconView);
        this.timerDisclosure = iconView;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.i(N.b(TextAtomV2View.class), context2);
        textAtomV2View = textAtomV2View == null ? new TextAtomV2View(context2, null, 0, 6, null) : textAtomV2View;
        addView(textAtomV2View);
        this.timerText = textAtomV2View;
        float[] fArr = new float[8];
        for (int i13 = 0; i13 < 8; i13++) {
            fArr[i13] = this.timerRadius;
        }
        this.timerShape = new ShapeDrawable(new RoundRectShape(fArr, null, null));
    }
}

package ru.ozon.app.android.marketing.widgets.bigPromoCheckout.presentation;

import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.marketing.widgets.bigPromoCheckout.presentation.BigPromoCheckoutVO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 $2\u00020\u0001:\u0001$B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutTimerView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutVO$TimerBadgeVO;", DynamicElementDTO.TIMER, "", "bindOrGone", "(Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutVO$TimerBadgeVO;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "expiredText", "onTimeLeft", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "defaultBgColor", "I", "timeLeftBgColor", "", "cornerRadius", "F", "getCornerRadius", "()F", "setCornerRadius", "(F)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "timerTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "tickerTextView", "getTickerTextView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BigPromoCheckoutTimerView extends LinearLayout {
    private float cornerRadius;
    private final int defaultBgColor;

    @NotNull
    private final TextAtomV2View tickerTextView;
    private final int timeLeftBgColor;

    @NotNull
    private final TextAtomV2View timerTextView;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int VERTICAL_PADDING = ResourceExtKt.toPx(2);
    private static final int HORIZONTAL_PADDING = ResourceExtKt.toPx(6);
    private static final float CORNER_RADIUS = ResourceExtKt.toPxF(CornerRadius.RADIUS_250.getPx());
    private static final float CORNER_RADIUS_SELECT = ResourceExtKt.toPxF(CornerRadius.RADIUS_350.getPx());

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutTimerView$Companion;", "", "<init>", "()V", "VERTICAL_PADDING", "", "HORIZONTAL_PADDING", "CORNER_RADIUS", "", "getCORNER_RADIUS", "()F", "CORNER_RADIUS_SELECT", "getCORNER_RADIUS_SELECT", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getCORNER_RADIUS() {
            return BigPromoCheckoutTimerView.CORNER_RADIUS;
        }

        public final float getCORNER_RADIUS_SELECT() {
            return BigPromoCheckoutTimerView.CORNER_RADIUS_SELECT;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BigPromoCheckoutTimerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public final void bindOrGone(BigPromoCheckoutVO.TimerBadgeVO timer) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, timer != null ? timer.getBackgroundColor() : null);
        int intValue = parseColor != null ? parseColor.intValue() : this.defaultBgColor;
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.getPaint().setColor(intValue);
        paintDrawable.setCornerRadius(this.cornerRadius);
        setBackground(paintDrawable);
        TextHolderKt.bindOrGone$default(this.timerTextView, timer != null ? timer.getText() : null, null, 2, null);
        TextHolderKt.bindOrGone$default(this.tickerTextView, timer != null ? timer.getTimerStyle() : null, null, 2, null);
    }

    @NotNull
    public final TextAtomV2View getTickerTextView() {
        return this.tickerTextView;
    }

    public final void onTimeLeft(TextDTO expiredText) {
        ViewExtKt.gone(this.tickerTextView);
        TextHolderKt.bindOrGone$default(this.timerTextView, expiredText, null, 2, null);
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.getPaint().setColor(this.timeLeftBgColor);
        paintDrawable.setCornerRadius(this.cornerRadius);
        setBackground(paintDrawable);
    }

    public final void setCornerRadius(float f7) {
        this.cornerRadius = f7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigPromoCheckoutTimerView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.defaultBgColor = context.getColor(R$color.bg_accent_secondary);
        this.timeLeftBgColor = context.getColor(R$color.bg_primary);
        this.cornerRadius = CORNER_RADIUS;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(textAtomV2View);
        this.timerTextView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(textAtomV2View2);
        this.tickerTextView = textAtomV2View2;
        setOrientation(0);
        setGravity(17);
        int i13 = HORIZONTAL_PADDING;
        int i14 = VERTICAL_PADDING;
        setPadding(i13, i14, i13, i14);
    }
}

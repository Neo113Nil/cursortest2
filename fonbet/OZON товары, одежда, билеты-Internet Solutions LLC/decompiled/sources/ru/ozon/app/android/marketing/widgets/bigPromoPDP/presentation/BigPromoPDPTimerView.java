package ru.ozon.app.android.marketing.widgets.bigPromoPDP.presentation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import gk0.q;
import j.C7232a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.R$drawable;
import ru.ozon.app.android.marketing.widgets.bigPromoPDP.presentation.BigPromoPDPVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0014J0\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0014J\u0010\u0010\"\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010$J\u0010\u0010%\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010'R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006("}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPTimerView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dp2", "dp4", "dp8", "timerContentHeight", "defaultBgColor", "badgeBackground", "Landroid/graphics/drawable/Drawable;", "timerText", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "tickerText", "getTickerText", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "bindOrGone", "data", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO$TimerBadgeVO;", "onTimeLeft", "expiredText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BigPromoPDPTimerView extends ViewGroup {
    private final Drawable badgeBackground;
    private final int defaultBgColor;
    private final int dp2;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final TextAtomV2View tickerText;
    private final int timerContentHeight;

    @NotNull
    private final TextAtomV2View timerText;

    public /* synthetic */ BigPromoPDPTimerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public final void bindOrGone(BigPromoPDPVO.TimerBadgeVO data) {
        if (data == null) {
            ViewExtKt.gone(this);
            return;
        }
        String backgroundColor = data.getBackgroundColor();
        if (backgroundColor != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer mapColor = styleParser.mapColor(context, backgroundColor);
            int intValue = mapColor != null ? mapColor.intValue() : this.defaultBgColor;
            Drawable background = getBackground();
            Intrinsics.g(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            Drawable mutate = ((GradientDrawable) background).mutate();
            Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
            ColorStateList colorStateList = a.getColorStateList(getContext(), intValue);
            Intrinsics.g(mutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) mutate).setColor(colorStateList);
        }
        boolean z11 = data.getTimerText() != null && data.getSecondsLeft() == null;
        TextHolderKt.bindOrGone$default(this.timerText, data.getTimerText(), null, 2, null);
        TextAtomV2View textAtomV2View = this.tickerText;
        TextDTO timerStyle = data.getTimerStyle();
        TextHolderKt.bindOrGone$default(textAtomV2View, timerStyle != null ? TextDTO.copy$default(timerStyle, OzonSpannableStringKt.toOzonSpannableString(""), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null) : null, null, 2, null);
        if (z11) {
            ViewExtKt.gone(this.tickerText);
        } else {
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(this.tickerText);
        }
    }

    @NotNull
    public final TextAtomV2View getTickerText() {
        return this.tickerText;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        LayoutExtKt.layoutLeftTop(this.tickerText, getPaddingLeft(), getPaddingTop());
        LayoutExtKt.layoutLeftTop(this.timerText, this.tickerText.getVisibility() == 0 ? this.tickerText.getRight() + this.dp4 : getPaddingLeft(), getPaddingTop());
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        MeasureExtKt.measure(this.timerText, widthMeasureSpec, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        MeasureExtKt.measure(this.tickerText, widthMeasureSpec, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        int i11 = (this.timerText.getVisibility() == 0 && this.tickerText.getVisibility() == 0) ? this.dp4 : 0;
        int paddingLeft = getPaddingLeft();
        View ifNotGone = ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.getIfNotGone(this.timerText);
        int measuredWidth = paddingLeft + (ifNotGone != null ? ifNotGone.getMeasuredWidth() : 0) + i11;
        View ifNotGone2 = ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.getIfNotGone(this.tickerText);
        setMeasuredDimension(getPaddingRight() + measuredWidth + (ifNotGone2 != null ? ifNotGone2.getMeasuredWidth() : 0), this.timerContentHeight);
    }

    public final void onTimeLeft(TextDTO expiredText) {
        ViewExtKt.gone(this.tickerText);
        TextHolderKt.bindOrGone$default(this.timerText, expiredText, null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigPromoPDPTimerView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(2);
        this.dp2 = px;
        this.dp4 = UiExtKt.toPx(4);
        int px2 = UiExtKt.toPx(8);
        this.dp8 = px2;
        this.timerContentHeight = UiExtKt.toPx(24);
        this.defaultBgColor = context.getColor(R$color.layer_surface);
        Drawable a11 = C7232a.a(context, R$drawable.bg_big_promo_pdp_timer_badge);
        this.badgeBackground = a11;
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.i(N.b(TextAtomV2View.class), context);
        if (textAtomV2View == null) {
            context2 = context;
            textAtomV2View = new TextAtomV2View(context2, null, 0, 6, null);
        } else {
            context2 = context;
        }
        textAtomV2View.setTextIsSelectable(false);
        addView(textAtomV2View);
        this.timerText = textAtomV2View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.i(N.b(TextAtomV2View.class), context2);
        textAtomV2View2 = textAtomV2View2 == null ? new TextAtomV2View(context2, null, 0, 6, null) : textAtomV2View2;
        textAtomV2View2.setTextIsSelectable(false);
        addView(textAtomV2View2);
        this.tickerText = textAtomV2View2;
        setBackground(a11);
        setPadding(px2, px, px2, 0);
    }
}

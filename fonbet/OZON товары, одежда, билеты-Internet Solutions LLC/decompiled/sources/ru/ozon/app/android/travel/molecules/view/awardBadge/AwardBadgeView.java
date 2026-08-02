package ru.ozon.app.android.travel.molecules.view.awardBadge;

import Sc.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.awardBadge.AwardBadgeDTO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.R$font;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0014J\u0010\u0010'\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010 J\u0010\u0010)\u001a\u00020$2\u0006\u0010(\u001a\u00020 H\u0002J\u0010\u0010*\u001a\u00020$2\u0006\u0010(\u001a\u00020 H\u0002J\b\u0010+\u001a\u00020$H\u0002J\b\u0010,\u001a\u00020$H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dp3", "dp4", "dp4f", "", "dp5", "dp5f", "dp7f", "dp12f", "dp22", "dp26", "dp31", "dp32", "dp36", "dp40", "dp58", "awardBadgeDrawable", "Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeDrawable;", "iconView", "Landroidx/appcompat/widget/AppCompatImageView;", "textView", "Landroidx/appcompat/widget/AppCompatTextView;", "cachedVI", "Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeVI;", "finalSize", "Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeSize;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "bindOrGone", "model", "bind", "bindLarge", "bindSmall", "bindXSmall", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AwardBadgeView extends FrameLayout {

    @NotNull
    private final AwardBadgeDrawable awardBadgeDrawable;
    private AwardBadgeVI cachedVI;
    private final float dp12f;
    private final int dp22;
    private final int dp26;
    private final int dp3;
    private final int dp31;
    private final int dp32;
    private final int dp36;
    private final int dp4;
    private final int dp40;
    private final float dp4f;
    private final int dp5;
    private final int dp58;
    private final float dp5f;
    private final float dp7f;

    @NotNull
    private AwardBadgeDTO.AwardBadgeSize finalSize;

    @NotNull
    private final AppCompatImageView iconView;

    @NotNull
    private final AppCompatTextView textView;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AwardBadgeDTO.AwardBadgeSize.values().length];
            try {
                iArr[AwardBadgeDTO.AwardBadgeSize.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AwardBadgeDTO.AwardBadgeSize.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AwardBadgeDTO.AwardBadgeSize.X_SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ AwardBadgeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bind(AwardBadgeVI model) {
        float f7;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, model.getBackgroundColor(), UniColors.GRAPHIC_PREMIUM_BLUE.getResId());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int parseColor2 = styleParser.parseColor(context2, model.getIcon().getIconColor(), UniColors.BG_LIGHT_KEY.getResId());
        this.awardBadgeDrawable.setBgColor(parseColor);
        AwardBadgeDrawable awardBadgeDrawable = this.awardBadgeDrawable;
        AwardBadgeDTO.AwardBadgeSize awardBadgeSize = this.finalSize;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i11 = iArr[awardBadgeSize.ordinal()];
        if (i11 == 1) {
            f7 = this.dp7f;
        } else if (i11 == 2) {
            f7 = this.dp5f;
        } else {
            if (i11 != 3) {
                throw new o();
            }
            f7 = this.dp4f;
        }
        awardBadgeDrawable.setNotchHeight(f7);
        int identifier = getContext().getResources().getIdentifier(model.getIcon().getIcon(), "drawable", getContext().getApplicationContext().getPackageName());
        if (identifier != 0) {
            this.iconView.setImageResource(identifier);
            this.iconView.setImageTintList(ColorStateList.valueOf(parseColor2));
            this.iconView.setVisibility(0);
        } else {
            this.iconView.setVisibility(8);
        }
        int i12 = iArr[this.finalSize.ordinal()];
        if (i12 == 1) {
            bindLarge(model);
        } else if (i12 == 2) {
            bindSmall();
        } else {
            if (i12 != 3) {
                throw new o();
            }
            bindXSmall();
        }
    }

    private final void bindLarge(AwardBadgeVI model) {
        ViewGroup.LayoutParams layoutParams = this.iconView.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).topMargin = this.dp5;
        AwardBadgeDTO.AwardBadgeText text = model.getText();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AwardBadgeDTO.AwardBadgeText text2 = model.getText();
        int parseColor = styleParser.parseColor(context, text2 != null ? text2.getTextColor() : null, UniColors.BG_LIGHT_KEY.getResId());
        if (text == null) {
            this.textView.setVisibility(8);
            return;
        }
        this.textView.setVisibility(0);
        this.textView.setText(text.getText());
        this.textView.setTextColor(parseColor);
    }

    private final void bindSmall() {
        ViewGroup.LayoutParams layoutParams = this.iconView.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).topMargin = this.dp5;
        this.textView.setVisibility(8);
    }

    private final void bindXSmall() {
        ViewGroup.LayoutParams layoutParams = this.iconView.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = this.dp3;
        this.textView.setVisibility(8);
    }

    public final void bindOrGone(AwardBadgeVI model) {
        if (model == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.cachedVI = model;
        this.finalSize = model.getSize();
        bind(model);
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Pair pair;
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.finalSize.ordinal()];
        if (i11 == 1) {
            pair = new Pair(Integer.valueOf(this.dp40), Integer.valueOf(this.dp58));
        } else if (i11 == 2) {
            pair = new Pair(Integer.valueOf(this.dp32), Integer.valueOf(this.dp36));
        } else {
            if (i11 != 3) {
                throw new o();
            }
            pair = new Pair(Integer.valueOf(this.dp26), Integer.valueOf(this.dp31));
        }
        int intValue = ((Number) pair.a()).intValue();
        int intValue2 = ((Number) pair.b()).intValue();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.resolveSize(intValue, widthMeasureSpec), 1073741824), View.MeasureSpec.makeMeasureSpec(View.resolveSize(intValue2, heightMeasureSpec), 1073741824));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwardBadgeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp3 = ResourceExtKt.toPx(3, context);
        int px = ResourceExtKt.toPx(4, context);
        this.dp4 = px;
        float pxF = ResourceExtKt.toPxF(4, context);
        this.dp4f = pxF;
        int px2 = ResourceExtKt.toPx(5, context);
        this.dp5 = px2;
        this.dp5f = ResourceExtKt.toPxF(5, context);
        this.dp7f = ResourceExtKt.toPxF(7, context);
        float pxF2 = ResourceExtKt.toPxF(12, context);
        this.dp12f = pxF2;
        int px3 = ResourceExtKt.toPx(22, context);
        this.dp22 = px3;
        this.dp26 = ResourceExtKt.toPx(26, context);
        this.dp31 = ResourceExtKt.toPx(31, context);
        this.dp32 = ResourceExtKt.toPx(32, context);
        this.dp36 = ResourceExtKt.toPx(36, context);
        this.dp40 = ResourceExtKt.toPx(40, context);
        this.dp58 = ResourceExtKt.toPx(58, context);
        AwardBadgeDrawable awardBadgeDrawable = new AwardBadgeDrawable(pxF2, pxF);
        this.awardBadgeDrawable = awardBadgeDrawable;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(px3, px3);
        layoutParams.gravity = 1;
        appCompatImageView.setLayoutParams(layoutParams);
        this.iconView = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        layoutParams2.topMargin = px2 + px3;
        layoutParams2.leftMargin = px;
        layoutParams2.rightMargin = px;
        appCompatTextView.setLayoutParams(layoutParams2);
        appCompatTextView.setGravity(1);
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setTextSize(0, ResourceExtKt.toPxF(9, context));
        appCompatTextView.setLetterSpacing(0.0f);
        appCompatTextView.setTypeface(g.e(R$font.onest_bold, context));
        appCompatTextView.setTypeface(appCompatTextView.getTypeface(), 1);
        appCompatTextView.setLineSpacing(0.0f, 0.8f);
        this.textView = appCompatTextView;
        this.finalSize = AwardBadgeDTO.AwardBadgeSize.LARGE;
        setBackground(awardBadgeDrawable);
        addView(appCompatImageView);
        addView(appCompatTextView);
    }
}

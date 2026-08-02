package ru.ozon.app.android.fresh.common.widgets.molecules.freshTextPair.presentation;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.text.style.UpdateAppearance;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTextPair.data.FreshTextPairDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0002%&B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0014J\u0010\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\b\u0010\u0016\u001a\u00020\tH\u0002J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0014\u0010\u001e\u001a\u00020\u000e*\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\fH\u0002J$\u0010 \u001a\u00020\u000e*\u00020\u001b2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020$H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTextPair/presentation/FreshTextPairView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "leftTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "rightTextView", "rightTextStartPosition", "", "onSizeChanged", "", "width", "height", "oldWidth", "oldHeight", "bindOrGone", "freshTextPairDTO", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTextPair/data/FreshTextPairDTO;", "createTextView", "combineTextViews", "truncateToMaxLines", "", "spannableStringBuilder", "Landroid/text/SpannableStringBuilder;", "rightPaint", "Landroid/text/TextPaint;", "applyStyles", "rightStart", "applySpansFromTextView", "start", "end", "source", "Landroid/widget/TextView;", "Companion", "TextAppearanceSpan", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshTextPairView extends AppCompatTextView {
    private static final int DEFAULT_PADDING = UiExtKt.toPx(Paddings.NONE.getPx());

    @NotNull
    private static final Locale LOCALE_RU = new Locale("ru", "RU");
    private TextAtomV2View leftTextView;
    private int rightTextStartPosition;
    private TextAtomV2View rightTextView;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTextPair/presentation/FreshTextPairView$TextAppearanceSpan;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/text/style/UpdateAppearance;", "textSize", "", "color", "", "style", "<init>", "(FII)V", "updateMeasureState", "", "textPaint", "Landroid/text/TextPaint;", "updateDrawState", "applyChanges", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class TextAppearanceSpan extends MetricAffectingSpan implements UpdateAppearance {
        private final int color;
        private final int style;
        private final float textSize;

        public TextAppearanceSpan(float f7, int i11, int i12) {
            this.textSize = f7;
            this.color = i11;
            this.style = i12;
        }

        private final void applyChanges(TextPaint textPaint) {
            textPaint.setTextSize(this.textSize);
            textPaint.setTypeface(Typeface.create(textPaint.getTypeface(), this.style));
            textPaint.setColor(this.color);
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "textPaint");
            applyChanges(textPaint);
        }

        @Override // android.text.style.MetricAffectingSpan
        public void updateMeasureState(@NotNull TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "textPaint");
            applyChanges(textPaint);
        }
    }

    public /* synthetic */ FreshTextPairView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    private final void applySpansFromTextView(SpannableStringBuilder spannableStringBuilder, int i11, int i12, TextView textView) {
        float textSize = textView.getTextSize();
        int currentTextColor = textView.getCurrentTextColor();
        Typeface typeface = textView.getTypeface();
        spannableStringBuilder.setSpan(new TextAppearanceSpan(textSize, currentTextColor, typeface != null ? typeface.getStyle() : 0), i11, i12, 33);
    }

    private final void applyStyles(SpannableStringBuilder spannableStringBuilder, int i11) {
        TextAtomV2View textAtomV2View = this.leftTextView;
        if (textAtomV2View != null) {
            applySpansFromTextView(spannableStringBuilder, 0, i11, textAtomV2View);
        }
        TextAtomV2View textAtomV2View2 = this.rightTextView;
        if (textAtomV2View2 != null) {
            applySpansFromTextView(spannableStringBuilder, i11, spannableStringBuilder.length(), textAtomV2View2);
        }
    }

    private final void combineTextViews() {
        TextAtomV2View textAtomV2View = this.leftTextView;
        TextAtomV2View textAtomV2View2 = this.rightTextView;
        if (textAtomV2View == null || textAtomV2View2 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence text = textAtomV2View.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        spannableStringBuilder.append((CharSequence) OzonSpannableStringKt.toOzonSpannableString(text));
        spannableStringBuilder.append(" ");
        int length = spannableStringBuilder.length();
        this.rightTextStartPosition = length;
        CharSequence text2 = textAtomV2View2.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        spannableStringBuilder.append((CharSequence) OzonSpannableStringKt.toOzonSpannableString(text2));
        TextPaint paint = textAtomV2View2.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "getPaint(...)");
        if (truncateToMaxLines(spannableStringBuilder, paint)) {
            return;
        }
        applySpansFromTextView(spannableStringBuilder, 0, length, textAtomV2View);
        applySpansFromTextView(spannableStringBuilder, length, spannableStringBuilder.length(), textAtomV2View2);
        setText(spannableStringBuilder);
    }

    private final TextAtomV2View createTextView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        return textAtomV2View;
    }

    private final boolean truncateToMaxLines(SpannableStringBuilder spannableStringBuilder, TextPaint rightPaint) {
        if (getMaxLines() == Integer.MAX_VALUE || getWidth() <= 0) {
            return false;
        }
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        StaticLayout build = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), getPaint(), width).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        if (build.getLineCount() <= getMaxLines()) {
            return false;
        }
        int lineStart = build.getLineStart(getMaxLines() - 1);
        int i11 = this.rightTextStartPosition;
        CharSequence subSequence = spannableStringBuilder.subSequence(0, lineStart);
        Intrinsics.checkNotNullExpressionValue(subSequence, "subSequence(...)");
        CharSequence subSequence2 = (i11 < 0 || i11 >= spannableStringBuilder.length()) ? "" : spannableStringBuilder.subSequence(i11, spannableStringBuilder.length());
        Intrinsics.f(subSequence2);
        float desiredWidth = width - Layout.getDesiredWidth(subSequence2, rightPaint);
        if (desiredWidth < 0.0f) {
            desiredWidth = 0.0f;
        }
        CharSequence subSequence3 = spannableStringBuilder.subSequence(lineStart, i11);
        Intrinsics.checkNotNullExpressionValue(subSequence3, "subSequence(...)");
        CharSequence ellipsize = TextUtils.ellipsize(subSequence3, getPaint(), desiredWidth, TextUtils.TruncateAt.END);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append(subSequence);
        spannableStringBuilder2.append(ellipsize);
        if (subSequence2.length() > 0) {
            spannableStringBuilder2.append(" ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append(subSequence2);
            applyStyles(spannableStringBuilder2, length);
        }
        setText(spannableStringBuilder2);
        return true;
    }

    public final void bindOrGone(FreshTextPairDTO freshTextPairDTO) {
        if (freshTextPairDTO == null) {
            this.leftTextView = null;
            this.rightTextView = null;
            setVisibility(8);
            return;
        }
        setVisibility(0);
        Paddings paddingLeft = freshTextPairDTO.getPaddingLeft();
        int px = paddingLeft != null ? UiExtKt.toPx(paddingLeft.getPx()) : DEFAULT_PADDING;
        Paddings paddingTop = freshTextPairDTO.getPaddingTop();
        int px2 = paddingTop != null ? UiExtKt.toPx(paddingTop.getPx()) : DEFAULT_PADDING;
        Paddings paddingRight = freshTextPairDTO.getPaddingRight();
        int px3 = paddingRight != null ? UiExtKt.toPx(paddingRight.getPx()) : DEFAULT_PADDING;
        Paddings paddingBottom = freshTextPairDTO.getPaddingBottom();
        setPadding(px, px2, px3, paddingBottom != null ? UiExtKt.toPx(paddingBottom.getPx()) : DEFAULT_PADDING);
        TextAtomV2View textAtomV2View = this.leftTextView;
        if (textAtomV2View == null) {
            textAtomV2View = createTextView();
        }
        TextHolderKt.bind$default(textAtomV2View, freshTextPairDTO.getEllipsizableText(), null, 2, null);
        this.leftTextView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = this.rightTextView;
        if (textAtomV2View2 == null) {
            textAtomV2View2 = createTextView();
        }
        TextHolderKt.bind$default(textAtomV2View2, freshTextPairDTO.getTrailingText(), null, 2, null);
        this.rightTextView = textAtomV2View2;
        setMaxLines(freshTextPairDTO.getMaxLines());
        combineTextViews();
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        super.onSizeChanged(width, height, oldWidth, oldHeight);
        combineTextViews();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreshTextPairView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.rightTextStartPosition = -1;
        setHyphenationFrequency(2);
        setTextLocale(LOCALE_RU);
    }
}

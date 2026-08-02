package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.views;

import Hy.RunnableC3170a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.Y;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.storefront.core.socialAtoms.text.ImageWithHorizontalPaddingSpan;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0001CB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\u0016J\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010\u001dJ\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u000bH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010*\u001a\u00020)*\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u001b\u0010-\u001a\u00020\r*\u00020)2\u0006\u0010,\u001a\u00020\u0007H\u0002¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b/\u0010\u0013J\r\u00100\u001a\u00020\r¢\u0006\u0004\b0\u0010\u001dR\u0018\u00101\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001d\u00107\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001d\u0010:\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b9\u00106R\u0014\u0010<\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010(R\u0014\u0010>\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010(R\u0014\u0010B\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/RatingTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "textStyle", "", "applyTextStyle", "(Ljava/lang/String;)Lkotlin/Unit;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductRatingDTO;", "ratingDto", "setText", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductRatingDTO;)V", "color", "setIcons", "(I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "appendIconSpanAtStart", "(Landroid/graphics/drawable/Drawable;)V", "appendIconSpanAtEnd", "checkEllipsis", "()V", "ellipsisLineStartIndex", "setEllipsis", "getEllipsisIndex", "(I)I", "moveLastWordToSecondLine", "text", "Landroid/text/StaticLayout;", "getStaticLayout", "(Ljava/lang/String;)Landroid/text/StaticLayout;", "getAtomWidth", "()I", "Landroid/text/SpannableStringBuilder;", "trimEnd", "(Landroid/text/SpannableStringBuilder;)Landroid/text/SpannableStringBuilder;", "padding", "appendSpaceWithPadding", "(Landroid/text/SpannableStringBuilder;I)V", "bind", "unbind", "dto", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductRatingDTO;", "starDrawable$delegate", "LSc/j;", "getStarDrawable", "()Landroid/graphics/drawable/Drawable;", "starDrawable", "chevronDrawable$delegate", "getChevronDrawable", "chevronDrawable", "getIconSize", "iconSize", "getContentSpacing", "contentSpacing", "", "getHasStartIcon", "()Z", "hasStartIcon", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RatingTextView extends AppCompatTextView implements AtomView {

    /* renamed from: chevronDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j chevronDrawable;
    private ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO dto;

    /* renamed from: starDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j starDrawable;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final TextUtils.TruncateAt ELLIPSIS = TextUtils.TruncateAt.END;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/RatingTextView$Companion;", "", "<init>", "()V", "", "THREE_DOTS_SUFFIX", "Ljava/lang/String;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ RatingTextView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void appendIconSpanAtEnd(Drawable drawable) {
        CharSequence text = getText();
        Intrinsics.g(text, "null cannot be cast to non-null type android.text.Spannable");
        Spannable spannable = (Spannable) text;
        spannable.setSpan(new VerticalImagePaddingSpan(drawable, getContentSpacing()), h.G(spannable), spannable.length(), 17);
    }

    private final void appendIconSpanAtStart(Drawable drawable) {
        CharSequence text = getText();
        Intrinsics.g(text, "null cannot be cast to non-null type android.text.Spannable");
        ((Spannable) text).setSpan(new ImageWithHorizontalPaddingSpan(drawable, 0, getContentSpacing(), 2, null), 0, 1, 17);
    }

    private final void appendSpaceWithPadding(SpannableStringBuilder spannableStringBuilder, int i11) {
        spannableStringBuilder.append(" ");
        spannableStringBuilder.setSpan(new HorizontalPaddingSpan(i11), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
    }

    private final Unit applyTextStyle(String textStyle) {
        Integer parseTextStyle = StyleParser.INSTANCE.parseTextStyle(textStyle);
        if (parseTextStyle == null) {
            return null;
        }
        int intValue = parseTextStyle.intValue();
        StyleAppearance ofText$default = StyleAppearance.Companion.ofText$default(StyleAppearance.INSTANCE, null, 1, null);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ofText$default.read(context, intValue);
        ofText$default.apply(this);
        return Unit.f71690a;
    }

    private final void checkEllipsis() {
        int i11 = Y.f42258g;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.views.RatingTextView$checkEllipsis$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    int maxLines = RatingTextView.this.getMaxLines() - 1;
                    Layout layout = RatingTextView.this.getLayout();
                    if (layout != null) {
                        if (RatingTextView.this.getLineCount() > RatingTextView.this.getMaxLines()) {
                            RatingTextView.this.setEllipsis(layout.getLineStart(maxLines));
                        } else if (layout.getLineEnd(RatingTextView.this.getLineCount() - 1) - layout.getLineStart(RatingTextView.this.getLineCount() - 1) == 1) {
                            RatingTextView.this.moveLastWordToSecondLine();
                        }
                    }
                }
            });
        } else {
            int maxLines = getMaxLines() - 1;
            Layout layout = getLayout();
            if (layout != null) {
                if (getLineCount() > getMaxLines()) {
                    setEllipsis(layout.getLineStart(maxLines));
                } else if (layout.getLineEnd(getLineCount() - 1) - layout.getLineStart(getLineCount() - 1) == 1) {
                    moveLastWordToSecondLine();
                }
            }
        }
        post(new RunnableC3170a(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkEllipsis$lambda$11(RatingTextView ratingTextView) {
        ViewGroup.LayoutParams layoutParams = ratingTextView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).height = -2;
        ratingTextView.setLayoutParams(bVar);
    }

    private final int getAtomWidth() {
        int i11;
        int iconSize = getIconSize() + getContentSpacing();
        if (getHasStartIcon() && getMaxLines() == 1) {
            i11 = (getContentSpacing() * 3) + getIconSize();
        } else {
            i11 = 0;
        }
        return ((getMeasuredWidth() - iconSize) - (getPaddingEnd() + getPaddingStart())) - i11;
    }

    private final Drawable getChevronDrawable() {
        return (Drawable) this.chevronDrawable.getValue();
    }

    private final int getContentSpacing() {
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO productRatingDTO = this.dto;
        return productRatingDTO != null ? productRatingDTO.getContentSpacing() : UiExtKt.toPx(4);
    }

    private final int getEllipsisIndex(int ellipsisLineStartIndex) {
        if (getMaxLines() == 1) {
            int i11 = getHasStartIcon() ? 3 : 0;
            int ellipsisStart = getStaticLayout(getHasStartIcon() ? h.z0(h.Z(getText().toString(), " • ", "•")).toString() : h.C0(getText().toString()).toString()).getEllipsisStart(0);
            if (ellipsisStart > 0) {
                return ellipsisStart + i11;
            }
        } else {
            CharSequence text = getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            int ellipsisStart2 = getStaticLayout(h.z0(h.T(0, ellipsisLineStartIndex, text)).toString()).getEllipsisStart(0);
            if (ellipsisStart2 > 0) {
                return ellipsisLineStartIndex + ellipsisStart2;
            }
        }
        return 0;
    }

    private final boolean getHasStartIcon() {
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO productRatingDTO = this.dto;
        return (productRatingDTO != null ? productRatingDTO.getMark() : null) != null;
    }

    private final int getIconSize() {
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO productRatingDTO = this.dto;
        return productRatingDTO != null ? productRatingDTO.getIconSize() : UiExtKt.toPx(24);
    }

    private final Drawable getStarDrawable() {
        return (Drawable) this.starDrawable.getValue();
    }

    private final StaticLayout getStaticLayout(String text) {
        TextDirectionHeuristic textDirectionHeuristic;
        boolean isFallbackLineSpacing;
        StaticLayout.Builder ellipsizedWidth = StaticLayout.Builder.obtain(text, 0, text.length(), getPaint(), (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(getIncludeFontPadding()).setBreakStrategy(getBreakStrategy()).setHyphenationFrequency(getHyphenationFrequency()).setMaxLines(1).setEllipsize(ELLIPSIS).setEllipsizedWidth(getAtomWidth());
        Intrinsics.checkNotNullExpressionValue(ellipsizedWidth, "setEllipsizedWidth(...)");
        int i11 = Build.VERSION.SDK_INT;
        ellipsizedWidth.setJustificationMode(getJustificationMode());
        if (i11 >= 28) {
            isFallbackLineSpacing = isFallbackLineSpacing();
            ellipsizedWidth.setUseLineSpacingFromFallbacks(isFallbackLineSpacing);
        }
        if (i11 >= 30) {
            textDirectionHeuristic = getTextDirectionHeuristic();
            ellipsizedWidth.setTextDirection(textDirectionHeuristic);
        }
        StaticLayout build = ellipsizedWidth.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveLastWordToSecondLine() {
        CharSequence text = getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        List m11 = h.m(h.C0(text), new String[]{" "}, 0, 6);
        setText(C7714v.V(C7714v.E(m11), " ", null, null, null, 62) + "\n" + C7714v.X(m11) + " ", TextView.BufferType.SPANNABLE);
        Drawable starDrawable = getStarDrawable();
        if (starDrawable != null) {
            appendIconSpanAtStart(starDrawable);
        }
        Drawable chevronDrawable = getChevronDrawable();
        if (chevronDrawable != null) {
            appendIconSpanAtEnd(chevronDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setEllipsis(int ellipsisLineStartIndex) {
        int ellipsisIndex = getEllipsisIndex(ellipsisLineStartIndex);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        if (ellipsisIndex != 0) {
            spannableStringBuilder.delete(ellipsisIndex, getText().length());
        }
        setText(trimEnd(spannableStringBuilder).append("…").append(" "), TextView.BufferType.SPANNABLE);
        Drawable chevronDrawable = getChevronDrawable();
        if (chevronDrawable != null) {
            appendIconSpanAtEnd(chevronDrawable);
        }
    }

    private final void setIcons(int color) {
        Drawable starDrawable;
        if (getHasStartIcon() && (starDrawable = getStarDrawable()) != null) {
            starDrawable.setTint(color);
            starDrawable.setBounds(0, 0, getIconSize(), getIconSize());
            appendIconSpanAtStart(starDrawable);
        }
        Drawable chevronDrawable = getChevronDrawable();
        if (chevronDrawable != null) {
            chevronDrawable.setTint(color);
            chevronDrawable.setBounds(0, 0, getIconSize(), getIconSize());
            appendIconSpanAtEnd(chevronDrawable);
        }
    }

    private final void setText(ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO ratingDto) {
        SpannableStringBuilder append;
        if (getHasStartIcon()) {
            append = new SpannableStringBuilder();
            append.append(" ");
            Float mark = ratingDto.getMark();
            append.append(String.valueOf(mark != null ? Integer.valueOf((int) mark.floatValue()) : null));
            appendSpaceWithPadding(append, getContentSpacing());
            append.append("•");
            appendSpaceWithPadding(append, getContentSpacing());
            append.append(h.C0(ratingDto.getText()).toString());
            append.append(" ");
        } else {
            append = new SpannableStringBuilder(h.C0(ratingDto.getText()).toString()).append(' ');
        }
        setText(append, TextView.BufferType.SPANNABLE);
        setIcons(getCurrentTextColor());
        checkEllipsis();
    }

    private final SpannableStringBuilder trimEnd(SpannableStringBuilder spannableStringBuilder) {
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder2, "toString(...)");
        if (CharsKt.c(h.M(spannableStringBuilder2))) {
            int G11 = h.G(spannableStringBuilder2);
            do {
                G11--;
                if (-1 < G11) {
                }
            } while (CharsKt.c(spannableStringBuilder2.charAt(G11)));
            spannableStringBuilder.delete(G11 + 1, spannableStringBuilder.length());
            return spannableStringBuilder;
        }
        return spannableStringBuilder;
    }

    public final void bind(@NotNull ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO ratingDto) {
        Intrinsics.checkNotNullParameter(ratingDto, "ratingDto");
        this.dto = ratingDto;
        setMaxLines(ratingDto.getMaxLines());
        applyTextStyle(ratingDto.getTextStyle());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setTextColor(ContextExtKt.parseColor(context, ratingDto.getTextColor()));
        setText(ratingDto);
    }

    public final void unbind() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
        setLayoutParams(bVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingTextView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.starDrawable = k.b(new RatingTextView$starDrawable$2(context));
        this.chevronDrawable = k.b(new RatingTextView$chevronDrawable$2(context));
    }
}

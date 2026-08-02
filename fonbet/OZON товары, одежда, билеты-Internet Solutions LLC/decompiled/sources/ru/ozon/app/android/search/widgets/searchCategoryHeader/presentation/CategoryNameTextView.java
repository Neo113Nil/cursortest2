package ru.ozon.app.android.search.widgets.searchCategoryHeader.presentation;

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
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\u00020$*\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b'\u0010\u000fR\u001d\u0010,\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lru/ozon/app/android/search/widgets/searchCategoryHeader/presentation/CategoryNameTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "categoryName", "", "setText", "(Ljava/lang/String;)V", "color", "setIcon", "(I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "appendIconSpanAtEnd", "(Landroid/graphics/drawable/Drawable;)V", "checkEllipsis", "()V", "ellipsisLineStartIndex", "", "withFirstIcon", "setEllipsis", "(IZ)V", "text", "Landroid/text/StaticLayout;", "getStaticLayoutForChevron", "(Ljava/lang/String;Z)Landroid/text/StaticLayout;", "getAtomWidth", "(Z)I", "Landroid/text/SpannableStringBuilder;", "trimEnd", "(Landroid/text/SpannableStringBuilder;)Landroid/text/SpannableStringBuilder;", "bind", "chevronDrawable$delegate", "LSc/j;", "getChevronDrawable", "()Landroid/graphics/drawable/Drawable;", "chevronDrawable", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CategoryNameTextView extends AppCompatTextView implements AtomView {

    /* renamed from: chevronDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j chevronDrawable;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int CHEVRON_SIZE = ResourceExtKt.toPx(16);

    @NotNull
    private static final TextUtils.TruncateAt ELLIPSIS = TextUtils.TruncateAt.END;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/search/widgets/searchCategoryHeader/presentation/CategoryNameTextView$Companion;", "", "<init>", "()V", "", "MAX_LINES", "I", "", "THREE_DOTS_SUFFIX", "Ljava/lang/String;", "NON_BREAKING_SPACE", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CategoryNameTextView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void appendIconSpanAtEnd(Drawable drawable) {
        CharSequence text = getText();
        Intrinsics.g(text, "null cannot be cast to non-null type android.text.Spannable");
        Spannable spannable = (Spannable) text;
        spannable.setSpan(new VerticalImagePaddingSpan(drawable, 0, 2, null), h.G(spannable), spannable.length(), 17);
    }

    private final void checkEllipsis() {
        int i11 = Y.f42258g;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.search.widgets.searchCategoryHeader.presentation.CategoryNameTextView$checkEllipsis$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    int maxLines = CategoryNameTextView.this.getMaxLines() - 1;
                    Layout layout = CategoryNameTextView.this.getLayout();
                    if (layout != null) {
                        if (CategoryNameTextView.this.getLineCount() > CategoryNameTextView.this.getMaxLines()) {
                            CategoryNameTextView.setEllipsis$default(CategoryNameTextView.this, layout.getLineStart(maxLines), false, 2, null);
                        }
                        CategoryNameTextView categoryNameTextView = CategoryNameTextView.this;
                        ViewGroup.LayoutParams layoutParams = categoryNameTextView.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        }
                        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                        ((ViewGroup.MarginLayoutParams) bVar).height = -2;
                        categoryNameTextView.setLayoutParams(bVar);
                    }
                }
            });
            return;
        }
        int maxLines = getMaxLines() - 1;
        Layout layout = getLayout();
        if (layout != null) {
            if (getLineCount() > getMaxLines()) {
                setEllipsis$default(this, layout.getLineStart(maxLines), false, 2, null);
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).height = -2;
            setLayoutParams(bVar);
        }
    }

    private final int getAtomWidth(boolean withFirstIcon) {
        int measuredWidth;
        int paddingEnd;
        if (withFirstIcon) {
            measuredWidth = (getMeasuredWidth() - CHEVRON_SIZE) - getPaddingStart();
            paddingEnd = getPaddingEnd();
        } else {
            measuredWidth = (getMeasuredWidth() - CHEVRON_SIZE) - getPaddingStart();
            paddingEnd = getPaddingEnd();
        }
        return measuredWidth - paddingEnd;
    }

    private final Drawable getChevronDrawable() {
        return (Drawable) this.chevronDrawable.getValue();
    }

    private final StaticLayout getStaticLayoutForChevron(String text, boolean withFirstIcon) {
        TextDirectionHeuristic textDirectionHeuristic;
        boolean isFallbackLineSpacing;
        StaticLayout.Builder ellipsizedWidth = StaticLayout.Builder.obtain(text, 0, text.length(), getPaint(), (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(getIncludeFontPadding()).setBreakStrategy(getBreakStrategy()).setHyphenationFrequency(getHyphenationFrequency()).setMaxLines(1).setEllipsize(ELLIPSIS).setEllipsizedWidth(getAtomWidth(withFirstIcon));
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

    private final void setEllipsis(int ellipsisLineStartIndex, boolean withFirstIcon) {
        CharSequence text = getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        int ellipsisStart = getStaticLayoutForChevron(h.z0(h.T(0, ellipsisLineStartIndex, text)).toString(), withFirstIcon).getEllipsisStart(0) + ellipsisLineStartIndex;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        if (ellipsisStart != 0) {
            spannableStringBuilder.delete(ellipsisStart, getText().length());
        }
        setText(trimEnd(spannableStringBuilder).append("…").append(" "), TextView.BufferType.SPANNABLE);
        Drawable chevronDrawable = getChevronDrawable();
        if (chevronDrawable != null) {
            appendIconSpanAtEnd(chevronDrawable);
        }
    }

    static /* synthetic */ void setEllipsis$default(CategoryNameTextView categoryNameTextView, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        categoryNameTextView.setEllipsis(i11, z11);
    }

    private final void setIcon(int color) {
        Drawable chevronDrawable = getChevronDrawable();
        if (chevronDrawable != null) {
            chevronDrawable.setTint(color);
            int i11 = CHEVRON_SIZE;
            chevronDrawable.setBounds(0, 0, i11, i11);
            appendIconSpanAtEnd(chevronDrawable);
        }
    }

    private final void setText(String categoryName) {
        if (categoryName.length() == 0) {
            return;
        }
        setText(new SpannableStringBuilder(categoryName).append((CharSequence) "  "), TextView.BufferType.SPANNABLE);
        setIcon(getCurrentTextColor());
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

    public final void bind(@NotNull String categoryName) {
        Intrinsics.checkNotNullParameter(categoryName, "categoryName");
        setTextColor(getContext().getColor(R$color.text_primary));
        setText(categoryName);
        setTextAppearance(R$style.TextStyle_Head_M);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryNameTextView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.chevronDrawable = k.b(new CategoryNameTextView$chevronDrawable$2(context));
        setMaxLines(2);
    }
}

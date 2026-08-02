package ru.ozon.app.android.product.labelList.presentation.view;

import Sc.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.product.labelList.presentation.HorizontalPaddingSpan;
import ru.ozon.app.android.product.labelList.presentation.ImageWithHorizontalPaddingSpan;
import ru.ozon.app.android.product.labelList.presentation.vo.LabelListMapperKt;
import ru.ozon.app.android.product.labelList.presentation.vo.LabelListVO;
import ru.ozon.app.android.storefrontcommonwidgets.utils.Dimens;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.html.spans.CustomTypefaceSpan;
import ru.ozon.uni.atoms.html.spans.OzonForegroundColorSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.R$font;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0012\u0010\u0013\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u0014\u0010\u0017\u001a\u00020\u000f*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0014\u0010\u001b\u001a\u00020\u000f*\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0014\u0010 \u001a\u00020!*\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0014\u0010$\u001a\u00020!*\u00020!2\u0006\u0010%\u001a\u00020#H\u0002J\u0014\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0001\u0010(\u001a\u00020\bH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lru/ozon/app/android/product/labelList/presentation/view/LabelListView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "fontAttr", "", "fontDefault", "bind", "", "item", "Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO;", "bindOrGone", "createLabelString", "", "", "Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO$LabelItemVO;", "appendLabelText", "Landroid/text/SpannableStringBuilder;", "textLabel", "Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO$LabelItemVO$Text;", "appendLabelIcon", "iconLabel", "Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO$LabelItemVO$Icon;", "getDrawable", "Landroid/graphics/drawable/Drawable;", "applyTextColor", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "color", "", "applyTextStyle", "typographyToken", "getFont", "Landroid/graphics/Typeface;", "style", "Companion", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LabelListView extends AppCompatTextView implements AtomView {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final int[] fontAttr;
    private final int fontDefault;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/product/labelList/presentation/view/LabelListView$Companion;", "", "<init>", "()V", "SPACE_FOR_SPAN", "", "create", "Lru/ozon/app/android/product/labelList/presentation/view/LabelListView;", "context", "Landroid/content/Context;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LabelListView create(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            LabelListView labelListView = new LabelListView(context, null, 0, 6, null);
            labelListView.setId(View.generateViewId());
            labelListView.setLayoutParams(new ConstraintLayout.b(-1, -2));
            return labelListView;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LabelListView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void appendLabelIcon(SpannableStringBuilder spannableStringBuilder, LabelListVO.LabelItemVO.Icon icon) {
        Drawable drawable = getDrawable(icon);
        if (drawable == null) {
            return;
        }
        spannableStringBuilder.append(" ").setSpan(new ImageWithHorizontalPaddingSpan(drawable, icon.getLeftOffsetPx(), 0, 4, null), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
    }

    private final void appendLabelText(SpannableStringBuilder spannableStringBuilder, LabelListVO.LabelItemVO.Text text) {
        OzonSpannableString applyTextColor = applyTextColor(applyTextStyle(text.getText(), text.getTypographyToken()), text.getTextColor());
        spannableStringBuilder.append(" ").setSpan(new HorizontalPaddingSpan(text.getLeftOffsetPx()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        spannableStringBuilder.append((CharSequence) applyTextColor);
    }

    private final OzonSpannableString applyTextColor(OzonSpannableString ozonSpannableString, String str) {
        ozonSpannableString.setSpan(new OzonForegroundColorSpan(str), 0, ozonSpannableString.length(), 33);
        return ozonSpannableString;
    }

    private final OzonSpannableString applyTextStyle(OzonSpannableString ozonSpannableString, String str) {
        Integer parseTextStyle = StyleParser.INSTANCE.parseTextStyle(str);
        int intValue = parseTextStyle != null ? parseTextStyle.intValue() : LabelListMapperKt.getLABEL_TEXT_TYPOGRAPHY_DEFAULT().getResId();
        ozonSpannableString.setSpan(new TextAppearanceSpan(getContext(), intValue), 0, ozonSpannableString.length(), 33);
        ozonSpannableString.setSpan(new CustomTypefaceSpan(getFont(intValue)), 0, ozonSpannableString.length(), 33);
        return ozonSpannableString;
    }

    private final CharSequence createLabelString(List<? extends LabelListVO.LabelItemVO> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (LabelListVO.LabelItemVO labelItemVO : list) {
            if (labelItemVO instanceof LabelListVO.LabelItemVO.Text) {
                appendLabelText(spannableStringBuilder, (LabelListVO.LabelItemVO.Text) labelItemVO);
            } else {
                if (!(labelItemVO instanceof LabelListVO.LabelItemVO.Icon)) {
                    throw new o();
                }
                appendLabelIcon(spannableStringBuilder, (LabelListVO.LabelItemVO.Icon) labelItemVO);
            }
        }
        return spannableStringBuilder;
    }

    private final Drawable getDrawable(LabelListVO.LabelItemVO.Icon iconLabel) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable loadDrawableByName = ExtensionsKt.loadDrawableByName(context, iconLabel.getIcon().getIcon());
        if (loadDrawableByName == null) {
            return null;
        }
        loadDrawableByName.mutate();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context2, iconLabel.getIcon().getTintColor());
        if (parseColor != null) {
            loadDrawableByName.setTint(parseColor.intValue());
        } else {
            loadDrawableByName.setTintList(null);
        }
        loadDrawableByName.setBounds(0, 0, iconLabel.getIconSizePx(), iconLabel.getIconSizePx());
        return loadDrawableByName;
    }

    private final Typeface getFont(int style) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(style, this.fontAttr);
        int resourceId = obtainStyledAttributes.getResourceId(C7705l.L(this.fontAttr, R.attr.fontFamily), this.fontDefault);
        obtainStyledAttributes.recycle();
        return g.e(resourceId, getContext());
    }

    public final void bind(@NotNull LabelListVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TestInfo testInfo = item.getTestInfo();
        setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
        setText(createLabelString(item.getItems()));
        setPadding(0, item.getTopOffset(), 0, item.getBottomOffset());
    }

    public final void bindOrGone(LabelListVO item) {
        if (item == null) {
            setVisibility(8);
        } else {
            setVisibility(0);
            bind(item);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelListView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.fontAttr = new int[]{R.attr.fontFamily};
        int i12 = R$font.onest_regular;
        this.fontDefault = i12;
        setEllipsize(TextUtils.TruncateAt.END);
        setMaxLines(1);
        setTypeface(g.e(i12, context));
        setLineSpacing(Dimens.INSTANCE.getDPF_2(), getLineSpacingMultiplier());
    }
}

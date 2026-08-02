package ru.ozon.app.android.uikit.view.atoms.texts;

import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.appearance.atom.TextAtomWithIconAppearance;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00112\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0018\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\u00112\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001a\u0010\u0016J9\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r0\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020\u00078DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00000$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/texts/TextAtomWithIconView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "", "icon", "iconTintColor", "iconAlignment", "", "setTextWithIcon", "(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/Integer;I)V", "color", "setTextColorOrDefault", "(Ljava/lang/Integer;)V", "maxLines", "setMaxLinesOrDefault", "textStyle", "setStyleOrDefault", "Lkotlin/Pair;", "Landroid/text/style/ImageSpan;", "getImageSpanWithOffset", "(Ljava/lang/String;Ljava/lang/Integer;I)Lkotlin/Pair;", "dp16$delegate", "LSc/j;", "getDp16", "()I", "dp16", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "appearance", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "defaultTextColor", "I", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class TextAtomWithIconView extends AppCompatTextView implements AtomView {

    @NotNull
    private final StyleAppearance<TextAtomWithIconView> appearance;
    private final int defaultTextColor;

    /* renamed from: dp16$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dp16;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextAtomWithIconView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    protected final int getDp16() {
        return ((Number) this.dp16.getValue()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Pair<ImageSpan, String> getImageSpanWithOffset(String icon, Integer iconTintColor, int iconAlignment) {
        Drawable colorDrawable;
        String str;
        if (icon != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            colorDrawable = ExtensionsKt.loadDrawableByName(context, icon);
            if (colorDrawable != null) {
                colorDrawable.mutate();
                if (iconTintColor != null) {
                    colorDrawable.setTint(iconTintColor.intValue());
                }
                colorDrawable.setBounds(0, 0, colorDrawable.getIntrinsicWidth(), colorDrawable.getIntrinsicHeight());
                str = "i ";
                return iconAlignment != 2 ? new Pair<>(new VerticalImageSpan(colorDrawable), str) : new Pair<>(new ImageSpan(colorDrawable, iconAlignment), str);
            }
        }
        colorDrawable = new ColorDrawable();
        colorDrawable.setBounds(0, 0, 0, getDp16());
        str = "i";
        if (iconAlignment != 2) {
        }
    }

    public final void setMaxLinesOrDefault(Integer maxLines) {
        TextUtils.TruncateAt truncateAt = null;
        if (maxLines != null) {
            if (maxLines.intValue() <= 0) {
                maxLines = null;
            }
            if (maxLines != null) {
                setMaxLines(maxLines.intValue());
                truncateAt = TextUtils.TruncateAt.END;
            }
        }
        setEllipsize(truncateAt);
    }

    public final void setStyleOrDefault(Integer textStyle) {
        int intValue = textStyle != null ? textStyle.intValue() : R$style.TextStyle_Body_M_Black;
        StyleAppearance<TextAtomWithIconView> styleAppearance = this.appearance;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        styleAppearance.read(context, intValue);
        this.appearance.apply(this);
    }

    public final void setTextColorOrDefault(Integer color) {
        setTextColor(color != null ? color.intValue() : this.defaultTextColor);
    }

    public final void setTextWithIcon(@NotNull CharSequence text, String icon, Integer iconTintColor, int iconAlignment) {
        Intrinsics.checkNotNullParameter(text, "text");
        Pair<ImageSpan, String> imageSpanWithOffset = getImageSpanWithOffset(icon, iconTintColor, iconAlignment);
        ImageSpan a11 = imageSpanWithOffset.a();
        String b11 = imageSpanWithOffset.b();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) b11);
        spannableStringBuilder.append(text);
        spannableStringBuilder.setSpan(a11, 0, 1, 0);
        setText(spannableStringBuilder);
    }

    public /* synthetic */ TextAtomWithIconView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAtomWithIconView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp16 = k.a(n.NONE, new TextAtomWithIconView$dp16$2(context));
        this.appearance = StyleAppearance.Companion.ofText$default(StyleAppearance.INSTANCE, null, 1, null);
        this.defaultTextColor = a.getColor(context, R$color.oz_semantic_text_primary);
        if (attributeSet != null) {
            new TextAtomWithIconAppearance().apply(this);
        }
    }
}

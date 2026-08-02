package ru.ozon.uni.android.uikit.view.atoms.texts;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.appearance.atom.TextAtomAppearance;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u000f2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0011R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defaultTextColor", "appearance", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "setTextColorOrDefault", "", "color", "(Ljava/lang/Integer;)V", "setMaxLinesOrDefault", "maxLines", "setStyleOrDefault", "textStyle", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TextAtomView extends AppCompatTextView implements AtomView {
    public static final int $stable = 8;

    @NotNull
    private final StyleAppearance<TextAtomView> appearance;
    private final int defaultTextColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextAtomView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setMaxLinesOrDefault(Integer maxLines) {
        TextUtils.TruncateAt truncateAt = null;
        if (maxLines != null) {
            if ((maxLines.intValue() > 0 ? maxLines : null) != null) {
                truncateAt = TextUtils.TruncateAt.END;
            }
        }
        setEllipsize(truncateAt);
        setMaxLines(((maxLines != null && maxLines.intValue() == 0) || maxLines == null) ? Integer.MAX_VALUE : maxLines.intValue());
    }

    public final void setStyleOrDefault(Integer textStyle) {
        int intValue = textStyle != null ? textStyle.intValue() : R$style.TextStyle_Body_M_Black;
        StyleAppearance<TextAtomView> styleAppearance = this.appearance;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        styleAppearance.read(context, intValue);
        this.appearance.apply(this);
    }

    public final void setTextColorOrDefault(Integer color) {
        setTextColor(color != null ? color.intValue() : this.defaultTextColor);
    }

    public /* synthetic */ TextAtomView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAtomView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.defaultTextColor = a.getColor(context, R$color.oz_semantic_text_primary);
        this.appearance = StyleAppearance.Companion.ofText$default(StyleAppearance.INSTANCE, null, 1, null);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TextAtomView);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            new TextAtomAppearance().apply(this);
            obtainStyledAttributes.recycle();
        }
    }
}

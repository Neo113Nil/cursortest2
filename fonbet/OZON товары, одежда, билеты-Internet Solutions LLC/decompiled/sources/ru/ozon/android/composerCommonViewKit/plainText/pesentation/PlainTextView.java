package ru.ozon.android.composerCommonViewKit.plainText.pesentation;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.R$color;
import ru.ozon.android.composerCommonViewKit.R$styleable;
import ru.ozon.android.composerCommonViewKit.databinding.ViewPlainTextBinding;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u001cH\u0002J\u0017\u0010\u001d\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\u001fR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/android/composerCommonViewKit/plainText/pesentation/PlainTextView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "binding", "Lru/ozon/android/composerCommonViewKit/databinding/ViewPlainTextBinding;", "bind", "", "vo", "Lru/ozon/android/composerCommonViewKit/plainText/pesentation/PlainTextVO;", "updateMargins", "left", "top", "right", "bottom", "bindTextDto", "textDTO", "Lru/ozon/uni/atoms/data/text/TextDTO;", "updateIslandRadius", "", "updateBackgroundColor", "color", "(Ljava/lang/Integer;)V", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PlainTextView extends FrameLayout {

    @NotNull
    private final GradientDrawable backgroundDrawable;

    @NotNull
    private final ViewPlainTextBinding binding;

    public /* synthetic */ PlainTextView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void bindTextDto(TextDTO textDTO) {
        TextAtomV2View textAtom = this.binding.textAtom;
        Intrinsics.checkNotNullExpressionValue(textAtom, "textAtom");
        TextHolderKt.bind$default(textAtom, textDTO, null, 2, null);
    }

    private final void updateBackgroundColor(Integer color) {
        this.backgroundDrawable.setColor(color != null ? color.intValue() : a.getColor(getContext(), R$color.transparent));
    }

    private final void updateIslandRadius(float top, float bottom) {
        this.backgroundDrawable.setCornerRadii(new float[]{top, top, top, top, bottom, bottom, bottom, bottom});
    }

    private final void updateMargins(int left, int top, int right, int bottom) {
        FrameLayout root = this.binding.root;
        Intrinsics.checkNotNullExpressionValue(root, "root");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(left, top, right, bottom);
        root.setLayoutParams(marginLayoutParams);
    }

    public final void bind(@NotNull PlainTextVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        bindTextDto(vo.getTextDTO());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, vo.getBackgroundColor());
        updateBackgroundColor(Integer.valueOf(parseColor != null ? parseColor.intValue() : getContext().getColor(R$color.transparent)));
        updateIslandRadius(vo.getTopIslandCornerRadius(), vo.getBottomIslandCornerRadius());
        updateMargins(vo.getLeftMargin(), vo.getTopMargin(), vo.getRightMargin(), vo.getBottomMargin());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlainTextView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.backgroundDrawable = gradientDrawable;
        ViewPlainTextBinding inflate = ViewPlainTextBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        inflate.root.setBackground(gradientDrawable);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PlainTextView, i11, i12);
        inflate.textAtom.setText(obtainStyledAttributes.getText(R$styleable.PlainTextView_text));
        updateBackgroundColor(Integer.valueOf(obtainStyledAttributes.getColor(R$styleable.PlainTextView_backgroundColor, a.getColor(context, R$color.transparent))));
        updateIslandRadius(obtainStyledAttributes.getDimension(R$styleable.PlainTextView_topCornerRadius, 0.0f), obtainStyledAttributes.getDimension(R$styleable.PlainTextView_bottomCornerRadius, 0.0f));
        updateMargins((int) obtainStyledAttributes.getDimension(R$styleable.PlainTextView_leftMargin, 0.0f), (int) obtainStyledAttributes.getDimension(R$styleable.PlainTextView_topMargin, 0.0f), (int) obtainStyledAttributes.getDimension(R$styleable.PlainTextView_rightMargin, 0.0f), (int) obtainStyledAttributes.getDimension(R$styleable.PlainTextView_bottomMargin, 0.0f));
        obtainStyledAttributes.recycle();
    }
}

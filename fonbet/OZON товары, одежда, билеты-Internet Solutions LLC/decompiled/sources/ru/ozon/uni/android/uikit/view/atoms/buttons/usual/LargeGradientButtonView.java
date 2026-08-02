package ru.ozon.uni.android.uikit.view.atoms.buttons.usual;

import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import j.C7232a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u00132\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001d\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u001b\u0010 \u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u0011R\u001b\u0010$\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeGradientButtonView;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/graphics/drawable/StateListDrawable;", "createBackground", "()Landroid/graphics/drawable/StateListDrawable;", "Landroid/graphics/drawable/LayerDrawable;", "createGradient", "()Landroid/graphics/drawable/LayerDrawable;", "color", "", "setCustomTextColor", "(I)V", "", "colors", "setGradientBackground", "(Ljava/util/List;)V", "buttonBackground$delegate", "LSc/j;", "getButtonBackground", "buttonBackground", "gradientBackground$delegate", "getGradientBackground", "gradientBackground", "disabledTextColor$delegate", "getDisabledTextColor", "()I", "disabledTextColor", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LargeGradientButtonView extends LargeButtonView implements AtomView {

    /* renamed from: buttonBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonBackground;

    /* renamed from: disabledTextColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j disabledTextColor;

    /* renamed from: gradientBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j gradientBackground;

    public /* synthetic */ LargeGradientButtonView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StateListDrawable createBackground() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, C7232a.a(getContext(), R$drawable.o2_selector_rect_round_secondary));
        stateListDrawable.addState(StateSet.WILD_CARD, getGradientBackground());
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayerDrawable createGradient() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setCornerRadius(ResourceExtKt.toPxF(6));
        Unit unit = Unit.f71690a;
        return new LayerDrawable(new Drawable[]{gradientDrawable, C7232a.a(getContext(), R$drawable.ripple_rect_round_whitewave)});
    }

    private final StateListDrawable getButtonBackground() {
        return (StateListDrawable) this.buttonBackground.getValue();
    }

    private final int getDisabledTextColor() {
        return ((Number) this.disabledTextColor.getValue()).intValue();
    }

    private final LayerDrawable getGradientBackground() {
        return (LayerDrawable) this.gradientBackground.getValue();
    }

    public final void setCustomTextColor(int color) {
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{-16842910}, StateSet.WILD_CARD}, new int[]{getDisabledTextColor(), color});
        setTextColor(colorStateList);
        setSubtextColor(colorStateList);
    }

    public final void setGradientBackground(List<Integer> colors) {
        if (colors != null) {
            if (colors.size() <= 1) {
                colors = null;
            }
            if (colors != null) {
                int[] T02 = C7714v.T0(colors);
                Drawable drawable = getGradientBackground().getDrawable(0);
                GradientDrawable gradientDrawable = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColors(T02);
                }
                setBackground(getButtonBackground());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LargeGradientButtonView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        n nVar = n.NONE;
        this.buttonBackground = k.a(nVar, new LargeGradientButtonView$buttonBackground$2(this));
        this.gradientBackground = k.a(nVar, new LargeGradientButtonView$gradientBackground$2(this));
        this.disabledTextColor = k.a(nVar, new LargeGradientButtonView$disabledTextColor$2(context));
    }
}

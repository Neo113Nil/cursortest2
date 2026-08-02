package ru.ozon.uni.android.uikit.view.atoms.buttons.usual;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$layout;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikit.appearance.atom.SmallButtonWithIconAppearance;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.databinding.SmallButtonWithIconUniBinding;

@InterfaceC3999a
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\b\b\u0017\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R(\u0010'\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonWithIconView;", "Landroid/widget/LinearLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/graphics/drawable/Drawable;", "drawable", "", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "tintColor", "setTintColor", "(I)V", "Landroid/content/res/ColorStateList;", "color", "setTextColor", "(Landroid/content/res/ColorStateList;)V", "", "enabled", "setEnabled", "(Z)V", "Lru/ozon/uni/databinding/SmallButtonWithIconUniBinding;", "binding", "Lru/ozon/uni/databinding/SmallButtonWithIconUniBinding;", "getBinding", "()Lru/ozon/uni/databinding/SmallButtonWithIconUniBinding;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "text", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public class SmallButtonWithIconView extends LinearLayout implements AtomView {

    @NotNull
    private final SmallButtonWithIconUniBinding binding;
    public static final int $stable = 8;
    private static final int DP_6 = ResourceExtKt.toPx(6);

    public /* synthetic */ SmallButtonWithIconView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final SmallButtonWithIconUniBinding getBinding() {
        return this.binding;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.binding.titleTv.setEnabled(enabled);
        this.binding.imageView.setEnabled(enabled);
    }

    public final void setImageDrawable(Drawable drawable) {
        ImageView imageView = this.binding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewExtKt.showOrGone(imageView, Boolean.valueOf(drawable != null));
        this.binding.imageView.setImageDrawable(drawable);
    }

    public final void setText(CharSequence charSequence) {
        this.binding.titleTv.setText(charSequence);
    }

    public final void setTextColor(@NotNull ColorStateList color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.binding.titleTv.setTextColor(color);
        this.binding.imageView.setImageTintList(color);
    }

    public final void setTintColor(int tintColor) {
        this.binding.imageView.setColorFilter(tintColor, PorterDuff.Mode.SRC_IN);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallButtonWithIconView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        SmallButtonWithIconUniBinding bind = SmallButtonWithIconUniBinding.bind(View.inflate(context, R$layout.small_button_with_icon_uni, this));
        this.binding = bind;
        TextView titleTv = bind.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        ViewGroup.LayoutParams layoutParams = titleTv.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(DP_6);
        titleTv.setLayoutParams(marginLayoutParams);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SmallButtonWithIconView, i11, i12);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        SmallButtonWithIconAppearance smallButtonWithIconAppearance = new SmallButtonWithIconAppearance();
        smallButtonWithIconAppearance.readAttribute(R$styleable.SmallButtonWithIconView_textColor, obtainStyledAttributes);
        smallButtonWithIconAppearance.readAttribute(R$styleable.SmallButtonWithIconView_text, obtainStyledAttributes);
        smallButtonWithIconAppearance.readAttribute(R$styleable.SmallButtonWithIconView_titleTextAppearance, obtainStyledAttributes);
        smallButtonWithIconAppearance.apply(this);
        obtainStyledAttributes.recycle();
    }
}

package ru.ozon.uni.android.uikit.view.atoms.buttons.payments;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$layout;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikit.appearance.atom.LargePaymentButtonAppearance;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.databinding.PaymentButtonLargeUniBinding;

@InterfaceC3999a
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010%\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010(\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$¨\u0006)"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/buttons/payments/LargePaymentButtonView;", "Landroid/widget/LinearLayout;", "", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/graphics/drawable/Drawable;", "drawable", "", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/content/res/ColorStateList;", "color", "setTextColor", "(Landroid/content/res/ColorStateList;)V", "setSubtextColor", "orientation", "setOrientation", "(I)V", "Lru/ozon/uni/databinding/PaymentButtonLargeUniBinding;", "binding", "Lru/ozon/uni/databinding/PaymentButtonLargeUniBinding;", "getBinding", "()Lru/ozon/uni/databinding/PaymentButtonLargeUniBinding;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "text", "getSubText", "setSubText", "subText", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LargePaymentButtonView extends LinearLayout implements AtomView {

    @NotNull
    private final PaymentButtonLargeUniBinding binding;

    public /* synthetic */ LargePaymentButtonView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final PaymentButtonLargeUniBinding getBinding() {
        return this.binding;
    }

    public void setImageDrawable(Drawable drawable) {
        this.binding.iconIv.setImageDrawable(drawable);
        ImageView iconIv = this.binding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        ViewExtKt.showOrGoneByPresence(iconIv, drawable);
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int orientation) {
        throw new IllegalStateException("Avoid change orientation for button's");
    }

    public final void setSubText(CharSequence charSequence) {
        TextView subtitleTv = this.binding.subtitleTv;
        Intrinsics.checkNotNullExpressionValue(subtitleTv, "subtitleTv");
        if (charSequence == null || h.K(charSequence)) {
            charSequence = null;
        }
        TextViewExtKt.setTextOrGone(subtitleTv, charSequence);
    }

    public final void setSubtextColor(@NotNull ColorStateList color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.binding.subtitleTv.setTextColor(color);
    }

    public final void setText(CharSequence charSequence) {
        TextView titleTv = this.binding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        if (charSequence == null || h.K(charSequence)) {
            charSequence = null;
        }
        TextViewExtKt.setTextOrGone(titleTv, charSequence);
    }

    public final void setTextColor(@NotNull ColorStateList color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.binding.titleTv.setTextColor(color);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LargePaymentButtonView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        super.setOrientation(1);
        this.binding = PaymentButtonLargeUniBinding.bind(View.inflate(context, R$layout.payment_button_large_uni, this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LargePaymentButtonView, i11, i12);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        LargePaymentButtonAppearance largePaymentButtonAppearance = new LargePaymentButtonAppearance();
        largePaymentButtonAppearance.readAttribute(R$styleable.LargePaymentButtonView_srcCompat, obtainStyledAttributes);
        largePaymentButtonAppearance.readAttribute(R$styleable.LargePaymentButtonView_android_src, obtainStyledAttributes);
        largePaymentButtonAppearance.readAttribute(R$styleable.LargePaymentButtonView_textColor, obtainStyledAttributes);
        largePaymentButtonAppearance.readAttribute(R$styleable.LargePaymentButtonView_subtextColor, obtainStyledAttributes);
        largePaymentButtonAppearance.readAttribute(R$styleable.LargePaymentButtonView_text, obtainStyledAttributes);
        largePaymentButtonAppearance.readAttribute(R$styleable.LargePaymentButtonView_subtext, obtainStyledAttributes);
        largePaymentButtonAppearance.readAttribute(R$styleable.LargePaymentButtonView_titleTextAppearance, obtainStyledAttributes);
        largePaymentButtonAppearance.readAttribute(R$styleable.LargePaymentButtonView_subtitleTextAppearance, obtainStyledAttributes);
        largePaymentButtonAppearance.apply(this);
        obtainStyledAttributes.recycle();
    }
}

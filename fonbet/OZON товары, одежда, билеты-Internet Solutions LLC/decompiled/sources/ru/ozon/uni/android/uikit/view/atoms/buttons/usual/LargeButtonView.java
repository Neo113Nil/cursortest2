package ru.ozon.uni.android.uikit.view.atoms.buttons.usual;

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
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$layout;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikit.appearance.atom.LargeButtonAppearance;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.databinding.LargeButtonUniBinding;

@InterfaceC3999a
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010%\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010(\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$¨\u0006)"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "Landroid/widget/LinearLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/graphics/drawable/Drawable;", "drawable", "", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/content/res/ColorStateList;", "color", "setTextColor", "(Landroid/content/res/ColorStateList;)V", "setSubtextColor", "", "enabled", "setEnabled", "(Z)V", "Lru/ozon/uni/databinding/LargeButtonUniBinding;", "binding", "Lru/ozon/uni/databinding/LargeButtonUniBinding;", "getBinding", "()Lru/ozon/uni/databinding/LargeButtonUniBinding;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "text", "getSubText", "setSubText", "subText", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public class LargeButtonView extends LinearLayout implements AtomView {
    public static final int $stable = 8;

    @NotNull
    private final LargeButtonUniBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LargeButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final LargeButtonUniBinding getBinding() {
        return this.binding;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.binding.titleTv.setEnabled(enabled);
        this.binding.subtitleTv.setEnabled(enabled);
        this.binding.imageView.setEnabled(enabled);
    }

    public final void setImageDrawable(Drawable drawable) {
        ImageView imageView = this.binding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewExtKt.showOrGone(imageView, Boolean.valueOf(drawable != null));
        this.binding.imageView.setImageDrawable(drawable);
    }

    public final void setSubText(CharSequence charSequence) {
        TextView subtitleTv = this.binding.subtitleTv;
        Intrinsics.checkNotNullExpressionValue(subtitleTv, "subtitleTv");
        TextViewExtKt.setTextOrGone(subtitleTv, charSequence);
    }

    public final void setSubtextColor(@NotNull ColorStateList color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.binding.subtitleTv.setTextColor(color);
    }

    public final void setText(CharSequence charSequence) {
        this.binding.titleTv.setText(charSequence);
    }

    public final void setTextColor(@NotNull ColorStateList color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.binding.titleTv.setTextColor(color);
        this.binding.imageView.setImageTintList(color);
    }

    public /* synthetic */ LargeButtonView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LargeButtonView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = LargeButtonUniBinding.bind(View.inflate(context, R$layout.large_button_uni, this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LargeButtonView, i11, i12);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        LargeButtonAppearance largeButtonAppearance = new LargeButtonAppearance();
        largeButtonAppearance.readAttribute(R$styleable.LargeButtonView_textColor, obtainStyledAttributes);
        largeButtonAppearance.readAttribute(R$styleable.LargeButtonView_subtextColor, obtainStyledAttributes);
        largeButtonAppearance.readAttribute(R$styleable.LargeButtonView_text, obtainStyledAttributes);
        largeButtonAppearance.readAttribute(R$styleable.LargeButtonView_subtext, obtainStyledAttributes);
        largeButtonAppearance.readAttribute(R$styleable.LargeButtonView_titleTextAppearance, obtainStyledAttributes);
        largeButtonAppearance.readAttribute(R$styleable.LargeButtonView_subtitleTextAppearance, obtainStyledAttributes);
        largeButtonAppearance.apply(this);
        obtainStyledAttributes.recycle();
    }
}

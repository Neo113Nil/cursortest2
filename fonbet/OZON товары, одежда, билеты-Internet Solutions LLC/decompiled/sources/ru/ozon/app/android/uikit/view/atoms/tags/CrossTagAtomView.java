package ru.ozon.app.android.uikit.view.atoms.tags;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.R$styleable;
import ru.ozon.app.android.uikit.databinding.TagCrossBinding;
import ru.ozon.uni.R$dimen;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R.\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/tags/CrossTagAtomView;", "Landroid/widget/LinearLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onAttachedToWindow", "()V", "textColor", "setTextColor", "(I)V", "iconColor", "setCrossIconColor", "tintColor", "setTintColor", "(Ljava/lang/Integer;)V", "Landroid/widget/ImageView;", "getTagImage", "()Landroid/widget/ImageView;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "text", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "Lru/ozon/app/android/uikit/databinding/TagCrossBinding;", "binding", "Lru/ozon/app/android/uikit/databinding/TagCrossBinding;", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CrossTagAtomView extends LinearLayout implements AtomView {

    @NotNull
    private final TagCrossBinding binding;
    private CharSequence text;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CrossTagAtomView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final ImageView getTagImage() {
        ImageView tagImage = this.binding.tagImage;
        Intrinsics.checkNotNullExpressionValue(tagImage, "tagImage");
        return tagImage;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        layoutParams.height = ResourceExtKt.dim(context, R$dimen.atom_tag_height);
        setLayoutParams(layoutParams);
    }

    public final void setCrossIconColor(int iconColor) {
        ImageView crossCircleIv = this.binding.crossCircleIv;
        Intrinsics.checkNotNullExpressionValue(crossCircleIv, "crossCircleIv");
        ThemeExtKt.tint(crossCircleIv, Integer.valueOf(iconColor));
    }

    public final void setText(CharSequence charSequence) {
        this.text = charSequence;
        this.binding.tagTv.setText(charSequence);
    }

    public final void setTextColor(int textColor) {
        this.binding.tagTv.setTextColor(textColor);
    }

    public final void setTintColor(Integer tintColor) {
        ImageView tagImage = this.binding.tagImage;
        Intrinsics.checkNotNullExpressionValue(tagImage, "tagImage");
        ThemeExtKt.tint(tagImage, tintColor);
    }

    public /* synthetic */ CrossTagAtomView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossTagAtomView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = TagCrossBinding.inflate(LayoutInflater.from(context), this);
        ViewExtKt.updatePadding$default(this, ResourceExtKt.toPx(12), 0, ResourceExtKt.toPx(8), 0, 10, null);
        setBackgroundResource(R$drawable.o2_tag_cross);
        setOrientation(0);
        setGravity(16);
        setSelected(true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.CrossTag, i11, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            setText(obtainStyledAttributes.getString(R$styleable.CrossTag_android_text));
            obtainStyledAttributes.recycle();
        }
    }
}

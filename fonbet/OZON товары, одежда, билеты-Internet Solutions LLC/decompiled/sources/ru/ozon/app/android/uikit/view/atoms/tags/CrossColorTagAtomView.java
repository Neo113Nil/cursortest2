package ru.ozon.app.android.uikit.view.atoms.tags;

import Sc.InterfaceC3999a;
import V.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.R$layout;
import ru.ozon.app.android.uikit.R$styleable;
import ru.ozon.app.android.uikit.databinding.TagCrossColorBinding;
import ru.ozon.uni.R$dimen;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/tags/CrossColorTagAtomView;", "Landroid/widget/LinearLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "", "colorIntToHex", "(I)Ljava/lang/String;", "", "enabled", "", "setEnabled", "(Z)V", "onAttachedToWindow", "()V", "setColor", "(Ljava/lang/String;)V", "_color", "Ljava/lang/String;", "Lru/ozon/app/android/uikit/databinding/TagCrossColorBinding;", "binding", "Lru/ozon/app/android/uikit/databinding/TagCrossColorBinding;", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CrossColorTagAtomView extends LinearLayout implements AtomView {

    @NotNull
    private String _color;

    @NotNull
    private final TagCrossColorBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CrossColorTagAtomView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final String colorIntToHex(int color) {
        return e.b(new Object[]{Integer.valueOf(color & 16777215)}, 1, "#%08X", "format(...)");
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

    public final void setColor(@NotNull String color) {
        int i11;
        Intrinsics.checkNotNullParameter(color, "color");
        this._color = color;
        Drawable background = this.binding.colorView.getBackground();
        Intrinsics.g(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        try {
            i11 = Color.parseColor(color);
        } catch (Exception unused) {
            i11 = CrossColorTagAtomViewKt.DEFAULT_COLOR;
        }
        gradientDrawable.setColor(i11);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.binding.colorView.setAlpha(enabled ? 1.0f : 0.4f);
    }

    public /* synthetic */ CrossColorTagAtomView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossColorTagAtomView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        int i12;
        int color;
        int i13;
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = TagCrossColorBinding.bind(View.inflate(context, R$layout.tag_cross_color, this));
        ViewExtKt.updatePadding$default(this, ResourceExtKt.toPx(5.5d), 0, ResourceExtKt.toPx(8), 0, 10, null);
        setBackgroundResource(R$drawable.o2_tag_cross_color);
        setOrientation(0);
        setGravity(16);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.CrossColorTag, i11, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            int i14 = R$styleable.CrossColorTag_android_color;
            i13 = CrossColorTagAtomViewKt.DEFAULT_COLOR;
            color = obtainStyledAttributes.getColor(i14, a.getColor(context, i13));
            obtainStyledAttributes.recycle();
        } else {
            i12 = CrossColorTagAtomViewKt.DEFAULT_COLOR;
            color = a.getColor(context, i12);
        }
        String colorIntToHex = colorIntToHex(color);
        setColor(colorIntToHex);
        this._color = colorIntToHex;
    }
}

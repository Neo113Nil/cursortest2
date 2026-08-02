package ru.ozon.uni.android.uikit.view.atoms.avatar;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$layout;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.databinding.AvatarUniBinding;

@InterfaceC3999a
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J)\u0010#\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u00182\b\b\u0001\u0010\"\u001a\u00020\u00072\b\b\u0001\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$R\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\"\u0010*\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/avatar/AvatarView;", "Landroid/widget/FrameLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "radius", "", "setBackgroundCornersRadius", "(Landroid/widget/TextView;I)V", "onAttachedToWindow", "()V", "left", "top", "right", "bottom", "setIconPadding", "(IIII)V", "", "iconUrl", "tintColor", "backgroundColor", "showIcon", "(Ljava/lang/String;Ljava/lang/Integer;I)V", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "initials", "textSize", "showInitials", "(Ljava/lang/String;II)V", "Lru/ozon/uni/databinding/AvatarUniBinding;", "binding", "Lru/ozon/uni/databinding/AvatarUniBinding;", "getBinding", "()Lru/ozon/uni/databinding/AvatarUniBinding;", "size", "I", "getSize", "()I", "setSize", "(I)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AvatarView extends FrameLayout implements AtomView {

    @NotNull
    private final AvatarUniBinding binding;
    private int size;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvatarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setBackgroundCornersRadius(TextView textView, int i11) {
        Drawable background = textView.getBackground();
        Intrinsics.g(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setCornerRadius(i11);
    }

    @NotNull
    public final AvatarUniBinding getBinding() {
        return this.binding;
    }

    @NotNull
    public final ImageView getIcon() {
        ImageView iconIv = this.binding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        return iconIv;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.size != 0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int i11 = this.size;
            layoutParams.width = i11;
            layoutParams.height = i11;
            setLayoutParams(layoutParams);
        }
        int i12 = this.size;
        if (i12 == 0) {
            i12 = getWidth();
        }
        if (i12 != 0) {
            TextView initialsTv = this.binding.initialsTv;
            Intrinsics.checkNotNullExpressionValue(initialsTv, "initialsTv");
            setBackgroundCornersRadius(initialsTv, i12);
        }
    }

    public final void setIconPadding(int left, int top, int right, int bottom) {
        this.binding.iconIv.setPadding(left, top, right, bottom);
    }

    public final void setSize(int i11) {
        this.size = i11;
    }

    public final void showIcon(@NotNull String iconUrl, Integer tintColor, int backgroundColor) {
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        ImageView imageView = this.binding.iconIv;
        Intrinsics.f(imageView);
        ViewExtKt.show(imageView);
        if (ExtensionsKt.isUrl(iconUrl)) {
            imageView.clearColorFilter();
        } else {
            ThemeExtKt.tint(imageView, tintColor);
        }
        Drawable background = imageView.getBackground();
        Intrinsics.g(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setColor(backgroundColor);
        TextView initialsTv = this.binding.initialsTv;
        Intrinsics.checkNotNullExpressionValue(initialsTv, "initialsTv");
        ViewExtKt.gone(initialsTv);
    }

    public final void showInitials(@NotNull String initials, int textSize, int backgroundColor) {
        Intrinsics.checkNotNullParameter(initials, "initials");
        TextView textView = this.binding.initialsTv;
        Intrinsics.f(textView);
        ViewExtKt.show(textView);
        textView.setText(initials);
        textView.setTextSize(textSize);
        Drawable background = textView.getBackground();
        Intrinsics.g(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setColor(backgroundColor);
        ImageView iconIv = this.binding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        ViewExtKt.gone(iconIv);
    }

    public /* synthetic */ AvatarView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = AvatarUniBinding.bind(View.inflate(context, R$layout.avatar_uni, this));
    }
}

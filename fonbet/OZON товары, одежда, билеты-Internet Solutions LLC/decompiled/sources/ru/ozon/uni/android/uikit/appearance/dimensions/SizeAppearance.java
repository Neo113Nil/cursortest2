package ru.ozon.uni.android.uikit.appearance.dimensions;

import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikit.appearance.AttributesAppearance;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u0018*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016R\u0012\u0010\u0006\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/uni/android/uikit/appearance/dimensions/SizeAppearance;", "T", "Landroid/view/View;", "Lru/ozon/uni/android/uikit/appearance/AttributesAppearance;", "<init>", "()V", "height", "", "width", "minHeight", "minWidth", "styleableId", "", "getStyleableId", "()[I", "readAttribute", "", "attr", "typedAttributes", "Landroid/content/res/TypedArray;", "apply", "view", "(Landroid/view/View;)V", "reset", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SizeAppearance<T extends View> extends AttributesAppearance<T> {
    public static final int $stable = 8;
    private int height = -1;
    private int width = -1;
    private int minHeight = -1;
    private int minWidth = -1;

    @Override // ru.ozon.uni.android.uikit.appearance.StyleAppearance
    public void apply(@NotNull T view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.height >= 0 || this.width >= 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = ExtensionsKt.coerceValue(this.height, layoutParams.height);
            layoutParams.width = ExtensionsKt.coerceValue(this.width, layoutParams.width);
        }
        if (this.minHeight >= 0) {
            view.setMinimumWidth(this.minWidth);
        }
        int i11 = this.minHeight;
        if (i11 >= 0) {
            view.setMinimumHeight(i11);
        }
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    @NotNull
    protected int[] getStyleableId() {
        int[] Size = R$styleable.Size;
        Intrinsics.checkNotNullExpressionValue(Size, "Size");
        return Size;
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    public void readAttribute(int attr, @NotNull TypedArray typedAttributes) {
        Intrinsics.checkNotNullParameter(typedAttributes, "typedAttributes");
        if (attr == R$styleable.Size_android_layout_height) {
            this.height = typedAttributes.getDimensionPixelSize(attr, -1);
            return;
        }
        if (attr == R$styleable.Size_android_layout_width) {
            this.width = typedAttributes.getDimensionPixelSize(attr, -1);
        } else if (attr == R$styleable.Size_android_minHeight) {
            this.minHeight = typedAttributes.getDimensionPixelSize(attr, -1);
        } else if (attr == R$styleable.Size_android_minWidth) {
            this.minWidth = typedAttributes.getDimensionPixelSize(attr, -1);
        }
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    public void reset() {
        this.height = -1;
        this.width = -1;
        this.minHeight = -1;
        this.minWidth = -1;
    }
}

package ru.ozon.uni.android.uikit.appearance.dimensions;

import android.content.res.TypedArray;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikit.appearance.AttributesAppearance;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001dB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0015\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0015H\u0016R\u0012\u0010\u0006\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lru/ozon/uni/android/uikit/appearance/dimensions/PaddingAppearance;", "T", "Landroid/view/View;", "Lru/ozon/uni/android/uikit/appearance/AttributesAppearance;", "<init>", "()V", "left", "", "top", "right", "bottom", "all", "vertical", "horizontal", "start", "end", "styleableId", "", "getStyleableId", "()[I", "readAttribute", "", "attr", "typedAttributes", "Landroid/content/res/TypedArray;", "apply", "view", "(Landroid/view/View;)V", "reset", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaddingAppearance<T extends View> extends AttributesAppearance<T> {
    public static final int $stable = 8;
    private int left = -1;
    private int top = -1;
    private int right = -1;
    private int bottom = -1;
    private int all = -1;
    private int vertical = -1;
    private int horizontal = -1;
    private int start = -1;
    private int end = -1;

    @Override // ru.ozon.uni.android.uikit.appearance.StyleAppearance
    public void apply(@NotNull T view) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(view, "view");
        int i13 = this.all;
        if (i13 >= 0) {
            this.start = i13;
            this.top = i13;
            this.end = i13;
            this.bottom = i13;
        } else {
            int i14 = this.vertical;
            if (i14 >= 0) {
                this.top = i14;
                this.bottom = i14;
            }
            int i15 = this.horizontal;
            if (i15 >= 0) {
                this.start = i15;
                this.end = i15;
            }
        }
        if (this.start == -1 && (i12 = this.left) >= 0) {
            this.start = i12;
        }
        if (this.end == -1 && (i11 = this.right) >= 0) {
            this.end = i11;
        }
        int i16 = this.start;
        if (i16 >= 0 || this.top >= 0 || this.end >= 0 || this.bottom >= 0) {
            view.setPaddingRelative(ExtensionsKt.coerceValue(i16, view.getPaddingStart()), ExtensionsKt.coerceValue(this.top, view.getPaddingTop()), ExtensionsKt.coerceValue(this.end, view.getPaddingEnd()), ExtensionsKt.coerceValue(this.bottom, view.getPaddingBottom()));
        }
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    @NotNull
    protected int[] getStyleableId() {
        int[] Padding = R$styleable.Padding;
        Intrinsics.checkNotNullExpressionValue(Padding, "Padding");
        return Padding;
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    public void readAttribute(int attr, @NotNull TypedArray typedAttributes) {
        Intrinsics.checkNotNullParameter(typedAttributes, "typedAttributes");
        if (attr == R$styleable.Padding_android_padding) {
            this.all = typedAttributes.getDimensionPixelSize(attr, -1);
            return;
        }
        if (attr == R$styleable.Padding_android_paddingVertical) {
            this.vertical = typedAttributes.getDimensionPixelSize(attr, -1);
            return;
        }
        if (attr == R$styleable.Padding_android_paddingHorizontal) {
            this.horizontal = typedAttributes.getDimensionPixelSize(attr, -1);
            return;
        }
        if (attr == R$styleable.Padding_android_paddingStart) {
            this.start = typedAttributes.getDimensionPixelSize(attr, -1);
            return;
        }
        if (attr == R$styleable.Padding_android_paddingLeft) {
            this.left = typedAttributes.getDimensionPixelSize(attr, -1);
            return;
        }
        if (attr == R$styleable.Padding_android_paddingTop) {
            this.top = typedAttributes.getDimensionPixelSize(attr, -1);
            return;
        }
        if (attr == R$styleable.Padding_android_paddingEnd) {
            this.end = typedAttributes.getDimensionPixelSize(attr, -1);
        } else if (attr == R$styleable.Padding_android_paddingRight) {
            this.right = typedAttributes.getDimensionPixelSize(attr, -1);
        } else if (attr == R$styleable.Padding_android_paddingBottom) {
            this.bottom = typedAttributes.getDimensionPixelSize(attr, -1);
        }
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    public void reset() {
        this.top = -1;
        this.bottom = -1;
        this.start = -1;
        this.end = -1;
        this.right = -1;
        this.left = -1;
        this.all = -1;
        this.horizontal = -1;
        this.vertical = -1;
    }
}

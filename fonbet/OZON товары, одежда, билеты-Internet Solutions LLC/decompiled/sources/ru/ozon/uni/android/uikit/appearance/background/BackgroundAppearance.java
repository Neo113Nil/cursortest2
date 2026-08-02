package ru.ozon.uni.android.uikit.appearance.background;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikit.appearance.AttributesAppearance;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u000eH\u0016R\u0014\u0010\u0006\u001a\u00020\u00078TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/android/uikit/appearance/background/BackgroundAppearance;", "T", "Landroid/view/View;", "Lru/ozon/uni/android/uikit/appearance/AttributesAppearance;", "<init>", "()V", "styleableId", "", "getStyleableId", "()[I", "foreground", "Landroid/graphics/drawable/Drawable;", "background", "readAttribute", "", "attr", "", "typedAttributes", "Landroid/content/res/TypedArray;", "apply", "view", "(Landroid/view/View;)V", "reset", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BackgroundAppearance<T extends View> extends AttributesAppearance<T> {
    private Drawable background;
    private Drawable foreground;

    @Override // ru.ozon.uni.android.uikit.appearance.StyleAppearance
    public void apply(@NotNull T view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Drawable drawable = this.background;
        if (drawable != null) {
            view.setBackground(drawable);
        }
        Drawable drawable2 = this.foreground;
        if (drawable2 != null) {
            view.setForeground(drawable2);
        }
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    @NotNull
    protected int[] getStyleableId() {
        int[] Background = R$styleable.Background;
        Intrinsics.checkNotNullExpressionValue(Background, "Background");
        return Background;
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    public void readAttribute(int attr, @NotNull TypedArray typedAttributes) {
        Intrinsics.checkNotNullParameter(typedAttributes, "typedAttributes");
        if (attr == R$styleable.Background_android_foreground) {
            this.foreground = typedAttributes.getDrawable(attr);
        } else if (attr == R$styleable.Background_android_background) {
            this.background = typedAttributes.getDrawable(attr);
        }
    }

    @Override // ru.ozon.uni.android.uikit.appearance.AttributesAppearance
    public void reset() {
        this.foreground = null;
        this.background = null;
    }
}

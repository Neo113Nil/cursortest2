package ru.ozon.uni.android.uikit.appearance;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u0015*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0015B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u000bH&R\u0012\u0010\u0006\u001a\u00020\u0007X¤\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/android/uikit/appearance/AttributesAppearance;", "T", "Landroid/view/View;", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "<init>", "()V", "styleableId", "", "getStyleableId", "()[I", "read", "", "context", "Landroid/content/Context;", "resId", "", "readAttribute", "attr", "typedAttributes", "Landroid/content/res/TypedArray;", "reset", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class AttributesAppearance<T extends View> implements StyleAppearance<T> {
    @NotNull
    protected abstract int[] getStyleableId();

    @Override // ru.ozon.uni.android.uikit.appearance.StyleAppearance
    public void read(@NotNull Context context, int resId) {
        Intrinsics.checkNotNullParameter(context, "context");
        reset();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resId, getStyleableId());
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            readAttribute(obtainStyledAttributes.getIndex(i11), obtainStyledAttributes);
        }
        obtainStyledAttributes.recycle();
    }

    public abstract void readAttribute(int attr, @NotNull TypedArray typedAttributes);

    public abstract void reset();
}

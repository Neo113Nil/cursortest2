package ru.ozon.uni.android.atom.image;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;

@InterfaceC3999a
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0014J\u001a\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u001d\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/uni/android/atom/image/ImageFixed;", "Lru/ozon/uni/android/atom/image/Image;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imageWidth", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "setImageSize", "width", "ratio", "Lru/ozon/uni/atoms/data/image/ImageAspectRatio;", "setPadding", "top", "Lru/ozon/uni/atoms/data/cell/CellLayoutPadding;", "bottom", "setPadding-iecL5Sw", "(II)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageFixed extends Image implements AtomView {
    private int imageWidth;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageFixed(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.uni.android.atom.image.Image, android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        if (size < this.imageWidth) {
            this.imageWidth = size;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.imageWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(calculateHeight(this.imageWidth), 1073741824));
    }

    public final void setImageSize(int width, @NotNull ImageAspectRatio ratio) {
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        this.imageWidth = UiExtKt.toPx(width);
        setAspectRatio(ratio);
        requestLayout();
    }

    /* renamed from: setPadding-iecL5Sw, reason: not valid java name */
    public final void m1674setPaddingiecL5Sw(int top, int bottom) {
        setPadding(0, (int) getResources().getDimension(top), 0, (int) getResources().getDimension(bottom));
    }

    public /* synthetic */ ImageFixed(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageFixed(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setFixedMode(true);
        this.imageWidth = UiExtKt.toPx(168);
    }
}

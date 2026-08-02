package ru.ozon.uni.android.atom.image;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.image.CornerRadius;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.utils.AtomLocatableView;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 X2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001XB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0004¢\u0006\u0004\b\u0015\u0010\u000eJ\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u0013J\u001d\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010'\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020 ¢\u0006\u0004\b%\u0010&R*\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020(8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00100\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u00106\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00168\u0004@DX\u0084\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010\u0019R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R*\u0010?\u001a\u00020>2\u0006\u0010)\u001a\u00020>8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00101R\u0014\u0010F\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u00101R\u0014\u0010G\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bG\u00101R\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010JR*\u0010P\u001a\u00020O2\u0006\u0010)\u001a\u00020O8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010V\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010@\u001a\u0004\bV\u0010B\"\u0004\bW\u0010D¨\u0006Y"}, d2 = {"Lru/ozon/uni/android/atom/image/Image;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "specWidth", "calculateWidth", "(I)I", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "calculatedWidth", "calculateHeight", "Lru/ozon/uni/atoms/data/image/ImageAspectRatio;", "ratio", "setRatio", "(Lru/ozon/uni/atoms/data/image/ImageAspectRatio;)V", "widthRatio", "heightRatio", "setCustomRatio", "width", "setSize", "(ILru/ozon/uni/atoms/data/image/ImageAspectRatio;)V", "Lru/ozon/uni/atoms/data/cell/CellLayoutPadding;", "left", "up", "right", "bottom", "setPadding-BzXJzOA", "(IIII)V", "setPadding", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "imageBackgroundColor", "I", "getImageBackgroundColor", "()I", "setImageBackgroundColor", "(I)V", "aspectRatio", "Lru/ozon/uni/atoms/data/image/ImageAspectRatio;", "getAspectRatio", "()Lru/ozon/uni/atoms/data/image/ImageAspectRatio;", "setAspectRatio", "", "aspectRatioFloat", "F", "", "hasParanja", "Z", "getHasParanja", "()Z", "setHasParanja", "(Z)V", "imageWidth", "paranjaColor", "transparentColor", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Landroid/graphics/drawable/LayerDrawable;", "layerBackgroundDrawable", "Landroid/graphics/drawable/LayerDrawable;", "parandjaDrawable", "Lru/ozon/uni/atoms/data/image/CornerRadius;", "cornerRadius", "Lru/ozon/uni/atoms/data/image/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/image/CornerRadius;", "setCornerRadius", "(Lru/ozon/uni/atoms/data/image/CornerRadius;)V", "isFixedMode", "setFixedMode", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public class Image extends AppCompatImageView implements AtomView, AtomLocatableView {

    @NotNull
    private ImageAspectRatio aspectRatio;
    private float aspectRatioFloat;

    @NotNull
    private final GradientDrawable backgroundDrawable;

    @NotNull
    private CornerRadius cornerRadius;
    private boolean hasParanja;
    private int imageBackgroundColor;
    private int imageWidth;
    private boolean isFixedMode;

    @NotNull
    private final LayerDrawable layerBackgroundDrawable;

    @NotNull
    private String locatorTag;

    @NotNull
    private final GradientDrawable parandjaDrawable;
    private final int paranjaColor;
    private final int transparentColor;
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Image(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int calculateWidth(int specWidth) {
        if (!this.isFixedMode || (this instanceof ImageFixed)) {
            return specWidth;
        }
        if (specWidth != 0 && specWidth < this.imageWidth) {
            this.imageWidth = specWidth;
        }
        return this.imageWidth;
    }

    protected final int calculateHeight(int calculatedWidth) {
        return C6915b.c(calculatedWidth / this.aspectRatioFloat);
    }

    @NotNull
    protected final ImageAspectRatio getAspectRatio() {
        return this.aspectRatio;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int calculateWidth = calculateWidth(View.MeasureSpec.getSize(widthMeasureSpec));
        setMeasuredDimension(calculateWidth, calculateHeight(calculateWidth));
    }

    protected final void setAspectRatio(@NotNull ImageAspectRatio value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.aspectRatio = value;
        this.aspectRatioFloat = value.getValue();
    }

    public final void setCornerRadius(@NotNull CornerRadius value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.cornerRadius = value;
        float pxF = UiExtKt.toPxF(value.getPx());
        this.backgroundDrawable.setCornerRadius(pxF);
        this.parandjaDrawable.setCornerRadius(pxF);
    }

    public final void setCustomRatio(int widthRatio, int heightRatio) {
        this.aspectRatioFloat = widthRatio / heightRatio;
        requestLayout();
    }

    public final void setFixedMode(boolean z11) {
        this.isFixedMode = z11;
    }

    public final void setHasParanja(boolean z11) {
        this.hasParanja = z11;
        if (z11) {
            this.parandjaDrawable.setColor(this.paranjaColor);
        } else {
            this.parandjaDrawable.setColor(this.transparentColor);
        }
    }

    public final void setImageBackgroundColor(int i11) {
        this.imageBackgroundColor = i11;
        this.backgroundDrawable.setColor(i11);
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
    }

    /* renamed from: setPadding-BzXJzOA, reason: not valid java name */
    public final void m1673setPaddingBzXJzOA(int left, int up, int right, int bottom) {
        setPadding((int) getResources().getDimension(left), (int) getResources().getDimension(up), (int) getResources().getDimension(right), (int) getResources().getDimension(bottom));
    }

    public final void setRatio(@NotNull ImageAspectRatio ratio) {
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        setAspectRatio(ratio);
        requestLayout();
    }

    public final void setSize(int width, @NotNull ImageAspectRatio ratio) {
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        this.imageWidth = UiExtKt.toPx(width);
        setAspectRatio(ratio);
        requestLayout();
    }

    public /* synthetic */ Image(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Image(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.locatorTag = "image";
        this.imageBackgroundColor = a.getColor(context, R.color.transparent);
        ImageAspectRatio imageAspectRatio = ImageAspectRatio.RATIO_1_1;
        this.aspectRatio = imageAspectRatio;
        this.aspectRatioFloat = imageAspectRatio.getValue();
        this.imageWidth = UiExtKt.toPx(168);
        this.paranjaColor = a.getColor(context, R$color.layer_overlay_paranja);
        this.transparentColor = a.getColor(context, R.color.transparent);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.backgroundDrawable = gradientDrawable;
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{gradientDrawable});
        this.layerBackgroundDrawable = layerDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.parandjaDrawable = gradientDrawable2;
        this.cornerRadius = CornerRadius.NO_RADIUS;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Image);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setCornerRadius(((CornerRadius[]) CornerRadius.getEntries().toArray(new CornerRadius[0]))[obtainStyledAttributes.getInt(R$styleable.Image_imageCornerRadius, ru.ozon.uni.atoms.data.common.CornerRadius.NO_RADIUS.ordinal())]);
        setAspectRatio(((ImageAspectRatio[]) ImageAspectRatio.getEntries().toArray(new ImageAspectRatio[0]))[obtainStyledAttributes.getInt(R$styleable.Image_aspectRatioImageAtom, imageAspectRatio.ordinal())]);
        setHasParanja(obtainStyledAttributes.getBoolean(R$styleable.Image_hasParanja, false));
        int color = obtainStyledAttributes.getColor(R$styleable.Image_android_background, 0);
        if (color != 0) {
            setImageBackgroundColor(color);
        }
        obtainStyledAttributes.recycle();
        setBackground(layerDrawable);
        setForeground(gradientDrawable2);
        setClipToOutline(true);
        setContentDescription(getLocatorTag());
    }
}

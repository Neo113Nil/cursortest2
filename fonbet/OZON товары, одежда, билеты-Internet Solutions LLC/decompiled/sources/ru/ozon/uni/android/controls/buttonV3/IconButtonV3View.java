package ru.ozon.uni.android.controls.buttonV3;

import Sc.o;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.core.content.a;
import androidx.core.graphics.drawable.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.atom.loader.data.LoaderSize;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.common.gradient.OzGradientOrientationMapperKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TypedArrayExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.android.uikitsdk.resources.TokenizedResource;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTOKt;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u0087\u00012\u00020\u00012\u00020\u0002:\u0002\u0087\u0001B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010%J\u001b\u0010)\u001a\u00020\u000e*\u00020\u001d2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u00020\u000e2\b\b\u0001\u0010+\u001a\u00020\u0007H\u0002¢\u0006\u0004\b,\u0010#J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u0007H\u0002¢\u0006\u0004\b.\u0010#R\u0014\u0010/\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R*\u0010:\u001a\u0002082\u0006\u00109\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010A\u001a\u00020@2\u0006\u00109\u001a\u00020@8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR*\u0010G\u001a\u00020\u00132\u0006\u00109\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010M\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010H\u001a\u0004\bN\u0010J\"\u0004\bO\u0010LR*\u0010Q\u001a\u00020P2\u0006\u00109\u001a\u00020P8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR.\u0010X\u001a\u0004\u0018\u00010W2\b\u00109\u001a\u0004\u0018\u00010W8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R*\u0010^\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b^\u00100\u001a\u0004\b_\u0010`\"\u0004\ba\u0010#R\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR.\u0010f\u001a\u0004\u0018\u00010e2\b\u00109\u001a\u0004\u0018\u00010e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0018\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR(\u0010o\u001a\u0004\u0018\u00010'2\b\u00109\u001a\u0004\u0018\u00010'8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bo\u0010p\"\u0004\bq\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010v\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010uR\u0018\u0010x\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010~\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0080\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010HR\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0086\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010`¨\u0006\u0088\u0001"}, d2 = {"Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "Landroid/view/ViewGroup;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "styleRes", "applyStyle", "(I)V", "showHoverIfEnabled", "()V", "hideHover", "Landroid/graphics/Bitmap;", "icon", "drawIcon", "(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;)V", "color", "setIconColorFilter", "opacity", "setOpacity", "transparentColor", "I", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;", "shape", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;", "getShape", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;", "setShape", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;)V", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "size", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;", "getSize", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;", "setSize", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "style", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "getStyle", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "setStyle", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;)V", "disabled", "Z", "getDisabled", "()Z", "setDisabled", "(Z)V", "hoverDisabled", "getHoverDisabled", "setHoverDisabled", "Lru/ozon/uni/android/uikitsdk/Color;", "backColor", "Lru/ozon/uni/android/uikitsdk/Color;", "getBackColor", "()Lru/ozon/uni/android/uikitsdk/Color;", "setBackColor", "(Lru/ozon/uni/android/uikitsdk/Color;)V", "Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "iconDrawable", "Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "getIconDrawable", "()Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "setIconDrawable", "(Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;)V", "iconColor", "getIconColor", "()I", "setIconColor", "Landroid/graphics/Shader;", "graphicGradientShader", "Landroid/graphics/Shader;", "Lru/ozon/uni/core/UniGradient;", "graphicGradient", "Lru/ozon/uni/core/UniGradient;", "getGraphicGradient", "()Lru/ozon/uni/core/UniGradient;", "setGraphicGradient", "(Lru/ozon/uni/core/UniGradient;)V", "Landroid/graphics/ComposeShader;", "bitmapGradientShader", "Landroid/graphics/ComposeShader;", "iconBitmap", "Landroid/graphics/Bitmap;", "setIconBitmap", "(Landroid/graphics/Bitmap;)V", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "foregroundDrawable", "Landroid/graphics/ColorFilter;", "iconColorFilter", "Landroid/graphics/ColorFilter;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "loaderView", "Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "isLoading", "Lru/ozon/uni/android/atom/loader/data/LoaderSize;", "getLoaderSize", "()Lru/ozon/uni/android/atom/loader/data/LoaderSize;", "loaderSize", "getLoaderOffset", "loaderOffset", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IconButtonV3View extends ViewGroup implements AtomView {

    @NotNull
    private Color backColor;

    @NotNull
    private final GradientDrawable backgroundDrawable;
    private ComposeShader bitmapGradientShader;
    private boolean disabled;

    @NotNull
    private final GradientDrawable foregroundDrawable;
    private UniGradient graphicGradient;
    private Shader graphicGradientShader;
    private boolean hoverDisabled;
    private Bitmap iconBitmap;
    private int iconColor;
    private ColorFilter iconColorFilter;
    private DrawableResource iconDrawable;
    private boolean isLoading;
    private LoaderView loaderView;

    @NotNull
    private final Paint paint;

    @NotNull
    private IconButtonV3DTO.IconButtonShape shape;

    @NotNull
    private IconButtonV3DTO.Sizes size;

    @NotNull
    private ButtonV3DTO.StyleTypes style;
    private final int transparentColor;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[IconButtonV3DTO.IconButtonShape.values().length];
            try {
                iArr[IconButtonV3DTO.IconButtonShape.SHAPE_CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconButtonV3DTO.IconButtonShape.SHAPE_SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconButtonV3DTO.IconButtonShape.SHAPE_SQUARE_FORCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IconButtonV3DTO.Sizes.values().length];
            try {
                iArr2[IconButtonV3DTO.Sizes.SIZE_300.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IconButtonV3DTO.Sizes.SIZE_400.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconButtonV3View(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawIcon(Canvas canvas, Bitmap bitmap) {
        Canvas canvas2;
        float measuredWidth = (getMeasuredWidth() - bitmap.getWidth()) / 2.0f;
        float width = bitmap.getWidth();
        ComposeShader composeShader = this.bitmapGradientShader;
        if (composeShader == null) {
            Paint paint = this.paint;
            paint.setColorFilter(this.iconColorFilter);
            Unit unit = Unit.f71690a;
            canvas.drawBitmap(bitmap, measuredWidth, measuredWidth, paint);
            return;
        }
        int save = canvas.save();
        canvas.translate(measuredWidth, measuredWidth);
        try {
            Paint paint2 = this.paint;
            paint2.setColorFilter(null);
            paint2.setShader(composeShader);
            Unit unit2 = Unit.f71690a;
            canvas2 = canvas;
            try {
                canvas2.drawRect(0.0f, 0.0f, width, width, paint2);
                canvas2.restoreToCount(save);
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                canvas2.restoreToCount(save);
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            canvas2 = canvas;
        }
    }

    private final int getLoaderOffset() {
        return UiExtKt.toPx(getLoaderSize() == LoaderSize.LOADER_200 ? 16 : 24) / 2;
    }

    private final LoaderSize getLoaderSize() {
        int i11 = WhenMappings.$EnumSwitchMapping$1[this.size.ordinal()];
        return (i11 == 1 || i11 == 2) ? LoaderSize.LOADER_200 : LoaderSize.LOADER_300;
    }

    private final void hideHover() {
        setForeground(null);
    }

    private final void setIconBitmap(Bitmap bitmap) {
        Shader shader;
        this.iconBitmap = bitmap;
        ComposeShader composeShader = null;
        if (bitmap != null && (shader = this.graphicGradientShader) != null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            composeShader = new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), shader, PorterDuff.Mode.SRC_IN);
        }
        this.bitmapGradientShader = composeShader;
    }

    private final void setIconColorFilter(int color) {
        DrawableResource drawableResource = this.iconDrawable;
        this.iconColorFilter = (drawableResource == null || !drawableResource.getIsMulticolor()) ? new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN) : null;
    }

    private final void setOpacity(int opacity) {
        this.paint.setAlpha(opacity);
    }

    private final void showHoverIfEnabled() {
        if (this.hoverDisabled) {
            return;
        }
        setForeground(this.foregroundDrawable);
    }

    public final void applyStyle(int styleRes) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int[] IconButtonV3View = R$styleable.IconButtonV3View;
        Intrinsics.checkNotNullExpressionValue(IconButtonV3View, "IconButtonV3View");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(styleRes, IconButtonV3View);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setBackColor(TypedArrayExtKt.getGradientOrColor(obtainStyledAttributes, context2, R$styleable.IconButtonV3View_backgroundGradient, R$styleable.IconButtonV3View_backgroundColor, this.transparentColor));
        setIconColor(obtainStyledAttributes.getColor(R$styleable.IconButtonV3View_iconColor, this.transparentColor));
        obtainStyledAttributes.recycle();
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final int getIconColor() {
        return this.iconColor;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.isLoading || (bitmap = this.iconBitmap) == null) {
            return;
        }
        drawIcon(canvas, bitmap);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        LoaderView loaderView;
        if (!this.isLoading || (loaderView = this.loaderView) == null) {
            return;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - getLoaderOffset();
        int measuredHeight = (getMeasuredHeight() / 2) + getLoaderOffset();
        loaderView.layout(measuredWidth, measuredWidth, measuredHeight, measuredHeight);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int px = UiExtKt.toPx(this.size.getSize());
        setMeasuredDimension(px, px);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (this.disabled) {
            return super.onTouchEvent(event);
        }
        Integer valueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if ((valueOf != null && valueOf.intValue() == 0) || (valueOf != null && valueOf.intValue() == 2)) {
            showHoverIfEnabled();
        } else if (valueOf != null && valueOf.intValue() == 1) {
            hideHover();
            performClick();
        } else if (valueOf != null && valueOf.intValue() == 3) {
            hideHover();
        }
        return true;
    }

    public final void setBackColor(@NotNull Color value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.backColor = value;
        value.applyTo(this.backgroundDrawable);
    }

    public final void setDisabled(boolean z11) {
        this.disabled = z11;
        if (!z11) {
            setOpacity(255);
        } else {
            applyStyle(R$style.IconButtonV3View_Disabled);
            setOpacity(102);
        }
    }

    public final void setGraphicGradient(UniGradient uniGradient) {
        LinearGradient linearGradient;
        this.graphicGradient = uniGradient;
        if (uniGradient != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Color.Gradient gradient = TokensExtKt.toGradient(uniGradient, context);
            GradientDrawable.Orientation orientation = gradient.getOrientation();
            Bitmap bitmap = this.iconBitmap;
            float[] coordinates = OzGradientOrientationMapperKt.getCoordinates(orientation, bitmap != null ? bitmap.getWidth() : UiExtKt.toPx(IconDTO.IconSize.SIZE_300.getSize()));
            linearGradient = new LinearGradient(coordinates[0], coordinates[1], coordinates[2], coordinates[3], gradient.getColors(), gradient.getPositions(), Shader.TileMode.CLAMP);
        } else {
            linearGradient = null;
        }
        this.graphicGradientShader = linearGradient;
    }

    public final void setHoverDisabled(boolean z11) {
        this.hoverDisabled = z11;
    }

    public final void setIconColor(int i11) {
        this.iconColor = i11;
        this.foregroundDrawable.setColor(i11);
        setIconColorFilter(this.iconColor);
    }

    public final void setIconDrawable(DrawableResource drawableResource) {
        this.iconDrawable = drawableResource;
        Bitmap bitmap = null;
        if (drawableResource != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Drawable drawable = (Drawable) TokenizedResource.DefaultImpls.getValue$default(drawableResource, context, null, 2, null);
            if (drawable != null) {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmap = b.b(drawable, 0, 0, 3);
            }
        }
        setIconBitmap(bitmap);
        setIconColorFilter(this.iconColor);
    }

    public final void setShape(@NotNull IconButtonV3DTO.IconButtonShape iconButtonShape) {
        Intrinsics.checkNotNullParameter(iconButtonShape, "<set-?>");
        this.shape = iconButtonShape;
    }

    public final void setSize(@NotNull IconButtonV3DTO.Sizes value) {
        int size;
        Intrinsics.checkNotNullParameter(value, "value");
        this.size = value;
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.shape.ordinal()];
        if (i11 == 1) {
            size = this.size.getSize();
        } else if (i11 == 2) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            size = UniGlobalConfigKt.getRoundCornersFlag(context) ? this.size.getSize() : this.size.getCornerRadius();
        } else {
            if (i11 != 3) {
                throw new o();
            }
            size = this.size.getCornerRadius();
        }
        float pxF = UiExtKt.toPxF(size);
        this.foregroundDrawable.setCornerRadius(pxF);
        GradientDrawable gradientDrawable = this.backgroundDrawable;
        gradientDrawable.setCornerRadius(pxF);
        setBackground(gradientDrawable);
        requestLayout();
    }

    public final void setStyle(@NotNull ButtonV3DTO.StyleTypes value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.style = value;
        if (this.disabled) {
            return;
        }
        try {
            applyStyle(ButtonV3DTOKt.getStyleTypesResource(value));
        } catch (UnsupportedOperationException unused) {
            applyStyle(R$style.IconButtonV3View_ActionPrimary);
        }
    }

    public /* synthetic */ IconButtonV3View(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? R$style.IconButtonV3View_ActionPrimary_Dynamic : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButtonV3View(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int color = a.getColor(context, R.color.transparent);
        this.transparentColor = color;
        this.shape = IconButtonV3DTO.IconButtonShape.SHAPE_SQUARE;
        IconButtonV3DTO.Sizes sizes = IconButtonV3DTO.Sizes.SIZE_500;
        this.size = sizes;
        this.style = ButtonV3DTO.StyleTypes.ACTION_PRIMARY;
        this.backColor = new Color.Solid(color);
        this.iconColor = color;
        this.backgroundDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{color, color});
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setAlpha(26);
        this.foregroundDrawable = gradientDrawable;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.paint = paint;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.IconButtonV3View, i11, i12);
        setSize(((IconButtonV3DTO.Sizes[]) IconButtonV3DTO.Sizes.getEntries().toArray(new IconButtonV3DTO.Sizes[0]))[obtainStyledAttributes.getInt(R$styleable.IconButtonV3View_iconButtonV3Size, sizes.ordinal())]);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.IconButtonV3View_android_src, 0);
        if (resourceId != 0) {
            DrawableResource.Companion companion = DrawableResource.INSTANCE;
            Resources resources = obtainStyledAttributes.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            setIconDrawable(companion.fromResources(resources, resourceId));
        }
        obtainStyledAttributes.recycle();
        try {
            applyStyle(i12);
        } catch (UnsupportedOperationException unused) {
            applyStyle(R$style.IconButtonV3View_ActionPrimary);
        }
        setBackground(this.backgroundDrawable);
    }
}

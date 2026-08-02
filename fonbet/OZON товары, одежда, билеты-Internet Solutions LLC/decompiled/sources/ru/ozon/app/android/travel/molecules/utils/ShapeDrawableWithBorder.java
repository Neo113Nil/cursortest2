package ru.ozon.app.android.travel.molecules.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7740w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.common.gradient.OzGradient;
import ru.ozon.uni.android.uikit.common.gradient.OzGradientOrientationMapperKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J \u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\rH\u0014J\u001a\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\u00132\b\b\u0003\u0010\"\u001a\u00020#J\u001a\u0010$\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\u00132\b\b\u0003\u0010\"\u001a\u00020#J8\u0010%\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00132\b\b\u0001\u0010\"\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\r2\u0014\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00160'H\u0002J\u0018\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\"\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u00112\b\u00102\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0014\u00103\u001a\u000204*\u0002052\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lru/ozon/app/android/travel/molecules/utils/ShapeDrawableWithBorder;", "Landroid/graphics/drawable/ShapeDrawable;", "context", "Landroid/content/Context;", "borderWidth", "", "outerBorderRadii", "", "innerBorderRadii", "<init>", "(Landroid/content/Context;Ljava/lang/Float;[F[F)V", "Ljava/lang/Float;", "fillPaint", "Landroid/graphics/Paint;", "fillShaderFactory", "Landroid/graphics/drawable/ShapeDrawable$ShaderFactory;", "fillPath", "Landroid/graphics/Path;", "fillColorToken", "", "borderColorToken", "onBoundsChange", "", "bounds", "Landroid/graphics/Rect;", "setShape", "shape", "Landroid/graphics/drawable/shapes/Shape;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "paint", "setFillColor", "token", "defaultColorInt", "", "setBorderColor", "processColorToken", "shaderFactoryConsumer", "Lkotlin/Function1;", "provideShaderFactory", "orientation", "Landroid/graphics/drawable/GradientDrawable$Orientation;", "colors", "", "fillWithColor", "getFillBounds", "Landroid/graphics/RectF;", "setupPath", "path", "radii", "toGradient", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "Lru/ozon/uni/android/uikit/common/gradient/OzGradient;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShapeDrawableWithBorder extends ShapeDrawable {
    private String borderColorToken;
    private final Float borderWidth;

    @NotNull
    private final Context context;
    private String fillColorToken;

    @NotNull
    private final Paint fillPaint;

    @NotNull
    private final Path fillPath;
    private ShapeDrawable.ShaderFactory fillShaderFactory;
    private final float[] innerBorderRadii;
    private final float[] outerBorderRadii;

    public /* synthetic */ ShapeDrawableWithBorder(Context context, Float f7, float[] fArr, float[] fArr2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : f7, (i11 & 4) != 0 ? null : fArr, (i11 & 8) != 0 ? null : fArr2);
    }

    private final void fillWithColor(Canvas canvas) {
        canvas.drawPath(this.fillPath, this.fillPaint);
    }

    private final RectF getFillBounds(Rect bounds) {
        Float f7 = this.borderWidth;
        if (f7 == null) {
            return new RectF(bounds);
        }
        float floatValue = f7.floatValue() / 2;
        RectF rectF = new RectF(bounds);
        rectF.inset(floatValue, floatValue);
        return rectF;
    }

    private final void processColorToken(String token, int defaultColorInt, Paint paint, Function1<? super ShapeDrawable.ShaderFactory, Unit> shaderFactoryConsumer) {
        Color.Gradient gradient;
        StyleParser styleParser = StyleParser.INSTANCE;
        OzGradient parseGradient = styleParser.parseGradient(token);
        if (parseGradient == null || (gradient = toGradient(parseGradient, this.context)) == null) {
            UniGradient gradientByToken = TokensExtKt.getGradientByToken(token);
            gradient = gradientByToken != null ? TokensExtKt.toGradient(gradientByToken, this.context) : null;
        }
        if (gradient == null) {
            shaderFactoryConsumer.invoke(null);
            paint.setShader(null);
            Integer parseColor = styleParser.parseColor(this.context, token);
            if (parseColor != null) {
                defaultColorInt = parseColor.intValue();
            }
            paint.setColor(defaultColorInt);
            return;
        }
        paint.setColor(-16777216);
        int[] colors = gradient.getColors();
        if (colors.length <= 1) {
            colors = null;
        }
        ShapeDrawable.ShaderFactory provideShaderFactory = colors != null ? provideShaderFactory(gradient.getOrientation(), colors) : null;
        paint.setShader(provideShaderFactory != null ? provideShaderFactory.resize(getBounds().width(), getBounds().height()) : null);
        shaderFactoryConsumer.invoke(provideShaderFactory);
    }

    private final ShapeDrawable.ShaderFactory provideShaderFactory(final GradientDrawable.Orientation orientation, final int[] colors) {
        return new ShapeDrawable.ShaderFactory() { // from class: ru.ozon.app.android.travel.molecules.utils.ShapeDrawableWithBorder$provideShaderFactory$1
            @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
            public Shader resize(int width, int height) {
                float[] coordinates = OzGradientOrientationMapperKt.getCoordinates(orientation, new Rect(0, 0, width, height));
                return new LinearGradient(coordinates[0], coordinates[1], coordinates[2], coordinates[3], colors, (float[]) null, Shader.TileMode.CLAMP);
            }
        };
    }

    public static /* synthetic */ void setBorderColor$default(ShapeDrawableWithBorder shapeDrawableWithBorder, String str, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        shapeDrawableWithBorder.setBorderColor(str, i11);
    }

    public static /* synthetic */ void setFillColor$default(ShapeDrawableWithBorder shapeDrawableWithBorder, String str, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        shapeDrawableWithBorder.setFillColor(str, i11);
    }

    private final void setupPath(Path path, float[] radii, Rect bounds) {
        path.reset();
        if (radii == null) {
            path.addRect(getFillBounds(bounds), Path.Direction.CW);
        } else {
            path.addRoundRect(getFillBounds(bounds), radii, Path.Direction.CW);
        }
    }

    private final Color.Gradient toGradient(OzGradient ozGradient, Context context) {
        int[] colors = ozGradient.getColors(context);
        if (colors == null) {
            colors = new int[0];
        }
        return new Color.Gradient(colors, ozGradient.getOrientation(), null, 4, null);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        setupPath(this.fillPath, this.outerBorderRadii, bounds);
        Paint paint = this.fillPaint;
        ShapeDrawable.ShaderFactory shaderFactory = this.fillShaderFactory;
        paint.setShader(shaderFactory != null ? shaderFactory.resize(bounds.width(), bounds.height()) : null);
        super.onBoundsChange(bounds);
    }

    @Override // android.graphics.drawable.ShapeDrawable
    protected void onDraw(@NotNull Shape shape, @NotNull Canvas canvas, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (this.fillColorToken != null) {
            fillWithColor(canvas);
        }
        if (this.borderColorToken != null) {
            super.onDraw(shape, canvas, paint);
        }
    }

    public final void setBorderColor(String token, int defaultColorInt) {
        if (Intrinsics.d(this.borderColorToken, token)) {
            return;
        }
        if (token == null) {
            this.borderColorToken = null;
            return;
        }
        this.borderColorToken = token;
        Paint paint = getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "getPaint(...)");
        processColorToken(token, defaultColorInt, paint, new ShapeDrawableWithBorder$setBorderColor$1(this));
    }

    public final void setFillColor(String token, int defaultColorInt) {
        if (Intrinsics.d(this.fillColorToken, token)) {
            return;
        }
        if (token == null) {
            this.fillColorToken = null;
        } else {
            this.fillColorToken = token;
            processColorToken(token, defaultColorInt, this.fillPaint, new ShapeDrawableWithBorder$setFillColor$1(new C7740w(this) { // from class: ru.ozon.app.android.travel.molecules.utils.ShapeDrawableWithBorder$setFillColor$2
                @Override // kotlin.reflect.n
                public Object get() {
                    ShapeDrawable.ShaderFactory shaderFactory;
                    shaderFactory = ((ShapeDrawableWithBorder) this.receiver).fillShaderFactory;
                    return shaderFactory;
                }

                @Override // kotlin.reflect.j
                public void set(Object obj) {
                    ((ShapeDrawableWithBorder) this.receiver).fillShaderFactory = (ShapeDrawable.ShaderFactory) obj;
                }
            }));
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable
    public void setShape(Shape shape) {
    }

    public ShapeDrawableWithBorder(@NotNull Context context, Float f7, float[] fArr, float[] fArr2) {
        RectF rectF;
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.borderWidth = f7;
        this.outerBorderRadii = fArr;
        this.innerBorderRadii = fArr2;
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        this.fillPaint = paint;
        Path path = new Path();
        this.fillPath = path;
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        setupPath(path, fArr, bounds);
        if (f7 != null) {
            float floatValue = f7.floatValue();
            rectF = new RectF(floatValue, floatValue, floatValue, floatValue);
        } else {
            rectF = null;
        }
        super.setShape(new RoundRectShape(fArr, rectF, fArr2));
    }
}

package ru.ozon.android.atom.icon;

import Fj.f;
import Jj.b;
import Kj.C3529a;
import Kj.d;
import Kj.e;
import Lj.a;
import Sc.o;
import Yg.C4894a;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.res.g;
import hd.C6915b;
import ji.C7431b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/android/atom/icon/IconView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class IconView extends AppCompatImageView {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private IconDTO.IconShape f83755a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private IconDTO.IconSize f83756b;

    /* renamed from: c, reason: collision with root package name */
    private IconDTO.ContentType f83757c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final GradientDrawable f83758d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f83759e;

    /* renamed from: f, reason: collision with root package name */
    private PorterDuffColorFilter f83760f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f83761g;

    /* renamed from: h, reason: collision with root package name */
    private Lj.a f83762h;

    /* renamed from: i, reason: collision with root package name */
    private Integer f83763i;

    /* renamed from: j, reason: collision with root package name */
    private PorterDuffColorFilter f83764j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Paint f83765k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Paint f83766l;

    /* renamed from: m, reason: collision with root package name */
    private CharSequence f83767m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final Rect f83768n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final TextPaint f83769o;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f83770a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f83771b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f83772c;

        static {
            int[] iArr = new int[IconDTO.ContentType.values().length];
            try {
                iArr[IconDTO.ContentType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconDTO.ContentType.GRAPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f83770a = iArr;
            int[] iArr2 = new int[IconDTO.IconShape.values().length];
            try {
                iArr2[IconDTO.IconShape.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[IconDTO.IconShape.SQUIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IconDTO.IconShape.SHAPE_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IconDTO.IconShape.SHAPE_SQUIRCLE_FORCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f83771b = iArr2;
            int[] iArr3 = new int[IconDTO.IconSize.values().length];
            try {
                iArr3[IconDTO.IconSize.SIZE_200.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[IconDTO.IconSize.SIZE_300.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[IconDTO.IconSize.SIZE_400.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[IconDTO.IconSize.SIZE_500.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[IconDTO.IconSize.SIZE_600.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[IconDTO.IconSize.SIZE_700.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[IconDTO.IconSize.SIZE_800.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[IconDTO.IconSize.SIZE_900.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            f83772c = iArr3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IconView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int b11;
        Object a11;
        Lj.a aVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        IconDTO.IconShape iconShape = IconDTO.IconShape.SQUIRCLE;
        this.f83755a = iconShape;
        IconDTO.IconSize iconSize = IconDTO.IconSize.SIZE_500;
        this.f83756b = iconSize;
        IconDTO.ContentType contentType = IconDTO.ContentType.GRAPHIC;
        this.f83757c = contentType;
        int color = androidx.core.content.a.getColor(context, R.color.transparent);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f83758d = gradientDrawable;
        androidx.core.content.a.getColor(context, ru.ozon.app.android.R.color.layer_overlay_paranja);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f83765k = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        this.f83766l = paint2;
        Rect rect = new Rect();
        this.f83768n = rect;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setLetterSpacing(0.0f);
        textPaint.setTypeface(g.e(ru.ozon.app.android.R.font.onest_semibold, context));
        textPaint.setTextSize(TypedValue.applyDimension(2, 20, Resources.getSystem().getDisplayMetrics()));
        this.f83769o = textPaint;
        IconDTO.FitType fitType = IconDTO.FitType.FILL_CENTER;
        int[] IconView = C4894a.f35030b;
        Intrinsics.checkNotNullExpressionValue(IconView, "IconView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, IconView, 0, 0);
        this.f83756b = ((IconDTO.IconSize[]) IconDTO.IconSize.getEntries().toArray(new IconDTO.IconSize[0]))[obtainStyledAttributes.getInt(11, iconSize.ordinal())];
        gradientDrawable.setCornerRadius(c(this.f83755a));
        switch (a.f83772c[this.f83756b.ordinal()]) {
            case 1:
                b11 = f.BODY_ACCENT_250_CAPTION.b();
                break;
            case 2:
                b11 = f.BODY_CONTROL_300_X_SMALL.b();
                break;
            case 3:
                b11 = f.BODY_CONTROL_400_SMALL.b();
                break;
            case 4:
                b11 = f.BODY_CONTROL_500_MEDIUM.b();
                break;
            case 5:
                b11 = f.HEADLINE_400_SMALL.b();
                break;
            case 6:
                b11 = f.HEADLINE_500_MEDIUM.b();
                break;
            case 7:
                b11 = f.HEADLINE_700_X_LARGE.b();
                break;
            case 8:
                b11 = f.HEADLINE_800_X_X_LARGE.b();
                break;
            default:
                throw new o();
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        C3529a.a(textPaint, context2, b11);
        CharSequence charSequence = this.f83767m;
        textPaint.getTextBounds(String.valueOf(this.f83767m), 0, charSequence != null ? charSequence.length() : 0, rect);
        int i11 = obtainStyledAttributes.getInt(10, -1);
        iconShape = i11 != -1 ? (IconDTO.IconShape) IconDTO.IconShape.getEntries().get(i11) : iconShape;
        this.f83755a = iconShape;
        gradientDrawable.setCornerRadius(c(iconShape));
        IconDTO.ContentType contentType2 = ((IconDTO.ContentType[]) IconDTO.ContentType.getEntries().toArray(new IconDTO.ContentType[0]))[obtainStyledAttributes.getInt(9, contentType.ordinal())];
        IconDTO.IconShape iconShape2 = this.f83755a;
        IconDTO.IconShape iconShape3 = IconDTO.IconShape.SHAPE_NONE;
        if (!(iconShape2 != iconShape3) && contentType2 != contentType) {
            contentType2 = null;
        }
        this.f83757c = contentType2;
        (this.f83755a == iconShape3 ? new b.C0283b(color) : d.a(obtainStyledAttributes, context, 4, 1, 0)).applyTo(gradientDrawable);
        int color2 = obtainStyledAttributes.getColor(8, 0);
        if (color2 != 0) {
            Integer valueOf = this.f83755a == iconShape3 ? null : Integer.valueOf(color2);
            this.f83759e = valueOf;
            this.f83760f = valueOf != null ? new PorterDuffColorFilter(valueOf.intValue(), PorterDuff.Mode.SRC_IN) : null;
            invalidate();
        }
        int resourceId = obtainStyledAttributes.getResourceId(5, 0);
        if (resourceId != 0) {
            Resources resources = obtainStyledAttributes.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            Lj.a a12 = a.C0332a.a(resources, resourceId);
            this.f83762h = a12;
            int c11 = C6915b.c(e.b(this.f83756b.getSize()));
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            a11 = ((a.b) a12).a(context3);
            Drawable drawable = (Drawable) a11;
            this.f83761g = drawable != null ? androidx.core.graphics.drawable.b.a(drawable, c11, c11, Bitmap.Config.ARGB_8888) : null;
            Integer num = this.f83763i;
            this.f83764j = (num == null || ((aVar = this.f83762h) != null && aVar.isMulticolor())) ? null : new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
        int color3 = obtainStyledAttributes.getColor(6, 0);
        if (color3 != 0) {
            this.f83763i = Integer.valueOf(color3);
            Lj.a aVar2 = this.f83762h;
            this.f83764j = (aVar2 == null || !aVar2.isMulticolor()) ? new PorterDuffColorFilter(color3, PorterDuff.Mode.SRC_IN) : null;
            invalidate();
        }
        setLabel(obtainStyledAttributes.getText(3));
        int color4 = obtainStyledAttributes.getColor(0, 0);
        if (color4 != 0) {
            textPaint.setColor(color4);
        }
        obtainStyledAttributes.recycle();
        setContentDescription("icon");
        setBackground(gradientDrawable);
        setClipToOutline(true);
    }

    private final float c(IconDTO.IconShape iconShape) {
        float b11 = e.b(this.f83756b.getSizeShape() / 2.0f);
        int i11 = a.f83771b[iconShape.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return 0.0f;
                }
                if (i11 == 4) {
                    return e.b(this.f83756b.getCornerRadius());
                }
                throw new o();
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (!C7431b.a(context)) {
                return e.b(this.f83756b.getCornerRadius());
            }
        }
        return b11;
    }

    private final int getSizePx() {
        return C6915b.c(e.b(this.f83755a != IconDTO.IconShape.SHAPE_NONE ? this.f83756b.getSizeShape() : this.f83756b.getSize()));
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(@NotNull Canvas canvas) {
        Bitmap bitmap;
        IconDTO.IconSize iconSize = this.f83756b;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        IconDTO.ContentType contentType = this.f83757c;
        int i11 = contentType == null ? -1 : a.f83770a[contentType.ordinal()];
        if (i11 == 1) {
            CharSequence charSequence = this.f83767m;
            if (charSequence != null) {
                int save = canvas.save();
                try {
                    int sizePx = getSizePx();
                    int c11 = C6915b.c(e.b(iconSize.getPadding()));
                    canvas.clipRect(c11, 0, sizePx - c11, sizePx);
                    int length = charSequence.length();
                    float f7 = sizePx / 2;
                    TextPaint textPaint = this.f83769o;
                    canvas.drawText(charSequence, 0, length, f7 - (textPaint.measureText(String.valueOf(this.f83767m)) / 2), (sizePx / 2) - this.f83768n.exactCenterY(), textPaint);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        } else if (i11 == 2 && (bitmap = this.f83761g) != null) {
            float sizePx2 = (getSizePx() / 2.0f) - (C6915b.c(e.b(iconSize.getSize())) / 2);
            e.b(iconSize.getSize());
            Paint paint = this.f83765k;
            paint.setColorFilter(this.f83764j);
            Unit unit = Unit.f71690a;
            canvas.drawBitmap(bitmap, sizePx2, sizePx2, paint);
        }
        if (this.f83759e != null) {
            float sizePx3 = getSizePx();
            float c12 = c(this.f83755a);
            Paint paint2 = this.f83766l;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(e.b(iconSize.getBorderWidth() * 2));
            paint2.setColorFilter(this.f83760f);
            canvas.drawRoundRect(0.0f, 0.0f, sizePx3, sizePx3, c12, c12, paint2);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i11, int i12) {
        int sizePx = getSizePx();
        float b11 = sizePx - e.b(this.f83756b.getPadding() * 2);
        CharSequence charSequence = this.f83767m;
        if (charSequence != null) {
            TextPaint textPaint = this.f83769o;
            if (b11 < textPaint.measureText(charSequence.toString())) {
                setLabel(charSequence.subSequence(0, textPaint.breakText(charSequence, 0, charSequence.length(), true, b11, null)));
            }
            Unit unit = Unit.f71690a;
        }
        setMeasuredDimension(sizePx, sizePx);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        setBackground(this.f83758d);
    }

    public final void setLabel(CharSequence charSequence) {
        if (this.f83755a == IconDTO.IconShape.SHAPE_NONE) {
            charSequence = null;
        }
        this.f83767m = charSequence;
        this.f83769o.getTextBounds(String.valueOf(this.f83767m), 0, charSequence != null ? charSequence.length() : 0, this.f83768n);
    }
}

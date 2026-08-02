package com.vk.core.view.components.picture;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import kotlin.NoWhenBranchMatchedException;
import xsna.an10;
import xsna.asp;
import xsna.hbh0;
import xsna.wcv0;
import xsna.zrp;

/* compiled from: VkPicture.kt */
/* loaded from: classes.dex */
public final class VkPicture extends b {
    public static final /* synthetic */ int y = 0;
    public CornerRadius q;
    public wcv0 r;
    public wcv0 s;
    public wcv0 t;
    public wcv0 u;
    public boolean v;
    public final Path w;
    public boolean x;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkPicture.kt */
    public static final class CornerRadius {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CornerRadius[] $VALUES;
        public static final CornerRadius Large;
        public static final CornerRadius Medium;
        public static final CornerRadius Small;

        static {
            CornerRadius cornerRadius = new CornerRadius("Small", 0);
            Small = cornerRadius;
            CornerRadius cornerRadius2 = new CornerRadius("Medium", 1);
            Medium = cornerRadius2;
            CornerRadius cornerRadius3 = new CornerRadius("Large", 2);
            Large = cornerRadius3;
            CornerRadius[] cornerRadiusArr = {cornerRadius, cornerRadius2, cornerRadius3};
            $VALUES = cornerRadiusArr;
            $ENTRIES = new asp(cornerRadiusArr);
        }

        public CornerRadius() {
            throw null;
        }

        public static CornerRadius valueOf(String str) {
            return (CornerRadius) Enum.valueOf(CornerRadius.class, str);
        }

        public static CornerRadius[] values() {
            return (CornerRadius[]) $VALUES.clone();
        }
    }

    public VkPicture(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    private final float getImageSizeDp() {
        int max = Math.max((getWidth() - getPaddingRight()) - getPaddingLeft(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        Context context = getContext();
        float f = max;
        return an10.b(Build.VERSION.SDK_INT >= 34 ? TypedValue.deriveDimension(2, f, context.getResources().getDisplayMetrics()) : f / context.getResources().getDisplayMetrics().scaledDensity);
    }

    public final void O0(Canvas canvas) {
        canvas.clipPath(this.w);
        int b = hbh0.b(getImageSizeDp() < 72.0f ? 3 : 4, getContext());
        wcv0 wcv0Var = this.r;
        if (wcv0Var != null) {
            float f = b;
            float f2 = 2;
            float paddingLeft = getPaddingLeft() - (f - (wcv0Var.a(getContext(), getImageSizeDp()).getWidth() / f2));
            float paddingTop = getPaddingTop() - (f - (wcv0Var.a(getContext(), getImageSizeDp()).getHeight() / f2));
            canvas.translate(paddingLeft, paddingTop);
            Path c = wcv0Var.c(getContext(), getImageSizeDp());
            if (c != null) {
                canvas.clipPath(c, Region.Op.DIFFERENCE);
            }
            canvas.translate(-paddingLeft, -paddingTop);
        }
        wcv0 wcv0Var2 = this.s;
        if (wcv0Var2 != null) {
            float f3 = b;
            float f4 = 2;
            float paddingLeft2 = getPaddingLeft() - (f3 - (wcv0Var2.a(getContext(), getImageSizeDp()).getWidth() / f4));
            float height = (f3 - (wcv0Var2.a(getContext(), getImageSizeDp()).getHeight() / f4)) + (getHeight() - getPaddingBottom());
            canvas.translate(paddingLeft2, height);
            Path c2 = wcv0Var2.c(getContext(), getImageSizeDp());
            if (c2 != null) {
                canvas.clipPath(c2, Region.Op.DIFFERENCE);
            }
            canvas.translate(-paddingLeft2, -height);
        }
        wcv0 wcv0Var3 = this.t;
        if (wcv0Var3 != null) {
            float f5 = b;
            float f6 = 2;
            float width = (f5 - (wcv0Var3.a(getContext(), getImageSizeDp()).getWidth() / f6)) + (getWidth() - getPaddingRight());
            float paddingTop2 = getPaddingTop() - (f5 - (wcv0Var3.a(getContext(), getImageSizeDp()).getHeight() / f6));
            canvas.translate(width, paddingTop2);
            Path c3 = wcv0Var3.c(getContext(), getImageSizeDp());
            if (c3 != null) {
                canvas.clipPath(c3, Region.Op.DIFFERENCE);
            }
            canvas.translate(-width, -paddingTop2);
        }
        wcv0 wcv0Var4 = this.u;
        if (wcv0Var4 != null) {
            float f7 = b;
            float f8 = 2;
            float width2 = (f7 - (wcv0Var4.a(getContext(), getImageSizeDp()).getWidth() / f8)) + (getWidth() - getPaddingRight());
            float height2 = (f7 - (wcv0Var4.a(getContext(), getImageSizeDp()).getHeight() / f8)) + (getHeight() - getPaddingBottom());
            canvas.translate(width2, height2);
            Path c4 = wcv0Var4.c(getContext(), getImageSizeDp());
            if (c4 != null) {
                canvas.clipPath(c4, Region.Op.DIFFERENCE);
            }
            canvas.translate(-width2, -height2);
        }
    }

    public final wcv0 getBottomLeftBadge() {
        return this.s;
    }

    public final wcv0 getBottomRightBadge() {
        return this.u;
    }

    public final CornerRadius getCornerRadius() {
        return this.q;
    }

    @Override // com.vk.core.view.components.picture.b
    public int getOverlayIconSize() {
        Context context = getContext();
        float imageSizeDp = getImageSizeDp();
        return hbh0.b(imageSizeDp < 28.0f ? 16 : imageSizeDp < 32.0f ? 18 : imageSizeDp < 44.0f ? 20 : imageSizeDp < 56.0f ? 24 : imageSizeDp < 96.0f ? 28 : 32, context);
    }

    @Override // com.vk.core.view.components.picture.b
    public int getPlaceholderIconSize() {
        Context context = getContext();
        float imageSizeDp = getImageSizeDp();
        return hbh0.b(imageSizeDp < 24.0f ? 12 : imageSizeDp < 32.0f ? 16 : imageSizeDp < 36.0f ? 20 : imageSizeDp < 48.0f ? 24 : imageSizeDp < 64.0f ? 28 : imageSizeDp < 72.0f ? 32 : 36, context);
    }

    public final wcv0 getTopLeftBadge() {
        return this.r;
    }

    public final wcv0 getTopRightBadge() {
        return this.t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        if (r7 < 88.0f) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008e, code lost:
    
        if (r7 < 64.0f) goto L35;
     */
    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i;
        boolean z = this.x;
        Path path = this.w;
        if (z) {
            this.x = false;
            Context context = getContext();
            CornerRadius cornerRadius = this.q;
            float imageSizeDp = getImageSizeDp();
            int i2 = a.$EnumSwitchMapping$0[cornerRadius.ordinal()];
            if (i2 != 1) {
                i = 10;
                if (i2 == 2) {
                    if (imageSizeDp >= 36.0f) {
                        if (imageSizeDp >= 64.0f) {
                            if (imageSizeDp >= 80.0f) {
                            }
                            i = 6;
                            float a = hbh0.a(context, i);
                            path.reset();
                            path.addRoundRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), a, a, Path.Direction.CW);
                            path.setFillType(Path.FillType.WINDING);
                        }
                        i = 4;
                        float a2 = hbh0.a(context, i);
                        path.reset();
                        path.addRoundRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), a2, a2, Path.Direction.CW);
                        path.setFillType(Path.FillType.WINDING);
                    }
                    i = 3;
                    float a22 = hbh0.a(context, i);
                    path.reset();
                    path.addRoundRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), a22, a22, Path.Direction.CW);
                    path.setFillType(Path.FillType.WINDING);
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (imageSizeDp >= 20.0f) {
                        if (imageSizeDp < 24.0f) {
                            i = 5;
                        } else {
                            if (imageSizeDp >= 36.0f) {
                                if (imageSizeDp >= 44.0f) {
                                    if (imageSizeDp >= 56.0f) {
                                        i = imageSizeDp < 64.0f ? 12 : imageSizeDp < 72.0f ? 14 : 16;
                                    }
                                }
                                i = 8;
                            }
                            i = 6;
                        }
                        float a222 = hbh0.a(context, i);
                        path.reset();
                        path.addRoundRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), a222, a222, Path.Direction.CW);
                        path.setFillType(Path.FillType.WINDING);
                    }
                    i = 4;
                    float a2222 = hbh0.a(context, i);
                    path.reset();
                    path.addRoundRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), a2222, a2222, Path.Direction.CW);
                    path.setFillType(Path.FillType.WINDING);
                }
            } else if (imageSizeDp < 36.0f) {
                i = 2;
                float a22222 = hbh0.a(context, i);
                path.reset();
                path.addRoundRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), a22222, a22222, Path.Direction.CW);
                path.setFillType(Path.FillType.WINDING);
            }
        }
        int save = canvas.save();
        try {
            O0(canvas);
            super.onDraw(canvas);
            canvas.drawPath(path, getInnerBorderPaint());
            L0(canvas);
            canvas.restoreToCount(save);
            int b = hbh0.b(getImageSizeDp() >= 72.0f ? 4 : 3, getContext());
            wcv0 wcv0Var = this.r;
            if (wcv0Var != null) {
                float f = b;
                float f2 = 2;
                float paddingLeft = getPaddingLeft() - (f - (wcv0Var.a(getContext(), getImageSizeDp()).getWidth() / f2));
                float paddingTop = getPaddingTop() - (f - (wcv0Var.a(getContext(), getImageSizeDp()).getHeight() / f2));
                canvas.translate(paddingLeft, paddingTop);
                wcv0Var.b(getContext(), getImageSizeDp(), canvas);
                canvas.translate(-paddingLeft, -paddingTop);
            }
            wcv0 wcv0Var2 = this.s;
            if (wcv0Var2 != null) {
                float f3 = b;
                float f4 = 2;
                float paddingLeft2 = getPaddingLeft() - (f3 - (wcv0Var2.a(getContext(), getImageSizeDp()).getWidth() / f4));
                float height = (f3 - (wcv0Var2.a(getContext(), getImageSizeDp()).getHeight() / f4)) + (getHeight() - getPaddingBottom());
                canvas.translate(paddingLeft2, height);
                wcv0Var2.b(getContext(), getImageSizeDp(), canvas);
                canvas.translate(-paddingLeft2, -height);
            }
            wcv0 wcv0Var3 = this.t;
            if (wcv0Var3 != null) {
                float f5 = b;
                float f6 = 2;
                float width = (f5 - (wcv0Var3.a(getContext(), getImageSizeDp()).getWidth() / f6)) + (getWidth() - getPaddingRight());
                float paddingTop2 = getPaddingTop() - (f5 - (wcv0Var3.a(getContext(), getImageSizeDp()).getHeight() / f6));
                canvas.translate(width, paddingTop2);
                wcv0Var3.b(getContext(), getImageSizeDp(), canvas);
                canvas.translate(-width, -paddingTop2);
            }
            wcv0 wcv0Var4 = this.u;
            if (wcv0Var4 != null) {
                float f7 = b;
                float f8 = 2;
                float width2 = (f7 - (wcv0Var4.a(getContext(), getImageSizeDp()).getWidth() / f8)) + (getWidth() - getPaddingRight());
                float height2 = (f7 - (wcv0Var4.a(getContext(), getImageSizeDp()).getHeight() / f8)) + (getHeight() - getPaddingBottom());
                canvas.translate(width2, height2);
                wcv0Var4.b(getContext(), getImageSizeDp(), canvas);
                canvas.translate(-width2, -height2);
            }
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        this.x = true;
        super.onRtlPropertiesChanged(i);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.x = true;
    }

    public final void setBottomLeftBadge(wcv0 wcv0Var) {
        this.s = wcv0Var;
        invalidate();
    }

    public final void setBottomRightBadge(wcv0 wcv0Var) {
        this.u = wcv0Var;
        invalidate();
    }

    public final void setCornerRadius(CornerRadius cornerRadius) {
        this.q = cornerRadius;
        this.x = true;
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (i != getPaddingLeft() || i3 != getPaddingRight() || i2 != getPaddingTop() || i4 != getPaddingBottom()) {
            this.x = true;
        }
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        if (i != getPaddingStart() || i3 != getPaddingEnd() || i2 != getPaddingTop() || i4 != getPaddingBottom()) {
            this.x = true;
        }
        super.setPaddingRelative(i, i2, i3, i4);
    }

    public final void setRounded(boolean z) {
        if (z != this.v) {
            this.v = z;
            this.x = true;
        }
    }

    public final void setTopLeftBadge(wcv0 wcv0Var) {
        this.r = wcv0Var;
        invalidate();
    }

    public final void setTopRightBadge(wcv0 wcv0Var) {
        this.t = wcv0Var;
        invalidate();
    }

    public /* synthetic */ VkPicture(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public VkPicture(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.q = CornerRadius.Medium;
        this.v = true;
        this.w = new Path();
        this.x = true;
        Ng();
    }
}

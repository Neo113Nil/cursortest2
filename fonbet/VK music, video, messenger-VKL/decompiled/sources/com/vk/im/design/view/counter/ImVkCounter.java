package com.vk.im.design.view.counter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.picture.VkImageSimple;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.e3m;
import xsna.krv0;
import xsna.m33;
import xsna.zrp;

/* compiled from: ImVkCounter.kt */
/* loaded from: classes2.dex */
public final class ImVkCounter extends VkCounter {
    public boolean u;
    public DrawMode v;
    public ImageView.ScaleType w;
    public int x;
    public final VkImageSimple y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImVkCounter.kt */
    public static final class DrawMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DrawMode[] $VALUES;
        public static final DrawMode COUNTER;
        public static final DrawMode EMPTY;
        public static final DrawMode IMAGE;

        static {
            DrawMode drawMode = new DrawMode("EMPTY", 0);
            EMPTY = drawMode;
            DrawMode drawMode2 = new DrawMode("COUNTER", 1);
            COUNTER = drawMode2;
            DrawMode drawMode3 = new DrawMode("IMAGE", 2);
            IMAGE = drawMode3;
            DrawMode[] drawModeArr = {drawMode, drawMode2, drawMode3};
            $VALUES = drawModeArr;
            $ENTRIES = new asp(drawModeArr);
        }

        public DrawMode() {
            throw null;
        }

        public static DrawMode valueOf(String str) {
            return (DrawMode) Enum.valueOf(DrawMode.class, str);
        }

        public static DrawMode[] values() {
            return (DrawMode[]) $VALUES.clone();
        }
    }

    /* compiled from: ImVkCounter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DrawMode.values().length];
            try {
                iArr[DrawMode.COUNTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DrawMode.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DrawMode.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ImVkCounter(Context context, int i) {
        super(context, null);
        this.u = true;
        this.v = DrawMode.COUNTER;
        this.w = ImageView.ScaleType.CENTER_INSIDE;
        this.y = new VkImageSimple(context, null, 6, 0);
    }

    @Override // com.vk.core.view.components.counter.VkCounter, xsna.too0
    public final void Ng() {
        Drawable drawable;
        Drawable mutate;
        d();
        if (this.x != 0 && (drawable = this.y.getDrawable()) != null && (mutate = drawable.mutate()) != null) {
            mutate.setTint(krv0.m(this.x, getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.u) {
            super.draw(canvas);
        } else {
            onDraw(canvas);
        }
    }

    public final void e(int i, int i2) {
        this.x = i2;
        Context context = getContext();
        e3m.a aVar = e3m.a;
        Drawable a2 = m33.a(i, context);
        Drawable mutate = a2 != null ? a2.mutate() : null;
        if (mutate != null && i2 != 0) {
            mutate.setTint(krv0.m(i2, getContext()));
        }
        this.y.setImageDrawable(mutate);
        if (this.v == DrawMode.IMAGE) {
            invalidate();
        }
    }

    public final boolean getDrawBackground() {
        return this.u;
    }

    public final ImageView.ScaleType getImageScaleType() {
        return this.w;
    }

    public final DrawMode getRenderMode() {
        return this.v;
    }

    @Override // com.vk.core.view.components.counter.VkCounter, android.view.View
    public final void onDraw(Canvas canvas) {
        b(canvas);
        int i = a.$EnumSwitchMapping$0[this.v.ordinal()];
        if (i == 1) {
            c(canvas);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        VkImageSimple vkImageSimple = this.y;
        if (vkImageSimple.getDrawable() != null) {
            vkImageSimple.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
            vkImageSimple.layout(0, 0, getWidth(), getHeight());
            vkImageSimple.draw(canvas);
        }
    }

    @Override // com.vk.core.view.components.counter.VkCounter, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        DrawMode drawMode = this.v;
        if (drawMode == DrawMode.IMAGE || drawMode == DrawMode.EMPTY) {
            int measuredHeight = getMeasuredHeight();
            setMeasuredDimension(measuredHeight, measuredHeight);
        }
    }

    public final void setDrawBackground(boolean z) {
        this.u = z;
        invalidate();
    }

    public final void setImageDrawable(Drawable drawable) {
        this.x = 0;
        this.y.setImageDrawable(drawable);
        if (this.v == DrawMode.IMAGE) {
            invalidate();
        }
    }

    public final void setImageInset(int i) {
        this.y.setPadding(i, i, i, i);
        if (this.v == DrawMode.IMAGE) {
            invalidate();
        }
    }

    public final void setImageScaleType(ImageView.ScaleType scaleType) {
        this.w = scaleType;
        this.y.setScaleType(scaleType);
        requestLayout();
        invalidate();
    }

    public final void setRenderMode(DrawMode drawMode) {
        this.v = drawMode;
        requestLayout();
        invalidate();
    }

    public final void setMuted(boolean z) {
    }
}

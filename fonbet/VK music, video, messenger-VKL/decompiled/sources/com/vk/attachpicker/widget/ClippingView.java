package com.vk.attachpicker.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Property;
import xsna.f5h0;
import xsna.ojt;

/* loaded from: classes15.dex */
public class ClippingView extends LocalImageView {
    public static final b t;
    public static final d u;
    public static final f v;
    public int p;
    public int q;
    public int r;
    public int s;

    public class a extends Property<ClippingView, Integer> {
        @Override // android.util.Property
        public final Integer get(ClippingView clippingView) {
            return Integer.valueOf(clippingView.getClipLeft());
        }

        @Override // android.util.Property
        public final void set(ClippingView clippingView, Integer num) {
            clippingView.setClipLeft(num.intValue());
        }
    }

    public class b extends Property<ClippingView, Integer> {
        @Override // android.util.Property
        public final Integer get(ClippingView clippingView) {
            return Integer.valueOf(clippingView.getClipTop());
        }

        @Override // android.util.Property
        public final void set(ClippingView clippingView, Integer num) {
            clippingView.setClipTop(num.intValue());
        }
    }

    public class c extends Property<ClippingView, Integer> {
        @Override // android.util.Property
        public final Integer get(ClippingView clippingView) {
            return Integer.valueOf(clippingView.getClipRight());
        }

        @Override // android.util.Property
        public final void set(ClippingView clippingView, Integer num) {
            clippingView.setClipRight(num.intValue());
        }
    }

    public class d extends Property<ClippingView, Integer> {
        @Override // android.util.Property
        public final Integer get(ClippingView clippingView) {
            return Integer.valueOf(clippingView.getClipBottom());
        }

        @Override // android.util.Property
        public final void set(ClippingView clippingView, Integer num) {
            clippingView.setClipBottom(num.intValue());
        }
    }

    public class e extends Property<ClippingView, Integer> {
        @Override // android.util.Property
        public final Integer get(ClippingView clippingView) {
            return Integer.valueOf(clippingView.getClipBottom());
        }

        @Override // android.util.Property
        public final void set(ClippingView clippingView, Integer num) {
            ClippingView clippingView2 = clippingView;
            Integer num2 = num;
            clippingView2.p = num2.intValue();
            clippingView2.s = num2.intValue();
            clippingView2.invalidate();
        }
    }

    public class f extends Property<ClippingView, Integer> {
        @Override // android.util.Property
        public final Integer get(ClippingView clippingView) {
            return Integer.valueOf(clippingView.getClipLeft());
        }

        @Override // android.util.Property
        public final void set(ClippingView clippingView, Integer num) {
            ClippingView clippingView2 = clippingView;
            Integer num2 = num;
            clippingView2.q = num2.intValue();
            clippingView2.r = num2.intValue();
            clippingView2.invalidate();
        }
    }

    public interface g {
    }

    static {
        new a(Integer.class, "clipLeft");
        t = new b(Integer.class, "clipTop");
        new c(Integer.class, "clipRight");
        u = new d(Integer.class, "clipBottom");
        new e(Integer.class, "clipBottom");
        v = new f(Integer.class, "clipBottom");
    }

    public ClippingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.vk.attachpicker.widget.LocalImageView, com.vk.imageloader.view.VKImageView
    public final void K0(ojt ojtVar) {
        ojtVar.b = 0;
        ojtVar.l = f5h0.m.a;
    }

    public int getClipBottom() {
        return this.p;
    }

    public int getClipHorizontal() {
        return this.r;
    }

    public int getClipLeft() {
        return this.q;
    }

    public int getClipRight() {
        return this.r;
    }

    public int getClipTop() {
        return this.s;
    }

    @Override // com.vk.imageloader.view.VKImageView, xsna.zjt, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(this.q / getScaleY(), this.s / getScaleY(), getWidth() - (this.r / getScaleY()), getHeight() - (this.p / getScaleY()));
        super.onDraw(canvas);
        canvas.restore();
    }

    public void setClipBottom(int i) {
        this.p = i;
        invalidate();
    }

    public void setClipHorizontal(int i) {
        this.r = i;
        this.q = i;
        invalidate();
    }

    public void setClipLeft(int i) {
        this.q = i;
        invalidate();
    }

    public void setClipRight(int i) {
        this.r = i;
        invalidate();
    }

    public void setClipTop(int i) {
        this.s = i;
        invalidate();
    }

    public void setClipVertical(int i) {
        this.p = i;
        this.s = i;
        invalidate();
    }

    public void setOnDrawListener(g gVar) {
    }
}

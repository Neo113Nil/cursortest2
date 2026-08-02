package com.vk.core.tool.view.vkblur;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.a90;
import xsna.bpn0;
import xsna.e3m;
import xsna.gzs;
import xsna.s3q0;
import xsna.too0;
import xsna.vo50;

/* compiled from: VkBlurContentView.kt */
/* loaded from: classes17.dex */
public final class VkBlurContentView extends FrameLayout implements too0 {
    public static final /* synthetic */ int f = 0;
    public boolean b;
    public Integer c;
    public final bpn0 d;
    public final LinkedHashSet e;

    public VkBlurContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final Integer getWindowBackgroundColor() {
        Window window;
        View decorView;
        Activity h = e3m.h(getContext());
        Drawable background = (h == null || (window = h.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            return Integer.valueOf(colorDrawable.getColor());
        }
        return null;
    }

    @Override // xsna.too0
    public final void Ng() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((gzs) it.next()).invoke();
        }
    }

    public final void a(gzs<s3q0> gzsVar) {
        this.e.add(gzsVar);
    }

    public final void b(gzs<s3q0> gzsVar) {
        this.e.remove(gzsVar);
    }

    public final int c() {
        Integer num = this.c;
        if (num != null) {
            return e3m.f(num.intValue(), getContext());
        }
        Integer windowBackgroundColor = getWindowBackgroundColor();
        if (windowBackgroundColor != null) {
            return windowBackgroundColor.intValue();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas beginRecording;
        if (!this.b || Build.VERSION.SDK_INT < 31 || !canvas.isHardwareAccelerated()) {
            super.dispatchDraw(canvas);
            return;
        }
        getRenderNode$foundation_release().setPosition(0, 0, getWidth(), getHeight());
        beginRecording = getRenderNode$foundation_release().beginRecording();
        try {
            super.dispatchDraw(beginRecording);
            getRenderNode$foundation_release().endRecording();
            canvas.drawRenderNode(getRenderNode$foundation_release());
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((gzs) it.next()).invoke();
            }
        } catch (Throwable th) {
            getRenderNode$foundation_release().endRecording();
            throw th;
        }
    }

    public final Integer getBlurBackgroundColorAttr() {
        return this.c;
    }

    public final boolean getCaptureEnabled() {
        return this.b;
    }

    public final RenderNode getRenderNode$foundation_release() {
        return a90.c(this.d.getValue());
    }

    public final void setBlurBackgroundColorAttr(Integer num) {
        this.c = num;
    }

    public final void setCaptureEnabled(boolean z) {
        this.b = z;
        invalidate();
    }

    public VkBlurContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.b = true;
        this.d = new bpn0(new vo50(23));
        this.e = new LinkedHashSet();
    }
}

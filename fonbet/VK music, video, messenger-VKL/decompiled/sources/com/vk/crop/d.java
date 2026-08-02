package com.vk.crop;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import androidx.annotation.Nullable;
import com.vk.crop.h;
import xsna.bfk;

/* compiled from: CropOverlayView.java */
/* loaded from: classes17.dex */
public abstract class d extends View implements bfk {
    public static final a b = new a(Float.class, "x0");
    public static final b c = new b(Float.class, "x1");
    public static final c d = new c(Float.class, "y0");
    public static final C0893d e = new C0893d(Float.class, "y1");

    /* compiled from: CropOverlayView.java */
    public class a extends Property<d, Float> {
        @Override // android.util.Property
        public final Float get(d dVar) {
            return Float.valueOf(dVar.getX0());
        }

        @Override // android.util.Property
        public final void set(d dVar, Float f) {
            dVar.setX0(f.floatValue());
        }
    }

    /* compiled from: CropOverlayView.java */
    public class b extends Property<d, Float> {
        @Override // android.util.Property
        public final Float get(d dVar) {
            return Float.valueOf(dVar.getX1());
        }

        @Override // android.util.Property
        public final void set(d dVar, Float f) {
            dVar.setX1(f.floatValue());
        }
    }

    /* compiled from: CropOverlayView.java */
    public class c extends Property<d, Float> {
        @Override // android.util.Property
        public final Float get(d dVar) {
            return Float.valueOf(dVar.getY0());
        }

        @Override // android.util.Property
        public final void set(d dVar, Float f) {
            dVar.setY0(f.floatValue());
        }
    }

    /* compiled from: CropOverlayView.java */
    /* renamed from: com.vk.crop.d$d, reason: collision with other inner class name */
    public class C0893d extends Property<d, Float> {
        @Override // android.util.Property
        public final Float get(d dVar) {
            return Float.valueOf(dVar.getY1());
        }

        @Override // android.util.Property
        public final void set(d dVar, Float f) {
            dVar.setY1(f.floatValue());
        }
    }

    public abstract RectF a(float f);

    public abstract void b(float f);

    public abstract void c(float f, float f2);

    public abstract /* synthetic */ float getCenterX();

    public abstract /* synthetic */ float getCenterY();

    public abstract /* synthetic */ float getCropAspectRatio();

    public abstract /* synthetic */ float getCropHeight();

    public abstract /* synthetic */ RectF getCropRect();

    public abstract /* synthetic */ float getCropScale();

    public abstract /* synthetic */ float getCropWidth();

    public abstract /* synthetic */ float getX0();

    public abstract /* synthetic */ float getX1();

    public abstract /* synthetic */ float getY0();

    public abstract /* synthetic */ float getY1();

    public abstract void setLinesAndTransparentOverlayVisible(boolean z);

    public abstract void setOnCropChangeListener(h.d dVar);

    public abstract void setTopSidePadding(float f);

    public abstract void setTouchEnabled(boolean z);

    public abstract void setX0(float f);

    public abstract void setX1(float f);

    public abstract void setY0(float f);

    public abstract void setY1(float f);

    public void setOverlayColor(int i) {
    }

    public void setOverlayDrawable(@Nullable Drawable drawable) {
    }
}

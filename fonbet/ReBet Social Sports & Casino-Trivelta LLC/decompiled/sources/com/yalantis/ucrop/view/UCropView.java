package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import fd.e;
import fd.f;
import fd.i;
import gd.c;
import gd.d;

/* loaded from: classes4.dex */
public class UCropView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public GestureCropImageView f42319a;

    /* renamed from: b, reason: collision with root package name */
    public final OverlayView f42320b;

    public class a implements c {
        public a() {
        }

        @Override // gd.c
        public void a(float f10) {
            UCropView.this.f42320b.setTargetAspectRatio(f10);
        }
    }

    public class b implements d {
        public b() {
        }

        @Override // gd.d
        public void a(RectF rectF) {
            UCropView.this.f42319a.setCropRect(rectF);
        }
    }

    public UCropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void c() {
        this.f42319a.setCropBoundsChangeListener(new a());
        this.f42320b.setOverlayViewChangeListener(new b());
    }

    @NonNull
    public GestureCropImageView getCropImageView() {
        return this.f42319a;
    }

    @NonNull
    public OverlayView getOverlayView() {
        return this.f42320b;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public UCropView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(f.f46661d, (ViewGroup) this, true);
        this.f42319a = (GestureCropImageView) findViewById(e.f46633b);
        OverlayView overlayView = (OverlayView) findViewById(e.f46656y);
        this.f42320b = overlayView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.ucrop_UCropView);
        overlayView.g(obtainStyledAttributes);
        this.f42319a.A(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        c();
    }
}

package com.vk.imageloader.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.vk.imageloader.R$styleable;
import com.vk.imageloader.fresco.CallerContext;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import xsna.bpn0;
import xsna.d540;
import xsna.f5h0;
import xsna.flo;
import xsna.lpa0;
import xsna.njt;
import xsna.o360;
import xsna.ojt;
import xsna.rhs;
import xsna.sex0;
import xsna.x1c0;

/* loaded from: classes2.dex */
public class VKMultiImageView extends View {
    public final d540<njt> b;
    public bpn0 c;
    public Drawable d;
    public final SparseArray<String> e;

    public VKMultiImageView(Context context) {
        super(context);
        this.b = new d540<>();
        this.d = null;
        this.e = new SparseArray<>();
        d(context, null);
    }

    public final void b() {
        ojt ojtVar = new ojt(getContext().getResources());
        Drawable drawable = this.d;
        Drawable.ConstantState constantState = drawable != null ? drawable.getConstantState() : null;
        ojtVar.d = constantState != null ? constantState.newDrawable() : null;
        ojtVar.b = 0;
        ojtVar.l = f5h0.f.a;
        flo<njt> floVar = new flo<>(ojtVar.a());
        if (floVar.d() != null) {
            floVar.d().setCallback(this);
        }
        d540<njt> d540Var = this.b;
        ArrayList<flo<njt>> arrayList = d540Var.b;
        int size = arrayList.size();
        sex0.d(size, arrayList.size() + 1);
        arrayList.add(size, floVar);
        if (d540Var.a) {
            floVar.f();
        }
    }

    public final void d(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        if (!isInEditMode()) {
            ReentrantLock reentrantLock = rhs.a;
            this.c = new bpn0(new x1c0(12));
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.d);
        if (obtainStyledAttributes != null) {
            if (obtainStyledAttributes.hasValue(0)) {
                this.d = obtainStyledAttributes.getDrawable(0);
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [REQUEST, com.facebook.imagepipeline.request.ImageRequest] */
    public final void g(int i, @Nullable Uri uri) {
        SparseArray<String> sparseArray = this.e;
        d540<njt> d540Var = this.b;
        if (uri == null) {
            if (this.d == null) {
                njt njtVar = d540Var.a(i).d;
                njtVar.getClass();
                njtVar.p(null, 1);
            }
            d540Var.a(i).h(null);
            sparseArray.remove(i);
            return;
        }
        ImageRequestBuilder h = ImageRequestBuilder.h(uri);
        lpa0 lpa0Var = (lpa0) this.c.getValue();
        lpa0Var.d();
        lpa0Var.c = h.a();
        lpa0Var.l = d540Var.a(i).e;
        lpa0Var.b = CallerContext.Frontend;
        if (this.d == null) {
            njt njtVar2 = d540Var.a(i).d;
            njtVar2.getClass();
            njtVar2.p(null, 1);
        }
        d540Var.a(i).h(lpa0Var.b());
        sparseArray.put(i, uri.toString());
    }

    public final void h(int i, @Nullable String str) {
        if (str == null) {
            g(i, null);
        } else {
            g(i, Uri.parse(str));
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        invalidate();
    }

    public final void j(@Nullable Drawable drawable, int i) {
        d540<njt> d540Var = this.b;
        njt njtVar = d540Var.a(i).d;
        njtVar.getClass();
        njtVar.p(drawable, 1);
        d540Var.a(i).h(null);
        this.e.remove(i);
    }

    public final void k() {
        d540<njt> d540Var = this.b;
        ArrayList<flo<njt>> arrayList = d540Var.b;
        if (d540Var.a) {
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.get(i).g();
            }
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.b();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.c();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        SparseArray<String> sparseArray = this.e;
        if (sparseArray.size() > 0) {
            bpn0 bpn0Var = o360.e;
            o360 a = o360.a.a();
            for (int i = 0; i < sparseArray.size(); i++) {
                a.h(sparseArray.valueAt(i));
            }
            sparseArray.clear();
        }
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.b.b();
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.b.c();
    }

    public void setPlaceholder(@NonNull Drawable drawable) {
        this.d = drawable;
        int i = 0;
        while (true) {
            d540<njt> d540Var = this.b;
            if (i >= d540Var.b.size()) {
                return;
            }
            njt njtVar = d540Var.a(i).d;
            njtVar.getClass();
            njtVar.p(drawable, 1);
            i++;
        }
    }

    public void setScaleType(f5h0.d dVar) {
        int i = 0;
        while (true) {
            d540<njt> d540Var = this.b;
            if (i >= d540Var.b.size()) {
                return;
            }
            njt njtVar = d540Var.a(i).d;
            njtVar.getClass();
            njtVar.o(dVar);
            i++;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@NonNull Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        int i = 0;
        while (true) {
            d540<njt> d540Var = this.b;
            if (i >= d540Var.b.size()) {
                return false;
            }
            if (drawable == d540Var.a(i).d()) {
                return true;
            }
            i++;
        }
    }

    public VKMultiImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new d540<>();
        this.d = null;
        this.e = new SparseArray<>();
        d(context, attributeSet);
    }

    public VKMultiImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new d540<>();
        this.d = null;
        this.e = new SparseArray<>();
        d(context, attributeSet);
    }

    @TargetApi(21)
    public VKMultiImageView(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new d540<>();
        this.d = null;
        this.e = new SparseArray<>();
        d(context, attributeSet);
    }
}

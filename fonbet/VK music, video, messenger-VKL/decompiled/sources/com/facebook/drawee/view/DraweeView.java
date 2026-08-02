package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.facebook.drawee.view.a;
import com.unity3d.services.UnityAdsConstants;
import xsna.cq70;
import xsna.dlo;
import xsna.elo;
import xsna.flo;
import xsna.lhs;

@Deprecated
/* loaded from: classes.dex */
public class DraweeView<DH extends elo> extends ImageView {
    public static boolean h = false;
    public final a.C0107a b;
    public float c;
    public flo<DH> d;
    public boolean e;
    public boolean f;
    public Object g;

    public DraweeView(Context context) {
        super(context);
        this.b = new a.C0107a();
        this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.e = false;
        this.f = false;
        this.g = null;
        a(context);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        h = z;
    }

    public final void a(Context context) {
        try {
            if (lhs.d()) {
                lhs.a("DraweeView#init");
            }
            if (this.e) {
                if (lhs.d()) {
                    lhs.b();
                    return;
                }
                return;
            }
            boolean z = true;
            this.e = true;
            this.d = new flo<>(null);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                if (lhs.d()) {
                    lhs.b();
                    return;
                }
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!h || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.f = z;
            if (lhs.d()) {
                lhs.b();
            }
        } catch (Throwable th) {
            if (lhs.d()) {
                lhs.b();
            }
            throw th;
        }
    }

    public final void b() {
        Drawable drawable;
        if (!this.f || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public float getAspectRatio() {
        return this.c;
    }

    public dlo getController() {
        return this.d.e;
    }

    public Object getExtraData() {
        return this.g;
    }

    public DH getHierarchy() {
        DH dh = this.d.d;
        dh.getClass();
        return dh;
    }

    public Drawable getTopLevelDrawable() {
        return this.d.d();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        this.d.f();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        this.d.g();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        b();
        this.d.f();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        a.C0107a c0107a = this.b;
        c0107a.a = i;
        c0107a.b = i2;
        a.a(c0107a, this.c, getLayoutParams(), getPaddingRight() + getPaddingLeft(), getPaddingBottom() + getPaddingTop());
        super.onMeasure(c0107a.a, c0107a.b);
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        b();
        this.d.g();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        flo<DH> floVar = this.d;
        if (!floVar.e() ? false : floVar.e.d(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        b();
    }

    public void setAspectRatio(float f) {
        if (f == this.c) {
            return;
        }
        this.c = f;
        requestLayout();
    }

    public void setController(dlo dloVar) {
        this.d.h(dloVar);
        super.setImageDrawable(this.d.d());
    }

    public void setExtraData(Object obj) {
        this.g = obj;
    }

    public void setHierarchy(DH dh) {
        this.d.i(dh);
        super.setImageDrawable(this.d.d());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        a(getContext());
        this.d.h(null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        a(getContext());
        this.d.h(null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i) {
        a(getContext());
        this.d.h(null);
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        a(getContext());
        this.d.h(null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.f = z;
    }

    @Override // android.view.View
    public final String toString() {
        cq70.a b = cq70.b(this);
        flo<DH> floVar = this.d;
        b.b("holder", floVar != null ? floVar.toString() : "<no holder set>");
        return b.toString();
    }

    public DraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new a.C0107a();
        this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.e = false;
        this.f = false;
        this.g = null;
        a(context);
    }

    public DraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new a.C0107a();
        this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.e = false;
        this.f = false;
        this.g = null;
        a(context);
    }

    @TargetApi(21)
    public DraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new a.C0107a();
        this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.e = false;
        this.f = false;
        this.g = null;
        a(context);
    }
}

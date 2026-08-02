package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cc0 {
    public final ImageView a;
    public a08 b;
    public int c = 0;

    public cc0(ImageView imageView) {
        this.a = imageView;
    }

    public final void a() {
        a08 a08Var;
        ImageView imageView = this.a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            fb5.a(drawable);
        }
        if (drawable == null || (a08Var = this.b) == null) {
            return;
        }
        int[] drawableState = imageView.getDrawableState();
        PorterDuff.Mode mode = xb0.b;
        t1g.h(drawable, a08Var, drawableState);
    }

    public final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = this.a;
        Context context = imageView.getContext();
        int[] iArr = dkf.f;
        l2a y = l2a.y(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) y.c;
        bsk.p(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) y.c, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = td4.d0(resourceId, imageView.getContext())) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                fb5.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(y.m(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(fb5.c(typedArray.getInt(3, -1), null));
            }
            y.F();
        } catch (Throwable th) {
            y.F();
            throw th;
        }
    }

    public final void c(int i) {
        ImageView imageView = this.a;
        if (i != 0) {
            Drawable d0 = td4.d0(i, imageView.getContext());
            if (d0 != null) {
                fb5.a(d0);
            }
            imageView.setImageDrawable(d0);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}

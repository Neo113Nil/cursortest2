package com.facebook.drawee.drawable;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.drawee.drawable.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3014e {

    /* renamed from: a, reason: collision with root package name */
    public static final C3014e f30422a = new C3014e();

    public static final void a(Drawable drawable, Drawable drawable2) {
        if (drawable2 == null || drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    public static final int b(int i10) {
        int i11 = i10 >>> 24;
        if (i11 != 0) {
            return i11 != 255 ? -3 : -1;
        }
        return -2;
    }

    public static final int c(int i10, int i11) {
        if (i11 == 255) {
            return i10;
        }
        if (i11 == 0) {
            return i10 & 16777215;
        }
        return (i10 & 16777215) | ((((i10 >>> 24) * (i11 + (i11 >> 7))) >> 8) << 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(Drawable drawable, Drawable.Callback callback, E e10) {
        if (drawable == 0) {
            return;
        }
        drawable.setCallback(callback);
        D d10 = drawable instanceof D ? (D) drawable : null;
        if (d10 != null) {
            d10.setTransformCallback(e10);
        }
    }

    public static final void e(Drawable drawable, C3013d c3013d) {
        if (drawable == null || c3013d == null) {
            return;
        }
        c3013d.a(drawable);
    }
}

package H7;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class j extends h implements g {

    /* renamed from: d, reason: collision with root package name */
    public Drawable f4847d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4848e;

    public j(Drawable drawable) {
        this.f4847d = drawable;
    }

    @Override // H7.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4847d = null;
        this.f4848e = true;
    }

    @Override // H7.e, H7.m
    public int getHeight() {
        Drawable drawable = this.f4847d;
        if (drawable == null) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(drawable.getIntrinsicHeight());
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // H7.e, H7.m
    public int getWidth() {
        Drawable drawable = this.f4847d;
        if (drawable == null) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(drawable.getIntrinsicWidth());
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // H7.e
    public boolean isClosed() {
        return this.f4848e;
    }

    @Override // H7.g
    public Drawable l1() {
        Drawable.ConstantState constantState;
        Drawable drawable = this.f4847d;
        if (drawable == null || (constantState = drawable.getConstantState()) == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    @Override // H7.e
    public int o() {
        return getWidth() * getHeight() * 4;
    }
}

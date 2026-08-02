package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ku9 implements lxj, rq4, sti {
    public boolean a;
    public final ImageView b;

    public ku9(ImageView imageView) {
        this.b = imageView;
    }

    @Override // defpackage.sti
    public final void I(Drawable drawable) {
        b(drawable);
    }

    public final void a() {
        Object drawable = this.b.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.a) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void b(Drawable drawable) {
        ImageView imageView = this.b;
        Object drawable2 = imageView.getDrawable();
        Animatable animatable = drawable2 instanceof Animatable ? (Animatable) drawable2 : null;
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(drawable);
        a();
    }

    @Override // defpackage.sti
    public final void c(Drawable drawable) {
        b(drawable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ku9) {
            return this.b.equals(((ku9) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.sti
    public final void j(Drawable drawable) {
        b(drawable);
    }

    @Override // defpackage.lxj
    public final Drawable n() {
        return this.b.getDrawable();
    }

    @Override // defpackage.rq4
    public final void onStart(u6b u6bVar) {
        this.a = true;
        a();
    }

    @Override // defpackage.rq4
    public final void onStop(u6b u6bVar) {
        this.a = false;
        a();
    }
}

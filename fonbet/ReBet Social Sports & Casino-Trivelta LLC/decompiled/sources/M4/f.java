package M4;

import N4.d;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public abstract class f extends k implements d.a {

    /* renamed from: h, reason: collision with root package name */
    public Animatable f7480h;

    public f(ImageView imageView) {
        super(imageView);
    }

    @Override // com.bumptech.glide.manager.k
    public void b() {
        Animatable animatable = this.f7480h;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // com.bumptech.glide.manager.k
    public void d() {
        Animatable animatable = this.f7480h;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // N4.d.a
    public Drawable f() {
        return ((ImageView) this.f7485a).getDrawable();
    }

    @Override // M4.k, M4.a, M4.j
    public void i(Drawable drawable) {
        super.i(drawable);
        t(null);
        setDrawable(drawable);
    }

    @Override // M4.k, M4.a, M4.j
    public void j(Drawable drawable) {
        super.j(drawable);
        Animatable animatable = this.f7480h;
        if (animatable != null) {
            animatable.stop();
        }
        t(null);
        setDrawable(drawable);
    }

    @Override // M4.j
    public void m(Object obj, N4.d dVar) {
        if (dVar == null || !dVar.a(obj, this)) {
            t(obj);
        } else {
            r(obj);
        }
    }

    @Override // M4.a, M4.j
    public void n(Drawable drawable) {
        super.n(drawable);
        t(null);
        setDrawable(drawable);
    }

    public final void r(Object obj) {
        if (!(obj instanceof Animatable)) {
            this.f7480h = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f7480h = animatable;
        animatable.start();
    }

    public abstract void s(Object obj);

    @Override // N4.d.a
    public void setDrawable(Drawable drawable) {
        ((ImageView) this.f7485a).setImageDrawable(drawable);
    }

    public final void t(Object obj) {
        s(obj);
        r(obj);
    }
}

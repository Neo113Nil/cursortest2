package m6;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class f<Z> extends i<ImageView, Z> {

    /* renamed from: c, reason: collision with root package name */
    private Animatable f74470c;

    public final Drawable b() {
        return this.f74471a.getDrawable();
    }

    public final void c(Drawable drawable) {
        this.f74471a.setImageDrawable(drawable);
    }

    protected abstract void d(Z z11);

    @Override // m6.i, m6.h
    public final void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.f74470c;
        if (animatable != null) {
            animatable.stop();
        }
        d(null);
        this.f74470c = null;
        c(drawable);
    }

    @Override // m6.AbstractC8088a, m6.h
    public final void onLoadFailed(Drawable drawable) {
        d(null);
        this.f74470c = null;
        c(drawable);
    }

    @Override // m6.i, m6.h
    public final void onLoadStarted(Drawable drawable) {
        d(null);
        this.f74470c = null;
        c(drawable);
    }

    @Override // m6.h
    public final void onResourceReady(@NonNull Z z11, n6.c<? super Z> cVar) {
        if (cVar != null && cVar.b(z11, this)) {
            if (!(z11 instanceof Animatable)) {
                this.f74470c = null;
                return;
            }
            Animatable animatable = (Animatable) z11;
            this.f74470c = animatable;
            animatable.start();
            return;
        }
        d(z11);
        if (!(z11 instanceof Animatable)) {
            this.f74470c = null;
            return;
        }
        Animatable animatable2 = (Animatable) z11;
        this.f74470c = animatable2;
        animatable2.start();
    }

    @Override // m6.AbstractC8088a, i6.m
    public final void onStart() {
        Animatable animatable = this.f74470c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // m6.AbstractC8088a, i6.m
    public final void onStop() {
        Animatable animatable = this.f74470c;
        if (animatable != null) {
            animatable.stop();
        }
    }
}

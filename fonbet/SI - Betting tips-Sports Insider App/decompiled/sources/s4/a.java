package s4;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.e0;
import androidx.lifecycle.j;
import c4.m;
import c4.p;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements DefaultLifecycleObserver, b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f22621a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f22622b;

    public a(ImageView imageView) {
        this.f22622b = imageView;
    }

    public final void a() {
        Object drawable = this.f22622b.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.f22621a) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    @Override // s4.b
    public final void b(m mVar) {
        e(mVar);
    }

    @Override // s4.b
    public final void d(m mVar) {
        e(mVar);
    }

    public final void e(m mVar) {
        ImageView imageView = this.f22622b;
        Drawable b10 = mVar != null ? p.b(mVar, imageView.getResources()) : null;
        Object drawable = imageView.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(b10);
        a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f22622b, ((a) obj).f22622b);
    }

    @Override // s4.b
    public final void f(m mVar) {
        e(mVar);
    }

    public final int hashCode() {
        return this.f22622b.hashCode();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(e0 e0Var) {
        j.a(this, e0Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(e0 e0Var) {
        j.b(this, e0Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(e0 e0Var) {
        j.c(this, e0Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(e0 e0Var) {
        j.d(this, e0Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(e0 e0Var) {
        this.f22621a = true;
        a();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(e0 e0Var) {
        this.f22621a = false;
        a();
    }

    public final String toString() {
        return "ImageViewTarget(view=" + this.f22622b + ')';
    }
}

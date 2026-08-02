package h20;

import android.os.Looper;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c implements J {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private L f64733a = new L(this);

    public final void a() {
        if (Looper.getMainLooper().isCurrentThread()) {
            if (this.f64733a.b() != AbstractC5434v.b.INITIALIZED) {
                this.f64733a.j(AbstractC5434v.b.DESTROYED);
                this.f64733a = new L(this);
            }
            this.f64733a.j(AbstractC5434v.b.RESUMED);
        }
    }

    public final void b() {
        if (Looper.getMainLooper().isCurrentThread()) {
            if (this.f64733a.b() == AbstractC5434v.b.INITIALIZED) {
                this.f64733a = new L(this);
            } else {
                this.f64733a.j(AbstractC5434v.b.DESTROYED);
            }
        }
    }

    public final boolean c() {
        return this.f64733a.b().a(AbstractC5434v.b.INITIALIZED);
    }

    @Override // androidx.lifecycle.J
    @NotNull
    public final AbstractC5434v getLifecycle() {
        return this.f64733a;
    }
}

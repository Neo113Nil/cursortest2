package x5;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z5.InterfaceC10986d;

/* renamed from: x5.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10657a implements InterfaceC10659c<ImageView>, InterfaceC10986d, DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    private boolean f105027a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ImageView f105028b;

    public C10657a(@NotNull ImageView imageView) {
        this.f105028b = imageView;
    }

    @Override // x5.InterfaceC10658b
    public final void a(@NotNull Drawable drawable) {
        f(drawable);
    }

    @Override // x5.InterfaceC10658b
    public final void b(Drawable drawable) {
        f(drawable);
    }

    @Override // x5.InterfaceC10658b
    public final void c(Drawable drawable) {
        f(drawable);
    }

    public final Drawable d() {
        return this.f105028b.getDrawable();
    }

    protected final void e() {
        Object d11 = d();
        Animatable animatable = d11 instanceof Animatable ? (Animatable) d11 : null;
        if (animatable == null) {
            return;
        }
        if (this.f105027a) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10657a) {
            return Intrinsics.d(this.f105028b, ((C10657a) obj).f105028b);
        }
        return false;
    }

    protected final void f(Drawable drawable) {
        Object d11 = d();
        Animatable animatable = d11 instanceof Animatable ? (Animatable) d11 : null;
        if (animatable != null) {
            animatable.stop();
        }
        this.f105028b.setImageDrawable(drawable);
        e();
    }

    @Override // x5.InterfaceC10659c
    public final ImageView getView() {
        return this.f105028b;
    }

    public final int hashCode() {
        return this.f105028b.hashCode();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(@NotNull J j11) {
        this.f105027a = true;
        e();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(@NotNull J j11) {
        this.f105027a = false;
        e();
    }
}

package n0;

import android.content.Context;
import android.widget.EdgeEffect;
import org.jetbrains.annotations.NotNull;

/* renamed from: n0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8362C extends EdgeEffect {

    /* renamed from: a, reason: collision with root package name */
    private final float f76058a;

    /* renamed from: b, reason: collision with root package name */
    private float f76059b;

    public C8362C(@NotNull Context context) {
        super(context);
        this.f76058a = Z1.a.a(context).g() * 1;
    }

    public final void a(float f7) {
        float f11 = this.f76059b + f7;
        this.f76059b = f11;
        if (Math.abs(f11) > this.f76058a) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i11) {
        this.f76059b = 0.0f;
        super.onAbsorb(i11);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f7, float f11) {
        this.f76059b = 0.0f;
        super.onPull(f7, f11);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f76059b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f7) {
        this.f76059b = 0.0f;
        super.onPull(f7);
    }
}

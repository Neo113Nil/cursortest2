package y0;

import m0.InterfaceC8002m;
import org.jetbrains.annotations.NotNull;
import r0.InterfaceC9124d;

/* renamed from: y0.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10810q implements InterfaceC9124d {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b0 f105847b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC9124d f105848c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC8002m<Float> f105849d;

    public C10810q(@NotNull b0 b0Var, @NotNull InterfaceC9124d interfaceC9124d) {
        this.f105847b = b0Var;
        this.f105848c = interfaceC9124d;
        this.f105849d = interfaceC9124d.a();
    }

    @Override // r0.InterfaceC9124d
    @NotNull
    public final InterfaceC8002m<Float> a() {
        return this.f105849d;
    }

    @Override // r0.InterfaceC9124d
    public final float b(float f7, float f11, float f12) {
        float b11 = this.f105848c.b(f7, f11, f12);
        b0 b0Var = this.f105847b;
        if (b11 == 0.0f) {
            if (b0Var.v() == 0) {
                return 0.0f;
            }
            float v11 = b0Var.v() * (-1.0f);
            if (b0Var.y()) {
                v11 += b0Var.E();
            }
            return kotlin.ranges.h.d(v11, -f12, f12);
        }
        float v12 = b0Var.v() * (-1);
        while (b11 > 0.0f && v12 < b11) {
            v12 += b0Var.E();
        }
        while (b11 < 0.0f && v12 > b11) {
            v12 -= b0Var.E();
        }
        return v12;
    }
}

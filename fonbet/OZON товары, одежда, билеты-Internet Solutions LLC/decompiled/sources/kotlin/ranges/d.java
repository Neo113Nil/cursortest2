package kotlin.ranges;

import kd.InterfaceC7663b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class d implements InterfaceC7663b<Float> {

    /* renamed from: a, reason: collision with root package name */
    private final float f71839a;

    /* renamed from: b, reason: collision with root package name */
    private final float f71840b;

    public d(float f7, float f11) {
        this.f71839a = f7;
        this.f71840b = f11;
    }

    @Override // kd.InterfaceC7663b
    public final boolean b(Float f7, Float f11) {
        return f7.floatValue() <= f11.floatValue();
    }

    @Override // kd.InterfaceC7663b
    public final boolean c(Float f7) {
        float floatValue = f7.floatValue();
        return floatValue >= this.f71839a && floatValue <= this.f71840b;
    }

    @Override // kd.InterfaceC7664c
    public final Comparable e() {
        return Float.valueOf(this.f71840b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f71839a == dVar.f71839a && this.f71840b == dVar.f71840b;
    }

    @Override // kd.InterfaceC7664c
    public final Comparable getStart() {
        return Float.valueOf(this.f71839a);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.hashCode(this.f71840b) + (Float.hashCode(this.f71839a) * 31);
    }

    @Override // kd.InterfaceC7664c
    public final boolean isEmpty() {
        return this.f71839a > this.f71840b;
    }

    @NotNull
    public final String toString() {
        return this.f71839a + ".." + this.f71840b;
    }
}

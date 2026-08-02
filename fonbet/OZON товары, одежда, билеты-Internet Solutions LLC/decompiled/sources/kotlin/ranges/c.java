package kotlin.ranges;

import kd.InterfaceC7663b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class c implements InterfaceC7663b<Double> {

    /* renamed from: a, reason: collision with root package name */
    private final double f71837a;

    /* renamed from: b, reason: collision with root package name */
    private final double f71838b;

    public c(double d11, double d12) {
        this.f71837a = d11;
        this.f71838b = d12;
    }

    @Override // kd.InterfaceC7663b
    public final boolean b(Double d11, Double d12) {
        return d11.doubleValue() <= d12.doubleValue();
    }

    @Override // kd.InterfaceC7663b
    public final boolean c(Double d11) {
        double doubleValue = d11.doubleValue();
        return doubleValue >= this.f71837a && doubleValue <= this.f71838b;
    }

    @Override // kd.InterfaceC7664c
    public final Comparable e() {
        return Double.valueOf(this.f71838b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.f71837a == cVar.f71837a && this.f71838b == cVar.f71838b;
    }

    @Override // kd.InterfaceC7664c
    public final Comparable getStart() {
        return Double.valueOf(this.f71837a);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Double.hashCode(this.f71838b) + (Double.hashCode(this.f71837a) * 31);
    }

    @Override // kd.InterfaceC7664c
    public final boolean isEmpty() {
        return this.f71837a > this.f71838b;
    }

    @NotNull
    public final String toString() {
        return this.f71837a + ".." + this.f71838b;
    }
}

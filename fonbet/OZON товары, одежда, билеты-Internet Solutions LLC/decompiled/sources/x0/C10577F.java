package x0;

import S0.A1;
import S0.C3991w0;
import S0.n1;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* renamed from: x0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10577F implements A1<IntRange> {

    /* renamed from: a, reason: collision with root package name */
    private final int f104669a;

    /* renamed from: b, reason: collision with root package name */
    private final int f104670b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3991w0 f104671c;

    /* renamed from: d, reason: collision with root package name */
    private int f104672d;

    /* renamed from: x0.F$a */
    private static final class a {
    }

    public C10577F(int i11, int i12, int i13) {
        this.f104669a = i12;
        this.f104670b = i13;
        int i14 = (i11 / i12) * i12;
        this.f104671c = n1.f(kotlin.ranges.h.o(Math.max(i14 - i13, 0), i14 + i12 + i13), n1.n());
        this.f104672d = i11;
    }

    public final void b(int i11) {
        if (i11 != this.f104672d) {
            this.f104672d = i11;
            int i12 = this.f104669a;
            int i13 = (i11 / i12) * i12;
            int i14 = this.f104670b;
            this.f104671c.setValue(kotlin.ranges.h.o(Math.max(i13 - i14, 0), i13 + i12 + i14));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // S0.A1
    public final IntRange getValue() {
        return (IntRange) this.f104671c.getValue();
    }
}

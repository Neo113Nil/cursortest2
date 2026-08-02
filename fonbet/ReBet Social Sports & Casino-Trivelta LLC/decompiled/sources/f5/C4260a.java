package f5;

import e5.AbstractC4178a;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: f5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4260a {

    /* renamed from: a, reason: collision with root package name */
    public final int f46389a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f46390b;

    /* renamed from: c, reason: collision with root package name */
    public int f46391c;

    @NotNull
    private final double[] samples;

    public C4260a(int i10) {
        this.f46389a = i10;
        this.f46390b = new Object();
        this.samples = new double[i10];
    }

    public final void a(double d10) {
        int i10 = this.f46391c;
        int i11 = this.f46389a;
        if (i10 < i11) {
            double[] dArr = this.samples;
            this.f46391c = i10 + 1;
            dArr[i10] = d10;
        } else {
            this.samples[i10 % i11] = d10;
            this.f46391c = i10 + 1;
        }
    }

    public final void b() {
        synchronized (this.f46390b) {
            this.f46391c = 0;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final MobileVitalsSnapshot c(AbstractC4178a units) {
        Intrinsics.checkNotNullParameter(units, "units");
        synchronized (this.f46390b) {
            int i10 = this.f46391c;
            if (i10 == 0) {
                return new MobileVitalsSnapshot(units, Double.NaN, Double.NaN, Double.NaN, Double.NaN);
            }
            int min = Math.min(i10, this.f46389a);
            double[] copyOf = Arrays.copyOf(this.samples, min);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            ArraysKt.sort(copyOf);
            double d10 = min;
            MobileVitalsSnapshot mobileVitalsSnapshot = new MobileVitalsSnapshot(units, P5.a.a(ArraysKt.first(copyOf)), P5.a.a(ArraysKt.last(copyOf)), P5.a.a(ArraysKt.sum(copyOf) / d10), P5.a.a(copyOf[Math.max(1, (int) Math.ceil(d10 * 0.95d)) - 1]));
            b();
            return mobileVitalsSnapshot;
        }
    }

    public /* synthetic */ C4260a(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 1000 : i10);
    }
}

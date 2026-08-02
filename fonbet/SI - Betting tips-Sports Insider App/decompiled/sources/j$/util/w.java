package j$.util;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class w implements DoubleConsumer {

    /* renamed from: a, reason: collision with root package name */
    public double f18190a;

    /* renamed from: b, reason: collision with root package name */
    public double f18191b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.count++;
        this.f18191b += d10;
        b(d10);
        this.min = Math.min(this.min, d10);
        this.max = Math.max(this.max, d10);
    }

    public final void a(w wVar) {
        this.count += wVar.count;
        this.f18191b += wVar.f18191b;
        b(wVar.sum);
        b(wVar.f18190a);
        this.min = Math.min(this.min, wVar.min);
        this.max = Math.max(this.max, wVar.max);
    }

    public final void b(double d10) {
        double d11 = d10 - this.f18190a;
        double d12 = this.sum;
        double d13 = d12 + d11;
        this.f18190a = (d13 - d12) - d11;
        this.sum = d13;
    }

    public final String toString() {
        double d10;
        String simpleName = w.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        double d11 = this.sum + this.f18190a;
        if (Double.isNaN(d11) && Double.isInfinite(this.f18191b)) {
            d11 = this.f18191b;
        }
        Double valueOf2 = Double.valueOf(d11);
        Double valueOf3 = Double.valueOf(this.min);
        if (this.count > 0) {
            double d12 = this.sum + this.f18190a;
            if (Double.isNaN(d12) && Double.isInfinite(this.f18191b)) {
                d12 = this.f18191b;
            }
            d10 = d12 / this.count;
        } else {
            d10 = 0.0d;
        }
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(d10), Double.valueOf(this.max));
    }
}

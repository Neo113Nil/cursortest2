package cd;

import android.animation.FloatEvaluator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: cd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2915a extends FloatEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f27724a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f27725b;

    /* renamed from: c, reason: collision with root package name */
    public Number f27726c;

    /* renamed from: d, reason: collision with root package name */
    public Number f27727d;

    public C2915a(Function1 startValueProvider, Function1 endValueProvider) {
        Intrinsics.checkNotNullParameter(startValueProvider, "startValueProvider");
        Intrinsics.checkNotNullParameter(endValueProvider, "endValueProvider");
        this.f27724a = startValueProvider;
        this.f27725b = endValueProvider;
    }

    public final Number a(Number number) {
        if (this.f27727d == null) {
            this.f27727d = (Number) this.f27725b.invoke(number);
        }
        return this.f27727d;
    }

    public final Number b(Number number) {
        if (this.f27726c == null) {
            this.f27726c = (Number) this.f27724a.invoke(number);
        }
        return this.f27726c;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.animation.TypeEvaluator
    public Float evaluate(float f10, Number number, Number number2) {
        Number b10 = b(number);
        Number a10 = a(number2);
        if (b10 == null || a10 == null) {
            return null;
        }
        return super.evaluate(f10, b10, a10);
    }
}

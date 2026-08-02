package y0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class Y extends AbstractC7737t implements Function1<Float, Float> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b0 f105730b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Y(b0 b0Var) {
        super(1);
        this.f105730b = b0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(Float f7) {
        return Float.valueOf(b0.j(this.f105730b, f7.floatValue()));
    }
}

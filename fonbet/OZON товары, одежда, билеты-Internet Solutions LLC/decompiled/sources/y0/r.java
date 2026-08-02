package y0;

import fd.InterfaceC6511n;
import kotlin.jvm.internal.AbstractC7737t;
import s0.C9563f;

/* loaded from: classes8.dex */
final class r extends AbstractC7737t implements InterfaceC6511n<Float, Float, Float, Float> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b0 f105850b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Z1.s f105851c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(b0 b0Var, Z1.s sVar) {
        super(3);
        this.f105850b = b0Var;
        this.f105851c = sVar;
    }

    @Override // fd.InterfaceC6511n
    public final Float invoke(Float f7, Float f11, Float f12) {
        return Float.valueOf(C9563f.d(this.f105850b, this.f105851c, f7.floatValue(), f11.floatValue(), f12.floatValue()));
    }
}

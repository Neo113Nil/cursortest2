package r0;

import S0.InterfaceC3978p0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: r0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C9109J extends AbstractC7737t implements Function1<Float, Float> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f82406b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9109J(InterfaceC3978p0 interfaceC3978p0) {
        super(1);
        this.f82406b = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(Float f7) {
        return (Float) ((Function1) this.f82406b.getValue()).invoke(Float.valueOf(f7.floatValue()));
    }
}

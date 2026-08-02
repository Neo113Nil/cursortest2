package z0;

import D1.AbstractC2810k0;
import k1.C7460f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import r0.C9126f;

/* loaded from: classes8.dex */
final class g extends AbstractC7737t implements Function0<C7460f> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f106872b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC2810k0 f106873c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f106874d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    g(e eVar, AbstractC2810k0 abstractC2810k0, Function0 function0) {
        super(0);
        this.f106872b = eVar;
        this.f106873c = abstractC2810k0;
        this.f106874d = (AbstractC7737t) function0;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // kotlin.jvm.functions.Function0
    public final C7460f invoke() {
        AbstractC2810k0 abstractC2810k0 = this.f106873c;
        ?? r12 = this.f106874d;
        e eVar = this.f106872b;
        C7460f I12 = e.I1(eVar, abstractC2810k0, r12);
        if (I12 != null) {
            return ((C9126f) eVar.J1()).R1(I12);
        }
        return null;
    }
}

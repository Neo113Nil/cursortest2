package y0;

import S0.InterfaceC3978p0;
import fd.InterfaceC6512o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: y0.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10802i extends AbstractC7737t implements Function0<D> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f105825b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f105826c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function0<Integer> f105827d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10802i(Function0 function0, InterfaceC3978p0 interfaceC3978p0, InterfaceC3978p0 interfaceC3978p02) {
        super(0);
        this.f105825b = interfaceC3978p0;
        this.f105826c = interfaceC3978p02;
        this.f105827d = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final D invoke() {
        return new D((InterfaceC6512o) this.f105825b.getValue(), (Function1) this.f105826c.getValue(), this.f105827d.invoke().intValue());
    }
}

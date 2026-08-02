package rf;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import sf.C9684j;
import sf.InterfaceC9682h;

/* renamed from: rf.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9262a extends AbstractC7737t implements Function1<InterfaceC9682h, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f83363b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f83364c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9262a(r rVar, g gVar) {
        super(1);
        this.f83363b = rVar;
        this.f83364c = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC9682h interfaceC9682h) {
        InterfaceC9682h it = interfaceC9682h;
        Intrinsics.checkNotNullParameter(it, "it");
        g gVar = this.f83364c;
        C9684j a11 = gVar.a();
        r rVar = this.f83363b;
        rVar.l(a11);
        rVar.b(gVar.b());
        return Unit.f71690a;
    }
}

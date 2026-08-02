package w0;

import B1.m0;
import S0.InterfaceC3978p0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: w0.C, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10376C extends AbstractC7737t implements Function1<m0.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f103131b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Unit> f103132c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10376C(ArrayList arrayList, InterfaceC3978p0 interfaceC3978p0) {
        super(1);
        this.f103131b = arrayList;
        this.f103132c = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(m0.a aVar) {
        m0.a aVar2 = aVar;
        ArrayList arrayList = this.f103131b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((C10378E) arrayList.get(i11)).s(aVar2);
        }
        this.f103132c.getValue();
        return Unit.f71690a;
    }
}

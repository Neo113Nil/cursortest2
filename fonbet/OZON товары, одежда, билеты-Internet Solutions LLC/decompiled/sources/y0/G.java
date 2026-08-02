package y0;

import B1.m0;
import S0.InterfaceC3978p0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class G extends AbstractC7737t implements Function1<m0.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f105652b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Unit> f105653c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G(ArrayList arrayList, InterfaceC3978p0 interfaceC3978p0) {
        super(1);
        this.f105652b = arrayList;
        this.f105653c = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(m0.a aVar) {
        m0.a aVar2 = aVar;
        ArrayList arrayList = this.f105652b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((C10806m) arrayList.get(i11)).d(aVar2);
        }
        this.f105653c.getValue();
        return Unit.f71690a;
    }
}

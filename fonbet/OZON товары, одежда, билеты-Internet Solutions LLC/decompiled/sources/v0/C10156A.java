package v0;

import B1.m0;
import S0.InterfaceC3978p0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: v0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10156A extends AbstractC7737t implements Function1<m0.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f101413b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C10158C f101414c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f101415d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Unit> f101416e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10156A(ArrayList arrayList, C10158C c10158c, boolean z11, InterfaceC3978p0 interfaceC3978p0) {
        super(1);
        this.f101413b = arrayList;
        this.f101414c = c10158c;
        this.f101415d = z11;
        this.f101416e = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(m0.a aVar) {
        C10158C c10158c;
        boolean z11;
        m0.a aVar2 = aVar;
        ArrayList arrayList = this.f101413b;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            c10158c = this.f101414c;
            z11 = this.f101415d;
            if (i11 >= size) {
                break;
            }
            C10158C c10158c2 = (C10158C) arrayList.get(i11);
            if (c10158c2 != c10158c) {
                c10158c2.o(aVar2, z11);
            }
            i11++;
        }
        if (c10158c != null) {
            c10158c.o(aVar2, z11);
        }
        this.f101416e.getValue();
        return Unit.f71690a;
    }
}

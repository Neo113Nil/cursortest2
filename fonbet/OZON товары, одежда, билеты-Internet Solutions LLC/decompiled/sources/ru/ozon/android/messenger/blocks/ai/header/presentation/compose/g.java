package ru.ozon.android.messenger.blocks.ai.header.presentation.compose;

import B1.m0;
import J0.C3354v2;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class g extends AbstractC7737t implements Function1<m0.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f84147b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ArrayList f84148c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ArrayList f84149d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f84150e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f84151f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f84152g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f84153h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i11, int i12, long j11, int i13) {
        super(1);
        this.f84147b = arrayList;
        this.f84148c = arrayList2;
        this.f84149d = arrayList3;
        this.f84150e = i11;
        this.f84151f = i12;
        this.f84152g = j11;
        this.f84153h = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(m0.a aVar) {
        int i11;
        long j11;
        m0.a layout = aVar;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Iterator it = this.f84147b.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i11 = this.f84151f;
            if (!hasNext) {
                break;
            }
            m0 m0Var = (m0) it.next();
            layout.h(m0Var, this.f84150e, C3354v2.d(i11, 2, m0Var), 0.0f);
        }
        Iterator it2 = this.f84148c.iterator();
        while (true) {
            boolean hasNext2 = it2.hasNext();
            j11 = this.f84152g;
            if (!hasNext2) {
                break;
            }
            m0 m0Var2 = (m0) it2.next();
            layout.h(m0Var2, (Z1.b.k(j11) - m0Var2.u0()) / 2, C3354v2.d(i11, 2, m0Var2), 0.0f);
        }
        for (m0 m0Var3 : this.f84149d) {
            layout.h(m0Var3, (Z1.b.k(j11) - m0Var3.u0()) - this.f84153h, C3354v2.d(i11, 2, m0Var3), 0.0f);
        }
        return Unit.f71690a;
    }
}

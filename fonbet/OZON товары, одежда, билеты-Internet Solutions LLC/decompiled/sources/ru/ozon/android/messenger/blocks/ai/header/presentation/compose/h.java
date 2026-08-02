package ru.ozon.android.messenger.blocks.ai.header.presentation.compose;

import B1.U;
import B1.W;
import B1.m0;
import B1.z0;
import a1.C4912a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;

/* loaded from: classes10.dex */
final class h extends AbstractC7737t implements Function2<z0, Z1.b, W> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f84154b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f84155c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f84156d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4912a f84157e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C4912a f84158f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(float f7, float f11, C4912a c4912a, C4912a c4912a2, C4912a c4912a3) {
        super(2);
        this.f84154b = f7;
        this.f84155c = f11;
        this.f84156d = c4912a;
        this.f84157e = c4912a2;
        this.f84158f = c4912a3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final W invoke(z0 z0Var, Z1.b bVar) {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        W z02;
        z0 SubcomposeLayout = z0Var;
        long p11 = bVar.p();
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int Y02 = SubcomposeLayout.Y0(this.f84154b);
        int Y03 = SubcomposeLayout.Y0(this.f84155c);
        long c11 = Z1.b.c(0, 0, 0, 0, 10, p11);
        List<U> L02 = SubcomposeLayout.L0("left", this.f84156d);
        ArrayList arrayList = new ArrayList(C7714v.z(L02, 10));
        Iterator<T> it = L02.iterator();
        while (it.hasNext()) {
            arrayList.add(((U) it.next()).a0(c11));
        }
        List<U> L03 = SubcomposeLayout.L0("right", this.f84157e);
        ArrayList arrayList2 = new ArrayList(C7714v.z(L03, 10));
        Iterator<T> it2 = L03.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((U) it2.next()).a0(c11));
        }
        Iterator it3 = arrayList.iterator();
        Integer num = null;
        if (it3.hasNext()) {
            valueOf = Integer.valueOf(((m0) it3.next()).u0());
            while (it3.hasNext()) {
                Integer valueOf5 = Integer.valueOf(((m0) it3.next()).u0());
                if (valueOf.compareTo(valueOf5) < 0) {
                    valueOf = valueOf5;
                }
            }
        } else {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        Iterator it4 = arrayList2.iterator();
        if (it4.hasNext()) {
            valueOf2 = Integer.valueOf(((m0) it4.next()).u0());
            while (it4.hasNext()) {
                Integer valueOf6 = Integer.valueOf(((m0) it4.next()).u0());
                if (valueOf2.compareTo(valueOf6) < 0) {
                    valueOf2 = valueOf6;
                }
            }
        } else {
            valueOf2 = null;
        }
        int k11 = Z1.b.k(p11) - (Math.max(intValue + Y02, (valueOf2 != null ? valueOf2.intValue() : 0) + Y03) * 2);
        if (k11 < 0) {
            k11 = 0;
        }
        List<U> L04 = SubcomposeLayout.L0(RichContentDTO.ALIGN_CENTER, this.f84158f);
        ArrayList arrayList3 = new ArrayList(C7714v.z(L04, 10));
        Iterator<T> it5 = L04.iterator();
        while (it5.hasNext()) {
            long j11 = c11;
            arrayList3.add(((U) it5.next()).a0(Z1.b.c(0, k11, 0, 0, 13, j11)));
            c11 = j11;
        }
        int l11 = Z1.b.l(p11);
        Iterator it6 = arrayList.iterator();
        if (it6.hasNext()) {
            valueOf3 = Integer.valueOf(((m0) it6.next()).l0());
            while (it6.hasNext()) {
                Integer valueOf7 = Integer.valueOf(((m0) it6.next()).l0());
                if (valueOf3.compareTo(valueOf7) < 0) {
                    valueOf3 = valueOf7;
                }
            }
        } else {
            valueOf3 = null;
        }
        int intValue2 = valueOf3 != null ? valueOf3.intValue() : 0;
        Iterator it7 = arrayList3.iterator();
        if (it7.hasNext()) {
            valueOf4 = Integer.valueOf(((m0) it7.next()).l0());
            while (it7.hasNext()) {
                Integer valueOf8 = Integer.valueOf(((m0) it7.next()).l0());
                if (valueOf4.compareTo(valueOf8) < 0) {
                    valueOf4 = valueOf8;
                }
            }
        } else {
            valueOf4 = null;
        }
        int intValue3 = valueOf4 != null ? valueOf4.intValue() : 0;
        Iterator it8 = arrayList2.iterator();
        if (it8.hasNext()) {
            Integer valueOf9 = Integer.valueOf(((m0) it8.next()).l0());
            while (it8.hasNext()) {
                Integer valueOf10 = Integer.valueOf(((m0) it8.next()).l0());
                if (valueOf9.compareTo(valueOf10) < 0) {
                    valueOf9 = valueOf10;
                }
            }
            num = valueOf9;
        }
        int c12 = Vc.a.c(new int[]{intValue2, intValue3, num != null ? num.intValue() : 0}, l11);
        z02 = SubcomposeLayout.z0(Z1.b.k(p11), c12, kotlin.collections.U.c(), new g(arrayList, arrayList3, arrayList2, Y02, c12, p11, Y03));
        return z02;
    }
}

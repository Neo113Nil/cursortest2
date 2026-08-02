package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21426a;

    public k(o p12, o p22) {
        Pair pair;
        Pair pair2;
        Intrinsics.checkNotNullParameter(p12, "start");
        Intrinsics.checkNotNullParameter(p22, "end");
        Intrinsics.checkNotNullParameter(p12, "p1");
        Intrinsics.checkNotNullParameter(p22, "p2");
        int i5 = j.f21422d;
        j u10 = a.a.u(new androidx.dynamicanimation.animation.g(p12.f21440b, p12.f21441c), p12);
        j u11 = a.a.u(new androidx.dynamicanimation.animation.g(p22.f21440b, p22.f21441c), p22);
        List features1 = u10.f21425c;
        List features2 = u11.f21425c;
        Intrinsics.checkNotNullParameter(features1, "features1");
        Intrinsics.checkNotNullParameter(features2, "features2");
        hf.e b10 = t.b();
        int size = features1.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((m) features1.get(i10)).f21428b instanceof e) {
                b10.add(features1.get(i10));
            }
        }
        hf.e a7 = t.a(b10);
        hf.e b11 = t.b();
        int size2 = features2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (((m) features2.get(i11)).f21428b instanceof e) {
                b11.add(features2.get(i11));
            }
        }
        hf.e a10 = t.a(b11);
        Pair pair3 = a7.a() > a10.a() ? new Pair(h.a(a10, a7), a10) : new Pair(a7, h.a(a7, a10));
        List list = (List) pair3.f19192a;
        List list2 = (List) pair3.f19193b;
        hf.e b12 = t.b();
        int size3 = list.size();
        for (int i12 = 0; i12 < size3 && i12 != list2.size(); i12++) {
            b12.add(new Pair(Float.valueOf(((m) list.get(i12)).f21427a), Float.valueOf(((m) list2.get(i12)).f21427a)));
        }
        Pair[] pairArr = (Pair[]) t.a(b12).toArray(new Pair[0]);
        d dVar = new d((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        s.m mVar = dVar.f21411a;
        s.m mVar2 = dVar.f21412b;
        float A = y4.a.A(mVar, mVar2, 0.0f);
        ArrayList arrayList = u11.f21424b;
        if (0.0f > A || A > 1.0f) {
            throw new IllegalArgumentException("Cutting point is expected to be between 0 and 1");
        }
        if (A >= 1.0E-4f) {
            Iterator it = arrayList.iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                }
                i iVar = (i) it.next();
                float f6 = iVar.f21419c;
                if (A <= iVar.f21420d && f6 <= A) {
                    break;
                } else {
                    i13++;
                }
            }
            Pair a11 = ((i) arrayList.get(i13)).a(A);
            i iVar2 = (i) a11.f19192a;
            ArrayList g10 = u.g(((i) a11.f19193b).f21417a);
            int size4 = arrayList.size();
            for (int i14 = 1; i14 < size4; i14++) {
                g10.add(((i) arrayList.get((i14 + i13) % arrayList.size())).f21417a);
            }
            g10.add(iVar2.f21417a);
            s.m mVar3 = new s.m(arrayList.size() + 2);
            int size5 = arrayList.size() + 2;
            int i15 = 0;
            while (i15 < size5) {
                mVar3.c(i15 == 0 ? 0.0f : i15 == arrayList.size() + 1 ? 1.0f : p.d(((i) arrayList.get(((i13 + i15) - 1) % arrayList.size())).f21420d - A, 1.0f));
                i15++;
            }
            hf.e b13 = t.b();
            int size6 = features2.size();
            for (int i16 = 0; i16 < size6; i16++) {
                b13.add(new m(p.d(((m) features2.get(i16)).f21427a - A, 1.0f), ((m) features2.get(i16)).f21428b));
            }
            u11 = new j(u11.f21423a, t.a(b13), g10, mVar3);
        }
        ArrayList arrayList2 = new ArrayList();
        i iVar3 = (i) CollectionsKt.G(0, u10);
        i iVar4 = (i) CollectionsKt.G(0, u11);
        int i17 = 1;
        int i18 = 1;
        while (iVar3 != null && iVar4 != null) {
            float f10 = i18 == u10.size() ? 1.0f : iVar3.f21420d;
            float A2 = i17 == u11.size() ? 1.0f : y4.a.A(mVar2, mVar, p.d(iVar4.f21420d + A, 1.0f));
            float min = Math.min(f10, A2);
            float f11 = 1.0E-6f + min;
            if (f10 > f11) {
                pair = iVar3.a(min);
            } else {
                Pair pair4 = new Pair(iVar3, CollectionsKt.G(i18, u10));
                i18++;
                pair = pair4;
            }
            i iVar5 = (i) pair.f19192a;
            iVar3 = (i) pair.f19193b;
            if (A2 > f11) {
                pair2 = iVar4.a(p.d(y4.a.A(mVar, mVar2, min) - A, 1.0f));
            } else {
                Pair pair5 = new Pair(iVar4, CollectionsKt.G(i17, u11));
                i17++;
                pair2 = pair5;
            }
            i iVar6 = (i) pair2.f19192a;
            iVar4 = (i) pair2.f19193b;
            arrayList2.add(new Pair(iVar5.f21417a, iVar6.f21417a));
        }
        if (iVar3 != null || iVar4 != null) {
            throw new IllegalArgumentException("Expected both Polygon's Cubic to be fully matched");
        }
        this.f21426a = arrayList2;
    }
}

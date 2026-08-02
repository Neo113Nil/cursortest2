package p1;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static final m8.a f21438e = new m8.a(2);

    /* renamed from: a, reason: collision with root package name */
    public final List f21439a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21440b;

    /* renamed from: c, reason: collision with root package name */
    public final float f21441c;

    /* renamed from: d, reason: collision with root package name */
    public final hf.e f21442d;

    /* JADX WARN: Multi-variable type inference failed */
    public o(AbstractList features, float f6, float f10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        char c2;
        c cVar;
        List list;
        char c8;
        Intrinsics.checkNotNullParameter(features, "features");
        this.f21439a = features;
        this.f21440b = f6;
        this.f21441c = f10;
        hf.e b10 = t.b();
        char c10 = 3;
        c cVar2 = null;
        if (features.size() <= 0 || ((g) features.get(0)).f21416a.size() != 3) {
            arrayList = null;
            arrayList2 = null;
        } else {
            Pair d10 = ((c) ((g) features.get(0)).f21416a.get(1)).d(0.5f);
            c cVar3 = (c) d10.f19192a;
            c cVar4 = (c) d10.f19193b;
            arrayList2 = u.g(((g) features.get(0)).f21416a.get(0), cVar3);
            arrayList = u.g(cVar4, ((g) features.get(0)).f21416a.get(2));
        }
        int size = features.size();
        if (size >= 0) {
            int i5 = 0;
            c cVar5 = null;
            while (true) {
                if (i5 == 0 && arrayList != null) {
                    list = arrayList;
                } else if (i5 != this.f21439a.size()) {
                    list = ((g) this.f21439a.get(i5)).f21416a;
                } else {
                    if (arrayList2 == null) {
                        c2 = c10;
                        break;
                    }
                    list = arrayList2;
                }
                int size2 = list.size();
                int i10 = 0;
                while (i10 < size2) {
                    c cVar6 = (c) list.get(i10);
                    if (cVar6.f()) {
                        c8 = c10;
                        if (cVar5 != null) {
                            float[] fArr = cVar5.f21410a;
                            fArr[6] = cVar6.a();
                            fArr[7] = cVar6.b();
                        }
                    } else {
                        if (cVar5 != null) {
                            b10.add(cVar5);
                        }
                        c8 = c10;
                        if (cVar2 == null) {
                            cVar2 = cVar6;
                            cVar5 = cVar2;
                        } else {
                            cVar5 = cVar6;
                        }
                    }
                    i10++;
                    c10 = c8;
                }
                c2 = c10;
                if (i5 == size) {
                    break;
                }
                i5++;
                c10 = c2;
            }
            cVar = cVar2;
            cVar2 = cVar5;
        } else {
            c2 = 3;
            cVar = null;
        }
        if (cVar2 != null && cVar != null) {
            float[] fArr2 = cVar2.f21410a;
            float f11 = fArr2[0];
            float f12 = fArr2[1];
            float f13 = fArr2[2];
            float f14 = fArr2[c2];
            float f15 = fArr2[4];
            float f16 = fArr2[5];
            float[] fArr3 = cVar.f21410a;
            b10.add(u6.h.a(f11, f12, f13, f14, f15, f16, fArr3[0], fArr3[1]));
        }
        hf.e a7 = t.a(b10);
        this.f21442d = a7;
        Object obj = a7.get(a7.a() - 1);
        int a10 = a7.a();
        int i11 = 0;
        while (i11 < a10) {
            c cVar7 = (c) this.f21442d.get(i11);
            c cVar8 = (c) obj;
            if (Math.abs(cVar7.f21410a[0] - cVar8.a()) > 1.0E-4f || Math.abs(cVar7.f21410a[1] - cVar8.b()) > 1.0E-4f) {
                throw new IllegalArgumentException("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
            }
            i11++;
            obj = cVar7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return Intrinsics.areEqual(this.f21439a, ((o) obj).f21439a);
    }

    public final int hashCode() {
        return this.f21439a.hashCode();
    }

    public final String toString() {
        return "[RoundedPolygon. Cubics = " + CollectionsKt.J(this.f21442d, null, null, null, null, 63) + " || Features = " + CollectionsKt.J(this.f21439a, null, null, null, null, 63) + " || Center = (" + this.f21440b + ", " + this.f21441c + ")]";
    }
}

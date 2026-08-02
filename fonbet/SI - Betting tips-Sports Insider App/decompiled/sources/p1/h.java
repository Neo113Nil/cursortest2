package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class h {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList a(hf.e f12, hf.e f22) {
        Intrinsics.checkNotNullParameter(f12, "f1");
        Intrinsics.checkNotNullParameter(f22, "f2");
        Iterator it = u.d(f22).iterator();
        zf.b bVar = (zf.b) it;
        if (!bVar.f25972c) {
            throw new NoSuchElementException();
        }
        i0 i0Var = (i0) it;
        int nextInt = i0Var.nextInt();
        if (bVar.f25972c) {
            float b10 = b(((m) f12.get(0)).f21428b, ((m) f22.get(nextInt)).f21428b);
            do {
                int nextInt2 = i0Var.nextInt();
                float b11 = b(((m) f12.get(0)).f21428b, ((m) f22.get(nextInt2)).f21428b);
                if (Float.compare(b10, b11) > 0) {
                    nextInt = nextInt2;
                    b10 = b11;
                }
            } while (bVar.f25972c);
        }
        int a7 = f12.a();
        int a10 = f22.a();
        ArrayList g10 = u.g(f22.get(nextInt));
        int i5 = nextInt;
        for (int i10 = 1; i10 < a7; i10++) {
            int i11 = nextInt - (a7 - i10);
            if (i11 <= i5) {
                i11 += a10;
            }
            Iterator it2 = new IntRange(i5 + 1, i11, 1).iterator();
            zf.b bVar2 = (zf.b) it2;
            if (!bVar2.f25972c) {
                throw new NoSuchElementException();
            }
            i0 i0Var2 = (i0) it2;
            int nextInt3 = i0Var2.nextInt();
            if (bVar2.f25972c) {
                float b12 = b(((m) f12.get(i10)).f21428b, ((m) f22.get(nextInt3 % a10)).f21428b);
                do {
                    int nextInt4 = i0Var2.nextInt();
                    float b13 = b(((m) f12.get(i10)).f21428b, ((m) f22.get(nextInt4 % a10)).f21428b);
                    if (Float.compare(b12, b13) > 0) {
                        nextInt3 = nextInt4;
                        b12 = b13;
                    }
                } while (bVar2.f25972c);
            }
            i5 = nextInt3;
            g10.add(f22.get(i5 % a10));
        }
        return g10;
    }

    public static final float b(g f12, g f22) {
        Intrinsics.checkNotNullParameter(f12, "f1");
        Intrinsics.checkNotNullParameter(f22, "f2");
        if ((f12 instanceof e) && (f22 instanceof e) && ((e) f12).f21415d != ((e) f22).f21415d) {
            return Float.MAX_VALUE;
        }
        List list = f12.f21416a;
        List list2 = f12.f21416a;
        float a7 = (((c) CollectionsKt.K(list2)).a() + ((c) CollectionsKt.F(list)).f21410a[0]) / 2.0f;
        float b10 = (((c) CollectionsKt.K(list2)).b() + ((c) CollectionsKt.F(list2)).f21410a[1]) / 2.0f;
        List list3 = f22.f21416a;
        List list4 = f22.f21416a;
        float a10 = (((c) CollectionsKt.K(list4)).a() + ((c) CollectionsKt.F(list3)).f21410a[0]) / 2.0f;
        float f6 = a7 - a10;
        float b11 = b10 - ((((c) CollectionsKt.K(list4)).b() + ((c) CollectionsKt.F(list4)).f21410a[1]) / 2.0f);
        return (b11 * b11) + (f6 * f6);
    }
}

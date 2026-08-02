package s;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f22564a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f22565b = {-9187201950435737345L, -1};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f22566c = new Object();

    public static final void a(o oVar) {
        int i5 = oVar.f22579d;
        int[] iArr = oVar.f22577b;
        Object[] objArr = oVar.f22578c;
        int i10 = 0;
        for (int i11 = 0; i11 < i5; i11++) {
            Object obj = objArr[i11];
            if (obj != f22566c) {
                if (i11 != i10) {
                    iArr[i10] = iArr[i11];
                    objArr[i10] = obj;
                    objArr[i11] = null;
                }
                i10++;
            }
        }
        oVar.f22576a = false;
        oVar.f22579d = i10;
    }

    public static final void b(f fVar, int i5) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int[] iArr = new int[i5];
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        fVar.f22553a = iArr;
        Object[] objArr = new Object[i5];
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        fVar.f22554b = objArr;
    }

    public static final int c(f fVar, Object obj, int i5) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int i10 = fVar.f22555c;
        if (i10 == 0) {
            return -1;
        }
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        try {
            int a7 = t.a.a(fVar.f22555c, i5, fVar.f22553a);
            if (a7 < 0 || Intrinsics.areEqual(obj, fVar.f22554b[a7])) {
                return a7;
            }
            int i11 = a7 + 1;
            while (i11 < i10 && fVar.f22553a[i11] == i5) {
                if (Intrinsics.areEqual(obj, fVar.f22554b[i11])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = a7 - 1; i12 >= 0 && fVar.f22553a[i12] == i5; i12--) {
                if (Intrinsics.areEqual(obj, fVar.f22554b[i12])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}

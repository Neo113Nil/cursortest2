package z;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f68470a = new Object();

    public static final Object c(s sVar, int i10) {
        Object obj;
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        int a10 = A.a.a(sVar.keys, sVar.f68469b, i10);
        if (a10 < 0 || (obj = sVar.values[a10]) == f68470a) {
            return null;
        }
        return obj;
    }

    public static final void d(s sVar, int i10) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        int a10 = A.a.a(sVar.keys, sVar.f68469b, i10);
        if (a10 >= 0) {
            Object[] objArr = sVar.values;
            Object obj = objArr[a10];
            Object obj2 = f68470a;
            if (obj != obj2) {
                objArr[a10] = obj2;
                sVar.f68468a = true;
            }
        }
    }

    public static final void e(s sVar) {
        int i10 = sVar.f68469b;
        int[] iArr = sVar.keys;
        Object[] objArr = sVar.values;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f68470a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        sVar.f68468a = false;
        sVar.f68469b = i11;
    }
}

package kh;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import lh.C5466a;

/* loaded from: classes3.dex */
public abstract class p {
    public static final short a(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        if (nVar.c2() - nVar.e2() <= 2) {
            return b(nVar);
        }
        int e22 = nVar.e2();
        nVar.t2(e22 + 2);
        return nVar.d2().getShort(e22);
    }

    public static final short b(n nVar) {
        C5466a b10 = lh.e.b(nVar, 2);
        if (b10 == null) {
            u.a(2);
            throw new KotlinNothingValueException();
        }
        short b11 = f.b(b10);
        lh.e.a(nVar, b10);
        return b11;
    }
}

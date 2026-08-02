package kh;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class t {
    public static final void a(r rVar, short s10) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        int Y12 = rVar.Y1();
        if (rVar.y1() - Y12 <= 2) {
            b(rVar, s10);
        } else {
            rVar.c2(Y12 + 2);
            rVar.T1().putShort(Y12, s10);
        }
    }

    public static final void b(r rVar, short s10) {
        f.d(rVar.a2(2), s10);
        rVar.d();
    }
}

package kh;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import lh.C5466a;

/* loaded from: classes3.dex */
public abstract class o {
    public static final void a(n nVar, byte[] dst, int i10, int i11) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z10 = true;
        C5466a b10 = lh.e.b(nVar, 1);
        if (b10 != null) {
            while (true) {
                try {
                    int min = Math.min(i11, b10.j() - b10.h());
                    f.a(b10, dst, i10, min);
                    i11 -= min;
                    i10 += min;
                    if (i11 <= 0) {
                        lh.e.a(nVar, b10);
                        break;
                    }
                    try {
                        b10 = lh.e.c(nVar, b10);
                        if (b10 == null) {
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = false;
                        if (z10) {
                            lh.e.a(nVar, b10);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        if (i11 <= 0) {
            return;
        }
        u.a(i11);
        throw new KotlinNothingValueException();
    }
}

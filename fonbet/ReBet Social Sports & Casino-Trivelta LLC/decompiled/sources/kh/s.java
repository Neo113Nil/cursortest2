package kh;

import kotlin.jvm.internal.Intrinsics;
import lh.C5466a;

/* loaded from: classes3.dex */
public abstract class s {
    public static final void a(r rVar, byte[] src, int i10, int i11) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(src, "src");
        C5466a d10 = lh.e.d(rVar, 1, null);
        while (true) {
            try {
                int min = Math.min(i11, d10.f() - d10.j());
                f.c(d10, src, i10, min);
                i10 += min;
                i11 -= min;
                if (i11 <= 0) {
                    return;
                } else {
                    d10 = lh.e.d(rVar, 1, d10);
                }
            } finally {
                rVar.d();
            }
        }
    }

    public static /* synthetic */ void b(r rVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length - i10;
        }
        a(rVar, bArr, i10, i11);
    }
}

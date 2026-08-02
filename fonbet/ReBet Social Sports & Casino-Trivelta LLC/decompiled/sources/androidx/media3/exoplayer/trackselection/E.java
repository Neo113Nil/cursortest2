package androidx.media3.exoplayer.trackselection;

import D1.k;
import android.graphics.Point;
import android.os.SystemClock;
import androidx.media3.exoplayer.source.m0;
import androidx.media3.exoplayer.trackselection.B;
import b1.P;
import b1.T;
import com.google.common.collect.AbstractC3445z;
import e1.Z;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class E {
    public static T a(B.a aVar, C[] cArr) {
        List[] listArr = new List[cArr.length];
        for (int i10 = 0; i10 < cArr.length; i10++) {
            C c10 = cArr[i10];
            listArr[i10] = c10 != null ? AbstractC3445z.u(c10) : AbstractC3445z.t();
        }
        return b(aVar, listArr);
    }

    public static T b(B.a aVar, List[] listArr) {
        boolean z10;
        AbstractC3445z.a aVar2 = new AbstractC3445z.a();
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            m0 f10 = aVar.f(i10);
            List list = listArr[i10];
            for (int i11 = 0; i11 < f10.f21832a; i11++) {
                P b10 = f10.b(i11);
                boolean z11 = aVar.a(i10, i11, false) != 0;
                int i12 = b10.f24395a;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < b10.f24395a; i13++) {
                    iArr[i13] = aVar.g(i10, i11, i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        C c10 = (C) list.get(i14);
                        if (c10.m().equals(b10) && c10.l(i13) != -1) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z10;
                }
                aVar2.a(new T.a(b10, z11, iArr, zArr));
            }
        }
        m0 h10 = aVar.h();
        for (int i15 = 0; i15 < h10.f21832a; i15++) {
            P b11 = h10.b(i15);
            int[] iArr2 = new int[b11.f24395a];
            Arrays.fill(iArr2, 0);
            aVar2.a(new T.a(b11, false, iArr2, new boolean[b11.f24395a]));
        }
        return new T(aVar2.m());
    }

    public static k.a c(y yVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = yVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (yVar.b(i11, elapsedRealtime)) {
                i10++;
            }
        }
        return new k.a(1, 0, length, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if ((r6 > r7) != (r4 > r5)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Point d(boolean z10, int i10, int i11, int i12, int i13) {
        if (z10) {
        }
        i11 = i10;
        i10 = i11;
        int i14 = i12 * i10;
        int i15 = i13 * i11;
        return i14 >= i15 ? new Point(i11, Z.k(i15, i12)) : new Point(Z.k(i14, i13), i10);
    }
}

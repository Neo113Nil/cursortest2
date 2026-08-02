package i4;

import N3.P;
import com.google.common.collect.AbstractC5880y;
import i4.i;
import j3.C7272n;
import j3.t;
import j3.v;
import java.util.ArrayList;
import java.util.Arrays;
import m3.C8050C;

/* loaded from: classes8.dex */
final class h extends i {

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f65829o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    private static final byte[] f65830p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    private boolean f65831n;

    h() {
    }

    private static boolean j(C8050C c8050c, byte[] bArr) {
        if (c8050c.a() < bArr.length) {
            return false;
        }
        int f7 = c8050c.f();
        byte[] bArr2 = new byte[bArr.length];
        c8050c.n(0, bArr.length, bArr2);
        c8050c.R(f7);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean k(C8050C c8050c) {
        return j(c8050c, f65829o);
    }

    @Override // i4.i
    protected final long e(C8050C c8050c) {
        return b(Jb.b.c(c8050c.e()));
    }

    @Override // i4.i
    protected final boolean g(C8050C c8050c, long j11, i.a aVar) throws v {
        if (j(c8050c, f65829o)) {
            byte[] copyOf = Arrays.copyOf(c8050c.e(), c8050c.i());
            int i11 = copyOf[9] & 255;
            ArrayList a11 = Jb.b.a(copyOf);
            if (aVar.f65845a == null) {
                C7272n.a aVar2 = new C7272n.a();
                aVar2.W("audio/ogg");
                aVar2.y0("audio/opus");
                aVar2.T(i11);
                aVar2.z0(48000);
                aVar2.k0(a11);
                aVar.f65845a = aVar2.P();
                return true;
            }
        } else {
            if (!j(c8050c, f65830p)) {
                G10.a.i(aVar.f65845a);
                return false;
            }
            G10.a.i(aVar.f65845a);
            if (!this.f65831n) {
                this.f65831n = true;
                c8050c.S(8);
                t c11 = P.c(AbstractC5880y.s(P.e(c8050c, false, false).f18531a));
                if (c11 != null) {
                    C7272n.a a12 = aVar.f65845a.a();
                    a12.r0(c11.b(aVar.f65845a.f69124l));
                    aVar.f65845a = a12.P();
                    return true;
                }
            }
        }
        return true;
    }

    @Override // i4.i
    protected final void h(boolean z11) {
        super.h(z11);
        if (z11) {
            this.f65831n = false;
        }
    }
}

package t3;

import El.C2971a;
import L3.K;
import androidx.media3.exoplayer.j0;
import androidx.media3.exoplayer.k0;
import java.util.Arrays;
import m3.InterfaceC8064f;
import m3.N;
import u3.P;

/* renamed from: t3.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9739e implements InterfaceC9733E {

    /* renamed from: a, reason: collision with root package name */
    private final j0[] f99028a;

    /* renamed from: t3.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C9740f f99029a;

        /* renamed from: t3.e$a$a, reason: collision with other inner class name */
        final class C2175a implements K {
        }

        /* renamed from: t3.e$a$b */
        final class b implements v3.o {
        }

        public a(C9740f c9740f) {
            this.f99029a = c9740f;
        }

        public final C9739e a() {
            return new C9739e(this.f99029a.a(N.q(null), new C2175a(), new b(), new C2971a(), new GZ.e()));
        }
    }

    C9739e(j0[] j0VarArr) {
        this.f99028a = (j0[]) Arrays.copyOf(j0VarArr, j0VarArr.length);
        for (int i11 = 0; i11 < j0VarArr.length; i11++) {
            this.f99028a[i11].x(i11, P.f99799d, InterfaceC8064f.f74315a);
        }
    }

    @Override // t3.InterfaceC9733E
    public final k0[] a() {
        j0[] j0VarArr = this.f99028a;
        k0[] k0VarArr = new k0[j0VarArr.length];
        for (int i11 = 0; i11 < j0VarArr.length; i11++) {
            k0VarArr[i11] = j0VarArr[i11].y();
        }
        return k0VarArr;
    }

    @Override // t3.InterfaceC9733E
    public final void release() {
        for (j0 j0Var : this.f99028a) {
            j0Var.release();
        }
    }

    @Override // t3.InterfaceC9733E
    public final int size() {
        return this.f99028a.length;
    }
}

package x1;

import D1.C2823x;
import androidx.collection.C5153w;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: x1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10632g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2823x f104873a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10637l f104874b = new C10637l();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.collection.F<androidx.collection.J<C10636k>> f104875c = new androidx.collection.F<>(10);

    public C10632g(@NotNull C2823x c2823x) {
        this.f104873a = c2823x;
    }

    public final void a(long j11, @NotNull List<? extends e.c> list, boolean z11) {
        C10636k c10636k;
        C10636k c10636k2;
        C10637l c10637l = this.f104874b;
        androidx.collection.F<androidx.collection.J<C10636k>> f7 = this.f104875c;
        f7.d();
        int size = list.size();
        boolean z12 = true;
        C10637l c10637l2 = c10637l;
        for (int i11 = 0; i11 < size; i11++) {
            e.c cVar = list.get(i11);
            if (z12) {
                U0.b<C10636k> g10 = c10637l2.g();
                int m11 = g10.m();
                if (m11 > 0) {
                    C10636k[] l11 = g10.l();
                    int i12 = 0;
                    do {
                        c10636k2 = l11[i12];
                        if (Intrinsics.d(c10636k2.j(), cVar)) {
                            break;
                        } else {
                            i12++;
                        }
                    } while (i12 < m11);
                }
                c10636k2 = null;
                c10636k = c10636k2;
                if (c10636k != null) {
                    c10636k.l();
                    c10636k.k().a(j11);
                    androidx.collection.J<C10636k> c11 = f7.c(j11);
                    if (c11 == null) {
                        c11 = new androidx.collection.J<>((Object) null);
                        f7.j(j11, c11);
                    }
                    c11.b(c10636k);
                    c10637l2 = c10636k;
                } else {
                    z12 = false;
                }
            }
            c10636k = new C10636k(cVar);
            c10636k.k().a(j11);
            androidx.collection.J<C10636k> c12 = f7.c(j11);
            if (c12 == null) {
                c12 = new androidx.collection.J<>((Object) null);
                f7.j(j11, c12);
            }
            c12.b(c10636k);
            c10637l2.g().b(c10636k);
            c10637l2 = c10636k;
        }
        if (!z11) {
            return;
        }
        long[] jArr = f7.f38737b;
        Object[] objArr = f7.f38738c;
        long[] jArr2 = f7.f38736a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j12 = jArr2[i13];
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j12) < 128) {
                        int i16 = (i13 << 3) + i15;
                        c10637l.i(jArr[i16], (androidx.collection.J) objArr[i16]);
                    }
                    j12 >>= 8;
                }
                if (i14 != 8) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final void b() {
        this.f104874b.c();
    }

    public final boolean c(@NotNull C10633h c10633h, boolean z11) {
        C10637l c10637l = this.f104874b;
        C5153w<x> b11 = c10633h.b();
        C2823x c2823x = this.f104873a;
        if (c10637l.a(b11, c2823x, c10633h, z11)) {
            return c10637l.e(c10633h) || c10637l.f(c10633h.b(), c2823x, c10633h, z11);
        }
        return false;
    }

    public final void d() {
        this.f104874b.d();
        b();
    }

    public final void e() {
        this.f104874b.h();
    }
}

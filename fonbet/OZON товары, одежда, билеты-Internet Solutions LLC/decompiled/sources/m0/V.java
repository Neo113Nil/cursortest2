package m0;

import B0.C2454a;
import java.util.Arrays;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class V<T> implements D<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b<T> f73610a;

    public static final class a<T> extends U<T> {
        private a() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(aVar.b(), b()) && Intrinsics.d(aVar.a(), a());
        }

        public final int hashCode() {
            T b11 = b();
            return a().hashCode() + C2454a.a(0, (b11 != null ? b11.hashCode() : 0) * 31, 31);
        }
    }

    public static final class b<T> extends W<T, a<T>> {
        @NotNull
        public final a f(int i11, Float f7) {
            a<T> aVar = new a<>(f7, G.b());
            c().j(i11, aVar);
            return aVar;
        }
    }

    public V(@NotNull b<T> bVar) {
        this.f73610a = bVar;
    }

    @Override // m0.D, m0.InterfaceC8002m
    @NotNull
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final <V extends AbstractC8015t> h1<V> a(@NotNull U0<T, V> u02) {
        b<T> bVar;
        long[] jArr;
        b<T> bVar2;
        long[] jArr2;
        int i11;
        b<T> bVar3 = this.f73610a;
        androidx.collection.B b11 = new androidx.collection.B(bVar3.c().f38721e + 2);
        androidx.collection.C c11 = new androidx.collection.C(bVar3.c().f38721e);
        androidx.collection.C<a<T>> c12 = bVar3.c();
        int[] iArr = c12.f38718b;
        Object[] objArr = c12.f38719c;
        long[] jArr3 = c12.f38717a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j11 = jArr3[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j11) < 128) {
                            int i16 = (i12 << 3) + i15;
                            i11 = i13;
                            int i17 = iArr[i16];
                            a aVar = (a) objArr[i16];
                            b11.b(i17);
                            bVar2 = bVar3;
                            jArr2 = jArr3;
                            c11.j(i17, new g1(u02.a().invoke(aVar.b()), aVar.a(), 0));
                        } else {
                            bVar2 = bVar3;
                            jArr2 = jArr3;
                            i11 = i13;
                        }
                        j11 >>= i11;
                        i15++;
                        i13 = i11;
                        bVar3 = bVar2;
                        jArr3 = jArr2;
                    }
                    bVar = bVar3;
                    jArr = jArr3;
                    if (i14 != i13) {
                        break;
                    }
                } else {
                    bVar = bVar3;
                    jArr = jArr3;
                }
                if (i12 == length) {
                    break;
                }
                i12++;
                bVar3 = bVar;
                jArr3 = jArr;
            }
        } else {
            bVar = bVar3;
        }
        if (!bVar.c().a(0)) {
            int i18 = b11.f38715b;
            if (i18 < 0) {
                throw new IndexOutOfBoundsException("Index 0 must be in 0.." + b11.f38715b);
            }
            b11.c(i18 + 1);
            int[] iArr2 = b11.f38714a;
            int i19 = b11.f38715b;
            if (i19 != 0) {
                C7705l.p(1, 0, iArr2, iArr2, i19);
            }
            iArr2[0] = 0;
            b11.f38715b++;
        }
        if (!bVar.c().a(bVar.b())) {
            b11.b(bVar.b());
        }
        int i21 = b11.f38715b;
        if (i21 != 0) {
            int[] iArr3 = b11.f38714a;
            Intrinsics.checkNotNullParameter(iArr3, "<this>");
            Arrays.sort(iArr3, 0, i21);
        }
        return new h1<>(b11, c11, bVar.b(), bVar.a(), G.b());
    }
}

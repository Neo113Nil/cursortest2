package sf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.RandomAccess;
import kotlin.collections.AbstractC7696c;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: sf.B, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9674B extends AbstractC7696c<C9684j> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f98649d = 0;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C9684j[] f98650b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final int[] f98651c;

    /* renamed from: sf.B$a */
    public static final class a {
        private static void a(long j11, C9681g c9681g, int i11, ArrayList arrayList, int i12, int i13, ArrayList arrayList2) {
            int i14;
            int i15;
            ArrayList arrayList3;
            long j12;
            int i16;
            int i17 = i11;
            ArrayList arrayList4 = arrayList;
            ArrayList arrayList5 = arrayList2;
            if (i12 >= i13) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i18 = i12; i18 < i13; i18++) {
                if (((C9684j) arrayList4.get(i18)).g() < i17) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            C9684j c9684j = (C9684j) arrayList.get(i12);
            C9684j c9684j2 = (C9684j) arrayList4.get(i13 - 1);
            if (i17 == c9684j.g()) {
                int intValue = ((Number) arrayList5.get(i12)).intValue();
                int i19 = i12 + 1;
                C9684j c9684j3 = (C9684j) arrayList4.get(i19);
                i14 = i19;
                i15 = intValue;
                c9684j = c9684j3;
            } else {
                i14 = i12;
                i15 = -1;
            }
            if (c9684j.n(i17) == c9684j2.n(i17)) {
                int min = Math.min(c9684j.g(), c9684j2.g());
                int i21 = 0;
                for (int i22 = i17; i22 < min && c9684j.n(i22) == c9684j2.n(i22); i22++) {
                    i21++;
                }
                long j13 = 4;
                long size = (c9681g.size() / j13) + j11 + 2 + i21 + 1;
                c9681g.r0(-i21);
                c9681g.r0(i15);
                int i23 = i17 + i21;
                while (i17 < i23) {
                    c9681g.r0(c9684j.n(i17) & 255);
                    i17++;
                }
                if (i14 + 1 == i13) {
                    if (i23 != ((C9684j) arrayList4.get(i14)).g()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c9681g.r0(((Number) arrayList5.get(i14)).intValue());
                    return;
                } else {
                    C9681g c9681g2 = new C9681g();
                    c9681g.r0(((int) ((c9681g2.size() / j13) + size)) * (-1));
                    a(size, c9681g2, i23, arrayList4, i14, i13, arrayList5);
                    c9681g.y0(c9681g2);
                    return;
                }
            }
            int i24 = 1;
            for (int i25 = i14 + 1; i25 < i13; i25++) {
                if (((C9684j) arrayList4.get(i25 - 1)).n(i17) != ((C9684j) arrayList4.get(i25)).n(i17)) {
                    i24++;
                }
            }
            long j14 = 4;
            long size2 = (c9681g.size() / j14) + j11 + 2 + (i24 * 2);
            c9681g.r0(i24);
            c9681g.r0(i15);
            for (int i26 = i14; i26 < i13; i26++) {
                int n11 = ((C9684j) arrayList4.get(i26)).n(i17);
                if (i26 == i14 || n11 != ((C9684j) arrayList4.get(i26 - 1)).n(i17)) {
                    c9681g.r0(n11 & 255);
                }
            }
            C9681g c9681g3 = new C9681g();
            int i27 = i14;
            while (i27 < i13) {
                byte n12 = ((C9684j) arrayList4.get(i27)).n(i17);
                int i28 = i27 + 1;
                int i29 = i28;
                while (true) {
                    if (i29 >= i13) {
                        i29 = i13;
                        break;
                    } else if (n12 != ((C9684j) arrayList4.get(i29)).n(i17)) {
                        break;
                    } else {
                        i29++;
                    }
                }
                if (i28 == i29 && i17 + 1 == ((C9684j) arrayList4.get(i27)).g()) {
                    c9681g.r0(((Number) arrayList5.get(i27)).intValue());
                    arrayList3 = arrayList5;
                    j12 = size2;
                    i16 = i29;
                } else {
                    c9681g.r0(((int) ((c9681g3.size() / j14) + size2)) * (-1));
                    arrayList3 = arrayList5;
                    j12 = size2;
                    i16 = i29;
                    a(j12, c9681g3, i17 + 1, arrayList, i27, i16, arrayList3);
                    arrayList4 = arrayList;
                }
                size2 = j12;
                i27 = i16;
                arrayList5 = arrayList3;
            }
            c9681g.y0(c9681g3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00d8, code lost:
        
            continue;
         */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static C9674B b(@NotNull C9684j... byteStrings) {
            Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
            int i11 = 0;
            if (byteStrings.length == 0) {
                return new C9674B(new C9684j[0], new int[]{0, -1});
            }
            ArrayList i02 = C7705l.i0(byteStrings);
            C7714v.F0(i02);
            ArrayList arrayList = new ArrayList(byteStrings.length);
            for (C9684j c9684j : byteStrings) {
                arrayList.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            ArrayList m02 = C7714v.m0(Arrays.copyOf(numArr, numArr.length));
            int length = byteStrings.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                m02.set(C7714v.a(i02, byteStrings[i12]), Integer.valueOf(i13));
                i12++;
                i13++;
            }
            if (((C9684j) i02.get(0)).g() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i14 = 0;
            while (i14 < i02.size()) {
                C9684j prefix = (C9684j) i02.get(i14);
                int i15 = i14 + 1;
                int i16 = i15;
                while (i16 < i02.size()) {
                    C9684j c9684j2 = (C9684j) i02.get(i16);
                    c9684j2.getClass();
                    Intrinsics.checkNotNullParameter(prefix, "prefix");
                    if (c9684j2.u(0, prefix, prefix.g())) {
                        if (c9684j2.g() == prefix.g()) {
                            throw new IllegalArgumentException(("duplicate option: " + c9684j2).toString());
                        }
                        if (((Number) m02.get(i16)).intValue() > ((Number) m02.get(i14)).intValue()) {
                            i02.remove(i16);
                            m02.remove(i16);
                        } else {
                            i16++;
                        }
                    }
                }
                i14 = i15;
            }
            C9681g c9681g = new C9681g();
            a(0L, c9681g, 0, i02, 0, i02.size(), m02);
            int[] iArr = new int[(int) (c9681g.size() / 4)];
            while (!c9681g.m()) {
                iArr[i11] = c9681g.z();
                i11++;
            }
            Object[] copyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            return new C9674B((C9684j[]) copyOf, iArr);
        }
    }

    public C9674B(C9684j[] c9684jArr, int[] iArr) {
        this.f98650b = c9684jArr;
        this.f98651c = iArr;
    }

    @NotNull
    public final C9684j[] b() {
        return this.f98650b;
    }

    @Override // kotlin.collections.AbstractC7694a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C9684j) {
            return super.contains((C9684j) obj);
        }
        return false;
    }

    @NotNull
    public final int[] e() {
        return this.f98651c;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        return this.f98650b[i11];
    }

    @Override // kotlin.collections.AbstractC7694a
    public final int getSize() {
        return this.f98650b.length;
    }

    @Override // kotlin.collections.AbstractC7696c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C9684j) {
            return super.indexOf((C9684j) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC7696c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C9684j) {
            return super.lastIndexOf((C9684j) obj);
        }
        return -1;
    }
}

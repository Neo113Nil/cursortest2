package ti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.UByte;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class w extends AbstractList implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public static final a f65892a = new a(null);

    @NotNull
    private final k[] byteStrings;

    @NotNull
    private final int[] trie;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b(a aVar, long j10, C6478h c6478h, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                j10 = 0;
            }
            aVar.a(j10, c6478h, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        public final void a(long j10, C6478h c6478h, int i10, List list, int i11, int i12, List list2) {
            int i13;
            int i14;
            int i15;
            long j11;
            int i16 = i10;
            if (i11 >= i12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i17 = i11; i17 < i12; i17++) {
                if (((k) list.get(i17)).u() < i16) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            k kVar = (k) list.get(i11);
            k kVar2 = (k) list.get(i12 - 1);
            if (i16 == kVar.u()) {
                int intValue = ((Number) list2.get(i11)).intValue();
                int i18 = i11 + 1;
                k kVar3 = (k) list.get(i18);
                i13 = i18;
                i14 = intValue;
                kVar = kVar3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (kVar.f(i16) == kVar2.f(i16)) {
                int min = Math.min(kVar.u(), kVar2.u());
                int i19 = 0;
                for (int i20 = i16; i20 < min && kVar.f(i20) == kVar2.f(i20); i20++) {
                    i19++;
                }
                long c10 = j10 + c(c6478h) + 2 + i19 + 1;
                c6478h.writeInt(-i19);
                c6478h.writeInt(i14);
                int i21 = i16 + i19;
                while (i16 < i21) {
                    c6478h.writeInt(kVar.f(i16) & UByte.MAX_VALUE);
                    i16++;
                }
                if (i13 + 1 == i12) {
                    if (i21 != ((k) list.get(i13)).u()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c6478h.writeInt(((Number) list2.get(i13)).intValue());
                    return;
                } else {
                    C6478h c6478h2 = new C6478h();
                    c6478h.writeInt(((int) (c(c6478h2) + c10)) * (-1));
                    a(c10, c6478h2, i21, list, i13, i12, list2);
                    c6478h.Y(c6478h2);
                    return;
                }
            }
            int i22 = 1;
            for (int i23 = i13 + 1; i23 < i12; i23++) {
                if (((k) list.get(i23 - 1)).f(i16) != ((k) list.get(i23)).f(i16)) {
                    i22++;
                }
            }
            long c11 = j10 + c(c6478h) + 2 + (i22 * 2);
            c6478h.writeInt(i22);
            c6478h.writeInt(i14);
            for (int i24 = i13; i24 < i12; i24++) {
                byte f10 = ((k) list.get(i24)).f(i16);
                if (i24 == i13 || f10 != ((k) list.get(i24 - 1)).f(i16)) {
                    c6478h.writeInt(f10 & UByte.MAX_VALUE);
                }
            }
            C6478h c6478h3 = new C6478h();
            while (i13 < i12) {
                byte f11 = ((k) list.get(i13)).f(i16);
                int i25 = i13 + 1;
                int i26 = i25;
                while (true) {
                    if (i26 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (f11 != ((k) list.get(i26)).f(i16)) {
                            i15 = i26;
                            break;
                        }
                        i26++;
                    }
                }
                if (i25 == i15 && i16 + 1 == ((k) list.get(i13)).u()) {
                    c6478h.writeInt(((Number) list2.get(i13)).intValue());
                    j11 = c11;
                } else {
                    c6478h.writeInt(((int) (c(c6478h3) + c11)) * (-1));
                    j11 = c11;
                    a(j11, c6478h3, i16 + 1, list, i13, i15, list2);
                }
                c11 = j11;
                i13 = i15;
            }
            c6478h.Y(c6478h3);
        }

        public final long c(C6478h c6478h) {
            return c6478h.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00d6, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final w d(k... byteStrings) {
            Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i10 = 0;
            if (byteStrings.length == 0) {
                return new w(new k[0], new int[]{0, -1}, defaultConstructorMarker);
            }
            List mutableList = ArraysKt.toMutableList(byteStrings);
            CollectionsKt.sort(mutableList);
            ArrayList arrayList = new ArrayList(byteStrings.length);
            for (k kVar : byteStrings) {
                arrayList.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            List mutableListOf = CollectionsKt.mutableListOf(Arrays.copyOf(numArr, numArr.length));
            int length = byteStrings.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                mutableListOf.set(CollectionsKt.binarySearch$default(mutableList, byteStrings[i11], 0, 0, 6, (Object) null), Integer.valueOf(i12));
                i11++;
                i12++;
            }
            if (((k) mutableList.get(0)).u() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i13 = 0;
            while (i13 < mutableList.size()) {
                k kVar2 = (k) mutableList.get(i13);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < mutableList.size()) {
                    k kVar3 = (k) mutableList.get(i15);
                    if (kVar3.v(kVar2)) {
                        if (kVar3.u() == kVar2.u()) {
                            throw new IllegalArgumentException(("duplicate option: " + kVar3).toString());
                        }
                        if (((Number) mutableListOf.get(i15)).intValue() > ((Number) mutableListOf.get(i13)).intValue()) {
                            mutableList.remove(i15);
                            mutableListOf.remove(i15);
                        } else {
                            i15++;
                        }
                    }
                }
                i13 = i14;
            }
            C6478h c6478h = new C6478h();
            b(this, 0L, c6478h, 0, mutableList, 0, 0, mutableListOf, 53, null);
            int[] iArr = new int[(int) c(c6478h)];
            while (!c6478h.X0()) {
                iArr[i10] = c6478h.readInt();
                i10++;
            }
            Object[] copyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            return new w((k[]) copyOf, iArr, defaultConstructorMarker);
        }

        public a() {
        }
    }

    public /* synthetic */ w(k[] kVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVarArr, iArr);
    }

    public static final w i(k... kVarArr) {
        return f65892a.d(kVarArr);
    }

    public /* bridge */ boolean b(k kVar) {
        return super.contains(kVar);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public k get(int i10) {
        return this.byteStrings[i10];
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof k) {
            return b((k) obj);
        }
        return false;
    }

    public final k[] e() {
        return this.byteStrings;
    }

    public final int[] f() {
        return this.trie;
    }

    public /* bridge */ int g(k kVar) {
        return super.indexOf(kVar);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* renamed from: getSize */
    public int get_size() {
        return this.byteStrings.length;
    }

    public /* bridge */ int h(k kVar) {
        return super.lastIndexOf(kVar);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof k) {
            return g((k) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof k) {
            return h((k) obj);
        }
        return -1;
    }

    public w(k[] kVarArr, int[] iArr) {
        this.byteStrings = kVarArr;
        this.trie = iArr;
    }
}

package y1;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.d5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends q0 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f25544r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i5, boolean z5) {
        super(z5);
        this.f25544r = i5;
    }

    public static float[] g(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new float[]{((Number) q0.f25616i.d(value)).floatValue()};
    }

    public static int[] h(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new int[]{((Number) q0.f25609b.d(value)).intValue()};
    }

    public static long[] i(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new long[]{((Number) q0.f25613f.d(value)).longValue()};
    }

    public static boolean[] j(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new boolean[]{((Boolean) q0.f25618l.d(value)).booleanValue()};
    }

    @Override // y1.q0
    public final Object a(Bundle source, String key) {
        Object obj;
        Object obj2;
        Object obj3;
        switch (this.f25544r) {
            case 0:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (!d5.k(source, key) || d5.B(source, key)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(key, "key");
                boolean[] booleanArray = source.getBooleanArray(key);
                if (booleanArray != null) {
                    return booleanArray;
                }
                com.google.android.play.core.appupdate.b.v(key);
                throw null;
            case 1:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (!d5.k(source, key) || d5.B(source, key)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(key, "key");
                boolean[] booleanArray2 = source.getBooleanArray(key);
                if (booleanArray2 == null) {
                    com.google.android.play.core.appupdate.b.v(key);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(booleanArray2, "<this>");
                int length = booleanArray2.length;
                if (length != 0) {
                    if (length != 1) {
                        Intrinsics.checkNotNullParameter(booleanArray2, "<this>");
                        ArrayList arrayList = new ArrayList(booleanArray2.length);
                        for (boolean z5 : booleanArray2) {
                            arrayList.add(Boolean.valueOf(z5));
                        }
                        return arrayList;
                    }
                    obj = kotlin.collections.t.c(Boolean.valueOf(booleanArray2[0]));
                } else {
                    obj = kotlin.collections.e0.f19204a;
                }
                return obj;
            case 2:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (!d5.k(source, key) || d5.B(source, key)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(key, "key");
                float[] floatArray = source.getFloatArray(key);
                if (floatArray != null) {
                    return floatArray;
                }
                com.google.android.play.core.appupdate.b.v(key);
                throw null;
            case 3:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (!d5.k(source, key) || d5.B(source, key)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(key, "key");
                float[] floatArray2 = source.getFloatArray(key);
                if (floatArray2 == null) {
                    com.google.android.play.core.appupdate.b.v(key);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(floatArray2, "<this>");
                int length2 = floatArray2.length;
                if (length2 != 0) {
                    if (length2 != 1) {
                        Intrinsics.checkNotNullParameter(floatArray2, "<this>");
                        ArrayList arrayList2 = new ArrayList(floatArray2.length);
                        for (float f6 : floatArray2) {
                            arrayList2.add(Float.valueOf(f6));
                        }
                        return arrayList2;
                    }
                    obj2 = kotlin.collections.t.c(Float.valueOf(floatArray2[0]));
                } else {
                    obj2 = kotlin.collections.e0.f19204a;
                }
                return obj2;
            case 4:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (!d5.k(source, key) || d5.B(source, key)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(key, "key");
                int[] intArray = source.getIntArray(key);
                if (intArray != null) {
                    return intArray;
                }
                com.google.android.play.core.appupdate.b.v(key);
                throw null;
            case 5:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (!d5.k(source, key) || d5.B(source, key)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(key, "key");
                int[] intArray2 = source.getIntArray(key);
                if (intArray2 != null) {
                    return kotlin.collections.p.y(intArray2);
                }
                com.google.android.play.core.appupdate.b.v(key);
                throw null;
            case 6:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (!d5.k(source, key) || d5.B(source, key)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(key, "key");
                long[] longArray = source.getLongArray(key);
                if (longArray != null) {
                    return longArray;
                }
                com.google.android.play.core.appupdate.b.v(key);
                throw null;
            case 7:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (!d5.k(source, key) || d5.B(source, key)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(key, "key");
                long[] longArray2 = source.getLongArray(key);
                if (longArray2 == null) {
                    com.google.android.play.core.appupdate.b.v(key);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(longArray2, "<this>");
                int length3 = longArray2.length;
                if (length3 != 0) {
                    if (length3 != 1) {
                        Intrinsics.checkNotNullParameter(longArray2, "<this>");
                        ArrayList arrayList3 = new ArrayList(longArray2.length);
                        for (long j : longArray2) {
                            arrayList3.add(Long.valueOf(j));
                        }
                        return arrayList3;
                    }
                    obj3 = kotlin.collections.t.c(Long.valueOf(longArray2[0]));
                } else {
                    obj3 = kotlin.collections.e0.f19204a;
                }
                return obj3;
            case 8:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (!d5.k(source, key) || d5.B(source, key)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(key, "key");
                String[] stringArray = source.getStringArray(key);
                if (stringArray != null) {
                    return stringArray;
                }
                com.google.android.play.core.appupdate.b.v(key);
                throw null;
            default:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (!d5.k(source, key) || d5.B(source, key)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(key, "key");
                String[] stringArray2 = source.getStringArray(key);
                if (stringArray2 != null) {
                    return kotlin.collections.p.z(stringArray2);
                }
                com.google.android.play.core.appupdate.b.v(key);
                throw null;
        }
    }

    @Override // y1.q0
    public final String b() {
        switch (this.f25544r) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case 3:
                return "List<Float>";
            case 4:
                return "integer[]";
            case 5:
                return "List<Int>";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // y1.q0
    public final Object c(Object obj, String value) {
        switch (this.f25544r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (zArr != null) {
                    boolean[] elements = j(value);
                    Intrinsics.checkNotNullParameter(zArr, "<this>");
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    int length = zArr.length;
                    boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                    System.arraycopy(elements, 0, copyOf, length, 1);
                    Intrinsics.checkNotNull(copyOf);
                    if (copyOf != null) {
                        return copyOf;
                    }
                }
                return j(value);
            case 1:
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                f fVar = q0.f25618l;
                if (list != null) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return CollectionsKt.N(list, kotlin.collections.t.c(fVar.d(value)));
                }
                Intrinsics.checkNotNullParameter(value, "value");
                return kotlin.collections.t.c(fVar.d(value));
            case 2:
                float[] fArr = (float[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (fArr != null) {
                    float[] elements2 = g(value);
                    Intrinsics.checkNotNullParameter(fArr, "<this>");
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    int length2 = fArr.length;
                    float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                    System.arraycopy(elements2, 0, copyOf2, length2, 1);
                    Intrinsics.checkNotNull(copyOf2);
                    if (copyOf2 != null) {
                        return copyOf2;
                    }
                }
                return g(value);
            case 3:
                List list2 = (List) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                f fVar2 = q0.f25616i;
                if (list2 != null) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return CollectionsKt.N(list2, kotlin.collections.t.c(fVar2.d(value)));
                }
                Intrinsics.checkNotNullParameter(value, "value");
                return kotlin.collections.t.c(fVar2.d(value));
            case 4:
                int[] iArr = (int[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (iArr != null) {
                    int[] elements3 = h(value);
                    Intrinsics.checkNotNullParameter(iArr, "<this>");
                    Intrinsics.checkNotNullParameter(elements3, "elements");
                    int length3 = iArr.length;
                    int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                    System.arraycopy(elements3, 0, copyOf3, length3, 1);
                    Intrinsics.checkNotNull(copyOf3);
                    if (copyOf3 != null) {
                        return copyOf3;
                    }
                }
                return h(value);
            case 5:
                List list3 = (List) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                f fVar3 = q0.f25609b;
                if (list3 != null) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return CollectionsKt.N(list3, kotlin.collections.t.c(fVar3.d(value)));
                }
                Intrinsics.checkNotNullParameter(value, "value");
                return kotlin.collections.t.c(fVar3.d(value));
            case 6:
                long[] jArr = (long[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (jArr != null) {
                    long[] elements4 = i(value);
                    Intrinsics.checkNotNullParameter(jArr, "<this>");
                    Intrinsics.checkNotNullParameter(elements4, "elements");
                    int length4 = jArr.length;
                    long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                    System.arraycopy(elements4, 0, copyOf4, length4, 1);
                    Intrinsics.checkNotNull(copyOf4);
                    if (copyOf4 != null) {
                        return copyOf4;
                    }
                }
                return i(value);
            case 7:
                List list4 = (List) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                f fVar4 = q0.f25613f;
                if (list4 != null) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return CollectionsKt.N(list4, kotlin.collections.t.c(fVar4.d(value)));
                }
                Intrinsics.checkNotNullParameter(value, "value");
                return kotlin.collections.t.c(fVar4.d(value));
            case 8:
                String[] strArr = (String[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (strArr != null) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    String[] strArr2 = (String[]) kotlin.collections.o.m(strArr, new String[]{value});
                    if (strArr2 != null) {
                        return strArr2;
                    }
                }
                Intrinsics.checkNotNullParameter(value, "value");
                return new String[]{value};
            default:
                List list5 = (List) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (list5 != null) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return CollectionsKt.N(list5, kotlin.collections.t.c(value));
                }
                Intrinsics.checkNotNullParameter(value, "value");
                return kotlin.collections.t.c(value);
        }
    }

    @Override // y1.q0
    public final Object d(String value) {
        switch (this.f25544r) {
            case 0:
                return j(value);
            case 1:
                Intrinsics.checkNotNullParameter(value, "value");
                return kotlin.collections.t.c(q0.f25618l.d(value));
            case 2:
                return g(value);
            case 3:
                Intrinsics.checkNotNullParameter(value, "value");
                return kotlin.collections.t.c(q0.f25616i.d(value));
            case 4:
                return h(value);
            case 5:
                Intrinsics.checkNotNullParameter(value, "value");
                return kotlin.collections.t.c(q0.f25609b.d(value));
            case 6:
                return i(value);
            case 7:
                Intrinsics.checkNotNullParameter(value, "value");
                return kotlin.collections.t.c(q0.f25613f.d(value));
            case 8:
                Intrinsics.checkNotNullParameter(value, "value");
                return new String[]{value};
            default:
                Intrinsics.checkNotNullParameter(value, "value");
                return kotlin.collections.t.c(value);
        }
    }

    @Override // y1.q0
    public final void e(Bundle source, String key, Object obj) {
        switch (this.f25544r) {
            case 0:
                boolean[] value = (boolean[]) obj;
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (value == null) {
                    h8.b.w(source, key);
                    break;
                } else {
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value, "value");
                    source.putBooleanArray(key, value);
                    break;
                }
            case 1:
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (list == null) {
                    h8.b.w(source, key);
                    break;
                } else {
                    boolean[] value2 = CollectionsKt.T(list);
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value2, "value");
                    source.putBooleanArray(key, value2);
                    break;
                }
            case 2:
                float[] value3 = (float[]) obj;
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (value3 == null) {
                    h8.b.w(source, key);
                    break;
                } else {
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value3, "value");
                    source.putFloatArray(key, value3);
                    break;
                }
            case 3:
                List list2 = (List) obj;
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (list2 == null) {
                    h8.b.w(source, key);
                    break;
                } else {
                    Intrinsics.checkNotNullParameter(list2, "<this>");
                    float[] value4 = new float[list2.size()];
                    Iterator it = list2.iterator();
                    int i5 = 0;
                    while (it.hasNext()) {
                        value4[i5] = ((Number) it.next()).floatValue();
                        i5++;
                    }
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value4, "value");
                    source.putFloatArray(key, value4);
                    break;
                }
            case 4:
                int[] value5 = (int[]) obj;
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (value5 == null) {
                    h8.b.w(source, key);
                    break;
                } else {
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value5, "value");
                    source.putIntArray(key, value5);
                    break;
                }
            case 5:
                List list3 = (List) obj;
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                if (list3 != null) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    int[] value6 = CollectionsKt.V(list3);
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value6, "value");
                    source.putIntArray(key, value6);
                    break;
                }
                break;
            case 6:
                long[] value7 = (long[]) obj;
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (value7 == null) {
                    h8.b.w(source, key);
                    break;
                } else {
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value7, "value");
                    source.putLongArray(key, value7);
                    break;
                }
            case 7:
                List list4 = (List) obj;
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (list4 == null) {
                    h8.b.w(source, key);
                    break;
                } else {
                    Intrinsics.checkNotNullParameter(list4, "<this>");
                    long[] value8 = new long[list4.size()];
                    Iterator it2 = list4.iterator();
                    int i10 = 0;
                    while (it2.hasNext()) {
                        value8[i10] = ((Number) it2.next()).longValue();
                        i10++;
                    }
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value8, "value");
                    source.putLongArray(key, value8);
                    break;
                }
            case 8:
                String[] value9 = (String[]) obj;
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (value9 == null) {
                    h8.b.w(source, key);
                    break;
                } else {
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value9, "value");
                    source.putStringArray(key, value9);
                    break;
                }
            default:
                List list5 = (List) obj;
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (list5 == null) {
                    h8.b.w(source, key);
                    break;
                } else {
                    String[] value10 = (String[]) list5.toArray(new String[0]);
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value10, "value");
                    source.putStringArray(key, value10);
                    break;
                }
        }
    }
}

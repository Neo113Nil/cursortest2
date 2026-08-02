package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bz1 extends i13 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bz1(boolean z, int i) {
        super(z);
        this.r = i;
    }

    public static float[] i(String str) {
        str.getClass();
        return new float[]{Float.valueOf(Float.parseFloat(str)).floatValue()};
    }

    public static int[] j(String str) {
        str.getClass();
        return new int[]{((Number) b8d.b.d(str)).intValue()};
    }

    public static long[] k(String str) {
        str.getClass();
        return new long[]{((Number) b8d.f.d(str)).longValue()};
    }

    public static boolean[] l(String str) {
        str.getClass();
        return new boolean[]{((Boolean) b8d.l.d(str)).booleanValue()};
    }

    @Override // defpackage.b8d
    public final Object a(Bundle bundle, String str) {
        switch (this.r) {
            case 0:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || o3a.I(bundle, str)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                w3a.I(str);
                throw null;
            case 1:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || o3a.I(bundle, str)) {
                    return null;
                }
                boolean[] booleanArray2 = bundle.getBooleanArray(str);
                if (booleanArray2 != null) {
                    return ph0.Y(booleanArray2);
                }
                w3a.I(str);
                throw null;
            case 2:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || o3a.I(bundle, str)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                w3a.I(str);
                throw null;
            case 3:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || o3a.I(bundle, str)) {
                    return null;
                }
                float[] floatArray2 = bundle.getFloatArray(str);
                if (floatArray2 != null) {
                    return ph0.U(floatArray2);
                }
                w3a.I(str);
                throw null;
            case 4:
                bundle.getClass();
                str.getClass();
                if (!o3a.r(bundle, str) || o3a.I(bundle, str)) {
                    return null;
                }
                return o3a.z(bundle, str);
            case 5:
                bundle.getClass();
                str.getClass();
                if (!o3a.r(bundle, str) || o3a.I(bundle, str)) {
                    return null;
                }
                return ph0.V(o3a.z(bundle, str));
            case 6:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || o3a.I(bundle, str)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                w3a.I(str);
                throw null;
            case 7:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || o3a.I(bundle, str)) {
                    return null;
                }
                long[] longArray2 = bundle.getLongArray(str);
                if (longArray2 != null) {
                    return ph0.W(longArray2);
                }
                w3a.I(str);
                throw null;
            case 8:
                bundle.getClass();
                str.getClass();
                if (!o3a.r(bundle, str) || o3a.I(bundle, str)) {
                    return null;
                }
                return o3a.D(bundle, str);
            default:
                bundle.getClass();
                str.getClass();
                if (!o3a.r(bundle, str) || o3a.I(bundle, str)) {
                    return null;
                }
                return ph0.X(o3a.D(bundle, str));
        }
    }

    @Override // defpackage.b8d
    public final String b() {
        switch (this.r) {
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

    @Override // defpackage.b8d
    public final Object c(Object obj, String str) {
        switch (this.r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return l(str);
                }
                boolean[] l = l(str);
                int length = zArr.length;
                boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(l, 0, copyOf, length, 1);
                return copyOf;
            case 1:
                List list = (List) obj;
                cz1 cz1Var = b8d.l;
                return list != null ? CollectionsKt.w0(a.c(cz1Var.d(str)), list) : a.c(cz1Var.d(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return i(str);
                }
                float[] i = i(str);
                int length2 = fArr.length;
                float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(i, 0, copyOf2, length2, 1);
                return copyOf2;
            case 3:
                List list2 = (List) obj;
                return list2 != null ? CollectionsKt.w0(a.c(Float.valueOf(Float.parseFloat(str))), list2) : a.c(Float.valueOf(Float.parseFloat(str)));
            case 4:
                int[] iArr = (int[]) obj;
                int[] j = j(str);
                return iArr != null ? mh0.p(iArr, j) : j;
            case 5:
                List list3 = (List) obj;
                cz1 cz1Var2 = b8d.b;
                return list3 != null ? CollectionsKt.w0(a.c(cz1Var2.d(str)), list3) : a.c(cz1Var2.d(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return k(str);
                }
                long[] k = k(str);
                int length3 = jArr.length;
                long[] copyOf3 = Arrays.copyOf(jArr, length3 + 1);
                System.arraycopy(k, 0, copyOf3, length3, 1);
                return copyOf3;
            case 7:
                List list4 = (List) obj;
                cz1 cz1Var3 = b8d.f;
                return list4 != null ? CollectionsKt.w0(a.c(cz1Var3.d(str)), list4) : a.c(cz1Var3.d(str));
            case 8:
                String[] strArr = (String[]) obj;
                return strArr != null ? (String[]) mh0.q(strArr, new String[]{str}) : new String[]{str};
            default:
                List list5 = (List) obj;
                return list5 != null ? CollectionsKt.w0(a.c(str), list5) : a.c(str);
        }
    }

    @Override // defpackage.b8d
    public final Object d(String str) {
        switch (this.r) {
            case 0:
                return l(str);
            case 1:
                str.getClass();
                return a.c(b8d.l.d(str));
            case 2:
                return i(str);
            case 3:
                str.getClass();
                return a.c(Float.valueOf(Float.parseFloat(str)));
            case 4:
                return j(str);
            case 5:
                str.getClass();
                return a.c(b8d.b.d(str));
            case 6:
                return k(str);
            case 7:
                str.getClass();
                return a.c(b8d.f.d(str));
            case 8:
                str.getClass();
                return new String[]{str};
            default:
                str.getClass();
                return a.c(str);
        }
    }

    @Override // defpackage.b8d
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                str.getClass();
                if (zArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putBooleanArray(str, zArr);
                    break;
                }
            case 1:
                List list = (List) obj;
                str.getClass();
                if (list == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putBooleanArray(str, CollectionsKt.N0(list));
                    break;
                }
            case 2:
                float[] fArr = (float[]) obj;
                str.getClass();
                if (fArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putFloatArray(str, fArr);
                    break;
                }
            case 3:
                List list2 = (List) obj;
                str.getClass();
                if (list2 == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putFloatArray(str, CollectionsKt.P0(list2));
                    break;
                }
            case 4:
                int[] iArr = (int[]) obj;
                str.getClass();
                if (iArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putIntArray(str, iArr);
                    break;
                }
            case 5:
                List list3 = (List) obj;
                str.getClass();
                if (list3 != null) {
                    bundle.putIntArray(str, CollectionsKt.R0(list3));
                    break;
                }
                break;
            case 6:
                long[] jArr = (long[]) obj;
                str.getClass();
                if (jArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putLongArray(str, jArr);
                    break;
                }
            case 7:
                List list4 = (List) obj;
                str.getClass();
                if (list4 == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putLongArray(str, CollectionsKt.T0(list4));
                    break;
                }
            case 8:
                String[] strArr = (String[]) obj;
                str.getClass();
                if (strArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putStringArray(str, strArr);
                    break;
                }
            default:
                List list5 = (List) obj;
                str.getClass();
                if (list5 == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    String[] strArr2 = (String[]) list5.toArray(new String[0]);
                    strArr2.getClass();
                    bundle.putStringArray(str, strArr2);
                    break;
                }
        }
    }

    @Override // defpackage.i13
    public final Object g() {
        switch (this.r) {
            case 0:
                return new boolean[0];
            case 1:
                return km5.a;
            case 2:
                return new float[0];
            case 3:
                return km5.a;
            case 4:
                return new int[0];
            case 5:
                return km5.a;
            case 6:
                return new long[0];
            case 7:
                return km5.a;
            case 8:
                return new String[0];
            default:
                return km5.a;
        }
    }

    @Override // defpackage.i13
    public final List h(Object obj) {
        List Y;
        List U;
        List V;
        List W;
        switch (this.r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr != null && (Y = ph0.Y(zArr)) != null) {
                    ArrayList arrayList = new ArrayList(k13.r(Y, 10));
                    Iterator it = Y.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 1:
                List list = (List) obj;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(String.valueOf(((Boolean) it2.next()).booleanValue()));
                    }
                    break;
                } else {
                    break;
                }
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr != null && (U = ph0.U(fArr)) != null) {
                    ArrayList arrayList3 = new ArrayList(k13.r(U, 10));
                    Iterator it3 = U.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(String.valueOf(((Number) it3.next()).floatValue()));
                    }
                    break;
                } else {
                    break;
                }
            case 3:
                List list2 = (List) obj;
                if (list2 != null) {
                    ArrayList arrayList4 = new ArrayList(k13.r(list2, 10));
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(String.valueOf(((Number) it4.next()).floatValue()));
                    }
                    break;
                } else {
                    break;
                }
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr != null && (V = ph0.V(iArr)) != null) {
                    ArrayList arrayList5 = new ArrayList(k13.r(V, 10));
                    Iterator it5 = V.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(String.valueOf(((Number) it5.next()).intValue()));
                    }
                    break;
                } else {
                    break;
                }
            case 5:
                List list3 = (List) obj;
                if (list3 != null) {
                    ArrayList arrayList6 = new ArrayList(k13.r(list3, 10));
                    Iterator it6 = list3.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(String.valueOf(((Number) it6.next()).intValue()));
                    }
                    break;
                } else {
                    break;
                }
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr != null && (W = ph0.W(jArr)) != null) {
                    ArrayList arrayList7 = new ArrayList(k13.r(W, 10));
                    Iterator it7 = W.iterator();
                    while (it7.hasNext()) {
                        arrayList7.add(String.valueOf(((Number) it7.next()).longValue()));
                    }
                    break;
                } else {
                    break;
                }
            case 7:
                List list4 = (List) obj;
                if (list4 != null) {
                    ArrayList arrayList8 = new ArrayList(k13.r(list4, 10));
                    Iterator it8 = list4.iterator();
                    while (it8.hasNext()) {
                        arrayList8.add(String.valueOf(((Number) it8.next()).longValue()));
                    }
                    break;
                } else {
                    break;
                }
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    ArrayList arrayList9 = new ArrayList(strArr.length);
                    for (String str : strArr) {
                        str.getClass();
                        String encode = Uri.encode(str, null);
                        encode.getClass();
                        arrayList9.add(encode);
                    }
                    break;
                } else {
                    break;
                }
            default:
                List<String> list5 = (List) obj;
                if (list5 != null) {
                    ArrayList arrayList10 = new ArrayList(k13.r(list5, 10));
                    for (String str2 : list5) {
                        str2.getClass();
                        String encode2 = Uri.encode(str2, null);
                        encode2.getClass();
                        arrayList10.add(encode2);
                    }
                    break;
                } else {
                    break;
                }
        }
        return km5.a;
    }
}

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
public final class k8a extends i13 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k8a(boolean z, int i) {
        super(z);
        this.r = i;
    }

    public static double[] i(String str) {
        str.getClass();
        return new double[]{Double.valueOf(Double.parseDouble(str)).doubleValue()};
    }

    @Override // defpackage.b8d
    public final Object a(Bundle bundle, String str) {
        int i = this.r;
        cz1 cz1Var = b8d.o;
        ArrayList arrayList = null;
        switch (i) {
            case 0:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || o3a.I(bundle, str)) {
                    return null;
                }
                double[] doubleArray = bundle.getDoubleArray(str);
                if (doubleArray != null) {
                    return doubleArray;
                }
                w3a.I(str);
                throw null;
            case 1:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || o3a.I(bundle, str)) {
                    return null;
                }
                double[] doubleArray2 = bundle.getDoubleArray(str);
                if (doubleArray2 != null) {
                    return ph0.T(doubleArray2);
                }
                w3a.I(str);
                throw null;
            case 2:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || o3a.I(bundle, str)) {
                    return null;
                }
                String[] D = o3a.D(bundle, str);
                ArrayList arrayList2 = new ArrayList(D.length);
                for (String str2 : D) {
                    arrayList2.add((String) cz1Var.d(str2));
                }
                return (String[]) arrayList2.toArray(new String[0]);
            default:
                bundle.getClass();
                str.getClass();
                if (bundle.containsKey(str) && !o3a.I(bundle, str)) {
                    List X = ph0.X(o3a.D(bundle, str));
                    arrayList = new ArrayList(k13.r(X, 10));
                    Iterator it = X.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) cz1Var.d((String) it.next()));
                    }
                }
                return arrayList;
        }
    }

    @Override // defpackage.b8d
    public final String b() {
        switch (this.r) {
            case 0:
                return "double[]";
            case 1:
                return "List<Double>";
            case 2:
                return "string_nullable[]";
            default:
                return "List<String?>";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b8d
    public final Object c(Object obj, String str) {
        int i = this.r;
        cz1 cz1Var = b8d.o;
        switch (i) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr == null) {
                    return i(str);
                }
                double[] i2 = i(str);
                int length = dArr.length;
                double[] copyOf = Arrays.copyOf(dArr, length + 1);
                System.arraycopy(i2, 0, copyOf, length, 1);
                return copyOf;
            case 1:
                List list = (List) obj;
                return list != null ? CollectionsKt.w0(a.c(Double.valueOf(Double.parseDouble(str))), list) : a.c(Double.valueOf(Double.parseDouble(str)));
            case 2:
                String[] strArr = (String[]) obj;
                return strArr != null ? (String[]) mh0.q(strArr, new String[]{cz1Var.d(str)}) : new String[]{cz1Var.d(str)};
            default:
                List list2 = (List) obj;
                return list2 != null ? CollectionsKt.w0(a.c(cz1Var.d(str)), list2) : a.c(cz1Var.d(str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b8d
    public final Object d(String str) {
        int i = this.r;
        cz1 cz1Var = b8d.o;
        switch (i) {
            case 0:
                return i(str);
            case 1:
                str.getClass();
                return a.c(Double.valueOf(Double.parseDouble(str)));
            case 2:
                str.getClass();
                return new String[]{cz1Var.d(str)};
            default:
                str.getClass();
                return a.c(cz1Var.d(str));
        }
    }

    @Override // defpackage.b8d
    public final void e(Bundle bundle, String str, Object obj) {
        int i = 0;
        switch (this.r) {
            case 0:
                double[] dArr = (double[]) obj;
                str.getClass();
                if (dArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putDoubleArray(str, dArr);
                    break;
                }
            case 1:
                List list = (List) obj;
                str.getClass();
                if (list == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    double[] dArr2 = new double[list.size()];
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        dArr2[i] = ((Number) it.next()).doubleValue();
                        i++;
                    }
                    bundle.putDoubleArray(str, dArr2);
                    break;
                }
            case 2:
                String[] strArr = (String[]) obj;
                str.getClass();
                if (strArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    ArrayList arrayList = new ArrayList(strArr.length);
                    for (String str2 : strArr) {
                        if (str2 == null) {
                            str2 = "null";
                        }
                        arrayList.add(str2);
                    }
                    String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
                    strArr2.getClass();
                    bundle.putStringArray(str, strArr2);
                    break;
                }
            default:
                List<String> list2 = (List) obj;
                str.getClass();
                if (list2 == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                    for (String str3 : list2) {
                        if (str3 == null) {
                            str3 = "null";
                        }
                        arrayList2.add(str3);
                    }
                    String[] strArr3 = (String[]) arrayList2.toArray(new String[0]);
                    strArr3.getClass();
                    bundle.putStringArray(str, strArr3);
                    break;
                }
        }
    }

    @Override // defpackage.i13
    public final Object g() {
        switch (this.r) {
            case 0:
                return new double[0];
            case 1:
                return km5.a;
            case 2:
                return new String[0];
            default:
                return km5.a;
        }
    }

    @Override // defpackage.i13
    public final List h(Object obj) {
        List T;
        String str;
        String str2;
        switch (this.r) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr != null && (T = ph0.T(dArr)) != null) {
                    ArrayList arrayList = new ArrayList(k13.r(T, 10));
                    Iterator it = T.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
                    }
                    break;
                } else {
                    break;
                }
            case 1:
                List list = (List) obj;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(String.valueOf(((Number) it2.next()).doubleValue()));
                    }
                    break;
                } else {
                    break;
                }
            case 2:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    ArrayList arrayList3 = new ArrayList(strArr.length);
                    for (String str3 : strArr) {
                        if (str3 != null) {
                            str = Uri.encode(str3, null);
                            str.getClass();
                        } else {
                            str = "null";
                        }
                        arrayList3.add(str);
                    }
                    break;
                } else {
                    break;
                }
            default:
                List<String> list2 = (List) obj;
                if (list2 != null) {
                    ArrayList arrayList4 = new ArrayList(k13.r(list2, 10));
                    for (String str4 : list2) {
                        if (str4 != null) {
                            str2 = Uri.encode(str4, null);
                            str2.getClass();
                        } else {
                            str2 = "null";
                        }
                        arrayList4.add(str2);
                    }
                    break;
                } else {
                    break;
                }
        }
        return km5.a;
    }
}

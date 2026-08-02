package r9;

import android.util.SparseArray;
import d9.EnumC4042e;
import java.util.HashMap;

/* renamed from: r9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6212a {

    /* renamed from: a, reason: collision with root package name */
    public static SparseArray f64073a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static HashMap f64074b;

    static {
        HashMap hashMap = new HashMap();
        f64074b = hashMap;
        hashMap.put(EnumC4042e.DEFAULT, 0);
        f64074b.put(EnumC4042e.VERY_LOW, 1);
        f64074b.put(EnumC4042e.HIGHEST, 2);
        for (EnumC4042e enumC4042e : f64074b.keySet()) {
            f64073a.append(((Integer) f64074b.get(enumC4042e)).intValue(), enumC4042e);
        }
    }

    public static int a(EnumC4042e enumC4042e) {
        Integer num = (Integer) f64074b.get(enumC4042e);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC4042e);
    }

    public static EnumC4042e b(int i10) {
        EnumC4042e enumC4042e = (EnumC4042e) f64073a.get(i10);
        if (enumC4042e != null) {
            return enumC4042e;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}

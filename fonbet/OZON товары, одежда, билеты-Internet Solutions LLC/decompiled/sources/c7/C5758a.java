package c7;

import Ej.b;
import Q6.e;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* renamed from: c7.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5758a {

    /* renamed from: a, reason: collision with root package name */
    private static SparseArray<e> f56620a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private static HashMap<e, Integer> f56621b;

    static {
        HashMap<e, Integer> hashMap = new HashMap<>();
        f56621b = hashMap;
        hashMap.put(e.DEFAULT, 0);
        hashMap.put(e.VERY_LOW, 1);
        hashMap.put(e.HIGHEST, 2);
        for (e eVar : hashMap.keySet()) {
            f56620a.append(f56621b.get(eVar).intValue(), eVar);
        }
    }

    public static int a(@NonNull e eVar) {
        Integer num = f56621b.get(eVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + eVar);
    }

    @NonNull
    public static e b(int i11) {
        e eVar = f56620a.get(i11);
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException(b.a(i11, "Unknown Priority for value "));
    }
}

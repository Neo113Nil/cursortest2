package o5;

import android.util.SparseArray;
import androidx.appcompat.widget.c1;
import b5.d;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f21093a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f21094b;

    static {
        HashMap hashMap = new HashMap();
        f21094b = hashMap;
        hashMap.put(d.f3026a, 0);
        hashMap.put(d.f3027b, 1);
        hashMap.put(d.f3028c, 2);
        for (d dVar : hashMap.keySet()) {
            f21093a.append(((Integer) f21094b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f21094b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i5) {
        d dVar = (d) f21093a.get(i5);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(c1.i(i5, "Unknown Priority for value "));
    }
}

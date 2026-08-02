package D6;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class h extends HashSet {
    public h(Set set) {
        super(set);
    }

    public static h a(Object... objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        Collections.addAll(hashSet, objArr);
        return new h(hashSet);
    }
}

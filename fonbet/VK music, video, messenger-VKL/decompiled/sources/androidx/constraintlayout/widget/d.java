package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: SharedValues.java */
/* loaded from: classes11.dex */
public final class d {
    public final HashMap<Integer, HashSet<WeakReference<a>>> a;

    /* compiled from: SharedValues.java */
    public interface a {
    }

    public d() {
        new SparseIntArray();
        this.a = new HashMap<>();
    }

    public final void a(int i, a aVar) {
        Integer valueOf = Integer.valueOf(i);
        HashMap<Integer, HashSet<WeakReference<a>>> hashMap = this.a;
        HashSet<WeakReference<a>> hashSet = hashMap.get(valueOf);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            hashMap.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference<>(aVar));
    }
}

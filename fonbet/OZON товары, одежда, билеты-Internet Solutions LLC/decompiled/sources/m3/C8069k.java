package m3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import w3.i;

/* renamed from: m3.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8069k<E> implements Iterable<E> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f74326a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f74327b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private Set<E> f74328c = Collections.EMPTY_SET;

    /* renamed from: d, reason: collision with root package name */
    private List<E> f74329d = Collections.EMPTY_LIST;

    public final void a(i.a aVar) {
        synchronized (this.f74326a) {
            try {
                ArrayList arrayList = new ArrayList(this.f74329d);
                arrayList.add(aVar);
                this.f74329d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) this.f74327b.get(aVar);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f74328c);
                    hashSet.add(aVar);
                    this.f74328c = Collections.unmodifiableSet(hashSet);
                }
                this.f74327b.put(aVar, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int b(i.a aVar) {
        int intValue;
        synchronized (this.f74326a) {
            try {
                intValue = this.f74327b.containsKey(aVar) ? ((Integer) this.f74327b.get(aVar)).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return intValue;
    }

    public final void c(i.a aVar) {
        synchronized (this.f74326a) {
            try {
                Integer num = (Integer) this.f74327b.get(aVar);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f74329d);
                arrayList.remove(aVar);
                this.f74329d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f74327b.remove(aVar);
                    HashSet hashSet = new HashSet(this.f74328c);
                    hashSet.remove(aVar);
                    this.f74328c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f74327b.put(aVar, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f74326a) {
            it = this.f74329d.iterator();
        }
        return it;
    }

    public final Set<E> y1() {
        Set<E> set;
        synchronized (this.f74326a) {
            set = this.f74328c;
        }
        return set;
    }
}

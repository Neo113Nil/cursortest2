package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<Object> f71791a;

    public S(int i11) {
        this.f71791a = new ArrayList<>(i11);
    }

    public final void a(Object obj) {
        this.f71791a.add(obj);
    }

    public final void b(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z11 = obj instanceof Object[];
        ArrayList<Object> arrayList = this.f71791a;
        if (z11) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    public final int c() {
        return this.f71791a.size();
    }

    public final Object[] d(Object[] objArr) {
        return this.f71791a.toArray(objArr);
    }
}

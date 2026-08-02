package io.sentry.cache.tape;

import java.io.Closeable;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class c implements Iterable, Closeable {

    public interface a {
        void a(Object obj, OutputStream outputStream);

        Object b(byte[] bArr);
    }

    public static c A0() {
        return new io.sentry.cache.tape.a();
    }

    public static c B(d dVar, a aVar) {
        return new b(dVar, aVar);
    }

    public List D0(int i10) {
        int min = Math.min(i10, size());
        ArrayList arrayList = new ArrayList(min);
        Iterator it = iterator();
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(it.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void clear() {
        m1(size());
    }

    public abstract void k(Object obj);

    public abstract void m1(int i10);

    public List r() {
        return D0(size());
    }

    public abstract int size();
}

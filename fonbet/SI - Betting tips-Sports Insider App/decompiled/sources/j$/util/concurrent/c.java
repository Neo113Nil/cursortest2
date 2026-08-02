package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class c extends a implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        j jVar = this.f17665b;
        if (jVar == null) {
            throw new NoSuchElementException();
        }
        Object obj = jVar.f17657b;
        Object obj2 = jVar.f17658c;
        this.j = jVar;
        a();
        return new i(obj, obj2, this.f17648i);
    }
}

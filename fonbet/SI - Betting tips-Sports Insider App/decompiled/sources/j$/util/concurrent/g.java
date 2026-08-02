package j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class g extends a implements Iterator, Enumeration {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17651k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j[] jVarArr, int i5, int i10, ConcurrentHashMap concurrentHashMap, int i11) {
        super(jVarArr, i5, i10, concurrentHashMap);
        this.f17651k = i11;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f17651k) {
            case 0:
                j jVar = this.f17665b;
                if (jVar == null) {
                    throw new NoSuchElementException();
                }
                Object obj = jVar.f17657b;
                this.j = jVar;
                a();
                return obj;
            default:
                j jVar2 = this.f17665b;
                if (jVar2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj2 = jVar2.f17658c;
                this.j = jVar2;
                a();
                return obj2;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f17651k) {
        }
        return next();
    }
}

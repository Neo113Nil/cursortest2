package androidx.room.coroutines;

import kotlin.coroutines.d;
import xsna.wzs;

/* compiled from: ConnectionPoolImpl.kt */
/* loaded from: classes12.dex */
public final class a implements d.b {
    public static final C0086a c = new C0086a();
    public final d b;

    /* compiled from: ConnectionPoolImpl.kt */
    /* renamed from: androidx.room.coroutines.a$a, reason: collision with other inner class name */
    public static final class C0086a implements d.c<a> {
    }

    public a(d dVar) {
        this.b = dVar;
    }

    @Override // kotlin.coroutines.d
    public final <R> R fold(R r, wzs<? super R, ? super d.b, ? extends R> wzsVar) {
        return wzsVar.invoke(r, this);
    }

    @Override // kotlin.coroutines.d
    public final <E extends d.b> E get(d.c<E> cVar) {
        return (E) d.b.a.a(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    public final d.c<a> getKey() {
        return c;
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d minusKey(d.c<?> cVar) {
        return d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return d.a.a(this, dVar);
    }
}

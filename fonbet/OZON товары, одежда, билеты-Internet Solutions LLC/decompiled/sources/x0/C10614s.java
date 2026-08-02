package x0;

import java.util.Comparator;

/* renamed from: x0.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10614s<T> implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.lazy.layout.h f104787a;

    public C10614s(androidx.compose.foundation.lazy.layout.h hVar) {
        this.f104787a = hVar;
    }

    @Override // java.util.Comparator
    public final int compare(T t2, T t11) {
        Object key = ((InterfaceC10575D) t11).getKey();
        androidx.compose.foundation.lazy.layout.h hVar = this.f104787a;
        return Vc.a.b(Integer.valueOf(hVar.b(key)), Integer.valueOf(hVar.b(((InterfaceC10575D) t2).getKey())));
    }
}

package x0;

import java.util.Comparator;

/* renamed from: x0.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10612q<T> implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.lazy.layout.h f104785a;

    public C10612q(androidx.compose.foundation.lazy.layout.h hVar) {
        this.f104785a = hVar;
    }

    @Override // java.util.Comparator
    public final int compare(T t2, T t11) {
        Object key = ((InterfaceC10575D) t2).getKey();
        androidx.compose.foundation.lazy.layout.h hVar = this.f104785a;
        return Vc.a.b(Integer.valueOf(hVar.b(key)), Integer.valueOf(hVar.b(((InterfaceC10575D) t11).getKey())));
    }
}

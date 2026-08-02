package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b;
import java.util.HashMap;
import java.util.List;
import xsna.e5z;
import xsna.f5z;

/* compiled from: ReflectiveGenericLifecycleObserver.java */
@Deprecated
/* loaded from: classes.dex */
public final class s implements l {
    public final Object b;
    public final b.a c;

    public s(e5z e5zVar) {
        this.b = e5zVar;
        b bVar = b.c;
        Class<?> cls = e5zVar.getClass();
        b.a aVar = (b.a) bVar.a.get(cls);
        this.c = aVar == null ? bVar.a(cls, null) : aVar;
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        HashMap hashMap = this.c.a;
        List list = (List) hashMap.get(event);
        Object obj = this.b;
        b.a.a(list, f5zVar, event, obj);
        b.a.a((List) hashMap.get(Lifecycle.Event.ON_ANY), f5zVar, event, obj);
    }
}

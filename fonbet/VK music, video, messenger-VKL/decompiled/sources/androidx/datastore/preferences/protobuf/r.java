package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p;
import xsna.lez;
import xsna.w5q0;

/* compiled from: ListFieldSchemaLite.java */
/* loaded from: classes.dex */
public final class r implements lez {
    @Override // xsna.lez
    public final void a(long j, Object obj) {
        ((p.c) w5q0.c.h(j, obj)).makeImmutable();
    }

    @Override // xsna.lez
    public final void b(long j, Object obj, Object obj2) {
        w5q0.e eVar = w5q0.c;
        p.c cVar = (p.c) eVar.h(j, obj);
        p.c cVar2 = (p.c) eVar.h(j, obj2);
        int size = cVar.size();
        int size2 = cVar2.size();
        if (size > 0 && size2 > 0) {
            if (!cVar.isModifiable()) {
                cVar = cVar.mutableCopyWithCapacity(size2 + size);
            }
            cVar.addAll(cVar2);
        }
        if (size > 0) {
            cVar2 = cVar;
        }
        w5q0.o(j, obj, cVar2);
    }

    @Override // xsna.lez
    public final p.c c(long j, Object obj) {
        p.c cVar = (p.c) w5q0.c.h(j, obj);
        if (cVar.isModifiable()) {
            return cVar;
        }
        int size = cVar.size();
        p.c mutableCopyWithCapacity = cVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        w5q0.o(j, obj, mutableCopyWithCapacity);
        return mutableCopyWithCapacity;
    }
}

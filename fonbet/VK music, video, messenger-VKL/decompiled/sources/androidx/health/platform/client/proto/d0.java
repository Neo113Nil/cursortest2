package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.b0;
import xsna.kez;
import xsna.t5q0;

/* compiled from: ListFieldSchemaLite.java */
/* loaded from: classes12.dex */
public final class d0 implements kez {
    @Override // xsna.kez
    public final void a(long j, Object obj) {
        ((b0.d) t5q0.c.i(j, obj)).makeImmutable();
    }

    @Override // xsna.kez
    public final void b(long j, Object obj, Object obj2) {
        t5q0.e eVar = t5q0.c;
        b0.d dVar = (b0.d) eVar.i(j, obj);
        b0.d dVar2 = (b0.d) eVar.i(j, obj2);
        int size = dVar.size();
        int size2 = dVar2.size();
        if (size > 0 && size2 > 0) {
            if (!dVar.isModifiable()) {
                dVar = dVar.mutableCopyWithCapacity(size2 + size);
            }
            dVar.addAll(dVar2);
        }
        if (size > 0) {
            dVar2 = dVar;
        }
        t5q0.p(j, obj, dVar2);
    }
}

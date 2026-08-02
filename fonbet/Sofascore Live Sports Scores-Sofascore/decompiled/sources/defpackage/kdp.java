package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class kdp extends map {
    public static final idp c = new idp();
    public final Class a;
    public final jep b;

    public kdp(h9p h9pVar, map mapVar, Class cls) {
        this.b = new jep(h9pVar, mapVar, cls);
        this.a = cls;
    }

    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        if (e7nVar.Q0() == 9) {
            e7nVar.j0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        e7nVar.zza();
        while (e7nVar.a0()) {
            arrayList.add(this.b.c.read(e7nVar));
        }
        e7nVar.M();
        int size = arrayList.size();
        Class cls = this.a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object newInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    @Override // defpackage.map
    public final void write(f7n f7nVar, Object obj) {
        if (obj == null) {
            f7nVar.f0();
            return;
        }
        f7nVar.m();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.write(f7nVar, Array.get(obj, i));
        }
        f7nVar.n();
    }
}

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import x0.InterfaceC6775d;

/* loaded from: classes2.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final Class f29913a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC6775d f29914b;

    /* renamed from: c, reason: collision with root package name */
    public final List f29915c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29916d;

    public t(Class cls, Class cls2, Class cls3, List list, InterfaceC6775d interfaceC6775d) {
        this.f29913a = cls;
        this.f29914b = interfaceC6775d;
        this.f29915c = (List) com.bumptech.glide.util.k.c(list);
        this.f29916d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public v a(com.bumptech.glide.load.data.e eVar, com.bumptech.glide.load.j jVar, int i10, int i11, i.a aVar) {
        List list = (List) com.bumptech.glide.util.k.d(this.f29914b.acquire());
        try {
            return b(eVar, jVar, i10, i11, aVar, list);
        } finally {
            this.f29914b.release(list);
        }
    }

    public final v b(com.bumptech.glide.load.data.e eVar, com.bumptech.glide.load.j jVar, int i10, int i11, i.a aVar, List list) {
        int size = this.f29915c.size();
        v vVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                vVar = ((i) this.f29915c.get(i12)).a(eVar, i10, i11, jVar, aVar);
            } catch (q e10) {
                list.add(e10);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new q(this.f29916d, new ArrayList(list));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f29915c.toArray()) + '}';
    }
}

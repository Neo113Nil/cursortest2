package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import x0.InterfaceC6775d;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final Class f29818a;

    /* renamed from: b, reason: collision with root package name */
    public final List f29819b;

    /* renamed from: c, reason: collision with root package name */
    public final I4.e f29820c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC6775d f29821d;

    /* renamed from: e, reason: collision with root package name */
    public final String f29822e;

    public interface a {
        v a(v vVar);
    }

    public i(Class cls, Class cls2, Class cls3, List list, I4.e eVar, InterfaceC6775d interfaceC6775d) {
        this.f29818a = cls;
        this.f29819b = list;
        this.f29820c = eVar;
        this.f29821d = interfaceC6775d;
        this.f29822e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public v a(com.bumptech.glide.load.data.e eVar, int i10, int i11, com.bumptech.glide.load.j jVar, a aVar) {
        return this.f29820c.a(aVar.a(b(eVar, i10, i11, jVar)), jVar);
    }

    public final v b(com.bumptech.glide.load.data.e eVar, int i10, int i11, com.bumptech.glide.load.j jVar) {
        List list = (List) com.bumptech.glide.util.k.d(this.f29821d.acquire());
        try {
            return c(eVar, i10, i11, jVar, list);
        } finally {
            this.f29821d.release(list);
        }
    }

    public final v c(com.bumptech.glide.load.data.e eVar, int i10, int i11, com.bumptech.glide.load.j jVar, List list) {
        int size = this.f29819b.size();
        v vVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            com.bumptech.glide.load.l lVar = (com.bumptech.glide.load.l) this.f29819b.get(i12);
            try {
                if (lVar.a(eVar.a(), jVar)) {
                    vVar = lVar.b(eVar.a(), i10, i11, jVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(lVar);
                }
                list.add(e10);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new q(this.f29822e, new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f29818a + ", decoders=" + this.f29819b + ", transcoder=" + this.f29820c + '}';
    }
}

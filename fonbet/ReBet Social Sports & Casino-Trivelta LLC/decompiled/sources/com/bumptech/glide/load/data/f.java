package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public static final e.a f29671b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Map f29672a = new HashMap();

    public class a implements e.a {
        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        public e b(Object obj) {
            return new b(obj);
        }
    }

    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final Object f29673a;

        public b(Object obj) {
            this.f29673a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        public Object a() {
            return this.f29673a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void b() {
        }
    }

    public synchronized e a(Object obj) {
        e.a aVar;
        try {
            com.bumptech.glide.util.k.d(obj);
            aVar = (e.a) this.f29672a.get(obj.getClass());
            if (aVar == null) {
                Iterator it = this.f29672a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a aVar2 = (e.a) it.next();
                    if (aVar2.a().isAssignableFrom(obj.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f29671b;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar.b(obj);
    }

    public synchronized void b(e.a aVar) {
        this.f29672a.put(aVar.a(), aVar);
    }
}

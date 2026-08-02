package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    private static final e.a<?> f57627b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f57628a = new HashMap();

    final class a implements e.a<Object> {
        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public final e<Object> a(@NonNull Object obj) {
            return new b(obj);
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public final Class<Object> getDataClass() {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    private static final class b implements e<Object> {

        /* renamed from: a, reason: collision with root package name */
        private final Object f57629a;

        b(@NonNull Object obj) {
            this.f57629a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        @NonNull
        public final Object a() {
            return this.f57629a;
        }

        @Override // com.bumptech.glide.load.data.e
        public final void cleanup() {
        }
    }

    @NonNull
    public final synchronized <T> e<T> a(@NonNull T t2) {
        e.a<?> aVar;
        try {
            p6.k.b(t2);
            aVar = (e.a) this.f57628a.get(t2.getClass());
            if (aVar == null) {
                Iterator it = this.f57628a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a<?> aVar2 = (e.a) it.next();
                    if (aVar2.getDataClass().isAssignableFrom(t2.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f57627b;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar.a(t2);
    }

    public final synchronized void b(@NonNull e.a<?> aVar) {
        this.f57628a.put(aVar.getDataClass(), aVar);
    }
}

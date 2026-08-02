package com.google.crypto.tink.internal;

import Xa.b;
import com.google.crypto.tink.l;
import com.google.crypto.tink.proto.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC3476h;
import com.google.crypto.tink.shaded.protobuf.O;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f37047a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f37048b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f37049c;

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f37050a;

        /* renamed from: com.google.crypto.tink.internal.d$a$a, reason: collision with other inner class name */
        public static final class C0516a {

            /* renamed from: a, reason: collision with root package name */
            public Object f37051a;

            /* renamed from: b, reason: collision with root package name */
            public l.b f37052b;

            public C0516a(Object obj, l.b bVar) {
                this.f37051a = obj;
                this.f37052b = bVar;
            }
        }

        public a(Class cls) {
            this.f37050a = cls;
        }

        public abstract O a(O o10);

        public final Class b() {
            return this.f37050a;
        }

        public Map c() {
            return Collections.EMPTY_MAP;
        }

        public abstract O d(AbstractC3476h abstractC3476h);

        public abstract void e(O o10);
    }

    public d(Class cls, m... mVarArr) {
        this.f37047a = cls;
        HashMap hashMap = new HashMap();
        for (m mVar : mVarArr) {
            if (hashMap.containsKey(mVar.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + mVar.b().getCanonicalName());
            }
            hashMap.put(mVar.b(), mVar);
        }
        if (mVarArr.length > 0) {
            this.f37049c = mVarArr[0].b();
        } else {
            this.f37049c = Void.class;
        }
        this.f37048b = Collections.unmodifiableMap(hashMap);
    }

    public b.EnumC0280b a() {
        return b.EnumC0280b.f13669a;
    }

    public final Class b() {
        return this.f37049c;
    }

    public final Class c() {
        return this.f37047a;
    }

    public abstract String d();

    public final Object e(O o10, Class cls) {
        m mVar = (m) this.f37048b.get(cls);
        if (mVar != null) {
            return mVar.a(o10);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a f();

    public abstract y.c g();

    public abstract O h(AbstractC3476h abstractC3476h);

    public final Set i() {
        return this.f37048b.keySet();
    }

    public abstract void j(O o10);
}

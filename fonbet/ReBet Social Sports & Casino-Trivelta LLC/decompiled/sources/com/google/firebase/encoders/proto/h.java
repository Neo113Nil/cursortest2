package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import qb.C6135c;
import rb.InterfaceC6214a;
import rb.InterfaceC6215b;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final Map f37777a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f37778b;

    /* renamed from: c, reason: collision with root package name */
    public final qb.e f37779c;

    public static final class a implements InterfaceC6215b {

        /* renamed from: d, reason: collision with root package name */
        public static final qb.e f37780d = new qb.e() { // from class: com.google.firebase.encoders.proto.g
            @Override // qb.InterfaceC6134b
            public final void a(Object obj, Object obj2) {
                h.a.b(obj, (qb.f) obj2);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final Map f37781a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final Map f37782b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public qb.e f37783c = f37780d;

        public static /* synthetic */ void b(Object obj, qb.f fVar) {
            throw new C6135c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f37781a), new HashMap(this.f37782b), this.f37783c);
        }

        public a d(InterfaceC6214a interfaceC6214a) {
            interfaceC6214a.a(this);
            return this;
        }

        @Override // rb.InterfaceC6215b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, qb.e eVar) {
            this.f37781a.put(cls, eVar);
            this.f37782b.remove(cls);
            return this;
        }
    }

    public h(Map map, Map map2, qb.e eVar) {
        this.f37777a = map;
        this.f37778b = map2;
        this.f37779c = eVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f37777a, this.f37778b, this.f37779c).q(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}

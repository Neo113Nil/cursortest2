package w8;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements t8.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f25008f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final t8.c f25009g = new t8.c("key", d9.e.s(d9.e.q(e.class, new a(1))));

    /* renamed from: h, reason: collision with root package name */
    public static final t8.c f25010h = new t8.c("value", d9.e.s(d9.e.q(e.class, new a(2))));

    /* renamed from: i, reason: collision with root package name */
    public static final v8.a f25011i = new v8.a(1);

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f25012a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f25013b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f25014c;

    /* renamed from: d, reason: collision with root package name */
    public final t8.d f25015d;

    /* renamed from: e, reason: collision with root package name */
    public final h f25016e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, t8.d dVar) {
        this.f25012a = byteArrayOutputStream;
        this.f25013b = hashMap;
        this.f25014c = hashMap2;
        this.f25015d = dVar;
    }

    public static int g(t8.c cVar) {
        e eVar = (e) ((Annotation) cVar.f23754b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).f25004a;
        }
        throw new t8.b("Field has no @Protobuf config");
    }

    @Override // t8.e
    public final t8.e a(t8.c cVar, Object obj) {
        d(cVar, obj, true);
        return this;
    }

    @Override // t8.e
    public final t8.e b(t8.c cVar, long j) {
        if (j == 0) {
            return this;
        }
        e eVar = (e) ((Annotation) cVar.f23754b.get(e.class));
        if (eVar == null) {
            throw new t8.b("Field has no @Protobuf config");
        }
        h(((a) eVar).f25004a << 3);
        i(j);
        return this;
    }

    public final void c(t8.c cVar, int i5, boolean z5) {
        if (z5 && i5 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f23754b.get(e.class));
        if (eVar == null) {
            throw new t8.b("Field has no @Protobuf config");
        }
        h(((a) eVar).f25004a << 3);
        h(i5);
    }

    public final void d(t8.c cVar, Object obj, boolean z5) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z5 && charSequence.length() == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f25008f);
            h(bytes.length);
            this.f25012a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                d(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                f(f25011i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z5 && doubleValue == 0.0d) {
                return;
            }
            h((g(cVar) << 3) | 1);
            this.f25012a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z5 && floatValue == 0.0f) {
                return;
            }
            h((g(cVar) << 3) | 5);
            this.f25012a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z5 && longValue == 0) {
                return;
            }
            e eVar = (e) ((Annotation) cVar.f23754b.get(e.class));
            if (eVar == null) {
                throw new t8.b("Field has no @Protobuf config");
            }
            h(((a) eVar).f25004a << 3);
            i(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            c(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z5);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z5 && bArr.length == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            h(bArr.length);
            this.f25012a.write(bArr);
            return;
        }
        t8.d dVar = (t8.d) this.f25013b.get(obj.getClass());
        if (dVar != null) {
            f(dVar, cVar, obj, z5);
            return;
        }
        t8.f fVar = (t8.f) this.f25014c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f25016e;
            hVar.f25018a = false;
            hVar.f25020c = cVar;
            hVar.f25019b = z5;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof c) {
            c(cVar, ((c) obj).a(), true);
        } else if (obj instanceof Enum) {
            c(cVar, ((Enum) obj).ordinal(), true);
        } else {
            f(this.f25015d, cVar, obj, z5);
        }
    }

    @Override // t8.e
    public final t8.e e(t8.c cVar, int i5) {
        c(cVar, i5, true);
        return this;
    }

    public final void f(t8.d dVar, t8.c cVar, Object obj, boolean z5) {
        b bVar = new b();
        bVar.f25005a = 0L;
        try {
            OutputStream outputStream = this.f25012a;
            this.f25012a = bVar;
            try {
                dVar.a(obj, this);
                this.f25012a = outputStream;
                long j = bVar.f25005a;
                bVar.close();
                if (z5 && j == 0) {
                    return;
                }
                h((g(cVar) << 3) | 2);
                i(j);
                dVar.a(obj, this);
            } catch (Throwable th2) {
                this.f25012a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                bVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void h(int i5) {
        while ((i5 & (-128)) != 0) {
            this.f25012a.write((i5 & 127) | 128);
            i5 >>>= 7;
        }
        this.f25012a.write(i5 & 127);
    }

    public final void i(long j) {
        while (((-128) & j) != 0) {
            this.f25012a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f25012a.write(((int) j) & 127);
    }
}
